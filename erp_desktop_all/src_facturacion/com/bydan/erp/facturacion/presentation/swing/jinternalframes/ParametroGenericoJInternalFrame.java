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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroGenericoConstantesFunciones;

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
public class ParametroGenericoJInternalFrame extends ParametroGenericoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroGenerico;
	
	protected JMenuBar jmenuBarParametroGenerico;
	
	protected JMenu jmenuParametroGenerico;
	protected JMenu jmenuDatosParametroGenerico;
	protected JMenu jmenuArchivoParametroGenerico;
	protected JMenu jmenuAccionesParametroGenerico;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGenerico;	
	protected GridBagConstraints gridBagConstraintsParametroGenerico;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroGenericoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroGenerico;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroGenerico;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroGenerico;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TransaccionBeanSwingJInternalFrame transaccionreciboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionrecibo="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ServicioBeanSwingJInternalFrame servicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_servicio="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected FormatoBeanSwingJInternalFrame formatoreciboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatorecibo="";
	
	public ParametroGenericoSessionBean parametrogenericoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TransaccionSessionBean transaccionreciboSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ServicioSessionBean servicioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public FormatoSessionBean formatoreciboSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroGenerico> parametrogenericos;		
	public List<ParametroGenerico> parametrogenericosEliminados;	
	public List<ParametroGenerico> parametrogenericosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroGenerico;		
	protected JButton jButtonAbrirOrderByParametroGenerico;
	
	
	//protected JPanel jPanelOrderByParametroGenerico;
	//public JScrollPane jScrollPanelOrderByParametroGenerico;	
	//protected JButton jButtonCerrarOrderByParametroGenerico;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroGenericoLogic parametrogenericoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroGenerico;
	public JScrollPane jScrollPanelDatosEdicionParametroGenerico;
	public JScrollPane jScrollPanelDatosGeneralParametroGenerico;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroGenericoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroGenerico;
	//public JScrollPane jScrollPanelImportacionParametroGenerico;
	
	
	
	protected JPanel jPanelAccionesParametroGenerico;
	
    protected JPanel jPanelPaginacionParametroGenerico;
    protected JPanel jPanelParametrosReportesParametroGenerico;
	protected JPanel jPanelParametrosReportesAccionesParametroGenerico;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroGenerico;
	protected JPanel jPanelParametrosAuxiliar2ParametroGenerico;
	protected JPanel jPanelParametrosAuxiliar3ParametroGenerico;
	protected JPanel jPanelParametrosAuxiliar4ParametroGenerico;
	//protected JPanel jPanelParametrosAuxiliar5ParametroGenerico;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroGenerico;
	//protected JPanel jPanelImportacionParametroGenerico;
	
	
	public JTable jTableDatosParametroGenerico;
	
	
	
	//public JTable jTableDatosParametroGenericoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroGenerico;
	protected JButton jButtonDuplicarParametroGenerico;
	protected JButton jButtonCopiarParametroGenerico;
	protected JButton jButtonVerFormParametroGenerico;
	protected JButton jButtonNuevoRelacionesParametroGenerico;
	protected JButton jButtonModificarParametroGenerico;
	
    protected JButton jButtonGuardarCambiosTablaParametroGenerico;
	protected JButton jButtonCerrarParametroGenerico;
	
	
	protected JButton jButtonRecargarInformacionParametroGenerico;
	protected JButton jButtonProcesarInformacionParametroGenerico;
	
	
	protected JButton jButtonAnterioresParametroGenerico;
	protected JButton jButtonSiguientesParametroGenerico;
	protected JButton jButtonNuevoGuardarCambiosParametroGenerico;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroGenerico;
	//protected JButton jButtonCerrarReporteDinamicoParametroGenerico;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroGenerico;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroGenerico;
	//protected JButton jButtonGenerarImportacionParametroGenerico;
	//protected JButton jButtonCerrarImportacionParametroGenerico;
	//protected JFileChooser jFileChooserImportacionParametroGenerico;
	//protected File fileImportacionParametroGenerico;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGenerico;
	protected JButton jButtonDuplicarToolBarParametroGenerico;
	protected JButton jButtonNuevoRelacionesToolBarParametroGenerico;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroGenerico;
	protected JButton jButtonCopiarToolBarParametroGenerico;
	protected JButton jButtonVerFormToolBarParametroGenerico;
	public JButton jButtonGuardarCambiosTablaToolBarParametroGenerico;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGenerico;
	protected JButton jButtonCerrarToolBarParametroGenerico;
	
	protected JButton jButtonRecargarInformacionToolBarParametroGenerico;
	protected JButton jButtonProcesarInformacionToolBarParametroGenerico;
	protected JButton jButtonAnterioresToolBarParametroGenerico;
	protected JButton jButtonSiguientesToolBarParametroGenerico;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroGenerico;
	protected JButton jButtonAbrirOrderByToolBarParametroGenerico;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGenerico;
	protected JMenuItem jMenuItemDuplicarParametroGenerico;
	protected JMenuItem jMenuItemNuevoRelacionesParametroGenerico;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroGenerico;
	protected JMenuItem jMenuItemCopiarParametroGenerico;
	protected JMenuItem jMenuItemVerFormParametroGenerico;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGenerico;
	protected JMenuItem jMenuItemCerrarParametroGenerico;
	protected JMenuItem jMenuItemDetalleCerrarParametroGenerico;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroGenerico;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGenerico;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroGenerico;
	protected JMenuItem jMenuItemProcesarInformacionParametroGenerico;
	protected JMenuItem jMenuItemAnterioresParametroGenerico;
	protected JMenuItem jMenuItemSiguientesParametroGenerico;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGenerico;
	protected JMenuItem jMenuItemAbrirOrderByParametroGenerico;
	protected JMenuItem jMenuItemMostrarOcultarParametroGenerico;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGenerico;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroGenerico;
	protected JCheckBox jCheckBoxSeleccionadosParametroGenerico;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroGenerico;
	protected JCheckBox jCheckBoxConGraficoReporteParametroGenerico;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroGenerico;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroGenerico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGenerico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroGenerico;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroGenerico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroGenerico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGenerico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGenerico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroGenerico;
	protected JTextField jTextFieldValorCampoGeneralParametroGenerico;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroGenerico;
	//public JList<Reporte> jListColumnasSelectReporteParametroGenerico;
	//public JScrollPane jScrollColumnasSelectReporteParametroGenerico;
	
	//public JLabel jLabelRelacionesSelectReporteParametroGenerico;
	//public JList<Reporte> jListRelacionesSelectReporteParametroGenerico;
	//public JScrollPane jScrollRelacionesSelectReporteParametroGenerico;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroGenerico;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroGenerico;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroGenerico;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroGenerico;
	
		
	//public JLabel jLabelArchivoImportacionParametroGenerico;	
	//public JLabel jLabelPathArchivoImportacionParametroGenerico;
	//protected JTextField jTextFieldPathArchivoImportacionParametroGenerico;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroGenerico;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroGenerico;
	
	//public JLabel jLabelColumnaCategoriaValorParametroGenerico;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroGenerico;
	
	//public JLabel jLabelColumnasValoresGraficoParametroGenerico;
	//public JList<Reporte> jListColumnasValoresGraficoParametroGenerico;
	//public JScrollPane jScrollColumnasValoresGraficoParametroGenerico;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroGenerico;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroGenerico;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroGenerico;
	public JPanel jPanelFK_IdBodegaParametroGenerico;
	public JButton jButtonFK_IdBodegaParametroGenerico;
	public JPanel jPanelFK_IdModuloParametroGenerico;
	public JButton jButtonFK_IdModuloParametroGenerico;
	
	public JPanel jPanelid_bodegaFK_IdBodegaParametroGenerico;
	public JLabel jLabelid_bodegaFK_IdBodegaParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaParametroGenerico;
	public JButton jButtonid_bodegaFK_IdBodegaParametroGenerico= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroGenericoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloParametroGenerico;
	public JLabel jLabelid_moduloFK_IdModuloParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloParametroGenerico;
	public JButton jButtonid_moduloFK_IdModuloParametroGenerico= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloParametroGenericoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroGenericoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroGenerico)	{
		this.jButtonRecargarInformacionParametroGenerico = jButtonRecargarInformacionParametroGenerico;
	}
	
	public JButton getjButtonProcesarInformacionParametroGenerico() {
		return this.jButtonProcesarInformacionParametroGenerico;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGenerico)	{
		this.jButtonProcesarInformacionParametroGenerico = jButtonProcesarInformacionParametroGenerico;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroGenerico() {
		return this.jButtonRecargarInformacionParametroGenerico;
	}
	
	
	public List<ParametroGenerico> getparametrogenericos() {
		return this.parametrogenericos;
	}

	public void setparametrogenericos(List<ParametroGenerico> parametrogenericos) {
		this.parametrogenericos = parametrogenericos;
	}
	
	public List<ParametroGenerico> getparametrogenericosAux() {
		return this.parametrogenericosAux;
	}

	public void setparametrogenericosAux(List<ParametroGenerico> parametrogenericosAux) {
		this.parametrogenericosAux = parametrogenericosAux;
	}
	
	public List<ParametroGenerico> getparametrogenericosEliminados() {
		return this.parametrogenericosEliminados;
	}

	public void setParametroGenericosEliminados(List<ParametroGenerico> parametrogenericosEliminados) {
		this.parametrogenericosEliminados = parametrogenericosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroGenerico() {
		return jComboBoxTiposSeleccionarParametroGenerico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroGenerico(
			JComboBox jComboBoxTiposSeleccionarParametroGenerico) {
		this.jComboBoxTiposSeleccionarParametroGenerico = jComboBoxTiposSeleccionarParametroGenerico;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroGenerico .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroGenerico() {
		return jTextFieldValorCampoGeneralParametroGenerico;
	}

	public void setjTextFieldValorCampoGeneralParametroGenerico(
			JTextField jTextFieldValorCampoGeneralParametroGenerico) {
		this.jTextFieldValorCampoGeneralParametroGenerico = jTextFieldValorCampoGeneralParametroGenerico;
	}

	public void setBorderResaltarValorCampoGeneralParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroGenerico .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroGenerico() {
		return this.jCheckBoxSeleccionarTodosParametroGenerico;
	}

	public void setjCheckBoxSeleccionarTodosParametroGenerico(
			JCheckBox jCheckBoxSeleccionarTodosParametroGenerico) {
		this.jCheckBoxSeleccionarTodosParametroGenerico = jCheckBoxSeleccionarTodosParametroGenerico;
	}

	public void setBorderResaltarSeleccionarTodosParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroGenerico .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroGenerico() {
		return this.jCheckBoxSeleccionadosParametroGenerico;
	}

	public void setjCheckBoxSeleccionadosParametroGenerico(
			JCheckBox jCheckBoxSeleccionadosParametroGenerico) {
		this.jCheckBoxSeleccionadosParametroGenerico = jCheckBoxSeleccionadosParametroGenerico;
	}
	
	public void setBorderResaltarSeleccionadosParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroGenerico .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroGenerico() {
		return this.jComboBoxTiposArchivosReportesParametroGenerico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroGenerico(
			JComboBox jComboBoxTiposArchivosReportesParametroGenerico) {
		this.jComboBoxTiposArchivosReportesParametroGenerico = jComboBoxTiposArchivosReportesParametroGenerico;
	}

	public void setBorderResaltarTiposArchivosReportesParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroGenerico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroGenerico() {
		return this.jComboBoxTiposReportesParametroGenerico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroGenerico(
			JComboBox jComboBoxTiposReportesParametroGenerico) {
		this.jComboBoxTiposReportesParametroGenerico = jComboBoxTiposReportesParametroGenerico;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroGenerico() {
	//	return jComboBoxTiposReportesDinamicoParametroGenerico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroGenerico(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroGenerico) {
	//	this.jComboBoxTiposReportesDinamicoParametroGenerico = jComboBoxTiposReportesDinamicoParametroGenerico;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroGenerico() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroGenerico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroGenerico(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGenerico) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico = jComboBoxTiposArchivosReportesDinamicoParametroGenerico;
	//}
	
	public void setBorderResaltarTiposReportesParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroGenerico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroGenerico() {
		return this.jComboBoxTiposGraficosReportesParametroGenerico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroGenerico(
			JComboBox jComboBoxTiposGraficosReportesParametroGenerico) {
		this.jComboBoxTiposGraficosReportesParametroGenerico = jComboBoxTiposGraficosReportesParametroGenerico;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroGenerico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroGenerico() {
		return this.jComboBoxTiposPaginacionParametroGenerico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroGenerico(
			JComboBox jComboBoxTiposPaginacionParametroGenerico) {
		this.jComboBoxTiposPaginacionParametroGenerico = jComboBoxTiposPaginacionParametroGenerico;
	}
	
	public void setBorderResaltarTiposPaginacionParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroGenerico .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroGenerico() {
		return this.jComboBoxTiposRelacionesParametroGenerico;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGenerico() {
		return this.jComboBoxTiposAccionesParametroGenerico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGenerico(
			JComboBox jComboBoxTiposRelacionesParametroGenerico) {
		this.jComboBoxTiposRelacionesParametroGenerico = jComboBoxTiposRelacionesParametroGenerico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGenerico(
			JComboBox jComboBoxTiposAccionesParametroGenerico) {
		this.jComboBoxTiposAccionesParametroGenerico = jComboBoxTiposAccionesParametroGenerico;
	}
	
	public void setBorderResaltarTiposRelacionesParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroGenerico .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroGenerico() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroGenerico .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroGenerico() {
	//	return jCheckBoxConGraficoDinamicoParametroGenerico;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroGenerico(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroGenerico) {
	//	this.jCheckBoxConGraficoDinamicoParametroGenerico = jCheckBoxConGraficoDinamicoParametroGenerico;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroGenerico() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroGenerico.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroGenerico .setBorder(borderResaltar);		
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
		this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
		
		this.parametrogenericoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogenericoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogenericoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroGenericoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroGenericoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGenericoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGenericoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGenericoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Generico MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroGenericoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroGenerico= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"nuevo","nuevo","Nuevo"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"duplicar","duplicar","Duplicar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"copiar","copiar","Copiar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"ver_form","ver_form","Ver"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"recargar","recargar","Recargar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroGenerico,this.jTtoolBarParametroGenerico,
							"cerrar","cerrar","Salir"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroGenerico=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroGenerico;
			
				this.jButtonProcesarInformacionToolBarParametroGenerico=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroGenerico;
				
		//protected JButton jButtonModificarToolBarParametroGenerico;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroGenerico=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroGenerico=new JMenuMe("General");
		this.jmenuArchivoParametroGenerico=new JMenuMe("Archivo");
		this.jmenuAccionesParametroGenerico=new JMenuMe("Acciones");
		this.jmenuDatosParametroGenerico=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGenerico= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGenerico.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGenerico,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroGenerico= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroGenerico.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroGenerico,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroGenerico= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroGenerico.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroGenerico,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroGenerico= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGenerico.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGenerico,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroGenerico= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroGenerico.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroGenerico,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroGenerico= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroGenerico.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroGenerico,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroGenerico= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroGenerico.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroGenerico,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGenerico= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGenerico.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGenerico,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroGenerico= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroGenerico.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroGenerico,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroGenerico= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroGenerico.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroGenerico,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroGenerico= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroGenerico.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroGenerico,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroGenerico= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroGenerico.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroGenerico,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroGenerico= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroGenerico.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroGenerico,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGenerico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGenerico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGenerico,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroGenerico= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroGenerico.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroGenerico,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGenerico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGenerico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGenerico,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroGenerico= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroGenerico.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroGenerico,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroGenerico.add(this.jMenuItemCerrarParametroGenerico);
			
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemNuevoParametroGenerico);
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemNuevoGuardarCambiosParametroGenerico);
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemNuevoRelacionesParametroGenerico);
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemGuardarCambiosTablaParametroGenerico);		
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemDuplicarParametroGenerico);		
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemCopiarParametroGenerico);		
			this.jmenuAccionesParametroGenerico.add(this.jMenuItemVerFormParametroGenerico);		
			
			this.jmenuDatosParametroGenerico.add(this.jMenuItemRecargarInformacionParametroGenerico);				
			this.jmenuDatosParametroGenerico.add(this.jMenuItemAnterioresParametroGenerico);				
			this.jmenuDatosParametroGenerico.add(this.jMenuItemSiguientesParametroGenerico);				
			this.jmenuDatosParametroGenerico.add(this.jMenuItemAbrirOrderByParametroGenerico);				
			this.jmenuDatosParametroGenerico.add(this.jMenuItemMostrarOcultarParametroGenerico);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroGenerico.add(this.jMenuItemGuardarCambiosParametroGenerico);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroGenerico.add(this.jmenuArchivoParametroGenerico);		
			this.jmenuBarParametroGenerico.add(this.jmenuAccionesParametroGenerico);		
			this.jmenuBarParametroGenerico.add(this.jmenuDatosParametroGenerico);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroGenerico);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroGenerico() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaParametroGenerico.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaParametroGenerico= new JButtonMe();
		this.jButtonFK_IdBodegaParametroGenerico.setText("Buscar");
		this.jButtonFK_IdBodegaParametroGenerico.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaParametroGenerico,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaParametroGenerico = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaParametroGenerico.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaParametroGenerico.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaParametroGenerico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaParametroGenerico= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaParametroGenerico,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloParametroGenerico.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloParametroGenerico= new JButtonMe();
		this.jButtonFK_IdModuloParametroGenerico.setText("Buscar");
		this.jButtonFK_IdModuloParametroGenerico.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloParametroGenerico,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloParametroGenerico = new JLabelMe();
		jLabelid_moduloFK_IdModuloParametroGenerico.setText("Modulo :");
		jLabelid_moduloFK_IdModuloParametroGenerico.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloParametroGenerico,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloParametroGenerico= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloParametroGenerico,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroGenerico=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroGenerico.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroGenerico.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroGenerico.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroGenerico.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroGenerico,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroGenerico = new ParametroGenericoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Generico DATOS");
			this.jInternalFrameDetalleFormParametroGenerico = new ParametroGenericoDetalleFormJInternalFrame(jDesktopPane,this.parametrogenericoSessionBean.getConGuardarRelaciones(),this.parametrogenericoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroGenerico = null;//new ParametroGenericoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGenerico= new GridBagLayout();
		
		
		this.jTableDatosParametroGenerico = new JTableMe();      
		
		String sToolTipParametroGenerico="";
		sToolTipParametroGenerico=ParametroGenericoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGenerico+="(Facturacion.ParametroGenerico)";
		}
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGenerico+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroGenerico.setToolTipText(sToolTipParametroGenerico);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroGenerico);
		this.jTableDatosParametroGenerico.setAutoCreateRowSorter(true);
		this.jTableDatosParametroGenerico.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroGenerico.setRowSelectionAllowed(true);
		this.jTableDatosParametroGenerico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroGenerico,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroGenerico = new JButtonMe();
		this.jButtonDuplicarParametroGenerico = new JButtonMe();
		this.jButtonCopiarParametroGenerico = new JButtonMe();
		this.jButtonVerFormParametroGenerico = new JButtonMe();
		this.jButtonNuevoRelacionesParametroGenerico = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroGenerico = new JButtonMe();
		this.jButtonCerrarParametroGenerico = new JButtonMe();
		
		this.jScrollPanelDatosParametroGenerico = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroGenerico = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Generico";
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Genericos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGenerico.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGenerico.setToolTipText("Acciones");
        this.jPanelAccionesParametroGenerico.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroGenerico=new ReporteDinamicoJInternalFrame(ParametroGenericoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroGenerico();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroGenerico=new ImportacionJInternalFrame(ParametroGenericoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroGenerico();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroGenerico = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroGenerico.setText("Orden");
		this.jButtonAbrirOrderByParametroGenerico.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGenerico,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGenerico=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGenerico,false,this);
			
			//this.cargarOrderByParametroGenerico(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGenerico=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGenerico,true,this);
			
			//this.cargarOrderByParametroGenerico(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroGenerico.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosParametroGenerico.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosParametroGenerico.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosParametroGenerico.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGenerico.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGenerico.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroGenerico.setText("Nuevo");
		this.jButtonDuplicarParametroGenerico.setText("Duplicar");
		this.jButtonCopiarParametroGenerico.setText("Copiar");
		this.jButtonVerFormParametroGenerico.setText("Ver");
		this.jButtonNuevoRelacionesParametroGenerico.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroGenerico.setText("Guardar");
		this.jButtonCerrarParametroGenerico.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGenerico,"nuevo_button","Nuevo",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroGenerico,"duplicar_button","Duplicar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroGenerico,"copiar_button","Copiar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroGenerico,"ver_form","Ver",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroGenerico,"nuevorelaciones_button","Nuevo Rel",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGenerico,"guardarcambiostabla_button","Guardar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGenerico,"cerrar_button","Salir",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroGenerico.setToolTipText("Nuevo"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroGenerico.setToolTipText("Duplicar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroGenerico.setToolTipText("Copiar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroGenerico.setToolTipText("Ver"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroGenerico.setToolTipText("Nuevo Rel"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroGenerico.setToolTipText("Guardar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGenerico.setToolTipText("Salir"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGenerico";
		inputMap = this.jButtonNuevoParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGenerico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGenerico"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroGenerico";
		inputMap = this.jButtonDuplicarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroGenerico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroGenerico"));
		
		//COPIAR
		sMapKey = "CopiarParametroGenerico";
		inputMap = this.jButtonCopiarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroGenerico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroGenerico"));
		
		//VEr FORM
		sMapKey = "VerFormParametroGenerico";
		inputMap = this.jButtonVerFormParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroGenerico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroGenerico"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroGenerico";
		inputMap = this.jButtonNuevoRelacionesParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroGenerico"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroGenerico";
		inputMap = this.jButtonModificarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroGenerico"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroGenerico";
		inputMap = this.jButtonCerrarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGenerico"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGenerico";
		inputMap = this.jButtonGuardarCambiosTablaParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGenerico"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroGenerico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroGenerico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroGenerico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroGenerico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroGenerico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroGenerico.setName("jPanelParametrosReportesParametroGenerico"); 
		
		this.jPanelParametrosReportesAccionesParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroGenerico.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroGenerico.setName("jPanelParametrosReportesAccionesParametroGenerico"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroGenerico = new JButtonMe();
		this.jButtonRecargarInformacionParametroGenerico.setText("Recargar");
		this.jButtonRecargarInformacionParametroGenerico.setToolTipText("Recargar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroGenerico,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroGenerico = new JButtonMe();
		this.jButtonProcesarInformacionParametroGenerico.setText("Procesar");
		this.jButtonProcesarInformacionParametroGenerico.setToolTipText("Procesar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroGenerico.setVisible(false);
			
		this.jButtonProcesarInformacionParametroGenerico.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGenerico.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGenerico.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGenerico.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroGenerico.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGenerico.setText("TIPO");       
		this.jComboBoxTiposReportesParametroGenerico.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGenerico.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroGenerico.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroGenerico.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroGenerico.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroGenerico.setText("Accion");
		this.jComboBoxTiposRelacionesParametroGenerico.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGenerico.setText("Accion");
		this.jComboBoxTiposAccionesParametroGenerico.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroGenerico.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroGenerico.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroGenerico=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroGenerico.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGenerico.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGenerico.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroGenerico = new JLabelMe();
		
		this.jLabelAccionesParametroGenerico.setText("Acciones");		
		this.jLabelAccionesParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroGenerico = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroGenerico.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroGenerico.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroGenerico = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroGenerico.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroGenerico.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroGenerico = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroGenerico.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroGenerico.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroGenerico = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroGenerico.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroGenerico.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroGenerico = new JButtonMe();
		//this.jButtonAnterioresParametroGenerico.setText("<<");
        this.jButtonAnterioresParametroGenerico.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroGenerico,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroGenerico = new JButtonMe();
		//this.jButtonSiguientesParametroGenerico.setText(">>");
        this.jButtonSiguientesParametroGenerico.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroGenerico,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroGenerico = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroGenerico.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroGenerico.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroGenerico,"nuevoguardarcambios_button","Nue",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroGenerico";
		inputMap = this.jButtonNuevoGuardarCambiosParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroGenerico"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroGenerico";
		inputMap = this.jButtonRecargarInformacionParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroGenerico"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroGenerico";
		inputMap = this.jButtonSiguientesParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroGenerico"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroGenerico";
		inputMap = this.jButtonAnterioresParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroGenerico"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroGenerico();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroGenerico.setMinimumSize(new Dimension(this.getWidth(),ParametroGenericoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGenericoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGenerico.setMaximumSize(new Dimension(this.getWidth(),ParametroGenericoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGenericoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGenerico.setPreferredSize(new Dimension(this.getWidth(),ParametroGenericoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGenericoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroGenerico = new GridBagLayout();

			this.jPanelPaginacionParametroGenerico.setLayout(gridaBagLayoutPaginacionParametroGenerico);						
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 0;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroGenerico.add(this.jButtonAnterioresParametroGenerico, this.gridBagConstraintsParametroGenerico);
					
						
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGenerico.gridy = 0;
			
			this.jPanelPaginacionParametroGenerico.add(this.jButtonNuevoGuardarCambiosParametroGenerico, this.gridBagConstraintsParametroGenerico);
						
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGenerico.gridy = 0;
			this.jPanelPaginacionParametroGenerico.add(this.jButtonSiguientesParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 1;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGenerico.add(this.jButtonNuevoParametroGenerico, this.gridBagConstraintsParametroGenerico);
						
			
			
			if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
				this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroGenerico.gridy = 1;
				this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroGenerico.add(this.jButtonGuardarCambiosTablaParametroGenerico, this.gridBagConstraintsParametroGenerico);
			}
			
			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 1;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGenerico.add(this.jButtonDuplicarParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 1;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGenerico.add(this.jButtonCopiarParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 1;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGenerico.add(this.jButtonVerFormParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 1;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroGenerico.add(this.jButtonCerrarParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
		
		
		this.jButtonRecargarInformacionParametroGenerico.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGenerico.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGenerico.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroGenerico.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGenerico.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGenerico.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroGenerico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGenerico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGenerico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroGenerico.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGenerico.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGenerico.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroGenerico.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGenerico.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGenerico.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroGenerico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGenerico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGenerico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroGenerico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGenerico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGenerico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroGenerico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGenerico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGenerico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroGenerico.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGenerico.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGenerico.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroGenerico.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGenerico.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGenerico.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroGenerico.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGenerico.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGenerico.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroGenerico.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGenerico.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGenerico.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroGenerico = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroGenerico = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroGenerico = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroGenerico = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroGenerico = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroGenerico = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroGenerico.setLayout(gridaBagParametrosReportesParametroGenerico);
			this.jPanelParametrosReportesAccionesParametroGenerico.setLayout(gridaBagParametrosReportesAccionesParametroGenerico);
			
			
			this.jPanelParametrosAuxiliar1ParametroGenerico.setLayout(gridaBagParametrosAuxiliar1ParametroGenerico);
			this.jPanelParametrosAuxiliar2ParametroGenerico.setLayout(gridaBagParametrosAuxiliar2ParametroGenerico);
			this.jPanelParametrosAuxiliar3ParametroGenerico.setLayout(gridaBagParametrosAuxiliar3ParametroGenerico);
			this.jPanelParametrosAuxiliar4ParametroGenerico.setLayout(gridaBagParametrosAuxiliar4ParametroGenerico);
			//this.jPanelParametrosAuxiliar5ParametroGenerico.setLayout(gridaBagParametrosAuxiliar2ParametroGenerico);			
			
			
			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGenerico.add(this.jButtonRecargarInformacionParametroGenerico, this.gridBagConstraintsParametroGenerico);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGenerico.add(this.jComboBoxTiposPaginacionParametroGenerico, this.gridBagConstraintsParametroGenerico);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGenerico.add(this.jCheckBoxConAltoMaximoTablaParametroGenerico, this.gridBagConstraintsParametroGenerico);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGenerico.add(this.jComboBoxTiposArchivosReportesParametroGenerico, this.gridBagConstraintsParametroGenerico);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGenerico.add(this.jPanelParametrosAuxiliar1ParametroGenerico, this.gridBagConstraintsParametroGenerico);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGenerico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroGenerico.add(this.jComboBoxTiposReportesParametroGenerico, this.gridBagConstraintsParametroGenerico);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGenerico.add(this.jPanelParametrosAuxiliar4ParametroGenerico, this.gridBagConstraintsParametroGenerico);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGenerico.add(this.jComboBoxTiposReportesParametroGenerico, this.gridBagConstraintsParametroGenerico);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGenerico.add(this.jCheckBoxGenerarReporteParametroGenerico, this.gridBagConstraintsParametroGenerico);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGenerico.add(this.jPanelParametrosAuxiliar2ParametroGenerico, this.gridBagConstraintsParametroGenerico);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGenerico.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGenerico.add(this.jLabelAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
				this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroGenerico.add(this.jButtonAbrirOrderByParametroGenerico, this.gridBagConstraintsParametroGenerico);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGenerico.add(this.jComboBoxTiposSeleccionarParametroGenerico, this.gridBagConstraintsParametroGenerico);			
			
			
			/*
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGenerico.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGenerico.add(this.jCheckBoxSeleccionarTodosParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGenerico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGenerico.add(this.jCheckBoxSeleccionarTodosParametroGenerico, this.gridBagConstraintsParametroGenerico);															
				
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGenerico.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGenerico.add(this.jCheckBoxSeleccionadosParametroGenerico, this.gridBagConstraintsParametroGenerico);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGenerico.add(this.jPanelParametrosAuxiliar3ParametroGenerico, this.gridBagConstraintsParametroGenerico);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGenerico.add(this.jComboBoxTiposAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);
	
				
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGenerico.add(this.jTextFieldValorCampoGeneralParametroGenerico, this.gridBagConstraintsParametroGenerico);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroGenerico = new GridBagLayout();

			this.jScrollPanelDatosParametroGenerico.setLayout(gridaBagLayoutDatosParametroGenerico);
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = 0;
			this.gridBagConstraintsParametroGenerico.gridx = 0;
			
			this.jScrollPanelDatosParametroGenerico.add(this.jTableDatosParametroGenerico, this.gridBagConstraintsParametroGenerico);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroGenerico.setViewportView(this.jTableDatosParametroGenerico);
		this.jTableDatosParametroGenerico.setFillsViewportHeight(true);
		this.jTableDatosParametroGenerico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroGenerico= new GridBagLayout();
		this.jPanelAccionesParametroGenerico.setLayout(gridaBagLayoutAccionesParametroGenerico);
		
		
		/*	
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 0;
			
		this.jPanelAccionesParametroGenerico.add(this.jButtonNuevoParametroGenerico, this.gridBagConstraintsParametroGenerico);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaParametroGenerico= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaParametroGenerico.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaParametroGenerico.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaParametroGenerico.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaParametroGenerico.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaParametroGenerico.setLayout(gridaBagLayoutFK_IdBodegaParametroGenerico);

		gridBagConstraintsParametroGenerico = new GridBagConstraints();
		gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGenerico.gridy = 0;
		gridBagConstraintsParametroGenerico.gridx = 0;
		jPanelFK_IdBodegaParametroGenerico.add(jLabelid_bodegaFK_IdBodegaParametroGenerico, gridBagConstraintsParametroGenerico);

		gridBagConstraintsParametroGenerico = new GridBagConstraints();
		gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGenerico.gridy = 0;
		gridBagConstraintsParametroGenerico.gridx = 1;
		jPanelFK_IdBodegaParametroGenerico.add(jComboBoxid_bodegaFK_IdBodegaParametroGenerico, gridBagConstraintsParametroGenerico);

		gridBagConstraintsParametroGenerico = new GridBagConstraints();
		gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGenerico.gridy = 1;
		gridBagConstraintsParametroGenerico.gridx =1;
		jPanelFK_IdBodegaParametroGenerico.add(jButtonFK_IdBodegaParametroGenerico, gridBagConstraintsParametroGenerico);

		jTabbedPaneBusquedasParametroGenerico.addTab("1.-Por Bodega ", jPanelFK_IdBodegaParametroGenerico);
		jTabbedPaneBusquedasParametroGenerico.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdModuloParametroGenerico= new GridBagLayout();
		gridaBagLayoutFK_IdModuloParametroGenerico.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloParametroGenerico.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloParametroGenerico.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloParametroGenerico.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloParametroGenerico.setLayout(gridaBagLayoutFK_IdModuloParametroGenerico);

		gridBagConstraintsParametroGenerico = new GridBagConstraints();
		gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGenerico.gridy = 0;
		gridBagConstraintsParametroGenerico.gridx = 0;
		jPanelFK_IdModuloParametroGenerico.add(jLabelid_moduloFK_IdModuloParametroGenerico, gridBagConstraintsParametroGenerico);

		gridBagConstraintsParametroGenerico = new GridBagConstraints();
		gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGenerico.gridy = 0;
		gridBagConstraintsParametroGenerico.gridx = 1;
		jPanelFK_IdModuloParametroGenerico.add(jComboBoxid_moduloFK_IdModuloParametroGenerico, gridBagConstraintsParametroGenerico);

		gridBagConstraintsParametroGenerico = new GridBagConstraints();
		gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGenerico.gridy = 1;
		gridBagConstraintsParametroGenerico.gridx =1;
		jPanelFK_IdModuloParametroGenerico.add(jButtonFK_IdModuloParametroGenerico, gridBagConstraintsParametroGenerico);

		jTabbedPaneBusquedasParametroGenerico.addTab("2.-Por Modulo ", jPanelFK_IdModuloParametroGenerico);
		jTabbedPaneBusquedasParametroGenerico.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGenerico = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGenerico);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();						
			this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGenerico.gridx = 0;		
			//this.gridBagConstraintsParametroGenerico.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGenerico.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroGenerico, this.gridBagConstraintsParametroGenerico);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroGenerico.gridx = 0;		
		//this.gridBagConstraintsParametroGenerico.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroGenerico.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroGenerico);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGenerico.gridx = 0;		
			this.gridBagConstraintsParametroGenerico.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroGenerico.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroGenerico, this.gridBagConstraintsParametroGenerico);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroGenerico, this.gridBagConstraintsParametroGenerico);								
		
		
		/*
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);
		*/		
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGenerico.gridx =0;
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGenerico.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGenerico, this.gridBagConstraintsParametroGenerico);
				
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroGenerico, this.gridBagConstraintsParametroGenerico);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroGenerico= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGenerico = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroGenerico.setLayout(gridaBagLayoutBusquedasParametrosParametroGenerico);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroGenerico=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGenerico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGenerico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGenerico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
			
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
			
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroGenerico;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroGenerico() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroGenerico = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroGenerico.setName("jPanelReporteDinamicoParametroGenerico"); 
		
		this.jPanelReporteDinamicoParametroGenerico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGenerico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGenerico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroGenerico.setLayout(gridaBagLayoutReporteDinamicoParametroGenerico);
		
		
		this.jInternalFrameReporteDinamicoParametroGenerico= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroGenerico = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGenerico= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroGenerico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroGenerico.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroGenerico.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroGenerico.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroGenerico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroGenerico.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroGenerico.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroGenerico.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroGenerico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGenerico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGenerico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Genericos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroGenerico = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroGenerico.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGenerico.add(this.jLabelColumnasSelectReporteParametroGenerico, this.gridBagConstraintsParametroGenerico);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroGenerico = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroGenerico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroGenerico.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroGenerico.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGenerico.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGenerico.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroGenerico=new JScrollPane(this.jListColumnasSelectReporteParametroGenerico);
			
			this.jScrollColumnasSelectReporteParametroGenerico.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGenerico.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGenerico.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroGenerico.add(this.jListColumnasSelectReporteParametroGenerico, this.gridBagConstraintsParametroGenerico);
		this.jPanelReporteDinamicoParametroGenerico.add(this.jScrollColumnasSelectReporteParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroGenerico = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroGenerico.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroGenerico = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroGenerico.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroGenerico.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroGenerico.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGenerico.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGenerico.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroGenerico=new JScrollPane(this.jListRelacionesSelectReporteParametroGenerico);
			
			this.jScrollRelacionesSelectReporteParametroGenerico.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGenerico.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGenerico.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroGenerico = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroGenerico = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroGenerico = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroGenerico = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroGenerico.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroGenerico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGenerico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGenerico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroGenerico = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroGenerico.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGenerico.add(this.jLabelGenerarExcelReporteDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroGenerico = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroGenerico.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroGenerico,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroGenerico.setToolTipText("Generar EXCEL"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroGenerico.add(this.jButtonGenerarExcelReporteDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGenerico.add(this.jComboBoxTiposReportesDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroGenerico = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroGenerico.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGenerico.add(this.jLabelTiposArchivoReporteDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGenerico.add(this.jComboBoxTiposArchivosReportesDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroGenerico = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroGenerico.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroGenerico,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroGenerico.setToolTipText("Generar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGenerico.add(this.jButtonGenerarReporteDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroGenerico = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroGenerico.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroGenerico,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroGenerico.setToolTipText("Cancelar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGenerico.add(this.jButtonCerrarReporteDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroGenerico = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroGenerico= new JScrollPane(jPanelReporteDinamicoParametroGenerico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroGenerico.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGenerico.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGenerico.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Genericos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroGenerico.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroGenerico.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroGenerico.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroGenerico);
		this.jInternalFrameReporteDinamicoParametroGenerico.getContentPane().add(this.jScrollPanelReporteDinamicoParametroGenerico, this.gridBagConstraintsParametroGenerico);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroGenerico() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroGenerico = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroGenerico.setName("jPanelImportacionParametroGenerico"); 
		
		this.jPanelImportacionParametroGenerico.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGenerico.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGenerico.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroGenerico.setLayout(gridaBagLayoutImportacionParametroGenerico);
		
		
		this.jInternalFrameImportacionParametroGenerico= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroGenerico= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroGenerico = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGenerico= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroGenerico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGenerico.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGenerico.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroGenerico.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGenerico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGenerico.setResizable(true);
	    this.jInternalFrameImportacionParametroGenerico.setClosable(true);
	    this.jInternalFrameImportacionParametroGenerico.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroGenerico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGenerico.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGenerico.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroGenerico.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGenerico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGenerico.setResizable(true);
	    this.jInternalFrameImportacionParametroGenerico.setClosable(true);
	    this.jInternalFrameImportacionParametroGenerico.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroGenerico.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGenerico.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGenerico.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Genericos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroGenerico = new JLabelMe();

		this.jLabelArchivoImportacionParametroGenerico.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGenerico.add(this.jLabelArchivoImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroGenerico = new JFileChooser();		
		this.jFileChooserImportacionParametroGenerico.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroGenerico = new JButtonMe();
		this.jButtonAbrirImportacionParametroGenerico.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroGenerico,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroGenerico.setToolTipText("Generar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGenerico.add(this.jButtonAbrirImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroGenerico = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroGenerico.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGenerico.add(this.jLabelPathArchivoImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroGenerico=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroGenerico.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGenerico.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGenerico.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGenerico.add(this.jTextFieldPathArchivoImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroGenerico = new JButtonMe();
		this.jButtonGenerarImportacionParametroGenerico.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroGenerico,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroGenerico.setToolTipText("Generar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGenerico.add(this.jButtonGenerarImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroGenerico = new JButtonMe();
		this.jButtonCerrarImportacionParametroGenerico.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroGenerico,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroGenerico.setToolTipText("Cancelar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGenerico.add(this.jButtonCerrarImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroGenerico = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroGenerico= new JScrollPane(jPanelImportacionParametroGenerico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroGenerico.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroGenerico.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroGenerico.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroGenerico);
		this.jInternalFrameImportacionParametroGenerico.getContentPane().add(this.jScrollPanelImportacionParametroGenerico, this.gridBagConstraintsParametroGenerico);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroGenerico(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroGenerico = new JButtonMe();
			this.jButtonAbrirOrderByParametroGenerico.setText("Orden");
			this.jButtonAbrirOrderByParametroGenerico.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGenerico,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroGenerico";
			inputMap = this.jButtonAbrirOrderByParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroGenerico"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroGenerico = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroGenerico.setName("jPanelOrderByParametroGenerico"); 
			
			this.jPanelOrderByParametroGenerico.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGenerico.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGenerico.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroGenerico.setLayout(gridaBagLayoutOrderByParametroGenerico);
			
			
			this.jTableDatosParametroGenericoOrderBy = new JTableMe();        
			this.jTableDatosParametroGenericoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroGenericoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroGenericoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroGenericoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroGenericoOrderBy.setViewportView(this.jTableDatosParametroGenericoOrderBy);
			this.jTableDatosParametroGenericoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroGenericoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroGenerico= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroGenerico= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroGenerico = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroGenerico= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroGenerico.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroGenerico.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroGenerico.setTitle("Orden");
			this.jInternalFrameOrderByParametroGenerico.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroGenerico.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroGenerico.setResizable(true);
			this.jInternalFrameOrderByParametroGenerico.setClosable(true);
			this.jInternalFrameOrderByParametroGenerico.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroGenerico.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGenerico.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGenerico.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Genericos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroGenerico.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroGenerico.ipady =150;
				
			this.jPanelOrderByParametroGenerico.add(jScrollPanelDatosParametroGenericoOrderBy, this.gridBagConstraintsParametroGenerico);//this.jTableDatosParametroGenericoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroGenerico = new JButtonMe();
			this.jButtonCerrarOrderByParametroGenerico.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroGenerico,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroGenerico.setToolTipText("Cancelar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroGenerico.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroGenerico.add(this.jButtonCerrarOrderByParametroGenerico, this.gridBagConstraintsParametroGenerico);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroGenerico = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroGenerico= new JScrollPane(jPanelOrderByParametroGenerico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroGenerico.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroGenerico.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroGenerico.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroGenerico);
			
			this.jInternalFrameOrderByParametroGenerico.getContentPane().add(this.jScrollPanelOrderByParametroGenerico, this.gridBagConstraintsParametroGenerico);			
		
		} else {
			this.jButtonAbrirOrderByParametroGenerico = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrogenericoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroGenerico.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroGenerico.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroGenerico.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroGenerico.getRowHeight();//ParametroGenericoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGenerico.isSelected()) {
					iHeightTable=ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGenerico.isSelected()) {
					iHeightTable=ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGenericoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroGenerico.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGenerico.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGenerico.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroGenerico.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGenerico.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGenerico.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroGenerico!=null && this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroGenerico.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroGenerico.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroGenerico.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroGenerico.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGenerico.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGenerico.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrogenericoLogic.getParametroGenericos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogenericos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroGenerico> TraerParametroGenericoBeans(List<ParametroGenerico> parametrogenericos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroGenerico parametrogenerico:parametrogenericos) {
					
				if(!(ParametroGenericoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroGenericoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrogenerico.setsDetalleGeneralEntityReporte(ParametroGenericoConstantesFunciones.getParametroGenericoDescripcion(parametrogenerico));
										
					parametrogenerico.setcodigo_descripcion(ParametroGenericoConstantesFunciones.getcodigoDescripcion(parametrogenerico));	
					
						
					
				} else  {
							
					//parametrogenerico.setsDetalleGeneralEntityReporte(parametrogenerico.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrogenericobeans.add(parametrogenericobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrogenericos;
    }
	//PARA REPORTES FIN
}
