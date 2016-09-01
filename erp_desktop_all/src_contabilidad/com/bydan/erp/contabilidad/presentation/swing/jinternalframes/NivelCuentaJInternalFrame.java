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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.NivelCuentaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class NivelCuentaJInternalFrame extends NivelCuentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNivelCuenta;
	
	protected JMenuBar jmenuBarNivelCuenta;
	
	protected JMenu jmenuNivelCuenta;
	protected JMenu jmenuDatosNivelCuenta;
	protected JMenu jmenuArchivoNivelCuenta;
	protected JMenu jmenuAccionesNivelCuenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelCuenta;	
	protected GridBagConstraints gridBagConstraintsNivelCuenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NivelCuentaDetalleFormJInternalFrame jInternalFrameDetalleFormNivelCuenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNivelCuenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNivelCuenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public NivelCuentaSessionBean nivelcuentaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<NivelCuenta> nivelcuentas;		
	public List<NivelCuenta> nivelcuentasEliminados;	
	public List<NivelCuenta> nivelcuentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNivelCuenta;		
	protected JButton jButtonAbrirOrderByNivelCuenta;
	
	
	//protected JPanel jPanelOrderByNivelCuenta;
	//public JScrollPane jScrollPanelOrderByNivelCuenta;	
	//protected JButton jButtonCerrarOrderByNivelCuenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NivelCuentaLogic nivelcuentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNivelCuenta;
	public JScrollPane jScrollPanelDatosEdicionNivelCuenta;
	public JScrollPane jScrollPanelDatosGeneralNivelCuenta;
    
	
	
	//public JScrollPane jScrollPanelDatosNivelCuentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNivelCuenta;
	//public JScrollPane jScrollPanelImportacionNivelCuenta;
	
	
	
	protected JPanel jPanelAccionesNivelCuenta;
	
    protected JPanel jPanelPaginacionNivelCuenta;
    protected JPanel jPanelParametrosReportesNivelCuenta;
	protected JPanel jPanelParametrosReportesAccionesNivelCuenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NivelCuenta;
	protected JPanel jPanelParametrosAuxiliar2NivelCuenta;
	protected JPanel jPanelParametrosAuxiliar3NivelCuenta;
	protected JPanel jPanelParametrosAuxiliar4NivelCuenta;
	//protected JPanel jPanelParametrosAuxiliar5NivelCuenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoNivelCuenta;
	//protected JPanel jPanelImportacionNivelCuenta;
	
	
	public JTable jTableDatosNivelCuenta;
	
	
	
	//public JTable jTableDatosNivelCuentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNivelCuenta;
	protected JButton jButtonDuplicarNivelCuenta;
	protected JButton jButtonCopiarNivelCuenta;
	protected JButton jButtonVerFormNivelCuenta;
	protected JButton jButtonNuevoRelacionesNivelCuenta;
	protected JButton jButtonModificarNivelCuenta;
	
    protected JButton jButtonGuardarCambiosTablaNivelCuenta;
	protected JButton jButtonCerrarNivelCuenta;
	
	
	protected JButton jButtonRecargarInformacionNivelCuenta;
	protected JButton jButtonProcesarInformacionNivelCuenta;
	
	
	protected JButton jButtonAnterioresNivelCuenta;
	protected JButton jButtonSiguientesNivelCuenta;
	protected JButton jButtonNuevoGuardarCambiosNivelCuenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNivelCuenta;
	//protected JButton jButtonCerrarReporteDinamicoNivelCuenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoNivelCuenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionNivelCuenta;
	//protected JButton jButtonGenerarImportacionNivelCuenta;
	//protected JButton jButtonCerrarImportacionNivelCuenta;
	//protected JFileChooser jFileChooserImportacionNivelCuenta;
	//protected File fileImportacionNivelCuenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelCuenta;
	protected JButton jButtonDuplicarToolBarNivelCuenta;
	protected JButton jButtonNuevoRelacionesToolBarNivelCuenta;
	
	
	public JButton jButtonGuardarCambiosToolBarNivelCuenta;
	protected JButton jButtonCopiarToolBarNivelCuenta;
	protected JButton jButtonVerFormToolBarNivelCuenta;
	public JButton jButtonGuardarCambiosTablaToolBarNivelCuenta;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelCuenta;
	protected JButton jButtonCerrarToolBarNivelCuenta;
	
	protected JButton jButtonRecargarInformacionToolBarNivelCuenta;
	protected JButton jButtonProcesarInformacionToolBarNivelCuenta;
	protected JButton jButtonAnterioresToolBarNivelCuenta;
	protected JButton jButtonSiguientesToolBarNivelCuenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarNivelCuenta;
	protected JButton jButtonAbrirOrderByToolBarNivelCuenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelCuenta;
	protected JMenuItem jMenuItemDuplicarNivelCuenta;
	protected JMenuItem jMenuItemNuevoRelacionesNivelCuenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNivelCuenta;
	protected JMenuItem jMenuItemCopiarNivelCuenta;
	protected JMenuItem jMenuItemVerFormNivelCuenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelCuenta;
	protected JMenuItem jMenuItemCerrarNivelCuenta;
	protected JMenuItem jMenuItemDetalleCerrarNivelCuenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNivelCuenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelCuenta;
	
	protected JMenuItem jMenuItemRecargarInformacionNivelCuenta;
	protected JMenuItem jMenuItemProcesarInformacionNivelCuenta;
	protected JMenuItem jMenuItemAnterioresNivelCuenta;
	protected JMenuItem jMenuItemSiguientesNivelCuenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelCuenta;
	protected JMenuItem jMenuItemAbrirOrderByNivelCuenta;
	protected JMenuItem jMenuItemMostrarOcultarNivelCuenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelCuenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNivelCuenta;
	protected JCheckBox jCheckBoxSeleccionadosNivelCuenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNivelCuenta;
	protected JCheckBox jCheckBoxConGraficoReporteNivelCuenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNivelCuenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNivelCuenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNivelCuenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNivelCuenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNivelCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNivelCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNivelCuenta;
	protected JTextField jTextFieldValorCampoGeneralNivelCuenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNivelCuenta;
	//public JList<Reporte> jListColumnasSelectReporteNivelCuenta;
	//public JScrollPane jScrollColumnasSelectReporteNivelCuenta;
	
	//public JLabel jLabelRelacionesSelectReporteNivelCuenta;
	//public JList<Reporte> jListRelacionesSelectReporteNivelCuenta;
	//public JScrollPane jScrollRelacionesSelectReporteNivelCuenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNivelCuenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNivelCuenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNivelCuenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoNivelCuenta;
	
		
	//public JLabel jLabelArchivoImportacionNivelCuenta;	
	//public JLabel jLabelPathArchivoImportacionNivelCuenta;
	//protected JTextField jTextFieldPathArchivoImportacionNivelCuenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNivelCuenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNivelCuenta;
	
	//public JLabel jLabelColumnaCategoriaValorNivelCuenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNivelCuenta;
	
	//public JLabel jLabelColumnasValoresGraficoNivelCuenta;
	//public JList<Reporte> jListColumnasValoresGraficoNivelCuenta;
	//public JScrollPane jScrollColumnasValoresGraficoNivelCuenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNivelCuenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNivelCuenta;	
	
	
	
	
	
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
	public NivelCuentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNivelCuenta)	{
		this.jButtonRecargarInformacionNivelCuenta = jButtonRecargarInformacionNivelCuenta;
	}
	
	public JButton getjButtonProcesarInformacionNivelCuenta() {
		return this.jButtonProcesarInformacionNivelCuenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelCuenta)	{
		this.jButtonProcesarInformacionNivelCuenta = jButtonProcesarInformacionNivelCuenta;
	}
	
	
	public JButton getjButtonRecargarInformacionNivelCuenta() {
		return this.jButtonRecargarInformacionNivelCuenta;
	}
	
	
	public List<NivelCuenta> getnivelcuentas() {
		return this.nivelcuentas;
	}

	public void setnivelcuentas(List<NivelCuenta> nivelcuentas) {
		this.nivelcuentas = nivelcuentas;
	}
	
	public List<NivelCuenta> getnivelcuentasAux() {
		return this.nivelcuentasAux;
	}

	public void setnivelcuentasAux(List<NivelCuenta> nivelcuentasAux) {
		this.nivelcuentasAux = nivelcuentasAux;
	}
	
	public List<NivelCuenta> getnivelcuentasEliminados() {
		return this.nivelcuentasEliminados;
	}

	public void setNivelCuentasEliminados(List<NivelCuenta> nivelcuentasEliminados) {
		this.nivelcuentasEliminados = nivelcuentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNivelCuenta() {
		return jComboBoxTiposSeleccionarNivelCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNivelCuenta(
			JComboBox jComboBoxTiposSeleccionarNivelCuenta) {
		this.jComboBoxTiposSeleccionarNivelCuenta = jComboBoxTiposSeleccionarNivelCuenta;
	}
	
	public void setBorderResaltarTiposSeleccionarNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNivelCuenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNivelCuenta() {
		return jTextFieldValorCampoGeneralNivelCuenta;
	}

	public void setjTextFieldValorCampoGeneralNivelCuenta(
			JTextField jTextFieldValorCampoGeneralNivelCuenta) {
		this.jTextFieldValorCampoGeneralNivelCuenta = jTextFieldValorCampoGeneralNivelCuenta;
	}

	public void setBorderResaltarValorCampoGeneralNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNivelCuenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNivelCuenta() {
		return this.jCheckBoxSeleccionarTodosNivelCuenta;
	}

	public void setjCheckBoxSeleccionarTodosNivelCuenta(
			JCheckBox jCheckBoxSeleccionarTodosNivelCuenta) {
		this.jCheckBoxSeleccionarTodosNivelCuenta = jCheckBoxSeleccionarTodosNivelCuenta;
	}

	public void setBorderResaltarSeleccionarTodosNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNivelCuenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNivelCuenta() {
		return this.jCheckBoxSeleccionadosNivelCuenta;
	}

	public void setjCheckBoxSeleccionadosNivelCuenta(
			JCheckBox jCheckBoxSeleccionadosNivelCuenta) {
		this.jCheckBoxSeleccionadosNivelCuenta = jCheckBoxSeleccionadosNivelCuenta;
	}
	
	public void setBorderResaltarSeleccionadosNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNivelCuenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNivelCuenta() {
		return this.jComboBoxTiposArchivosReportesNivelCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNivelCuenta(
			JComboBox jComboBoxTiposArchivosReportesNivelCuenta) {
		this.jComboBoxTiposArchivosReportesNivelCuenta = jComboBoxTiposArchivosReportesNivelCuenta;
	}

	public void setBorderResaltarTiposArchivosReportesNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNivelCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNivelCuenta() {
		return this.jComboBoxTiposReportesNivelCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNivelCuenta(
			JComboBox jComboBoxTiposReportesNivelCuenta) {
		this.jComboBoxTiposReportesNivelCuenta = jComboBoxTiposReportesNivelCuenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNivelCuenta() {
	//	return jComboBoxTiposReportesDinamicoNivelCuenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNivelCuenta(
	//		JComboBox jComboBoxTiposReportesDinamicoNivelCuenta) {
	//	this.jComboBoxTiposReportesDinamicoNivelCuenta = jComboBoxTiposReportesDinamicoNivelCuenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNivelCuenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoNivelCuenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNivelCuenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNivelCuenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta = jComboBoxTiposArchivosReportesDinamicoNivelCuenta;
	//}
	
	public void setBorderResaltarTiposReportesNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNivelCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNivelCuenta() {
		return this.jComboBoxTiposGraficosReportesNivelCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNivelCuenta(
			JComboBox jComboBoxTiposGraficosReportesNivelCuenta) {
		this.jComboBoxTiposGraficosReportesNivelCuenta = jComboBoxTiposGraficosReportesNivelCuenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNivelCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNivelCuenta() {
		return this.jComboBoxTiposPaginacionNivelCuenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNivelCuenta(
			JComboBox jComboBoxTiposPaginacionNivelCuenta) {
		this.jComboBoxTiposPaginacionNivelCuenta = jComboBoxTiposPaginacionNivelCuenta;
	}
	
	public void setBorderResaltarTiposPaginacionNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNivelCuenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNivelCuenta() {
		return this.jComboBoxTiposRelacionesNivelCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelCuenta() {
		return this.jComboBoxTiposAccionesNivelCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelCuenta(
			JComboBox jComboBoxTiposRelacionesNivelCuenta) {
		this.jComboBoxTiposRelacionesNivelCuenta = jComboBoxTiposRelacionesNivelCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelCuenta(
			JComboBox jComboBoxTiposAccionesNivelCuenta) {
		this.jComboBoxTiposAccionesNivelCuenta = jComboBoxTiposAccionesNivelCuenta;
	}
	
	public void setBorderResaltarTiposRelacionesNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNivelCuenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNivelCuenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNivelCuenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNivelCuenta() {
	//	return jCheckBoxConGraficoDinamicoNivelCuenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoNivelCuenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoNivelCuenta) {
	//	this.jCheckBoxConGraficoDinamicoNivelCuenta = jCheckBoxConGraficoDinamicoNivelCuenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNivelCuenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNivelCuenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNivelCuenta .setBorder(borderResaltar);		
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
		this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
		
		this.nivelcuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivelcuentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelCuentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Cuenta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
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
		
		NivelCuentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNivelCuenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"nuevo","nuevo","Nuevo"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"duplicar","duplicar","Duplicar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"copiar","copiar","Copiar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"ver_form","ver_form","Ver"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"recargar","recargar","Recargar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNivelCuenta,this.jTtoolBarNivelCuenta,
							"cerrar","cerrar","Salir"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNivelCuenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNivelCuenta;
			
				this.jButtonProcesarInformacionToolBarNivelCuenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNivelCuenta;
				
		//protected JButton jButtonModificarToolBarNivelCuenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNivelCuenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNivelCuenta=new JMenuMe("General");
		this.jmenuArchivoNivelCuenta=new JMenuMe("Archivo");
		this.jmenuAccionesNivelCuenta=new JMenuMe("Acciones");
		this.jmenuDatosNivelCuenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelCuenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelCuenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelCuenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNivelCuenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNivelCuenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNivelCuenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNivelCuenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNivelCuenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNivelCuenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNivelCuenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelCuenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelCuenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNivelCuenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNivelCuenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNivelCuenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNivelCuenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNivelCuenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNivelCuenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNivelCuenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNivelCuenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNivelCuenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelCuenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelCuenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelCuenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNivelCuenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNivelCuenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNivelCuenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNivelCuenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNivelCuenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNivelCuenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNivelCuenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNivelCuenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNivelCuenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNivelCuenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNivelCuenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNivelCuenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNivelCuenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNivelCuenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNivelCuenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelCuenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNivelCuenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNivelCuenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNivelCuenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelCuenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNivelCuenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNivelCuenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNivelCuenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNivelCuenta.add(this.jMenuItemCerrarNivelCuenta);
			
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemNuevoNivelCuenta);
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemNuevoGuardarCambiosNivelCuenta);
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemNuevoRelacionesNivelCuenta);
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemGuardarCambiosTablaNivelCuenta);		
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemDuplicarNivelCuenta);		
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemCopiarNivelCuenta);		
			this.jmenuAccionesNivelCuenta.add(this.jMenuItemVerFormNivelCuenta);		
			
			this.jmenuDatosNivelCuenta.add(this.jMenuItemRecargarInformacionNivelCuenta);				
			this.jmenuDatosNivelCuenta.add(this.jMenuItemAnterioresNivelCuenta);				
			this.jmenuDatosNivelCuenta.add(this.jMenuItemSiguientesNivelCuenta);				
			this.jmenuDatosNivelCuenta.add(this.jMenuItemAbrirOrderByNivelCuenta);				
			this.jmenuDatosNivelCuenta.add(this.jMenuItemMostrarOcultarNivelCuenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNivelCuenta.add(this.jMenuItemGuardarCambiosNivelCuenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNivelCuenta.add(this.jmenuArchivoNivelCuenta);		
			this.jmenuBarNivelCuenta.add(this.jmenuAccionesNivelCuenta);		
			this.jmenuBarNivelCuenta.add(this.jmenuDatosNivelCuenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNivelCuenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNivelCuenta() {
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
			//this.jInternalFrameDetalleNivelCuenta = new NivelCuentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nivel Cuenta DATOS");
			this.jInternalFrameDetalleFormNivelCuenta = new NivelCuentaDetalleFormJInternalFrame(jDesktopPane,this.nivelcuentaSessionBean.getConGuardarRelaciones(),this.nivelcuentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNivelCuenta = null;//new NivelCuentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelCuenta= new GridBagLayout();
		
		
		this.jTableDatosNivelCuenta = new JTableMe();      
		
		String sToolTipNivelCuenta="";
		sToolTipNivelCuenta=NivelCuentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelCuenta+="(Contabilidad.NivelCuenta)";
		}
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelCuenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNivelCuenta.setToolTipText(sToolTipNivelCuenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNivelCuenta);
		this.jTableDatosNivelCuenta.setAutoCreateRowSorter(true);
		this.jTableDatosNivelCuenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNivelCuenta.setRowSelectionAllowed(true);
		this.jTableDatosNivelCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNivelCuenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNivelCuenta = new JButtonMe();
		this.jButtonDuplicarNivelCuenta = new JButtonMe();
		this.jButtonCopiarNivelCuenta = new JButtonMe();
		this.jButtonVerFormNivelCuenta = new JButtonMe();
		this.jButtonNuevoRelacionesNivelCuenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNivelCuenta = new JButtonMe();
		this.jButtonCerrarNivelCuenta = new JButtonMe();
		
		this.jScrollPanelDatosNivelCuenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralNivelCuenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Cuenta";
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuentas" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelCuenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelCuenta.setToolTipText("Acciones");
        this.jPanelAccionesNivelCuenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNivelCuenta=new ReporteDinamicoJInternalFrame(NivelCuentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNivelCuenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNivelCuenta=new ImportacionJInternalFrame(NivelCuentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNivelCuenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNivelCuenta = new JButtonMe();
		
		this.jButtonAbrirOrderByNivelCuenta.setText("Orden");
		this.jButtonAbrirOrderByNivelCuenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelCuenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuenta,false,this);
			
			//this.cargarOrderByNivelCuenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuenta,true,this);
			
			//this.cargarOrderByNivelCuenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNivelCuenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosNivelCuenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosNivelCuenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosNivelCuenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelCuenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelCuenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNivelCuenta.setText("Nuevo");
		this.jButtonDuplicarNivelCuenta.setText("Duplicar");
		this.jButtonCopiarNivelCuenta.setText("Copiar");
		this.jButtonVerFormNivelCuenta.setText("Ver");
		this.jButtonNuevoRelacionesNivelCuenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNivelCuenta.setText("Guardar");
		this.jButtonCerrarNivelCuenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelCuenta,"nuevo_button","Nuevo",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNivelCuenta,"duplicar_button","Duplicar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNivelCuenta,"copiar_button","Copiar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNivelCuenta,"ver_form","Ver",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNivelCuenta,"nuevorelaciones_button","Nuevo Rel",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelCuenta,"guardarcambiostabla_button","Guardar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelCuenta,"cerrar_button","Salir",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNivelCuenta.setToolTipText("Nuevo"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNivelCuenta.setToolTipText("Duplicar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNivelCuenta.setToolTipText("Copiar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNivelCuenta.setToolTipText("Ver"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNivelCuenta.setToolTipText("Nuevo Rel"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNivelCuenta.setToolTipText("Guardar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelCuenta.setToolTipText("Salir"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelCuenta";
		inputMap = this.jButtonNuevoNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelCuenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarNivelCuenta";
		inputMap = this.jButtonDuplicarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNivelCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNivelCuenta"));
		
		//COPIAR
		sMapKey = "CopiarNivelCuenta";
		inputMap = this.jButtonCopiarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNivelCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNivelCuenta"));
		
		//VEr FORM
		sMapKey = "VerFormNivelCuenta";
		inputMap = this.jButtonVerFormNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNivelCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNivelCuenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNivelCuenta";
		inputMap = this.jButtonNuevoRelacionesNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNivelCuenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNivelCuenta";
		inputMap = this.jButtonModificarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNivelCuenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNivelCuenta";
		inputMap = this.jButtonCerrarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelCuenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelCuenta";
		inputMap = this.jButtonGuardarCambiosTablaNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelCuenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NivelCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NivelCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NivelCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NivelCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NivelCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNivelCuenta.setName("jPanelParametrosReportesNivelCuenta"); 
		
		this.jPanelParametrosReportesAccionesNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNivelCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNivelCuenta.setName("jPanelParametrosReportesAccionesNivelCuenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNivelCuenta = new JButtonMe();
		this.jButtonRecargarInformacionNivelCuenta.setText("Recargar");
		this.jButtonRecargarInformacionNivelCuenta.setToolTipText("Recargar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNivelCuenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNivelCuenta = new JButtonMe();
		this.jButtonProcesarInformacionNivelCuenta.setText("Procesar");
		this.jButtonProcesarInformacionNivelCuenta.setToolTipText("Procesar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNivelCuenta.setVisible(false);
			
		this.jButtonProcesarInformacionNivelCuenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelCuenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelCuenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCuenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNivelCuenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCuenta.setText("TIPO");       
		this.jComboBoxTiposReportesNivelCuenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCuenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNivelCuenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNivelCuenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionNivelCuenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNivelCuenta.setText("Accion");
		this.jComboBoxTiposRelacionesNivelCuenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelCuenta.setText("Accion");
		this.jComboBoxTiposAccionesNivelCuenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNivelCuenta.setText("Accion");
		this.jComboBoxTiposSeleccionarNivelCuenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNivelCuenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNivelCuenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelCuenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelCuenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNivelCuenta = new JLabelMe();
		
		this.jLabelAccionesNivelCuenta.setText("Acciones");		
		this.jLabelAccionesNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNivelCuenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNivelCuenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNivelCuenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNivelCuenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNivelCuenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNivelCuenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNivelCuenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNivelCuenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNivelCuenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNivelCuenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNivelCuenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteNivelCuenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNivelCuenta = new JButtonMe();
		//this.jButtonAnterioresNivelCuenta.setText("<<");
        this.jButtonAnterioresNivelCuenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNivelCuenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNivelCuenta = new JButtonMe();
		//this.jButtonSiguientesNivelCuenta.setText(">>");
        this.jButtonSiguientesNivelCuenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNivelCuenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNivelCuenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNivelCuenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosNivelCuenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNivelCuenta,"nuevoguardarcambios_button","Nue",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNivelCuenta";
		inputMap = this.jButtonNuevoGuardarCambiosNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNivelCuenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNivelCuenta";
		inputMap = this.jButtonRecargarInformacionNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNivelCuenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNivelCuenta";
		inputMap = this.jButtonSiguientesNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNivelCuenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNivelCuenta";
		inputMap = this.jButtonAnterioresNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNivelCuenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNivelCuenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNivelCuenta.setMinimumSize(new Dimension(this.getWidth(),NivelCuentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCuentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelCuenta.setMaximumSize(new Dimension(this.getWidth(),NivelCuentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCuentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelCuenta.setPreferredSize(new Dimension(this.getWidth(),NivelCuentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCuentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNivelCuenta = new GridBagLayout();

			this.jPanelPaginacionNivelCuenta.setLayout(gridaBagLayoutPaginacionNivelCuenta);						
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 0;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNivelCuenta.add(this.jButtonAnterioresNivelCuenta, this.gridBagConstraintsNivelCuenta);
					
						
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelCuenta.gridy = 0;
			
			this.jPanelPaginacionNivelCuenta.add(this.jButtonNuevoGuardarCambiosNivelCuenta, this.gridBagConstraintsNivelCuenta);
						
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelCuenta.gridy = 0;
			this.jPanelPaginacionNivelCuenta.add(this.jButtonSiguientesNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 1;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuenta.add(this.jButtonNuevoNivelCuenta, this.gridBagConstraintsNivelCuenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
				this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNivelCuenta.gridy = 1;
				this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNivelCuenta.add(this.jButtonNuevoRelacionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
			}
			
			
			if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
				this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNivelCuenta.gridy = 1;
				this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNivelCuenta.add(this.jButtonGuardarCambiosTablaNivelCuenta, this.gridBagConstraintsNivelCuenta);
			}
			
			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 1;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuenta.add(this.jButtonDuplicarNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 1;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuenta.add(this.jButtonCopiarNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 1;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuenta.add(this.jButtonVerFormNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 1;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNivelCuenta.add(this.jButtonCerrarNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
		
		
		this.jButtonRecargarInformacionNivelCuenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelCuenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelCuenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNivelCuenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelCuenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelCuenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNivelCuenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelCuenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelCuenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNivelCuenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelCuenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelCuenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNivelCuenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelCuenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelCuenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNivelCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNivelCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNivelCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNivelCuenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelCuenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelCuenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNivelCuenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelCuenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelCuenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNivelCuenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelCuenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelCuenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNivelCuenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelCuenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelCuenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNivelCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNivelCuenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NivelCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NivelCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NivelCuenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NivelCuenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNivelCuenta.setLayout(gridaBagParametrosReportesNivelCuenta);
			this.jPanelParametrosReportesAccionesNivelCuenta.setLayout(gridaBagParametrosReportesAccionesNivelCuenta);
			
			
			this.jPanelParametrosAuxiliar1NivelCuenta.setLayout(gridaBagParametrosAuxiliar1NivelCuenta);
			this.jPanelParametrosAuxiliar2NivelCuenta.setLayout(gridaBagParametrosAuxiliar2NivelCuenta);
			this.jPanelParametrosAuxiliar3NivelCuenta.setLayout(gridaBagParametrosAuxiliar3NivelCuenta);
			this.jPanelParametrosAuxiliar4NivelCuenta.setLayout(gridaBagParametrosAuxiliar4NivelCuenta);
			//this.jPanelParametrosAuxiliar5NivelCuenta.setLayout(gridaBagParametrosAuxiliar2NivelCuenta);			
			
			
			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuenta.add(this.jButtonRecargarInformacionNivelCuenta, this.gridBagConstraintsNivelCuenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCuenta.add(this.jComboBoxTiposPaginacionNivelCuenta, this.gridBagConstraintsNivelCuenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCuenta.add(this.jCheckBoxConAltoMaximoTablaNivelCuenta, this.gridBagConstraintsNivelCuenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCuenta.add(this.jComboBoxTiposArchivosReportesNivelCuenta, this.gridBagConstraintsNivelCuenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuenta.add(this.jPanelParametrosAuxiliar1NivelCuenta, this.gridBagConstraintsNivelCuenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NivelCuenta.add(this.jComboBoxTiposReportesNivelCuenta, this.gridBagConstraintsNivelCuenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuenta.add(this.jPanelParametrosAuxiliar4NivelCuenta, this.gridBagConstraintsNivelCuenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuenta.add(this.jComboBoxTiposReportesNivelCuenta, this.gridBagConstraintsNivelCuenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCuenta.add(this.jCheckBoxGenerarReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuenta.add(this.jPanelParametrosAuxiliar2NivelCuenta, this.gridBagConstraintsNivelCuenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCuenta.add(this.jLabelAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
				this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNivelCuenta.add(this.jButtonAbrirOrderByNivelCuenta, this.gridBagConstraintsNivelCuenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuenta.add(this.jComboBoxTiposSeleccionarNivelCuenta, this.gridBagConstraintsNivelCuenta);			
			
			
			/*
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCuenta.add(this.jCheckBoxSeleccionarTodosNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelCuenta.add(this.jCheckBoxSeleccionarTodosNivelCuenta, this.gridBagConstraintsNivelCuenta);															
				
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelCuenta.add(this.jCheckBoxSeleccionadosNivelCuenta, this.gridBagConstraintsNivelCuenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuenta.add(this.jPanelParametrosAuxiliar3NivelCuenta, this.gridBagConstraintsNivelCuenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuenta.add(this.jComboBoxTiposRelacionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
				
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuenta.add(this.jComboBoxTiposAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
	
				
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuenta.add(this.jTextFieldValorCampoGeneralNivelCuenta, this.gridBagConstraintsNivelCuenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNivelCuenta = new GridBagLayout();

			this.jScrollPanelDatosNivelCuenta.setLayout(gridaBagLayoutDatosNivelCuenta);
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = 0;
			this.gridBagConstraintsNivelCuenta.gridx = 0;
			
			this.jScrollPanelDatosNivelCuenta.add(this.jTableDatosNivelCuenta, this.gridBagConstraintsNivelCuenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNivelCuenta.setViewportView(this.jTableDatosNivelCuenta);
		this.jTableDatosNivelCuenta.setFillsViewportHeight(true);
		this.jTableDatosNivelCuenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNivelCuenta= new GridBagLayout();
		this.jPanelAccionesNivelCuenta.setLayout(gridaBagLayoutAccionesNivelCuenta);
		
		
		/*	
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = 0;
		this.gridBagConstraintsNivelCuenta.gridx = 0;
			
		this.jPanelAccionesNivelCuenta.add(this.jButtonNuevoNivelCuenta, this.gridBagConstraintsNivelCuenta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelCuenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelCuenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();						
			this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelCuenta.gridx = 0;		
			//this.gridBagConstraintsNivelCuenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelCuenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNivelCuenta, this.gridBagConstraintsNivelCuenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNivelCuenta.gridx = 0;		
		//this.gridBagConstraintsNivelCuenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNivelCuenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNivelCuenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNivelCuenta, this.gridBagConstraintsNivelCuenta);								
		
		
		/*
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
		*/		
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelCuenta.gridx =0;
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelCuenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelCuenta, this.gridBagConstraintsNivelCuenta);
				
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNivelCuenta, this.gridBagConstraintsNivelCuenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNivelCuenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelCuenta = new GridBagLayout();
			this.jPanelBusquedasParametrosNivelCuenta.setLayout(gridaBagLayoutBusquedasParametrosNivelCuenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNivelCuenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
			
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
			
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNivelCuenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNivelCuenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNivelCuenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNivelCuenta.setName("jPanelReporteDinamicoNivelCuenta"); 
		
		this.jPanelReporteDinamicoNivelCuenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelCuenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelCuenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNivelCuenta.setLayout(gridaBagLayoutReporteDinamicoNivelCuenta);
		
		
		this.jInternalFrameReporteDinamicoNivelCuenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNivelCuenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelCuenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNivelCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNivelCuenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNivelCuenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNivelCuenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNivelCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNivelCuenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoNivelCuenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoNivelCuenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNivelCuenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelCuenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelCuenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNivelCuenta = new JLabelMe();

		this.jLabelColumnasSelectReporteNivelCuenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNivelCuenta.add(this.jLabelColumnasSelectReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNivelCuenta = new JList<Reporte>();
		this.jListColumnasSelectReporteNivelCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNivelCuenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNivelCuenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelCuenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelCuenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNivelCuenta=new JScrollPane(this.jListColumnasSelectReporteNivelCuenta);
			
			this.jScrollColumnasSelectReporteNivelCuenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelCuenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelCuenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNivelCuenta.add(this.jListColumnasSelectReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
		this.jPanelReporteDinamicoNivelCuenta.add(this.jScrollColumnasSelectReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNivelCuenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteNivelCuenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNivelCuenta.add(this.jLabelRelacionesSelectReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNivelCuenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteNivelCuenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNivelCuenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNivelCuenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelCuenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelCuenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNivelCuenta=new JScrollPane(this.jListRelacionesSelectReporteNivelCuenta);
			
			this.jScrollRelacionesSelectReporteNivelCuenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelCuenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelCuenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNivelCuenta.add(this.jListRelacionesSelectReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
		this.jPanelReporteDinamicoNivelCuenta.add(this.jScrollRelacionesSelectReporteNivelCuenta, this.gridBagConstraintsNivelCuenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNivelCuenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNivelCuenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoNivelCuenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNivelCuenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNivelCuenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNivelCuenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelCuenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelCuenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNivelCuenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNivelCuenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelCuenta.add(this.jLabelGenerarExcelReporteDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNivelCuenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNivelCuenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNivelCuenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNivelCuenta.setToolTipText("Generar EXCEL"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNivelCuenta.add(this.jButtonGenerarExcelReporteDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuenta.add(this.jComboBoxTiposReportesDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNivelCuenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNivelCuenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelCuenta.add(this.jLabelTiposArchivoReporteDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuenta.add(this.jComboBoxTiposArchivosReportesDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNivelCuenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNivelCuenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNivelCuenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNivelCuenta.setToolTipText("Generar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuenta.add(this.jButtonGenerarReporteDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNivelCuenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNivelCuenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNivelCuenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNivelCuenta.setToolTipText("Cancelar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuenta.add(this.jButtonCerrarReporteDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNivelCuenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNivelCuenta= new JScrollPane(jPanelReporteDinamicoNivelCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNivelCuenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelCuenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelCuenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNivelCuenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNivelCuenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNivelCuenta);
		this.jInternalFrameReporteDinamicoNivelCuenta.getContentPane().add(this.jScrollPanelReporteDinamicoNivelCuenta, this.gridBagConstraintsNivelCuenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNivelCuenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNivelCuenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNivelCuenta.setName("jPanelImportacionNivelCuenta"); 
		
		this.jPanelImportacionNivelCuenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelCuenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelCuenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNivelCuenta.setLayout(gridaBagLayoutImportacionNivelCuenta);
		
		
		this.jInternalFrameImportacionNivelCuenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNivelCuenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNivelCuenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelCuenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNivelCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelCuenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelCuenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNivelCuenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelCuenta.setResizable(true);
	    this.jInternalFrameImportacionNivelCuenta.setClosable(true);
	    this.jInternalFrameImportacionNivelCuenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNivelCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelCuenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelCuenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNivelCuenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelCuenta.setResizable(true);
	    this.jInternalFrameImportacionNivelCuenta.setClosable(true);
	    this.jInternalFrameImportacionNivelCuenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNivelCuenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelCuenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelCuenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNivelCuenta = new JLabelMe();

		this.jLabelArchivoImportacionNivelCuenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelCuenta.add(this.jLabelArchivoImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNivelCuenta = new JFileChooser();		
		this.jFileChooserImportacionNivelCuenta.setToolTipText("ESCOGER ARCHIVO"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNivelCuenta = new JButtonMe();
		this.jButtonAbrirImportacionNivelCuenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNivelCuenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNivelCuenta.setToolTipText("Generar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuenta.add(this.jButtonAbrirImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNivelCuenta = new JLabelMe();

		this.jLabelPathArchivoImportacionNivelCuenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelCuenta.add(this.jLabelPathArchivoImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNivelCuenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNivelCuenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelCuenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelCuenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuenta.add(this.jTextFieldPathArchivoImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNivelCuenta = new JButtonMe();
		this.jButtonGenerarImportacionNivelCuenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNivelCuenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNivelCuenta.setToolTipText("Generar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuenta.add(this.jButtonGenerarImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNivelCuenta = new JButtonMe();
		this.jButtonCerrarImportacionNivelCuenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNivelCuenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNivelCuenta.setToolTipText("Cancelar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuenta.add(this.jButtonCerrarImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNivelCuenta = new GridBagLayout();
		
		this.jScrollPanelImportacionNivelCuenta= new JScrollPane(jPanelImportacionNivelCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy =iPosYImportacion;
		this.gridBagConstraintsNivelCuenta.gridx =iPosXImportacion;
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNivelCuenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNivelCuenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNivelCuenta);
		this.jInternalFrameImportacionNivelCuenta.getContentPane().add(this.jScrollPanelImportacionNivelCuenta, this.gridBagConstraintsNivelCuenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNivelCuenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNivelCuenta = new JButtonMe();
			this.jButtonAbrirOrderByNivelCuenta.setText("Orden");
			this.jButtonAbrirOrderByNivelCuenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelCuenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNivelCuenta";
			inputMap = this.jButtonAbrirOrderByNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNivelCuenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByNivelCuenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNivelCuenta.setName("jPanelOrderByNivelCuenta"); 
			
			this.jPanelOrderByNivelCuenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelCuenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelCuenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNivelCuenta.setLayout(gridaBagLayoutOrderByNivelCuenta);
			
			
			this.jTableDatosNivelCuentaOrderBy = new JTableMe();        
			this.jTableDatosNivelCuentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNivelCuentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNivelCuentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNivelCuentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNivelCuentaOrderBy.setViewportView(this.jTableDatosNivelCuentaOrderBy);
			this.jTableDatosNivelCuentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNivelCuentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNivelCuenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNivelCuenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNivelCuenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNivelCuenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNivelCuenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNivelCuenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNivelCuenta.setTitle("Orden");
			this.jInternalFrameOrderByNivelCuenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNivelCuenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNivelCuenta.setResizable(true);
			this.jInternalFrameOrderByNivelCuenta.setClosable(true);
			this.jInternalFrameOrderByNivelCuenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNivelCuenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelCuenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelCuenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNivelCuenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNivelCuenta.ipady =150;
				
			this.jPanelOrderByNivelCuenta.add(jScrollPanelDatosNivelCuentaOrderBy, this.gridBagConstraintsNivelCuenta);//this.jTableDatosNivelCuentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNivelCuenta = new JButtonMe();
			this.jButtonCerrarOrderByNivelCuenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNivelCuenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNivelCuenta.setToolTipText("Cancelar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNivelCuenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNivelCuenta.add(this.jButtonCerrarOrderByNivelCuenta, this.gridBagConstraintsNivelCuenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNivelCuenta = new GridBagLayout();
			
			this.jScrollPanelOrderByNivelCuenta= new JScrollPane(jPanelOrderByNivelCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsNivelCuenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNivelCuenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNivelCuenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNivelCuenta);
			
			this.jInternalFrameOrderByNivelCuenta.getContentPane().add(this.jScrollPanelOrderByNivelCuenta, this.gridBagConstraintsNivelCuenta);			
		
		} else {
			this.jButtonAbrirOrderByNivelCuenta = new JButtonMe();
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
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.nivelcuentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNivelCuenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNivelCuenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNivelCuenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNivelCuenta.getRowHeight();//NivelCuentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NivelCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelCuenta.isSelected()) {
					iHeightTable=NivelCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NivelCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelCuenta.isSelected()) {
					iHeightTable=NivelCuentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelCuentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNivelCuenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelCuenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelCuenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNivelCuenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelCuenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelCuenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNivelCuenta!=null && this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy()!=null) {
			//if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNivelCuenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNivelCuenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNivelCuenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNivelCuenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelCuenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelCuenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=nivelcuentaLogic.getNivelCuentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcuentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NivelCuenta> TraerNivelCuentaBeans(List<NivelCuenta> nivelcuentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(NivelCuenta nivelcuenta:nivelcuentas) {
					
				if(!(NivelCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NivelCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					nivelcuenta.setsDetalleGeneralEntityReporte(NivelCuentaConstantesFunciones.getNivelCuentaDescripcion(nivelcuenta));
										
						
					
					

					if(nivelcuenta.getCuentaContables()!=null && Funciones.existeClass(classes,CuentaContable.class)) {
						try{nivelcuenta.setcuentacontablesDescripcionReporte(new JRBeanCollectionDataSource(CuentaContableJInternalFrame.TraerCuentaContableBeans(nivelcuenta.getCuentaContables(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//nivelcuenta.setsDetalleGeneralEntityReporte(nivelcuenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//nivelcuentabeans.add(nivelcuentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return nivelcuentas;
    }
	//PARA REPORTES FIN
}
