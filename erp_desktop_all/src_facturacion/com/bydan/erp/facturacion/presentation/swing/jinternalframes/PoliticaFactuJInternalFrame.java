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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.facturacion.util.PoliticaFactuConstantesFunciones;

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
public class PoliticaFactuJInternalFrame extends PoliticaFactuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPoliticaFactu;
	
	protected JMenuBar jmenuBarPoliticaFactu;
	
	protected JMenu jmenuPoliticaFactu;
	protected JMenu jmenuDatosPoliticaFactu;
	protected JMenu jmenuArchivoPoliticaFactu;
	protected JMenu jmenuAccionesPoliticaFactu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticaFactu;	
	protected GridBagConstraints gridBagConstraintsPoliticaFactu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PoliticaFactuDetalleFormJInternalFrame jInternalFrameDetalleFormPoliticaFactu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPoliticaFactu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPoliticaFactu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";
	
	public PoliticaFactuSessionBean politicafactuSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PoliticaFactu> politicafactus;		
	public List<PoliticaFactu> politicafactusEliminados;	
	public List<PoliticaFactu> politicafactusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPoliticaFactu;		
	protected JButton jButtonAbrirOrderByPoliticaFactu;
	
	
	//protected JPanel jPanelOrderByPoliticaFactu;
	//public JScrollPane jScrollPanelOrderByPoliticaFactu;	
	//protected JButton jButtonCerrarOrderByPoliticaFactu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PoliticaFactuLogic politicafactuLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPoliticaFactu;
	public JScrollPane jScrollPanelDatosEdicionPoliticaFactu;
	public JScrollPane jScrollPanelDatosGeneralPoliticaFactu;
    
	
	
	//public JScrollPane jScrollPanelDatosPoliticaFactuOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPoliticaFactu;
	//public JScrollPane jScrollPanelImportacionPoliticaFactu;
	
	
	
	protected JPanel jPanelAccionesPoliticaFactu;
	
    protected JPanel jPanelPaginacionPoliticaFactu;
    protected JPanel jPanelParametrosReportesPoliticaFactu;
	protected JPanel jPanelParametrosReportesAccionesPoliticaFactu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PoliticaFactu;
	protected JPanel jPanelParametrosAuxiliar2PoliticaFactu;
	protected JPanel jPanelParametrosAuxiliar3PoliticaFactu;
	protected JPanel jPanelParametrosAuxiliar4PoliticaFactu;
	//protected JPanel jPanelParametrosAuxiliar5PoliticaFactu;
	
	
	
	//protected JPanel jPanelReporteDinamicoPoliticaFactu;
	//protected JPanel jPanelImportacionPoliticaFactu;
	
	
	public JTable jTableDatosPoliticaFactu;
	
	
	
	//public JTable jTableDatosPoliticaFactuOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPoliticaFactu;
	protected JButton jButtonDuplicarPoliticaFactu;
	protected JButton jButtonCopiarPoliticaFactu;
	protected JButton jButtonVerFormPoliticaFactu;
	protected JButton jButtonNuevoRelacionesPoliticaFactu;
	protected JButton jButtonModificarPoliticaFactu;
	
    protected JButton jButtonGuardarCambiosTablaPoliticaFactu;
	protected JButton jButtonCerrarPoliticaFactu;
	
	
	protected JButton jButtonRecargarInformacionPoliticaFactu;
	protected JButton jButtonProcesarInformacionPoliticaFactu;
	
	
	protected JButton jButtonAnterioresPoliticaFactu;
	protected JButton jButtonSiguientesPoliticaFactu;
	protected JButton jButtonNuevoGuardarCambiosPoliticaFactu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPoliticaFactu;
	//protected JButton jButtonCerrarReporteDinamicoPoliticaFactu;
	//protected JButton jButtonGenerarExcelReporteDinamicoPoliticaFactu;	
	
	
	
	//protected JButton jButtonAbrirImportacionPoliticaFactu;
	//protected JButton jButtonGenerarImportacionPoliticaFactu;
	//protected JButton jButtonCerrarImportacionPoliticaFactu;
	//protected JFileChooser jFileChooserImportacionPoliticaFactu;
	//protected File fileImportacionPoliticaFactu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticaFactu;
	protected JButton jButtonDuplicarToolBarPoliticaFactu;
	protected JButton jButtonNuevoRelacionesToolBarPoliticaFactu;
	
	
	public JButton jButtonGuardarCambiosToolBarPoliticaFactu;
	protected JButton jButtonCopiarToolBarPoliticaFactu;
	protected JButton jButtonVerFormToolBarPoliticaFactu;
	public JButton jButtonGuardarCambiosTablaToolBarPoliticaFactu;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticaFactu;
	protected JButton jButtonCerrarToolBarPoliticaFactu;
	
	protected JButton jButtonRecargarInformacionToolBarPoliticaFactu;
	protected JButton jButtonProcesarInformacionToolBarPoliticaFactu;
	protected JButton jButtonAnterioresToolBarPoliticaFactu;
	protected JButton jButtonSiguientesToolBarPoliticaFactu;
	protected JButton jButtonNuevoGuardarCambiosToolBarPoliticaFactu;
	protected JButton jButtonAbrirOrderByToolBarPoliticaFactu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticaFactu;
	protected JMenuItem jMenuItemDuplicarPoliticaFactu;
	protected JMenuItem jMenuItemNuevoRelacionesPoliticaFactu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPoliticaFactu;
	protected JMenuItem jMenuItemCopiarPoliticaFactu;
	protected JMenuItem jMenuItemVerFormPoliticaFactu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticaFactu;
	protected JMenuItem jMenuItemCerrarPoliticaFactu;
	protected JMenuItem jMenuItemDetalleCerrarPoliticaFactu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPoliticaFactu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticaFactu;
	
	protected JMenuItem jMenuItemRecargarInformacionPoliticaFactu;
	protected JMenuItem jMenuItemProcesarInformacionPoliticaFactu;
	protected JMenuItem jMenuItemAnterioresPoliticaFactu;
	protected JMenuItem jMenuItemSiguientesPoliticaFactu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticaFactu;
	protected JMenuItem jMenuItemAbrirOrderByPoliticaFactu;
	protected JMenuItem jMenuItemMostrarOcultarPoliticaFactu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticaFactu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPoliticaFactu;
	protected JCheckBox jCheckBoxSeleccionadosPoliticaFactu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPoliticaFactu;
	protected JCheckBox jCheckBoxConGraficoReportePoliticaFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPoliticaFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPoliticaFactu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticaFactu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPoliticaFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPoliticaFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPoliticaFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticaFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticaFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPoliticaFactu;
	protected JTextField jTextFieldValorCampoGeneralPoliticaFactu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePoliticaFactu;
	//public JList<Reporte> jListColumnasSelectReportePoliticaFactu;
	//public JScrollPane jScrollColumnasSelectReportePoliticaFactu;
	
	//public JLabel jLabelRelacionesSelectReportePoliticaFactu;
	//public JList<Reporte> jListRelacionesSelectReportePoliticaFactu;
	//public JScrollPane jScrollRelacionesSelectReportePoliticaFactu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPoliticaFactu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPoliticaFactu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPoliticaFactu;
	//public JLabel jLabelTiposArchivoReporteDinamicoPoliticaFactu;
	
		
	//public JLabel jLabelArchivoImportacionPoliticaFactu;	
	//public JLabel jLabelPathArchivoImportacionPoliticaFactu;
	//protected JTextField jTextFieldPathArchivoImportacionPoliticaFactu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPoliticaFactu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPoliticaFactu;
	
	//public JLabel jLabelColumnaCategoriaValorPoliticaFactu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPoliticaFactu;
	
	//public JLabel jLabelColumnasValoresGraficoPoliticaFactu;
	//public JList<Reporte> jListColumnasValoresGraficoPoliticaFactu;
	//public JScrollPane jScrollColumnasValoresGraficoPoliticaFactu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPoliticaFactu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPoliticaFactu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPoliticaFactu;
	public JPanel jPanelFK_IdGrupoClientePoliticaFactu;
	public JButton jButtonFK_IdGrupoClientePoliticaFactu;
	public JPanel jPanelFK_IdProductoPoliticaFactu;
	public JButton jButtonFK_IdProductoPoliticaFactu;
	
	public JPanel jPanelid_grupo_clienteFK_IdGrupoClientePoliticaFactu;
	public JLabel jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu;
	public JButton jButtonid_grupo_clienteFK_IdGrupoClientePoliticaFactu= new JButtonMe();
	public JButton jButtonid_grupo_clienteFK_IdGrupoClientePoliticaFactuUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteFK_IdGrupoClientePoliticaFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoPoliticaFactu;
	public JLabel jLabelid_productoFK_IdProductoPoliticaFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoPoliticaFactu;
	public JButton jButtonid_productoFK_IdProductoPoliticaFactu= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPoliticaFactuUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPoliticaFactuBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoPoliticaFactu;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=396;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PoliticaFactuJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPoliticaFactu)	{
		this.jButtonRecargarInformacionPoliticaFactu = jButtonRecargarInformacionPoliticaFactu;
	}
	
	public JButton getjButtonProcesarInformacionPoliticaFactu() {
		return this.jButtonProcesarInformacionPoliticaFactu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticaFactu)	{
		this.jButtonProcesarInformacionPoliticaFactu = jButtonProcesarInformacionPoliticaFactu;
	}
	
	
	public JButton getjButtonRecargarInformacionPoliticaFactu() {
		return this.jButtonRecargarInformacionPoliticaFactu;
	}
	
	
	public List<PoliticaFactu> getpoliticafactus() {
		return this.politicafactus;
	}

	public void setpoliticafactus(List<PoliticaFactu> politicafactus) {
		this.politicafactus = politicafactus;
	}
	
	public List<PoliticaFactu> getpoliticafactusAux() {
		return this.politicafactusAux;
	}

	public void setpoliticafactusAux(List<PoliticaFactu> politicafactusAux) {
		this.politicafactusAux = politicafactusAux;
	}
	
	public List<PoliticaFactu> getpoliticafactusEliminados() {
		return this.politicafactusEliminados;
	}

	public void setPoliticaFactusEliminados(List<PoliticaFactu> politicafactusEliminados) {
		this.politicafactusEliminados = politicafactusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPoliticaFactu() {
		return jComboBoxTiposSeleccionarPoliticaFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPoliticaFactu(
			JComboBox jComboBoxTiposSeleccionarPoliticaFactu) {
		this.jComboBoxTiposSeleccionarPoliticaFactu = jComboBoxTiposSeleccionarPoliticaFactu;
	}
	
	public void setBorderResaltarTiposSeleccionarPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPoliticaFactu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPoliticaFactu() {
		return jTextFieldValorCampoGeneralPoliticaFactu;
	}

	public void setjTextFieldValorCampoGeneralPoliticaFactu(
			JTextField jTextFieldValorCampoGeneralPoliticaFactu) {
		this.jTextFieldValorCampoGeneralPoliticaFactu = jTextFieldValorCampoGeneralPoliticaFactu;
	}

	public void setBorderResaltarValorCampoGeneralPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPoliticaFactu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPoliticaFactu() {
		return this.jCheckBoxSeleccionarTodosPoliticaFactu;
	}

	public void setjCheckBoxSeleccionarTodosPoliticaFactu(
			JCheckBox jCheckBoxSeleccionarTodosPoliticaFactu) {
		this.jCheckBoxSeleccionarTodosPoliticaFactu = jCheckBoxSeleccionarTodosPoliticaFactu;
	}

	public void setBorderResaltarSeleccionarTodosPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPoliticaFactu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPoliticaFactu() {
		return this.jCheckBoxSeleccionadosPoliticaFactu;
	}

	public void setjCheckBoxSeleccionadosPoliticaFactu(
			JCheckBox jCheckBoxSeleccionadosPoliticaFactu) {
		this.jCheckBoxSeleccionadosPoliticaFactu = jCheckBoxSeleccionadosPoliticaFactu;
	}
	
	public void setBorderResaltarSeleccionadosPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPoliticaFactu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPoliticaFactu() {
		return this.jComboBoxTiposArchivosReportesPoliticaFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPoliticaFactu(
			JComboBox jComboBoxTiposArchivosReportesPoliticaFactu) {
		this.jComboBoxTiposArchivosReportesPoliticaFactu = jComboBoxTiposArchivosReportesPoliticaFactu;
	}

	public void setBorderResaltarTiposArchivosReportesPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPoliticaFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPoliticaFactu() {
		return this.jComboBoxTiposReportesPoliticaFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPoliticaFactu(
			JComboBox jComboBoxTiposReportesPoliticaFactu) {
		this.jComboBoxTiposReportesPoliticaFactu = jComboBoxTiposReportesPoliticaFactu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPoliticaFactu() {
	//	return jComboBoxTiposReportesDinamicoPoliticaFactu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPoliticaFactu(
	//		JComboBox jComboBoxTiposReportesDinamicoPoliticaFactu) {
	//	this.jComboBoxTiposReportesDinamicoPoliticaFactu = jComboBoxTiposReportesDinamicoPoliticaFactu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPoliticaFactu() {
	//	return jComboBoxTiposArchivosReportesDinamicoPoliticaFactu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPoliticaFactu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticaFactu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu = jComboBoxTiposArchivosReportesDinamicoPoliticaFactu;
	//}
	
	public void setBorderResaltarTiposReportesPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPoliticaFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPoliticaFactu() {
		return this.jComboBoxTiposGraficosReportesPoliticaFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPoliticaFactu(
			JComboBox jComboBoxTiposGraficosReportesPoliticaFactu) {
		this.jComboBoxTiposGraficosReportesPoliticaFactu = jComboBoxTiposGraficosReportesPoliticaFactu;
	}
	
	public void setBorderResaltarTiposGraficosReportesPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPoliticaFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPoliticaFactu() {
		return this.jComboBoxTiposPaginacionPoliticaFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPoliticaFactu(
			JComboBox jComboBoxTiposPaginacionPoliticaFactu) {
		this.jComboBoxTiposPaginacionPoliticaFactu = jComboBoxTiposPaginacionPoliticaFactu;
	}
	
	public void setBorderResaltarTiposPaginacionPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPoliticaFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPoliticaFactu() {
		return this.jComboBoxTiposRelacionesPoliticaFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticaFactu() {
		return this.jComboBoxTiposAccionesPoliticaFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticaFactu(
			JComboBox jComboBoxTiposRelacionesPoliticaFactu) {
		this.jComboBoxTiposRelacionesPoliticaFactu = jComboBoxTiposRelacionesPoliticaFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticaFactu(
			JComboBox jComboBoxTiposAccionesPoliticaFactu) {
		this.jComboBoxTiposAccionesPoliticaFactu = jComboBoxTiposAccionesPoliticaFactu;
	}
	
	public void setBorderResaltarTiposRelacionesPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPoliticaFactu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPoliticaFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPoliticaFactu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPoliticaFactu() {
	//	return jCheckBoxConGraficoDinamicoPoliticaFactu;
	//}

	//public void setjCheckBoxConGraficoDinamicoPoliticaFactu(
	//		JCheckBox jCheckBoxConGraficoDinamicoPoliticaFactu) {
	//	this.jCheckBoxConGraficoDinamicoPoliticaFactu = jCheckBoxConGraficoDinamicoPoliticaFactu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPoliticaFactu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPoliticaFactu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPoliticaFactu .setBorder(borderResaltar);		
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
		this.politicafactuSessionBean=new PoliticaFactuSessionBean();
		
		this.politicafactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicafactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicafactuSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticaFactuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politica Factu MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
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
		
		PoliticaFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPoliticaFactu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"nuevo","nuevo","Nuevo"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"duplicar","duplicar","Duplicar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"copiar","copiar","Copiar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"ver_form","ver_form","Ver"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"recargar","recargar","Recargar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPoliticaFactu,this.jTtoolBarPoliticaFactu,
							"cerrar","cerrar","Salir"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPoliticaFactu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPoliticaFactu;
			
				this.jButtonProcesarInformacionToolBarPoliticaFactu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPoliticaFactu;
				
		//protected JButton jButtonModificarToolBarPoliticaFactu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPoliticaFactu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPoliticaFactu=new JMenuMe("General");
		this.jmenuArchivoPoliticaFactu=new JMenuMe("Archivo");
		this.jmenuAccionesPoliticaFactu=new JMenuMe("Acciones");
		this.jmenuDatosPoliticaFactu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticaFactu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticaFactu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticaFactu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPoliticaFactu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPoliticaFactu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPoliticaFactu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPoliticaFactu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPoliticaFactu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPoliticaFactu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPoliticaFactu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticaFactu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticaFactu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPoliticaFactu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPoliticaFactu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPoliticaFactu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPoliticaFactu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPoliticaFactu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPoliticaFactu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPoliticaFactu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPoliticaFactu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPoliticaFactu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticaFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticaFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticaFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPoliticaFactu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPoliticaFactu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPoliticaFactu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPoliticaFactu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPoliticaFactu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPoliticaFactu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPoliticaFactu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPoliticaFactu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPoliticaFactu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPoliticaFactu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPoliticaFactu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPoliticaFactu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPoliticaFactu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPoliticaFactu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPoliticaFactu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticaFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticaFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticaFactu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPoliticaFactu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPoliticaFactu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPoliticaFactu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticaFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticaFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticaFactu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPoliticaFactu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPoliticaFactu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPoliticaFactu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPoliticaFactu.add(this.jMenuItemCerrarPoliticaFactu);
			
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemNuevoPoliticaFactu);
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemNuevoGuardarCambiosPoliticaFactu);
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemNuevoRelacionesPoliticaFactu);
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemGuardarCambiosTablaPoliticaFactu);		
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemDuplicarPoliticaFactu);		
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemCopiarPoliticaFactu);		
			this.jmenuAccionesPoliticaFactu.add(this.jMenuItemVerFormPoliticaFactu);		
			
			this.jmenuDatosPoliticaFactu.add(this.jMenuItemRecargarInformacionPoliticaFactu);				
			this.jmenuDatosPoliticaFactu.add(this.jMenuItemAnterioresPoliticaFactu);				
			this.jmenuDatosPoliticaFactu.add(this.jMenuItemSiguientesPoliticaFactu);				
			this.jmenuDatosPoliticaFactu.add(this.jMenuItemAbrirOrderByPoliticaFactu);				
			this.jmenuDatosPoliticaFactu.add(this.jMenuItemMostrarOcultarPoliticaFactu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPoliticaFactu.add(this.jMenuItemGuardarCambiosPoliticaFactu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPoliticaFactu.add(this.jmenuArchivoPoliticaFactu);		
			this.jmenuBarPoliticaFactu.add(this.jmenuAccionesPoliticaFactu);		
			this.jmenuBarPoliticaFactu.add(this.jmenuDatosPoliticaFactu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPoliticaFactu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPoliticaFactu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdGrupoClientePoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoClientePoliticaFactu.setToolTipText("Buscar Por Grupo Cliente ");
		this.jButtonFK_IdGrupoClientePoliticaFactu= new JButtonMe();
		this.jButtonFK_IdGrupoClientePoliticaFactu.setText("Buscar");
		this.jButtonFK_IdGrupoClientePoliticaFactu.setToolTipText("Buscar Por Grupo Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoClientePoliticaFactu,"buscar_button","Buscar Por Grupo Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoClientePoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu = new JLabelMe();
		jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setText("Grupo Cliente :");
		jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu= new JComboBoxMe();
		jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoPoliticaFactu.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoPoliticaFactu= new JButtonMe();
		this.jButtonFK_IdProductoPoliticaFactu.setText("Buscar");
		this.jButtonFK_IdProductoPoliticaFactu.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoPoliticaFactu,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoPoliticaFactu = new JLabelMe();
		jLabelid_productoFK_IdProductoPoliticaFactu.setText("Producto :");
		jLabelid_productoFK_IdProductoPoliticaFactu.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoPoliticaFactu= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu.setFocusable(false);


		this.jTabbedPaneBusquedasPoliticaFactu=new JTabbedPane();


		this.jTabbedPaneBusquedasPoliticaFactu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticaFactu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticaFactu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPoliticaFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPoliticaFactu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePoliticaFactu = new PoliticaFactuDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Politica Factu DATOS");
			this.jInternalFrameDetalleFormPoliticaFactu = new PoliticaFactuDetalleFormJInternalFrame(jDesktopPane,this.politicafactuSessionBean.getConGuardarRelaciones(),this.politicafactuSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPoliticaFactu = null;//new PoliticaFactuDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticaFactu= new GridBagLayout();
		
		
		this.jTableDatosPoliticaFactu = new JTableMe();      
		
		String sToolTipPoliticaFactu="";
		sToolTipPoliticaFactu=PoliticaFactuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticaFactu+="(Facturacion.PoliticaFactu)";
		}
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticaFactu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPoliticaFactu.setToolTipText(sToolTipPoliticaFactu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPoliticaFactu);
		this.jTableDatosPoliticaFactu.setAutoCreateRowSorter(true);
		this.jTableDatosPoliticaFactu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPoliticaFactu.setRowSelectionAllowed(true);
		this.jTableDatosPoliticaFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPoliticaFactu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPoliticaFactu = new JButtonMe();
		this.jButtonDuplicarPoliticaFactu = new JButtonMe();
		this.jButtonCopiarPoliticaFactu = new JButtonMe();
		this.jButtonVerFormPoliticaFactu = new JButtonMe();
		this.jButtonNuevoRelacionesPoliticaFactu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPoliticaFactu = new JButtonMe();
		this.jButtonCerrarPoliticaFactu = new JButtonMe();
		
		this.jScrollPanelDatosPoliticaFactu = new JScrollPane();   
        this.jScrollPanelDatosGeneralPoliticaFactu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Politica Factu";
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Factus" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticaFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticaFactu.setToolTipText("Acciones");
        this.jPanelAccionesPoliticaFactu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPoliticaFactu=new ReporteDinamicoJInternalFrame(PoliticaFactuConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPoliticaFactu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPoliticaFactu=new ImportacionJInternalFrame(PoliticaFactuConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPoliticaFactu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPoliticaFactu = new JButtonMe();
		
		this.jButtonAbrirOrderByPoliticaFactu.setText("Orden");
		this.jButtonAbrirOrderByPoliticaFactu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticaFactu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticaFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaFactu,false,this);
			
			//this.cargarOrderByPoliticaFactu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticaFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaFactu,true,this);
			
			//this.cargarOrderByPoliticaFactu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPoliticaFactu.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosPoliticaFactu.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosPoliticaFactu.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosPoliticaFactu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticaFactu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticaFactu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPoliticaFactu.setText("Nuevo");
		this.jButtonDuplicarPoliticaFactu.setText("Duplicar");
		this.jButtonCopiarPoliticaFactu.setText("Copiar");
		this.jButtonVerFormPoliticaFactu.setText("Ver");
		this.jButtonNuevoRelacionesPoliticaFactu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.setText("Guardar");
		this.jButtonCerrarPoliticaFactu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticaFactu,"nuevo_button","Nuevo",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPoliticaFactu,"duplicar_button","Duplicar",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPoliticaFactu,"copiar_button","Copiar",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPoliticaFactu,"ver_form","Ver",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPoliticaFactu,"nuevorelaciones_button","Nuevo Rel",this.politicafactuSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticaFactu,"guardarcambiostabla_button","Guardar",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticaFactu,"cerrar_button","Salir",this.politicafactuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPoliticaFactu.setToolTipText("Nuevo"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPoliticaFactu.setToolTipText("Duplicar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPoliticaFactu.setToolTipText("Copiar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPoliticaFactu.setToolTipText("Ver"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPoliticaFactu.setToolTipText("Nuevo Rel"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.setToolTipText("Guardar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticaFactu.setToolTipText("Salir"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticaFactu";
		inputMap = this.jButtonNuevoPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticaFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticaFactu"));
		
		//DUPLICAR
		sMapKey = "DuplicarPoliticaFactu";
		inputMap = this.jButtonDuplicarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPoliticaFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPoliticaFactu"));
		
		//COPIAR
		sMapKey = "CopiarPoliticaFactu";
		inputMap = this.jButtonCopiarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPoliticaFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPoliticaFactu"));
		
		//VEr FORM
		sMapKey = "VerFormPoliticaFactu";
		inputMap = this.jButtonVerFormPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPoliticaFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPoliticaFactu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPoliticaFactu";
		inputMap = this.jButtonNuevoRelacionesPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPoliticaFactu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPoliticaFactu";
		inputMap = this.jButtonModificarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPoliticaFactu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPoliticaFactu";
		inputMap = this.jButtonCerrarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticaFactu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticaFactu";
		inputMap = this.jButtonGuardarCambiosTablaPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticaFactu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PoliticaFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PoliticaFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PoliticaFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PoliticaFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PoliticaFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPoliticaFactu.setName("jPanelParametrosReportesPoliticaFactu"); 
		
		this.jPanelParametrosReportesAccionesPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPoliticaFactu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPoliticaFactu.setName("jPanelParametrosReportesAccionesPoliticaFactu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPoliticaFactu = new JButtonMe();
		this.jButtonRecargarInformacionPoliticaFactu.setText("Recargar");
		this.jButtonRecargarInformacionPoliticaFactu.setToolTipText("Recargar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPoliticaFactu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPoliticaFactu = new JButtonMe();
		this.jButtonProcesarInformacionPoliticaFactu.setText("Procesar");
		this.jButtonProcesarInformacionPoliticaFactu.setToolTipText("Procesar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPoliticaFactu.setVisible(false);
			
		this.jButtonProcesarInformacionPoliticaFactu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticaFactu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticaFactu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaFactu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPoliticaFactu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaFactu.setText("TIPO");       
		this.jComboBoxTiposReportesPoliticaFactu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaFactu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPoliticaFactu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPoliticaFactu.setText("Paginacion");
		this.jComboBoxTiposPaginacionPoliticaFactu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPoliticaFactu.setText("Accion");
		this.jComboBoxTiposRelacionesPoliticaFactu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticaFactu.setText("Accion");
		this.jComboBoxTiposAccionesPoliticaFactu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPoliticaFactu.setText("Accion");
		this.jComboBoxTiposSeleccionarPoliticaFactu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPoliticaFactu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPoliticaFactu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticaFactu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticaFactu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPoliticaFactu = new JLabelMe();
		
		this.jLabelAccionesPoliticaFactu.setText("Acciones");		
		this.jLabelAccionesPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPoliticaFactu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPoliticaFactu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPoliticaFactu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPoliticaFactu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPoliticaFactu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPoliticaFactu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPoliticaFactu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPoliticaFactu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPoliticaFactu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePoliticaFactu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePoliticaFactu.setText("Graf.");
		this.jCheckBoxConGraficoReportePoliticaFactu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPoliticaFactu = new JButtonMe();
		//this.jButtonAnterioresPoliticaFactu.setText("<<");
        this.jButtonAnterioresPoliticaFactu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPoliticaFactu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPoliticaFactu = new JButtonMe();
		//this.jButtonSiguientesPoliticaFactu.setText(">>");
        this.jButtonSiguientesPoliticaFactu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPoliticaFactu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPoliticaFactu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPoliticaFactu.setText("Nue");
        this.jButtonNuevoGuardarCambiosPoliticaFactu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPoliticaFactu,"nuevoguardarcambios_button","Nue",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPoliticaFactu";
		inputMap = this.jButtonNuevoGuardarCambiosPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPoliticaFactu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPoliticaFactu";
		inputMap = this.jButtonRecargarInformacionPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPoliticaFactu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPoliticaFactu";
		inputMap = this.jButtonSiguientesPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPoliticaFactu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPoliticaFactu";
		inputMap = this.jButtonAnterioresPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPoliticaFactu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPoliticaFactu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPoliticaFactu.setMinimumSize(new Dimension(this.getWidth(),PoliticaFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaFactuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticaFactu.setMaximumSize(new Dimension(this.getWidth(),PoliticaFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaFactuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticaFactu.setPreferredSize(new Dimension(this.getWidth(),PoliticaFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaFactuBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPoliticaFactu = new GridBagLayout();

			this.jPanelPaginacionPoliticaFactu.setLayout(gridaBagLayoutPaginacionPoliticaFactu);						
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 0;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonAnterioresPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
					
						
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticaFactu.gridy = 0;
			
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonNuevoGuardarCambiosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
						
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticaFactu.gridy = 0;
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonSiguientesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 1;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonNuevoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
						
			
			
			if(!this.politicafactuSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
				this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPoliticaFactu.gridy = 1;
				this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPoliticaFactu.add(this.jButtonGuardarCambiosTablaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			}
			
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 1;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonDuplicarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 1;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonCopiarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 1;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonVerFormPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 1;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPoliticaFactu.add(this.jButtonCerrarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		
		this.jButtonRecargarInformacionPoliticaFactu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticaFactu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticaFactu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPoliticaFactu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticaFactu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticaFactu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPoliticaFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticaFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticaFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPoliticaFactu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticaFactu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticaFactu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPoliticaFactu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticaFactu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticaFactu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPoliticaFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticaFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticaFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPoliticaFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPoliticaFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticaFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticaFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPoliticaFactu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticaFactu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticaFactu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePoliticaFactu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticaFactu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticaFactu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPoliticaFactu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticaFactu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticaFactu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPoliticaFactu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticaFactu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticaFactu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPoliticaFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPoliticaFactu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PoliticaFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PoliticaFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PoliticaFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PoliticaFactu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPoliticaFactu.setLayout(gridaBagParametrosReportesPoliticaFactu);
			this.jPanelParametrosReportesAccionesPoliticaFactu.setLayout(gridaBagParametrosReportesAccionesPoliticaFactu);
			
			
			this.jPanelParametrosAuxiliar1PoliticaFactu.setLayout(gridaBagParametrosAuxiliar1PoliticaFactu);
			this.jPanelParametrosAuxiliar2PoliticaFactu.setLayout(gridaBagParametrosAuxiliar2PoliticaFactu);
			this.jPanelParametrosAuxiliar3PoliticaFactu.setLayout(gridaBagParametrosAuxiliar3PoliticaFactu);
			this.jPanelParametrosAuxiliar4PoliticaFactu.setLayout(gridaBagParametrosAuxiliar4PoliticaFactu);
			//this.jPanelParametrosAuxiliar5PoliticaFactu.setLayout(gridaBagParametrosAuxiliar2PoliticaFactu);			
			
			
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaFactu.add(this.jButtonRecargarInformacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaFactu.add(this.jComboBoxTiposPaginacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaFactu.add(this.jCheckBoxConAltoMaximoTablaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaFactu.add(this.jComboBoxTiposArchivosReportesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaFactu.add(this.jPanelParametrosAuxiliar1PoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PoliticaFactu.add(this.jComboBoxTiposReportesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);																		
			
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PoliticaFactu.add(this.jComboBoxTiposGraficosReportesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaFactu.add(this.jPanelParametrosAuxiliar4PoliticaFactu, this.gridBagConstraintsPoliticaFactu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaFactu.add(this.jComboBoxTiposReportesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaFactu.add(this.jCheckBoxGenerarReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaFactu.add(this.jPanelParametrosAuxiliar2PoliticaFactu, this.gridBagConstraintsPoliticaFactu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaFactu.add(this.jLabelAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
				this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPoliticaFactu.add(this.jButtonAbrirOrderByPoliticaFactu, this.gridBagConstraintsPoliticaFactu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaFactu.add(this.jComboBoxTiposSeleccionarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
			
			
			/*
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaFactu.add(this.jCheckBoxSeleccionarTodosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaFactu.add(this.jCheckBoxConGraficoReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaFactu.add(this.jCheckBoxSeleccionarTodosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);															
				
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaFactu.add(this.jCheckBoxSeleccionadosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);															
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaFactu.add(this.jCheckBoxConGraficoReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaFactu.add(this.jPanelParametrosAuxiliar3PoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaFactu.add(this.jComboBoxTiposAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
	
				
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaFactu.add(this.jTextFieldValorCampoGeneralPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPoliticaFactu = new GridBagLayout();

			this.jScrollPanelDatosPoliticaFactu.setLayout(gridaBagLayoutDatosPoliticaFactu);
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = 0;
			this.gridBagConstraintsPoliticaFactu.gridx = 0;
			
			this.jScrollPanelDatosPoliticaFactu.add(this.jTableDatosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPoliticaFactu.setViewportView(this.jTableDatosPoliticaFactu);
		this.jTableDatosPoliticaFactu.setFillsViewportHeight(true);
		this.jTableDatosPoliticaFactu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPoliticaFactu= new GridBagLayout();
		this.jPanelAccionesPoliticaFactu.setLayout(gridaBagLayoutAccionesPoliticaFactu);
		
		
		/*	
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
			
		this.jPanelAccionesPoliticaFactu.add(this.jButtonNuevoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdGrupoClientePoliticaFactu= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoClientePoliticaFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoClientePoliticaFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoClientePoliticaFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoClientePoliticaFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoClientePoliticaFactu.setLayout(gridaBagLayoutFK_IdGrupoClientePoliticaFactu);

		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaFactu.gridy = 0;
		gridBagConstraintsPoliticaFactu.gridx = 0;
		jPanelFK_IdGrupoClientePoliticaFactu.add(jLabelid_grupo_clienteFK_IdGrupoClientePoliticaFactu, gridBagConstraintsPoliticaFactu);

		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaFactu.gridy = 0;
		gridBagConstraintsPoliticaFactu.gridx = 1;
		jPanelFK_IdGrupoClientePoliticaFactu.add(jComboBoxid_grupo_clienteFK_IdGrupoClientePoliticaFactu, gridBagConstraintsPoliticaFactu);

		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaFactu.gridy = 1;
		gridBagConstraintsPoliticaFactu.gridx =1;
		jPanelFK_IdGrupoClientePoliticaFactu.add(jButtonFK_IdGrupoClientePoliticaFactu, gridBagConstraintsPoliticaFactu);

		jTabbedPaneBusquedasPoliticaFactu.addTab("1.-Por Grupo Cliente ", jPanelFK_IdGrupoClientePoliticaFactu);
		jTabbedPaneBusquedasPoliticaFactu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoPoliticaFactu= new GridBagLayout();
		gridaBagLayoutFK_IdProductoPoliticaFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoPoliticaFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoPoliticaFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoPoliticaFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoPoliticaFactu.setLayout(gridaBagLayoutFK_IdProductoPoliticaFactu);

		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaFactu.gridy = 0;
		gridBagConstraintsPoliticaFactu.gridx = 0;
		jPanelFK_IdProductoPoliticaFactu.add(jLabelid_productoFK_IdProductoPoliticaFactu, gridBagConstraintsPoliticaFactu);

		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaFactu.gridy = 0;
		gridBagConstraintsPoliticaFactu.gridx = 1;
		jPanelFK_IdProductoPoliticaFactu.add(jComboBoxid_productoFK_IdProductoPoliticaFactu, gridBagConstraintsPoliticaFactu);


		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
		gridBagConstraintsPoliticaFactu.gridy = 0;
		gridBagConstraintsPoliticaFactu.gridx = 0;
		jPanelFK_IdProductoPoliticaFactu.add(this.jButtonBuscarFK_IdProductoid_productoPoliticaFactu, gridBagConstraintsPoliticaFactu);

		gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaFactu.gridy = 1;
		gridBagConstraintsPoliticaFactu.gridx =1;
		jPanelFK_IdProductoPoliticaFactu.add(jButtonFK_IdProductoPoliticaFactu, gridBagConstraintsPoliticaFactu);

		jTabbedPaneBusquedasPoliticaFactu.addTab("2.-Por Producto ", jPanelFK_IdProductoPoliticaFactu);
		jTabbedPaneBusquedasPoliticaFactu.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticaFactu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticaFactu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();						
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaFactu.gridx = 0;		
			//this.gridBagConstraintsPoliticaFactu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticaFactu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPoliticaFactu.gridx = 0;		
		//this.gridBagConstraintsPoliticaFactu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPoliticaFactu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPoliticaFactu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaFactu.gridx = 0;		
			this.gridBagConstraintsPoliticaFactu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPoliticaFactu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPoliticaFactu, this.gridBagConstraintsPoliticaFactu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);								
		
		
		/*
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		*/		
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticaFactu.gridx =0;
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticaFactu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
				
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPoliticaFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticaFactu = new GridBagLayout();
			this.jPanelBusquedasParametrosPoliticaFactu.setLayout(gridaBagLayoutBusquedasParametrosPoliticaFactu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPoliticaFactu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticaFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPoliticaFactu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPoliticaFactu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPoliticaFactu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPoliticaFactu.setName("jPanelReporteDinamicoPoliticaFactu"); 
		
		this.jPanelReporteDinamicoPoliticaFactu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticaFactu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticaFactu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPoliticaFactu.setLayout(gridaBagLayoutReporteDinamicoPoliticaFactu);
		
		
		this.jInternalFrameReporteDinamicoPoliticaFactu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPoliticaFactu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticaFactu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPoliticaFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPoliticaFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPoliticaFactu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPoliticaFactu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPoliticaFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPoliticaFactu.setResizable(true);
	    this.jInternalFrameReporteDinamicoPoliticaFactu.setClosable(true);
	    this.jInternalFrameReporteDinamicoPoliticaFactu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPoliticaFactu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticaFactu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticaFactu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Factus"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePoliticaFactu = new JLabelMe();

		this.jLabelColumnasSelectReportePoliticaFactu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelColumnasSelectReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePoliticaFactu = new JList<Reporte>();
		this.jListColumnasSelectReportePoliticaFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePoliticaFactu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePoliticaFactu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticaFactu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticaFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePoliticaFactu=new JScrollPane(this.jListColumnasSelectReportePoliticaFactu);
			
			this.jScrollColumnasSelectReportePoliticaFactu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticaFactu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticaFactu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPoliticaFactu.add(this.jListColumnasSelectReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jScrollColumnasSelectReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePoliticaFactu = new JLabelMe();

		this.jLabelRelacionesSelectReportePoliticaFactu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePoliticaFactu = new JList<Reporte>();
		this.jListRelacionesSelectReportePoliticaFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePoliticaFactu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePoliticaFactu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticaFactu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticaFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePoliticaFactu=new JScrollPane(this.jListRelacionesSelectReportePoliticaFactu);
			
			this.jScrollRelacionesSelectReportePoliticaFactu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticaFactu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticaFactu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPoliticaFactu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPoliticaFactu = new JComboBoxMe();
		this.jListColumnasValoresGraficoPoliticaFactu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPoliticaFactu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPoliticaFactu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPoliticaFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticaFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticaFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPoliticaFactu = new JLabelMe();

		this.jLabelConGraficoDinamicoPoliticaFactu.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelConGraficoDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPoliticaFactu = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPoliticaFactu.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPoliticaFactu.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPoliticaFactu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPoliticaFactu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPoliticaFactu.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jCheckBoxConGraficoDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPoliticaFactu = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPoliticaFactu.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelColumnaCategoriaGraficoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPoliticaFactu.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPoliticaFactu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPoliticaFactu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPoliticaFactu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPoliticaFactu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jComboBoxColumnaCategoriaGraficoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPoliticaFactu = new JLabelMe();

		this.jLabelColumnaCategoriaValorPoliticaFactu.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelColumnaCategoriaValorPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPoliticaFactu.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPoliticaFactu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPoliticaFactu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPoliticaFactu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPoliticaFactu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jComboBoxColumnaCategoriaValorPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPoliticaFactu = new JLabelMe();

		this.jLabelColumnasValoresGraficoPoliticaFactu.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelColumnasValoresGraficoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPoliticaFactu = new JList<Reporte>();
		this.jListColumnasValoresGraficoPoliticaFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPoliticaFactu.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPoliticaFactu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPoliticaFactu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPoliticaFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPoliticaFactu=new JScrollPane(this.jListColumnasValoresGraficoPoliticaFactu);
			
			this.jScrollColumnasValoresGraficoPoliticaFactu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPoliticaFactu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPoliticaFactu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPoliticaFactu.add(this.jListColumnasSelectReportePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jScrollColumnasValoresGraficoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPoliticaFactu = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPoliticaFactu.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelTiposGraficosReportesDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPoliticaFactu.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPoliticaFactu.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPoliticaFactu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPoliticaFactu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPoliticaFactu.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jComboBoxTiposGraficosReportesDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPoliticaFactu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPoliticaFactu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelGenerarExcelReporteDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPoliticaFactu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPoliticaFactu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPoliticaFactu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPoliticaFactu.setToolTipText("Generar EXCEL"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPoliticaFactu.add(this.jButtonGenerarExcelReporteDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jComboBoxTiposReportesDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPoliticaFactu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPoliticaFactu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jLabelTiposArchivoReporteDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jComboBoxTiposArchivosReportesDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPoliticaFactu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPoliticaFactu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPoliticaFactu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPoliticaFactu.setToolTipText("Generar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jButtonGenerarReporteDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPoliticaFactu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPoliticaFactu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPoliticaFactu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPoliticaFactu.setToolTipText("Cancelar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaFactu.add(this.jButtonCerrarReporteDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPoliticaFactu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPoliticaFactu= new JScrollPane(jPanelReporteDinamicoPoliticaFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPoliticaFactu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticaFactu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticaFactu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Factus"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaFactu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPoliticaFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPoliticaFactu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPoliticaFactu);
		this.jInternalFrameReporteDinamicoPoliticaFactu.getContentPane().add(this.jScrollPanelReporteDinamicoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPoliticaFactu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPoliticaFactu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPoliticaFactu.setName("jPanelImportacionPoliticaFactu"); 
		
		this.jPanelImportacionPoliticaFactu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticaFactu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticaFactu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPoliticaFactu.setLayout(gridaBagLayoutImportacionPoliticaFactu);
		
		
		this.jInternalFrameImportacionPoliticaFactu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPoliticaFactu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPoliticaFactu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticaFactu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPoliticaFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticaFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticaFactu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPoliticaFactu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticaFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticaFactu.setResizable(true);
	    this.jInternalFrameImportacionPoliticaFactu.setClosable(true);
	    this.jInternalFrameImportacionPoliticaFactu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPoliticaFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticaFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticaFactu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPoliticaFactu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticaFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticaFactu.setResizable(true);
	    this.jInternalFrameImportacionPoliticaFactu.setClosable(true);
	    this.jInternalFrameImportacionPoliticaFactu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPoliticaFactu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticaFactu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticaFactu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Factus"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPoliticaFactu = new JLabelMe();

		this.jLabelArchivoImportacionPoliticaFactu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticaFactu.add(this.jLabelArchivoImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPoliticaFactu = new JFileChooser();		
		this.jFileChooserImportacionPoliticaFactu.setToolTipText("ESCOGER ARCHIVO"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPoliticaFactu = new JButtonMe();
		this.jButtonAbrirImportacionPoliticaFactu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPoliticaFactu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPoliticaFactu.setToolTipText("Generar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaFactu.add(this.jButtonAbrirImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPoliticaFactu = new JLabelMe();

		this.jLabelPathArchivoImportacionPoliticaFactu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticaFactu.add(this.jLabelPathArchivoImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPoliticaFactu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPoliticaFactu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticaFactu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticaFactu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaFactu.add(this.jTextFieldPathArchivoImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPoliticaFactu = new JButtonMe();
		this.jButtonGenerarImportacionPoliticaFactu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPoliticaFactu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPoliticaFactu.setToolTipText("Generar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaFactu.add(this.jButtonGenerarImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPoliticaFactu = new JButtonMe();
		this.jButtonCerrarImportacionPoliticaFactu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPoliticaFactu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPoliticaFactu.setToolTipText("Cancelar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaFactu.add(this.jButtonCerrarImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPoliticaFactu = new GridBagLayout();
		
		this.jScrollPanelImportacionPoliticaFactu= new JScrollPane(jPanelImportacionPoliticaFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy =iPosYImportacion;
		this.gridBagConstraintsPoliticaFactu.gridx =iPosXImportacion;
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPoliticaFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPoliticaFactu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPoliticaFactu);
		this.jInternalFrameImportacionPoliticaFactu.getContentPane().add(this.jScrollPanelImportacionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPoliticaFactu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPoliticaFactu = new JButtonMe();
			this.jButtonAbrirOrderByPoliticaFactu.setText("Orden");
			this.jButtonAbrirOrderByPoliticaFactu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticaFactu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPoliticaFactu";
			inputMap = this.jButtonAbrirOrderByPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPoliticaFactu"));
		
		
			GridBagLayout gridaBagLayoutOrderByPoliticaFactu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPoliticaFactu.setName("jPanelOrderByPoliticaFactu"); 
			
			this.jPanelOrderByPoliticaFactu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticaFactu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticaFactu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPoliticaFactu.setLayout(gridaBagLayoutOrderByPoliticaFactu);
			
			
			this.jTableDatosPoliticaFactuOrderBy = new JTableMe();        
			this.jTableDatosPoliticaFactuOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPoliticaFactuOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPoliticaFactuOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPoliticaFactuOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPoliticaFactuOrderBy.setViewportView(this.jTableDatosPoliticaFactuOrderBy);
			this.jTableDatosPoliticaFactuOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPoliticaFactuOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPoliticaFactu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPoliticaFactu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPoliticaFactu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePoliticaFactu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPoliticaFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPoliticaFactu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPoliticaFactu.setTitle("Orden");
			this.jInternalFrameOrderByPoliticaFactu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPoliticaFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPoliticaFactu.setResizable(true);
			this.jInternalFrameOrderByPoliticaFactu.setClosable(true);
			this.jInternalFrameOrderByPoliticaFactu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPoliticaFactu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticaFactu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticaFactu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Factus"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPoliticaFactu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPoliticaFactu.ipady =150;
				
			this.jPanelOrderByPoliticaFactu.add(jScrollPanelDatosPoliticaFactuOrderBy, this.gridBagConstraintsPoliticaFactu);//this.jTableDatosPoliticaFactuTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPoliticaFactu = new JButtonMe();
			this.jButtonCerrarOrderByPoliticaFactu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPoliticaFactu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPoliticaFactu.setToolTipText("Cancelar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPoliticaFactu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPoliticaFactu.add(this.jButtonCerrarOrderByPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPoliticaFactu = new GridBagLayout();
			
			this.jScrollPanelOrderByPoliticaFactu= new JScrollPane(jPanelOrderByPoliticaFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy =iPosYOrderBy;
			this.gridBagConstraintsPoliticaFactu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPoliticaFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPoliticaFactu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPoliticaFactu);
			
			this.jInternalFrameOrderByPoliticaFactu.getContentPane().add(this.jScrollPanelOrderByPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
		
		} else {
			this.jButtonAbrirOrderByPoliticaFactu = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.politicafactuSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPoliticaFactu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPoliticaFactu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPoliticaFactu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPoliticaFactu.getRowHeight();//PoliticaFactuConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticaFactu.isSelected()) {
					iHeightTable=PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticaFactu.isSelected()) {
					iHeightTable=PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticaFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPoliticaFactu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticaFactu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticaFactu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPoliticaFactu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticaFactu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticaFactu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPoliticaFactu!=null && this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy()!=null) {
			//if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPoliticaFactu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPoliticaFactu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPoliticaFactu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPoliticaFactu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPoliticaFactu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticaFactu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticaFactu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=politicafactuLogic.getPoliticaFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicafactus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PoliticaFactu> TraerPoliticaFactuBeans(List<PoliticaFactu> politicafactus,ArrayList<Classe> classes)throws Exception {
		try {
			for(PoliticaFactu politicafactu:politicafactus) {
					
				if(!(PoliticaFactuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PoliticaFactuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					politicafactu.setsDetalleGeneralEntityReporte(PoliticaFactuConstantesFunciones.getPoliticaFactuDescripcion(politicafactu));
										
					politicafactu.setcon_banco_cliente_descripcion(PoliticaFactuConstantesFunciones.getcon_banco_clienteDescripcion(politicafactu));politicafactu.setcon_banco_producto_descripcion(PoliticaFactuConstantesFunciones.getcon_banco_productoDescripcion(politicafactu));politicafactu.setes_activo_descripcion(PoliticaFactuConstantesFunciones.getes_activoDescripcion(politicafactu));	
					
						
					
				} else  {
							
					//politicafactu.setsDetalleGeneralEntityReporte(politicafactu.getsDetalleGeneralEntityReporte());
										
				}
				
				//politicafactubeans.add(politicafactubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return politicafactus;
    }
	//PARA REPORTES FIN
}
