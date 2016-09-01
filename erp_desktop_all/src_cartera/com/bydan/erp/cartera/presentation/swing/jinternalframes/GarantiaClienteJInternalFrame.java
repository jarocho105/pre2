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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.GarantiaClienteConstantesFunciones;

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
public class GarantiaClienteJInternalFrame extends GarantiaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGarantiaCliente;
	
	protected JMenuBar jmenuBarGarantiaCliente;
	
	protected JMenu jmenuGarantiaCliente;
	protected JMenu jmenuDatosGarantiaCliente;
	protected JMenu jmenuArchivoGarantiaCliente;
	protected JMenu jmenuAccionesGarantiaCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGarantiaCliente;	
	protected GridBagConstraints gridBagConstraintsGarantiaCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GarantiaClienteDetalleFormJInternalFrame jInternalFrameDetalleFormGarantiaCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGarantiaCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGarantiaCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoGarantiaEmpresaBeanSwingJInternalFrame tipogarantiaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogarantiaempresa="";

	protected EstadoGarantiaClienteBeanSwingJInternalFrame estadogarantiaclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadogarantiacliente="";
	
	public GarantiaClienteSessionBean garantiaclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean;
	public EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GarantiaCliente> garantiaclientes;		
	public List<GarantiaCliente> garantiaclientesEliminados;	
	public List<GarantiaCliente> garantiaclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGarantiaCliente;		
	protected JButton jButtonAbrirOrderByGarantiaCliente;
	
	
	//protected JPanel jPanelOrderByGarantiaCliente;
	//public JScrollPane jScrollPanelOrderByGarantiaCliente;	
	//protected JButton jButtonCerrarOrderByGarantiaCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GarantiaClienteLogic garantiaclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGarantiaCliente;
	public JScrollPane jScrollPanelDatosEdicionGarantiaCliente;
	public JScrollPane jScrollPanelDatosGeneralGarantiaCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosGarantiaClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGarantiaCliente;
	//public JScrollPane jScrollPanelImportacionGarantiaCliente;
	
	
	
	protected JPanel jPanelAccionesGarantiaCliente;
	
    protected JPanel jPanelPaginacionGarantiaCliente;
    protected JPanel jPanelParametrosReportesGarantiaCliente;
	protected JPanel jPanelParametrosReportesAccionesGarantiaCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GarantiaCliente;
	protected JPanel jPanelParametrosAuxiliar2GarantiaCliente;
	protected JPanel jPanelParametrosAuxiliar3GarantiaCliente;
	protected JPanel jPanelParametrosAuxiliar4GarantiaCliente;
	//protected JPanel jPanelParametrosAuxiliar5GarantiaCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoGarantiaCliente;
	//protected JPanel jPanelImportacionGarantiaCliente;
	
	
	public JTable jTableDatosGarantiaCliente;
	
	
	
	//public JTable jTableDatosGarantiaClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGarantiaCliente;
	protected JButton jButtonDuplicarGarantiaCliente;
	protected JButton jButtonCopiarGarantiaCliente;
	protected JButton jButtonVerFormGarantiaCliente;
	protected JButton jButtonNuevoRelacionesGarantiaCliente;
	protected JButton jButtonModificarGarantiaCliente;
	
    protected JButton jButtonGuardarCambiosTablaGarantiaCliente;
	protected JButton jButtonCerrarGarantiaCliente;
	
	
	protected JButton jButtonRecargarInformacionGarantiaCliente;
	protected JButton jButtonProcesarInformacionGarantiaCliente;
	
	
	protected JButton jButtonAnterioresGarantiaCliente;
	protected JButton jButtonSiguientesGarantiaCliente;
	protected JButton jButtonNuevoGuardarCambiosGarantiaCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGarantiaCliente;
	//protected JButton jButtonCerrarReporteDinamicoGarantiaCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoGarantiaCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionGarantiaCliente;
	//protected JButton jButtonGenerarImportacionGarantiaCliente;
	//protected JButton jButtonCerrarImportacionGarantiaCliente;
	//protected JFileChooser jFileChooserImportacionGarantiaCliente;
	//protected File fileImportacionGarantiaCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGarantiaCliente;
	protected JButton jButtonDuplicarToolBarGarantiaCliente;
	protected JButton jButtonNuevoRelacionesToolBarGarantiaCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarGarantiaCliente;
	protected JButton jButtonCopiarToolBarGarantiaCliente;
	protected JButton jButtonVerFormToolBarGarantiaCliente;
	public JButton jButtonGuardarCambiosTablaToolBarGarantiaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarGarantiaCliente;
	protected JButton jButtonCerrarToolBarGarantiaCliente;
	
	protected JButton jButtonRecargarInformacionToolBarGarantiaCliente;
	protected JButton jButtonProcesarInformacionToolBarGarantiaCliente;
	protected JButton jButtonAnterioresToolBarGarantiaCliente;
	protected JButton jButtonSiguientesToolBarGarantiaCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarGarantiaCliente;
	protected JButton jButtonAbrirOrderByToolBarGarantiaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGarantiaCliente;
	protected JMenuItem jMenuItemDuplicarGarantiaCliente;
	protected JMenuItem jMenuItemNuevoRelacionesGarantiaCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGarantiaCliente;
	protected JMenuItem jMenuItemCopiarGarantiaCliente;
	protected JMenuItem jMenuItemVerFormGarantiaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaGarantiaCliente;
	protected JMenuItem jMenuItemCerrarGarantiaCliente;
	protected JMenuItem jMenuItemDetalleCerrarGarantiaCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGarantiaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarGarantiaCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionGarantiaCliente;
	protected JMenuItem jMenuItemProcesarInformacionGarantiaCliente;
	protected JMenuItem jMenuItemAnterioresGarantiaCliente;
	protected JMenuItem jMenuItemSiguientesGarantiaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGarantiaCliente;
	protected JMenuItem jMenuItemAbrirOrderByGarantiaCliente;
	protected JMenuItem jMenuItemMostrarOcultarGarantiaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGarantiaCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGarantiaCliente;
	protected JCheckBox jCheckBoxSeleccionadosGarantiaCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGarantiaCliente;
	protected JCheckBox jCheckBoxConGraficoReporteGarantiaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGarantiaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGarantiaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGarantiaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGarantiaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGarantiaCliente;
	protected JTextField jTextFieldValorCampoGeneralGarantiaCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGarantiaCliente;
	//public JList<Reporte> jListColumnasSelectReporteGarantiaCliente;
	//public JScrollPane jScrollColumnasSelectReporteGarantiaCliente;
	
	//public JLabel jLabelRelacionesSelectReporteGarantiaCliente;
	//public JList<Reporte> jListRelacionesSelectReporteGarantiaCliente;
	//public JScrollPane jScrollRelacionesSelectReporteGarantiaCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGarantiaCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGarantiaCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGarantiaCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoGarantiaCliente;
	
		
	//public JLabel jLabelArchivoImportacionGarantiaCliente;	
	//public JLabel jLabelPathArchivoImportacionGarantiaCliente;
	//protected JTextField jTextFieldPathArchivoImportacionGarantiaCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGarantiaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGarantiaCliente;
	
	//public JLabel jLabelColumnaCategoriaValorGarantiaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGarantiaCliente;
	
	//public JLabel jLabelColumnasValoresGraficoGarantiaCliente;
	//public JList<Reporte> jListColumnasValoresGraficoGarantiaCliente;
	//public JScrollPane jScrollColumnasValoresGraficoGarantiaCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGarantiaCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGarantiaCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGarantiaCliente;
	public JPanel jPanelFK_IdClienteGarantiaCliente;
	public JButton jButtonFK_IdClienteGarantiaCliente;
	public JPanel jPanelFK_IdEstadoGarantiaClienteGarantiaCliente;
	public JButton jButtonFK_IdEstadoGarantiaClienteGarantiaCliente;
	public JPanel jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente;
	public JButton jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteGarantiaCliente;
	public JLabel jLabelid_clienteFK_IdClienteGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteGarantiaCliente;
	public JButton jButtonid_clienteFK_IdClienteGarantiaCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteGarantiaClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteGarantiaCliente;
	
	public JPanel jPanelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente;
	public JLabel jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente;
	public JButton jButtonid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente= new JButtonMe();
	public JButton jButtonid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente;
	public JLabel jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente;
	public JButton jButtonid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente= new JButtonMe();
	public JButton jButtonid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public GarantiaClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GarantiaClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGarantiaCliente)	{
		this.jButtonRecargarInformacionGarantiaCliente = jButtonRecargarInformacionGarantiaCliente;
	}
	
	public JButton getjButtonProcesarInformacionGarantiaCliente() {
		return this.jButtonProcesarInformacionGarantiaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGarantiaCliente)	{
		this.jButtonProcesarInformacionGarantiaCliente = jButtonProcesarInformacionGarantiaCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionGarantiaCliente() {
		return this.jButtonRecargarInformacionGarantiaCliente;
	}
	
	
	public List<GarantiaCliente> getgarantiaclientes() {
		return this.garantiaclientes;
	}

	public void setgarantiaclientes(List<GarantiaCliente> garantiaclientes) {
		this.garantiaclientes = garantiaclientes;
	}
	
	public List<GarantiaCliente> getgarantiaclientesAux() {
		return this.garantiaclientesAux;
	}

	public void setgarantiaclientesAux(List<GarantiaCliente> garantiaclientesAux) {
		this.garantiaclientesAux = garantiaclientesAux;
	}
	
	public List<GarantiaCliente> getgarantiaclientesEliminados() {
		return this.garantiaclientesEliminados;
	}

	public void setGarantiaClientesEliminados(List<GarantiaCliente> garantiaclientesEliminados) {
		this.garantiaclientesEliminados = garantiaclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGarantiaCliente() {
		return jComboBoxTiposSeleccionarGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGarantiaCliente(
			JComboBox jComboBoxTiposSeleccionarGarantiaCliente) {
		this.jComboBoxTiposSeleccionarGarantiaCliente = jComboBoxTiposSeleccionarGarantiaCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGarantiaCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGarantiaCliente() {
		return jTextFieldValorCampoGeneralGarantiaCliente;
	}

	public void setjTextFieldValorCampoGeneralGarantiaCliente(
			JTextField jTextFieldValorCampoGeneralGarantiaCliente) {
		this.jTextFieldValorCampoGeneralGarantiaCliente = jTextFieldValorCampoGeneralGarantiaCliente;
	}

	public void setBorderResaltarValorCampoGeneralGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGarantiaCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGarantiaCliente() {
		return this.jCheckBoxSeleccionarTodosGarantiaCliente;
	}

	public void setjCheckBoxSeleccionarTodosGarantiaCliente(
			JCheckBox jCheckBoxSeleccionarTodosGarantiaCliente) {
		this.jCheckBoxSeleccionarTodosGarantiaCliente = jCheckBoxSeleccionarTodosGarantiaCliente;
	}

	public void setBorderResaltarSeleccionarTodosGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGarantiaCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGarantiaCliente() {
		return this.jCheckBoxSeleccionadosGarantiaCliente;
	}

	public void setjCheckBoxSeleccionadosGarantiaCliente(
			JCheckBox jCheckBoxSeleccionadosGarantiaCliente) {
		this.jCheckBoxSeleccionadosGarantiaCliente = jCheckBoxSeleccionadosGarantiaCliente;
	}
	
	public void setBorderResaltarSeleccionadosGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGarantiaCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGarantiaCliente() {
		return this.jComboBoxTiposArchivosReportesGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGarantiaCliente(
			JComboBox jComboBoxTiposArchivosReportesGarantiaCliente) {
		this.jComboBoxTiposArchivosReportesGarantiaCliente = jComboBoxTiposArchivosReportesGarantiaCliente;
	}

	public void setBorderResaltarTiposArchivosReportesGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGarantiaCliente() {
		return this.jComboBoxTiposReportesGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGarantiaCliente(
			JComboBox jComboBoxTiposReportesGarantiaCliente) {
		this.jComboBoxTiposReportesGarantiaCliente = jComboBoxTiposReportesGarantiaCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGarantiaCliente() {
	//	return jComboBoxTiposReportesDinamicoGarantiaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGarantiaCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoGarantiaCliente) {
	//	this.jComboBoxTiposReportesDinamicoGarantiaCliente = jComboBoxTiposReportesDinamicoGarantiaCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGarantiaCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoGarantiaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGarantiaCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGarantiaCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente = jComboBoxTiposArchivosReportesDinamicoGarantiaCliente;
	//}
	
	public void setBorderResaltarTiposReportesGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGarantiaCliente() {
		return this.jComboBoxTiposGraficosReportesGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGarantiaCliente(
			JComboBox jComboBoxTiposGraficosReportesGarantiaCliente) {
		this.jComboBoxTiposGraficosReportesGarantiaCliente = jComboBoxTiposGraficosReportesGarantiaCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGarantiaCliente() {
		return this.jComboBoxTiposPaginacionGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGarantiaCliente(
			JComboBox jComboBoxTiposPaginacionGarantiaCliente) {
		this.jComboBoxTiposPaginacionGarantiaCliente = jComboBoxTiposPaginacionGarantiaCliente;
	}
	
	public void setBorderResaltarTiposPaginacionGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGarantiaCliente() {
		return this.jComboBoxTiposRelacionesGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGarantiaCliente() {
		return this.jComboBoxTiposAccionesGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGarantiaCliente(
			JComboBox jComboBoxTiposRelacionesGarantiaCliente) {
		this.jComboBoxTiposRelacionesGarantiaCliente = jComboBoxTiposRelacionesGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGarantiaCliente(
			JComboBox jComboBoxTiposAccionesGarantiaCliente) {
		this.jComboBoxTiposAccionesGarantiaCliente = jComboBoxTiposAccionesGarantiaCliente;
	}
	
	public void setBorderResaltarTiposRelacionesGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGarantiaCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGarantiaCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGarantiaCliente() {
	//	return jCheckBoxConGraficoDinamicoGarantiaCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoGarantiaCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoGarantiaCliente) {
	//	this.jCheckBoxConGraficoDinamicoGarantiaCliente = jCheckBoxConGraficoDinamicoGarantiaCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGarantiaCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGarantiaCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGarantiaCliente .setBorder(borderResaltar);		
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
		this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		
		this.garantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.garantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.garantiaclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GarantiaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Garantia Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGarantiaCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"nuevo","nuevo","Nuevo"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"duplicar","duplicar","Duplicar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"copiar","copiar","Copiar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"ver_form","ver_form","Ver"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"recargar","recargar","Recargar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGarantiaCliente,this.jTtoolBarGarantiaCliente,
							"cerrar","cerrar","Salir"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGarantiaCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGarantiaCliente;
			
				this.jButtonProcesarInformacionToolBarGarantiaCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGarantiaCliente;
				
		//protected JButton jButtonModificarToolBarGarantiaCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGarantiaCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGarantiaCliente=new JMenuMe("General");
		this.jmenuArchivoGarantiaCliente=new JMenuMe("Archivo");
		this.jmenuAccionesGarantiaCliente=new JMenuMe("Acciones");
		this.jmenuDatosGarantiaCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGarantiaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGarantiaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGarantiaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGarantiaCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGarantiaCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGarantiaCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGarantiaCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGarantiaCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGarantiaCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGarantiaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGarantiaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGarantiaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGarantiaCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGarantiaCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGarantiaCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGarantiaCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGarantiaCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGarantiaCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGarantiaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGarantiaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGarantiaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGarantiaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGarantiaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGarantiaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGarantiaCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGarantiaCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGarantiaCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGarantiaCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGarantiaCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGarantiaCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGarantiaCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGarantiaCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGarantiaCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGarantiaCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGarantiaCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGarantiaCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGarantiaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGarantiaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGarantiaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGarantiaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGarantiaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGarantiaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGarantiaCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGarantiaCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGarantiaCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGarantiaCliente.add(this.jMenuItemCerrarGarantiaCliente);
			
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemNuevoGarantiaCliente);
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemNuevoGuardarCambiosGarantiaCliente);
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemNuevoRelacionesGarantiaCliente);
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemGuardarCambiosTablaGarantiaCliente);		
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemDuplicarGarantiaCliente);		
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemCopiarGarantiaCliente);		
			this.jmenuAccionesGarantiaCliente.add(this.jMenuItemVerFormGarantiaCliente);		
			
			this.jmenuDatosGarantiaCliente.add(this.jMenuItemRecargarInformacionGarantiaCliente);				
			this.jmenuDatosGarantiaCliente.add(this.jMenuItemAnterioresGarantiaCliente);				
			this.jmenuDatosGarantiaCliente.add(this.jMenuItemSiguientesGarantiaCliente);				
			this.jmenuDatosGarantiaCliente.add(this.jMenuItemAbrirOrderByGarantiaCliente);				
			this.jmenuDatosGarantiaCliente.add(this.jMenuItemMostrarOcultarGarantiaCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGarantiaCliente.add(this.jMenuItemGuardarCambiosGarantiaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGarantiaCliente.add(this.jmenuArchivoGarantiaCliente);		
			this.jmenuBarGarantiaCliente.add(this.jmenuAccionesGarantiaCliente);		
			this.jmenuBarGarantiaCliente.add(this.jmenuDatosGarantiaCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGarantiaCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGarantiaCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteGarantiaCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteGarantiaCliente= new JButtonMe();
		this.jButtonFK_IdClienteGarantiaCliente.setText("Buscar");
		this.jButtonFK_IdClienteGarantiaCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteGarantiaCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteGarantiaCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteGarantiaCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteGarantiaCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteGarantiaCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.setFocusable(false);

		this.jPanelFK_IdEstadoGarantiaClienteGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoGarantiaClienteGarantiaCliente.setToolTipText("Buscar Por Estado Garantia Cliente ");
		this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente= new JButtonMe();
		this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente.setText("Buscar");
		this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente.setToolTipText("Buscar Por Estado Garantia Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente,"buscar_button","Buscar Por Estado Garantia Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente = new JLabelMe();
		jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setText("Estado Garantia Cliente :");
		jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setToolTipText("Estado Garantia Cliente");
		jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente= new JComboBoxMe();
		jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente.setToolTipText("Buscar Por Tipo Garantia Empresa ");
		this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente= new JButtonMe();
		this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente.setText("Buscar");
		this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente.setToolTipText("Buscar Por Tipo Garantia Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente,"buscar_button","Buscar Por Tipo Garantia Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente = new JLabelMe();
		jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setText("Tipo Garantia Empresa :");
		jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setToolTipText("Tipo Garantia Empresa");
		jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente= new JComboBoxMe();
		jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGarantiaCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasGarantiaCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGarantiaCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGarantiaCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGarantiaCliente = new GarantiaClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Garantia Cliente DATOS");
			this.jInternalFrameDetalleFormGarantiaCliente = new GarantiaClienteDetalleFormJInternalFrame(jDesktopPane,this.garantiaclienteSessionBean.getConGuardarRelaciones(),this.garantiaclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGarantiaCliente = null;//new GarantiaClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGarantiaCliente= new GridBagLayout();
		
		
		this.jTableDatosGarantiaCliente = new JTableMe();      
		
		String sToolTipGarantiaCliente="";
		sToolTipGarantiaCliente=GarantiaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGarantiaCliente+="(Cartera.GarantiaCliente)";
		}
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipGarantiaCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGarantiaCliente.setToolTipText(sToolTipGarantiaCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGarantiaCliente);
		this.jTableDatosGarantiaCliente.setAutoCreateRowSorter(true);
		this.jTableDatosGarantiaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGarantiaCliente.setRowSelectionAllowed(true);
		this.jTableDatosGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGarantiaCliente = new JButtonMe();
		this.jButtonDuplicarGarantiaCliente = new JButtonMe();
		this.jButtonCopiarGarantiaCliente = new JButtonMe();
		this.jButtonVerFormGarantiaCliente = new JButtonMe();
		this.jButtonNuevoRelacionesGarantiaCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGarantiaCliente = new JButtonMe();
		this.jButtonCerrarGarantiaCliente = new JButtonMe();
		
		this.jScrollPanelDatosGarantiaCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralGarantiaCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Garantia Cliente";
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Garantia Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGarantiaCliente.setToolTipText("Acciones");
        this.jPanelAccionesGarantiaCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGarantiaCliente=new ReporteDinamicoJInternalFrame(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGarantiaCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGarantiaCliente=new ImportacionJInternalFrame(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGarantiaCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGarantiaCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByGarantiaCliente.setText("Orden");
		this.jButtonAbrirOrderByGarantiaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGarantiaCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGarantiaCliente,false,this);
			
			//this.cargarOrderByGarantiaCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGarantiaCliente,true,this);
			
			//this.cargarOrderByGarantiaCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGarantiaCliente.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosGarantiaCliente.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosGarantiaCliente.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosGarantiaCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGarantiaCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGarantiaCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGarantiaCliente.setText("Nuevo");
		this.jButtonDuplicarGarantiaCliente.setText("Duplicar");
		this.jButtonCopiarGarantiaCliente.setText("Copiar");
		this.jButtonVerFormGarantiaCliente.setText("Ver");
		this.jButtonNuevoRelacionesGarantiaCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.setText("Guardar");
		this.jButtonCerrarGarantiaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGarantiaCliente,"nuevo_button","Nuevo",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGarantiaCliente,"duplicar_button","Duplicar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGarantiaCliente,"copiar_button","Copiar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGarantiaCliente,"ver_form","Ver",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGarantiaCliente,"nuevorelaciones_button","Nuevo Rel",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGarantiaCliente,"guardarcambiostabla_button","Guardar",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGarantiaCliente,"cerrar_button","Salir",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGarantiaCliente.setToolTipText("Nuevo"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGarantiaCliente.setToolTipText("Duplicar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGarantiaCliente.setToolTipText("Copiar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGarantiaCliente.setToolTipText("Ver"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGarantiaCliente.setToolTipText("Nuevo Rel"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.setToolTipText("Guardar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGarantiaCliente.setToolTipText("Salir"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGarantiaCliente";
		inputMap = this.jButtonNuevoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGarantiaCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarGarantiaCliente";
		inputMap = this.jButtonDuplicarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGarantiaCliente"));
		
		//COPIAR
		sMapKey = "CopiarGarantiaCliente";
		inputMap = this.jButtonCopiarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGarantiaCliente"));
		
		//VEr FORM
		sMapKey = "VerFormGarantiaCliente";
		inputMap = this.jButtonVerFormGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGarantiaCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGarantiaCliente";
		inputMap = this.jButtonNuevoRelacionesGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGarantiaCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGarantiaCliente";
		inputMap = this.jButtonModificarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGarantiaCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGarantiaCliente";
		inputMap = this.jButtonCerrarGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGarantiaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGarantiaCliente";
		inputMap = this.jButtonGuardarCambiosTablaGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGarantiaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGarantiaCliente.setName("jPanelParametrosReportesGarantiaCliente"); 
		
		this.jPanelParametrosReportesAccionesGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGarantiaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGarantiaCliente.setName("jPanelParametrosReportesAccionesGarantiaCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGarantiaCliente = new JButtonMe();
		this.jButtonRecargarInformacionGarantiaCliente.setText("Recargar");
		this.jButtonRecargarInformacionGarantiaCliente.setToolTipText("Recargar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGarantiaCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGarantiaCliente = new JButtonMe();
		this.jButtonProcesarInformacionGarantiaCliente.setText("Procesar");
		this.jButtonProcesarInformacionGarantiaCliente.setToolTipText("Procesar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGarantiaCliente.setVisible(false);
			
		this.jButtonProcesarInformacionGarantiaCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGarantiaCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGarantiaCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGarantiaCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGarantiaCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGarantiaCliente.setText("TIPO");       
		this.jComboBoxTiposReportesGarantiaCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGarantiaCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGarantiaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGarantiaCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionGarantiaCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGarantiaCliente.setText("Accion");
		this.jComboBoxTiposRelacionesGarantiaCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGarantiaCliente.setText("Accion");
		this.jComboBoxTiposAccionesGarantiaCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGarantiaCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarGarantiaCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGarantiaCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGarantiaCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGarantiaCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGarantiaCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGarantiaCliente = new JLabelMe();
		
		this.jLabelAccionesGarantiaCliente.setText("Acciones");		
		this.jLabelAccionesGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGarantiaCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGarantiaCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGarantiaCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGarantiaCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGarantiaCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGarantiaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGarantiaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGarantiaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGarantiaCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteGarantiaCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGarantiaCliente = new JButtonMe();
		//this.jButtonAnterioresGarantiaCliente.setText("<<");
        this.jButtonAnterioresGarantiaCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGarantiaCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGarantiaCliente = new JButtonMe();
		//this.jButtonSiguientesGarantiaCliente.setText(">>");
        this.jButtonSiguientesGarantiaCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGarantiaCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGarantiaCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGarantiaCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosGarantiaCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGarantiaCliente,"nuevoguardarcambios_button","Nue",this.garantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGarantiaCliente";
		inputMap = this.jButtonNuevoGuardarCambiosGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGarantiaCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGarantiaCliente";
		inputMap = this.jButtonRecargarInformacionGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGarantiaCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGarantiaCliente";
		inputMap = this.jButtonSiguientesGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGarantiaCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGarantiaCliente";
		inputMap = this.jButtonAnterioresGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGarantiaCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGarantiaCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGarantiaCliente.setMinimumSize(new Dimension(this.getWidth(),GarantiaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GarantiaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGarantiaCliente.setMaximumSize(new Dimension(this.getWidth(),GarantiaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GarantiaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGarantiaCliente.setPreferredSize(new Dimension(this.getWidth(),GarantiaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GarantiaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGarantiaCliente = new GridBagLayout();

			this.jPanelPaginacionGarantiaCliente.setLayout(gridaBagLayoutPaginacionGarantiaCliente);						
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 0;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonAnterioresGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
					
						
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGarantiaCliente.gridy = 0;
			
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonNuevoGuardarCambiosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
						
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGarantiaCliente.gridy = 0;
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonSiguientesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 1;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonNuevoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
						
			
			
			if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGarantiaCliente.gridy = 1;
				this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGarantiaCliente.add(this.jButtonGuardarCambiosTablaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			}
			
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 1;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonDuplicarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 1;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonCopiarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 1;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonVerFormGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 1;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGarantiaCliente.add(this.jButtonCerrarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		
		this.jButtonRecargarInformacionGarantiaCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGarantiaCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGarantiaCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGarantiaCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGarantiaCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGarantiaCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGarantiaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGarantiaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGarantiaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGarantiaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGarantiaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGarantiaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGarantiaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGarantiaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGarantiaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGarantiaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGarantiaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGarantiaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGarantiaCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGarantiaCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGarantiaCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGarantiaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGarantiaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGarantiaCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGarantiaCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGarantiaCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGarantiaCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGarantiaCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GarantiaCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGarantiaCliente.setLayout(gridaBagParametrosReportesGarantiaCliente);
			this.jPanelParametrosReportesAccionesGarantiaCliente.setLayout(gridaBagParametrosReportesAccionesGarantiaCliente);
			
			
			this.jPanelParametrosAuxiliar1GarantiaCliente.setLayout(gridaBagParametrosAuxiliar1GarantiaCliente);
			this.jPanelParametrosAuxiliar2GarantiaCliente.setLayout(gridaBagParametrosAuxiliar2GarantiaCliente);
			this.jPanelParametrosAuxiliar3GarantiaCliente.setLayout(gridaBagParametrosAuxiliar3GarantiaCliente);
			this.jPanelParametrosAuxiliar4GarantiaCliente.setLayout(gridaBagParametrosAuxiliar4GarantiaCliente);
			//this.jPanelParametrosAuxiliar5GarantiaCliente.setLayout(gridaBagParametrosAuxiliar2GarantiaCliente);			
			
			
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGarantiaCliente.add(this.jButtonRecargarInformacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GarantiaCliente.add(this.jComboBoxTiposPaginacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GarantiaCliente.add(this.jCheckBoxConAltoMaximoTablaGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GarantiaCliente.add(this.jComboBoxTiposArchivosReportesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGarantiaCliente.add(this.jPanelParametrosAuxiliar1GarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GarantiaCliente.add(this.jComboBoxTiposReportesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);																		
			
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GarantiaCliente.add(this.jComboBoxTiposGraficosReportesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGarantiaCliente.add(this.jPanelParametrosAuxiliar4GarantiaCliente, this.gridBagConstraintsGarantiaCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGarantiaCliente.add(this.jComboBoxTiposReportesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGarantiaCliente.add(this.jCheckBoxGenerarReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGarantiaCliente.add(this.jPanelParametrosAuxiliar2GarantiaCliente, this.gridBagConstraintsGarantiaCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGarantiaCliente.add(this.jLabelAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGarantiaCliente.add(this.jButtonAbrirOrderByGarantiaCliente, this.gridBagConstraintsGarantiaCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGarantiaCliente.add(this.jComboBoxTiposSeleccionarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
			
			
			/*
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGarantiaCliente.add(this.jCheckBoxSeleccionarTodosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGarantiaCliente.add(this.jCheckBoxConGraficoReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GarantiaCliente.add(this.jCheckBoxSeleccionarTodosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);															
				
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GarantiaCliente.add(this.jCheckBoxSeleccionadosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);															
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GarantiaCliente.add(this.jCheckBoxConGraficoReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGarantiaCliente.add(this.jPanelParametrosAuxiliar3GarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGarantiaCliente.add(this.jComboBoxTiposAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
	
				
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGarantiaCliente.add(this.jTextFieldValorCampoGeneralGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGarantiaCliente = new GridBagLayout();

			this.jScrollPanelDatosGarantiaCliente.setLayout(gridaBagLayoutDatosGarantiaCliente);
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = 0;
			this.gridBagConstraintsGarantiaCliente.gridx = 0;
			
			this.jScrollPanelDatosGarantiaCliente.add(this.jTableDatosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGarantiaCliente.setViewportView(this.jTableDatosGarantiaCliente);
		this.jTableDatosGarantiaCliente.setFillsViewportHeight(true);
		this.jTableDatosGarantiaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGarantiaCliente= new GridBagLayout();
		this.jPanelAccionesGarantiaCliente.setLayout(gridaBagLayoutAccionesGarantiaCliente);
		
		
		/*	
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = 0;
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
			
		this.jPanelAccionesGarantiaCliente.add(this.jButtonNuevoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteGarantiaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteGarantiaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteGarantiaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteGarantiaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteGarantiaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteGarantiaCliente.setLayout(gridaBagLayoutFK_IdClienteGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 0;
		jPanelFK_IdClienteGarantiaCliente.add(jLabelid_clienteFK_IdClienteGarantiaCliente, gridBagConstraintsGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 1;
		jPanelFK_IdClienteGarantiaCliente.add(jComboBoxid_clienteFK_IdClienteGarantiaCliente, gridBagConstraintsGarantiaCliente);


		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 0;
		jPanelFK_IdClienteGarantiaCliente.add(this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente, gridBagConstraintsGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 1;
		gridBagConstraintsGarantiaCliente.gridx =1;
		jPanelFK_IdClienteGarantiaCliente.add(jButtonFK_IdClienteGarantiaCliente, gridBagConstraintsGarantiaCliente);

		jTabbedPaneBusquedasGarantiaCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteGarantiaCliente);
		jTabbedPaneBusquedasGarantiaCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoGarantiaClienteGarantiaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoGarantiaClienteGarantiaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoGarantiaClienteGarantiaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoGarantiaClienteGarantiaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoGarantiaClienteGarantiaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoGarantiaClienteGarantiaCliente.setLayout(gridaBagLayoutFK_IdEstadoGarantiaClienteGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 0;
		jPanelFK_IdEstadoGarantiaClienteGarantiaCliente.add(jLabelid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente, gridBagConstraintsGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 1;
		jPanelFK_IdEstadoGarantiaClienteGarantiaCliente.add(jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente, gridBagConstraintsGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 1;
		gridBagConstraintsGarantiaCliente.gridx =1;
		jPanelFK_IdEstadoGarantiaClienteGarantiaCliente.add(jButtonFK_IdEstadoGarantiaClienteGarantiaCliente, gridBagConstraintsGarantiaCliente);

		jTabbedPaneBusquedasGarantiaCliente.addTab("2.-Por Estado Garantia Cliente ", jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);
		jTabbedPaneBusquedasGarantiaCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoGarantiaEmpresaGarantiaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGarantiaEmpresaGarantiaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGarantiaEmpresaGarantiaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGarantiaEmpresaGarantiaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGarantiaEmpresaGarantiaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente.setLayout(gridaBagLayoutFK_IdTipoGarantiaEmpresaGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 0;
		jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente.add(jLabelid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente, gridBagConstraintsGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 0;
		gridBagConstraintsGarantiaCliente.gridx = 1;
		jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente.add(jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente, gridBagConstraintsGarantiaCliente);

		gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGarantiaCliente.gridy = 1;
		gridBagConstraintsGarantiaCliente.gridx =1;
		jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente.add(jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente, gridBagConstraintsGarantiaCliente);

		jTabbedPaneBusquedasGarantiaCliente.addTab("3.-Por Tipo Garantia Empresa ", jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);
		jTabbedPaneBusquedasGarantiaCliente.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGarantiaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGarantiaCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();						
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGarantiaCliente.gridx = 0;		
			//this.gridBagConstraintsGarantiaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGarantiaCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGarantiaCliente, this.gridBagConstraintsGarantiaCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGarantiaCliente.gridx = 0;		
		//this.gridBagConstraintsGarantiaCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGarantiaCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGarantiaCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGarantiaCliente.gridx = 0;		
			this.gridBagConstraintsGarantiaCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGarantiaCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGarantiaCliente, this.gridBagConstraintsGarantiaCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);								
		
		
		/*
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		*/		
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGarantiaCliente.gridx =0;
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGarantiaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
				
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGarantiaCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosGarantiaCliente.setLayout(gridaBagLayoutBusquedasParametrosGarantiaCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGarantiaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
			
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGarantiaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGarantiaCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGarantiaCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGarantiaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGarantiaCliente.setName("jPanelReporteDinamicoGarantiaCliente"); 
		
		this.jPanelReporteDinamicoGarantiaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGarantiaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGarantiaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGarantiaCliente.setLayout(gridaBagLayoutReporteDinamicoGarantiaCliente);
		
		
		this.jInternalFrameReporteDinamicoGarantiaCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGarantiaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGarantiaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGarantiaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGarantiaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGarantiaCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGarantiaCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoGarantiaCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoGarantiaCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGarantiaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGarantiaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGarantiaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Garantia Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGarantiaCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteGarantiaCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelColumnasSelectReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGarantiaCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGarantiaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGarantiaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGarantiaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGarantiaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGarantiaCliente=new JScrollPane(this.jListColumnasSelectReporteGarantiaCliente);
			
			this.jScrollColumnasSelectReporteGarantiaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGarantiaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGarantiaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGarantiaCliente.add(this.jListColumnasSelectReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jScrollColumnasSelectReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGarantiaCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteGarantiaCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGarantiaCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGarantiaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGarantiaCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGarantiaCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGarantiaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGarantiaCliente=new JScrollPane(this.jListRelacionesSelectReporteGarantiaCliente);
			
			this.jScrollRelacionesSelectReporteGarantiaCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGarantiaCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGarantiaCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGarantiaCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGarantiaCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoGarantiaCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGarantiaCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGarantiaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGarantiaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGarantiaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGarantiaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGarantiaCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoGarantiaCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelConGraficoDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGarantiaCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGarantiaCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGarantiaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGarantiaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGarantiaCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jCheckBoxConGraficoDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGarantiaCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGarantiaCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelColumnaCategoriaGraficoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGarantiaCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGarantiaCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGarantiaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGarantiaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGarantiaCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jComboBoxColumnaCategoriaGraficoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGarantiaCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorGarantiaCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelColumnaCategoriaValorGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGarantiaCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGarantiaCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGarantiaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGarantiaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGarantiaCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jComboBoxColumnaCategoriaValorGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGarantiaCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoGarantiaCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelColumnasValoresGraficoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGarantiaCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGarantiaCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGarantiaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGarantiaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGarantiaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGarantiaCliente=new JScrollPane(this.jListColumnasValoresGraficoGarantiaCliente);
			
			this.jScrollColumnasValoresGraficoGarantiaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGarantiaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGarantiaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGarantiaCliente.add(this.jListColumnasSelectReporteGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jScrollColumnasValoresGraficoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGarantiaCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGarantiaCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelTiposGraficosReportesDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGarantiaCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGarantiaCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGarantiaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGarantiaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGarantiaCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jComboBoxTiposGraficosReportesDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGarantiaCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGarantiaCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelGenerarExcelReporteDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGarantiaCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGarantiaCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGarantiaCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGarantiaCliente.setToolTipText("Generar EXCEL"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGarantiaCliente.add(this.jButtonGenerarExcelReporteDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jComboBoxTiposReportesDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGarantiaCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGarantiaCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jLabelTiposArchivoReporteDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jComboBoxTiposArchivosReportesDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGarantiaCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGarantiaCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGarantiaCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGarantiaCliente.setToolTipText("Generar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jButtonGenerarReporteDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGarantiaCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGarantiaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGarantiaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGarantiaCliente.setToolTipText("Cancelar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGarantiaCliente.add(this.jButtonCerrarReporteDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGarantiaCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGarantiaCliente= new JScrollPane(jPanelReporteDinamicoGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGarantiaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGarantiaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGarantiaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Garantia Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGarantiaCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGarantiaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGarantiaCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGarantiaCliente);
		this.jInternalFrameReporteDinamicoGarantiaCliente.getContentPane().add(this.jScrollPanelReporteDinamicoGarantiaCliente, this.gridBagConstraintsGarantiaCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGarantiaCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGarantiaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGarantiaCliente.setName("jPanelImportacionGarantiaCliente"); 
		
		this.jPanelImportacionGarantiaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGarantiaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGarantiaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGarantiaCliente.setLayout(gridaBagLayoutImportacionGarantiaCliente);
		
		
		this.jInternalFrameImportacionGarantiaCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGarantiaCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGarantiaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGarantiaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGarantiaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGarantiaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGarantiaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGarantiaCliente.setResizable(true);
	    this.jInternalFrameImportacionGarantiaCliente.setClosable(true);
	    this.jInternalFrameImportacionGarantiaCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGarantiaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGarantiaCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGarantiaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGarantiaCliente.setResizable(true);
	    this.jInternalFrameImportacionGarantiaCliente.setClosable(true);
	    this.jInternalFrameImportacionGarantiaCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGarantiaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGarantiaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGarantiaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Garantia Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGarantiaCliente = new JLabelMe();

		this.jLabelArchivoImportacionGarantiaCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGarantiaCliente.add(this.jLabelArchivoImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGarantiaCliente = new JFileChooser();		
		this.jFileChooserImportacionGarantiaCliente.setToolTipText("ESCOGER ARCHIVO"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGarantiaCliente = new JButtonMe();
		this.jButtonAbrirImportacionGarantiaCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGarantiaCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGarantiaCliente.setToolTipText("Generar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGarantiaCliente.add(this.jButtonAbrirImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGarantiaCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionGarantiaCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGarantiaCliente.add(this.jLabelPathArchivoImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGarantiaCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGarantiaCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGarantiaCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGarantiaCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGarantiaCliente.add(this.jTextFieldPathArchivoImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGarantiaCliente = new JButtonMe();
		this.jButtonGenerarImportacionGarantiaCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGarantiaCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGarantiaCliente.setToolTipText("Generar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGarantiaCliente.add(this.jButtonGenerarImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGarantiaCliente = new JButtonMe();
		this.jButtonCerrarImportacionGarantiaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGarantiaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGarantiaCliente.setToolTipText("Cancelar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGarantiaCliente.add(this.jButtonCerrarImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGarantiaCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionGarantiaCliente= new JScrollPane(jPanelImportacionGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsGarantiaCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsGarantiaCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGarantiaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGarantiaCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGarantiaCliente);
		this.jInternalFrameImportacionGarantiaCliente.getContentPane().add(this.jScrollPanelImportacionGarantiaCliente, this.gridBagConstraintsGarantiaCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGarantiaCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGarantiaCliente = new JButtonMe();
			this.jButtonAbrirOrderByGarantiaCliente.setText("Orden");
			this.jButtonAbrirOrderByGarantiaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGarantiaCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGarantiaCliente";
			inputMap = this.jButtonAbrirOrderByGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGarantiaCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByGarantiaCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGarantiaCliente.setName("jPanelOrderByGarantiaCliente"); 
			
			this.jPanelOrderByGarantiaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGarantiaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGarantiaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGarantiaCliente.setLayout(gridaBagLayoutOrderByGarantiaCliente);
			
			
			this.jTableDatosGarantiaClienteOrderBy = new JTableMe();        
			this.jTableDatosGarantiaClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGarantiaClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGarantiaClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGarantiaClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGarantiaClienteOrderBy.setViewportView(this.jTableDatosGarantiaClienteOrderBy);
			this.jTableDatosGarantiaClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGarantiaClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGarantiaCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGarantiaCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGarantiaCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGarantiaCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGarantiaCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGarantiaCliente.setTitle("Orden");
			this.jInternalFrameOrderByGarantiaCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGarantiaCliente.setResizable(true);
			this.jInternalFrameOrderByGarantiaCliente.setClosable(true);
			this.jInternalFrameOrderByGarantiaCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGarantiaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGarantiaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGarantiaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Garantia Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGarantiaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGarantiaCliente.ipady =150;
				
			this.jPanelOrderByGarantiaCliente.add(jScrollPanelDatosGarantiaClienteOrderBy, this.gridBagConstraintsGarantiaCliente);//this.jTableDatosGarantiaClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGarantiaCliente = new JButtonMe();
			this.jButtonCerrarOrderByGarantiaCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGarantiaCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGarantiaCliente.setToolTipText("Cancelar"+" "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGarantiaCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGarantiaCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGarantiaCliente.add(this.jButtonCerrarOrderByGarantiaCliente, this.gridBagConstraintsGarantiaCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGarantiaCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByGarantiaCliente= new JScrollPane(jPanelOrderByGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsGarantiaCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsGarantiaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsGarantiaCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGarantiaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGarantiaCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGarantiaCliente);
			
			this.jInternalFrameOrderByGarantiaCliente.getContentPane().add(this.jScrollPanelOrderByGarantiaCliente, this.gridBagConstraintsGarantiaCliente);			
		
		} else {
			this.jButtonAbrirOrderByGarantiaCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.garantiaclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGarantiaCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGarantiaCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGarantiaCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGarantiaCliente.getRowHeight();//GarantiaClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGarantiaCliente.isSelected()) {
					iHeightTable=GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGarantiaCliente.isSelected()) {
					iHeightTable=GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGarantiaCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGarantiaCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGarantiaCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGarantiaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGarantiaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGarantiaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGarantiaCliente!=null && this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGarantiaCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGarantiaCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGarantiaCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGarantiaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGarantiaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGarantiaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=garantiaclienteLogic.getGarantiaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=garantiaclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GarantiaCliente> TraerGarantiaClienteBeans(List<GarantiaCliente> garantiaclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(GarantiaCliente garantiacliente:garantiaclientes) {
					
				if(!(GarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					garantiacliente.setsDetalleGeneralEntityReporte(GarantiaClienteConstantesFunciones.getGarantiaClienteDescripcion(garantiacliente));
										
						
					
						
					
				} else  {
							
					//garantiacliente.setsDetalleGeneralEntityReporte(garantiacliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//garantiaclientebeans.add(garantiaclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return garantiaclientes;
    }
	//PARA REPORTES FIN
}
