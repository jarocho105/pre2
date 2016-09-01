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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.tesoreria.util.TipoCuentaBancoGlobalConstantesFunciones;

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
public class TipoCuentaBancoGlobalJInternalFrame extends TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCuentaBancoGlobal;
	
	protected JMenuBar jmenuBarTipoCuentaBancoGlobal;
	
	protected JMenu jmenuTipoCuentaBancoGlobal;
	protected JMenu jmenuDatosTipoCuentaBancoGlobal;
	protected JMenu jmenuArchivoTipoCuentaBancoGlobal;
	protected JMenu jmenuAccionesTipoCuentaBancoGlobal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaBancoGlobal;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaBancoGlobal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCuentaBancoGlobal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCuentaBancoGlobal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCuentaBancoGlobal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCuentaBancoGlobal> tipocuentabancoglobals;		
	public List<TipoCuentaBancoGlobal> tipocuentabancoglobalsEliminados;	
	public List<TipoCuentaBancoGlobal> tipocuentabancoglobalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCuentaBancoGlobal;		
	protected JButton jButtonAbrirOrderByTipoCuentaBancoGlobal;
	
	
	//protected JPanel jPanelOrderByTipoCuentaBancoGlobal;
	//public JScrollPane jScrollPanelOrderByTipoCuentaBancoGlobal;	
	//protected JButton jButtonCerrarOrderByTipoCuentaBancoGlobal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaBancoGlobal;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCuentaBancoGlobalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollPanelImportacionTipoCuentaBancoGlobal;
	
	
	
	protected JPanel jPanelAccionesTipoCuentaBancoGlobal;
	
    protected JPanel jPanelPaginacionTipoCuentaBancoGlobal;
    protected JPanel jPanelParametrosReportesTipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosReportesAccionesTipoCuentaBancoGlobal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosAuxiliar2TipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosAuxiliar3TipoCuentaBancoGlobal;
	protected JPanel jPanelParametrosAuxiliar4TipoCuentaBancoGlobal;
	//protected JPanel jPanelParametrosAuxiliar5TipoCuentaBancoGlobal;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCuentaBancoGlobal;
	//protected JPanel jPanelImportacionTipoCuentaBancoGlobal;
	
	
	public JTable jTableDatosTipoCuentaBancoGlobal;
	
	
	
	//public JTable jTableDatosTipoCuentaBancoGlobalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCuentaBancoGlobal;
	protected JButton jButtonDuplicarTipoCuentaBancoGlobal;
	protected JButton jButtonCopiarTipoCuentaBancoGlobal;
	protected JButton jButtonVerFormTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoRelacionesTipoCuentaBancoGlobal;
	protected JButton jButtonModificarTipoCuentaBancoGlobal;
	
    protected JButton jButtonGuardarCambiosTablaTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarTipoCuentaBancoGlobal;
	
	
	protected JButton jButtonRecargarInformacionTipoCuentaBancoGlobal;
	protected JButton jButtonProcesarInformacionTipoCuentaBancoGlobal;
	
	
	protected JButton jButtonAnterioresTipoCuentaBancoGlobal;
	protected JButton jButtonSiguientesTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal;
	//protected JButton jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCuentaBancoGlobal;
	//protected JButton jButtonGenerarImportacionTipoCuentaBancoGlobal;
	//protected JButton jButtonCerrarImportacionTipoCuentaBancoGlobal;
	//protected JFileChooser jFileChooserImportacionTipoCuentaBancoGlobal;
	//protected File fileImportacionTipoCuentaBancoGlobal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonDuplicarToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonCopiarToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonVerFormToolBarTipoCuentaBancoGlobal;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarToolBarTipoCuentaBancoGlobal;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonAnterioresToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonSiguientesToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonAbrirOrderByToolBarTipoCuentaBancoGlobal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDuplicarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCuentaBancoGlobal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCopiarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemVerFormTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCerrarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemAnterioresTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemSiguientesTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemAbrirOrderByTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaBancoGlobal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaBancoGlobal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxSeleccionadosTipoCuentaBancoGlobal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCuentaBancoGlobal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCuentaBancoGlobal;
	protected JTextField jTextFieldValorCampoGeneralTipoCuentaBancoGlobal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCuentaBancoGlobal;
	//public JList<Reporte> jListColumnasSelectReporteTipoCuentaBancoGlobal;
	//public JScrollPane jScrollColumnasSelectReporteTipoCuentaBancoGlobal;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCuentaBancoGlobal;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCuentaBancoGlobal;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCuentaBancoGlobal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCuentaBancoGlobal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal;
	
		
	//public JLabel jLabelArchivoImportacionTipoCuentaBancoGlobal;	
	//public JLabel jLabelPathArchivoImportacionTipoCuentaBancoGlobal;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCuentaBancoGlobal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCuentaBancoGlobal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCuentaBancoGlobal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCuentaBancoGlobal;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCuentaBancoGlobal;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCuentaBancoGlobal;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCuentaBancoGlobal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCuentaBancoGlobal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCuentaBancoGlobal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoCuentaBancoGlobalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCuentaBancoGlobal)	{
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal = jButtonRecargarInformacionTipoCuentaBancoGlobal;
	}
	
	public JButton getjButtonProcesarInformacionTipoCuentaBancoGlobal() {
		return this.jButtonProcesarInformacionTipoCuentaBancoGlobal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaBancoGlobal)	{
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal = jButtonProcesarInformacionTipoCuentaBancoGlobal;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCuentaBancoGlobal() {
		return this.jButtonRecargarInformacionTipoCuentaBancoGlobal;
	}
	
	
	public List<TipoCuentaBancoGlobal> gettipocuentabancoglobals() {
		return this.tipocuentabancoglobals;
	}

	public void settipocuentabancoglobals(List<TipoCuentaBancoGlobal> tipocuentabancoglobals) {
		this.tipocuentabancoglobals = tipocuentabancoglobals;
	}
	
	public List<TipoCuentaBancoGlobal> gettipocuentabancoglobalsAux() {
		return this.tipocuentabancoglobalsAux;
	}

	public void settipocuentabancoglobalsAux(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsAux) {
		this.tipocuentabancoglobalsAux = tipocuentabancoglobalsAux;
	}
	
	public List<TipoCuentaBancoGlobal> gettipocuentabancoglobalsEliminados() {
		return this.tipocuentabancoglobalsEliminados;
	}

	public void setTipoCuentaBancoGlobalsEliminados(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsEliminados) {
		this.tipocuentabancoglobalsEliminados = tipocuentabancoglobalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCuentaBancoGlobal() {
		return jComboBoxTiposSeleccionarTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposSeleccionarTipoCuentaBancoGlobal) {
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal = jComboBoxTiposSeleccionarTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCuentaBancoGlobal() {
		return jTextFieldValorCampoGeneralTipoCuentaBancoGlobal;
	}

	public void setjTextFieldValorCampoGeneralTipoCuentaBancoGlobal(
			JTextField jTextFieldValorCampoGeneralTipoCuentaBancoGlobal) {
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal = jTextFieldValorCampoGeneralTipoCuentaBancoGlobal;
	}

	public void setBorderResaltarValorCampoGeneralTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCuentaBancoGlobal() {
		return this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal;
	}

	public void setjCheckBoxSeleccionarTodosTipoCuentaBancoGlobal(
			JCheckBox jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal) {
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal = jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal;
	}

	public void setBorderResaltarSeleccionarTodosTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCuentaBancoGlobal() {
		return this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal;
	}

	public void setjCheckBoxSeleccionadosTipoCuentaBancoGlobal(
			JCheckBox jCheckBoxSeleccionadosTipoCuentaBancoGlobal) {
		this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal = jCheckBoxSeleccionadosTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarSeleccionadosTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal = jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposReportesTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposReportesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal = jComboBoxTiposReportesTipoCuentaBancoGlobal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal() {
	//	return jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal) {
	//	this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal = jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal = jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal;
	//}
	
	public void setBorderResaltarTiposReportesTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal = jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposPaginacionTipoCuentaBancoGlobal) {
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal = jComboBoxTiposPaginacionTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposAccionesTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal = jComboBoxTiposRelacionesTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposAccionesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal = jComboBoxTiposAccionesTipoCuentaBancoGlobal;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCuentaBancoGlobal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal() {
	//	return jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal) {
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal = jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCuentaBancoGlobal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCuentaBancoGlobal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal .setBorder(borderResaltar);		
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
		this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
		
		this.tipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaBancoGlobalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Banco Global MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCuentaBancoGlobal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"nuevo","nuevo","Nuevo"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"duplicar","duplicar","Duplicar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"copiar","copiar","Copiar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"ver_form","ver_form","Ver"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"recargar","recargar","Recargar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,
							"cerrar","cerrar","Salir"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal;
			
				this.jButtonProcesarInformacionToolBarTipoCuentaBancoGlobal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCuentaBancoGlobal;
				
		//protected JButton jButtonModificarToolBarTipoCuentaBancoGlobal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCuentaBancoGlobal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCuentaBancoGlobal=new JMenuMe("General");
		this.jmenuArchivoTipoCuentaBancoGlobal=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCuentaBancoGlobal=new JMenuMe("Acciones");
		this.jmenuDatosTipoCuentaBancoGlobal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaBancoGlobal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaBancoGlobal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaBancoGlobal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCuentaBancoGlobal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCuentaBancoGlobal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCuentaBancoGlobal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCuentaBancoGlobal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCuentaBancoGlobal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCuentaBancoGlobal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCuentaBancoGlobal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCuentaBancoGlobal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCuentaBancoGlobal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaBancoGlobal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaBancoGlobal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaBancoGlobal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCuentaBancoGlobal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCuentaBancoGlobal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCuentaBancoGlobal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCuentaBancoGlobal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCuentaBancoGlobal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCuentaBancoGlobal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCuentaBancoGlobal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCuentaBancoGlobal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCuentaBancoGlobal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCuentaBancoGlobal.add(this.jMenuItemCerrarTipoCuentaBancoGlobal);
			
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemNuevoTipoCuentaBancoGlobal);
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal);
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal);
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal);		
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemDuplicarTipoCuentaBancoGlobal);		
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemCopiarTipoCuentaBancoGlobal);		
			this.jmenuAccionesTipoCuentaBancoGlobal.add(this.jMenuItemVerFormTipoCuentaBancoGlobal);		
			
			this.jmenuDatosTipoCuentaBancoGlobal.add(this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal);				
			this.jmenuDatosTipoCuentaBancoGlobal.add(this.jMenuItemAnterioresTipoCuentaBancoGlobal);				
			this.jmenuDatosTipoCuentaBancoGlobal.add(this.jMenuItemSiguientesTipoCuentaBancoGlobal);				
			this.jmenuDatosTipoCuentaBancoGlobal.add(this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal);				
			this.jmenuDatosTipoCuentaBancoGlobal.add(this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCuentaBancoGlobal.add(this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCuentaBancoGlobal.add(this.jmenuArchivoTipoCuentaBancoGlobal);		
			this.jmenuBarTipoCuentaBancoGlobal.add(this.jmenuAccionesTipoCuentaBancoGlobal);		
			this.jmenuBarTipoCuentaBancoGlobal.add(this.jmenuDatosTipoCuentaBancoGlobal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCuentaBancoGlobal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCuentaBancoGlobal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoCuentaBancoGlobal = new TipoCuentaBancoGlobalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cuenta Banco Global DATOS");
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal = new TipoCuentaBancoGlobalDetalleFormJInternalFrame(jDesktopPane,this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones(),this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal = null;//new TipoCuentaBancoGlobalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaBancoGlobal= new GridBagLayout();
		
		
		this.jTableDatosTipoCuentaBancoGlobal = new JTableMe();      
		
		String sToolTipTipoCuentaBancoGlobal="";
		sToolTipTipoCuentaBancoGlobal=TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaBancoGlobal+="(Tesoreria.TipoCuentaBancoGlobal)";
		}
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaBancoGlobal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCuentaBancoGlobal.setToolTipText(sToolTipTipoCuentaBancoGlobal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCuentaBancoGlobal);
		this.jTableDatosTipoCuentaBancoGlobal.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCuentaBancoGlobal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCuentaBancoGlobal.setRowSelectionAllowed(true);
		this.jTableDatosTipoCuentaBancoGlobal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonDuplicarTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCopiarTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonVerFormTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarTipoCuentaBancoGlobal = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaBancoGlobal = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Banco Global";
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Globals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaBancoGlobal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaBancoGlobal.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaBancoGlobal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal=new ReporteDinamicoJInternalFrame(TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCuentaBancoGlobal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCuentaBancoGlobal=new ImportacionJInternalFrame(TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCuentaBancoGlobal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCuentaBancoGlobal = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCuentaBancoGlobal.setText("Orden");
		this.jButtonAbrirOrderByTipoCuentaBancoGlobal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaBancoGlobal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGlobal,false,this);
			
			//this.cargarOrderByTipoCuentaBancoGlobal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGlobal,true,this);
			
			//this.cargarOrderByTipoCuentaBancoGlobal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCuentaBancoGlobal.setText("Nuevo");
		this.jButtonDuplicarTipoCuentaBancoGlobal.setText("Duplicar");
		this.jButtonCopiarTipoCuentaBancoGlobal.setText("Copiar");
		this.jButtonVerFormTipoCuentaBancoGlobal.setText("Ver");
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.setText("Guardar");
		this.jButtonCerrarTipoCuentaBancoGlobal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaBancoGlobal,"nuevo_button","Nuevo",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCuentaBancoGlobal,"duplicar_button","Duplicar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCuentaBancoGlobal,"copiar_button","Copiar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCuentaBancoGlobal,"ver_form","Ver",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCuentaBancoGlobal,"nuevorelaciones_button","Nuevo Rel",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal,"guardarcambiostabla_button","Guardar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaBancoGlobal,"cerrar_button","Salir",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCuentaBancoGlobal.setToolTipText("Nuevo"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCuentaBancoGlobal.setToolTipText("Duplicar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCuentaBancoGlobal.setToolTipText("Copiar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCuentaBancoGlobal.setToolTipText("Ver"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.setToolTipText("Nuevo Rel"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.setToolTipText("Guardar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaBancoGlobal.setToolTipText("Salir"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaBancoGlobal"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCuentaBancoGlobal";
		inputMap = this.jButtonDuplicarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCuentaBancoGlobal"));
		
		//COPIAR
		sMapKey = "CopiarTipoCuentaBancoGlobal";
		inputMap = this.jButtonCopiarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCuentaBancoGlobal"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCuentaBancoGlobal";
		inputMap = this.jButtonVerFormTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCuentaBancoGlobal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCuentaBancoGlobal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCuentaBancoGlobal";
		inputMap = this.jButtonModificarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCuentaBancoGlobal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaBancoGlobal";
		inputMap = this.jButtonCerrarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaBancoGlobal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaBancoGlobal";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaBancoGlobal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCuentaBancoGlobal.setName("jPanelParametrosReportesTipoCuentaBancoGlobal"); 
		
		this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal.setName("jPanelParametrosReportesAccionesTipoCuentaBancoGlobal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.setText("Recargar");
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.setToolTipText("Recargar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCuentaBancoGlobal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal.setText("Procesar");
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal.setToolTipText("Procesar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCuentaBancoGlobal = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaBancoGlobal.setText("Acciones");		
		this.jLabelAccionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCuentaBancoGlobal = new JButtonMe();
		//this.jButtonAnterioresTipoCuentaBancoGlobal.setText("<<");
        this.jButtonAnterioresTipoCuentaBancoGlobal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCuentaBancoGlobal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCuentaBancoGlobal = new JButtonMe();
		//this.jButtonSiguientesTipoCuentaBancoGlobal.setText(">>");
        this.jButtonSiguientesTipoCuentaBancoGlobal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCuentaBancoGlobal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal,"nuevoguardarcambios_button","Nue",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCuentaBancoGlobal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCuentaBancoGlobal";
		inputMap = this.jButtonRecargarInformacionTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCuentaBancoGlobal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCuentaBancoGlobal";
		inputMap = this.jButtonSiguientesTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCuentaBancoGlobal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCuentaBancoGlobal";
		inputMap = this.jButtonAnterioresTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCuentaBancoGlobal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCuentaBancoGlobal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(this.getWidth(),TipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(this.getWidth(),TipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(this.getWidth(),TipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaBancoGlobalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCuentaBancoGlobal = new GridBagLayout();

			this.jPanelPaginacionTipoCuentaBancoGlobal.setLayout(gridaBagLayoutPaginacionTipoCuentaBancoGlobal);						
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonAnterioresTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
					
						
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
			
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
						
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonSiguientesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonNuevoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonNuevoRelacionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			}
			
			
			if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			}
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonDuplicarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonCopiarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonVerFormTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 1;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCuentaBancoGlobal.add(this.jButtonCerrarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
		
		
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCuentaBancoGlobal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCuentaBancoGlobal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCuentaBancoGlobal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.setLayout(gridaBagParametrosReportesTipoCuentaBancoGlobal);
			this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal.setLayout(gridaBagParametrosReportesAccionesTipoCuentaBancoGlobal);
			
			
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar1TipoCuentaBancoGlobal);
			this.jPanelParametrosAuxiliar2TipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar2TipoCuentaBancoGlobal);
			this.jPanelParametrosAuxiliar3TipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar3TipoCuentaBancoGlobal);
			this.jPanelParametrosAuxiliar4TipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar4TipoCuentaBancoGlobal);
			//this.jPanelParametrosAuxiliar5TipoCuentaBancoGlobal.setLayout(gridaBagParametrosAuxiliar2TipoCuentaBancoGlobal);			
			
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jButtonRecargarInformacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGlobal.add(this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGlobal.add(this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaBancoGlobal.add(this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar1TipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCuentaBancoGlobal.add(this.jComboBoxTiposReportesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar4TipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jComboBoxTiposReportesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jCheckBoxGenerarReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar2TipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jLabelAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jButtonAbrirOrderByTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
			
			
			/*
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaBancoGlobal.add(this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);															
				
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaBancoGlobal.add(this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jPanelParametrosAuxiliar3TipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
				
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.add(this.jComboBoxTiposAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCuentaBancoGlobal = new GridBagLayout();

			this.jScrollPanelDatosTipoCuentaBancoGlobal.setLayout(gridaBagLayoutDatosTipoCuentaBancoGlobal);
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
			
			this.jScrollPanelDatosTipoCuentaBancoGlobal.add(this.jTableDatosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setViewportView(this.jTableDatosTipoCuentaBancoGlobal);
		this.jTableDatosTipoCuentaBancoGlobal.setFillsViewportHeight(true);
		this.jTableDatosTipoCuentaBancoGlobal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaBancoGlobal= new GridBagLayout();
		this.jPanelAccionesTipoCuentaBancoGlobal.setLayout(gridaBagLayoutAccionesTipoCuentaBancoGlobal);
		
		
		/*	
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
			
		this.jPanelAccionesTipoCuentaBancoGlobal.add(this.jButtonNuevoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaBancoGlobal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;		
		//this.gridBagConstraintsTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCuentaBancoGlobal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);								
		
		
		/*
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		*/		
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaBancoGlobal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
				
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCuentaBancoGlobal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaBancoGlobal = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCuentaBancoGlobal.setLayout(gridaBagLayoutBusquedasParametrosTipoCuentaBancoGlobal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
			
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
			
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCuentaBancoGlobal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCuentaBancoGlobal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.setName("jPanelReporteDinamicoTipoCuentaBancoGlobal"); 
		
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutReporteDinamicoTipoCuentaBancoGlobal);
		
		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Globals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCuentaBancoGlobal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jLabelColumnasSelectReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCuentaBancoGlobal = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCuentaBancoGlobal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCuentaBancoGlobal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal=new JScrollPane(this.jListColumnasSelectReporteTipoCuentaBancoGlobal);
			
			this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jListColumnasSelectReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCuentaBancoGlobal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jLabelRelacionesSelectReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCuentaBancoGlobal = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCuentaBancoGlobal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCuentaBancoGlobal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGlobal=new JScrollPane(this.jListRelacionesSelectReporteTipoCuentaBancoGlobal);
			
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGlobal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGlobal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGlobal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jListRelacionesSelectReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jScrollRelacionesSelectReporteTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCuentaBancoGlobal = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCuentaBancoGlobal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jLabelGenerarExcelReporteDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.setToolTipText("Generar EXCEL"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jComboBoxTiposReportesDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jLabelTiposArchivoReporteDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal.setToolTipText("Generar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaBancoGlobal.add(this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal= new JScrollPane(jPanelReporteDinamicoTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Globals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCuentaBancoGlobal);
		this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCuentaBancoGlobal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCuentaBancoGlobal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCuentaBancoGlobal.setName("jPanelImportacionTipoCuentaBancoGlobal"); 
		
		this.jPanelImportacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCuentaBancoGlobal.setLayout(gridaBagLayoutImportacionTipoCuentaBancoGlobal);
		
		
		this.jInternalFrameImportacionTipoCuentaBancoGlobal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCuentaBancoGlobal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCuentaBancoGlobal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaBancoGlobal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Globals"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelArchivoImportacionTipoCuentaBancoGlobal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaBancoGlobal.add(this.jLabelArchivoImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCuentaBancoGlobal = new JFileChooser();		
		this.jFileChooserImportacionTipoCuentaBancoGlobal.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonAbrirImportacionTipoCuentaBancoGlobal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCuentaBancoGlobal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCuentaBancoGlobal.setToolTipText("Generar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGlobal.add(this.jButtonAbrirImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCuentaBancoGlobal = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCuentaBancoGlobal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaBancoGlobal.add(this.jLabelPathArchivoImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGlobal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGlobal.add(this.jTextFieldPathArchivoImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGenerarImportacionTipoCuentaBancoGlobal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCuentaBancoGlobal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCuentaBancoGlobal.setToolTipText("Generar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGlobal.add(this.jButtonGenerarImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarImportacionTipoCuentaBancoGlobal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCuentaBancoGlobal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaBancoGlobal.add(this.jButtonCerrarImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCuentaBancoGlobal= new JScrollPane(jPanelImportacionTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCuentaBancoGlobal);
		this.jInternalFrameImportacionTipoCuentaBancoGlobal.getContentPane().add(this.jScrollPanelImportacionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCuentaBancoGlobal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal = new JButtonMe();
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal.setText("Orden");
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaBancoGlobal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCuentaBancoGlobal";
			inputMap = this.jButtonAbrirOrderByTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCuentaBancoGlobal"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCuentaBancoGlobal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCuentaBancoGlobal.setName("jPanelOrderByTipoCuentaBancoGlobal"); 
			
			this.jPanelOrderByTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCuentaBancoGlobal.setLayout(gridaBagLayoutOrderByTipoCuentaBancoGlobal);
			
			
			this.jTableDatosTipoCuentaBancoGlobalOrderBy = new JTableMe();        
			this.jTableDatosTipoCuentaBancoGlobalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCuentaBancoGlobalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCuentaBancoGlobalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCuentaBancoGlobalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCuentaBancoGlobalOrderBy.setViewportView(this.jTableDatosTipoCuentaBancoGlobalOrderBy);
			this.jTableDatosTipoCuentaBancoGlobalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCuentaBancoGlobalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCuentaBancoGlobal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCuentaBancoGlobal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCuentaBancoGlobal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCuentaBancoGlobal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setTitle("Orden");
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setResizable(true);
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setClosable(true);
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Globals"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCuentaBancoGlobal.ipady =150;
				
			this.jPanelOrderByTipoCuentaBancoGlobal.add(jScrollPanelDatosTipoCuentaBancoGlobalOrderBy, this.gridBagConstraintsTipoCuentaBancoGlobal);//this.jTableDatosTipoCuentaBancoGlobalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCuentaBancoGlobal = new JButtonMe();
			this.jButtonCerrarOrderByTipoCuentaBancoGlobal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCuentaBancoGlobal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCuentaBancoGlobal.add(this.jButtonCerrarOrderByTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCuentaBancoGlobal = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCuentaBancoGlobal= new JScrollPane(jPanelOrderByTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCuentaBancoGlobal);
			
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getContentPane().add(this.jScrollPanelOrderByTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
		
		} else {
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCuentaBancoGlobal.getRowHeight();//TipoCuentaBancoGlobalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.isSelected()) {
					iHeightTable=TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaBancoGlobal.isSelected()) {
					iHeightTable=TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaBancoGlobalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCuentaBancoGlobal!=null && this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancoglobals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCuentaBancoGlobal> TraerTipoCuentaBancoGlobalBeans(List<TipoCuentaBancoGlobal> tipocuentabancoglobals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCuentaBancoGlobal tipocuentabancoglobal:tipocuentabancoglobals) {
					
				if(!(TipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocuentabancoglobal.setsDetalleGeneralEntityReporte(TipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobal));
										
						
					
					

					if(tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals()!=null && Funciones.existeClass(classes,BancoTipoCuentaBancoGlobal.class)) {
						try{tipocuentabancoglobal.setbancotipocuentabancoglobalsDescripcionReporte(new JRBeanCollectionDataSource(BancoTipoCuentaBancoGlobalJInternalFrame.TraerBancoTipoCuentaBancoGlobalBeans(tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocuentabancoglobal.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{tipocuentabancoglobal.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(tipocuentabancoglobal.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocuentabancoglobal.getPoliticasClientes()!=null && Funciones.existeClass(classes,PoliticasCliente.class)) {
						try{tipocuentabancoglobal.setpoliticasclientesDescripcionReporte(new JRBeanCollectionDataSource(PoliticasClienteJInternalFrame.TraerPoliticasClienteBeans(tipocuentabancoglobal.getPoliticasClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocuentabancoglobal.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{tipocuentabancoglobal.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(tipocuentabancoglobal.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocuentabancoglobal.getParametroTesoreriaDefectos()!=null && Funciones.existeClass(classes,ParametroTesoreriaDefecto.class)) {
						try{tipocuentabancoglobal.setparametrotesoreriadefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroTesoreriaDefectoJInternalFrame.TraerParametroTesoreriaDefectoBeans(tipocuentabancoglobal.getParametroTesoreriaDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocuentabancoglobal.setsDetalleGeneralEntityReporte(tipocuentabancoglobal.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocuentabancoglobalbeans.add(tipocuentabancoglobalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocuentabancoglobals;
    }
	//PARA REPORTES FIN
}
