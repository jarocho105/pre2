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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

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
import com.bydan.erp.puntoventa.util.report.ComprobanteFormaPagoConstantesFunciones;

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
public class ComprobanteFormaPagoJInternalFrame extends ComprobanteFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComprobanteFormaPago;
	
	protected JMenuBar jmenuBarComprobanteFormaPago;
	
	protected JMenu jmenuComprobanteFormaPago;
	protected JMenu jmenuDatosComprobanteFormaPago;
	protected JMenu jmenuArchivoComprobanteFormaPago;
	protected JMenu jmenuAccionesComprobanteFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteFormaPago;	
	protected GridBagConstraints gridBagConstraintsComprobanteFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComprobanteFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormComprobanteFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComprobanteFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComprobanteFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ComprobanteFormaPagoSessionBean comprobanteformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComprobanteFormaPago> comprobanteformapagos;		
	public List<ComprobanteFormaPago> comprobanteformapagosEliminados;	
	public List<ComprobanteFormaPago> comprobanteformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComprobanteFormaPago;		
	protected JButton jButtonAbrirOrderByComprobanteFormaPago;
	
	
	//protected JPanel jPanelOrderByComprobanteFormaPago;
	//public JScrollPane jScrollPanelOrderByComprobanteFormaPago;	
	//protected JButton jButtonCerrarOrderByComprobanteFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComprobanteFormaPagoLogic comprobanteformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComprobanteFormaPago;
	public JScrollPane jScrollPanelDatosEdicionComprobanteFormaPago;
	public JScrollPane jScrollPanelDatosGeneralComprobanteFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosComprobanteFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComprobanteFormaPago;
	//public JScrollPane jScrollPanelImportacionComprobanteFormaPago;
	
	
	
	protected JPanel jPanelAccionesComprobanteFormaPago;
	
    protected JPanel jPanelPaginacionComprobanteFormaPago;
    protected JPanel jPanelParametrosReportesComprobanteFormaPago;
	protected JPanel jPanelParametrosReportesAccionesComprobanteFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComprobanteFormaPago;
	protected JPanel jPanelParametrosAuxiliar2ComprobanteFormaPago;
	protected JPanel jPanelParametrosAuxiliar3ComprobanteFormaPago;
	protected JPanel jPanelParametrosAuxiliar4ComprobanteFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5ComprobanteFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoComprobanteFormaPago;
	//protected JPanel jPanelImportacionComprobanteFormaPago;
	
	
	public JTable jTableDatosComprobanteFormaPago;
	
	
	
	//public JTable jTableDatosComprobanteFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComprobanteFormaPago;
	protected JButton jButtonDuplicarComprobanteFormaPago;
	protected JButton jButtonCopiarComprobanteFormaPago;
	protected JButton jButtonVerFormComprobanteFormaPago;
	protected JButton jButtonNuevoRelacionesComprobanteFormaPago;
	protected JButton jButtonModificarComprobanteFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaComprobanteFormaPago;
	protected JButton jButtonCerrarComprobanteFormaPago;
	
	
	protected JButton jButtonRecargarInformacionComprobanteFormaPago;
	protected JButton jButtonProcesarInformacionComprobanteFormaPago;
	
	
	protected JButton jButtonAnterioresComprobanteFormaPago;
	protected JButton jButtonSiguientesComprobanteFormaPago;
	protected JButton jButtonNuevoGuardarCambiosComprobanteFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComprobanteFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoComprobanteFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoComprobanteFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionComprobanteFormaPago;
	//protected JButton jButtonGenerarImportacionComprobanteFormaPago;
	//protected JButton jButtonCerrarImportacionComprobanteFormaPago;
	//protected JFileChooser jFileChooserImportacionComprobanteFormaPago;
	//protected File fileImportacionComprobanteFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteFormaPago;
	protected JButton jButtonDuplicarToolBarComprobanteFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarComprobanteFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarComprobanteFormaPago;
	protected JButton jButtonCopiarToolBarComprobanteFormaPago;
	protected JButton jButtonVerFormToolBarComprobanteFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarComprobanteFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteFormaPago;
	protected JButton jButtonCerrarToolBarComprobanteFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarComprobanteFormaPago;
	protected JButton jButtonProcesarInformacionToolBarComprobanteFormaPago;
	protected JButton jButtonAnterioresToolBarComprobanteFormaPago;
	protected JButton jButtonSiguientesToolBarComprobanteFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarComprobanteFormaPago;
	protected JButton jButtonAbrirOrderByToolBarComprobanteFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteFormaPago;
	protected JMenuItem jMenuItemDuplicarComprobanteFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesComprobanteFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComprobanteFormaPago;
	protected JMenuItem jMenuItemCopiarComprobanteFormaPago;
	protected JMenuItem jMenuItemVerFormComprobanteFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteFormaPago;
	protected JMenuItem jMenuItemCerrarComprobanteFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComprobanteFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionComprobanteFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionComprobanteFormaPago;
	protected JMenuItem jMenuItemAnterioresComprobanteFormaPago;
	protected JMenuItem jMenuItemSiguientesComprobanteFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByComprobanteFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComprobanteFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosComprobanteFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComprobanteFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComprobanteFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComprobanteFormaPago;
	protected JTextField jTextFieldValorCampoGeneralComprobanteFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComprobanteFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteComprobanteFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteComprobanteFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteComprobanteFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteComprobanteFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteComprobanteFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComprobanteFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComprobanteFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComprobanteFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoComprobanteFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionComprobanteFormaPago;	
	//public JLabel jLabelPathArchivoImportacionComprobanteFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionComprobanteFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComprobanteFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComprobanteFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorComprobanteFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComprobanteFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoComprobanteFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoComprobanteFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoComprobanteFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComprobanteFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComprobanteFormaPago;
	public JPanel jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago;
	public JButton jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago;
	
	public JPanel jPanelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago;
	public JLabel jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago;

	public JDateChooser jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago;
	public JButton jButtonfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago;
	public JLabel jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago;
	//public JFormattedTextField jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago;

	public JDateChooser jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago;
	public JButton jButtonfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=799;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComprobanteFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComprobanteFormaPago)	{
		this.jButtonRecargarInformacionComprobanteFormaPago = jButtonRecargarInformacionComprobanteFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionComprobanteFormaPago() {
		return this.jButtonProcesarInformacionComprobanteFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteFormaPago)	{
		this.jButtonProcesarInformacionComprobanteFormaPago = jButtonProcesarInformacionComprobanteFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionComprobanteFormaPago() {
		return this.jButtonRecargarInformacionComprobanteFormaPago;
	}
	
	
	public List<ComprobanteFormaPago> getcomprobanteformapagos() {
		return this.comprobanteformapagos;
	}

	public void setcomprobanteformapagos(List<ComprobanteFormaPago> comprobanteformapagos) {
		this.comprobanteformapagos = comprobanteformapagos;
	}
	
	public List<ComprobanteFormaPago> getcomprobanteformapagosAux() {
		return this.comprobanteformapagosAux;
	}

	public void setcomprobanteformapagosAux(List<ComprobanteFormaPago> comprobanteformapagosAux) {
		this.comprobanteformapagosAux = comprobanteformapagosAux;
	}
	
	public List<ComprobanteFormaPago> getcomprobanteformapagosEliminados() {
		return this.comprobanteformapagosEliminados;
	}

	public void setComprobanteFormaPagosEliminados(List<ComprobanteFormaPago> comprobanteformapagosEliminados) {
		this.comprobanteformapagosEliminados = comprobanteformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComprobanteFormaPago() {
		return jComboBoxTiposSeleccionarComprobanteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComprobanteFormaPago(
			JComboBox jComboBoxTiposSeleccionarComprobanteFormaPago) {
		this.jComboBoxTiposSeleccionarComprobanteFormaPago = jComboBoxTiposSeleccionarComprobanteFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComprobanteFormaPago() {
		return jTextFieldValorCampoGeneralComprobanteFormaPago;
	}

	public void setjTextFieldValorCampoGeneralComprobanteFormaPago(
			JTextField jTextFieldValorCampoGeneralComprobanteFormaPago) {
		this.jTextFieldValorCampoGeneralComprobanteFormaPago = jTextFieldValorCampoGeneralComprobanteFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComprobanteFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComprobanteFormaPago() {
		return this.jCheckBoxSeleccionarTodosComprobanteFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosComprobanteFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosComprobanteFormaPago) {
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago = jCheckBoxSeleccionarTodosComprobanteFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComprobanteFormaPago() {
		return this.jCheckBoxSeleccionadosComprobanteFormaPago;
	}

	public void setjCheckBoxSeleccionadosComprobanteFormaPago(
			JCheckBox jCheckBoxSeleccionadosComprobanteFormaPago) {
		this.jCheckBoxSeleccionadosComprobanteFormaPago = jCheckBoxSeleccionadosComprobanteFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComprobanteFormaPago() {
		return this.jComboBoxTiposArchivosReportesComprobanteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComprobanteFormaPago(
			JComboBox jComboBoxTiposArchivosReportesComprobanteFormaPago) {
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago = jComboBoxTiposArchivosReportesComprobanteFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComprobanteFormaPago() {
		return this.jComboBoxTiposReportesComprobanteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComprobanteFormaPago(
			JComboBox jComboBoxTiposReportesComprobanteFormaPago) {
		this.jComboBoxTiposReportesComprobanteFormaPago = jComboBoxTiposReportesComprobanteFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComprobanteFormaPago() {
	//	return jComboBoxTiposReportesDinamicoComprobanteFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComprobanteFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoComprobanteFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoComprobanteFormaPago = jComboBoxTiposReportesDinamicoComprobanteFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago = jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComprobanteFormaPago() {
		return this.jComboBoxTiposGraficosReportesComprobanteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComprobanteFormaPago(
			JComboBox jComboBoxTiposGraficosReportesComprobanteFormaPago) {
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago = jComboBoxTiposGraficosReportesComprobanteFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComprobanteFormaPago() {
		return this.jComboBoxTiposPaginacionComprobanteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComprobanteFormaPago(
			JComboBox jComboBoxTiposPaginacionComprobanteFormaPago) {
		this.jComboBoxTiposPaginacionComprobanteFormaPago = jComboBoxTiposPaginacionComprobanteFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComprobanteFormaPago() {
		return this.jComboBoxTiposRelacionesComprobanteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteFormaPago() {
		return this.jComboBoxTiposAccionesComprobanteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteFormaPago(
			JComboBox jComboBoxTiposRelacionesComprobanteFormaPago) {
		this.jComboBoxTiposRelacionesComprobanteFormaPago = jComboBoxTiposRelacionesComprobanteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteFormaPago(
			JComboBox jComboBoxTiposAccionesComprobanteFormaPago) {
		this.jComboBoxTiposAccionesComprobanteFormaPago = jComboBoxTiposAccionesComprobanteFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComprobanteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComprobanteFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComprobanteFormaPago() {
	//	return jCheckBoxConGraficoDinamicoComprobanteFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoComprobanteFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoComprobanteFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoComprobanteFormaPago = jCheckBoxConGraficoDinamicoComprobanteFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComprobanteFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComprobanteFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComprobanteFormaPago .setBorder(borderResaltar);		
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
		this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
		
		this.comprobanteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobanteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobanteformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComprobanteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComprobanteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 2650) {
			iWidth=2650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		ComprobanteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComprobanteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComprobanteFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"nuevo","nuevo","Nuevo"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"duplicar","duplicar","Duplicar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"copiar","copiar","Copiar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"ver_form","ver_form","Ver"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"recargar","recargar","Buscar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComprobanteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,
							"cerrar","cerrar","Salir"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComprobanteFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComprobanteFormaPago;
			
				this.jButtonProcesarInformacionToolBarComprobanteFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComprobanteFormaPago;
				
		//protected JButton jButtonModificarToolBarComprobanteFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComprobanteFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComprobanteFormaPago=new JMenuMe("General");
		this.jmenuArchivoComprobanteFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesComprobanteFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosComprobanteFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComprobanteFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComprobanteFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComprobanteFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComprobanteFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComprobanteFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComprobanteFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComprobanteFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComprobanteFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComprobanteFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComprobanteFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComprobanteFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComprobanteFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComprobanteFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComprobanteFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComprobanteFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComprobanteFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComprobanteFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComprobanteFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComprobanteFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComprobanteFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComprobanteFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComprobanteFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComprobanteFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComprobanteFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComprobanteFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComprobanteFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComprobanteFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComprobanteFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComprobanteFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComprobanteFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComprobanteFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComprobanteFormaPago.add(this.jMenuItemCerrarComprobanteFormaPago);
			
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemNuevoComprobanteFormaPago);
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago);
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemNuevoRelacionesComprobanteFormaPago);
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemGuardarCambiosTablaComprobanteFormaPago);		
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemDuplicarComprobanteFormaPago);		
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemCopiarComprobanteFormaPago);		
			this.jmenuAccionesComprobanteFormaPago.add(this.jMenuItemVerFormComprobanteFormaPago);		
			
			this.jmenuDatosComprobanteFormaPago.add(this.jMenuItemRecargarInformacionComprobanteFormaPago);				
			this.jmenuDatosComprobanteFormaPago.add(this.jMenuItemAnterioresComprobanteFormaPago);				
			this.jmenuDatosComprobanteFormaPago.add(this.jMenuItemSiguientesComprobanteFormaPago);				
			this.jmenuDatosComprobanteFormaPago.add(this.jMenuItemAbrirOrderByComprobanteFormaPago);				
			this.jmenuDatosComprobanteFormaPago.add(this.jMenuItemMostrarOcultarComprobanteFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComprobanteFormaPago.add(this.jMenuItemGuardarCambiosComprobanteFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComprobanteFormaPago.add(this.jmenuArchivoComprobanteFormaPago);		
			this.jmenuBarComprobanteFormaPago.add(this.jmenuAccionesComprobanteFormaPago);		
			this.jmenuBarComprobanteFormaPago.add(this.jmenuDatosComprobanteFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComprobanteFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComprobanteFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago= new JButtonMe();
		this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago.setText("Buscar");
		this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago = new JLabelMe();
		jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago= new JDateChooser();
		jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setDate(new Date());
		jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago = new JLabelMe();
		jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setText("Fecha Fin :");
		jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago= new JDateChooser();
		jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setDate(new Date());
		jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasComprobanteFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasComprobanteFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComprobanteFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComprobanteFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComprobanteFormaPago = new ComprobanteFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comprobante Forma Pago DATOS");
			this.jInternalFrameDetalleFormComprobanteFormaPago = new ComprobanteFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.comprobanteformapagoSessionBean.getConGuardarRelaciones(),this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComprobanteFormaPago = null;//new ComprobanteFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteFormaPago= new GridBagLayout();
		
		
		this.jTableDatosComprobanteFormaPago = new JTableMe();      
		
		String sToolTipComprobanteFormaPago="";
		sToolTipComprobanteFormaPago=ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteFormaPago+="(PuntoVenta.ComprobanteFormaPago)";
		}
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComprobanteFormaPago.setToolTipText(sToolTipComprobanteFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComprobanteFormaPago);
		this.jTableDatosComprobanteFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosComprobanteFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComprobanteFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosComprobanteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComprobanteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComprobanteFormaPago = new JButtonMe();
		this.jButtonDuplicarComprobanteFormaPago = new JButtonMe();
		this.jButtonCopiarComprobanteFormaPago = new JButtonMe();
		this.jButtonVerFormComprobanteFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesComprobanteFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago = new JButtonMe();
		this.jButtonCerrarComprobanteFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralComprobanteFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Forma Pago";
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComprobanteFormaPago=new ReporteDinamicoJInternalFrame(ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComprobanteFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComprobanteFormaPago=new ImportacionJInternalFrame(ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComprobanteFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComprobanteFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByComprobanteFormaPago.setText("Orden");
		this.jButtonAbrirOrderByComprobanteFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFormaPago,false,this);
			
			//this.cargarOrderByComprobanteFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFormaPago,true,this);
			
			//this.cargarOrderByComprobanteFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComprobanteFormaPago.setMinimumSize(new Dimension(400,50));//2430
		this.jTableDatosComprobanteFormaPago.setMaximumSize(new Dimension(400,50));//2430
		this.jTableDatosComprobanteFormaPago.setPreferredSize(new Dimension(400,50));//2430
		
		this.jScrollPanelDatosComprobanteFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComprobanteFormaPago.setText("Nuevo");
		this.jButtonDuplicarComprobanteFormaPago.setText("Duplicar");
		this.jButtonCopiarComprobanteFormaPago.setText("Copiar");
		this.jButtonVerFormComprobanteFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesComprobanteFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.setText("Guardar");
		this.jButtonCerrarComprobanteFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteFormaPago,"nuevo_button","Nuevo",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComprobanteFormaPago,"duplicar_button","Duplicar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComprobanteFormaPago,"copiar_button","Copiar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComprobanteFormaPago,"ver_form","Ver",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComprobanteFormaPago,"nuevorelaciones_button","Nuevo Rel",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteFormaPago,"guardarcambiostabla_button","Guardar",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteFormaPago,"cerrar_button","Salir",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComprobanteFormaPago.setToolTipText("Nuevo"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComprobanteFormaPago.setToolTipText("Duplicar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComprobanteFormaPago.setToolTipText("Copiar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComprobanteFormaPago.setToolTipText("Ver"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComprobanteFormaPago.setToolTipText("Nuevo Rel"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.setToolTipText("Guardar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteFormaPago.setToolTipText("Salir"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteFormaPago";
		inputMap = this.jButtonNuevoComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarComprobanteFormaPago";
		inputMap = this.jButtonDuplicarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComprobanteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComprobanteFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarComprobanteFormaPago";
		inputMap = this.jButtonCopiarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComprobanteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComprobanteFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormComprobanteFormaPago";
		inputMap = this.jButtonVerFormComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComprobanteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComprobanteFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComprobanteFormaPago";
		inputMap = this.jButtonNuevoRelacionesComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComprobanteFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComprobanteFormaPago";
		inputMap = this.jButtonModificarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComprobanteFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComprobanteFormaPago";
		inputMap = this.jButtonCerrarComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComprobanteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComprobanteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComprobanteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComprobanteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComprobanteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComprobanteFormaPago.setName("jPanelParametrosReportesComprobanteFormaPago"); 
		
		this.jPanelParametrosReportesAccionesComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComprobanteFormaPago.setName("jPanelParametrosReportesAccionesComprobanteFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComprobanteFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionComprobanteFormaPago.setText("Buscar");
		this.jButtonRecargarInformacionComprobanteFormaPago.setToolTipText("Buscar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComprobanteFormaPago,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionComprobanteFormaPago.setVisible(false);
		
		
		this.jButtonProcesarInformacionComprobanteFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionComprobanteFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionComprobanteFormaPago.setToolTipText("Procesar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComprobanteFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionComprobanteFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesComprobanteFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComprobanteFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionComprobanteFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComprobanteFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesComprobanteFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComprobanteFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarComprobanteFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComprobanteFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComprobanteFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComprobanteFormaPago = new JLabelMe();
		
		this.jLabelAccionesComprobanteFormaPago.setText("Acciones");		
		this.jLabelAccionesComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComprobanteFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComprobanteFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComprobanteFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComprobanteFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComprobanteFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteComprobanteFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComprobanteFormaPago = new JButtonMe();
		//this.jButtonAnterioresComprobanteFormaPago.setText("<<");
        this.jButtonAnterioresComprobanteFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComprobanteFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComprobanteFormaPago = new JButtonMe();
		//this.jButtonSiguientesComprobanteFormaPago.setText(">>");
        this.jButtonSiguientesComprobanteFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComprobanteFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComprobanteFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComprobanteFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosComprobanteFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComprobanteFormaPago,"nuevoguardarcambios_button","Nue",this.comprobanteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComprobanteFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComprobanteFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComprobanteFormaPago";
		inputMap = this.jButtonRecargarInformacionComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComprobanteFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComprobanteFormaPago";
		inputMap = this.jButtonSiguientesComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComprobanteFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComprobanteFormaPago";
		inputMap = this.jButtonAnterioresComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComprobanteFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComprobanteFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComprobanteFormaPago.setMinimumSize(new Dimension(this.getWidth(),ComprobanteFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteFormaPago.setMaximumSize(new Dimension(this.getWidth(),ComprobanteFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteFormaPago.setPreferredSize(new Dimension(this.getWidth(),ComprobanteFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComprobanteFormaPago = new GridBagLayout();

			this.jPanelPaginacionComprobanteFormaPago.setLayout(gridaBagLayoutPaginacionComprobanteFormaPago);						
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonAnterioresComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
					
						
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
			
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonNuevoGuardarCambiosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
						
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonSiguientesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 1;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonNuevoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
						
			
			
			if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComprobanteFormaPago.gridy = 1;
				this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonGuardarCambiosTablaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			}
			
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 1;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonDuplicarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 1;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonCopiarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 1;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonVerFormComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 1;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComprobanteFormaPago.add(this.jButtonCerrarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		
		this.jButtonRecargarInformacionComprobanteFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComprobanteFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComprobanteFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComprobanteFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComprobanteFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComprobanteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComprobanteFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComprobanteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComprobanteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComprobanteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComprobanteFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComprobanteFormaPago.setLayout(gridaBagParametrosReportesComprobanteFormaPago);
			this.jPanelParametrosReportesAccionesComprobanteFormaPago.setLayout(gridaBagParametrosReportesAccionesComprobanteFormaPago);
			
			
			this.jPanelParametrosAuxiliar1ComprobanteFormaPago.setLayout(gridaBagParametrosAuxiliar1ComprobanteFormaPago);
			this.jPanelParametrosAuxiliar2ComprobanteFormaPago.setLayout(gridaBagParametrosAuxiliar2ComprobanteFormaPago);
			this.jPanelParametrosAuxiliar3ComprobanteFormaPago.setLayout(gridaBagParametrosAuxiliar3ComprobanteFormaPago);
			this.jPanelParametrosAuxiliar4ComprobanteFormaPago.setLayout(gridaBagParametrosAuxiliar4ComprobanteFormaPago);
			//this.jPanelParametrosAuxiliar5ComprobanteFormaPago.setLayout(gridaBagParametrosAuxiliar2ComprobanteFormaPago);			
			
			
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jButtonRecargarInformacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFormaPago.add(this.jComboBoxTiposPaginacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFormaPago.add(this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFormaPago.add(this.jComboBoxTiposArchivosReportesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jPanelParametrosAuxiliar1ComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComprobanteFormaPago.add(this.jComboBoxTiposReportesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);																		
			
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComprobanteFormaPago.add(this.jComboBoxTiposGraficosReportesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jPanelParametrosAuxiliar4ComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jComboBoxTiposReportesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jCheckBoxGenerarReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jPanelParametrosAuxiliar2ComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jLabelAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComprobanteFormaPago.add(this.jButtonAbrirOrderByComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jComboBoxTiposSeleccionarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
			
			
			/*
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jCheckBoxSeleccionarTodosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jCheckBoxConGraficoReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFormaPago.add(this.jCheckBoxSeleccionarTodosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);															
				
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFormaPago.add(this.jCheckBoxSeleccionadosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);															
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFormaPago.add(this.jCheckBoxConGraficoReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jPanelParametrosAuxiliar3ComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFormaPago.add(this.jComboBoxTiposAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComprobanteFormaPago = new GridBagLayout();

			this.jScrollPanelDatosComprobanteFormaPago.setLayout(gridaBagLayoutDatosComprobanteFormaPago);
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
			
			this.jScrollPanelDatosComprobanteFormaPago.add(this.jTableDatosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComprobanteFormaPago.setViewportView(this.jTableDatosComprobanteFormaPago);
		this.jTableDatosComprobanteFormaPago.setFillsViewportHeight(true);
		this.jTableDatosComprobanteFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComprobanteFormaPago= new GridBagLayout();
		this.jPanelAccionesComprobanteFormaPago.setLayout(gridaBagLayoutAccionesComprobanteFormaPago);
		
		
		/*	
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = 0;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
			
		this.jPanelAccionesComprobanteFormaPago.add(this.jButtonNuevoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaComprobanteFormaPagoComprobanteFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaComprobanteFormaPagoComprobanteFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaComprobanteFormaPagoComprobanteFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaComprobanteFormaPagoComprobanteFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaComprobanteFormaPagoComprobanteFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.setLayout(gridaBagLayoutBusquedaComprobanteFormaPagoComprobanteFormaPago);

		gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFormaPago.gridy = 0;
		gridBagConstraintsComprobanteFormaPago.gridx = 0;
		jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.add(jLabelfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);

		gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFormaPago.gridy = 0;
		gridBagConstraintsComprobanteFormaPago.gridx = 1;
		jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.add(jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);


		gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFormaPago.gridy = 1;
		gridBagConstraintsComprobanteFormaPago.gridx = 0;
		jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.add(jLabelfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);

		gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFormaPago.gridy = 1;
		gridBagConstraintsComprobanteFormaPago.gridx = 1;
		jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.add(jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);

		gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFormaPago.gridy = 2;
		gridBagConstraintsComprobanteFormaPago.gridx =1;
		jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago.add(jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago, gridBagConstraintsComprobanteFormaPago);

		jTabbedPaneBusquedasComprobanteFormaPago.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);
		jTabbedPaneBusquedasComprobanteFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;		
			//this.gridBagConstraintsComprobanteFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;		
		//this.gridBagConstraintsComprobanteFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComprobanteFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComprobanteFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFormaPago.gridx = 0;		
			this.gridBagConstraintsComprobanteFormaPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComprobanteFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);								
		
		
		/*
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		*/		
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFormaPago.gridx =0;
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
				
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComprobanteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosComprobanteFormaPago.setLayout(gridaBagLayoutBusquedasParametrosComprobanteFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComprobanteFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
			
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComprobanteFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComprobanteFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComprobanteFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComprobanteFormaPago.setName("jPanelReporteDinamicoComprobanteFormaPago"); 
		
		this.jPanelReporteDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComprobanteFormaPago.setLayout(gridaBagLayoutReporteDinamicoComprobanteFormaPago);
		
		
		this.jInternalFrameReporteDinamicoComprobanteFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComprobanteFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComprobanteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComprobanteFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComprobanteFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComprobanteFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComprobanteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComprobanteFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoComprobanteFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoComprobanteFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComprobanteFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteComprobanteFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelColumnasSelectReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComprobanteFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteComprobanteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComprobanteFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComprobanteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComprobanteFormaPago=new JScrollPane(this.jListColumnasSelectReporteComprobanteFormaPago);
			
			this.jScrollColumnasSelectReporteComprobanteFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jListColumnasSelectReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jScrollColumnasSelectReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComprobanteFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteComprobanteFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComprobanteFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteComprobanteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComprobanteFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComprobanteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComprobanteFormaPago=new JScrollPane(this.jListRelacionesSelectReporteComprobanteFormaPago);
			
			this.jScrollRelacionesSelectReporteComprobanteFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComprobanteFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoComprobanteFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComprobanteFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComprobanteFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComprobanteFormaPago = new JLabelMe();

		this.jLabelConGraficoDinamicoComprobanteFormaPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelConGraficoDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComprobanteFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComprobanteFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComprobanteFormaPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jCheckBoxConGraficoDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComprobanteFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComprobanteFormaPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelColumnaCategoriaGraficoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComprobanteFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorComprobanteFormaPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelColumnaCategoriaValorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComprobanteFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComprobanteFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jComboBoxColumnaCategoriaValorComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComprobanteFormaPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoComprobanteFormaPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelColumnasValoresGraficoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComprobanteFormaPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoComprobanteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComprobanteFormaPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComprobanteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComprobanteFormaPago=new JScrollPane(this.jListColumnasValoresGraficoComprobanteFormaPago);
			
			this.jScrollColumnasValoresGraficoComprobanteFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jListColumnasSelectReporteComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jScrollColumnasValoresGraficoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComprobanteFormaPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComprobanteFormaPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelTiposGraficosReportesDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteFormaPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jComboBoxTiposGraficosReportesDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComprobanteFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComprobanteFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelGenerarExcelReporteDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago.setToolTipText("Generar EXCEL"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jComboBoxTiposReportesDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComprobanteFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComprobanteFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jLabelTiposArchivoReporteDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComprobanteFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComprobanteFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComprobanteFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComprobanteFormaPago.setToolTipText("Generar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jButtonGenerarReporteDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComprobanteFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComprobanteFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComprobanteFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComprobanteFormaPago.setToolTipText("Cancelar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFormaPago.add(this.jButtonCerrarReporteDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComprobanteFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComprobanteFormaPago= new JScrollPane(jPanelReporteDinamicoComprobanteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComprobanteFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComprobanteFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComprobanteFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComprobanteFormaPago);
		this.jInternalFrameReporteDinamicoComprobanteFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComprobanteFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComprobanteFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComprobanteFormaPago.setName("jPanelImportacionComprobanteFormaPago"); 
		
		this.jPanelImportacionComprobanteFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComprobanteFormaPago.setLayout(gridaBagLayoutImportacionComprobanteFormaPago);
		
		
		this.jInternalFrameImportacionComprobanteFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComprobanteFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComprobanteFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComprobanteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComprobanteFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteFormaPago.setResizable(true);
	    this.jInternalFrameImportacionComprobanteFormaPago.setClosable(true);
	    this.jInternalFrameImportacionComprobanteFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComprobanteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComprobanteFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteFormaPago.setResizable(true);
	    this.jInternalFrameImportacionComprobanteFormaPago.setClosable(true);
	    this.jInternalFrameImportacionComprobanteFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComprobanteFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComprobanteFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionComprobanteFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteFormaPago.add(this.jLabelArchivoImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComprobanteFormaPago = new JFileChooser();		
		this.jFileChooserImportacionComprobanteFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComprobanteFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionComprobanteFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComprobanteFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComprobanteFormaPago.setToolTipText("Generar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFormaPago.add(this.jButtonAbrirImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComprobanteFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionComprobanteFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComprobanteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteFormaPago.add(this.jLabelPathArchivoImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComprobanteFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComprobanteFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFormaPago.add(this.jTextFieldPathArchivoImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComprobanteFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionComprobanteFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComprobanteFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComprobanteFormaPago.setToolTipText("Generar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFormaPago.add(this.jButtonGenerarImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComprobanteFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionComprobanteFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComprobanteFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComprobanteFormaPago.setToolTipText("Cancelar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFormaPago.add(this.jButtonCerrarImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComprobanteFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionComprobanteFormaPago= new JScrollPane(jPanelImportacionComprobanteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsComprobanteFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComprobanteFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComprobanteFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComprobanteFormaPago);
		this.jInternalFrameImportacionComprobanteFormaPago.getContentPane().add(this.jScrollPanelImportacionComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComprobanteFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComprobanteFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByComprobanteFormaPago.setText("Orden");
			this.jButtonAbrirOrderByComprobanteFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComprobanteFormaPago";
			inputMap = this.jButtonAbrirOrderByComprobanteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComprobanteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComprobanteFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByComprobanteFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComprobanteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComprobanteFormaPago.setName("jPanelOrderByComprobanteFormaPago"); 
			
			this.jPanelOrderByComprobanteFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComprobanteFormaPago.setLayout(gridaBagLayoutOrderByComprobanteFormaPago);
			
			
			this.jTableDatosComprobanteFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosComprobanteFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComprobanteFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComprobanteFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComprobanteFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComprobanteFormaPagoOrderBy.setViewportView(this.jTableDatosComprobanteFormaPagoOrderBy);
			this.jTableDatosComprobanteFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComprobanteFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComprobanteFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComprobanteFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComprobanteFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComprobanteFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComprobanteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComprobanteFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComprobanteFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByComprobanteFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComprobanteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComprobanteFormaPago.setResizable(true);
			this.jInternalFrameOrderByComprobanteFormaPago.setClosable(true);
			this.jInternalFrameOrderByComprobanteFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComprobanteFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComprobanteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComprobanteFormaPago.ipady =150;
				
			this.jPanelOrderByComprobanteFormaPago.add(jScrollPanelDatosComprobanteFormaPagoOrderBy, this.gridBagConstraintsComprobanteFormaPago);//this.jTableDatosComprobanteFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComprobanteFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByComprobanteFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComprobanteFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComprobanteFormaPago.setToolTipText("Cancelar"+" "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComprobanteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComprobanteFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComprobanteFormaPago.add(this.jButtonCerrarOrderByComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComprobanteFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByComprobanteFormaPago= new JScrollPane(jPanelOrderByComprobanteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComprobanteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsComprobanteFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComprobanteFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComprobanteFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComprobanteFormaPago);
			
			this.jInternalFrameOrderByComprobanteFormaPago.getContentPane().add(this.jScrollPanelOrderByComprobanteFormaPago, this.gridBagConstraintsComprobanteFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByComprobanteFormaPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//5330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.comprobanteformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComprobanteFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosComprobanteFormaPago.getRowHeight();//ComprobanteFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.isSelected()) {
					iHeightTable=ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteFormaPago.isSelected()) {
					iHeightTable=ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComprobanteFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComprobanteFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComprobanteFormaPago!=null && this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComprobanteFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComprobanteFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComprobanteFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComprobanteFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=comprobanteformapagoLogic.getComprobanteFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobanteformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComprobanteFormaPago> TraerComprobanteFormaPagoBeans(List<ComprobanteFormaPago> comprobanteformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagos) {
					
				if(!(ComprobanteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComprobanteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comprobanteformapago.setsDetalleGeneralEntityReporte(ComprobanteFormaPagoConstantesFunciones.getComprobanteFormaPagoDescripcion(comprobanteformapago));
										
						
					
						
					
				} else  {
							
					//comprobanteformapago.setsDetalleGeneralEntityReporte(comprobanteformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//comprobanteformapagobeans.add(comprobanteformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comprobanteformapagos;
    }
	//PARA REPORTES FIN
}
