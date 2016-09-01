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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.cartera.util.ReferenciaBancariaConstantesFunciones;

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
public class ReferenciaBancariaJInternalFrame extends ReferenciaBancariaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReferenciaBancaria;
	
	protected JMenuBar jmenuBarReferenciaBancaria;
	
	protected JMenu jmenuReferenciaBancaria;
	protected JMenu jmenuDatosReferenciaBancaria;
	protected JMenu jmenuArchivoReferenciaBancaria;
	protected JMenu jmenuAccionesReferenciaBancaria;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferenciaBancaria;	
	protected GridBagConstraints gridBagConstraintsReferenciaBancaria;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReferenciaBancariaDetalleFormJInternalFrame jInternalFrameDetalleFormReferenciaBancaria;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReferenciaBancaria;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReferenciaBancaria;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoProduBancoBeanSwingJInternalFrame tipoprodubancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprodubanco="";

	protected TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabanco="";

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public ReferenciaBancariaSessionBean referenciabancariaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoProduBancoSessionBean tipoprodubancoSessionBean;
	public TipoCuentaBancoSessionBean tipocuentabancoSessionBean;
	public TipoValoracionSessionBean tipovaloracionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ReferenciaBancaria> referenciabancarias;		
	public List<ReferenciaBancaria> referenciabancariasEliminados;	
	public List<ReferenciaBancaria> referenciabancariasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReferenciaBancaria;		
	protected JButton jButtonAbrirOrderByReferenciaBancaria;
	
	
	//protected JPanel jPanelOrderByReferenciaBancaria;
	//public JScrollPane jScrollPanelOrderByReferenciaBancaria;	
	//protected JButton jButtonCerrarOrderByReferenciaBancaria;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReferenciaBancariaLogic referenciabancariaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReferenciaBancaria;
	public JScrollPane jScrollPanelDatosEdicionReferenciaBancaria;
	public JScrollPane jScrollPanelDatosGeneralReferenciaBancaria;
    
	
	
	//public JScrollPane jScrollPanelDatosReferenciaBancariaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReferenciaBancaria;
	//public JScrollPane jScrollPanelImportacionReferenciaBancaria;
	
	
	
	protected JPanel jPanelAccionesReferenciaBancaria;
	
    protected JPanel jPanelPaginacionReferenciaBancaria;
    protected JPanel jPanelParametrosReportesReferenciaBancaria;
	protected JPanel jPanelParametrosReportesAccionesReferenciaBancaria;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ReferenciaBancaria;
	protected JPanel jPanelParametrosAuxiliar2ReferenciaBancaria;
	protected JPanel jPanelParametrosAuxiliar3ReferenciaBancaria;
	protected JPanel jPanelParametrosAuxiliar4ReferenciaBancaria;
	//protected JPanel jPanelParametrosAuxiliar5ReferenciaBancaria;
	
	
	
	//protected JPanel jPanelReporteDinamicoReferenciaBancaria;
	//protected JPanel jPanelImportacionReferenciaBancaria;
	
	
	public JTable jTableDatosReferenciaBancaria;
	
	
	
	//public JTable jTableDatosReferenciaBancariaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReferenciaBancaria;
	protected JButton jButtonDuplicarReferenciaBancaria;
	protected JButton jButtonCopiarReferenciaBancaria;
	protected JButton jButtonVerFormReferenciaBancaria;
	protected JButton jButtonNuevoRelacionesReferenciaBancaria;
	protected JButton jButtonModificarReferenciaBancaria;
	
    protected JButton jButtonGuardarCambiosTablaReferenciaBancaria;
	protected JButton jButtonCerrarReferenciaBancaria;
	
	
	protected JButton jButtonRecargarInformacionReferenciaBancaria;
	protected JButton jButtonProcesarInformacionReferenciaBancaria;
	
	
	protected JButton jButtonAnterioresReferenciaBancaria;
	protected JButton jButtonSiguientesReferenciaBancaria;
	protected JButton jButtonNuevoGuardarCambiosReferenciaBancaria;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReferenciaBancaria;
	//protected JButton jButtonCerrarReporteDinamicoReferenciaBancaria;
	//protected JButton jButtonGenerarExcelReporteDinamicoReferenciaBancaria;	
	
	
	
	//protected JButton jButtonAbrirImportacionReferenciaBancaria;
	//protected JButton jButtonGenerarImportacionReferenciaBancaria;
	//protected JButton jButtonCerrarImportacionReferenciaBancaria;
	//protected JFileChooser jFileChooserImportacionReferenciaBancaria;
	//protected File fileImportacionReferenciaBancaria;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferenciaBancaria;
	protected JButton jButtonDuplicarToolBarReferenciaBancaria;
	protected JButton jButtonNuevoRelacionesToolBarReferenciaBancaria;
	
	
	public JButton jButtonGuardarCambiosToolBarReferenciaBancaria;
	protected JButton jButtonCopiarToolBarReferenciaBancaria;
	protected JButton jButtonVerFormToolBarReferenciaBancaria;
	public JButton jButtonGuardarCambiosTablaToolBarReferenciaBancaria;
	protected JButton jButtonMostrarOcultarTablaToolBarReferenciaBancaria;
	protected JButton jButtonCerrarToolBarReferenciaBancaria;
	
	protected JButton jButtonRecargarInformacionToolBarReferenciaBancaria;
	protected JButton jButtonProcesarInformacionToolBarReferenciaBancaria;
	protected JButton jButtonAnterioresToolBarReferenciaBancaria;
	protected JButton jButtonSiguientesToolBarReferenciaBancaria;
	protected JButton jButtonNuevoGuardarCambiosToolBarReferenciaBancaria;
	protected JButton jButtonAbrirOrderByToolBarReferenciaBancaria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferenciaBancaria;
	protected JMenuItem jMenuItemDuplicarReferenciaBancaria;
	protected JMenuItem jMenuItemNuevoRelacionesReferenciaBancaria;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReferenciaBancaria;
	protected JMenuItem jMenuItemCopiarReferenciaBancaria;
	protected JMenuItem jMenuItemVerFormReferenciaBancaria;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferenciaBancaria;
	protected JMenuItem jMenuItemCerrarReferenciaBancaria;
	protected JMenuItem jMenuItemDetalleCerrarReferenciaBancaria;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReferenciaBancaria;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferenciaBancaria;
	
	protected JMenuItem jMenuItemRecargarInformacionReferenciaBancaria;
	protected JMenuItem jMenuItemProcesarInformacionReferenciaBancaria;
	protected JMenuItem jMenuItemAnterioresReferenciaBancaria;
	protected JMenuItem jMenuItemSiguientesReferenciaBancaria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferenciaBancaria;
	protected JMenuItem jMenuItemAbrirOrderByReferenciaBancaria;
	protected JMenuItem jMenuItemMostrarOcultarReferenciaBancaria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferenciaBancaria;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReferenciaBancaria;
	protected JCheckBox jCheckBoxSeleccionadosReferenciaBancaria;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReferenciaBancaria;
	protected JCheckBox jCheckBoxConGraficoReporteReferenciaBancaria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReferenciaBancaria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReferenciaBancaria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReferenciaBancaria;
	protected JTextField jTextFieldValorCampoGeneralReferenciaBancaria;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReferenciaBancaria;
	//public JList<Reporte> jListColumnasSelectReporteReferenciaBancaria;
	//public JScrollPane jScrollColumnasSelectReporteReferenciaBancaria;
	
	//public JLabel jLabelRelacionesSelectReporteReferenciaBancaria;
	//public JList<Reporte> jListRelacionesSelectReporteReferenciaBancaria;
	//public JScrollPane jScrollRelacionesSelectReporteReferenciaBancaria;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReferenciaBancaria;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReferenciaBancaria;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReferenciaBancaria;
	//public JLabel jLabelTiposArchivoReporteDinamicoReferenciaBancaria;
	
		
	//public JLabel jLabelArchivoImportacionReferenciaBancaria;	
	//public JLabel jLabelPathArchivoImportacionReferenciaBancaria;
	//protected JTextField jTextFieldPathArchivoImportacionReferenciaBancaria;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReferenciaBancaria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReferenciaBancaria;
	
	//public JLabel jLabelColumnaCategoriaValorReferenciaBancaria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReferenciaBancaria;
	
	//public JLabel jLabelColumnasValoresGraficoReferenciaBancaria;
	//public JList<Reporte> jListColumnasValoresGraficoReferenciaBancaria;
	//public JScrollPane jScrollColumnasValoresGraficoReferenciaBancaria;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReferenciaBancaria;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasReferenciaBancaria;
	public JPanel jPanelFK_IdClienteReferenciaBancaria;
	public JButton jButtonFK_IdClienteReferenciaBancaria;
	public JPanel jPanelFK_IdTipoBancoReferenciaBancaria;
	public JButton jButtonFK_IdTipoBancoReferenciaBancaria;
	public JPanel jPanelFK_IdTipoCuentaBancoReferenciaBancaria;
	public JButton jButtonFK_IdTipoCuentaBancoReferenciaBancaria;
	public JPanel jPanelFK_IdTipoProductoBancoReferenciaBancaria;
	public JButton jButtonFK_IdTipoProductoBancoReferenciaBancaria;
	public JPanel jPanelFK_IdTipoValoracionReferenciaBancaria;
	public JButton jButtonFK_IdTipoValoracionReferenciaBancaria;
	
	public JPanel jPanelidclienteFK_IdClienteReferenciaBancaria;
	public JLabel jLabelidclienteFK_IdClienteReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteReferenciaBancaria;
	public JButton jButtonidclienteFK_IdClienteReferenciaBancaria= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteReferenciaBancariaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteReferenciaBancaria;
	
	public JPanel jPanelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria;
	public JLabel jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria;
	public JButton jButtonidvalorclientebancoFK_IdTipoBancoReferenciaBancaria= new JButtonMe();
	public JButton jButtonidvalorclientebancoFK_IdTipoBancoReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidvalorclientebancoFK_IdTipoBancoReferenciaBancariaBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria;
	public JLabel jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria;
	public JButton jButtonidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria= new JButtonMe();
	public JButton jButtonidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancariaBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria;
	public JLabel jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria;
	public JButton jButtonidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria= new JButtonMe();
	public JButton jButtonidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancariaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria;
	public JLabel jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria;
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionReferenciaBancariaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1122;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ReferenciaBancariaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReferenciaBancaria)	{
		this.jButtonRecargarInformacionReferenciaBancaria = jButtonRecargarInformacionReferenciaBancaria;
	}
	
	public JButton getjButtonProcesarInformacionReferenciaBancaria() {
		return this.jButtonProcesarInformacionReferenciaBancaria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferenciaBancaria)	{
		this.jButtonProcesarInformacionReferenciaBancaria = jButtonProcesarInformacionReferenciaBancaria;
	}
	
	
	public JButton getjButtonRecargarInformacionReferenciaBancaria() {
		return this.jButtonRecargarInformacionReferenciaBancaria;
	}
	
	
	public List<ReferenciaBancaria> getreferenciabancarias() {
		return this.referenciabancarias;
	}

	public void setreferenciabancarias(List<ReferenciaBancaria> referenciabancarias) {
		this.referenciabancarias = referenciabancarias;
	}
	
	public List<ReferenciaBancaria> getreferenciabancariasAux() {
		return this.referenciabancariasAux;
	}

	public void setreferenciabancariasAux(List<ReferenciaBancaria> referenciabancariasAux) {
		this.referenciabancariasAux = referenciabancariasAux;
	}
	
	public List<ReferenciaBancaria> getreferenciabancariasEliminados() {
		return this.referenciabancariasEliminados;
	}

	public void setReferenciaBancariasEliminados(List<ReferenciaBancaria> referenciabancariasEliminados) {
		this.referenciabancariasEliminados = referenciabancariasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReferenciaBancaria() {
		return jComboBoxTiposSeleccionarReferenciaBancaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReferenciaBancaria(
			JComboBox jComboBoxTiposSeleccionarReferenciaBancaria) {
		this.jComboBoxTiposSeleccionarReferenciaBancaria = jComboBoxTiposSeleccionarReferenciaBancaria;
	}
	
	public void setBorderResaltarTiposSeleccionarReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReferenciaBancaria() {
		return jTextFieldValorCampoGeneralReferenciaBancaria;
	}

	public void setjTextFieldValorCampoGeneralReferenciaBancaria(
			JTextField jTextFieldValorCampoGeneralReferenciaBancaria) {
		this.jTextFieldValorCampoGeneralReferenciaBancaria = jTextFieldValorCampoGeneralReferenciaBancaria;
	}

	public void setBorderResaltarValorCampoGeneralReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReferenciaBancaria .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReferenciaBancaria() {
		return this.jCheckBoxSeleccionarTodosReferenciaBancaria;
	}

	public void setjCheckBoxSeleccionarTodosReferenciaBancaria(
			JCheckBox jCheckBoxSeleccionarTodosReferenciaBancaria) {
		this.jCheckBoxSeleccionarTodosReferenciaBancaria = jCheckBoxSeleccionarTodosReferenciaBancaria;
	}

	public void setBorderResaltarSeleccionarTodosReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReferenciaBancaria() {
		return this.jCheckBoxSeleccionadosReferenciaBancaria;
	}

	public void setjCheckBoxSeleccionadosReferenciaBancaria(
			JCheckBox jCheckBoxSeleccionadosReferenciaBancaria) {
		this.jCheckBoxSeleccionadosReferenciaBancaria = jCheckBoxSeleccionadosReferenciaBancaria;
	}
	
	public void setBorderResaltarSeleccionadosReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReferenciaBancaria() {
		return this.jComboBoxTiposArchivosReportesReferenciaBancaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReferenciaBancaria(
			JComboBox jComboBoxTiposArchivosReportesReferenciaBancaria) {
		this.jComboBoxTiposArchivosReportesReferenciaBancaria = jComboBoxTiposArchivosReportesReferenciaBancaria;
	}

	public void setBorderResaltarTiposArchivosReportesReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReferenciaBancaria() {
		return this.jComboBoxTiposReportesReferenciaBancaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReferenciaBancaria(
			JComboBox jComboBoxTiposReportesReferenciaBancaria) {
		this.jComboBoxTiposReportesReferenciaBancaria = jComboBoxTiposReportesReferenciaBancaria;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReferenciaBancaria() {
	//	return jComboBoxTiposReportesDinamicoReferenciaBancaria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReferenciaBancaria(
	//		JComboBox jComboBoxTiposReportesDinamicoReferenciaBancaria) {
	//	this.jComboBoxTiposReportesDinamicoReferenciaBancaria = jComboBoxTiposReportesDinamicoReferenciaBancaria;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReferenciaBancaria() {
	//	return jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReferenciaBancaria(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria = jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria;
	//}
	
	public void setBorderResaltarTiposReportesReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReferenciaBancaria() {
		return this.jComboBoxTiposGraficosReportesReferenciaBancaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReferenciaBancaria(
			JComboBox jComboBoxTiposGraficosReportesReferenciaBancaria) {
		this.jComboBoxTiposGraficosReportesReferenciaBancaria = jComboBoxTiposGraficosReportesReferenciaBancaria;
	}
	
	public void setBorderResaltarTiposGraficosReportesReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReferenciaBancaria() {
		return this.jComboBoxTiposPaginacionReferenciaBancaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReferenciaBancaria(
			JComboBox jComboBoxTiposPaginacionReferenciaBancaria) {
		this.jComboBoxTiposPaginacionReferenciaBancaria = jComboBoxTiposPaginacionReferenciaBancaria;
	}
	
	public void setBorderResaltarTiposPaginacionReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReferenciaBancaria() {
		return this.jComboBoxTiposRelacionesReferenciaBancaria;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferenciaBancaria() {
		return this.jComboBoxTiposAccionesReferenciaBancaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferenciaBancaria(
			JComboBox jComboBoxTiposRelacionesReferenciaBancaria) {
		this.jComboBoxTiposRelacionesReferenciaBancaria = jComboBoxTiposRelacionesReferenciaBancaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferenciaBancaria(
			JComboBox jComboBoxTiposAccionesReferenciaBancaria) {
		this.jComboBoxTiposAccionesReferenciaBancaria = jComboBoxTiposAccionesReferenciaBancaria;
	}
	
	public void setBorderResaltarTiposRelacionesReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReferenciaBancaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReferenciaBancaria .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReferenciaBancaria() {
	//	return jCheckBoxConGraficoDinamicoReferenciaBancaria;
	//}

	//public void setjCheckBoxConGraficoDinamicoReferenciaBancaria(
	//		JCheckBox jCheckBoxConGraficoDinamicoReferenciaBancaria) {
	//	this.jCheckBoxConGraficoDinamicoReferenciaBancaria = jCheckBoxConGraficoDinamicoReferenciaBancaria;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReferenciaBancaria() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReferenciaBancaria.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReferenciaBancaria .setBorder(borderResaltar);		
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
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		
		this.referenciabancariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciabancariaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaBancariaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia Bancaria MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
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
		
		ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReferenciaBancaria= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"nuevo","nuevo","Nuevo"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"duplicar","duplicar","Duplicar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"copiar","copiar","Copiar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"ver_form","ver_form","Ver"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"recargar","recargar","Recargar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReferenciaBancaria,this.jTtoolBarReferenciaBancaria,
							"cerrar","cerrar","Salir"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReferenciaBancaria=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReferenciaBancaria;
			
				this.jButtonProcesarInformacionToolBarReferenciaBancaria=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReferenciaBancaria;
				
		//protected JButton jButtonModificarToolBarReferenciaBancaria;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReferenciaBancaria=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReferenciaBancaria=new JMenuMe("General");
		this.jmenuArchivoReferenciaBancaria=new JMenuMe("Archivo");
		this.jmenuAccionesReferenciaBancaria=new JMenuMe("Acciones");
		this.jmenuDatosReferenciaBancaria=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferenciaBancaria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferenciaBancaria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferenciaBancaria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReferenciaBancaria= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReferenciaBancaria.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReferenciaBancaria,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReferenciaBancaria= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReferenciaBancaria.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReferenciaBancaria,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReferenciaBancaria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferenciaBancaria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferenciaBancaria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReferenciaBancaria= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReferenciaBancaria.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReferenciaBancaria,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReferenciaBancaria= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReferenciaBancaria.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReferenciaBancaria,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReferenciaBancaria= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReferenciaBancaria.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReferenciaBancaria,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferenciaBancaria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferenciaBancaria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferenciaBancaria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReferenciaBancaria= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReferenciaBancaria.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReferenciaBancaria,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReferenciaBancaria= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReferenciaBancaria.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReferenciaBancaria,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReferenciaBancaria= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReferenciaBancaria.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReferenciaBancaria,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReferenciaBancaria= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReferenciaBancaria.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReferenciaBancaria,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReferenciaBancaria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReferenciaBancaria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReferenciaBancaria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferenciaBancaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferenciaBancaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferenciaBancaria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReferenciaBancaria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReferenciaBancaria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReferenciaBancaria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferenciaBancaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferenciaBancaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferenciaBancaria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReferenciaBancaria= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReferenciaBancaria.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReferenciaBancaria,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReferenciaBancaria.add(this.jMenuItemCerrarReferenciaBancaria);
			
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemNuevoReferenciaBancaria);
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemNuevoGuardarCambiosReferenciaBancaria);
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemNuevoRelacionesReferenciaBancaria);
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemGuardarCambiosTablaReferenciaBancaria);		
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemDuplicarReferenciaBancaria);		
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemCopiarReferenciaBancaria);		
			this.jmenuAccionesReferenciaBancaria.add(this.jMenuItemVerFormReferenciaBancaria);		
			
			this.jmenuDatosReferenciaBancaria.add(this.jMenuItemRecargarInformacionReferenciaBancaria);				
			this.jmenuDatosReferenciaBancaria.add(this.jMenuItemAnterioresReferenciaBancaria);				
			this.jmenuDatosReferenciaBancaria.add(this.jMenuItemSiguientesReferenciaBancaria);				
			this.jmenuDatosReferenciaBancaria.add(this.jMenuItemAbrirOrderByReferenciaBancaria);				
			this.jmenuDatosReferenciaBancaria.add(this.jMenuItemMostrarOcultarReferenciaBancaria);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReferenciaBancaria.add(this.jMenuItemGuardarCambiosReferenciaBancaria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReferenciaBancaria.add(this.jmenuArchivoReferenciaBancaria);		
			this.jmenuBarReferenciaBancaria.add(this.jmenuAccionesReferenciaBancaria);		
			this.jmenuBarReferenciaBancaria.add(this.jmenuDatosReferenciaBancaria);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReferenciaBancaria);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReferenciaBancaria() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteReferenciaBancaria.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteReferenciaBancaria= new JButtonMe();
		this.jButtonFK_IdClienteReferenciaBancaria.setText("Buscar");
		this.jButtonFK_IdClienteReferenciaBancaria.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteReferenciaBancaria,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteReferenciaBancaria = new JLabelMe();
		jLabelidclienteFK_IdClienteReferenciaBancaria.setText("Cliente :");
		jLabelidclienteFK_IdClienteReferenciaBancaria.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteReferenciaBancaria= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.setFocusable(false);

		this.jPanelFK_IdTipoBancoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoBancoReferenciaBancaria.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdTipoBancoReferenciaBancaria= new JButtonMe();
		this.jButtonFK_IdTipoBancoReferenciaBancaria.setText("Buscar");
		this.jButtonFK_IdTipoBancoReferenciaBancaria.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoBancoReferenciaBancaria,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoBancoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria = new JLabelMe();
		jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setText("Banco :");
		jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setToolTipText("Banco");
		jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria= new JComboBoxMe();
		jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoReferenciaBancaria.setToolTipText("Buscar Por Tipo Cuenta Banco ");
		this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria.setToolTipText("Buscar Por Tipo Cuenta Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria,"buscar_button","Buscar Por Tipo Cuenta Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria = new JLabelMe();
		jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setText("Tipo Cuenta Banco :");
		jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setToolTipText("Tipo Cuenta Banco");
		jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria= new JComboBoxMe();
		jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoBancoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoBancoReferenciaBancaria.setToolTipText("Buscar Por Tipo Produ Banco ");
		this.jButtonFK_IdTipoProductoBancoReferenciaBancaria= new JButtonMe();
		this.jButtonFK_IdTipoProductoBancoReferenciaBancaria.setText("Buscar");
		this.jButtonFK_IdTipoProductoBancoReferenciaBancaria.setToolTipText("Buscar Por Tipo Produ Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoBancoReferenciaBancaria,"buscar_button","Buscar Por Tipo Produ Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoBancoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria = new JLabelMe();
		jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setText("Tipo Produ Banco :");
		jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setToolTipText("Tipo Produ Banco");
		jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria= new JComboBoxMe();
		jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoValoracionReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoValoracionReferenciaBancaria.setToolTipText("Buscar Por Tipo Valoracion ");
		this.jButtonFK_IdTipoValoracionReferenciaBancaria= new JButtonMe();
		this.jButtonFK_IdTipoValoracionReferenciaBancaria.setText("Buscar");
		this.jButtonFK_IdTipoValoracionReferenciaBancaria.setToolTipText("Buscar Por Tipo Valoracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoValoracionReferenciaBancaria,"buscar_button","Buscar Por Tipo Valoracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoValoracionReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria = new JLabelMe();
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setText("Tipo Valoracion :");
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setToolTipText("Tipo Valoracion");
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria= new JComboBoxMe();
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasReferenciaBancaria=new JTabbedPane();


		this.jTabbedPaneBusquedasReferenciaBancaria.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferenciaBancaria.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferenciaBancaria.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasReferenciaBancaria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleReferenciaBancaria = new ReferenciaBancariaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Referencia Bancaria DATOS");
			this.jInternalFrameDetalleFormReferenciaBancaria = new ReferenciaBancariaDetalleFormJInternalFrame(jDesktopPane,this.referenciabancariaSessionBean.getConGuardarRelaciones(),this.referenciabancariaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReferenciaBancaria = null;//new ReferenciaBancariaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferenciaBancaria= new GridBagLayout();
		
		
		this.jTableDatosReferenciaBancaria = new JTableMe();      
		
		String sToolTipReferenciaBancaria="";
		sToolTipReferenciaBancaria=ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferenciaBancaria+="(Cartera.ReferenciaBancaria)";
		}
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferenciaBancaria+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReferenciaBancaria.setToolTipText(sToolTipReferenciaBancaria);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReferenciaBancaria);
		this.jTableDatosReferenciaBancaria.setAutoCreateRowSorter(true);
		this.jTableDatosReferenciaBancaria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReferenciaBancaria.setRowSelectionAllowed(true);
		this.jTableDatosReferenciaBancaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReferenciaBancaria = new JButtonMe();
		this.jButtonDuplicarReferenciaBancaria = new JButtonMe();
		this.jButtonCopiarReferenciaBancaria = new JButtonMe();
		this.jButtonVerFormReferenciaBancaria = new JButtonMe();
		this.jButtonNuevoRelacionesReferenciaBancaria = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria = new JButtonMe();
		this.jButtonCerrarReferenciaBancaria = new JButtonMe();
		
		this.jScrollPanelDatosReferenciaBancaria = new JScrollPane();   
        this.jScrollPanelDatosGeneralReferenciaBancaria = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia Bancaria";
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Bancarias" + this.sPath));
		} else {
			this.jScrollPanelDatosReferenciaBancaria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferenciaBancaria.setToolTipText("Acciones");
        this.jPanelAccionesReferenciaBancaria.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReferenciaBancaria=new ReporteDinamicoJInternalFrame(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReferenciaBancaria();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReferenciaBancaria=new ImportacionJInternalFrame(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReferenciaBancaria();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReferenciaBancaria = new JButtonMe();
		
		this.jButtonAbrirOrderByReferenciaBancaria.setText("Orden");
		this.jButtonAbrirOrderByReferenciaBancaria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferenciaBancaria,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferenciaBancaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaBancaria,false,this);
			
			//this.cargarOrderByReferenciaBancaria(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferenciaBancaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaBancaria,true,this);
			
			//this.cargarOrderByReferenciaBancaria(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReferenciaBancaria.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosReferenciaBancaria.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosReferenciaBancaria.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosReferenciaBancaria.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferenciaBancaria.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferenciaBancaria.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReferenciaBancaria.setText("Nuevo");
		this.jButtonDuplicarReferenciaBancaria.setText("Duplicar");
		this.jButtonCopiarReferenciaBancaria.setText("Copiar");
		this.jButtonVerFormReferenciaBancaria.setText("Ver");
		this.jButtonNuevoRelacionesReferenciaBancaria.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.setText("Guardar");
		this.jButtonCerrarReferenciaBancaria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferenciaBancaria,"nuevo_button","Nuevo",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReferenciaBancaria,"duplicar_button","Duplicar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReferenciaBancaria,"copiar_button","Copiar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReferenciaBancaria,"ver_form","Ver",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReferenciaBancaria,"nuevorelaciones_button","Nuevo Rel",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferenciaBancaria,"guardarcambiostabla_button","Guardar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferenciaBancaria,"cerrar_button","Salir",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReferenciaBancaria.setToolTipText("Nuevo"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReferenciaBancaria.setToolTipText("Duplicar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReferenciaBancaria.setToolTipText("Copiar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReferenciaBancaria.setToolTipText("Ver"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReferenciaBancaria.setToolTipText("Nuevo Rel"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.setToolTipText("Guardar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferenciaBancaria.setToolTipText("Salir"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferenciaBancaria";
		inputMap = this.jButtonNuevoReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferenciaBancaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferenciaBancaria"));
		
		//DUPLICAR
		sMapKey = "DuplicarReferenciaBancaria";
		inputMap = this.jButtonDuplicarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReferenciaBancaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReferenciaBancaria"));
		
		//COPIAR
		sMapKey = "CopiarReferenciaBancaria";
		inputMap = this.jButtonCopiarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReferenciaBancaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReferenciaBancaria"));
		
		//VEr FORM
		sMapKey = "VerFormReferenciaBancaria";
		inputMap = this.jButtonVerFormReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReferenciaBancaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReferenciaBancaria"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReferenciaBancaria";
		inputMap = this.jButtonNuevoRelacionesReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReferenciaBancaria"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReferenciaBancaria";
		inputMap = this.jButtonModificarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReferenciaBancaria"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReferenciaBancaria";
		inputMap = this.jButtonCerrarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferenciaBancaria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferenciaBancaria";
		inputMap = this.jButtonGuardarCambiosTablaReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferenciaBancaria"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ReferenciaBancaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ReferenciaBancaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ReferenciaBancaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ReferenciaBancaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ReferenciaBancaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReferenciaBancaria.setName("jPanelParametrosReportesReferenciaBancaria"); 
		
		this.jPanelParametrosReportesAccionesReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReferenciaBancaria.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReferenciaBancaria.setName("jPanelParametrosReportesAccionesReferenciaBancaria"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReferenciaBancaria = new JButtonMe();
		this.jButtonRecargarInformacionReferenciaBancaria.setText("Recargar");
		this.jButtonRecargarInformacionReferenciaBancaria.setToolTipText("Recargar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReferenciaBancaria,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionReferenciaBancaria = new JButtonMe();
		this.jButtonProcesarInformacionReferenciaBancaria.setText("Procesar");
		this.jButtonProcesarInformacionReferenciaBancaria.setToolTipText("Procesar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReferenciaBancaria.setVisible(false);
			
		this.jButtonProcesarInformacionReferenciaBancaria.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferenciaBancaria.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferenciaBancaria.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaBancaria.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReferenciaBancaria.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaBancaria.setText("TIPO");       
		this.jComboBoxTiposReportesReferenciaBancaria.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaBancaria.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReferenciaBancaria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReferenciaBancaria.setText("Paginacion");
		this.jComboBoxTiposPaginacionReferenciaBancaria.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReferenciaBancaria.setText("Accion");
		this.jComboBoxTiposRelacionesReferenciaBancaria.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferenciaBancaria.setText("Accion");
		this.jComboBoxTiposAccionesReferenciaBancaria.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReferenciaBancaria.setText("Accion");
		this.jComboBoxTiposSeleccionarReferenciaBancaria.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReferenciaBancaria=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReferenciaBancaria.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferenciaBancaria.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferenciaBancaria.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReferenciaBancaria = new JLabelMe();
		
		this.jLabelAccionesReferenciaBancaria.setText("Acciones");		
		this.jLabelAccionesReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReferenciaBancaria = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReferenciaBancaria.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReferenciaBancaria.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReferenciaBancaria = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReferenciaBancaria.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReferenciaBancaria.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReferenciaBancaria = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReferenciaBancaria = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReferenciaBancaria.setText("Graf.");
		this.jCheckBoxConGraficoReporteReferenciaBancaria.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReferenciaBancaria = new JButtonMe();
		//this.jButtonAnterioresReferenciaBancaria.setText("<<");
        this.jButtonAnterioresReferenciaBancaria.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReferenciaBancaria,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReferenciaBancaria = new JButtonMe();
		//this.jButtonSiguientesReferenciaBancaria.setText(">>");
        this.jButtonSiguientesReferenciaBancaria.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReferenciaBancaria,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReferenciaBancaria = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReferenciaBancaria.setText("Nue");
        this.jButtonNuevoGuardarCambiosReferenciaBancaria.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReferenciaBancaria,"nuevoguardarcambios_button","Nue",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReferenciaBancaria";
		inputMap = this.jButtonNuevoGuardarCambiosReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReferenciaBancaria"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReferenciaBancaria";
		inputMap = this.jButtonRecargarInformacionReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReferenciaBancaria"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReferenciaBancaria";
		inputMap = this.jButtonSiguientesReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReferenciaBancaria"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReferenciaBancaria";
		inputMap = this.jButtonAnterioresReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReferenciaBancaria"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReferenciaBancaria();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReferenciaBancaria.setMinimumSize(new Dimension(this.getWidth(),ReferenciaBancariaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaBancariaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferenciaBancaria.setMaximumSize(new Dimension(this.getWidth(),ReferenciaBancariaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaBancariaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferenciaBancaria.setPreferredSize(new Dimension(this.getWidth(),ReferenciaBancariaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaBancariaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReferenciaBancaria = new GridBagLayout();

			this.jPanelPaginacionReferenciaBancaria.setLayout(gridaBagLayoutPaginacionReferenciaBancaria);						
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 0;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonAnterioresReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
					
						
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferenciaBancaria.gridy = 0;
			
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonNuevoGuardarCambiosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
						
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferenciaBancaria.gridy = 0;
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonSiguientesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 1;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonNuevoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
						
			
			
			if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
				this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReferenciaBancaria.gridy = 1;
				this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReferenciaBancaria.add(this.jButtonGuardarCambiosTablaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			}
			
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 1;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonDuplicarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 1;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonCopiarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 1;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonVerFormReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 1;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReferenciaBancaria.add(this.jButtonCerrarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		
		this.jButtonRecargarInformacionReferenciaBancaria.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferenciaBancaria.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferenciaBancaria.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReferenciaBancaria.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferenciaBancaria.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferenciaBancaria.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReferenciaBancaria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferenciaBancaria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferenciaBancaria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReferenciaBancaria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferenciaBancaria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferenciaBancaria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReferenciaBancaria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferenciaBancaria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferenciaBancaria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReferenciaBancaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferenciaBancaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferenciaBancaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReferenciaBancaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaBancaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaBancaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReferenciaBancaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferenciaBancaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferenciaBancaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReferenciaBancaria.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferenciaBancaria.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferenciaBancaria.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReferenciaBancaria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferenciaBancaria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferenciaBancaria.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReferenciaBancaria.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferenciaBancaria.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferenciaBancaria.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReferenciaBancaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReferenciaBancaria = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ReferenciaBancaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ReferenciaBancaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ReferenciaBancaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ReferenciaBancaria = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReferenciaBancaria.setLayout(gridaBagParametrosReportesReferenciaBancaria);
			this.jPanelParametrosReportesAccionesReferenciaBancaria.setLayout(gridaBagParametrosReportesAccionesReferenciaBancaria);
			
			
			this.jPanelParametrosAuxiliar1ReferenciaBancaria.setLayout(gridaBagParametrosAuxiliar1ReferenciaBancaria);
			this.jPanelParametrosAuxiliar2ReferenciaBancaria.setLayout(gridaBagParametrosAuxiliar2ReferenciaBancaria);
			this.jPanelParametrosAuxiliar3ReferenciaBancaria.setLayout(gridaBagParametrosAuxiliar3ReferenciaBancaria);
			this.jPanelParametrosAuxiliar4ReferenciaBancaria.setLayout(gridaBagParametrosAuxiliar4ReferenciaBancaria);
			//this.jPanelParametrosAuxiliar5ReferenciaBancaria.setLayout(gridaBagParametrosAuxiliar2ReferenciaBancaria);			
			
			
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jButtonRecargarInformacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaBancaria.add(this.jComboBoxTiposPaginacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaBancaria.add(this.jCheckBoxConAltoMaximoTablaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaBancaria.add(this.jComboBoxTiposArchivosReportesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jPanelParametrosAuxiliar1ReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ReferenciaBancaria.add(this.jComboBoxTiposReportesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);																		
			
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ReferenciaBancaria.add(this.jComboBoxTiposGraficosReportesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jPanelParametrosAuxiliar4ReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jComboBoxTiposReportesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jCheckBoxGenerarReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jPanelParametrosAuxiliar2ReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jLabelAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
				this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReferenciaBancaria.add(this.jButtonAbrirOrderByReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jComboBoxTiposSeleccionarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
			
			
			/*
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jCheckBoxSeleccionarTodosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jCheckBoxConGraficoReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaBancaria.add(this.jCheckBoxSeleccionarTodosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);															
				
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaBancaria.add(this.jCheckBoxSeleccionadosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);															
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaBancaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaBancaria.add(this.jCheckBoxConGraficoReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jPanelParametrosAuxiliar3ReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jComboBoxTiposAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
	
				
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaBancaria.add(this.jTextFieldValorCampoGeneralReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReferenciaBancaria = new GridBagLayout();

			this.jScrollPanelDatosReferenciaBancaria.setLayout(gridaBagLayoutDatosReferenciaBancaria);
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = 0;
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;
			
			this.jScrollPanelDatosReferenciaBancaria.add(this.jTableDatosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReferenciaBancaria.setViewportView(this.jTableDatosReferenciaBancaria);
		this.jTableDatosReferenciaBancaria.setFillsViewportHeight(true);
		this.jTableDatosReferenciaBancaria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReferenciaBancaria= new GridBagLayout();
		this.jPanelAccionesReferenciaBancaria.setLayout(gridaBagLayoutAccionesReferenciaBancaria);
		
		
		/*	
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
			
		this.jPanelAccionesReferenciaBancaria.add(this.jButtonNuevoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteReferenciaBancaria= new GridBagLayout();
		gridaBagLayoutFK_IdClienteReferenciaBancaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteReferenciaBancaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteReferenciaBancaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteReferenciaBancaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteReferenciaBancaria.setLayout(gridaBagLayoutFK_IdClienteReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 0;
		jPanelFK_IdClienteReferenciaBancaria.add(jLabelidclienteFK_IdClienteReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 1;
		jPanelFK_IdClienteReferenciaBancaria.add(jComboBoxidclienteFK_IdClienteReferenciaBancaria, gridBagConstraintsReferenciaBancaria);


		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.EAST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 0;
		jPanelFK_IdClienteReferenciaBancaria.add(this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 1;
		gridBagConstraintsReferenciaBancaria.gridx =1;
		jPanelFK_IdClienteReferenciaBancaria.add(jButtonFK_IdClienteReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		jTabbedPaneBusquedasReferenciaBancaria.addTab("1.-Por Cliente ", jPanelFK_IdClienteReferenciaBancaria);
		jTabbedPaneBusquedasReferenciaBancaria.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoBancoReferenciaBancaria= new GridBagLayout();
		gridaBagLayoutFK_IdTipoBancoReferenciaBancaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoBancoReferenciaBancaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoBancoReferenciaBancaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoBancoReferenciaBancaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoBancoReferenciaBancaria.setLayout(gridaBagLayoutFK_IdTipoBancoReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 0;
		jPanelFK_IdTipoBancoReferenciaBancaria.add(jLabelidvalorclientebancoFK_IdTipoBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 1;
		jPanelFK_IdTipoBancoReferenciaBancaria.add(jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 1;
		gridBagConstraintsReferenciaBancaria.gridx =1;
		jPanelFK_IdTipoBancoReferenciaBancaria.add(jButtonFK_IdTipoBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		jTabbedPaneBusquedasReferenciaBancaria.addTab("2.-Por Banco ", jPanelFK_IdTipoBancoReferenciaBancaria);
		jTabbedPaneBusquedasReferenciaBancaria.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoReferenciaBancaria= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoReferenciaBancaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoReferenciaBancaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoReferenciaBancaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoReferenciaBancaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoReferenciaBancaria.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 0;
		jPanelFK_IdTipoCuentaBancoReferenciaBancaria.add(jLabelidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 1;
		jPanelFK_IdTipoCuentaBancoReferenciaBancaria.add(jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 1;
		gridBagConstraintsReferenciaBancaria.gridx =1;
		jPanelFK_IdTipoCuentaBancoReferenciaBancaria.add(jButtonFK_IdTipoCuentaBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		jTabbedPaneBusquedasReferenciaBancaria.addTab("3.-Por Tipo Cuenta Banco ", jPanelFK_IdTipoCuentaBancoReferenciaBancaria);
		jTabbedPaneBusquedasReferenciaBancaria.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoBancoReferenciaBancaria= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoBancoReferenciaBancaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoBancoReferenciaBancaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoBancoReferenciaBancaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoBancoReferenciaBancaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoBancoReferenciaBancaria.setLayout(gridaBagLayoutFK_IdTipoProductoBancoReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 0;
		jPanelFK_IdTipoProductoBancoReferenciaBancaria.add(jLabelidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 1;
		jPanelFK_IdTipoProductoBancoReferenciaBancaria.add(jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 1;
		gridBagConstraintsReferenciaBancaria.gridx =1;
		jPanelFK_IdTipoProductoBancoReferenciaBancaria.add(jButtonFK_IdTipoProductoBancoReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		jTabbedPaneBusquedasReferenciaBancaria.addTab("4.-Por Tipo Produ Banco ", jPanelFK_IdTipoProductoBancoReferenciaBancaria);
		jTabbedPaneBusquedasReferenciaBancaria.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoValoracionReferenciaBancaria= new GridBagLayout();
		gridaBagLayoutFK_IdTipoValoracionReferenciaBancaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionReferenciaBancaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionReferenciaBancaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoValoracionReferenciaBancaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoValoracionReferenciaBancaria.setLayout(gridaBagLayoutFK_IdTipoValoracionReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 0;
		jPanelFK_IdTipoValoracionReferenciaBancaria.add(jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 0;
		gridBagConstraintsReferenciaBancaria.gridx = 1;
		jPanelFK_IdTipoValoracionReferenciaBancaria.add(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaBancaria.gridy = 1;
		gridBagConstraintsReferenciaBancaria.gridx =1;
		jPanelFK_IdTipoValoracionReferenciaBancaria.add(jButtonFK_IdTipoValoracionReferenciaBancaria, gridBagConstraintsReferenciaBancaria);

		jTabbedPaneBusquedasReferenciaBancaria.addTab("5.-Por Tipo Valoracion ", jPanelFK_IdTipoValoracionReferenciaBancaria);
		jTabbedPaneBusquedasReferenciaBancaria.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferenciaBancaria);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();						
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;		
			//this.gridBagConstraintsReferenciaBancaria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferenciaBancaria.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;		
		//this.gridBagConstraintsReferenciaBancaria.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReferenciaBancaria);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;		
			this.gridBagConstraintsReferenciaBancaria.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsReferenciaBancaria.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);								
		
		
		/*
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		*/		
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferenciaBancaria.gridx =0;
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferenciaBancaria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
				
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReferenciaBancaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferenciaBancaria = new GridBagLayout();
			this.jPanelBusquedasParametrosReferenciaBancaria.setLayout(gridaBagLayoutBusquedasParametrosReferenciaBancaria);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReferenciaBancaria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferenciaBancaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaBancaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaBancaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReferenciaBancaria;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReferenciaBancaria() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReferenciaBancaria = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReferenciaBancaria.setName("jPanelReporteDinamicoReferenciaBancaria"); 
		
		this.jPanelReporteDinamicoReferenciaBancaria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferenciaBancaria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferenciaBancaria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReferenciaBancaria.setLayout(gridaBagLayoutReporteDinamicoReferenciaBancaria);
		
		
		this.jInternalFrameReporteDinamicoReferenciaBancaria= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReferenciaBancaria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferenciaBancaria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReferenciaBancaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReferenciaBancaria.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReferenciaBancaria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReferenciaBancaria.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReferenciaBancaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReferenciaBancaria.setResizable(true);
	    this.jInternalFrameReporteDinamicoReferenciaBancaria.setClosable(true);
	    this.jInternalFrameReporteDinamicoReferenciaBancaria.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReferenciaBancaria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferenciaBancaria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferenciaBancaria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Bancarias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReferenciaBancaria = new JLabelMe();

		this.jLabelColumnasSelectReporteReferenciaBancaria.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelColumnasSelectReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReferenciaBancaria = new JList<Reporte>();
		this.jListColumnasSelectReporteReferenciaBancaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReferenciaBancaria.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReferenciaBancaria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferenciaBancaria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferenciaBancaria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReferenciaBancaria=new JScrollPane(this.jListColumnasSelectReporteReferenciaBancaria);
			
			this.jScrollColumnasSelectReporteReferenciaBancaria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferenciaBancaria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferenciaBancaria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReferenciaBancaria.add(this.jListColumnasSelectReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jScrollColumnasSelectReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReferenciaBancaria = new JLabelMe();

		this.jLabelRelacionesSelectReporteReferenciaBancaria.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReferenciaBancaria = new JList<Reporte>();
		this.jListRelacionesSelectReporteReferenciaBancaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReferenciaBancaria.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReferenciaBancaria.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferenciaBancaria.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferenciaBancaria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReferenciaBancaria=new JScrollPane(this.jListRelacionesSelectReporteReferenciaBancaria);
			
			this.jScrollRelacionesSelectReporteReferenciaBancaria.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferenciaBancaria.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferenciaBancaria.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoReferenciaBancaria = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria = new JComboBoxMe();
		this.jListColumnasValoresGraficoReferenciaBancaria = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReferenciaBancaria = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReferenciaBancaria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReferenciaBancaria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferenciaBancaria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferenciaBancaria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoReferenciaBancaria = new JLabelMe();

		this.jLabelConGraficoDinamicoReferenciaBancaria.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelConGraficoDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoReferenciaBancaria = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoReferenciaBancaria.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoReferenciaBancaria.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoReferenciaBancaria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoReferenciaBancaria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoReferenciaBancaria.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jCheckBoxConGraficoDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoReferenciaBancaria = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoReferenciaBancaria.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelColumnaCategoriaGraficoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorReferenciaBancaria = new JLabelMe();

		this.jLabelColumnaCategoriaValorReferenciaBancaria.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelColumnaCategoriaValorReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorReferenciaBancaria.setText("Accion");
        this.jComboBoxColumnaCategoriaValorReferenciaBancaria.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorReferenciaBancaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorReferenciaBancaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorReferenciaBancaria.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jComboBoxColumnaCategoriaValorReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoReferenciaBancaria = new JLabelMe();

		this.jLabelColumnasValoresGraficoReferenciaBancaria.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelColumnasValoresGraficoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoReferenciaBancaria = new JList<Reporte>();
		this.jListColumnasValoresGraficoReferenciaBancaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoReferenciaBancaria.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoReferenciaBancaria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoReferenciaBancaria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoReferenciaBancaria.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoReferenciaBancaria=new JScrollPane(this.jListColumnasValoresGraficoReferenciaBancaria);
			
			this.jScrollColumnasValoresGraficoReferenciaBancaria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoReferenciaBancaria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoReferenciaBancaria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoReferenciaBancaria.add(this.jListColumnasSelectReporteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jScrollColumnasValoresGraficoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoReferenciaBancaria = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoReferenciaBancaria.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelTiposGraficosReportesDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoReferenciaBancaria.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jComboBoxTiposGraficosReportesDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReferenciaBancaria = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReferenciaBancaria.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelGenerarExcelReporteDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria.setToolTipText("Generar EXCEL"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReferenciaBancaria.add(this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jComboBoxTiposReportesDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReferenciaBancaria = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReferenciaBancaria.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jLabelTiposArchivoReporteDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jComboBoxTiposArchivosReportesDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReferenciaBancaria = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReferenciaBancaria.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReferenciaBancaria,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReferenciaBancaria.setToolTipText("Generar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jButtonGenerarReporteDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReferenciaBancaria = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReferenciaBancaria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReferenciaBancaria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReferenciaBancaria.setToolTipText("Cancelar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaBancaria.add(this.jButtonCerrarReporteDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReferenciaBancaria = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReferenciaBancaria= new JScrollPane(jPanelReporteDinamicoReferenciaBancaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReferenciaBancaria.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferenciaBancaria.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferenciaBancaria.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Bancarias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaBancaria.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReferenciaBancaria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReferenciaBancaria.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReferenciaBancaria);
		this.jInternalFrameReporteDinamicoReferenciaBancaria.getContentPane().add(this.jScrollPanelReporteDinamicoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReferenciaBancaria() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReferenciaBancaria = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReferenciaBancaria.setName("jPanelImportacionReferenciaBancaria"); 
		
		this.jPanelImportacionReferenciaBancaria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferenciaBancaria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferenciaBancaria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReferenciaBancaria.setLayout(gridaBagLayoutImportacionReferenciaBancaria);
		
		
		this.jInternalFrameImportacionReferenciaBancaria= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReferenciaBancaria= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReferenciaBancaria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferenciaBancaria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReferenciaBancaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferenciaBancaria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferenciaBancaria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReferenciaBancaria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferenciaBancaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferenciaBancaria.setResizable(true);
	    this.jInternalFrameImportacionReferenciaBancaria.setClosable(true);
	    this.jInternalFrameImportacionReferenciaBancaria.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReferenciaBancaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferenciaBancaria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferenciaBancaria.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReferenciaBancaria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferenciaBancaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferenciaBancaria.setResizable(true);
	    this.jInternalFrameImportacionReferenciaBancaria.setClosable(true);
	    this.jInternalFrameImportacionReferenciaBancaria.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReferenciaBancaria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferenciaBancaria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferenciaBancaria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Bancarias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReferenciaBancaria = new JLabelMe();

		this.jLabelArchivoImportacionReferenciaBancaria.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferenciaBancaria.add(this.jLabelArchivoImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReferenciaBancaria = new JFileChooser();		
		this.jFileChooserImportacionReferenciaBancaria.setToolTipText("ESCOGER ARCHIVO"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReferenciaBancaria = new JButtonMe();
		this.jButtonAbrirImportacionReferenciaBancaria.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReferenciaBancaria,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReferenciaBancaria.setToolTipText("Generar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaBancaria.add(this.jButtonAbrirImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReferenciaBancaria = new JLabelMe();

		this.jLabelPathArchivoImportacionReferenciaBancaria.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferenciaBancaria.add(this.jLabelPathArchivoImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReferenciaBancaria=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReferenciaBancaria.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferenciaBancaria.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferenciaBancaria.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaBancaria.add(this.jTextFieldPathArchivoImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReferenciaBancaria = new JButtonMe();
		this.jButtonGenerarImportacionReferenciaBancaria.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReferenciaBancaria,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReferenciaBancaria.setToolTipText("Generar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaBancaria.add(this.jButtonGenerarImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReferenciaBancaria = new JButtonMe();
		this.jButtonCerrarImportacionReferenciaBancaria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReferenciaBancaria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReferenciaBancaria.setToolTipText("Cancelar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaBancaria.add(this.jButtonCerrarImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReferenciaBancaria = new GridBagLayout();
		
		this.jScrollPanelImportacionReferenciaBancaria= new JScrollPane(jPanelImportacionReferenciaBancaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy =iPosYImportacion;
		this.gridBagConstraintsReferenciaBancaria.gridx =iPosXImportacion;
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReferenciaBancaria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReferenciaBancaria.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReferenciaBancaria);
		this.jInternalFrameImportacionReferenciaBancaria.getContentPane().add(this.jScrollPanelImportacionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReferenciaBancaria(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReferenciaBancaria = new JButtonMe();
			this.jButtonAbrirOrderByReferenciaBancaria.setText("Orden");
			this.jButtonAbrirOrderByReferenciaBancaria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferenciaBancaria,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReferenciaBancaria";
			inputMap = this.jButtonAbrirOrderByReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReferenciaBancaria"));
		
		
			GridBagLayout gridaBagLayoutOrderByReferenciaBancaria = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReferenciaBancaria.setName("jPanelOrderByReferenciaBancaria"); 
			
			this.jPanelOrderByReferenciaBancaria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferenciaBancaria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferenciaBancaria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReferenciaBancaria.setLayout(gridaBagLayoutOrderByReferenciaBancaria);
			
			
			this.jTableDatosReferenciaBancariaOrderBy = new JTableMe();        
			this.jTableDatosReferenciaBancariaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReferenciaBancariaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReferenciaBancariaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReferenciaBancariaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReferenciaBancariaOrderBy.setViewportView(this.jTableDatosReferenciaBancariaOrderBy);
			this.jTableDatosReferenciaBancariaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReferenciaBancariaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReferenciaBancaria= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReferenciaBancaria= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReferenciaBancaria = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReferenciaBancaria= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReferenciaBancaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReferenciaBancaria.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReferenciaBancaria.setTitle("Orden");
			this.jInternalFrameOrderByReferenciaBancaria.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReferenciaBancaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReferenciaBancaria.setResizable(true);
			this.jInternalFrameOrderByReferenciaBancaria.setClosable(true);
			this.jInternalFrameOrderByReferenciaBancaria.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReferenciaBancaria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferenciaBancaria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferenciaBancaria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Bancarias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReferenciaBancaria.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReferenciaBancaria.ipady =150;
				
			this.jPanelOrderByReferenciaBancaria.add(jScrollPanelDatosReferenciaBancariaOrderBy, this.gridBagConstraintsReferenciaBancaria);//this.jTableDatosReferenciaBancariaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReferenciaBancaria = new JButtonMe();
			this.jButtonCerrarOrderByReferenciaBancaria.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReferenciaBancaria,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReferenciaBancaria.setToolTipText("Cancelar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReferenciaBancaria.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReferenciaBancaria.add(this.jButtonCerrarOrderByReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReferenciaBancaria = new GridBagLayout();
			
			this.jScrollPanelOrderByReferenciaBancaria= new JScrollPane(jPanelOrderByReferenciaBancaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy =iPosYOrderBy;
			this.gridBagConstraintsReferenciaBancaria.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReferenciaBancaria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReferenciaBancaria.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReferenciaBancaria);
			
			this.jInternalFrameOrderByReferenciaBancaria.getContentPane().add(this.jScrollPanelOrderByReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
		
		} else {
			this.jButtonAbrirOrderByReferenciaBancaria = new JButtonMe();
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
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.referenciabancariaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReferenciaBancaria.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReferenciaBancaria.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosReferenciaBancaria.getRowHeight();//ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.isSelected()) {
					iHeightTable=ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferenciaBancaria.isSelected()) {
					iHeightTable=ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaBancariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReferenciaBancaria.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferenciaBancaria.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferenciaBancaria.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReferenciaBancaria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferenciaBancaria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferenciaBancaria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReferenciaBancaria!=null && this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy()!=null) {
			//if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReferenciaBancaria.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReferenciaBancaria.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReferenciaBancaria.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReferenciaBancaria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferenciaBancaria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferenciaBancaria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=referenciabancariaLogic.getReferenciaBancarias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciabancarias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ReferenciaBancaria> TraerReferenciaBancariaBeans(List<ReferenciaBancaria> referenciabancarias,ArrayList<Classe> classes)throws Exception {
		try {
			for(ReferenciaBancaria referenciabancaria:referenciabancarias) {
					
				if(!(ReferenciaBancariaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReferenciaBancariaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					referenciabancaria.setsDetalleGeneralEntityReporte(ReferenciaBancariaConstantesFunciones.getReferenciaBancariaDescripcion(referenciabancaria));
										
					referenciabancaria.settiene_credito_descripcion(ReferenciaBancariaConstantesFunciones.gettiene_creditoDescripcion(referenciabancaria));referenciabancaria.settiene_protestos_descripcion(ReferenciaBancariaConstantesFunciones.gettiene_protestosDescripcion(referenciabancaria));referenciabancaria.setesactivo_descripcion(ReferenciaBancariaConstantesFunciones.getesactivoDescripcion(referenciabancaria));	
					
						
					
				} else  {
							
					//referenciabancaria.setsDetalleGeneralEntityReporte(referenciabancaria.getsDetalleGeneralEntityReporte());
										
				}
				
				//referenciabancariabeans.add(referenciabancariabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return referenciabancarias;
    }
	//PARA REPORTES FIN
}
