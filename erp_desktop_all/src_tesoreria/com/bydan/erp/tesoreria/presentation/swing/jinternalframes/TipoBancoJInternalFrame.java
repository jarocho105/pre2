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
import com.bydan.erp.tesoreria.util.TipoBancoConstantesFunciones;

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
public class TipoBancoJInternalFrame extends TipoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoBanco;
	
	protected JMenuBar jmenuBarTipoBanco;
	
	protected JMenu jmenuTipoBanco;
	protected JMenu jmenuDatosTipoBanco;
	protected JMenu jmenuArchivoTipoBanco;
	protected JMenu jmenuAccionesTipoBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBanco;	
	protected GridBagConstraints gridBagConstraintsTipoBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoBancoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBancoSessionBean tipobancoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoBanco> tipobancos;		
	public List<TipoBanco> tipobancosEliminados;	
	public List<TipoBanco> tipobancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoBanco;		
	protected JButton jButtonAbrirOrderByTipoBanco;
	
	
	//protected JPanel jPanelOrderByTipoBanco;
	//public JScrollPane jScrollPanelOrderByTipoBanco;	
	//protected JButton jButtonCerrarOrderByTipoBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoBancoLogic tipobancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoBanco;
	//public JScrollPane jScrollPanelImportacionTipoBanco;
	
	
	
	protected JPanel jPanelAccionesTipoBanco;
	
    protected JPanel jPanelPaginacionTipoBanco;
    protected JPanel jPanelParametrosReportesTipoBanco;
	protected JPanel jPanelParametrosReportesAccionesTipoBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoBanco;
	protected JPanel jPanelParametrosAuxiliar2TipoBanco;
	protected JPanel jPanelParametrosAuxiliar3TipoBanco;
	protected JPanel jPanelParametrosAuxiliar4TipoBanco;
	//protected JPanel jPanelParametrosAuxiliar5TipoBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoBanco;
	//protected JPanel jPanelImportacionTipoBanco;
	
	
	public JTable jTableDatosTipoBanco;
	
	
	
	//public JTable jTableDatosTipoBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoBanco;
	protected JButton jButtonDuplicarTipoBanco;
	protected JButton jButtonCopiarTipoBanco;
	protected JButton jButtonVerFormTipoBanco;
	protected JButton jButtonNuevoRelacionesTipoBanco;
	protected JButton jButtonModificarTipoBanco;
	
    protected JButton jButtonGuardarCambiosTablaTipoBanco;
	protected JButton jButtonCerrarTipoBanco;
	
	
	protected JButton jButtonRecargarInformacionTipoBanco;
	protected JButton jButtonProcesarInformacionTipoBanco;
	
	
	protected JButton jButtonAnterioresTipoBanco;
	protected JButton jButtonSiguientesTipoBanco;
	protected JButton jButtonNuevoGuardarCambiosTipoBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoBanco;
	//protected JButton jButtonCerrarReporteDinamicoTipoBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoBanco;
	//protected JButton jButtonGenerarImportacionTipoBanco;
	//protected JButton jButtonCerrarImportacionTipoBanco;
	//protected JFileChooser jFileChooserImportacionTipoBanco;
	//protected File fileImportacionTipoBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBanco;
	protected JButton jButtonDuplicarToolBarTipoBanco;
	protected JButton jButtonNuevoRelacionesToolBarTipoBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoBanco;
	protected JButton jButtonCopiarToolBarTipoBanco;
	protected JButton jButtonVerFormToolBarTipoBanco;
	public JButton jButtonGuardarCambiosTablaToolBarTipoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBanco;
	protected JButton jButtonCerrarToolBarTipoBanco;
	
	protected JButton jButtonRecargarInformacionToolBarTipoBanco;
	protected JButton jButtonProcesarInformacionToolBarTipoBanco;
	protected JButton jButtonAnterioresToolBarTipoBanco;
	protected JButton jButtonSiguientesToolBarTipoBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoBanco;
	protected JButton jButtonAbrirOrderByToolBarTipoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBanco;
	protected JMenuItem jMenuItemDuplicarTipoBanco;
	protected JMenuItem jMenuItemNuevoRelacionesTipoBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoBanco;
	protected JMenuItem jMenuItemCopiarTipoBanco;
	protected JMenuItem jMenuItemVerFormTipoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBanco;
	protected JMenuItem jMenuItemCerrarTipoBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoBanco;
	protected JMenuItem jMenuItemProcesarInformacionTipoBanco;
	protected JMenuItem jMenuItemAnterioresTipoBanco;
	protected JMenuItem jMenuItemSiguientesTipoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBanco;
	protected JMenuItem jMenuItemAbrirOrderByTipoBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoBanco;
	protected JCheckBox jCheckBoxSeleccionadosTipoBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoBanco;
	protected JCheckBox jCheckBoxConGraficoReporteTipoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoBanco;
	protected JTextField jTextFieldValorCampoGeneralTipoBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoBanco;
	//public JList<Reporte> jListColumnasSelectReporteTipoBanco;
	//public JScrollPane jScrollColumnasSelectReporteTipoBanco;
	
	//public JLabel jLabelRelacionesSelectReporteTipoBanco;
	//public JList<Reporte> jListRelacionesSelectReporteTipoBanco;
	//public JScrollPane jScrollRelacionesSelectReporteTipoBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoBanco;
	
		
	//public JLabel jLabelArchivoImportacionTipoBanco;	
	//public JLabel jLabelPathArchivoImportacionTipoBanco;
	//protected JTextField jTextFieldPathArchivoImportacionTipoBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoBanco;
	
	//public JLabel jLabelColumnaCategoriaValorTipoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoBanco;
	
	//public JLabel jLabelColumnasValoresGraficoTipoBanco;
	//public JList<Reporte> jListColumnasValoresGraficoTipoBanco;
	//public JScrollPane jScrollColumnasValoresGraficoTipoBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoBanco;
	public JPanel jPanelBusquedaPorNombreTipoBanco;
	public JButton jButtonBusquedaPorNombreTipoBanco;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoBanco;
	public JLabel jLabelnombreBusquedaPorNombreTipoBanco;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoBanco;
	public JButton jButtonnombreBusquedaPorNombreTipoBancoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoBanco)	{
		this.jButtonRecargarInformacionTipoBanco = jButtonRecargarInformacionTipoBanco;
	}
	
	public JButton getjButtonProcesarInformacionTipoBanco() {
		return this.jButtonProcesarInformacionTipoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBanco)	{
		this.jButtonProcesarInformacionTipoBanco = jButtonProcesarInformacionTipoBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoBanco() {
		return this.jButtonRecargarInformacionTipoBanco;
	}
	
	
	public List<TipoBanco> gettipobancos() {
		return this.tipobancos;
	}

	public void settipobancos(List<TipoBanco> tipobancos) {
		this.tipobancos = tipobancos;
	}
	
	public List<TipoBanco> gettipobancosAux() {
		return this.tipobancosAux;
	}

	public void settipobancosAux(List<TipoBanco> tipobancosAux) {
		this.tipobancosAux = tipobancosAux;
	}
	
	public List<TipoBanco> gettipobancosEliminados() {
		return this.tipobancosEliminados;
	}

	public void setTipoBancosEliminados(List<TipoBanco> tipobancosEliminados) {
		this.tipobancosEliminados = tipobancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoBanco() {
		return jComboBoxTiposSeleccionarTipoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoBanco(
			JComboBox jComboBoxTiposSeleccionarTipoBanco) {
		this.jComboBoxTiposSeleccionarTipoBanco = jComboBoxTiposSeleccionarTipoBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoBanco() {
		return jTextFieldValorCampoGeneralTipoBanco;
	}

	public void setjTextFieldValorCampoGeneralTipoBanco(
			JTextField jTextFieldValorCampoGeneralTipoBanco) {
		this.jTextFieldValorCampoGeneralTipoBanco = jTextFieldValorCampoGeneralTipoBanco;
	}

	public void setBorderResaltarValorCampoGeneralTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoBanco() {
		return this.jCheckBoxSeleccionarTodosTipoBanco;
	}

	public void setjCheckBoxSeleccionarTodosTipoBanco(
			JCheckBox jCheckBoxSeleccionarTodosTipoBanco) {
		this.jCheckBoxSeleccionarTodosTipoBanco = jCheckBoxSeleccionarTodosTipoBanco;
	}

	public void setBorderResaltarSeleccionarTodosTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoBanco() {
		return this.jCheckBoxSeleccionadosTipoBanco;
	}

	public void setjCheckBoxSeleccionadosTipoBanco(
			JCheckBox jCheckBoxSeleccionadosTipoBanco) {
		this.jCheckBoxSeleccionadosTipoBanco = jCheckBoxSeleccionadosTipoBanco;
	}
	
	public void setBorderResaltarSeleccionadosTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoBanco() {
		return this.jComboBoxTiposArchivosReportesTipoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoBanco(
			JComboBox jComboBoxTiposArchivosReportesTipoBanco) {
		this.jComboBoxTiposArchivosReportesTipoBanco = jComboBoxTiposArchivosReportesTipoBanco;
	}

	public void setBorderResaltarTiposArchivosReportesTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoBanco() {
		return this.jComboBoxTiposReportesTipoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoBanco(
			JComboBox jComboBoxTiposReportesTipoBanco) {
		this.jComboBoxTiposReportesTipoBanco = jComboBoxTiposReportesTipoBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoBanco() {
	//	return jComboBoxTiposReportesDinamicoTipoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoBanco) {
	//	this.jComboBoxTiposReportesDinamicoTipoBanco = jComboBoxTiposReportesDinamicoTipoBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoBanco = jComboBoxTiposArchivosReportesDinamicoTipoBanco;
	//}
	
	public void setBorderResaltarTiposReportesTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoBanco() {
		return this.jComboBoxTiposGraficosReportesTipoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoBanco(
			JComboBox jComboBoxTiposGraficosReportesTipoBanco) {
		this.jComboBoxTiposGraficosReportesTipoBanco = jComboBoxTiposGraficosReportesTipoBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoBanco() {
		return this.jComboBoxTiposPaginacionTipoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoBanco(
			JComboBox jComboBoxTiposPaginacionTipoBanco) {
		this.jComboBoxTiposPaginacionTipoBanco = jComboBoxTiposPaginacionTipoBanco;
	}
	
	public void setBorderResaltarTiposPaginacionTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoBanco() {
		return this.jComboBoxTiposRelacionesTipoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBanco() {
		return this.jComboBoxTiposAccionesTipoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBanco(
			JComboBox jComboBoxTiposRelacionesTipoBanco) {
		this.jComboBoxTiposRelacionesTipoBanco = jComboBoxTiposRelacionesTipoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBanco(
			JComboBox jComboBoxTiposAccionesTipoBanco) {
		this.jComboBoxTiposAccionesTipoBanco = jComboBoxTiposAccionesTipoBanco;
	}
	
	public void setBorderResaltarTiposRelacionesTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoBanco() {
	//	return jCheckBoxConGraficoDinamicoTipoBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoBanco) {
	//	this.jCheckBoxConGraficoDinamicoTipoBanco = jCheckBoxConGraficoDinamicoTipoBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoBanco .setBorder(borderResaltar);		
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
		this.tipobancoSessionBean=new TipoBancoSessionBean();
		
		this.tipobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"nuevo","nuevo","Nuevo"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"duplicar","duplicar","Duplicar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"copiar","copiar","Copiar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"ver_form","ver_form","Ver"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"recargar","recargar","Recargar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoBanco,this.jTtoolBarTipoBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoBanco,this.jTtoolBarTipoBanco,
							"cerrar","cerrar","Salir"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoBanco;
			
				this.jButtonProcesarInformacionToolBarTipoBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoBanco;
				
		//protected JButton jButtonModificarToolBarTipoBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoBanco=new JMenuMe("General");
		this.jmenuArchivoTipoBanco=new JMenuMe("Archivo");
		this.jmenuAccionesTipoBanco=new JMenuMe("Acciones");
		this.jmenuDatosTipoBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoBanco.add(this.jMenuItemCerrarTipoBanco);
			
			this.jmenuAccionesTipoBanco.add(this.jMenuItemNuevoTipoBanco);
			this.jmenuAccionesTipoBanco.add(this.jMenuItemNuevoGuardarCambiosTipoBanco);
			this.jmenuAccionesTipoBanco.add(this.jMenuItemNuevoRelacionesTipoBanco);
			this.jmenuAccionesTipoBanco.add(this.jMenuItemGuardarCambiosTablaTipoBanco);		
			this.jmenuAccionesTipoBanco.add(this.jMenuItemDuplicarTipoBanco);		
			this.jmenuAccionesTipoBanco.add(this.jMenuItemCopiarTipoBanco);		
			this.jmenuAccionesTipoBanco.add(this.jMenuItemVerFormTipoBanco);		
			
			this.jmenuDatosTipoBanco.add(this.jMenuItemRecargarInformacionTipoBanco);				
			this.jmenuDatosTipoBanco.add(this.jMenuItemAnterioresTipoBanco);				
			this.jmenuDatosTipoBanco.add(this.jMenuItemSiguientesTipoBanco);				
			this.jmenuDatosTipoBanco.add(this.jMenuItemAbrirOrderByTipoBanco);				
			this.jmenuDatosTipoBanco.add(this.jMenuItemMostrarOcultarTipoBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoBanco.add(this.jMenuItemGuardarCambiosTipoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoBanco.add(this.jmenuArchivoTipoBanco);		
			this.jmenuBarTipoBanco.add(this.jmenuAccionesTipoBanco);		
			this.jmenuBarTipoBanco.add(this.jmenuDatosTipoBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoBanco.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoBanco= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoBanco.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoBanco.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoBanco,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoBanco = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoBanco.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoBanco.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoBanco= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoBanco,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoBanco=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoBanco.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBanco.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBanco.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoBanco = new TipoBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Banco DATOS");
			this.jInternalFrameDetalleFormTipoBanco = new TipoBancoDetalleFormJInternalFrame(jDesktopPane,this.tipobancoSessionBean.getConGuardarRelaciones(),this.tipobancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoBanco = null;//new TipoBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBanco= new GridBagLayout();
		
		
		this.jTableDatosTipoBanco = new JTableMe();      
		
		String sToolTipTipoBanco="";
		sToolTipTipoBanco=TipoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBanco+="(Tesoreria.TipoBanco)";
		}
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoBanco.setToolTipText(sToolTipTipoBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoBanco);
		this.jTableDatosTipoBanco.setAutoCreateRowSorter(true);
		this.jTableDatosTipoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoBanco.setRowSelectionAllowed(true);
		this.jTableDatosTipoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoBanco = new JButtonMe();
		this.jButtonDuplicarTipoBanco = new JButtonMe();
		this.jButtonCopiarTipoBanco = new JButtonMe();
		this.jButtonVerFormTipoBanco = new JButtonMe();
		this.jButtonNuevoRelacionesTipoBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoBanco = new JButtonMe();
		this.jButtonCerrarTipoBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco";
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoBanco=new ReporteDinamicoJInternalFrame(TipoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoBanco=new ImportacionJInternalFrame(TipoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoBanco.setText("Orden");
		this.jButtonAbrirOrderByTipoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBanco,false,this);
			
			//this.cargarOrderByTipoBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBanco,true,this);
			
			//this.cargarOrderByTipoBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoBanco.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoBanco.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoBanco.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoBanco.setText("Nuevo");
		this.jButtonDuplicarTipoBanco.setText("Duplicar");
		this.jButtonCopiarTipoBanco.setText("Copiar");
		this.jButtonVerFormTipoBanco.setText("Ver");
		this.jButtonNuevoRelacionesTipoBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoBanco.setText("Guardar");
		this.jButtonCerrarTipoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBanco,"nuevo_button","Nuevo",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoBanco,"duplicar_button","Duplicar",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoBanco,"copiar_button","Copiar",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoBanco,"ver_form","Ver",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoBanco,"nuevorelaciones_button","Nuevo Rel",this.tipobancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBanco,"guardarcambiostabla_button","Guardar",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBanco,"cerrar_button","Salir",this.tipobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoBanco.setToolTipText("Nuevo"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoBanco.setToolTipText("Duplicar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoBanco.setToolTipText("Copiar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoBanco.setToolTipText("Ver"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoBanco.setToolTipText("Nuevo Rel"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoBanco.setToolTipText("Guardar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBanco.setToolTipText("Salir"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBanco";
		inputMap = this.jButtonNuevoTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoBanco";
		inputMap = this.jButtonDuplicarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoBanco"));
		
		//COPIAR
		sMapKey = "CopiarTipoBanco";
		inputMap = this.jButtonCopiarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoBanco"));
		
		//VEr FORM
		sMapKey = "VerFormTipoBanco";
		inputMap = this.jButtonVerFormTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoBanco";
		inputMap = this.jButtonNuevoRelacionesTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoBanco";
		inputMap = this.jButtonModificarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoBanco";
		inputMap = this.jButtonCerrarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoBanco.setName("jPanelParametrosReportesTipoBanco"); 
		
		this.jPanelParametrosReportesAccionesTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoBanco.setName("jPanelParametrosReportesAccionesTipoBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoBanco = new JButtonMe();
		this.jButtonRecargarInformacionTipoBanco.setText("Recargar");
		this.jButtonRecargarInformacionTipoBanco.setToolTipText("Recargar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoBanco = new JButtonMe();
		this.jButtonProcesarInformacionTipoBanco.setText("Procesar");
		this.jButtonProcesarInformacionTipoBanco.setToolTipText("Procesar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoBanco.setVisible(false);
			
		this.jButtonProcesarInformacionTipoBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBanco.setText("TIPO");       
		this.jComboBoxTiposReportesTipoBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoBanco.setText("Accion");
		this.jComboBoxTiposRelacionesTipoBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoBanco = new JLabelMe();
		
		this.jLabelAccionesTipoBanco.setText("Acciones");		
		this.jLabelAccionesTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoBanco = new JButtonMe();
		//this.jButtonAnterioresTipoBanco.setText("<<");
        this.jButtonAnterioresTipoBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoBanco = new JButtonMe();
		//this.jButtonSiguientesTipoBanco.setText(">>");
        this.jButtonSiguientesTipoBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoBanco,"nuevoguardarcambios_button","Nue",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoBanco";
		inputMap = this.jButtonNuevoGuardarCambiosTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoBanco";
		inputMap = this.jButtonRecargarInformacionTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoBanco";
		inputMap = this.jButtonSiguientesTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoBanco";
		inputMap = this.jButtonAnterioresTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoBanco.setMinimumSize(new Dimension(this.getWidth(),TipoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBanco.setMaximumSize(new Dimension(this.getWidth(),TipoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBanco.setPreferredSize(new Dimension(this.getWidth(),TipoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoBanco = new GridBagLayout();

			this.jPanelPaginacionTipoBanco.setLayout(gridaBagLayoutPaginacionTipoBanco);						
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 0;
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoBanco.add(this.jButtonAnterioresTipoBanco, this.gridBagConstraintsTipoBanco);
					
						
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBanco.gridy = 0;
			
			this.jPanelPaginacionTipoBanco.add(this.jButtonNuevoGuardarCambiosTipoBanco, this.gridBagConstraintsTipoBanco);
						
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBanco.gridy = 0;
			this.jPanelPaginacionTipoBanco.add(this.jButtonSiguientesTipoBanco, this.gridBagConstraintsTipoBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 1;
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBanco.add(this.jButtonNuevoTipoBanco, this.gridBagConstraintsTipoBanco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBanco.gridy = 1;
				this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoBanco.add(this.jButtonNuevoRelacionesTipoBanco, this.gridBagConstraintsTipoBanco);
			}
			
			
			if(!this.tipobancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBanco.gridy = 1;
				this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoBanco.add(this.jButtonGuardarCambiosTablaTipoBanco, this.gridBagConstraintsTipoBanco);
			}
			
			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 1;
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBanco.add(this.jButtonDuplicarTipoBanco, this.gridBagConstraintsTipoBanco);
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 1;
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBanco.add(this.jButtonCopiarTipoBanco, this.gridBagConstraintsTipoBanco);
		
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 1;
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBanco.add(this.jButtonVerFormTipoBanco, this.gridBagConstraintsTipoBanco);
		
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 1;
			this.gridBagConstraintsTipoBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoBanco.add(this.jButtonCerrarTipoBanco, this.gridBagConstraintsTipoBanco);
		
		
		
		this.jButtonRecargarInformacionTipoBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoBanco.setLayout(gridaBagParametrosReportesTipoBanco);
			this.jPanelParametrosReportesAccionesTipoBanco.setLayout(gridaBagParametrosReportesAccionesTipoBanco);
			
			
			this.jPanelParametrosAuxiliar1TipoBanco.setLayout(gridaBagParametrosAuxiliar1TipoBanco);
			this.jPanelParametrosAuxiliar2TipoBanco.setLayout(gridaBagParametrosAuxiliar2TipoBanco);
			this.jPanelParametrosAuxiliar3TipoBanco.setLayout(gridaBagParametrosAuxiliar3TipoBanco);
			this.jPanelParametrosAuxiliar4TipoBanco.setLayout(gridaBagParametrosAuxiliar4TipoBanco);
			//this.jPanelParametrosAuxiliar5TipoBanco.setLayout(gridaBagParametrosAuxiliar2TipoBanco);			
			
			
			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBanco.add(this.jButtonRecargarInformacionTipoBanco, this.gridBagConstraintsTipoBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBanco.add(this.jComboBoxTiposPaginacionTipoBanco, this.gridBagConstraintsTipoBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBanco.add(this.jCheckBoxConAltoMaximoTablaTipoBanco, this.gridBagConstraintsTipoBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBanco.add(this.jComboBoxTiposArchivosReportesTipoBanco, this.gridBagConstraintsTipoBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBanco.add(this.jPanelParametrosAuxiliar1TipoBanco, this.gridBagConstraintsTipoBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoBanco.add(this.jComboBoxTiposReportesTipoBanco, this.gridBagConstraintsTipoBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBanco.add(this.jPanelParametrosAuxiliar4TipoBanco, this.gridBagConstraintsTipoBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBanco.add(this.jComboBoxTiposReportesTipoBanco, this.gridBagConstraintsTipoBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBanco.add(this.jCheckBoxGenerarReporteTipoBanco, this.gridBagConstraintsTipoBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBanco.add(this.jPanelParametrosAuxiliar2TipoBanco, this.gridBagConstraintsTipoBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBanco.add(this.jLabelAccionesTipoBanco, this.gridBagConstraintsTipoBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoBanco.add(this.jButtonAbrirOrderByTipoBanco, this.gridBagConstraintsTipoBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBanco.add(this.jComboBoxTiposSeleccionarTipoBanco, this.gridBagConstraintsTipoBanco);			
			
			
			/*
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBanco.add(this.jCheckBoxSeleccionarTodosTipoBanco, this.gridBagConstraintsTipoBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBanco.add(this.jCheckBoxSeleccionarTodosTipoBanco, this.gridBagConstraintsTipoBanco);															
				
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBanco.add(this.jCheckBoxSeleccionadosTipoBanco, this.gridBagConstraintsTipoBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBanco.add(this.jPanelParametrosAuxiliar3TipoBanco, this.gridBagConstraintsTipoBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBanco.add(this.jComboBoxTiposRelacionesTipoBanco, this.gridBagConstraintsTipoBanco);
				
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBanco.add(this.jComboBoxTiposAccionesTipoBanco, this.gridBagConstraintsTipoBanco);
	
				
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBanco.add(this.jTextFieldValorCampoGeneralTipoBanco, this.gridBagConstraintsTipoBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoBanco = new GridBagLayout();

			this.jScrollPanelDatosTipoBanco.setLayout(gridaBagLayoutDatosTipoBanco);
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = 0;
			this.gridBagConstraintsTipoBanco.gridx = 0;
			
			this.jScrollPanelDatosTipoBanco.add(this.jTableDatosTipoBanco, this.gridBagConstraintsTipoBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoBanco.setViewportView(this.jTableDatosTipoBanco);
		this.jTableDatosTipoBanco.setFillsViewportHeight(true);
		this.jTableDatosTipoBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoBanco= new GridBagLayout();
		this.jPanelAccionesTipoBanco.setLayout(gridaBagLayoutAccionesTipoBanco);
		
		
		/*	
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = 0;
			
		this.jPanelAccionesTipoBanco.add(this.jButtonNuevoTipoBanco, this.gridBagConstraintsTipoBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoBanco.setLayout(gridaBagLayoutBusquedaPorNombreTipoBanco);

		gridBagConstraintsTipoBanco = new GridBagConstraints();
		gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBanco.gridy = 0;
		gridBagConstraintsTipoBanco.gridx = 0;
		jPanelBusquedaPorNombreTipoBanco.add(jLabelnombreBusquedaPorNombreTipoBanco, gridBagConstraintsTipoBanco);

		gridBagConstraintsTipoBanco = new GridBagConstraints();
		gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBanco.gridy = 0;
		gridBagConstraintsTipoBanco.gridx = 1;
		jPanelBusquedaPorNombreTipoBanco.add(jTextAreanombreBusquedaPorNombreTipoBanco, gridBagConstraintsTipoBanco);

		gridBagConstraintsTipoBanco = new GridBagConstraints();
		gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBanco.gridy = 1;
		gridBagConstraintsTipoBanco.gridx =1;
		jPanelBusquedaPorNombreTipoBanco.add(jButtonBusquedaPorNombreTipoBanco, gridBagConstraintsTipoBanco);

		jTabbedPaneBusquedasTipoBanco.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoBanco);
		jTabbedPaneBusquedasTipoBanco.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBanco.gridx = 0;		
			//this.gridBagConstraintsTipoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoBanco, this.gridBagConstraintsTipoBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoBanco.gridx = 0;		
		//this.gridBagConstraintsTipoBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBanco.gridx = 0;		
			this.gridBagConstraintsTipoBanco.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoBanco.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoBanco, this.gridBagConstraintsTipoBanco);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoBanco, this.gridBagConstraintsTipoBanco);								
		
		
		/*
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoBanco, this.gridBagConstraintsTipoBanco);
		*/		
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBanco.gridx =0;
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBanco, this.gridBagConstraintsTipoBanco);
				
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoBanco, this.gridBagConstraintsTipoBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoBanco.setLayout(gridaBagLayoutBusquedasParametrosTipoBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBanco, this.gridBagConstraintsTipoBanco);
			
			
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBanco, this.gridBagConstraintsTipoBanco);
		
			
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBanco, this.gridBagConstraintsTipoBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoBanco.setName("jPanelReporteDinamicoTipoBanco"); 
		
		this.jPanelReporteDinamicoTipoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoBanco.setLayout(gridaBagLayoutReporteDinamicoTipoBanco);
		
		
		this.jInternalFrameReporteDinamicoTipoBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBanco.add(this.jLabelColumnasSelectReporteTipoBanco, this.gridBagConstraintsTipoBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoBanco=new JScrollPane(this.jListColumnasSelectReporteTipoBanco);
			
			this.jScrollColumnasSelectReporteTipoBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBanco.add(this.jListColumnasSelectReporteTipoBanco, this.gridBagConstraintsTipoBanco);
		this.jPanelReporteDinamicoTipoBanco.add(this.jScrollColumnasSelectReporteTipoBanco, this.gridBagConstraintsTipoBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBanco.add(this.jLabelRelacionesSelectReporteTipoBanco, this.gridBagConstraintsTipoBanco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoBanco=new JScrollPane(this.jListRelacionesSelectReporteTipoBanco);
			
			this.jScrollRelacionesSelectReporteTipoBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBanco.add(this.jListRelacionesSelectReporteTipoBanco, this.gridBagConstraintsTipoBanco);
		this.jPanelReporteDinamicoTipoBanco.add(this.jScrollRelacionesSelectReporteTipoBanco, this.gridBagConstraintsTipoBanco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBanco.add(this.jLabelGenerarExcelReporteDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoBanco.setToolTipText("Generar EXCEL"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoBanco.add(this.jButtonGenerarExcelReporteDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBanco.add(this.jComboBoxTiposReportesDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBanco.add(this.jLabelTiposArchivoReporteDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBanco.add(this.jComboBoxTiposArchivosReportesDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoBanco.setToolTipText("Generar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBanco.add(this.jButtonGenerarReporteDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoBanco.setToolTipText("Cancelar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBanco.add(this.jButtonCerrarReporteDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoBanco= new JScrollPane(jPanelReporteDinamicoTipoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoBanco);
		this.jInternalFrameReporteDinamicoTipoBanco.getContentPane().add(this.jScrollPanelReporteDinamicoTipoBanco, this.gridBagConstraintsTipoBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoBanco.setName("jPanelImportacionTipoBanco"); 
		
		this.jPanelImportacionTipoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoBanco.setLayout(gridaBagLayoutImportacionTipoBanco);
		
		
		this.jInternalFrameImportacionTipoBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoBanco = new JLabelMe();

		this.jLabelArchivoImportacionTipoBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBanco.add(this.jLabelArchivoImportacionTipoBanco, this.gridBagConstraintsTipoBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoBanco = new JFileChooser();		
		this.jFileChooserImportacionTipoBanco.setToolTipText("ESCOGER ARCHIVO"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoBanco = new JButtonMe();
		this.jButtonAbrirImportacionTipoBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoBanco.setToolTipText("Generar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBanco.add(this.jButtonAbrirImportacionTipoBanco, this.gridBagConstraintsTipoBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBanco.add(this.jLabelPathArchivoImportacionTipoBanco, this.gridBagConstraintsTipoBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBanco.add(this.jTextFieldPathArchivoImportacionTipoBanco, this.gridBagConstraintsTipoBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoBanco = new JButtonMe();
		this.jButtonGenerarImportacionTipoBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoBanco.setToolTipText("Generar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBanco.add(this.jButtonGenerarImportacionTipoBanco, this.gridBagConstraintsTipoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoBanco = new JButtonMe();
		this.jButtonCerrarImportacionTipoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoBanco.setToolTipText("Cancelar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBanco.add(this.jButtonCerrarImportacionTipoBanco, this.gridBagConstraintsTipoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoBanco= new JScrollPane(jPanelImportacionTipoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoBanco);
		this.jInternalFrameImportacionTipoBanco.getContentPane().add(this.jScrollPanelImportacionTipoBanco, this.gridBagConstraintsTipoBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoBanco = new JButtonMe();
			this.jButtonAbrirOrderByTipoBanco.setText("Orden");
			this.jButtonAbrirOrderByTipoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoBanco";
			inputMap = this.jButtonAbrirOrderByTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoBanco.setName("jPanelOrderByTipoBanco"); 
			
			this.jPanelOrderByTipoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoBanco.setLayout(gridaBagLayoutOrderByTipoBanco);
			
			
			this.jTableDatosTipoBancoOrderBy = new JTableMe();        
			this.jTableDatosTipoBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoBancoOrderBy.setViewportView(this.jTableDatosTipoBancoOrderBy);
			this.jTableDatosTipoBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoBanco.setTitle("Orden");
			this.jInternalFrameOrderByTipoBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoBanco.setResizable(true);
			this.jInternalFrameOrderByTipoBanco.setClosable(true);
			this.jInternalFrameOrderByTipoBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoBanco.ipady =150;
				
			this.jPanelOrderByTipoBanco.add(jScrollPanelDatosTipoBancoOrderBy, this.gridBagConstraintsTipoBanco);//this.jTableDatosTipoBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoBanco = new JButtonMe();
			this.jButtonCerrarOrderByTipoBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoBanco.setToolTipText("Cancelar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoBanco.add(this.jButtonCerrarOrderByTipoBanco, this.gridBagConstraintsTipoBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoBanco= new JScrollPane(jPanelOrderByTipoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoBanco);
			
			this.jInternalFrameOrderByTipoBanco.getContentPane().add(this.jScrollPanelOrderByTipoBanco, this.gridBagConstraintsTipoBanco);			
		
		} else {
			this.jButtonAbrirOrderByTipoBanco = new JButtonMe();
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
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipobancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoBanco.getRowHeight();//TipoBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBanco.isSelected()) {
					iHeightTable=TipoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBanco.isSelected()) {
					iHeightTable=TipoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoBanco!=null && this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipobancoLogic.getTipoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoBanco> TraerTipoBancoBeans(List<TipoBanco> tipobancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoBanco tipobanco:tipobancos) {
					
				if(!(TipoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipobanco.setsDetalleGeneralEntityReporte(TipoBancoConstantesFunciones.getTipoBancoDescripcion(tipobanco));
										
					tipobanco.setes_defecto_descripcion(TipoBancoConstantesFunciones.getes_defectoDescripcion(tipobanco));	
					
					

					if(tipobanco.getBancos()!=null && Funciones.existeClass(classes,Banco.class)) {
						try{tipobanco.setbancosDescripcionReporte(new JRBeanCollectionDataSource(BancoJInternalFrame.TraerBancoBeans(tipobanco.getBancos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipobanco.setsDetalleGeneralEntityReporte(tipobanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipobancobeans.add(tipobancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipobancos;
    }
	//PARA REPORTES FIN
}
