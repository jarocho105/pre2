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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DescuentoMontoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DescuentoMontoJInternalFrame extends DescuentoMontoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDescuentoMonto;
	
	protected JMenuBar jmenuBarDescuentoMonto;
	
	protected JMenu jmenuDescuentoMonto;
	protected JMenu jmenuDatosDescuentoMonto;
	protected JMenu jmenuArchivoDescuentoMonto;
	protected JMenu jmenuAccionesDescuentoMonto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDescuentoMonto;	
	protected GridBagConstraints gridBagConstraintsDescuentoMonto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DescuentoMontoDetalleFormJInternalFrame jInternalFrameDetalleFormDescuentoMonto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDescuentoMonto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDescuentoMonto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";
	
	public DescuentoMontoSessionBean descuentomontoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DescuentoMonto> descuentomontos;		
	public List<DescuentoMonto> descuentomontosEliminados;	
	public List<DescuentoMonto> descuentomontosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDescuentoMonto;		
	protected JButton jButtonAbrirOrderByDescuentoMonto;
	
	
	//protected JPanel jPanelOrderByDescuentoMonto;
	//public JScrollPane jScrollPanelOrderByDescuentoMonto;	
	//protected JButton jButtonCerrarOrderByDescuentoMonto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DescuentoMontoLogic descuentomontoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDescuentoMonto;
	public JScrollPane jScrollPanelDatosEdicionDescuentoMonto;
	public JScrollPane jScrollPanelDatosGeneralDescuentoMonto;
    
	
	
	//public JScrollPane jScrollPanelDatosDescuentoMontoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDescuentoMonto;
	//public JScrollPane jScrollPanelImportacionDescuentoMonto;
	
	
	
	protected JPanel jPanelAccionesDescuentoMonto;
	
    protected JPanel jPanelPaginacionDescuentoMonto;
    protected JPanel jPanelParametrosReportesDescuentoMonto;
	protected JPanel jPanelParametrosReportesAccionesDescuentoMonto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DescuentoMonto;
	protected JPanel jPanelParametrosAuxiliar2DescuentoMonto;
	protected JPanel jPanelParametrosAuxiliar3DescuentoMonto;
	protected JPanel jPanelParametrosAuxiliar4DescuentoMonto;
	//protected JPanel jPanelParametrosAuxiliar5DescuentoMonto;
	
	
	
	//protected JPanel jPanelReporteDinamicoDescuentoMonto;
	//protected JPanel jPanelImportacionDescuentoMonto;
	
	
	public JTable jTableDatosDescuentoMonto;
	
	
	
	//public JTable jTableDatosDescuentoMontoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDescuentoMonto;
	protected JButton jButtonDuplicarDescuentoMonto;
	protected JButton jButtonCopiarDescuentoMonto;
	protected JButton jButtonVerFormDescuentoMonto;
	protected JButton jButtonNuevoRelacionesDescuentoMonto;
	protected JButton jButtonModificarDescuentoMonto;
	
    protected JButton jButtonGuardarCambiosTablaDescuentoMonto;
	protected JButton jButtonCerrarDescuentoMonto;
	
	
	protected JButton jButtonRecargarInformacionDescuentoMonto;
	protected JButton jButtonProcesarInformacionDescuentoMonto;
	
	
	protected JButton jButtonAnterioresDescuentoMonto;
	protected JButton jButtonSiguientesDescuentoMonto;
	protected JButton jButtonNuevoGuardarCambiosDescuentoMonto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDescuentoMonto;
	//protected JButton jButtonCerrarReporteDinamicoDescuentoMonto;
	//protected JButton jButtonGenerarExcelReporteDinamicoDescuentoMonto;	
	
	
	
	//protected JButton jButtonAbrirImportacionDescuentoMonto;
	//protected JButton jButtonGenerarImportacionDescuentoMonto;
	//protected JButton jButtonCerrarImportacionDescuentoMonto;
	//protected JFileChooser jFileChooserImportacionDescuentoMonto;
	//protected File fileImportacionDescuentoMonto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDescuentoMonto;
	protected JButton jButtonDuplicarToolBarDescuentoMonto;
	protected JButton jButtonNuevoRelacionesToolBarDescuentoMonto;
	
	
	public JButton jButtonGuardarCambiosToolBarDescuentoMonto;
	protected JButton jButtonCopiarToolBarDescuentoMonto;
	protected JButton jButtonVerFormToolBarDescuentoMonto;
	public JButton jButtonGuardarCambiosTablaToolBarDescuentoMonto;
	protected JButton jButtonMostrarOcultarTablaToolBarDescuentoMonto;
	protected JButton jButtonCerrarToolBarDescuentoMonto;
	
	protected JButton jButtonRecargarInformacionToolBarDescuentoMonto;
	protected JButton jButtonProcesarInformacionToolBarDescuentoMonto;
	protected JButton jButtonAnterioresToolBarDescuentoMonto;
	protected JButton jButtonSiguientesToolBarDescuentoMonto;
	protected JButton jButtonNuevoGuardarCambiosToolBarDescuentoMonto;
	protected JButton jButtonAbrirOrderByToolBarDescuentoMonto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDescuentoMonto;
	protected JMenuItem jMenuItemDuplicarDescuentoMonto;
	protected JMenuItem jMenuItemNuevoRelacionesDescuentoMonto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDescuentoMonto;
	protected JMenuItem jMenuItemCopiarDescuentoMonto;
	protected JMenuItem jMenuItemVerFormDescuentoMonto;
	protected JMenuItem jMenuItemGuardarCambiosTablaDescuentoMonto;
	protected JMenuItem jMenuItemCerrarDescuentoMonto;
	protected JMenuItem jMenuItemDetalleCerrarDescuentoMonto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDescuentoMonto;
	protected JMenuItem jMenuItemDetalleMostarOcultarDescuentoMonto;
	
	protected JMenuItem jMenuItemRecargarInformacionDescuentoMonto;
	protected JMenuItem jMenuItemProcesarInformacionDescuentoMonto;
	protected JMenuItem jMenuItemAnterioresDescuentoMonto;
	protected JMenuItem jMenuItemSiguientesDescuentoMonto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDescuentoMonto;
	protected JMenuItem jMenuItemAbrirOrderByDescuentoMonto;
	protected JMenuItem jMenuItemMostrarOcultarDescuentoMonto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDescuentoMonto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDescuentoMonto;
	protected JCheckBox jCheckBoxSeleccionadosDescuentoMonto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDescuentoMonto;
	protected JCheckBox jCheckBoxConGraficoReporteDescuentoMonto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDescuentoMonto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDescuentoMonto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDescuentoMonto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDescuentoMonto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDescuentoMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDescuentoMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDescuentoMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDescuentoMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDescuentoMonto;
	protected JTextField jTextFieldValorCampoGeneralDescuentoMonto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDescuentoMonto;
	//public JList<Reporte> jListColumnasSelectReporteDescuentoMonto;
	//public JScrollPane jScrollColumnasSelectReporteDescuentoMonto;
	
	//public JLabel jLabelRelacionesSelectReporteDescuentoMonto;
	//public JList<Reporte> jListRelacionesSelectReporteDescuentoMonto;
	//public JScrollPane jScrollRelacionesSelectReporteDescuentoMonto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDescuentoMonto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDescuentoMonto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDescuentoMonto;
	//public JLabel jLabelTiposArchivoReporteDinamicoDescuentoMonto;
	
		
	//public JLabel jLabelArchivoImportacionDescuentoMonto;	
	//public JLabel jLabelPathArchivoImportacionDescuentoMonto;
	//protected JTextField jTextFieldPathArchivoImportacionDescuentoMonto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDescuentoMonto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDescuentoMonto;
	
	//public JLabel jLabelColumnaCategoriaValorDescuentoMonto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDescuentoMonto;
	
	//public JLabel jLabelColumnasValoresGraficoDescuentoMonto;
	//public JList<Reporte> jListColumnasValoresGraficoDescuentoMonto;
	//public JScrollPane jScrollColumnasValoresGraficoDescuentoMonto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDescuentoMonto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDescuentoMonto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDescuentoMonto;
	public JPanel jPanelFK_IdBodegaDescuentoMonto;
	public JButton jButtonFK_IdBodegaDescuentoMonto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDescuentoMonto;
	public JLabel jLabelid_bodegaFK_IdBodegaDescuentoMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDescuentoMonto;
	public JButton jButtonid_bodegaFK_IdBodegaDescuentoMonto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDescuentoMontoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDescuentoMontoBusqueda= new JButtonMe();

	
	
	
	
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
	public DescuentoMontoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoMontoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDescuentoMonto)	{
		this.jButtonRecargarInformacionDescuentoMonto = jButtonRecargarInformacionDescuentoMonto;
	}
	
	public JButton getjButtonProcesarInformacionDescuentoMonto() {
		return this.jButtonProcesarInformacionDescuentoMonto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDescuentoMonto)	{
		this.jButtonProcesarInformacionDescuentoMonto = jButtonProcesarInformacionDescuentoMonto;
	}
	
	
	public JButton getjButtonRecargarInformacionDescuentoMonto() {
		return this.jButtonRecargarInformacionDescuentoMonto;
	}
	
	
	public List<DescuentoMonto> getdescuentomontos() {
		return this.descuentomontos;
	}

	public void setdescuentomontos(List<DescuentoMonto> descuentomontos) {
		this.descuentomontos = descuentomontos;
	}
	
	public List<DescuentoMonto> getdescuentomontosAux() {
		return this.descuentomontosAux;
	}

	public void setdescuentomontosAux(List<DescuentoMonto> descuentomontosAux) {
		this.descuentomontosAux = descuentomontosAux;
	}
	
	public List<DescuentoMonto> getdescuentomontosEliminados() {
		return this.descuentomontosEliminados;
	}

	public void setDescuentoMontosEliminados(List<DescuentoMonto> descuentomontosEliminados) {
		this.descuentomontosEliminados = descuentomontosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDescuentoMonto() {
		return jComboBoxTiposSeleccionarDescuentoMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDescuentoMonto(
			JComboBox jComboBoxTiposSeleccionarDescuentoMonto) {
		this.jComboBoxTiposSeleccionarDescuentoMonto = jComboBoxTiposSeleccionarDescuentoMonto;
	}
	
	public void setBorderResaltarTiposSeleccionarDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDescuentoMonto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDescuentoMonto() {
		return jTextFieldValorCampoGeneralDescuentoMonto;
	}

	public void setjTextFieldValorCampoGeneralDescuentoMonto(
			JTextField jTextFieldValorCampoGeneralDescuentoMonto) {
		this.jTextFieldValorCampoGeneralDescuentoMonto = jTextFieldValorCampoGeneralDescuentoMonto;
	}

	public void setBorderResaltarValorCampoGeneralDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDescuentoMonto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDescuentoMonto() {
		return this.jCheckBoxSeleccionarTodosDescuentoMonto;
	}

	public void setjCheckBoxSeleccionarTodosDescuentoMonto(
			JCheckBox jCheckBoxSeleccionarTodosDescuentoMonto) {
		this.jCheckBoxSeleccionarTodosDescuentoMonto = jCheckBoxSeleccionarTodosDescuentoMonto;
	}

	public void setBorderResaltarSeleccionarTodosDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDescuentoMonto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDescuentoMonto() {
		return this.jCheckBoxSeleccionadosDescuentoMonto;
	}

	public void setjCheckBoxSeleccionadosDescuentoMonto(
			JCheckBox jCheckBoxSeleccionadosDescuentoMonto) {
		this.jCheckBoxSeleccionadosDescuentoMonto = jCheckBoxSeleccionadosDescuentoMonto;
	}
	
	public void setBorderResaltarSeleccionadosDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDescuentoMonto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDescuentoMonto() {
		return this.jComboBoxTiposArchivosReportesDescuentoMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDescuentoMonto(
			JComboBox jComboBoxTiposArchivosReportesDescuentoMonto) {
		this.jComboBoxTiposArchivosReportesDescuentoMonto = jComboBoxTiposArchivosReportesDescuentoMonto;
	}

	public void setBorderResaltarTiposArchivosReportesDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDescuentoMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDescuentoMonto() {
		return this.jComboBoxTiposReportesDescuentoMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDescuentoMonto(
			JComboBox jComboBoxTiposReportesDescuentoMonto) {
		this.jComboBoxTiposReportesDescuentoMonto = jComboBoxTiposReportesDescuentoMonto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDescuentoMonto() {
	//	return jComboBoxTiposReportesDinamicoDescuentoMonto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDescuentoMonto(
	//		JComboBox jComboBoxTiposReportesDinamicoDescuentoMonto) {
	//	this.jComboBoxTiposReportesDinamicoDescuentoMonto = jComboBoxTiposReportesDinamicoDescuentoMonto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDescuentoMonto() {
	//	return jComboBoxTiposArchivosReportesDinamicoDescuentoMonto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDescuentoMonto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDescuentoMonto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto = jComboBoxTiposArchivosReportesDinamicoDescuentoMonto;
	//}
	
	public void setBorderResaltarTiposReportesDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDescuentoMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDescuentoMonto() {
		return this.jComboBoxTiposGraficosReportesDescuentoMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDescuentoMonto(
			JComboBox jComboBoxTiposGraficosReportesDescuentoMonto) {
		this.jComboBoxTiposGraficosReportesDescuentoMonto = jComboBoxTiposGraficosReportesDescuentoMonto;
	}
	
	public void setBorderResaltarTiposGraficosReportesDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDescuentoMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDescuentoMonto() {
		return this.jComboBoxTiposPaginacionDescuentoMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDescuentoMonto(
			JComboBox jComboBoxTiposPaginacionDescuentoMonto) {
		this.jComboBoxTiposPaginacionDescuentoMonto = jComboBoxTiposPaginacionDescuentoMonto;
	}
	
	public void setBorderResaltarTiposPaginacionDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDescuentoMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDescuentoMonto() {
		return this.jComboBoxTiposRelacionesDescuentoMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDescuentoMonto() {
		return this.jComboBoxTiposAccionesDescuentoMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDescuentoMonto(
			JComboBox jComboBoxTiposRelacionesDescuentoMonto) {
		this.jComboBoxTiposRelacionesDescuentoMonto = jComboBoxTiposRelacionesDescuentoMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDescuentoMonto(
			JComboBox jComboBoxTiposAccionesDescuentoMonto) {
		this.jComboBoxTiposAccionesDescuentoMonto = jComboBoxTiposAccionesDescuentoMonto;
	}
	
	public void setBorderResaltarTiposRelacionesDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDescuentoMonto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDescuentoMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDescuentoMonto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDescuentoMonto() {
	//	return jCheckBoxConGraficoDinamicoDescuentoMonto;
	//}

	//public void setjCheckBoxConGraficoDinamicoDescuentoMonto(
	//		JCheckBox jCheckBoxConGraficoDinamicoDescuentoMonto) {
	//	this.jCheckBoxConGraficoDinamicoDescuentoMonto = jCheckBoxConGraficoDinamicoDescuentoMonto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDescuentoMonto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDescuentoMonto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDescuentoMonto .setBorder(borderResaltar);		
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
		this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
		
		this.descuentomontoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.descuentomontoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.descuentomontoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DescuentoMontoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Descuento Monto MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
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
		
		DescuentoMontoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DescuentoMonto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDescuentoMonto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"nuevo","nuevo","Nuevo"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"duplicar","duplicar","Duplicar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"copiar","copiar","Copiar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"ver_form","ver_form","Ver"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"recargar","recargar","Recargar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDescuentoMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDescuentoMonto,this.jTtoolBarDescuentoMonto,
							"cerrar","cerrar","Salir"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDescuentoMonto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDescuentoMonto;
			
				this.jButtonProcesarInformacionToolBarDescuentoMonto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDescuentoMonto;
				
		//protected JButton jButtonModificarToolBarDescuentoMonto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDescuentoMonto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDescuentoMonto=new JMenuMe("General");
		this.jmenuArchivoDescuentoMonto=new JMenuMe("Archivo");
		this.jmenuAccionesDescuentoMonto=new JMenuMe("Acciones");
		this.jmenuDatosDescuentoMonto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDescuentoMonto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDescuentoMonto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDescuentoMonto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDescuentoMonto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDescuentoMonto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDescuentoMonto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDescuentoMonto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDescuentoMonto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDescuentoMonto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDescuentoMonto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDescuentoMonto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDescuentoMonto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDescuentoMonto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDescuentoMonto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDescuentoMonto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDescuentoMonto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDescuentoMonto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDescuentoMonto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDescuentoMonto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDescuentoMonto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDescuentoMonto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDescuentoMonto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDescuentoMonto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDescuentoMonto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDescuentoMonto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDescuentoMonto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDescuentoMonto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDescuentoMonto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDescuentoMonto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDescuentoMonto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDescuentoMonto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDescuentoMonto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDescuentoMonto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDescuentoMonto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDescuentoMonto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDescuentoMonto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDescuentoMonto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDescuentoMonto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDescuentoMonto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDescuentoMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDescuentoMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDescuentoMonto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDescuentoMonto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDescuentoMonto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDescuentoMonto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDescuentoMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDescuentoMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDescuentoMonto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDescuentoMonto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDescuentoMonto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDescuentoMonto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDescuentoMonto.add(this.jMenuItemCerrarDescuentoMonto);
			
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemNuevoDescuentoMonto);
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemNuevoGuardarCambiosDescuentoMonto);
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemNuevoRelacionesDescuentoMonto);
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemGuardarCambiosTablaDescuentoMonto);		
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemDuplicarDescuentoMonto);		
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemCopiarDescuentoMonto);		
			this.jmenuAccionesDescuentoMonto.add(this.jMenuItemVerFormDescuentoMonto);		
			
			this.jmenuDatosDescuentoMonto.add(this.jMenuItemRecargarInformacionDescuentoMonto);				
			this.jmenuDatosDescuentoMonto.add(this.jMenuItemAnterioresDescuentoMonto);				
			this.jmenuDatosDescuentoMonto.add(this.jMenuItemSiguientesDescuentoMonto);				
			this.jmenuDatosDescuentoMonto.add(this.jMenuItemAbrirOrderByDescuentoMonto);				
			this.jmenuDatosDescuentoMonto.add(this.jMenuItemMostrarOcultarDescuentoMonto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDescuentoMonto.add(this.jMenuItemGuardarCambiosDescuentoMonto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDescuentoMonto.add(this.jmenuArchivoDescuentoMonto);		
			this.jmenuBarDescuentoMonto.add(this.jmenuAccionesDescuentoMonto);		
			this.jmenuBarDescuentoMonto.add(this.jmenuDatosDescuentoMonto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDescuentoMonto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDescuentoMonto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDescuentoMonto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDescuentoMonto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDescuentoMonto= new JButtonMe();
		this.jButtonFK_IdBodegaDescuentoMonto.setText("Buscar");
		this.jButtonFK_IdBodegaDescuentoMonto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDescuentoMonto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDescuentoMonto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDescuentoMonto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDescuentoMonto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDescuentoMonto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDescuentoMonto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDescuentoMonto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDescuentoMonto=new JTabbedPane();


		this.jTabbedPaneBusquedasDescuentoMonto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDescuentoMonto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDescuentoMonto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDescuentoMonto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDescuentoMonto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDescuentoMonto = new DescuentoMontoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Descuento Monto DATOS");
			this.jInternalFrameDetalleFormDescuentoMonto = new DescuentoMontoDetalleFormJInternalFrame(jDesktopPane,this.descuentomontoSessionBean.getConGuardarRelaciones(),this.descuentomontoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDescuentoMonto = null;//new DescuentoMontoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDescuentoMonto= new GridBagLayout();
		
		
		this.jTableDatosDescuentoMonto = new JTableMe();      
		
		String sToolTipDescuentoMonto="";
		sToolTipDescuentoMonto=DescuentoMontoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDescuentoMonto+="(Inventario.DescuentoMonto)";
		}
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDescuentoMonto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDescuentoMonto.setToolTipText(sToolTipDescuentoMonto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDescuentoMonto);
		this.jTableDatosDescuentoMonto.setAutoCreateRowSorter(true);
		this.jTableDatosDescuentoMonto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDescuentoMonto.setRowSelectionAllowed(true);
		this.jTableDatosDescuentoMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDescuentoMonto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDescuentoMonto = new JButtonMe();
		this.jButtonDuplicarDescuentoMonto = new JButtonMe();
		this.jButtonCopiarDescuentoMonto = new JButtonMe();
		this.jButtonVerFormDescuentoMonto = new JButtonMe();
		this.jButtonNuevoRelacionesDescuentoMonto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDescuentoMonto = new JButtonMe();
		this.jButtonCerrarDescuentoMonto = new JButtonMe();
		
		this.jScrollPanelDatosDescuentoMonto = new JScrollPane();   
        this.jScrollPanelDatosGeneralDescuentoMonto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Descuento Monto";
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Montos" + this.sPath));
		} else {
			this.jScrollPanelDatosDescuentoMonto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDescuentoMonto.setToolTipText("Acciones");
        this.jPanelAccionesDescuentoMonto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDescuentoMonto=new ReporteDinamicoJInternalFrame(DescuentoMontoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDescuentoMonto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDescuentoMonto=new ImportacionJInternalFrame(DescuentoMontoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDescuentoMonto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDescuentoMonto = new JButtonMe();
		
		this.jButtonAbrirOrderByDescuentoMonto.setText("Orden");
		this.jButtonAbrirOrderByDescuentoMonto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDescuentoMonto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDescuentoMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoMonto,false,this);
			
			//this.cargarOrderByDescuentoMonto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDescuentoMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoMonto,true,this);
			
			//this.cargarOrderByDescuentoMonto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDescuentoMonto.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDescuentoMonto.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDescuentoMonto.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDescuentoMonto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDescuentoMonto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDescuentoMonto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDescuentoMonto.setText("Nuevo");
		this.jButtonDuplicarDescuentoMonto.setText("Duplicar");
		this.jButtonCopiarDescuentoMonto.setText("Copiar");
		this.jButtonVerFormDescuentoMonto.setText("Ver");
		this.jButtonNuevoRelacionesDescuentoMonto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.setText("Guardar");
		this.jButtonCerrarDescuentoMonto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDescuentoMonto,"nuevo_button","Nuevo",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDescuentoMonto,"duplicar_button","Duplicar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDescuentoMonto,"copiar_button","Copiar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDescuentoMonto,"ver_form","Ver",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDescuentoMonto,"nuevorelaciones_button","Nuevo Rel",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDescuentoMonto,"guardarcambiostabla_button","Guardar",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDescuentoMonto,"cerrar_button","Salir",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDescuentoMonto.setToolTipText("Nuevo"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDescuentoMonto.setToolTipText("Duplicar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDescuentoMonto.setToolTipText("Copiar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDescuentoMonto.setToolTipText("Ver"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDescuentoMonto.setToolTipText("Nuevo Rel"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.setToolTipText("Guardar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDescuentoMonto.setToolTipText("Salir"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDescuentoMonto";
		inputMap = this.jButtonNuevoDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDescuentoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDescuentoMonto"));
		
		//DUPLICAR
		sMapKey = "DuplicarDescuentoMonto";
		inputMap = this.jButtonDuplicarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDescuentoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDescuentoMonto"));
		
		//COPIAR
		sMapKey = "CopiarDescuentoMonto";
		inputMap = this.jButtonCopiarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDescuentoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDescuentoMonto"));
		
		//VEr FORM
		sMapKey = "VerFormDescuentoMonto";
		inputMap = this.jButtonVerFormDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDescuentoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDescuentoMonto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDescuentoMonto";
		inputMap = this.jButtonNuevoRelacionesDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDescuentoMonto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDescuentoMonto";
		inputMap = this.jButtonModificarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDescuentoMonto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDescuentoMonto";
		inputMap = this.jButtonCerrarDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDescuentoMonto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDescuentoMonto";
		inputMap = this.jButtonGuardarCambiosTablaDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDescuentoMonto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DescuentoMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DescuentoMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DescuentoMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DescuentoMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DescuentoMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDescuentoMonto.setName("jPanelParametrosReportesDescuentoMonto"); 
		
		this.jPanelParametrosReportesAccionesDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDescuentoMonto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDescuentoMonto.setName("jPanelParametrosReportesAccionesDescuentoMonto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDescuentoMonto = new JButtonMe();
		this.jButtonRecargarInformacionDescuentoMonto.setText("Recargar");
		this.jButtonRecargarInformacionDescuentoMonto.setToolTipText("Recargar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDescuentoMonto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDescuentoMonto = new JButtonMe();
		this.jButtonProcesarInformacionDescuentoMonto.setText("Procesar");
		this.jButtonProcesarInformacionDescuentoMonto.setToolTipText("Procesar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDescuentoMonto.setVisible(false);
			
		this.jButtonProcesarInformacionDescuentoMonto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDescuentoMonto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDescuentoMonto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDescuentoMonto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDescuentoMonto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDescuentoMonto.setText("TIPO");       
		this.jComboBoxTiposReportesDescuentoMonto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDescuentoMonto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDescuentoMonto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDescuentoMonto.setText("Paginacion");
		this.jComboBoxTiposPaginacionDescuentoMonto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDescuentoMonto.setText("Accion");
		this.jComboBoxTiposRelacionesDescuentoMonto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDescuentoMonto.setText("Accion");
		this.jComboBoxTiposAccionesDescuentoMonto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDescuentoMonto.setText("Accion");
		this.jComboBoxTiposSeleccionarDescuentoMonto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDescuentoMonto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDescuentoMonto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDescuentoMonto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDescuentoMonto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDescuentoMonto = new JLabelMe();
		
		this.jLabelAccionesDescuentoMonto.setText("Acciones");		
		this.jLabelAccionesDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDescuentoMonto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDescuentoMonto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDescuentoMonto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDescuentoMonto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDescuentoMonto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDescuentoMonto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDescuentoMonto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDescuentoMonto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDescuentoMonto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDescuentoMonto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDescuentoMonto.setText("Graf.");
		this.jCheckBoxConGraficoReporteDescuentoMonto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDescuentoMonto = new JButtonMe();
		//this.jButtonAnterioresDescuentoMonto.setText("<<");
        this.jButtonAnterioresDescuentoMonto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDescuentoMonto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDescuentoMonto = new JButtonMe();
		//this.jButtonSiguientesDescuentoMonto.setText(">>");
        this.jButtonSiguientesDescuentoMonto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDescuentoMonto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDescuentoMonto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDescuentoMonto.setText("Nue");
        this.jButtonNuevoGuardarCambiosDescuentoMonto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDescuentoMonto,"nuevoguardarcambios_button","Nue",this.descuentomontoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDescuentoMonto";
		inputMap = this.jButtonNuevoGuardarCambiosDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDescuentoMonto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDescuentoMonto";
		inputMap = this.jButtonRecargarInformacionDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDescuentoMonto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDescuentoMonto";
		inputMap = this.jButtonSiguientesDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDescuentoMonto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDescuentoMonto";
		inputMap = this.jButtonAnterioresDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDescuentoMonto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDescuentoMonto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDescuentoMonto.setMinimumSize(new Dimension(this.getWidth(),DescuentoMontoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DescuentoMontoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDescuentoMonto.setMaximumSize(new Dimension(this.getWidth(),DescuentoMontoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DescuentoMontoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDescuentoMonto.setPreferredSize(new Dimension(this.getWidth(),DescuentoMontoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DescuentoMontoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDescuentoMonto = new GridBagLayout();

			this.jPanelPaginacionDescuentoMonto.setLayout(gridaBagLayoutPaginacionDescuentoMonto);						
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 0;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonAnterioresDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
					
						
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDescuentoMonto.gridy = 0;
			
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonNuevoGuardarCambiosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
						
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDescuentoMonto.gridy = 0;
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonSiguientesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 1;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonNuevoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
						
			
			
			if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
				this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDescuentoMonto.gridy = 1;
				this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDescuentoMonto.add(this.jButtonGuardarCambiosTablaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			}
			
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 1;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonDuplicarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 1;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonCopiarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 1;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonVerFormDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 1;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDescuentoMonto.add(this.jButtonCerrarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		
		this.jButtonRecargarInformacionDescuentoMonto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDescuentoMonto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDescuentoMonto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDescuentoMonto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDescuentoMonto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDescuentoMonto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDescuentoMonto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDescuentoMonto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDescuentoMonto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDescuentoMonto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDescuentoMonto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDescuentoMonto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDescuentoMonto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDescuentoMonto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDescuentoMonto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDescuentoMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDescuentoMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDescuentoMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDescuentoMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDescuentoMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDescuentoMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDescuentoMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDescuentoMonto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDescuentoMonto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDescuentoMonto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDescuentoMonto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDescuentoMonto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDescuentoMonto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDescuentoMonto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDescuentoMonto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDescuentoMonto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDescuentoMonto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDescuentoMonto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDescuentoMonto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDescuentoMonto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDescuentoMonto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DescuentoMonto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DescuentoMonto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DescuentoMonto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DescuentoMonto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDescuentoMonto.setLayout(gridaBagParametrosReportesDescuentoMonto);
			this.jPanelParametrosReportesAccionesDescuentoMonto.setLayout(gridaBagParametrosReportesAccionesDescuentoMonto);
			
			
			this.jPanelParametrosAuxiliar1DescuentoMonto.setLayout(gridaBagParametrosAuxiliar1DescuentoMonto);
			this.jPanelParametrosAuxiliar2DescuentoMonto.setLayout(gridaBagParametrosAuxiliar2DescuentoMonto);
			this.jPanelParametrosAuxiliar3DescuentoMonto.setLayout(gridaBagParametrosAuxiliar3DescuentoMonto);
			this.jPanelParametrosAuxiliar4DescuentoMonto.setLayout(gridaBagParametrosAuxiliar4DescuentoMonto);
			//this.jPanelParametrosAuxiliar5DescuentoMonto.setLayout(gridaBagParametrosAuxiliar2DescuentoMonto);			
			
			
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoMonto.add(this.jButtonRecargarInformacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DescuentoMonto.add(this.jComboBoxTiposPaginacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DescuentoMonto.add(this.jCheckBoxConAltoMaximoTablaDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DescuentoMonto.add(this.jComboBoxTiposArchivosReportesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoMonto.add(this.jPanelParametrosAuxiliar1DescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DescuentoMonto.add(this.jComboBoxTiposReportesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);																		
			
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DescuentoMonto.add(this.jComboBoxTiposGraficosReportesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoMonto.add(this.jPanelParametrosAuxiliar4DescuentoMonto, this.gridBagConstraintsDescuentoMonto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoMonto.add(this.jComboBoxTiposReportesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoMonto.add(this.jCheckBoxGenerarReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoMonto.add(this.jPanelParametrosAuxiliar2DescuentoMonto, this.gridBagConstraintsDescuentoMonto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoMonto.add(this.jLabelAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
				this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDescuentoMonto.add(this.jButtonAbrirOrderByDescuentoMonto, this.gridBagConstraintsDescuentoMonto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoMonto.add(this.jComboBoxTiposSeleccionarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
			
			
			/*
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoMonto.add(this.jCheckBoxSeleccionarTodosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoMonto.add(this.jCheckBoxConGraficoReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DescuentoMonto.add(this.jCheckBoxSeleccionarTodosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);															
				
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DescuentoMonto.add(this.jCheckBoxSeleccionadosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);															
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DescuentoMonto.add(this.jCheckBoxConGraficoReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoMonto.add(this.jPanelParametrosAuxiliar3DescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoMonto.add(this.jComboBoxTiposAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
	
				
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoMonto.add(this.jTextFieldValorCampoGeneralDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDescuentoMonto = new GridBagLayout();

			this.jScrollPanelDatosDescuentoMonto.setLayout(gridaBagLayoutDatosDescuentoMonto);
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = 0;
			this.gridBagConstraintsDescuentoMonto.gridx = 0;
			
			this.jScrollPanelDatosDescuentoMonto.add(this.jTableDatosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDescuentoMonto.setViewportView(this.jTableDatosDescuentoMonto);
		this.jTableDatosDescuentoMonto.setFillsViewportHeight(true);
		this.jTableDatosDescuentoMonto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDescuentoMonto= new GridBagLayout();
		this.jPanelAccionesDescuentoMonto.setLayout(gridaBagLayoutAccionesDescuentoMonto);
		
		
		/*	
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = 0;
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
			
		this.jPanelAccionesDescuentoMonto.add(this.jButtonNuevoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDescuentoMonto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDescuentoMonto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDescuentoMonto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDescuentoMonto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDescuentoMonto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDescuentoMonto.setLayout(gridaBagLayoutFK_IdBodegaDescuentoMonto);

		gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoMonto.gridy = 0;
		gridBagConstraintsDescuentoMonto.gridx = 0;
		jPanelFK_IdBodegaDescuentoMonto.add(jLabelid_bodegaFK_IdBodegaDescuentoMonto, gridBagConstraintsDescuentoMonto);

		gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoMonto.gridy = 0;
		gridBagConstraintsDescuentoMonto.gridx = 1;
		jPanelFK_IdBodegaDescuentoMonto.add(jComboBoxid_bodegaFK_IdBodegaDescuentoMonto, gridBagConstraintsDescuentoMonto);

		gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoMonto.gridy = 1;
		gridBagConstraintsDescuentoMonto.gridx =1;
		jPanelFK_IdBodegaDescuentoMonto.add(jButtonFK_IdBodegaDescuentoMonto, gridBagConstraintsDescuentoMonto);

		jTabbedPaneBusquedasDescuentoMonto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDescuentoMonto);
		jTabbedPaneBusquedasDescuentoMonto.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDescuentoMonto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDescuentoMonto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();						
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDescuentoMonto.gridx = 0;		
			//this.gridBagConstraintsDescuentoMonto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDescuentoMonto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDescuentoMonto, this.gridBagConstraintsDescuentoMonto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDescuentoMonto.gridx = 0;		
		//this.gridBagConstraintsDescuentoMonto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDescuentoMonto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDescuentoMonto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDescuentoMonto.gridx = 0;		
			this.gridBagConstraintsDescuentoMonto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDescuentoMonto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDescuentoMonto, this.gridBagConstraintsDescuentoMonto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);								
		
		
		/*
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		*/		
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDescuentoMonto.gridx =0;
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDescuentoMonto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
				
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDescuentoMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDescuentoMonto = new GridBagLayout();
			this.jPanelBusquedasParametrosDescuentoMonto.setLayout(gridaBagLayoutBusquedasParametrosDescuentoMonto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDescuentoMonto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDescuentoMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
			
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoMonto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDescuentoMonto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDescuentoMonto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDescuentoMonto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDescuentoMonto.setName("jPanelReporteDinamicoDescuentoMonto"); 
		
		this.jPanelReporteDinamicoDescuentoMonto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDescuentoMonto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDescuentoMonto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDescuentoMonto.setLayout(gridaBagLayoutReporteDinamicoDescuentoMonto);
		
		
		this.jInternalFrameReporteDinamicoDescuentoMonto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDescuentoMonto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDescuentoMonto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDescuentoMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDescuentoMonto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDescuentoMonto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDescuentoMonto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDescuentoMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDescuentoMonto.setResizable(true);
	    this.jInternalFrameReporteDinamicoDescuentoMonto.setClosable(true);
	    this.jInternalFrameReporteDinamicoDescuentoMonto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDescuentoMonto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDescuentoMonto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDescuentoMonto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Montos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDescuentoMonto = new JLabelMe();

		this.jLabelColumnasSelectReporteDescuentoMonto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelColumnasSelectReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDescuentoMonto = new JList<Reporte>();
		this.jListColumnasSelectReporteDescuentoMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDescuentoMonto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDescuentoMonto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDescuentoMonto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDescuentoMonto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDescuentoMonto=new JScrollPane(this.jListColumnasSelectReporteDescuentoMonto);
			
			this.jScrollColumnasSelectReporteDescuentoMonto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDescuentoMonto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDescuentoMonto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDescuentoMonto.add(this.jListColumnasSelectReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jScrollColumnasSelectReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDescuentoMonto = new JLabelMe();

		this.jLabelRelacionesSelectReporteDescuentoMonto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDescuentoMonto = new JList<Reporte>();
		this.jListRelacionesSelectReporteDescuentoMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDescuentoMonto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDescuentoMonto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDescuentoMonto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDescuentoMonto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDescuentoMonto=new JScrollPane(this.jListRelacionesSelectReporteDescuentoMonto);
			
			this.jScrollRelacionesSelectReporteDescuentoMonto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDescuentoMonto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDescuentoMonto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDescuentoMonto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDescuentoMonto = new JComboBoxMe();
		this.jListColumnasValoresGraficoDescuentoMonto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDescuentoMonto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDescuentoMonto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDescuentoMonto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDescuentoMonto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDescuentoMonto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDescuentoMonto = new JLabelMe();

		this.jLabelConGraficoDinamicoDescuentoMonto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelConGraficoDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDescuentoMonto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDescuentoMonto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDescuentoMonto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDescuentoMonto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDescuentoMonto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDescuentoMonto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jCheckBoxConGraficoDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDescuentoMonto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDescuentoMonto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelColumnaCategoriaGraficoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDescuentoMonto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDescuentoMonto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDescuentoMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDescuentoMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDescuentoMonto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jComboBoxColumnaCategoriaGraficoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDescuentoMonto = new JLabelMe();

		this.jLabelColumnaCategoriaValorDescuentoMonto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelColumnaCategoriaValorDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDescuentoMonto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDescuentoMonto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDescuentoMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDescuentoMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDescuentoMonto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jComboBoxColumnaCategoriaValorDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDescuentoMonto = new JLabelMe();

		this.jLabelColumnasValoresGraficoDescuentoMonto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelColumnasValoresGraficoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDescuentoMonto = new JList<Reporte>();
		this.jListColumnasValoresGraficoDescuentoMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDescuentoMonto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDescuentoMonto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDescuentoMonto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDescuentoMonto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDescuentoMonto=new JScrollPane(this.jListColumnasValoresGraficoDescuentoMonto);
			
			this.jScrollColumnasValoresGraficoDescuentoMonto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDescuentoMonto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDescuentoMonto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDescuentoMonto.add(this.jListColumnasSelectReporteDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jScrollColumnasValoresGraficoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDescuentoMonto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDescuentoMonto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelTiposGraficosReportesDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDescuentoMonto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDescuentoMonto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDescuentoMonto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDescuentoMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDescuentoMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDescuentoMonto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jComboBoxTiposGraficosReportesDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDescuentoMonto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDescuentoMonto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelGenerarExcelReporteDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDescuentoMonto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDescuentoMonto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDescuentoMonto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDescuentoMonto.setToolTipText("Generar EXCEL"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDescuentoMonto.add(this.jButtonGenerarExcelReporteDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jComboBoxTiposReportesDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDescuentoMonto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDescuentoMonto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jLabelTiposArchivoReporteDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jComboBoxTiposArchivosReportesDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDescuentoMonto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDescuentoMonto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDescuentoMonto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDescuentoMonto.setToolTipText("Generar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jButtonGenerarReporteDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDescuentoMonto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDescuentoMonto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDescuentoMonto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDescuentoMonto.setToolTipText("Cancelar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoMonto.add(this.jButtonCerrarReporteDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDescuentoMonto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDescuentoMonto= new JScrollPane(jPanelReporteDinamicoDescuentoMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDescuentoMonto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDescuentoMonto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDescuentoMonto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Montos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoMonto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDescuentoMonto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDescuentoMonto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDescuentoMonto);
		this.jInternalFrameReporteDinamicoDescuentoMonto.getContentPane().add(this.jScrollPanelReporteDinamicoDescuentoMonto, this.gridBagConstraintsDescuentoMonto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDescuentoMonto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDescuentoMonto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDescuentoMonto.setName("jPanelImportacionDescuentoMonto"); 
		
		this.jPanelImportacionDescuentoMonto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDescuentoMonto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDescuentoMonto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDescuentoMonto.setLayout(gridaBagLayoutImportacionDescuentoMonto);
		
		
		this.jInternalFrameImportacionDescuentoMonto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDescuentoMonto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDescuentoMonto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDescuentoMonto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDescuentoMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDescuentoMonto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDescuentoMonto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDescuentoMonto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDescuentoMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDescuentoMonto.setResizable(true);
	    this.jInternalFrameImportacionDescuentoMonto.setClosable(true);
	    this.jInternalFrameImportacionDescuentoMonto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDescuentoMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDescuentoMonto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDescuentoMonto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDescuentoMonto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDescuentoMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDescuentoMonto.setResizable(true);
	    this.jInternalFrameImportacionDescuentoMonto.setClosable(true);
	    this.jInternalFrameImportacionDescuentoMonto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDescuentoMonto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDescuentoMonto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDescuentoMonto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Montos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDescuentoMonto = new JLabelMe();

		this.jLabelArchivoImportacionDescuentoMonto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYImportacion;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDescuentoMonto.add(this.jLabelArchivoImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDescuentoMonto = new JFileChooser();		
		this.jFileChooserImportacionDescuentoMonto.setToolTipText("ESCOGER ARCHIVO"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDescuentoMonto = new JButtonMe();
		this.jButtonAbrirImportacionDescuentoMonto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDescuentoMonto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDescuentoMonto.setToolTipText("Generar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoMonto.add(this.jButtonAbrirImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDescuentoMonto = new JLabelMe();

		this.jLabelPathArchivoImportacionDescuentoMonto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDescuentoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDescuentoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDescuentoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYImportacion;		
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDescuentoMonto.add(this.jLabelPathArchivoImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDescuentoMonto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDescuentoMonto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDescuentoMonto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDescuentoMonto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoMonto.add(this.jTextFieldPathArchivoImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDescuentoMonto = new JButtonMe();
		this.jButtonGenerarImportacionDescuentoMonto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDescuentoMonto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDescuentoMonto.setToolTipText("Generar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoMonto.add(this.jButtonGenerarImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDescuentoMonto = new JButtonMe();
		this.jButtonCerrarImportacionDescuentoMonto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDescuentoMonto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDescuentoMonto.setToolTipText("Cancelar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoMonto.add(this.jButtonCerrarImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDescuentoMonto = new GridBagLayout();
		
		this.jScrollPanelImportacionDescuentoMonto= new JScrollPane(jPanelImportacionDescuentoMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
		this.gridBagConstraintsDescuentoMonto.gridy =iPosYImportacion;
		this.gridBagConstraintsDescuentoMonto.gridx =iPosXImportacion;
		this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDescuentoMonto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDescuentoMonto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDescuentoMonto);
		this.jInternalFrameImportacionDescuentoMonto.getContentPane().add(this.jScrollPanelImportacionDescuentoMonto, this.gridBagConstraintsDescuentoMonto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDescuentoMonto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDescuentoMonto = new JButtonMe();
			this.jButtonAbrirOrderByDescuentoMonto.setText("Orden");
			this.jButtonAbrirOrderByDescuentoMonto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDescuentoMonto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDescuentoMonto";
			inputMap = this.jButtonAbrirOrderByDescuentoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDescuentoMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDescuentoMonto"));
		
		
			GridBagLayout gridaBagLayoutOrderByDescuentoMonto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDescuentoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDescuentoMonto.setName("jPanelOrderByDescuentoMonto"); 
			
			this.jPanelOrderByDescuentoMonto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDescuentoMonto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDescuentoMonto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDescuentoMonto.setLayout(gridaBagLayoutOrderByDescuentoMonto);
			
			
			this.jTableDatosDescuentoMontoOrderBy = new JTableMe();        
			this.jTableDatosDescuentoMontoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDescuentoMontoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDescuentoMontoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDescuentoMontoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDescuentoMontoOrderBy.setViewportView(this.jTableDatosDescuentoMontoOrderBy);
			this.jTableDatosDescuentoMontoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDescuentoMontoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDescuentoMonto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDescuentoMonto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDescuentoMonto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDescuentoMonto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDescuentoMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDescuentoMonto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDescuentoMonto.setTitle("Orden");
			this.jInternalFrameOrderByDescuentoMonto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDescuentoMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDescuentoMonto.setResizable(true);
			this.jInternalFrameOrderByDescuentoMonto.setClosable(true);
			this.jInternalFrameOrderByDescuentoMonto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDescuentoMonto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDescuentoMonto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDescuentoMonto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDescuentoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Montos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDescuentoMonto.gridx =iPosXOrderBy;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDescuentoMonto.ipady =150;
				
			this.jPanelOrderByDescuentoMonto.add(jScrollPanelDatosDescuentoMontoOrderBy, this.gridBagConstraintsDescuentoMonto);//this.jTableDatosDescuentoMontoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDescuentoMonto = new JButtonMe();
			this.jButtonCerrarOrderByDescuentoMonto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDescuentoMonto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDescuentoMonto.setToolTipText("Cancelar"+" "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDescuentoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoMonto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDescuentoMonto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDescuentoMonto.add(this.jButtonCerrarOrderByDescuentoMonto, this.gridBagConstraintsDescuentoMonto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDescuentoMonto = new GridBagLayout();
			
			this.jScrollPanelOrderByDescuentoMonto= new JScrollPane(jPanelOrderByDescuentoMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDescuentoMonto = new GridBagConstraints();
			this.gridBagConstraintsDescuentoMonto.gridy =iPosYOrderBy;
			this.gridBagConstraintsDescuentoMonto.gridx =iPosXOrderBy;
			this.gridBagConstraintsDescuentoMonto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDescuentoMonto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDescuentoMonto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDescuentoMonto);
			
			this.jInternalFrameOrderByDescuentoMonto.getContentPane().add(this.jScrollPanelOrderByDescuentoMonto, this.gridBagConstraintsDescuentoMonto);			
		
		} else {
			this.jButtonAbrirOrderByDescuentoMonto = new JButtonMe();
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
			&& this.descuentomontoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDescuentoMonto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDescuentoMonto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDescuentoMonto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDescuentoMonto.getRowHeight();//DescuentoMontoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDescuentoMonto.isSelected()) {
					iHeightTable=DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDescuentoMonto.isSelected()) {
					iHeightTable=DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DescuentoMontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDescuentoMonto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDescuentoMonto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDescuentoMonto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDescuentoMonto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDescuentoMonto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDescuentoMonto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDescuentoMonto!=null && this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy()!=null) {
			//if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDescuentoMonto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDescuentoMonto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDescuentoMonto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDescuentoMonto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDescuentoMonto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDescuentoMonto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=descuentomontoLogic.getDescuentoMontos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=descuentomontos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DescuentoMonto> TraerDescuentoMontoBeans(List<DescuentoMonto> descuentomontos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DescuentoMonto descuentomonto:descuentomontos) {
					
				if(!(DescuentoMontoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DescuentoMontoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					descuentomonto.setsDetalleGeneralEntityReporte(DescuentoMontoConstantesFunciones.getDescuentoMontoDescripcion(descuentomonto));
										
					descuentomonto.setesta_activo_descripcion(DescuentoMontoConstantesFunciones.getesta_activoDescripcion(descuentomonto));	
					
						
					
				} else  {
							
					//descuentomonto.setsDetalleGeneralEntityReporte(descuentomonto.getsDetalleGeneralEntityReporte());
										
				}
				
				//descuentomontobeans.add(descuentomontobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return descuentomontos;
    }
	//PARA REPORTES FIN
}
