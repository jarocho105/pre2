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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.TelefonoReferenciaConstantesFunciones;

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
public class TelefonoReferenciaJInternalFrame extends TelefonoReferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTelefonoReferencia;
	
	protected JMenuBar jmenuBarTelefonoReferencia;
	
	protected JMenu jmenuTelefonoReferencia;
	protected JMenu jmenuDatosTelefonoReferencia;
	protected JMenu jmenuArchivoTelefonoReferencia;
	protected JMenu jmenuAccionesTelefonoReferencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTelefonoReferencia;	
	protected GridBagConstraints gridBagConstraintsTelefonoReferencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TelefonoReferenciaDetalleFormJInternalFrame jInternalFrameDetalleFormTelefonoReferencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTelefonoReferencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTelefonoReferencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_referencia="";
	
	public TelefonoReferenciaSessionBean telefonoreferenciaSessionBean;
		
	
	
	public ReferenciaSessionBean referenciaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TelefonoReferencia> telefonoreferencias;		
	public List<TelefonoReferencia> telefonoreferenciasEliminados;	
	public List<TelefonoReferencia> telefonoreferenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTelefonoReferencia;		
	protected JButton jButtonAbrirOrderByTelefonoReferencia;
	
	
	//protected JPanel jPanelOrderByTelefonoReferencia;
	//public JScrollPane jScrollPanelOrderByTelefonoReferencia;	
	//protected JButton jButtonCerrarOrderByTelefonoReferencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TelefonoReferenciaLogic telefonoreferenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTelefonoReferencia;
	public JScrollPane jScrollPanelDatosEdicionTelefonoReferencia;
	public JScrollPane jScrollPanelDatosGeneralTelefonoReferencia;
    
	
	
	//public JScrollPane jScrollPanelDatosTelefonoReferenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTelefonoReferencia;
	//public JScrollPane jScrollPanelImportacionTelefonoReferencia;
	
	
	
	protected JPanel jPanelAccionesTelefonoReferencia;
	
    protected JPanel jPanelPaginacionTelefonoReferencia;
    protected JPanel jPanelParametrosReportesTelefonoReferencia;
	protected JPanel jPanelParametrosReportesAccionesTelefonoReferencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TelefonoReferencia;
	protected JPanel jPanelParametrosAuxiliar2TelefonoReferencia;
	protected JPanel jPanelParametrosAuxiliar3TelefonoReferencia;
	protected JPanel jPanelParametrosAuxiliar4TelefonoReferencia;
	//protected JPanel jPanelParametrosAuxiliar5TelefonoReferencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoTelefonoReferencia;
	//protected JPanel jPanelImportacionTelefonoReferencia;
	
	
	public JTable jTableDatosTelefonoReferencia;
	
	
	
	//public JTable jTableDatosTelefonoReferenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTelefonoReferencia;
	protected JButton jButtonDuplicarTelefonoReferencia;
	protected JButton jButtonCopiarTelefonoReferencia;
	protected JButton jButtonVerFormTelefonoReferencia;
	protected JButton jButtonNuevoRelacionesTelefonoReferencia;
	protected JButton jButtonModificarTelefonoReferencia;
	
    protected JButton jButtonGuardarCambiosTablaTelefonoReferencia;
	protected JButton jButtonCerrarTelefonoReferencia;
	
	
	protected JButton jButtonRecargarInformacionTelefonoReferencia;
	protected JButton jButtonProcesarInformacionTelefonoReferencia;
	
	
	protected JButton jButtonAnterioresTelefonoReferencia;
	protected JButton jButtonSiguientesTelefonoReferencia;
	protected JButton jButtonNuevoGuardarCambiosTelefonoReferencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTelefonoReferencia;
	//protected JButton jButtonCerrarReporteDinamicoTelefonoReferencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoTelefonoReferencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionTelefonoReferencia;
	//protected JButton jButtonGenerarImportacionTelefonoReferencia;
	//protected JButton jButtonCerrarImportacionTelefonoReferencia;
	//protected JFileChooser jFileChooserImportacionTelefonoReferencia;
	//protected File fileImportacionTelefonoReferencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTelefonoReferencia;
	protected JButton jButtonDuplicarToolBarTelefonoReferencia;
	protected JButton jButtonNuevoRelacionesToolBarTelefonoReferencia;
	
	
	public JButton jButtonGuardarCambiosToolBarTelefonoReferencia;
	protected JButton jButtonCopiarToolBarTelefonoReferencia;
	protected JButton jButtonVerFormToolBarTelefonoReferencia;
	public JButton jButtonGuardarCambiosTablaToolBarTelefonoReferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTelefonoReferencia;
	protected JButton jButtonCerrarToolBarTelefonoReferencia;
	
	protected JButton jButtonRecargarInformacionToolBarTelefonoReferencia;
	protected JButton jButtonProcesarInformacionToolBarTelefonoReferencia;
	protected JButton jButtonAnterioresToolBarTelefonoReferencia;
	protected JButton jButtonSiguientesToolBarTelefonoReferencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarTelefonoReferencia;
	protected JButton jButtonAbrirOrderByToolBarTelefonoReferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTelefonoReferencia;
	protected JMenuItem jMenuItemDuplicarTelefonoReferencia;
	protected JMenuItem jMenuItemNuevoRelacionesTelefonoReferencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTelefonoReferencia;
	protected JMenuItem jMenuItemCopiarTelefonoReferencia;
	protected JMenuItem jMenuItemVerFormTelefonoReferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTelefonoReferencia;
	protected JMenuItem jMenuItemCerrarTelefonoReferencia;
	protected JMenuItem jMenuItemDetalleCerrarTelefonoReferencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTelefonoReferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTelefonoReferencia;
	
	protected JMenuItem jMenuItemRecargarInformacionTelefonoReferencia;
	protected JMenuItem jMenuItemProcesarInformacionTelefonoReferencia;
	protected JMenuItem jMenuItemAnterioresTelefonoReferencia;
	protected JMenuItem jMenuItemSiguientesTelefonoReferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTelefonoReferencia;
	protected JMenuItem jMenuItemAbrirOrderByTelefonoReferencia;
	protected JMenuItem jMenuItemMostrarOcultarTelefonoReferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTelefonoReferencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTelefonoReferencia;
	protected JCheckBox jCheckBoxSeleccionadosTelefonoReferencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTelefonoReferencia;
	protected JCheckBox jCheckBoxConGraficoReporteTelefonoReferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTelefonoReferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTelefonoReferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTelefonoReferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTelefonoReferencia;
	protected JTextField jTextFieldValorCampoGeneralTelefonoReferencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTelefonoReferencia;
	//public JList<Reporte> jListColumnasSelectReporteTelefonoReferencia;
	//public JScrollPane jScrollColumnasSelectReporteTelefonoReferencia;
	
	//public JLabel jLabelRelacionesSelectReporteTelefonoReferencia;
	//public JList<Reporte> jListRelacionesSelectReporteTelefonoReferencia;
	//public JScrollPane jScrollRelacionesSelectReporteTelefonoReferencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTelefonoReferencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTelefonoReferencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTelefonoReferencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoTelefonoReferencia;
	
		
	//public JLabel jLabelArchivoImportacionTelefonoReferencia;	
	//public JLabel jLabelPathArchivoImportacionTelefonoReferencia;
	//protected JTextField jTextFieldPathArchivoImportacionTelefonoReferencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTelefonoReferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTelefonoReferencia;
	
	//public JLabel jLabelColumnaCategoriaValorTelefonoReferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTelefonoReferencia;
	
	//public JLabel jLabelColumnasValoresGraficoTelefonoReferencia;
	//public JList<Reporte> jListColumnasValoresGraficoTelefonoReferencia;
	//public JScrollPane jScrollColumnasValoresGraficoTelefonoReferencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTelefonoReferencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTelefonoReferencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTelefonoReferencia;
	public JPanel jPanelFK_IdReferenciaTelefonoReferencia;
	public JButton jButtonFK_IdReferenciaTelefonoReferencia;
	
	public JPanel jPanelid_referenciaFK_IdReferenciaTelefonoReferencia;
	public JLabel jLabelid_referenciaFK_IdReferenciaTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia;
	public JButton jButtonid_referenciaFK_IdReferenciaTelefonoReferencia= new JButtonMe();
	public JButton jButtonid_referenciaFK_IdReferenciaTelefonoReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_referenciaFK_IdReferenciaTelefonoReferenciaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TelefonoReferenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTelefonoReferencia)	{
		this.jButtonRecargarInformacionTelefonoReferencia = jButtonRecargarInformacionTelefonoReferencia;
	}
	
	public JButton getjButtonProcesarInformacionTelefonoReferencia() {
		return this.jButtonProcesarInformacionTelefonoReferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTelefonoReferencia)	{
		this.jButtonProcesarInformacionTelefonoReferencia = jButtonProcesarInformacionTelefonoReferencia;
	}
	
	
	public JButton getjButtonRecargarInformacionTelefonoReferencia() {
		return this.jButtonRecargarInformacionTelefonoReferencia;
	}
	
	
	public List<TelefonoReferencia> gettelefonoreferencias() {
		return this.telefonoreferencias;
	}

	public void settelefonoreferencias(List<TelefonoReferencia> telefonoreferencias) {
		this.telefonoreferencias = telefonoreferencias;
	}
	
	public List<TelefonoReferencia> gettelefonoreferenciasAux() {
		return this.telefonoreferenciasAux;
	}

	public void settelefonoreferenciasAux(List<TelefonoReferencia> telefonoreferenciasAux) {
		this.telefonoreferenciasAux = telefonoreferenciasAux;
	}
	
	public List<TelefonoReferencia> gettelefonoreferenciasEliminados() {
		return this.telefonoreferenciasEliminados;
	}

	public void setTelefonoReferenciasEliminados(List<TelefonoReferencia> telefonoreferenciasEliminados) {
		this.telefonoreferenciasEliminados = telefonoreferenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTelefonoReferencia() {
		return jComboBoxTiposSeleccionarTelefonoReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTelefonoReferencia(
			JComboBox jComboBoxTiposSeleccionarTelefonoReferencia) {
		this.jComboBoxTiposSeleccionarTelefonoReferencia = jComboBoxTiposSeleccionarTelefonoReferencia;
	}
	
	public void setBorderResaltarTiposSeleccionarTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTelefonoReferencia() {
		return jTextFieldValorCampoGeneralTelefonoReferencia;
	}

	public void setjTextFieldValorCampoGeneralTelefonoReferencia(
			JTextField jTextFieldValorCampoGeneralTelefonoReferencia) {
		this.jTextFieldValorCampoGeneralTelefonoReferencia = jTextFieldValorCampoGeneralTelefonoReferencia;
	}

	public void setBorderResaltarValorCampoGeneralTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTelefonoReferencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTelefonoReferencia() {
		return this.jCheckBoxSeleccionarTodosTelefonoReferencia;
	}

	public void setjCheckBoxSeleccionarTodosTelefonoReferencia(
			JCheckBox jCheckBoxSeleccionarTodosTelefonoReferencia) {
		this.jCheckBoxSeleccionarTodosTelefonoReferencia = jCheckBoxSeleccionarTodosTelefonoReferencia;
	}

	public void setBorderResaltarSeleccionarTodosTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTelefonoReferencia() {
		return this.jCheckBoxSeleccionadosTelefonoReferencia;
	}

	public void setjCheckBoxSeleccionadosTelefonoReferencia(
			JCheckBox jCheckBoxSeleccionadosTelefonoReferencia) {
		this.jCheckBoxSeleccionadosTelefonoReferencia = jCheckBoxSeleccionadosTelefonoReferencia;
	}
	
	public void setBorderResaltarSeleccionadosTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTelefonoReferencia() {
		return this.jComboBoxTiposArchivosReportesTelefonoReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTelefonoReferencia(
			JComboBox jComboBoxTiposArchivosReportesTelefonoReferencia) {
		this.jComboBoxTiposArchivosReportesTelefonoReferencia = jComboBoxTiposArchivosReportesTelefonoReferencia;
	}

	public void setBorderResaltarTiposArchivosReportesTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTelefonoReferencia() {
		return this.jComboBoxTiposReportesTelefonoReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTelefonoReferencia(
			JComboBox jComboBoxTiposReportesTelefonoReferencia) {
		this.jComboBoxTiposReportesTelefonoReferencia = jComboBoxTiposReportesTelefonoReferencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTelefonoReferencia() {
	//	return jComboBoxTiposReportesDinamicoTelefonoReferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTelefonoReferencia(
	//		JComboBox jComboBoxTiposReportesDinamicoTelefonoReferencia) {
	//	this.jComboBoxTiposReportesDinamicoTelefonoReferencia = jComboBoxTiposReportesDinamicoTelefonoReferencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTelefonoReferencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTelefonoReferencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia = jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia;
	//}
	
	public void setBorderResaltarTiposReportesTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTelefonoReferencia() {
		return this.jComboBoxTiposGraficosReportesTelefonoReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTelefonoReferencia(
			JComboBox jComboBoxTiposGraficosReportesTelefonoReferencia) {
		this.jComboBoxTiposGraficosReportesTelefonoReferencia = jComboBoxTiposGraficosReportesTelefonoReferencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTelefonoReferencia() {
		return this.jComboBoxTiposPaginacionTelefonoReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTelefonoReferencia(
			JComboBox jComboBoxTiposPaginacionTelefonoReferencia) {
		this.jComboBoxTiposPaginacionTelefonoReferencia = jComboBoxTiposPaginacionTelefonoReferencia;
	}
	
	public void setBorderResaltarTiposPaginacionTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTelefonoReferencia() {
		return this.jComboBoxTiposRelacionesTelefonoReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTelefonoReferencia() {
		return this.jComboBoxTiposAccionesTelefonoReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTelefonoReferencia(
			JComboBox jComboBoxTiposRelacionesTelefonoReferencia) {
		this.jComboBoxTiposRelacionesTelefonoReferencia = jComboBoxTiposRelacionesTelefonoReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTelefonoReferencia(
			JComboBox jComboBoxTiposAccionesTelefonoReferencia) {
		this.jComboBoxTiposAccionesTelefonoReferencia = jComboBoxTiposAccionesTelefonoReferencia;
	}
	
	public void setBorderResaltarTiposRelacionesTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTelefonoReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTelefonoReferencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTelefonoReferencia() {
	//	return jCheckBoxConGraficoDinamicoTelefonoReferencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoTelefonoReferencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoTelefonoReferencia) {
	//	this.jCheckBoxConGraficoDinamicoTelefonoReferencia = jCheckBoxConGraficoDinamicoTelefonoReferencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTelefonoReferencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTelefonoReferencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTelefonoReferencia .setBorder(borderResaltar);		
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
		this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		
		this.telefonoreferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.telefonoreferenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TelefonoReferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Telefono Referencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTelefonoReferencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"nuevo","nuevo","Nuevo"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"duplicar","duplicar","Duplicar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"copiar","copiar","Copiar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"ver_form","ver_form","Ver"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"recargar","recargar","Recargar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTelefonoReferencia,this.jTtoolBarTelefonoReferencia,
							"cerrar","cerrar","Salir"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTelefonoReferencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTelefonoReferencia;
			
				this.jButtonProcesarInformacionToolBarTelefonoReferencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTelefonoReferencia;
				
		//protected JButton jButtonModificarToolBarTelefonoReferencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTelefonoReferencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTelefonoReferencia=new JMenuMe("General");
		this.jmenuArchivoTelefonoReferencia=new JMenuMe("Archivo");
		this.jmenuAccionesTelefonoReferencia=new JMenuMe("Acciones");
		this.jmenuDatosTelefonoReferencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTelefonoReferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTelefonoReferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTelefonoReferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTelefonoReferencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTelefonoReferencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTelefonoReferencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTelefonoReferencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTelefonoReferencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTelefonoReferencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTelefonoReferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTelefonoReferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTelefonoReferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTelefonoReferencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTelefonoReferencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTelefonoReferencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTelefonoReferencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTelefonoReferencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTelefonoReferencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTelefonoReferencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTelefonoReferencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTelefonoReferencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTelefonoReferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTelefonoReferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTelefonoReferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTelefonoReferencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTelefonoReferencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTelefonoReferencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTelefonoReferencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTelefonoReferencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTelefonoReferencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTelefonoReferencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTelefonoReferencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTelefonoReferencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTelefonoReferencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTelefonoReferencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTelefonoReferencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTelefonoReferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTelefonoReferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTelefonoReferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTelefonoReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTelefonoReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTelefonoReferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTelefonoReferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTelefonoReferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTelefonoReferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTelefonoReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTelefonoReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTelefonoReferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTelefonoReferencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTelefonoReferencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTelefonoReferencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTelefonoReferencia.add(this.jMenuItemCerrarTelefonoReferencia);
			
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemNuevoTelefonoReferencia);
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemNuevoGuardarCambiosTelefonoReferencia);
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemNuevoRelacionesTelefonoReferencia);
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemGuardarCambiosTablaTelefonoReferencia);		
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemDuplicarTelefonoReferencia);		
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemCopiarTelefonoReferencia);		
			this.jmenuAccionesTelefonoReferencia.add(this.jMenuItemVerFormTelefonoReferencia);		
			
			this.jmenuDatosTelefonoReferencia.add(this.jMenuItemRecargarInformacionTelefonoReferencia);				
			this.jmenuDatosTelefonoReferencia.add(this.jMenuItemAnterioresTelefonoReferencia);				
			this.jmenuDatosTelefonoReferencia.add(this.jMenuItemSiguientesTelefonoReferencia);				
			this.jmenuDatosTelefonoReferencia.add(this.jMenuItemAbrirOrderByTelefonoReferencia);				
			this.jmenuDatosTelefonoReferencia.add(this.jMenuItemMostrarOcultarTelefonoReferencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTelefonoReferencia.add(this.jMenuItemGuardarCambiosTelefonoReferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTelefonoReferencia.add(this.jmenuArchivoTelefonoReferencia);		
			this.jmenuBarTelefonoReferencia.add(this.jmenuAccionesTelefonoReferencia);		
			this.jmenuBarTelefonoReferencia.add(this.jmenuDatosTelefonoReferencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTelefonoReferencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTelefonoReferencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdReferenciaTelefonoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdReferenciaTelefonoReferencia.setToolTipText("Buscar Por Referencia ");
		this.jButtonFK_IdReferenciaTelefonoReferencia= new JButtonMe();
		this.jButtonFK_IdReferenciaTelefonoReferencia.setText("Buscar");
		this.jButtonFK_IdReferenciaTelefonoReferencia.setToolTipText("Buscar Por Referencia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdReferenciaTelefonoReferencia,"buscar_button","Buscar Por Referencia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdReferenciaTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_referenciaFK_IdReferenciaTelefonoReferencia = new JLabelMe();
		jLabelid_referenciaFK_IdReferenciaTelefonoReferencia.setText("Referencia :");
		jLabelid_referenciaFK_IdReferenciaTelefonoReferencia.setToolTipText("Referencia");
		jLabelid_referenciaFK_IdReferenciaTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_referenciaFK_IdReferenciaTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_referenciaFK_IdReferenciaTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_referenciaFK_IdReferenciaTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia= new JComboBoxMe();
		jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTelefonoReferencia=new JTabbedPane();


		this.jTabbedPaneBusquedasTelefonoReferencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTelefonoReferencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTelefonoReferencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTelefonoReferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTelefonoReferencia = new TelefonoReferenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Telefono Referencia DATOS");
			this.jInternalFrameDetalleFormTelefonoReferencia = new TelefonoReferenciaDetalleFormJInternalFrame(jDesktopPane,this.telefonoreferenciaSessionBean.getConGuardarRelaciones(),this.telefonoreferenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTelefonoReferencia = null;//new TelefonoReferenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTelefonoReferencia= new GridBagLayout();
		
		
		this.jTableDatosTelefonoReferencia = new JTableMe();      
		
		String sToolTipTelefonoReferencia="";
		sToolTipTelefonoReferencia=TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTelefonoReferencia+="(Nomina.TelefonoReferencia)";
		}
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTelefonoReferencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTelefonoReferencia.setToolTipText(sToolTipTelefonoReferencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTelefonoReferencia);
		this.jTableDatosTelefonoReferencia.setAutoCreateRowSorter(true);
		this.jTableDatosTelefonoReferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTelefonoReferencia.setRowSelectionAllowed(true);
		this.jTableDatosTelefonoReferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTelefonoReferencia = new JButtonMe();
		this.jButtonDuplicarTelefonoReferencia = new JButtonMe();
		this.jButtonCopiarTelefonoReferencia = new JButtonMe();
		this.jButtonVerFormTelefonoReferencia = new JButtonMe();
		this.jButtonNuevoRelacionesTelefonoReferencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia = new JButtonMe();
		this.jButtonCerrarTelefonoReferencia = new JButtonMe();
		
		this.jScrollPanelDatosTelefonoReferencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralTelefonoReferencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Telefono Referencia";
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono Referencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTelefonoReferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTelefonoReferencia.setToolTipText("Acciones");
        this.jPanelAccionesTelefonoReferencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTelefonoReferencia=new ReporteDinamicoJInternalFrame(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTelefonoReferencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTelefonoReferencia=new ImportacionJInternalFrame(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTelefonoReferencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTelefonoReferencia = new JButtonMe();
		
		this.jButtonAbrirOrderByTelefonoReferencia.setText("Orden");
		this.jButtonAbrirOrderByTelefonoReferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTelefonoReferencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTelefonoReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefonoReferencia,false,this);
			
			//this.cargarOrderByTelefonoReferencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTelefonoReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefonoReferencia,true,this);
			
			//this.cargarOrderByTelefonoReferencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTelefonoReferencia.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTelefonoReferencia.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTelefonoReferencia.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTelefonoReferencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTelefonoReferencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTelefonoReferencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTelefonoReferencia.setText("Nuevo");
		this.jButtonDuplicarTelefonoReferencia.setText("Duplicar");
		this.jButtonCopiarTelefonoReferencia.setText("Copiar");
		this.jButtonVerFormTelefonoReferencia.setText("Ver");
		this.jButtonNuevoRelacionesTelefonoReferencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.setText("Guardar");
		this.jButtonCerrarTelefonoReferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTelefonoReferencia,"nuevo_button","Nuevo",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTelefonoReferencia,"duplicar_button","Duplicar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTelefonoReferencia,"copiar_button","Copiar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTelefonoReferencia,"ver_form","Ver",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTelefonoReferencia,"nuevorelaciones_button","Nuevo Rel",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTelefonoReferencia,"guardarcambiostabla_button","Guardar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTelefonoReferencia,"cerrar_button","Salir",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTelefonoReferencia.setToolTipText("Nuevo"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTelefonoReferencia.setToolTipText("Duplicar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTelefonoReferencia.setToolTipText("Copiar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTelefonoReferencia.setToolTipText("Ver"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTelefonoReferencia.setToolTipText("Nuevo Rel"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.setToolTipText("Guardar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTelefonoReferencia.setToolTipText("Salir"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTelefonoReferencia";
		inputMap = this.jButtonNuevoTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTelefonoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTelefonoReferencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarTelefonoReferencia";
		inputMap = this.jButtonDuplicarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTelefonoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTelefonoReferencia"));
		
		//COPIAR
		sMapKey = "CopiarTelefonoReferencia";
		inputMap = this.jButtonCopiarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTelefonoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTelefonoReferencia"));
		
		//VEr FORM
		sMapKey = "VerFormTelefonoReferencia";
		inputMap = this.jButtonVerFormTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTelefonoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTelefonoReferencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTelefonoReferencia";
		inputMap = this.jButtonNuevoRelacionesTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTelefonoReferencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTelefonoReferencia";
		inputMap = this.jButtonModificarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTelefonoReferencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTelefonoReferencia";
		inputMap = this.jButtonCerrarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTelefonoReferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTelefonoReferencia";
		inputMap = this.jButtonGuardarCambiosTablaTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTelefonoReferencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TelefonoReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TelefonoReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TelefonoReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TelefonoReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TelefonoReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTelefonoReferencia.setName("jPanelParametrosReportesTelefonoReferencia"); 
		
		this.jPanelParametrosReportesAccionesTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTelefonoReferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTelefonoReferencia.setName("jPanelParametrosReportesAccionesTelefonoReferencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTelefonoReferencia = new JButtonMe();
		this.jButtonRecargarInformacionTelefonoReferencia.setText("Recargar");
		this.jButtonRecargarInformacionTelefonoReferencia.setToolTipText("Recargar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTelefonoReferencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTelefonoReferencia = new JButtonMe();
		this.jButtonProcesarInformacionTelefonoReferencia.setText("Procesar");
		this.jButtonProcesarInformacionTelefonoReferencia.setToolTipText("Procesar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTelefonoReferencia.setVisible(false);
			
		this.jButtonProcesarInformacionTelefonoReferencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTelefonoReferencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTelefonoReferencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefonoReferencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTelefonoReferencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefonoReferencia.setText("TIPO");       
		this.jComboBoxTiposReportesTelefonoReferencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefonoReferencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTelefonoReferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTelefonoReferencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionTelefonoReferencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTelefonoReferencia.setText("Accion");
		this.jComboBoxTiposRelacionesTelefonoReferencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTelefonoReferencia.setText("Accion");
		this.jComboBoxTiposAccionesTelefonoReferencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTelefonoReferencia.setText("Accion");
		this.jComboBoxTiposSeleccionarTelefonoReferencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTelefonoReferencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTelefonoReferencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTelefonoReferencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTelefonoReferencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTelefonoReferencia = new JLabelMe();
		
		this.jLabelAccionesTelefonoReferencia.setText("Acciones");		
		this.jLabelAccionesTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTelefonoReferencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTelefonoReferencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTelefonoReferencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTelefonoReferencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTelefonoReferencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTelefonoReferencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTelefonoReferencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTelefonoReferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTelefonoReferencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteTelefonoReferencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTelefonoReferencia = new JButtonMe();
		//this.jButtonAnterioresTelefonoReferencia.setText("<<");
        this.jButtonAnterioresTelefonoReferencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTelefonoReferencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTelefonoReferencia = new JButtonMe();
		//this.jButtonSiguientesTelefonoReferencia.setText(">>");
        this.jButtonSiguientesTelefonoReferencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTelefonoReferencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTelefonoReferencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTelefonoReferencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosTelefonoReferencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTelefonoReferencia,"nuevoguardarcambios_button","Nue",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTelefonoReferencia";
		inputMap = this.jButtonNuevoGuardarCambiosTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTelefonoReferencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTelefonoReferencia";
		inputMap = this.jButtonRecargarInformacionTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTelefonoReferencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTelefonoReferencia";
		inputMap = this.jButtonSiguientesTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTelefonoReferencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTelefonoReferencia";
		inputMap = this.jButtonAnterioresTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTelefonoReferencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTelefonoReferencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTelefonoReferencia.setMinimumSize(new Dimension(this.getWidth(),TelefonoReferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TelefonoReferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTelefonoReferencia.setMaximumSize(new Dimension(this.getWidth(),TelefonoReferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TelefonoReferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTelefonoReferencia.setPreferredSize(new Dimension(this.getWidth(),TelefonoReferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TelefonoReferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTelefonoReferencia = new GridBagLayout();

			this.jPanelPaginacionTelefonoReferencia.setLayout(gridaBagLayoutPaginacionTelefonoReferencia);						
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 0;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonAnterioresTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
					
						
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTelefonoReferencia.gridy = 0;
			
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonNuevoGuardarCambiosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
						
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTelefonoReferencia.gridy = 0;
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonSiguientesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 1;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonNuevoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
						
			
			
			if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
				this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTelefonoReferencia.gridy = 1;
				this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTelefonoReferencia.add(this.jButtonGuardarCambiosTablaTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			}
			
			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 1;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonDuplicarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 1;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonCopiarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 1;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonVerFormTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 1;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTelefonoReferencia.add(this.jButtonCerrarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
		
		
		this.jButtonRecargarInformacionTelefonoReferencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTelefonoReferencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTelefonoReferencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTelefonoReferencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTelefonoReferencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTelefonoReferencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTelefonoReferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTelefonoReferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTelefonoReferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTelefonoReferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTelefonoReferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTelefonoReferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTelefonoReferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTelefonoReferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTelefonoReferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTelefonoReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTelefonoReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTelefonoReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTelefonoReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefonoReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefonoReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTelefonoReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTelefonoReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTelefonoReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTelefonoReferencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTelefonoReferencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTelefonoReferencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTelefonoReferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTelefonoReferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTelefonoReferencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTelefonoReferencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTelefonoReferencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTelefonoReferencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTelefonoReferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTelefonoReferencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TelefonoReferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TelefonoReferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TelefonoReferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TelefonoReferencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTelefonoReferencia.setLayout(gridaBagParametrosReportesTelefonoReferencia);
			this.jPanelParametrosReportesAccionesTelefonoReferencia.setLayout(gridaBagParametrosReportesAccionesTelefonoReferencia);
			
			
			this.jPanelParametrosAuxiliar1TelefonoReferencia.setLayout(gridaBagParametrosAuxiliar1TelefonoReferencia);
			this.jPanelParametrosAuxiliar2TelefonoReferencia.setLayout(gridaBagParametrosAuxiliar2TelefonoReferencia);
			this.jPanelParametrosAuxiliar3TelefonoReferencia.setLayout(gridaBagParametrosAuxiliar3TelefonoReferencia);
			this.jPanelParametrosAuxiliar4TelefonoReferencia.setLayout(gridaBagParametrosAuxiliar4TelefonoReferencia);
			//this.jPanelParametrosAuxiliar5TelefonoReferencia.setLayout(gridaBagParametrosAuxiliar2TelefonoReferencia);			
			
			
			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jButtonRecargarInformacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TelefonoReferencia.add(this.jComboBoxTiposPaginacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TelefonoReferencia.add(this.jCheckBoxConAltoMaximoTablaTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TelefonoReferencia.add(this.jComboBoxTiposArchivosReportesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jPanelParametrosAuxiliar1TelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefonoReferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TelefonoReferencia.add(this.jComboBoxTiposReportesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jPanelParametrosAuxiliar4TelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jComboBoxTiposReportesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jCheckBoxGenerarReporteTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jPanelParametrosAuxiliar2TelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefonoReferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jLabelAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
				this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTelefonoReferencia.add(this.jButtonAbrirOrderByTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jComboBoxTiposSeleccionarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
			
			
			/*
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefonoReferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jCheckBoxSeleccionarTodosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefonoReferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TelefonoReferencia.add(this.jCheckBoxSeleccionarTodosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);															
				
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefonoReferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TelefonoReferencia.add(this.jCheckBoxSeleccionadosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jPanelParametrosAuxiliar3TelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jComboBoxTiposAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
	
				
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefonoReferencia.add(this.jTextFieldValorCampoGeneralTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTelefonoReferencia = new GridBagLayout();

			this.jScrollPanelDatosTelefonoReferencia.setLayout(gridaBagLayoutDatosTelefonoReferencia);
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = 0;
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;
			
			this.jScrollPanelDatosTelefonoReferencia.add(this.jTableDatosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTelefonoReferencia.setViewportView(this.jTableDatosTelefonoReferencia);
		this.jTableDatosTelefonoReferencia.setFillsViewportHeight(true);
		this.jTableDatosTelefonoReferencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTelefonoReferencia= new GridBagLayout();
		this.jPanelAccionesTelefonoReferencia.setLayout(gridaBagLayoutAccionesTelefonoReferencia);
		
		
		/*	
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
			
		this.jPanelAccionesTelefonoReferencia.add(this.jButtonNuevoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdReferenciaTelefonoReferencia= new GridBagLayout();
		gridaBagLayoutFK_IdReferenciaTelefonoReferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdReferenciaTelefonoReferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdReferenciaTelefonoReferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdReferenciaTelefonoReferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdReferenciaTelefonoReferencia.setLayout(gridaBagLayoutFK_IdReferenciaTelefonoReferencia);

		gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefonoReferencia.gridy = 0;
		gridBagConstraintsTelefonoReferencia.gridx = 0;
		jPanelFK_IdReferenciaTelefonoReferencia.add(jLabelid_referenciaFK_IdReferenciaTelefonoReferencia, gridBagConstraintsTelefonoReferencia);

		gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefonoReferencia.gridy = 0;
		gridBagConstraintsTelefonoReferencia.gridx = 1;
		jPanelFK_IdReferenciaTelefonoReferencia.add(jComboBoxid_referenciaFK_IdReferenciaTelefonoReferencia, gridBagConstraintsTelefonoReferencia);

		gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefonoReferencia.gridy = 1;
		gridBagConstraintsTelefonoReferencia.gridx =1;
		jPanelFK_IdReferenciaTelefonoReferencia.add(jButtonFK_IdReferenciaTelefonoReferencia, gridBagConstraintsTelefonoReferencia);

		jTabbedPaneBusquedasTelefonoReferencia.addTab("1.-Por Referencia ", jPanelFK_IdReferenciaTelefonoReferencia);
		jTabbedPaneBusquedasTelefonoReferencia.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTelefonoReferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTelefonoReferencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();						
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;		
			//this.gridBagConstraintsTelefonoReferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTelefonoReferencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;		
		//this.gridBagConstraintsTelefonoReferencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTelefonoReferencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTelefonoReferencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;		
			this.gridBagConstraintsTelefonoReferencia.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTelefonoReferencia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);								
		
		
		/*
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		*/		
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTelefonoReferencia.gridx =0;
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTelefonoReferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
				
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTelefonoReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTelefonoReferencia = new GridBagLayout();
			this.jPanelBusquedasParametrosTelefonoReferencia.setLayout(gridaBagLayoutBusquedasParametrosTelefonoReferencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTelefonoReferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTelefonoReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefonoReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefonoReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
			
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
			
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTelefonoReferencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTelefonoReferencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTelefonoReferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTelefonoReferencia.setName("jPanelReporteDinamicoTelefonoReferencia"); 
		
		this.jPanelReporteDinamicoTelefonoReferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTelefonoReferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTelefonoReferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTelefonoReferencia.setLayout(gridaBagLayoutReporteDinamicoTelefonoReferencia);
		
		
		this.jInternalFrameReporteDinamicoTelefonoReferencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTelefonoReferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTelefonoReferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTelefonoReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTelefonoReferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTelefonoReferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTelefonoReferencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTelefonoReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTelefonoReferencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoTelefonoReferencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoTelefonoReferencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTelefonoReferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTelefonoReferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTelefonoReferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono Referencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTelefonoReferencia = new JLabelMe();

		this.jLabelColumnasSelectReporteTelefonoReferencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jLabelColumnasSelectReporteTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTelefonoReferencia = new JList<Reporte>();
		this.jListColumnasSelectReporteTelefonoReferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTelefonoReferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTelefonoReferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTelefonoReferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTelefonoReferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTelefonoReferencia=new JScrollPane(this.jListColumnasSelectReporteTelefonoReferencia);
			
			this.jScrollColumnasSelectReporteTelefonoReferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTelefonoReferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTelefonoReferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTelefonoReferencia.add(this.jListColumnasSelectReporteTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jScrollColumnasSelectReporteTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTelefonoReferencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteTelefonoReferencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTelefonoReferencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteTelefonoReferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTelefonoReferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTelefonoReferencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTelefonoReferencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTelefonoReferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTelefonoReferencia=new JScrollPane(this.jListRelacionesSelectReporteTelefonoReferencia);
			
			this.jScrollRelacionesSelectReporteTelefonoReferencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTelefonoReferencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTelefonoReferencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTelefonoReferencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTelefonoReferencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoTelefonoReferencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTelefonoReferencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTelefonoReferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTelefonoReferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTelefonoReferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTelefonoReferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTelefonoReferencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTelefonoReferencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jLabelGenerarExcelReporteDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia.setToolTipText("Generar EXCEL"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		//this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTelefonoReferencia.add(this.jButtonGenerarExcelReporteDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jComboBoxTiposReportesDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTelefonoReferencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTelefonoReferencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jLabelTiposArchivoReporteDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jComboBoxTiposArchivosReportesDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTelefonoReferencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTelefonoReferencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTelefonoReferencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTelefonoReferencia.setToolTipText("Generar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jButtonGenerarReporteDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTelefonoReferencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTelefonoReferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTelefonoReferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTelefonoReferencia.setToolTipText("Cancelar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefonoReferencia.add(this.jButtonCerrarReporteDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTelefonoReferencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTelefonoReferencia= new JScrollPane(jPanelReporteDinamicoTelefonoReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTelefonoReferencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTelefonoReferencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTelefonoReferencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono Referencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTelefonoReferencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTelefonoReferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTelefonoReferencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTelefonoReferencia);
		this.jInternalFrameReporteDinamicoTelefonoReferencia.getContentPane().add(this.jScrollPanelReporteDinamicoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTelefonoReferencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTelefonoReferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTelefonoReferencia.setName("jPanelImportacionTelefonoReferencia"); 
		
		this.jPanelImportacionTelefonoReferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTelefonoReferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTelefonoReferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTelefonoReferencia.setLayout(gridaBagLayoutImportacionTelefonoReferencia);
		
		
		this.jInternalFrameImportacionTelefonoReferencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTelefonoReferencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTelefonoReferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTelefonoReferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTelefonoReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTelefonoReferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTelefonoReferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTelefonoReferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTelefonoReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTelefonoReferencia.setResizable(true);
	    this.jInternalFrameImportacionTelefonoReferencia.setClosable(true);
	    this.jInternalFrameImportacionTelefonoReferencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTelefonoReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTelefonoReferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTelefonoReferencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTelefonoReferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTelefonoReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTelefonoReferencia.setResizable(true);
	    this.jInternalFrameImportacionTelefonoReferencia.setClosable(true);
	    this.jInternalFrameImportacionTelefonoReferencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTelefonoReferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTelefonoReferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTelefonoReferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono Referencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTelefonoReferencia = new JLabelMe();

		this.jLabelArchivoImportacionTelefonoReferencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTelefonoReferencia.add(this.jLabelArchivoImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTelefonoReferencia = new JFileChooser();		
		this.jFileChooserImportacionTelefonoReferencia.setToolTipText("ESCOGER ARCHIVO"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTelefonoReferencia = new JButtonMe();
		this.jButtonAbrirImportacionTelefonoReferencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTelefonoReferencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTelefonoReferencia.setToolTipText("Generar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefonoReferencia.add(this.jButtonAbrirImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTelefonoReferencia = new JLabelMe();

		this.jLabelPathArchivoImportacionTelefonoReferencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTelefonoReferencia.add(this.jLabelPathArchivoImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTelefonoReferencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTelefonoReferencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTelefonoReferencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTelefonoReferencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefonoReferencia.add(this.jTextFieldPathArchivoImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTelefonoReferencia = new JButtonMe();
		this.jButtonGenerarImportacionTelefonoReferencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTelefonoReferencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTelefonoReferencia.setToolTipText("Generar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefonoReferencia.add(this.jButtonGenerarImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTelefonoReferencia = new JButtonMe();
		this.jButtonCerrarImportacionTelefonoReferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTelefonoReferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTelefonoReferencia.setToolTipText("Cancelar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefonoReferencia.add(this.jButtonCerrarImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTelefonoReferencia = new GridBagLayout();
		
		this.jScrollPanelImportacionTelefonoReferencia= new JScrollPane(jPanelImportacionTelefonoReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy =iPosYImportacion;
		this.gridBagConstraintsTelefonoReferencia.gridx =iPosXImportacion;
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTelefonoReferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTelefonoReferencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTelefonoReferencia);
		this.jInternalFrameImportacionTelefonoReferencia.getContentPane().add(this.jScrollPanelImportacionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTelefonoReferencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTelefonoReferencia = new JButtonMe();
			this.jButtonAbrirOrderByTelefonoReferencia.setText("Orden");
			this.jButtonAbrirOrderByTelefonoReferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTelefonoReferencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTelefonoReferencia";
			inputMap = this.jButtonAbrirOrderByTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTelefonoReferencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByTelefonoReferencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTelefonoReferencia.setName("jPanelOrderByTelefonoReferencia"); 
			
			this.jPanelOrderByTelefonoReferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTelefonoReferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTelefonoReferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTelefonoReferencia.setLayout(gridaBagLayoutOrderByTelefonoReferencia);
			
			
			this.jTableDatosTelefonoReferenciaOrderBy = new JTableMe();        
			this.jTableDatosTelefonoReferenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTelefonoReferenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTelefonoReferenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTelefonoReferenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTelefonoReferenciaOrderBy.setViewportView(this.jTableDatosTelefonoReferenciaOrderBy);
			this.jTableDatosTelefonoReferenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTelefonoReferenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTelefonoReferencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTelefonoReferencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTelefonoReferencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTelefonoReferencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTelefonoReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTelefonoReferencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTelefonoReferencia.setTitle("Orden");
			this.jInternalFrameOrderByTelefonoReferencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTelefonoReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTelefonoReferencia.setResizable(true);
			this.jInternalFrameOrderByTelefonoReferencia.setClosable(true);
			this.jInternalFrameOrderByTelefonoReferencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTelefonoReferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTelefonoReferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTelefonoReferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono Referencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTelefonoReferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTelefonoReferencia.ipady =150;
				
			this.jPanelOrderByTelefonoReferencia.add(jScrollPanelDatosTelefonoReferenciaOrderBy, this.gridBagConstraintsTelefonoReferencia);//this.jTableDatosTelefonoReferenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTelefonoReferencia = new JButtonMe();
			this.jButtonCerrarOrderByTelefonoReferencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTelefonoReferencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTelefonoReferencia.setToolTipText("Cancelar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTelefonoReferencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTelefonoReferencia.add(this.jButtonCerrarOrderByTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTelefonoReferencia = new GridBagLayout();
			
			this.jScrollPanelOrderByTelefonoReferencia= new JScrollPane(jPanelOrderByTelefonoReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsTelefonoReferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTelefonoReferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTelefonoReferencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTelefonoReferencia);
			
			this.jInternalFrameOrderByTelefonoReferencia.getContentPane().add(this.jScrollPanelOrderByTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
		
		} else {
			this.jButtonAbrirOrderByTelefonoReferencia = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.telefonoreferenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTelefonoReferencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTelefonoReferencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTelefonoReferencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTelefonoReferencia.getRowHeight();//TelefonoReferenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.isSelected()) {
					iHeightTable=TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTelefonoReferencia.isSelected()) {
					iHeightTable=TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TelefonoReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTelefonoReferencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTelefonoReferencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTelefonoReferencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTelefonoReferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTelefonoReferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTelefonoReferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTelefonoReferencia!=null && this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy()!=null) {
			//if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTelefonoReferencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTelefonoReferencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTelefonoReferencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTelefonoReferencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTelefonoReferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTelefonoReferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTelefonoReferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=telefonoreferenciaLogic.getTelefonoReferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefonoreferencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TelefonoReferencia> TraerTelefonoReferenciaBeans(List<TelefonoReferencia> telefonoreferencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(TelefonoReferencia telefonoreferencia:telefonoreferencias) {
					
				if(!(TelefonoReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TelefonoReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					telefonoreferencia.setsDetalleGeneralEntityReporte(TelefonoReferenciaConstantesFunciones.getTelefonoReferenciaDescripcion(telefonoreferencia));
										
						
					
						
					
				} else  {
							
					//telefonoreferencia.setsDetalleGeneralEntityReporte(telefonoreferencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//telefonoreferenciabeans.add(telefonoreferenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return telefonoreferencias;
    }
	//PARA REPORTES FIN
}
