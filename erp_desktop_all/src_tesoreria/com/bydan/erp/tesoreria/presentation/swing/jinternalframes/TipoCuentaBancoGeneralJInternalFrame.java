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

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.TipoCuentaBancoGeneralConstantesFunciones;

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
public class TipoCuentaBancoGeneralJInternalFrame extends TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCuentaBancoGeneral;
	
	protected JMenuBar jmenuBarTipoCuentaBancoGeneral;
	
	protected JMenu jmenuTipoCuentaBancoGeneral;
	protected JMenu jmenuDatosTipoCuentaBancoGeneral;
	protected JMenu jmenuArchivoTipoCuentaBancoGeneral;
	protected JMenu jmenuAccionesTipoCuentaBancoGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaBancoGeneral;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaBancoGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCuentaBancoGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCuentaBancoGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCuentaBancoGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabanco="";
	
	public TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoSessionBean tipocuentabancoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCuentaBancoGeneral> tipocuentabancogenerals;		
	public List<TipoCuentaBancoGeneral> tipocuentabancogeneralsEliminados;	
	public List<TipoCuentaBancoGeneral> tipocuentabancogeneralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCuentaBancoGeneral;		
	protected JButton jButtonAbrirOrderByTipoCuentaBancoGeneral;
	
	
	//protected JPanel jPanelOrderByTipoCuentaBancoGeneral;
	//public JScrollPane jScrollPanelOrderByTipoCuentaBancoGeneral;	
	//protected JButton jButtonCerrarOrderByTipoCuentaBancoGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCuentaBancoGeneral;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGeneral;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaBancoGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCuentaBancoGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCuentaBancoGeneral;
	//public JScrollPane jScrollPanelImportacionTipoCuentaBancoGeneral;
	
	
	
	protected JPanel jPanelAccionesTipoCuentaBancoGeneral;
	
    protected JPanel jPanelPaginacionTipoCuentaBancoGeneral;
    protected JPanel jPanelParametrosReportesTipoCuentaBancoGeneral;
	protected JPanel jPanelParametrosReportesAccionesTipoCuentaBancoGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCuentaBancoGeneral;
	protected JPanel jPanelParametrosAuxiliar2TipoCuentaBancoGeneral;
	protected JPanel jPanelParametrosAuxiliar3TipoCuentaBancoGeneral;
	protected JPanel jPanelParametrosAuxiliar4TipoCuentaBancoGeneral;
	//protected JPanel jPanelParametrosAuxiliar5TipoCuentaBancoGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCuentaBancoGeneral;
	//protected JPanel jPanelImportacionTipoCuentaBancoGeneral;
	
	
	public JTable jTableDatosTipoCuentaBancoGeneral;
	
	
	
	//public JTable jTableDatosTipoCuentaBancoGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCuentaBancoGeneral;
	protected JButton jButtonDuplicarTipoCuentaBancoGeneral;
	protected JButton jButtonCopiarTipoCuentaBancoGeneral;
	protected JButton jButtonVerFormTipoCuentaBancoGeneral;
	protected JButton jButtonNuevoRelacionesTipoCuentaBancoGeneral;
	protected JButton jButtonModificarTipoCuentaBancoGeneral;
	
    protected JButton jButtonGuardarCambiosTablaTipoCuentaBancoGeneral;
	protected JButton jButtonCerrarTipoCuentaBancoGeneral;
	
	
	protected JButton jButtonRecargarInformacionTipoCuentaBancoGeneral;
	protected JButton jButtonProcesarInformacionTipoCuentaBancoGeneral;
	
	
	protected JButton jButtonAnterioresTipoCuentaBancoGeneral;
	protected JButton jButtonSiguientesTipoCuentaBancoGeneral;
	protected JButton jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral;
	//protected JButton jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCuentaBancoGeneral;
	//protected JButton jButtonGenerarImportacionTipoCuentaBancoGeneral;
	//protected JButton jButtonCerrarImportacionTipoCuentaBancoGeneral;
	//protected JFileChooser jFileChooserImportacionTipoCuentaBancoGeneral;
	//protected File fileImportacionTipoCuentaBancoGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonDuplicarToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonCopiarToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonVerFormToolBarTipoCuentaBancoGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonCerrarToolBarTipoCuentaBancoGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonAnterioresToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonSiguientesToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonAbrirOrderByToolBarTipoCuentaBancoGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemDuplicarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCuentaBancoGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemCopiarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemVerFormTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemCerrarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemAnterioresTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemSiguientesTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemAbrirOrderByTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaBancoGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaBancoGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral;
	protected JCheckBox jCheckBoxSeleccionadosTipoCuentaBancoGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCuentaBancoGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCuentaBancoGeneral;
	protected JTextField jTextFieldValorCampoGeneralTipoCuentaBancoGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCuentaBancoGeneral;
	//public JList<Reporte> jListColumnasSelectReporteTipoCuentaBancoGeneral;
	//public JScrollPane jScrollColumnasSelectReporteTipoCuentaBancoGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCuentaBancoGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCuentaBancoGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCuentaBancoGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCuentaBancoGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral;
	
		
	//public JLabel jLabelArchivoImportacionTipoCuentaBancoGeneral;	
	//public JLabel jLabelPathArchivoImportacionTipoCuentaBancoGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCuentaBancoGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCuentaBancoGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCuentaBancoGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCuentaBancoGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCuentaBancoGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCuentaBancoGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCuentaBancoGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCuentaBancoGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCuentaBancoGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCuentaBancoGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCuentaBancoGeneral;
	public JPanel jPanelFK_IdBancoTipoCuentaBancoGeneral;
	public JButton jButtonFK_IdBancoTipoCuentaBancoGeneral;
	public JPanel jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral;
	public JButton jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral;
	
	public JPanel jPanelid_bancoFK_IdBancoTipoCuentaBancoGeneral;
	public JLabel jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral;
	public JButton jButtonid_bancoFK_IdBancoTipoCuentaBancoGeneral= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoTipoCuentaBancoGeneralUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral;
	public JLabel jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral;
	public JButton jButtonid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoCuentaBancoGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCuentaBancoGeneral)	{
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral = jButtonRecargarInformacionTipoCuentaBancoGeneral;
	}
	
	public JButton getjButtonProcesarInformacionTipoCuentaBancoGeneral() {
		return this.jButtonProcesarInformacionTipoCuentaBancoGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaBancoGeneral)	{
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral = jButtonProcesarInformacionTipoCuentaBancoGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCuentaBancoGeneral() {
		return this.jButtonRecargarInformacionTipoCuentaBancoGeneral;
	}
	
	
	public List<TipoCuentaBancoGeneral> gettipocuentabancogenerals() {
		return this.tipocuentabancogenerals;
	}

	public void settipocuentabancogenerals(List<TipoCuentaBancoGeneral> tipocuentabancogenerals) {
		this.tipocuentabancogenerals = tipocuentabancogenerals;
	}
	
	public List<TipoCuentaBancoGeneral> gettipocuentabancogeneralsAux() {
		return this.tipocuentabancogeneralsAux;
	}

	public void settipocuentabancogeneralsAux(List<TipoCuentaBancoGeneral> tipocuentabancogeneralsAux) {
		this.tipocuentabancogeneralsAux = tipocuentabancogeneralsAux;
	}
	
	public List<TipoCuentaBancoGeneral> gettipocuentabancogeneralsEliminados() {
		return this.tipocuentabancogeneralsEliminados;
	}

	public void setTipoCuentaBancoGeneralsEliminados(List<TipoCuentaBancoGeneral> tipocuentabancogeneralsEliminados) {
		this.tipocuentabancogeneralsEliminados = tipocuentabancogeneralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCuentaBancoGeneral() {
		return jComboBoxTiposSeleccionarTipoCuentaBancoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposSeleccionarTipoCuentaBancoGeneral) {
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral = jComboBoxTiposSeleccionarTipoCuentaBancoGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCuentaBancoGeneral() {
		return jTextFieldValorCampoGeneralTipoCuentaBancoGeneral;
	}

	public void setjTextFieldValorCampoGeneralTipoCuentaBancoGeneral(
			JTextField jTextFieldValorCampoGeneralTipoCuentaBancoGeneral) {
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral = jTextFieldValorCampoGeneralTipoCuentaBancoGeneral;
	}

	public void setBorderResaltarValorCampoGeneralTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCuentaBancoGeneral() {
		return this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral;
	}

	public void setjCheckBoxSeleccionarTodosTipoCuentaBancoGeneral(
			JCheckBox jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral) {
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral = jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral;
	}

	public void setBorderResaltarSeleccionarTodosTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCuentaBancoGeneral() {
		return this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral;
	}

	public void setjCheckBoxSeleccionadosTipoCuentaBancoGeneral(
			JCheckBox jCheckBoxSeleccionadosTipoCuentaBancoGeneral) {
		this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral = jCheckBoxSeleccionadosTipoCuentaBancoGeneral;
	}
	
	public void setBorderResaltarSeleccionadosTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral = jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposReportesTipoCuentaBancoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposReportesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral = jComboBoxTiposReportesTipoCuentaBancoGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral() {
	//	return jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral) {
	//	this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral = jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral = jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral;
	//}
	
	public void setBorderResaltarTiposReportesTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral = jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposPaginacionTipoCuentaBancoGeneral) {
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral = jComboBoxTiposPaginacionTipoCuentaBancoGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposAccionesTipoCuentaBancoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral = jComboBoxTiposRelacionesTipoCuentaBancoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposAccionesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral = jComboBoxTiposAccionesTipoCuentaBancoGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCuentaBancoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral() {
	//	return jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral) {
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral = jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCuentaBancoGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCuentaBancoGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral .setBorder(borderResaltar);		
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
		this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		
		this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaBancoGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Banco General MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCuentaBancoGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"nuevo","nuevo","Nuevo"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"duplicar","duplicar","Duplicar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"copiar","copiar","Copiar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"ver_form","ver_form","Ver"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"recargar","recargar","Recargar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,
							"cerrar","cerrar","Salir"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral;
			
				this.jButtonProcesarInformacionToolBarTipoCuentaBancoGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCuentaBancoGeneral;
				
		//protected JButton jButtonModificarToolBarTipoCuentaBancoGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCuentaBancoGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCuentaBancoGeneral=new JMenuMe("General");
		this.jmenuArchivoTipoCuentaBancoGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCuentaBancoGeneral=new JMenuMe("Acciones");
		this.jmenuDatosTipoCuentaBancoGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaBancoGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaBancoGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaBancoGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCuentaBancoGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCuentaBancoGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCuentaBancoGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCuentaBancoGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCuentaBancoGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCuentaBancoGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCuentaBancoGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCuentaBancoGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCuentaBancoGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaBancoGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaBancoGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaBancoGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCuentaBancoGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCuentaBancoGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCuentaBancoGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCuentaBancoGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCuentaBancoGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCuentaBancoGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCuentaBancoGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCuentaBancoGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCuentaBancoGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCuentaBancoGeneral.add(this.jMenuItemCerrarTipoCuentaBancoGeneral);
			
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemNuevoTipoCuentaBancoGeneral);
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral);
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral);
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral);		
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemDuplicarTipoCuentaBancoGeneral);		
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemCopiarTipoCuentaBancoGeneral);		
			this.jmenuAccionesTipoCuentaBancoGeneral.add(this.jMenuItemVerFormTipoCuentaBancoGeneral);		
			
			this.jmenuDatosTipoCuentaBancoGeneral.add(this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral);				
			this.jmenuDatosTipoCuentaBancoGeneral.add(this.jMenuItemAnterioresTipoCuentaBancoGeneral);				
			this.jmenuDatosTipoCuentaBancoGeneral.add(this.jMenuItemSiguientesTipoCuentaBancoGeneral);				
			this.jmenuDatosTipoCuentaBancoGeneral.add(this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral);				
			this.jmenuDatosTipoCuentaBancoGeneral.add(this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCuentaBancoGeneral.add(this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCuentaBancoGeneral.add(this.jmenuArchivoTipoCuentaBancoGeneral);		
			this.jmenuBarTipoCuentaBancoGeneral.add(this.jmenuAccionesTipoCuentaBancoGeneral);		
			this.jmenuBarTipoCuentaBancoGeneral.add(this.jmenuDatosTipoCuentaBancoGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCuentaBancoGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCuentaBancoGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoTipoCuentaBancoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoTipoCuentaBancoGeneral.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoTipoCuentaBancoGeneral= new JButtonMe();
		this.jButtonFK_IdBancoTipoCuentaBancoGeneral.setText("Buscar");
		this.jButtonFK_IdBancoTipoCuentaBancoGeneral.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoTipoCuentaBancoGeneral,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral = new JLabelMe();
		jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral.setText("Banco :");
		jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setToolTipText("Buscar Por Tipo Cuenta Banco ");
		this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setToolTipText("Buscar Por Tipo Cuenta Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral,"buscar_button","Buscar Por Tipo Cuenta Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral = new JLabelMe();
		jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setText("Tipo Cuenta Banco :");
		jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setToolTipText("Tipo Cuenta Banco");
		jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCuentaBancoGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCuentaBancoGeneral = new TipoCuentaBancoGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cuenta Banco General DATOS");
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral = new TipoCuentaBancoGeneralDetalleFormJInternalFrame(jDesktopPane,this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral = null;//new TipoCuentaBancoGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaBancoGeneral= new GridBagLayout();
		
		
		this.jTableDatosTipoCuentaBancoGeneral = new JTableMe();      
		
		String sToolTipTipoCuentaBancoGeneral="";
		sToolTipTipoCuentaBancoGeneral=TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaBancoGeneral+="(Tesoreria.TipoCuentaBancoGeneral)";
		}
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaBancoGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCuentaBancoGeneral.setToolTipText(sToolTipTipoCuentaBancoGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCuentaBancoGeneral);
		this.jTableDatosTipoCuentaBancoGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCuentaBancoGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionAllowed(true);
		this.jTableDatosTipoCuentaBancoGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonDuplicarTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonCopiarTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonVerFormTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonCerrarTipoCuentaBancoGeneral = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaBancoGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Banco General";
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaBancoGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaBancoGeneral.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaBancoGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral=new ReporteDinamicoJInternalFrame(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCuentaBancoGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCuentaBancoGeneral=new ImportacionJInternalFrame(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCuentaBancoGeneral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCuentaBancoGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCuentaBancoGeneral.setText("Orden");
		this.jButtonAbrirOrderByTipoCuentaBancoGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaBancoGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaBancoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGeneral,false,this);
			
			//this.cargarOrderByTipoCuentaBancoGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaBancoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGeneral,true,this);
			
			//this.cargarOrderByTipoCuentaBancoGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCuentaBancoGeneral.setText("Nuevo");
		this.jButtonDuplicarTipoCuentaBancoGeneral.setText("Duplicar");
		this.jButtonCopiarTipoCuentaBancoGeneral.setText("Copiar");
		this.jButtonVerFormTipoCuentaBancoGeneral.setText("Ver");
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.setText("Guardar");
		this.jButtonCerrarTipoCuentaBancoGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaBancoGeneral,"nuevo_button","Nuevo",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCuentaBancoGeneral,"duplicar_button","Duplicar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCuentaBancoGeneral,"copiar_button","Copiar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCuentaBancoGeneral,"ver_form","Ver",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCuentaBancoGeneral,"nuevorelaciones_button","Nuevo Rel",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral,"guardarcambiostabla_button","Guardar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaBancoGeneral,"cerrar_button","Salir",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCuentaBancoGeneral.setToolTipText("Nuevo"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCuentaBancoGeneral.setToolTipText("Duplicar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCuentaBancoGeneral.setToolTipText("Copiar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCuentaBancoGeneral.setToolTipText("Ver"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.setToolTipText("Nuevo Rel"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.setToolTipText("Guardar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaBancoGeneral.setToolTipText("Salir"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaBancoGeneral";
		inputMap = this.jButtonNuevoTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaBancoGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCuentaBancoGeneral";
		inputMap = this.jButtonDuplicarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCuentaBancoGeneral"));
		
		//COPIAR
		sMapKey = "CopiarTipoCuentaBancoGeneral";
		inputMap = this.jButtonCopiarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCuentaBancoGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCuentaBancoGeneral";
		inputMap = this.jButtonVerFormTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCuentaBancoGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCuentaBancoGeneral";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCuentaBancoGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCuentaBancoGeneral";
		inputMap = this.jButtonModificarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCuentaBancoGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaBancoGeneral";
		inputMap = this.jButtonCerrarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaBancoGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaBancoGeneral";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaBancoGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCuentaBancoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCuentaBancoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCuentaBancoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCuentaBancoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCuentaBancoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCuentaBancoGeneral.setName("jPanelParametrosReportesTipoCuentaBancoGeneral"); 
		
		this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral.setName("jPanelParametrosReportesAccionesTipoCuentaBancoGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.setText("Recargar");
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.setToolTipText("Recargar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCuentaBancoGeneral,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral.setText("Procesar");
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral.setToolTipText("Procesar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCuentaBancoGeneral = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaBancoGeneral.setText("Acciones");		
		this.jLabelAccionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCuentaBancoGeneral = new JButtonMe();
		//this.jButtonAnterioresTipoCuentaBancoGeneral.setText("<<");
        this.jButtonAnterioresTipoCuentaBancoGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCuentaBancoGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCuentaBancoGeneral = new JButtonMe();
		//this.jButtonSiguientesTipoCuentaBancoGeneral.setText(">>");
        this.jButtonSiguientesTipoCuentaBancoGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCuentaBancoGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral,"nuevoguardarcambios_button","Nue",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCuentaBancoGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCuentaBancoGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCuentaBancoGeneral";
		inputMap = this.jButtonRecargarInformacionTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCuentaBancoGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCuentaBancoGeneral";
		inputMap = this.jButtonSiguientesTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCuentaBancoGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCuentaBancoGeneral";
		inputMap = this.jButtonAnterioresTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCuentaBancoGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCuentaBancoGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(this.getWidth(),TipoCuentaBancoGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(this.getWidth(),TipoCuentaBancoGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(this.getWidth(),TipoCuentaBancoGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCuentaBancoGeneral = new GridBagLayout();

			this.jPanelPaginacionTipoCuentaBancoGeneral.setLayout(gridaBagLayoutPaginacionTipoCuentaBancoGeneral);						
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonAnterioresTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
					
						
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
			
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
						
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonSiguientesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonNuevoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
						
			
			
			if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
				this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			}
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonDuplicarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonCopiarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonVerFormTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCuentaBancoGeneral.add(this.jButtonCerrarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
		
		
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCuentaBancoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCuentaBancoGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCuentaBancoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCuentaBancoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCuentaBancoGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCuentaBancoGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.setLayout(gridaBagParametrosReportesTipoCuentaBancoGeneral);
			this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral.setLayout(gridaBagParametrosReportesAccionesTipoCuentaBancoGeneral);
			
			
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGeneral.setLayout(gridaBagParametrosAuxiliar1TipoCuentaBancoGeneral);
			this.jPanelParametrosAuxiliar2TipoCuentaBancoGeneral.setLayout(gridaBagParametrosAuxiliar2TipoCuentaBancoGeneral);
			this.jPanelParametrosAuxiliar3TipoCuentaBancoGeneral.setLayout(gridaBagParametrosAuxiliar3TipoCuentaBancoGeneral);
			this.jPanelParametrosAuxiliar4TipoCuentaBancoGeneral.setLayout(gridaBagParametrosAuxiliar4TipoCuentaBancoGeneral);
			//this.jPanelParametrosAuxiliar5TipoCuentaBancoGeneral.setLayout(gridaBagParametrosAuxiliar2TipoCuentaBancoGeneral);			
			
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jButtonRecargarInformacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGeneral.add(this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGeneral.add(this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGeneral.add(this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jPanelParametrosAuxiliar1TipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCuentaBancoGeneral.add(this.jComboBoxTiposReportesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jPanelParametrosAuxiliar4TipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jComboBoxTiposReportesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jCheckBoxGenerarReporteTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jPanelParametrosAuxiliar2TipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jLabelAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jButtonAbrirOrderByTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
			
			
			/*
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaBancoGeneral.add(this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);															
				
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaBancoGeneral.add(this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jPanelParametrosAuxiliar3TipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jComboBoxTiposAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
	
				
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.add(this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCuentaBancoGeneral = new GridBagLayout();

			this.jScrollPanelDatosTipoCuentaBancoGeneral.setLayout(gridaBagLayoutDatosTipoCuentaBancoGeneral);
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
			
			this.jScrollPanelDatosTipoCuentaBancoGeneral.add(this.jTableDatosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setViewportView(this.jTableDatosTipoCuentaBancoGeneral);
		this.jTableDatosTipoCuentaBancoGeneral.setFillsViewportHeight(true);
		this.jTableDatosTipoCuentaBancoGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaBancoGeneral= new GridBagLayout();
		this.jPanelAccionesTipoCuentaBancoGeneral.setLayout(gridaBagLayoutAccionesTipoCuentaBancoGeneral);
		
		
		/*	
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
			
		this.jPanelAccionesTipoCuentaBancoGeneral.add(this.jButtonNuevoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoTipoCuentaBancoGeneral= new GridBagLayout();
		gridaBagLayoutFK_IdBancoTipoCuentaBancoGeneral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoTipoCuentaBancoGeneral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoTipoCuentaBancoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoTipoCuentaBancoGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoTipoCuentaBancoGeneral.setLayout(gridaBagLayoutFK_IdBancoTipoCuentaBancoGeneral);

		gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
		jPanelFK_IdBancoTipoCuentaBancoGeneral.add(jLabelid_bancoFK_IdBancoTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);

		gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
		jPanelFK_IdBancoTipoCuentaBancoGeneral.add(jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);

		gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
		gridBagConstraintsTipoCuentaBancoGeneral.gridx =1;
		jPanelFK_IdBancoTipoCuentaBancoGeneral.add(jButtonFK_IdBancoTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);

		jTabbedPaneBusquedasTipoCuentaBancoGeneral.addTab("1.-Por Banco ", jPanelFK_IdBancoTipoCuentaBancoGeneral);
		jTabbedPaneBusquedasTipoCuentaBancoGeneral.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoTipoCuentaBancoGeneral= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);

		gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
		jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.add(jLabelid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);

		gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
		jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.add(jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);

		gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaBancoGeneral.gridy = 1;
		gridBagConstraintsTipoCuentaBancoGeneral.gridx =1;
		jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.add(jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);

		jTabbedPaneBusquedasTipoCuentaBancoGeneral.addTab("2.-Por Tipo Cuenta Banco ", jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
		jTabbedPaneBusquedasTipoCuentaBancoGeneral.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaBancoGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaBancoGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaBancoGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;		
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCuentaBancoGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);								
		
		
		/*
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		*/		
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaBancoGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
				
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCuentaBancoGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaBancoGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCuentaBancoGeneral.setLayout(gridaBagLayoutBusquedasParametrosTipoCuentaBancoGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
			
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
			
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCuentaBancoGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCuentaBancoGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.setName("jPanelReporteDinamicoTipoCuentaBancoGeneral"); 
		
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.setLayout(gridaBagLayoutReporteDinamicoTipoCuentaBancoGeneral);
		
		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Generales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCuentaBancoGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCuentaBancoGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jLabelColumnasSelectReporteTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCuentaBancoGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCuentaBancoGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCuentaBancoGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral=new JScrollPane(this.jListColumnasSelectReporteTipoCuentaBancoGeneral);
			
			this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jListColumnasSelectReporteTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCuentaBancoGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCuentaBancoGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCuentaBancoGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCuentaBancoGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGeneral=new JScrollPane(this.jListRelacionesSelectReporteTipoCuentaBancoGeneral);
			
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCuentaBancoGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCuentaBancoGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCuentaBancoGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.setToolTipText("Generar EXCEL"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral.setToolTipText("Generar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral.setToolTipText("Cancelar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGeneral.add(this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCuentaBancoGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral= new JScrollPane(jPanelReporteDinamicoTipoCuentaBancoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Generales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCuentaBancoGeneral);
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCuentaBancoGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCuentaBancoGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCuentaBancoGeneral.setName("jPanelImportacionTipoCuentaBancoGeneral"); 
		
		this.jPanelImportacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCuentaBancoGeneral.setLayout(gridaBagLayoutImportacionTipoCuentaBancoGeneral);
		
		
		this.jInternalFrameImportacionTipoCuentaBancoGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCuentaBancoGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCuentaBancoGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Generales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCuentaBancoGeneral = new JLabelMe();

		this.jLabelArchivoImportacionTipoCuentaBancoGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaBancoGeneral.add(this.jLabelArchivoImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCuentaBancoGeneral = new JFileChooser();		
		this.jFileChooserImportacionTipoCuentaBancoGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonAbrirImportacionTipoCuentaBancoGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCuentaBancoGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCuentaBancoGeneral.setToolTipText("Generar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGeneral.add(this.jButtonAbrirImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCuentaBancoGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCuentaBancoGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaBancoGeneral.add(this.jLabelPathArchivoImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGeneral.add(this.jTextFieldPathArchivoImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonGenerarImportacionTipoCuentaBancoGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCuentaBancoGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCuentaBancoGeneral.setToolTipText("Generar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGeneral.add(this.jButtonGenerarImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonCerrarImportacionTipoCuentaBancoGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCuentaBancoGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCuentaBancoGeneral.setToolTipText("Cancelar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGeneral.add(this.jButtonCerrarImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCuentaBancoGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCuentaBancoGeneral= new JScrollPane(jPanelImportacionTipoCuentaBancoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCuentaBancoGeneral);
		this.jInternalFrameImportacionTipoCuentaBancoGeneral.getContentPane().add(this.jScrollPanelImportacionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCuentaBancoGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral = new JButtonMe();
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral.setText("Orden");
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaBancoGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCuentaBancoGeneral";
			inputMap = this.jButtonAbrirOrderByTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCuentaBancoGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCuentaBancoGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCuentaBancoGeneral.setName("jPanelOrderByTipoCuentaBancoGeneral"); 
			
			this.jPanelOrderByTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCuentaBancoGeneral.setLayout(gridaBagLayoutOrderByTipoCuentaBancoGeneral);
			
			
			this.jTableDatosTipoCuentaBancoGeneralOrderBy = new JTableMe();        
			this.jTableDatosTipoCuentaBancoGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCuentaBancoGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCuentaBancoGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCuentaBancoGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCuentaBancoGeneralOrderBy.setViewportView(this.jTableDatosTipoCuentaBancoGeneralOrderBy);
			this.jTableDatosTipoCuentaBancoGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCuentaBancoGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCuentaBancoGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCuentaBancoGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCuentaBancoGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCuentaBancoGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setTitle("Orden");
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setResizable(true);
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setClosable(true);
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Generales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCuentaBancoGeneral.ipady =150;
				
			this.jPanelOrderByTipoCuentaBancoGeneral.add(jScrollPanelDatosTipoCuentaBancoGeneralOrderBy, this.gridBagConstraintsTipoCuentaBancoGeneral);//this.jTableDatosTipoCuentaBancoGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCuentaBancoGeneral = new JButtonMe();
			this.jButtonCerrarOrderByTipoCuentaBancoGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCuentaBancoGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCuentaBancoGeneral.setToolTipText("Cancelar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCuentaBancoGeneral.add(this.jButtonCerrarOrderByTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCuentaBancoGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCuentaBancoGeneral= new JScrollPane(jPanelOrderByTipoCuentaBancoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCuentaBancoGeneral);
			
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getContentPane().add(this.jScrollPanelOrderByTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
		
		} else {
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCuentaBancoGeneral.getRowHeight();//TipoCuentaBancoGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.isSelected()) {
					iHeightTable=TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGeneral.isSelected()) {
					iHeightTable=TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaBancoGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCuentaBancoGeneral!=null && this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancogenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCuentaBancoGeneral> TraerTipoCuentaBancoGeneralBeans(List<TipoCuentaBancoGeneral> tipocuentabancogenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogenerals) {
					
				if(!(TipoCuentaBancoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCuentaBancoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocuentabancogeneral.setsDetalleGeneralEntityReporte(TipoCuentaBancoGeneralConstantesFunciones.getTipoCuentaBancoGeneralDescripcion(tipocuentabancogeneral));
										
						
					
						
					
				} else  {
							
					//tipocuentabancogeneral.setsDetalleGeneralEntityReporte(tipocuentabancogeneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocuentabancogeneralbeans.add(tipocuentabancogeneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocuentabancogenerals;
    }
	//PARA REPORTES FIN
}
