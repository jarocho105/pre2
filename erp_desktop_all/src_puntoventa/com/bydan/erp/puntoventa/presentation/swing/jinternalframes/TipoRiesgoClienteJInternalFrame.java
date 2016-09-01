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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoRiesgoClienteConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoRiesgoClienteJInternalFrame extends TipoRiesgoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRiesgoCliente;
	
	protected JMenuBar jmenuBarTipoRiesgoCliente;
	
	protected JMenu jmenuTipoRiesgoCliente;
	protected JMenu jmenuDatosTipoRiesgoCliente;
	protected JMenu jmenuArchivoTipoRiesgoCliente;
	protected JMenu jmenuAccionesTipoRiesgoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRiesgoCliente;	
	protected GridBagConstraints gridBagConstraintsTipoRiesgoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRiesgoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRiesgoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRiesgoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRiesgoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRiesgoClienteSessionBean tiporiesgoclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRiesgoCliente> tiporiesgoclientes;		
	public List<TipoRiesgoCliente> tiporiesgoclientesEliminados;	
	public List<TipoRiesgoCliente> tiporiesgoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRiesgoCliente;		
	protected JButton jButtonAbrirOrderByTipoRiesgoCliente;
	
	
	//protected JPanel jPanelOrderByTipoRiesgoCliente;
	//public JScrollPane jScrollPanelOrderByTipoRiesgoCliente;	
	//protected JButton jButtonCerrarOrderByTipoRiesgoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRiesgoClienteLogic tiporiesgoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRiesgoCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoRiesgoCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoRiesgoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRiesgoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRiesgoCliente;
	//public JScrollPane jScrollPanelImportacionTipoRiesgoCliente;
	
	
	
	protected JPanel jPanelAccionesTipoRiesgoCliente;
	
    protected JPanel jPanelPaginacionTipoRiesgoCliente;
    protected JPanel jPanelParametrosReportesTipoRiesgoCliente;
	protected JPanel jPanelParametrosReportesAccionesTipoRiesgoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRiesgoCliente;
	protected JPanel jPanelParametrosAuxiliar2TipoRiesgoCliente;
	protected JPanel jPanelParametrosAuxiliar3TipoRiesgoCliente;
	protected JPanel jPanelParametrosAuxiliar4TipoRiesgoCliente;
	//protected JPanel jPanelParametrosAuxiliar5TipoRiesgoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRiesgoCliente;
	//protected JPanel jPanelImportacionTipoRiesgoCliente;
	
	
	public JTable jTableDatosTipoRiesgoCliente;
	
	
	
	//public JTable jTableDatosTipoRiesgoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRiesgoCliente;
	protected JButton jButtonDuplicarTipoRiesgoCliente;
	protected JButton jButtonCopiarTipoRiesgoCliente;
	protected JButton jButtonVerFormTipoRiesgoCliente;
	protected JButton jButtonNuevoRelacionesTipoRiesgoCliente;
	protected JButton jButtonModificarTipoRiesgoCliente;
	
    protected JButton jButtonGuardarCambiosTablaTipoRiesgoCliente;
	protected JButton jButtonCerrarTipoRiesgoCliente;
	
	
	protected JButton jButtonRecargarInformacionTipoRiesgoCliente;
	protected JButton jButtonProcesarInformacionTipoRiesgoCliente;
	
	
	protected JButton jButtonAnterioresTipoRiesgoCliente;
	protected JButton jButtonSiguientesTipoRiesgoCliente;
	protected JButton jButtonNuevoGuardarCambiosTipoRiesgoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRiesgoCliente;
	//protected JButton jButtonCerrarReporteDinamicoTipoRiesgoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRiesgoCliente;
	//protected JButton jButtonGenerarImportacionTipoRiesgoCliente;
	//protected JButton jButtonCerrarImportacionTipoRiesgoCliente;
	//protected JFileChooser jFileChooserImportacionTipoRiesgoCliente;
	//protected File fileImportacionTipoRiesgoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRiesgoCliente;
	protected JButton jButtonDuplicarToolBarTipoRiesgoCliente;
	protected JButton jButtonNuevoRelacionesToolBarTipoRiesgoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRiesgoCliente;
	protected JButton jButtonCopiarToolBarTipoRiesgoCliente;
	protected JButton jButtonVerFormToolBarTipoRiesgoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRiesgoCliente;
	protected JButton jButtonCerrarToolBarTipoRiesgoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRiesgoCliente;
	protected JButton jButtonProcesarInformacionToolBarTipoRiesgoCliente;
	protected JButton jButtonAnterioresToolBarTipoRiesgoCliente;
	protected JButton jButtonSiguientesToolBarTipoRiesgoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRiesgoCliente;
	protected JButton jButtonAbrirOrderByToolBarTipoRiesgoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRiesgoCliente;
	protected JMenuItem jMenuItemDuplicarTipoRiesgoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRiesgoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRiesgoCliente;
	protected JMenuItem jMenuItemCopiarTipoRiesgoCliente;
	protected JMenuItem jMenuItemVerFormTipoRiesgoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRiesgoCliente;
	protected JMenuItem jMenuItemCerrarTipoRiesgoCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoRiesgoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRiesgoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRiesgoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRiesgoCliente;
	protected JMenuItem jMenuItemProcesarInformacionTipoRiesgoCliente;
	protected JMenuItem jMenuItemAnterioresTipoRiesgoCliente;
	protected JMenuItem jMenuItemSiguientesTipoRiesgoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRiesgoCliente;
	protected JMenuItem jMenuItemAbrirOrderByTipoRiesgoCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoRiesgoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRiesgoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRiesgoCliente;
	protected JCheckBox jCheckBoxSeleccionadosTipoRiesgoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRiesgoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRiesgoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRiesgoCliente;
	protected JTextField jTextFieldValorCampoGeneralTipoRiesgoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRiesgoCliente;
	//public JList<Reporte> jListColumnasSelectReporteTipoRiesgoCliente;
	//public JScrollPane jScrollColumnasSelectReporteTipoRiesgoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRiesgoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRiesgoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRiesgoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRiesgoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRiesgoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente;
	
		
	//public JLabel jLabelArchivoImportacionTipoRiesgoCliente;	
	//public JLabel jLabelPathArchivoImportacionTipoRiesgoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRiesgoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRiesgoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRiesgoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRiesgoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRiesgoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRiesgoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRiesgoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRiesgoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRiesgoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRiesgoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRiesgoCliente;
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoRiesgoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRiesgoCliente)	{
		this.jButtonRecargarInformacionTipoRiesgoCliente = jButtonRecargarInformacionTipoRiesgoCliente;
	}
	
	public JButton getjButtonProcesarInformacionTipoRiesgoCliente() {
		return this.jButtonProcesarInformacionTipoRiesgoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRiesgoCliente)	{
		this.jButtonProcesarInformacionTipoRiesgoCliente = jButtonProcesarInformacionTipoRiesgoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRiesgoCliente() {
		return this.jButtonRecargarInformacionTipoRiesgoCliente;
	}
	
	
	public List<TipoRiesgoCliente> gettiporiesgoclientes() {
		return this.tiporiesgoclientes;
	}

	public void settiporiesgoclientes(List<TipoRiesgoCliente> tiporiesgoclientes) {
		this.tiporiesgoclientes = tiporiesgoclientes;
	}
	
	public List<TipoRiesgoCliente> gettiporiesgoclientesAux() {
		return this.tiporiesgoclientesAux;
	}

	public void settiporiesgoclientesAux(List<TipoRiesgoCliente> tiporiesgoclientesAux) {
		this.tiporiesgoclientesAux = tiporiesgoclientesAux;
	}
	
	public List<TipoRiesgoCliente> gettiporiesgoclientesEliminados() {
		return this.tiporiesgoclientesEliminados;
	}

	public void setTipoRiesgoClientesEliminados(List<TipoRiesgoCliente> tiporiesgoclientesEliminados) {
		this.tiporiesgoclientesEliminados = tiporiesgoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRiesgoCliente() {
		return jComboBoxTiposSeleccionarTipoRiesgoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRiesgoCliente(
			JComboBox jComboBoxTiposSeleccionarTipoRiesgoCliente) {
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente = jComboBoxTiposSeleccionarTipoRiesgoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRiesgoCliente() {
		return jTextFieldValorCampoGeneralTipoRiesgoCliente;
	}

	public void setjTextFieldValorCampoGeneralTipoRiesgoCliente(
			JTextField jTextFieldValorCampoGeneralTipoRiesgoCliente) {
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente = jTextFieldValorCampoGeneralTipoRiesgoCliente;
	}

	public void setBorderResaltarValorCampoGeneralTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRiesgoCliente() {
		return this.jCheckBoxSeleccionarTodosTipoRiesgoCliente;
	}

	public void setjCheckBoxSeleccionarTodosTipoRiesgoCliente(
			JCheckBox jCheckBoxSeleccionarTodosTipoRiesgoCliente) {
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente = jCheckBoxSeleccionarTodosTipoRiesgoCliente;
	}

	public void setBorderResaltarSeleccionarTodosTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRiesgoCliente() {
		return this.jCheckBoxSeleccionadosTipoRiesgoCliente;
	}

	public void setjCheckBoxSeleccionadosTipoRiesgoCliente(
			JCheckBox jCheckBoxSeleccionadosTipoRiesgoCliente) {
		this.jCheckBoxSeleccionadosTipoRiesgoCliente = jCheckBoxSeleccionadosTipoRiesgoCliente;
	}
	
	public void setBorderResaltarSeleccionadosTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRiesgoCliente() {
		return this.jComboBoxTiposArchivosReportesTipoRiesgoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRiesgoCliente(
			JComboBox jComboBoxTiposArchivosReportesTipoRiesgoCliente) {
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente = jComboBoxTiposArchivosReportesTipoRiesgoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRiesgoCliente() {
		return this.jComboBoxTiposReportesTipoRiesgoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRiesgoCliente(
			JComboBox jComboBoxTiposReportesTipoRiesgoCliente) {
		this.jComboBoxTiposReportesTipoRiesgoCliente = jComboBoxTiposReportesTipoRiesgoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRiesgoCliente() {
	//	return jComboBoxTiposReportesDinamicoTipoRiesgoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRiesgoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRiesgoCliente) {
	//	this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente = jComboBoxTiposReportesDinamicoTipoRiesgoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente = jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente;
	//}
	
	public void setBorderResaltarTiposReportesTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRiesgoCliente() {
		return this.jComboBoxTiposGraficosReportesTipoRiesgoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRiesgoCliente(
			JComboBox jComboBoxTiposGraficosReportesTipoRiesgoCliente) {
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente = jComboBoxTiposGraficosReportesTipoRiesgoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRiesgoCliente() {
		return this.jComboBoxTiposPaginacionTipoRiesgoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRiesgoCliente(
			JComboBox jComboBoxTiposPaginacionTipoRiesgoCliente) {
		this.jComboBoxTiposPaginacionTipoRiesgoCliente = jComboBoxTiposPaginacionTipoRiesgoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRiesgoCliente() {
		return this.jComboBoxTiposRelacionesTipoRiesgoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRiesgoCliente() {
		return this.jComboBoxTiposAccionesTipoRiesgoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRiesgoCliente(
			JComboBox jComboBoxTiposRelacionesTipoRiesgoCliente) {
		this.jComboBoxTiposRelacionesTipoRiesgoCliente = jComboBoxTiposRelacionesTipoRiesgoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRiesgoCliente(
			JComboBox jComboBoxTiposAccionesTipoRiesgoCliente) {
		this.jComboBoxTiposAccionesTipoRiesgoCliente = jComboBoxTiposAccionesTipoRiesgoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRiesgoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRiesgoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRiesgoCliente() {
	//	return jCheckBoxConGraficoDinamicoTipoRiesgoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRiesgoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRiesgoCliente) {
	//	this.jCheckBoxConGraficoDinamicoTipoRiesgoCliente = jCheckBoxConGraficoDinamicoTipoRiesgoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRiesgoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRiesgoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRiesgoCliente .setBorder(borderResaltar);		
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
		this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
		
		this.tiporiesgoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporiesgoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRiesgoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRiesgoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRiesgoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRiesgoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRiesgoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Riesgo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRiesgoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRiesgoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"nuevo","nuevo","Nuevo"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"duplicar","duplicar","Duplicar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"copiar","copiar","Copiar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"ver_form","ver_form","Ver"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"recargar","recargar","Recargar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,
							"cerrar","cerrar","Salir"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRiesgoCliente;
			
				this.jButtonProcesarInformacionToolBarTipoRiesgoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRiesgoCliente;
				
		//protected JButton jButtonModificarToolBarTipoRiesgoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRiesgoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRiesgoCliente=new JMenuMe("General");
		this.jmenuArchivoTipoRiesgoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRiesgoCliente=new JMenuMe("Acciones");
		this.jmenuDatosTipoRiesgoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRiesgoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRiesgoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRiesgoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRiesgoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRiesgoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRiesgoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRiesgoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRiesgoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRiesgoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRiesgoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRiesgoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRiesgoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRiesgoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRiesgoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRiesgoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRiesgoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRiesgoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRiesgoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRiesgoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRiesgoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRiesgoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRiesgoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRiesgoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRiesgoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRiesgoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRiesgoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRiesgoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRiesgoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRiesgoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRiesgoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRiesgoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRiesgoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRiesgoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRiesgoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRiesgoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRiesgoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRiesgoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRiesgoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRiesgoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRiesgoCliente.add(this.jMenuItemCerrarTipoRiesgoCliente);
			
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemNuevoTipoRiesgoCliente);
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente);
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemNuevoRelacionesTipoRiesgoCliente);
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente);		
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemDuplicarTipoRiesgoCliente);		
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemCopiarTipoRiesgoCliente);		
			this.jmenuAccionesTipoRiesgoCliente.add(this.jMenuItemVerFormTipoRiesgoCliente);		
			
			this.jmenuDatosTipoRiesgoCliente.add(this.jMenuItemRecargarInformacionTipoRiesgoCliente);				
			this.jmenuDatosTipoRiesgoCliente.add(this.jMenuItemAnterioresTipoRiesgoCliente);				
			this.jmenuDatosTipoRiesgoCliente.add(this.jMenuItemSiguientesTipoRiesgoCliente);				
			this.jmenuDatosTipoRiesgoCliente.add(this.jMenuItemAbrirOrderByTipoRiesgoCliente);				
			this.jmenuDatosTipoRiesgoCliente.add(this.jMenuItemMostrarOcultarTipoRiesgoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRiesgoCliente.add(this.jMenuItemGuardarCambiosTipoRiesgoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRiesgoCliente.add(this.jmenuArchivoTipoRiesgoCliente);		
			this.jmenuBarTipoRiesgoCliente.add(this.jmenuAccionesTipoRiesgoCliente);		
			this.jmenuBarTipoRiesgoCliente.add(this.jmenuDatosTipoRiesgoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRiesgoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRiesgoCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoRiesgoCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRiesgoCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRiesgoCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRiesgoCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRiesgoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRiesgoCliente = new TipoRiesgoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Riesgo Cliente DATOS");
			this.jInternalFrameDetalleFormTipoRiesgoCliente = new TipoRiesgoClienteDetalleFormJInternalFrame(jDesktopPane,this.tiporiesgoclienteSessionBean.getConGuardarRelaciones(),this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRiesgoCliente = null;//new TipoRiesgoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRiesgoCliente= new GridBagLayout();
		
		
		this.jTableDatosTipoRiesgoCliente = new JTableMe();      
		
		String sToolTipTipoRiesgoCliente="";
		sToolTipTipoRiesgoCliente=TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRiesgoCliente+="(PuntoVenta.TipoRiesgoCliente)";
		}
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRiesgoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRiesgoCliente.setToolTipText(sToolTipTipoRiesgoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRiesgoCliente);
		this.jTableDatosTipoRiesgoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRiesgoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRiesgoCliente.setRowSelectionAllowed(true);
		this.jTableDatosTipoRiesgoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRiesgoCliente = new JButtonMe();
		this.jButtonDuplicarTipoRiesgoCliente = new JButtonMe();
		this.jButtonCopiarTipoRiesgoCliente = new JButtonMe();
		this.jButtonVerFormTipoRiesgoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRiesgoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente = new JButtonMe();
		this.jButtonCerrarTipoRiesgoCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoRiesgoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRiesgoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Riesgo Cliente";
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRiesgoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRiesgoCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoRiesgoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRiesgoCliente=new ReporteDinamicoJInternalFrame(TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRiesgoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRiesgoCliente=new ImportacionJInternalFrame(TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRiesgoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRiesgoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRiesgoCliente.setText("Orden");
		this.jButtonAbrirOrderByTipoRiesgoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRiesgoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRiesgoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCliente,false,this);
			
			//this.cargarOrderByTipoRiesgoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRiesgoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCliente,true,this);
			
			//this.cargarOrderByTipoRiesgoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRiesgoCliente.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoRiesgoCliente.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoRiesgoCliente.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoRiesgoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRiesgoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRiesgoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRiesgoCliente.setText("Nuevo");
		this.jButtonDuplicarTipoRiesgoCliente.setText("Duplicar");
		this.jButtonCopiarTipoRiesgoCliente.setText("Copiar");
		this.jButtonVerFormTipoRiesgoCliente.setText("Ver");
		this.jButtonNuevoRelacionesTipoRiesgoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.setText("Guardar");
		this.jButtonCerrarTipoRiesgoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRiesgoCliente,"nuevo_button","Nuevo",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRiesgoCliente,"duplicar_button","Duplicar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRiesgoCliente,"copiar_button","Copiar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRiesgoCliente,"ver_form","Ver",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRiesgoCliente,"nuevorelaciones_button","Nuevo Rel",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRiesgoCliente,"guardarcambiostabla_button","Guardar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRiesgoCliente,"cerrar_button","Salir",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRiesgoCliente.setToolTipText("Nuevo"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRiesgoCliente.setToolTipText("Duplicar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRiesgoCliente.setToolTipText("Copiar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRiesgoCliente.setToolTipText("Ver"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRiesgoCliente.setToolTipText("Nuevo Rel"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.setToolTipText("Guardar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRiesgoCliente.setToolTipText("Salir"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRiesgoCliente";
		inputMap = this.jButtonNuevoTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRiesgoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRiesgoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRiesgoCliente";
		inputMap = this.jButtonDuplicarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRiesgoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRiesgoCliente"));
		
		//COPIAR
		sMapKey = "CopiarTipoRiesgoCliente";
		inputMap = this.jButtonCopiarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRiesgoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRiesgoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRiesgoCliente";
		inputMap = this.jButtonVerFormTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRiesgoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRiesgoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRiesgoCliente";
		inputMap = this.jButtonNuevoRelacionesTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRiesgoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRiesgoCliente";
		inputMap = this.jButtonModificarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRiesgoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRiesgoCliente";
		inputMap = this.jButtonCerrarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRiesgoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRiesgoCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRiesgoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRiesgoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRiesgoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRiesgoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRiesgoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRiesgoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRiesgoCliente.setName("jPanelParametrosReportesTipoRiesgoCliente"); 
		
		this.jPanelParametrosReportesAccionesTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRiesgoCliente.setName("jPanelParametrosReportesAccionesTipoRiesgoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRiesgoCliente = new JButtonMe();
		this.jButtonRecargarInformacionTipoRiesgoCliente.setText("Recargar");
		this.jButtonRecargarInformacionTipoRiesgoCliente.setToolTipText("Recargar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRiesgoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRiesgoCliente = new JButtonMe();
		this.jButtonProcesarInformacionTipoRiesgoCliente.setText("Procesar");
		this.jButtonProcesarInformacionTipoRiesgoCliente.setToolTipText("Procesar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRiesgoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRiesgoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRiesgoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRiesgoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRiesgoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRiesgoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRiesgoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRiesgoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRiesgoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRiesgoCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRiesgoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRiesgoCliente = new JLabelMe();
		
		this.jLabelAccionesTipoRiesgoCliente.setText("Acciones");		
		this.jLabelAccionesTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRiesgoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRiesgoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRiesgoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRiesgoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRiesgoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRiesgoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRiesgoCliente = new JButtonMe();
		//this.jButtonAnterioresTipoRiesgoCliente.setText("<<");
        this.jButtonAnterioresTipoRiesgoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRiesgoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRiesgoCliente = new JButtonMe();
		//this.jButtonSiguientesTipoRiesgoCliente.setText(">>");
        this.jButtonSiguientesTipoRiesgoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRiesgoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRiesgoCliente,"nuevoguardarcambios_button","Nue",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRiesgoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRiesgoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRiesgoCliente";
		inputMap = this.jButtonRecargarInformacionTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRiesgoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRiesgoCliente";
		inputMap = this.jButtonSiguientesTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRiesgoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRiesgoCliente";
		inputMap = this.jButtonAnterioresTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRiesgoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRiesgoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRiesgoCliente.setMinimumSize(new Dimension(this.getWidth(),TipoRiesgoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRiesgoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRiesgoCliente.setMaximumSize(new Dimension(this.getWidth(),TipoRiesgoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRiesgoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRiesgoCliente.setPreferredSize(new Dimension(this.getWidth(),TipoRiesgoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRiesgoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRiesgoCliente = new GridBagLayout();

			this.jPanelPaginacionTipoRiesgoCliente.setLayout(gridaBagLayoutPaginacionTipoRiesgoCliente);						
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonAnterioresTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
					
						
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
			
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonNuevoGuardarCambiosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
						
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonSiguientesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonNuevoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
						
			
			
			if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRiesgoCliente.gridy = 1;
				this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonGuardarCambiosTablaTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			}
			
			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonDuplicarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonCopiarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonVerFormTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 1;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRiesgoCliente.add(this.jButtonCerrarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
		
		
		this.jButtonRecargarInformacionTipoRiesgoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRiesgoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRiesgoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRiesgoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRiesgoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRiesgoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRiesgoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRiesgoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRiesgoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRiesgoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRiesgoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRiesgoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRiesgoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRiesgoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRiesgoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRiesgoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRiesgoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRiesgoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRiesgoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRiesgoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRiesgoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRiesgoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRiesgoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRiesgoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRiesgoCliente.setLayout(gridaBagParametrosReportesTipoRiesgoCliente);
			this.jPanelParametrosReportesAccionesTipoRiesgoCliente.setLayout(gridaBagParametrosReportesAccionesTipoRiesgoCliente);
			
			
			this.jPanelParametrosAuxiliar1TipoRiesgoCliente.setLayout(gridaBagParametrosAuxiliar1TipoRiesgoCliente);
			this.jPanelParametrosAuxiliar2TipoRiesgoCliente.setLayout(gridaBagParametrosAuxiliar2TipoRiesgoCliente);
			this.jPanelParametrosAuxiliar3TipoRiesgoCliente.setLayout(gridaBagParametrosAuxiliar3TipoRiesgoCliente);
			this.jPanelParametrosAuxiliar4TipoRiesgoCliente.setLayout(gridaBagParametrosAuxiliar4TipoRiesgoCliente);
			//this.jPanelParametrosAuxiliar5TipoRiesgoCliente.setLayout(gridaBagParametrosAuxiliar2TipoRiesgoCliente);			
			
			
			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jButtonRecargarInformacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRiesgoCliente.add(this.jComboBoxTiposPaginacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRiesgoCliente.add(this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRiesgoCliente.add(this.jComboBoxTiposArchivosReportesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jPanelParametrosAuxiliar1TipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRiesgoCliente.add(this.jComboBoxTiposReportesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jPanelParametrosAuxiliar4TipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jComboBoxTiposReportesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jCheckBoxGenerarReporteTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jPanelParametrosAuxiliar2TipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jLabelAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jButtonAbrirOrderByTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jComboBoxTiposSeleccionarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
			
			
			/*
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jCheckBoxSeleccionarTodosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRiesgoCliente.add(this.jCheckBoxSeleccionarTodosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);															
				
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRiesgoCliente.add(this.jCheckBoxSeleccionadosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jPanelParametrosAuxiliar3TipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jComboBoxTiposAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
	
				
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRiesgoCliente.add(this.jTextFieldValorCampoGeneralTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRiesgoCliente = new GridBagLayout();

			this.jScrollPanelDatosTipoRiesgoCliente.setLayout(gridaBagLayoutDatosTipoRiesgoCliente);
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
			
			this.jScrollPanelDatosTipoRiesgoCliente.add(this.jTableDatosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRiesgoCliente.setViewportView(this.jTableDatosTipoRiesgoCliente);
		this.jTableDatosTipoRiesgoCliente.setFillsViewportHeight(true);
		this.jTableDatosTipoRiesgoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRiesgoCliente= new GridBagLayout();
		this.jPanelAccionesTipoRiesgoCliente.setLayout(gridaBagLayoutAccionesTipoRiesgoCliente);
		
		
		/*	
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
			
		this.jPanelAccionesTipoRiesgoCliente.add(this.jButtonNuevoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRiesgoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRiesgoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;		
			//this.gridBagConstraintsTipoRiesgoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRiesgoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;		
		//this.gridBagConstraintsTipoRiesgoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRiesgoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRiesgoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);								
		
		
		/*
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		*/		
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRiesgoCliente.gridx =0;
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRiesgoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
				
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRiesgoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRiesgoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRiesgoCliente.setLayout(gridaBagLayoutBusquedasParametrosTipoRiesgoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRiesgoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
			
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
			
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRiesgoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRiesgoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRiesgoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRiesgoCliente.setName("jPanelReporteDinamicoTipoRiesgoCliente"); 
		
		this.jPanelReporteDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRiesgoCliente.setLayout(gridaBagLayoutReporteDinamicoTipoRiesgoCliente);
		
		
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRiesgoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRiesgoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRiesgoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRiesgoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jLabelColumnasSelectReporteTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRiesgoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRiesgoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRiesgoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRiesgoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRiesgoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRiesgoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRiesgoCliente=new JScrollPane(this.jListColumnasSelectReporteTipoRiesgoCliente);
			
			this.jScrollColumnasSelectReporteTipoRiesgoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRiesgoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRiesgoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jListColumnasSelectReporteTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jScrollColumnasSelectReporteTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRiesgoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRiesgoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRiesgoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRiesgoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRiesgoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRiesgoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRiesgoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRiesgoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRiesgoCliente=new JScrollPane(this.jListRelacionesSelectReporteTipoRiesgoCliente);
			
			this.jScrollRelacionesSelectReporteTipoRiesgoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRiesgoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRiesgoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoRiesgoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRiesgoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRiesgoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jLabelGenerarExcelReporteDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente.setToolTipText("Generar EXCEL"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jComboBoxTiposReportesDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jLabelTiposArchivoReporteDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRiesgoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRiesgoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRiesgoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRiesgoCliente.setToolTipText("Generar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jButtonGenerarReporteDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRiesgoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRiesgoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRiesgoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRiesgoCliente.setToolTipText("Cancelar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRiesgoCliente.add(this.jButtonCerrarReporteDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRiesgoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRiesgoCliente= new JScrollPane(jPanelReporteDinamicoTipoRiesgoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRiesgoCliente);
		this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRiesgoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRiesgoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRiesgoCliente.setName("jPanelImportacionTipoRiesgoCliente"); 
		
		this.jPanelImportacionTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRiesgoCliente.setLayout(gridaBagLayoutImportacionTipoRiesgoCliente);
		
		
		this.jInternalFrameImportacionTipoRiesgoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRiesgoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRiesgoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRiesgoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRiesgoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRiesgoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRiesgoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRiesgoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRiesgoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRiesgoCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoRiesgoCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoRiesgoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRiesgoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRiesgoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRiesgoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRiesgoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRiesgoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRiesgoCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoRiesgoCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoRiesgoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRiesgoCliente = new JLabelMe();

		this.jLabelArchivoImportacionTipoRiesgoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRiesgoCliente.add(this.jLabelArchivoImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRiesgoCliente = new JFileChooser();		
		this.jFileChooserImportacionTipoRiesgoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRiesgoCliente = new JButtonMe();
		this.jButtonAbrirImportacionTipoRiesgoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRiesgoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRiesgoCliente.setToolTipText("Generar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCliente.add(this.jButtonAbrirImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRiesgoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRiesgoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRiesgoCliente.add(this.jLabelPathArchivoImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRiesgoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRiesgoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRiesgoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRiesgoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCliente.add(this.jTextFieldPathArchivoImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRiesgoCliente = new JButtonMe();
		this.jButtonGenerarImportacionTipoRiesgoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRiesgoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRiesgoCliente.setToolTipText("Generar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCliente.add(this.jButtonGenerarImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRiesgoCliente = new JButtonMe();
		this.jButtonCerrarImportacionTipoRiesgoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRiesgoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRiesgoCliente.setToolTipText("Cancelar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRiesgoCliente.add(this.jButtonCerrarImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRiesgoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRiesgoCliente= new JScrollPane(jPanelImportacionTipoRiesgoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRiesgoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRiesgoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRiesgoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRiesgoCliente);
		this.jInternalFrameImportacionTipoRiesgoCliente.getContentPane().add(this.jScrollPanelImportacionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRiesgoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRiesgoCliente = new JButtonMe();
			this.jButtonAbrirOrderByTipoRiesgoCliente.setText("Orden");
			this.jButtonAbrirOrderByTipoRiesgoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRiesgoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRiesgoCliente";
			inputMap = this.jButtonAbrirOrderByTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRiesgoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRiesgoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRiesgoCliente.setName("jPanelOrderByTipoRiesgoCliente"); 
			
			this.jPanelOrderByTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRiesgoCliente.setLayout(gridaBagLayoutOrderByTipoRiesgoCliente);
			
			
			this.jTableDatosTipoRiesgoClienteOrderBy = new JTableMe();        
			this.jTableDatosTipoRiesgoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRiesgoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRiesgoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRiesgoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRiesgoClienteOrderBy.setViewportView(this.jTableDatosTipoRiesgoClienteOrderBy);
			this.jTableDatosTipoRiesgoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRiesgoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRiesgoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRiesgoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRiesgoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRiesgoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRiesgoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRiesgoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRiesgoCliente.setTitle("Orden");
			this.jInternalFrameOrderByTipoRiesgoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRiesgoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRiesgoCliente.setResizable(true);
			this.jInternalFrameOrderByTipoRiesgoCliente.setClosable(true);
			this.jInternalFrameOrderByTipoRiesgoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRiesgoCliente.ipady =150;
				
			this.jPanelOrderByTipoRiesgoCliente.add(jScrollPanelDatosTipoRiesgoClienteOrderBy, this.gridBagConstraintsTipoRiesgoCliente);//this.jTableDatosTipoRiesgoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRiesgoCliente = new JButtonMe();
			this.jButtonCerrarOrderByTipoRiesgoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRiesgoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRiesgoCliente.setToolTipText("Cancelar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRiesgoCliente.add(this.jButtonCerrarOrderByTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRiesgoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRiesgoCliente= new JScrollPane(jPanelOrderByTipoRiesgoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRiesgoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRiesgoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRiesgoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRiesgoCliente);
			
			this.jInternalFrameOrderByTipoRiesgoCliente.getContentPane().add(this.jScrollPanelOrderByTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
		
		} else {
			this.jButtonAbrirOrderByTipoRiesgoCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRiesgoCliente.getRowHeight();//TipoRiesgoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.isSelected()) {
					iHeightTable=TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRiesgoCliente.isSelected()) {
					iHeightTable=TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRiesgoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRiesgoCliente!=null && this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRiesgoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRiesgoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRiesgoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporiesgoclienteLogic.getTipoRiesgoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporiesgoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRiesgoCliente> TraerTipoRiesgoClienteBeans(List<TipoRiesgoCliente> tiporiesgoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRiesgoCliente tiporiesgocliente:tiporiesgoclientes) {
					
				if(!(TipoRiesgoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRiesgoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporiesgocliente.setsDetalleGeneralEntityReporte(TipoRiesgoClienteConstantesFunciones.getTipoRiesgoClienteDescripcion(tiporiesgocliente));
										
						
					
						
					
				} else  {
							
					//tiporiesgocliente.setsDetalleGeneralEntityReporte(tiporiesgocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporiesgoclientebeans.add(tiporiesgoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporiesgoclientes;
    }
	//PARA REPORTES FIN
}
