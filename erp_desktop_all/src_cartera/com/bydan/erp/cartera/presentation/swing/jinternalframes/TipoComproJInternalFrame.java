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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoComproConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoComproJInternalFrame extends TipoComproBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCompro;
	
	protected JMenuBar jmenuBarTipoCompro;
	
	protected JMenu jmenuTipoCompro;
	protected JMenu jmenuDatosTipoCompro;
	protected JMenu jmenuArchivoTipoCompro;
	protected JMenu jmenuAccionesTipoCompro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCompro;	
	protected GridBagConstraints gridBagConstraintsTipoCompro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoComproDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCompro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCompro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCompro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoComproSessionBean tipocomproSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCompro> tipocompros;		
	public List<TipoCompro> tipocomprosEliminados;	
	public List<TipoCompro> tipocomprosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCompro;		
	protected JButton jButtonAbrirOrderByTipoCompro;
	
	
	//protected JPanel jPanelOrderByTipoCompro;
	//public JScrollPane jScrollPanelOrderByTipoCompro;	
	//protected JButton jButtonCerrarOrderByTipoCompro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoComproLogic tipocomproLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCompro;
	public JScrollPane jScrollPanelDatosEdicionTipoCompro;
	public JScrollPane jScrollPanelDatosGeneralTipoCompro;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoComproOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCompro;
	//public JScrollPane jScrollPanelImportacionTipoCompro;
	
	
	
	protected JPanel jPanelAccionesTipoCompro;
	
    protected JPanel jPanelPaginacionTipoCompro;
    protected JPanel jPanelParametrosReportesTipoCompro;
	protected JPanel jPanelParametrosReportesAccionesTipoCompro;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCompro;
	protected JPanel jPanelParametrosAuxiliar2TipoCompro;
	protected JPanel jPanelParametrosAuxiliar3TipoCompro;
	protected JPanel jPanelParametrosAuxiliar4TipoCompro;
	//protected JPanel jPanelParametrosAuxiliar5TipoCompro;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCompro;
	//protected JPanel jPanelImportacionTipoCompro;
	
	
	public JTable jTableDatosTipoCompro;
	
	
	
	//public JTable jTableDatosTipoComproOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCompro;
	protected JButton jButtonDuplicarTipoCompro;
	protected JButton jButtonCopiarTipoCompro;
	protected JButton jButtonVerFormTipoCompro;
	protected JButton jButtonNuevoRelacionesTipoCompro;
	protected JButton jButtonModificarTipoCompro;
	
    protected JButton jButtonGuardarCambiosTablaTipoCompro;
	protected JButton jButtonCerrarTipoCompro;
	
	
	protected JButton jButtonRecargarInformacionTipoCompro;
	protected JButton jButtonProcesarInformacionTipoCompro;
	
	
	protected JButton jButtonAnterioresTipoCompro;
	protected JButton jButtonSiguientesTipoCompro;
	protected JButton jButtonNuevoGuardarCambiosTipoCompro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCompro;
	//protected JButton jButtonCerrarReporteDinamicoTipoCompro;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCompro;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCompro;
	//protected JButton jButtonGenerarImportacionTipoCompro;
	//protected JButton jButtonCerrarImportacionTipoCompro;
	//protected JFileChooser jFileChooserImportacionTipoCompro;
	//protected File fileImportacionTipoCompro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCompro;
	protected JButton jButtonDuplicarToolBarTipoCompro;
	protected JButton jButtonNuevoRelacionesToolBarTipoCompro;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCompro;
	protected JButton jButtonCopiarToolBarTipoCompro;
	protected JButton jButtonVerFormToolBarTipoCompro;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCompro;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCompro;
	protected JButton jButtonCerrarToolBarTipoCompro;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCompro;
	protected JButton jButtonProcesarInformacionToolBarTipoCompro;
	protected JButton jButtonAnterioresToolBarTipoCompro;
	protected JButton jButtonSiguientesToolBarTipoCompro;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCompro;
	protected JButton jButtonAbrirOrderByToolBarTipoCompro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCompro;
	protected JMenuItem jMenuItemDuplicarTipoCompro;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCompro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCompro;
	protected JMenuItem jMenuItemCopiarTipoCompro;
	protected JMenuItem jMenuItemVerFormTipoCompro;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCompro;
	protected JMenuItem jMenuItemCerrarTipoCompro;
	protected JMenuItem jMenuItemDetalleCerrarTipoCompro;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCompro;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCompro;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCompro;
	protected JMenuItem jMenuItemProcesarInformacionTipoCompro;
	protected JMenuItem jMenuItemAnterioresTipoCompro;
	protected JMenuItem jMenuItemSiguientesTipoCompro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCompro;
	protected JMenuItem jMenuItemAbrirOrderByTipoCompro;
	protected JMenuItem jMenuItemMostrarOcultarTipoCompro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCompro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCompro;
	protected JCheckBox jCheckBoxSeleccionadosTipoCompro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCompro;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCompro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCompro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCompro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCompro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCompro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCompro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCompro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCompro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCompro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCompro;
	protected JTextField jTextFieldValorCampoGeneralTipoCompro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCompro;
	//public JList<Reporte> jListColumnasSelectReporteTipoCompro;
	//public JScrollPane jScrollColumnasSelectReporteTipoCompro;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCompro;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCompro;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCompro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCompro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCompro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCompro;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCompro;
	
		
	//public JLabel jLabelArchivoImportacionTipoCompro;	
	//public JLabel jLabelPathArchivoImportacionTipoCompro;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCompro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCompro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCompro;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCompro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCompro;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCompro;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCompro;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCompro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCompro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCompro;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCompro;
	public JPanel jPanelBusquedaPorCodigoTipoCompro;
	public JButton jButtonBusquedaPorCodigoTipoCompro;
	public JPanel jPanelBusquedaPorNombreTipoCompro;
	public JButton jButtonBusquedaPorNombreTipoCompro;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoCompro;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoCompro;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoCompro;
	public JButton jButtoncodigoBusquedaPorCodigoTipoComproBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoCompro;
	public JLabel jLabelnombreBusquedaPorNombreTipoCompro;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoCompro;
	public JButton jButtonnombreBusquedaPorNombreTipoComproBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoComproJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCompro)	{
		this.jButtonRecargarInformacionTipoCompro = jButtonRecargarInformacionTipoCompro;
	}
	
	public JButton getjButtonProcesarInformacionTipoCompro() {
		return this.jButtonProcesarInformacionTipoCompro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCompro)	{
		this.jButtonProcesarInformacionTipoCompro = jButtonProcesarInformacionTipoCompro;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCompro() {
		return this.jButtonRecargarInformacionTipoCompro;
	}
	
	
	public List<TipoCompro> gettipocompros() {
		return this.tipocompros;
	}

	public void settipocompros(List<TipoCompro> tipocompros) {
		this.tipocompros = tipocompros;
	}
	
	public List<TipoCompro> gettipocomprosAux() {
		return this.tipocomprosAux;
	}

	public void settipocomprosAux(List<TipoCompro> tipocomprosAux) {
		this.tipocomprosAux = tipocomprosAux;
	}
	
	public List<TipoCompro> gettipocomprosEliminados() {
		return this.tipocomprosEliminados;
	}

	public void setTipoComprosEliminados(List<TipoCompro> tipocomprosEliminados) {
		this.tipocomprosEliminados = tipocomprosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCompro() {
		return jComboBoxTiposSeleccionarTipoCompro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCompro(
			JComboBox jComboBoxTiposSeleccionarTipoCompro) {
		this.jComboBoxTiposSeleccionarTipoCompro = jComboBoxTiposSeleccionarTipoCompro;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCompro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCompro() {
		return jTextFieldValorCampoGeneralTipoCompro;
	}

	public void setjTextFieldValorCampoGeneralTipoCompro(
			JTextField jTextFieldValorCampoGeneralTipoCompro) {
		this.jTextFieldValorCampoGeneralTipoCompro = jTextFieldValorCampoGeneralTipoCompro;
	}

	public void setBorderResaltarValorCampoGeneralTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCompro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCompro() {
		return this.jCheckBoxSeleccionarTodosTipoCompro;
	}

	public void setjCheckBoxSeleccionarTodosTipoCompro(
			JCheckBox jCheckBoxSeleccionarTodosTipoCompro) {
		this.jCheckBoxSeleccionarTodosTipoCompro = jCheckBoxSeleccionarTodosTipoCompro;
	}

	public void setBorderResaltarSeleccionarTodosTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCompro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCompro() {
		return this.jCheckBoxSeleccionadosTipoCompro;
	}

	public void setjCheckBoxSeleccionadosTipoCompro(
			JCheckBox jCheckBoxSeleccionadosTipoCompro) {
		this.jCheckBoxSeleccionadosTipoCompro = jCheckBoxSeleccionadosTipoCompro;
	}
	
	public void setBorderResaltarSeleccionadosTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCompro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCompro() {
		return this.jComboBoxTiposArchivosReportesTipoCompro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCompro(
			JComboBox jComboBoxTiposArchivosReportesTipoCompro) {
		this.jComboBoxTiposArchivosReportesTipoCompro = jComboBoxTiposArchivosReportesTipoCompro;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCompro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCompro() {
		return this.jComboBoxTiposReportesTipoCompro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCompro(
			JComboBox jComboBoxTiposReportesTipoCompro) {
		this.jComboBoxTiposReportesTipoCompro = jComboBoxTiposReportesTipoCompro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCompro() {
	//	return jComboBoxTiposReportesDinamicoTipoCompro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCompro(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCompro) {
	//	this.jComboBoxTiposReportesDinamicoTipoCompro = jComboBoxTiposReportesDinamicoTipoCompro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCompro() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCompro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCompro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCompro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCompro = jComboBoxTiposArchivosReportesDinamicoTipoCompro;
	//}
	
	public void setBorderResaltarTiposReportesTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCompro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCompro() {
		return this.jComboBoxTiposGraficosReportesTipoCompro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCompro(
			JComboBox jComboBoxTiposGraficosReportesTipoCompro) {
		this.jComboBoxTiposGraficosReportesTipoCompro = jComboBoxTiposGraficosReportesTipoCompro;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCompro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCompro() {
		return this.jComboBoxTiposPaginacionTipoCompro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCompro(
			JComboBox jComboBoxTiposPaginacionTipoCompro) {
		this.jComboBoxTiposPaginacionTipoCompro = jComboBoxTiposPaginacionTipoCompro;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCompro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCompro() {
		return this.jComboBoxTiposRelacionesTipoCompro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCompro() {
		return this.jComboBoxTiposAccionesTipoCompro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCompro(
			JComboBox jComboBoxTiposRelacionesTipoCompro) {
		this.jComboBoxTiposRelacionesTipoCompro = jComboBoxTiposRelacionesTipoCompro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCompro(
			JComboBox jComboBoxTiposAccionesTipoCompro) {
		this.jComboBoxTiposAccionesTipoCompro = jComboBoxTiposAccionesTipoCompro;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCompro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCompro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCompro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCompro() {
	//	return jCheckBoxConGraficoDinamicoTipoCompro;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCompro(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCompro) {
	//	this.jCheckBoxConGraficoDinamicoTipoCompro = jCheckBoxConGraficoDinamicoTipoCompro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCompro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCompro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCompro .setBorder(borderResaltar);		
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
		this.tipocomproSessionBean=new TipoComproSessionBean();
		
		this.tipocomproSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomproSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocomproSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoComproJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoComproJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoComproJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoComproJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoComproJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Compro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoComproJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCompro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"nuevo","nuevo","Nuevo"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"duplicar","duplicar","Duplicar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"copiar","copiar","Copiar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"ver_form","ver_form","Ver"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"recargar","recargar","Recargar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCompro,this.jTtoolBarTipoCompro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCompro,this.jTtoolBarTipoCompro,
							"cerrar","cerrar","Salir"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCompro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCompro;
			
				this.jButtonProcesarInformacionToolBarTipoCompro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCompro;
				
		//protected JButton jButtonModificarToolBarTipoCompro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCompro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCompro=new JMenuMe("General");
		this.jmenuArchivoTipoCompro=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCompro=new JMenuMe("Acciones");
		this.jmenuDatosTipoCompro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCompro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCompro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCompro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCompro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCompro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCompro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCompro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCompro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCompro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCompro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCompro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCompro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCompro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCompro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCompro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCompro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCompro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCompro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCompro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCompro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCompro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCompro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCompro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCompro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCompro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCompro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCompro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCompro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCompro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCompro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCompro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCompro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCompro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCompro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCompro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCompro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCompro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCompro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCompro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCompro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCompro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCompro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCompro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCompro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCompro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCompro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCompro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCompro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCompro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCompro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCompro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCompro.add(this.jMenuItemCerrarTipoCompro);
			
			this.jmenuAccionesTipoCompro.add(this.jMenuItemNuevoTipoCompro);
			this.jmenuAccionesTipoCompro.add(this.jMenuItemNuevoGuardarCambiosTipoCompro);
			this.jmenuAccionesTipoCompro.add(this.jMenuItemNuevoRelacionesTipoCompro);
			this.jmenuAccionesTipoCompro.add(this.jMenuItemGuardarCambiosTablaTipoCompro);		
			this.jmenuAccionesTipoCompro.add(this.jMenuItemDuplicarTipoCompro);		
			this.jmenuAccionesTipoCompro.add(this.jMenuItemCopiarTipoCompro);		
			this.jmenuAccionesTipoCompro.add(this.jMenuItemVerFormTipoCompro);		
			
			this.jmenuDatosTipoCompro.add(this.jMenuItemRecargarInformacionTipoCompro);				
			this.jmenuDatosTipoCompro.add(this.jMenuItemAnterioresTipoCompro);				
			this.jmenuDatosTipoCompro.add(this.jMenuItemSiguientesTipoCompro);				
			this.jmenuDatosTipoCompro.add(this.jMenuItemAbrirOrderByTipoCompro);				
			this.jmenuDatosTipoCompro.add(this.jMenuItemMostrarOcultarTipoCompro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCompro.add(this.jMenuItemGuardarCambiosTipoCompro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCompro.add(this.jmenuArchivoTipoCompro);		
			this.jmenuBarTipoCompro.add(this.jmenuAccionesTipoCompro);		
			this.jmenuBarTipoCompro.add(this.jmenuDatosTipoCompro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCompro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCompro() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoCompro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoCompro.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoCompro= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoCompro.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoCompro.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoCompro,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoCompro = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoCompro.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoCompro.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoCompro,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoCompro= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoCompro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoCompro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoCompro.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoCompro= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoCompro.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoCompro.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoCompro,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoCompro = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoCompro.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoCompro.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoCompro,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoCompro= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoCompro,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCompro=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCompro.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCompro.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCompro.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCompro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCompro,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCompro = new TipoComproDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Compro DATOS");
			this.jInternalFrameDetalleFormTipoCompro = new TipoComproDetalleFormJInternalFrame(jDesktopPane,this.tipocomproSessionBean.getConGuardarRelaciones(),this.tipocomproSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCompro = null;//new TipoComproDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCompro= new GridBagLayout();
		
		
		this.jTableDatosTipoCompro = new JTableMe();      
		
		String sToolTipTipoCompro="";
		sToolTipTipoCompro=TipoComproConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCompro+="(Cartera.TipoCompro)";
		}
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCompro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCompro.setToolTipText(sToolTipTipoCompro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCompro);
		this.jTableDatosTipoCompro.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCompro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCompro.setRowSelectionAllowed(true);
		this.jTableDatosTipoCompro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCompro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCompro = new JButtonMe();
		this.jButtonDuplicarTipoCompro = new JButtonMe();
		this.jButtonCopiarTipoCompro = new JButtonMe();
		this.jButtonVerFormTipoCompro = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCompro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCompro = new JButtonMe();
		this.jButtonCerrarTipoCompro = new JButtonMe();
		
		this.jScrollPanelDatosTipoCompro = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCompro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Compro";
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Compros" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCompro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCompro.setToolTipText("Acciones");
        this.jPanelAccionesTipoCompro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCompro=new ReporteDinamicoJInternalFrame(TipoComproConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCompro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCompro=new ImportacionJInternalFrame(TipoComproConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCompro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCompro = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCompro.setText("Orden");
		this.jButtonAbrirOrderByTipoCompro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCompro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCompro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompro,false,this);
			
			//this.cargarOrderByTipoCompro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCompro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompro,true,this);
			
			//this.cargarOrderByTipoCompro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCompro.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCompro.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCompro.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCompro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCompro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCompro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCompro.setText("Nuevo");
		this.jButtonDuplicarTipoCompro.setText("Duplicar");
		this.jButtonCopiarTipoCompro.setText("Copiar");
		this.jButtonVerFormTipoCompro.setText("Ver");
		this.jButtonNuevoRelacionesTipoCompro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCompro.setText("Guardar");
		this.jButtonCerrarTipoCompro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCompro,"nuevo_button","Nuevo",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCompro,"duplicar_button","Duplicar",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCompro,"copiar_button","Copiar",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCompro,"ver_form","Ver",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCompro,"nuevorelaciones_button","Nuevo Rel",this.tipocomproSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCompro,"guardarcambiostabla_button","Guardar",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCompro,"cerrar_button","Salir",this.tipocomproSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCompro.setToolTipText("Nuevo"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCompro.setToolTipText("Duplicar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCompro.setToolTipText("Copiar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCompro.setToolTipText("Ver"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCompro.setToolTipText("Nuevo Rel"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCompro.setToolTipText("Guardar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCompro.setToolTipText("Salir"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCompro";
		inputMap = this.jButtonNuevoTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCompro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCompro"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCompro";
		inputMap = this.jButtonDuplicarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCompro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCompro"));
		
		//COPIAR
		sMapKey = "CopiarTipoCompro";
		inputMap = this.jButtonCopiarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCompro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCompro"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCompro";
		inputMap = this.jButtonVerFormTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCompro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCompro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCompro";
		inputMap = this.jButtonNuevoRelacionesTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCompro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCompro";
		inputMap = this.jButtonModificarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCompro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCompro";
		inputMap = this.jButtonCerrarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCompro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCompro";
		inputMap = this.jButtonGuardarCambiosTablaTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCompro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCompro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCompro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCompro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCompro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCompro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCompro.setName("jPanelParametrosReportesTipoCompro"); 
		
		this.jPanelParametrosReportesAccionesTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCompro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCompro.setName("jPanelParametrosReportesAccionesTipoCompro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCompro = new JButtonMe();
		this.jButtonRecargarInformacionTipoCompro.setText("Recargar");
		this.jButtonRecargarInformacionTipoCompro.setToolTipText("Recargar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCompro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCompro = new JButtonMe();
		this.jButtonProcesarInformacionTipoCompro.setText("Procesar");
		this.jButtonProcesarInformacionTipoCompro.setToolTipText("Procesar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCompro.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCompro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCompro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCompro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCompro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCompro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCompro.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCompro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCompro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCompro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCompro.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCompro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCompro.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCompro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCompro.setText("Accion");
		this.jComboBoxTiposAccionesTipoCompro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCompro.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCompro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCompro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCompro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCompro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCompro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCompro = new JLabelMe();
		
		this.jLabelAccionesTipoCompro.setText("Acciones");		
		this.jLabelAccionesTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCompro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCompro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCompro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCompro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCompro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCompro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCompro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCompro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCompro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCompro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCompro.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCompro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCompro = new JButtonMe();
		//this.jButtonAnterioresTipoCompro.setText("<<");
        this.jButtonAnterioresTipoCompro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCompro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCompro = new JButtonMe();
		//this.jButtonSiguientesTipoCompro.setText(">>");
        this.jButtonSiguientesTipoCompro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCompro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCompro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCompro.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCompro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCompro,"nuevoguardarcambios_button","Nue",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCompro";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCompro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCompro";
		inputMap = this.jButtonRecargarInformacionTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCompro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCompro";
		inputMap = this.jButtonSiguientesTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCompro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCompro";
		inputMap = this.jButtonAnterioresTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCompro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCompro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCompro.setMinimumSize(new Dimension(this.getWidth(),TipoComproBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComproBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCompro.setMaximumSize(new Dimension(this.getWidth(),TipoComproBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComproBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCompro.setPreferredSize(new Dimension(this.getWidth(),TipoComproBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComproBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCompro = new GridBagLayout();

			this.jPanelPaginacionTipoCompro.setLayout(gridaBagLayoutPaginacionTipoCompro);						
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 0;
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCompro.add(this.jButtonAnterioresTipoCompro, this.gridBagConstraintsTipoCompro);
					
						
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCompro.gridy = 0;
			
			this.jPanelPaginacionTipoCompro.add(this.jButtonNuevoGuardarCambiosTipoCompro, this.gridBagConstraintsTipoCompro);
						
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCompro.gridy = 0;
			this.jPanelPaginacionTipoCompro.add(this.jButtonSiguientesTipoCompro, this.gridBagConstraintsTipoCompro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 1;
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompro.add(this.jButtonNuevoTipoCompro, this.gridBagConstraintsTipoCompro);
						
			
			
			if(!this.tipocomproSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCompro = new GridBagConstraints();
				this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCompro.gridy = 1;
				this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCompro.add(this.jButtonGuardarCambiosTablaTipoCompro, this.gridBagConstraintsTipoCompro);
			}
			
			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 1;
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompro.add(this.jButtonDuplicarTipoCompro, this.gridBagConstraintsTipoCompro);
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 1;
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompro.add(this.jButtonCopiarTipoCompro, this.gridBagConstraintsTipoCompro);
		
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 1;
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompro.add(this.jButtonVerFormTipoCompro, this.gridBagConstraintsTipoCompro);
		
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 1;
			this.gridBagConstraintsTipoCompro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCompro.add(this.jButtonCerrarTipoCompro, this.gridBagConstraintsTipoCompro);
		
		
		
		this.jButtonRecargarInformacionTipoCompro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCompro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCompro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCompro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCompro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCompro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCompro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCompro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCompro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCompro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCompro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCompro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCompro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCompro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCompro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCompro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCompro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCompro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCompro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCompro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCompro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCompro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCompro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCompro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCompro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCompro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCompro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCompro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCompro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCompro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCompro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCompro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCompro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCompro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCompro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCompro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCompro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCompro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCompro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCompro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCompro.setLayout(gridaBagParametrosReportesTipoCompro);
			this.jPanelParametrosReportesAccionesTipoCompro.setLayout(gridaBagParametrosReportesAccionesTipoCompro);
			
			
			this.jPanelParametrosAuxiliar1TipoCompro.setLayout(gridaBagParametrosAuxiliar1TipoCompro);
			this.jPanelParametrosAuxiliar2TipoCompro.setLayout(gridaBagParametrosAuxiliar2TipoCompro);
			this.jPanelParametrosAuxiliar3TipoCompro.setLayout(gridaBagParametrosAuxiliar3TipoCompro);
			this.jPanelParametrosAuxiliar4TipoCompro.setLayout(gridaBagParametrosAuxiliar4TipoCompro);
			//this.jPanelParametrosAuxiliar5TipoCompro.setLayout(gridaBagParametrosAuxiliar2TipoCompro);			
			
			
			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompro.add(this.jButtonRecargarInformacionTipoCompro, this.gridBagConstraintsTipoCompro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCompro.add(this.jComboBoxTiposPaginacionTipoCompro, this.gridBagConstraintsTipoCompro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCompro.add(this.jCheckBoxConAltoMaximoTablaTipoCompro, this.gridBagConstraintsTipoCompro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCompro.add(this.jComboBoxTiposArchivosReportesTipoCompro, this.gridBagConstraintsTipoCompro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompro.add(this.jPanelParametrosAuxiliar1TipoCompro, this.gridBagConstraintsTipoCompro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCompro.add(this.jComboBoxTiposReportesTipoCompro, this.gridBagConstraintsTipoCompro);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompro.add(this.jPanelParametrosAuxiliar4TipoCompro, this.gridBagConstraintsTipoCompro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompro.add(this.jComboBoxTiposReportesTipoCompro, this.gridBagConstraintsTipoCompro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCompro.add(this.jCheckBoxGenerarReporteTipoCompro, this.gridBagConstraintsTipoCompro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompro.add(this.jPanelParametrosAuxiliar2TipoCompro, this.gridBagConstraintsTipoCompro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCompro.add(this.jLabelAccionesTipoCompro, this.gridBagConstraintsTipoCompro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCompro = new GridBagConstraints();
				this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCompro.add(this.jButtonAbrirOrderByTipoCompro, this.gridBagConstraintsTipoCompro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompro.add(this.jComboBoxTiposSeleccionarTipoCompro, this.gridBagConstraintsTipoCompro);			
			
			
			/*
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCompro.add(this.jCheckBoxSeleccionarTodosTipoCompro, this.gridBagConstraintsTipoCompro);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCompro.add(this.jCheckBoxSeleccionarTodosTipoCompro, this.gridBagConstraintsTipoCompro);															
				
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCompro.add(this.jCheckBoxSeleccionadosTipoCompro, this.gridBagConstraintsTipoCompro);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompro.add(this.jPanelParametrosAuxiliar3TipoCompro, this.gridBagConstraintsTipoCompro);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompro.add(this.jComboBoxTiposAccionesTipoCompro, this.gridBagConstraintsTipoCompro);
	
				
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompro.add(this.jTextFieldValorCampoGeneralTipoCompro, this.gridBagConstraintsTipoCompro);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCompro = new GridBagLayout();

			this.jScrollPanelDatosTipoCompro.setLayout(gridaBagLayoutDatosTipoCompro);
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = 0;
			this.gridBagConstraintsTipoCompro.gridx = 0;
			
			this.jScrollPanelDatosTipoCompro.add(this.jTableDatosTipoCompro, this.gridBagConstraintsTipoCompro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCompro.setViewportView(this.jTableDatosTipoCompro);
		this.jTableDatosTipoCompro.setFillsViewportHeight(true);
		this.jTableDatosTipoCompro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCompro= new GridBagLayout();
		this.jPanelAccionesTipoCompro.setLayout(gridaBagLayoutAccionesTipoCompro);
		
		
		/*	
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx = 0;
			
		this.jPanelAccionesTipoCompro.add(this.jButtonNuevoTipoCompro, this.gridBagConstraintsTipoCompro);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoCompro= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoCompro.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoCompro.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoCompro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoCompro.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoCompro.setLayout(gridaBagLayoutBusquedaPorCodigoTipoCompro);

		gridBagConstraintsTipoCompro = new GridBagConstraints();
		gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCompro.gridy = 0;
		gridBagConstraintsTipoCompro.gridx = 0;
		jPanelBusquedaPorCodigoTipoCompro.add(jLabelcodigoBusquedaPorCodigoTipoCompro, gridBagConstraintsTipoCompro);

		gridBagConstraintsTipoCompro = new GridBagConstraints();
		gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCompro.gridy = 0;
		gridBagConstraintsTipoCompro.gridx = 1;
		jPanelBusquedaPorCodigoTipoCompro.add(jTextFieldcodigoBusquedaPorCodigoTipoCompro, gridBagConstraintsTipoCompro);

		gridBagConstraintsTipoCompro = new GridBagConstraints();
		gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCompro.gridy = 1;
		gridBagConstraintsTipoCompro.gridx =1;
		jPanelBusquedaPorCodigoTipoCompro.add(jButtonBusquedaPorCodigoTipoCompro, gridBagConstraintsTipoCompro);

		jTabbedPaneBusquedasTipoCompro.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoCompro);
		jTabbedPaneBusquedasTipoCompro.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoCompro= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoCompro.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCompro.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCompro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoCompro.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoCompro.setLayout(gridaBagLayoutBusquedaPorNombreTipoCompro);

		gridBagConstraintsTipoCompro = new GridBagConstraints();
		gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCompro.gridy = 0;
		gridBagConstraintsTipoCompro.gridx = 0;
		jPanelBusquedaPorNombreTipoCompro.add(jLabelnombreBusquedaPorNombreTipoCompro, gridBagConstraintsTipoCompro);

		gridBagConstraintsTipoCompro = new GridBagConstraints();
		gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCompro.gridy = 0;
		gridBagConstraintsTipoCompro.gridx = 1;
		jPanelBusquedaPorNombreTipoCompro.add(jTextAreanombreBusquedaPorNombreTipoCompro, gridBagConstraintsTipoCompro);

		gridBagConstraintsTipoCompro = new GridBagConstraints();
		gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCompro.gridy = 1;
		gridBagConstraintsTipoCompro.gridx =1;
		jPanelBusquedaPorNombreTipoCompro.add(jButtonBusquedaPorNombreTipoCompro, gridBagConstraintsTipoCompro);

		jTabbedPaneBusquedasTipoCompro.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoCompro);
		jTabbedPaneBusquedasTipoCompro.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCompro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCompro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();						
			this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCompro.gridx = 0;		
			//this.gridBagConstraintsTipoCompro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCompro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCompro, this.gridBagConstraintsTipoCompro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCompro.gridx = 0;		
		//this.gridBagConstraintsTipoCompro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCompro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCompro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCompro.gridx = 0;		
			this.gridBagConstraintsTipoCompro.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCompro.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCompro, this.gridBagConstraintsTipoCompro);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCompro, this.gridBagConstraintsTipoCompro);								
		
		
		/*
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCompro, this.gridBagConstraintsTipoCompro);
		*/		
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCompro.gridx =0;
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCompro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCompro, this.gridBagConstraintsTipoCompro);
				
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCompro, this.gridBagConstraintsTipoCompro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoComproJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCompro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCompro = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCompro.setLayout(gridaBagLayoutBusquedasParametrosTipoCompro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCompro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCompro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCompro, this.gridBagConstraintsTipoCompro);
			
			
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCompro, this.gridBagConstraintsTipoCompro);
		
			
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCompro, this.gridBagConstraintsTipoCompro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCompro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCompro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCompro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCompro.setName("jPanelReporteDinamicoTipoCompro"); 
		
		this.jPanelReporteDinamicoTipoCompro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCompro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCompro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCompro.setLayout(gridaBagLayoutReporteDinamicoTipoCompro);
		
		
		this.jInternalFrameReporteDinamicoTipoCompro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCompro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCompro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCompro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCompro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCompro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCompro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCompro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCompro.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCompro.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCompro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCompro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCompro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCompro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Compros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCompro = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCompro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCompro.add(this.jLabelColumnasSelectReporteTipoCompro, this.gridBagConstraintsTipoCompro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCompro = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCompro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCompro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCompro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCompro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCompro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCompro=new JScrollPane(this.jListColumnasSelectReporteTipoCompro);
			
			this.jScrollColumnasSelectReporteTipoCompro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCompro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCompro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCompro.add(this.jListColumnasSelectReporteTipoCompro, this.gridBagConstraintsTipoCompro);
		this.jPanelReporteDinamicoTipoCompro.add(this.jScrollColumnasSelectReporteTipoCompro, this.gridBagConstraintsTipoCompro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCompro = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCompro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCompro = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCompro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCompro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCompro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCompro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCompro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCompro=new JScrollPane(this.jListRelacionesSelectReporteTipoCompro);
			
			this.jScrollRelacionesSelectReporteTipoCompro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCompro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCompro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCompro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCompro = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCompro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCompro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCompro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCompro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCompro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCompro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCompro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCompro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCompro.add(this.jLabelGenerarExcelReporteDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCompro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCompro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCompro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCompro.setToolTipText("Generar EXCEL"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCompro.add(this.jButtonGenerarExcelReporteDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompro.add(this.jComboBoxTiposReportesDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCompro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCompro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCompro.add(this.jLabelTiposArchivoReporteDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompro.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCompro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCompro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCompro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCompro.setToolTipText("Generar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompro.add(this.jButtonGenerarReporteDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCompro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCompro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCompro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCompro.setToolTipText("Cancelar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompro.add(this.jButtonCerrarReporteDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCompro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCompro= new JScrollPane(jPanelReporteDinamicoTipoCompro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCompro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCompro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCompro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Compros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCompro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCompro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCompro);
		this.jInternalFrameReporteDinamicoTipoCompro.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCompro, this.gridBagConstraintsTipoCompro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCompro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCompro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCompro.setName("jPanelImportacionTipoCompro"); 
		
		this.jPanelImportacionTipoCompro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCompro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCompro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCompro.setLayout(gridaBagLayoutImportacionTipoCompro);
		
		
		this.jInternalFrameImportacionTipoCompro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCompro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCompro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCompro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCompro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCompro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCompro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCompro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCompro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCompro.setResizable(true);
	    this.jInternalFrameImportacionTipoCompro.setClosable(true);
	    this.jInternalFrameImportacionTipoCompro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCompro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCompro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCompro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCompro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCompro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCompro.setResizable(true);
	    this.jInternalFrameImportacionTipoCompro.setClosable(true);
	    this.jInternalFrameImportacionTipoCompro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCompro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCompro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCompro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Compros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCompro = new JLabelMe();

		this.jLabelArchivoImportacionTipoCompro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCompro.add(this.jLabelArchivoImportacionTipoCompro, this.gridBagConstraintsTipoCompro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCompro = new JFileChooser();		
		this.jFileChooserImportacionTipoCompro.setToolTipText("ESCOGER ARCHIVO"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCompro = new JButtonMe();
		this.jButtonAbrirImportacionTipoCompro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCompro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCompro.setToolTipText("Generar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompro.add(this.jButtonAbrirImportacionTipoCompro, this.gridBagConstraintsTipoCompro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCompro = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCompro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCompro.add(this.jLabelPathArchivoImportacionTipoCompro, this.gridBagConstraintsTipoCompro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCompro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCompro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCompro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCompro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompro.add(this.jTextFieldPathArchivoImportacionTipoCompro, this.gridBagConstraintsTipoCompro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCompro = new JButtonMe();
		this.jButtonGenerarImportacionTipoCompro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCompro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCompro.setToolTipText("Generar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompro.add(this.jButtonGenerarImportacionTipoCompro, this.gridBagConstraintsTipoCompro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCompro = new JButtonMe();
		this.jButtonCerrarImportacionTipoCompro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCompro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCompro.setToolTipText("Cancelar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompro.add(this.jButtonCerrarImportacionTipoCompro, this.gridBagConstraintsTipoCompro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCompro = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCompro= new JScrollPane(jPanelImportacionTipoCompro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCompro.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCompro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCompro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCompro);
		this.jInternalFrameImportacionTipoCompro.getContentPane().add(this.jScrollPanelImportacionTipoCompro, this.gridBagConstraintsTipoCompro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCompro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCompro = new JButtonMe();
			this.jButtonAbrirOrderByTipoCompro.setText("Orden");
			this.jButtonAbrirOrderByTipoCompro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCompro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCompro";
			inputMap = this.jButtonAbrirOrderByTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCompro"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCompro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCompro.setName("jPanelOrderByTipoCompro"); 
			
			this.jPanelOrderByTipoCompro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCompro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCompro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCompro.setLayout(gridaBagLayoutOrderByTipoCompro);
			
			
			this.jTableDatosTipoComproOrderBy = new JTableMe();        
			this.jTableDatosTipoComproOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoComproOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoComproOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoComproOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoComproOrderBy.setViewportView(this.jTableDatosTipoComproOrderBy);
			this.jTableDatosTipoComproOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoComproOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCompro= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCompro= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCompro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCompro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCompro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCompro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCompro.setTitle("Orden");
			this.jInternalFrameOrderByTipoCompro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCompro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCompro.setResizable(true);
			this.jInternalFrameOrderByTipoCompro.setClosable(true);
			this.jInternalFrameOrderByTipoCompro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCompro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCompro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCompro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Compros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCompro.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCompro.ipady =150;
				
			this.jPanelOrderByTipoCompro.add(jScrollPanelDatosTipoComproOrderBy, this.gridBagConstraintsTipoCompro);//this.jTableDatosTipoComproTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCompro = new JButtonMe();
			this.jButtonCerrarOrderByTipoCompro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCompro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCompro.setToolTipText("Cancelar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCompro.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCompro.add(this.jButtonCerrarOrderByTipoCompro, this.gridBagConstraintsTipoCompro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCompro = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCompro= new JScrollPane(jPanelOrderByTipoCompro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCompro.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCompro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCompro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCompro);
			
			this.jInternalFrameOrderByTipoCompro.getContentPane().add(this.jScrollPanelOrderByTipoCompro, this.gridBagConstraintsTipoCompro);			
		
		} else {
			this.jButtonAbrirOrderByTipoCompro = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocomproSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCompro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCompro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCompro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCompro.getRowHeight();//TipoComproConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoComproConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCompro.isSelected()) {
					iHeightTable=TipoComproConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoComproConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoComproConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoComproConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCompro.isSelected()) {
					iHeightTable=TipoComproConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoComproConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoComproConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCompro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCompro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCompro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCompro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCompro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCompro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCompro!=null && this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCompro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCompro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCompro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCompro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCompro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCompro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocomproLogic.getTipoCompros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocompros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCompro> TraerTipoComproBeans(List<TipoCompro> tipocompros,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCompro tipocompro:tipocompros) {
					
				if(!(TipoComproConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoComproConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocompro.setsDetalleGeneralEntityReporte(TipoComproConstantesFunciones.getTipoComproDescripcion(tipocompro));
										
						
					
						
					
				} else  {
							
					//tipocompro.setsDetalleGeneralEntityReporte(tipocompro.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocomprobeans.add(tipocomprobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocompros;
    }
	//PARA REPORTES FIN
}
