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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.puntoventa.util.report.ResumenCierreCajaConstantesFunciones;

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
public class ResumenCierreCajaJInternalFrame extends ResumenCierreCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarResumenCierreCaja;
	
	protected JMenuBar jmenuBarResumenCierreCaja;
	
	protected JMenu jmenuResumenCierreCaja;
	protected JMenu jmenuDatosResumenCierreCaja;
	protected JMenu jmenuArchivoResumenCierreCaja;
	protected JMenu jmenuAccionesResumenCierreCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResumenCierreCaja;	
	protected GridBagConstraints gridBagConstraintsResumenCierreCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ResumenCierreCajaDetalleFormJInternalFrame jInternalFrameDetalleFormResumenCierreCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoResumenCierreCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionResumenCierreCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ResumenCierreCajaSessionBean resumencierrecajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ResumenCierreCaja> resumencierrecajas;		
	public List<ResumenCierreCaja> resumencierrecajasEliminados;	
	public List<ResumenCierreCaja> resumencierrecajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByResumenCierreCaja;		
	protected JButton jButtonAbrirOrderByResumenCierreCaja;
	
	
	//protected JPanel jPanelOrderByResumenCierreCaja;
	//public JScrollPane jScrollPanelOrderByResumenCierreCaja;	
	//protected JButton jButtonCerrarOrderByResumenCierreCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ResumenCierreCajaLogic resumencierrecajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosResumenCierreCaja;
	public JScrollPane jScrollPanelDatosEdicionResumenCierreCaja;
	public JScrollPane jScrollPanelDatosGeneralResumenCierreCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosResumenCierreCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoResumenCierreCaja;
	//public JScrollPane jScrollPanelImportacionResumenCierreCaja;
	
	
	
	protected JPanel jPanelAccionesResumenCierreCaja;
	
    protected JPanel jPanelPaginacionResumenCierreCaja;
    protected JPanel jPanelParametrosReportesResumenCierreCaja;
	protected JPanel jPanelParametrosReportesAccionesResumenCierreCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ResumenCierreCaja;
	protected JPanel jPanelParametrosAuxiliar2ResumenCierreCaja;
	protected JPanel jPanelParametrosAuxiliar3ResumenCierreCaja;
	protected JPanel jPanelParametrosAuxiliar4ResumenCierreCaja;
	//protected JPanel jPanelParametrosAuxiliar5ResumenCierreCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoResumenCierreCaja;
	//protected JPanel jPanelImportacionResumenCierreCaja;
	
	
	public JTable jTableDatosResumenCierreCaja;
	
	
	
	//public JTable jTableDatosResumenCierreCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoResumenCierreCaja;
	protected JButton jButtonDuplicarResumenCierreCaja;
	protected JButton jButtonCopiarResumenCierreCaja;
	protected JButton jButtonVerFormResumenCierreCaja;
	protected JButton jButtonNuevoRelacionesResumenCierreCaja;
	protected JButton jButtonModificarResumenCierreCaja;
	
    protected JButton jButtonGuardarCambiosTablaResumenCierreCaja;
	protected JButton jButtonCerrarResumenCierreCaja;
	
	
	protected JButton jButtonRecargarInformacionResumenCierreCaja;
	protected JButton jButtonProcesarInformacionResumenCierreCaja;
	
	
	protected JButton jButtonAnterioresResumenCierreCaja;
	protected JButton jButtonSiguientesResumenCierreCaja;
	protected JButton jButtonNuevoGuardarCambiosResumenCierreCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoResumenCierreCaja;
	//protected JButton jButtonCerrarReporteDinamicoResumenCierreCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoResumenCierreCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionResumenCierreCaja;
	//protected JButton jButtonGenerarImportacionResumenCierreCaja;
	//protected JButton jButtonCerrarImportacionResumenCierreCaja;
	//protected JFileChooser jFileChooserImportacionResumenCierreCaja;
	//protected File fileImportacionResumenCierreCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResumenCierreCaja;
	protected JButton jButtonDuplicarToolBarResumenCierreCaja;
	protected JButton jButtonNuevoRelacionesToolBarResumenCierreCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarResumenCierreCaja;
	protected JButton jButtonCopiarToolBarResumenCierreCaja;
	protected JButton jButtonVerFormToolBarResumenCierreCaja;
	public JButton jButtonGuardarCambiosTablaToolBarResumenCierreCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarResumenCierreCaja;
	protected JButton jButtonCerrarToolBarResumenCierreCaja;
	
	protected JButton jButtonRecargarInformacionToolBarResumenCierreCaja;
	protected JButton jButtonProcesarInformacionToolBarResumenCierreCaja;
	protected JButton jButtonAnterioresToolBarResumenCierreCaja;
	protected JButton jButtonSiguientesToolBarResumenCierreCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarResumenCierreCaja;
	protected JButton jButtonAbrirOrderByToolBarResumenCierreCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResumenCierreCaja;
	protected JMenuItem jMenuItemDuplicarResumenCierreCaja;
	protected JMenuItem jMenuItemNuevoRelacionesResumenCierreCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosResumenCierreCaja;
	protected JMenuItem jMenuItemCopiarResumenCierreCaja;
	protected JMenuItem jMenuItemVerFormResumenCierreCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaResumenCierreCaja;
	protected JMenuItem jMenuItemCerrarResumenCierreCaja;
	protected JMenuItem jMenuItemDetalleCerrarResumenCierreCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByResumenCierreCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarResumenCierreCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionResumenCierreCaja;
	protected JMenuItem jMenuItemProcesarInformacionResumenCierreCaja;
	protected JMenuItem jMenuItemAnterioresResumenCierreCaja;
	protected JMenuItem jMenuItemSiguientesResumenCierreCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResumenCierreCaja;
	protected JMenuItem jMenuItemAbrirOrderByResumenCierreCaja;
	protected JMenuItem jMenuItemMostrarOcultarResumenCierreCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResumenCierreCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosResumenCierreCaja;
	protected JCheckBox jCheckBoxSeleccionadosResumenCierreCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaResumenCierreCaja;
	protected JCheckBox jCheckBoxConGraficoReporteResumenCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesResumenCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesResumenCierreCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoResumenCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarResumenCierreCaja;
	protected JTextField jTextFieldValorCampoGeneralResumenCierreCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteResumenCierreCaja;
	//public JList<Reporte> jListColumnasSelectReporteResumenCierreCaja;
	//public JScrollPane jScrollColumnasSelectReporteResumenCierreCaja;
	
	//public JLabel jLabelRelacionesSelectReporteResumenCierreCaja;
	//public JList<Reporte> jListRelacionesSelectReporteResumenCierreCaja;
	//public JScrollPane jScrollRelacionesSelectReporteResumenCierreCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoResumenCierreCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoResumenCierreCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoResumenCierreCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoResumenCierreCaja;
	
		
	//public JLabel jLabelArchivoImportacionResumenCierreCaja;	
	//public JLabel jLabelPathArchivoImportacionResumenCierreCaja;
	//protected JTextField jTextFieldPathArchivoImportacionResumenCierreCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoResumenCierreCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoResumenCierreCaja;
	
	//public JLabel jLabelColumnaCategoriaValorResumenCierreCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorResumenCierreCaja;
	
	//public JLabel jLabelColumnasValoresGraficoResumenCierreCaja;
	//public JList<Reporte> jListColumnasValoresGraficoResumenCierreCaja;
	//public JScrollPane jScrollColumnasValoresGraficoResumenCierreCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoResumenCierreCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasResumenCierreCaja;
	public JPanel jPanelBusquedaResumenCierreCajaResumenCierreCaja;
	public JButton jButtonBusquedaResumenCierreCajaResumenCierreCaja;
	
	public JPanel jPanelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja;
	public JLabel jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja;
	public JButton jButtonid_usuarioBusquedaResumenCierreCajaResumenCierreCaja= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaResumenCierreCajaResumenCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaResumenCierreCajaResumenCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cajaBusquedaResumenCierreCajaResumenCierreCaja;
	public JLabel jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja;
	public JButton jButtonid_cajaBusquedaResumenCierreCajaResumenCierreCaja= new JButtonMe();
	public JButton jButtonid_cajaBusquedaResumenCierreCajaResumenCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_cajaBusquedaResumenCierreCajaResumenCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelfechaBusquedaResumenCierreCajaResumenCierreCaja;
	public JLabel jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja;
	//public JFormattedTextField jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja;

	public JDateChooser jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja;
	public JButton jButtonfechaBusquedaResumenCierreCajaResumenCierreCajaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ResumenCierreCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenCierreCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionResumenCierreCaja)	{
		this.jButtonRecargarInformacionResumenCierreCaja = jButtonRecargarInformacionResumenCierreCaja;
	}
	
	public JButton getjButtonProcesarInformacionResumenCierreCaja() {
		return this.jButtonProcesarInformacionResumenCierreCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResumenCierreCaja)	{
		this.jButtonProcesarInformacionResumenCierreCaja = jButtonProcesarInformacionResumenCierreCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionResumenCierreCaja() {
		return this.jButtonRecargarInformacionResumenCierreCaja;
	}
	
	
	public List<ResumenCierreCaja> getresumencierrecajas() {
		return this.resumencierrecajas;
	}

	public void setresumencierrecajas(List<ResumenCierreCaja> resumencierrecajas) {
		this.resumencierrecajas = resumencierrecajas;
	}
	
	public List<ResumenCierreCaja> getresumencierrecajasAux() {
		return this.resumencierrecajasAux;
	}

	public void setresumencierrecajasAux(List<ResumenCierreCaja> resumencierrecajasAux) {
		this.resumencierrecajasAux = resumencierrecajasAux;
	}
	
	public List<ResumenCierreCaja> getresumencierrecajasEliminados() {
		return this.resumencierrecajasEliminados;
	}

	public void setResumenCierreCajasEliminados(List<ResumenCierreCaja> resumencierrecajasEliminados) {
		this.resumencierrecajasEliminados = resumencierrecajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarResumenCierreCaja() {
		return jComboBoxTiposSeleccionarResumenCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarResumenCierreCaja(
			JComboBox jComboBoxTiposSeleccionarResumenCierreCaja) {
		this.jComboBoxTiposSeleccionarResumenCierreCaja = jComboBoxTiposSeleccionarResumenCierreCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralResumenCierreCaja() {
		return jTextFieldValorCampoGeneralResumenCierreCaja;
	}

	public void setjTextFieldValorCampoGeneralResumenCierreCaja(
			JTextField jTextFieldValorCampoGeneralResumenCierreCaja) {
		this.jTextFieldValorCampoGeneralResumenCierreCaja = jTextFieldValorCampoGeneralResumenCierreCaja;
	}

	public void setBorderResaltarValorCampoGeneralResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralResumenCierreCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosResumenCierreCaja() {
		return this.jCheckBoxSeleccionarTodosResumenCierreCaja;
	}

	public void setjCheckBoxSeleccionarTodosResumenCierreCaja(
			JCheckBox jCheckBoxSeleccionarTodosResumenCierreCaja) {
		this.jCheckBoxSeleccionarTodosResumenCierreCaja = jCheckBoxSeleccionarTodosResumenCierreCaja;
	}

	public void setBorderResaltarSeleccionarTodosResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosResumenCierreCaja() {
		return this.jCheckBoxSeleccionadosResumenCierreCaja;
	}

	public void setjCheckBoxSeleccionadosResumenCierreCaja(
			JCheckBox jCheckBoxSeleccionadosResumenCierreCaja) {
		this.jCheckBoxSeleccionadosResumenCierreCaja = jCheckBoxSeleccionadosResumenCierreCaja;
	}
	
	public void setBorderResaltarSeleccionadosResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesResumenCierreCaja() {
		return this.jComboBoxTiposArchivosReportesResumenCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesResumenCierreCaja(
			JComboBox jComboBoxTiposArchivosReportesResumenCierreCaja) {
		this.jComboBoxTiposArchivosReportesResumenCierreCaja = jComboBoxTiposArchivosReportesResumenCierreCaja;
	}

	public void setBorderResaltarTiposArchivosReportesResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesResumenCierreCaja() {
		return this.jComboBoxTiposReportesResumenCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesResumenCierreCaja(
			JComboBox jComboBoxTiposReportesResumenCierreCaja) {
		this.jComboBoxTiposReportesResumenCierreCaja = jComboBoxTiposReportesResumenCierreCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoResumenCierreCaja() {
	//	return jComboBoxTiposReportesDinamicoResumenCierreCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoResumenCierreCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoResumenCierreCaja) {
	//	this.jComboBoxTiposReportesDinamicoResumenCierreCaja = jComboBoxTiposReportesDinamicoResumenCierreCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoResumenCierreCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoResumenCierreCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja = jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja;
	//}
	
	public void setBorderResaltarTiposReportesResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesResumenCierreCaja() {
		return this.jComboBoxTiposGraficosReportesResumenCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesResumenCierreCaja(
			JComboBox jComboBoxTiposGraficosReportesResumenCierreCaja) {
		this.jComboBoxTiposGraficosReportesResumenCierreCaja = jComboBoxTiposGraficosReportesResumenCierreCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionResumenCierreCaja() {
		return this.jComboBoxTiposPaginacionResumenCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionResumenCierreCaja(
			JComboBox jComboBoxTiposPaginacionResumenCierreCaja) {
		this.jComboBoxTiposPaginacionResumenCierreCaja = jComboBoxTiposPaginacionResumenCierreCaja;
	}
	
	public void setBorderResaltarTiposPaginacionResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesResumenCierreCaja() {
		return this.jComboBoxTiposRelacionesResumenCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResumenCierreCaja() {
		return this.jComboBoxTiposAccionesResumenCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResumenCierreCaja(
			JComboBox jComboBoxTiposRelacionesResumenCierreCaja) {
		this.jComboBoxTiposRelacionesResumenCierreCaja = jComboBoxTiposRelacionesResumenCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResumenCierreCaja(
			JComboBox jComboBoxTiposAccionesResumenCierreCaja) {
		this.jComboBoxTiposAccionesResumenCierreCaja = jComboBoxTiposAccionesResumenCierreCaja;
	}
	
	public void setBorderResaltarTiposRelacionesResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesResumenCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesResumenCierreCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoResumenCierreCaja() {
	//	return jCheckBoxConGraficoDinamicoResumenCierreCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoResumenCierreCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoResumenCierreCaja) {
	//	this.jCheckBoxConGraficoDinamicoResumenCierreCaja = jCheckBoxConGraficoDinamicoResumenCierreCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoResumenCierreCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarResumenCierreCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoResumenCierreCaja .setBorder(borderResaltar);		
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
		this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
		
		this.resumencierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumencierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.resumencierrecajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ResumenCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ResumenCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResumenCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResumenCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResumenCierreCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Resumen Cierre Caja MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
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
		
		ResumenCierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ResumenCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarResumenCierreCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"nuevo","nuevo","Nuevo"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"duplicar","duplicar","Duplicar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"copiar","copiar","Copiar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"ver_form","ver_form","Ver"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"recargar","recargar","Buscar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarResumenCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarResumenCierreCaja,this.jTtoolBarResumenCierreCaja,
							"cerrar","cerrar","Salir"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarResumenCierreCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarResumenCierreCaja;
			
				this.jButtonProcesarInformacionToolBarResumenCierreCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarResumenCierreCaja;
				
		//protected JButton jButtonModificarToolBarResumenCierreCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarResumenCierreCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuResumenCierreCaja=new JMenuMe("General");
		this.jmenuArchivoResumenCierreCaja=new JMenuMe("Archivo");
		this.jmenuAccionesResumenCierreCaja=new JMenuMe("Acciones");
		this.jmenuDatosResumenCierreCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResumenCierreCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResumenCierreCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResumenCierreCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarResumenCierreCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarResumenCierreCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarResumenCierreCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesResumenCierreCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesResumenCierreCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesResumenCierreCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosResumenCierreCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResumenCierreCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResumenCierreCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarResumenCierreCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarResumenCierreCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarResumenCierreCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormResumenCierreCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormResumenCierreCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormResumenCierreCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaResumenCierreCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaResumenCierreCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaResumenCierreCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResumenCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResumenCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResumenCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionResumenCierreCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionResumenCierreCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionResumenCierreCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionResumenCierreCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionResumenCierreCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionResumenCierreCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresResumenCierreCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresResumenCierreCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresResumenCierreCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesResumenCierreCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesResumenCierreCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesResumenCierreCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByResumenCierreCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByResumenCierreCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByResumenCierreCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResumenCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResumenCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResumenCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByResumenCierreCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByResumenCierreCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByResumenCierreCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResumenCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResumenCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResumenCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosResumenCierreCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosResumenCierreCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosResumenCierreCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoResumenCierreCaja.add(this.jMenuItemCerrarResumenCierreCaja);
			
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemNuevoResumenCierreCaja);
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemNuevoGuardarCambiosResumenCierreCaja);
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemNuevoRelacionesResumenCierreCaja);
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemGuardarCambiosTablaResumenCierreCaja);		
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemDuplicarResumenCierreCaja);		
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemCopiarResumenCierreCaja);		
			this.jmenuAccionesResumenCierreCaja.add(this.jMenuItemVerFormResumenCierreCaja);		
			
			this.jmenuDatosResumenCierreCaja.add(this.jMenuItemRecargarInformacionResumenCierreCaja);				
			this.jmenuDatosResumenCierreCaja.add(this.jMenuItemAnterioresResumenCierreCaja);				
			this.jmenuDatosResumenCierreCaja.add(this.jMenuItemSiguientesResumenCierreCaja);				
			this.jmenuDatosResumenCierreCaja.add(this.jMenuItemAbrirOrderByResumenCierreCaja);				
			this.jmenuDatosResumenCierreCaja.add(this.jMenuItemMostrarOcultarResumenCierreCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesResumenCierreCaja.add(this.jMenuItemGuardarCambiosResumenCierreCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarResumenCierreCaja.add(this.jmenuArchivoResumenCierreCaja);		
			this.jmenuBarResumenCierreCaja.add(this.jmenuAccionesResumenCierreCaja);		
			this.jmenuBarResumenCierreCaja.add(this.jmenuDatosResumenCierreCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarResumenCierreCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasResumenCierreCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaResumenCierreCajaResumenCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaResumenCierreCajaResumenCierreCaja.setToolTipText("Buscar Por Usuario Por Caja Por Fecha ");
		this.jButtonBusquedaResumenCierreCajaResumenCierreCaja= new JButtonMe();
		this.jButtonBusquedaResumenCierreCajaResumenCierreCaja.setText("Buscar");
		this.jButtonBusquedaResumenCierreCajaResumenCierreCaja.setToolTipText("Buscar Por Usuario Por Caja Por Fecha ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaResumenCierreCajaResumenCierreCaja,"buscar_button","Buscar Por Usuario Por Caja Por Fecha ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaResumenCierreCajaResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja = new JLabelMe();
		jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setText("Usuario :");
		jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setToolTipText("Usuario");
		jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja= new JComboBoxMe();
		jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja = new JLabelMe();
		jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setText("Caja :");
		jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setToolTipText("Caja");
		jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja= new JComboBoxMe();
		jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja = new JLabelMe();
		jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja.setText("Fecha :");
		jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja.setToolTipText("Fecha");
		jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja= new JDateChooser();
		jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.setDate(new Date());
		jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasResumenCierreCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasResumenCierreCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasResumenCierreCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasResumenCierreCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasResumenCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleResumenCierreCaja = new ResumenCierreCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Resumen Cierre Caja DATOS");
			this.jInternalFrameDetalleFormResumenCierreCaja = new ResumenCierreCajaDetalleFormJInternalFrame(jDesktopPane,this.resumencierrecajaSessionBean.getConGuardarRelaciones(),this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormResumenCierreCaja = null;//new ResumenCierreCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResumenCierreCaja= new GridBagLayout();
		
		
		this.jTableDatosResumenCierreCaja = new JTableMe();      
		
		String sToolTipResumenCierreCaja="";
		sToolTipResumenCierreCaja=ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResumenCierreCaja+="(PuntoVenta.ResumenCierreCaja)";
		}
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipResumenCierreCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosResumenCierreCaja.setToolTipText(sToolTipResumenCierreCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosResumenCierreCaja);
		this.jTableDatosResumenCierreCaja.setAutoCreateRowSorter(true);
		this.jTableDatosResumenCierreCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosResumenCierreCaja.setRowSelectionAllowed(true);
		this.jTableDatosResumenCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosResumenCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoResumenCierreCaja = new JButtonMe();
		this.jButtonDuplicarResumenCierreCaja = new JButtonMe();
		this.jButtonCopiarResumenCierreCaja = new JButtonMe();
		this.jButtonVerFormResumenCierreCaja = new JButtonMe();
		this.jButtonNuevoRelacionesResumenCierreCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja = new JButtonMe();
		this.jButtonCerrarResumenCierreCaja = new JButtonMe();
		
		this.jScrollPanelDatosResumenCierreCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralResumenCierreCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Resumen Cierre Caja";
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Cierre Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosResumenCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResumenCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesResumenCierreCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoResumenCierreCaja=new ReporteDinamicoJInternalFrame(ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoResumenCierreCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionResumenCierreCaja=new ImportacionJInternalFrame(ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionResumenCierreCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByResumenCierreCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByResumenCierreCaja.setText("Orden");
		this.jButtonAbrirOrderByResumenCierreCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResumenCierreCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResumenCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenCierreCaja,false,this);
			
			//this.cargarOrderByResumenCierreCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResumenCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenCierreCaja,true,this);
			
			//this.cargarOrderByResumenCierreCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosResumenCierreCaja.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosResumenCierreCaja.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosResumenCierreCaja.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosResumenCierreCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosResumenCierreCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosResumenCierreCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoResumenCierreCaja.setText("Nuevo");
		this.jButtonDuplicarResumenCierreCaja.setText("Duplicar");
		this.jButtonCopiarResumenCierreCaja.setText("Copiar");
		this.jButtonVerFormResumenCierreCaja.setText("Ver");
		this.jButtonNuevoRelacionesResumenCierreCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.setText("Guardar");
		this.jButtonCerrarResumenCierreCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResumenCierreCaja,"nuevo_button","Nuevo",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarResumenCierreCaja,"duplicar_button","Duplicar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarResumenCierreCaja,"copiar_button","Copiar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormResumenCierreCaja,"ver_form","Ver",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesResumenCierreCaja,"nuevorelaciones_button","Nuevo Rel",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResumenCierreCaja,"guardarcambiostabla_button","Guardar",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResumenCierreCaja,"cerrar_button","Salir",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoResumenCierreCaja.setToolTipText("Nuevo"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarResumenCierreCaja.setToolTipText("Duplicar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarResumenCierreCaja.setToolTipText("Copiar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormResumenCierreCaja.setToolTipText("Ver"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesResumenCierreCaja.setToolTipText("Nuevo Rel"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.setToolTipText("Guardar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResumenCierreCaja.setToolTipText("Salir"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResumenCierreCaja";
		inputMap = this.jButtonNuevoResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResumenCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResumenCierreCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarResumenCierreCaja";
		inputMap = this.jButtonDuplicarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarResumenCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarResumenCierreCaja"));
		
		//COPIAR
		sMapKey = "CopiarResumenCierreCaja";
		inputMap = this.jButtonCopiarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarResumenCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarResumenCierreCaja"));
		
		//VEr FORM
		sMapKey = "VerFormResumenCierreCaja";
		inputMap = this.jButtonVerFormResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormResumenCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormResumenCierreCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesResumenCierreCaja";
		inputMap = this.jButtonNuevoRelacionesResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesResumenCierreCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarResumenCierreCaja";
		inputMap = this.jButtonModificarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarResumenCierreCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarResumenCierreCaja";
		inputMap = this.jButtonCerrarResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResumenCierreCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResumenCierreCaja";
		inputMap = this.jButtonGuardarCambiosTablaResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResumenCierreCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ResumenCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ResumenCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ResumenCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ResumenCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ResumenCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesResumenCierreCaja.setName("jPanelParametrosReportesResumenCierreCaja"); 
		
		this.jPanelParametrosReportesAccionesResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesResumenCierreCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesResumenCierreCaja.setName("jPanelParametrosReportesAccionesResumenCierreCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionResumenCierreCaja = new JButtonMe();
		this.jButtonRecargarInformacionResumenCierreCaja.setText("Buscar");
		this.jButtonRecargarInformacionResumenCierreCaja.setToolTipText("Buscar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionResumenCierreCaja,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionResumenCierreCaja.setVisible(false);
		
		
		this.jButtonProcesarInformacionResumenCierreCaja = new JButtonMe();
		this.jButtonProcesarInformacionResumenCierreCaja.setText("Procesar");
		this.jButtonProcesarInformacionResumenCierreCaja.setToolTipText("Procesar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionResumenCierreCaja.setVisible(false);
			
		this.jButtonProcesarInformacionResumenCierreCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResumenCierreCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResumenCierreCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResumenCierreCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesResumenCierreCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResumenCierreCaja.setText("TIPO");       
		this.jComboBoxTiposReportesResumenCierreCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResumenCierreCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesResumenCierreCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionResumenCierreCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionResumenCierreCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesResumenCierreCaja.setText("Accion");
		this.jComboBoxTiposRelacionesResumenCierreCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResumenCierreCaja.setText("Accion");
		this.jComboBoxTiposAccionesResumenCierreCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarResumenCierreCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarResumenCierreCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralResumenCierreCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralResumenCierreCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResumenCierreCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResumenCierreCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesResumenCierreCaja = new JLabelMe();
		
		this.jLabelAccionesResumenCierreCaja.setText("Acciones");		
		this.jLabelAccionesResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosResumenCierreCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosResumenCierreCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosResumenCierreCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosResumenCierreCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosResumenCierreCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosResumenCierreCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaResumenCierreCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteResumenCierreCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteResumenCierreCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteResumenCierreCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresResumenCierreCaja = new JButtonMe();
		//this.jButtonAnterioresResumenCierreCaja.setText("<<");
        this.jButtonAnterioresResumenCierreCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresResumenCierreCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesResumenCierreCaja = new JButtonMe();
		//this.jButtonSiguientesResumenCierreCaja.setText(">>");
        this.jButtonSiguientesResumenCierreCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesResumenCierreCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosResumenCierreCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosResumenCierreCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosResumenCierreCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosResumenCierreCaja,"nuevoguardarcambios_button","Nue",this.resumencierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosResumenCierreCaja";
		inputMap = this.jButtonNuevoGuardarCambiosResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosResumenCierreCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionResumenCierreCaja";
		inputMap = this.jButtonRecargarInformacionResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionResumenCierreCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesResumenCierreCaja";
		inputMap = this.jButtonSiguientesResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesResumenCierreCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresResumenCierreCaja";
		inputMap = this.jButtonAnterioresResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresResumenCierreCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasResumenCierreCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesResumenCierreCaja.setMinimumSize(new Dimension(this.getWidth(),ResumenCierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResumenCierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResumenCierreCaja.setMaximumSize(new Dimension(this.getWidth(),ResumenCierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResumenCierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResumenCierreCaja.setPreferredSize(new Dimension(this.getWidth(),ResumenCierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResumenCierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionResumenCierreCaja = new GridBagLayout();

			this.jPanelPaginacionResumenCierreCaja.setLayout(gridaBagLayoutPaginacionResumenCierreCaja);						
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 0;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonAnterioresResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
					
						
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResumenCierreCaja.gridy = 0;
			
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonNuevoGuardarCambiosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
						
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResumenCierreCaja.gridy = 0;
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonSiguientesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 1;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonNuevoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
						
			
			
			if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResumenCierreCaja.gridy = 1;
				this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionResumenCierreCaja.add(this.jButtonGuardarCambiosTablaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			}
			
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 1;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonDuplicarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 1;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonCopiarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 1;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonVerFormResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 1;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionResumenCierreCaja.add(this.jButtonCerrarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		
		this.jButtonRecargarInformacionResumenCierreCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResumenCierreCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResumenCierreCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesResumenCierreCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResumenCierreCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResumenCierreCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesResumenCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResumenCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResumenCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesResumenCierreCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResumenCierreCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResumenCierreCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionResumenCierreCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResumenCierreCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResumenCierreCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesResumenCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResumenCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResumenCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesResumenCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarResumenCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResumenCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResumenCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteResumenCierreCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResumenCierreCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResumenCierreCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosResumenCierreCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResumenCierreCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResumenCierreCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosResumenCierreCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResumenCierreCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResumenCierreCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesResumenCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesResumenCierreCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ResumenCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ResumenCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ResumenCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ResumenCierreCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesResumenCierreCaja.setLayout(gridaBagParametrosReportesResumenCierreCaja);
			this.jPanelParametrosReportesAccionesResumenCierreCaja.setLayout(gridaBagParametrosReportesAccionesResumenCierreCaja);
			
			
			this.jPanelParametrosAuxiliar1ResumenCierreCaja.setLayout(gridaBagParametrosAuxiliar1ResumenCierreCaja);
			this.jPanelParametrosAuxiliar2ResumenCierreCaja.setLayout(gridaBagParametrosAuxiliar2ResumenCierreCaja);
			this.jPanelParametrosAuxiliar3ResumenCierreCaja.setLayout(gridaBagParametrosAuxiliar3ResumenCierreCaja);
			this.jPanelParametrosAuxiliar4ResumenCierreCaja.setLayout(gridaBagParametrosAuxiliar4ResumenCierreCaja);
			//this.jPanelParametrosAuxiliar5ResumenCierreCaja.setLayout(gridaBagParametrosAuxiliar2ResumenCierreCaja);			
			
			
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jButtonRecargarInformacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResumenCierreCaja.add(this.jComboBoxTiposPaginacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResumenCierreCaja.add(this.jCheckBoxConAltoMaximoTablaResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResumenCierreCaja.add(this.jComboBoxTiposArchivosReportesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jPanelParametrosAuxiliar1ResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ResumenCierreCaja.add(this.jComboBoxTiposReportesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);																		
			
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ResumenCierreCaja.add(this.jComboBoxTiposGraficosReportesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jPanelParametrosAuxiliar4ResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jComboBoxTiposReportesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jCheckBoxGenerarReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jPanelParametrosAuxiliar2ResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jLabelAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesResumenCierreCaja.add(this.jButtonAbrirOrderByResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jComboBoxTiposSeleccionarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
			
			
			/*
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jCheckBoxSeleccionarTodosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jCheckBoxConGraficoReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResumenCierreCaja.add(this.jCheckBoxSeleccionarTodosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);															
				
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResumenCierreCaja.add(this.jCheckBoxSeleccionadosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);															
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResumenCierreCaja.add(this.jCheckBoxConGraficoReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jPanelParametrosAuxiliar3ResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenCierreCaja.add(this.jComboBoxTiposAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosResumenCierreCaja = new GridBagLayout();

			this.jScrollPanelDatosResumenCierreCaja.setLayout(gridaBagLayoutDatosResumenCierreCaja);
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = 0;
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;
			
			this.jScrollPanelDatosResumenCierreCaja.add(this.jTableDatosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosResumenCierreCaja.setViewportView(this.jTableDatosResumenCierreCaja);
		this.jTableDatosResumenCierreCaja.setFillsViewportHeight(true);
		this.jTableDatosResumenCierreCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResumenCierreCaja= new GridBagLayout();
		this.jPanelAccionesResumenCierreCaja.setLayout(gridaBagLayoutAccionesResumenCierreCaja);
		
		
		/*	
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = 0;
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
			
		this.jPanelAccionesResumenCierreCaja.add(this.jButtonNuevoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaResumenCierreCajaResumenCierreCaja= new GridBagLayout();
		gridaBagLayoutBusquedaResumenCierreCajaResumenCierreCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaResumenCierreCajaResumenCierreCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaResumenCierreCajaResumenCierreCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaResumenCierreCajaResumenCierreCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.setLayout(gridaBagLayoutBusquedaResumenCierreCajaResumenCierreCaja);

		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 0;
		gridBagConstraintsResumenCierreCaja.gridx = 0;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jLabelid_usuarioBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);

		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 0;
		gridBagConstraintsResumenCierreCaja.gridx = 1;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);


		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 1;
		gridBagConstraintsResumenCierreCaja.gridx = 0;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jLabelid_cajaBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);

		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 1;
		gridBagConstraintsResumenCierreCaja.gridx = 1;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);


		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 2;
		gridBagConstraintsResumenCierreCaja.gridx = 0;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jLabelfechaBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);

		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 2;
		gridBagConstraintsResumenCierreCaja.gridx = 1;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);

		gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResumenCierreCaja.gridy = 3;
		gridBagConstraintsResumenCierreCaja.gridx =1;
		jPanelBusquedaResumenCierreCajaResumenCierreCaja.add(jButtonBusquedaResumenCierreCajaResumenCierreCaja, gridBagConstraintsResumenCierreCaja);

		jTabbedPaneBusquedasResumenCierreCaja.addTab("1.-Por Usuario Por Caja Por Fecha ", jPanelBusquedaResumenCierreCajaResumenCierreCaja);
		jTabbedPaneBusquedasResumenCierreCaja.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResumenCierreCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResumenCierreCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();						
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;		
			//this.gridBagConstraintsResumenCierreCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResumenCierreCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;		
		//this.gridBagConstraintsResumenCierreCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsResumenCierreCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsResumenCierreCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResumenCierreCaja.gridx = 0;		
			this.gridBagConstraintsResumenCierreCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsResumenCierreCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);								
		
		
		/*
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		*/		
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResumenCierreCaja.gridx =0;
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResumenCierreCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
				
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosResumenCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResumenCierreCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosResumenCierreCaja.setLayout(gridaBagLayoutBusquedasParametrosResumenCierreCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralResumenCierreCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResumenCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
			
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResumenCierreCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralResumenCierreCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoResumenCierreCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoResumenCierreCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoResumenCierreCaja.setName("jPanelReporteDinamicoResumenCierreCaja"); 
		
		this.jPanelReporteDinamicoResumenCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResumenCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResumenCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoResumenCierreCaja.setLayout(gridaBagLayoutReporteDinamicoResumenCierreCaja);
		
		
		this.jInternalFrameReporteDinamicoResumenCierreCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoResumenCierreCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResumenCierreCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoResumenCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoResumenCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoResumenCierreCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoResumenCierreCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoResumenCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoResumenCierreCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoResumenCierreCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoResumenCierreCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoResumenCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResumenCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResumenCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Cierre Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteResumenCierreCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteResumenCierreCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelColumnasSelectReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteResumenCierreCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteResumenCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteResumenCierreCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteResumenCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResumenCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResumenCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteResumenCierreCaja=new JScrollPane(this.jListColumnasSelectReporteResumenCierreCaja);
			
			this.jScrollColumnasSelectReporteResumenCierreCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResumenCierreCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResumenCierreCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResumenCierreCaja.add(this.jListColumnasSelectReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jScrollColumnasSelectReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteResumenCierreCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteResumenCierreCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteResumenCierreCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteResumenCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteResumenCierreCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteResumenCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResumenCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResumenCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteResumenCierreCaja=new JScrollPane(this.jListRelacionesSelectReporteResumenCierreCaja);
			
			this.jScrollRelacionesSelectReporteResumenCierreCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResumenCierreCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResumenCierreCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoResumenCierreCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoResumenCierreCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoResumenCierreCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoResumenCierreCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoResumenCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResumenCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResumenCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoResumenCierreCaja = new JLabelMe();

		this.jLabelConGraficoDinamicoResumenCierreCaja.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelConGraficoDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoResumenCierreCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoResumenCierreCaja.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoResumenCierreCaja.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoResumenCierreCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoResumenCierreCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoResumenCierreCaja.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jCheckBoxConGraficoDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoResumenCierreCaja = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoResumenCierreCaja.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelColumnaCategoriaGraficoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorResumenCierreCaja = new JLabelMe();

		this.jLabelColumnaCategoriaValorResumenCierreCaja.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelColumnaCategoriaValorResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorResumenCierreCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaValorResumenCierreCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorResumenCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorResumenCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorResumenCierreCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jComboBoxColumnaCategoriaValorResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoResumenCierreCaja = new JLabelMe();

		this.jLabelColumnasValoresGraficoResumenCierreCaja.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelColumnasValoresGraficoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoResumenCierreCaja = new JList<Reporte>();
		this.jListColumnasValoresGraficoResumenCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoResumenCierreCaja.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoResumenCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoResumenCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoResumenCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoResumenCierreCaja=new JScrollPane(this.jListColumnasValoresGraficoResumenCierreCaja);
			
			this.jScrollColumnasValoresGraficoResumenCierreCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoResumenCierreCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoResumenCierreCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoResumenCierreCaja.add(this.jListColumnasSelectReporteResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jScrollColumnasValoresGraficoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoResumenCierreCaja = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoResumenCierreCaja.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelTiposGraficosReportesDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoResumenCierreCaja.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jComboBoxTiposGraficosReportesDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoResumenCierreCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoResumenCierreCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelGenerarExcelReporteDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja.setToolTipText("Generar EXCEL"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoResumenCierreCaja.add(this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jComboBoxTiposReportesDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoResumenCierreCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoResumenCierreCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jLabelTiposArchivoReporteDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jComboBoxTiposArchivosReportesDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoResumenCierreCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoResumenCierreCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoResumenCierreCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoResumenCierreCaja.setToolTipText("Generar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jButtonGenerarReporteDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoResumenCierreCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoResumenCierreCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoResumenCierreCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoResumenCierreCaja.setToolTipText("Cancelar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenCierreCaja.add(this.jButtonCerrarReporteDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalResumenCierreCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoResumenCierreCaja= new JScrollPane(jPanelReporteDinamicoResumenCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoResumenCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResumenCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResumenCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Cierre Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsResumenCierreCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoResumenCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoResumenCierreCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalResumenCierreCaja);
		this.jInternalFrameReporteDinamicoResumenCierreCaja.getContentPane().add(this.jScrollPanelReporteDinamicoResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionResumenCierreCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionResumenCierreCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionResumenCierreCaja.setName("jPanelImportacionResumenCierreCaja"); 
		
		this.jPanelImportacionResumenCierreCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResumenCierreCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResumenCierreCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionResumenCierreCaja.setLayout(gridaBagLayoutImportacionResumenCierreCaja);
		
		
		this.jInternalFrameImportacionResumenCierreCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionResumenCierreCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionResumenCierreCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResumenCierreCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionResumenCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResumenCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResumenCierreCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionResumenCierreCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResumenCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResumenCierreCaja.setResizable(true);
	    this.jInternalFrameImportacionResumenCierreCaja.setClosable(true);
	    this.jInternalFrameImportacionResumenCierreCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionResumenCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResumenCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResumenCierreCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionResumenCierreCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResumenCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResumenCierreCaja.setResizable(true);
	    this.jInternalFrameImportacionResumenCierreCaja.setClosable(true);
	    this.jInternalFrameImportacionResumenCierreCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionResumenCierreCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResumenCierreCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResumenCierreCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Cierre Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionResumenCierreCaja = new JLabelMe();

		this.jLabelArchivoImportacionResumenCierreCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResumenCierreCaja.add(this.jLabelArchivoImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionResumenCierreCaja = new JFileChooser();		
		this.jFileChooserImportacionResumenCierreCaja.setToolTipText("ESCOGER ARCHIVO"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionResumenCierreCaja = new JButtonMe();
		this.jButtonAbrirImportacionResumenCierreCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionResumenCierreCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionResumenCierreCaja.setToolTipText("Generar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenCierreCaja.add(this.jButtonAbrirImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionResumenCierreCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionResumenCierreCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionResumenCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResumenCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResumenCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResumenCierreCaja.add(this.jLabelPathArchivoImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionResumenCierreCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionResumenCierreCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResumenCierreCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResumenCierreCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenCierreCaja.add(this.jTextFieldPathArchivoImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionResumenCierreCaja = new JButtonMe();
		this.jButtonGenerarImportacionResumenCierreCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionResumenCierreCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionResumenCierreCaja.setToolTipText("Generar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenCierreCaja.add(this.jButtonGenerarImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionResumenCierreCaja = new JButtonMe();
		this.jButtonCerrarImportacionResumenCierreCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionResumenCierreCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionResumenCierreCaja.setToolTipText("Cancelar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenCierreCaja.add(this.jButtonCerrarImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalResumenCierreCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionResumenCierreCaja= new JScrollPane(jPanelImportacionResumenCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsResumenCierreCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsResumenCierreCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionResumenCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionResumenCierreCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalResumenCierreCaja);
		this.jInternalFrameImportacionResumenCierreCaja.getContentPane().add(this.jScrollPanelImportacionResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByResumenCierreCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByResumenCierreCaja = new JButtonMe();
			this.jButtonAbrirOrderByResumenCierreCaja.setText("Orden");
			this.jButtonAbrirOrderByResumenCierreCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResumenCierreCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByResumenCierreCaja";
			inputMap = this.jButtonAbrirOrderByResumenCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByResumenCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByResumenCierreCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByResumenCierreCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByResumenCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByResumenCierreCaja.setName("jPanelOrderByResumenCierreCaja"); 
			
			this.jPanelOrderByResumenCierreCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResumenCierreCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResumenCierreCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByResumenCierreCaja.setLayout(gridaBagLayoutOrderByResumenCierreCaja);
			
			
			this.jTableDatosResumenCierreCajaOrderBy = new JTableMe();        
			this.jTableDatosResumenCierreCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosResumenCierreCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosResumenCierreCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosResumenCierreCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosResumenCierreCajaOrderBy.setViewportView(this.jTableDatosResumenCierreCajaOrderBy);
			this.jTableDatosResumenCierreCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosResumenCierreCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByResumenCierreCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByResumenCierreCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByResumenCierreCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteResumenCierreCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByResumenCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByResumenCierreCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByResumenCierreCaja.setTitle("Orden");
			this.jInternalFrameOrderByResumenCierreCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByResumenCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByResumenCierreCaja.setResizable(true);
			this.jInternalFrameOrderByResumenCierreCaja.setClosable(true);
			this.jInternalFrameOrderByResumenCierreCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByResumenCierreCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResumenCierreCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResumenCierreCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByResumenCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Cierre Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsResumenCierreCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsResumenCierreCaja.ipady =150;
				
			this.jPanelOrderByResumenCierreCaja.add(jScrollPanelDatosResumenCierreCajaOrderBy, this.gridBagConstraintsResumenCierreCaja);//this.jTableDatosResumenCierreCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByResumenCierreCaja = new JButtonMe();
			this.jButtonCerrarOrderByResumenCierreCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByResumenCierreCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByResumenCierreCaja.setToolTipText("Cancelar"+" "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByResumenCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenCierreCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsResumenCierreCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByResumenCierreCaja.add(this.jButtonCerrarOrderByResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalResumenCierreCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByResumenCierreCaja= new JScrollPane(jPanelOrderByResumenCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsResumenCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsResumenCierreCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsResumenCierreCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsResumenCierreCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByResumenCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByResumenCierreCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalResumenCierreCaja);
			
			this.jInternalFrameOrderByResumenCierreCaja.getContentPane().add(this.jScrollPanelOrderByResumenCierreCaja, this.gridBagConstraintsResumenCierreCaja);			
		
		} else {
			this.jButtonAbrirOrderByResumenCierreCaja = new JButtonMe();
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
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.resumencierrecajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosResumenCierreCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosResumenCierreCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosResumenCierreCaja.getRowHeight();//ResumenCierreCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.isSelected()) {
					iHeightTable=ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResumenCierreCaja.isSelected()) {
					iHeightTable=ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResumenCierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosResumenCierreCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResumenCierreCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResumenCierreCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosResumenCierreCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResumenCierreCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResumenCierreCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByResumenCierreCaja!=null && this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByResumenCierreCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByResumenCierreCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByResumenCierreCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosResumenCierreCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResumenCierreCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResumenCierreCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=resumencierrecajaLogic.getResumenCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=resumencierrecajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ResumenCierreCaja> TraerResumenCierreCajaBeans(List<ResumenCierreCaja> resumencierrecajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ResumenCierreCaja resumencierrecaja:resumencierrecajas) {
					
				if(!(ResumenCierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ResumenCierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					resumencierrecaja.setsDetalleGeneralEntityReporte(ResumenCierreCajaConstantesFunciones.getResumenCierreCajaDescripcion(resumencierrecaja));
										
						
					
						
					
				} else  {
							
					//resumencierrecaja.setsDetalleGeneralEntityReporte(resumencierrecaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//resumencierrecajabeans.add(resumencierrecajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return resumencierrecajas;
    }
	//PARA REPORTES FIN
}
