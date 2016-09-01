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
import com.bydan.erp.nomina.util.EstadoEmpleadoConstantesFunciones;

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
public class EstadoEmpleadoJInternalFrame extends EstadoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoEmpleado;
	
	protected JMenuBar jmenuBarEstadoEmpleado;
	
	protected JMenu jmenuEstadoEmpleado;
	protected JMenu jmenuDatosEstadoEmpleado;
	protected JMenu jmenuArchivoEstadoEmpleado;
	protected JMenu jmenuAccionesEstadoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoEmpleado;	
	protected GridBagConstraints gridBagConstraintsEstadoEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoEmpleadoSessionBean estadoempleadoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoEmpleado> estadoempleados;		
	public List<EstadoEmpleado> estadoempleadosEliminados;	
	public List<EstadoEmpleado> estadoempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoEmpleado;		
	protected JButton jButtonAbrirOrderByEstadoEmpleado;
	
	
	//protected JPanel jPanelOrderByEstadoEmpleado;
	//public JScrollPane jScrollPanelOrderByEstadoEmpleado;	
	//protected JButton jButtonCerrarOrderByEstadoEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoEmpleadoLogic estadoempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEstadoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEstadoEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoEmpleado;
	//public JScrollPane jScrollPanelImportacionEstadoEmpleado;
	
	
	
	protected JPanel jPanelAccionesEstadoEmpleado;
	
    protected JPanel jPanelPaginacionEstadoEmpleado;
    protected JPanel jPanelParametrosReportesEstadoEmpleado;
	protected JPanel jPanelParametrosReportesAccionesEstadoEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoEmpleado;
	protected JPanel jPanelParametrosAuxiliar2EstadoEmpleado;
	protected JPanel jPanelParametrosAuxiliar3EstadoEmpleado;
	protected JPanel jPanelParametrosAuxiliar4EstadoEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5EstadoEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoEmpleado;
	//protected JPanel jPanelImportacionEstadoEmpleado;
	
	
	public JTable jTableDatosEstadoEmpleado;
	
	
	
	//public JTable jTableDatosEstadoEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoEmpleado;
	protected JButton jButtonDuplicarEstadoEmpleado;
	protected JButton jButtonCopiarEstadoEmpleado;
	protected JButton jButtonVerFormEstadoEmpleado;
	protected JButton jButtonNuevoRelacionesEstadoEmpleado;
	protected JButton jButtonModificarEstadoEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaEstadoEmpleado;
	protected JButton jButtonCerrarEstadoEmpleado;
	
	
	protected JButton jButtonRecargarInformacionEstadoEmpleado;
	protected JButton jButtonProcesarInformacionEstadoEmpleado;
	
	
	protected JButton jButtonAnterioresEstadoEmpleado;
	protected JButton jButtonSiguientesEstadoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosEstadoEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoEstadoEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoEmpleado;
	//protected JButton jButtonGenerarImportacionEstadoEmpleado;
	//protected JButton jButtonCerrarImportacionEstadoEmpleado;
	//protected JFileChooser jFileChooserImportacionEstadoEmpleado;
	//protected File fileImportacionEstadoEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoEmpleado;
	protected JButton jButtonDuplicarToolBarEstadoEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarEstadoEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoEmpleado;
	protected JButton jButtonCopiarToolBarEstadoEmpleado;
	protected JButton jButtonVerFormToolBarEstadoEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoEmpleado;
	protected JButton jButtonCerrarToolBarEstadoEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoEmpleado;
	protected JButton jButtonProcesarInformacionToolBarEstadoEmpleado;
	protected JButton jButtonAnterioresToolBarEstadoEmpleado;
	protected JButton jButtonSiguientesToolBarEstadoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoEmpleado;
	protected JButton jButtonAbrirOrderByToolBarEstadoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoEmpleado;
	protected JMenuItem jMenuItemDuplicarEstadoEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoEmpleado;
	protected JMenuItem jMenuItemCopiarEstadoEmpleado;
	protected JMenuItem jMenuItemVerFormEstadoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoEmpleado;
	protected JMenuItem jMenuItemCerrarEstadoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEstadoEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionEstadoEmpleado;
	protected JMenuItem jMenuItemAnterioresEstadoEmpleado;
	protected JMenuItem jMenuItemSiguientesEstadoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByEstadoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEstadoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosEstadoEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoEmpleado;
	protected JTextField jTextFieldValorCampoGeneralEstadoEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteEstadoEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteEstadoEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionEstadoEmpleado;	
	//public JLabel jLabelPathArchivoImportacionEstadoEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoEmpleado;	
	
	
	
	
	
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
	public EstadoEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoEmpleado)	{
		this.jButtonRecargarInformacionEstadoEmpleado = jButtonRecargarInformacionEstadoEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionEstadoEmpleado() {
		return this.jButtonProcesarInformacionEstadoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoEmpleado)	{
		this.jButtonProcesarInformacionEstadoEmpleado = jButtonProcesarInformacionEstadoEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoEmpleado() {
		return this.jButtonRecargarInformacionEstadoEmpleado;
	}
	
	
	public List<EstadoEmpleado> getestadoempleados() {
		return this.estadoempleados;
	}

	public void setestadoempleados(List<EstadoEmpleado> estadoempleados) {
		this.estadoempleados = estadoempleados;
	}
	
	public List<EstadoEmpleado> getestadoempleadosAux() {
		return this.estadoempleadosAux;
	}

	public void setestadoempleadosAux(List<EstadoEmpleado> estadoempleadosAux) {
		this.estadoempleadosAux = estadoempleadosAux;
	}
	
	public List<EstadoEmpleado> getestadoempleadosEliminados() {
		return this.estadoempleadosEliminados;
	}

	public void setEstadoEmpleadosEliminados(List<EstadoEmpleado> estadoempleadosEliminados) {
		this.estadoempleadosEliminados = estadoempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoEmpleado() {
		return jComboBoxTiposSeleccionarEstadoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoEmpleado(
			JComboBox jComboBoxTiposSeleccionarEstadoEmpleado) {
		this.jComboBoxTiposSeleccionarEstadoEmpleado = jComboBoxTiposSeleccionarEstadoEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoEmpleado() {
		return jTextFieldValorCampoGeneralEstadoEmpleado;
	}

	public void setjTextFieldValorCampoGeneralEstadoEmpleado(
			JTextField jTextFieldValorCampoGeneralEstadoEmpleado) {
		this.jTextFieldValorCampoGeneralEstadoEmpleado = jTextFieldValorCampoGeneralEstadoEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoEmpleado() {
		return this.jCheckBoxSeleccionarTodosEstadoEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosEstadoEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosEstadoEmpleado) {
		this.jCheckBoxSeleccionarTodosEstadoEmpleado = jCheckBoxSeleccionarTodosEstadoEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoEmpleado() {
		return this.jCheckBoxSeleccionadosEstadoEmpleado;
	}

	public void setjCheckBoxSeleccionadosEstadoEmpleado(
			JCheckBox jCheckBoxSeleccionadosEstadoEmpleado) {
		this.jCheckBoxSeleccionadosEstadoEmpleado = jCheckBoxSeleccionadosEstadoEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoEmpleado() {
		return this.jComboBoxTiposArchivosReportesEstadoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoEmpleado(
			JComboBox jComboBoxTiposArchivosReportesEstadoEmpleado) {
		this.jComboBoxTiposArchivosReportesEstadoEmpleado = jComboBoxTiposArchivosReportesEstadoEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoEmpleado() {
		return this.jComboBoxTiposReportesEstadoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoEmpleado(
			JComboBox jComboBoxTiposReportesEstadoEmpleado) {
		this.jComboBoxTiposReportesEstadoEmpleado = jComboBoxTiposReportesEstadoEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoEmpleado() {
	//	return jComboBoxTiposReportesDinamicoEstadoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoEstadoEmpleado = jComboBoxTiposReportesDinamicoEstadoEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado = jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoEmpleado() {
		return this.jComboBoxTiposGraficosReportesEstadoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoEmpleado(
			JComboBox jComboBoxTiposGraficosReportesEstadoEmpleado) {
		this.jComboBoxTiposGraficosReportesEstadoEmpleado = jComboBoxTiposGraficosReportesEstadoEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoEmpleado() {
		return this.jComboBoxTiposPaginacionEstadoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoEmpleado(
			JComboBox jComboBoxTiposPaginacionEstadoEmpleado) {
		this.jComboBoxTiposPaginacionEstadoEmpleado = jComboBoxTiposPaginacionEstadoEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoEmpleado() {
		return this.jComboBoxTiposRelacionesEstadoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoEmpleado() {
		return this.jComboBoxTiposAccionesEstadoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoEmpleado(
			JComboBox jComboBoxTiposRelacionesEstadoEmpleado) {
		this.jComboBoxTiposRelacionesEstadoEmpleado = jComboBoxTiposRelacionesEstadoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoEmpleado(
			JComboBox jComboBoxTiposAccionesEstadoEmpleado) {
		this.jComboBoxTiposAccionesEstadoEmpleado = jComboBoxTiposAccionesEstadoEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoEmpleado() {
	//	return jCheckBoxConGraficoDinamicoEstadoEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoEstadoEmpleado = jCheckBoxConGraficoDinamicoEstadoEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoEmpleado .setBorder(borderResaltar);		
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
		this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
		
		this.estadoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"nuevo","nuevo","Nuevo"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"duplicar","duplicar","Duplicar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"copiar","copiar","Copiar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"ver_form","ver_form","Ver"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"recargar","recargar","Recargar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoEmpleado,this.jTtoolBarEstadoEmpleado,
							"cerrar","cerrar","Salir"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoEmpleado;
			
				this.jButtonProcesarInformacionToolBarEstadoEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoEmpleado;
				
		//protected JButton jButtonModificarToolBarEstadoEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoEmpleado=new JMenuMe("General");
		this.jmenuArchivoEstadoEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosEstadoEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoEmpleado.add(this.jMenuItemCerrarEstadoEmpleado);
			
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemNuevoEstadoEmpleado);
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemNuevoGuardarCambiosEstadoEmpleado);
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemNuevoRelacionesEstadoEmpleado);
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemGuardarCambiosTablaEstadoEmpleado);		
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemDuplicarEstadoEmpleado);		
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemCopiarEstadoEmpleado);		
			this.jmenuAccionesEstadoEmpleado.add(this.jMenuItemVerFormEstadoEmpleado);		
			
			this.jmenuDatosEstadoEmpleado.add(this.jMenuItemRecargarInformacionEstadoEmpleado);				
			this.jmenuDatosEstadoEmpleado.add(this.jMenuItemAnterioresEstadoEmpleado);				
			this.jmenuDatosEstadoEmpleado.add(this.jMenuItemSiguientesEstadoEmpleado);				
			this.jmenuDatosEstadoEmpleado.add(this.jMenuItemAbrirOrderByEstadoEmpleado);				
			this.jmenuDatosEstadoEmpleado.add(this.jMenuItemMostrarOcultarEstadoEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoEmpleado.add(this.jMenuItemGuardarCambiosEstadoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoEmpleado.add(this.jmenuArchivoEstadoEmpleado);		
			this.jmenuBarEstadoEmpleado.add(this.jmenuAccionesEstadoEmpleado);		
			this.jmenuBarEstadoEmpleado.add(this.jmenuDatosEstadoEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoEmpleado() {
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
			//this.jInternalFrameDetalleEstadoEmpleado = new EstadoEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Empleado DATOS");
			this.jInternalFrameDetalleFormEstadoEmpleado = new EstadoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.estadoempleadoSessionBean.getConGuardarRelaciones(),this.estadoempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoEmpleado = null;//new EstadoEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoEmpleado= new GridBagLayout();
		
		
		this.jTableDatosEstadoEmpleado = new JTableMe();      
		
		String sToolTipEstadoEmpleado="";
		sToolTipEstadoEmpleado=EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoEmpleado+="(Nomina.EstadoEmpleado)";
		}
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoEmpleado.setToolTipText(sToolTipEstadoEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoEmpleado);
		this.jTableDatosEstadoEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosEstadoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoEmpleado = new JButtonMe();
		this.jButtonDuplicarEstadoEmpleado = new JButtonMe();
		this.jButtonCopiarEstadoEmpleado = new JButtonMe();
		this.jButtonVerFormEstadoEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado = new JButtonMe();
		this.jButtonCerrarEstadoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEstadoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Empleado";
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEstadoEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoEmpleado=new ReporteDinamicoJInternalFrame(EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoEmpleado=new ImportacionJInternalFrame(EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoEmpleado.setText("Orden");
		this.jButtonAbrirOrderByEstadoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoEmpleado,false,this);
			
			//this.cargarOrderByEstadoEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoEmpleado,true,this);
			
			//this.cargarOrderByEstadoEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoEmpleado.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoEmpleado.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoEmpleado.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoEmpleado.setText("Nuevo");
		this.jButtonDuplicarEstadoEmpleado.setText("Duplicar");
		this.jButtonCopiarEstadoEmpleado.setText("Copiar");
		this.jButtonVerFormEstadoEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesEstadoEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.setText("Guardar");
		this.jButtonCerrarEstadoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoEmpleado,"nuevo_button","Nuevo",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoEmpleado,"duplicar_button","Duplicar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoEmpleado,"copiar_button","Copiar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoEmpleado,"ver_form","Ver",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoEmpleado,"nuevorelaciones_button","Nuevo Rel",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoEmpleado,"guardarcambiostabla_button","Guardar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoEmpleado,"cerrar_button","Salir",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoEmpleado.setToolTipText("Nuevo"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoEmpleado.setToolTipText("Duplicar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoEmpleado.setToolTipText("Copiar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoEmpleado.setToolTipText("Ver"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoEmpleado.setToolTipText("Nuevo Rel"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.setToolTipText("Guardar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoEmpleado.setToolTipText("Salir"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoEmpleado";
		inputMap = this.jButtonNuevoEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoEmpleado";
		inputMap = this.jButtonDuplicarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarEstadoEmpleado";
		inputMap = this.jButtonCopiarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoEmpleado";
		inputMap = this.jButtonVerFormEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoEmpleado";
		inputMap = this.jButtonNuevoRelacionesEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoEmpleado";
		inputMap = this.jButtonModificarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoEmpleado";
		inputMap = this.jButtonCerrarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoEmpleado.setName("jPanelParametrosReportesEstadoEmpleado"); 
		
		this.jPanelParametrosReportesAccionesEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoEmpleado.setName("jPanelParametrosReportesAccionesEstadoEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionEstadoEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionEstadoEmpleado.setToolTipText("Recargar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionEstadoEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionEstadoEmpleado.setToolTipText("Procesar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEstadoEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoEmpleado = new JLabelMe();
		
		this.jLabelAccionesEstadoEmpleado.setText("Acciones");		
		this.jLabelAccionesEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoEmpleado = new JButtonMe();
		//this.jButtonAnterioresEstadoEmpleado.setText("<<");
        this.jButtonAnterioresEstadoEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoEmpleado = new JButtonMe();
		//this.jButtonSiguientesEstadoEmpleado.setText(">>");
        this.jButtonSiguientesEstadoEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoEmpleado,"nuevoguardarcambios_button","Nue",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoEmpleado";
		inputMap = this.jButtonRecargarInformacionEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoEmpleado";
		inputMap = this.jButtonSiguientesEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoEmpleado";
		inputMap = this.jButtonAnterioresEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoEmpleado.setMinimumSize(new Dimension(this.getWidth(),EstadoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoEmpleado.setMaximumSize(new Dimension(this.getWidth(),EstadoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoEmpleado.setPreferredSize(new Dimension(this.getWidth(),EstadoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoEmpleado = new GridBagLayout();

			this.jPanelPaginacionEstadoEmpleado.setLayout(gridaBagLayoutPaginacionEstadoEmpleado);						
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 0;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonAnterioresEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
					
						
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoEmpleado.gridy = 0;
			
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonNuevoGuardarCambiosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
						
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoEmpleado.gridy = 0;
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonSiguientesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonNuevoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoEmpleado.gridy = 1;
				this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoEmpleado.add(this.jButtonNuevoRelacionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			}
			
			
			if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoEmpleado.gridy = 1;
				this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoEmpleado.add(this.jButtonGuardarCambiosTablaEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			}
			
			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonDuplicarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonCopiarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonVerFormEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoEmpleado.add(this.jButtonCerrarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
		
		
		this.jButtonRecargarInformacionEstadoEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoEmpleado.setLayout(gridaBagParametrosReportesEstadoEmpleado);
			this.jPanelParametrosReportesAccionesEstadoEmpleado.setLayout(gridaBagParametrosReportesAccionesEstadoEmpleado);
			
			
			this.jPanelParametrosAuxiliar1EstadoEmpleado.setLayout(gridaBagParametrosAuxiliar1EstadoEmpleado);
			this.jPanelParametrosAuxiliar2EstadoEmpleado.setLayout(gridaBagParametrosAuxiliar2EstadoEmpleado);
			this.jPanelParametrosAuxiliar3EstadoEmpleado.setLayout(gridaBagParametrosAuxiliar3EstadoEmpleado);
			this.jPanelParametrosAuxiliar4EstadoEmpleado.setLayout(gridaBagParametrosAuxiliar4EstadoEmpleado);
			//this.jPanelParametrosAuxiliar5EstadoEmpleado.setLayout(gridaBagParametrosAuxiliar2EstadoEmpleado);			
			
			
			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jButtonRecargarInformacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoEmpleado.add(this.jComboBoxTiposPaginacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoEmpleado.add(this.jCheckBoxConAltoMaximoTablaEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoEmpleado.add(this.jComboBoxTiposArchivosReportesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jPanelParametrosAuxiliar1EstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoEmpleado.add(this.jComboBoxTiposReportesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jPanelParametrosAuxiliar4EstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jComboBoxTiposReportesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jCheckBoxGenerarReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jPanelParametrosAuxiliar2EstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jLabelAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoEmpleado.add(this.jButtonAbrirOrderByEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jComboBoxTiposSeleccionarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
			
			
			/*
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jCheckBoxSeleccionarTodosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoEmpleado.add(this.jCheckBoxSeleccionarTodosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);															
				
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoEmpleado.add(this.jCheckBoxSeleccionadosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jPanelParametrosAuxiliar3EstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jComboBoxTiposRelacionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
				
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jComboBoxTiposAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
	
				
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoEmpleado.add(this.jTextFieldValorCampoGeneralEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoEmpleado = new GridBagLayout();

			this.jScrollPanelDatosEstadoEmpleado.setLayout(gridaBagLayoutDatosEstadoEmpleado);
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = 0;
			this.gridBagConstraintsEstadoEmpleado.gridx = 0;
			
			this.jScrollPanelDatosEstadoEmpleado.add(this.jTableDatosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoEmpleado.setViewportView(this.jTableDatosEstadoEmpleado);
		this.jTableDatosEstadoEmpleado.setFillsViewportHeight(true);
		this.jTableDatosEstadoEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoEmpleado= new GridBagLayout();
		this.jPanelAccionesEstadoEmpleado.setLayout(gridaBagLayoutAccionesEstadoEmpleado);
		
		
		/*	
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
			
		this.jPanelAccionesEstadoEmpleado.add(this.jButtonNuevoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoEmpleado.gridx = 0;		
			//this.gridBagConstraintsEstadoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;		
		//this.gridBagConstraintsEstadoEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);								
		
		
		/*
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		*/		
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoEmpleado.gridx =0;
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
				
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoEmpleado.setLayout(gridaBagLayoutBusquedasParametrosEstadoEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
			
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
			
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoEmpleado.setName("jPanelReporteDinamicoEstadoEmpleado"); 
		
		this.jPanelReporteDinamicoEstadoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoEmpleado.setLayout(gridaBagLayoutReporteDinamicoEstadoEmpleado);
		
		
		this.jInternalFrameReporteDinamicoEstadoEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jLabelColumnasSelectReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoEmpleado=new JScrollPane(this.jListColumnasSelectReporteEstadoEmpleado);
			
			this.jScrollColumnasSelectReporteEstadoEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoEmpleado.add(this.jListColumnasSelectReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jScrollColumnasSelectReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jLabelRelacionesSelectReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoEmpleado=new JScrollPane(this.jListRelacionesSelectReporteEstadoEmpleado);
			
			this.jScrollRelacionesSelectReporteEstadoEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoEmpleado.add(this.jListRelacionesSelectReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jScrollRelacionesSelectReporteEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jLabelGenerarExcelReporteDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado.setToolTipText("Generar EXCEL"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoEmpleado.add(this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jComboBoxTiposReportesDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jLabelTiposArchivoReporteDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoEmpleado.setToolTipText("Generar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jButtonGenerarReporteDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoEmpleado.setToolTipText("Cancelar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoEmpleado.add(this.jButtonCerrarReporteDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoEmpleado= new JScrollPane(jPanelReporteDinamicoEstadoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoEmpleado);
		this.jInternalFrameReporteDinamicoEstadoEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoEmpleado.setName("jPanelImportacionEstadoEmpleado"); 
		
		this.jPanelImportacionEstadoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoEmpleado.setLayout(gridaBagLayoutImportacionEstadoEmpleado);
		
		
		this.jInternalFrameImportacionEstadoEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEstadoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEstadoEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEstadoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEstadoEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionEstadoEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoEmpleado.add(this.jLabelArchivoImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoEmpleado = new JFileChooser();		
		this.jFileChooserImportacionEstadoEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionEstadoEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoEmpleado.setToolTipText("Generar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoEmpleado.add(this.jButtonAbrirImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoEmpleado.add(this.jLabelPathArchivoImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoEmpleado.add(this.jTextFieldPathArchivoImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionEstadoEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoEmpleado.setToolTipText("Generar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoEmpleado.add(this.jButtonGenerarImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionEstadoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoEmpleado.setToolTipText("Cancelar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoEmpleado.add(this.jButtonCerrarImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoEmpleado= new JScrollPane(jPanelImportacionEstadoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoEmpleado);
		this.jInternalFrameImportacionEstadoEmpleado.getContentPane().add(this.jScrollPanelImportacionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByEstadoEmpleado.setText("Orden");
			this.jButtonAbrirOrderByEstadoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoEmpleado";
			inputMap = this.jButtonAbrirOrderByEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoEmpleado.setName("jPanelOrderByEstadoEmpleado"); 
			
			this.jPanelOrderByEstadoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoEmpleado.setLayout(gridaBagLayoutOrderByEstadoEmpleado);
			
			
			this.jTableDatosEstadoEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosEstadoEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoEmpleadoOrderBy.setViewportView(this.jTableDatosEstadoEmpleadoOrderBy);
			this.jTableDatosEstadoEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByEstadoEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoEmpleado.setResizable(true);
			this.jInternalFrameOrderByEstadoEmpleado.setClosable(true);
			this.jInternalFrameOrderByEstadoEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoEmpleado.ipady =150;
				
			this.jPanelOrderByEstadoEmpleado.add(jScrollPanelDatosEstadoEmpleadoOrderBy, this.gridBagConstraintsEstadoEmpleado);//this.jTableDatosEstadoEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByEstadoEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoEmpleado.setToolTipText("Cancelar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoEmpleado.add(this.jButtonCerrarOrderByEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoEmpleado= new JScrollPane(jPanelOrderByEstadoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoEmpleado);
			
			this.jInternalFrameOrderByEstadoEmpleado.getContentPane().add(this.jScrollPanelOrderByEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByEstadoEmpleado = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoEmpleado.getRowHeight();//EstadoEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.isSelected()) {
					iHeightTable=EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoEmpleado.isSelected()) {
					iHeightTable=EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoEmpleado!=null && this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoempleadoLogic.getEstadoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoEmpleado> TraerEstadoEmpleadoBeans(List<EstadoEmpleado> estadoempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoEmpleado estadoempleado:estadoempleados) {
					
				if(!(EstadoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoempleado.setsDetalleGeneralEntityReporte(EstadoEmpleadoConstantesFunciones.getEstadoEmpleadoDescripcion(estadoempleado));
										
						
					
					

					if(estadoempleado.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{estadoempleado.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(estadoempleado.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadoempleado.getCierreRolMensuals()!=null && Funciones.existeClass(classes,CierreRolMensual.class)) {
						try{estadoempleado.setcierrerolmensualsDescripcionReporte(new JRBeanCollectionDataSource(CierreRolMensualJInternalFrame.TraerCierreRolMensualBeans(estadoempleado.getCierreRolMensuals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoempleado.setsDetalleGeneralEntityReporte(estadoempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoempleadobeans.add(estadoempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoempleados;
    }
	//PARA REPORTES FIN
}
