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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoSeguroConstantesFunciones;

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
public class TipoSeguroJInternalFrame extends TipoSeguroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoSeguro;
	
	protected JMenuBar jmenuBarTipoSeguro;
	
	protected JMenu jmenuTipoSeguro;
	protected JMenu jmenuDatosTipoSeguro;
	protected JMenu jmenuArchivoTipoSeguro;
	protected JMenu jmenuAccionesTipoSeguro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSeguro;	
	protected GridBagConstraints gridBagConstraintsTipoSeguro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoSeguroDetalleFormJInternalFrame jInternalFrameDetalleFormTipoSeguro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoSeguro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoSeguro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSeguroSessionBean tiposeguroSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoSeguro> tiposeguros;		
	public List<TipoSeguro> tiposegurosEliminados;	
	public List<TipoSeguro> tiposegurosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoSeguro;		
	protected JButton jButtonAbrirOrderByTipoSeguro;
	
	
	//protected JPanel jPanelOrderByTipoSeguro;
	//public JScrollPane jScrollPanelOrderByTipoSeguro;	
	//protected JButton jButtonCerrarOrderByTipoSeguro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoSeguroLogic tiposeguroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoSeguro;
	public JScrollPane jScrollPanelDatosEdicionTipoSeguro;
	public JScrollPane jScrollPanelDatosGeneralTipoSeguro;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoSeguroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoSeguro;
	//public JScrollPane jScrollPanelImportacionTipoSeguro;
	
	
	
	protected JPanel jPanelAccionesTipoSeguro;
	
    protected JPanel jPanelPaginacionTipoSeguro;
    protected JPanel jPanelParametrosReportesTipoSeguro;
	protected JPanel jPanelParametrosReportesAccionesTipoSeguro;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoSeguro;
	protected JPanel jPanelParametrosAuxiliar2TipoSeguro;
	protected JPanel jPanelParametrosAuxiliar3TipoSeguro;
	protected JPanel jPanelParametrosAuxiliar4TipoSeguro;
	//protected JPanel jPanelParametrosAuxiliar5TipoSeguro;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoSeguro;
	//protected JPanel jPanelImportacionTipoSeguro;
	
	
	public JTable jTableDatosTipoSeguro;
	
	
	
	//public JTable jTableDatosTipoSeguroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoSeguro;
	protected JButton jButtonDuplicarTipoSeguro;
	protected JButton jButtonCopiarTipoSeguro;
	protected JButton jButtonVerFormTipoSeguro;
	protected JButton jButtonNuevoRelacionesTipoSeguro;
	protected JButton jButtonModificarTipoSeguro;
	
    protected JButton jButtonGuardarCambiosTablaTipoSeguro;
	protected JButton jButtonCerrarTipoSeguro;
	
	
	protected JButton jButtonRecargarInformacionTipoSeguro;
	protected JButton jButtonProcesarInformacionTipoSeguro;
	
	
	protected JButton jButtonAnterioresTipoSeguro;
	protected JButton jButtonSiguientesTipoSeguro;
	protected JButton jButtonNuevoGuardarCambiosTipoSeguro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoSeguro;
	//protected JButton jButtonCerrarReporteDinamicoTipoSeguro;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoSeguro;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoSeguro;
	//protected JButton jButtonGenerarImportacionTipoSeguro;
	//protected JButton jButtonCerrarImportacionTipoSeguro;
	//protected JFileChooser jFileChooserImportacionTipoSeguro;
	//protected File fileImportacionTipoSeguro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSeguro;
	protected JButton jButtonDuplicarToolBarTipoSeguro;
	protected JButton jButtonNuevoRelacionesToolBarTipoSeguro;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoSeguro;
	protected JButton jButtonCopiarToolBarTipoSeguro;
	protected JButton jButtonVerFormToolBarTipoSeguro;
	public JButton jButtonGuardarCambiosTablaToolBarTipoSeguro;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSeguro;
	protected JButton jButtonCerrarToolBarTipoSeguro;
	
	protected JButton jButtonRecargarInformacionToolBarTipoSeguro;
	protected JButton jButtonProcesarInformacionToolBarTipoSeguro;
	protected JButton jButtonAnterioresToolBarTipoSeguro;
	protected JButton jButtonSiguientesToolBarTipoSeguro;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoSeguro;
	protected JButton jButtonAbrirOrderByToolBarTipoSeguro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSeguro;
	protected JMenuItem jMenuItemDuplicarTipoSeguro;
	protected JMenuItem jMenuItemNuevoRelacionesTipoSeguro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoSeguro;
	protected JMenuItem jMenuItemCopiarTipoSeguro;
	protected JMenuItem jMenuItemVerFormTipoSeguro;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSeguro;
	protected JMenuItem jMenuItemCerrarTipoSeguro;
	protected JMenuItem jMenuItemDetalleCerrarTipoSeguro;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoSeguro;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSeguro;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoSeguro;
	protected JMenuItem jMenuItemProcesarInformacionTipoSeguro;
	protected JMenuItem jMenuItemAnterioresTipoSeguro;
	protected JMenuItem jMenuItemSiguientesTipoSeguro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSeguro;
	protected JMenuItem jMenuItemAbrirOrderByTipoSeguro;
	protected JMenuItem jMenuItemMostrarOcultarTipoSeguro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSeguro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoSeguro;
	protected JCheckBox jCheckBoxSeleccionadosTipoSeguro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoSeguro;
	protected JCheckBox jCheckBoxConGraficoReporteTipoSeguro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoSeguro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoSeguro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSeguro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoSeguro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoSeguro;
	protected JTextField jTextFieldValorCampoGeneralTipoSeguro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoSeguro;
	//public JList<Reporte> jListColumnasSelectReporteTipoSeguro;
	//public JScrollPane jScrollColumnasSelectReporteTipoSeguro;
	
	//public JLabel jLabelRelacionesSelectReporteTipoSeguro;
	//public JList<Reporte> jListRelacionesSelectReporteTipoSeguro;
	//public JScrollPane jScrollRelacionesSelectReporteTipoSeguro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoSeguro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoSeguro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoSeguro;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoSeguro;
	
		
	//public JLabel jLabelArchivoImportacionTipoSeguro;	
	//public JLabel jLabelPathArchivoImportacionTipoSeguro;
	//protected JTextField jTextFieldPathArchivoImportacionTipoSeguro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoSeguro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoSeguro;
	
	//public JLabel jLabelColumnaCategoriaValorTipoSeguro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoSeguro;
	
	//public JLabel jLabelColumnasValoresGraficoTipoSeguro;
	//public JList<Reporte> jListColumnasValoresGraficoTipoSeguro;
	//public JScrollPane jScrollColumnasValoresGraficoTipoSeguro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoSeguro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoSeguro;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoSeguro;
	
	
	
	
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
	public TipoSeguroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSeguroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoSeguro)	{
		this.jButtonRecargarInformacionTipoSeguro = jButtonRecargarInformacionTipoSeguro;
	}
	
	public JButton getjButtonProcesarInformacionTipoSeguro() {
		return this.jButtonProcesarInformacionTipoSeguro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSeguro)	{
		this.jButtonProcesarInformacionTipoSeguro = jButtonProcesarInformacionTipoSeguro;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoSeguro() {
		return this.jButtonRecargarInformacionTipoSeguro;
	}
	
	
	public List<TipoSeguro> gettiposeguros() {
		return this.tiposeguros;
	}

	public void settiposeguros(List<TipoSeguro> tiposeguros) {
		this.tiposeguros = tiposeguros;
	}
	
	public List<TipoSeguro> gettiposegurosAux() {
		return this.tiposegurosAux;
	}

	public void settiposegurosAux(List<TipoSeguro> tiposegurosAux) {
		this.tiposegurosAux = tiposegurosAux;
	}
	
	public List<TipoSeguro> gettiposegurosEliminados() {
		return this.tiposegurosEliminados;
	}

	public void setTipoSegurosEliminados(List<TipoSeguro> tiposegurosEliminados) {
		this.tiposegurosEliminados = tiposegurosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoSeguro() {
		return jComboBoxTiposSeleccionarTipoSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoSeguro(
			JComboBox jComboBoxTiposSeleccionarTipoSeguro) {
		this.jComboBoxTiposSeleccionarTipoSeguro = jComboBoxTiposSeleccionarTipoSeguro;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoSeguro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoSeguro() {
		return jTextFieldValorCampoGeneralTipoSeguro;
	}

	public void setjTextFieldValorCampoGeneralTipoSeguro(
			JTextField jTextFieldValorCampoGeneralTipoSeguro) {
		this.jTextFieldValorCampoGeneralTipoSeguro = jTextFieldValorCampoGeneralTipoSeguro;
	}

	public void setBorderResaltarValorCampoGeneralTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoSeguro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoSeguro() {
		return this.jCheckBoxSeleccionarTodosTipoSeguro;
	}

	public void setjCheckBoxSeleccionarTodosTipoSeguro(
			JCheckBox jCheckBoxSeleccionarTodosTipoSeguro) {
		this.jCheckBoxSeleccionarTodosTipoSeguro = jCheckBoxSeleccionarTodosTipoSeguro;
	}

	public void setBorderResaltarSeleccionarTodosTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoSeguro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoSeguro() {
		return this.jCheckBoxSeleccionadosTipoSeguro;
	}

	public void setjCheckBoxSeleccionadosTipoSeguro(
			JCheckBox jCheckBoxSeleccionadosTipoSeguro) {
		this.jCheckBoxSeleccionadosTipoSeguro = jCheckBoxSeleccionadosTipoSeguro;
	}
	
	public void setBorderResaltarSeleccionadosTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoSeguro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoSeguro() {
		return this.jComboBoxTiposArchivosReportesTipoSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoSeguro(
			JComboBox jComboBoxTiposArchivosReportesTipoSeguro) {
		this.jComboBoxTiposArchivosReportesTipoSeguro = jComboBoxTiposArchivosReportesTipoSeguro;
	}

	public void setBorderResaltarTiposArchivosReportesTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoSeguro() {
		return this.jComboBoxTiposReportesTipoSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoSeguro(
			JComboBox jComboBoxTiposReportesTipoSeguro) {
		this.jComboBoxTiposReportesTipoSeguro = jComboBoxTiposReportesTipoSeguro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoSeguro() {
	//	return jComboBoxTiposReportesDinamicoTipoSeguro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoSeguro(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoSeguro) {
	//	this.jComboBoxTiposReportesDinamicoTipoSeguro = jComboBoxTiposReportesDinamicoTipoSeguro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoSeguro() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoSeguro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoSeguro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSeguro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro = jComboBoxTiposArchivosReportesDinamicoTipoSeguro;
	//}
	
	public void setBorderResaltarTiposReportesTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoSeguro() {
		return this.jComboBoxTiposGraficosReportesTipoSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoSeguro(
			JComboBox jComboBoxTiposGraficosReportesTipoSeguro) {
		this.jComboBoxTiposGraficosReportesTipoSeguro = jComboBoxTiposGraficosReportesTipoSeguro;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoSeguro() {
		return this.jComboBoxTiposPaginacionTipoSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoSeguro(
			JComboBox jComboBoxTiposPaginacionTipoSeguro) {
		this.jComboBoxTiposPaginacionTipoSeguro = jComboBoxTiposPaginacionTipoSeguro;
	}
	
	public void setBorderResaltarTiposPaginacionTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoSeguro() {
		return this.jComboBoxTiposRelacionesTipoSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSeguro() {
		return this.jComboBoxTiposAccionesTipoSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSeguro(
			JComboBox jComboBoxTiposRelacionesTipoSeguro) {
		this.jComboBoxTiposRelacionesTipoSeguro = jComboBoxTiposRelacionesTipoSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSeguro(
			JComboBox jComboBoxTiposAccionesTipoSeguro) {
		this.jComboBoxTiposAccionesTipoSeguro = jComboBoxTiposAccionesTipoSeguro;
	}
	
	public void setBorderResaltarTiposRelacionesTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoSeguro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoSeguro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoSeguro() {
	//	return jCheckBoxConGraficoDinamicoTipoSeguro;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoSeguro(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoSeguro) {
	//	this.jCheckBoxConGraficoDinamicoTipoSeguro = jCheckBoxConGraficoDinamicoTipoSeguro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoSeguro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoSeguro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoSeguro .setBorder(borderResaltar);		
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
		this.tiposeguroSessionBean=new TipoSeguroSessionBean();
		
		this.tiposeguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposeguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposeguroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoSeguroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoSeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSeguroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSeguroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Seguro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoSeguroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoSeguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoSeguro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"nuevo","nuevo","Nuevo"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"duplicar","duplicar","Duplicar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"copiar","copiar","Copiar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"ver_form","ver_form","Ver"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"recargar","recargar","Recargar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoSeguro,this.jTtoolBarTipoSeguro,
							"cerrar","cerrar","Salir"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoSeguro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoSeguro;
			
				this.jButtonProcesarInformacionToolBarTipoSeguro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoSeguro;
				
		//protected JButton jButtonModificarToolBarTipoSeguro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoSeguro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoSeguro=new JMenuMe("General");
		this.jmenuArchivoTipoSeguro=new JMenuMe("Archivo");
		this.jmenuAccionesTipoSeguro=new JMenuMe("Acciones");
		this.jmenuDatosTipoSeguro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSeguro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSeguro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSeguro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoSeguro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoSeguro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoSeguro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoSeguro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoSeguro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoSeguro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoSeguro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSeguro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSeguro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoSeguro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoSeguro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoSeguro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoSeguro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoSeguro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoSeguro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoSeguro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoSeguro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoSeguro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSeguro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSeguro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSeguro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoSeguro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoSeguro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoSeguro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoSeguro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoSeguro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoSeguro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoSeguro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoSeguro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoSeguro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoSeguro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoSeguro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoSeguro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoSeguro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoSeguro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoSeguro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSeguro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoSeguro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoSeguro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoSeguro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSeguro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoSeguro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoSeguro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoSeguro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoSeguro.add(this.jMenuItemCerrarTipoSeguro);
			
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemNuevoTipoSeguro);
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemNuevoGuardarCambiosTipoSeguro);
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemNuevoRelacionesTipoSeguro);
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemGuardarCambiosTablaTipoSeguro);		
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemDuplicarTipoSeguro);		
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemCopiarTipoSeguro);		
			this.jmenuAccionesTipoSeguro.add(this.jMenuItemVerFormTipoSeguro);		
			
			this.jmenuDatosTipoSeguro.add(this.jMenuItemRecargarInformacionTipoSeguro);				
			this.jmenuDatosTipoSeguro.add(this.jMenuItemAnterioresTipoSeguro);				
			this.jmenuDatosTipoSeguro.add(this.jMenuItemSiguientesTipoSeguro);				
			this.jmenuDatosTipoSeguro.add(this.jMenuItemAbrirOrderByTipoSeguro);				
			this.jmenuDatosTipoSeguro.add(this.jMenuItemMostrarOcultarTipoSeguro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoSeguro.add(this.jMenuItemGuardarCambiosTipoSeguro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoSeguro.add(this.jmenuArchivoTipoSeguro);		
			this.jmenuBarTipoSeguro.add(this.jmenuAccionesTipoSeguro);		
			this.jmenuBarTipoSeguro.add(this.jmenuDatosTipoSeguro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoSeguro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoSeguro() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoSeguro=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoSeguro.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSeguro.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSeguro.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoSeguro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoSeguro,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoSeguro = new TipoSeguroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Seguro DATOS");
			this.jInternalFrameDetalleFormTipoSeguro = new TipoSeguroDetalleFormJInternalFrame(jDesktopPane,this.tiposeguroSessionBean.getConGuardarRelaciones(),this.tiposeguroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoSeguro = null;//new TipoSeguroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSeguro= new GridBagLayout();
		
		
		this.jTableDatosTipoSeguro = new JTableMe();      
		
		String sToolTipTipoSeguro="";
		sToolTipTipoSeguro=TipoSeguroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSeguro+="(Nomina.TipoSeguro)";
		}
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSeguro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoSeguro.setToolTipText(sToolTipTipoSeguro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoSeguro);
		this.jTableDatosTipoSeguro.setAutoCreateRowSorter(true);
		this.jTableDatosTipoSeguro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoSeguro.setRowSelectionAllowed(true);
		this.jTableDatosTipoSeguro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoSeguro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoSeguro = new JButtonMe();
		this.jButtonDuplicarTipoSeguro = new JButtonMe();
		this.jButtonCopiarTipoSeguro = new JButtonMe();
		this.jButtonVerFormTipoSeguro = new JButtonMe();
		this.jButtonNuevoRelacionesTipoSeguro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoSeguro = new JButtonMe();
		this.jButtonCerrarTipoSeguro = new JButtonMe();
		
		this.jScrollPanelDatosTipoSeguro = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoSeguro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Seguro";
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Seguros" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSeguro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSeguro.setToolTipText("Acciones");
        this.jPanelAccionesTipoSeguro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoSeguro=new ReporteDinamicoJInternalFrame(TipoSeguroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoSeguro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoSeguro=new ImportacionJInternalFrame(TipoSeguroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoSeguro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoSeguro = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoSeguro.setText("Orden");
		this.jButtonAbrirOrderByTipoSeguro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSeguro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSeguro,false,this);
			
			//this.cargarOrderByTipoSeguro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSeguro,true,this);
			
			//this.cargarOrderByTipoSeguro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoSeguro.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSeguro.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSeguro.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoSeguro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSeguro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSeguro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoSeguro.setText("Nuevo");
		this.jButtonDuplicarTipoSeguro.setText("Duplicar");
		this.jButtonCopiarTipoSeguro.setText("Copiar");
		this.jButtonVerFormTipoSeguro.setText("Ver");
		this.jButtonNuevoRelacionesTipoSeguro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoSeguro.setText("Guardar");
		this.jButtonCerrarTipoSeguro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSeguro,"nuevo_button","Nuevo",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoSeguro,"duplicar_button","Duplicar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoSeguro,"copiar_button","Copiar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoSeguro,"ver_form","Ver",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoSeguro,"nuevorelaciones_button","Nuevo Rel",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSeguro,"guardarcambiostabla_button","Guardar",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSeguro,"cerrar_button","Salir",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoSeguro.setToolTipText("Nuevo"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoSeguro.setToolTipText("Duplicar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoSeguro.setToolTipText("Copiar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoSeguro.setToolTipText("Ver"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoSeguro.setToolTipText("Nuevo Rel"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoSeguro.setToolTipText("Guardar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSeguro.setToolTipText("Salir"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSeguro";
		inputMap = this.jButtonNuevoTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSeguro"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoSeguro";
		inputMap = this.jButtonDuplicarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoSeguro"));
		
		//COPIAR
		sMapKey = "CopiarTipoSeguro";
		inputMap = this.jButtonCopiarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoSeguro"));
		
		//VEr FORM
		sMapKey = "VerFormTipoSeguro";
		inputMap = this.jButtonVerFormTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoSeguro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoSeguro";
		inputMap = this.jButtonNuevoRelacionesTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoSeguro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoSeguro";
		inputMap = this.jButtonModificarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoSeguro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoSeguro";
		inputMap = this.jButtonCerrarTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSeguro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSeguro";
		inputMap = this.jButtonGuardarCambiosTablaTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSeguro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoSeguro.setName("jPanelParametrosReportesTipoSeguro"); 
		
		this.jPanelParametrosReportesAccionesTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoSeguro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoSeguro.setName("jPanelParametrosReportesAccionesTipoSeguro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoSeguro = new JButtonMe();
		this.jButtonRecargarInformacionTipoSeguro.setText("Recargar");
		this.jButtonRecargarInformacionTipoSeguro.setToolTipText("Recargar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoSeguro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoSeguro = new JButtonMe();
		this.jButtonProcesarInformacionTipoSeguro.setText("Procesar");
		this.jButtonProcesarInformacionTipoSeguro.setToolTipText("Procesar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoSeguro.setVisible(false);
			
		this.jButtonProcesarInformacionTipoSeguro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSeguro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSeguro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSeguro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoSeguro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSeguro.setText("TIPO");       
		this.jComboBoxTiposReportesTipoSeguro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSeguro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoSeguro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoSeguro.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoSeguro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoSeguro.setText("Accion");
		this.jComboBoxTiposRelacionesTipoSeguro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSeguro.setText("Accion");
		this.jComboBoxTiposAccionesTipoSeguro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoSeguro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoSeguro.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoSeguro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoSeguro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoSeguro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSeguro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSeguro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoSeguro = new JLabelMe();
		
		this.jLabelAccionesTipoSeguro.setText("Acciones");		
		this.jLabelAccionesTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoSeguro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoSeguro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoSeguro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoSeguro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoSeguro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoSeguro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoSeguro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoSeguro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoSeguro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoSeguro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoSeguro.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoSeguro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoSeguro = new JButtonMe();
		//this.jButtonAnterioresTipoSeguro.setText("<<");
        this.jButtonAnterioresTipoSeguro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoSeguro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoSeguro = new JButtonMe();
		//this.jButtonSiguientesTipoSeguro.setText(">>");
        this.jButtonSiguientesTipoSeguro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoSeguro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoSeguro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoSeguro.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoSeguro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoSeguro,"nuevoguardarcambios_button","Nue",this.tiposeguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoSeguro";
		inputMap = this.jButtonNuevoGuardarCambiosTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoSeguro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoSeguro";
		inputMap = this.jButtonRecargarInformacionTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoSeguro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoSeguro";
		inputMap = this.jButtonSiguientesTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoSeguro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoSeguro";
		inputMap = this.jButtonAnterioresTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoSeguro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoSeguro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoSeguro.setMinimumSize(new Dimension(this.getWidth(),TipoSeguroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSeguroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSeguro.setMaximumSize(new Dimension(this.getWidth(),TipoSeguroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSeguroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSeguro.setPreferredSize(new Dimension(this.getWidth(),TipoSeguroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSeguroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoSeguro = new GridBagLayout();

			this.jPanelPaginacionTipoSeguro.setLayout(gridaBagLayoutPaginacionTipoSeguro);						
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 0;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoSeguro.add(this.jButtonAnterioresTipoSeguro, this.gridBagConstraintsTipoSeguro);
					
						
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSeguro.gridy = 0;
			
			this.jPanelPaginacionTipoSeguro.add(this.jButtonNuevoGuardarCambiosTipoSeguro, this.gridBagConstraintsTipoSeguro);
						
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSeguro.gridy = 0;
			this.jPanelPaginacionTipoSeguro.add(this.jButtonSiguientesTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 1;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSeguro.add(this.jButtonNuevoTipoSeguro, this.gridBagConstraintsTipoSeguro);
						
			
			
			if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
				this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSeguro.gridy = 1;
				this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoSeguro.add(this.jButtonGuardarCambiosTablaTipoSeguro, this.gridBagConstraintsTipoSeguro);
			}
			
			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 1;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSeguro.add(this.jButtonDuplicarTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 1;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSeguro.add(this.jButtonCopiarTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 1;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSeguro.add(this.jButtonVerFormTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 1;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoSeguro.add(this.jButtonCerrarTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
		
		
		this.jButtonRecargarInformacionTipoSeguro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSeguro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSeguro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoSeguro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSeguro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSeguro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoSeguro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSeguro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSeguro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoSeguro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSeguro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSeguro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoSeguro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSeguro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSeguro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoSeguro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSeguro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSeguro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoSeguro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSeguro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSeguro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoSeguro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSeguro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSeguro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoSeguro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSeguro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSeguro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoSeguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoSeguro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoSeguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoSeguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoSeguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoSeguro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoSeguro.setLayout(gridaBagParametrosReportesTipoSeguro);
			this.jPanelParametrosReportesAccionesTipoSeguro.setLayout(gridaBagParametrosReportesAccionesTipoSeguro);
			
			
			this.jPanelParametrosAuxiliar1TipoSeguro.setLayout(gridaBagParametrosAuxiliar1TipoSeguro);
			this.jPanelParametrosAuxiliar2TipoSeguro.setLayout(gridaBagParametrosAuxiliar2TipoSeguro);
			this.jPanelParametrosAuxiliar3TipoSeguro.setLayout(gridaBagParametrosAuxiliar3TipoSeguro);
			this.jPanelParametrosAuxiliar4TipoSeguro.setLayout(gridaBagParametrosAuxiliar4TipoSeguro);
			//this.jPanelParametrosAuxiliar5TipoSeguro.setLayout(gridaBagParametrosAuxiliar2TipoSeguro);			
			
			
			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSeguro.add(this.jButtonRecargarInformacionTipoSeguro, this.gridBagConstraintsTipoSeguro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSeguro.add(this.jComboBoxTiposPaginacionTipoSeguro, this.gridBagConstraintsTipoSeguro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSeguro.add(this.jCheckBoxConAltoMaximoTablaTipoSeguro, this.gridBagConstraintsTipoSeguro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSeguro.add(this.jComboBoxTiposArchivosReportesTipoSeguro, this.gridBagConstraintsTipoSeguro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSeguro.add(this.jPanelParametrosAuxiliar1TipoSeguro, this.gridBagConstraintsTipoSeguro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSeguro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoSeguro.add(this.jComboBoxTiposReportesTipoSeguro, this.gridBagConstraintsTipoSeguro);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSeguro.add(this.jPanelParametrosAuxiliar4TipoSeguro, this.gridBagConstraintsTipoSeguro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSeguro.add(this.jComboBoxTiposReportesTipoSeguro, this.gridBagConstraintsTipoSeguro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSeguro.add(this.jCheckBoxGenerarReporteTipoSeguro, this.gridBagConstraintsTipoSeguro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSeguro.add(this.jPanelParametrosAuxiliar2TipoSeguro, this.gridBagConstraintsTipoSeguro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSeguro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSeguro.add(this.jLabelAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
				this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoSeguro.add(this.jButtonAbrirOrderByTipoSeguro, this.gridBagConstraintsTipoSeguro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSeguro.add(this.jComboBoxTiposSeleccionarTipoSeguro, this.gridBagConstraintsTipoSeguro);			
			
			
			/*
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSeguro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSeguro.add(this.jCheckBoxSeleccionarTodosTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSeguro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSeguro.add(this.jCheckBoxSeleccionarTodosTipoSeguro, this.gridBagConstraintsTipoSeguro);															
				
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSeguro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSeguro.add(this.jCheckBoxSeleccionadosTipoSeguro, this.gridBagConstraintsTipoSeguro);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSeguro.add(this.jPanelParametrosAuxiliar3TipoSeguro, this.gridBagConstraintsTipoSeguro);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSeguro.add(this.jComboBoxTiposAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);
	
				
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSeguro.add(this.jTextFieldValorCampoGeneralTipoSeguro, this.gridBagConstraintsTipoSeguro);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoSeguro = new GridBagLayout();

			this.jScrollPanelDatosTipoSeguro.setLayout(gridaBagLayoutDatosTipoSeguro);
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = 0;
			this.gridBagConstraintsTipoSeguro.gridx = 0;
			
			this.jScrollPanelDatosTipoSeguro.add(this.jTableDatosTipoSeguro, this.gridBagConstraintsTipoSeguro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoSeguro.setViewportView(this.jTableDatosTipoSeguro);
		this.jTableDatosTipoSeguro.setFillsViewportHeight(true);
		this.jTableDatosTipoSeguro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoSeguro= new GridBagLayout();
		this.jPanelAccionesTipoSeguro.setLayout(gridaBagLayoutAccionesTipoSeguro);
		
		
		/*	
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = 0;
		this.gridBagConstraintsTipoSeguro.gridx = 0;
			
		this.jPanelAccionesTipoSeguro.add(this.jButtonNuevoTipoSeguro, this.gridBagConstraintsTipoSeguro);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSeguro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSeguro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();						
			this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSeguro.gridx = 0;		
			//this.gridBagConstraintsTipoSeguro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSeguro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoSeguro, this.gridBagConstraintsTipoSeguro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoSeguro.gridx = 0;		
		//this.gridBagConstraintsTipoSeguro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoSeguro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoSeguro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoSeguro, this.gridBagConstraintsTipoSeguro);								
		
		
		/*
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);
		*/		
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSeguro.gridx =0;
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSeguro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSeguro, this.gridBagConstraintsTipoSeguro);
				
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoSeguro, this.gridBagConstraintsTipoSeguro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSeguro = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoSeguro.setLayout(gridaBagLayoutBusquedasParametrosTipoSeguro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoSeguro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSeguro, this.gridBagConstraintsTipoSeguro);
			
			
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
			
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSeguro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSeguro, this.gridBagConstraintsTipoSeguro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoSeguro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoSeguro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoSeguro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoSeguro.setName("jPanelReporteDinamicoTipoSeguro"); 
		
		this.jPanelReporteDinamicoTipoSeguro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSeguro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSeguro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoSeguro.setLayout(gridaBagLayoutReporteDinamicoTipoSeguro);
		
		
		this.jInternalFrameReporteDinamicoTipoSeguro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoSeguro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSeguro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoSeguro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoSeguro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoSeguro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoSeguro.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoSeguro.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoSeguro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoSeguro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSeguro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSeguro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Seguros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoSeguro = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoSeguro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSeguro.add(this.jLabelColumnasSelectReporteTipoSeguro, this.gridBagConstraintsTipoSeguro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoSeguro = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoSeguro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoSeguro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoSeguro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSeguro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSeguro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoSeguro=new JScrollPane(this.jListColumnasSelectReporteTipoSeguro);
			
			this.jScrollColumnasSelectReporteTipoSeguro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSeguro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSeguro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSeguro.add(this.jListColumnasSelectReporteTipoSeguro, this.gridBagConstraintsTipoSeguro);
		this.jPanelReporteDinamicoTipoSeguro.add(this.jScrollColumnasSelectReporteTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoSeguro = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoSeguro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoSeguro = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoSeguro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoSeguro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoSeguro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSeguro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSeguro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoSeguro=new JScrollPane(this.jListRelacionesSelectReporteTipoSeguro);
			
			this.jScrollRelacionesSelectReporteTipoSeguro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSeguro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSeguro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoSeguro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoSeguro = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoSeguro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoSeguro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoSeguro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoSeguro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSeguro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSeguro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoSeguro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoSeguro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSeguro.add(this.jLabelGenerarExcelReporteDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoSeguro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoSeguro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoSeguro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoSeguro.setToolTipText("Generar EXCEL"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		//this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoSeguro.add(this.jButtonGenerarExcelReporteDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSeguro.add(this.jComboBoxTiposReportesDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoSeguro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoSeguro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSeguro.add(this.jLabelTiposArchivoReporteDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSeguro.add(this.jComboBoxTiposArchivosReportesDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoSeguro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoSeguro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoSeguro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoSeguro.setToolTipText("Generar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSeguro.add(this.jButtonGenerarReporteDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoSeguro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoSeguro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoSeguro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoSeguro.setToolTipText("Cancelar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSeguro.add(this.jButtonCerrarReporteDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoSeguro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoSeguro= new JScrollPane(jPanelReporteDinamicoTipoSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoSeguro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSeguro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSeguro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Seguros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoSeguro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoSeguro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoSeguro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoSeguro);
		this.jInternalFrameReporteDinamicoTipoSeguro.getContentPane().add(this.jScrollPanelReporteDinamicoTipoSeguro, this.gridBagConstraintsTipoSeguro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoSeguro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoSeguro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoSeguro.setName("jPanelImportacionTipoSeguro"); 
		
		this.jPanelImportacionTipoSeguro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSeguro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSeguro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoSeguro.setLayout(gridaBagLayoutImportacionTipoSeguro);
		
		
		this.jInternalFrameImportacionTipoSeguro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoSeguro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoSeguro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSeguro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSeguro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSeguro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoSeguro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSeguro.setResizable(true);
	    this.jInternalFrameImportacionTipoSeguro.setClosable(true);
	    this.jInternalFrameImportacionTipoSeguro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSeguro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSeguro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoSeguro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSeguro.setResizable(true);
	    this.jInternalFrameImportacionTipoSeguro.setClosable(true);
	    this.jInternalFrameImportacionTipoSeguro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoSeguro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSeguro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSeguro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Seguros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoSeguro = new JLabelMe();

		this.jLabelArchivoImportacionTipoSeguro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSeguro.add(this.jLabelArchivoImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoSeguro = new JFileChooser();		
		this.jFileChooserImportacionTipoSeguro.setToolTipText("ESCOGER ARCHIVO"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoSeguro = new JButtonMe();
		this.jButtonAbrirImportacionTipoSeguro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoSeguro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoSeguro.setToolTipText("Generar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSeguro.add(this.jButtonAbrirImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoSeguro = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoSeguro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSeguro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSeguro.add(this.jLabelPathArchivoImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoSeguro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoSeguro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSeguro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSeguro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSeguro.add(this.jTextFieldPathArchivoImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoSeguro = new JButtonMe();
		this.jButtonGenerarImportacionTipoSeguro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoSeguro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoSeguro.setToolTipText("Generar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSeguro.add(this.jButtonGenerarImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoSeguro = new JButtonMe();
		this.jButtonCerrarImportacionTipoSeguro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoSeguro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoSeguro.setToolTipText("Cancelar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSeguro.add(this.jButtonCerrarImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoSeguro = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoSeguro= new JScrollPane(jPanelImportacionTipoSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
		this.gridBagConstraintsTipoSeguro.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoSeguro.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoSeguro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoSeguro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoSeguro);
		this.jInternalFrameImportacionTipoSeguro.getContentPane().add(this.jScrollPanelImportacionTipoSeguro, this.gridBagConstraintsTipoSeguro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoSeguro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoSeguro = new JButtonMe();
			this.jButtonAbrirOrderByTipoSeguro.setText("Orden");
			this.jButtonAbrirOrderByTipoSeguro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSeguro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoSeguro";
			inputMap = this.jButtonAbrirOrderByTipoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoSeguro"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoSeguro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoSeguro.setName("jPanelOrderByTipoSeguro"); 
			
			this.jPanelOrderByTipoSeguro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSeguro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSeguro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoSeguro.setLayout(gridaBagLayoutOrderByTipoSeguro);
			
			
			this.jTableDatosTipoSeguroOrderBy = new JTableMe();        
			this.jTableDatosTipoSeguroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoSeguroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoSeguroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoSeguroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoSeguroOrderBy.setViewportView(this.jTableDatosTipoSeguroOrderBy);
			this.jTableDatosTipoSeguroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoSeguroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoSeguro= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoSeguro= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoSeguro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoSeguro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoSeguro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoSeguro.setTitle("Orden");
			this.jInternalFrameOrderByTipoSeguro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoSeguro.setResizable(true);
			this.jInternalFrameOrderByTipoSeguro.setClosable(true);
			this.jInternalFrameOrderByTipoSeguro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoSeguro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSeguro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSeguro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Seguros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoSeguro.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoSeguro.ipady =150;
				
			this.jPanelOrderByTipoSeguro.add(jScrollPanelDatosTipoSeguroOrderBy, this.gridBagConstraintsTipoSeguro);//this.jTableDatosTipoSeguroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoSeguro = new JButtonMe();
			this.jButtonCerrarOrderByTipoSeguro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoSeguro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoSeguro.setToolTipText("Cancelar"+" "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSeguro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoSeguro.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoSeguro.add(this.jButtonCerrarOrderByTipoSeguro, this.gridBagConstraintsTipoSeguro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoSeguro = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoSeguro= new JScrollPane(jPanelOrderByTipoSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoSeguro = new GridBagConstraints();
			this.gridBagConstraintsTipoSeguro.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoSeguro.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSeguro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoSeguro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoSeguro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoSeguro);
			
			this.jInternalFrameOrderByTipoSeguro.getContentPane().add(this.jScrollPanelOrderByTipoSeguro, this.gridBagConstraintsTipoSeguro);			
		
		} else {
			this.jButtonAbrirOrderByTipoSeguro = new JButtonMe();
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
			&& this.tiposeguroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoSeguro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoSeguro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoSeguro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoSeguro.getRowHeight();//TipoSeguroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoSeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSeguro.isSelected()) {
					iHeightTable=TipoSeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoSeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSeguro.isSelected()) {
					iHeightTable=TipoSeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoSeguro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSeguro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSeguro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoSeguro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSeguro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSeguro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoSeguro!=null && this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy()!=null) {
			//if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoSeguro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoSeguro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoSeguro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoSeguro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSeguro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSeguro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiposeguroLogic.getTipoSeguros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposeguros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoSeguro> TraerTipoSeguroBeans(List<TipoSeguro> tiposeguros,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoSeguro tiposeguro:tiposeguros) {
					
				if(!(TipoSeguroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoSeguroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiposeguro.setsDetalleGeneralEntityReporte(TipoSeguroConstantesFunciones.getTipoSeguroDescripcion(tiposeguro));
										
						
					
						
					
				} else  {
							
					//tiposeguro.setsDetalleGeneralEntityReporte(tiposeguro.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiposegurobeans.add(tiposegurobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiposeguros;
    }
	//PARA REPORTES FIN
}
