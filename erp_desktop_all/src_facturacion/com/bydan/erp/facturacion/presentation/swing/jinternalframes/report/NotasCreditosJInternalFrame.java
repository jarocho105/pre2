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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.NotasCreditosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class NotasCreditosJInternalFrame extends NotasCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNotasCreditos;
	
	protected JMenuBar jmenuBarNotasCreditos;
	
	protected JMenu jmenuNotasCreditos;
	protected JMenu jmenuDatosNotasCreditos;
	protected JMenu jmenuArchivoNotasCreditos;
	protected JMenu jmenuAccionesNotasCreditos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotasCreditos;	
	protected GridBagConstraints gridBagConstraintsNotasCreditos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NotasCreditosDetalleFormJInternalFrame jInternalFrameDetalleFormNotasCreditos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNotasCreditos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNotasCreditos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NotasCreditosSessionBean notascreditosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NotasCreditos> notascreditoss;		
	public List<NotasCreditos> notascreditossEliminados;	
	public List<NotasCreditos> notascreditossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNotasCreditos;		
	protected JButton jButtonAbrirOrderByNotasCreditos;
	
	
	//protected JPanel jPanelOrderByNotasCreditos;
	//public JScrollPane jScrollPanelOrderByNotasCreditos;	
	//protected JButton jButtonCerrarOrderByNotasCreditos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NotasCreditosLogic notascreditosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNotasCreditos;
	public JScrollPane jScrollPanelDatosEdicionNotasCreditos;
	public JScrollPane jScrollPanelDatosGeneralNotasCreditos;
    
	
	
	//public JScrollPane jScrollPanelDatosNotasCreditosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNotasCreditos;
	//public JScrollPane jScrollPanelImportacionNotasCreditos;
	
	
	
	protected JPanel jPanelAccionesNotasCreditos;
	
    protected JPanel jPanelPaginacionNotasCreditos;
    protected JPanel jPanelParametrosReportesNotasCreditos;
	protected JPanel jPanelParametrosReportesAccionesNotasCreditos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NotasCreditos;
	protected JPanel jPanelParametrosAuxiliar2NotasCreditos;
	protected JPanel jPanelParametrosAuxiliar3NotasCreditos;
	protected JPanel jPanelParametrosAuxiliar4NotasCreditos;
	//protected JPanel jPanelParametrosAuxiliar5NotasCreditos;
	
	
	
	//protected JPanel jPanelReporteDinamicoNotasCreditos;
	//protected JPanel jPanelImportacionNotasCreditos;
	
	
	public JTable jTableDatosNotasCreditos;
	
	
	
	//public JTable jTableDatosNotasCreditosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNotasCreditos;
	protected JButton jButtonDuplicarNotasCreditos;
	protected JButton jButtonCopiarNotasCreditos;
	protected JButton jButtonVerFormNotasCreditos;
	protected JButton jButtonNuevoRelacionesNotasCreditos;
	protected JButton jButtonModificarNotasCreditos;
	
    protected JButton jButtonGuardarCambiosTablaNotasCreditos;
	protected JButton jButtonCerrarNotasCreditos;
	
	
	protected JButton jButtonRecargarInformacionNotasCreditos;
	protected JButton jButtonProcesarInformacionNotasCreditos;
	
	
	protected JButton jButtonAnterioresNotasCreditos;
	protected JButton jButtonSiguientesNotasCreditos;
	protected JButton jButtonNuevoGuardarCambiosNotasCreditos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNotasCreditos;
	//protected JButton jButtonCerrarReporteDinamicoNotasCreditos;
	//protected JButton jButtonGenerarExcelReporteDinamicoNotasCreditos;	
	
	
	
	//protected JButton jButtonAbrirImportacionNotasCreditos;
	//protected JButton jButtonGenerarImportacionNotasCreditos;
	//protected JButton jButtonCerrarImportacionNotasCreditos;
	//protected JFileChooser jFileChooserImportacionNotasCreditos;
	//protected File fileImportacionNotasCreditos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotasCreditos;
	protected JButton jButtonDuplicarToolBarNotasCreditos;
	protected JButton jButtonNuevoRelacionesToolBarNotasCreditos;
	
	
	public JButton jButtonGuardarCambiosToolBarNotasCreditos;
	protected JButton jButtonCopiarToolBarNotasCreditos;
	protected JButton jButtonVerFormToolBarNotasCreditos;
	public JButton jButtonGuardarCambiosTablaToolBarNotasCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarNotasCreditos;
	protected JButton jButtonCerrarToolBarNotasCreditos;
	
	protected JButton jButtonRecargarInformacionToolBarNotasCreditos;
	protected JButton jButtonProcesarInformacionToolBarNotasCreditos;
	protected JButton jButtonAnterioresToolBarNotasCreditos;
	protected JButton jButtonSiguientesToolBarNotasCreditos;
	protected JButton jButtonNuevoGuardarCambiosToolBarNotasCreditos;
	protected JButton jButtonAbrirOrderByToolBarNotasCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotasCreditos;
	protected JMenuItem jMenuItemDuplicarNotasCreditos;
	protected JMenuItem jMenuItemNuevoRelacionesNotasCreditos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNotasCreditos;
	protected JMenuItem jMenuItemCopiarNotasCreditos;
	protected JMenuItem jMenuItemVerFormNotasCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotasCreditos;
	protected JMenuItem jMenuItemCerrarNotasCreditos;
	protected JMenuItem jMenuItemDetalleCerrarNotasCreditos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNotasCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotasCreditos;
	
	protected JMenuItem jMenuItemRecargarInformacionNotasCreditos;
	protected JMenuItem jMenuItemProcesarInformacionNotasCreditos;
	protected JMenuItem jMenuItemAnterioresNotasCreditos;
	protected JMenuItem jMenuItemSiguientesNotasCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotasCreditos;
	protected JMenuItem jMenuItemAbrirOrderByNotasCreditos;
	protected JMenuItem jMenuItemMostrarOcultarNotasCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotasCreditos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNotasCreditos;
	protected JCheckBox jCheckBoxSeleccionadosNotasCreditos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNotasCreditos;
	protected JCheckBox jCheckBoxConGraficoReporteNotasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNotasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNotasCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNotasCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNotasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNotasCreditos;
	protected JTextField jTextFieldValorCampoGeneralNotasCreditos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNotasCreditos;
	//public JList<Reporte> jListColumnasSelectReporteNotasCreditos;
	//public JScrollPane jScrollColumnasSelectReporteNotasCreditos;
	
	//public JLabel jLabelRelacionesSelectReporteNotasCreditos;
	//public JList<Reporte> jListRelacionesSelectReporteNotasCreditos;
	//public JScrollPane jScrollRelacionesSelectReporteNotasCreditos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNotasCreditos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNotasCreditos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNotasCreditos;
	//public JLabel jLabelTiposArchivoReporteDinamicoNotasCreditos;
	
		
	//public JLabel jLabelArchivoImportacionNotasCreditos;	
	//public JLabel jLabelPathArchivoImportacionNotasCreditos;
	//protected JTextField jTextFieldPathArchivoImportacionNotasCreditos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNotasCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNotasCreditos;
	
	//public JLabel jLabelColumnaCategoriaValorNotasCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNotasCreditos;
	
	//public JLabel jLabelColumnasValoresGraficoNotasCreditos;
	//public JList<Reporte> jListColumnasValoresGraficoNotasCreditos;
	//public JScrollPane jScrollColumnasValoresGraficoNotasCreditos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNotasCreditos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNotasCreditos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNotasCreditos;
	public JPanel jPanelBusquedaNotasCreditosNotasCreditos;
	public JButton jButtonBusquedaNotasCreditosNotasCreditos;
	
	public JPanel jPanelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos;
	public JLabel jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos;
	public JButton jButtonfecha_emision_desdeBusquedaNotasCreditosNotasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos;
	public JLabel jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos;
	public JButton jButtonfecha_emision_hastaBusquedaNotasCreditosNotasCreditosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NotasCreditosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNotasCreditos)	{
		this.jButtonRecargarInformacionNotasCreditos = jButtonRecargarInformacionNotasCreditos;
	}
	
	public JButton getjButtonProcesarInformacionNotasCreditos() {
		return this.jButtonProcesarInformacionNotasCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotasCreditos)	{
		this.jButtonProcesarInformacionNotasCreditos = jButtonProcesarInformacionNotasCreditos;
	}
	
	
	public JButton getjButtonRecargarInformacionNotasCreditos() {
		return this.jButtonRecargarInformacionNotasCreditos;
	}
	
	
	public List<NotasCreditos> getnotascreditoss() {
		return this.notascreditoss;
	}

	public void setnotascreditoss(List<NotasCreditos> notascreditoss) {
		this.notascreditoss = notascreditoss;
	}
	
	public List<NotasCreditos> getnotascreditossAux() {
		return this.notascreditossAux;
	}

	public void setnotascreditossAux(List<NotasCreditos> notascreditossAux) {
		this.notascreditossAux = notascreditossAux;
	}
	
	public List<NotasCreditos> getnotascreditossEliminados() {
		return this.notascreditossEliminados;
	}

	public void setNotasCreditossEliminados(List<NotasCreditos> notascreditossEliminados) {
		this.notascreditossEliminados = notascreditossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNotasCreditos() {
		return jComboBoxTiposSeleccionarNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNotasCreditos(
			JComboBox jComboBoxTiposSeleccionarNotasCreditos) {
		this.jComboBoxTiposSeleccionarNotasCreditos = jComboBoxTiposSeleccionarNotasCreditos;
	}
	
	public void setBorderResaltarTiposSeleccionarNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNotasCreditos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNotasCreditos() {
		return jTextFieldValorCampoGeneralNotasCreditos;
	}

	public void setjTextFieldValorCampoGeneralNotasCreditos(
			JTextField jTextFieldValorCampoGeneralNotasCreditos) {
		this.jTextFieldValorCampoGeneralNotasCreditos = jTextFieldValorCampoGeneralNotasCreditos;
	}

	public void setBorderResaltarValorCampoGeneralNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNotasCreditos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNotasCreditos() {
		return this.jCheckBoxSeleccionarTodosNotasCreditos;
	}

	public void setjCheckBoxSeleccionarTodosNotasCreditos(
			JCheckBox jCheckBoxSeleccionarTodosNotasCreditos) {
		this.jCheckBoxSeleccionarTodosNotasCreditos = jCheckBoxSeleccionarTodosNotasCreditos;
	}

	public void setBorderResaltarSeleccionarTodosNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNotasCreditos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNotasCreditos() {
		return this.jCheckBoxSeleccionadosNotasCreditos;
	}

	public void setjCheckBoxSeleccionadosNotasCreditos(
			JCheckBox jCheckBoxSeleccionadosNotasCreditos) {
		this.jCheckBoxSeleccionadosNotasCreditos = jCheckBoxSeleccionadosNotasCreditos;
	}
	
	public void setBorderResaltarSeleccionadosNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNotasCreditos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNotasCreditos() {
		return this.jComboBoxTiposArchivosReportesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNotasCreditos(
			JComboBox jComboBoxTiposArchivosReportesNotasCreditos) {
		this.jComboBoxTiposArchivosReportesNotasCreditos = jComboBoxTiposArchivosReportesNotasCreditos;
	}

	public void setBorderResaltarTiposArchivosReportesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNotasCreditos() {
		return this.jComboBoxTiposReportesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNotasCreditos(
			JComboBox jComboBoxTiposReportesNotasCreditos) {
		this.jComboBoxTiposReportesNotasCreditos = jComboBoxTiposReportesNotasCreditos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNotasCreditos() {
	//	return jComboBoxTiposReportesDinamicoNotasCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNotasCreditos(
	//		JComboBox jComboBoxTiposReportesDinamicoNotasCreditos) {
	//	this.jComboBoxTiposReportesDinamicoNotasCreditos = jComboBoxTiposReportesDinamicoNotasCreditos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNotasCreditos() {
	//	return jComboBoxTiposArchivosReportesDinamicoNotasCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNotasCreditos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNotasCreditos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos = jComboBoxTiposArchivosReportesDinamicoNotasCreditos;
	//}
	
	public void setBorderResaltarTiposReportesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNotasCreditos() {
		return this.jComboBoxTiposGraficosReportesNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNotasCreditos(
			JComboBox jComboBoxTiposGraficosReportesNotasCreditos) {
		this.jComboBoxTiposGraficosReportesNotasCreditos = jComboBoxTiposGraficosReportesNotasCreditos;
	}
	
	public void setBorderResaltarTiposGraficosReportesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNotasCreditos() {
		return this.jComboBoxTiposPaginacionNotasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNotasCreditos(
			JComboBox jComboBoxTiposPaginacionNotasCreditos) {
		this.jComboBoxTiposPaginacionNotasCreditos = jComboBoxTiposPaginacionNotasCreditos;
	}
	
	public void setBorderResaltarTiposPaginacionNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNotasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNotasCreditos() {
		return this.jComboBoxTiposRelacionesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotasCreditos() {
		return this.jComboBoxTiposAccionesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotasCreditos(
			JComboBox jComboBoxTiposRelacionesNotasCreditos) {
		this.jComboBoxTiposRelacionesNotasCreditos = jComboBoxTiposRelacionesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotasCreditos(
			JComboBox jComboBoxTiposAccionesNotasCreditos) {
		this.jComboBoxTiposAccionesNotasCreditos = jComboBoxTiposAccionesNotasCreditos;
	}
	
	public void setBorderResaltarTiposRelacionesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNotasCreditos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNotasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNotasCreditos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNotasCreditos() {
	//	return jCheckBoxConGraficoDinamicoNotasCreditos;
	//}

	//public void setjCheckBoxConGraficoDinamicoNotasCreditos(
	//		JCheckBox jCheckBoxConGraficoDinamicoNotasCreditos) {
	//	this.jCheckBoxConGraficoDinamicoNotasCreditos = jCheckBoxConGraficoDinamicoNotasCreditos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNotasCreditos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNotasCreditos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNotasCreditos .setBorder(borderResaltar);		
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
		this.notascreditosSessionBean=new NotasCreditosSessionBean();
		
		this.notascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notascreditosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotasCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Notas Creditos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
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
		
		NotasCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNotasCreditos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"nuevo","nuevo","Nuevo"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"duplicar","duplicar","Duplicar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"copiar","copiar","Copiar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"ver_form","ver_form","Ver"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"recargar","recargar","Buscar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNotasCreditos,this.jTtoolBarNotasCreditos,
							"cerrar","cerrar","Salir"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNotasCreditos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNotasCreditos;
			
				this.jButtonProcesarInformacionToolBarNotasCreditos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNotasCreditos;
				
		//protected JButton jButtonModificarToolBarNotasCreditos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNotasCreditos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNotasCreditos=new JMenuMe("General");
		this.jmenuArchivoNotasCreditos=new JMenuMe("Archivo");
		this.jmenuAccionesNotasCreditos=new JMenuMe("Acciones");
		this.jmenuDatosNotasCreditos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotasCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotasCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotasCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNotasCreditos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNotasCreditos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNotasCreditos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNotasCreditos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNotasCreditos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNotasCreditos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNotasCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotasCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotasCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNotasCreditos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNotasCreditos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNotasCreditos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNotasCreditos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNotasCreditos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNotasCreditos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNotasCreditos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNotasCreditos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNotasCreditos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNotasCreditos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNotasCreditos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNotasCreditos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNotasCreditos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNotasCreditos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNotasCreditos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNotasCreditos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNotasCreditos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNotasCreditos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNotasCreditos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNotasCreditos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNotasCreditos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNotasCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNotasCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNotasCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNotasCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNotasCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNotasCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNotasCreditos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNotasCreditos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNotasCreditos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNotasCreditos.add(this.jMenuItemCerrarNotasCreditos);
			
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemNuevoNotasCreditos);
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemNuevoGuardarCambiosNotasCreditos);
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemNuevoRelacionesNotasCreditos);
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemGuardarCambiosTablaNotasCreditos);		
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemDuplicarNotasCreditos);		
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemCopiarNotasCreditos);		
			this.jmenuAccionesNotasCreditos.add(this.jMenuItemVerFormNotasCreditos);		
			
			this.jmenuDatosNotasCreditos.add(this.jMenuItemRecargarInformacionNotasCreditos);				
			this.jmenuDatosNotasCreditos.add(this.jMenuItemAnterioresNotasCreditos);				
			this.jmenuDatosNotasCreditos.add(this.jMenuItemSiguientesNotasCreditos);				
			this.jmenuDatosNotasCreditos.add(this.jMenuItemAbrirOrderByNotasCreditos);				
			this.jmenuDatosNotasCreditos.add(this.jMenuItemMostrarOcultarNotasCreditos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNotasCreditos.add(this.jMenuItemGuardarCambiosNotasCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNotasCreditos.add(this.jmenuArchivoNotasCreditos);		
			this.jmenuBarNotasCreditos.add(this.jmenuAccionesNotasCreditos);		
			this.jmenuBarNotasCreditos.add(this.jmenuDatosNotasCreditos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNotasCreditos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNotasCreditos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaNotasCreditosNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaNotasCreditosNotasCreditos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaNotasCreditosNotasCreditos= new JButtonMe();
		this.jButtonBusquedaNotasCreditosNotasCreditos.setText("Buscar");
		this.jButtonBusquedaNotasCreditosNotasCreditos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaNotasCreditosNotasCreditos,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaNotasCreditosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasNotasCreditos=new JTabbedPane();


		this.jTabbedPaneBusquedasNotasCreditos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotasCreditos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotasCreditos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNotasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNotasCreditos = new NotasCreditosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Notas Creditos DATOS");
			this.jInternalFrameDetalleFormNotasCreditos = new NotasCreditosDetalleFormJInternalFrame(jDesktopPane,this.notascreditosSessionBean.getConGuardarRelaciones(),this.notascreditosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNotasCreditos = null;//new NotasCreditosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotasCreditos= new GridBagLayout();
		
		
		this.jTableDatosNotasCreditos = new JTableMe();      
		
		String sToolTipNotasCreditos="";
		sToolTipNotasCreditos=NotasCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotasCreditos+="(Facturacion.NotasCreditos)";
		}
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotasCreditos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNotasCreditos.setToolTipText(sToolTipNotasCreditos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNotasCreditos);
		this.jTableDatosNotasCreditos.setAutoCreateRowSorter(true);
		this.jTableDatosNotasCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNotasCreditos.setRowSelectionAllowed(true);
		this.jTableDatosNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNotasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNotasCreditos = new JButtonMe();
		this.jButtonDuplicarNotasCreditos = new JButtonMe();
		this.jButtonCopiarNotasCreditos = new JButtonMe();
		this.jButtonVerFormNotasCreditos = new JButtonMe();
		this.jButtonNuevoRelacionesNotasCreditos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNotasCreditos = new JButtonMe();
		this.jButtonCerrarNotasCreditos = new JButtonMe();
		
		this.jScrollPanelDatosNotasCreditos = new JScrollPane();   
        this.jScrollPanelDatosGeneralNotasCreditos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Notas Creditos";
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Notas Creditoses" + this.sPath));
		} else {
			this.jScrollPanelDatosNotasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesNotasCreditos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNotasCreditos=new ReporteDinamicoJInternalFrame(NotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNotasCreditos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNotasCreditos=new ImportacionJInternalFrame(NotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNotasCreditos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNotasCreditos = new JButtonMe();
		
		this.jButtonAbrirOrderByNotasCreditos.setText("Orden");
		this.jButtonAbrirOrderByNotasCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotasCreditos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotasCreditos,false,this);
			
			//this.cargarOrderByNotasCreditos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotasCreditos,true,this);
			
			//this.cargarOrderByNotasCreditos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNotasCreditos.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosNotasCreditos.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosNotasCreditos.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosNotasCreditos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotasCreditos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotasCreditos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNotasCreditos.setText("Nuevo");
		this.jButtonDuplicarNotasCreditos.setText("Duplicar");
		this.jButtonCopiarNotasCreditos.setText("Copiar");
		this.jButtonVerFormNotasCreditos.setText("Ver");
		this.jButtonNuevoRelacionesNotasCreditos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNotasCreditos.setText("Guardar");
		this.jButtonCerrarNotasCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotasCreditos,"nuevo_button","Nuevo",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNotasCreditos,"duplicar_button","Duplicar",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNotasCreditos,"copiar_button","Copiar",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNotasCreditos,"ver_form","Ver",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNotasCreditos,"nuevorelaciones_button","Nuevo Rel",this.notascreditosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotasCreditos,"guardarcambiostabla_button","Guardar",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotasCreditos,"cerrar_button","Salir",this.notascreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNotasCreditos.setToolTipText("Nuevo"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNotasCreditos.setToolTipText("Duplicar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNotasCreditos.setToolTipText("Copiar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNotasCreditos.setToolTipText("Ver"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNotasCreditos.setToolTipText("Nuevo Rel"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNotasCreditos.setToolTipText("Guardar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotasCreditos.setToolTipText("Salir"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotasCreditos";
		inputMap = this.jButtonNuevoNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotasCreditos"));
		
		//DUPLICAR
		sMapKey = "DuplicarNotasCreditos";
		inputMap = this.jButtonDuplicarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNotasCreditos"));
		
		//COPIAR
		sMapKey = "CopiarNotasCreditos";
		inputMap = this.jButtonCopiarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNotasCreditos"));
		
		//VEr FORM
		sMapKey = "VerFormNotasCreditos";
		inputMap = this.jButtonVerFormNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNotasCreditos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNotasCreditos";
		inputMap = this.jButtonNuevoRelacionesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNotasCreditos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNotasCreditos";
		inputMap = this.jButtonModificarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNotasCreditos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNotasCreditos";
		inputMap = this.jButtonCerrarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotasCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotasCreditos";
		inputMap = this.jButtonGuardarCambiosTablaNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotasCreditos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNotasCreditos.setName("jPanelParametrosReportesNotasCreditos"); 
		
		this.jPanelParametrosReportesAccionesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNotasCreditos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNotasCreditos.setName("jPanelParametrosReportesAccionesNotasCreditos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNotasCreditos = new JButtonMe();
		this.jButtonRecargarInformacionNotasCreditos.setText("Buscar");
		this.jButtonRecargarInformacionNotasCreditos.setToolTipText("Buscar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNotasCreditos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionNotasCreditos.setVisible(false);
		
		
		this.jButtonProcesarInformacionNotasCreditos = new JButtonMe();
		this.jButtonProcesarInformacionNotasCreditos.setText("Procesar");
		this.jButtonProcesarInformacionNotasCreditos.setToolTipText("Procesar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNotasCreditos.setVisible(false);
			
		this.jButtonProcesarInformacionNotasCreditos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotasCreditos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotasCreditos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotasCreditos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNotasCreditos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotasCreditos.setText("TIPO");       
		this.jComboBoxTiposReportesNotasCreditos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotasCreditos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNotasCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNotasCreditos.setText("Paginacion");
		this.jComboBoxTiposPaginacionNotasCreditos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNotasCreditos.setText("Accion");
		this.jComboBoxTiposRelacionesNotasCreditos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotasCreditos.setText("Accion");
		this.jComboBoxTiposAccionesNotasCreditos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNotasCreditos.setText("Accion");
		this.jComboBoxTiposSeleccionarNotasCreditos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNotasCreditos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNotasCreditos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotasCreditos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotasCreditos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNotasCreditos = new JLabelMe();
		
		this.jLabelAccionesNotasCreditos.setText("Acciones");		
		this.jLabelAccionesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNotasCreditos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNotasCreditos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNotasCreditos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNotasCreditos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNotasCreditos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNotasCreditos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNotasCreditos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNotasCreditos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNotasCreditos.setText("Graf.");
		this.jCheckBoxConGraficoReporteNotasCreditos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNotasCreditos = new JButtonMe();
		//this.jButtonAnterioresNotasCreditos.setText("<<");
        this.jButtonAnterioresNotasCreditos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNotasCreditos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNotasCreditos = new JButtonMe();
		//this.jButtonSiguientesNotasCreditos.setText(">>");
        this.jButtonSiguientesNotasCreditos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNotasCreditos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNotasCreditos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNotasCreditos.setText("Nue");
        this.jButtonNuevoGuardarCambiosNotasCreditos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNotasCreditos,"nuevoguardarcambios_button","Nue",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNotasCreditos";
		inputMap = this.jButtonNuevoGuardarCambiosNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNotasCreditos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNotasCreditos";
		inputMap = this.jButtonRecargarInformacionNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNotasCreditos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNotasCreditos";
		inputMap = this.jButtonSiguientesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNotasCreditos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNotasCreditos";
		inputMap = this.jButtonAnterioresNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNotasCreditos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNotasCreditos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNotasCreditos.setMinimumSize(new Dimension(this.getWidth(),NotasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotasCreditos.setMaximumSize(new Dimension(this.getWidth(),NotasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotasCreditos.setPreferredSize(new Dimension(this.getWidth(),NotasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNotasCreditos = new GridBagLayout();

			this.jPanelPaginacionNotasCreditos.setLayout(gridaBagLayoutPaginacionNotasCreditos);						
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 0;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNotasCreditos.add(this.jButtonAnterioresNotasCreditos, this.gridBagConstraintsNotasCreditos);
					
						
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNotasCreditos.gridy = 0;
			
			this.jPanelPaginacionNotasCreditos.add(this.jButtonNuevoGuardarCambiosNotasCreditos, this.gridBagConstraintsNotasCreditos);
						
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNotasCreditos.gridy = 0;
			this.jPanelPaginacionNotasCreditos.add(this.jButtonSiguientesNotasCreditos, this.gridBagConstraintsNotasCreditos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 1;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNotasCreditos.add(this.jButtonNuevoNotasCreditos, this.gridBagConstraintsNotasCreditos);
						
			
			
			if(!this.notascreditosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
				this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNotasCreditos.gridy = 1;
				this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNotasCreditos.add(this.jButtonGuardarCambiosTablaNotasCreditos, this.gridBagConstraintsNotasCreditos);
			}
			
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 1;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNotasCreditos.add(this.jButtonDuplicarNotasCreditos, this.gridBagConstraintsNotasCreditos);
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 1;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNotasCreditos.add(this.jButtonCopiarNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 1;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNotasCreditos.add(this.jButtonVerFormNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 1;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNotasCreditos.add(this.jButtonCerrarNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		
		this.jButtonRecargarInformacionNotasCreditos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotasCreditos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotasCreditos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNotasCreditos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotasCreditos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotasCreditos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNotasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNotasCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotasCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotasCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNotasCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotasCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotasCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNotasCreditos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotasCreditos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotasCreditos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNotasCreditos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotasCreditos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotasCreditos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNotasCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotasCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotasCreditos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNotasCreditos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotasCreditos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotasCreditos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNotasCreditos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NotasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NotasCreditos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNotasCreditos.setLayout(gridaBagParametrosReportesNotasCreditos);
			this.jPanelParametrosReportesAccionesNotasCreditos.setLayout(gridaBagParametrosReportesAccionesNotasCreditos);
			
			
			this.jPanelParametrosAuxiliar1NotasCreditos.setLayout(gridaBagParametrosAuxiliar1NotasCreditos);
			this.jPanelParametrosAuxiliar2NotasCreditos.setLayout(gridaBagParametrosAuxiliar2NotasCreditos);
			this.jPanelParametrosAuxiliar3NotasCreditos.setLayout(gridaBagParametrosAuxiliar3NotasCreditos);
			this.jPanelParametrosAuxiliar4NotasCreditos.setLayout(gridaBagParametrosAuxiliar4NotasCreditos);
			//this.jPanelParametrosAuxiliar5NotasCreditos.setLayout(gridaBagParametrosAuxiliar2NotasCreditos);			
			
			
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotasCreditos.add(this.jButtonRecargarInformacionNotasCreditos, this.gridBagConstraintsNotasCreditos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotasCreditos.add(this.jComboBoxTiposPaginacionNotasCreditos, this.gridBagConstraintsNotasCreditos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotasCreditos.add(this.jCheckBoxConAltoMaximoTablaNotasCreditos, this.gridBagConstraintsNotasCreditos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotasCreditos.add(this.jComboBoxTiposArchivosReportesNotasCreditos, this.gridBagConstraintsNotasCreditos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotasCreditos.add(this.jPanelParametrosAuxiliar1NotasCreditos, this.gridBagConstraintsNotasCreditos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NotasCreditos.add(this.jComboBoxTiposReportesNotasCreditos, this.gridBagConstraintsNotasCreditos);																		
			
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4NotasCreditos.add(this.jComboBoxTiposGraficosReportesNotasCreditos, this.gridBagConstraintsNotasCreditos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotasCreditos.add(this.jPanelParametrosAuxiliar4NotasCreditos, this.gridBagConstraintsNotasCreditos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotasCreditos.add(this.jComboBoxTiposReportesNotasCreditos, this.gridBagConstraintsNotasCreditos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotasCreditos.add(this.jCheckBoxGenerarReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotasCreditos.add(this.jPanelParametrosAuxiliar2NotasCreditos, this.gridBagConstraintsNotasCreditos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotasCreditos.add(this.jLabelAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
				this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNotasCreditos.add(this.jButtonAbrirOrderByNotasCreditos, this.gridBagConstraintsNotasCreditos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotasCreditos.add(this.jComboBoxTiposSeleccionarNotasCreditos, this.gridBagConstraintsNotasCreditos);			
			
			
			/*
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotasCreditos.add(this.jCheckBoxSeleccionarTodosNotasCreditos, this.gridBagConstraintsNotasCreditos);
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotasCreditos.add(this.jCheckBoxConGraficoReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotasCreditos.add(this.jCheckBoxSeleccionarTodosNotasCreditos, this.gridBagConstraintsNotasCreditos);															
				
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotasCreditos.add(this.jCheckBoxSeleccionadosNotasCreditos, this.gridBagConstraintsNotasCreditos);															
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotasCreditos.add(this.jCheckBoxConGraficoReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotasCreditos.add(this.jPanelParametrosAuxiliar3NotasCreditos, this.gridBagConstraintsNotasCreditos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotasCreditos.add(this.jComboBoxTiposAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNotasCreditos = new GridBagLayout();

			this.jScrollPanelDatosNotasCreditos.setLayout(gridaBagLayoutDatosNotasCreditos);
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = 0;
			this.gridBagConstraintsNotasCreditos.gridx = 0;
			
			this.jScrollPanelDatosNotasCreditos.add(this.jTableDatosNotasCreditos, this.gridBagConstraintsNotasCreditos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNotasCreditos.setViewportView(this.jTableDatosNotasCreditos);
		this.jTableDatosNotasCreditos.setFillsViewportHeight(true);
		this.jTableDatosNotasCreditos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNotasCreditos= new GridBagLayout();
		this.jPanelAccionesNotasCreditos.setLayout(gridaBagLayoutAccionesNotasCreditos);
		
		
		/*	
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 0;
			
		this.jPanelAccionesNotasCreditos.add(this.jButtonNuevoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaNotasCreditosNotasCreditos= new GridBagLayout();
		gridaBagLayoutBusquedaNotasCreditosNotasCreditos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaNotasCreditosNotasCreditos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaNotasCreditosNotasCreditos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaNotasCreditosNotasCreditos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaNotasCreditosNotasCreditos.setLayout(gridaBagLayoutBusquedaNotasCreditosNotasCreditos);

		gridBagConstraintsNotasCreditos = new GridBagConstraints();
		gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotasCreditos.gridy = 0;
		gridBagConstraintsNotasCreditos.gridx = 0;
		jPanelBusquedaNotasCreditosNotasCreditos.add(jLabelfecha_emision_desdeBusquedaNotasCreditosNotasCreditos, gridBagConstraintsNotasCreditos);

		gridBagConstraintsNotasCreditos = new GridBagConstraints();
		gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotasCreditos.gridy = 0;
		gridBagConstraintsNotasCreditos.gridx = 1;
		jPanelBusquedaNotasCreditosNotasCreditos.add(jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos, gridBagConstraintsNotasCreditos);


		gridBagConstraintsNotasCreditos = new GridBagConstraints();
		gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotasCreditos.gridy = 1;
		gridBagConstraintsNotasCreditos.gridx = 0;
		jPanelBusquedaNotasCreditosNotasCreditos.add(jLabelfecha_emision_hastaBusquedaNotasCreditosNotasCreditos, gridBagConstraintsNotasCreditos);

		gridBagConstraintsNotasCreditos = new GridBagConstraints();
		gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotasCreditos.gridy = 1;
		gridBagConstraintsNotasCreditos.gridx = 1;
		jPanelBusquedaNotasCreditosNotasCreditos.add(jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos, gridBagConstraintsNotasCreditos);

		gridBagConstraintsNotasCreditos = new GridBagConstraints();
		gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotasCreditos.gridy = 2;
		gridBagConstraintsNotasCreditos.gridx =1;
		jPanelBusquedaNotasCreditosNotasCreditos.add(jButtonBusquedaNotasCreditosNotasCreditos, gridBagConstraintsNotasCreditos);

		jTabbedPaneBusquedasNotasCreditos.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaNotasCreditosNotasCreditos);
		jTabbedPaneBusquedasNotasCreditos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotasCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotasCreditos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();						
			this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotasCreditos.gridx = 0;		
			//this.gridBagConstraintsNotasCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotasCreditos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNotasCreditos, this.gridBagConstraintsNotasCreditos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNotasCreditos.gridx = 0;		
		//this.gridBagConstraintsNotasCreditos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNotasCreditos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNotasCreditos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotasCreditos.gridx = 0;		
			this.gridBagConstraintsNotasCreditos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNotasCreditos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNotasCreditos, this.gridBagConstraintsNotasCreditos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNotasCreditos, this.gridBagConstraintsNotasCreditos);								
		
		
		/*
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);
		*/		
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotasCreditos.gridx =0;
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotasCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotasCreditos, this.gridBagConstraintsNotasCreditos);
				
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNotasCreditos, this.gridBagConstraintsNotasCreditos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNotasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotasCreditos = new GridBagLayout();
			this.jPanelBusquedasParametrosNotasCreditos.setLayout(gridaBagLayoutBusquedasParametrosNotasCreditos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNotasCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotasCreditos, this.gridBagConstraintsNotasCreditos);
			
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNotasCreditos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNotasCreditos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNotasCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNotasCreditos.setName("jPanelReporteDinamicoNotasCreditos"); 
		
		this.jPanelReporteDinamicoNotasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNotasCreditos.setLayout(gridaBagLayoutReporteDinamicoNotasCreditos);
		
		
		this.jInternalFrameReporteDinamicoNotasCreditos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNotasCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotasCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNotasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNotasCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNotasCreditos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNotasCreditos.setResizable(true);
	    this.jInternalFrameReporteDinamicoNotasCreditos.setClosable(true);
	    this.jInternalFrameReporteDinamicoNotasCreditos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNotasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Notas Creditoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNotasCreditos = new JLabelMe();

		this.jLabelColumnasSelectReporteNotasCreditos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelColumnasSelectReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNotasCreditos = new JList<Reporte>();
		this.jListColumnasSelectReporteNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNotasCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNotasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNotasCreditos=new JScrollPane(this.jListColumnasSelectReporteNotasCreditos);
			
			this.jScrollColumnasSelectReporteNotasCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotasCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotasCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotasCreditos.add(this.jListColumnasSelectReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);
		this.jPanelReporteDinamicoNotasCreditos.add(this.jScrollColumnasSelectReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNotasCreditos = new JLabelMe();

		this.jLabelRelacionesSelectReporteNotasCreditos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNotasCreditos = new JList<Reporte>();
		this.jListRelacionesSelectReporteNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNotasCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNotasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNotasCreditos=new JScrollPane(this.jListRelacionesSelectReporteNotasCreditos);
			
			this.jScrollRelacionesSelectReporteNotasCreditos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotasCreditos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotasCreditos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNotasCreditos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNotasCreditos = new JComboBoxMe();
		this.jListColumnasValoresGraficoNotasCreditos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNotasCreditos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNotasCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNotasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoNotasCreditos = new JLabelMe();

		this.jLabelConGraficoDinamicoNotasCreditos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelConGraficoDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoNotasCreditos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoNotasCreditos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoNotasCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotasCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotasCreditos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jCheckBoxConGraficoDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoNotasCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoNotasCreditos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelColumnaCategoriaGraficoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoNotasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotasCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoNotasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoNotasCreditos.add(this.jComboBoxColumnaCategoriaGraficoNotasCreditos, this.gridBagConstraintsNotasCreditos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorNotasCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaValorNotasCreditos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelColumnaCategoriaValorNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorNotasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorNotasCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorNotasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoNotasCreditos.add(this.jComboBoxColumnaCategoriaValorNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoNotasCreditos = new JLabelMe();

		this.jLabelColumnasValoresGraficoNotasCreditos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelColumnasValoresGraficoNotasCreditos, this.gridBagConstraintsNotasCreditos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoNotasCreditos = new JList<Reporte>();
		this.jListColumnasValoresGraficoNotasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoNotasCreditos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoNotasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoNotasCreditos=new JScrollPane(this.jListColumnasValoresGraficoNotasCreditos);
			
			this.jScrollColumnasValoresGraficoNotasCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotasCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotasCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoNotasCreditos.add(this.jListColumnasSelectReporteNotasCreditos, this.gridBagConstraintsNotasCreditos);
		this.jPanelReporteDinamicoNotasCreditos.add(this.jScrollColumnasValoresGraficoNotasCreditos, this.gridBagConstraintsNotasCreditos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoNotasCreditos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoNotasCreditos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelTiposGraficosReportesDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoNotasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotasCreditos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoNotasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jComboBoxTiposGraficosReportesDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNotasCreditos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNotasCreditos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelGenerarExcelReporteDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNotasCreditos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNotasCreditos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNotasCreditos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNotasCreditos.setToolTipText("Generar EXCEL"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNotasCreditos.add(this.jButtonGenerarExcelReporteDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotasCreditos.add(this.jComboBoxTiposReportesDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNotasCreditos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNotasCreditos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotasCreditos.add(this.jLabelTiposArchivoReporteDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotasCreditos.add(this.jComboBoxTiposArchivosReportesDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNotasCreditos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNotasCreditos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNotasCreditos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNotasCreditos.setToolTipText("Generar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotasCreditos.add(this.jButtonGenerarReporteDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNotasCreditos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNotasCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNotasCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNotasCreditos.setToolTipText("Cancelar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotasCreditos.add(this.jButtonCerrarReporteDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNotasCreditos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNotasCreditos= new JScrollPane(jPanelReporteDinamicoNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNotasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Notas Creditoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNotasCreditos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNotasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNotasCreditos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNotasCreditos);
		this.jInternalFrameReporteDinamicoNotasCreditos.getContentPane().add(this.jScrollPanelReporteDinamicoNotasCreditos, this.gridBagConstraintsNotasCreditos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNotasCreditos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNotasCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNotasCreditos.setName("jPanelImportacionNotasCreditos"); 
		
		this.jPanelImportacionNotasCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotasCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotasCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNotasCreditos.setLayout(gridaBagLayoutImportacionNotasCreditos);
		
		
		this.jInternalFrameImportacionNotasCreditos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNotasCreditos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNotasCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotasCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotasCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNotasCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotasCreditos.setResizable(true);
	    this.jInternalFrameImportacionNotasCreditos.setClosable(true);
	    this.jInternalFrameImportacionNotasCreditos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotasCreditos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNotasCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotasCreditos.setResizable(true);
	    this.jInternalFrameImportacionNotasCreditos.setClosable(true);
	    this.jInternalFrameImportacionNotasCreditos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNotasCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotasCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotasCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Notas Creditoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNotasCreditos = new JLabelMe();

		this.jLabelArchivoImportacionNotasCreditos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotasCreditos.add(this.jLabelArchivoImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNotasCreditos = new JFileChooser();		
		this.jFileChooserImportacionNotasCreditos.setToolTipText("ESCOGER ARCHIVO"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNotasCreditos = new JButtonMe();
		this.jButtonAbrirImportacionNotasCreditos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNotasCreditos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNotasCreditos.setToolTipText("Generar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotasCreditos.add(this.jButtonAbrirImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNotasCreditos = new JLabelMe();

		this.jLabelPathArchivoImportacionNotasCreditos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotasCreditos.add(this.jLabelPathArchivoImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNotasCreditos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNotasCreditos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotasCreditos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotasCreditos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotasCreditos.add(this.jTextFieldPathArchivoImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNotasCreditos = new JButtonMe();
		this.jButtonGenerarImportacionNotasCreditos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNotasCreditos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNotasCreditos.setToolTipText("Generar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotasCreditos.add(this.jButtonGenerarImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNotasCreditos = new JButtonMe();
		this.jButtonCerrarImportacionNotasCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNotasCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNotasCreditos.setToolTipText("Cancelar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotasCreditos.add(this.jButtonCerrarImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNotasCreditos = new GridBagLayout();
		
		this.jScrollPanelImportacionNotasCreditos= new JScrollPane(jPanelImportacionNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy =iPosYImportacion;
		this.gridBagConstraintsNotasCreditos.gridx =iPosXImportacion;
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNotasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNotasCreditos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNotasCreditos);
		this.jInternalFrameImportacionNotasCreditos.getContentPane().add(this.jScrollPanelImportacionNotasCreditos, this.gridBagConstraintsNotasCreditos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNotasCreditos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNotasCreditos = new JButtonMe();
			this.jButtonAbrirOrderByNotasCreditos.setText("Orden");
			this.jButtonAbrirOrderByNotasCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotasCreditos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNotasCreditos";
			inputMap = this.jButtonAbrirOrderByNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNotasCreditos"));
		
		
			GridBagLayout gridaBagLayoutOrderByNotasCreditos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNotasCreditos.setName("jPanelOrderByNotasCreditos"); 
			
			this.jPanelOrderByNotasCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotasCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotasCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNotasCreditos.setLayout(gridaBagLayoutOrderByNotasCreditos);
			
			
			this.jTableDatosNotasCreditosOrderBy = new JTableMe();        
			this.jTableDatosNotasCreditosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNotasCreditosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNotasCreditosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNotasCreditosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNotasCreditosOrderBy.setViewportView(this.jTableDatosNotasCreditosOrderBy);
			this.jTableDatosNotasCreditosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNotasCreditosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNotasCreditos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNotasCreditos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNotasCreditos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNotasCreditos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNotasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNotasCreditos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNotasCreditos.setTitle("Orden");
			this.jInternalFrameOrderByNotasCreditos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNotasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNotasCreditos.setResizable(true);
			this.jInternalFrameOrderByNotasCreditos.setClosable(true);
			this.jInternalFrameOrderByNotasCreditos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNotasCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotasCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotasCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Notas Creditoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNotasCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNotasCreditos.ipady =150;
				
			this.jPanelOrderByNotasCreditos.add(jScrollPanelDatosNotasCreditosOrderBy, this.gridBagConstraintsNotasCreditos);//this.jTableDatosNotasCreditosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNotasCreditos = new JButtonMe();
			this.jButtonCerrarOrderByNotasCreditos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNotasCreditos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNotasCreditos.setToolTipText("Cancelar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNotasCreditos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNotasCreditos.add(this.jButtonCerrarOrderByNotasCreditos, this.gridBagConstraintsNotasCreditos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNotasCreditos = new GridBagLayout();
			
			this.jScrollPanelOrderByNotasCreditos= new JScrollPane(jPanelOrderByNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy =iPosYOrderBy;
			this.gridBagConstraintsNotasCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNotasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNotasCreditos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNotasCreditos);
			
			this.jInternalFrameOrderByNotasCreditos.getContentPane().add(this.jScrollPanelOrderByNotasCreditos, this.gridBagConstraintsNotasCreditos);			
		
		} else {
			this.jButtonAbrirOrderByNotasCreditos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.notascreditosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNotasCreditos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNotasCreditos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNotasCreditos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosNotasCreditos.getRowHeight();//NotasCreditosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotasCreditos.isSelected()) {
					iHeightTable=NotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotasCreditos.isSelected()) {
					iHeightTable=NotasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNotasCreditos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotasCreditos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotasCreditos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNotasCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotasCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotasCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNotasCreditos!=null && this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy()!=null) {
			//if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNotasCreditos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNotasCreditos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNotasCreditos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNotasCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotasCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotasCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=notascreditosLogic.getNotasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=notascreditoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NotasCreditos> TraerNotasCreditosBeans(List<NotasCreditos> notascreditoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(NotasCreditos notascreditos:notascreditoss) {
					
				if(!(NotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					notascreditos.setsDetalleGeneralEntityReporte(NotasCreditosConstantesFunciones.getNotasCreditosDescripcion(notascreditos));
										
						
					
						
					
				} else  {
							
					//notascreditos.setsDetalleGeneralEntityReporte(notascreditos.getsDetalleGeneralEntityReporte());
										
				}
				
				//notascreditosbeans.add(notascreditosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return notascreditoss;
    }
	//PARA REPORTES FIN
}
