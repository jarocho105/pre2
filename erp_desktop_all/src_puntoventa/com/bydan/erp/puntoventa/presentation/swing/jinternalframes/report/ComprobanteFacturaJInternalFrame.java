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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
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
import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaConstantesFunciones;

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
public class ComprobanteFacturaJInternalFrame extends ComprobanteFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComprobanteFactura;
	
	protected JMenuBar jmenuBarComprobanteFactura;
	
	protected JMenu jmenuComprobanteFactura;
	protected JMenu jmenuDatosComprobanteFactura;
	protected JMenu jmenuArchivoComprobanteFactura;
	protected JMenu jmenuAccionesComprobanteFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComprobanteFactura;	
	protected GridBagConstraints gridBagConstraintsComprobanteFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComprobanteFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormComprobanteFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComprobanteFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComprobanteFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ComprobanteFacturaSessionBean comprobantefacturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CajaSessionBean cajaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComprobanteFactura> comprobantefacturas;		
	public List<ComprobanteFactura> comprobantefacturasEliminados;	
	public List<ComprobanteFactura> comprobantefacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComprobanteFactura;		
	protected JButton jButtonAbrirOrderByComprobanteFactura;
	
	
	//protected JPanel jPanelOrderByComprobanteFactura;
	//public JScrollPane jScrollPanelOrderByComprobanteFactura;	
	//protected JButton jButtonCerrarOrderByComprobanteFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComprobanteFacturaLogic comprobantefacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComprobanteFactura;
	public JScrollPane jScrollPanelDatosEdicionComprobanteFactura;
	public JScrollPane jScrollPanelDatosGeneralComprobanteFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosComprobanteFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComprobanteFactura;
	//public JScrollPane jScrollPanelImportacionComprobanteFactura;
	
	
	
	protected JPanel jPanelAccionesComprobanteFactura;
	
    protected JPanel jPanelPaginacionComprobanteFactura;
    protected JPanel jPanelParametrosReportesComprobanteFactura;
	protected JPanel jPanelParametrosReportesAccionesComprobanteFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComprobanteFactura;
	protected JPanel jPanelParametrosAuxiliar2ComprobanteFactura;
	protected JPanel jPanelParametrosAuxiliar3ComprobanteFactura;
	protected JPanel jPanelParametrosAuxiliar4ComprobanteFactura;
	//protected JPanel jPanelParametrosAuxiliar5ComprobanteFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoComprobanteFactura;
	//protected JPanel jPanelImportacionComprobanteFactura;
	
	
	public JTable jTableDatosComprobanteFactura;
	
	
	
	//public JTable jTableDatosComprobanteFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComprobanteFactura;
	protected JButton jButtonDuplicarComprobanteFactura;
	protected JButton jButtonCopiarComprobanteFactura;
	protected JButton jButtonVerFormComprobanteFactura;
	protected JButton jButtonNuevoRelacionesComprobanteFactura;
	protected JButton jButtonModificarComprobanteFactura;
	
    protected JButton jButtonGuardarCambiosTablaComprobanteFactura;
	protected JButton jButtonCerrarComprobanteFactura;
	
	
	protected JButton jButtonRecargarInformacionComprobanteFactura;
	protected JButton jButtonProcesarInformacionComprobanteFactura;
	
	
	protected JButton jButtonAnterioresComprobanteFactura;
	protected JButton jButtonSiguientesComprobanteFactura;
	protected JButton jButtonNuevoGuardarCambiosComprobanteFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComprobanteFactura;
	//protected JButton jButtonCerrarReporteDinamicoComprobanteFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoComprobanteFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionComprobanteFactura;
	//protected JButton jButtonGenerarImportacionComprobanteFactura;
	//protected JButton jButtonCerrarImportacionComprobanteFactura;
	//protected JFileChooser jFileChooserImportacionComprobanteFactura;
	//protected File fileImportacionComprobanteFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComprobanteFactura;
	protected JButton jButtonDuplicarToolBarComprobanteFactura;
	protected JButton jButtonNuevoRelacionesToolBarComprobanteFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarComprobanteFactura;
	protected JButton jButtonCopiarToolBarComprobanteFactura;
	protected JButton jButtonVerFormToolBarComprobanteFactura;
	public JButton jButtonGuardarCambiosTablaToolBarComprobanteFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarComprobanteFactura;
	protected JButton jButtonCerrarToolBarComprobanteFactura;
	
	protected JButton jButtonRecargarInformacionToolBarComprobanteFactura;
	protected JButton jButtonProcesarInformacionToolBarComprobanteFactura;
	protected JButton jButtonAnterioresToolBarComprobanteFactura;
	protected JButton jButtonSiguientesToolBarComprobanteFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarComprobanteFactura;
	protected JButton jButtonAbrirOrderByToolBarComprobanteFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComprobanteFactura;
	protected JMenuItem jMenuItemDuplicarComprobanteFactura;
	protected JMenuItem jMenuItemNuevoRelacionesComprobanteFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComprobanteFactura;
	protected JMenuItem jMenuItemCopiarComprobanteFactura;
	protected JMenuItem jMenuItemVerFormComprobanteFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaComprobanteFactura;
	protected JMenuItem jMenuItemCerrarComprobanteFactura;
	protected JMenuItem jMenuItemDetalleCerrarComprobanteFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComprobanteFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarComprobanteFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionComprobanteFactura;
	protected JMenuItem jMenuItemProcesarInformacionComprobanteFactura;
	protected JMenuItem jMenuItemAnterioresComprobanteFactura;
	protected JMenuItem jMenuItemSiguientesComprobanteFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComprobanteFactura;
	protected JMenuItem jMenuItemAbrirOrderByComprobanteFactura;
	protected JMenuItem jMenuItemMostrarOcultarComprobanteFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComprobanteFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComprobanteFactura;
	protected JCheckBox jCheckBoxSeleccionadosComprobanteFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComprobanteFactura;
	protected JCheckBox jCheckBoxConGraficoReporteComprobanteFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComprobanteFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComprobanteFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComprobanteFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComprobanteFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComprobanteFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComprobanteFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComprobanteFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComprobanteFactura;
	protected JTextField jTextFieldValorCampoGeneralComprobanteFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComprobanteFactura;
	//public JList<Reporte> jListColumnasSelectReporteComprobanteFactura;
	//public JScrollPane jScrollColumnasSelectReporteComprobanteFactura;
	
	//public JLabel jLabelRelacionesSelectReporteComprobanteFactura;
	//public JList<Reporte> jListRelacionesSelectReporteComprobanteFactura;
	//public JScrollPane jScrollRelacionesSelectReporteComprobanteFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComprobanteFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComprobanteFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComprobanteFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoComprobanteFactura;
	
		
	//public JLabel jLabelArchivoImportacionComprobanteFactura;	
	//public JLabel jLabelPathArchivoImportacionComprobanteFactura;
	//protected JTextField jTextFieldPathArchivoImportacionComprobanteFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComprobanteFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComprobanteFactura;
	
	//public JLabel jLabelColumnaCategoriaValorComprobanteFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComprobanteFactura;
	
	//public JLabel jLabelColumnasValoresGraficoComprobanteFactura;
	//public JList<Reporte> jListColumnasValoresGraficoComprobanteFactura;
	//public JScrollPane jScrollColumnasValoresGraficoComprobanteFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComprobanteFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComprobanteFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComprobanteFactura;
	public JPanel jPanelBusquedaComprobanteFacturaComprobanteFactura;
	public JButton jButtonBusquedaComprobanteFacturaComprobanteFactura;
	
	public JPanel jPanelid_vendedorBusquedaComprobanteFacturaComprobanteFactura;
	public JLabel jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura;
	public JButton jButtonid_vendedorBusquedaComprobanteFacturaComprobanteFactura= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaComprobanteFacturaComprobanteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaComprobanteFacturaComprobanteFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura;
	public JLabel jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura;

	public JDateChooser jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura;
	public JButton jButtonfecha_inicioBusquedaComprobanteFacturaComprobanteFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaComprobanteFacturaComprobanteFactura;
	public JLabel jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura;
	//public JFormattedTextField jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura;

	public JDateChooser jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura;
	public JButton jButtonfecha_finBusquedaComprobanteFacturaComprobanteFacturaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComprobanteFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComprobanteFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComprobanteFactura)	{
		this.jButtonRecargarInformacionComprobanteFactura = jButtonRecargarInformacionComprobanteFactura;
	}
	
	public JButton getjButtonProcesarInformacionComprobanteFactura() {
		return this.jButtonProcesarInformacionComprobanteFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComprobanteFactura)	{
		this.jButtonProcesarInformacionComprobanteFactura = jButtonProcesarInformacionComprobanteFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionComprobanteFactura() {
		return this.jButtonRecargarInformacionComprobanteFactura;
	}
	
	
	public List<ComprobanteFactura> getcomprobantefacturas() {
		return this.comprobantefacturas;
	}

	public void setcomprobantefacturas(List<ComprobanteFactura> comprobantefacturas) {
		this.comprobantefacturas = comprobantefacturas;
	}
	
	public List<ComprobanteFactura> getcomprobantefacturasAux() {
		return this.comprobantefacturasAux;
	}

	public void setcomprobantefacturasAux(List<ComprobanteFactura> comprobantefacturasAux) {
		this.comprobantefacturasAux = comprobantefacturasAux;
	}
	
	public List<ComprobanteFactura> getcomprobantefacturasEliminados() {
		return this.comprobantefacturasEliminados;
	}

	public void setComprobanteFacturasEliminados(List<ComprobanteFactura> comprobantefacturasEliminados) {
		this.comprobantefacturasEliminados = comprobantefacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComprobanteFactura() {
		return jComboBoxTiposSeleccionarComprobanteFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComprobanteFactura(
			JComboBox jComboBoxTiposSeleccionarComprobanteFactura) {
		this.jComboBoxTiposSeleccionarComprobanteFactura = jComboBoxTiposSeleccionarComprobanteFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComprobanteFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComprobanteFactura() {
		return jTextFieldValorCampoGeneralComprobanteFactura;
	}

	public void setjTextFieldValorCampoGeneralComprobanteFactura(
			JTextField jTextFieldValorCampoGeneralComprobanteFactura) {
		this.jTextFieldValorCampoGeneralComprobanteFactura = jTextFieldValorCampoGeneralComprobanteFactura;
	}

	public void setBorderResaltarValorCampoGeneralComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComprobanteFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComprobanteFactura() {
		return this.jCheckBoxSeleccionarTodosComprobanteFactura;
	}

	public void setjCheckBoxSeleccionarTodosComprobanteFactura(
			JCheckBox jCheckBoxSeleccionarTodosComprobanteFactura) {
		this.jCheckBoxSeleccionarTodosComprobanteFactura = jCheckBoxSeleccionarTodosComprobanteFactura;
	}

	public void setBorderResaltarSeleccionarTodosComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComprobanteFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComprobanteFactura() {
		return this.jCheckBoxSeleccionadosComprobanteFactura;
	}

	public void setjCheckBoxSeleccionadosComprobanteFactura(
			JCheckBox jCheckBoxSeleccionadosComprobanteFactura) {
		this.jCheckBoxSeleccionadosComprobanteFactura = jCheckBoxSeleccionadosComprobanteFactura;
	}
	
	public void setBorderResaltarSeleccionadosComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComprobanteFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComprobanteFactura() {
		return this.jComboBoxTiposArchivosReportesComprobanteFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComprobanteFactura(
			JComboBox jComboBoxTiposArchivosReportesComprobanteFactura) {
		this.jComboBoxTiposArchivosReportesComprobanteFactura = jComboBoxTiposArchivosReportesComprobanteFactura;
	}

	public void setBorderResaltarTiposArchivosReportesComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComprobanteFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComprobanteFactura() {
		return this.jComboBoxTiposReportesComprobanteFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComprobanteFactura(
			JComboBox jComboBoxTiposReportesComprobanteFactura) {
		this.jComboBoxTiposReportesComprobanteFactura = jComboBoxTiposReportesComprobanteFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComprobanteFactura() {
	//	return jComboBoxTiposReportesDinamicoComprobanteFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComprobanteFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoComprobanteFactura) {
	//	this.jComboBoxTiposReportesDinamicoComprobanteFactura = jComboBoxTiposReportesDinamicoComprobanteFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComprobanteFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoComprobanteFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComprobanteFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComprobanteFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura = jComboBoxTiposArchivosReportesDinamicoComprobanteFactura;
	//}
	
	public void setBorderResaltarTiposReportesComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComprobanteFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComprobanteFactura() {
		return this.jComboBoxTiposGraficosReportesComprobanteFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComprobanteFactura(
			JComboBox jComboBoxTiposGraficosReportesComprobanteFactura) {
		this.jComboBoxTiposGraficosReportesComprobanteFactura = jComboBoxTiposGraficosReportesComprobanteFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComprobanteFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComprobanteFactura() {
		return this.jComboBoxTiposPaginacionComprobanteFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComprobanteFactura(
			JComboBox jComboBoxTiposPaginacionComprobanteFactura) {
		this.jComboBoxTiposPaginacionComprobanteFactura = jComboBoxTiposPaginacionComprobanteFactura;
	}
	
	public void setBorderResaltarTiposPaginacionComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComprobanteFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComprobanteFactura() {
		return this.jComboBoxTiposRelacionesComprobanteFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComprobanteFactura() {
		return this.jComboBoxTiposAccionesComprobanteFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComprobanteFactura(
			JComboBox jComboBoxTiposRelacionesComprobanteFactura) {
		this.jComboBoxTiposRelacionesComprobanteFactura = jComboBoxTiposRelacionesComprobanteFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComprobanteFactura(
			JComboBox jComboBoxTiposAccionesComprobanteFactura) {
		this.jComboBoxTiposAccionesComprobanteFactura = jComboBoxTiposAccionesComprobanteFactura;
	}
	
	public void setBorderResaltarTiposRelacionesComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComprobanteFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComprobanteFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComprobanteFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComprobanteFactura() {
	//	return jCheckBoxConGraficoDinamicoComprobanteFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoComprobanteFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoComprobanteFactura) {
	//	this.jCheckBoxConGraficoDinamicoComprobanteFactura = jCheckBoxConGraficoDinamicoComprobanteFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComprobanteFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComprobanteFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComprobanteFactura .setBorder(borderResaltar);		
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
		this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
		
		this.comprobantefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comprobantefacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComprobanteFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComprobanteFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComprobanteFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComprobanteFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComprobanteFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comprobante Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		ComprobanteFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComprobanteFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComprobanteFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"nuevo","nuevo","Nuevo"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"duplicar","duplicar","Duplicar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"copiar","copiar","Copiar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"ver_form","ver_form","Ver"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"recargar","recargar","Buscar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComprobanteFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComprobanteFactura,this.jTtoolBarComprobanteFactura,
							"cerrar","cerrar","Salir"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComprobanteFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComprobanteFactura;
			
				this.jButtonProcesarInformacionToolBarComprobanteFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComprobanteFactura;
				
		//protected JButton jButtonModificarToolBarComprobanteFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComprobanteFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComprobanteFactura=new JMenuMe("General");
		this.jmenuArchivoComprobanteFactura=new JMenuMe("Archivo");
		this.jmenuAccionesComprobanteFactura=new JMenuMe("Acciones");
		this.jmenuDatosComprobanteFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComprobanteFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComprobanteFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComprobanteFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComprobanteFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComprobanteFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComprobanteFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComprobanteFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComprobanteFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComprobanteFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComprobanteFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComprobanteFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComprobanteFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComprobanteFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComprobanteFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComprobanteFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComprobanteFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComprobanteFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComprobanteFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComprobanteFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComprobanteFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComprobanteFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComprobanteFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComprobanteFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComprobanteFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComprobanteFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComprobanteFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComprobanteFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComprobanteFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComprobanteFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComprobanteFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComprobanteFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComprobanteFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComprobanteFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComprobanteFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComprobanteFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComprobanteFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComprobanteFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComprobanteFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComprobanteFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComprobanteFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComprobanteFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComprobanteFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComprobanteFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComprobanteFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComprobanteFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComprobanteFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComprobanteFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComprobanteFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComprobanteFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComprobanteFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComprobanteFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComprobanteFactura.add(this.jMenuItemCerrarComprobanteFactura);
			
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemNuevoComprobanteFactura);
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemNuevoGuardarCambiosComprobanteFactura);
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemNuevoRelacionesComprobanteFactura);
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemGuardarCambiosTablaComprobanteFactura);		
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemDuplicarComprobanteFactura);		
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemCopiarComprobanteFactura);		
			this.jmenuAccionesComprobanteFactura.add(this.jMenuItemVerFormComprobanteFactura);		
			
			this.jmenuDatosComprobanteFactura.add(this.jMenuItemRecargarInformacionComprobanteFactura);				
			this.jmenuDatosComprobanteFactura.add(this.jMenuItemAnterioresComprobanteFactura);				
			this.jmenuDatosComprobanteFactura.add(this.jMenuItemSiguientesComprobanteFactura);				
			this.jmenuDatosComprobanteFactura.add(this.jMenuItemAbrirOrderByComprobanteFactura);				
			this.jmenuDatosComprobanteFactura.add(this.jMenuItemMostrarOcultarComprobanteFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComprobanteFactura.add(this.jMenuItemGuardarCambiosComprobanteFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComprobanteFactura.add(this.jmenuArchivoComprobanteFactura);		
			this.jmenuBarComprobanteFactura.add(this.jmenuAccionesComprobanteFactura);		
			this.jmenuBarComprobanteFactura.add(this.jmenuDatosComprobanteFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComprobanteFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComprobanteFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaComprobanteFacturaComprobanteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaComprobanteFacturaComprobanteFactura.setToolTipText("Buscar Por Vendedor Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaComprobanteFacturaComprobanteFactura= new JButtonMe();
		this.jButtonBusquedaComprobanteFacturaComprobanteFactura.setText("Buscar");
		this.jButtonBusquedaComprobanteFacturaComprobanteFactura.setToolTipText("Buscar Por Vendedor Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaComprobanteFacturaComprobanteFactura,"buscar_button","Buscar Por Vendedor Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaComprobanteFacturaComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura = new JLabelMe();
		jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setText("Vendedor :");
		jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura = new JLabelMe();
		jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura= new JDateChooser();
		jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setDate(new Date());
		jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura = new JLabelMe();
		jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura.setText("Fecha Fin :");
		jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura= new JDateChooser();
		jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.setDate(new Date());
		jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasComprobanteFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasComprobanteFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasComprobanteFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasComprobanteFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComprobanteFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComprobanteFactura = new ComprobanteFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comprobante Factura DATOS");
			this.jInternalFrameDetalleFormComprobanteFactura = new ComprobanteFacturaDetalleFormJInternalFrame(jDesktopPane,this.comprobantefacturaSessionBean.getConGuardarRelaciones(),this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComprobanteFactura = null;//new ComprobanteFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComprobanteFactura= new GridBagLayout();
		
		
		this.jTableDatosComprobanteFactura = new JTableMe();      
		
		String sToolTipComprobanteFactura="";
		sToolTipComprobanteFactura=ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComprobanteFactura+="(PuntoVenta.ComprobanteFactura)";
		}
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComprobanteFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComprobanteFactura.setToolTipText(sToolTipComprobanteFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComprobanteFactura);
		this.jTableDatosComprobanteFactura.setAutoCreateRowSorter(true);
		this.jTableDatosComprobanteFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComprobanteFactura.setRowSelectionAllowed(true);
		this.jTableDatosComprobanteFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComprobanteFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComprobanteFactura = new JButtonMe();
		this.jButtonDuplicarComprobanteFactura = new JButtonMe();
		this.jButtonCopiarComprobanteFactura = new JButtonMe();
		this.jButtonVerFormComprobanteFactura = new JButtonMe();
		this.jButtonNuevoRelacionesComprobanteFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComprobanteFactura = new JButtonMe();
		this.jButtonCerrarComprobanteFactura = new JButtonMe();
		
		this.jScrollPanelDatosComprobanteFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralComprobanteFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comprobante Factura";
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosComprobanteFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComprobanteFactura.setToolTipText("Acciones");
        this.jPanelAccionesComprobanteFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComprobanteFactura=new ReporteDinamicoJInternalFrame(ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComprobanteFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComprobanteFactura=new ImportacionJInternalFrame(ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComprobanteFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComprobanteFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByComprobanteFactura.setText("Orden");
		this.jButtonAbrirOrderByComprobanteFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFactura,false,this);
			
			//this.cargarOrderByComprobanteFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComprobanteFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFactura,true,this);
			
			//this.cargarOrderByComprobanteFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComprobanteFactura.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosComprobanteFactura.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosComprobanteFactura.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosComprobanteFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComprobanteFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComprobanteFactura.setText("Nuevo");
		this.jButtonDuplicarComprobanteFactura.setText("Duplicar");
		this.jButtonCopiarComprobanteFactura.setText("Copiar");
		this.jButtonVerFormComprobanteFactura.setText("Ver");
		this.jButtonNuevoRelacionesComprobanteFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.setText("Guardar");
		this.jButtonCerrarComprobanteFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComprobanteFactura,"nuevo_button","Nuevo",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComprobanteFactura,"duplicar_button","Duplicar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComprobanteFactura,"copiar_button","Copiar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComprobanteFactura,"ver_form","Ver",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComprobanteFactura,"nuevorelaciones_button","Nuevo Rel",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComprobanteFactura,"guardarcambiostabla_button","Guardar",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComprobanteFactura,"cerrar_button","Salir",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComprobanteFactura.setToolTipText("Nuevo"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComprobanteFactura.setToolTipText("Duplicar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComprobanteFactura.setToolTipText("Copiar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComprobanteFactura.setToolTipText("Ver"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComprobanteFactura.setToolTipText("Nuevo Rel"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.setToolTipText("Guardar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComprobanteFactura.setToolTipText("Salir"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComprobanteFactura";
		inputMap = this.jButtonNuevoComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComprobanteFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComprobanteFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarComprobanteFactura";
		inputMap = this.jButtonDuplicarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComprobanteFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComprobanteFactura"));
		
		//COPIAR
		sMapKey = "CopiarComprobanteFactura";
		inputMap = this.jButtonCopiarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComprobanteFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComprobanteFactura"));
		
		//VEr FORM
		sMapKey = "VerFormComprobanteFactura";
		inputMap = this.jButtonVerFormComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComprobanteFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComprobanteFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComprobanteFactura";
		inputMap = this.jButtonNuevoRelacionesComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComprobanteFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComprobanteFactura";
		inputMap = this.jButtonModificarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComprobanteFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComprobanteFactura";
		inputMap = this.jButtonCerrarComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComprobanteFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComprobanteFactura";
		inputMap = this.jButtonGuardarCambiosTablaComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComprobanteFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComprobanteFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComprobanteFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComprobanteFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComprobanteFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComprobanteFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComprobanteFactura.setName("jPanelParametrosReportesComprobanteFactura"); 
		
		this.jPanelParametrosReportesAccionesComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComprobanteFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComprobanteFactura.setName("jPanelParametrosReportesAccionesComprobanteFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComprobanteFactura = new JButtonMe();
		this.jButtonRecargarInformacionComprobanteFactura.setText("Buscar");
		this.jButtonRecargarInformacionComprobanteFactura.setToolTipText("Buscar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComprobanteFactura,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionComprobanteFactura.setVisible(false);
		
		
		this.jButtonProcesarInformacionComprobanteFactura = new JButtonMe();
		this.jButtonProcesarInformacionComprobanteFactura.setText("Procesar");
		this.jButtonProcesarInformacionComprobanteFactura.setToolTipText("Procesar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComprobanteFactura.setVisible(false);
			
		this.jButtonProcesarInformacionComprobanteFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComprobanteFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComprobanteFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFactura.setText("TIPO");       
		this.jComboBoxTiposReportesComprobanteFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComprobanteFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComprobanteFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComprobanteFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionComprobanteFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComprobanteFactura.setText("Accion");
		this.jComboBoxTiposRelacionesComprobanteFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComprobanteFactura.setText("Accion");
		this.jComboBoxTiposAccionesComprobanteFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComprobanteFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarComprobanteFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComprobanteFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComprobanteFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComprobanteFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComprobanteFactura = new JLabelMe();
		
		this.jLabelAccionesComprobanteFactura.setText("Acciones");		
		this.jLabelAccionesComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComprobanteFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComprobanteFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComprobanteFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComprobanteFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComprobanteFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComprobanteFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComprobanteFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComprobanteFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComprobanteFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComprobanteFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComprobanteFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteComprobanteFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComprobanteFactura = new JButtonMe();
		//this.jButtonAnterioresComprobanteFactura.setText("<<");
        this.jButtonAnterioresComprobanteFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComprobanteFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComprobanteFactura = new JButtonMe();
		//this.jButtonSiguientesComprobanteFactura.setText(">>");
        this.jButtonSiguientesComprobanteFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComprobanteFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComprobanteFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComprobanteFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosComprobanteFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComprobanteFactura,"nuevoguardarcambios_button","Nue",this.comprobantefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComprobanteFactura";
		inputMap = this.jButtonNuevoGuardarCambiosComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComprobanteFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComprobanteFactura";
		inputMap = this.jButtonRecargarInformacionComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComprobanteFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComprobanteFactura";
		inputMap = this.jButtonSiguientesComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComprobanteFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComprobanteFactura";
		inputMap = this.jButtonAnterioresComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComprobanteFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComprobanteFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComprobanteFactura.setMinimumSize(new Dimension(this.getWidth(),ComprobanteFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteFactura.setMaximumSize(new Dimension(this.getWidth(),ComprobanteFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComprobanteFactura.setPreferredSize(new Dimension(this.getWidth(),ComprobanteFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComprobanteFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComprobanteFactura = new GridBagLayout();

			this.jPanelPaginacionComprobanteFactura.setLayout(gridaBagLayoutPaginacionComprobanteFactura);						
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 0;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonAnterioresComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
					
						
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteFactura.gridy = 0;
			
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonNuevoGuardarCambiosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
						
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComprobanteFactura.gridy = 0;
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonSiguientesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 1;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonNuevoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
						
			
			
			if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComprobanteFactura.gridy = 1;
				this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComprobanteFactura.add(this.jButtonGuardarCambiosTablaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			}
			
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 1;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonDuplicarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 1;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonCopiarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 1;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonVerFormComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 1;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComprobanteFactura.add(this.jButtonCerrarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		
		this.jButtonRecargarInformacionComprobanteFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComprobanteFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComprobanteFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComprobanteFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComprobanteFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComprobanteFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComprobanteFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComprobanteFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComprobanteFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComprobanteFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComprobanteFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComprobanteFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComprobanteFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComprobanteFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComprobanteFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComprobanteFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComprobanteFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComprobanteFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComprobanteFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComprobanteFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComprobanteFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComprobanteFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComprobanteFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComprobanteFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComprobanteFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComprobanteFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComprobanteFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComprobanteFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComprobanteFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComprobanteFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComprobanteFactura.setLayout(gridaBagParametrosReportesComprobanteFactura);
			this.jPanelParametrosReportesAccionesComprobanteFactura.setLayout(gridaBagParametrosReportesAccionesComprobanteFactura);
			
			
			this.jPanelParametrosAuxiliar1ComprobanteFactura.setLayout(gridaBagParametrosAuxiliar1ComprobanteFactura);
			this.jPanelParametrosAuxiliar2ComprobanteFactura.setLayout(gridaBagParametrosAuxiliar2ComprobanteFactura);
			this.jPanelParametrosAuxiliar3ComprobanteFactura.setLayout(gridaBagParametrosAuxiliar3ComprobanteFactura);
			this.jPanelParametrosAuxiliar4ComprobanteFactura.setLayout(gridaBagParametrosAuxiliar4ComprobanteFactura);
			//this.jPanelParametrosAuxiliar5ComprobanteFactura.setLayout(gridaBagParametrosAuxiliar2ComprobanteFactura);			
			
			
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFactura.add(this.jButtonRecargarInformacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFactura.add(this.jComboBoxTiposPaginacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFactura.add(this.jCheckBoxConAltoMaximoTablaComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComprobanteFactura.add(this.jComboBoxTiposArchivosReportesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFactura.add(this.jPanelParametrosAuxiliar1ComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComprobanteFactura.add(this.jComboBoxTiposReportesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);																		
			
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComprobanteFactura.add(this.jComboBoxTiposGraficosReportesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFactura.add(this.jPanelParametrosAuxiliar4ComprobanteFactura, this.gridBagConstraintsComprobanteFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFactura.add(this.jComboBoxTiposReportesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFactura.add(this.jCheckBoxGenerarReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFactura.add(this.jPanelParametrosAuxiliar2ComprobanteFactura, this.gridBagConstraintsComprobanteFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFactura.add(this.jLabelAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
				this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComprobanteFactura.add(this.jButtonAbrirOrderByComprobanteFactura, this.gridBagConstraintsComprobanteFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFactura.add(this.jComboBoxTiposSeleccionarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
			
			
			/*
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFactura.add(this.jCheckBoxSeleccionarTodosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComprobanteFactura.add(this.jCheckBoxConGraficoReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFactura.add(this.jCheckBoxSeleccionarTodosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);															
				
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFactura.add(this.jCheckBoxSeleccionadosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);															
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComprobanteFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComprobanteFactura.add(this.jCheckBoxConGraficoReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComprobanteFactura.add(this.jPanelParametrosAuxiliar3ComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComprobanteFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComprobanteFactura.add(this.jComboBoxTiposAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComprobanteFactura = new GridBagLayout();

			this.jScrollPanelDatosComprobanteFactura.setLayout(gridaBagLayoutDatosComprobanteFactura);
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = 0;
			this.gridBagConstraintsComprobanteFactura.gridx = 0;
			
			this.jScrollPanelDatosComprobanteFactura.add(this.jTableDatosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComprobanteFactura.setViewportView(this.jTableDatosComprobanteFactura);
		this.jTableDatosComprobanteFactura.setFillsViewportHeight(true);
		this.jTableDatosComprobanteFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComprobanteFactura= new GridBagLayout();
		this.jPanelAccionesComprobanteFactura.setLayout(gridaBagLayoutAccionesComprobanteFactura);
		
		
		/*	
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = 0;
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
			
		this.jPanelAccionesComprobanteFactura.add(this.jButtonNuevoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaComprobanteFacturaComprobanteFactura= new GridBagLayout();
		gridaBagLayoutBusquedaComprobanteFacturaComprobanteFactura.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaComprobanteFacturaComprobanteFactura.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaComprobanteFacturaComprobanteFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaComprobanteFacturaComprobanteFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaComprobanteFacturaComprobanteFactura.setLayout(gridaBagLayoutBusquedaComprobanteFacturaComprobanteFactura);

		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 0;
		gridBagConstraintsComprobanteFactura.gridx = 0;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jLabelid_vendedorBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);

		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 0;
		gridBagConstraintsComprobanteFactura.gridx = 1;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);


		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 1;
		gridBagConstraintsComprobanteFactura.gridx = 0;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jLabelfecha_inicioBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);

		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 1;
		gridBagConstraintsComprobanteFactura.gridx = 1;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);


		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 2;
		gridBagConstraintsComprobanteFactura.gridx = 0;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jLabelfecha_finBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);

		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 2;
		gridBagConstraintsComprobanteFactura.gridx = 1;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);

		gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComprobanteFactura.gridy = 3;
		gridBagConstraintsComprobanteFactura.gridx =1;
		jPanelBusquedaComprobanteFacturaComprobanteFactura.add(jButtonBusquedaComprobanteFacturaComprobanteFactura, gridBagConstraintsComprobanteFactura);

		jTabbedPaneBusquedasComprobanteFactura.addTab("1.-Por Vendedor Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaComprobanteFacturaComprobanteFactura);
		jTabbedPaneBusquedasComprobanteFactura.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComprobanteFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComprobanteFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();						
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFactura.gridx = 0;		
			//this.gridBagConstraintsComprobanteFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComprobanteFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComprobanteFactura, this.gridBagConstraintsComprobanteFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFactura.gridx = 0;		
		//this.gridBagConstraintsComprobanteFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComprobanteFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComprobanteFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComprobanteFactura.gridx = 0;		
			this.gridBagConstraintsComprobanteFactura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComprobanteFactura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComprobanteFactura, this.gridBagConstraintsComprobanteFactura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);								
		
		
		/*
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		*/		
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComprobanteFactura.gridx =0;
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComprobanteFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
				
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComprobanteFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComprobanteFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosComprobanteFactura.setLayout(gridaBagLayoutBusquedasParametrosComprobanteFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComprobanteFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComprobanteFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComprobanteFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
			
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComprobanteFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComprobanteFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComprobanteFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComprobanteFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComprobanteFactura.setName("jPanelReporteDinamicoComprobanteFactura"); 
		
		this.jPanelReporteDinamicoComprobanteFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComprobanteFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComprobanteFactura.setLayout(gridaBagLayoutReporteDinamicoComprobanteFactura);
		
		
		this.jInternalFrameReporteDinamicoComprobanteFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComprobanteFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComprobanteFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComprobanteFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComprobanteFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComprobanteFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComprobanteFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComprobanteFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoComprobanteFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoComprobanteFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComprobanteFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComprobanteFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComprobanteFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteComprobanteFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelColumnasSelectReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComprobanteFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteComprobanteFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComprobanteFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComprobanteFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComprobanteFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComprobanteFactura=new JScrollPane(this.jListColumnasSelectReporteComprobanteFactura);
			
			this.jScrollColumnasSelectReporteComprobanteFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComprobanteFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComprobanteFactura.add(this.jListColumnasSelectReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jScrollColumnasSelectReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComprobanteFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteComprobanteFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComprobanteFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteComprobanteFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComprobanteFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComprobanteFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComprobanteFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComprobanteFactura=new JScrollPane(this.jListRelacionesSelectReporteComprobanteFactura);
			
			this.jScrollRelacionesSelectReporteComprobanteFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComprobanteFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComprobanteFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComprobanteFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoComprobanteFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComprobanteFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComprobanteFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComprobanteFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComprobanteFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComprobanteFactura = new JLabelMe();

		this.jLabelConGraficoDinamicoComprobanteFactura.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelConGraficoDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComprobanteFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComprobanteFactura.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComprobanteFactura.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComprobanteFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComprobanteFactura.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jCheckBoxConGraficoDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComprobanteFactura = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComprobanteFactura.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelColumnaCategoriaGraficoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComprobanteFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComprobanteFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComprobanteFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jComboBoxColumnaCategoriaGraficoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComprobanteFactura = new JLabelMe();

		this.jLabelColumnaCategoriaValorComprobanteFactura.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelColumnaCategoriaValorComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComprobanteFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComprobanteFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComprobanteFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComprobanteFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jComboBoxColumnaCategoriaValorComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComprobanteFactura = new JLabelMe();

		this.jLabelColumnasValoresGraficoComprobanteFactura.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelColumnasValoresGraficoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComprobanteFactura = new JList<Reporte>();
		this.jListColumnasValoresGraficoComprobanteFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComprobanteFactura.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComprobanteFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComprobanteFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComprobanteFactura=new JScrollPane(this.jListColumnasValoresGraficoComprobanteFactura);
			
			this.jScrollColumnasValoresGraficoComprobanteFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComprobanteFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComprobanteFactura.add(this.jListColumnasSelectReporteComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jScrollColumnasValoresGraficoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComprobanteFactura = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComprobanteFactura.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelTiposGraficosReportesDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComprobanteFactura.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComprobanteFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComprobanteFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jComboBoxTiposGraficosReportesDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComprobanteFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComprobanteFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelGenerarExcelReporteDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComprobanteFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComprobanteFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFactura.setToolTipText("Generar EXCEL"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		//this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComprobanteFactura.add(this.jButtonGenerarExcelReporteDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jComboBoxTiposReportesDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComprobanteFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComprobanteFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jLabelTiposArchivoReporteDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jComboBoxTiposArchivosReportesDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComprobanteFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComprobanteFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComprobanteFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComprobanteFactura.setToolTipText("Generar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jButtonGenerarReporteDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComprobanteFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComprobanteFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComprobanteFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComprobanteFactura.setToolTipText("Cancelar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComprobanteFactura.add(this.jButtonCerrarReporteDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComprobanteFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComprobanteFactura= new JScrollPane(jPanelReporteDinamicoComprobanteFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComprobanteFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComprobanteFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComprobanteFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComprobanteFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComprobanteFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComprobanteFactura);
		this.jInternalFrameReporteDinamicoComprobanteFactura.getContentPane().add(this.jScrollPanelReporteDinamicoComprobanteFactura, this.gridBagConstraintsComprobanteFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComprobanteFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComprobanteFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComprobanteFactura.setName("jPanelImportacionComprobanteFactura"); 
		
		this.jPanelImportacionComprobanteFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComprobanteFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComprobanteFactura.setLayout(gridaBagLayoutImportacionComprobanteFactura);
		
		
		this.jInternalFrameImportacionComprobanteFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComprobanteFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComprobanteFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComprobanteFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComprobanteFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComprobanteFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteFactura.setResizable(true);
	    this.jInternalFrameImportacionComprobanteFactura.setClosable(true);
	    this.jInternalFrameImportacionComprobanteFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComprobanteFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComprobanteFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComprobanteFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComprobanteFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComprobanteFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComprobanteFactura.setResizable(true);
	    this.jInternalFrameImportacionComprobanteFactura.setClosable(true);
	    this.jInternalFrameImportacionComprobanteFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComprobanteFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComprobanteFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComprobanteFactura = new JLabelMe();

		this.jLabelArchivoImportacionComprobanteFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteFactura.add(this.jLabelArchivoImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComprobanteFactura = new JFileChooser();		
		this.jFileChooserImportacionComprobanteFactura.setToolTipText("ESCOGER ARCHIVO"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComprobanteFactura = new JButtonMe();
		this.jButtonAbrirImportacionComprobanteFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComprobanteFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComprobanteFactura.setToolTipText("Generar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFactura.add(this.jButtonAbrirImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComprobanteFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionComprobanteFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComprobanteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComprobanteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComprobanteFactura.add(this.jLabelPathArchivoImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComprobanteFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComprobanteFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComprobanteFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFactura.add(this.jTextFieldPathArchivoImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComprobanteFactura = new JButtonMe();
		this.jButtonGenerarImportacionComprobanteFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComprobanteFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComprobanteFactura.setToolTipText("Generar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFactura.add(this.jButtonGenerarImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComprobanteFactura = new JButtonMe();
		this.jButtonCerrarImportacionComprobanteFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComprobanteFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComprobanteFactura.setToolTipText("Cancelar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComprobanteFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsComprobanteFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComprobanteFactura.add(this.jButtonCerrarImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComprobanteFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionComprobanteFactura= new JScrollPane(jPanelImportacionComprobanteFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
		this.gridBagConstraintsComprobanteFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsComprobanteFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComprobanteFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComprobanteFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComprobanteFactura);
		this.jInternalFrameImportacionComprobanteFactura.getContentPane().add(this.jScrollPanelImportacionComprobanteFactura, this.gridBagConstraintsComprobanteFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComprobanteFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComprobanteFactura = new JButtonMe();
			this.jButtonAbrirOrderByComprobanteFactura.setText("Orden");
			this.jButtonAbrirOrderByComprobanteFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComprobanteFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComprobanteFactura";
			inputMap = this.jButtonAbrirOrderByComprobanteFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComprobanteFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComprobanteFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByComprobanteFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComprobanteFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComprobanteFactura.setName("jPanelOrderByComprobanteFactura"); 
			
			this.jPanelOrderByComprobanteFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComprobanteFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComprobanteFactura.setLayout(gridaBagLayoutOrderByComprobanteFactura);
			
			
			this.jTableDatosComprobanteFacturaOrderBy = new JTableMe();        
			this.jTableDatosComprobanteFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComprobanteFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComprobanteFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComprobanteFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComprobanteFacturaOrderBy.setViewportView(this.jTableDatosComprobanteFacturaOrderBy);
			this.jTableDatosComprobanteFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComprobanteFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComprobanteFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComprobanteFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComprobanteFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComprobanteFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComprobanteFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComprobanteFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComprobanteFactura.setTitle("Orden");
			this.jInternalFrameOrderByComprobanteFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComprobanteFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComprobanteFactura.setResizable(true);
			this.jInternalFrameOrderByComprobanteFactura.setClosable(true);
			this.jInternalFrameOrderByComprobanteFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComprobanteFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComprobanteFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComprobanteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comprobante Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComprobanteFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComprobanteFactura.ipady =150;
				
			this.jPanelOrderByComprobanteFactura.add(jScrollPanelDatosComprobanteFacturaOrderBy, this.gridBagConstraintsComprobanteFactura);//this.jTableDatosComprobanteFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComprobanteFactura = new JButtonMe();
			this.jButtonCerrarOrderByComprobanteFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComprobanteFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComprobanteFactura.setToolTipText("Cancelar"+" "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComprobanteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComprobanteFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComprobanteFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComprobanteFactura.add(this.jButtonCerrarOrderByComprobanteFactura, this.gridBagConstraintsComprobanteFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComprobanteFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByComprobanteFactura= new JScrollPane(jPanelOrderByComprobanteFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComprobanteFactura = new GridBagConstraints();
			this.gridBagConstraintsComprobanteFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsComprobanteFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsComprobanteFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComprobanteFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComprobanteFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComprobanteFactura);
			
			this.jInternalFrameOrderByComprobanteFactura.getContentPane().add(this.jScrollPanelOrderByComprobanteFactura, this.gridBagConstraintsComprobanteFactura);			
		
		} else {
			this.jButtonAbrirOrderByComprobanteFactura = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.comprobantefacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComprobanteFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComprobanteFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComprobanteFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosComprobanteFactura.getRowHeight();//ComprobanteFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteFactura.isSelected()) {
					iHeightTable=ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComprobanteFactura.isSelected()) {
					iHeightTable=ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComprobanteFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComprobanteFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComprobanteFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComprobanteFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComprobanteFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComprobanteFactura!=null && this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComprobanteFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComprobanteFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComprobanteFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComprobanteFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComprobanteFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=comprobantefacturaLogic.getComprobanteFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantefacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComprobanteFactura> TraerComprobanteFacturaBeans(List<ComprobanteFactura> comprobantefacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComprobanteFactura comprobantefactura:comprobantefacturas) {
					
				if(!(ComprobanteFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComprobanteFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comprobantefactura.setsDetalleGeneralEntityReporte(ComprobanteFacturaConstantesFunciones.getComprobanteFacturaDescripcion(comprobantefactura));
										
						
					
						
					
				} else  {
							
					//comprobantefactura.setsDetalleGeneralEntityReporte(comprobantefactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//comprobantefacturabeans.add(comprobantefacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comprobantefacturas;
    }
	//PARA REPORTES FIN
}
