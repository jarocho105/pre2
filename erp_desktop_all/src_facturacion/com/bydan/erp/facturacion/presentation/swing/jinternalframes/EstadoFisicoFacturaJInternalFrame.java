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
import com.bydan.erp.facturacion.util.EstadoFisicoFacturaConstantesFunciones;

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
public class EstadoFisicoFacturaJInternalFrame extends EstadoFisicoFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoFisicoFactura;
	
	protected JMenuBar jmenuBarEstadoFisicoFactura;
	
	protected JMenu jmenuEstadoFisicoFactura;
	protected JMenu jmenuDatosEstadoFisicoFactura;
	protected JMenu jmenuArchivoEstadoFisicoFactura;
	protected JMenu jmenuAccionesEstadoFisicoFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFisicoFactura;	
	protected GridBagConstraints gridBagConstraintsEstadoFisicoFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoFisicoFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoFisicoFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoFisicoFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoFisicoFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public EstadoFisicoFacturaSessionBean estadofisicofacturaSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoFisicoFactura> estadofisicofacturas;		
	public List<EstadoFisicoFactura> estadofisicofacturasEliminados;	
	public List<EstadoFisicoFactura> estadofisicofacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoFisicoFactura;		
	protected JButton jButtonAbrirOrderByEstadoFisicoFactura;
	
	
	//protected JPanel jPanelOrderByEstadoFisicoFactura;
	//public JScrollPane jScrollPanelOrderByEstadoFisicoFactura;	
	//protected JButton jButtonCerrarOrderByEstadoFisicoFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoFisicoFacturaLogic estadofisicofacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoFisicoFactura;
	public JScrollPane jScrollPanelDatosEdicionEstadoFisicoFactura;
	public JScrollPane jScrollPanelDatosGeneralEstadoFisicoFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoFisicoFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoFisicoFactura;
	//public JScrollPane jScrollPanelImportacionEstadoFisicoFactura;
	
	
	
	protected JPanel jPanelAccionesEstadoFisicoFactura;
	
    protected JPanel jPanelPaginacionEstadoFisicoFactura;
    protected JPanel jPanelParametrosReportesEstadoFisicoFactura;
	protected JPanel jPanelParametrosReportesAccionesEstadoFisicoFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoFisicoFactura;
	protected JPanel jPanelParametrosAuxiliar2EstadoFisicoFactura;
	protected JPanel jPanelParametrosAuxiliar3EstadoFisicoFactura;
	protected JPanel jPanelParametrosAuxiliar4EstadoFisicoFactura;
	//protected JPanel jPanelParametrosAuxiliar5EstadoFisicoFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoFisicoFactura;
	//protected JPanel jPanelImportacionEstadoFisicoFactura;
	
	
	public JTable jTableDatosEstadoFisicoFactura;
	
	
	
	//public JTable jTableDatosEstadoFisicoFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoFisicoFactura;
	protected JButton jButtonDuplicarEstadoFisicoFactura;
	protected JButton jButtonCopiarEstadoFisicoFactura;
	protected JButton jButtonVerFormEstadoFisicoFactura;
	protected JButton jButtonNuevoRelacionesEstadoFisicoFactura;
	protected JButton jButtonModificarEstadoFisicoFactura;
	
    protected JButton jButtonGuardarCambiosTablaEstadoFisicoFactura;
	protected JButton jButtonCerrarEstadoFisicoFactura;
	
	
	protected JButton jButtonRecargarInformacionEstadoFisicoFactura;
	protected JButton jButtonProcesarInformacionEstadoFisicoFactura;
	
	
	protected JButton jButtonAnterioresEstadoFisicoFactura;
	protected JButton jButtonSiguientesEstadoFisicoFactura;
	protected JButton jButtonNuevoGuardarCambiosEstadoFisicoFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoFisicoFactura;
	//protected JButton jButtonCerrarReporteDinamicoEstadoFisicoFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoFisicoFactura;
	//protected JButton jButtonGenerarImportacionEstadoFisicoFactura;
	//protected JButton jButtonCerrarImportacionEstadoFisicoFactura;
	//protected JFileChooser jFileChooserImportacionEstadoFisicoFactura;
	//protected File fileImportacionEstadoFisicoFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFisicoFactura;
	protected JButton jButtonDuplicarToolBarEstadoFisicoFactura;
	protected JButton jButtonNuevoRelacionesToolBarEstadoFisicoFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoFisicoFactura;
	protected JButton jButtonCopiarToolBarEstadoFisicoFactura;
	protected JButton jButtonVerFormToolBarEstadoFisicoFactura;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFisicoFactura;
	protected JButton jButtonCerrarToolBarEstadoFisicoFactura;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoFisicoFactura;
	protected JButton jButtonProcesarInformacionToolBarEstadoFisicoFactura;
	protected JButton jButtonAnterioresToolBarEstadoFisicoFactura;
	protected JButton jButtonSiguientesToolBarEstadoFisicoFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoFisicoFactura;
	protected JButton jButtonAbrirOrderByToolBarEstadoFisicoFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFisicoFactura;
	protected JMenuItem jMenuItemDuplicarEstadoFisicoFactura;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoFisicoFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoFisicoFactura;
	protected JMenuItem jMenuItemCopiarEstadoFisicoFactura;
	protected JMenuItem jMenuItemVerFormEstadoFisicoFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFisicoFactura;
	protected JMenuItem jMenuItemCerrarEstadoFisicoFactura;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFisicoFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoFisicoFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFisicoFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoFisicoFactura;
	protected JMenuItem jMenuItemProcesarInformacionEstadoFisicoFactura;
	protected JMenuItem jMenuItemAnterioresEstadoFisicoFactura;
	protected JMenuItem jMenuItemSiguientesEstadoFisicoFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFisicoFactura;
	protected JMenuItem jMenuItemAbrirOrderByEstadoFisicoFactura;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFisicoFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFisicoFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoFisicoFactura;
	protected JCheckBox jCheckBoxSeleccionadosEstadoFisicoFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoFisicoFactura;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoFisicoFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoFisicoFactura;
	protected JTextField jTextFieldValorCampoGeneralEstadoFisicoFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoFisicoFactura;
	//public JList<Reporte> jListColumnasSelectReporteEstadoFisicoFactura;
	//public JScrollPane jScrollColumnasSelectReporteEstadoFisicoFactura;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoFisicoFactura;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoFisicoFactura;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoFisicoFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoFisicoFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoFisicoFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura;
	
		
	//public JLabel jLabelArchivoImportacionEstadoFisicoFactura;	
	//public JLabel jLabelPathArchivoImportacionEstadoFisicoFactura;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoFisicoFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoFisicoFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoFisicoFactura;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoFisicoFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoFisicoFactura;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoFisicoFactura;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoFisicoFactura;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoFisicoFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoFisicoFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoFisicoFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadoFisicoFactura;
	public JPanel jPanelFK_IdPaisEstadoFisicoFactura;
	public JButton jButtonFK_IdPaisEstadoFisicoFactura;
	
	public JPanel jPanelid_paisFK_IdPaisEstadoFisicoFactura;
	public JLabel jLabelid_paisFK_IdPaisEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisEstadoFisicoFactura;
	public JButton jButtonid_paisFK_IdPaisEstadoFisicoFactura= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEstadoFisicoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEstadoFisicoFacturaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoFisicoFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoFisicoFactura)	{
		this.jButtonRecargarInformacionEstadoFisicoFactura = jButtonRecargarInformacionEstadoFisicoFactura;
	}
	
	public JButton getjButtonProcesarInformacionEstadoFisicoFactura() {
		return this.jButtonProcesarInformacionEstadoFisicoFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFisicoFactura)	{
		this.jButtonProcesarInformacionEstadoFisicoFactura = jButtonProcesarInformacionEstadoFisicoFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoFisicoFactura() {
		return this.jButtonRecargarInformacionEstadoFisicoFactura;
	}
	
	
	public List<EstadoFisicoFactura> getestadofisicofacturas() {
		return this.estadofisicofacturas;
	}

	public void setestadofisicofacturas(List<EstadoFisicoFactura> estadofisicofacturas) {
		this.estadofisicofacturas = estadofisicofacturas;
	}
	
	public List<EstadoFisicoFactura> getestadofisicofacturasAux() {
		return this.estadofisicofacturasAux;
	}

	public void setestadofisicofacturasAux(List<EstadoFisicoFactura> estadofisicofacturasAux) {
		this.estadofisicofacturasAux = estadofisicofacturasAux;
	}
	
	public List<EstadoFisicoFactura> getestadofisicofacturasEliminados() {
		return this.estadofisicofacturasEliminados;
	}

	public void setEstadoFisicoFacturasEliminados(List<EstadoFisicoFactura> estadofisicofacturasEliminados) {
		this.estadofisicofacturasEliminados = estadofisicofacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoFisicoFactura() {
		return jComboBoxTiposSeleccionarEstadoFisicoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoFisicoFactura(
			JComboBox jComboBoxTiposSeleccionarEstadoFisicoFactura) {
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura = jComboBoxTiposSeleccionarEstadoFisicoFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoFisicoFactura() {
		return jTextFieldValorCampoGeneralEstadoFisicoFactura;
	}

	public void setjTextFieldValorCampoGeneralEstadoFisicoFactura(
			JTextField jTextFieldValorCampoGeneralEstadoFisicoFactura) {
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura = jTextFieldValorCampoGeneralEstadoFisicoFactura;
	}

	public void setBorderResaltarValorCampoGeneralEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoFisicoFactura() {
		return this.jCheckBoxSeleccionarTodosEstadoFisicoFactura;
	}

	public void setjCheckBoxSeleccionarTodosEstadoFisicoFactura(
			JCheckBox jCheckBoxSeleccionarTodosEstadoFisicoFactura) {
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura = jCheckBoxSeleccionarTodosEstadoFisicoFactura;
	}

	public void setBorderResaltarSeleccionarTodosEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoFisicoFactura() {
		return this.jCheckBoxSeleccionadosEstadoFisicoFactura;
	}

	public void setjCheckBoxSeleccionadosEstadoFisicoFactura(
			JCheckBox jCheckBoxSeleccionadosEstadoFisicoFactura) {
		this.jCheckBoxSeleccionadosEstadoFisicoFactura = jCheckBoxSeleccionadosEstadoFisicoFactura;
	}
	
	public void setBorderResaltarSeleccionadosEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoFisicoFactura() {
		return this.jComboBoxTiposArchivosReportesEstadoFisicoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoFisicoFactura(
			JComboBox jComboBoxTiposArchivosReportesEstadoFisicoFactura) {
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura = jComboBoxTiposArchivosReportesEstadoFisicoFactura;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoFisicoFactura() {
		return this.jComboBoxTiposReportesEstadoFisicoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoFisicoFactura(
			JComboBox jComboBoxTiposReportesEstadoFisicoFactura) {
		this.jComboBoxTiposReportesEstadoFisicoFactura = jComboBoxTiposReportesEstadoFisicoFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoFisicoFactura() {
	//	return jComboBoxTiposReportesDinamicoEstadoFisicoFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoFisicoFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoFisicoFactura) {
	//	this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura = jComboBoxTiposReportesDinamicoEstadoFisicoFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura = jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura;
	//}
	
	public void setBorderResaltarTiposReportesEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoFisicoFactura() {
		return this.jComboBoxTiposGraficosReportesEstadoFisicoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoFisicoFactura(
			JComboBox jComboBoxTiposGraficosReportesEstadoFisicoFactura) {
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura = jComboBoxTiposGraficosReportesEstadoFisicoFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoFisicoFactura() {
		return this.jComboBoxTiposPaginacionEstadoFisicoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoFisicoFactura(
			JComboBox jComboBoxTiposPaginacionEstadoFisicoFactura) {
		this.jComboBoxTiposPaginacionEstadoFisicoFactura = jComboBoxTiposPaginacionEstadoFisicoFactura;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoFisicoFactura() {
		return this.jComboBoxTiposRelacionesEstadoFisicoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFisicoFactura() {
		return this.jComboBoxTiposAccionesEstadoFisicoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFisicoFactura(
			JComboBox jComboBoxTiposRelacionesEstadoFisicoFactura) {
		this.jComboBoxTiposRelacionesEstadoFisicoFactura = jComboBoxTiposRelacionesEstadoFisicoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFisicoFactura(
			JComboBox jComboBoxTiposAccionesEstadoFisicoFactura) {
		this.jComboBoxTiposAccionesEstadoFisicoFactura = jComboBoxTiposAccionesEstadoFisicoFactura;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoFisicoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoFisicoFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoFisicoFactura() {
	//	return jCheckBoxConGraficoDinamicoEstadoFisicoFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoFisicoFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoFisicoFactura) {
	//	this.jCheckBoxConGraficoDinamicoEstadoFisicoFactura = jCheckBoxConGraficoDinamicoEstadoFisicoFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoFisicoFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoFisicoFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoFisicoFactura .setBorder(borderResaltar);		
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
		this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
		
		this.estadofisicofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofisicofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofisicofacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoFisicoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoFisicoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFisicoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFisicoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFisicoFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Fisico Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoFisicoFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoFisicoFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"nuevo","nuevo","Nuevo"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"duplicar","duplicar","Duplicar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"copiar","copiar","Copiar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"ver_form","ver_form","Ver"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"recargar","recargar","Recargar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,
							"cerrar","cerrar","Salir"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoFisicoFactura;
			
				this.jButtonProcesarInformacionToolBarEstadoFisicoFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoFisicoFactura;
				
		//protected JButton jButtonModificarToolBarEstadoFisicoFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoFisicoFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoFisicoFactura=new JMenuMe("General");
		this.jmenuArchivoEstadoFisicoFactura=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoFisicoFactura=new JMenuMe("Acciones");
		this.jmenuDatosEstadoFisicoFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFisicoFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFisicoFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFisicoFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoFisicoFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoFisicoFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoFisicoFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoFisicoFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoFisicoFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoFisicoFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoFisicoFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFisicoFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFisicoFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoFisicoFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoFisicoFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoFisicoFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoFisicoFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoFisicoFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoFisicoFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFisicoFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFisicoFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFisicoFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoFisicoFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoFisicoFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoFisicoFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoFisicoFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoFisicoFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoFisicoFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoFisicoFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoFisicoFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoFisicoFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoFisicoFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoFisicoFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoFisicoFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoFisicoFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoFisicoFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoFisicoFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFisicoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFisicoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFisicoFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoFisicoFactura.add(this.jMenuItemCerrarEstadoFisicoFactura);
			
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemNuevoEstadoFisicoFactura);
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura);
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemNuevoRelacionesEstadoFisicoFactura);
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura);		
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemDuplicarEstadoFisicoFactura);		
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemCopiarEstadoFisicoFactura);		
			this.jmenuAccionesEstadoFisicoFactura.add(this.jMenuItemVerFormEstadoFisicoFactura);		
			
			this.jmenuDatosEstadoFisicoFactura.add(this.jMenuItemRecargarInformacionEstadoFisicoFactura);				
			this.jmenuDatosEstadoFisicoFactura.add(this.jMenuItemAnterioresEstadoFisicoFactura);				
			this.jmenuDatosEstadoFisicoFactura.add(this.jMenuItemSiguientesEstadoFisicoFactura);				
			this.jmenuDatosEstadoFisicoFactura.add(this.jMenuItemAbrirOrderByEstadoFisicoFactura);				
			this.jmenuDatosEstadoFisicoFactura.add(this.jMenuItemMostrarOcultarEstadoFisicoFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoFisicoFactura.add(this.jMenuItemGuardarCambiosEstadoFisicoFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoFisicoFactura.add(this.jmenuArchivoEstadoFisicoFactura);		
			this.jmenuBarEstadoFisicoFactura.add(this.jmenuAccionesEstadoFisicoFactura);		
			this.jmenuBarEstadoFisicoFactura.add(this.jmenuDatosEstadoFisicoFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoFisicoFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoFisicoFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisEstadoFisicoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisEstadoFisicoFactura.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisEstadoFisicoFactura= new JButtonMe();
		this.jButtonFK_IdPaisEstadoFisicoFactura.setText("Buscar");
		this.jButtonFK_IdPaisEstadoFisicoFactura.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisEstadoFisicoFactura,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisEstadoFisicoFactura = new JLabelMe();
		jLabelid_paisFK_IdPaisEstadoFisicoFactura.setText("Pais :");
		jLabelid_paisFK_IdPaisEstadoFisicoFactura.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisEstadoFisicoFactura= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstadoFisicoFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadoFisicoFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoFisicoFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoFisicoFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadoFisicoFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadoFisicoFactura = new EstadoFisicoFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Fisico Factura DATOS");
			this.jInternalFrameDetalleFormEstadoFisicoFactura = new EstadoFisicoFacturaDetalleFormJInternalFrame(jDesktopPane,this.estadofisicofacturaSessionBean.getConGuardarRelaciones(),this.estadofisicofacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoFisicoFactura = null;//new EstadoFisicoFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFisicoFactura= new GridBagLayout();
		
		
		this.jTableDatosEstadoFisicoFactura = new JTableMe();      
		
		String sToolTipEstadoFisicoFactura="";
		sToolTipEstadoFisicoFactura=EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFisicoFactura+="(Facturacion.EstadoFisicoFactura)";
		}
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFisicoFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoFisicoFactura.setToolTipText(sToolTipEstadoFisicoFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoFisicoFactura);
		this.jTableDatosEstadoFisicoFactura.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoFisicoFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoFisicoFactura.setRowSelectionAllowed(true);
		this.jTableDatosEstadoFisicoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoFisicoFactura = new JButtonMe();
		this.jButtonDuplicarEstadoFisicoFactura = new JButtonMe();
		this.jButtonCopiarEstadoFisicoFactura = new JButtonMe();
		this.jButtonVerFormEstadoFisicoFactura = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoFisicoFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura = new JButtonMe();
		this.jButtonCerrarEstadoFisicoFactura = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFisicoFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoFisicoFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Fisico Factura";
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFisicoFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFisicoFactura.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFisicoFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoFisicoFactura=new ReporteDinamicoJInternalFrame(EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoFisicoFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoFisicoFactura=new ImportacionJInternalFrame(EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoFisicoFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoFisicoFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoFisicoFactura.setText("Orden");
		this.jButtonAbrirOrderByEstadoFisicoFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFisicoFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFisicoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFactura,false,this);
			
			//this.cargarOrderByEstadoFisicoFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFisicoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFactura,true,this);
			
			//this.cargarOrderByEstadoFisicoFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoFisicoFactura.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoFisicoFactura.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoFisicoFactura.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoFisicoFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFisicoFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFisicoFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoFisicoFactura.setText("Nuevo");
		this.jButtonDuplicarEstadoFisicoFactura.setText("Duplicar");
		this.jButtonCopiarEstadoFisicoFactura.setText("Copiar");
		this.jButtonVerFormEstadoFisicoFactura.setText("Ver");
		this.jButtonNuevoRelacionesEstadoFisicoFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.setText("Guardar");
		this.jButtonCerrarEstadoFisicoFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFisicoFactura,"nuevo_button","Nuevo",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoFisicoFactura,"duplicar_button","Duplicar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoFisicoFactura,"copiar_button","Copiar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoFisicoFactura,"ver_form","Ver",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoFisicoFactura,"nuevorelaciones_button","Nuevo Rel",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFisicoFactura,"guardarcambiostabla_button","Guardar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFisicoFactura,"cerrar_button","Salir",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoFisicoFactura.setToolTipText("Nuevo"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoFisicoFactura.setToolTipText("Duplicar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoFisicoFactura.setToolTipText("Copiar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoFisicoFactura.setToolTipText("Ver"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoFisicoFactura.setToolTipText("Nuevo Rel"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.setToolTipText("Guardar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFisicoFactura.setToolTipText("Salir"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFisicoFactura";
		inputMap = this.jButtonNuevoEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFisicoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFisicoFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoFisicoFactura";
		inputMap = this.jButtonDuplicarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoFisicoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoFisicoFactura"));
		
		//COPIAR
		sMapKey = "CopiarEstadoFisicoFactura";
		inputMap = this.jButtonCopiarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoFisicoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoFisicoFactura"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoFisicoFactura";
		inputMap = this.jButtonVerFormEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoFisicoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoFisicoFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoFisicoFactura";
		inputMap = this.jButtonNuevoRelacionesEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoFisicoFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoFisicoFactura";
		inputMap = this.jButtonModificarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoFisicoFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoFisicoFactura";
		inputMap = this.jButtonCerrarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFisicoFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFisicoFactura";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFisicoFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoFisicoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoFisicoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoFisicoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoFisicoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoFisicoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoFisicoFactura.setName("jPanelParametrosReportesEstadoFisicoFactura"); 
		
		this.jPanelParametrosReportesAccionesEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoFisicoFactura.setName("jPanelParametrosReportesAccionesEstadoFisicoFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoFisicoFactura = new JButtonMe();
		this.jButtonRecargarInformacionEstadoFisicoFactura.setText("Recargar");
		this.jButtonRecargarInformacionEstadoFisicoFactura.setToolTipText("Recargar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoFisicoFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoFisicoFactura = new JButtonMe();
		this.jButtonProcesarInformacionEstadoFisicoFactura.setText("Procesar");
		this.jButtonProcesarInformacionEstadoFisicoFactura.setToolTipText("Procesar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoFisicoFactura.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoFisicoFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFisicoFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFisicoFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoFisicoFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoFisicoFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoFisicoFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoFisicoFactura.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoFisicoFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFisicoFactura.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoFisicoFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoFisicoFactura = new JLabelMe();
		
		this.jLabelAccionesEstadoFisicoFactura.setText("Acciones");		
		this.jLabelAccionesEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoFisicoFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoFisicoFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoFisicoFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoFisicoFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoFisicoFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoFisicoFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoFisicoFactura = new JButtonMe();
		//this.jButtonAnterioresEstadoFisicoFactura.setText("<<");
        this.jButtonAnterioresEstadoFisicoFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoFisicoFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoFisicoFactura = new JButtonMe();
		//this.jButtonSiguientesEstadoFisicoFactura.setText(">>");
        this.jButtonSiguientesEstadoFisicoFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoFisicoFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoFisicoFactura,"nuevoguardarcambios_button","Nue",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoFisicoFactura";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoFisicoFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoFisicoFactura";
		inputMap = this.jButtonRecargarInformacionEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoFisicoFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoFisicoFactura";
		inputMap = this.jButtonSiguientesEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoFisicoFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoFisicoFactura";
		inputMap = this.jButtonAnterioresEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoFisicoFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoFisicoFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoFisicoFactura.setMinimumSize(new Dimension(this.getWidth(),EstadoFisicoFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFisicoFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFisicoFactura.setMaximumSize(new Dimension(this.getWidth(),EstadoFisicoFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFisicoFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFisicoFactura.setPreferredSize(new Dimension(this.getWidth(),EstadoFisicoFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFisicoFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoFisicoFactura = new GridBagLayout();

			this.jPanelPaginacionEstadoFisicoFactura.setLayout(gridaBagLayoutPaginacionEstadoFisicoFactura);						
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonAnterioresEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
					
						
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
			
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonNuevoGuardarCambiosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
						
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonSiguientesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonNuevoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
						
			
			
			if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFisicoFactura.gridy = 1;
				this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonGuardarCambiosTablaEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			}
			
			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonDuplicarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonCopiarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonVerFormEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoFisicoFactura.add(this.jButtonCerrarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
		
		
		this.jButtonRecargarInformacionEstadoFisicoFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFisicoFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFisicoFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoFisicoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFisicoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFisicoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoFisicoFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFisicoFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFisicoFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoFisicoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFisicoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFisicoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoFisicoFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFisicoFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFisicoFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoFisicoFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFisicoFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFisicoFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoFisicoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoFisicoFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoFisicoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoFisicoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoFisicoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoFisicoFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoFisicoFactura.setLayout(gridaBagParametrosReportesEstadoFisicoFactura);
			this.jPanelParametrosReportesAccionesEstadoFisicoFactura.setLayout(gridaBagParametrosReportesAccionesEstadoFisicoFactura);
			
			
			this.jPanelParametrosAuxiliar1EstadoFisicoFactura.setLayout(gridaBagParametrosAuxiliar1EstadoFisicoFactura);
			this.jPanelParametrosAuxiliar2EstadoFisicoFactura.setLayout(gridaBagParametrosAuxiliar2EstadoFisicoFactura);
			this.jPanelParametrosAuxiliar3EstadoFisicoFactura.setLayout(gridaBagParametrosAuxiliar3EstadoFisicoFactura);
			this.jPanelParametrosAuxiliar4EstadoFisicoFactura.setLayout(gridaBagParametrosAuxiliar4EstadoFisicoFactura);
			//this.jPanelParametrosAuxiliar5EstadoFisicoFactura.setLayout(gridaBagParametrosAuxiliar2EstadoFisicoFactura);			
			
			
			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jButtonRecargarInformacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFisicoFactura.add(this.jComboBoxTiposPaginacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFisicoFactura.add(this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFisicoFactura.add(this.jComboBoxTiposArchivosReportesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jPanelParametrosAuxiliar1EstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoFisicoFactura.add(this.jComboBoxTiposReportesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jPanelParametrosAuxiliar4EstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jComboBoxTiposReportesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jCheckBoxGenerarReporteEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jPanelParametrosAuxiliar2EstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jLabelAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jButtonAbrirOrderByEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jComboBoxTiposSeleccionarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
			
			
			/*
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jCheckBoxSeleccionarTodosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFisicoFactura.add(this.jCheckBoxSeleccionarTodosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);															
				
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFisicoFactura.add(this.jCheckBoxSeleccionadosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jPanelParametrosAuxiliar3EstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFactura.add(this.jComboBoxTiposAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoFisicoFactura = new GridBagLayout();

			this.jScrollPanelDatosEstadoFisicoFactura.setLayout(gridaBagLayoutDatosEstadoFisicoFactura);
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
			
			this.jScrollPanelDatosEstadoFisicoFactura.add(this.jTableDatosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoFisicoFactura.setViewportView(this.jTableDatosEstadoFisicoFactura);
		this.jTableDatosEstadoFisicoFactura.setFillsViewportHeight(true);
		this.jTableDatosEstadoFisicoFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoFisicoFactura= new GridBagLayout();
		this.jPanelAccionesEstadoFisicoFactura.setLayout(gridaBagLayoutAccionesEstadoFisicoFactura);
		
		
		/*	
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
			
		this.jPanelAccionesEstadoFisicoFactura.add(this.jButtonNuevoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisEstadoFisicoFactura= new GridBagLayout();
		gridaBagLayoutFK_IdPaisEstadoFisicoFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisEstadoFisicoFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisEstadoFisicoFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisEstadoFisicoFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisEstadoFisicoFactura.setLayout(gridaBagLayoutFK_IdPaisEstadoFisicoFactura);

		gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		gridBagConstraintsEstadoFisicoFactura.gridx = 0;
		jPanelFK_IdPaisEstadoFisicoFactura.add(jLabelid_paisFK_IdPaisEstadoFisicoFactura, gridBagConstraintsEstadoFisicoFactura);

		gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		gridBagConstraintsEstadoFisicoFactura.gridx = 1;
		jPanelFK_IdPaisEstadoFisicoFactura.add(jComboBoxid_paisFK_IdPaisEstadoFisicoFactura, gridBagConstraintsEstadoFisicoFactura);

		gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoFisicoFactura.gridy = 1;
		gridBagConstraintsEstadoFisicoFactura.gridx =1;
		jPanelFK_IdPaisEstadoFisicoFactura.add(jButtonFK_IdPaisEstadoFisicoFactura, gridBagConstraintsEstadoFisicoFactura);

		jTabbedPaneBusquedasEstadoFisicoFactura.addTab("1.-Por Pais ", jPanelFK_IdPaisEstadoFisicoFactura);
		jTabbedPaneBusquedasEstadoFisicoFactura.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFisicoFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFisicoFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;		
			//this.gridBagConstraintsEstadoFisicoFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFisicoFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;		
		//this.gridBagConstraintsEstadoFisicoFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoFisicoFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoFisicoFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;		
			this.gridBagConstraintsEstadoFisicoFactura.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadoFisicoFactura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);								
		
		
		/*
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		*/		
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFisicoFactura.gridx =0;
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFisicoFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
				
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoFisicoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFisicoFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoFisicoFactura.setLayout(gridaBagLayoutBusquedasParametrosEstadoFisicoFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoFisicoFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
			
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
			
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoFisicoFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoFisicoFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoFisicoFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoFisicoFactura.setName("jPanelReporteDinamicoEstadoFisicoFactura"); 
		
		this.jPanelReporteDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoFisicoFactura.setLayout(gridaBagLayoutReporteDinamicoEstadoFisicoFactura);
		
		
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoFisicoFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFisicoFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoFisicoFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoFisicoFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jLabelColumnasSelectReporteEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoFisicoFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoFisicoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoFisicoFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoFisicoFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFisicoFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFisicoFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoFisicoFactura=new JScrollPane(this.jListColumnasSelectReporteEstadoFisicoFactura);
			
			this.jScrollColumnasSelectReporteEstadoFisicoFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFisicoFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFisicoFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jListColumnasSelectReporteEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jScrollColumnasSelectReporteEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoFisicoFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoFisicoFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoFisicoFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoFisicoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoFisicoFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoFisicoFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFisicoFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFisicoFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoFisicoFactura=new JScrollPane(this.jListRelacionesSelectReporteEstadoFisicoFactura);
			
			this.jScrollRelacionesSelectReporteEstadoFisicoFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFisicoFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFisicoFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoFisicoFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoFisicoFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoFisicoFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura.setToolTipText("Generar EXCEL"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jComboBoxTiposReportesDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoFisicoFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoFisicoFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoFisicoFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoFisicoFactura.setToolTipText("Generar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jButtonGenerarReporteDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoFisicoFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoFisicoFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoFisicoFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoFisicoFactura.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFactura.add(this.jButtonCerrarReporteDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoFisicoFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoFisicoFactura= new JScrollPane(jPanelReporteDinamicoEstadoFisicoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoFisicoFactura);
		this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoFisicoFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoFisicoFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoFisicoFactura.setName("jPanelImportacionEstadoFisicoFactura"); 
		
		this.jPanelImportacionEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoFisicoFactura.setLayout(gridaBagLayoutImportacionEstadoFisicoFactura);
		
		
		this.jInternalFrameImportacionEstadoFisicoFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoFisicoFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoFisicoFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFisicoFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoFisicoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFisicoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFisicoFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoFisicoFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFisicoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFisicoFactura.setResizable(true);
	    this.jInternalFrameImportacionEstadoFisicoFactura.setClosable(true);
	    this.jInternalFrameImportacionEstadoFisicoFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoFisicoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFisicoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFisicoFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoFisicoFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFisicoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFisicoFactura.setResizable(true);
	    this.jInternalFrameImportacionEstadoFisicoFactura.setClosable(true);
	    this.jInternalFrameImportacionEstadoFisicoFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoFisicoFactura = new JLabelMe();

		this.jLabelArchivoImportacionEstadoFisicoFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFisicoFactura.add(this.jLabelArchivoImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoFisicoFactura = new JFileChooser();		
		this.jFileChooserImportacionEstadoFisicoFactura.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoFisicoFactura = new JButtonMe();
		this.jButtonAbrirImportacionEstadoFisicoFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoFisicoFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoFisicoFactura.setToolTipText("Generar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFactura.add(this.jButtonAbrirImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoFisicoFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoFisicoFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFisicoFactura.add(this.jLabelPathArchivoImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoFisicoFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoFisicoFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFisicoFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFisicoFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFactura.add(this.jTextFieldPathArchivoImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoFisicoFactura = new JButtonMe();
		this.jButtonGenerarImportacionEstadoFisicoFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoFisicoFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoFisicoFactura.setToolTipText("Generar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFactura.add(this.jButtonGenerarImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoFisicoFactura = new JButtonMe();
		this.jButtonCerrarImportacionEstadoFisicoFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoFisicoFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoFisicoFactura.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFactura.add(this.jButtonCerrarImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoFisicoFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoFisicoFactura= new JScrollPane(jPanelImportacionEstadoFisicoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoFisicoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoFisicoFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoFisicoFactura);
		this.jInternalFrameImportacionEstadoFisicoFactura.getContentPane().add(this.jScrollPanelImportacionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoFisicoFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoFisicoFactura = new JButtonMe();
			this.jButtonAbrirOrderByEstadoFisicoFactura.setText("Orden");
			this.jButtonAbrirOrderByEstadoFisicoFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFisicoFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoFisicoFactura";
			inputMap = this.jButtonAbrirOrderByEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoFisicoFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoFisicoFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoFisicoFactura.setName("jPanelOrderByEstadoFisicoFactura"); 
			
			this.jPanelOrderByEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoFisicoFactura.setLayout(gridaBagLayoutOrderByEstadoFisicoFactura);
			
			
			this.jTableDatosEstadoFisicoFacturaOrderBy = new JTableMe();        
			this.jTableDatosEstadoFisicoFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoFisicoFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoFisicoFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoFisicoFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoFisicoFacturaOrderBy.setViewportView(this.jTableDatosEstadoFisicoFacturaOrderBy);
			this.jTableDatosEstadoFisicoFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoFisicoFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoFisicoFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoFisicoFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoFisicoFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoFisicoFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoFisicoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoFisicoFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoFisicoFactura.setTitle("Orden");
			this.jInternalFrameOrderByEstadoFisicoFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoFisicoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoFisicoFactura.setResizable(true);
			this.jInternalFrameOrderByEstadoFisicoFactura.setClosable(true);
			this.jInternalFrameOrderByEstadoFisicoFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoFisicoFactura.ipady =150;
				
			this.jPanelOrderByEstadoFisicoFactura.add(jScrollPanelDatosEstadoFisicoFacturaOrderBy, this.gridBagConstraintsEstadoFisicoFactura);//this.jTableDatosEstadoFisicoFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoFisicoFactura = new JButtonMe();
			this.jButtonCerrarOrderByEstadoFisicoFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoFisicoFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoFisicoFactura.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoFisicoFactura.add(this.jButtonCerrarOrderByEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoFisicoFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoFisicoFactura= new JScrollPane(jPanelOrderByEstadoFisicoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoFisicoFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoFisicoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoFisicoFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoFisicoFactura);
			
			this.jInternalFrameOrderByEstadoFisicoFactura.getContentPane().add(this.jScrollPanelOrderByEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
		
		} else {
			this.jButtonAbrirOrderByEstadoFisicoFactura = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadofisicofacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoFisicoFactura.getRowHeight();//EstadoFisicoFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.isSelected()) {
					iHeightTable=EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFisicoFactura.isSelected()) {
					iHeightTable=EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFisicoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoFisicoFactura!=null && this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoFisicoFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoFisicoFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoFisicoFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadofisicofacturaLogic.getEstadoFisicoFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofisicofacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoFisicoFactura> TraerEstadoFisicoFacturaBeans(List<EstadoFisicoFactura> estadofisicofacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoFisicoFactura estadofisicofactura:estadofisicofacturas) {
					
				if(!(EstadoFisicoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoFisicoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadofisicofactura.setsDetalleGeneralEntityReporte(EstadoFisicoFacturaConstantesFunciones.getEstadoFisicoFacturaDescripcion(estadofisicofactura));
										
						
					
						
					
				} else  {
							
					//estadofisicofactura.setsDetalleGeneralEntityReporte(estadofisicofactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadofisicofacturabeans.add(estadofisicofacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadofisicofacturas;
    }
	//PARA REPORTES FIN
}
