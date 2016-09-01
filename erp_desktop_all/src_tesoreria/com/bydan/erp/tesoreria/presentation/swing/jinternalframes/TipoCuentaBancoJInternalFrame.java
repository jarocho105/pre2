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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.tesoreria.util.TipoCuentaBancoConstantesFunciones;

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
public class TipoCuentaBancoJInternalFrame extends TipoCuentaBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCuentaBanco;
	
	protected JMenuBar jmenuBarTipoCuentaBanco;
	
	protected JMenu jmenuTipoCuentaBanco;
	protected JMenu jmenuDatosTipoCuentaBanco;
	protected JMenu jmenuArchivoTipoCuentaBanco;
	protected JMenu jmenuAccionesTipoCuentaBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaBanco;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCuentaBancoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCuentaBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCuentaBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCuentaBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCuentaBancoSessionBean tipocuentabancoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCuentaBanco> tipocuentabancos;		
	public List<TipoCuentaBanco> tipocuentabancosEliminados;	
	public List<TipoCuentaBanco> tipocuentabancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCuentaBanco;		
	protected JButton jButtonAbrirOrderByTipoCuentaBanco;
	
	
	//protected JPanel jPanelOrderByTipoCuentaBanco;
	//public JScrollPane jScrollPanelOrderByTipoCuentaBanco;	
	//protected JButton jButtonCerrarOrderByTipoCuentaBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCuentaBancoLogic tipocuentabancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCuentaBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCuentaBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCuentaBanco;
	//public JScrollPane jScrollPanelImportacionTipoCuentaBanco;
	
	
	
	protected JPanel jPanelAccionesTipoCuentaBanco;
	
    protected JPanel jPanelPaginacionTipoCuentaBanco;
    protected JPanel jPanelParametrosReportesTipoCuentaBanco;
	protected JPanel jPanelParametrosReportesAccionesTipoCuentaBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCuentaBanco;
	protected JPanel jPanelParametrosAuxiliar2TipoCuentaBanco;
	protected JPanel jPanelParametrosAuxiliar3TipoCuentaBanco;
	protected JPanel jPanelParametrosAuxiliar4TipoCuentaBanco;
	//protected JPanel jPanelParametrosAuxiliar5TipoCuentaBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCuentaBanco;
	//protected JPanel jPanelImportacionTipoCuentaBanco;
	
	
	public JTable jTableDatosTipoCuentaBanco;
	
	
	
	//public JTable jTableDatosTipoCuentaBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCuentaBanco;
	protected JButton jButtonDuplicarTipoCuentaBanco;
	protected JButton jButtonCopiarTipoCuentaBanco;
	protected JButton jButtonVerFormTipoCuentaBanco;
	protected JButton jButtonNuevoRelacionesTipoCuentaBanco;
	protected JButton jButtonModificarTipoCuentaBanco;
	
    protected JButton jButtonGuardarCambiosTablaTipoCuentaBanco;
	protected JButton jButtonCerrarTipoCuentaBanco;
	
	
	protected JButton jButtonRecargarInformacionTipoCuentaBanco;
	protected JButton jButtonProcesarInformacionTipoCuentaBanco;
	
	
	protected JButton jButtonAnterioresTipoCuentaBanco;
	protected JButton jButtonSiguientesTipoCuentaBanco;
	protected JButton jButtonNuevoGuardarCambiosTipoCuentaBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCuentaBanco;
	//protected JButton jButtonCerrarReporteDinamicoTipoCuentaBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCuentaBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCuentaBanco;
	//protected JButton jButtonGenerarImportacionTipoCuentaBanco;
	//protected JButton jButtonCerrarImportacionTipoCuentaBanco;
	//protected JFileChooser jFileChooserImportacionTipoCuentaBanco;
	//protected File fileImportacionTipoCuentaBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaBanco;
	protected JButton jButtonDuplicarToolBarTipoCuentaBanco;
	protected JButton jButtonNuevoRelacionesToolBarTipoCuentaBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCuentaBanco;
	protected JButton jButtonCopiarToolBarTipoCuentaBanco;
	protected JButton jButtonVerFormToolBarTipoCuentaBanco;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCuentaBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaBanco;
	protected JButton jButtonCerrarToolBarTipoCuentaBanco;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCuentaBanco;
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaBanco;
	protected JButton jButtonAnterioresToolBarTipoCuentaBanco;
	protected JButton jButtonSiguientesToolBarTipoCuentaBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCuentaBanco;
	protected JButton jButtonAbrirOrderByToolBarTipoCuentaBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaBanco;
	protected JMenuItem jMenuItemDuplicarTipoCuentaBanco;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCuentaBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCuentaBanco;
	protected JMenuItem jMenuItemCopiarTipoCuentaBanco;
	protected JMenuItem jMenuItemVerFormTipoCuentaBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaBanco;
	protected JMenuItem jMenuItemCerrarTipoCuentaBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCuentaBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCuentaBanco;
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaBanco;
	protected JMenuItem jMenuItemAnterioresTipoCuentaBanco;
	protected JMenuItem jMenuItemSiguientesTipoCuentaBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaBanco;
	protected JMenuItem jMenuItemAbrirOrderByTipoCuentaBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCuentaBanco;
	protected JCheckBox jCheckBoxSeleccionadosTipoCuentaBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCuentaBanco;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCuentaBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCuentaBanco;
	protected JTextField jTextFieldValorCampoGeneralTipoCuentaBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCuentaBanco;
	//public JList<Reporte> jListColumnasSelectReporteTipoCuentaBanco;
	//public JScrollPane jScrollColumnasSelectReporteTipoCuentaBanco;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCuentaBanco;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCuentaBanco;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCuentaBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCuentaBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCuentaBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCuentaBanco;
	
		
	//public JLabel jLabelArchivoImportacionTipoCuentaBanco;	
	//public JLabel jLabelPathArchivoImportacionTipoCuentaBanco;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCuentaBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCuentaBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCuentaBanco;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCuentaBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCuentaBanco;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCuentaBanco;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCuentaBanco;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCuentaBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCuentaBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCuentaBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCuentaBanco;
	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoCuentaBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCuentaBanco)	{
		this.jButtonRecargarInformacionTipoCuentaBanco = jButtonRecargarInformacionTipoCuentaBanco;
	}
	
	public JButton getjButtonProcesarInformacionTipoCuentaBanco() {
		return this.jButtonProcesarInformacionTipoCuentaBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaBanco)	{
		this.jButtonProcesarInformacionTipoCuentaBanco = jButtonProcesarInformacionTipoCuentaBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCuentaBanco() {
		return this.jButtonRecargarInformacionTipoCuentaBanco;
	}
	
	
	public List<TipoCuentaBanco> gettipocuentabancos() {
		return this.tipocuentabancos;
	}

	public void settipocuentabancos(List<TipoCuentaBanco> tipocuentabancos) {
		this.tipocuentabancos = tipocuentabancos;
	}
	
	public List<TipoCuentaBanco> gettipocuentabancosAux() {
		return this.tipocuentabancosAux;
	}

	public void settipocuentabancosAux(List<TipoCuentaBanco> tipocuentabancosAux) {
		this.tipocuentabancosAux = tipocuentabancosAux;
	}
	
	public List<TipoCuentaBanco> gettipocuentabancosEliminados() {
		return this.tipocuentabancosEliminados;
	}

	public void setTipoCuentaBancosEliminados(List<TipoCuentaBanco> tipocuentabancosEliminados) {
		this.tipocuentabancosEliminados = tipocuentabancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCuentaBanco() {
		return jComboBoxTiposSeleccionarTipoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCuentaBanco(
			JComboBox jComboBoxTiposSeleccionarTipoCuentaBanco) {
		this.jComboBoxTiposSeleccionarTipoCuentaBanco = jComboBoxTiposSeleccionarTipoCuentaBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCuentaBanco() {
		return jTextFieldValorCampoGeneralTipoCuentaBanco;
	}

	public void setjTextFieldValorCampoGeneralTipoCuentaBanco(
			JTextField jTextFieldValorCampoGeneralTipoCuentaBanco) {
		this.jTextFieldValorCampoGeneralTipoCuentaBanco = jTextFieldValorCampoGeneralTipoCuentaBanco;
	}

	public void setBorderResaltarValorCampoGeneralTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCuentaBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCuentaBanco() {
		return this.jCheckBoxSeleccionarTodosTipoCuentaBanco;
	}

	public void setjCheckBoxSeleccionarTodosTipoCuentaBanco(
			JCheckBox jCheckBoxSeleccionarTodosTipoCuentaBanco) {
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco = jCheckBoxSeleccionarTodosTipoCuentaBanco;
	}

	public void setBorderResaltarSeleccionarTodosTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCuentaBanco() {
		return this.jCheckBoxSeleccionadosTipoCuentaBanco;
	}

	public void setjCheckBoxSeleccionadosTipoCuentaBanco(
			JCheckBox jCheckBoxSeleccionadosTipoCuentaBanco) {
		this.jCheckBoxSeleccionadosTipoCuentaBanco = jCheckBoxSeleccionadosTipoCuentaBanco;
	}
	
	public void setBorderResaltarSeleccionadosTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCuentaBanco() {
		return this.jComboBoxTiposArchivosReportesTipoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCuentaBanco(
			JComboBox jComboBoxTiposArchivosReportesTipoCuentaBanco) {
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco = jComboBoxTiposArchivosReportesTipoCuentaBanco;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCuentaBanco() {
		return this.jComboBoxTiposReportesTipoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCuentaBanco(
			JComboBox jComboBoxTiposReportesTipoCuentaBanco) {
		this.jComboBoxTiposReportesTipoCuentaBanco = jComboBoxTiposReportesTipoCuentaBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCuentaBanco() {
	//	return jComboBoxTiposReportesDinamicoTipoCuentaBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCuentaBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCuentaBanco) {
	//	this.jComboBoxTiposReportesDinamicoTipoCuentaBanco = jComboBoxTiposReportesDinamicoTipoCuentaBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco = jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco;
	//}
	
	public void setBorderResaltarTiposReportesTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCuentaBanco() {
		return this.jComboBoxTiposGraficosReportesTipoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCuentaBanco(
			JComboBox jComboBoxTiposGraficosReportesTipoCuentaBanco) {
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco = jComboBoxTiposGraficosReportesTipoCuentaBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCuentaBanco() {
		return this.jComboBoxTiposPaginacionTipoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCuentaBanco(
			JComboBox jComboBoxTiposPaginacionTipoCuentaBanco) {
		this.jComboBoxTiposPaginacionTipoCuentaBanco = jComboBoxTiposPaginacionTipoCuentaBanco;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCuentaBanco() {
		return this.jComboBoxTiposRelacionesTipoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaBanco() {
		return this.jComboBoxTiposAccionesTipoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaBanco(
			JComboBox jComboBoxTiposRelacionesTipoCuentaBanco) {
		this.jComboBoxTiposRelacionesTipoCuentaBanco = jComboBoxTiposRelacionesTipoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaBanco(
			JComboBox jComboBoxTiposAccionesTipoCuentaBanco) {
		this.jComboBoxTiposAccionesTipoCuentaBanco = jComboBoxTiposAccionesTipoCuentaBanco;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCuentaBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCuentaBanco() {
	//	return jCheckBoxConGraficoDinamicoTipoCuentaBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCuentaBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaBanco) {
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaBanco = jCheckBoxConGraficoDinamicoTipoCuentaBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCuentaBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCuentaBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaBanco .setBorder(borderResaltar);		
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
		this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
		
		this.tipocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentabancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCuentaBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"nuevo","nuevo","Nuevo"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"duplicar","duplicar","Duplicar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"copiar","copiar","Copiar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"ver_form","ver_form","Ver"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"recargar","recargar","Recargar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,
							"cerrar","cerrar","Salir"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCuentaBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCuentaBanco;
			
				this.jButtonProcesarInformacionToolBarTipoCuentaBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCuentaBanco;
				
		//protected JButton jButtonModificarToolBarTipoCuentaBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCuentaBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCuentaBanco=new JMenuMe("General");
		this.jmenuArchivoTipoCuentaBanco=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCuentaBanco=new JMenuMe("Acciones");
		this.jmenuDatosTipoCuentaBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCuentaBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCuentaBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCuentaBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCuentaBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCuentaBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCuentaBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCuentaBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCuentaBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCuentaBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCuentaBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCuentaBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCuentaBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCuentaBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCuentaBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCuentaBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCuentaBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCuentaBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCuentaBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCuentaBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCuentaBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCuentaBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCuentaBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCuentaBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCuentaBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCuentaBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCuentaBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCuentaBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCuentaBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCuentaBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCuentaBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCuentaBanco.add(this.jMenuItemCerrarTipoCuentaBanco);
			
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemNuevoTipoCuentaBanco);
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco);
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemNuevoRelacionesTipoCuentaBanco);
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemGuardarCambiosTablaTipoCuentaBanco);		
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemDuplicarTipoCuentaBanco);		
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemCopiarTipoCuentaBanco);		
			this.jmenuAccionesTipoCuentaBanco.add(this.jMenuItemVerFormTipoCuentaBanco);		
			
			this.jmenuDatosTipoCuentaBanco.add(this.jMenuItemRecargarInformacionTipoCuentaBanco);				
			this.jmenuDatosTipoCuentaBanco.add(this.jMenuItemAnterioresTipoCuentaBanco);				
			this.jmenuDatosTipoCuentaBanco.add(this.jMenuItemSiguientesTipoCuentaBanco);				
			this.jmenuDatosTipoCuentaBanco.add(this.jMenuItemAbrirOrderByTipoCuentaBanco);				
			this.jmenuDatosTipoCuentaBanco.add(this.jMenuItemMostrarOcultarTipoCuentaBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCuentaBanco.add(this.jMenuItemGuardarCambiosTipoCuentaBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCuentaBanco.add(this.jmenuArchivoTipoCuentaBanco);		
			this.jmenuBarTipoCuentaBanco.add(this.jmenuAccionesTipoCuentaBanco);		
			this.jmenuBarTipoCuentaBanco.add(this.jmenuDatosTipoCuentaBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCuentaBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCuentaBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoCuentaBanco=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCuentaBanco.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuentaBanco.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuentaBanco.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCuentaBanco = new TipoCuentaBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cuenta Banco DATOS");
			this.jInternalFrameDetalleFormTipoCuentaBanco = new TipoCuentaBancoDetalleFormJInternalFrame(jDesktopPane,this.tipocuentabancoSessionBean.getConGuardarRelaciones(),this.tipocuentabancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCuentaBanco = null;//new TipoCuentaBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaBanco= new GridBagLayout();
		
		
		this.jTableDatosTipoCuentaBanco = new JTableMe();      
		
		String sToolTipTipoCuentaBanco="";
		sToolTipTipoCuentaBanco=TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaBanco+="(Tesoreria.TipoCuentaBanco)";
		}
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCuentaBanco.setToolTipText(sToolTipTipoCuentaBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCuentaBanco);
		this.jTableDatosTipoCuentaBanco.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCuentaBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCuentaBanco.setRowSelectionAllowed(true);
		this.jTableDatosTipoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCuentaBanco = new JButtonMe();
		this.jButtonDuplicarTipoCuentaBanco = new JButtonMe();
		this.jButtonCopiarTipoCuentaBanco = new JButtonMe();
		this.jButtonVerFormTipoCuentaBanco = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCuentaBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco = new JButtonMe();
		this.jButtonCerrarTipoCuentaBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCuentaBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Banco";
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCuentaBanco=new ReporteDinamicoJInternalFrame(TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCuentaBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCuentaBanco=new ImportacionJInternalFrame(TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCuentaBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCuentaBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCuentaBanco.setText("Orden");
		this.jButtonAbrirOrderByTipoCuentaBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBanco,false,this);
			
			//this.cargarOrderByTipoCuentaBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBanco,true,this);
			
			//this.cargarOrderByTipoCuentaBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCuentaBanco.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCuentaBanco.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCuentaBanco.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCuentaBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCuentaBanco.setText("Nuevo");
		this.jButtonDuplicarTipoCuentaBanco.setText("Duplicar");
		this.jButtonCopiarTipoCuentaBanco.setText("Copiar");
		this.jButtonVerFormTipoCuentaBanco.setText("Ver");
		this.jButtonNuevoRelacionesTipoCuentaBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.setText("Guardar");
		this.jButtonCerrarTipoCuentaBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaBanco,"nuevo_button","Nuevo",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCuentaBanco,"duplicar_button","Duplicar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCuentaBanco,"copiar_button","Copiar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCuentaBanco,"ver_form","Ver",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCuentaBanco,"nuevorelaciones_button","Nuevo Rel",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaBanco,"guardarcambiostabla_button","Guardar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaBanco,"cerrar_button","Salir",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCuentaBanco.setToolTipText("Nuevo"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCuentaBanco.setToolTipText("Duplicar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCuentaBanco.setToolTipText("Copiar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCuentaBanco.setToolTipText("Ver"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCuentaBanco.setToolTipText("Nuevo Rel"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.setToolTipText("Guardar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaBanco.setToolTipText("Salir"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaBanco";
		inputMap = this.jButtonNuevoTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCuentaBanco";
		inputMap = this.jButtonDuplicarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCuentaBanco"));
		
		//COPIAR
		sMapKey = "CopiarTipoCuentaBanco";
		inputMap = this.jButtonCopiarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCuentaBanco"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCuentaBanco";
		inputMap = this.jButtonVerFormTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCuentaBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCuentaBanco";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCuentaBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCuentaBanco";
		inputMap = this.jButtonModificarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCuentaBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaBanco";
		inputMap = this.jButtonCerrarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCuentaBanco.setName("jPanelParametrosReportesTipoCuentaBanco"); 
		
		this.jPanelParametrosReportesAccionesTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCuentaBanco.setName("jPanelParametrosReportesAccionesTipoCuentaBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCuentaBanco = new JButtonMe();
		this.jButtonRecargarInformacionTipoCuentaBanco.setText("Recargar");
		this.jButtonRecargarInformacionTipoCuentaBanco.setToolTipText("Recargar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCuentaBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCuentaBanco = new JButtonMe();
		this.jButtonProcesarInformacionTipoCuentaBanco.setText("Procesar");
		this.jButtonProcesarInformacionTipoCuentaBanco.setToolTipText("Procesar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCuentaBanco.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCuentaBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCuentaBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCuentaBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCuentaBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCuentaBanco.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCuentaBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCuentaBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCuentaBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCuentaBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCuentaBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCuentaBanco = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaBanco.setText("Acciones");		
		this.jLabelAccionesTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCuentaBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCuentaBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCuentaBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCuentaBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCuentaBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCuentaBanco = new JButtonMe();
		//this.jButtonAnterioresTipoCuentaBanco.setText("<<");
        this.jButtonAnterioresTipoCuentaBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCuentaBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCuentaBanco = new JButtonMe();
		//this.jButtonSiguientesTipoCuentaBanco.setText(">>");
        this.jButtonSiguientesTipoCuentaBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCuentaBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCuentaBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCuentaBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCuentaBanco,"nuevoguardarcambios_button","Nue",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCuentaBanco";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCuentaBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCuentaBanco";
		inputMap = this.jButtonRecargarInformacionTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCuentaBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCuentaBanco";
		inputMap = this.jButtonSiguientesTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCuentaBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCuentaBanco";
		inputMap = this.jButtonAnterioresTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCuentaBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCuentaBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCuentaBanco.setMinimumSize(new Dimension(this.getWidth(),TipoCuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaBanco.setMaximumSize(new Dimension(this.getWidth(),TipoCuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaBanco.setPreferredSize(new Dimension(this.getWidth(),TipoCuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCuentaBanco = new GridBagLayout();

			this.jPanelPaginacionTipoCuentaBanco.setLayout(gridaBagLayoutPaginacionTipoCuentaBanco);						
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonAnterioresTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
					
						
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
			
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonNuevoGuardarCambiosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
						
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonSiguientesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonNuevoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
				this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonNuevoRelacionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			}
			
			
			if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
				this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonGuardarCambiosTablaTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			}
			
			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonDuplicarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonCopiarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonVerFormTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 1;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCuentaBanco.add(this.jButtonCerrarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
		
		
		this.jButtonRecargarInformacionTipoCuentaBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCuentaBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCuentaBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCuentaBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCuentaBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCuentaBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCuentaBanco.setLayout(gridaBagParametrosReportesTipoCuentaBanco);
			this.jPanelParametrosReportesAccionesTipoCuentaBanco.setLayout(gridaBagParametrosReportesAccionesTipoCuentaBanco);
			
			
			this.jPanelParametrosAuxiliar1TipoCuentaBanco.setLayout(gridaBagParametrosAuxiliar1TipoCuentaBanco);
			this.jPanelParametrosAuxiliar2TipoCuentaBanco.setLayout(gridaBagParametrosAuxiliar2TipoCuentaBanco);
			this.jPanelParametrosAuxiliar3TipoCuentaBanco.setLayout(gridaBagParametrosAuxiliar3TipoCuentaBanco);
			this.jPanelParametrosAuxiliar4TipoCuentaBanco.setLayout(gridaBagParametrosAuxiliar4TipoCuentaBanco);
			//this.jPanelParametrosAuxiliar5TipoCuentaBanco.setLayout(gridaBagParametrosAuxiliar2TipoCuentaBanco);			
			
			
			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jButtonRecargarInformacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBanco.add(this.jComboBoxTiposPaginacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBanco.add(this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBanco.add(this.jComboBoxTiposArchivosReportesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jPanelParametrosAuxiliar1TipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCuentaBanco.add(this.jComboBoxTiposReportesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jPanelParametrosAuxiliar4TipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jComboBoxTiposReportesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jCheckBoxGenerarReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jPanelParametrosAuxiliar2TipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jLabelAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCuentaBanco.add(this.jButtonAbrirOrderByTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jComboBoxTiposSeleccionarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
			
			
			/*
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jCheckBoxSeleccionarTodosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaBanco.add(this.jCheckBoxSeleccionarTodosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);															
				
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaBanco.add(this.jCheckBoxSeleccionadosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jPanelParametrosAuxiliar3TipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jComboBoxTiposRelacionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
				
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jComboBoxTiposAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
	
				
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBanco.add(this.jTextFieldValorCampoGeneralTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCuentaBanco = new GridBagLayout();

			this.jScrollPanelDatosTipoCuentaBanco.setLayout(gridaBagLayoutDatosTipoCuentaBanco);
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
			this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
			
			this.jScrollPanelDatosTipoCuentaBanco.add(this.jTableDatosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCuentaBanco.setViewportView(this.jTableDatosTipoCuentaBanco);
		this.jTableDatosTipoCuentaBanco.setFillsViewportHeight(true);
		this.jTableDatosTipoCuentaBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaBanco= new GridBagLayout();
		this.jPanelAccionesTipoCuentaBanco.setLayout(gridaBagLayoutAccionesTipoCuentaBanco);
		
		
		/*	
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
			
		this.jPanelAccionesTipoCuentaBanco.add(this.jButtonNuevoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBanco.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;		
		//this.gridBagConstraintsTipoCuentaBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCuentaBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCuentaBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);								
		
		
		/*
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		*/		
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBanco.gridx =0;
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
				
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCuentaBanco.setLayout(gridaBagLayoutBusquedasParametrosTipoCuentaBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCuentaBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
			
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
			
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCuentaBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCuentaBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCuentaBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCuentaBanco.setName("jPanelReporteDinamicoTipoCuentaBanco"); 
		
		this.jPanelReporteDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCuentaBanco.setLayout(gridaBagLayoutReporteDinamicoTipoCuentaBanco);
		
		
		this.jInternalFrameReporteDinamicoTipoCuentaBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCuentaBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCuentaBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCuentaBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCuentaBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCuentaBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCuentaBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jLabelColumnasSelectReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCuentaBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCuentaBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCuentaBanco=new JScrollPane(this.jListColumnasSelectReporteTipoCuentaBanco);
			
			this.jScrollColumnasSelectReporteTipoCuentaBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jListColumnasSelectReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jScrollColumnasSelectReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCuentaBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCuentaBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jLabelRelacionesSelectReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCuentaBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCuentaBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCuentaBanco=new JScrollPane(this.jListRelacionesSelectReporteTipoCuentaBanco);
			
			this.jScrollRelacionesSelectReporteTipoCuentaBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jListRelacionesSelectReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jScrollRelacionesSelectReporteTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCuentaBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCuentaBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCuentaBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCuentaBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCuentaBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jLabelGenerarExcelReporteDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco.setToolTipText("Generar EXCEL"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jComboBoxTiposReportesDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jLabelTiposArchivoReporteDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCuentaBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCuentaBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCuentaBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCuentaBanco.setToolTipText("Generar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jButtonGenerarReporteDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCuentaBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCuentaBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCuentaBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCuentaBanco.setToolTipText("Cancelar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBanco.add(this.jButtonCerrarReporteDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCuentaBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCuentaBanco= new JScrollPane(jPanelReporteDinamicoTipoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCuentaBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCuentaBanco);
		this.jInternalFrameReporteDinamicoTipoCuentaBanco.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCuentaBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCuentaBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCuentaBanco.setName("jPanelImportacionTipoCuentaBanco"); 
		
		this.jPanelImportacionTipoCuentaBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCuentaBanco.setLayout(gridaBagLayoutImportacionTipoCuentaBanco);
		
		
		this.jInternalFrameImportacionTipoCuentaBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCuentaBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCuentaBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCuentaBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCuentaBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCuentaBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCuentaBanco = new JLabelMe();

		this.jLabelArchivoImportacionTipoCuentaBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaBanco.add(this.jLabelArchivoImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCuentaBanco = new JFileChooser();		
		this.jFileChooserImportacionTipoCuentaBanco.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCuentaBanco = new JButtonMe();
		this.jButtonAbrirImportacionTipoCuentaBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCuentaBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCuentaBanco.setToolTipText("Generar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBanco.add(this.jButtonAbrirImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCuentaBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCuentaBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaBanco.add(this.jLabelPathArchivoImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCuentaBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCuentaBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBanco.add(this.jTextFieldPathArchivoImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCuentaBanco = new JButtonMe();
		this.jButtonGenerarImportacionTipoCuentaBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCuentaBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCuentaBanco.setToolTipText("Generar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBanco.add(this.jButtonGenerarImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCuentaBanco = new JButtonMe();
		this.jButtonCerrarImportacionTipoCuentaBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCuentaBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCuentaBanco.setToolTipText("Cancelar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBanco.add(this.jButtonCerrarImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCuentaBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCuentaBanco= new JScrollPane(jPanelImportacionTipoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCuentaBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCuentaBanco);
		this.jInternalFrameImportacionTipoCuentaBanco.getContentPane().add(this.jScrollPanelImportacionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCuentaBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCuentaBanco = new JButtonMe();
			this.jButtonAbrirOrderByTipoCuentaBanco.setText("Orden");
			this.jButtonAbrirOrderByTipoCuentaBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCuentaBanco";
			inputMap = this.jButtonAbrirOrderByTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCuentaBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCuentaBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCuentaBanco.setName("jPanelOrderByTipoCuentaBanco"); 
			
			this.jPanelOrderByTipoCuentaBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCuentaBanco.setLayout(gridaBagLayoutOrderByTipoCuentaBanco);
			
			
			this.jTableDatosTipoCuentaBancoOrderBy = new JTableMe();        
			this.jTableDatosTipoCuentaBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCuentaBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCuentaBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCuentaBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCuentaBancoOrderBy.setViewportView(this.jTableDatosTipoCuentaBancoOrderBy);
			this.jTableDatosTipoCuentaBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCuentaBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCuentaBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCuentaBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCuentaBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCuentaBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCuentaBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCuentaBanco.setTitle("Orden");
			this.jInternalFrameOrderByTipoCuentaBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCuentaBanco.setResizable(true);
			this.jInternalFrameOrderByTipoCuentaBanco.setClosable(true);
			this.jInternalFrameOrderByTipoCuentaBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCuentaBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCuentaBanco.ipady =150;
				
			this.jPanelOrderByTipoCuentaBanco.add(jScrollPanelDatosTipoCuentaBancoOrderBy, this.gridBagConstraintsTipoCuentaBanco);//this.jTableDatosTipoCuentaBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCuentaBanco = new JButtonMe();
			this.jButtonCerrarOrderByTipoCuentaBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCuentaBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCuentaBanco.setToolTipText("Cancelar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCuentaBanco.add(this.jButtonCerrarOrderByTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCuentaBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCuentaBanco= new JScrollPane(jPanelOrderByTipoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCuentaBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCuentaBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCuentaBanco);
			
			this.jInternalFrameOrderByTipoCuentaBanco.getContentPane().add(this.jScrollPanelOrderByTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
		
		} else {
			this.jButtonAbrirOrderByTipoCuentaBanco = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocuentabancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCuentaBanco.getRowHeight();//TipoCuentaBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.isSelected()) {
					iHeightTable=TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaBanco.isSelected()) {
					iHeightTable=TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCuentaBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCuentaBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCuentaBanco!=null && this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCuentaBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCuentaBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCuentaBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCuentaBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocuentabancoLogic.getTipoCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCuentaBanco> TraerTipoCuentaBancoBeans(List<TipoCuentaBanco> tipocuentabancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCuentaBanco tipocuentabanco:tipocuentabancos) {
					
				if(!(TipoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocuentabanco.setsDetalleGeneralEntityReporte(TipoCuentaBancoConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabanco));
										
						
					
					

					if(tipocuentabanco.getReferenciaBancarias()!=null && Funciones.existeClass(classes,ReferenciaBancaria.class)) {
						try{tipocuentabanco.setreferenciabancariasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaBancariaJInternalFrame.TraerReferenciaBancariaBeans(tipocuentabanco.getReferenciaBancarias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocuentabanco.getTipoCuentaBancoGenerals()!=null && Funciones.existeClass(classes,TipoCuentaBancoGeneral.class)) {
						try{tipocuentabanco.settipocuentabancogeneralsDescripcionReporte(new JRBeanCollectionDataSource(TipoCuentaBancoGeneralJInternalFrame.TraerTipoCuentaBancoGeneralBeans(tipocuentabanco.getTipoCuentaBancoGenerals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocuentabanco.setsDetalleGeneralEntityReporte(tipocuentabanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocuentabancobeans.add(tipocuentabancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocuentabancos;
    }
	//PARA REPORTES FIN
}
