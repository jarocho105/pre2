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
import com.bydan.erp.nomina.util.AbonoPrestamoConstantesFunciones;

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
public class AbonoPrestamoJInternalFrame extends AbonoPrestamoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAbonoPrestamo;
	
	protected JMenuBar jmenuBarAbonoPrestamo;
	
	protected JMenu jmenuAbonoPrestamo;
	protected JMenu jmenuDatosAbonoPrestamo;
	protected JMenu jmenuArchivoAbonoPrestamo;
	protected JMenu jmenuAccionesAbonoPrestamo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAbonoPrestamo;	
	protected GridBagConstraints gridBagConstraintsAbonoPrestamo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AbonoPrestamoDetalleFormJInternalFrame jInternalFrameDetalleFormAbonoPrestamo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAbonoPrestamo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAbonoPrestamo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_prestamo="";
	
	public AbonoPrestamoSessionBean abonoprestamoSessionBean;
		
	
	
	public PrestamoSessionBean prestamoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AbonoPrestamo> abonoprestamos;		
	public List<AbonoPrestamo> abonoprestamosEliminados;	
	public List<AbonoPrestamo> abonoprestamosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAbonoPrestamo;		
	protected JButton jButtonAbrirOrderByAbonoPrestamo;
	
	
	//protected JPanel jPanelOrderByAbonoPrestamo;
	//public JScrollPane jScrollPanelOrderByAbonoPrestamo;	
	//protected JButton jButtonCerrarOrderByAbonoPrestamo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AbonoPrestamoLogic abonoprestamoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAbonoPrestamo;
	public JScrollPane jScrollPanelDatosEdicionAbonoPrestamo;
	public JScrollPane jScrollPanelDatosGeneralAbonoPrestamo;
    
	
	
	//public JScrollPane jScrollPanelDatosAbonoPrestamoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAbonoPrestamo;
	//public JScrollPane jScrollPanelImportacionAbonoPrestamo;
	
	
	
	protected JPanel jPanelAccionesAbonoPrestamo;
	
    protected JPanel jPanelPaginacionAbonoPrestamo;
    protected JPanel jPanelParametrosReportesAbonoPrestamo;
	protected JPanel jPanelParametrosReportesAccionesAbonoPrestamo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AbonoPrestamo;
	protected JPanel jPanelParametrosAuxiliar2AbonoPrestamo;
	protected JPanel jPanelParametrosAuxiliar3AbonoPrestamo;
	protected JPanel jPanelParametrosAuxiliar4AbonoPrestamo;
	//protected JPanel jPanelParametrosAuxiliar5AbonoPrestamo;
	
	
	
	//protected JPanel jPanelReporteDinamicoAbonoPrestamo;
	//protected JPanel jPanelImportacionAbonoPrestamo;
	
	
	public JTable jTableDatosAbonoPrestamo;
	
	
	
	//public JTable jTableDatosAbonoPrestamoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAbonoPrestamo;
	protected JButton jButtonDuplicarAbonoPrestamo;
	protected JButton jButtonCopiarAbonoPrestamo;
	protected JButton jButtonVerFormAbonoPrestamo;
	protected JButton jButtonNuevoRelacionesAbonoPrestamo;
	protected JButton jButtonModificarAbonoPrestamo;
	
    protected JButton jButtonGuardarCambiosTablaAbonoPrestamo;
	protected JButton jButtonCerrarAbonoPrestamo;
	
	
	protected JButton jButtonRecargarInformacionAbonoPrestamo;
	protected JButton jButtonProcesarInformacionAbonoPrestamo;
	
	
	protected JButton jButtonAnterioresAbonoPrestamo;
	protected JButton jButtonSiguientesAbonoPrestamo;
	protected JButton jButtonNuevoGuardarCambiosAbonoPrestamo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAbonoPrestamo;
	//protected JButton jButtonCerrarReporteDinamicoAbonoPrestamo;
	//protected JButton jButtonGenerarExcelReporteDinamicoAbonoPrestamo;	
	
	
	
	//protected JButton jButtonAbrirImportacionAbonoPrestamo;
	//protected JButton jButtonGenerarImportacionAbonoPrestamo;
	//protected JButton jButtonCerrarImportacionAbonoPrestamo;
	//protected JFileChooser jFileChooserImportacionAbonoPrestamo;
	//protected File fileImportacionAbonoPrestamo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAbonoPrestamo;
	protected JButton jButtonDuplicarToolBarAbonoPrestamo;
	protected JButton jButtonNuevoRelacionesToolBarAbonoPrestamo;
	
	
	public JButton jButtonGuardarCambiosToolBarAbonoPrestamo;
	protected JButton jButtonCopiarToolBarAbonoPrestamo;
	protected JButton jButtonVerFormToolBarAbonoPrestamo;
	public JButton jButtonGuardarCambiosTablaToolBarAbonoPrestamo;
	protected JButton jButtonMostrarOcultarTablaToolBarAbonoPrestamo;
	protected JButton jButtonCerrarToolBarAbonoPrestamo;
	
	protected JButton jButtonRecargarInformacionToolBarAbonoPrestamo;
	protected JButton jButtonProcesarInformacionToolBarAbonoPrestamo;
	protected JButton jButtonAnterioresToolBarAbonoPrestamo;
	protected JButton jButtonSiguientesToolBarAbonoPrestamo;
	protected JButton jButtonNuevoGuardarCambiosToolBarAbonoPrestamo;
	protected JButton jButtonAbrirOrderByToolBarAbonoPrestamo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAbonoPrestamo;
	protected JMenuItem jMenuItemDuplicarAbonoPrestamo;
	protected JMenuItem jMenuItemNuevoRelacionesAbonoPrestamo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAbonoPrestamo;
	protected JMenuItem jMenuItemCopiarAbonoPrestamo;
	protected JMenuItem jMenuItemVerFormAbonoPrestamo;
	protected JMenuItem jMenuItemGuardarCambiosTablaAbonoPrestamo;
	protected JMenuItem jMenuItemCerrarAbonoPrestamo;
	protected JMenuItem jMenuItemDetalleCerrarAbonoPrestamo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAbonoPrestamo;
	protected JMenuItem jMenuItemDetalleMostarOcultarAbonoPrestamo;
	
	protected JMenuItem jMenuItemRecargarInformacionAbonoPrestamo;
	protected JMenuItem jMenuItemProcesarInformacionAbonoPrestamo;
	protected JMenuItem jMenuItemAnterioresAbonoPrestamo;
	protected JMenuItem jMenuItemSiguientesAbonoPrestamo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAbonoPrestamo;
	protected JMenuItem jMenuItemAbrirOrderByAbonoPrestamo;
	protected JMenuItem jMenuItemMostrarOcultarAbonoPrestamo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAbonoPrestamo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAbonoPrestamo;
	protected JCheckBox jCheckBoxSeleccionadosAbonoPrestamo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAbonoPrestamo;
	protected JCheckBox jCheckBoxConGraficoReporteAbonoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAbonoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAbonoPrestamo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAbonoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAbonoPrestamo;
	protected JTextField jTextFieldValorCampoGeneralAbonoPrestamo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAbonoPrestamo;
	//public JList<Reporte> jListColumnasSelectReporteAbonoPrestamo;
	//public JScrollPane jScrollColumnasSelectReporteAbonoPrestamo;
	
	//public JLabel jLabelRelacionesSelectReporteAbonoPrestamo;
	//public JList<Reporte> jListRelacionesSelectReporteAbonoPrestamo;
	//public JScrollPane jScrollRelacionesSelectReporteAbonoPrestamo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAbonoPrestamo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAbonoPrestamo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAbonoPrestamo;
	//public JLabel jLabelTiposArchivoReporteDinamicoAbonoPrestamo;
	
		
	//public JLabel jLabelArchivoImportacionAbonoPrestamo;	
	//public JLabel jLabelPathArchivoImportacionAbonoPrestamo;
	//protected JTextField jTextFieldPathArchivoImportacionAbonoPrestamo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAbonoPrestamo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAbonoPrestamo;
	
	//public JLabel jLabelColumnaCategoriaValorAbonoPrestamo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAbonoPrestamo;
	
	//public JLabel jLabelColumnasValoresGraficoAbonoPrestamo;
	//public JList<Reporte> jListColumnasValoresGraficoAbonoPrestamo;
	//public JScrollPane jScrollColumnasValoresGraficoAbonoPrestamo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAbonoPrestamo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAbonoPrestamo;
	public JPanel jPanelFK_IdPrestamoAbonoPrestamo;
	public JButton jButtonFK_IdPrestamoAbonoPrestamo;
	
	public JPanel jPanelid_prestamoFK_IdPrestamoAbonoPrestamo;
	public JLabel jLabelid_prestamoFK_IdPrestamoAbonoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo;
	public JButton jButtonid_prestamoFK_IdPrestamoAbonoPrestamo= new JButtonMe();
	public JButton jButtonid_prestamoFK_IdPrestamoAbonoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_prestamoFK_IdPrestamoAbonoPrestamoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AbonoPrestamoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AbonoPrestamoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAbonoPrestamo)	{
		this.jButtonRecargarInformacionAbonoPrestamo = jButtonRecargarInformacionAbonoPrestamo;
	}
	
	public JButton getjButtonProcesarInformacionAbonoPrestamo() {
		return this.jButtonProcesarInformacionAbonoPrestamo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAbonoPrestamo)	{
		this.jButtonProcesarInformacionAbonoPrestamo = jButtonProcesarInformacionAbonoPrestamo;
	}
	
	
	public JButton getjButtonRecargarInformacionAbonoPrestamo() {
		return this.jButtonRecargarInformacionAbonoPrestamo;
	}
	
	
	public List<AbonoPrestamo> getabonoprestamos() {
		return this.abonoprestamos;
	}

	public void setabonoprestamos(List<AbonoPrestamo> abonoprestamos) {
		this.abonoprestamos = abonoprestamos;
	}
	
	public List<AbonoPrestamo> getabonoprestamosAux() {
		return this.abonoprestamosAux;
	}

	public void setabonoprestamosAux(List<AbonoPrestamo> abonoprestamosAux) {
		this.abonoprestamosAux = abonoprestamosAux;
	}
	
	public List<AbonoPrestamo> getabonoprestamosEliminados() {
		return this.abonoprestamosEliminados;
	}

	public void setAbonoPrestamosEliminados(List<AbonoPrestamo> abonoprestamosEliminados) {
		this.abonoprestamosEliminados = abonoprestamosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAbonoPrestamo() {
		return jComboBoxTiposSeleccionarAbonoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAbonoPrestamo(
			JComboBox jComboBoxTiposSeleccionarAbonoPrestamo) {
		this.jComboBoxTiposSeleccionarAbonoPrestamo = jComboBoxTiposSeleccionarAbonoPrestamo;
	}
	
	public void setBorderResaltarTiposSeleccionarAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAbonoPrestamo() {
		return jTextFieldValorCampoGeneralAbonoPrestamo;
	}

	public void setjTextFieldValorCampoGeneralAbonoPrestamo(
			JTextField jTextFieldValorCampoGeneralAbonoPrestamo) {
		this.jTextFieldValorCampoGeneralAbonoPrestamo = jTextFieldValorCampoGeneralAbonoPrestamo;
	}

	public void setBorderResaltarValorCampoGeneralAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAbonoPrestamo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAbonoPrestamo() {
		return this.jCheckBoxSeleccionarTodosAbonoPrestamo;
	}

	public void setjCheckBoxSeleccionarTodosAbonoPrestamo(
			JCheckBox jCheckBoxSeleccionarTodosAbonoPrestamo) {
		this.jCheckBoxSeleccionarTodosAbonoPrestamo = jCheckBoxSeleccionarTodosAbonoPrestamo;
	}

	public void setBorderResaltarSeleccionarTodosAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAbonoPrestamo() {
		return this.jCheckBoxSeleccionadosAbonoPrestamo;
	}

	public void setjCheckBoxSeleccionadosAbonoPrestamo(
			JCheckBox jCheckBoxSeleccionadosAbonoPrestamo) {
		this.jCheckBoxSeleccionadosAbonoPrestamo = jCheckBoxSeleccionadosAbonoPrestamo;
	}
	
	public void setBorderResaltarSeleccionadosAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAbonoPrestamo() {
		return this.jComboBoxTiposArchivosReportesAbonoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAbonoPrestamo(
			JComboBox jComboBoxTiposArchivosReportesAbonoPrestamo) {
		this.jComboBoxTiposArchivosReportesAbonoPrestamo = jComboBoxTiposArchivosReportesAbonoPrestamo;
	}

	public void setBorderResaltarTiposArchivosReportesAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAbonoPrestamo() {
		return this.jComboBoxTiposReportesAbonoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAbonoPrestamo(
			JComboBox jComboBoxTiposReportesAbonoPrestamo) {
		this.jComboBoxTiposReportesAbonoPrestamo = jComboBoxTiposReportesAbonoPrestamo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAbonoPrestamo() {
	//	return jComboBoxTiposReportesDinamicoAbonoPrestamo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAbonoPrestamo(
	//		JComboBox jComboBoxTiposReportesDinamicoAbonoPrestamo) {
	//	this.jComboBoxTiposReportesDinamicoAbonoPrestamo = jComboBoxTiposReportesDinamicoAbonoPrestamo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAbonoPrestamo() {
	//	return jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAbonoPrestamo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo = jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo;
	//}
	
	public void setBorderResaltarTiposReportesAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAbonoPrestamo() {
		return this.jComboBoxTiposGraficosReportesAbonoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAbonoPrestamo(
			JComboBox jComboBoxTiposGraficosReportesAbonoPrestamo) {
		this.jComboBoxTiposGraficosReportesAbonoPrestamo = jComboBoxTiposGraficosReportesAbonoPrestamo;
	}
	
	public void setBorderResaltarTiposGraficosReportesAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAbonoPrestamo() {
		return this.jComboBoxTiposPaginacionAbonoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAbonoPrestamo(
			JComboBox jComboBoxTiposPaginacionAbonoPrestamo) {
		this.jComboBoxTiposPaginacionAbonoPrestamo = jComboBoxTiposPaginacionAbonoPrestamo;
	}
	
	public void setBorderResaltarTiposPaginacionAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAbonoPrestamo() {
		return this.jComboBoxTiposRelacionesAbonoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAbonoPrestamo() {
		return this.jComboBoxTiposAccionesAbonoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAbonoPrestamo(
			JComboBox jComboBoxTiposRelacionesAbonoPrestamo) {
		this.jComboBoxTiposRelacionesAbonoPrestamo = jComboBoxTiposRelacionesAbonoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAbonoPrestamo(
			JComboBox jComboBoxTiposAccionesAbonoPrestamo) {
		this.jComboBoxTiposAccionesAbonoPrestamo = jComboBoxTiposAccionesAbonoPrestamo;
	}
	
	public void setBorderResaltarTiposRelacionesAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAbonoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAbonoPrestamo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAbonoPrestamo() {
	//	return jCheckBoxConGraficoDinamicoAbonoPrestamo;
	//}

	//public void setjCheckBoxConGraficoDinamicoAbonoPrestamo(
	//		JCheckBox jCheckBoxConGraficoDinamicoAbonoPrestamo) {
	//	this.jCheckBoxConGraficoDinamicoAbonoPrestamo = jCheckBoxConGraficoDinamicoAbonoPrestamo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAbonoPrestamo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAbonoPrestamo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAbonoPrestamo .setBorder(borderResaltar);		
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
		this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		
		this.abonoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.abonoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.abonoprestamoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AbonoPrestamoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Abono Prestamo MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
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
		
		AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AbonoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAbonoPrestamo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"nuevo","nuevo","Nuevo"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"duplicar","duplicar","Duplicar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"copiar","copiar","Copiar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"ver_form","ver_form","Ver"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"recargar","recargar","Recargar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAbonoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAbonoPrestamo,this.jTtoolBarAbonoPrestamo,
							"cerrar","cerrar","Salir"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAbonoPrestamo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAbonoPrestamo;
			
				this.jButtonProcesarInformacionToolBarAbonoPrestamo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAbonoPrestamo;
				
		//protected JButton jButtonModificarToolBarAbonoPrestamo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAbonoPrestamo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAbonoPrestamo=new JMenuMe("General");
		this.jmenuArchivoAbonoPrestamo=new JMenuMe("Archivo");
		this.jmenuAccionesAbonoPrestamo=new JMenuMe("Acciones");
		this.jmenuDatosAbonoPrestamo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAbonoPrestamo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAbonoPrestamo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAbonoPrestamo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAbonoPrestamo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAbonoPrestamo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAbonoPrestamo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAbonoPrestamo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAbonoPrestamo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAbonoPrestamo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAbonoPrestamo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAbonoPrestamo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAbonoPrestamo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAbonoPrestamo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAbonoPrestamo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAbonoPrestamo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAbonoPrestamo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAbonoPrestamo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAbonoPrestamo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAbonoPrestamo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAbonoPrestamo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAbonoPrestamo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAbonoPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAbonoPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAbonoPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAbonoPrestamo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAbonoPrestamo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAbonoPrestamo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAbonoPrestamo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAbonoPrestamo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAbonoPrestamo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAbonoPrestamo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAbonoPrestamo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAbonoPrestamo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAbonoPrestamo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAbonoPrestamo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAbonoPrestamo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAbonoPrestamo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAbonoPrestamo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAbonoPrestamo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAbonoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAbonoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAbonoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAbonoPrestamo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAbonoPrestamo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAbonoPrestamo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAbonoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAbonoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAbonoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAbonoPrestamo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAbonoPrestamo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAbonoPrestamo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAbonoPrestamo.add(this.jMenuItemCerrarAbonoPrestamo);
			
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemNuevoAbonoPrestamo);
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemNuevoGuardarCambiosAbonoPrestamo);
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemNuevoRelacionesAbonoPrestamo);
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemGuardarCambiosTablaAbonoPrestamo);		
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemDuplicarAbonoPrestamo);		
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemCopiarAbonoPrestamo);		
			this.jmenuAccionesAbonoPrestamo.add(this.jMenuItemVerFormAbonoPrestamo);		
			
			this.jmenuDatosAbonoPrestamo.add(this.jMenuItemRecargarInformacionAbonoPrestamo);				
			this.jmenuDatosAbonoPrestamo.add(this.jMenuItemAnterioresAbonoPrestamo);				
			this.jmenuDatosAbonoPrestamo.add(this.jMenuItemSiguientesAbonoPrestamo);				
			this.jmenuDatosAbonoPrestamo.add(this.jMenuItemAbrirOrderByAbonoPrestamo);				
			this.jmenuDatosAbonoPrestamo.add(this.jMenuItemMostrarOcultarAbonoPrestamo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAbonoPrestamo.add(this.jMenuItemGuardarCambiosAbonoPrestamo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAbonoPrestamo.add(this.jmenuArchivoAbonoPrestamo);		
			this.jmenuBarAbonoPrestamo.add(this.jmenuAccionesAbonoPrestamo);		
			this.jmenuBarAbonoPrestamo.add(this.jmenuDatosAbonoPrestamo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAbonoPrestamo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAbonoPrestamo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPrestamoAbonoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPrestamoAbonoPrestamo.setToolTipText("Buscar Por Idprestamo ");
		this.jButtonFK_IdPrestamoAbonoPrestamo= new JButtonMe();
		this.jButtonFK_IdPrestamoAbonoPrestamo.setText("Buscar");
		this.jButtonFK_IdPrestamoAbonoPrestamo.setToolTipText("Buscar Por Idprestamo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPrestamoAbonoPrestamo,"buscar_button","Buscar Por Idprestamo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPrestamoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_prestamoFK_IdPrestamoAbonoPrestamo = new JLabelMe();
		jLabelid_prestamoFK_IdPrestamoAbonoPrestamo.setText("Idprestamo :");
		jLabelid_prestamoFK_IdPrestamoAbonoPrestamo.setToolTipText("Idprestamo");
		jLabelid_prestamoFK_IdPrestamoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_prestamoFK_IdPrestamoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_prestamoFK_IdPrestamoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_prestamoFK_IdPrestamoAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo= new JComboBoxMe();
		jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAbonoPrestamo=new JTabbedPane();


		this.jTabbedPaneBusquedasAbonoPrestamo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAbonoPrestamo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAbonoPrestamo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAbonoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAbonoPrestamo = new AbonoPrestamoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Abono Prestamo DATOS");
			this.jInternalFrameDetalleFormAbonoPrestamo = new AbonoPrestamoDetalleFormJInternalFrame(jDesktopPane,this.abonoprestamoSessionBean.getConGuardarRelaciones(),this.abonoprestamoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAbonoPrestamo = null;//new AbonoPrestamoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAbonoPrestamo= new GridBagLayout();
		
		
		this.jTableDatosAbonoPrestamo = new JTableMe();      
		
		String sToolTipAbonoPrestamo="";
		sToolTipAbonoPrestamo=AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAbonoPrestamo+="(Nomina.AbonoPrestamo)";
		}
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			sToolTipAbonoPrestamo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAbonoPrestamo.setToolTipText(sToolTipAbonoPrestamo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAbonoPrestamo);
		this.jTableDatosAbonoPrestamo.setAutoCreateRowSorter(true);
		this.jTableDatosAbonoPrestamo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAbonoPrestamo.setRowSelectionAllowed(true);
		this.jTableDatosAbonoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAbonoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAbonoPrestamo = new JButtonMe();
		this.jButtonDuplicarAbonoPrestamo = new JButtonMe();
		this.jButtonCopiarAbonoPrestamo = new JButtonMe();
		this.jButtonVerFormAbonoPrestamo = new JButtonMe();
		this.jButtonNuevoRelacionesAbonoPrestamo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo = new JButtonMe();
		this.jButtonCerrarAbonoPrestamo = new JButtonMe();
		
		this.jScrollPanelDatosAbonoPrestamo = new JScrollPane();   
        this.jScrollPanelDatosGeneralAbonoPrestamo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Abono Prestamo";
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Abono Prestamos" + this.sPath));
		} else {
			this.jScrollPanelDatosAbonoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAbonoPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesAbonoPrestamo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAbonoPrestamo=new ReporteDinamicoJInternalFrame(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAbonoPrestamo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAbonoPrestamo=new ImportacionJInternalFrame(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAbonoPrestamo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAbonoPrestamo = new JButtonMe();
		
		this.jButtonAbrirOrderByAbonoPrestamo.setText("Orden");
		this.jButtonAbrirOrderByAbonoPrestamo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAbonoPrestamo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAbonoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAbonoPrestamo,false,this);
			
			//this.cargarOrderByAbonoPrestamo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAbonoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAbonoPrestamo,true,this);
			
			//this.cargarOrderByAbonoPrestamo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAbonoPrestamo.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosAbonoPrestamo.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosAbonoPrestamo.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosAbonoPrestamo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAbonoPrestamo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAbonoPrestamo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAbonoPrestamo.setText("Nuevo");
		this.jButtonDuplicarAbonoPrestamo.setText("Duplicar");
		this.jButtonCopiarAbonoPrestamo.setText("Copiar");
		this.jButtonVerFormAbonoPrestamo.setText("Ver");
		this.jButtonNuevoRelacionesAbonoPrestamo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.setText("Guardar");
		this.jButtonCerrarAbonoPrestamo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAbonoPrestamo,"nuevo_button","Nuevo",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAbonoPrestamo,"duplicar_button","Duplicar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAbonoPrestamo,"copiar_button","Copiar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAbonoPrestamo,"ver_form","Ver",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAbonoPrestamo,"nuevorelaciones_button","Nuevo Rel",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAbonoPrestamo,"guardarcambiostabla_button","Guardar",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAbonoPrestamo,"cerrar_button","Salir",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAbonoPrestamo.setToolTipText("Nuevo"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAbonoPrestamo.setToolTipText("Duplicar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAbonoPrestamo.setToolTipText("Copiar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAbonoPrestamo.setToolTipText("Ver"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAbonoPrestamo.setToolTipText("Nuevo Rel"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.setToolTipText("Guardar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAbonoPrestamo.setToolTipText("Salir"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAbonoPrestamo";
		inputMap = this.jButtonNuevoAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAbonoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAbonoPrestamo"));
		
		//DUPLICAR
		sMapKey = "DuplicarAbonoPrestamo";
		inputMap = this.jButtonDuplicarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAbonoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAbonoPrestamo"));
		
		//COPIAR
		sMapKey = "CopiarAbonoPrestamo";
		inputMap = this.jButtonCopiarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAbonoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAbonoPrestamo"));
		
		//VEr FORM
		sMapKey = "VerFormAbonoPrestamo";
		inputMap = this.jButtonVerFormAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAbonoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAbonoPrestamo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAbonoPrestamo";
		inputMap = this.jButtonNuevoRelacionesAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAbonoPrestamo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAbonoPrestamo";
		inputMap = this.jButtonModificarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAbonoPrestamo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAbonoPrestamo";
		inputMap = this.jButtonCerrarAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAbonoPrestamo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAbonoPrestamo";
		inputMap = this.jButtonGuardarCambiosTablaAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAbonoPrestamo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AbonoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AbonoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AbonoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AbonoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AbonoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAbonoPrestamo.setName("jPanelParametrosReportesAbonoPrestamo"); 
		
		this.jPanelParametrosReportesAccionesAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAbonoPrestamo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAbonoPrestamo.setName("jPanelParametrosReportesAccionesAbonoPrestamo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAbonoPrestamo = new JButtonMe();
		this.jButtonRecargarInformacionAbonoPrestamo.setText("Recargar");
		this.jButtonRecargarInformacionAbonoPrestamo.setToolTipText("Recargar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAbonoPrestamo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAbonoPrestamo = new JButtonMe();
		this.jButtonProcesarInformacionAbonoPrestamo.setText("Procesar");
		this.jButtonProcesarInformacionAbonoPrestamo.setToolTipText("Procesar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAbonoPrestamo.setVisible(false);
			
		this.jButtonProcesarInformacionAbonoPrestamo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAbonoPrestamo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAbonoPrestamo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAbonoPrestamo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAbonoPrestamo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAbonoPrestamo.setText("TIPO");       
		this.jComboBoxTiposReportesAbonoPrestamo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAbonoPrestamo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAbonoPrestamo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAbonoPrestamo.setText("Paginacion");
		this.jComboBoxTiposPaginacionAbonoPrestamo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAbonoPrestamo.setText("Accion");
		this.jComboBoxTiposRelacionesAbonoPrestamo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAbonoPrestamo.setText("Accion");
		this.jComboBoxTiposAccionesAbonoPrestamo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAbonoPrestamo.setText("Accion");
		this.jComboBoxTiposSeleccionarAbonoPrestamo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAbonoPrestamo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAbonoPrestamo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAbonoPrestamo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAbonoPrestamo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAbonoPrestamo = new JLabelMe();
		
		this.jLabelAccionesAbonoPrestamo.setText("Acciones");		
		this.jLabelAccionesAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAbonoPrestamo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAbonoPrestamo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAbonoPrestamo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAbonoPrestamo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAbonoPrestamo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAbonoPrestamo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAbonoPrestamo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAbonoPrestamo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAbonoPrestamo.setText("Graf.");
		this.jCheckBoxConGraficoReporteAbonoPrestamo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAbonoPrestamo = new JButtonMe();
		//this.jButtonAnterioresAbonoPrestamo.setText("<<");
        this.jButtonAnterioresAbonoPrestamo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAbonoPrestamo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAbonoPrestamo = new JButtonMe();
		//this.jButtonSiguientesAbonoPrestamo.setText(">>");
        this.jButtonSiguientesAbonoPrestamo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAbonoPrestamo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAbonoPrestamo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAbonoPrestamo.setText("Nue");
        this.jButtonNuevoGuardarCambiosAbonoPrestamo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAbonoPrestamo,"nuevoguardarcambios_button","Nue",this.abonoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAbonoPrestamo";
		inputMap = this.jButtonNuevoGuardarCambiosAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAbonoPrestamo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAbonoPrestamo";
		inputMap = this.jButtonRecargarInformacionAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAbonoPrestamo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAbonoPrestamo";
		inputMap = this.jButtonSiguientesAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAbonoPrestamo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAbonoPrestamo";
		inputMap = this.jButtonAnterioresAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAbonoPrestamo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAbonoPrestamo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAbonoPrestamo.setMinimumSize(new Dimension(this.getWidth(),AbonoPrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AbonoPrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAbonoPrestamo.setMaximumSize(new Dimension(this.getWidth(),AbonoPrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AbonoPrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAbonoPrestamo.setPreferredSize(new Dimension(this.getWidth(),AbonoPrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AbonoPrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAbonoPrestamo = new GridBagLayout();

			this.jPanelPaginacionAbonoPrestamo.setLayout(gridaBagLayoutPaginacionAbonoPrestamo);						
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 0;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonAnterioresAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
					
						
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAbonoPrestamo.gridy = 0;
			
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonNuevoGuardarCambiosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
						
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAbonoPrestamo.gridy = 0;
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonSiguientesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 1;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonNuevoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
						
			
			
			if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAbonoPrestamo.gridy = 1;
				this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAbonoPrestamo.add(this.jButtonGuardarCambiosTablaAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			}
			
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 1;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonDuplicarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 1;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonCopiarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 1;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonVerFormAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 1;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAbonoPrestamo.add(this.jButtonCerrarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		
		this.jButtonRecargarInformacionAbonoPrestamo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAbonoPrestamo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAbonoPrestamo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAbonoPrestamo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAbonoPrestamo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAbonoPrestamo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAbonoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAbonoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAbonoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAbonoPrestamo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAbonoPrestamo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAbonoPrestamo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAbonoPrestamo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAbonoPrestamo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAbonoPrestamo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAbonoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAbonoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAbonoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAbonoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAbonoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAbonoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAbonoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAbonoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAbonoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAbonoPrestamo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAbonoPrestamo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAbonoPrestamo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAbonoPrestamo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAbonoPrestamo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAbonoPrestamo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAbonoPrestamo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAbonoPrestamo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAbonoPrestamo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAbonoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAbonoPrestamo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AbonoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AbonoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AbonoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AbonoPrestamo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAbonoPrestamo.setLayout(gridaBagParametrosReportesAbonoPrestamo);
			this.jPanelParametrosReportesAccionesAbonoPrestamo.setLayout(gridaBagParametrosReportesAccionesAbonoPrestamo);
			
			
			this.jPanelParametrosAuxiliar1AbonoPrestamo.setLayout(gridaBagParametrosAuxiliar1AbonoPrestamo);
			this.jPanelParametrosAuxiliar2AbonoPrestamo.setLayout(gridaBagParametrosAuxiliar2AbonoPrestamo);
			this.jPanelParametrosAuxiliar3AbonoPrestamo.setLayout(gridaBagParametrosAuxiliar3AbonoPrestamo);
			this.jPanelParametrosAuxiliar4AbonoPrestamo.setLayout(gridaBagParametrosAuxiliar4AbonoPrestamo);
			//this.jPanelParametrosAuxiliar5AbonoPrestamo.setLayout(gridaBagParametrosAuxiliar2AbonoPrestamo);			
			
			
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jButtonRecargarInformacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AbonoPrestamo.add(this.jComboBoxTiposPaginacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AbonoPrestamo.add(this.jCheckBoxConAltoMaximoTablaAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AbonoPrestamo.add(this.jComboBoxTiposArchivosReportesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jPanelParametrosAuxiliar1AbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AbonoPrestamo.add(this.jComboBoxTiposReportesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);																		
			
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AbonoPrestamo.add(this.jComboBoxTiposGraficosReportesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jPanelParametrosAuxiliar4AbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jComboBoxTiposReportesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jCheckBoxGenerarReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jPanelParametrosAuxiliar2AbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jLabelAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAbonoPrestamo.add(this.jButtonAbrirOrderByAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jComboBoxTiposSeleccionarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
			
			
			/*
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jCheckBoxSeleccionarTodosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jCheckBoxConGraficoReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AbonoPrestamo.add(this.jCheckBoxSeleccionarTodosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);															
				
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AbonoPrestamo.add(this.jCheckBoxSeleccionadosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);															
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAbonoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AbonoPrestamo.add(this.jCheckBoxConGraficoReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jPanelParametrosAuxiliar3AbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jComboBoxTiposAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
	
				
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAbonoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAbonoPrestamo.add(this.jTextFieldValorCampoGeneralAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAbonoPrestamo = new GridBagLayout();

			this.jScrollPanelDatosAbonoPrestamo.setLayout(gridaBagLayoutDatosAbonoPrestamo);
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = 0;
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;
			
			this.jScrollPanelDatosAbonoPrestamo.add(this.jTableDatosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAbonoPrestamo.setViewportView(this.jTableDatosAbonoPrestamo);
		this.jTableDatosAbonoPrestamo.setFillsViewportHeight(true);
		this.jTableDatosAbonoPrestamo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAbonoPrestamo= new GridBagLayout();
		this.jPanelAccionesAbonoPrestamo.setLayout(gridaBagLayoutAccionesAbonoPrestamo);
		
		
		/*	
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = 0;
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
			
		this.jPanelAccionesAbonoPrestamo.add(this.jButtonNuevoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPrestamoAbonoPrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdPrestamoAbonoPrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPrestamoAbonoPrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPrestamoAbonoPrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPrestamoAbonoPrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPrestamoAbonoPrestamo.setLayout(gridaBagLayoutFK_IdPrestamoAbonoPrestamo);

		gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAbonoPrestamo.gridy = 0;
		gridBagConstraintsAbonoPrestamo.gridx = 0;
		jPanelFK_IdPrestamoAbonoPrestamo.add(jLabelid_prestamoFK_IdPrestamoAbonoPrestamo, gridBagConstraintsAbonoPrestamo);

		gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAbonoPrestamo.gridy = 0;
		gridBagConstraintsAbonoPrestamo.gridx = 1;
		jPanelFK_IdPrestamoAbonoPrestamo.add(jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo, gridBagConstraintsAbonoPrestamo);

		gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAbonoPrestamo.gridy = 1;
		gridBagConstraintsAbonoPrestamo.gridx =1;
		jPanelFK_IdPrestamoAbonoPrestamo.add(jButtonFK_IdPrestamoAbonoPrestamo, gridBagConstraintsAbonoPrestamo);

		jTabbedPaneBusquedasAbonoPrestamo.addTab("1.-Por Idprestamo ", jPanelFK_IdPrestamoAbonoPrestamo);
		jTabbedPaneBusquedasAbonoPrestamo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAbonoPrestamo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAbonoPrestamo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();						
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;		
			//this.gridBagConstraintsAbonoPrestamo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAbonoPrestamo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;		
		//this.gridBagConstraintsAbonoPrestamo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAbonoPrestamo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAbonoPrestamo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAbonoPrestamo.gridx = 0;		
			this.gridBagConstraintsAbonoPrestamo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAbonoPrestamo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);								
		
		
		/*
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		*/		
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAbonoPrestamo.gridx =0;
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAbonoPrestamo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
				
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAbonoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAbonoPrestamo = new GridBagLayout();
			this.jPanelBusquedasParametrosAbonoPrestamo.setLayout(gridaBagLayoutBusquedasParametrosAbonoPrestamo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAbonoPrestamo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAbonoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAbonoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAbonoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
			
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAbonoPrestamo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAbonoPrestamo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAbonoPrestamo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAbonoPrestamo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAbonoPrestamo.setName("jPanelReporteDinamicoAbonoPrestamo"); 
		
		this.jPanelReporteDinamicoAbonoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAbonoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAbonoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAbonoPrestamo.setLayout(gridaBagLayoutReporteDinamicoAbonoPrestamo);
		
		
		this.jInternalFrameReporteDinamicoAbonoPrestamo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAbonoPrestamo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAbonoPrestamo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAbonoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAbonoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAbonoPrestamo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAbonoPrestamo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAbonoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAbonoPrestamo.setResizable(true);
	    this.jInternalFrameReporteDinamicoAbonoPrestamo.setClosable(true);
	    this.jInternalFrameReporteDinamicoAbonoPrestamo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAbonoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAbonoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAbonoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Abono Prestamos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAbonoPrestamo = new JLabelMe();

		this.jLabelColumnasSelectReporteAbonoPrestamo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelColumnasSelectReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAbonoPrestamo = new JList<Reporte>();
		this.jListColumnasSelectReporteAbonoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAbonoPrestamo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAbonoPrestamo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAbonoPrestamo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAbonoPrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAbonoPrestamo=new JScrollPane(this.jListColumnasSelectReporteAbonoPrestamo);
			
			this.jScrollColumnasSelectReporteAbonoPrestamo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAbonoPrestamo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAbonoPrestamo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAbonoPrestamo.add(this.jListColumnasSelectReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jScrollColumnasSelectReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAbonoPrestamo = new JLabelMe();

		this.jLabelRelacionesSelectReporteAbonoPrestamo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAbonoPrestamo = new JList<Reporte>();
		this.jListRelacionesSelectReporteAbonoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAbonoPrestamo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAbonoPrestamo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAbonoPrestamo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAbonoPrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAbonoPrestamo=new JScrollPane(this.jListRelacionesSelectReporteAbonoPrestamo);
			
			this.jScrollRelacionesSelectReporteAbonoPrestamo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAbonoPrestamo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAbonoPrestamo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAbonoPrestamo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo = new JComboBoxMe();
		this.jListColumnasValoresGraficoAbonoPrestamo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAbonoPrestamo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAbonoPrestamo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAbonoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAbonoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAbonoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAbonoPrestamo = new JLabelMe();

		this.jLabelConGraficoDinamicoAbonoPrestamo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelConGraficoDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAbonoPrestamo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAbonoPrestamo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAbonoPrestamo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAbonoPrestamo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAbonoPrestamo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAbonoPrestamo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jCheckBoxConGraficoDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAbonoPrestamo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAbonoPrestamo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelColumnaCategoriaGraficoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAbonoPrestamo = new JLabelMe();

		this.jLabelColumnaCategoriaValorAbonoPrestamo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelColumnaCategoriaValorAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAbonoPrestamo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAbonoPrestamo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAbonoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAbonoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAbonoPrestamo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jComboBoxColumnaCategoriaValorAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAbonoPrestamo = new JLabelMe();

		this.jLabelColumnasValoresGraficoAbonoPrestamo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelColumnasValoresGraficoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAbonoPrestamo = new JList<Reporte>();
		this.jListColumnasValoresGraficoAbonoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAbonoPrestamo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAbonoPrestamo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAbonoPrestamo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAbonoPrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAbonoPrestamo=new JScrollPane(this.jListColumnasValoresGraficoAbonoPrestamo);
			
			this.jScrollColumnasValoresGraficoAbonoPrestamo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAbonoPrestamo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAbonoPrestamo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAbonoPrestamo.add(this.jListColumnasSelectReporteAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jScrollColumnasValoresGraficoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAbonoPrestamo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAbonoPrestamo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelTiposGraficosReportesDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAbonoPrestamo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jComboBoxTiposGraficosReportesDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAbonoPrestamo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAbonoPrestamo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelGenerarExcelReporteDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo.setToolTipText("Generar EXCEL"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAbonoPrestamo.add(this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jComboBoxTiposReportesDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAbonoPrestamo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAbonoPrestamo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jLabelTiposArchivoReporteDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jComboBoxTiposArchivosReportesDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAbonoPrestamo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAbonoPrestamo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAbonoPrestamo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAbonoPrestamo.setToolTipText("Generar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jButtonGenerarReporteDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAbonoPrestamo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAbonoPrestamo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAbonoPrestamo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAbonoPrestamo.setToolTipText("Cancelar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAbonoPrestamo.add(this.jButtonCerrarReporteDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAbonoPrestamo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAbonoPrestamo= new JScrollPane(jPanelReporteDinamicoAbonoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAbonoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAbonoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAbonoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Abono Prestamos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAbonoPrestamo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAbonoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAbonoPrestamo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAbonoPrestamo);
		this.jInternalFrameReporteDinamicoAbonoPrestamo.getContentPane().add(this.jScrollPanelReporteDinamicoAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAbonoPrestamo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAbonoPrestamo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAbonoPrestamo.setName("jPanelImportacionAbonoPrestamo"); 
		
		this.jPanelImportacionAbonoPrestamo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAbonoPrestamo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAbonoPrestamo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAbonoPrestamo.setLayout(gridaBagLayoutImportacionAbonoPrestamo);
		
		
		this.jInternalFrameImportacionAbonoPrestamo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAbonoPrestamo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAbonoPrestamo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAbonoPrestamo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAbonoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAbonoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAbonoPrestamo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAbonoPrestamo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAbonoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAbonoPrestamo.setResizable(true);
	    this.jInternalFrameImportacionAbonoPrestamo.setClosable(true);
	    this.jInternalFrameImportacionAbonoPrestamo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAbonoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAbonoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAbonoPrestamo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAbonoPrestamo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAbonoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAbonoPrestamo.setResizable(true);
	    this.jInternalFrameImportacionAbonoPrestamo.setClosable(true);
	    this.jInternalFrameImportacionAbonoPrestamo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAbonoPrestamo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAbonoPrestamo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAbonoPrestamo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Abono Prestamos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAbonoPrestamo = new JLabelMe();

		this.jLabelArchivoImportacionAbonoPrestamo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYImportacion;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAbonoPrestamo.add(this.jLabelArchivoImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAbonoPrestamo = new JFileChooser();		
		this.jFileChooserImportacionAbonoPrestamo.setToolTipText("ESCOGER ARCHIVO"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAbonoPrestamo = new JButtonMe();
		this.jButtonAbrirImportacionAbonoPrestamo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAbonoPrestamo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAbonoPrestamo.setToolTipText("Generar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAbonoPrestamo.add(this.jButtonAbrirImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAbonoPrestamo = new JLabelMe();

		this.jLabelPathArchivoImportacionAbonoPrestamo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAbonoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAbonoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAbonoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYImportacion;		
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAbonoPrestamo.add(this.jLabelPathArchivoImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAbonoPrestamo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAbonoPrestamo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAbonoPrestamo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAbonoPrestamo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAbonoPrestamo.add(this.jTextFieldPathArchivoImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAbonoPrestamo = new JButtonMe();
		this.jButtonGenerarImportacionAbonoPrestamo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAbonoPrestamo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAbonoPrestamo.setToolTipText("Generar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAbonoPrestamo.add(this.jButtonGenerarImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAbonoPrestamo = new JButtonMe();
		this.jButtonCerrarImportacionAbonoPrestamo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAbonoPrestamo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAbonoPrestamo.setToolTipText("Cancelar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAbonoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsAbonoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAbonoPrestamo.add(this.jButtonCerrarImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAbonoPrestamo = new GridBagLayout();
		
		this.jScrollPanelImportacionAbonoPrestamo= new JScrollPane(jPanelImportacionAbonoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsAbonoPrestamo.gridy =iPosYImportacion;
		this.gridBagConstraintsAbonoPrestamo.gridx =iPosXImportacion;
		this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAbonoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAbonoPrestamo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAbonoPrestamo);
		this.jInternalFrameImportacionAbonoPrestamo.getContentPane().add(this.jScrollPanelImportacionAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAbonoPrestamo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAbonoPrestamo = new JButtonMe();
			this.jButtonAbrirOrderByAbonoPrestamo.setText("Orden");
			this.jButtonAbrirOrderByAbonoPrestamo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAbonoPrestamo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAbonoPrestamo";
			inputMap = this.jButtonAbrirOrderByAbonoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAbonoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAbonoPrestamo"));
		
		
			GridBagLayout gridaBagLayoutOrderByAbonoPrestamo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAbonoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAbonoPrestamo.setName("jPanelOrderByAbonoPrestamo"); 
			
			this.jPanelOrderByAbonoPrestamo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAbonoPrestamo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAbonoPrestamo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAbonoPrestamo.setLayout(gridaBagLayoutOrderByAbonoPrestamo);
			
			
			this.jTableDatosAbonoPrestamoOrderBy = new JTableMe();        
			this.jTableDatosAbonoPrestamoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAbonoPrestamoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAbonoPrestamoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAbonoPrestamoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAbonoPrestamoOrderBy.setViewportView(this.jTableDatosAbonoPrestamoOrderBy);
			this.jTableDatosAbonoPrestamoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAbonoPrestamoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAbonoPrestamo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAbonoPrestamo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAbonoPrestamo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAbonoPrestamo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAbonoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAbonoPrestamo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAbonoPrestamo.setTitle("Orden");
			this.jInternalFrameOrderByAbonoPrestamo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAbonoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAbonoPrestamo.setResizable(true);
			this.jInternalFrameOrderByAbonoPrestamo.setClosable(true);
			this.jInternalFrameOrderByAbonoPrestamo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAbonoPrestamo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAbonoPrestamo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAbonoPrestamo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAbonoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Abono Prestamos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAbonoPrestamo.gridx =iPosXOrderBy;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAbonoPrestamo.ipady =150;
				
			this.jPanelOrderByAbonoPrestamo.add(jScrollPanelDatosAbonoPrestamoOrderBy, this.gridBagConstraintsAbonoPrestamo);//this.jTableDatosAbonoPrestamoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAbonoPrestamo = new JButtonMe();
			this.jButtonCerrarOrderByAbonoPrestamo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAbonoPrestamo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAbonoPrestamo.setToolTipText("Cancelar"+" "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAbonoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAbonoPrestamo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAbonoPrestamo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAbonoPrestamo.add(this.jButtonCerrarOrderByAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAbonoPrestamo = new GridBagLayout();
			
			this.jScrollPanelOrderByAbonoPrestamo= new JScrollPane(jPanelOrderByAbonoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAbonoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsAbonoPrestamo.gridy =iPosYOrderBy;
			this.gridBagConstraintsAbonoPrestamo.gridx =iPosXOrderBy;
			this.gridBagConstraintsAbonoPrestamo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAbonoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAbonoPrestamo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAbonoPrestamo);
			
			this.jInternalFrameOrderByAbonoPrestamo.getContentPane().add(this.jScrollPanelOrderByAbonoPrestamo, this.gridBagConstraintsAbonoPrestamo);			
		
		} else {
			this.jButtonAbrirOrderByAbonoPrestamo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.abonoprestamoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAbonoPrestamo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAbonoPrestamo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAbonoPrestamo.getRowHeight();//AbonoPrestamoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.isSelected()) {
					iHeightTable=AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAbonoPrestamo.isSelected()) {
					iHeightTable=AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AbonoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAbonoPrestamo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAbonoPrestamo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAbonoPrestamo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAbonoPrestamo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAbonoPrestamo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAbonoPrestamo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAbonoPrestamo!=null && this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy()!=null) {
			//if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAbonoPrestamo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAbonoPrestamo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAbonoPrestamo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAbonoPrestamo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAbonoPrestamo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAbonoPrestamo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=abonoprestamoLogic.getAbonoPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=abonoprestamos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AbonoPrestamo> TraerAbonoPrestamoBeans(List<AbonoPrestamo> abonoprestamos,ArrayList<Classe> classes)throws Exception {
		try {
			for(AbonoPrestamo abonoprestamo:abonoprestamos) {
					
				if(!(AbonoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AbonoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					abonoprestamo.setsDetalleGeneralEntityReporte(AbonoPrestamoConstantesFunciones.getAbonoPrestamoDescripcion(abonoprestamo));
										
						
					
						
					
				} else  {
							
					//abonoprestamo.setsDetalleGeneralEntityReporte(abonoprestamo.getsDetalleGeneralEntityReporte());
										
				}
				
				//abonoprestamobeans.add(abonoprestamobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return abonoprestamos;
    }
	//PARA REPORTES FIN
}
