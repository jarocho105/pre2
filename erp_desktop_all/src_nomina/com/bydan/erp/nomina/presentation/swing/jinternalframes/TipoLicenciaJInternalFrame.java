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
import com.bydan.erp.nomina.util.TipoLicenciaConstantesFunciones;

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
public class TipoLicenciaJInternalFrame extends TipoLicenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoLicencia;
	
	protected JMenuBar jmenuBarTipoLicencia;
	
	protected JMenu jmenuTipoLicencia;
	protected JMenu jmenuDatosTipoLicencia;
	protected JMenu jmenuArchivoTipoLicencia;
	protected JMenu jmenuAccionesTipoLicencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLicencia;	
	protected GridBagConstraints gridBagConstraintsTipoLicencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoLicenciaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoLicencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoLicencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoLicencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoLicenciaSessionBean tipolicenciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoLicencia> tipolicencias;		
	public List<TipoLicencia> tipolicenciasEliminados;	
	public List<TipoLicencia> tipolicenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoLicencia;		
	protected JButton jButtonAbrirOrderByTipoLicencia;
	
	
	//protected JPanel jPanelOrderByTipoLicencia;
	//public JScrollPane jScrollPanelOrderByTipoLicencia;	
	//protected JButton jButtonCerrarOrderByTipoLicencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoLicenciaLogic tipolicenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoLicencia;
	public JScrollPane jScrollPanelDatosEdicionTipoLicencia;
	public JScrollPane jScrollPanelDatosGeneralTipoLicencia;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoLicenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoLicencia;
	//public JScrollPane jScrollPanelImportacionTipoLicencia;
	
	
	
	protected JPanel jPanelAccionesTipoLicencia;
	
    protected JPanel jPanelPaginacionTipoLicencia;
    protected JPanel jPanelParametrosReportesTipoLicencia;
	protected JPanel jPanelParametrosReportesAccionesTipoLicencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoLicencia;
	protected JPanel jPanelParametrosAuxiliar2TipoLicencia;
	protected JPanel jPanelParametrosAuxiliar3TipoLicencia;
	protected JPanel jPanelParametrosAuxiliar4TipoLicencia;
	//protected JPanel jPanelParametrosAuxiliar5TipoLicencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoLicencia;
	//protected JPanel jPanelImportacionTipoLicencia;
	
	
	public JTable jTableDatosTipoLicencia;
	
	
	
	//public JTable jTableDatosTipoLicenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoLicencia;
	protected JButton jButtonDuplicarTipoLicencia;
	protected JButton jButtonCopiarTipoLicencia;
	protected JButton jButtonVerFormTipoLicencia;
	protected JButton jButtonNuevoRelacionesTipoLicencia;
	protected JButton jButtonModificarTipoLicencia;
	
    protected JButton jButtonGuardarCambiosTablaTipoLicencia;
	protected JButton jButtonCerrarTipoLicencia;
	
	
	protected JButton jButtonRecargarInformacionTipoLicencia;
	protected JButton jButtonProcesarInformacionTipoLicencia;
	
	
	protected JButton jButtonAnterioresTipoLicencia;
	protected JButton jButtonSiguientesTipoLicencia;
	protected JButton jButtonNuevoGuardarCambiosTipoLicencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoLicencia;
	//protected JButton jButtonCerrarReporteDinamicoTipoLicencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoLicencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoLicencia;
	//protected JButton jButtonGenerarImportacionTipoLicencia;
	//protected JButton jButtonCerrarImportacionTipoLicencia;
	//protected JFileChooser jFileChooserImportacionTipoLicencia;
	//protected File fileImportacionTipoLicencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLicencia;
	protected JButton jButtonDuplicarToolBarTipoLicencia;
	protected JButton jButtonNuevoRelacionesToolBarTipoLicencia;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoLicencia;
	protected JButton jButtonCopiarToolBarTipoLicencia;
	protected JButton jButtonVerFormToolBarTipoLicencia;
	public JButton jButtonGuardarCambiosTablaToolBarTipoLicencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLicencia;
	protected JButton jButtonCerrarToolBarTipoLicencia;
	
	protected JButton jButtonRecargarInformacionToolBarTipoLicencia;
	protected JButton jButtonProcesarInformacionToolBarTipoLicencia;
	protected JButton jButtonAnterioresToolBarTipoLicencia;
	protected JButton jButtonSiguientesToolBarTipoLicencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoLicencia;
	protected JButton jButtonAbrirOrderByToolBarTipoLicencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLicencia;
	protected JMenuItem jMenuItemDuplicarTipoLicencia;
	protected JMenuItem jMenuItemNuevoRelacionesTipoLicencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoLicencia;
	protected JMenuItem jMenuItemCopiarTipoLicencia;
	protected JMenuItem jMenuItemVerFormTipoLicencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLicencia;
	protected JMenuItem jMenuItemCerrarTipoLicencia;
	protected JMenuItem jMenuItemDetalleCerrarTipoLicencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoLicencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLicencia;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoLicencia;
	protected JMenuItem jMenuItemProcesarInformacionTipoLicencia;
	protected JMenuItem jMenuItemAnterioresTipoLicencia;
	protected JMenuItem jMenuItemSiguientesTipoLicencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLicencia;
	protected JMenuItem jMenuItemAbrirOrderByTipoLicencia;
	protected JMenuItem jMenuItemMostrarOcultarTipoLicencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLicencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoLicencia;
	protected JCheckBox jCheckBoxSeleccionadosTipoLicencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoLicencia;
	protected JCheckBox jCheckBoxConGraficoReporteTipoLicencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoLicencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoLicencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLicencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoLicencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoLicencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoLicencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLicencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLicencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoLicencia;
	protected JTextField jTextFieldValorCampoGeneralTipoLicencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoLicencia;
	//public JList<Reporte> jListColumnasSelectReporteTipoLicencia;
	//public JScrollPane jScrollColumnasSelectReporteTipoLicencia;
	
	//public JLabel jLabelRelacionesSelectReporteTipoLicencia;
	//public JList<Reporte> jListRelacionesSelectReporteTipoLicencia;
	//public JScrollPane jScrollRelacionesSelectReporteTipoLicencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoLicencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoLicencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoLicencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoLicencia;
	
		
	//public JLabel jLabelArchivoImportacionTipoLicencia;	
	//public JLabel jLabelPathArchivoImportacionTipoLicencia;
	//protected JTextField jTextFieldPathArchivoImportacionTipoLicencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoLicencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoLicencia;
	
	//public JLabel jLabelColumnaCategoriaValorTipoLicencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoLicencia;
	
	//public JLabel jLabelColumnasValoresGraficoTipoLicencia;
	//public JList<Reporte> jListColumnasValoresGraficoTipoLicencia;
	//public JScrollPane jScrollColumnasValoresGraficoTipoLicencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoLicencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoLicencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoLicencia;
	
	
	
	
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
	public TipoLicenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoLicencia)	{
		this.jButtonRecargarInformacionTipoLicencia = jButtonRecargarInformacionTipoLicencia;
	}
	
	public JButton getjButtonProcesarInformacionTipoLicencia() {
		return this.jButtonProcesarInformacionTipoLicencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLicencia)	{
		this.jButtonProcesarInformacionTipoLicencia = jButtonProcesarInformacionTipoLicencia;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoLicencia() {
		return this.jButtonRecargarInformacionTipoLicencia;
	}
	
	
	public List<TipoLicencia> gettipolicencias() {
		return this.tipolicencias;
	}

	public void settipolicencias(List<TipoLicencia> tipolicencias) {
		this.tipolicencias = tipolicencias;
	}
	
	public List<TipoLicencia> gettipolicenciasAux() {
		return this.tipolicenciasAux;
	}

	public void settipolicenciasAux(List<TipoLicencia> tipolicenciasAux) {
		this.tipolicenciasAux = tipolicenciasAux;
	}
	
	public List<TipoLicencia> gettipolicenciasEliminados() {
		return this.tipolicenciasEliminados;
	}

	public void setTipoLicenciasEliminados(List<TipoLicencia> tipolicenciasEliminados) {
		this.tipolicenciasEliminados = tipolicenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoLicencia() {
		return jComboBoxTiposSeleccionarTipoLicencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoLicencia(
			JComboBox jComboBoxTiposSeleccionarTipoLicencia) {
		this.jComboBoxTiposSeleccionarTipoLicencia = jComboBoxTiposSeleccionarTipoLicencia;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoLicencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoLicencia() {
		return jTextFieldValorCampoGeneralTipoLicencia;
	}

	public void setjTextFieldValorCampoGeneralTipoLicencia(
			JTextField jTextFieldValorCampoGeneralTipoLicencia) {
		this.jTextFieldValorCampoGeneralTipoLicencia = jTextFieldValorCampoGeneralTipoLicencia;
	}

	public void setBorderResaltarValorCampoGeneralTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoLicencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoLicencia() {
		return this.jCheckBoxSeleccionarTodosTipoLicencia;
	}

	public void setjCheckBoxSeleccionarTodosTipoLicencia(
			JCheckBox jCheckBoxSeleccionarTodosTipoLicencia) {
		this.jCheckBoxSeleccionarTodosTipoLicencia = jCheckBoxSeleccionarTodosTipoLicencia;
	}

	public void setBorderResaltarSeleccionarTodosTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoLicencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoLicencia() {
		return this.jCheckBoxSeleccionadosTipoLicencia;
	}

	public void setjCheckBoxSeleccionadosTipoLicencia(
			JCheckBox jCheckBoxSeleccionadosTipoLicencia) {
		this.jCheckBoxSeleccionadosTipoLicencia = jCheckBoxSeleccionadosTipoLicencia;
	}
	
	public void setBorderResaltarSeleccionadosTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoLicencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoLicencia() {
		return this.jComboBoxTiposArchivosReportesTipoLicencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoLicencia(
			JComboBox jComboBoxTiposArchivosReportesTipoLicencia) {
		this.jComboBoxTiposArchivosReportesTipoLicencia = jComboBoxTiposArchivosReportesTipoLicencia;
	}

	public void setBorderResaltarTiposArchivosReportesTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoLicencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoLicencia() {
		return this.jComboBoxTiposReportesTipoLicencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoLicencia(
			JComboBox jComboBoxTiposReportesTipoLicencia) {
		this.jComboBoxTiposReportesTipoLicencia = jComboBoxTiposReportesTipoLicencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoLicencia() {
	//	return jComboBoxTiposReportesDinamicoTipoLicencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoLicencia(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoLicencia) {
	//	this.jComboBoxTiposReportesDinamicoTipoLicencia = jComboBoxTiposReportesDinamicoTipoLicencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoLicencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoLicencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoLicencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLicencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia = jComboBoxTiposArchivosReportesDinamicoTipoLicencia;
	//}
	
	public void setBorderResaltarTiposReportesTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoLicencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoLicencia() {
		return this.jComboBoxTiposGraficosReportesTipoLicencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoLicencia(
			JComboBox jComboBoxTiposGraficosReportesTipoLicencia) {
		this.jComboBoxTiposGraficosReportesTipoLicencia = jComboBoxTiposGraficosReportesTipoLicencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoLicencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoLicencia() {
		return this.jComboBoxTiposPaginacionTipoLicencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoLicencia(
			JComboBox jComboBoxTiposPaginacionTipoLicencia) {
		this.jComboBoxTiposPaginacionTipoLicencia = jComboBoxTiposPaginacionTipoLicencia;
	}
	
	public void setBorderResaltarTiposPaginacionTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoLicencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoLicencia() {
		return this.jComboBoxTiposRelacionesTipoLicencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLicencia() {
		return this.jComboBoxTiposAccionesTipoLicencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLicencia(
			JComboBox jComboBoxTiposRelacionesTipoLicencia) {
		this.jComboBoxTiposRelacionesTipoLicencia = jComboBoxTiposRelacionesTipoLicencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLicencia(
			JComboBox jComboBoxTiposAccionesTipoLicencia) {
		this.jComboBoxTiposAccionesTipoLicencia = jComboBoxTiposAccionesTipoLicencia;
	}
	
	public void setBorderResaltarTiposRelacionesTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoLicencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoLicencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoLicencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoLicencia() {
	//	return jCheckBoxConGraficoDinamicoTipoLicencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoLicencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoLicencia) {
	//	this.jCheckBoxConGraficoDinamicoTipoLicencia = jCheckBoxConGraficoDinamicoTipoLicencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoLicencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoLicencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoLicencia .setBorder(borderResaltar);		
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
		this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
		
		this.tipolicenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolicenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolicenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoLicenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoLicenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLicenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLicenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLicenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Licencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoLicenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoLicencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"nuevo","nuevo","Nuevo"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"duplicar","duplicar","Duplicar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"copiar","copiar","Copiar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"ver_form","ver_form","Ver"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"recargar","recargar","Recargar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoLicencia,this.jTtoolBarTipoLicencia,
							"cerrar","cerrar","Salir"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoLicencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoLicencia;
			
				this.jButtonProcesarInformacionToolBarTipoLicencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoLicencia;
				
		//protected JButton jButtonModificarToolBarTipoLicencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoLicencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoLicencia=new JMenuMe("General");
		this.jmenuArchivoTipoLicencia=new JMenuMe("Archivo");
		this.jmenuAccionesTipoLicencia=new JMenuMe("Acciones");
		this.jmenuDatosTipoLicencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLicencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLicencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLicencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoLicencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoLicencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoLicencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoLicencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoLicencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoLicencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoLicencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLicencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLicencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoLicencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoLicencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoLicencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoLicencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoLicencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoLicencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoLicencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoLicencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoLicencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLicencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLicencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLicencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoLicencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoLicencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoLicencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoLicencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoLicencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoLicencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoLicencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoLicencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoLicencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoLicencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoLicencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoLicencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoLicencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoLicencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoLicencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLicencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLicencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLicencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoLicencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoLicencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoLicencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLicencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLicencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLicencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoLicencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoLicencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoLicencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoLicencia.add(this.jMenuItemCerrarTipoLicencia);
			
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemNuevoTipoLicencia);
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemNuevoGuardarCambiosTipoLicencia);
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemNuevoRelacionesTipoLicencia);
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemGuardarCambiosTablaTipoLicencia);		
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemDuplicarTipoLicencia);		
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemCopiarTipoLicencia);		
			this.jmenuAccionesTipoLicencia.add(this.jMenuItemVerFormTipoLicencia);		
			
			this.jmenuDatosTipoLicencia.add(this.jMenuItemRecargarInformacionTipoLicencia);				
			this.jmenuDatosTipoLicencia.add(this.jMenuItemAnterioresTipoLicencia);				
			this.jmenuDatosTipoLicencia.add(this.jMenuItemSiguientesTipoLicencia);				
			this.jmenuDatosTipoLicencia.add(this.jMenuItemAbrirOrderByTipoLicencia);				
			this.jmenuDatosTipoLicencia.add(this.jMenuItemMostrarOcultarTipoLicencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoLicencia.add(this.jMenuItemGuardarCambiosTipoLicencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoLicencia.add(this.jmenuArchivoTipoLicencia);		
			this.jmenuBarTipoLicencia.add(this.jmenuAccionesTipoLicencia);		
			this.jmenuBarTipoLicencia.add(this.jmenuDatosTipoLicencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoLicencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoLicencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoLicencia=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoLicencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoLicencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoLicencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoLicencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoLicencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoLicencia = new TipoLicenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Licencia DATOS");
			this.jInternalFrameDetalleFormTipoLicencia = new TipoLicenciaDetalleFormJInternalFrame(jDesktopPane,this.tipolicenciaSessionBean.getConGuardarRelaciones(),this.tipolicenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoLicencia = null;//new TipoLicenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLicencia= new GridBagLayout();
		
		
		this.jTableDatosTipoLicencia = new JTableMe();      
		
		String sToolTipTipoLicencia="";
		sToolTipTipoLicencia=TipoLicenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLicencia+="(Nomina.TipoLicencia)";
		}
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLicencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoLicencia.setToolTipText(sToolTipTipoLicencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoLicencia);
		this.jTableDatosTipoLicencia.setAutoCreateRowSorter(true);
		this.jTableDatosTipoLicencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoLicencia.setRowSelectionAllowed(true);
		this.jTableDatosTipoLicencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoLicencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoLicencia = new JButtonMe();
		this.jButtonDuplicarTipoLicencia = new JButtonMe();
		this.jButtonCopiarTipoLicencia = new JButtonMe();
		this.jButtonVerFormTipoLicencia = new JButtonMe();
		this.jButtonNuevoRelacionesTipoLicencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoLicencia = new JButtonMe();
		this.jButtonCerrarTipoLicencia = new JButtonMe();
		
		this.jScrollPanelDatosTipoLicencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoLicencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Licencia";
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Licencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLicencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLicencia.setToolTipText("Acciones");
        this.jPanelAccionesTipoLicencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoLicencia=new ReporteDinamicoJInternalFrame(TipoLicenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoLicencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoLicencia=new ImportacionJInternalFrame(TipoLicenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoLicencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoLicencia = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoLicencia.setText("Orden");
		this.jButtonAbrirOrderByTipoLicencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLicencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLicencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLicencia,false,this);
			
			//this.cargarOrderByTipoLicencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLicencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLicencia,true,this);
			
			//this.cargarOrderByTipoLicencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoLicencia.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLicencia.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLicencia.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoLicencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLicencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLicencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoLicencia.setText("Nuevo");
		this.jButtonDuplicarTipoLicencia.setText("Duplicar");
		this.jButtonCopiarTipoLicencia.setText("Copiar");
		this.jButtonVerFormTipoLicencia.setText("Ver");
		this.jButtonNuevoRelacionesTipoLicencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoLicencia.setText("Guardar");
		this.jButtonCerrarTipoLicencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLicencia,"nuevo_button","Nuevo",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoLicencia,"duplicar_button","Duplicar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoLicencia,"copiar_button","Copiar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoLicencia,"ver_form","Ver",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoLicencia,"nuevorelaciones_button","Nuevo Rel",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLicencia,"guardarcambiostabla_button","Guardar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLicencia,"cerrar_button","Salir",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoLicencia.setToolTipText("Nuevo"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoLicencia.setToolTipText("Duplicar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoLicencia.setToolTipText("Copiar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoLicencia.setToolTipText("Ver"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoLicencia.setToolTipText("Nuevo Rel"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoLicencia.setToolTipText("Guardar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLicencia.setToolTipText("Salir"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLicencia";
		inputMap = this.jButtonNuevoTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLicencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLicencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoLicencia";
		inputMap = this.jButtonDuplicarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoLicencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoLicencia"));
		
		//COPIAR
		sMapKey = "CopiarTipoLicencia";
		inputMap = this.jButtonCopiarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoLicencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoLicencia"));
		
		//VEr FORM
		sMapKey = "VerFormTipoLicencia";
		inputMap = this.jButtonVerFormTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoLicencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoLicencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoLicencia";
		inputMap = this.jButtonNuevoRelacionesTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoLicencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoLicencia";
		inputMap = this.jButtonModificarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoLicencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoLicencia";
		inputMap = this.jButtonCerrarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLicencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLicencia";
		inputMap = this.jButtonGuardarCambiosTablaTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLicencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoLicencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoLicencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoLicencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoLicencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoLicencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoLicencia.setName("jPanelParametrosReportesTipoLicencia"); 
		
		this.jPanelParametrosReportesAccionesTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoLicencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoLicencia.setName("jPanelParametrosReportesAccionesTipoLicencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoLicencia = new JButtonMe();
		this.jButtonRecargarInformacionTipoLicencia.setText("Recargar");
		this.jButtonRecargarInformacionTipoLicencia.setToolTipText("Recargar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoLicencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoLicencia = new JButtonMe();
		this.jButtonProcesarInformacionTipoLicencia.setText("Procesar");
		this.jButtonProcesarInformacionTipoLicencia.setToolTipText("Procesar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoLicencia.setVisible(false);
			
		this.jButtonProcesarInformacionTipoLicencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLicencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLicencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLicencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoLicencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLicencia.setText("TIPO");       
		this.jComboBoxTiposReportesTipoLicencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLicencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoLicencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoLicencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoLicencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoLicencia.setText("Accion");
		this.jComboBoxTiposRelacionesTipoLicencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLicencia.setText("Accion");
		this.jComboBoxTiposAccionesTipoLicencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoLicencia.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoLicencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoLicencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoLicencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLicencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLicencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoLicencia = new JLabelMe();
		
		this.jLabelAccionesTipoLicencia.setText("Acciones");		
		this.jLabelAccionesTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoLicencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoLicencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoLicencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoLicencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoLicencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoLicencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoLicencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoLicencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoLicencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoLicencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoLicencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoLicencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoLicencia = new JButtonMe();
		//this.jButtonAnterioresTipoLicencia.setText("<<");
        this.jButtonAnterioresTipoLicencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoLicencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoLicencia = new JButtonMe();
		//this.jButtonSiguientesTipoLicencia.setText(">>");
        this.jButtonSiguientesTipoLicencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoLicencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoLicencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoLicencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoLicencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoLicencia,"nuevoguardarcambios_button","Nue",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoLicencia";
		inputMap = this.jButtonNuevoGuardarCambiosTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoLicencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoLicencia";
		inputMap = this.jButtonRecargarInformacionTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoLicencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoLicencia";
		inputMap = this.jButtonSiguientesTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoLicencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoLicencia";
		inputMap = this.jButtonAnterioresTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoLicencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoLicencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoLicencia.setMinimumSize(new Dimension(this.getWidth(),TipoLicenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLicenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLicencia.setMaximumSize(new Dimension(this.getWidth(),TipoLicenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLicenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLicencia.setPreferredSize(new Dimension(this.getWidth(),TipoLicenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLicenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoLicencia = new GridBagLayout();

			this.jPanelPaginacionTipoLicencia.setLayout(gridaBagLayoutPaginacionTipoLicencia);						
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 0;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoLicencia.add(this.jButtonAnterioresTipoLicencia, this.gridBagConstraintsTipoLicencia);
					
						
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLicencia.gridy = 0;
			
			this.jPanelPaginacionTipoLicencia.add(this.jButtonNuevoGuardarCambiosTipoLicencia, this.gridBagConstraintsTipoLicencia);
						
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLicencia.gridy = 0;
			this.jPanelPaginacionTipoLicencia.add(this.jButtonSiguientesTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 1;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLicencia.add(this.jButtonNuevoTipoLicencia, this.gridBagConstraintsTipoLicencia);
						
			
			
			if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
				this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoLicencia.gridy = 1;
				this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoLicencia.add(this.jButtonGuardarCambiosTablaTipoLicencia, this.gridBagConstraintsTipoLicencia);
			}
			
			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 1;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLicencia.add(this.jButtonDuplicarTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 1;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLicencia.add(this.jButtonCopiarTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 1;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLicencia.add(this.jButtonVerFormTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 1;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoLicencia.add(this.jButtonCerrarTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
		
		
		this.jButtonRecargarInformacionTipoLicencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLicencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLicencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoLicencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLicencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLicencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoLicencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLicencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLicencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoLicencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLicencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLicencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoLicencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLicencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLicencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoLicencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLicencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLicencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoLicencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLicencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLicencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoLicencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLicencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLicencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoLicencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLicencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLicencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoLicencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLicencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLicencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoLicencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLicencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLicencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoLicencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLicencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLicencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoLicencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoLicencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoLicencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoLicencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoLicencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoLicencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoLicencia.setLayout(gridaBagParametrosReportesTipoLicencia);
			this.jPanelParametrosReportesAccionesTipoLicencia.setLayout(gridaBagParametrosReportesAccionesTipoLicencia);
			
			
			this.jPanelParametrosAuxiliar1TipoLicencia.setLayout(gridaBagParametrosAuxiliar1TipoLicencia);
			this.jPanelParametrosAuxiliar2TipoLicencia.setLayout(gridaBagParametrosAuxiliar2TipoLicencia);
			this.jPanelParametrosAuxiliar3TipoLicencia.setLayout(gridaBagParametrosAuxiliar3TipoLicencia);
			this.jPanelParametrosAuxiliar4TipoLicencia.setLayout(gridaBagParametrosAuxiliar4TipoLicencia);
			//this.jPanelParametrosAuxiliar5TipoLicencia.setLayout(gridaBagParametrosAuxiliar2TipoLicencia);			
			
			
			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLicencia.add(this.jButtonRecargarInformacionTipoLicencia, this.gridBagConstraintsTipoLicencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLicencia.add(this.jComboBoxTiposPaginacionTipoLicencia, this.gridBagConstraintsTipoLicencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLicencia.add(this.jCheckBoxConAltoMaximoTablaTipoLicencia, this.gridBagConstraintsTipoLicencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLicencia.add(this.jComboBoxTiposArchivosReportesTipoLicencia, this.gridBagConstraintsTipoLicencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLicencia.add(this.jPanelParametrosAuxiliar1TipoLicencia, this.gridBagConstraintsTipoLicencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLicencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoLicencia.add(this.jComboBoxTiposReportesTipoLicencia, this.gridBagConstraintsTipoLicencia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLicencia.add(this.jPanelParametrosAuxiliar4TipoLicencia, this.gridBagConstraintsTipoLicencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLicencia.add(this.jComboBoxTiposReportesTipoLicencia, this.gridBagConstraintsTipoLicencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLicencia.add(this.jCheckBoxGenerarReporteTipoLicencia, this.gridBagConstraintsTipoLicencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLicencia.add(this.jPanelParametrosAuxiliar2TipoLicencia, this.gridBagConstraintsTipoLicencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLicencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLicencia.add(this.jLabelAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
				this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoLicencia.add(this.jButtonAbrirOrderByTipoLicencia, this.gridBagConstraintsTipoLicencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLicencia.add(this.jComboBoxTiposSeleccionarTipoLicencia, this.gridBagConstraintsTipoLicencia);			
			
			
			/*
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLicencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLicencia.add(this.jCheckBoxSeleccionarTodosTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLicencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLicencia.add(this.jCheckBoxSeleccionarTodosTipoLicencia, this.gridBagConstraintsTipoLicencia);															
				
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLicencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLicencia.add(this.jCheckBoxSeleccionadosTipoLicencia, this.gridBagConstraintsTipoLicencia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLicencia.add(this.jPanelParametrosAuxiliar3TipoLicencia, this.gridBagConstraintsTipoLicencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLicencia.add(this.jComboBoxTiposAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);
	
				
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLicencia.add(this.jTextFieldValorCampoGeneralTipoLicencia, this.gridBagConstraintsTipoLicencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoLicencia = new GridBagLayout();

			this.jScrollPanelDatosTipoLicencia.setLayout(gridaBagLayoutDatosTipoLicencia);
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = 0;
			this.gridBagConstraintsTipoLicencia.gridx = 0;
			
			this.jScrollPanelDatosTipoLicencia.add(this.jTableDatosTipoLicencia, this.gridBagConstraintsTipoLicencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoLicencia.setViewportView(this.jTableDatosTipoLicencia);
		this.jTableDatosTipoLicencia.setFillsViewportHeight(true);
		this.jTableDatosTipoLicencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoLicencia= new GridBagLayout();
		this.jPanelAccionesTipoLicencia.setLayout(gridaBagLayoutAccionesTipoLicencia);
		
		
		/*	
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx = 0;
			
		this.jPanelAccionesTipoLicencia.add(this.jButtonNuevoTipoLicencia, this.gridBagConstraintsTipoLicencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLicencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLicencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();						
			this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLicencia.gridx = 0;		
			//this.gridBagConstraintsTipoLicencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLicencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoLicencia, this.gridBagConstraintsTipoLicencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoLicencia.gridx = 0;		
		//this.gridBagConstraintsTipoLicencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoLicencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoLicencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoLicencia, this.gridBagConstraintsTipoLicencia);								
		
		
		/*
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);
		*/		
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLicencia.gridx =0;
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLicencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLicencia, this.gridBagConstraintsTipoLicencia);
				
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoLicencia, this.gridBagConstraintsTipoLicencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoLicencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLicencia = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoLicencia.setLayout(gridaBagLayoutBusquedasParametrosTipoLicencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoLicencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLicencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLicencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLicencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
			
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
			
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoLicencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoLicencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoLicencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoLicencia.setName("jPanelReporteDinamicoTipoLicencia"); 
		
		this.jPanelReporteDinamicoTipoLicencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLicencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLicencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoLicencia.setLayout(gridaBagLayoutReporteDinamicoTipoLicencia);
		
		
		this.jInternalFrameReporteDinamicoTipoLicencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoLicencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLicencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoLicencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoLicencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoLicencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoLicencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoLicencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoLicencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoLicencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoLicencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoLicencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLicencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLicencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Licencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoLicencia = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoLicencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoLicencia.add(this.jLabelColumnasSelectReporteTipoLicencia, this.gridBagConstraintsTipoLicencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoLicencia = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoLicencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoLicencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoLicencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLicencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLicencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoLicencia=new JScrollPane(this.jListColumnasSelectReporteTipoLicencia);
			
			this.jScrollColumnasSelectReporteTipoLicencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLicencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLicencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoLicencia.add(this.jListColumnasSelectReporteTipoLicencia, this.gridBagConstraintsTipoLicencia);
		this.jPanelReporteDinamicoTipoLicencia.add(this.jScrollColumnasSelectReporteTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoLicencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoLicencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoLicencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoLicencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoLicencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoLicencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLicencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLicencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoLicencia=new JScrollPane(this.jListRelacionesSelectReporteTipoLicencia);
			
			this.jScrollRelacionesSelectReporteTipoLicencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLicencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLicencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoLicencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoLicencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoLicencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoLicencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoLicencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoLicencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLicencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLicencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoLicencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoLicencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLicencia.add(this.jLabelGenerarExcelReporteDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoLicencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoLicencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoLicencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoLicencia.setToolTipText("Generar EXCEL"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoLicencia.add(this.jButtonGenerarExcelReporteDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLicencia.add(this.jComboBoxTiposReportesDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoLicencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoLicencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLicencia.add(this.jLabelTiposArchivoReporteDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLicencia.add(this.jComboBoxTiposArchivosReportesDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoLicencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoLicencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoLicencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoLicencia.setToolTipText("Generar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLicencia.add(this.jButtonGenerarReporteDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoLicencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoLicencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoLicencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoLicencia.setToolTipText("Cancelar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLicencia.add(this.jButtonCerrarReporteDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoLicencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoLicencia= new JScrollPane(jPanelReporteDinamicoTipoLicencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoLicencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLicencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLicencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Licencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoLicencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoLicencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoLicencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoLicencia);
		this.jInternalFrameReporteDinamicoTipoLicencia.getContentPane().add(this.jScrollPanelReporteDinamicoTipoLicencia, this.gridBagConstraintsTipoLicencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoLicencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoLicencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoLicencia.setName("jPanelImportacionTipoLicencia"); 
		
		this.jPanelImportacionTipoLicencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLicencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLicencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoLicencia.setLayout(gridaBagLayoutImportacionTipoLicencia);
		
		
		this.jInternalFrameImportacionTipoLicencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoLicencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoLicencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLicencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoLicencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLicencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLicencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoLicencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLicencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLicencia.setResizable(true);
	    this.jInternalFrameImportacionTipoLicencia.setClosable(true);
	    this.jInternalFrameImportacionTipoLicencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoLicencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLicencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLicencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoLicencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLicencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLicencia.setResizable(true);
	    this.jInternalFrameImportacionTipoLicencia.setClosable(true);
	    this.jInternalFrameImportacionTipoLicencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoLicencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLicencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLicencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Licencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoLicencia = new JLabelMe();

		this.jLabelArchivoImportacionTipoLicencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLicencia.add(this.jLabelArchivoImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoLicencia = new JFileChooser();		
		this.jFileChooserImportacionTipoLicencia.setToolTipText("ESCOGER ARCHIVO"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoLicencia = new JButtonMe();
		this.jButtonAbrirImportacionTipoLicencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoLicencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoLicencia.setToolTipText("Generar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLicencia.add(this.jButtonAbrirImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoLicencia = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoLicencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLicencia.add(this.jLabelPathArchivoImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoLicencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoLicencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLicencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLicencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLicencia.add(this.jTextFieldPathArchivoImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoLicencia = new JButtonMe();
		this.jButtonGenerarImportacionTipoLicencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoLicencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoLicencia.setToolTipText("Generar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLicencia.add(this.jButtonGenerarImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoLicencia = new JButtonMe();
		this.jButtonCerrarImportacionTipoLicencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoLicencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoLicencia.setToolTipText("Cancelar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLicencia.add(this.jButtonCerrarImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoLicencia = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoLicencia= new JScrollPane(jPanelImportacionTipoLicencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoLicencia.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoLicencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoLicencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoLicencia);
		this.jInternalFrameImportacionTipoLicencia.getContentPane().add(this.jScrollPanelImportacionTipoLicencia, this.gridBagConstraintsTipoLicencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoLicencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoLicencia = new JButtonMe();
			this.jButtonAbrirOrderByTipoLicencia.setText("Orden");
			this.jButtonAbrirOrderByTipoLicencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLicencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoLicencia";
			inputMap = this.jButtonAbrirOrderByTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoLicencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoLicencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoLicencia.setName("jPanelOrderByTipoLicencia"); 
			
			this.jPanelOrderByTipoLicencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLicencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLicencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoLicencia.setLayout(gridaBagLayoutOrderByTipoLicencia);
			
			
			this.jTableDatosTipoLicenciaOrderBy = new JTableMe();        
			this.jTableDatosTipoLicenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoLicenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoLicenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoLicenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoLicenciaOrderBy.setViewportView(this.jTableDatosTipoLicenciaOrderBy);
			this.jTableDatosTipoLicenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoLicenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoLicencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoLicencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoLicencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoLicencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoLicencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoLicencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoLicencia.setTitle("Orden");
			this.jInternalFrameOrderByTipoLicencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoLicencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoLicencia.setResizable(true);
			this.jInternalFrameOrderByTipoLicencia.setClosable(true);
			this.jInternalFrameOrderByTipoLicencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoLicencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLicencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLicencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Licencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoLicencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoLicencia.ipady =150;
				
			this.jPanelOrderByTipoLicencia.add(jScrollPanelDatosTipoLicenciaOrderBy, this.gridBagConstraintsTipoLicencia);//this.jTableDatosTipoLicenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoLicencia = new JButtonMe();
			this.jButtonCerrarOrderByTipoLicencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoLicencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoLicencia.setToolTipText("Cancelar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoLicencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoLicencia.add(this.jButtonCerrarOrderByTipoLicencia, this.gridBagConstraintsTipoLicencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoLicencia = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoLicencia= new JScrollPane(jPanelOrderByTipoLicencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoLicencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoLicencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoLicencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoLicencia);
			
			this.jInternalFrameOrderByTipoLicencia.getContentPane().add(this.jScrollPanelOrderByTipoLicencia, this.gridBagConstraintsTipoLicencia);			
		
		} else {
			this.jButtonAbrirOrderByTipoLicencia = new JButtonMe();
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
			&& this.tipolicenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoLicencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoLicencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoLicencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoLicencia.getRowHeight();//TipoLicenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLicencia.isSelected()) {
					iHeightTable=TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLicencia.isSelected()) {
					iHeightTable=TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLicenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoLicencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLicencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLicencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoLicencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLicencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLicencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoLicencia!=null && this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy()!=null) {
			//if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoLicencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoLicencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoLicencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoLicencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLicencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLicencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipolicenciaLogic.getTipoLicencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolicencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoLicencia> TraerTipoLicenciaBeans(List<TipoLicencia> tipolicencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoLicencia tipolicencia:tipolicencias) {
					
				if(!(TipoLicenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoLicenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipolicencia.setsDetalleGeneralEntityReporte(TipoLicenciaConstantesFunciones.getTipoLicenciaDescripcion(tipolicencia));
										
						
					
						
					
				} else  {
							
					//tipolicencia.setsDetalleGeneralEntityReporte(tipolicencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipolicenciabeans.add(tipolicenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipolicencias;
    }
	//PARA REPORTES FIN
}
