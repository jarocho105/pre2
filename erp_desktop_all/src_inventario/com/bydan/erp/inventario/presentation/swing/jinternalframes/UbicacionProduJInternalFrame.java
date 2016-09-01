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
import com.bydan.erp.inventario.util.UbicacionProduConstantesFunciones;

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
public class UbicacionProduJInternalFrame extends UbicacionProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUbicacionProdu;
	
	protected JMenuBar jmenuBarUbicacionProdu;
	
	protected JMenu jmenuUbicacionProdu;
	protected JMenu jmenuDatosUbicacionProdu;
	protected JMenu jmenuArchivoUbicacionProdu;
	protected JMenu jmenuAccionesUbicacionProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUbicacionProdu;	
	protected GridBagConstraints gridBagConstraintsUbicacionProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UbicacionProduDetalleFormJInternalFrame jInternalFrameDetalleFormUbicacionProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUbicacionProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUbicacionProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ubicacionbode="";
	
	public UbicacionProduSessionBean ubicacionproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UbicacionBodeSessionBean ubicacionbodeSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UbicacionProdu> ubicacionprodus;		
	public List<UbicacionProdu> ubicacionprodusEliminados;	
	public List<UbicacionProdu> ubicacionprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUbicacionProdu;		
	protected JButton jButtonAbrirOrderByUbicacionProdu;
	
	
	//protected JPanel jPanelOrderByUbicacionProdu;
	//public JScrollPane jScrollPanelOrderByUbicacionProdu;	
	//protected JButton jButtonCerrarOrderByUbicacionProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UbicacionProduLogic ubicacionproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUbicacionProdu;
	public JScrollPane jScrollPanelDatosEdicionUbicacionProdu;
	public JScrollPane jScrollPanelDatosGeneralUbicacionProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosUbicacionProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUbicacionProdu;
	//public JScrollPane jScrollPanelImportacionUbicacionProdu;
	
	
	
	protected JPanel jPanelAccionesUbicacionProdu;
	
    protected JPanel jPanelPaginacionUbicacionProdu;
    protected JPanel jPanelParametrosReportesUbicacionProdu;
	protected JPanel jPanelParametrosReportesAccionesUbicacionProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UbicacionProdu;
	protected JPanel jPanelParametrosAuxiliar2UbicacionProdu;
	protected JPanel jPanelParametrosAuxiliar3UbicacionProdu;
	protected JPanel jPanelParametrosAuxiliar4UbicacionProdu;
	//protected JPanel jPanelParametrosAuxiliar5UbicacionProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoUbicacionProdu;
	//protected JPanel jPanelImportacionUbicacionProdu;
	
	
	public JTable jTableDatosUbicacionProdu;
	
	
	
	//public JTable jTableDatosUbicacionProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUbicacionProdu;
	protected JButton jButtonDuplicarUbicacionProdu;
	protected JButton jButtonCopiarUbicacionProdu;
	protected JButton jButtonVerFormUbicacionProdu;
	protected JButton jButtonNuevoRelacionesUbicacionProdu;
	protected JButton jButtonModificarUbicacionProdu;
	
    protected JButton jButtonGuardarCambiosTablaUbicacionProdu;
	protected JButton jButtonCerrarUbicacionProdu;
	
	
	protected JButton jButtonRecargarInformacionUbicacionProdu;
	protected JButton jButtonProcesarInformacionUbicacionProdu;
	
	
	protected JButton jButtonAnterioresUbicacionProdu;
	protected JButton jButtonSiguientesUbicacionProdu;
	protected JButton jButtonNuevoGuardarCambiosUbicacionProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUbicacionProdu;
	//protected JButton jButtonCerrarReporteDinamicoUbicacionProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoUbicacionProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionUbicacionProdu;
	//protected JButton jButtonGenerarImportacionUbicacionProdu;
	//protected JButton jButtonCerrarImportacionUbicacionProdu;
	//protected JFileChooser jFileChooserImportacionUbicacionProdu;
	//protected File fileImportacionUbicacionProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUbicacionProdu;
	protected JButton jButtonDuplicarToolBarUbicacionProdu;
	protected JButton jButtonNuevoRelacionesToolBarUbicacionProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarUbicacionProdu;
	protected JButton jButtonCopiarToolBarUbicacionProdu;
	protected JButton jButtonVerFormToolBarUbicacionProdu;
	public JButton jButtonGuardarCambiosTablaToolBarUbicacionProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarUbicacionProdu;
	protected JButton jButtonCerrarToolBarUbicacionProdu;
	
	protected JButton jButtonRecargarInformacionToolBarUbicacionProdu;
	protected JButton jButtonProcesarInformacionToolBarUbicacionProdu;
	protected JButton jButtonAnterioresToolBarUbicacionProdu;
	protected JButton jButtonSiguientesToolBarUbicacionProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarUbicacionProdu;
	protected JButton jButtonAbrirOrderByToolBarUbicacionProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUbicacionProdu;
	protected JMenuItem jMenuItemDuplicarUbicacionProdu;
	protected JMenuItem jMenuItemNuevoRelacionesUbicacionProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUbicacionProdu;
	protected JMenuItem jMenuItemCopiarUbicacionProdu;
	protected JMenuItem jMenuItemVerFormUbicacionProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaUbicacionProdu;
	protected JMenuItem jMenuItemCerrarUbicacionProdu;
	protected JMenuItem jMenuItemDetalleCerrarUbicacionProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUbicacionProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarUbicacionProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionUbicacionProdu;
	protected JMenuItem jMenuItemProcesarInformacionUbicacionProdu;
	protected JMenuItem jMenuItemAnterioresUbicacionProdu;
	protected JMenuItem jMenuItemSiguientesUbicacionProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUbicacionProdu;
	protected JMenuItem jMenuItemAbrirOrderByUbicacionProdu;
	protected JMenuItem jMenuItemMostrarOcultarUbicacionProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUbicacionProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUbicacionProdu;
	protected JCheckBox jCheckBoxSeleccionadosUbicacionProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUbicacionProdu;
	protected JCheckBox jCheckBoxConGraficoReporteUbicacionProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUbicacionProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUbicacionProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUbicacionProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUbicacionProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUbicacionProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUbicacionProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUbicacionProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUbicacionProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUbicacionProdu;
	protected JTextField jTextFieldValorCampoGeneralUbicacionProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUbicacionProdu;
	//public JList<Reporte> jListColumnasSelectReporteUbicacionProdu;
	//public JScrollPane jScrollColumnasSelectReporteUbicacionProdu;
	
	//public JLabel jLabelRelacionesSelectReporteUbicacionProdu;
	//public JList<Reporte> jListRelacionesSelectReporteUbicacionProdu;
	//public JScrollPane jScrollRelacionesSelectReporteUbicacionProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUbicacionProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUbicacionProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUbicacionProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoUbicacionProdu;
	
		
	//public JLabel jLabelArchivoImportacionUbicacionProdu;	
	//public JLabel jLabelPathArchivoImportacionUbicacionProdu;
	//protected JTextField jTextFieldPathArchivoImportacionUbicacionProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUbicacionProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUbicacionProdu;
	
	//public JLabel jLabelColumnaCategoriaValorUbicacionProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUbicacionProdu;
	
	//public JLabel jLabelColumnasValoresGraficoUbicacionProdu;
	//public JList<Reporte> jListColumnasValoresGraficoUbicacionProdu;
	//public JScrollPane jScrollColumnasValoresGraficoUbicacionProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUbicacionProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUbicacionProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUbicacionProdu;
	public JPanel jPanelFK_IdBodegaUbicacionProdu;
	public JButton jButtonFK_IdBodegaUbicacionProdu;
	public JPanel jPanelFK_IdUbicacionBodeUbicacionProdu;
	public JButton jButtonFK_IdUbicacionBodeUbicacionProdu;
	
	public JPanel jPanelid_bodegaFK_IdBodegaUbicacionProdu;
	public JLabel jLabelid_bodegaFK_IdBodegaUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaUbicacionProdu;
	public JButton jButtonid_bodegaFK_IdBodegaUbicacionProdu= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaUbicacionProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu;
	public JLabel jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu;
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProduUpdate= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProduBusqueda= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProduArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UbicacionProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUbicacionProdu)	{
		this.jButtonRecargarInformacionUbicacionProdu = jButtonRecargarInformacionUbicacionProdu;
	}
	
	public JButton getjButtonProcesarInformacionUbicacionProdu() {
		return this.jButtonProcesarInformacionUbicacionProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUbicacionProdu)	{
		this.jButtonProcesarInformacionUbicacionProdu = jButtonProcesarInformacionUbicacionProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionUbicacionProdu() {
		return this.jButtonRecargarInformacionUbicacionProdu;
	}
	
	
	public List<UbicacionProdu> getubicacionprodus() {
		return this.ubicacionprodus;
	}

	public void setubicacionprodus(List<UbicacionProdu> ubicacionprodus) {
		this.ubicacionprodus = ubicacionprodus;
	}
	
	public List<UbicacionProdu> getubicacionprodusAux() {
		return this.ubicacionprodusAux;
	}

	public void setubicacionprodusAux(List<UbicacionProdu> ubicacionprodusAux) {
		this.ubicacionprodusAux = ubicacionprodusAux;
	}
	
	public List<UbicacionProdu> getubicacionprodusEliminados() {
		return this.ubicacionprodusEliminados;
	}

	public void setUbicacionProdusEliminados(List<UbicacionProdu> ubicacionprodusEliminados) {
		this.ubicacionprodusEliminados = ubicacionprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUbicacionProdu() {
		return jComboBoxTiposSeleccionarUbicacionProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUbicacionProdu(
			JComboBox jComboBoxTiposSeleccionarUbicacionProdu) {
		this.jComboBoxTiposSeleccionarUbicacionProdu = jComboBoxTiposSeleccionarUbicacionProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUbicacionProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUbicacionProdu() {
		return jTextFieldValorCampoGeneralUbicacionProdu;
	}

	public void setjTextFieldValorCampoGeneralUbicacionProdu(
			JTextField jTextFieldValorCampoGeneralUbicacionProdu) {
		this.jTextFieldValorCampoGeneralUbicacionProdu = jTextFieldValorCampoGeneralUbicacionProdu;
	}

	public void setBorderResaltarValorCampoGeneralUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUbicacionProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUbicacionProdu() {
		return this.jCheckBoxSeleccionarTodosUbicacionProdu;
	}

	public void setjCheckBoxSeleccionarTodosUbicacionProdu(
			JCheckBox jCheckBoxSeleccionarTodosUbicacionProdu) {
		this.jCheckBoxSeleccionarTodosUbicacionProdu = jCheckBoxSeleccionarTodosUbicacionProdu;
	}

	public void setBorderResaltarSeleccionarTodosUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUbicacionProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUbicacionProdu() {
		return this.jCheckBoxSeleccionadosUbicacionProdu;
	}

	public void setjCheckBoxSeleccionadosUbicacionProdu(
			JCheckBox jCheckBoxSeleccionadosUbicacionProdu) {
		this.jCheckBoxSeleccionadosUbicacionProdu = jCheckBoxSeleccionadosUbicacionProdu;
	}
	
	public void setBorderResaltarSeleccionadosUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUbicacionProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUbicacionProdu() {
		return this.jComboBoxTiposArchivosReportesUbicacionProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUbicacionProdu(
			JComboBox jComboBoxTiposArchivosReportesUbicacionProdu) {
		this.jComboBoxTiposArchivosReportesUbicacionProdu = jComboBoxTiposArchivosReportesUbicacionProdu;
	}

	public void setBorderResaltarTiposArchivosReportesUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUbicacionProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUbicacionProdu() {
		return this.jComboBoxTiposReportesUbicacionProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUbicacionProdu(
			JComboBox jComboBoxTiposReportesUbicacionProdu) {
		this.jComboBoxTiposReportesUbicacionProdu = jComboBoxTiposReportesUbicacionProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUbicacionProdu() {
	//	return jComboBoxTiposReportesDinamicoUbicacionProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUbicacionProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoUbicacionProdu) {
	//	this.jComboBoxTiposReportesDinamicoUbicacionProdu = jComboBoxTiposReportesDinamicoUbicacionProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUbicacionProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoUbicacionProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUbicacionProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUbicacionProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu = jComboBoxTiposArchivosReportesDinamicoUbicacionProdu;
	//}
	
	public void setBorderResaltarTiposReportesUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUbicacionProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUbicacionProdu() {
		return this.jComboBoxTiposGraficosReportesUbicacionProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUbicacionProdu(
			JComboBox jComboBoxTiposGraficosReportesUbicacionProdu) {
		this.jComboBoxTiposGraficosReportesUbicacionProdu = jComboBoxTiposGraficosReportesUbicacionProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUbicacionProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUbicacionProdu() {
		return this.jComboBoxTiposPaginacionUbicacionProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUbicacionProdu(
			JComboBox jComboBoxTiposPaginacionUbicacionProdu) {
		this.jComboBoxTiposPaginacionUbicacionProdu = jComboBoxTiposPaginacionUbicacionProdu;
	}
	
	public void setBorderResaltarTiposPaginacionUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUbicacionProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUbicacionProdu() {
		return this.jComboBoxTiposRelacionesUbicacionProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUbicacionProdu() {
		return this.jComboBoxTiposAccionesUbicacionProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUbicacionProdu(
			JComboBox jComboBoxTiposRelacionesUbicacionProdu) {
		this.jComboBoxTiposRelacionesUbicacionProdu = jComboBoxTiposRelacionesUbicacionProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUbicacionProdu(
			JComboBox jComboBoxTiposAccionesUbicacionProdu) {
		this.jComboBoxTiposAccionesUbicacionProdu = jComboBoxTiposAccionesUbicacionProdu;
	}
	
	public void setBorderResaltarTiposRelacionesUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUbicacionProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUbicacionProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUbicacionProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUbicacionProdu() {
	//	return jCheckBoxConGraficoDinamicoUbicacionProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoUbicacionProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoUbicacionProdu) {
	//	this.jCheckBoxConGraficoDinamicoUbicacionProdu = jCheckBoxConGraficoDinamicoUbicacionProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUbicacionProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUbicacionProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUbicacionProdu .setBorder(borderResaltar);		
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
		this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		
		this.ubicacionproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ubicacionproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ubicacionproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UbicacionProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ubicacion Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
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
		
		UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UbicacionProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUbicacionProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"nuevo","nuevo","Nuevo"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"duplicar","duplicar","Duplicar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"copiar","copiar","Copiar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"ver_form","ver_form","Ver"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"recargar","recargar","Recargar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUbicacionProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUbicacionProdu,this.jTtoolBarUbicacionProdu,
							"cerrar","cerrar","Salir"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUbicacionProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUbicacionProdu;
			
				this.jButtonProcesarInformacionToolBarUbicacionProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUbicacionProdu;
				
		//protected JButton jButtonModificarToolBarUbicacionProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUbicacionProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUbicacionProdu=new JMenuMe("General");
		this.jmenuArchivoUbicacionProdu=new JMenuMe("Archivo");
		this.jmenuAccionesUbicacionProdu=new JMenuMe("Acciones");
		this.jmenuDatosUbicacionProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUbicacionProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUbicacionProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUbicacionProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUbicacionProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUbicacionProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUbicacionProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUbicacionProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUbicacionProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUbicacionProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUbicacionProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUbicacionProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUbicacionProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUbicacionProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUbicacionProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUbicacionProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUbicacionProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUbicacionProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUbicacionProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUbicacionProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUbicacionProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUbicacionProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUbicacionProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUbicacionProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUbicacionProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUbicacionProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUbicacionProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUbicacionProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUbicacionProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUbicacionProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUbicacionProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUbicacionProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUbicacionProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUbicacionProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUbicacionProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUbicacionProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUbicacionProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUbicacionProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUbicacionProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUbicacionProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUbicacionProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUbicacionProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUbicacionProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUbicacionProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUbicacionProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUbicacionProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUbicacionProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUbicacionProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUbicacionProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUbicacionProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUbicacionProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUbicacionProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUbicacionProdu.add(this.jMenuItemCerrarUbicacionProdu);
			
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemNuevoUbicacionProdu);
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemNuevoGuardarCambiosUbicacionProdu);
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemNuevoRelacionesUbicacionProdu);
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemGuardarCambiosTablaUbicacionProdu);		
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemDuplicarUbicacionProdu);		
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemCopiarUbicacionProdu);		
			this.jmenuAccionesUbicacionProdu.add(this.jMenuItemVerFormUbicacionProdu);		
			
			this.jmenuDatosUbicacionProdu.add(this.jMenuItemRecargarInformacionUbicacionProdu);				
			this.jmenuDatosUbicacionProdu.add(this.jMenuItemAnterioresUbicacionProdu);				
			this.jmenuDatosUbicacionProdu.add(this.jMenuItemSiguientesUbicacionProdu);				
			this.jmenuDatosUbicacionProdu.add(this.jMenuItemAbrirOrderByUbicacionProdu);				
			this.jmenuDatosUbicacionProdu.add(this.jMenuItemMostrarOcultarUbicacionProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUbicacionProdu.add(this.jMenuItemGuardarCambiosUbicacionProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUbicacionProdu.add(this.jmenuArchivoUbicacionProdu);		
			this.jmenuBarUbicacionProdu.add(this.jmenuAccionesUbicacionProdu);		
			this.jmenuBarUbicacionProdu.add(this.jmenuDatosUbicacionProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUbicacionProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUbicacionProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaUbicacionProdu.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaUbicacionProdu= new JButtonMe();
		this.jButtonFK_IdBodegaUbicacionProdu.setText("Buscar");
		this.jButtonFK_IdBodegaUbicacionProdu.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaUbicacionProdu,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaUbicacionProdu = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaUbicacionProdu.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaUbicacionProdu.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaUbicacionProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaUbicacionProdu= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaUbicacionProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUbicacionBodeUbicacionProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUbicacionBodeUbicacionProdu.setToolTipText("Buscar Por Ubicacion Bodega ");
		this.jButtonFK_IdUbicacionBodeUbicacionProdu= new JButtonMe();
		this.jButtonFK_IdUbicacionBodeUbicacionProdu.setText("Buscar");
		this.jButtonFK_IdUbicacionBodeUbicacionProdu.setToolTipText("Buscar Por Ubicacion Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUbicacionBodeUbicacionProdu,"buscar_button","Buscar Por Ubicacion Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUbicacionBodeUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu = new JLabelMe();
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setText("Ubicacion Bodega :");
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setToolTipText("Ubicacion Bodega");
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu= new JComboBoxMe();
		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUbicacionProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasUbicacionProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUbicacionProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUbicacionProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUbicacionProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUbicacionProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUbicacionProdu = new UbicacionProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ubicacion Producto DATOS");
			this.jInternalFrameDetalleFormUbicacionProdu = new UbicacionProduDetalleFormJInternalFrame(jDesktopPane,this.ubicacionproduSessionBean.getConGuardarRelaciones(),this.ubicacionproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUbicacionProdu = null;//new UbicacionProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUbicacionProdu= new GridBagLayout();
		
		
		this.jTableDatosUbicacionProdu = new JTableMe();      
		
		String sToolTipUbicacionProdu="";
		sToolTipUbicacionProdu=UbicacionProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUbicacionProdu+="(Inventario.UbicacionProdu)";
		}
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipUbicacionProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUbicacionProdu.setToolTipText(sToolTipUbicacionProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUbicacionProdu);
		this.jTableDatosUbicacionProdu.setAutoCreateRowSorter(true);
		this.jTableDatosUbicacionProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUbicacionProdu.setRowSelectionAllowed(true);
		this.jTableDatosUbicacionProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUbicacionProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUbicacionProdu = new JButtonMe();
		this.jButtonDuplicarUbicacionProdu = new JButtonMe();
		this.jButtonCopiarUbicacionProdu = new JButtonMe();
		this.jButtonVerFormUbicacionProdu = new JButtonMe();
		this.jButtonNuevoRelacionesUbicacionProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUbicacionProdu = new JButtonMe();
		this.jButtonCerrarUbicacionProdu = new JButtonMe();
		
		this.jScrollPanelDatosUbicacionProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralUbicacionProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ubicacion Producto";
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosUbicacionProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUbicacionProdu.setToolTipText("Acciones");
        this.jPanelAccionesUbicacionProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUbicacionProdu=new ReporteDinamicoJInternalFrame(UbicacionProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUbicacionProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUbicacionProdu=new ImportacionJInternalFrame(UbicacionProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUbicacionProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUbicacionProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByUbicacionProdu.setText("Orden");
		this.jButtonAbrirOrderByUbicacionProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUbicacionProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUbicacionProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionProdu,false,this);
			
			//this.cargarOrderByUbicacionProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUbicacionProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionProdu,true,this);
			
			//this.cargarOrderByUbicacionProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUbicacionProdu.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosUbicacionProdu.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosUbicacionProdu.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosUbicacionProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUbicacionProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUbicacionProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUbicacionProdu.setText("Nuevo");
		this.jButtonDuplicarUbicacionProdu.setText("Duplicar");
		this.jButtonCopiarUbicacionProdu.setText("Copiar");
		this.jButtonVerFormUbicacionProdu.setText("Ver");
		this.jButtonNuevoRelacionesUbicacionProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.setText("Guardar");
		this.jButtonCerrarUbicacionProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUbicacionProdu,"nuevo_button","Nuevo",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUbicacionProdu,"duplicar_button","Duplicar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUbicacionProdu,"copiar_button","Copiar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUbicacionProdu,"ver_form","Ver",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUbicacionProdu,"nuevorelaciones_button","Nuevo Rel",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUbicacionProdu,"guardarcambiostabla_button","Guardar",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUbicacionProdu,"cerrar_button","Salir",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUbicacionProdu.setToolTipText("Nuevo"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUbicacionProdu.setToolTipText("Duplicar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUbicacionProdu.setToolTipText("Copiar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUbicacionProdu.setToolTipText("Ver"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUbicacionProdu.setToolTipText("Nuevo Rel"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.setToolTipText("Guardar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUbicacionProdu.setToolTipText("Salir"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUbicacionProdu";
		inputMap = this.jButtonNuevoUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUbicacionProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUbicacionProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarUbicacionProdu";
		inputMap = this.jButtonDuplicarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUbicacionProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUbicacionProdu"));
		
		//COPIAR
		sMapKey = "CopiarUbicacionProdu";
		inputMap = this.jButtonCopiarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUbicacionProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUbicacionProdu"));
		
		//VEr FORM
		sMapKey = "VerFormUbicacionProdu";
		inputMap = this.jButtonVerFormUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUbicacionProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUbicacionProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUbicacionProdu";
		inputMap = this.jButtonNuevoRelacionesUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUbicacionProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUbicacionProdu";
		inputMap = this.jButtonModificarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUbicacionProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUbicacionProdu";
		inputMap = this.jButtonCerrarUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUbicacionProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUbicacionProdu";
		inputMap = this.jButtonGuardarCambiosTablaUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUbicacionProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UbicacionProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UbicacionProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UbicacionProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UbicacionProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UbicacionProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUbicacionProdu.setName("jPanelParametrosReportesUbicacionProdu"); 
		
		this.jPanelParametrosReportesAccionesUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUbicacionProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUbicacionProdu.setName("jPanelParametrosReportesAccionesUbicacionProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUbicacionProdu = new JButtonMe();
		this.jButtonRecargarInformacionUbicacionProdu.setText("Recargar");
		this.jButtonRecargarInformacionUbicacionProdu.setToolTipText("Recargar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUbicacionProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUbicacionProdu = new JButtonMe();
		this.jButtonProcesarInformacionUbicacionProdu.setText("Procesar");
		this.jButtonProcesarInformacionUbicacionProdu.setToolTipText("Procesar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUbicacionProdu.setVisible(false);
			
		this.jButtonProcesarInformacionUbicacionProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUbicacionProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUbicacionProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUbicacionProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUbicacionProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUbicacionProdu.setText("TIPO");       
		this.jComboBoxTiposReportesUbicacionProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUbicacionProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUbicacionProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUbicacionProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionUbicacionProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUbicacionProdu.setText("Accion");
		this.jComboBoxTiposRelacionesUbicacionProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUbicacionProdu.setText("Accion");
		this.jComboBoxTiposAccionesUbicacionProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUbicacionProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUbicacionProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarUbicacionProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUbicacionProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUbicacionProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUbicacionProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUbicacionProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUbicacionProdu = new JLabelMe();
		
		this.jLabelAccionesUbicacionProdu.setText("Acciones");		
		this.jLabelAccionesUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUbicacionProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUbicacionProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUbicacionProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUbicacionProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUbicacionProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUbicacionProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUbicacionProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUbicacionProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUbicacionProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUbicacionProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUbicacionProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteUbicacionProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUbicacionProdu = new JButtonMe();
		//this.jButtonAnterioresUbicacionProdu.setText("<<");
        this.jButtonAnterioresUbicacionProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUbicacionProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUbicacionProdu = new JButtonMe();
		//this.jButtonSiguientesUbicacionProdu.setText(">>");
        this.jButtonSiguientesUbicacionProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUbicacionProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUbicacionProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUbicacionProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosUbicacionProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUbicacionProdu,"nuevoguardarcambios_button","Nue",this.ubicacionproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUbicacionProdu";
		inputMap = this.jButtonNuevoGuardarCambiosUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUbicacionProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUbicacionProdu";
		inputMap = this.jButtonRecargarInformacionUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUbicacionProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUbicacionProdu";
		inputMap = this.jButtonSiguientesUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUbicacionProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUbicacionProdu";
		inputMap = this.jButtonAnterioresUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUbicacionProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUbicacionProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUbicacionProdu.setMinimumSize(new Dimension(this.getWidth(),UbicacionProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UbicacionProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUbicacionProdu.setMaximumSize(new Dimension(this.getWidth(),UbicacionProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UbicacionProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUbicacionProdu.setPreferredSize(new Dimension(this.getWidth(),UbicacionProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UbicacionProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUbicacionProdu = new GridBagLayout();

			this.jPanelPaginacionUbicacionProdu.setLayout(gridaBagLayoutPaginacionUbicacionProdu);						
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 0;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonAnterioresUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
					
						
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUbicacionProdu.gridy = 0;
			
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonNuevoGuardarCambiosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
						
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUbicacionProdu.gridy = 0;
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonSiguientesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 1;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonNuevoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
						
			
			
			if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
				this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUbicacionProdu.gridy = 1;
				this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUbicacionProdu.add(this.jButtonGuardarCambiosTablaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			}
			
			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 1;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonDuplicarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 1;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonCopiarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 1;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonVerFormUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 1;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUbicacionProdu.add(this.jButtonCerrarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
		
		
		this.jButtonRecargarInformacionUbicacionProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUbicacionProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUbicacionProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUbicacionProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUbicacionProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUbicacionProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUbicacionProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUbicacionProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUbicacionProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUbicacionProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUbicacionProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUbicacionProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUbicacionProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUbicacionProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUbicacionProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUbicacionProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUbicacionProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUbicacionProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUbicacionProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUbicacionProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUbicacionProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUbicacionProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUbicacionProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUbicacionProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUbicacionProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUbicacionProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUbicacionProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUbicacionProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUbicacionProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUbicacionProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUbicacionProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUbicacionProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUbicacionProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUbicacionProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUbicacionProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUbicacionProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UbicacionProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UbicacionProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UbicacionProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UbicacionProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUbicacionProdu.setLayout(gridaBagParametrosReportesUbicacionProdu);
			this.jPanelParametrosReportesAccionesUbicacionProdu.setLayout(gridaBagParametrosReportesAccionesUbicacionProdu);
			
			
			this.jPanelParametrosAuxiliar1UbicacionProdu.setLayout(gridaBagParametrosAuxiliar1UbicacionProdu);
			this.jPanelParametrosAuxiliar2UbicacionProdu.setLayout(gridaBagParametrosAuxiliar2UbicacionProdu);
			this.jPanelParametrosAuxiliar3UbicacionProdu.setLayout(gridaBagParametrosAuxiliar3UbicacionProdu);
			this.jPanelParametrosAuxiliar4UbicacionProdu.setLayout(gridaBagParametrosAuxiliar4UbicacionProdu);
			//this.jPanelParametrosAuxiliar5UbicacionProdu.setLayout(gridaBagParametrosAuxiliar2UbicacionProdu);			
			
			
			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionProdu.add(this.jButtonRecargarInformacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UbicacionProdu.add(this.jComboBoxTiposPaginacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UbicacionProdu.add(this.jCheckBoxConAltoMaximoTablaUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UbicacionProdu.add(this.jComboBoxTiposArchivosReportesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionProdu.add(this.jPanelParametrosAuxiliar1UbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UbicacionProdu.add(this.jComboBoxTiposReportesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionProdu.add(this.jPanelParametrosAuxiliar4UbicacionProdu, this.gridBagConstraintsUbicacionProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionProdu.add(this.jComboBoxTiposReportesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionProdu.add(this.jCheckBoxGenerarReporteUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionProdu.add(this.jPanelParametrosAuxiliar2UbicacionProdu, this.gridBagConstraintsUbicacionProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionProdu.add(this.jLabelAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
				this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUbicacionProdu.add(this.jButtonAbrirOrderByUbicacionProdu, this.gridBagConstraintsUbicacionProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionProdu.add(this.jComboBoxTiposSeleccionarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
			
			
			/*
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionProdu.add(this.jCheckBoxSeleccionarTodosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UbicacionProdu.add(this.jCheckBoxSeleccionarTodosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);															
				
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UbicacionProdu.add(this.jCheckBoxSeleccionadosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionProdu.add(this.jPanelParametrosAuxiliar3UbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionProdu.add(this.jComboBoxTiposAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
	
				
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionProdu.add(this.jTextFieldValorCampoGeneralUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUbicacionProdu = new GridBagLayout();

			this.jScrollPanelDatosUbicacionProdu.setLayout(gridaBagLayoutDatosUbicacionProdu);
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = 0;
			this.gridBagConstraintsUbicacionProdu.gridx = 0;
			
			this.jScrollPanelDatosUbicacionProdu.add(this.jTableDatosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUbicacionProdu.setViewportView(this.jTableDatosUbicacionProdu);
		this.jTableDatosUbicacionProdu.setFillsViewportHeight(true);
		this.jTableDatosUbicacionProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUbicacionProdu= new GridBagLayout();
		this.jPanelAccionesUbicacionProdu.setLayout(gridaBagLayoutAccionesUbicacionProdu);
		
		
		/*	
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = 0;
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
			
		this.jPanelAccionesUbicacionProdu.add(this.jButtonNuevoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaUbicacionProdu= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaUbicacionProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaUbicacionProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaUbicacionProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaUbicacionProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaUbicacionProdu.setLayout(gridaBagLayoutFK_IdBodegaUbicacionProdu);

		gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionProdu.gridy = 0;
		gridBagConstraintsUbicacionProdu.gridx = 0;
		jPanelFK_IdBodegaUbicacionProdu.add(jLabelid_bodegaFK_IdBodegaUbicacionProdu, gridBagConstraintsUbicacionProdu);

		gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionProdu.gridy = 0;
		gridBagConstraintsUbicacionProdu.gridx = 1;
		jPanelFK_IdBodegaUbicacionProdu.add(jComboBoxid_bodegaFK_IdBodegaUbicacionProdu, gridBagConstraintsUbicacionProdu);

		gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionProdu.gridy = 1;
		gridBagConstraintsUbicacionProdu.gridx =1;
		jPanelFK_IdBodegaUbicacionProdu.add(jButtonFK_IdBodegaUbicacionProdu, gridBagConstraintsUbicacionProdu);

		jTabbedPaneBusquedasUbicacionProdu.addTab("1.-Por Bodega ", jPanelFK_IdBodegaUbicacionProdu);
		jTabbedPaneBusquedasUbicacionProdu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdUbicacionBodeUbicacionProdu= new GridBagLayout();
		gridaBagLayoutFK_IdUbicacionBodeUbicacionProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUbicacionBodeUbicacionProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUbicacionBodeUbicacionProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUbicacionBodeUbicacionProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUbicacionBodeUbicacionProdu.setLayout(gridaBagLayoutFK_IdUbicacionBodeUbicacionProdu);

		gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionProdu.gridy = 0;
		gridBagConstraintsUbicacionProdu.gridx = 0;
		jPanelFK_IdUbicacionBodeUbicacionProdu.add(jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu, gridBagConstraintsUbicacionProdu);

		gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionProdu.gridy = 0;
		gridBagConstraintsUbicacionProdu.gridx = 1;
		jPanelFK_IdUbicacionBodeUbicacionProdu.add(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionProdu, gridBagConstraintsUbicacionProdu);

		gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionProdu.gridy = 1;
		gridBagConstraintsUbicacionProdu.gridx =1;
		jPanelFK_IdUbicacionBodeUbicacionProdu.add(jButtonFK_IdUbicacionBodeUbicacionProdu, gridBagConstraintsUbicacionProdu);

		jTabbedPaneBusquedasUbicacionProdu.addTab("2.-Por Ubicacion Bodega ", jPanelFK_IdUbicacionBodeUbicacionProdu);
		jTabbedPaneBusquedasUbicacionProdu.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUbicacionProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUbicacionProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();						
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUbicacionProdu.gridx = 0;		
			//this.gridBagConstraintsUbicacionProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUbicacionProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUbicacionProdu, this.gridBagConstraintsUbicacionProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUbicacionProdu.gridx = 0;		
		//this.gridBagConstraintsUbicacionProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUbicacionProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUbicacionProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUbicacionProdu.gridx = 0;		
			this.gridBagConstraintsUbicacionProdu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUbicacionProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUbicacionProdu, this.gridBagConstraintsUbicacionProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);								
		
		
		/*
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		*/		
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUbicacionProdu.gridx =0;
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUbicacionProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
				
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UbicacionProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUbicacionProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUbicacionProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosUbicacionProdu.setLayout(gridaBagLayoutBusquedasParametrosUbicacionProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUbicacionProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUbicacionProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
			
			
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
			
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUbicacionProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUbicacionProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUbicacionProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUbicacionProdu.setName("jPanelReporteDinamicoUbicacionProdu"); 
		
		this.jPanelReporteDinamicoUbicacionProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUbicacionProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUbicacionProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUbicacionProdu.setLayout(gridaBagLayoutReporteDinamicoUbicacionProdu);
		
		
		this.jInternalFrameReporteDinamicoUbicacionProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUbicacionProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUbicacionProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUbicacionProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUbicacionProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUbicacionProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUbicacionProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUbicacionProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUbicacionProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoUbicacionProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoUbicacionProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUbicacionProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUbicacionProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUbicacionProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUbicacionProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteUbicacionProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jLabelColumnasSelectReporteUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUbicacionProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteUbicacionProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUbicacionProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUbicacionProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUbicacionProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUbicacionProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUbicacionProdu=new JScrollPane(this.jListColumnasSelectReporteUbicacionProdu);
			
			this.jScrollColumnasSelectReporteUbicacionProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUbicacionProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUbicacionProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUbicacionProdu.add(this.jListColumnasSelectReporteUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jScrollColumnasSelectReporteUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUbicacionProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteUbicacionProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUbicacionProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteUbicacionProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUbicacionProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUbicacionProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUbicacionProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUbicacionProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUbicacionProdu=new JScrollPane(this.jListRelacionesSelectReporteUbicacionProdu);
			
			this.jScrollRelacionesSelectReporteUbicacionProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUbicacionProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUbicacionProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUbicacionProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUbicacionProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoUbicacionProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUbicacionProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUbicacionProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUbicacionProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUbicacionProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUbicacionProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUbicacionProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUbicacionProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jLabelGenerarExcelReporteDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUbicacionProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUbicacionProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUbicacionProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUbicacionProdu.setToolTipText("Generar EXCEL"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUbicacionProdu.add(this.jButtonGenerarExcelReporteDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jComboBoxTiposReportesDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUbicacionProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUbicacionProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jLabelTiposArchivoReporteDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jComboBoxTiposArchivosReportesDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUbicacionProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUbicacionProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUbicacionProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUbicacionProdu.setToolTipText("Generar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jButtonGenerarReporteDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUbicacionProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUbicacionProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUbicacionProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUbicacionProdu.setToolTipText("Cancelar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionProdu.add(this.jButtonCerrarReporteDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUbicacionProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUbicacionProdu= new JScrollPane(jPanelReporteDinamicoUbicacionProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUbicacionProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUbicacionProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUbicacionProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUbicacionProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUbicacionProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUbicacionProdu);
		this.jInternalFrameReporteDinamicoUbicacionProdu.getContentPane().add(this.jScrollPanelReporteDinamicoUbicacionProdu, this.gridBagConstraintsUbicacionProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUbicacionProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUbicacionProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUbicacionProdu.setName("jPanelImportacionUbicacionProdu"); 
		
		this.jPanelImportacionUbicacionProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUbicacionProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUbicacionProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUbicacionProdu.setLayout(gridaBagLayoutImportacionUbicacionProdu);
		
		
		this.jInternalFrameImportacionUbicacionProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUbicacionProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUbicacionProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUbicacionProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUbicacionProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUbicacionProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUbicacionProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUbicacionProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUbicacionProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUbicacionProdu.setResizable(true);
	    this.jInternalFrameImportacionUbicacionProdu.setClosable(true);
	    this.jInternalFrameImportacionUbicacionProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUbicacionProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUbicacionProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUbicacionProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUbicacionProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUbicacionProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUbicacionProdu.setResizable(true);
	    this.jInternalFrameImportacionUbicacionProdu.setClosable(true);
	    this.jInternalFrameImportacionUbicacionProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUbicacionProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUbicacionProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUbicacionProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUbicacionProdu = new JLabelMe();

		this.jLabelArchivoImportacionUbicacionProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUbicacionProdu.add(this.jLabelArchivoImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUbicacionProdu = new JFileChooser();		
		this.jFileChooserImportacionUbicacionProdu.setToolTipText("ESCOGER ARCHIVO"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUbicacionProdu = new JButtonMe();
		this.jButtonAbrirImportacionUbicacionProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUbicacionProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUbicacionProdu.setToolTipText("Generar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionProdu.add(this.jButtonAbrirImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUbicacionProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionUbicacionProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUbicacionProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUbicacionProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUbicacionProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUbicacionProdu.add(this.jLabelPathArchivoImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUbicacionProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUbicacionProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUbicacionProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUbicacionProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionProdu.add(this.jTextFieldPathArchivoImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUbicacionProdu = new JButtonMe();
		this.jButtonGenerarImportacionUbicacionProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUbicacionProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUbicacionProdu.setToolTipText("Generar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionProdu.add(this.jButtonGenerarImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUbicacionProdu = new JButtonMe();
		this.jButtonCerrarImportacionUbicacionProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUbicacionProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUbicacionProdu.setToolTipText("Cancelar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionProdu.add(this.jButtonCerrarImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUbicacionProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionUbicacionProdu= new JScrollPane(jPanelImportacionUbicacionProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
		this.gridBagConstraintsUbicacionProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsUbicacionProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUbicacionProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUbicacionProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUbicacionProdu);
		this.jInternalFrameImportacionUbicacionProdu.getContentPane().add(this.jScrollPanelImportacionUbicacionProdu, this.gridBagConstraintsUbicacionProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUbicacionProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUbicacionProdu = new JButtonMe();
			this.jButtonAbrirOrderByUbicacionProdu.setText("Orden");
			this.jButtonAbrirOrderByUbicacionProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUbicacionProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUbicacionProdu";
			inputMap = this.jButtonAbrirOrderByUbicacionProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUbicacionProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUbicacionProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByUbicacionProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUbicacionProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUbicacionProdu.setName("jPanelOrderByUbicacionProdu"); 
			
			this.jPanelOrderByUbicacionProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUbicacionProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUbicacionProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUbicacionProdu.setLayout(gridaBagLayoutOrderByUbicacionProdu);
			
			
			this.jTableDatosUbicacionProduOrderBy = new JTableMe();        
			this.jTableDatosUbicacionProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUbicacionProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUbicacionProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUbicacionProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUbicacionProduOrderBy.setViewportView(this.jTableDatosUbicacionProduOrderBy);
			this.jTableDatosUbicacionProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUbicacionProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUbicacionProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUbicacionProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUbicacionProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUbicacionProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUbicacionProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUbicacionProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUbicacionProdu.setTitle("Orden");
			this.jInternalFrameOrderByUbicacionProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUbicacionProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUbicacionProdu.setResizable(true);
			this.jInternalFrameOrderByUbicacionProdu.setClosable(true);
			this.jInternalFrameOrderByUbicacionProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUbicacionProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUbicacionProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUbicacionProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUbicacionProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUbicacionProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUbicacionProdu.ipady =150;
				
			this.jPanelOrderByUbicacionProdu.add(jScrollPanelDatosUbicacionProduOrderBy, this.gridBagConstraintsUbicacionProdu);//this.jTableDatosUbicacionProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUbicacionProdu = new JButtonMe();
			this.jButtonCerrarOrderByUbicacionProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUbicacionProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUbicacionProdu.setToolTipText("Cancelar"+" "+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUbicacionProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUbicacionProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUbicacionProdu.add(this.jButtonCerrarOrderByUbicacionProdu, this.gridBagConstraintsUbicacionProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUbicacionProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByUbicacionProdu= new JScrollPane(jPanelOrderByUbicacionProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUbicacionProdu = new GridBagConstraints();
			this.gridBagConstraintsUbicacionProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsUbicacionProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsUbicacionProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUbicacionProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUbicacionProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUbicacionProdu);
			
			this.jInternalFrameOrderByUbicacionProdu.getContentPane().add(this.jScrollPanelOrderByUbicacionProdu, this.gridBagConstraintsUbicacionProdu);			
		
		} else {
			this.jButtonAbrirOrderByUbicacionProdu = new JButtonMe();
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
			&& this.ubicacionproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUbicacionProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUbicacionProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUbicacionProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUbicacionProdu.getRowHeight();//UbicacionProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UbicacionProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUbicacionProdu.isSelected()) {
					iHeightTable=UbicacionProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UbicacionProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UbicacionProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UbicacionProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUbicacionProdu.isSelected()) {
					iHeightTable=UbicacionProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UbicacionProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UbicacionProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUbicacionProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUbicacionProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUbicacionProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUbicacionProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUbicacionProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUbicacionProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUbicacionProdu!=null && this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUbicacionProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUbicacionProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUbicacionProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUbicacionProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUbicacionProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUbicacionProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUbicacionProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ubicacionproduLogic.getUbicacionProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ubicacionprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UbicacionProdu> TraerUbicacionProduBeans(List<UbicacionProdu> ubicacionprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(UbicacionProdu ubicacionprodu:ubicacionprodus) {
					
				if(!(UbicacionProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UbicacionProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ubicacionprodu.setsDetalleGeneralEntityReporte(UbicacionProduConstantesFunciones.getUbicacionProduDescripcion(ubicacionprodu));
										
						
					
						
					
				} else  {
							
					//ubicacionprodu.setsDetalleGeneralEntityReporte(ubicacionprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//ubicacionprodubeans.add(ubicacionprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ubicacionprodus;
    }
	//PARA REPORTES FIN
}
