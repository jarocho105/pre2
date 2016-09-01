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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ModuloConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ModuloJInternalFrame extends ModuloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarModulo;
	
	protected JMenuBar jmenuBarModulo;
	
	protected JMenu jmenuModulo;
	protected JMenu jmenuDatosModulo;
	protected JMenu jmenuArchivoModulo;
	protected JMenu jmenuAccionesModulo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutModulo;	
	protected GridBagConstraints gridBagConstraintsModulo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ModuloDetalleFormJInternalFrame jInternalFrameDetalleFormModulo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoModulo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionModulo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paquete="";

	protected TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoteclamascara="";
	
	public ModuloSessionBean moduloSessionBean;
		
	
	
	public SistemaSessionBean sistemaSessionBean;
	public PaqueteSessionBean paqueteSessionBean;
	public TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Modulo> modulos;		
	public List<Modulo> modulosEliminados;	
	public List<Modulo> modulosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByModulo;		
	protected JButton jButtonAbrirOrderByModulo;
	
	
	//protected JPanel jPanelOrderByModulo;
	//public JScrollPane jScrollPanelOrderByModulo;	
	//protected JButton jButtonCerrarOrderByModulo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ModuloLogic moduloLogic;
	
	
	
	public JScrollPane jScrollPanelDatosModulo;
	public JScrollPane jScrollPanelDatosEdicionModulo;
	public JScrollPane jScrollPanelDatosGeneralModulo;
    
	
	
	//public JScrollPane jScrollPanelDatosModuloOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoModulo;
	//public JScrollPane jScrollPanelImportacionModulo;
	
	
	
	protected JPanel jPanelAccionesModulo;
	
    protected JPanel jPanelPaginacionModulo;
    protected JPanel jPanelParametrosReportesModulo;
	protected JPanel jPanelParametrosReportesAccionesModulo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Modulo;
	protected JPanel jPanelParametrosAuxiliar2Modulo;
	protected JPanel jPanelParametrosAuxiliar3Modulo;
	protected JPanel jPanelParametrosAuxiliar4Modulo;
	//protected JPanel jPanelParametrosAuxiliar5Modulo;
	
	
	
	//protected JPanel jPanelReporteDinamicoModulo;
	//protected JPanel jPanelImportacionModulo;
	
	
	public JTable jTableDatosModulo;
	
	
	
	//public JTable jTableDatosModuloOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoModulo;
	protected JButton jButtonDuplicarModulo;
	protected JButton jButtonCopiarModulo;
	protected JButton jButtonVerFormModulo;
	protected JButton jButtonNuevoRelacionesModulo;
	protected JButton jButtonModificarModulo;
	
    protected JButton jButtonGuardarCambiosTablaModulo;
	protected JButton jButtonCerrarModulo;
	
	
	protected JButton jButtonRecargarInformacionModulo;
	protected JButton jButtonProcesarInformacionModulo;
	
	
	protected JButton jButtonAnterioresModulo;
	protected JButton jButtonSiguientesModulo;
	protected JButton jButtonNuevoGuardarCambiosModulo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoModulo;
	//protected JButton jButtonCerrarReporteDinamicoModulo;
	//protected JButton jButtonGenerarExcelReporteDinamicoModulo;	
	
	
	
	//protected JButton jButtonAbrirImportacionModulo;
	//protected JButton jButtonGenerarImportacionModulo;
	//protected JButton jButtonCerrarImportacionModulo;
	//protected JFileChooser jFileChooserImportacionModulo;
	//protected File fileImportacionModulo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarModulo;
	protected JButton jButtonDuplicarToolBarModulo;
	protected JButton jButtonNuevoRelacionesToolBarModulo;
	
	
	public JButton jButtonGuardarCambiosToolBarModulo;
	protected JButton jButtonCopiarToolBarModulo;
	protected JButton jButtonVerFormToolBarModulo;
	public JButton jButtonGuardarCambiosTablaToolBarModulo;
	protected JButton jButtonMostrarOcultarTablaToolBarModulo;
	protected JButton jButtonCerrarToolBarModulo;
	
	protected JButton jButtonRecargarInformacionToolBarModulo;
	protected JButton jButtonProcesarInformacionToolBarModulo;
	protected JButton jButtonAnterioresToolBarModulo;
	protected JButton jButtonSiguientesToolBarModulo;
	protected JButton jButtonNuevoGuardarCambiosToolBarModulo;
	protected JButton jButtonAbrirOrderByToolBarModulo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoModulo;
	protected JMenuItem jMenuItemDuplicarModulo;
	protected JMenuItem jMenuItemNuevoRelacionesModulo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosModulo;
	protected JMenuItem jMenuItemCopiarModulo;
	protected JMenuItem jMenuItemVerFormModulo;
	protected JMenuItem jMenuItemGuardarCambiosTablaModulo;
	protected JMenuItem jMenuItemCerrarModulo;
	protected JMenuItem jMenuItemDetalleCerrarModulo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByModulo;
	protected JMenuItem jMenuItemDetalleMostarOcultarModulo;
	
	protected JMenuItem jMenuItemRecargarInformacionModulo;
	protected JMenuItem jMenuItemProcesarInformacionModulo;
	protected JMenuItem jMenuItemAnterioresModulo;
	protected JMenuItem jMenuItemSiguientesModulo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosModulo;
	protected JMenuItem jMenuItemAbrirOrderByModulo;
	protected JMenuItem jMenuItemMostrarOcultarModulo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesModulo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosModulo;
	protected JCheckBox jCheckBoxSeleccionadosModulo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaModulo;
	protected JCheckBox jCheckBoxConGraficoReporteModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesModulo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoModulo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarModulo;
	protected JTextField jTextFieldValorCampoGeneralModulo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteModulo;
	//public JList<Reporte> jListColumnasSelectReporteModulo;
	//public JScrollPane jScrollColumnasSelectReporteModulo;
	
	//public JLabel jLabelRelacionesSelectReporteModulo;
	//public JList<Reporte> jListRelacionesSelectReporteModulo;
	//public JScrollPane jScrollRelacionesSelectReporteModulo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoModulo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoModulo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoModulo;
	//public JLabel jLabelTiposArchivoReporteDinamicoModulo;
	
		
	//public JLabel jLabelArchivoImportacionModulo;	
	//public JLabel jLabelPathArchivoImportacionModulo;
	//protected JTextField jTextFieldPathArchivoImportacionModulo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoModulo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoModulo;
	
	//public JLabel jLabelColumnaCategoriaValorModulo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorModulo;
	
	//public JLabel jLabelColumnasValoresGraficoModulo;
	//public JList<Reporte> jListColumnasValoresGraficoModulo;
	//public JScrollPane jScrollColumnasValoresGraficoModulo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoModulo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoModulo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasModulo;
	public JPanel jPanelBusquedaPorIdSistemaPorNombreModulo;
	public JButton jButtonBusquedaPorIdSistemaPorNombreModulo;
	public JPanel jPanelFK_IdSistemaModulo;
	public JButton jButtonFK_IdSistemaModulo;
	public JPanel jPanelFK_IdTipoTeclaMascaraModulo;
	public JButton jButtonFK_IdTipoTeclaMascaraModulo;
	
	public JPanel jPanelid_sistemaBusquedaPorIdSistemaPorNombreModulo;
	public JLabel jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo;
	public JButton jButtonid_sistemaBusquedaPorIdSistemaPorNombreModulo= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdSistemaPorNombreModuloUpdate= new JButtonMe();
	public JButton jButtonid_sistemaBusquedaPorIdSistemaPorNombreModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdSistemaPorNombreModulo;
	public JLabel jLabelnombreBusquedaPorIdSistemaPorNombreModulo;
	public JTextArea jTextAreanombreBusquedaPorIdSistemaPorNombreModulo;
	public JButton jButtonnombreBusquedaPorIdSistemaPorNombreModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaFK_IdSistemaModulo;
	public JLabel jLabelid_sistemaFK_IdSistemaModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaFK_IdSistemaModulo;
	public JButton jButtonid_sistemaFK_IdSistemaModulo= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaModuloUpdate= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo;
	public JLabel jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo;
	public JButton jButtonid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModuloUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModuloBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ModuloJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionModulo)	{
		this.jButtonRecargarInformacionModulo = jButtonRecargarInformacionModulo;
	}
	
	public JButton getjButtonProcesarInformacionModulo() {
		return this.jButtonProcesarInformacionModulo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionModulo)	{
		this.jButtonProcesarInformacionModulo = jButtonProcesarInformacionModulo;
	}
	
	
	public JButton getjButtonRecargarInformacionModulo() {
		return this.jButtonRecargarInformacionModulo;
	}
	
	
	public List<Modulo> getmodulos() {
		return this.modulos;
	}

	public void setmodulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	public List<Modulo> getmodulosAux() {
		return this.modulosAux;
	}

	public void setmodulosAux(List<Modulo> modulosAux) {
		this.modulosAux = modulosAux;
	}
	
	public List<Modulo> getmodulosEliminados() {
		return this.modulosEliminados;
	}

	public void setModulosEliminados(List<Modulo> modulosEliminados) {
		this.modulosEliminados = modulosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarModulo() {
		return jComboBoxTiposSeleccionarModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarModulo(
			JComboBox jComboBoxTiposSeleccionarModulo) {
		this.jComboBoxTiposSeleccionarModulo = jComboBoxTiposSeleccionarModulo;
	}
	
	public void setBorderResaltarTiposSeleccionarModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarModulo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralModulo() {
		return jTextFieldValorCampoGeneralModulo;
	}

	public void setjTextFieldValorCampoGeneralModulo(
			JTextField jTextFieldValorCampoGeneralModulo) {
		this.jTextFieldValorCampoGeneralModulo = jTextFieldValorCampoGeneralModulo;
	}

	public void setBorderResaltarValorCampoGeneralModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralModulo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosModulo() {
		return this.jCheckBoxSeleccionarTodosModulo;
	}

	public void setjCheckBoxSeleccionarTodosModulo(
			JCheckBox jCheckBoxSeleccionarTodosModulo) {
		this.jCheckBoxSeleccionarTodosModulo = jCheckBoxSeleccionarTodosModulo;
	}

	public void setBorderResaltarSeleccionarTodosModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosModulo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosModulo() {
		return this.jCheckBoxSeleccionadosModulo;
	}

	public void setjCheckBoxSeleccionadosModulo(
			JCheckBox jCheckBoxSeleccionadosModulo) {
		this.jCheckBoxSeleccionadosModulo = jCheckBoxSeleccionadosModulo;
	}
	
	public void setBorderResaltarSeleccionadosModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosModulo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesModulo() {
		return this.jComboBoxTiposArchivosReportesModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesModulo(
			JComboBox jComboBoxTiposArchivosReportesModulo) {
		this.jComboBoxTiposArchivosReportesModulo = jComboBoxTiposArchivosReportesModulo;
	}

	public void setBorderResaltarTiposArchivosReportesModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesModulo() {
		return this.jComboBoxTiposReportesModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesModulo(
			JComboBox jComboBoxTiposReportesModulo) {
		this.jComboBoxTiposReportesModulo = jComboBoxTiposReportesModulo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoModulo() {
	//	return jComboBoxTiposReportesDinamicoModulo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoModulo(
	//		JComboBox jComboBoxTiposReportesDinamicoModulo) {
	//	this.jComboBoxTiposReportesDinamicoModulo = jComboBoxTiposReportesDinamicoModulo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoModulo() {
	//	return jComboBoxTiposArchivosReportesDinamicoModulo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoModulo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoModulo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoModulo = jComboBoxTiposArchivosReportesDinamicoModulo;
	//}
	
	public void setBorderResaltarTiposReportesModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesModulo() {
		return this.jComboBoxTiposGraficosReportesModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesModulo(
			JComboBox jComboBoxTiposGraficosReportesModulo) {
		this.jComboBoxTiposGraficosReportesModulo = jComboBoxTiposGraficosReportesModulo;
	}
	
	public void setBorderResaltarTiposGraficosReportesModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionModulo() {
		return this.jComboBoxTiposPaginacionModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionModulo(
			JComboBox jComboBoxTiposPaginacionModulo) {
		this.jComboBoxTiposPaginacionModulo = jComboBoxTiposPaginacionModulo;
	}
	
	public void setBorderResaltarTiposPaginacionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesModulo() {
		return this.jComboBoxTiposRelacionesModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesModulo() {
		return this.jComboBoxTiposAccionesModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesModulo(
			JComboBox jComboBoxTiposRelacionesModulo) {
		this.jComboBoxTiposRelacionesModulo = jComboBoxTiposRelacionesModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesModulo(
			JComboBox jComboBoxTiposAccionesModulo) {
		this.jComboBoxTiposAccionesModulo = jComboBoxTiposAccionesModulo;
	}
	
	public void setBorderResaltarTiposRelacionesModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesModulo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesModulo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoModulo() {
	//	return jCheckBoxConGraficoDinamicoModulo;
	//}

	//public void setjCheckBoxConGraficoDinamicoModulo(
	//		JCheckBox jCheckBoxConGraficoDinamicoModulo) {
	//	this.jCheckBoxConGraficoDinamicoModulo = jCheckBoxConGraficoDinamicoModulo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoModulo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarModulo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoModulo .setBorder(borderResaltar);		
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
		this.moduloSessionBean=new ModuloSessionBean();
		
		this.moduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.moduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.moduloSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ModuloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ModuloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Modulo MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
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
		
		ModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarModulo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarModulo,this.jTtoolBarModulo,
							"nuevo","nuevo","Nuevo"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarModulo,this.jTtoolBarModulo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarModulo,this.jTtoolBarModulo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarModulo,this.jTtoolBarModulo,
							"duplicar","duplicar","Duplicar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarModulo,this.jTtoolBarModulo,
							"copiar","copiar","Copiar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarModulo,this.jTtoolBarModulo,
							"ver_form","ver_form","Ver"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModulo,this.jTtoolBarModulo,
							"recargar","recargar","Recargar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModulo,this.jTtoolBarModulo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarModulo,this.jTtoolBarModulo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarModulo,this.jTtoolBarModulo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarModulo,this.jTtoolBarModulo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarModulo,this.jTtoolBarModulo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarModulo,this.jTtoolBarModulo,
							"cerrar","cerrar","Salir"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarModulo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarModulo;
			
				this.jButtonProcesarInformacionToolBarModulo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarModulo;
				
		//protected JButton jButtonModificarToolBarModulo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarModulo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuModulo=new JMenuMe("General");
		this.jmenuArchivoModulo=new JMenuMe("Archivo");
		this.jmenuAccionesModulo=new JMenuMe("Acciones");
		this.jmenuDatosModulo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoModulo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoModulo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoModulo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarModulo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarModulo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarModulo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesModulo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesModulo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesModulo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosModulo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosModulo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosModulo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarModulo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarModulo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarModulo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormModulo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormModulo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormModulo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaModulo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaModulo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaModulo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionModulo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionModulo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionModulo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionModulo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionModulo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionModulo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresModulo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresModulo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresModulo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesModulo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesModulo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesModulo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByModulo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByModulo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByModulo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarModulo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByModulo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByModulo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByModulo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarModulo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosModulo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosModulo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosModulo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoModulo.add(this.jMenuItemCerrarModulo);
			
			this.jmenuAccionesModulo.add(this.jMenuItemNuevoModulo);
			this.jmenuAccionesModulo.add(this.jMenuItemNuevoGuardarCambiosModulo);
			this.jmenuAccionesModulo.add(this.jMenuItemNuevoRelacionesModulo);
			this.jmenuAccionesModulo.add(this.jMenuItemGuardarCambiosTablaModulo);		
			this.jmenuAccionesModulo.add(this.jMenuItemDuplicarModulo);		
			this.jmenuAccionesModulo.add(this.jMenuItemCopiarModulo);		
			this.jmenuAccionesModulo.add(this.jMenuItemVerFormModulo);		
			
			this.jmenuDatosModulo.add(this.jMenuItemRecargarInformacionModulo);				
			this.jmenuDatosModulo.add(this.jMenuItemAnterioresModulo);				
			this.jmenuDatosModulo.add(this.jMenuItemSiguientesModulo);				
			this.jmenuDatosModulo.add(this.jMenuItemAbrirOrderByModulo);				
			this.jmenuDatosModulo.add(this.jMenuItemMostrarOcultarModulo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesModulo.add(this.jMenuItemGuardarCambiosModulo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarModulo.add(this.jmenuArchivoModulo);		
			this.jmenuBarModulo.add(this.jmenuAccionesModulo);		
			this.jmenuBarModulo.add(this.jmenuDatosModulo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarModulo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasModulo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdSistemaPorNombreModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdSistemaPorNombreModulo.setToolTipText("Buscar Por Sistema Por Nombre ");
		this.jButtonBusquedaPorIdSistemaPorNombreModulo= new JButtonMe();
		this.jButtonBusquedaPorIdSistemaPorNombreModulo.setText("Buscar");
		this.jButtonBusquedaPorIdSistemaPorNombreModulo.setToolTipText("Buscar Por Sistema Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdSistemaPorNombreModulo,"buscar_button","Buscar Por Sistema Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdSistemaPorNombreModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo = new JLabelMe();
		jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo.setText("Sistema :");
		jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo.setToolTipText("Sistema");
		jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo= new JComboBoxMe();
		jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdSistemaPorNombreModulo = new JLabelMe();
		jLabelnombreBusquedaPorIdSistemaPorNombreModulo.setText("Nombre :");
		jLabelnombreBusquedaPorIdSistemaPorNombreModulo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdSistemaPorNombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdSistemaPorNombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdSistemaPorNombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdSistemaPorNombreModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorIdSistemaPorNombreModulo= new JTextAreaMe();
		jTextAreanombreBusquedaPorIdSistemaPorNombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdSistemaPorNombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdSistemaPorNombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorIdSistemaPorNombreModulo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSistemaModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSistemaModulo.setToolTipText("Buscar Por Sistema ");
		this.jButtonFK_IdSistemaModulo= new JButtonMe();
		this.jButtonFK_IdSistemaModulo.setText("Buscar");
		this.jButtonFK_IdSistemaModulo.setToolTipText("Buscar Por Sistema ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSistemaModulo,"buscar_button","Buscar Por Sistema ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSistemaModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaFK_IdSistemaModulo = new JLabelMe();
		jLabelid_sistemaFK_IdSistemaModulo.setText("Sistema :");
		jLabelid_sistemaFK_IdSistemaModulo.setToolTipText("Sistema");
		jLabelid_sistemaFK_IdSistemaModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaFK_IdSistemaModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaFK_IdSistemaModulo= new JComboBoxMe();
		jComboBoxid_sistemaFK_IdSistemaModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaFK_IdSistemaModulo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTeclaMascaraModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTeclaMascaraModulo.setToolTipText("Buscar Por Tipo Tecla Mascara ");
		this.jButtonFK_IdTipoTeclaMascaraModulo= new JButtonMe();
		this.jButtonFK_IdTipoTeclaMascaraModulo.setText("Buscar");
		this.jButtonFK_IdTipoTeclaMascaraModulo.setToolTipText("Buscar Por Tipo Tecla Mascara ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTeclaMascaraModulo,"buscar_button","Buscar Por Tipo Tecla Mascara ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTeclaMascaraModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo = new JLabelMe();
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setText("Tipo Tecla Mascara :");
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setToolTipText("Tipo Tecla Mascara");
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo= new JComboBoxMe();
		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasModulo=new JTabbedPane();


		this.jTabbedPaneBusquedasModulo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasModulo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasModulo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasModulo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleModulo = new ModuloDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Modulo DATOS");
			this.jInternalFrameDetalleFormModulo = new ModuloDetalleFormJInternalFrame(jDesktopPane,this.moduloSessionBean.getConGuardarRelaciones(),this.moduloSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormModulo = null;//new ModuloDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutModulo= new GridBagLayout();
		
		
		this.jTableDatosModulo = new JTableMe();      
		
		String sToolTipModulo="";
		sToolTipModulo=ModuloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipModulo+="(Seguridad.Modulo)";
		}
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			sToolTipModulo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosModulo.setToolTipText(sToolTipModulo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosModulo);
		this.jTableDatosModulo.setAutoCreateRowSorter(true);
		this.jTableDatosModulo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosModulo.setRowSelectionAllowed(true);
		this.jTableDatosModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosModulo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoModulo = new JButtonMe();
		this.jButtonDuplicarModulo = new JButtonMe();
		this.jButtonCopiarModulo = new JButtonMe();
		this.jButtonVerFormModulo = new JButtonMe();
		this.jButtonNuevoRelacionesModulo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaModulo = new JButtonMe();
		this.jButtonCerrarModulo = new JButtonMe();
		
		this.jScrollPanelDatosModulo = new JScrollPane();   
        this.jScrollPanelDatosGeneralModulo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Modulo";
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modulos" + this.sPath));
		} else {
			this.jScrollPanelDatosModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesModulo.setToolTipText("Acciones");
        this.jPanelAccionesModulo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosModulo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoModulo=new ReporteDinamicoJInternalFrame(ModuloConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoModulo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionModulo=new ImportacionJInternalFrame(ModuloConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionModulo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByModulo = new JButtonMe();
		
		this.jButtonAbrirOrderByModulo.setText("Orden");
		this.jButtonAbrirOrderByModulo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByModulo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModulo,false,this);
			
			//this.cargarOrderByModulo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModulo,true,this);
			
			//this.cargarOrderByModulo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosModulo.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosModulo.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosModulo.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosModulo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosModulo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosModulo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoModulo.setText("Nuevo");
		this.jButtonDuplicarModulo.setText("Duplicar");
		this.jButtonCopiarModulo.setText("Copiar");
		this.jButtonVerFormModulo.setText("Ver");
		this.jButtonNuevoRelacionesModulo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaModulo.setText("Guardar");
		this.jButtonCerrarModulo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoModulo,"nuevo_button","Nuevo",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarModulo,"duplicar_button","Duplicar",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarModulo,"copiar_button","Copiar",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormModulo,"ver_form","Ver",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesModulo,"nuevorelaciones_button","Nuevo Rel",this.moduloSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaModulo,"guardarcambiostabla_button","Guardar",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarModulo,"cerrar_button","Salir",this.moduloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoModulo.setToolTipText("Nuevo"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarModulo.setToolTipText("Duplicar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarModulo.setToolTipText("Copiar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormModulo.setToolTipText("Ver"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesModulo.setToolTipText("Nuevo Rel"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaModulo.setToolTipText("Guardar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarModulo.setToolTipText("Salir"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoModulo";
		inputMap = this.jButtonNuevoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoModulo"));
		
		//DUPLICAR
		sMapKey = "DuplicarModulo";
		inputMap = this.jButtonDuplicarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarModulo"));
		
		//COPIAR
		sMapKey = "CopiarModulo";
		inputMap = this.jButtonCopiarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarModulo"));
		
		//VEr FORM
		sMapKey = "VerFormModulo";
		inputMap = this.jButtonVerFormModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormModulo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesModulo";
		inputMap = this.jButtonNuevoRelacionesModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesModulo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarModulo";
		inputMap = this.jButtonModificarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarModulo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarModulo";
		inputMap = this.jButtonCerrarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarModulo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaModulo";
		inputMap = this.jButtonGuardarCambiosTablaModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaModulo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Modulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Modulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Modulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Modulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Modulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesModulo.setName("jPanelParametrosReportesModulo"); 
		
		this.jPanelParametrosReportesAccionesModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesModulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesModulo.setName("jPanelParametrosReportesAccionesModulo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesModulo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesModulo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionModulo = new JButtonMe();
		this.jButtonRecargarInformacionModulo.setText("Recargar");
		this.jButtonRecargarInformacionModulo.setToolTipText("Recargar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionModulo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionModulo = new JButtonMe();
		this.jButtonProcesarInformacionModulo.setText("Procesar");
		this.jButtonProcesarInformacionModulo.setToolTipText("Procesar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionModulo.setVisible(false);
			
		this.jButtonProcesarInformacionModulo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionModulo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionModulo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModulo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesModulo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModulo.setText("TIPO");       
		this.jComboBoxTiposReportesModulo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesModulo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesModulo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionModulo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionModulo.setText("Paginacion");
		this.jComboBoxTiposPaginacionModulo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesModulo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesModulo.setText("Accion");
		this.jComboBoxTiposRelacionesModulo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesModulo.setText("Accion");
		this.jComboBoxTiposAccionesModulo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarModulo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarModulo.setText("Accion");
		this.jComboBoxTiposSeleccionarModulo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralModulo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralModulo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralModulo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralModulo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesModulo = new JLabelMe();
		
		this.jLabelAccionesModulo.setText("Acciones");		
		this.jLabelAccionesModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosModulo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosModulo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosModulo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosModulo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosModulo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosModulo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaModulo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaModulo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaModulo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteModulo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteModulo.setText("Graf.");
		this.jCheckBoxConGraficoReporteModulo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresModulo = new JButtonMe();
		//this.jButtonAnterioresModulo.setText("<<");
        this.jButtonAnterioresModulo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresModulo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesModulo = new JButtonMe();
		//this.jButtonSiguientesModulo.setText(">>");
        this.jButtonSiguientesModulo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesModulo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosModulo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosModulo.setText("Nue");
        this.jButtonNuevoGuardarCambiosModulo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosModulo,"nuevoguardarcambios_button","Nue",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosModulo";
		inputMap = this.jButtonNuevoGuardarCambiosModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosModulo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionModulo";
		inputMap = this.jButtonRecargarInformacionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionModulo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesModulo";
		inputMap = this.jButtonSiguientesModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesModulo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresModulo";
		inputMap = this.jButtonAnterioresModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresModulo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasModulo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesModulo.setMinimumSize(new Dimension(this.getWidth(),ModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModuloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesModulo.setMaximumSize(new Dimension(this.getWidth(),ModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModuloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesModulo.setPreferredSize(new Dimension(this.getWidth(),ModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ModuloBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionModulo = new GridBagLayout();

			this.jPanelPaginacionModulo.setLayout(gridaBagLayoutPaginacionModulo);						
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 0;
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionModulo.add(this.jButtonAnterioresModulo, this.gridBagConstraintsModulo);
					
						
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsModulo.gridy = 0;
			
			this.jPanelPaginacionModulo.add(this.jButtonNuevoGuardarCambiosModulo, this.gridBagConstraintsModulo);
						
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsModulo.gridy = 0;
			this.jPanelPaginacionModulo.add(this.jButtonSiguientesModulo, this.gridBagConstraintsModulo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 1;
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModulo.add(this.jButtonNuevoModulo, this.gridBagConstraintsModulo);
						
			
			
			if(!this.moduloSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsModulo = new GridBagConstraints();
				this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsModulo.gridy = 1;
				this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionModulo.add(this.jButtonGuardarCambiosTablaModulo, this.gridBagConstraintsModulo);
			}
			
			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 1;
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModulo.add(this.jButtonDuplicarModulo, this.gridBagConstraintsModulo);
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 1;
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModulo.add(this.jButtonCopiarModulo, this.gridBagConstraintsModulo);
		
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 1;
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionModulo.add(this.jButtonVerFormModulo, this.gridBagConstraintsModulo);
		
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 1;
			this.gridBagConstraintsModulo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionModulo.add(this.jButtonCerrarModulo, this.gridBagConstraintsModulo);
		
		
		
		this.jButtonRecargarInformacionModulo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionModulo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionModulo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesModulo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesModulo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesModulo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesModulo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesModulo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesModulo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionModulo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionModulo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionModulo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaModulo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaModulo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaModulo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteModulo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteModulo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteModulo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosModulo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosModulo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosModulo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosModulo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosModulo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosModulo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesModulo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Modulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Modulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Modulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Modulo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesModulo.setLayout(gridaBagParametrosReportesModulo);
			this.jPanelParametrosReportesAccionesModulo.setLayout(gridaBagParametrosReportesAccionesModulo);
			
			
			this.jPanelParametrosAuxiliar1Modulo.setLayout(gridaBagParametrosAuxiliar1Modulo);
			this.jPanelParametrosAuxiliar2Modulo.setLayout(gridaBagParametrosAuxiliar2Modulo);
			this.jPanelParametrosAuxiliar3Modulo.setLayout(gridaBagParametrosAuxiliar3Modulo);
			this.jPanelParametrosAuxiliar4Modulo.setLayout(gridaBagParametrosAuxiliar4Modulo);
			//this.jPanelParametrosAuxiliar5Modulo.setLayout(gridaBagParametrosAuxiliar2Modulo);			
			
			
			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModulo.add(this.jButtonRecargarInformacionModulo, this.gridBagConstraintsModulo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Modulo.add(this.jComboBoxTiposPaginacionModulo, this.gridBagConstraintsModulo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Modulo.add(this.jCheckBoxConAltoMaximoTablaModulo, this.gridBagConstraintsModulo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Modulo.add(this.jComboBoxTiposArchivosReportesModulo, this.gridBagConstraintsModulo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModulo.add(this.jPanelParametrosAuxiliar1Modulo, this.gridBagConstraintsModulo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Modulo.add(this.jComboBoxTiposReportesModulo, this.gridBagConstraintsModulo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModulo.add(this.jPanelParametrosAuxiliar4Modulo, this.gridBagConstraintsModulo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModulo.add(this.jComboBoxTiposReportesModulo, this.gridBagConstraintsModulo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModulo.add(this.jCheckBoxGenerarReporteModulo, this.gridBagConstraintsModulo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModulo.add(this.jPanelParametrosAuxiliar2Modulo, this.gridBagConstraintsModulo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModulo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModulo.add(this.jLabelAccionesModulo, this.gridBagConstraintsModulo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsModulo = new GridBagConstraints();
				this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesModulo.add(this.jButtonAbrirOrderByModulo, this.gridBagConstraintsModulo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModulo.add(this.jComboBoxTiposSeleccionarModulo, this.gridBagConstraintsModulo);			
			
			
			/*
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsModulo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesModulo.add(this.jCheckBoxSeleccionarTodosModulo, this.gridBagConstraintsModulo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Modulo.add(this.jCheckBoxSeleccionarTodosModulo, this.gridBagConstraintsModulo);															
				
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Modulo.add(this.jCheckBoxSeleccionadosModulo, this.gridBagConstraintsModulo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesModulo.add(this.jPanelParametrosAuxiliar3Modulo, this.gridBagConstraintsModulo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModulo.add(this.jComboBoxTiposAccionesModulo, this.gridBagConstraintsModulo);
	
				
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesModulo.add(this.jTextFieldValorCampoGeneralModulo, this.gridBagConstraintsModulo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosModulo = new GridBagLayout();

			this.jScrollPanelDatosModulo.setLayout(gridaBagLayoutDatosModulo);
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = 0;
			this.gridBagConstraintsModulo.gridx = 0;
			
			this.jScrollPanelDatosModulo.add(this.jTableDatosModulo, this.gridBagConstraintsModulo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosModulo.setViewportView(this.jTableDatosModulo);
		this.jTableDatosModulo.setFillsViewportHeight(true);
		this.jTableDatosModulo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesModulo= new GridBagLayout();
		this.jPanelAccionesModulo.setLayout(gridaBagLayoutAccionesModulo);
		
		
		/*	
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 0;
			
		this.jPanelAccionesModulo.add(this.jButtonNuevoModulo, this.gridBagConstraintsModulo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdSistemaPorNombreModulo= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdSistemaPorNombreModulo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdSistemaPorNombreModulo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdSistemaPorNombreModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdSistemaPorNombreModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdSistemaPorNombreModulo.setLayout(gridaBagLayoutBusquedaPorIdSistemaPorNombreModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 0;
		gridBagConstraintsModulo.gridx = 0;
		jPanelBusquedaPorIdSistemaPorNombreModulo.add(jLabelid_sistemaBusquedaPorIdSistemaPorNombreModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 0;
		gridBagConstraintsModulo.gridx = 1;
		jPanelBusquedaPorIdSistemaPorNombreModulo.add(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo, gridBagConstraintsModulo);


		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 1;
		gridBagConstraintsModulo.gridx = 0;
		jPanelBusquedaPorIdSistemaPorNombreModulo.add(jLabelnombreBusquedaPorIdSistemaPorNombreModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 1;
		gridBagConstraintsModulo.gridx = 1;
		jPanelBusquedaPorIdSistemaPorNombreModulo.add(jTextAreanombreBusquedaPorIdSistemaPorNombreModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 2;
		gridBagConstraintsModulo.gridx =1;
		jPanelBusquedaPorIdSistemaPorNombreModulo.add(jButtonBusquedaPorIdSistemaPorNombreModulo, gridBagConstraintsModulo);

		jTabbedPaneBusquedasModulo.addTab("1.-Por Sistema Por Nombre ", jPanelBusquedaPorIdSistemaPorNombreModulo);
		jTabbedPaneBusquedasModulo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdSistemaModulo= new GridBagLayout();
		gridaBagLayoutFK_IdSistemaModulo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSistemaModulo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSistemaModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSistemaModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSistemaModulo.setLayout(gridaBagLayoutFK_IdSistemaModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 0;
		gridBagConstraintsModulo.gridx = 0;
		jPanelFK_IdSistemaModulo.add(jLabelid_sistemaFK_IdSistemaModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 0;
		gridBagConstraintsModulo.gridx = 1;
		jPanelFK_IdSistemaModulo.add(jComboBoxid_sistemaFK_IdSistemaModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 1;
		gridBagConstraintsModulo.gridx =1;
		jPanelFK_IdSistemaModulo.add(jButtonFK_IdSistemaModulo, gridBagConstraintsModulo);

		jTabbedPaneBusquedasModulo.addTab("2.-Por Sistema ", jPanelFK_IdSistemaModulo);
		jTabbedPaneBusquedasModulo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoTeclaMascaraModulo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTeclaMascaraModulo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTeclaMascaraModulo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTeclaMascaraModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTeclaMascaraModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTeclaMascaraModulo.setLayout(gridaBagLayoutFK_IdTipoTeclaMascaraModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 0;
		gridBagConstraintsModulo.gridx = 0;
		jPanelFK_IdTipoTeclaMascaraModulo.add(jLabelid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 0;
		gridBagConstraintsModulo.gridx = 1;
		jPanelFK_IdTipoTeclaMascaraModulo.add(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo, gridBagConstraintsModulo);

		gridBagConstraintsModulo = new GridBagConstraints();
		gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsModulo.gridy = 1;
		gridBagConstraintsModulo.gridx =1;
		jPanelFK_IdTipoTeclaMascaraModulo.add(jButtonFK_IdTipoTeclaMascaraModulo, gridBagConstraintsModulo);

		jTabbedPaneBusquedasModulo.addTab("3.-Por Tipo Tecla Mascara ", jPanelFK_IdTipoTeclaMascaraModulo);
		jTabbedPaneBusquedasModulo.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutModulo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutModulo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.moduloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsModulo = new GridBagConstraints();						
			this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModulo.gridx = 0;		
			//this.gridBagConstraintsModulo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsModulo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarModulo, this.gridBagConstraintsModulo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsModulo.gridx = 0;		
		//this.gridBagConstraintsModulo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsModulo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsModulo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModulo.gridx = 0;		
			this.gridBagConstraintsModulo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsModulo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasModulo, this.gridBagConstraintsModulo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesModulo, this.gridBagConstraintsModulo);								
		
		
		/*
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesModulo, this.gridBagConstraintsModulo);
		*/		
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsModulo.gridx =0;
		this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsModulo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosModulo, this.gridBagConstraintsModulo);
				
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionModulo, this.gridBagConstraintsModulo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ModuloJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosModulo = new GridBagLayout();
			this.jPanelBusquedasParametrosModulo.setLayout(gridaBagLayoutBusquedasParametrosModulo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralModulo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposModulo, this.gridBagConstraintsModulo);
			
			
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosModulo, this.gridBagConstraintsModulo);
		
			
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesModulo, this.gridBagConstraintsModulo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralModulo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoModulo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoModulo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoModulo.setName("jPanelReporteDinamicoModulo"); 
		
		this.jPanelReporteDinamicoModulo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoModulo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoModulo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoModulo.setLayout(gridaBagLayoutReporteDinamicoModulo);
		
		
		this.jInternalFrameReporteDinamicoModulo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoModulo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteModulo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoModulo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoModulo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoModulo.setResizable(true);
	    this.jInternalFrameReporteDinamicoModulo.setClosable(true);
	    this.jInternalFrameReporteDinamicoModulo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoModulo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoModulo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoModulo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modulos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteModulo = new JLabelMe();

		this.jLabelColumnasSelectReporteModulo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoModulo.add(this.jLabelColumnasSelectReporteModulo, this.gridBagConstraintsModulo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteModulo = new JList<Reporte>();
		this.jListColumnasSelectReporteModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteModulo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteModulo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteModulo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteModulo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteModulo=new JScrollPane(this.jListColumnasSelectReporteModulo);
			
			this.jScrollColumnasSelectReporteModulo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteModulo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteModulo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoModulo.add(this.jListColumnasSelectReporteModulo, this.gridBagConstraintsModulo);
		this.jPanelReporteDinamicoModulo.add(this.jScrollColumnasSelectReporteModulo, this.gridBagConstraintsModulo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteModulo = new JLabelMe();

		this.jLabelRelacionesSelectReporteModulo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteModulo = new JList<Reporte>();
		this.jListRelacionesSelectReporteModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteModulo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteModulo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteModulo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteModulo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteModulo=new JScrollPane(this.jListRelacionesSelectReporteModulo);
			
			this.jScrollRelacionesSelectReporteModulo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteModulo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteModulo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoModulo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoModulo = new JComboBoxMe();
		this.jListColumnasValoresGraficoModulo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoModulo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoModulo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoModulo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoModulo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoModulo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoModulo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoModulo.add(this.jLabelGenerarExcelReporteDinamicoModulo, this.gridBagConstraintsModulo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoModulo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoModulo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoModulo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoModulo.setToolTipText("Generar EXCEL"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoModulo.add(this.jButtonGenerarExcelReporteDinamicoModulo, this.gridBagConstraintsModulo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModulo.add(this.jComboBoxTiposReportesDinamicoModulo, this.gridBagConstraintsModulo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoModulo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoModulo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoModulo.add(this.jLabelTiposArchivoReporteDinamicoModulo, this.gridBagConstraintsModulo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModulo.add(this.jComboBoxTiposArchivosReportesDinamicoModulo, this.gridBagConstraintsModulo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoModulo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoModulo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoModulo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoModulo.setToolTipText("Generar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModulo.add(this.jButtonGenerarReporteDinamicoModulo, this.gridBagConstraintsModulo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoModulo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoModulo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoModulo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoModulo.setToolTipText("Cancelar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoModulo.add(this.jButtonCerrarReporteDinamicoModulo, this.gridBagConstraintsModulo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalModulo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoModulo= new JScrollPane(jPanelReporteDinamicoModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoModulo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoModulo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoModulo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modulos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsModulo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoModulo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalModulo);
		this.jInternalFrameReporteDinamicoModulo.getContentPane().add(this.jScrollPanelReporteDinamicoModulo, this.gridBagConstraintsModulo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionModulo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionModulo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionModulo.setName("jPanelImportacionModulo"); 
		
		this.jPanelImportacionModulo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionModulo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionModulo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionModulo.setLayout(gridaBagLayoutImportacionModulo);
		
		
		this.jInternalFrameImportacionModulo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionModulo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionModulo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteModulo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionModulo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionModulo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionModulo.setResizable(true);
	    this.jInternalFrameImportacionModulo.setClosable(true);
	    this.jInternalFrameImportacionModulo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionModulo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionModulo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionModulo.setResizable(true);
	    this.jInternalFrameImportacionModulo.setClosable(true);
	    this.jInternalFrameImportacionModulo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionModulo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionModulo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionModulo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modulos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionModulo = new JLabelMe();

		this.jLabelArchivoImportacionModulo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = iPosYImportacion;		
		this.gridBagConstraintsModulo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionModulo.add(this.jLabelArchivoImportacionModulo, this.gridBagConstraintsModulo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionModulo = new JFileChooser();		
		this.jFileChooserImportacionModulo.setToolTipText("ESCOGER ARCHIVO"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionModulo = new JButtonMe();
		this.jButtonAbrirImportacionModulo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionModulo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionModulo.setToolTipText("Generar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModulo.add(this.jButtonAbrirImportacionModulo, this.gridBagConstraintsModulo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionModulo = new JLabelMe();

		this.jLabelPathArchivoImportacionModulo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = iPosYImportacion;		
		this.gridBagConstraintsModulo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionModulo.add(this.jLabelPathArchivoImportacionModulo, this.gridBagConstraintsModulo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionModulo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionModulo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionModulo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionModulo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModulo.add(this.jTextFieldPathArchivoImportacionModulo, this.gridBagConstraintsModulo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionModulo = new JButtonMe();
		this.jButtonGenerarImportacionModulo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionModulo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionModulo.setToolTipText("Generar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModulo.add(this.jButtonGenerarImportacionModulo, this.gridBagConstraintsModulo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionModulo = new JButtonMe();
		this.jButtonCerrarImportacionModulo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionModulo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionModulo.setToolTipText("Cancelar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionModulo.add(this.jButtonCerrarImportacionModulo, this.gridBagConstraintsModulo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalModulo = new GridBagLayout();
		
		this.jScrollPanelImportacionModulo= new JScrollPane(jPanelImportacionModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy =iPosYImportacion;
		this.gridBagConstraintsModulo.gridx =iPosXImportacion;
		this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionModulo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalModulo);
		this.jInternalFrameImportacionModulo.getContentPane().add(this.jScrollPanelImportacionModulo, this.gridBagConstraintsModulo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByModulo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByModulo = new JButtonMe();
			this.jButtonAbrirOrderByModulo.setText("Orden");
			this.jButtonAbrirOrderByModulo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByModulo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByModulo";
			inputMap = this.jButtonAbrirOrderByModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByModulo"));
		
		
			GridBagLayout gridaBagLayoutOrderByModulo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByModulo.setName("jPanelOrderByModulo"); 
			
			this.jPanelOrderByModulo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByModulo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByModulo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByModulo.setLayout(gridaBagLayoutOrderByModulo);
			
			
			this.jTableDatosModuloOrderBy = new JTableMe();        
			this.jTableDatosModuloOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosModuloOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosModuloOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosModuloOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosModuloOrderBy.setViewportView(this.jTableDatosModuloOrderBy);
			this.jTableDatosModuloOrderBy.setFillsViewportHeight(true);
			this.jTableDatosModuloOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByModulo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByModulo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByModulo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteModulo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByModulo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByModulo.setTitle("Orden");
			this.jInternalFrameOrderByModulo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByModulo.setResizable(true);
			this.jInternalFrameOrderByModulo.setClosable(true);
			this.jInternalFrameOrderByModulo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByModulo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByModulo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByModulo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modulos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsModulo.gridx =iPosXOrderBy;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsModulo.ipady =150;
				
			this.jPanelOrderByModulo.add(jScrollPanelDatosModuloOrderBy, this.gridBagConstraintsModulo);//this.jTableDatosModuloTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByModulo = new JButtonMe();
			this.jButtonCerrarOrderByModulo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByModulo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByModulo.setToolTipText("Cancelar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsModulo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByModulo.add(this.jButtonCerrarOrderByModulo, this.gridBagConstraintsModulo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalModulo = new GridBagLayout();
			
			this.jScrollPanelOrderByModulo= new JScrollPane(jPanelOrderByModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy =iPosYOrderBy;
			this.gridBagConstraintsModulo.gridx =iPosXOrderBy;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByModulo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalModulo);
			
			this.jInternalFrameOrderByModulo.getContentPane().add(this.jScrollPanelOrderByModulo, this.gridBagConstraintsModulo);			
		
		} else {
			this.jButtonAbrirOrderByModulo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.moduloSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosModulo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosModulo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosModulo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosModulo.getRowHeight();//ModuloConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaModulo.isSelected()) {
					iHeightTable=ModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaModulo.isSelected()) {
					iHeightTable=ModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosModulo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosModulo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosModulo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosModulo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosModulo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosModulo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByModulo!=null && this.jInternalFrameOrderByModulo.getjTableDatosOrderBy()!=null) {
			//if(!this.moduloSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByModulo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByModulo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByModulo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosModulo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosModulo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosModulo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=moduloLogic.getModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modulos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Modulo> TraerModuloBeans(List<Modulo> modulos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Modulo modulo:modulos) {
					
				if(!(ModuloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ModuloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					modulo.setsDetalleGeneralEntityReporte(ModuloConstantesFunciones.getModuloDescripcion(modulo));
										
					modulo.setestado_descripcion(ModuloConstantesFunciones.getestadoDescripcion(modulo));	
					
						
					
				} else  {
							
					//modulo.setsDetalleGeneralEntityReporte(modulo.getsDetalleGeneralEntityReporte());
										
				}
				
				//modulobeans.add(modulobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return modulos;
    }
	//PARA REPORTES FIN
}
