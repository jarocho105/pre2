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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoEmpleadoConstantesFunciones;

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
public class TipoEmpleadoJInternalFrame extends TipoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEmpleado;
	
	protected JMenuBar jmenuBarTipoEmpleado;
	
	protected JMenu jmenuTipoEmpleado;
	protected JMenu jmenuDatosTipoEmpleado;
	protected JMenu jmenuArchivoTipoEmpleado;
	protected JMenu jmenuAccionesTipoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoEmpleadoSessionBean tipoempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEmpleado> tipoempleados;		
	public List<TipoEmpleado> tipoempleadosEliminados;	
	public List<TipoEmpleado> tipoempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEmpleado;		
	protected JButton jButtonAbrirOrderByTipoEmpleado;
	
	
	//protected JPanel jPanelOrderByTipoEmpleado;
	//public JScrollPane jScrollPanelOrderByTipoEmpleado;	
	//protected JButton jButtonCerrarOrderByTipoEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEmpleadoLogic tipoempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEmpleado;
	//public JScrollPane jScrollPanelImportacionTipoEmpleado;
	
	
	
	protected JPanel jPanelAccionesTipoEmpleado;
	
    protected JPanel jPanelPaginacionTipoEmpleado;
    protected JPanel jPanelParametrosReportesTipoEmpleado;
	protected JPanel jPanelParametrosReportesAccionesTipoEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEmpleado;
	protected JPanel jPanelParametrosAuxiliar2TipoEmpleado;
	protected JPanel jPanelParametrosAuxiliar3TipoEmpleado;
	protected JPanel jPanelParametrosAuxiliar4TipoEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5TipoEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEmpleado;
	//protected JPanel jPanelImportacionTipoEmpleado;
	
	
	public JTable jTableDatosTipoEmpleado;
	
	
	
	//public JTable jTableDatosTipoEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEmpleado;
	protected JButton jButtonDuplicarTipoEmpleado;
	protected JButton jButtonCopiarTipoEmpleado;
	protected JButton jButtonVerFormTipoEmpleado;
	protected JButton jButtonNuevoRelacionesTipoEmpleado;
	protected JButton jButtonModificarTipoEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaTipoEmpleado;
	protected JButton jButtonCerrarTipoEmpleado;
	
	
	protected JButton jButtonRecargarInformacionTipoEmpleado;
	protected JButton jButtonProcesarInformacionTipoEmpleado;
	
	
	protected JButton jButtonAnterioresTipoEmpleado;
	protected JButton jButtonSiguientesTipoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosTipoEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoTipoEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEmpleado;
	//protected JButton jButtonGenerarImportacionTipoEmpleado;
	//protected JButton jButtonCerrarImportacionTipoEmpleado;
	//protected JFileChooser jFileChooserImportacionTipoEmpleado;
	//protected File fileImportacionTipoEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEmpleado;
	protected JButton jButtonDuplicarToolBarTipoEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarTipoEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEmpleado;
	protected JButton jButtonCopiarToolBarTipoEmpleado;
	protected JButton jButtonVerFormToolBarTipoEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEmpleado;
	protected JButton jButtonCerrarToolBarTipoEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEmpleado;
	protected JButton jButtonProcesarInformacionToolBarTipoEmpleado;
	protected JButton jButtonAnterioresToolBarTipoEmpleado;
	protected JButton jButtonSiguientesToolBarTipoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEmpleado;
	protected JButton jButtonAbrirOrderByToolBarTipoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEmpleado;
	protected JMenuItem jMenuItemDuplicarTipoEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEmpleado;
	protected JMenuItem jMenuItemCopiarTipoEmpleado;
	protected JMenuItem jMenuItemVerFormTipoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEmpleado;
	protected JMenuItem jMenuItemCerrarTipoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionTipoEmpleado;
	protected JMenuItem jMenuItemAnterioresTipoEmpleado;
	protected JMenuItem jMenuItemSiguientesTipoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByTipoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosTipoEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEmpleado;
	protected JTextField jTextFieldValorCampoGeneralTipoEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteTipoEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteTipoEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionTipoEmpleado;	
	//public JLabel jLabelPathArchivoImportacionTipoEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoEmpleado;
	
	
	
	
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
	public TipoEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEmpleado)	{
		this.jButtonRecargarInformacionTipoEmpleado = jButtonRecargarInformacionTipoEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionTipoEmpleado() {
		return this.jButtonProcesarInformacionTipoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEmpleado)	{
		this.jButtonProcesarInformacionTipoEmpleado = jButtonProcesarInformacionTipoEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEmpleado() {
		return this.jButtonRecargarInformacionTipoEmpleado;
	}
	
	
	public List<TipoEmpleado> gettipoempleados() {
		return this.tipoempleados;
	}

	public void settipoempleados(List<TipoEmpleado> tipoempleados) {
		this.tipoempleados = tipoempleados;
	}
	
	public List<TipoEmpleado> gettipoempleadosAux() {
		return this.tipoempleadosAux;
	}

	public void settipoempleadosAux(List<TipoEmpleado> tipoempleadosAux) {
		this.tipoempleadosAux = tipoempleadosAux;
	}
	
	public List<TipoEmpleado> gettipoempleadosEliminados() {
		return this.tipoempleadosEliminados;
	}

	public void setTipoEmpleadosEliminados(List<TipoEmpleado> tipoempleadosEliminados) {
		this.tipoempleadosEliminados = tipoempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEmpleado() {
		return jComboBoxTiposSeleccionarTipoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEmpleado(
			JComboBox jComboBoxTiposSeleccionarTipoEmpleado) {
		this.jComboBoxTiposSeleccionarTipoEmpleado = jComboBoxTiposSeleccionarTipoEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEmpleado() {
		return jTextFieldValorCampoGeneralTipoEmpleado;
	}

	public void setjTextFieldValorCampoGeneralTipoEmpleado(
			JTextField jTextFieldValorCampoGeneralTipoEmpleado) {
		this.jTextFieldValorCampoGeneralTipoEmpleado = jTextFieldValorCampoGeneralTipoEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEmpleado() {
		return this.jCheckBoxSeleccionarTodosTipoEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosTipoEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosTipoEmpleado) {
		this.jCheckBoxSeleccionarTodosTipoEmpleado = jCheckBoxSeleccionarTodosTipoEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEmpleado() {
		return this.jCheckBoxSeleccionadosTipoEmpleado;
	}

	public void setjCheckBoxSeleccionadosTipoEmpleado(
			JCheckBox jCheckBoxSeleccionadosTipoEmpleado) {
		this.jCheckBoxSeleccionadosTipoEmpleado = jCheckBoxSeleccionadosTipoEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEmpleado() {
		return this.jComboBoxTiposArchivosReportesTipoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEmpleado(
			JComboBox jComboBoxTiposArchivosReportesTipoEmpleado) {
		this.jComboBoxTiposArchivosReportesTipoEmpleado = jComboBoxTiposArchivosReportesTipoEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEmpleado() {
		return this.jComboBoxTiposReportesTipoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEmpleado(
			JComboBox jComboBoxTiposReportesTipoEmpleado) {
		this.jComboBoxTiposReportesTipoEmpleado = jComboBoxTiposReportesTipoEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEmpleado() {
	//	return jComboBoxTiposReportesDinamicoTipoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoTipoEmpleado = jComboBoxTiposReportesDinamicoTipoEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado = jComboBoxTiposArchivosReportesDinamicoTipoEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEmpleado() {
		return this.jComboBoxTiposGraficosReportesTipoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEmpleado(
			JComboBox jComboBoxTiposGraficosReportesTipoEmpleado) {
		this.jComboBoxTiposGraficosReportesTipoEmpleado = jComboBoxTiposGraficosReportesTipoEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEmpleado() {
		return this.jComboBoxTiposPaginacionTipoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEmpleado(
			JComboBox jComboBoxTiposPaginacionTipoEmpleado) {
		this.jComboBoxTiposPaginacionTipoEmpleado = jComboBoxTiposPaginacionTipoEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEmpleado() {
		return this.jComboBoxTiposRelacionesTipoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEmpleado() {
		return this.jComboBoxTiposAccionesTipoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoEmpleado) {
		this.jComboBoxTiposRelacionesTipoEmpleado = jComboBoxTiposRelacionesTipoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEmpleado(
			JComboBox jComboBoxTiposAccionesTipoEmpleado) {
		this.jComboBoxTiposAccionesTipoEmpleado = jComboBoxTiposAccionesTipoEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEmpleado() {
	//	return jCheckBoxConGraficoDinamicoTipoEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoTipoEmpleado = jCheckBoxConGraficoDinamicoTipoEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEmpleado .setBorder(borderResaltar);		
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
		this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
		
		this.tipoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"nuevo","nuevo","Nuevo"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"duplicar","duplicar","Duplicar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"copiar","copiar","Copiar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"ver_form","ver_form","Ver"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"recargar","recargar","Recargar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEmpleado,this.jTtoolBarTipoEmpleado,
							"cerrar","cerrar","Salir"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEmpleado;
			
				this.jButtonProcesarInformacionToolBarTipoEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEmpleado;
				
		//protected JButton jButtonModificarToolBarTipoEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEmpleado=new JMenuMe("General");
		this.jmenuArchivoTipoEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosTipoEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEmpleado.add(this.jMenuItemCerrarTipoEmpleado);
			
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemNuevoTipoEmpleado);
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemNuevoGuardarCambiosTipoEmpleado);
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemNuevoRelacionesTipoEmpleado);
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemGuardarCambiosTablaTipoEmpleado);		
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemDuplicarTipoEmpleado);		
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemCopiarTipoEmpleado);		
			this.jmenuAccionesTipoEmpleado.add(this.jMenuItemVerFormTipoEmpleado);		
			
			this.jmenuDatosTipoEmpleado.add(this.jMenuItemRecargarInformacionTipoEmpleado);				
			this.jmenuDatosTipoEmpleado.add(this.jMenuItemAnterioresTipoEmpleado);				
			this.jmenuDatosTipoEmpleado.add(this.jMenuItemSiguientesTipoEmpleado);				
			this.jmenuDatosTipoEmpleado.add(this.jMenuItemAbrirOrderByTipoEmpleado);				
			this.jmenuDatosTipoEmpleado.add(this.jMenuItemMostrarOcultarTipoEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEmpleado.add(this.jMenuItemGuardarCambiosTipoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEmpleado.add(this.jmenuArchivoTipoEmpleado);		
			this.jmenuBarTipoEmpleado.add(this.jmenuAccionesTipoEmpleado);		
			this.jmenuBarTipoEmpleado.add(this.jmenuDatosTipoEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoEmpleado = new TipoEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Empleado DATOS");
			this.jInternalFrameDetalleFormTipoEmpleado = new TipoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipoempleadoSessionBean.getConGuardarRelaciones(),this.tipoempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEmpleado = null;//new TipoEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEmpleado= new GridBagLayout();
		
		
		this.jTableDatosTipoEmpleado = new JTableMe();      
		
		String sToolTipTipoEmpleado="";
		sToolTipTipoEmpleado=TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEmpleado+="(Nomina.TipoEmpleado)";
		}
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEmpleado.setToolTipText(sToolTipTipoEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEmpleado);
		this.jTableDatosTipoEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosTipoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEmpleado = new JButtonMe();
		this.jButtonDuplicarTipoEmpleado = new JButtonMe();
		this.jButtonCopiarTipoEmpleado = new JButtonMe();
		this.jButtonVerFormTipoEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEmpleado = new JButtonMe();
		this.jButtonCerrarTipoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Empleado";
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEmpleado=new ReporteDinamicoJInternalFrame(TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEmpleado=new ImportacionJInternalFrame(TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEmpleado.setText("Orden");
		this.jButtonAbrirOrderByTipoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpleado,false,this);
			
			//this.cargarOrderByTipoEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpleado,true,this);
			
			//this.cargarOrderByTipoEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEmpleado.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEmpleado.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEmpleado.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEmpleado.setText("Nuevo");
		this.jButtonDuplicarTipoEmpleado.setText("Duplicar");
		this.jButtonCopiarTipoEmpleado.setText("Copiar");
		this.jButtonVerFormTipoEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesTipoEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.setText("Guardar");
		this.jButtonCerrarTipoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEmpleado,"nuevo_button","Nuevo",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEmpleado,"duplicar_button","Duplicar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEmpleado,"copiar_button","Copiar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEmpleado,"ver_form","Ver",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEmpleado,"nuevorelaciones_button","Nuevo Rel",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEmpleado,"guardarcambiostabla_button","Guardar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEmpleado,"cerrar_button","Salir",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEmpleado.setToolTipText("Nuevo"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEmpleado.setToolTipText("Duplicar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEmpleado.setToolTipText("Copiar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEmpleado.setToolTipText("Ver"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEmpleado.setToolTipText("Nuevo Rel"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.setToolTipText("Guardar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEmpleado.setToolTipText("Salir"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEmpleado";
		inputMap = this.jButtonNuevoTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEmpleado";
		inputMap = this.jButtonDuplicarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarTipoEmpleado";
		inputMap = this.jButtonCopiarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEmpleado";
		inputMap = this.jButtonVerFormTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEmpleado";
		inputMap = this.jButtonModificarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEmpleado";
		inputMap = this.jButtonCerrarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEmpleado.setName("jPanelParametrosReportesTipoEmpleado"); 
		
		this.jPanelParametrosReportesAccionesTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEmpleado.setName("jPanelParametrosReportesAccionesTipoEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionTipoEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionTipoEmpleado.setToolTipText("Recargar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionTipoEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionTipoEmpleado.setToolTipText("Procesar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEmpleado = new JButtonMe();
		//this.jButtonAnterioresTipoEmpleado.setText("<<");
        this.jButtonAnterioresTipoEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEmpleado = new JButtonMe();
		//this.jButtonSiguientesTipoEmpleado.setText(">>");
        this.jButtonSiguientesTipoEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEmpleado,"nuevoguardarcambios_button","Nue",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEmpleado";
		inputMap = this.jButtonRecargarInformacionTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEmpleado";
		inputMap = this.jButtonSiguientesTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEmpleado";
		inputMap = this.jButtonAnterioresTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEmpleado.setMinimumSize(new Dimension(this.getWidth(),TipoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEmpleado.setMaximumSize(new Dimension(this.getWidth(),TipoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEmpleado.setPreferredSize(new Dimension(this.getWidth(),TipoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEmpleado = new GridBagLayout();

			this.jPanelPaginacionTipoEmpleado.setLayout(gridaBagLayoutPaginacionTipoEmpleado);						
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 0;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonAnterioresTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
					
						
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEmpleado.gridy = 0;
			
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonNuevoGuardarCambiosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
						
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEmpleado.gridy = 0;
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonSiguientesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonNuevoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEmpleado.gridy = 1;
				this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoEmpleado.add(this.jButtonNuevoRelacionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			}
			
			
			if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEmpleado.gridy = 1;
				this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEmpleado.add(this.jButtonGuardarCambiosTablaTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			}
			
			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonDuplicarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonCopiarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonVerFormTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEmpleado.add(this.jButtonCerrarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
		
		
		this.jButtonRecargarInformacionTipoEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEmpleado.setLayout(gridaBagParametrosReportesTipoEmpleado);
			this.jPanelParametrosReportesAccionesTipoEmpleado.setLayout(gridaBagParametrosReportesAccionesTipoEmpleado);
			
			
			this.jPanelParametrosAuxiliar1TipoEmpleado.setLayout(gridaBagParametrosAuxiliar1TipoEmpleado);
			this.jPanelParametrosAuxiliar2TipoEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoEmpleado);
			this.jPanelParametrosAuxiliar3TipoEmpleado.setLayout(gridaBagParametrosAuxiliar3TipoEmpleado);
			this.jPanelParametrosAuxiliar4TipoEmpleado.setLayout(gridaBagParametrosAuxiliar4TipoEmpleado);
			//this.jPanelParametrosAuxiliar5TipoEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoEmpleado);			
			
			
			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpleado.add(this.jButtonRecargarInformacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEmpleado.add(this.jComboBoxTiposPaginacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEmpleado.add(this.jCheckBoxConAltoMaximoTablaTipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEmpleado.add(this.jComboBoxTiposArchivosReportesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpleado.add(this.jPanelParametrosAuxiliar1TipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEmpleado.add(this.jComboBoxTiposReportesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpleado.add(this.jPanelParametrosAuxiliar4TipoEmpleado, this.gridBagConstraintsTipoEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpleado.add(this.jComboBoxTiposReportesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEmpleado.add(this.jCheckBoxGenerarReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpleado.add(this.jPanelParametrosAuxiliar2TipoEmpleado, this.gridBagConstraintsTipoEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEmpleado.add(this.jLabelAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEmpleado.add(this.jButtonAbrirOrderByTipoEmpleado, this.gridBagConstraintsTipoEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpleado.add(this.jComboBoxTiposSeleccionarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
			
			
			/*
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEmpleado.add(this.jCheckBoxSeleccionarTodosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEmpleado.add(this.jCheckBoxSeleccionarTodosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);															
				
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEmpleado.add(this.jCheckBoxSeleccionadosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpleado.add(this.jPanelParametrosAuxiliar3TipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpleado.add(this.jComboBoxTiposRelacionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
				
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpleado.add(this.jComboBoxTiposAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEmpleado = new GridBagLayout();

			this.jScrollPanelDatosTipoEmpleado.setLayout(gridaBagLayoutDatosTipoEmpleado);
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = 0;
			this.gridBagConstraintsTipoEmpleado.gridx = 0;
			
			this.jScrollPanelDatosTipoEmpleado.add(this.jTableDatosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEmpleado.setViewportView(this.jTableDatosTipoEmpleado);
		this.jTableDatosTipoEmpleado.setFillsViewportHeight(true);
		this.jTableDatosTipoEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoEmpleado.setLayout(gridaBagLayoutAccionesTipoEmpleado);
		
		
		/*	
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
			
		this.jPanelAccionesTipoEmpleado.add(this.jButtonNuevoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEmpleado.gridx = 0;		
		//this.gridBagConstraintsTipoEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);								
		
		
		/*
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		*/		
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEmpleado.gridx =0;
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
				
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEmpleado.setLayout(gridaBagLayoutBusquedasParametrosTipoEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
			
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
			
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEmpleado.setName("jPanelReporteDinamicoTipoEmpleado"); 
		
		this.jPanelReporteDinamicoTipoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEmpleado.setLayout(gridaBagLayoutReporteDinamicoTipoEmpleado);
		
		
		this.jInternalFrameReporteDinamicoTipoEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jLabelColumnasSelectReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEmpleado=new JScrollPane(this.jListColumnasSelectReporteTipoEmpleado);
			
			this.jScrollColumnasSelectReporteTipoEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEmpleado.add(this.jListColumnasSelectReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jScrollColumnasSelectReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jLabelRelacionesSelectReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEmpleado=new JScrollPane(this.jListRelacionesSelectReporteTipoEmpleado);
			
			this.jScrollRelacionesSelectReporteTipoEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEmpleado.add(this.jListRelacionesSelectReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jScrollRelacionesSelectReporteTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jLabelGenerarExcelReporteDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEmpleado.setToolTipText("Generar EXCEL"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEmpleado.add(this.jButtonGenerarExcelReporteDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jComboBoxTiposReportesDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jLabelTiposArchivoReporteDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEmpleado.setToolTipText("Generar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jButtonGenerarReporteDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEmpleado.setToolTipText("Cancelar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpleado.add(this.jButtonCerrarReporteDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEmpleado= new JScrollPane(jPanelReporteDinamicoTipoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEmpleado);
		this.jInternalFrameReporteDinamicoTipoEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEmpleado.setName("jPanelImportacionTipoEmpleado"); 
		
		this.jPanelImportacionTipoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEmpleado.setLayout(gridaBagLayoutImportacionTipoEmpleado);
		
		
		this.jInternalFrameImportacionTipoEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionTipoEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEmpleado.add(this.jLabelArchivoImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEmpleado = new JFileChooser();		
		this.jFileChooserImportacionTipoEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionTipoEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEmpleado.setToolTipText("Generar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpleado.add(this.jButtonAbrirImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEmpleado.add(this.jLabelPathArchivoImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpleado.add(this.jTextFieldPathArchivoImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionTipoEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEmpleado.setToolTipText("Generar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpleado.add(this.jButtonGenerarImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionTipoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEmpleado.setToolTipText("Cancelar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpleado.add(this.jButtonCerrarImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEmpleado= new JScrollPane(jPanelImportacionTipoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEmpleado);
		this.jInternalFrameImportacionTipoEmpleado.getContentPane().add(this.jScrollPanelImportacionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByTipoEmpleado.setText("Orden");
			this.jButtonAbrirOrderByTipoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEmpleado";
			inputMap = this.jButtonAbrirOrderByTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEmpleado.setName("jPanelOrderByTipoEmpleado"); 
			
			this.jPanelOrderByTipoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEmpleado.setLayout(gridaBagLayoutOrderByTipoEmpleado);
			
			
			this.jTableDatosTipoEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosTipoEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEmpleadoOrderBy.setViewportView(this.jTableDatosTipoEmpleadoOrderBy);
			this.jTableDatosTipoEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByTipoEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEmpleado.setResizable(true);
			this.jInternalFrameOrderByTipoEmpleado.setClosable(true);
			this.jInternalFrameOrderByTipoEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEmpleado.ipady =150;
				
			this.jPanelOrderByTipoEmpleado.add(jScrollPanelDatosTipoEmpleadoOrderBy, this.gridBagConstraintsTipoEmpleado);//this.jTableDatosTipoEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByTipoEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEmpleado.setToolTipText("Cancelar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEmpleado.add(this.jButtonCerrarOrderByTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEmpleado= new JScrollPane(jPanelOrderByTipoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEmpleado);
			
			this.jInternalFrameOrderByTipoEmpleado.getContentPane().add(this.jScrollPanelOrderByTipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByTipoEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEmpleado.getRowHeight();//TipoEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEmpleado.isSelected()) {
					iHeightTable=TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEmpleado.isSelected()) {
					iHeightTable=TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEmpleado!=null && this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoempleadoLogic.getTipoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEmpleado> TraerTipoEmpleadoBeans(List<TipoEmpleado> tipoempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEmpleado tipoempleado:tipoempleados) {
					
				if(!(TipoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoempleado.setsDetalleGeneralEntityReporte(TipoEmpleadoConstantesFunciones.getTipoEmpleadoDescripcion(tipoempleado));
										
						
					
					

					if(tipoempleado.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{tipoempleado.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(tipoempleado.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoempleado.setsDetalleGeneralEntityReporte(tipoempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoempleadobeans.add(tipoempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoempleados;
    }
	//PARA REPORTES FIN
}
