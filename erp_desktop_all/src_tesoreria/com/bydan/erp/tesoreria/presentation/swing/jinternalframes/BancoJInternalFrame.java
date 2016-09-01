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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.BancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class BancoJInternalFrame extends BancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBanco;
	
	protected JMenuBar jmenuBarBanco;
	
	protected JMenu jmenuBanco;
	protected JMenu jmenuDatosBanco;
	protected JMenu jmenuArchivoBanco;
	protected JMenu jmenuAccionesBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBanco;	
	protected GridBagConstraints gridBagConstraintsBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BancoDetalleFormJInternalFrame jInternalFrameDetalleFormBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobanco="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected FormatoBeanSwingJInternalFrame formato1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato1="";

	protected FormatoBeanSwingJInternalFrame formato2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato2="";
	
	public BancoSessionBean bancoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoBancoSessionBean tipobancoSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public FormatoSessionBean formato1SessionBean;
	public FormatoSessionBean formato2SessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Banco> bancos;		
	public List<Banco> bancosEliminados;	
	public List<Banco> bancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBanco;		
	protected JButton jButtonAbrirOrderByBanco;
	
	
	//protected JPanel jPanelOrderByBanco;
	//public JScrollPane jScrollPanelOrderByBanco;	
	//protected JButton jButtonCerrarOrderByBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BancoLogic bancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBanco;
	public JScrollPane jScrollPanelDatosEdicionBanco;
	public JScrollPane jScrollPanelDatosGeneralBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBanco;
	//public JScrollPane jScrollPanelImportacionBanco;
	
	
	
	protected JPanel jPanelAccionesBanco;
	
    protected JPanel jPanelPaginacionBanco;
    protected JPanel jPanelParametrosReportesBanco;
	protected JPanel jPanelParametrosReportesAccionesBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Banco;
	protected JPanel jPanelParametrosAuxiliar2Banco;
	protected JPanel jPanelParametrosAuxiliar3Banco;
	protected JPanel jPanelParametrosAuxiliar4Banco;
	//protected JPanel jPanelParametrosAuxiliar5Banco;
	
	
	
	//protected JPanel jPanelReporteDinamicoBanco;
	//protected JPanel jPanelImportacionBanco;
	
	
	public JTable jTableDatosBanco;
	
	
	
	//public JTable jTableDatosBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBanco;
	protected JButton jButtonDuplicarBanco;
	protected JButton jButtonCopiarBanco;
	protected JButton jButtonVerFormBanco;
	protected JButton jButtonNuevoRelacionesBanco;
	protected JButton jButtonModificarBanco;
	
    protected JButton jButtonGuardarCambiosTablaBanco;
	protected JButton jButtonCerrarBanco;
	
	
	protected JButton jButtonRecargarInformacionBanco;
	protected JButton jButtonProcesarInformacionBanco;
	
	
	protected JButton jButtonAnterioresBanco;
	protected JButton jButtonSiguientesBanco;
	protected JButton jButtonNuevoGuardarCambiosBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBanco;
	//protected JButton jButtonCerrarReporteDinamicoBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionBanco;
	//protected JButton jButtonGenerarImportacionBanco;
	//protected JButton jButtonCerrarImportacionBanco;
	//protected JFileChooser jFileChooserImportacionBanco;
	//protected File fileImportacionBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBanco;
	protected JButton jButtonDuplicarToolBarBanco;
	protected JButton jButtonNuevoRelacionesToolBarBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarBanco;
	protected JButton jButtonCopiarToolBarBanco;
	protected JButton jButtonVerFormToolBarBanco;
	public JButton jButtonGuardarCambiosTablaToolBarBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarBanco;
	protected JButton jButtonCerrarToolBarBanco;
	
	protected JButton jButtonRecargarInformacionToolBarBanco;
	protected JButton jButtonProcesarInformacionToolBarBanco;
	protected JButton jButtonAnterioresToolBarBanco;
	protected JButton jButtonSiguientesToolBarBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarBanco;
	protected JButton jButtonAbrirOrderByToolBarBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBanco;
	protected JMenuItem jMenuItemDuplicarBanco;
	protected JMenuItem jMenuItemNuevoRelacionesBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBanco;
	protected JMenuItem jMenuItemCopiarBanco;
	protected JMenuItem jMenuItemVerFormBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaBanco;
	protected JMenuItem jMenuItemCerrarBanco;
	protected JMenuItem jMenuItemDetalleCerrarBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionBanco;
	protected JMenuItem jMenuItemProcesarInformacionBanco;
	protected JMenuItem jMenuItemAnterioresBanco;
	protected JMenuItem jMenuItemSiguientesBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBanco;
	protected JMenuItem jMenuItemAbrirOrderByBanco;
	protected JMenuItem jMenuItemMostrarOcultarBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBanco;
	protected JCheckBox jCheckBoxSeleccionadosBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBanco;
	protected JCheckBox jCheckBoxConGraficoReporteBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBanco;
	protected JTextField jTextFieldValorCampoGeneralBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBanco;
	//public JList<Reporte> jListColumnasSelectReporteBanco;
	//public JScrollPane jScrollColumnasSelectReporteBanco;
	
	//public JLabel jLabelRelacionesSelectReporteBanco;
	//public JList<Reporte> jListRelacionesSelectReporteBanco;
	//public JScrollPane jScrollRelacionesSelectReporteBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoBanco;
	
		
	//public JLabel jLabelArchivoImportacionBanco;	
	//public JLabel jLabelPathArchivoImportacionBanco;
	//protected JTextField jTextFieldPathArchivoImportacionBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBanco;
	
	//public JLabel jLabelColumnaCategoriaValorBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBanco;
	
	//public JLabel jLabelColumnasValoresGraficoBanco;
	//public JList<Reporte> jListColumnasValoresGraficoBanco;
	//public JScrollPane jScrollColumnasValoresGraficoBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBanco;
	public JPanel jPanelBusquedaPorCodigoBanco;
	public JButton jButtonBusquedaPorCodigoBanco;
	public JPanel jPanelBusquedaPorCodigoInstitucionBanco;
	public JButton jButtonBusquedaPorCodigoInstitucionBanco;
	public JPanel jPanelBusquedaPorNombreBanco;
	public JButton jButtonBusquedaPorNombreBanco;
	public JPanel jPanelFK_IdTipoBancoBanco;
	public JButton jButtonFK_IdTipoBancoBanco;
	
	public JPanel jPanelcodigoBusquedaPorCodigoBanco;
	public JLabel jLabelcodigoBusquedaPorCodigoBanco;
	public JTextArea jTextAreacodigoBusquedaPorCodigoBanco;
	public JButton jButtoncodigoBusquedaPorCodigoBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigo_institucionBusquedaPorCodigoInstitucionBanco;
	public JLabel jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco;
	public JTextField jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco;
	public JButton jButtoncodigo_institucionBusquedaPorCodigoInstitucionBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreBanco;
	public JLabel jLabelnombreBusquedaPorNombreBanco;
	public JTextArea jTextAreanombreBusquedaPorNombreBanco;
	public JButton jButtonnombreBusquedaPorNombreBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_bancoFK_IdTipoBancoBanco;
	public JLabel jLabelid_tipo_bancoFK_IdTipoBancoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_bancoFK_IdTipoBancoBanco;
	public JButton jButtonid_tipo_bancoFK_IdTipoBancoBanco= new JButtonMe();
	public JButton jButtonid_tipo_bancoFK_IdTipoBancoBancoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_bancoFK_IdTipoBancoBancoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBanco)	{
		this.jButtonRecargarInformacionBanco = jButtonRecargarInformacionBanco;
	}
	
	public JButton getjButtonProcesarInformacionBanco() {
		return this.jButtonProcesarInformacionBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBanco)	{
		this.jButtonProcesarInformacionBanco = jButtonProcesarInformacionBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionBanco() {
		return this.jButtonRecargarInformacionBanco;
	}
	
	
	public List<Banco> getbancos() {
		return this.bancos;
	}

	public void setbancos(List<Banco> bancos) {
		this.bancos = bancos;
	}
	
	public List<Banco> getbancosAux() {
		return this.bancosAux;
	}

	public void setbancosAux(List<Banco> bancosAux) {
		this.bancosAux = bancosAux;
	}
	
	public List<Banco> getbancosEliminados() {
		return this.bancosEliminados;
	}

	public void setBancosEliminados(List<Banco> bancosEliminados) {
		this.bancosEliminados = bancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBanco() {
		return jComboBoxTiposSeleccionarBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBanco(
			JComboBox jComboBoxTiposSeleccionarBanco) {
		this.jComboBoxTiposSeleccionarBanco = jComboBoxTiposSeleccionarBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBanco() {
		return jTextFieldValorCampoGeneralBanco;
	}

	public void setjTextFieldValorCampoGeneralBanco(
			JTextField jTextFieldValorCampoGeneralBanco) {
		this.jTextFieldValorCampoGeneralBanco = jTextFieldValorCampoGeneralBanco;
	}

	public void setBorderResaltarValorCampoGeneralBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBanco() {
		return this.jCheckBoxSeleccionarTodosBanco;
	}

	public void setjCheckBoxSeleccionarTodosBanco(
			JCheckBox jCheckBoxSeleccionarTodosBanco) {
		this.jCheckBoxSeleccionarTodosBanco = jCheckBoxSeleccionarTodosBanco;
	}

	public void setBorderResaltarSeleccionarTodosBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBanco() {
		return this.jCheckBoxSeleccionadosBanco;
	}

	public void setjCheckBoxSeleccionadosBanco(
			JCheckBox jCheckBoxSeleccionadosBanco) {
		this.jCheckBoxSeleccionadosBanco = jCheckBoxSeleccionadosBanco;
	}
	
	public void setBorderResaltarSeleccionadosBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBanco() {
		return this.jComboBoxTiposArchivosReportesBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBanco(
			JComboBox jComboBoxTiposArchivosReportesBanco) {
		this.jComboBoxTiposArchivosReportesBanco = jComboBoxTiposArchivosReportesBanco;
	}

	public void setBorderResaltarTiposArchivosReportesBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBanco() {
		return this.jComboBoxTiposReportesBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBanco(
			JComboBox jComboBoxTiposReportesBanco) {
		this.jComboBoxTiposReportesBanco = jComboBoxTiposReportesBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBanco() {
	//	return jComboBoxTiposReportesDinamicoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoBanco) {
	//	this.jComboBoxTiposReportesDinamicoBanco = jComboBoxTiposReportesDinamicoBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBanco = jComboBoxTiposArchivosReportesDinamicoBanco;
	//}
	
	public void setBorderResaltarTiposReportesBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBanco() {
		return this.jComboBoxTiposGraficosReportesBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBanco(
			JComboBox jComboBoxTiposGraficosReportesBanco) {
		this.jComboBoxTiposGraficosReportesBanco = jComboBoxTiposGraficosReportesBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBanco() {
		return this.jComboBoxTiposPaginacionBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBanco(
			JComboBox jComboBoxTiposPaginacionBanco) {
		this.jComboBoxTiposPaginacionBanco = jComboBoxTiposPaginacionBanco;
	}
	
	public void setBorderResaltarTiposPaginacionBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBanco() {
		return this.jComboBoxTiposRelacionesBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBanco() {
		return this.jComboBoxTiposAccionesBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBanco(
			JComboBox jComboBoxTiposRelacionesBanco) {
		this.jComboBoxTiposRelacionesBanco = jComboBoxTiposRelacionesBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBanco(
			JComboBox jComboBoxTiposAccionesBanco) {
		this.jComboBoxTiposAccionesBanco = jComboBoxTiposAccionesBanco;
	}
	
	public void setBorderResaltarTiposRelacionesBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBanco() {
	//	return jCheckBoxConGraficoDinamicoBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoBanco) {
	//	this.jCheckBoxConGraficoDinamicoBanco = jCheckBoxConGraficoDinamicoBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBanco .setBorder(borderResaltar);		
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
		this.bancoSessionBean=new BancoSessionBean();
		
		this.bancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Banco MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
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
		
		BancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Banco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBanco,this.jTtoolBarBanco,
							"nuevo","nuevo","Nuevo"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBanco,this.jTtoolBarBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBanco,this.jTtoolBarBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBanco,this.jTtoolBarBanco,
							"duplicar","duplicar","Duplicar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBanco,this.jTtoolBarBanco,
							"copiar","copiar","Copiar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBanco,this.jTtoolBarBanco,
							"ver_form","ver_form","Ver"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBanco,this.jTtoolBarBanco,
							"recargar","recargar","Recargar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBanco,this.jTtoolBarBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBanco,this.jTtoolBarBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBanco,this.jTtoolBarBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBanco,this.jTtoolBarBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBanco,this.jTtoolBarBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBanco,this.jTtoolBarBanco,
							"cerrar","cerrar","Salir"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBanco;
			
				this.jButtonProcesarInformacionToolBarBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBanco;
				
		//protected JButton jButtonModificarToolBarBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBanco=new JMenuMe("General");
		this.jmenuArchivoBanco=new JMenuMe("Archivo");
		this.jmenuAccionesBanco=new JMenuMe("Acciones");
		this.jmenuDatosBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBanco.add(this.jMenuItemCerrarBanco);
			
			this.jmenuAccionesBanco.add(this.jMenuItemNuevoBanco);
			this.jmenuAccionesBanco.add(this.jMenuItemNuevoGuardarCambiosBanco);
			this.jmenuAccionesBanco.add(this.jMenuItemNuevoRelacionesBanco);
			this.jmenuAccionesBanco.add(this.jMenuItemGuardarCambiosTablaBanco);		
			this.jmenuAccionesBanco.add(this.jMenuItemDuplicarBanco);		
			this.jmenuAccionesBanco.add(this.jMenuItemCopiarBanco);		
			this.jmenuAccionesBanco.add(this.jMenuItemVerFormBanco);		
			
			this.jmenuDatosBanco.add(this.jMenuItemRecargarInformacionBanco);				
			this.jmenuDatosBanco.add(this.jMenuItemAnterioresBanco);				
			this.jmenuDatosBanco.add(this.jMenuItemSiguientesBanco);				
			this.jmenuDatosBanco.add(this.jMenuItemAbrirOrderByBanco);				
			this.jmenuDatosBanco.add(this.jMenuItemMostrarOcultarBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBanco.add(this.jMenuItemGuardarCambiosBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBanco.add(this.jmenuArchivoBanco);		
			this.jmenuBarBanco.add(this.jmenuAccionesBanco);		
			this.jmenuBarBanco.add(this.jmenuDatosBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoBanco.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoBanco= new JButtonMe();
		this.jButtonBusquedaPorCodigoBanco.setText("Buscar");
		this.jButtonBusquedaPorCodigoBanco.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoBanco,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoBanco = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoBanco.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoBanco.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoBanco= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorCodigoInstitucionBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoInstitucionBanco.setToolTipText("Buscar Por Codigo Institucion ");
		this.jButtonBusquedaPorCodigoInstitucionBanco= new JButtonMe();
		this.jButtonBusquedaPorCodigoInstitucionBanco.setText("Buscar");
		this.jButtonBusquedaPorCodigoInstitucionBanco.setToolTipText("Buscar Por Codigo Institucion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoInstitucionBanco,"buscar_button","Buscar Por Codigo Institucion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoInstitucionBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco = new JLabelMe();
		jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco.setText("Codigo Institucion :");
		jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco.setToolTipText("Codigo Institucion");
		jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco= new JTextFieldMe();
		jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreBanco.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreBanco= new JButtonMe();
		this.jButtonBusquedaPorNombreBanco.setText("Buscar");
		this.jButtonBusquedaPorNombreBanco.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreBanco,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreBanco = new JLabelMe();
		jLabelnombreBusquedaPorNombreBanco.setText("Nombre :");
		jLabelnombreBusquedaPorNombreBanco.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreBanco= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoBancoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoBancoBanco.setToolTipText("Buscar Por Tipo Banco Sri ");
		this.jButtonFK_IdTipoBancoBanco= new JButtonMe();
		this.jButtonFK_IdTipoBancoBanco.setText("Buscar");
		this.jButtonFK_IdTipoBancoBanco.setToolTipText("Buscar Por Tipo Banco Sri ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoBancoBanco,"buscar_button","Buscar Por Tipo Banco Sri ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoBancoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_bancoFK_IdTipoBancoBanco = new JLabelMe();
		jLabelid_tipo_bancoFK_IdTipoBancoBanco.setText("Tipo Banco Sri :");
		jLabelid_tipo_bancoFK_IdTipoBancoBanco.setToolTipText("Tipo Banco Sri");
		jLabelid_tipo_bancoFK_IdTipoBancoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_bancoFK_IdTipoBancoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_bancoFK_IdTipoBancoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_bancoFK_IdTipoBancoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_bancoFK_IdTipoBancoBanco= new JComboBoxMe();
		jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoFK_IdTipoBancoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBanco=new JTabbedPane();


		this.jTabbedPaneBusquedasBanco.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBanco.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBanco.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBanco,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBanco = new BancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Banco DATOS");
			this.jInternalFrameDetalleFormBanco = new BancoDetalleFormJInternalFrame(jDesktopPane,this.bancoSessionBean.getConGuardarRelaciones(),this.bancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBanco = null;//new BancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBanco= new GridBagLayout();
		
		
		this.jTableDatosBanco = new JTableMe();      
		
		String sToolTipBanco="";
		sToolTipBanco=BancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBanco+="(Tesoreria.Banco)";
		}
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBanco.setToolTipText(sToolTipBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBanco);
		this.jTableDatosBanco.setAutoCreateRowSorter(true);
		this.jTableDatosBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBanco.setRowSelectionAllowed(true);
		this.jTableDatosBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBanco = new JButtonMe();
		this.jButtonDuplicarBanco = new JButtonMe();
		this.jButtonCopiarBanco = new JButtonMe();
		this.jButtonVerFormBanco = new JButtonMe();
		this.jButtonNuevoRelacionesBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBanco = new JButtonMe();
		this.jButtonCerrarBanco = new JButtonMe();
		
		this.jScrollPanelDatosBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Banco";
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBanco.setToolTipText("Acciones");
        this.jPanelAccionesBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBanco=new ReporteDinamicoJInternalFrame(BancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBanco=new ImportacionJInternalFrame(BancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByBanco.setText("Orden");
		this.jButtonAbrirOrderByBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBanco,false,this);
			
			//this.cargarOrderByBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBanco,true,this);
			
			//this.cargarOrderByBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBanco.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosBanco.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosBanco.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBanco.setText("Nuevo");
		this.jButtonDuplicarBanco.setText("Duplicar");
		this.jButtonCopiarBanco.setText("Copiar");
		this.jButtonVerFormBanco.setText("Ver");
		this.jButtonNuevoRelacionesBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBanco.setText("Guardar");
		this.jButtonCerrarBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBanco,"nuevo_button","Nuevo",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBanco,"duplicar_button","Duplicar",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBanco,"copiar_button","Copiar",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBanco,"ver_form","Ver",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBanco,"nuevorelaciones_button","Nuevo Rel",this.bancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBanco,"guardarcambiostabla_button","Guardar",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBanco,"cerrar_button","Salir",this.bancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBanco.setToolTipText("Nuevo"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBanco.setToolTipText("Duplicar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBanco.setToolTipText("Copiar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBanco.setToolTipText("Ver"+" "+BancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBanco.setToolTipText("Nuevo Rel"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBanco.setToolTipText("Guardar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBanco.setToolTipText("Salir"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBanco";
		inputMap = this.jButtonNuevoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarBanco";
		inputMap = this.jButtonDuplicarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBanco"));
		
		//COPIAR
		sMapKey = "CopiarBanco";
		inputMap = this.jButtonCopiarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBanco"));
		
		//VEr FORM
		sMapKey = "VerFormBanco";
		inputMap = this.jButtonVerFormBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBanco";
		inputMap = this.jButtonNuevoRelacionesBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBanco";
		inputMap = this.jButtonModificarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBanco";
		inputMap = this.jButtonCerrarBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBanco";
		inputMap = this.jButtonGuardarCambiosTablaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Banco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Banco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Banco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Banco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Banco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBanco.setName("jPanelParametrosReportesBanco"); 
		
		this.jPanelParametrosReportesAccionesBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBanco.setName("jPanelParametrosReportesAccionesBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBanco = new JButtonMe();
		this.jButtonRecargarInformacionBanco.setText("Recargar");
		this.jButtonRecargarInformacionBanco.setToolTipText("Recargar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBanco = new JButtonMe();
		this.jButtonProcesarInformacionBanco.setText("Procesar");
		this.jButtonProcesarInformacionBanco.setToolTipText("Procesar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBanco.setVisible(false);
			
		this.jButtonProcesarInformacionBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBanco.setText("TIPO");       
		this.jComboBoxTiposReportesBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBanco.setText("Accion");
		this.jComboBoxTiposRelacionesBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBanco.setText("Accion");
		this.jComboBoxTiposAccionesBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBanco = new JLabelMe();
		
		this.jLabelAccionesBanco.setText("Acciones");		
		this.jLabelAccionesBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBanco = new JButtonMe();
		//this.jButtonAnterioresBanco.setText("<<");
        this.jButtonAnterioresBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBanco = new JButtonMe();
		//this.jButtonSiguientesBanco.setText(">>");
        this.jButtonSiguientesBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBanco,"nuevoguardarcambios_button","Nue",this.bancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBanco";
		inputMap = this.jButtonNuevoGuardarCambiosBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBanco";
		inputMap = this.jButtonRecargarInformacionBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBanco";
		inputMap = this.jButtonSiguientesBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBanco";
		inputMap = this.jButtonAnterioresBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBanco.setMinimumSize(new Dimension(this.getWidth(),BancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBanco.setMaximumSize(new Dimension(this.getWidth(),BancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBanco.setPreferredSize(new Dimension(this.getWidth(),BancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBanco = new GridBagLayout();

			this.jPanelPaginacionBanco.setLayout(gridaBagLayoutPaginacionBanco);						
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 0;
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBanco.add(this.jButtonAnterioresBanco, this.gridBagConstraintsBanco);
					
						
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBanco.gridy = 0;
			
			this.jPanelPaginacionBanco.add(this.jButtonNuevoGuardarCambiosBanco, this.gridBagConstraintsBanco);
						
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBanco.gridy = 0;
			this.jPanelPaginacionBanco.add(this.jButtonSiguientesBanco, this.gridBagConstraintsBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 1;
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBanco.add(this.jButtonNuevoBanco, this.gridBagConstraintsBanco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsBanco = new GridBagConstraints();
				this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBanco.gridy = 1;
				this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionBanco.add(this.jButtonNuevoRelacionesBanco, this.gridBagConstraintsBanco);
			}
			
			
			if(!this.bancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBanco = new GridBagConstraints();
				this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBanco.gridy = 1;
				this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBanco.add(this.jButtonGuardarCambiosTablaBanco, this.gridBagConstraintsBanco);
			}
			
			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 1;
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBanco.add(this.jButtonDuplicarBanco, this.gridBagConstraintsBanco);
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 1;
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBanco.add(this.jButtonCopiarBanco, this.gridBagConstraintsBanco);
		
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 1;
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBanco.add(this.jButtonVerFormBanco, this.gridBagConstraintsBanco);
		
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 1;
			this.gridBagConstraintsBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBanco.add(this.jButtonCerrarBanco, this.gridBagConstraintsBanco);
		
		
		
		this.jButtonRecargarInformacionBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Banco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Banco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Banco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Banco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBanco.setLayout(gridaBagParametrosReportesBanco);
			this.jPanelParametrosReportesAccionesBanco.setLayout(gridaBagParametrosReportesAccionesBanco);
			
			
			this.jPanelParametrosAuxiliar1Banco.setLayout(gridaBagParametrosAuxiliar1Banco);
			this.jPanelParametrosAuxiliar2Banco.setLayout(gridaBagParametrosAuxiliar2Banco);
			this.jPanelParametrosAuxiliar3Banco.setLayout(gridaBagParametrosAuxiliar3Banco);
			this.jPanelParametrosAuxiliar4Banco.setLayout(gridaBagParametrosAuxiliar4Banco);
			//this.jPanelParametrosAuxiliar5Banco.setLayout(gridaBagParametrosAuxiliar2Banco);			
			
			
			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBanco.add(this.jButtonRecargarInformacionBanco, this.gridBagConstraintsBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Banco.add(this.jComboBoxTiposPaginacionBanco, this.gridBagConstraintsBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Banco.add(this.jCheckBoxConAltoMaximoTablaBanco, this.gridBagConstraintsBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Banco.add(this.jComboBoxTiposArchivosReportesBanco, this.gridBagConstraintsBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBanco.add(this.jPanelParametrosAuxiliar1Banco, this.gridBagConstraintsBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Banco.add(this.jComboBoxTiposReportesBanco, this.gridBagConstraintsBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBanco.add(this.jPanelParametrosAuxiliar4Banco, this.gridBagConstraintsBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBanco.add(this.jComboBoxTiposReportesBanco, this.gridBagConstraintsBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBanco.add(this.jCheckBoxGenerarReporteBanco, this.gridBagConstraintsBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBanco.add(this.jPanelParametrosAuxiliar2Banco, this.gridBagConstraintsBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBanco.add(this.jLabelAccionesBanco, this.gridBagConstraintsBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBanco = new GridBagConstraints();
				this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBanco.add(this.jButtonAbrirOrderByBanco, this.gridBagConstraintsBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBanco.add(this.jComboBoxTiposSeleccionarBanco, this.gridBagConstraintsBanco);			
			
			
			/*
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBanco.add(this.jCheckBoxSeleccionarTodosBanco, this.gridBagConstraintsBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Banco.add(this.jCheckBoxSeleccionarTodosBanco, this.gridBagConstraintsBanco);															
				
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Banco.add(this.jCheckBoxSeleccionadosBanco, this.gridBagConstraintsBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBanco.add(this.jPanelParametrosAuxiliar3Banco, this.gridBagConstraintsBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBanco.add(this.jComboBoxTiposRelacionesBanco, this.gridBagConstraintsBanco);
				
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBanco.add(this.jComboBoxTiposAccionesBanco, this.gridBagConstraintsBanco);
	
				
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBanco.add(this.jTextFieldValorCampoGeneralBanco, this.gridBagConstraintsBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBanco = new GridBagLayout();

			this.jScrollPanelDatosBanco.setLayout(gridaBagLayoutDatosBanco);
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = 0;
			this.gridBagConstraintsBanco.gridx = 0;
			
			this.jScrollPanelDatosBanco.add(this.jTableDatosBanco, this.gridBagConstraintsBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBanco.setViewportView(this.jTableDatosBanco);
		this.jTableDatosBanco.setFillsViewportHeight(true);
		this.jTableDatosBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBanco= new GridBagLayout();
		this.jPanelAccionesBanco.setLayout(gridaBagLayoutAccionesBanco);
		
		
		/*	
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = 0;
		this.gridBagConstraintsBanco.gridx = 0;
			
		this.jPanelAccionesBanco.add(this.jButtonNuevoBanco, this.gridBagConstraintsBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoBanco.setLayout(gridaBagLayoutBusquedaPorCodigoBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 0;
		jPanelBusquedaPorCodigoBanco.add(jLabelcodigoBusquedaPorCodigoBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 1;
		jPanelBusquedaPorCodigoBanco.add(jTextAreacodigoBusquedaPorCodigoBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 1;
		gridBagConstraintsBanco.gridx =1;
		jPanelBusquedaPorCodigoBanco.add(jButtonBusquedaPorCodigoBanco, gridBagConstraintsBanco);

		jTabbedPaneBusquedasBanco.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoBanco);
		jTabbedPaneBusquedasBanco.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorCodigoInstitucionBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoInstitucionBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoInstitucionBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoInstitucionBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoInstitucionBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoInstitucionBanco.setLayout(gridaBagLayoutBusquedaPorCodigoInstitucionBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 0;
		jPanelBusquedaPorCodigoInstitucionBanco.add(jLabelcodigo_institucionBusquedaPorCodigoInstitucionBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 1;
		jPanelBusquedaPorCodigoInstitucionBanco.add(jTextFieldcodigo_institucionBusquedaPorCodigoInstitucionBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 1;
		gridBagConstraintsBanco.gridx =1;
		jPanelBusquedaPorCodigoInstitucionBanco.add(jButtonBusquedaPorCodigoInstitucionBanco, gridBagConstraintsBanco);

		jTabbedPaneBusquedasBanco.addTab("2.-Por Codigo Institucion ", jPanelBusquedaPorCodigoInstitucionBanco);
		jTabbedPaneBusquedasBanco.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreBanco.setLayout(gridaBagLayoutBusquedaPorNombreBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 0;
		jPanelBusquedaPorNombreBanco.add(jLabelnombreBusquedaPorNombreBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 1;
		jPanelBusquedaPorNombreBanco.add(jTextAreanombreBusquedaPorNombreBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 1;
		gridBagConstraintsBanco.gridx =1;
		jPanelBusquedaPorNombreBanco.add(jButtonBusquedaPorNombreBanco, gridBagConstraintsBanco);

		jTabbedPaneBusquedasBanco.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreBanco);
		jTabbedPaneBusquedasBanco.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoBancoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdTipoBancoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoBancoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoBancoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoBancoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoBancoBanco.setLayout(gridaBagLayoutFK_IdTipoBancoBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 0;
		jPanelFK_IdTipoBancoBanco.add(jLabelid_tipo_bancoFK_IdTipoBancoBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 0;
		gridBagConstraintsBanco.gridx = 1;
		jPanelFK_IdTipoBancoBanco.add(jComboBoxid_tipo_bancoFK_IdTipoBancoBanco, gridBagConstraintsBanco);

		gridBagConstraintsBanco = new GridBagConstraints();
		gridBagConstraintsBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBanco.gridy = 1;
		gridBagConstraintsBanco.gridx =1;
		jPanelFK_IdTipoBancoBanco.add(jButtonFK_IdTipoBancoBanco, gridBagConstraintsBanco);

		jTabbedPaneBusquedasBanco.addTab("4.-Por Tipo Banco Sri ", jPanelFK_IdTipoBancoBanco);
		jTabbedPaneBusquedasBanco.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBanco = new GridBagConstraints();						
			this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBanco.gridx = 0;		
			//this.gridBagConstraintsBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBanco, this.gridBagConstraintsBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBanco.gridx = 0;		
		//this.gridBagConstraintsBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBanco.gridx = 0;		
			this.gridBagConstraintsBanco.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBanco.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBanco, this.gridBagConstraintsBanco);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBanco, this.gridBagConstraintsBanco);								
		
		
		/*
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBanco, this.gridBagConstraintsBanco);
		*/		
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBanco.gridx =0;
		this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBanco, this.gridBagConstraintsBanco);
				
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBanco, this.gridBagConstraintsBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(BancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosBanco.setLayout(gridaBagLayoutBusquedasParametrosBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBanco, this.gridBagConstraintsBanco);
			
			
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBanco, this.gridBagConstraintsBanco);
		
			
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBanco, this.gridBagConstraintsBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBanco.setName("jPanelReporteDinamicoBanco"); 
		
		this.jPanelReporteDinamicoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBanco.setLayout(gridaBagLayoutReporteDinamicoBanco);
		
		
		this.jInternalFrameReporteDinamicoBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBanco.add(this.jLabelColumnasSelectReporteBanco, this.gridBagConstraintsBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBanco=new JScrollPane(this.jListColumnasSelectReporteBanco);
			
			this.jScrollColumnasSelectReporteBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBanco.add(this.jListColumnasSelectReporteBanco, this.gridBagConstraintsBanco);
		this.jPanelReporteDinamicoBanco.add(this.jScrollColumnasSelectReporteBanco, this.gridBagConstraintsBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBanco.add(this.jLabelRelacionesSelectReporteBanco, this.gridBagConstraintsBanco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBanco=new JScrollPane(this.jListRelacionesSelectReporteBanco);
			
			this.jScrollRelacionesSelectReporteBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBanco.add(this.jListRelacionesSelectReporteBanco, this.gridBagConstraintsBanco);
		this.jPanelReporteDinamicoBanco.add(this.jScrollRelacionesSelectReporteBanco, this.gridBagConstraintsBanco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBanco.add(this.jLabelGenerarExcelReporteDinamicoBanco, this.gridBagConstraintsBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBanco.setToolTipText("Generar EXCEL"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBanco = new GridBagConstraints();
		//this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBanco.add(this.jButtonGenerarExcelReporteDinamicoBanco, this.gridBagConstraintsBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBanco.add(this.jComboBoxTiposReportesDinamicoBanco, this.gridBagConstraintsBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBanco.add(this.jLabelTiposArchivoReporteDinamicoBanco, this.gridBagConstraintsBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBanco.add(this.jComboBoxTiposArchivosReportesDinamicoBanco, this.gridBagConstraintsBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBanco.setToolTipText("Generar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBanco.add(this.jButtonGenerarReporteDinamicoBanco, this.gridBagConstraintsBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBanco.setToolTipText("Cancelar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBanco.add(this.jButtonCerrarReporteDinamicoBanco, this.gridBagConstraintsBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBanco= new JScrollPane(jPanelReporteDinamicoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBanco);
		this.jInternalFrameReporteDinamicoBanco.getContentPane().add(this.jScrollPanelReporteDinamicoBanco, this.gridBagConstraintsBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBanco.setName("jPanelImportacionBanco"); 
		
		this.jPanelImportacionBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBanco.setLayout(gridaBagLayoutImportacionBanco);
		
		
		this.jInternalFrameImportacionBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBanco.setResizable(true);
	    this.jInternalFrameImportacionBanco.setClosable(true);
	    this.jInternalFrameImportacionBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBanco.setResizable(true);
	    this.jInternalFrameImportacionBanco.setClosable(true);
	    this.jInternalFrameImportacionBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBanco = new JLabelMe();

		this.jLabelArchivoImportacionBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBanco.add(this.jLabelArchivoImportacionBanco, this.gridBagConstraintsBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBanco = new JFileChooser();		
		this.jFileChooserImportacionBanco.setToolTipText("ESCOGER ARCHIVO"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBanco = new JButtonMe();
		this.jButtonAbrirImportacionBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBanco.setToolTipText("Generar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBanco.add(this.jButtonAbrirImportacionBanco, this.gridBagConstraintsBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBanco.add(this.jLabelPathArchivoImportacionBanco, this.gridBagConstraintsBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBanco.add(this.jTextFieldPathArchivoImportacionBanco, this.gridBagConstraintsBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBanco = new JButtonMe();
		this.jButtonGenerarImportacionBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBanco.setToolTipText("Generar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBanco.add(this.jButtonGenerarImportacionBanco, this.gridBagConstraintsBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBanco = new JButtonMe();
		this.jButtonCerrarImportacionBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBanco.setToolTipText("Cancelar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBanco.add(this.jButtonCerrarImportacionBanco, this.gridBagConstraintsBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionBanco= new JScrollPane(jPanelImportacionBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBanco = new GridBagConstraints();
		this.gridBagConstraintsBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBanco);
		this.jInternalFrameImportacionBanco.getContentPane().add(this.jScrollPanelImportacionBanco, this.gridBagConstraintsBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBanco = new JButtonMe();
			this.jButtonAbrirOrderByBanco.setText("Orden");
			this.jButtonAbrirOrderByBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBanco";
			inputMap = this.jButtonAbrirOrderByBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBanco.setName("jPanelOrderByBanco"); 
			
			this.jPanelOrderByBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBanco.setLayout(gridaBagLayoutOrderByBanco);
			
			
			this.jTableDatosBancoOrderBy = new JTableMe();        
			this.jTableDatosBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBancoOrderBy.setViewportView(this.jTableDatosBancoOrderBy);
			this.jTableDatosBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBanco.setTitle("Orden");
			this.jInternalFrameOrderByBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBanco.setResizable(true);
			this.jInternalFrameOrderByBanco.setClosable(true);
			this.jInternalFrameOrderByBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBanco.ipady =150;
				
			this.jPanelOrderByBanco.add(jScrollPanelDatosBancoOrderBy, this.gridBagConstraintsBanco);//this.jTableDatosBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBanco = new JButtonMe();
			this.jButtonCerrarOrderByBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBanco.setToolTipText("Cancelar"+" "+BancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBanco.add(this.jButtonCerrarOrderByBanco, this.gridBagConstraintsBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByBanco= new JScrollPane(jPanelOrderByBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBanco = new GridBagConstraints();
			this.gridBagConstraintsBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBanco);
			
			this.jInternalFrameOrderByBanco.getContentPane().add(this.jScrollPanelOrderByBanco, this.gridBagConstraintsBanco);			
		
		} else {
			this.jButtonAbrirOrderByBanco = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=700;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.bancoSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBanco.getRowHeight();//BancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBanco.isSelected()) {
					iHeightTable=BancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBanco.isSelected()) {
					iHeightTable=BancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBanco!=null && this.jInternalFrameOrderByBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.bancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bancoLogic.getBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Banco> TraerBancoBeans(List<Banco> bancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Banco banco:bancos) {
					
				if(!(BancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					banco.setsDetalleGeneralEntityReporte(BancoConstantesFunciones.getBancoDescripcion(banco));
										
						
					
					

					if(banco.getAutoriPagos()!=null && Funciones.existeClass(classes,AutoriPago.class)) {
						try{banco.setautoripagosDescripcionReporte(new JRBeanCollectionDataSource(AutoriPagoJInternalFrame.TraerAutoriPagoBeans(banco.getAutoriPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(banco.getTarjetaCreditos()!=null && Funciones.existeClass(classes,TarjetaCredito.class)) {
						try{banco.settarjetacreditosDescripcionReporte(new JRBeanCollectionDataSource(TarjetaCreditoJInternalFrame.TraerTarjetaCreditoBeans(banco.getTarjetaCreditos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(banco.getCuentaBancoPunVens()!=null && Funciones.existeClass(classes,CuentaBancoPunVen.class)) {
						try{banco.setcuentabancopunvensDescripcionReporte(new JRBeanCollectionDataSource(CuentaBancoPunVenJInternalFrame.TraerCuentaBancoPunVenBeans(banco.getCuentaBancoPunVens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(banco.getPoliticasClientes()!=null && Funciones.existeClass(classes,PoliticasCliente.class)) {
						try{banco.setpoliticasclientesDescripcionReporte(new JRBeanCollectionDataSource(PoliticasClienteJInternalFrame.TraerPoliticasClienteBeans(banco.getPoliticasClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(banco.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{banco.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(banco.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(banco.getCuentaBancos()!=null && Funciones.existeClass(classes,CuentaBanco.class)) {
						try{banco.setcuentabancosDescripcionReporte(new JRBeanCollectionDataSource(CuentaBancoJInternalFrame.TraerCuentaBancoBeans(banco.getCuentaBancos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(banco.getTipoCuentaBancoGenerals()!=null && Funciones.existeClass(classes,TipoCuentaBancoGeneral.class)) {
						try{banco.settipocuentabancogeneralsDescripcionReporte(new JRBeanCollectionDataSource(TipoCuentaBancoGeneralJInternalFrame.TraerTipoCuentaBancoGeneralBeans(banco.getTipoCuentaBancoGenerals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//banco.setsDetalleGeneralEntityReporte(banco.getsDetalleGeneralEntityReporte());
										
				}
				
				//bancobeans.add(bancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bancos;
    }
	//PARA REPORTES FIN
}
