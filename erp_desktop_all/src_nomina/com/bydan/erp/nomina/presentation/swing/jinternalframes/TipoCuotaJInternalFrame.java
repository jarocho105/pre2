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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoCuotaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoCuotaJInternalFrame extends TipoCuotaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCuota;
	
	protected JMenuBar jmenuBarTipoCuota;
	
	protected JMenu jmenuTipoCuota;
	protected JMenu jmenuDatosTipoCuota;
	protected JMenu jmenuArchivoTipoCuota;
	protected JMenu jmenuAccionesTipoCuota;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuota;	
	protected GridBagConstraints gridBagConstraintsTipoCuota;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCuotaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCuota;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCuota;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCuota;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCuotaSessionBean tipocuotaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCuota> tipocuotas;		
	public List<TipoCuota> tipocuotasEliminados;	
	public List<TipoCuota> tipocuotasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCuota;		
	protected JButton jButtonAbrirOrderByTipoCuota;
	
	
	//protected JPanel jPanelOrderByTipoCuota;
	//public JScrollPane jScrollPanelOrderByTipoCuota;	
	//protected JButton jButtonCerrarOrderByTipoCuota;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCuotaLogic tipocuotaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCuota;
	public JScrollPane jScrollPanelDatosEdicionTipoCuota;
	public JScrollPane jScrollPanelDatosGeneralTipoCuota;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCuotaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCuota;
	//public JScrollPane jScrollPanelImportacionTipoCuota;
	
	
	
	protected JPanel jPanelAccionesTipoCuota;
	
    protected JPanel jPanelPaginacionTipoCuota;
    protected JPanel jPanelParametrosReportesTipoCuota;
	protected JPanel jPanelParametrosReportesAccionesTipoCuota;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCuota;
	protected JPanel jPanelParametrosAuxiliar2TipoCuota;
	protected JPanel jPanelParametrosAuxiliar3TipoCuota;
	protected JPanel jPanelParametrosAuxiliar4TipoCuota;
	//protected JPanel jPanelParametrosAuxiliar5TipoCuota;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCuota;
	//protected JPanel jPanelImportacionTipoCuota;
	
	
	public JTable jTableDatosTipoCuota;
	
	
	
	//public JTable jTableDatosTipoCuotaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCuota;
	protected JButton jButtonDuplicarTipoCuota;
	protected JButton jButtonCopiarTipoCuota;
	protected JButton jButtonVerFormTipoCuota;
	protected JButton jButtonNuevoRelacionesTipoCuota;
	protected JButton jButtonModificarTipoCuota;
	
    protected JButton jButtonGuardarCambiosTablaTipoCuota;
	protected JButton jButtonCerrarTipoCuota;
	
	
	protected JButton jButtonRecargarInformacionTipoCuota;
	protected JButton jButtonProcesarInformacionTipoCuota;
	
	
	protected JButton jButtonAnterioresTipoCuota;
	protected JButton jButtonSiguientesTipoCuota;
	protected JButton jButtonNuevoGuardarCambiosTipoCuota;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCuota;
	//protected JButton jButtonCerrarReporteDinamicoTipoCuota;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCuota;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCuota;
	//protected JButton jButtonGenerarImportacionTipoCuota;
	//protected JButton jButtonCerrarImportacionTipoCuota;
	//protected JFileChooser jFileChooserImportacionTipoCuota;
	//protected File fileImportacionTipoCuota;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuota;
	protected JButton jButtonDuplicarToolBarTipoCuota;
	protected JButton jButtonNuevoRelacionesToolBarTipoCuota;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCuota;
	protected JButton jButtonCopiarToolBarTipoCuota;
	protected JButton jButtonVerFormToolBarTipoCuota;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCuota;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuota;
	protected JButton jButtonCerrarToolBarTipoCuota;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCuota;
	protected JButton jButtonProcesarInformacionToolBarTipoCuota;
	protected JButton jButtonAnterioresToolBarTipoCuota;
	protected JButton jButtonSiguientesToolBarTipoCuota;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCuota;
	protected JButton jButtonAbrirOrderByToolBarTipoCuota;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuota;
	protected JMenuItem jMenuItemDuplicarTipoCuota;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCuota;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCuota;
	protected JMenuItem jMenuItemCopiarTipoCuota;
	protected JMenuItem jMenuItemVerFormTipoCuota;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuota;
	protected JMenuItem jMenuItemCerrarTipoCuota;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuota;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCuota;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuota;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCuota;
	protected JMenuItem jMenuItemProcesarInformacionTipoCuota;
	protected JMenuItem jMenuItemAnterioresTipoCuota;
	protected JMenuItem jMenuItemSiguientesTipoCuota;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuota;
	protected JMenuItem jMenuItemAbrirOrderByTipoCuota;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuota;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuota;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCuota;
	protected JCheckBox jCheckBoxSeleccionadosTipoCuota;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCuota;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCuota;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuota;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCuota;
	protected JTextField jTextFieldValorCampoGeneralTipoCuota;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCuota;
	//public JList<Reporte> jListColumnasSelectReporteTipoCuota;
	//public JScrollPane jScrollColumnasSelectReporteTipoCuota;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCuota;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCuota;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCuota;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCuota;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCuota;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCuota;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCuota;
	
		
	//public JLabel jLabelArchivoImportacionTipoCuota;	
	//public JLabel jLabelPathArchivoImportacionTipoCuota;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCuota;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCuota;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCuota;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCuota;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCuota;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCuota;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCuota;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCuota;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCuota;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCuota;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCuota;
	
	
	
	
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
	public TipoCuotaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCuota)	{
		this.jButtonRecargarInformacionTipoCuota = jButtonRecargarInformacionTipoCuota;
	}
	
	public JButton getjButtonProcesarInformacionTipoCuota() {
		return this.jButtonProcesarInformacionTipoCuota;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuota)	{
		this.jButtonProcesarInformacionTipoCuota = jButtonProcesarInformacionTipoCuota;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCuota() {
		return this.jButtonRecargarInformacionTipoCuota;
	}
	
	
	public List<TipoCuota> gettipocuotas() {
		return this.tipocuotas;
	}

	public void settipocuotas(List<TipoCuota> tipocuotas) {
		this.tipocuotas = tipocuotas;
	}
	
	public List<TipoCuota> gettipocuotasAux() {
		return this.tipocuotasAux;
	}

	public void settipocuotasAux(List<TipoCuota> tipocuotasAux) {
		this.tipocuotasAux = tipocuotasAux;
	}
	
	public List<TipoCuota> gettipocuotasEliminados() {
		return this.tipocuotasEliminados;
	}

	public void setTipoCuotasEliminados(List<TipoCuota> tipocuotasEliminados) {
		this.tipocuotasEliminados = tipocuotasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCuota() {
		return jComboBoxTiposSeleccionarTipoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCuota(
			JComboBox jComboBoxTiposSeleccionarTipoCuota) {
		this.jComboBoxTiposSeleccionarTipoCuota = jComboBoxTiposSeleccionarTipoCuota;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCuota .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCuota() {
		return jTextFieldValorCampoGeneralTipoCuota;
	}

	public void setjTextFieldValorCampoGeneralTipoCuota(
			JTextField jTextFieldValorCampoGeneralTipoCuota) {
		this.jTextFieldValorCampoGeneralTipoCuota = jTextFieldValorCampoGeneralTipoCuota;
	}

	public void setBorderResaltarValorCampoGeneralTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCuota .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCuota() {
		return this.jCheckBoxSeleccionarTodosTipoCuota;
	}

	public void setjCheckBoxSeleccionarTodosTipoCuota(
			JCheckBox jCheckBoxSeleccionarTodosTipoCuota) {
		this.jCheckBoxSeleccionarTodosTipoCuota = jCheckBoxSeleccionarTodosTipoCuota;
	}

	public void setBorderResaltarSeleccionarTodosTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCuota .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCuota() {
		return this.jCheckBoxSeleccionadosTipoCuota;
	}

	public void setjCheckBoxSeleccionadosTipoCuota(
			JCheckBox jCheckBoxSeleccionadosTipoCuota) {
		this.jCheckBoxSeleccionadosTipoCuota = jCheckBoxSeleccionadosTipoCuota;
	}
	
	public void setBorderResaltarSeleccionadosTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCuota .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCuota() {
		return this.jComboBoxTiposArchivosReportesTipoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCuota(
			JComboBox jComboBoxTiposArchivosReportesTipoCuota) {
		this.jComboBoxTiposArchivosReportesTipoCuota = jComboBoxTiposArchivosReportesTipoCuota;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCuota() {
		return this.jComboBoxTiposReportesTipoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCuota(
			JComboBox jComboBoxTiposReportesTipoCuota) {
		this.jComboBoxTiposReportesTipoCuota = jComboBoxTiposReportesTipoCuota;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCuota() {
	//	return jComboBoxTiposReportesDinamicoTipoCuota;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCuota(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCuota) {
	//	this.jComboBoxTiposReportesDinamicoTipoCuota = jComboBoxTiposReportesDinamicoTipoCuota;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCuota() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCuota;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCuota(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuota) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCuota = jComboBoxTiposArchivosReportesDinamicoTipoCuota;
	//}
	
	public void setBorderResaltarTiposReportesTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCuota() {
		return this.jComboBoxTiposGraficosReportesTipoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCuota(
			JComboBox jComboBoxTiposGraficosReportesTipoCuota) {
		this.jComboBoxTiposGraficosReportesTipoCuota = jComboBoxTiposGraficosReportesTipoCuota;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCuota() {
		return this.jComboBoxTiposPaginacionTipoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCuota(
			JComboBox jComboBoxTiposPaginacionTipoCuota) {
		this.jComboBoxTiposPaginacionTipoCuota = jComboBoxTiposPaginacionTipoCuota;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCuota() {
		return this.jComboBoxTiposRelacionesTipoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuota() {
		return this.jComboBoxTiposAccionesTipoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuota(
			JComboBox jComboBoxTiposRelacionesTipoCuota) {
		this.jComboBoxTiposRelacionesTipoCuota = jComboBoxTiposRelacionesTipoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuota(
			JComboBox jComboBoxTiposAccionesTipoCuota) {
		this.jComboBoxTiposAccionesTipoCuota = jComboBoxTiposAccionesTipoCuota;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCuota .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCuota .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCuota() {
	//	return jCheckBoxConGraficoDinamicoTipoCuota;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCuota(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCuota) {
	//	this.jCheckBoxConGraficoDinamicoTipoCuota = jCheckBoxConGraficoDinamicoTipoCuota;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCuota() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCuota.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCuota .setBorder(borderResaltar);		
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
		this.tipocuotaSessionBean=new TipoCuotaSessionBean();
		
		this.tipocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuotaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuotaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuota MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCuota= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"nuevo","nuevo","Nuevo"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"duplicar","duplicar","Duplicar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"copiar","copiar","Copiar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"ver_form","ver_form","Ver"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"recargar","recargar","Recargar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCuota,this.jTtoolBarTipoCuota,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCuota,this.jTtoolBarTipoCuota,
							"cerrar","cerrar","Salir"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCuota=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCuota;
			
				this.jButtonProcesarInformacionToolBarTipoCuota=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCuota;
				
		//protected JButton jButtonModificarToolBarTipoCuota;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCuota=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCuota=new JMenuMe("General");
		this.jmenuArchivoTipoCuota=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCuota=new JMenuMe("Acciones");
		this.jmenuDatosTipoCuota=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuota= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuota.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuota,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCuota= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCuota.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCuota,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCuota= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCuota.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCuota,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCuota= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuota.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuota,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCuota= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCuota.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCuota,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCuota= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCuota.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCuota,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCuota= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCuota.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCuota,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCuota= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCuota.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCuota,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCuota= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCuota.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCuota,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCuota= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCuota.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCuota,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCuota= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCuota.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCuota,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCuota= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCuota.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCuota,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuota,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCuota= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCuota.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCuota,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuota,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCuota= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCuota.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCuota,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCuota.add(this.jMenuItemCerrarTipoCuota);
			
			this.jmenuAccionesTipoCuota.add(this.jMenuItemNuevoTipoCuota);
			this.jmenuAccionesTipoCuota.add(this.jMenuItemNuevoGuardarCambiosTipoCuota);
			this.jmenuAccionesTipoCuota.add(this.jMenuItemNuevoRelacionesTipoCuota);
			this.jmenuAccionesTipoCuota.add(this.jMenuItemGuardarCambiosTablaTipoCuota);		
			this.jmenuAccionesTipoCuota.add(this.jMenuItemDuplicarTipoCuota);		
			this.jmenuAccionesTipoCuota.add(this.jMenuItemCopiarTipoCuota);		
			this.jmenuAccionesTipoCuota.add(this.jMenuItemVerFormTipoCuota);		
			
			this.jmenuDatosTipoCuota.add(this.jMenuItemRecargarInformacionTipoCuota);				
			this.jmenuDatosTipoCuota.add(this.jMenuItemAnterioresTipoCuota);				
			this.jmenuDatosTipoCuota.add(this.jMenuItemSiguientesTipoCuota);				
			this.jmenuDatosTipoCuota.add(this.jMenuItemAbrirOrderByTipoCuota);				
			this.jmenuDatosTipoCuota.add(this.jMenuItemMostrarOcultarTipoCuota);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCuota.add(this.jMenuItemGuardarCambiosTipoCuota);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCuota.add(this.jmenuArchivoTipoCuota);		
			this.jmenuBarTipoCuota.add(this.jmenuAccionesTipoCuota);		
			this.jmenuBarTipoCuota.add(this.jmenuDatosTipoCuota);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCuota);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCuota() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoCuota=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCuota.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuota.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuota.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCuota,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCuota = new TipoCuotaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cuota DATOS");
			this.jInternalFrameDetalleFormTipoCuota = new TipoCuotaDetalleFormJInternalFrame(jDesktopPane,this.tipocuotaSessionBean.getConGuardarRelaciones(),this.tipocuotaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCuota = null;//new TipoCuotaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuota= new GridBagLayout();
		
		
		this.jTableDatosTipoCuota = new JTableMe();      
		
		String sToolTipTipoCuota="";
		sToolTipTipoCuota=TipoCuotaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuota+="(Nomina.TipoCuota)";
		}
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuota+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCuota.setToolTipText(sToolTipTipoCuota);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCuota);
		this.jTableDatosTipoCuota.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCuota.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCuota.setRowSelectionAllowed(true);
		this.jTableDatosTipoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCuota,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCuota = new JButtonMe();
		this.jButtonDuplicarTipoCuota = new JButtonMe();
		this.jButtonCopiarTipoCuota = new JButtonMe();
		this.jButtonVerFormTipoCuota = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCuota = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCuota = new JButtonMe();
		this.jButtonCerrarTipoCuota = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuota = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCuota = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuota";
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuotas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuota.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuota.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCuota=new ReporteDinamicoJInternalFrame(TipoCuotaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCuota();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCuota=new ImportacionJInternalFrame(TipoCuotaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCuota();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCuota = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCuota.setText("Orden");
		this.jButtonAbrirOrderByTipoCuota.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuota,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuota,false,this);
			
			//this.cargarOrderByTipoCuota(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuota,true,this);
			
			//this.cargarOrderByTipoCuota(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCuota.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoCuota.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoCuota.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoCuota.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuota.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuota.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCuota.setText("Nuevo");
		this.jButtonDuplicarTipoCuota.setText("Duplicar");
		this.jButtonCopiarTipoCuota.setText("Copiar");
		this.jButtonVerFormTipoCuota.setText("Ver");
		this.jButtonNuevoRelacionesTipoCuota.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCuota.setText("Guardar");
		this.jButtonCerrarTipoCuota.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuota,"nuevo_button","Nuevo",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCuota,"duplicar_button","Duplicar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCuota,"copiar_button","Copiar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCuota,"ver_form","Ver",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCuota,"nuevorelaciones_button","Nuevo Rel",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuota,"guardarcambiostabla_button","Guardar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuota,"cerrar_button","Salir",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCuota.setToolTipText("Nuevo"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCuota.setToolTipText("Duplicar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCuota.setToolTipText("Copiar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCuota.setToolTipText("Ver"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCuota.setToolTipText("Nuevo Rel"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCuota.setToolTipText("Guardar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuota.setToolTipText("Salir"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuota";
		inputMap = this.jButtonNuevoTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuota"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCuota";
		inputMap = this.jButtonDuplicarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCuota"));
		
		//COPIAR
		sMapKey = "CopiarTipoCuota";
		inputMap = this.jButtonCopiarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCuota"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCuota";
		inputMap = this.jButtonVerFormTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCuota"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCuota";
		inputMap = this.jButtonNuevoRelacionesTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCuota"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCuota";
		inputMap = this.jButtonModificarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCuota"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCuota";
		inputMap = this.jButtonCerrarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuota"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuota";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuota"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCuota.setName("jPanelParametrosReportesTipoCuota"); 
		
		this.jPanelParametrosReportesAccionesTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCuota.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCuota.setName("jPanelParametrosReportesAccionesTipoCuota"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCuota = new JButtonMe();
		this.jButtonRecargarInformacionTipoCuota.setText("Recargar");
		this.jButtonRecargarInformacionTipoCuota.setToolTipText("Recargar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCuota,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCuota = new JButtonMe();
		this.jButtonProcesarInformacionTipoCuota.setText("Procesar");
		this.jButtonProcesarInformacionTipoCuota.setToolTipText("Procesar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCuota.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCuota.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuota.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuota.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuota.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCuota.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuota.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCuota.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuota.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCuota.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCuota.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCuota.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCuota.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCuota.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuota.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuota.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCuota.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCuota.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCuota=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCuota.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuota.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuota.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCuota = new JLabelMe();
		
		this.jLabelAccionesTipoCuota.setText("Acciones");		
		this.jLabelAccionesTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCuota = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCuota.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCuota.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCuota = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCuota.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCuota.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCuota = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCuota.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCuota.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCuota = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCuota.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCuota.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCuota = new JButtonMe();
		//this.jButtonAnterioresTipoCuota.setText("<<");
        this.jButtonAnterioresTipoCuota.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCuota,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCuota = new JButtonMe();
		//this.jButtonSiguientesTipoCuota.setText(">>");
        this.jButtonSiguientesTipoCuota.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCuota,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCuota = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCuota.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCuota.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCuota,"nuevoguardarcambios_button","Nue",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCuota";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCuota"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCuota";
		inputMap = this.jButtonRecargarInformacionTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCuota"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCuota";
		inputMap = this.jButtonSiguientesTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCuota"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCuota";
		inputMap = this.jButtonAnterioresTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCuota"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCuota();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCuota.setMinimumSize(new Dimension(this.getWidth(),TipoCuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuotaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuota.setMaximumSize(new Dimension(this.getWidth(),TipoCuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuotaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuota.setPreferredSize(new Dimension(this.getWidth(),TipoCuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuotaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCuota = new GridBagLayout();

			this.jPanelPaginacionTipoCuota.setLayout(gridaBagLayoutPaginacionTipoCuota);						
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 0;
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCuota.add(this.jButtonAnterioresTipoCuota, this.gridBagConstraintsTipoCuota);
					
						
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuota.gridy = 0;
			
			this.jPanelPaginacionTipoCuota.add(this.jButtonNuevoGuardarCambiosTipoCuota, this.gridBagConstraintsTipoCuota);
						
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuota.gridy = 0;
			this.jPanelPaginacionTipoCuota.add(this.jButtonSiguientesTipoCuota, this.gridBagConstraintsTipoCuota);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 1;
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuota.add(this.jButtonNuevoTipoCuota, this.gridBagConstraintsTipoCuota);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuota.gridy = 1;
				this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCuota.add(this.jButtonNuevoRelacionesTipoCuota, this.gridBagConstraintsTipoCuota);
			}
			
			
			if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuota.gridy = 1;
				this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCuota.add(this.jButtonGuardarCambiosTablaTipoCuota, this.gridBagConstraintsTipoCuota);
			}
			
			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 1;
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuota.add(this.jButtonDuplicarTipoCuota, this.gridBagConstraintsTipoCuota);
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 1;
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuota.add(this.jButtonCopiarTipoCuota, this.gridBagConstraintsTipoCuota);
		
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 1;
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuota.add(this.jButtonVerFormTipoCuota, this.gridBagConstraintsTipoCuota);
		
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 1;
			this.gridBagConstraintsTipoCuota.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCuota.add(this.jButtonCerrarTipoCuota, this.gridBagConstraintsTipoCuota);
		
		
		
		this.jButtonRecargarInformacionTipoCuota.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuota.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuota.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCuota.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuota.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuota.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCuota.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuota.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuota.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCuota.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuota.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuota.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCuota.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuota.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuota.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCuota.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuota.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuota.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCuota.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuota.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuota.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCuota.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuota.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuota.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCuota = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCuota = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCuota.setLayout(gridaBagParametrosReportesTipoCuota);
			this.jPanelParametrosReportesAccionesTipoCuota.setLayout(gridaBagParametrosReportesAccionesTipoCuota);
			
			
			this.jPanelParametrosAuxiliar1TipoCuota.setLayout(gridaBagParametrosAuxiliar1TipoCuota);
			this.jPanelParametrosAuxiliar2TipoCuota.setLayout(gridaBagParametrosAuxiliar2TipoCuota);
			this.jPanelParametrosAuxiliar3TipoCuota.setLayout(gridaBagParametrosAuxiliar3TipoCuota);
			this.jPanelParametrosAuxiliar4TipoCuota.setLayout(gridaBagParametrosAuxiliar4TipoCuota);
			//this.jPanelParametrosAuxiliar5TipoCuota.setLayout(gridaBagParametrosAuxiliar2TipoCuota);			
			
			
			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuota.add(this.jButtonRecargarInformacionTipoCuota, this.gridBagConstraintsTipoCuota);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuota.add(this.jComboBoxTiposPaginacionTipoCuota, this.gridBagConstraintsTipoCuota);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuota.add(this.jCheckBoxConAltoMaximoTablaTipoCuota, this.gridBagConstraintsTipoCuota);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuota.add(this.jComboBoxTiposArchivosReportesTipoCuota, this.gridBagConstraintsTipoCuota);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuota.add(this.jPanelParametrosAuxiliar1TipoCuota, this.gridBagConstraintsTipoCuota);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCuota.add(this.jComboBoxTiposReportesTipoCuota, this.gridBagConstraintsTipoCuota);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuota.add(this.jPanelParametrosAuxiliar4TipoCuota, this.gridBagConstraintsTipoCuota);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuota.add(this.jComboBoxTiposReportesTipoCuota, this.gridBagConstraintsTipoCuota);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuota.add(this.jCheckBoxGenerarReporteTipoCuota, this.gridBagConstraintsTipoCuota);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuota.add(this.jPanelParametrosAuxiliar2TipoCuota, this.gridBagConstraintsTipoCuota);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuota.add(this.jLabelAccionesTipoCuota, this.gridBagConstraintsTipoCuota);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCuota.add(this.jButtonAbrirOrderByTipoCuota, this.gridBagConstraintsTipoCuota);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuota.add(this.jComboBoxTiposSeleccionarTipoCuota, this.gridBagConstraintsTipoCuota);			
			
			
			/*
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuota.add(this.jCheckBoxSeleccionarTodosTipoCuota, this.gridBagConstraintsTipoCuota);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuota.add(this.jCheckBoxSeleccionarTodosTipoCuota, this.gridBagConstraintsTipoCuota);															
				
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuota.add(this.jCheckBoxSeleccionadosTipoCuota, this.gridBagConstraintsTipoCuota);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuota.add(this.jPanelParametrosAuxiliar3TipoCuota, this.gridBagConstraintsTipoCuota);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuota.add(this.jComboBoxTiposRelacionesTipoCuota, this.gridBagConstraintsTipoCuota);
				
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuota.add(this.jComboBoxTiposAccionesTipoCuota, this.gridBagConstraintsTipoCuota);
	
				
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuota.add(this.jTextFieldValorCampoGeneralTipoCuota, this.gridBagConstraintsTipoCuota);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCuota = new GridBagLayout();

			this.jScrollPanelDatosTipoCuota.setLayout(gridaBagLayoutDatosTipoCuota);
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = 0;
			this.gridBagConstraintsTipoCuota.gridx = 0;
			
			this.jScrollPanelDatosTipoCuota.add(this.jTableDatosTipoCuota, this.gridBagConstraintsTipoCuota);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCuota.setViewportView(this.jTableDatosTipoCuota);
		this.jTableDatosTipoCuota.setFillsViewportHeight(true);
		this.jTableDatosTipoCuota.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCuota= new GridBagLayout();
		this.jPanelAccionesTipoCuota.setLayout(gridaBagLayoutAccionesTipoCuota);
		
		
		/*	
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = 0;
			
		this.jPanelAccionesTipoCuota.add(this.jButtonNuevoTipoCuota, this.gridBagConstraintsTipoCuota);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuota = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuota);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuota.gridx = 0;		
			//this.gridBagConstraintsTipoCuota.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuota.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCuota, this.gridBagConstraintsTipoCuota);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCuota.gridx = 0;		
		//this.gridBagConstraintsTipoCuota.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCuota.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCuota);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCuota, this.gridBagConstraintsTipoCuota);								
		
		
		/*
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCuota, this.gridBagConstraintsTipoCuota);
		*/		
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuota.gridx =0;
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuota.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuota, this.gridBagConstraintsTipoCuota);
				
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCuota, this.gridBagConstraintsTipoCuota);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuota = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCuota.setLayout(gridaBagLayoutBusquedasParametrosTipoCuota);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCuota=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuota, this.gridBagConstraintsTipoCuota);
			
			
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuota, this.gridBagConstraintsTipoCuota);
		
			
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuota, this.gridBagConstraintsTipoCuota);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCuota;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCuota() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCuota = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCuota.setName("jPanelReporteDinamicoTipoCuota"); 
		
		this.jPanelReporteDinamicoTipoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCuota.setLayout(gridaBagLayoutReporteDinamicoTipoCuota);
		
		
		this.jInternalFrameReporteDinamicoTipoCuota= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCuota = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuota= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCuota.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCuota.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCuota.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCuota.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCuota.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuotas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCuota = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCuota.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuota.add(this.jLabelColumnasSelectReporteTipoCuota, this.gridBagConstraintsTipoCuota);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCuota = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCuota.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCuota.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuota.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCuota=new JScrollPane(this.jListColumnasSelectReporteTipoCuota);
			
			this.jScrollColumnasSelectReporteTipoCuota.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuota.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuota.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuota.add(this.jListColumnasSelectReporteTipoCuota, this.gridBagConstraintsTipoCuota);
		this.jPanelReporteDinamicoTipoCuota.add(this.jScrollColumnasSelectReporteTipoCuota, this.gridBagConstraintsTipoCuota);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCuota = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCuota.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuota.add(this.jLabelRelacionesSelectReporteTipoCuota, this.gridBagConstraintsTipoCuota);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCuota = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCuota.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCuota.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuota.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCuota=new JScrollPane(this.jListRelacionesSelectReporteTipoCuota);
			
			this.jScrollRelacionesSelectReporteTipoCuota.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuota.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuota.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuota.add(this.jListRelacionesSelectReporteTipoCuota, this.gridBagConstraintsTipoCuota);
		this.jPanelReporteDinamicoTipoCuota.add(this.jScrollRelacionesSelectReporteTipoCuota, this.gridBagConstraintsTipoCuota);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCuota = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCuota = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCuota = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCuota = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCuota.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuota = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuota.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCuota = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCuota.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuota.add(this.jLabelGenerarExcelReporteDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuota = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCuota.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCuota,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCuota.setToolTipText("Generar EXCEL"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCuota.add(this.jButtonGenerarExcelReporteDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuota.add(this.jComboBoxTiposReportesDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCuota = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCuota.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuota.add(this.jLabelTiposArchivoReporteDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuota.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCuota = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCuota.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCuota,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCuota.setToolTipText("Generar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuota.add(this.jButtonGenerarReporteDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCuota = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCuota.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCuota,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCuota.setToolTipText("Cancelar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuota.add(this.jButtonCerrarReporteDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCuota = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCuota= new JScrollPane(jPanelReporteDinamicoTipoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuotas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuota.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCuota.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCuota);
		this.jInternalFrameReporteDinamicoTipoCuota.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCuota, this.gridBagConstraintsTipoCuota);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCuota() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCuota = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCuota.setName("jPanelImportacionTipoCuota"); 
		
		this.jPanelImportacionTipoCuota.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuota.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuota.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCuota.setLayout(gridaBagLayoutImportacionTipoCuota);
		
		
		this.jInternalFrameImportacionTipoCuota= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCuota= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCuota = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuota= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuota.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCuota.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuota.setResizable(true);
	    this.jInternalFrameImportacionTipoCuota.setClosable(true);
	    this.jInternalFrameImportacionTipoCuota.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuota.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCuota.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuota.setResizable(true);
	    this.jInternalFrameImportacionTipoCuota.setClosable(true);
	    this.jInternalFrameImportacionTipoCuota.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCuota.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuota.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuota.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuotas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCuota = new JLabelMe();

		this.jLabelArchivoImportacionTipoCuota.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuota.add(this.jLabelArchivoImportacionTipoCuota, this.gridBagConstraintsTipoCuota);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCuota = new JFileChooser();		
		this.jFileChooserImportacionTipoCuota.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCuota = new JButtonMe();
		this.jButtonAbrirImportacionTipoCuota.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCuota,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCuota.setToolTipText("Generar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuota.add(this.jButtonAbrirImportacionTipoCuota, this.gridBagConstraintsTipoCuota);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCuota = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCuota.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuota.add(this.jLabelPathArchivoImportacionTipoCuota, this.gridBagConstraintsTipoCuota);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCuota=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCuota.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuota.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuota.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuota.add(this.jTextFieldPathArchivoImportacionTipoCuota, this.gridBagConstraintsTipoCuota);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCuota = new JButtonMe();
		this.jButtonGenerarImportacionTipoCuota.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCuota,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCuota.setToolTipText("Generar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuota.add(this.jButtonGenerarImportacionTipoCuota, this.gridBagConstraintsTipoCuota);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCuota = new JButtonMe();
		this.jButtonCerrarImportacionTipoCuota.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCuota,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCuota.setToolTipText("Cancelar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuota.add(this.jButtonCerrarImportacionTipoCuota, this.gridBagConstraintsTipoCuota);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCuota = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCuota= new JScrollPane(jPanelImportacionTipoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCuota.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCuota.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCuota);
		this.jInternalFrameImportacionTipoCuota.getContentPane().add(this.jScrollPanelImportacionTipoCuota, this.gridBagConstraintsTipoCuota);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCuota(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCuota = new JButtonMe();
			this.jButtonAbrirOrderByTipoCuota.setText("Orden");
			this.jButtonAbrirOrderByTipoCuota.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuota,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCuota";
			inputMap = this.jButtonAbrirOrderByTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCuota"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCuota = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCuota.setName("jPanelOrderByTipoCuota"); 
			
			this.jPanelOrderByTipoCuota.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuota.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuota.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCuota.setLayout(gridaBagLayoutOrderByTipoCuota);
			
			
			this.jTableDatosTipoCuotaOrderBy = new JTableMe();        
			this.jTableDatosTipoCuotaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCuotaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCuotaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCuotaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCuotaOrderBy.setViewportView(this.jTableDatosTipoCuotaOrderBy);
			this.jTableDatosTipoCuotaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCuotaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCuota= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCuota= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCuota = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCuota= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCuota.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCuota.setTitle("Orden");
			this.jInternalFrameOrderByTipoCuota.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCuota.setResizable(true);
			this.jInternalFrameOrderByTipoCuota.setClosable(true);
			this.jInternalFrameOrderByTipoCuota.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCuota.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuota.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuota.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuotas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCuota.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCuota.ipady =150;
				
			this.jPanelOrderByTipoCuota.add(jScrollPanelDatosTipoCuotaOrderBy, this.gridBagConstraintsTipoCuota);//this.jTableDatosTipoCuotaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCuota = new JButtonMe();
			this.jButtonCerrarOrderByTipoCuota.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCuota,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCuota.setToolTipText("Cancelar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCuota.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCuota.add(this.jButtonCerrarOrderByTipoCuota, this.gridBagConstraintsTipoCuota);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCuota = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCuota= new JScrollPane(jPanelOrderByTipoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCuota.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCuota.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCuota);
			
			this.jInternalFrameOrderByTipoCuota.getContentPane().add(this.jScrollPanelOrderByTipoCuota, this.gridBagConstraintsTipoCuota);			
		
		} else {
			this.jButtonAbrirOrderByTipoCuota = new JButtonMe();
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
			&& this.tipocuotaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCuota.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCuota.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCuota.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCuota.getRowHeight();//TipoCuotaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuota.isSelected()) {
					iHeightTable=TipoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuota.isSelected()) {
					iHeightTable=TipoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCuota.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuota.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuota.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCuota.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuota.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuota.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCuota!=null && this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCuota.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCuota.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCuota.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCuota.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCuota.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuota.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuota.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocuotaLogic.getTipoCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuotas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCuota> TraerTipoCuotaBeans(List<TipoCuota> tipocuotas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCuota tipocuota:tipocuotas) {
					
				if(!(TipoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocuota.setsDetalleGeneralEntityReporte(TipoCuotaConstantesFunciones.getTipoCuotaDescripcion(tipocuota));
										
					tipocuota.setes_prove_descripcion(TipoCuotaConstantesFunciones.getes_proveDescripcion(tipocuota));	
					
					

					if(tipocuota.getPrestamos()!=null && Funciones.existeClass(classes,Prestamo.class)) {
						try{tipocuota.setprestamosDescripcionReporte(new JRBeanCollectionDataSource(PrestamoJInternalFrame.TraerPrestamoBeans(tipocuota.getPrestamos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocuota.setsDetalleGeneralEntityReporte(tipocuota.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocuotabeans.add(tipocuotabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocuotas;
    }
	//PARA REPORTES FIN
}
