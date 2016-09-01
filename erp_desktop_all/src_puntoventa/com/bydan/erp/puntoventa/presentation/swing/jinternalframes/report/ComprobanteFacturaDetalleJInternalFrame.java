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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaDetalleConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ComprobanteFacturaDetalleJInternalFrame extends ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComprobanteFacturaDetalle;
	
	protected JMenuBar jmenuBarComprobanteFacturaDetalle;
	
	protected JMenu jmenuComprobanteFacturaDetalle;
	protected JMenu jmenuDatosComprobanteFacturaDetalle;
	protected JMenu jmenuArchivoComprobanteFacturaDetalle;
	protected JMenu jmenuAccionesComprobanteFacturaDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteFacturaDetalle;	
	protected GridBagConstraints gridBagConstraintsComprobanteFacturaDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComprobanteFacturaDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormComprobanteFacturaDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComprobanteFacturaDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComprobanteFacturaDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ComprobanteFacturaDetalleSessionBean comprobantefacturadetalleSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComprobanteFacturaDetalle> comprobantefacturadetalles;		
	public List<ComprobanteFacturaDetalle> comprobantefacturadetallesEliminados;	
	public List<ComprobanteFacturaDetalle> comprobantefacturadetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComprobanteFacturaDetalle;		
	protected JButton jButtonAbrirOrderByComprobanteFacturaDetalle;
	
	
	//protected JPanel jPanelOrderByComprobanteFacturaDetalle;
	//public JScrollPane jScrollPanelOrderByComprobanteFacturaDetalle;	
	//protected JButton jButtonCerrarOrderByComprobanteFacturaDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComprobanteFacturaDetalleLogic comprobantefacturadetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComprobanteFacturaDetalle;
	public JScrollPane jScrollPanelDatosEdicionComprobanteFacturaDetalle;
	public JScrollPane jScrollPanelDatosGeneralComprobanteFacturaDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosComprobanteFacturaDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComprobanteFacturaDetalle;
	//public JScrollPane jScrollPanelImportacionComprobanteFacturaDetalle;
	
	
	
	protected JPanel jPanelAccionesComprobanteFacturaDetalle;
	
    protected JPanel jPanelPaginacionComprobanteFacturaDetalle;
    protected JPanel jPanelParametrosReportesComprobanteFacturaDetalle;
	protected JPanel jPanelParametrosReportesAccionesComprobanteFacturaDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComprobanteFacturaDetalle;
	protected JPanel jPanelParametrosAuxiliar2ComprobanteFacturaDetalle;
	protected JPanel jPanelParametrosAuxiliar3ComprobanteFacturaDetalle;
	protected JPanel jPanelParametrosAuxiliar4ComprobanteFacturaDetalle;
	//protected JPanel jPanelParametrosAuxiliar5ComprobanteFacturaDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoComprobanteFacturaDetalle;
	//protected JPanel jPanelImportacionComprobanteFacturaDetalle;
	
	
	public JTable jTableDatosComprobanteFacturaDetalle;
	
	
	
	//public JTable jTableDatosComprobanteFacturaDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComprobanteFacturaDetalle;
	protected JButton jButtonDuplicarComprobanteFacturaDetalle;
	protected JButton jButtonCopiarComprobanteFacturaDetalle;
	protected JButton jButtonVerFormComprobanteFacturaDetalle;
	protected JButton jButtonNuevoRelacionesComprobanteFacturaDetalle;
	protected JButton jButtonModificarComprobanteFacturaDetalle;
	
    protected JButton jButtonGuardarCambiosTablaComprobanteFacturaDetalle;
	protected JButton jButtonCerrarComprobanteFacturaDetalle;
	
	
	protected JButton jButtonRecargarInformacionComprobanteFacturaDetalle;
	protected JButton jButtonProcesarInformacionComprobanteFacturaDetalle;
	
	
	protected JButton jButtonAnterioresComprobanteFacturaDetalle;
	protected JButton jButtonSiguientesComprobanteFacturaDetalle;
	protected JButton jButtonNuevoGuardarCambiosComprobanteFacturaDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComprobanteFacturaDetalle;
	//protected JButton jButtonCerrarReporteDinamicoComprobanteFacturaDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionComprobanteFacturaDetalle;
	//protected JButton jButtonGenerarImportacionComprobanteFacturaDetalle;
	//protected JButton jButtonCerrarImportacionComprobanteFacturaDetalle;
	//protected JFileChooser jFileChooserImportacionComprobanteFacturaDetalle;
	//protected File fileImportacionComprobanteFacturaDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteFacturaDetalle;
	protected JButton jButtonDuplicarToolBarComprobanteFacturaDetalle;
	protected JButton jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarComprobanteFacturaDetalle;
	protected JButton jButtonCopiarToolBarComprobanteFacturaDetalle;
	protected JButton jButtonVerFormToolBarComprobanteFacturaDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteFacturaDetalle;
	protected JButton jButtonCerrarToolBarComprobanteFacturaDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarComprobanteFacturaDetalle;
	protected JButton jButtonProcesarInformacionToolBarComprobanteFacturaDetalle;
	protected JButton jButtonAnterioresToolBarComprobanteFacturaDetalle;
	protected JButton jButtonSiguientesToolBarComprobanteFacturaDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarComprobanteFacturaDetalle;
	protected JButton jButtonAbrirOrderByToolBarComprobanteFacturaDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemDuplicarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesComprobanteFacturaDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemCopiarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemVerFormComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemCerrarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemProcesarInformacionComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemAnterioresComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemSiguientesComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemAbrirOrderByComprobanteFacturaDetalle;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteFacturaDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteFacturaDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComprobanteFacturaDetalle;
	protected JCheckBox jCheckBoxSeleccionadosComprobanteFacturaDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComprobanteFacturaDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteFacturaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComprobanteFacturaDetalle;
	protected JTextField jTextFieldValorCampoGeneralComprobanteFacturaDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComprobanteFacturaDetalle;
	//public JList<Reporte> jListColumnasSelectReporteComprobanteFacturaDetalle;
	//public JScrollPane jScrollColumnasSelectReporteComprobanteFacturaDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteComprobanteFacturaDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteComprobanteFacturaDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteComprobanteFacturaDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComprobanteFacturaDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle;
	
		
	//public JLabel jLabelArchivoImportacionComprobanteFacturaDetalle;	
	//public JLabel jLabelPathArchivoImportacionComprobanteFacturaDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionComprobanteFacturaDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorComprobanteFacturaDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoComprobanteFacturaDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoComprobanteFacturaDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoComprobanteFacturaDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComprobanteFacturaDetalle;
	public JPanel jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	public JButton jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	
	public JPanel jPanelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	public JLabel jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;

	public JDateChooser jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	public JButton jButtonfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	public JLabel jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	//public JFormattedTextField jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;

	public JDateChooser jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle;
	public JButton jButtonfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalleBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComprobanteFacturaDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComprobanteFacturaDetalle)	{
		this.jButtonRecargarInformacionComprobanteFacturaDetalle = jButtonRecargarInformacionComprobanteFacturaDetalle;
	}
	
	public JButton getjButtonProcesarInformacionComprobanteFacturaDetalle() {
		return this.jButtonProcesarInformacionComprobanteFacturaDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteFacturaDetalle)	{
		this.jButtonProcesarInformacionComprobanteFacturaDetalle = jButtonProcesarInformacionComprobanteFacturaDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionComprobanteFacturaDetalle() {
		return this.jButtonRecargarInformacionComprobanteFacturaDetalle;
	}
	
	
	public List<ComprobanteFacturaDetalle> getcomprobantefacturadetalles() {
		return this.comprobantefacturadetalles;
	}

	public void setcomprobantefacturadetalles(List<ComprobanteFacturaDetalle> comprobantefacturadetalles) {
		this.comprobantefacturadetalles = comprobantefacturadetalles;
	}
	
	public List<ComprobanteFacturaDetalle> getcomprobantefacturadetallesAux() {
		return this.comprobantefacturadetallesAux;
	}

	public void setcomprobantefacturadetallesAux(List<ComprobanteFacturaDetalle> comprobantefacturadetallesAux) {
		this.comprobantefacturadetallesAux = comprobantefacturadetallesAux;
	}
	
	public List<ComprobanteFacturaDetalle> getcomprobantefacturadetallesEliminados() {
		return this.comprobantefacturadetallesEliminados;
	}

	public void setComprobanteFacturaDetallesEliminados(List<ComprobanteFacturaDetalle> comprobantefacturadetallesEliminados) {
		this.comprobantefacturadetallesEliminados = comprobantefacturadetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComprobanteFacturaDetalle() {
		return jComboBoxTiposSeleccionarComprobanteFacturaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposSeleccionarComprobanteFacturaDetalle) {
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle = jComboBoxTiposSeleccionarComprobanteFacturaDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComprobanteFacturaDetalle() {
		return jTextFieldValorCampoGeneralComprobanteFacturaDetalle;
	}

	public void setjTextFieldValorCampoGeneralComprobanteFacturaDetalle(
			JTextField jTextFieldValorCampoGeneralComprobanteFacturaDetalle) {
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle = jTextFieldValorCampoGeneralComprobanteFacturaDetalle;
	}

	public void setBorderResaltarValorCampoGeneralComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComprobanteFacturaDetalle() {
		return this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle;
	}

	public void setjCheckBoxSeleccionarTodosComprobanteFacturaDetalle(
			JCheckBox jCheckBoxSeleccionarTodosComprobanteFacturaDetalle) {
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle = jCheckBoxSeleccionarTodosComprobanteFacturaDetalle;
	}

	public void setBorderResaltarSeleccionarTodosComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComprobanteFacturaDetalle() {
		return this.jCheckBoxSeleccionadosComprobanteFacturaDetalle;
	}

	public void setjCheckBoxSeleccionadosComprobanteFacturaDetalle(
			JCheckBox jCheckBoxSeleccionadosComprobanteFacturaDetalle) {
		this.jCheckBoxSeleccionadosComprobanteFacturaDetalle = jCheckBoxSeleccionadosComprobanteFacturaDetalle;
	}
	
	public void setBorderResaltarSeleccionadosComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComprobanteFacturaDetalle() {
		return this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposArchivosReportesComprobanteFacturaDetalle) {
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle = jComboBoxTiposArchivosReportesComprobanteFacturaDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComprobanteFacturaDetalle() {
		return this.jComboBoxTiposReportesComprobanteFacturaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposReportesComprobanteFacturaDetalle) {
		this.jComboBoxTiposReportesComprobanteFacturaDetalle = jComboBoxTiposReportesComprobanteFacturaDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComprobanteFacturaDetalle() {
	//	return jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComprobanteFacturaDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle) {
	//	this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle = jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle = jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle;
	//}
	
	public void setBorderResaltarTiposReportesComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComprobanteFacturaDetalle() {
		return this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposGraficosReportesComprobanteFacturaDetalle) {
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle = jComboBoxTiposGraficosReportesComprobanteFacturaDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComprobanteFacturaDetalle() {
		return this.jComboBoxTiposPaginacionComprobanteFacturaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposPaginacionComprobanteFacturaDetalle) {
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle = jComboBoxTiposPaginacionComprobanteFacturaDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComprobanteFacturaDetalle() {
		return this.jComboBoxTiposRelacionesComprobanteFacturaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteFacturaDetalle() {
		return this.jComboBoxTiposAccionesComprobanteFacturaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposRelacionesComprobanteFacturaDetalle) {
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle = jComboBoxTiposRelacionesComprobanteFacturaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteFacturaDetalle(
			JComboBox jComboBoxTiposAccionesComprobanteFacturaDetalle) {
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle = jComboBoxTiposAccionesComprobanteFacturaDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComprobanteFacturaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComprobanteFacturaDetalle() {
	//	return jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoComprobanteFacturaDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle) {
	//	this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle = jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComprobanteFacturaDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComprobanteFacturaDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle .setBorder(borderResaltar);		
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
		this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
		
		this.comprobantefacturadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantefacturadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComprobanteFacturaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComprobanteFacturaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteFacturaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteFacturaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteFacturaDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Factura Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		ComprobanteFacturaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComprobanteFacturaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComprobanteFacturaDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"nuevo","nuevo","Nuevo"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"duplicar","duplicar","Duplicar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"copiar","copiar","Copiar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"ver_form","ver_form","Ver"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"recargar","recargar","Buscar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComprobanteFacturaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,
							"cerrar","cerrar","Salir"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle;
			
				this.jButtonProcesarInformacionToolBarComprobanteFacturaDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComprobanteFacturaDetalle;
				
		//protected JButton jButtonModificarToolBarComprobanteFacturaDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComprobanteFacturaDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComprobanteFacturaDetalle=new JMenuMe("General");
		this.jmenuArchivoComprobanteFacturaDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesComprobanteFacturaDetalle=new JMenuMe("Acciones");
		this.jmenuDatosComprobanteFacturaDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteFacturaDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteFacturaDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteFacturaDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComprobanteFacturaDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComprobanteFacturaDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComprobanteFacturaDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComprobanteFacturaDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteFacturaDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteFacturaDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComprobanteFacturaDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComprobanteFacturaDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComprobanteFacturaDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComprobanteFacturaDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComprobanteFacturaDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComprobanteFacturaDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteFacturaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteFacturaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteFacturaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComprobanteFacturaDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComprobanteFacturaDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComprobanteFacturaDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComprobanteFacturaDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComprobanteFacturaDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComprobanteFacturaDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComprobanteFacturaDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComprobanteFacturaDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComprobanteFacturaDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComprobanteFacturaDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComprobanteFacturaDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComprobanteFacturaDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComprobanteFacturaDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComprobanteFacturaDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComprobanteFacturaDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteFacturaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteFacturaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteFacturaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComprobanteFacturaDetalle.add(this.jMenuItemCerrarComprobanteFacturaDetalle);
			
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemNuevoComprobanteFacturaDetalle);
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle);
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle);
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle);		
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemDuplicarComprobanteFacturaDetalle);		
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemCopiarComprobanteFacturaDetalle);		
			this.jmenuAccionesComprobanteFacturaDetalle.add(this.jMenuItemVerFormComprobanteFacturaDetalle);		
			
			this.jmenuDatosComprobanteFacturaDetalle.add(this.jMenuItemRecargarInformacionComprobanteFacturaDetalle);				
			this.jmenuDatosComprobanteFacturaDetalle.add(this.jMenuItemAnterioresComprobanteFacturaDetalle);				
			this.jmenuDatosComprobanteFacturaDetalle.add(this.jMenuItemSiguientesComprobanteFacturaDetalle);				
			this.jmenuDatosComprobanteFacturaDetalle.add(this.jMenuItemAbrirOrderByComprobanteFacturaDetalle);				
			this.jmenuDatosComprobanteFacturaDetalle.add(this.jMenuItemMostrarOcultarComprobanteFacturaDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComprobanteFacturaDetalle.add(this.jMenuItemGuardarCambiosComprobanteFacturaDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComprobanteFacturaDetalle.add(this.jmenuArchivoComprobanteFacturaDetalle);		
			this.jmenuBarComprobanteFacturaDetalle.add(this.jmenuAccionesComprobanteFacturaDetalle);		
			this.jmenuBarComprobanteFacturaDetalle.add(this.jmenuDatosComprobanteFacturaDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComprobanteFacturaDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComprobanteFacturaDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle= new JButtonMe();
		this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setText("Buscar");
		this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle = new JLabelMe();
		jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle= new JDateChooser();
		jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setDate(new Date());
		jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle = new JLabelMe();
		jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setText("Fecha Fin :");
		jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle= new JDateChooser();
		jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setDate(new Date());
		jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasComprobanteFacturaDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComprobanteFacturaDetalle = new ComprobanteFacturaDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comprobante Factura Detalle DATOS");
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle = new ComprobanteFacturaDetalleDetalleFormJInternalFrame(jDesktopPane,this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones(),this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle = null;//new ComprobanteFacturaDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteFacturaDetalle= new GridBagLayout();
		
		
		this.jTableDatosComprobanteFacturaDetalle = new JTableMe();      
		
		String sToolTipComprobanteFacturaDetalle="";
		sToolTipComprobanteFacturaDetalle=ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteFacturaDetalle+="(PuntoVenta.ComprobanteFacturaDetalle)";
		}
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteFacturaDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComprobanteFacturaDetalle.setToolTipText(sToolTipComprobanteFacturaDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComprobanteFacturaDetalle);
		this.jTableDatosComprobanteFacturaDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosComprobanteFacturaDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComprobanteFacturaDetalle.setRowSelectionAllowed(true);
		this.jTableDatosComprobanteFacturaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComprobanteFacturaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonDuplicarComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonCopiarComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonVerFormComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonCerrarComprobanteFacturaDetalle = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteFacturaDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralComprobanteFacturaDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Factura Detalle";
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Factura Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteFacturaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteFacturaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteFacturaDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle=new ReporteDinamicoJInternalFrame(ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComprobanteFacturaDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComprobanteFacturaDetalle=new ImportacionJInternalFrame(ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComprobanteFacturaDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComprobanteFacturaDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByComprobanteFacturaDetalle.setText("Orden");
		this.jButtonAbrirOrderByComprobanteFacturaDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteFacturaDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteFacturaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFacturaDetalle,false,this);
			
			//this.cargarOrderByComprobanteFacturaDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteFacturaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFacturaDetalle,true,this);
			
			//this.cargarOrderByComprobanteFacturaDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComprobanteFacturaDetalle.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosComprobanteFacturaDetalle.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosComprobanteFacturaDetalle.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosComprobanteFacturaDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteFacturaDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteFacturaDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComprobanteFacturaDetalle.setText("Nuevo");
		this.jButtonDuplicarComprobanteFacturaDetalle.setText("Duplicar");
		this.jButtonCopiarComprobanteFacturaDetalle.setText("Copiar");
		this.jButtonVerFormComprobanteFacturaDetalle.setText("Ver");
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.setText("Guardar");
		this.jButtonCerrarComprobanteFacturaDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteFacturaDetalle,"nuevo_button","Nuevo",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComprobanteFacturaDetalle,"duplicar_button","Duplicar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComprobanteFacturaDetalle,"copiar_button","Copiar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComprobanteFacturaDetalle,"ver_form","Ver",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComprobanteFacturaDetalle,"nuevorelaciones_button","Nuevo Rel",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle,"guardarcambiostabla_button","Guardar",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteFacturaDetalle,"cerrar_button","Salir",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComprobanteFacturaDetalle.setToolTipText("Nuevo"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComprobanteFacturaDetalle.setToolTipText("Duplicar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComprobanteFacturaDetalle.setToolTipText("Copiar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComprobanteFacturaDetalle.setToolTipText("Ver"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.setToolTipText("Nuevo Rel"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.setToolTipText("Guardar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteFacturaDetalle.setToolTipText("Salir"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteFacturaDetalle";
		inputMap = this.jButtonNuevoComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteFacturaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteFacturaDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarComprobanteFacturaDetalle";
		inputMap = this.jButtonDuplicarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComprobanteFacturaDetalle"));
		
		//COPIAR
		sMapKey = "CopiarComprobanteFacturaDetalle";
		inputMap = this.jButtonCopiarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComprobanteFacturaDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormComprobanteFacturaDetalle";
		inputMap = this.jButtonVerFormComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComprobanteFacturaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComprobanteFacturaDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComprobanteFacturaDetalle";
		inputMap = this.jButtonNuevoRelacionesComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComprobanteFacturaDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComprobanteFacturaDetalle";
		inputMap = this.jButtonModificarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComprobanteFacturaDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComprobanteFacturaDetalle";
		inputMap = this.jButtonCerrarComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteFacturaDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteFacturaDetalle";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteFacturaDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComprobanteFacturaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComprobanteFacturaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComprobanteFacturaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComprobanteFacturaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComprobanteFacturaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComprobanteFacturaDetalle.setName("jPanelParametrosReportesComprobanteFacturaDetalle"); 
		
		this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle.setName("jPanelParametrosReportesAccionesComprobanteFacturaDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.setText("Buscar");
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.setToolTipText("Buscar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComprobanteFacturaDetalle,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.setVisible(false);
		
		
		this.jButtonProcesarInformacionComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonProcesarInformacionComprobanteFacturaDetalle.setText("Procesar");
		this.jButtonProcesarInformacionComprobanteFacturaDetalle.setToolTipText("Procesar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComprobanteFacturaDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesComprobanteFacturaDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComprobanteFacturaDetalle = new JLabelMe();
		
		this.jLabelAccionesComprobanteFacturaDetalle.setText("Acciones");		
		this.jLabelAccionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComprobanteFacturaDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComprobanteFacturaDetalle = new JButtonMe();
		//this.jButtonAnterioresComprobanteFacturaDetalle.setText("<<");
        this.jButtonAnterioresComprobanteFacturaDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComprobanteFacturaDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComprobanteFacturaDetalle = new JButtonMe();
		//this.jButtonSiguientesComprobanteFacturaDetalle.setText(">>");
        this.jButtonSiguientesComprobanteFacturaDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComprobanteFacturaDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle,"nuevoguardarcambios_button","Nue",this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComprobanteFacturaDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComprobanteFacturaDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComprobanteFacturaDetalle";
		inputMap = this.jButtonRecargarInformacionComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComprobanteFacturaDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComprobanteFacturaDetalle";
		inputMap = this.jButtonSiguientesComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComprobanteFacturaDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComprobanteFacturaDetalle";
		inputMap = this.jButtonAnterioresComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComprobanteFacturaDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComprobanteFacturaDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(this.getWidth(),ComprobanteFacturaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFacturaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(this.getWidth(),ComprobanteFacturaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFacturaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(this.getWidth(),ComprobanteFacturaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFacturaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComprobanteFacturaDetalle = new GridBagLayout();

			this.jPanelPaginacionComprobanteFacturaDetalle.setLayout(gridaBagLayoutPaginacionComprobanteFacturaDetalle);						
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonAnterioresComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
					
						
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
			
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
						
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonSiguientesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonNuevoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
						
			
			
			if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
				this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			}
			
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonDuplicarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonCopiarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonVerFormComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComprobanteFacturaDetalle.add(this.jButtonCerrarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComprobanteFacturaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteFacturaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteFacturaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComprobanteFacturaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComprobanteFacturaDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComprobanteFacturaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComprobanteFacturaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComprobanteFacturaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComprobanteFacturaDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComprobanteFacturaDetalle.setLayout(gridaBagParametrosReportesComprobanteFacturaDetalle);
			this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle.setLayout(gridaBagParametrosReportesAccionesComprobanteFacturaDetalle);
			
			
			this.jPanelParametrosAuxiliar1ComprobanteFacturaDetalle.setLayout(gridaBagParametrosAuxiliar1ComprobanteFacturaDetalle);
			this.jPanelParametrosAuxiliar2ComprobanteFacturaDetalle.setLayout(gridaBagParametrosAuxiliar2ComprobanteFacturaDetalle);
			this.jPanelParametrosAuxiliar3ComprobanteFacturaDetalle.setLayout(gridaBagParametrosAuxiliar3ComprobanteFacturaDetalle);
			this.jPanelParametrosAuxiliar4ComprobanteFacturaDetalle.setLayout(gridaBagParametrosAuxiliar4ComprobanteFacturaDetalle);
			//this.jPanelParametrosAuxiliar5ComprobanteFacturaDetalle.setLayout(gridaBagParametrosAuxiliar2ComprobanteFacturaDetalle);			
			
			
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jButtonRecargarInformacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFacturaDetalle.add(this.jComboBoxTiposPaginacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFacturaDetalle.add(this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFacturaDetalle.add(this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jPanelParametrosAuxiliar1ComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComprobanteFacturaDetalle.add(this.jComboBoxTiposReportesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);																		
			
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComprobanteFacturaDetalle.add(this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jPanelParametrosAuxiliar4ComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jComboBoxTiposReportesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jCheckBoxGenerarReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jPanelParametrosAuxiliar2ComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jLabelAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jButtonAbrirOrderByComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
			
			
			/*
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFacturaDetalle.add(this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);															
				
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFacturaDetalle.add(this.jCheckBoxSeleccionadosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);															
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFacturaDetalle.add(this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jPanelParametrosAuxiliar3ComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFacturaDetalle.add(this.jComboBoxTiposAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComprobanteFacturaDetalle = new GridBagLayout();

			this.jScrollPanelDatosComprobanteFacturaDetalle.setLayout(gridaBagLayoutDatosComprobanteFacturaDetalle);
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
			
			this.jScrollPanelDatosComprobanteFacturaDetalle.add(this.jTableDatosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComprobanteFacturaDetalle.setViewportView(this.jTableDatosComprobanteFacturaDetalle);
		this.jTableDatosComprobanteFacturaDetalle.setFillsViewportHeight(true);
		this.jTableDatosComprobanteFacturaDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComprobanteFacturaDetalle= new GridBagLayout();
		this.jPanelAccionesComprobanteFacturaDetalle.setLayout(gridaBagLayoutAccionesComprobanteFacturaDetalle);
		
		
		/*	
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
			
		this.jPanelAccionesComprobanteFacturaDetalle.add(this.jButtonNuevoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle= new GridBagLayout();
		gridaBagLayoutBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.setLayout(gridaBagLayoutBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);

		gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
		jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.add(jLabelfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);

		gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFacturaDetalle.gridy = 0;
		gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
		jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.add(jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);


		gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
		gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
		jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.add(jLabelfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);

		gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFacturaDetalle.gridy = 1;
		gridBagConstraintsComprobanteFacturaDetalle.gridx = 1;
		jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.add(jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);

		gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFacturaDetalle.gridy = 2;
		gridBagConstraintsComprobanteFacturaDetalle.gridx =1;
		jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.add(jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle, gridBagConstraintsComprobanteFacturaDetalle);

		jTabbedPaneBusquedasComprobanteFacturaDetalle.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
		jTabbedPaneBusquedasComprobanteFacturaDetalle.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteFacturaDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteFacturaDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;		
			//this.gridBagConstraintsComprobanteFacturaDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;		
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComprobanteFacturaDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;		
			this.gridBagConstraintsComprobanteFacturaDetalle.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComprobanteFacturaDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);								
		
		
		/*
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		*/		
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =0;
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteFacturaDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
				
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComprobanteFacturaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteFacturaDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosComprobanteFacturaDetalle.setLayout(gridaBagLayoutBusquedasParametrosComprobanteFacturaDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
			
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComprobanteFacturaDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComprobanteFacturaDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComprobanteFacturaDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.setName("jPanelReporteDinamicoComprobanteFacturaDetalle"); 
		
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.setLayout(gridaBagLayoutReporteDinamicoComprobanteFacturaDetalle);
		
		
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteFacturaDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Factura Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteComprobanteFacturaDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelColumnasSelectReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComprobanteFacturaDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteComprobanteFacturaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComprobanteFacturaDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComprobanteFacturaDetalle=new JScrollPane(this.jListColumnasSelectReporteComprobanteFacturaDetalle);
			
			this.jScrollColumnasSelectReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jListColumnasSelectReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jScrollColumnasSelectReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteComprobanteFacturaDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComprobanteFacturaDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteComprobanteFacturaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComprobanteFacturaDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComprobanteFacturaDetalle=new JScrollPane(this.jListRelacionesSelectReporteComprobanteFacturaDetalle);
			
			this.jScrollRelacionesSelectReporteComprobanteFacturaDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteFacturaDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteFacturaDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoComprobanteFacturaDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelConGraficoDinamicoComprobanteFacturaDetalle.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelConGraficoDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jCheckBoxConGraficoDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelColumnaCategoriaGraficoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaValorComprobanteFacturaDetalle.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelColumnaCategoriaValorComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jComboBoxColumnaCategoriaValorComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelColumnasValoresGraficoComprobanteFacturaDetalle.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelColumnasValoresGraficoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComprobanteFacturaDetalle = new JList<Reporte>();
		this.jListColumnasValoresGraficoComprobanteFacturaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComprobanteFacturaDetalle.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComprobanteFacturaDetalle=new JScrollPane(this.jListColumnasValoresGraficoComprobanteFacturaDetalle);
			
			this.jScrollColumnasValoresGraficoComprobanteFacturaDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteFacturaDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteFacturaDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jListColumnasSelectReporteComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jScrollColumnasValoresGraficoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelTiposGraficosReportesDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteFacturaDetalle.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jComboBoxTiposGraficosReportesDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelGenerarExcelReporteDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle.setToolTipText("Generar EXCEL"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jComboBoxTiposReportesDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jLabelTiposArchivoReporteDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle.setToolTipText("Generar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle.setToolTipText("Cancelar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFacturaDetalle.add(this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComprobanteFacturaDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle= new JScrollPane(jPanelReporteDinamicoComprobanteFacturaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Factura Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComprobanteFacturaDetalle);
		this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComprobanteFacturaDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComprobanteFacturaDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComprobanteFacturaDetalle.setName("jPanelImportacionComprobanteFacturaDetalle"); 
		
		this.jPanelImportacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComprobanteFacturaDetalle.setLayout(gridaBagLayoutImportacionComprobanteFacturaDetalle);
		
		
		this.jInternalFrameImportacionComprobanteFacturaDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComprobanteFacturaDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComprobanteFacturaDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteFacturaDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setResizable(true);
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setClosable(true);
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setResizable(true);
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setClosable(true);
	    this.jInternalFrameImportacionComprobanteFacturaDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Factura Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelArchivoImportacionComprobanteFacturaDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteFacturaDetalle.add(this.jLabelArchivoImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComprobanteFacturaDetalle = new JFileChooser();		
		this.jFileChooserImportacionComprobanteFacturaDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonAbrirImportacionComprobanteFacturaDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComprobanteFacturaDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComprobanteFacturaDetalle.setToolTipText("Generar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFacturaDetalle.add(this.jButtonAbrirImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComprobanteFacturaDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionComprobanteFacturaDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteFacturaDetalle.add(this.jLabelPathArchivoImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComprobanteFacturaDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComprobanteFacturaDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteFacturaDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteFacturaDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFacturaDetalle.add(this.jTextFieldPathArchivoImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonGenerarImportacionComprobanteFacturaDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComprobanteFacturaDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComprobanteFacturaDetalle.setToolTipText("Generar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFacturaDetalle.add(this.jButtonGenerarImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComprobanteFacturaDetalle = new JButtonMe();
		this.jButtonCerrarImportacionComprobanteFacturaDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComprobanteFacturaDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComprobanteFacturaDetalle.setToolTipText("Cancelar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFacturaDetalle.add(this.jButtonCerrarImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComprobanteFacturaDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionComprobanteFacturaDetalle= new JScrollPane(jPanelImportacionComprobanteFacturaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComprobanteFacturaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComprobanteFacturaDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComprobanteFacturaDetalle);
		this.jInternalFrameImportacionComprobanteFacturaDetalle.getContentPane().add(this.jScrollPanelImportacionComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComprobanteFacturaDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComprobanteFacturaDetalle = new JButtonMe();
			this.jButtonAbrirOrderByComprobanteFacturaDetalle.setText("Orden");
			this.jButtonAbrirOrderByComprobanteFacturaDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteFacturaDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComprobanteFacturaDetalle";
			inputMap = this.jButtonAbrirOrderByComprobanteFacturaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComprobanteFacturaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComprobanteFacturaDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByComprobanteFacturaDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComprobanteFacturaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComprobanteFacturaDetalle.setName("jPanelOrderByComprobanteFacturaDetalle"); 
			
			this.jPanelOrderByComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComprobanteFacturaDetalle.setLayout(gridaBagLayoutOrderByComprobanteFacturaDetalle);
			
			
			this.jTableDatosComprobanteFacturaDetalleOrderBy = new JTableMe();        
			this.jTableDatosComprobanteFacturaDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComprobanteFacturaDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComprobanteFacturaDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComprobanteFacturaDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComprobanteFacturaDetalleOrderBy.setViewportView(this.jTableDatosComprobanteFacturaDetalleOrderBy);
			this.jTableDatosComprobanteFacturaDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComprobanteFacturaDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComprobanteFacturaDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComprobanteFacturaDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComprobanteFacturaDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComprobanteFacturaDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setTitle("Orden");
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setResizable(true);
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setClosable(true);
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComprobanteFacturaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Factura Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComprobanteFacturaDetalle.ipady =150;
				
			this.jPanelOrderByComprobanteFacturaDetalle.add(jScrollPanelDatosComprobanteFacturaDetalleOrderBy, this.gridBagConstraintsComprobanteFacturaDetalle);//this.jTableDatosComprobanteFacturaDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComprobanteFacturaDetalle = new JButtonMe();
			this.jButtonCerrarOrderByComprobanteFacturaDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComprobanteFacturaDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComprobanteFacturaDetalle.setToolTipText("Cancelar"+" "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComprobanteFacturaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComprobanteFacturaDetalle.add(this.jButtonCerrarOrderByComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComprobanteFacturaDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByComprobanteFacturaDetalle= new JScrollPane(jPanelOrderByComprobanteFacturaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComprobanteFacturaDetalle = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFacturaDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsComprobanteFacturaDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteFacturaDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComprobanteFacturaDetalle);
			
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getContentPane().add(this.jScrollPanelOrderByComprobanteFacturaDetalle, this.gridBagConstraintsComprobanteFacturaDetalle);			
		
		} else {
			this.jButtonAbrirOrderByComprobanteFacturaDetalle = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosComprobanteFacturaDetalle.getRowHeight();//ComprobanteFacturaDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.isSelected()) {
					iHeightTable=ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteFacturaDetalle.isSelected()) {
					iHeightTable=ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteFacturaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComprobanteFacturaDetalle!=null && this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComprobanteFacturaDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComprobanteFacturaDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteFacturaDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteFacturaDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantefacturadetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComprobanteFacturaDetalle> TraerComprobanteFacturaDetalleBeans(List<ComprobanteFacturaDetalle> comprobantefacturadetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetalles) {
					
				if(!(ComprobanteFacturaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComprobanteFacturaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comprobantefacturadetalle.setsDetalleGeneralEntityReporte(ComprobanteFacturaDetalleConstantesFunciones.getComprobanteFacturaDetalleDescripcion(comprobantefacturadetalle));
										
						
					
						
					
				} else  {
							
					//comprobantefacturadetalle.setsDetalleGeneralEntityReporte(comprobantefacturadetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//comprobantefacturadetallebeans.add(comprobantefacturadetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comprobantefacturadetalles;
    }
	//PARA REPORTES FIN
}
