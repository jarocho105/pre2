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
import com.bydan.erp.nomina.util.SeguroConstantesFunciones;

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
public class SeguroJInternalFrame extends SeguroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSeguro;
	
	protected JMenuBar jmenuBarSeguro;
	
	protected JMenu jmenuSeguro;
	protected JMenu jmenuDatosSeguro;
	protected JMenu jmenuArchivoSeguro;
	protected JMenu jmenuAccionesSeguro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSeguro;	
	protected GridBagConstraints gridBagConstraintsSeguro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SeguroDetalleFormJInternalFrame jInternalFrameDetalleFormSeguro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSeguro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSeguro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public SeguroSessionBean seguroSessionBean;
		
	
	
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Seguro> seguros;		
	public List<Seguro> segurosEliminados;	
	public List<Seguro> segurosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySeguro;		
	protected JButton jButtonAbrirOrderBySeguro;
	
	
	//protected JPanel jPanelOrderBySeguro;
	//public JScrollPane jScrollPanelOrderBySeguro;	
	//protected JButton jButtonCerrarOrderBySeguro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SeguroLogic seguroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSeguro;
	public JScrollPane jScrollPanelDatosEdicionSeguro;
	public JScrollPane jScrollPanelDatosGeneralSeguro;
    
	
	
	//public JScrollPane jScrollPanelDatosSeguroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSeguro;
	//public JScrollPane jScrollPanelImportacionSeguro;
	
	
	
	protected JPanel jPanelAccionesSeguro;
	
    protected JPanel jPanelPaginacionSeguro;
    protected JPanel jPanelParametrosReportesSeguro;
	protected JPanel jPanelParametrosReportesAccionesSeguro;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Seguro;
	protected JPanel jPanelParametrosAuxiliar2Seguro;
	protected JPanel jPanelParametrosAuxiliar3Seguro;
	protected JPanel jPanelParametrosAuxiliar4Seguro;
	//protected JPanel jPanelParametrosAuxiliar5Seguro;
	
	
	
	//protected JPanel jPanelReporteDinamicoSeguro;
	//protected JPanel jPanelImportacionSeguro;
	
	
	public JTable jTableDatosSeguro;
	
	
	
	//public JTable jTableDatosSeguroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSeguro;
	protected JButton jButtonDuplicarSeguro;
	protected JButton jButtonCopiarSeguro;
	protected JButton jButtonVerFormSeguro;
	protected JButton jButtonNuevoRelacionesSeguro;
	protected JButton jButtonModificarSeguro;
	
    protected JButton jButtonGuardarCambiosTablaSeguro;
	protected JButton jButtonCerrarSeguro;
	
	
	protected JButton jButtonRecargarInformacionSeguro;
	protected JButton jButtonProcesarInformacionSeguro;
	
	
	protected JButton jButtonAnterioresSeguro;
	protected JButton jButtonSiguientesSeguro;
	protected JButton jButtonNuevoGuardarCambiosSeguro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSeguro;
	//protected JButton jButtonCerrarReporteDinamicoSeguro;
	//protected JButton jButtonGenerarExcelReporteDinamicoSeguro;	
	
	
	
	//protected JButton jButtonAbrirImportacionSeguro;
	//protected JButton jButtonGenerarImportacionSeguro;
	//protected JButton jButtonCerrarImportacionSeguro;
	//protected JFileChooser jFileChooserImportacionSeguro;
	//protected File fileImportacionSeguro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSeguro;
	protected JButton jButtonDuplicarToolBarSeguro;
	protected JButton jButtonNuevoRelacionesToolBarSeguro;
	
	
	public JButton jButtonGuardarCambiosToolBarSeguro;
	protected JButton jButtonCopiarToolBarSeguro;
	protected JButton jButtonVerFormToolBarSeguro;
	public JButton jButtonGuardarCambiosTablaToolBarSeguro;
	protected JButton jButtonMostrarOcultarTablaToolBarSeguro;
	protected JButton jButtonCerrarToolBarSeguro;
	
	protected JButton jButtonRecargarInformacionToolBarSeguro;
	protected JButton jButtonProcesarInformacionToolBarSeguro;
	protected JButton jButtonAnterioresToolBarSeguro;
	protected JButton jButtonSiguientesToolBarSeguro;
	protected JButton jButtonNuevoGuardarCambiosToolBarSeguro;
	protected JButton jButtonAbrirOrderByToolBarSeguro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSeguro;
	protected JMenuItem jMenuItemDuplicarSeguro;
	protected JMenuItem jMenuItemNuevoRelacionesSeguro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSeguro;
	protected JMenuItem jMenuItemCopiarSeguro;
	protected JMenuItem jMenuItemVerFormSeguro;
	protected JMenuItem jMenuItemGuardarCambiosTablaSeguro;
	protected JMenuItem jMenuItemCerrarSeguro;
	protected JMenuItem jMenuItemDetalleCerrarSeguro;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySeguro;
	protected JMenuItem jMenuItemDetalleMostarOcultarSeguro;
	
	protected JMenuItem jMenuItemRecargarInformacionSeguro;
	protected JMenuItem jMenuItemProcesarInformacionSeguro;
	protected JMenuItem jMenuItemAnterioresSeguro;
	protected JMenuItem jMenuItemSiguientesSeguro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSeguro;
	protected JMenuItem jMenuItemAbrirOrderBySeguro;
	protected JMenuItem jMenuItemMostrarOcultarSeguro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSeguro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSeguro;
	protected JCheckBox jCheckBoxSeleccionadosSeguro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSeguro;
	protected JCheckBox jCheckBoxConGraficoReporteSeguro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSeguro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSeguro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSeguro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSeguro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSeguro;
	protected JTextField jTextFieldValorCampoGeneralSeguro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSeguro;
	//public JList<Reporte> jListColumnasSelectReporteSeguro;
	//public JScrollPane jScrollColumnasSelectReporteSeguro;
	
	//public JLabel jLabelRelacionesSelectReporteSeguro;
	//public JList<Reporte> jListRelacionesSelectReporteSeguro;
	//public JScrollPane jScrollRelacionesSelectReporteSeguro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSeguro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSeguro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSeguro;
	//public JLabel jLabelTiposArchivoReporteDinamicoSeguro;
	
		
	//public JLabel jLabelArchivoImportacionSeguro;	
	//public JLabel jLabelPathArchivoImportacionSeguro;
	//protected JTextField jTextFieldPathArchivoImportacionSeguro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSeguro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSeguro;
	
	//public JLabel jLabelColumnaCategoriaValorSeguro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSeguro;
	
	//public JLabel jLabelColumnasValoresGraficoSeguro;
	//public JList<Reporte> jListColumnasValoresGraficoSeguro;
	//public JScrollPane jScrollColumnasValoresGraficoSeguro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSeguro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSeguro;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSeguro;
	public JPanel jPanelFK_IdEmpleadoSeguro;
	public JButton jButtonFK_IdEmpleadoSeguro;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoSeguro;
	public JLabel jLabelid_empleadoFK_IdEmpleadoSeguro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoSeguro;
	public JButton jButtonid_empleadoFK_IdEmpleadoSeguro= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSeguroUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSeguroBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoSeguro;
	
	
	
	
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
	public SeguroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSeguro)	{
		this.jButtonRecargarInformacionSeguro = jButtonRecargarInformacionSeguro;
	}
	
	public JButton getjButtonProcesarInformacionSeguro() {
		return this.jButtonProcesarInformacionSeguro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSeguro)	{
		this.jButtonProcesarInformacionSeguro = jButtonProcesarInformacionSeguro;
	}
	
	
	public JButton getjButtonRecargarInformacionSeguro() {
		return this.jButtonRecargarInformacionSeguro;
	}
	
	
	public List<Seguro> getseguros() {
		return this.seguros;
	}

	public void setseguros(List<Seguro> seguros) {
		this.seguros = seguros;
	}
	
	public List<Seguro> getsegurosAux() {
		return this.segurosAux;
	}

	public void setsegurosAux(List<Seguro> segurosAux) {
		this.segurosAux = segurosAux;
	}
	
	public List<Seguro> getsegurosEliminados() {
		return this.segurosEliminados;
	}

	public void setSegurosEliminados(List<Seguro> segurosEliminados) {
		this.segurosEliminados = segurosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSeguro() {
		return jComboBoxTiposSeleccionarSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSeguro(
			JComboBox jComboBoxTiposSeleccionarSeguro) {
		this.jComboBoxTiposSeleccionarSeguro = jComboBoxTiposSeleccionarSeguro;
	}
	
	public void setBorderResaltarTiposSeleccionarSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSeguro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSeguro() {
		return jTextFieldValorCampoGeneralSeguro;
	}

	public void setjTextFieldValorCampoGeneralSeguro(
			JTextField jTextFieldValorCampoGeneralSeguro) {
		this.jTextFieldValorCampoGeneralSeguro = jTextFieldValorCampoGeneralSeguro;
	}

	public void setBorderResaltarValorCampoGeneralSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSeguro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSeguro() {
		return this.jCheckBoxSeleccionarTodosSeguro;
	}

	public void setjCheckBoxSeleccionarTodosSeguro(
			JCheckBox jCheckBoxSeleccionarTodosSeguro) {
		this.jCheckBoxSeleccionarTodosSeguro = jCheckBoxSeleccionarTodosSeguro;
	}

	public void setBorderResaltarSeleccionarTodosSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSeguro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSeguro() {
		return this.jCheckBoxSeleccionadosSeguro;
	}

	public void setjCheckBoxSeleccionadosSeguro(
			JCheckBox jCheckBoxSeleccionadosSeguro) {
		this.jCheckBoxSeleccionadosSeguro = jCheckBoxSeleccionadosSeguro;
	}
	
	public void setBorderResaltarSeleccionadosSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSeguro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSeguro() {
		return this.jComboBoxTiposArchivosReportesSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSeguro(
			JComboBox jComboBoxTiposArchivosReportesSeguro) {
		this.jComboBoxTiposArchivosReportesSeguro = jComboBoxTiposArchivosReportesSeguro;
	}

	public void setBorderResaltarTiposArchivosReportesSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSeguro() {
		return this.jComboBoxTiposReportesSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSeguro(
			JComboBox jComboBoxTiposReportesSeguro) {
		this.jComboBoxTiposReportesSeguro = jComboBoxTiposReportesSeguro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSeguro() {
	//	return jComboBoxTiposReportesDinamicoSeguro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSeguro(
	//		JComboBox jComboBoxTiposReportesDinamicoSeguro) {
	//	this.jComboBoxTiposReportesDinamicoSeguro = jComboBoxTiposReportesDinamicoSeguro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSeguro() {
	//	return jComboBoxTiposArchivosReportesDinamicoSeguro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSeguro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSeguro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSeguro = jComboBoxTiposArchivosReportesDinamicoSeguro;
	//}
	
	public void setBorderResaltarTiposReportesSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSeguro() {
		return this.jComboBoxTiposGraficosReportesSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSeguro(
			JComboBox jComboBoxTiposGraficosReportesSeguro) {
		this.jComboBoxTiposGraficosReportesSeguro = jComboBoxTiposGraficosReportesSeguro;
	}
	
	public void setBorderResaltarTiposGraficosReportesSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSeguro() {
		return this.jComboBoxTiposPaginacionSeguro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSeguro(
			JComboBox jComboBoxTiposPaginacionSeguro) {
		this.jComboBoxTiposPaginacionSeguro = jComboBoxTiposPaginacionSeguro;
	}
	
	public void setBorderResaltarTiposPaginacionSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSeguro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSeguro() {
		return this.jComboBoxTiposRelacionesSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSeguro() {
		return this.jComboBoxTiposAccionesSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSeguro(
			JComboBox jComboBoxTiposRelacionesSeguro) {
		this.jComboBoxTiposRelacionesSeguro = jComboBoxTiposRelacionesSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSeguro(
			JComboBox jComboBoxTiposAccionesSeguro) {
		this.jComboBoxTiposAccionesSeguro = jComboBoxTiposAccionesSeguro;
	}
	
	public void setBorderResaltarTiposRelacionesSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSeguro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSeguro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSeguro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSeguro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSeguro() {
	//	return jCheckBoxConGraficoDinamicoSeguro;
	//}

	//public void setjCheckBoxConGraficoDinamicoSeguro(
	//		JCheckBox jCheckBoxConGraficoDinamicoSeguro) {
	//	this.jCheckBoxConGraficoDinamicoSeguro = jCheckBoxConGraficoDinamicoSeguro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSeguro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSeguro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSeguro .setBorder(borderResaltar);		
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
		this.seguroSessionBean=new SeguroSessionBean();
		
		this.seguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.seguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.seguroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SeguroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SeguroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SeguroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Seguro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
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
		
		SeguroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSeguro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSeguro,this.jTtoolBarSeguro,
							"nuevo","nuevo","Nuevo"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSeguro,this.jTtoolBarSeguro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSeguro,this.jTtoolBarSeguro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSeguro,this.jTtoolBarSeguro,
							"duplicar","duplicar","Duplicar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSeguro,this.jTtoolBarSeguro,
							"copiar","copiar","Copiar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSeguro,this.jTtoolBarSeguro,
							"ver_form","ver_form","Ver"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSeguro,this.jTtoolBarSeguro,
							"recargar","recargar","Recargar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSeguro,this.jTtoolBarSeguro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSeguro,this.jTtoolBarSeguro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSeguro,this.jTtoolBarSeguro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSeguro,this.jTtoolBarSeguro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSeguro,this.jTtoolBarSeguro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSeguro,this.jTtoolBarSeguro,
							"cerrar","cerrar","Salir"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSeguro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSeguro;
			
				this.jButtonProcesarInformacionToolBarSeguro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSeguro;
				
		//protected JButton jButtonModificarToolBarSeguro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSeguro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSeguro=new JMenuMe("General");
		this.jmenuArchivoSeguro=new JMenuMe("Archivo");
		this.jmenuAccionesSeguro=new JMenuMe("Acciones");
		this.jmenuDatosSeguro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSeguro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSeguro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSeguro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSeguro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSeguro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSeguro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSeguro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSeguro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSeguro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSeguro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSeguro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSeguro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSeguro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSeguro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSeguro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSeguro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSeguro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSeguro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSeguro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSeguro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSeguro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSeguro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSeguro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSeguro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSeguro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSeguro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSeguro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSeguro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSeguro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSeguro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSeguro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSeguro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSeguro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSeguro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSeguro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSeguro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySeguro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySeguro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySeguro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSeguro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySeguro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySeguro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySeguro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSeguro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSeguro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSeguro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSeguro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSeguro.add(this.jMenuItemCerrarSeguro);
			
			this.jmenuAccionesSeguro.add(this.jMenuItemNuevoSeguro);
			this.jmenuAccionesSeguro.add(this.jMenuItemNuevoGuardarCambiosSeguro);
			this.jmenuAccionesSeguro.add(this.jMenuItemNuevoRelacionesSeguro);
			this.jmenuAccionesSeguro.add(this.jMenuItemGuardarCambiosTablaSeguro);		
			this.jmenuAccionesSeguro.add(this.jMenuItemDuplicarSeguro);		
			this.jmenuAccionesSeguro.add(this.jMenuItemCopiarSeguro);		
			this.jmenuAccionesSeguro.add(this.jMenuItemVerFormSeguro);		
			
			this.jmenuDatosSeguro.add(this.jMenuItemRecargarInformacionSeguro);				
			this.jmenuDatosSeguro.add(this.jMenuItemAnterioresSeguro);				
			this.jmenuDatosSeguro.add(this.jMenuItemSiguientesSeguro);				
			this.jmenuDatosSeguro.add(this.jMenuItemAbrirOrderBySeguro);				
			this.jmenuDatosSeguro.add(this.jMenuItemMostrarOcultarSeguro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSeguro.add(this.jMenuItemGuardarCambiosSeguro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSeguro.add(this.jmenuArchivoSeguro);		
			this.jmenuBarSeguro.add(this.jmenuAccionesSeguro);		
			this.jmenuBarSeguro.add(this.jmenuDatosSeguro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSeguro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSeguro() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoSeguro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoSeguro.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoSeguro= new JButtonMe();
		this.jButtonFK_IdEmpleadoSeguro.setText("Buscar");
		this.jButtonFK_IdEmpleadoSeguro.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoSeguro,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoSeguro = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoSeguro.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoSeguro.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoSeguro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoSeguro= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoSeguro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.setFocusable(false);


		this.jTabbedPaneBusquedasSeguro=new JTabbedPane();


		this.jTabbedPaneBusquedasSeguro.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSeguro.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSeguro.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSeguro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSeguro,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSeguro = new SeguroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Seguro DATOS");
			this.jInternalFrameDetalleFormSeguro = new SeguroDetalleFormJInternalFrame(jDesktopPane,this.seguroSessionBean.getConGuardarRelaciones(),this.seguroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSeguro = null;//new SeguroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSeguro= new GridBagLayout();
		
		
		this.jTableDatosSeguro = new JTableMe();      
		
		String sToolTipSeguro="";
		sToolTipSeguro=SeguroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSeguro+="(Nomina.Seguro)";
		}
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			sToolTipSeguro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSeguro.setToolTipText(sToolTipSeguro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSeguro);
		this.jTableDatosSeguro.setAutoCreateRowSorter(true);
		this.jTableDatosSeguro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSeguro.setRowSelectionAllowed(true);
		this.jTableDatosSeguro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSeguro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSeguro = new JButtonMe();
		this.jButtonDuplicarSeguro = new JButtonMe();
		this.jButtonCopiarSeguro = new JButtonMe();
		this.jButtonVerFormSeguro = new JButtonMe();
		this.jButtonNuevoRelacionesSeguro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSeguro = new JButtonMe();
		this.jButtonCerrarSeguro = new JButtonMe();
		
		this.jScrollPanelDatosSeguro = new JScrollPane();   
        this.jScrollPanelDatosGeneralSeguro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Seguro";
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguros" + this.sPath));
		} else {
			this.jScrollPanelDatosSeguro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSeguro.setToolTipText("Acciones");
        this.jPanelAccionesSeguro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSeguro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSeguro=new ReporteDinamicoJInternalFrame(SeguroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSeguro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSeguro=new ImportacionJInternalFrame(SeguroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSeguro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySeguro = new JButtonMe();
		
		this.jButtonAbrirOrderBySeguro.setText("Orden");
		this.jButtonAbrirOrderBySeguro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySeguro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguro,false,this);
			
			//this.cargarOrderBySeguro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguro,true,this);
			
			//this.cargarOrderBySeguro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSeguro.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosSeguro.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosSeguro.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosSeguro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSeguro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSeguro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSeguro.setText("Nuevo");
		this.jButtonDuplicarSeguro.setText("Duplicar");
		this.jButtonCopiarSeguro.setText("Copiar");
		this.jButtonVerFormSeguro.setText("Ver");
		this.jButtonNuevoRelacionesSeguro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSeguro.setText("Guardar");
		this.jButtonCerrarSeguro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSeguro,"nuevo_button","Nuevo",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSeguro,"duplicar_button","Duplicar",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSeguro,"copiar_button","Copiar",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSeguro,"ver_form","Ver",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSeguro,"nuevorelaciones_button","Nuevo Rel",this.seguroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSeguro,"guardarcambiostabla_button","Guardar",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSeguro,"cerrar_button","Salir",this.seguroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSeguro.setToolTipText("Nuevo"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSeguro.setToolTipText("Duplicar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSeguro.setToolTipText("Copiar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSeguro.setToolTipText("Ver"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSeguro.setToolTipText("Nuevo Rel"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSeguro.setToolTipText("Guardar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSeguro.setToolTipText("Salir"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSeguro";
		inputMap = this.jButtonNuevoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSeguro"));
		
		//DUPLICAR
		sMapKey = "DuplicarSeguro";
		inputMap = this.jButtonDuplicarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSeguro"));
		
		//COPIAR
		sMapKey = "CopiarSeguro";
		inputMap = this.jButtonCopiarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSeguro"));
		
		//VEr FORM
		sMapKey = "VerFormSeguro";
		inputMap = this.jButtonVerFormSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSeguro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSeguro";
		inputMap = this.jButtonNuevoRelacionesSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSeguro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSeguro";
		inputMap = this.jButtonModificarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSeguro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSeguro";
		inputMap = this.jButtonCerrarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSeguro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSeguro";
		inputMap = this.jButtonGuardarCambiosTablaSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSeguro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Seguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Seguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Seguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Seguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Seguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSeguro.setName("jPanelParametrosReportesSeguro"); 
		
		this.jPanelParametrosReportesAccionesSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSeguro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSeguro.setName("jPanelParametrosReportesAccionesSeguro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSeguro = new JButtonMe();
		this.jButtonRecargarInformacionSeguro.setText("Recargar");
		this.jButtonRecargarInformacionSeguro.setToolTipText("Recargar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSeguro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSeguro = new JButtonMe();
		this.jButtonProcesarInformacionSeguro.setText("Procesar");
		this.jButtonProcesarInformacionSeguro.setToolTipText("Procesar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSeguro.setVisible(false);
			
		this.jButtonProcesarInformacionSeguro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSeguro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSeguro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSeguro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSeguro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSeguro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSeguro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSeguro.setText("TIPO");       
		this.jComboBoxTiposReportesSeguro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSeguro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSeguro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSeguro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSeguro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSeguro.setText("Paginacion");
		this.jComboBoxTiposPaginacionSeguro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSeguro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSeguro.setText("Accion");
		this.jComboBoxTiposRelacionesSeguro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSeguro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSeguro.setText("Accion");
		this.jComboBoxTiposAccionesSeguro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSeguro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSeguro.setText("Accion");
		this.jComboBoxTiposSeleccionarSeguro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSeguro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSeguro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSeguro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSeguro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSeguro = new JLabelMe();
		
		this.jLabelAccionesSeguro.setText("Acciones");		
		this.jLabelAccionesSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSeguro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSeguro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSeguro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSeguro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSeguro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSeguro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSeguro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSeguro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSeguro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSeguro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSeguro.setText("Graf.");
		this.jCheckBoxConGraficoReporteSeguro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSeguro = new JButtonMe();
		//this.jButtonAnterioresSeguro.setText("<<");
        this.jButtonAnterioresSeguro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSeguro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSeguro = new JButtonMe();
		//this.jButtonSiguientesSeguro.setText(">>");
        this.jButtonSiguientesSeguro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSeguro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSeguro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSeguro.setText("Nue");
        this.jButtonNuevoGuardarCambiosSeguro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSeguro,"nuevoguardarcambios_button","Nue",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSeguro";
		inputMap = this.jButtonNuevoGuardarCambiosSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSeguro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSeguro";
		inputMap = this.jButtonRecargarInformacionSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSeguro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSeguro";
		inputMap = this.jButtonSiguientesSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSeguro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSeguro";
		inputMap = this.jButtonAnterioresSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSeguro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSeguro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSeguro.setMinimumSize(new Dimension(this.getWidth(),SeguroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SeguroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSeguro.setMaximumSize(new Dimension(this.getWidth(),SeguroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SeguroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSeguro.setPreferredSize(new Dimension(this.getWidth(),SeguroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SeguroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSeguro = new GridBagLayout();

			this.jPanelPaginacionSeguro.setLayout(gridaBagLayoutPaginacionSeguro);						
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 0;
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSeguro.add(this.jButtonAnterioresSeguro, this.gridBagConstraintsSeguro);
					
						
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSeguro.gridy = 0;
			
			this.jPanelPaginacionSeguro.add(this.jButtonNuevoGuardarCambiosSeguro, this.gridBagConstraintsSeguro);
						
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSeguro.gridy = 0;
			this.jPanelPaginacionSeguro.add(this.jButtonSiguientesSeguro, this.gridBagConstraintsSeguro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 1;
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguro.add(this.jButtonNuevoSeguro, this.gridBagConstraintsSeguro);
						
			
			
			if(!this.seguroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSeguro = new GridBagConstraints();
				this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSeguro.gridy = 1;
				this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSeguro.add(this.jButtonGuardarCambiosTablaSeguro, this.gridBagConstraintsSeguro);
			}
			
			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 1;
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguro.add(this.jButtonDuplicarSeguro, this.gridBagConstraintsSeguro);
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 1;
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguro.add(this.jButtonCopiarSeguro, this.gridBagConstraintsSeguro);
		
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 1;
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSeguro.add(this.jButtonVerFormSeguro, this.gridBagConstraintsSeguro);
		
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 1;
			this.gridBagConstraintsSeguro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSeguro.add(this.jButtonCerrarSeguro, this.gridBagConstraintsSeguro);
		
		
		
		this.jButtonRecargarInformacionSeguro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSeguro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSeguro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSeguro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSeguro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSeguro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSeguro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSeguro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSeguro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSeguro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSeguro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSeguro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSeguro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSeguro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSeguro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSeguro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSeguro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSeguro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSeguro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSeguro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSeguro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSeguro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSeguro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSeguro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSeguro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSeguro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSeguro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSeguro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSeguro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSeguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSeguro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Seguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Seguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Seguro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Seguro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSeguro.setLayout(gridaBagParametrosReportesSeguro);
			this.jPanelParametrosReportesAccionesSeguro.setLayout(gridaBagParametrosReportesAccionesSeguro);
			
			
			this.jPanelParametrosAuxiliar1Seguro.setLayout(gridaBagParametrosAuxiliar1Seguro);
			this.jPanelParametrosAuxiliar2Seguro.setLayout(gridaBagParametrosAuxiliar2Seguro);
			this.jPanelParametrosAuxiliar3Seguro.setLayout(gridaBagParametrosAuxiliar3Seguro);
			this.jPanelParametrosAuxiliar4Seguro.setLayout(gridaBagParametrosAuxiliar4Seguro);
			//this.jPanelParametrosAuxiliar5Seguro.setLayout(gridaBagParametrosAuxiliar2Seguro);			
			
			
			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguro.add(this.jButtonRecargarInformacionSeguro, this.gridBagConstraintsSeguro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Seguro.add(this.jComboBoxTiposPaginacionSeguro, this.gridBagConstraintsSeguro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Seguro.add(this.jCheckBoxConAltoMaximoTablaSeguro, this.gridBagConstraintsSeguro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Seguro.add(this.jComboBoxTiposArchivosReportesSeguro, this.gridBagConstraintsSeguro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguro.add(this.jPanelParametrosAuxiliar1Seguro, this.gridBagConstraintsSeguro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSeguro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Seguro.add(this.jComboBoxTiposReportesSeguro, this.gridBagConstraintsSeguro);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguro.add(this.jPanelParametrosAuxiliar4Seguro, this.gridBagConstraintsSeguro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguro.add(this.jComboBoxTiposReportesSeguro, this.gridBagConstraintsSeguro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSeguro.add(this.jCheckBoxGenerarReporteSeguro, this.gridBagConstraintsSeguro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguro.add(this.jPanelParametrosAuxiliar2Seguro, this.gridBagConstraintsSeguro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSeguro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSeguro.add(this.jLabelAccionesSeguro, this.gridBagConstraintsSeguro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSeguro = new GridBagConstraints();
				this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSeguro.add(this.jButtonAbrirOrderBySeguro, this.gridBagConstraintsSeguro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguro.add(this.jComboBoxTiposSeleccionarSeguro, this.gridBagConstraintsSeguro);			
			
			
			/*
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSeguro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSeguro.add(this.jCheckBoxSeleccionarTodosSeguro, this.gridBagConstraintsSeguro);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSeguro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Seguro.add(this.jCheckBoxSeleccionarTodosSeguro, this.gridBagConstraintsSeguro);															
				
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSeguro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Seguro.add(this.jCheckBoxSeleccionadosSeguro, this.gridBagConstraintsSeguro);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSeguro.add(this.jPanelParametrosAuxiliar3Seguro, this.gridBagConstraintsSeguro);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguro.add(this.jComboBoxTiposAccionesSeguro, this.gridBagConstraintsSeguro);
	
				
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSeguro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSeguro.add(this.jTextFieldValorCampoGeneralSeguro, this.gridBagConstraintsSeguro);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSeguro = new GridBagLayout();

			this.jScrollPanelDatosSeguro.setLayout(gridaBagLayoutDatosSeguro);
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = 0;
			this.gridBagConstraintsSeguro.gridx = 0;
			
			this.jScrollPanelDatosSeguro.add(this.jTableDatosSeguro, this.gridBagConstraintsSeguro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSeguro.setViewportView(this.jTableDatosSeguro);
		this.jTableDatosSeguro.setFillsViewportHeight(true);
		this.jTableDatosSeguro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSeguro= new GridBagLayout();
		this.jPanelAccionesSeguro.setLayout(gridaBagLayoutAccionesSeguro);
		
		
		/*	
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = 0;
		this.gridBagConstraintsSeguro.gridx = 0;
			
		this.jPanelAccionesSeguro.add(this.jButtonNuevoSeguro, this.gridBagConstraintsSeguro);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoSeguro= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoSeguro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSeguro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSeguro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoSeguro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoSeguro.setLayout(gridaBagLayoutFK_IdEmpleadoSeguro);

		gridBagConstraintsSeguro = new GridBagConstraints();
		gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSeguro.gridy = 0;
		gridBagConstraintsSeguro.gridx = 0;
		jPanelFK_IdEmpleadoSeguro.add(jLabelid_empleadoFK_IdEmpleadoSeguro, gridBagConstraintsSeguro);

		gridBagConstraintsSeguro = new GridBagConstraints();
		gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSeguro.gridy = 0;
		gridBagConstraintsSeguro.gridx = 1;
		jPanelFK_IdEmpleadoSeguro.add(jComboBoxid_empleadoFK_IdEmpleadoSeguro, gridBagConstraintsSeguro);


		gridBagConstraintsSeguro = new GridBagConstraints();
		gridBagConstraintsSeguro.anchor = GridBagConstraints.EAST;
		gridBagConstraintsSeguro.fill = GridBagConstraints.NONE;
		gridBagConstraintsSeguro.gridy = 0;
		gridBagConstraintsSeguro.gridx = 0;
		jPanelFK_IdEmpleadoSeguro.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro, gridBagConstraintsSeguro);

		gridBagConstraintsSeguro = new GridBagConstraints();
		gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSeguro.gridy = 1;
		gridBagConstraintsSeguro.gridx =1;
		jPanelFK_IdEmpleadoSeguro.add(jButtonFK_IdEmpleadoSeguro, gridBagConstraintsSeguro);

		jTabbedPaneBusquedasSeguro.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoSeguro);
		jTabbedPaneBusquedasSeguro.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSeguro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSeguro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.seguroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSeguro = new GridBagConstraints();						
			this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSeguro.gridx = 0;		
			//this.gridBagConstraintsSeguro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSeguro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSeguro, this.gridBagConstraintsSeguro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSeguro.gridx = 0;		
		//this.gridBagConstraintsSeguro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSeguro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSeguro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSeguro.gridx = 0;		
			this.gridBagConstraintsSeguro.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSeguro.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSeguro, this.gridBagConstraintsSeguro);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSeguro, this.gridBagConstraintsSeguro);								
		
		
		/*
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSeguro, this.gridBagConstraintsSeguro);
		*/		
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSeguro.gridx =0;
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSeguro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSeguro, this.gridBagConstraintsSeguro);
				
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSeguro, this.gridBagConstraintsSeguro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SeguroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSeguro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSeguro = new GridBagLayout();
			this.jPanelBusquedasParametrosSeguro.setLayout(gridaBagLayoutBusquedasParametrosSeguro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSeguro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSeguro, this.gridBagConstraintsSeguro);
			
			
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSeguro, this.gridBagConstraintsSeguro);
		
			
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSeguro, this.gridBagConstraintsSeguro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSeguro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSeguro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSeguro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSeguro.setName("jPanelReporteDinamicoSeguro"); 
		
		this.jPanelReporteDinamicoSeguro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSeguro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSeguro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSeguro.setLayout(gridaBagLayoutReporteDinamicoSeguro);
		
		
		this.jInternalFrameReporteDinamicoSeguro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSeguro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSeguro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSeguro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSeguro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSeguro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSeguro.setResizable(true);
	    this.jInternalFrameReporteDinamicoSeguro.setClosable(true);
	    this.jInternalFrameReporteDinamicoSeguro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSeguro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSeguro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSeguro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSeguro = new JLabelMe();

		this.jLabelColumnasSelectReporteSeguro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSeguro.add(this.jLabelColumnasSelectReporteSeguro, this.gridBagConstraintsSeguro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSeguro = new JList<Reporte>();
		this.jListColumnasSelectReporteSeguro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSeguro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSeguro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSeguro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSeguro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSeguro=new JScrollPane(this.jListColumnasSelectReporteSeguro);
			
			this.jScrollColumnasSelectReporteSeguro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSeguro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSeguro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSeguro.add(this.jListColumnasSelectReporteSeguro, this.gridBagConstraintsSeguro);
		this.jPanelReporteDinamicoSeguro.add(this.jScrollColumnasSelectReporteSeguro, this.gridBagConstraintsSeguro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSeguro = new JLabelMe();

		this.jLabelRelacionesSelectReporteSeguro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSeguro = new JList<Reporte>();
		this.jListRelacionesSelectReporteSeguro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSeguro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSeguro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSeguro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSeguro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSeguro=new JScrollPane(this.jListRelacionesSelectReporteSeguro);
			
			this.jScrollRelacionesSelectReporteSeguro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSeguro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSeguro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSeguro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSeguro = new JComboBoxMe();
		this.jListColumnasValoresGraficoSeguro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSeguro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSeguro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSeguro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSeguro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSeguro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSeguro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSeguro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSeguro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSeguro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSeguro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSeguro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSeguro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSeguro.add(this.jLabelGenerarExcelReporteDinamicoSeguro, this.gridBagConstraintsSeguro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSeguro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSeguro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSeguro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSeguro.setToolTipText("Generar EXCEL"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSeguro = new GridBagConstraints();
		//this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSeguro.add(this.jButtonGenerarExcelReporteDinamicoSeguro, this.gridBagConstraintsSeguro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguro.add(this.jComboBoxTiposReportesDinamicoSeguro, this.gridBagConstraintsSeguro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSeguro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSeguro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSeguro.add(this.jLabelTiposArchivoReporteDinamicoSeguro, this.gridBagConstraintsSeguro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguro.add(this.jComboBoxTiposArchivosReportesDinamicoSeguro, this.gridBagConstraintsSeguro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSeguro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSeguro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSeguro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSeguro.setToolTipText("Generar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguro.add(this.jButtonGenerarReporteDinamicoSeguro, this.gridBagConstraintsSeguro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSeguro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSeguro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSeguro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSeguro.setToolTipText("Cancelar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSeguro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSeguro.add(this.jButtonCerrarReporteDinamicoSeguro, this.gridBagConstraintsSeguro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSeguro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSeguro= new JScrollPane(jPanelReporteDinamicoSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSeguro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSeguro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSeguro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSeguro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSeguro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSeguro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSeguro);
		this.jInternalFrameReporteDinamicoSeguro.getContentPane().add(this.jScrollPanelReporteDinamicoSeguro, this.gridBagConstraintsSeguro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSeguro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSeguro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSeguro.setName("jPanelImportacionSeguro"); 
		
		this.jPanelImportacionSeguro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSeguro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSeguro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSeguro.setLayout(gridaBagLayoutImportacionSeguro);
		
		
		this.jInternalFrameImportacionSeguro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSeguro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSeguro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSeguro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSeguro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSeguro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSeguro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSeguro.setResizable(true);
	    this.jInternalFrameImportacionSeguro.setClosable(true);
	    this.jInternalFrameImportacionSeguro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSeguro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSeguro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSeguro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSeguro.setResizable(true);
	    this.jInternalFrameImportacionSeguro.setClosable(true);
	    this.jInternalFrameImportacionSeguro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSeguro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSeguro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSeguro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSeguro = new JLabelMe();

		this.jLabelArchivoImportacionSeguro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = iPosYImportacion;		
		this.gridBagConstraintsSeguro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSeguro.add(this.jLabelArchivoImportacionSeguro, this.gridBagConstraintsSeguro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSeguro = new JFileChooser();		
		this.jFileChooserImportacionSeguro.setToolTipText("ESCOGER ARCHIVO"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSeguro = new JButtonMe();
		this.jButtonAbrirImportacionSeguro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSeguro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSeguro.setToolTipText("Generar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguro.add(this.jButtonAbrirImportacionSeguro, this.gridBagConstraintsSeguro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSeguro = new JLabelMe();

		this.jLabelPathArchivoImportacionSeguro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = iPosYImportacion;		
		this.gridBagConstraintsSeguro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSeguro.add(this.jLabelPathArchivoImportacionSeguro, this.gridBagConstraintsSeguro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSeguro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSeguro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSeguro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSeguro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguro.add(this.jTextFieldPathArchivoImportacionSeguro, this.gridBagConstraintsSeguro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSeguro = new JButtonMe();
		this.jButtonGenerarImportacionSeguro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSeguro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSeguro.setToolTipText("Generar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguro.add(this.jButtonGenerarImportacionSeguro, this.gridBagConstraintsSeguro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSeguro = new JButtonMe();
		this.jButtonCerrarImportacionSeguro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSeguro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSeguro.setToolTipText("Cancelar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = iPosYImportacion;
		this.gridBagConstraintsSeguro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSeguro.add(this.jButtonCerrarImportacionSeguro, this.gridBagConstraintsSeguro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSeguro = new GridBagLayout();
		
		this.jScrollPanelImportacionSeguro= new JScrollPane(jPanelImportacionSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy =iPosYImportacion;
		this.gridBagConstraintsSeguro.gridx =iPosXImportacion;
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSeguro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSeguro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSeguro);
		this.jInternalFrameImportacionSeguro.getContentPane().add(this.jScrollPanelImportacionSeguro, this.gridBagConstraintsSeguro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySeguro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySeguro = new JButtonMe();
			this.jButtonAbrirOrderBySeguro.setText("Orden");
			this.jButtonAbrirOrderBySeguro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySeguro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySeguro";
			inputMap = this.jButtonAbrirOrderBySeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySeguro"));
		
		
			GridBagLayout gridaBagLayoutOrderBySeguro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySeguro.setName("jPanelOrderBySeguro"); 
			
			this.jPanelOrderBySeguro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySeguro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySeguro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySeguro.setLayout(gridaBagLayoutOrderBySeguro);
			
			
			this.jTableDatosSeguroOrderBy = new JTableMe();        
			this.jTableDatosSeguroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSeguroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSeguroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSeguroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSeguroOrderBy.setViewportView(this.jTableDatosSeguroOrderBy);
			this.jTableDatosSeguroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSeguroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySeguro= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySeguro= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySeguro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSeguro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySeguro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySeguro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySeguro.setTitle("Orden");
			this.jInternalFrameOrderBySeguro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySeguro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySeguro.setResizable(true);
			this.jInternalFrameOrderBySeguro.setClosable(true);
			this.jInternalFrameOrderBySeguro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySeguro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySeguro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySeguro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSeguro.gridx =iPosXOrderBy;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSeguro.ipady =150;
				
			this.jPanelOrderBySeguro.add(jScrollPanelDatosSeguroOrderBy, this.gridBagConstraintsSeguro);//this.jTableDatosSeguroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySeguro = new JButtonMe();
			this.jButtonCerrarOrderBySeguro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySeguro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySeguro.setToolTipText("Cancelar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSeguro.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySeguro.add(this.jButtonCerrarOrderBySeguro, this.gridBagConstraintsSeguro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSeguro = new GridBagLayout();
			
			this.jScrollPanelOrderBySeguro= new JScrollPane(jPanelOrderBySeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy =iPosYOrderBy;
			this.gridBagConstraintsSeguro.gridx =iPosXOrderBy;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySeguro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySeguro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSeguro);
			
			this.jInternalFrameOrderBySeguro.getContentPane().add(this.jScrollPanelOrderBySeguro, this.gridBagConstraintsSeguro);			
		
		} else {
			this.jButtonAbrirOrderBySeguro = new JButtonMe();
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
			&& this.seguroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSeguro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSeguro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSeguro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSeguro.getRowHeight();//SeguroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSeguro.isSelected()) {
					iHeightTable=SeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSeguro.isSelected()) {
					iHeightTable=SeguroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SeguroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSeguro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSeguro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSeguro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSeguro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSeguro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSeguro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySeguro!=null && this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy()!=null) {
			//if(!this.seguroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySeguro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySeguro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySeguro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSeguro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSeguro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSeguro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=seguroLogic.getSeguros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=seguros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Seguro> TraerSeguroBeans(List<Seguro> seguros,ArrayList<Classe> classes)throws Exception {
		try {
			for(Seguro seguro:seguros) {
					
				if(!(SeguroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SeguroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					seguro.setsDetalleGeneralEntityReporte(SeguroConstantesFunciones.getSeguroDescripcion(seguro));
										
						
					
						
					
				} else  {
							
					//seguro.setsDetalleGeneralEntityReporte(seguro.getsDetalleGeneralEntityReporte());
										
				}
				
				//segurobeans.add(segurobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return seguros;
    }
	//PARA REPORTES FIN
}
