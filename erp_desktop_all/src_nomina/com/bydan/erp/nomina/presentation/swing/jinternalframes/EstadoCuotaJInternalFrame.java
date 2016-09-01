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
import com.bydan.erp.nomina.util.EstadoCuotaConstantesFunciones;

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
public class EstadoCuotaJInternalFrame extends EstadoCuotaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoCuota;
	
	protected JMenuBar jmenuBarEstadoCuota;
	
	protected JMenu jmenuEstadoCuota;
	protected JMenu jmenuDatosEstadoCuota;
	protected JMenu jmenuArchivoEstadoCuota;
	protected JMenu jmenuAccionesEstadoCuota;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCuota;	
	protected GridBagConstraints gridBagConstraintsEstadoCuota;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoCuotaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoCuota;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoCuota;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoCuota;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoCuotaSessionBean estadocuotaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoCuota> estadocuotas;		
	public List<EstadoCuota> estadocuotasEliminados;	
	public List<EstadoCuota> estadocuotasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoCuota;		
	protected JButton jButtonAbrirOrderByEstadoCuota;
	
	
	//protected JPanel jPanelOrderByEstadoCuota;
	//public JScrollPane jScrollPanelOrderByEstadoCuota;	
	//protected JButton jButtonCerrarOrderByEstadoCuota;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoCuotaLogic estadocuotaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoCuota;
	public JScrollPane jScrollPanelDatosEdicionEstadoCuota;
	public JScrollPane jScrollPanelDatosGeneralEstadoCuota;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoCuotaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoCuota;
	//public JScrollPane jScrollPanelImportacionEstadoCuota;
	
	
	
	protected JPanel jPanelAccionesEstadoCuota;
	
    protected JPanel jPanelPaginacionEstadoCuota;
    protected JPanel jPanelParametrosReportesEstadoCuota;
	protected JPanel jPanelParametrosReportesAccionesEstadoCuota;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoCuota;
	protected JPanel jPanelParametrosAuxiliar2EstadoCuota;
	protected JPanel jPanelParametrosAuxiliar3EstadoCuota;
	protected JPanel jPanelParametrosAuxiliar4EstadoCuota;
	//protected JPanel jPanelParametrosAuxiliar5EstadoCuota;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoCuota;
	//protected JPanel jPanelImportacionEstadoCuota;
	
	
	public JTable jTableDatosEstadoCuota;
	
	
	
	//public JTable jTableDatosEstadoCuotaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoCuota;
	protected JButton jButtonDuplicarEstadoCuota;
	protected JButton jButtonCopiarEstadoCuota;
	protected JButton jButtonVerFormEstadoCuota;
	protected JButton jButtonNuevoRelacionesEstadoCuota;
	protected JButton jButtonModificarEstadoCuota;
	
    protected JButton jButtonGuardarCambiosTablaEstadoCuota;
	protected JButton jButtonCerrarEstadoCuota;
	
	
	protected JButton jButtonRecargarInformacionEstadoCuota;
	protected JButton jButtonProcesarInformacionEstadoCuota;
	
	
	protected JButton jButtonAnterioresEstadoCuota;
	protected JButton jButtonSiguientesEstadoCuota;
	protected JButton jButtonNuevoGuardarCambiosEstadoCuota;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoCuota;
	//protected JButton jButtonCerrarReporteDinamicoEstadoCuota;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoCuota;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoCuota;
	//protected JButton jButtonGenerarImportacionEstadoCuota;
	//protected JButton jButtonCerrarImportacionEstadoCuota;
	//protected JFileChooser jFileChooserImportacionEstadoCuota;
	//protected File fileImportacionEstadoCuota;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCuota;
	protected JButton jButtonDuplicarToolBarEstadoCuota;
	protected JButton jButtonNuevoRelacionesToolBarEstadoCuota;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoCuota;
	protected JButton jButtonCopiarToolBarEstadoCuota;
	protected JButton jButtonVerFormToolBarEstadoCuota;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoCuota;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCuota;
	protected JButton jButtonCerrarToolBarEstadoCuota;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoCuota;
	protected JButton jButtonProcesarInformacionToolBarEstadoCuota;
	protected JButton jButtonAnterioresToolBarEstadoCuota;
	protected JButton jButtonSiguientesToolBarEstadoCuota;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoCuota;
	protected JButton jButtonAbrirOrderByToolBarEstadoCuota;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCuota;
	protected JMenuItem jMenuItemDuplicarEstadoCuota;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoCuota;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoCuota;
	protected JMenuItem jMenuItemCopiarEstadoCuota;
	protected JMenuItem jMenuItemVerFormEstadoCuota;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCuota;
	protected JMenuItem jMenuItemCerrarEstadoCuota;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCuota;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoCuota;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCuota;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoCuota;
	protected JMenuItem jMenuItemProcesarInformacionEstadoCuota;
	protected JMenuItem jMenuItemAnterioresEstadoCuota;
	protected JMenuItem jMenuItemSiguientesEstadoCuota;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCuota;
	protected JMenuItem jMenuItemAbrirOrderByEstadoCuota;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCuota;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCuota;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoCuota;
	protected JCheckBox jCheckBoxSeleccionadosEstadoCuota;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoCuota;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoCuota;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCuota;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoCuota;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoCuota;
	protected JTextField jTextFieldValorCampoGeneralEstadoCuota;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoCuota;
	//public JList<Reporte> jListColumnasSelectReporteEstadoCuota;
	//public JScrollPane jScrollColumnasSelectReporteEstadoCuota;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoCuota;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoCuota;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoCuota;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoCuota;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoCuota;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoCuota;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoCuota;
	
		
	//public JLabel jLabelArchivoImportacionEstadoCuota;	
	//public JLabel jLabelPathArchivoImportacionEstadoCuota;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoCuota;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoCuota;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoCuota;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoCuota;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoCuota;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoCuota;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoCuota;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoCuota;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoCuota;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoCuota;	
	
	
	
	
	
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
	public EstadoCuotaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoCuota)	{
		this.jButtonRecargarInformacionEstadoCuota = jButtonRecargarInformacionEstadoCuota;
	}
	
	public JButton getjButtonProcesarInformacionEstadoCuota() {
		return this.jButtonProcesarInformacionEstadoCuota;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCuota)	{
		this.jButtonProcesarInformacionEstadoCuota = jButtonProcesarInformacionEstadoCuota;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoCuota() {
		return this.jButtonRecargarInformacionEstadoCuota;
	}
	
	
	public List<EstadoCuota> getestadocuotas() {
		return this.estadocuotas;
	}

	public void setestadocuotas(List<EstadoCuota> estadocuotas) {
		this.estadocuotas = estadocuotas;
	}
	
	public List<EstadoCuota> getestadocuotasAux() {
		return this.estadocuotasAux;
	}

	public void setestadocuotasAux(List<EstadoCuota> estadocuotasAux) {
		this.estadocuotasAux = estadocuotasAux;
	}
	
	public List<EstadoCuota> getestadocuotasEliminados() {
		return this.estadocuotasEliminados;
	}

	public void setEstadoCuotasEliminados(List<EstadoCuota> estadocuotasEliminados) {
		this.estadocuotasEliminados = estadocuotasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoCuota() {
		return jComboBoxTiposSeleccionarEstadoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoCuota(
			JComboBox jComboBoxTiposSeleccionarEstadoCuota) {
		this.jComboBoxTiposSeleccionarEstadoCuota = jComboBoxTiposSeleccionarEstadoCuota;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoCuota .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoCuota() {
		return jTextFieldValorCampoGeneralEstadoCuota;
	}

	public void setjTextFieldValorCampoGeneralEstadoCuota(
			JTextField jTextFieldValorCampoGeneralEstadoCuota) {
		this.jTextFieldValorCampoGeneralEstadoCuota = jTextFieldValorCampoGeneralEstadoCuota;
	}

	public void setBorderResaltarValorCampoGeneralEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoCuota .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoCuota() {
		return this.jCheckBoxSeleccionarTodosEstadoCuota;
	}

	public void setjCheckBoxSeleccionarTodosEstadoCuota(
			JCheckBox jCheckBoxSeleccionarTodosEstadoCuota) {
		this.jCheckBoxSeleccionarTodosEstadoCuota = jCheckBoxSeleccionarTodosEstadoCuota;
	}

	public void setBorderResaltarSeleccionarTodosEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoCuota .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoCuota() {
		return this.jCheckBoxSeleccionadosEstadoCuota;
	}

	public void setjCheckBoxSeleccionadosEstadoCuota(
			JCheckBox jCheckBoxSeleccionadosEstadoCuota) {
		this.jCheckBoxSeleccionadosEstadoCuota = jCheckBoxSeleccionadosEstadoCuota;
	}
	
	public void setBorderResaltarSeleccionadosEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoCuota .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoCuota() {
		return this.jComboBoxTiposArchivosReportesEstadoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoCuota(
			JComboBox jComboBoxTiposArchivosReportesEstadoCuota) {
		this.jComboBoxTiposArchivosReportesEstadoCuota = jComboBoxTiposArchivosReportesEstadoCuota;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoCuota() {
		return this.jComboBoxTiposReportesEstadoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoCuota(
			JComboBox jComboBoxTiposReportesEstadoCuota) {
		this.jComboBoxTiposReportesEstadoCuota = jComboBoxTiposReportesEstadoCuota;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoCuota() {
	//	return jComboBoxTiposReportesDinamicoEstadoCuota;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoCuota(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoCuota) {
	//	this.jComboBoxTiposReportesDinamicoEstadoCuota = jComboBoxTiposReportesDinamicoEstadoCuota;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoCuota() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoCuota;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoCuota(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCuota) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota = jComboBoxTiposArchivosReportesDinamicoEstadoCuota;
	//}
	
	public void setBorderResaltarTiposReportesEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoCuota() {
		return this.jComboBoxTiposGraficosReportesEstadoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoCuota(
			JComboBox jComboBoxTiposGraficosReportesEstadoCuota) {
		this.jComboBoxTiposGraficosReportesEstadoCuota = jComboBoxTiposGraficosReportesEstadoCuota;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoCuota() {
		return this.jComboBoxTiposPaginacionEstadoCuota;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoCuota(
			JComboBox jComboBoxTiposPaginacionEstadoCuota) {
		this.jComboBoxTiposPaginacionEstadoCuota = jComboBoxTiposPaginacionEstadoCuota;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoCuota .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoCuota() {
		return this.jComboBoxTiposRelacionesEstadoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCuota() {
		return this.jComboBoxTiposAccionesEstadoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCuota(
			JComboBox jComboBoxTiposRelacionesEstadoCuota) {
		this.jComboBoxTiposRelacionesEstadoCuota = jComboBoxTiposRelacionesEstadoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCuota(
			JComboBox jComboBoxTiposAccionesEstadoCuota) {
		this.jComboBoxTiposAccionesEstadoCuota = jComboBoxTiposAccionesEstadoCuota;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoCuota .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoCuota() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoCuota .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoCuota() {
	//	return jCheckBoxConGraficoDinamicoEstadoCuota;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoCuota(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoCuota) {
	//	this.jCheckBoxConGraficoDinamicoEstadoCuota = jCheckBoxConGraficoDinamicoEstadoCuota;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoCuota() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoCuota.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoCuota .setBorder(borderResaltar);		
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
		this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
		
		this.estadocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocuotaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoCuotaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Cuota MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoCuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoCuota= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"nuevo","nuevo","Nuevo"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"duplicar","duplicar","Duplicar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"copiar","copiar","Copiar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"ver_form","ver_form","Ver"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"recargar","recargar","Recargar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoCuota,this.jTtoolBarEstadoCuota,
							"cerrar","cerrar","Salir"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoCuota=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoCuota;
			
				this.jButtonProcesarInformacionToolBarEstadoCuota=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoCuota;
				
		//protected JButton jButtonModificarToolBarEstadoCuota;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoCuota=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoCuota=new JMenuMe("General");
		this.jmenuArchivoEstadoCuota=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoCuota=new JMenuMe("Acciones");
		this.jmenuDatosEstadoCuota=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCuota= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCuota.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCuota,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoCuota= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoCuota.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoCuota,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoCuota= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoCuota.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoCuota,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoCuota= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCuota.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCuota,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoCuota= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoCuota.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoCuota,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoCuota= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoCuota.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoCuota,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoCuota= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoCuota.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoCuota,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoCuota= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoCuota.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoCuota,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoCuota= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoCuota.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoCuota,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoCuota= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoCuota.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoCuota,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoCuota= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoCuota.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoCuota,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoCuota= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoCuota.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoCuota,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCuota,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoCuota= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoCuota.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoCuota,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCuota,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoCuota= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoCuota.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoCuota,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoCuota.add(this.jMenuItemCerrarEstadoCuota);
			
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemNuevoEstadoCuota);
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemNuevoGuardarCambiosEstadoCuota);
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemNuevoRelacionesEstadoCuota);
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemGuardarCambiosTablaEstadoCuota);		
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemDuplicarEstadoCuota);		
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemCopiarEstadoCuota);		
			this.jmenuAccionesEstadoCuota.add(this.jMenuItemVerFormEstadoCuota);		
			
			this.jmenuDatosEstadoCuota.add(this.jMenuItemRecargarInformacionEstadoCuota);				
			this.jmenuDatosEstadoCuota.add(this.jMenuItemAnterioresEstadoCuota);				
			this.jmenuDatosEstadoCuota.add(this.jMenuItemSiguientesEstadoCuota);				
			this.jmenuDatosEstadoCuota.add(this.jMenuItemAbrirOrderByEstadoCuota);				
			this.jmenuDatosEstadoCuota.add(this.jMenuItemMostrarOcultarEstadoCuota);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoCuota.add(this.jMenuItemGuardarCambiosEstadoCuota);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoCuota.add(this.jmenuArchivoEstadoCuota);		
			this.jmenuBarEstadoCuota.add(this.jmenuAccionesEstadoCuota);		
			this.jmenuBarEstadoCuota.add(this.jmenuDatosEstadoCuota);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoCuota);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoCuota() {
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
			//this.jInternalFrameDetalleEstadoCuota = new EstadoCuotaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Cuota DATOS");
			this.jInternalFrameDetalleFormEstadoCuota = new EstadoCuotaDetalleFormJInternalFrame(jDesktopPane,this.estadocuotaSessionBean.getConGuardarRelaciones(),this.estadocuotaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoCuota = null;//new EstadoCuotaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCuota= new GridBagLayout();
		
		
		this.jTableDatosEstadoCuota = new JTableMe();      
		
		String sToolTipEstadoCuota="";
		sToolTipEstadoCuota=EstadoCuotaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCuota+="(Nomina.EstadoCuota)";
		}
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCuota+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoCuota.setToolTipText(sToolTipEstadoCuota);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoCuota);
		this.jTableDatosEstadoCuota.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoCuota.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoCuota.setRowSelectionAllowed(true);
		this.jTableDatosEstadoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoCuota,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoCuota = new JButtonMe();
		this.jButtonDuplicarEstadoCuota = new JButtonMe();
		this.jButtonCopiarEstadoCuota = new JButtonMe();
		this.jButtonVerFormEstadoCuota = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoCuota = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoCuota = new JButtonMe();
		this.jButtonCerrarEstadoCuota = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCuota = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoCuota = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Cuota";
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuotas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCuota.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCuota.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoCuota=new ReporteDinamicoJInternalFrame(EstadoCuotaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoCuota();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoCuota=new ImportacionJInternalFrame(EstadoCuotaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoCuota();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoCuota = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoCuota.setText("Orden");
		this.jButtonAbrirOrderByEstadoCuota.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCuota,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuota,false,this);
			
			//this.cargarOrderByEstadoCuota(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuota,true,this);
			
			//this.cargarOrderByEstadoCuota(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoCuota.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoCuota.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoCuota.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoCuota.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCuota.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCuota.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoCuota.setText("Nuevo");
		this.jButtonDuplicarEstadoCuota.setText("Duplicar");
		this.jButtonCopiarEstadoCuota.setText("Copiar");
		this.jButtonVerFormEstadoCuota.setText("Ver");
		this.jButtonNuevoRelacionesEstadoCuota.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoCuota.setText("Guardar");
		this.jButtonCerrarEstadoCuota.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCuota,"nuevo_button","Nuevo",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoCuota,"duplicar_button","Duplicar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoCuota,"copiar_button","Copiar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoCuota,"ver_form","Ver",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoCuota,"nuevorelaciones_button","Nuevo Rel",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCuota,"guardarcambiostabla_button","Guardar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCuota,"cerrar_button","Salir",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoCuota.setToolTipText("Nuevo"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoCuota.setToolTipText("Duplicar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoCuota.setToolTipText("Copiar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoCuota.setToolTipText("Ver"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoCuota.setToolTipText("Nuevo Rel"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoCuota.setToolTipText("Guardar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCuota.setToolTipText("Salir"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCuota";
		inputMap = this.jButtonNuevoEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCuota"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoCuota";
		inputMap = this.jButtonDuplicarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoCuota"));
		
		//COPIAR
		sMapKey = "CopiarEstadoCuota";
		inputMap = this.jButtonCopiarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoCuota"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoCuota";
		inputMap = this.jButtonVerFormEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoCuota"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoCuota";
		inputMap = this.jButtonNuevoRelacionesEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoCuota"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoCuota";
		inputMap = this.jButtonModificarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoCuota"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoCuota";
		inputMap = this.jButtonCerrarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCuota"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCuota";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCuota"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoCuota.setName("jPanelParametrosReportesEstadoCuota"); 
		
		this.jPanelParametrosReportesAccionesEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoCuota.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoCuota.setName("jPanelParametrosReportesAccionesEstadoCuota"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoCuota = new JButtonMe();
		this.jButtonRecargarInformacionEstadoCuota.setText("Recargar");
		this.jButtonRecargarInformacionEstadoCuota.setToolTipText("Recargar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoCuota,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoCuota = new JButtonMe();
		this.jButtonProcesarInformacionEstadoCuota.setText("Procesar");
		this.jButtonProcesarInformacionEstadoCuota.setToolTipText("Procesar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoCuota.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoCuota.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCuota.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCuota.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCuota.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoCuota.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCuota.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoCuota.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCuota.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoCuota.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoCuota.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoCuota.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoCuota.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoCuota.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCuota.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCuota.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoCuota.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoCuota.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoCuota=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoCuota.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCuota.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCuota.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoCuota = new JLabelMe();
		
		this.jLabelAccionesEstadoCuota.setText("Acciones");		
		this.jLabelAccionesEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoCuota = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoCuota.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoCuota.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoCuota = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoCuota.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoCuota.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoCuota = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoCuota.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoCuota.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoCuota = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoCuota.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoCuota.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoCuota = new JButtonMe();
		//this.jButtonAnterioresEstadoCuota.setText("<<");
        this.jButtonAnterioresEstadoCuota.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoCuota,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoCuota = new JButtonMe();
		//this.jButtonSiguientesEstadoCuota.setText(">>");
        this.jButtonSiguientesEstadoCuota.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoCuota,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoCuota = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoCuota.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoCuota.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoCuota,"nuevoguardarcambios_button","Nue",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoCuota";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoCuota"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoCuota";
		inputMap = this.jButtonRecargarInformacionEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoCuota"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoCuota";
		inputMap = this.jButtonSiguientesEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoCuota"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoCuota";
		inputMap = this.jButtonAnterioresEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoCuota"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoCuota();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoCuota.setMinimumSize(new Dimension(this.getWidth(),EstadoCuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCuotaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCuota.setMaximumSize(new Dimension(this.getWidth(),EstadoCuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCuotaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCuota.setPreferredSize(new Dimension(this.getWidth(),EstadoCuotaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCuotaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoCuota = new GridBagLayout();

			this.jPanelPaginacionEstadoCuota.setLayout(gridaBagLayoutPaginacionEstadoCuota);						
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 0;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoCuota.add(this.jButtonAnterioresEstadoCuota, this.gridBagConstraintsEstadoCuota);
					
						
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCuota.gridy = 0;
			
			this.jPanelPaginacionEstadoCuota.add(this.jButtonNuevoGuardarCambiosEstadoCuota, this.gridBagConstraintsEstadoCuota);
						
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCuota.gridy = 0;
			this.jPanelPaginacionEstadoCuota.add(this.jButtonSiguientesEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 1;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuota.add(this.jButtonNuevoEstadoCuota, this.gridBagConstraintsEstadoCuota);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCuota.gridy = 1;
				this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoCuota.add(this.jButtonNuevoRelacionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
			}
			
			
			if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCuota.gridy = 1;
				this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoCuota.add(this.jButtonGuardarCambiosTablaEstadoCuota, this.gridBagConstraintsEstadoCuota);
			}
			
			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 1;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuota.add(this.jButtonDuplicarEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 1;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuota.add(this.jButtonCopiarEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 1;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuota.add(this.jButtonVerFormEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 1;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoCuota.add(this.jButtonCerrarEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
		
		
		this.jButtonRecargarInformacionEstadoCuota.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCuota.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCuota.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoCuota.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCuota.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCuota.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoCuota.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCuota.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCuota.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoCuota.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCuota.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCuota.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoCuota.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCuota.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCuota.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoCuota.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCuota.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCuota.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoCuota.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCuota.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCuota.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoCuota.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCuota.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCuota.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoCuota = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoCuota = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoCuota = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoCuota.setLayout(gridaBagParametrosReportesEstadoCuota);
			this.jPanelParametrosReportesAccionesEstadoCuota.setLayout(gridaBagParametrosReportesAccionesEstadoCuota);
			
			
			this.jPanelParametrosAuxiliar1EstadoCuota.setLayout(gridaBagParametrosAuxiliar1EstadoCuota);
			this.jPanelParametrosAuxiliar2EstadoCuota.setLayout(gridaBagParametrosAuxiliar2EstadoCuota);
			this.jPanelParametrosAuxiliar3EstadoCuota.setLayout(gridaBagParametrosAuxiliar3EstadoCuota);
			this.jPanelParametrosAuxiliar4EstadoCuota.setLayout(gridaBagParametrosAuxiliar4EstadoCuota);
			//this.jPanelParametrosAuxiliar5EstadoCuota.setLayout(gridaBagParametrosAuxiliar2EstadoCuota);			
			
			
			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuota.add(this.jButtonRecargarInformacionEstadoCuota, this.gridBagConstraintsEstadoCuota);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCuota.add(this.jComboBoxTiposPaginacionEstadoCuota, this.gridBagConstraintsEstadoCuota);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCuota.add(this.jCheckBoxConAltoMaximoTablaEstadoCuota, this.gridBagConstraintsEstadoCuota);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCuota.add(this.jComboBoxTiposArchivosReportesEstadoCuota, this.gridBagConstraintsEstadoCuota);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuota.add(this.jPanelParametrosAuxiliar1EstadoCuota, this.gridBagConstraintsEstadoCuota);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoCuota.add(this.jComboBoxTiposReportesEstadoCuota, this.gridBagConstraintsEstadoCuota);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuota.add(this.jPanelParametrosAuxiliar4EstadoCuota, this.gridBagConstraintsEstadoCuota);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuota.add(this.jComboBoxTiposReportesEstadoCuota, this.gridBagConstraintsEstadoCuota);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCuota.add(this.jCheckBoxGenerarReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuota.add(this.jPanelParametrosAuxiliar2EstadoCuota, this.gridBagConstraintsEstadoCuota);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCuota.add(this.jLabelAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoCuota.add(this.jButtonAbrirOrderByEstadoCuota, this.gridBagConstraintsEstadoCuota);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuota.add(this.jComboBoxTiposSeleccionarEstadoCuota, this.gridBagConstraintsEstadoCuota);			
			
			
			/*
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuota.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCuota.add(this.jCheckBoxSeleccionarTodosEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCuota.add(this.jCheckBoxSeleccionarTodosEstadoCuota, this.gridBagConstraintsEstadoCuota);															
				
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuota.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCuota.add(this.jCheckBoxSeleccionadosEstadoCuota, this.gridBagConstraintsEstadoCuota);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuota.add(this.jPanelParametrosAuxiliar3EstadoCuota, this.gridBagConstraintsEstadoCuota);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuota.add(this.jComboBoxTiposRelacionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
				
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuota.add(this.jComboBoxTiposAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
	
				
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuota.add(this.jTextFieldValorCampoGeneralEstadoCuota, this.gridBagConstraintsEstadoCuota);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoCuota = new GridBagLayout();

			this.jScrollPanelDatosEstadoCuota.setLayout(gridaBagLayoutDatosEstadoCuota);
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = 0;
			this.gridBagConstraintsEstadoCuota.gridx = 0;
			
			this.jScrollPanelDatosEstadoCuota.add(this.jTableDatosEstadoCuota, this.gridBagConstraintsEstadoCuota);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoCuota.setViewportView(this.jTableDatosEstadoCuota);
		this.jTableDatosEstadoCuota.setFillsViewportHeight(true);
		this.jTableDatosEstadoCuota.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoCuota= new GridBagLayout();
		this.jPanelAccionesEstadoCuota.setLayout(gridaBagLayoutAccionesEstadoCuota);
		
		
		/*	
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = 0;
		this.gridBagConstraintsEstadoCuota.gridx = 0;
			
		this.jPanelAccionesEstadoCuota.add(this.jButtonNuevoEstadoCuota, this.gridBagConstraintsEstadoCuota);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCuota = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCuota);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCuota.gridx = 0;		
			//this.gridBagConstraintsEstadoCuota.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCuota.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoCuota, this.gridBagConstraintsEstadoCuota);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoCuota.gridx = 0;		
		//this.gridBagConstraintsEstadoCuota.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoCuota.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoCuota);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoCuota, this.gridBagConstraintsEstadoCuota);								
		
		
		/*
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
		*/		
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCuota.gridx =0;
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCuota.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCuota, this.gridBagConstraintsEstadoCuota);
				
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoCuota, this.gridBagConstraintsEstadoCuota);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoCuota= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCuota = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoCuota.setLayout(gridaBagLayoutBusquedasParametrosEstadoCuota);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoCuota=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
			
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
			
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoCuota;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoCuota() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoCuota = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoCuota.setName("jPanelReporteDinamicoEstadoCuota"); 
		
		this.jPanelReporteDinamicoEstadoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoCuota.setLayout(gridaBagLayoutReporteDinamicoEstadoCuota);
		
		
		this.jInternalFrameReporteDinamicoEstadoCuota= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoCuota = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCuota= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoCuota.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoCuota.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoCuota.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoCuota.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoCuota.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuotas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoCuota = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoCuota.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCuota.add(this.jLabelColumnasSelectReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoCuota = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoCuota.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoCuota.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCuota.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoCuota=new JScrollPane(this.jListColumnasSelectReporteEstadoCuota);
			
			this.jScrollColumnasSelectReporteEstadoCuota.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCuota.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCuota.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCuota.add(this.jListColumnasSelectReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
		this.jPanelReporteDinamicoEstadoCuota.add(this.jScrollColumnasSelectReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoCuota = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoCuota.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCuota.add(this.jLabelRelacionesSelectReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoCuota = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoCuota.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoCuota.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoCuota.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCuota.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCuota.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoCuota=new JScrollPane(this.jListRelacionesSelectReporteEstadoCuota);
			
			this.jScrollRelacionesSelectReporteEstadoCuota.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCuota.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCuota.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCuota.add(this.jListRelacionesSelectReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
		this.jPanelReporteDinamicoEstadoCuota.add(this.jScrollRelacionesSelectReporteEstadoCuota, this.gridBagConstraintsEstadoCuota);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoCuota = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoCuota = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoCuota = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoCuota = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoCuota.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoCuota = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoCuota.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCuota.add(this.jLabelGenerarExcelReporteDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCuota = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoCuota.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoCuota,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoCuota.setToolTipText("Generar EXCEL"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoCuota.add(this.jButtonGenerarExcelReporteDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuota.add(this.jComboBoxTiposReportesDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoCuota = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoCuota.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCuota.add(this.jLabelTiposArchivoReporteDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuota.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoCuota = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoCuota.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoCuota,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoCuota.setToolTipText("Generar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuota.add(this.jButtonGenerarReporteDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoCuota = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoCuota.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoCuota,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoCuota.setToolTipText("Cancelar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuota.add(this.jButtonCerrarReporteDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoCuota = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoCuota= new JScrollPane(jPanelReporteDinamicoEstadoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoCuota.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCuota.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCuota.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuotas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuota.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoCuota.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoCuota);
		this.jInternalFrameReporteDinamicoEstadoCuota.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoCuota, this.gridBagConstraintsEstadoCuota);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoCuota() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoCuota = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoCuota.setName("jPanelImportacionEstadoCuota"); 
		
		this.jPanelImportacionEstadoCuota.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCuota.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCuota.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoCuota.setLayout(gridaBagLayoutImportacionEstadoCuota);
		
		
		this.jInternalFrameImportacionEstadoCuota= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoCuota= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoCuota = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCuota= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCuota.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoCuota.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCuota.setResizable(true);
	    this.jInternalFrameImportacionEstadoCuota.setClosable(true);
	    this.jInternalFrameImportacionEstadoCuota.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCuota.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCuota.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoCuota.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCuota.setResizable(true);
	    this.jInternalFrameImportacionEstadoCuota.setClosable(true);
	    this.jInternalFrameImportacionEstadoCuota.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoCuota.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCuota.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCuota.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuotas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoCuota = new JLabelMe();

		this.jLabelArchivoImportacionEstadoCuota.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCuota.add(this.jLabelArchivoImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoCuota = new JFileChooser();		
		this.jFileChooserImportacionEstadoCuota.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoCuota = new JButtonMe();
		this.jButtonAbrirImportacionEstadoCuota.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoCuota,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoCuota.setToolTipText("Generar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuota.add(this.jButtonAbrirImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoCuota = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoCuota.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCuota.add(this.jLabelPathArchivoImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoCuota=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoCuota.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCuota.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCuota.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuota.add(this.jTextFieldPathArchivoImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoCuota = new JButtonMe();
		this.jButtonGenerarImportacionEstadoCuota.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoCuota,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoCuota.setToolTipText("Generar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuota.add(this.jButtonGenerarImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoCuota = new JButtonMe();
		this.jButtonCerrarImportacionEstadoCuota.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoCuota,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoCuota.setToolTipText("Cancelar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuota.add(this.jButtonCerrarImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoCuota = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoCuota= new JScrollPane(jPanelImportacionEstadoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoCuota.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoCuota.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoCuota);
		this.jInternalFrameImportacionEstadoCuota.getContentPane().add(this.jScrollPanelImportacionEstadoCuota, this.gridBagConstraintsEstadoCuota);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoCuota(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoCuota = new JButtonMe();
			this.jButtonAbrirOrderByEstadoCuota.setText("Orden");
			this.jButtonAbrirOrderByEstadoCuota.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCuota,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoCuota";
			inputMap = this.jButtonAbrirOrderByEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoCuota"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoCuota = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoCuota.setName("jPanelOrderByEstadoCuota"); 
			
			this.jPanelOrderByEstadoCuota.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCuota.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCuota.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoCuota.setLayout(gridaBagLayoutOrderByEstadoCuota);
			
			
			this.jTableDatosEstadoCuotaOrderBy = new JTableMe();        
			this.jTableDatosEstadoCuotaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoCuotaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoCuotaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoCuotaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoCuotaOrderBy.setViewportView(this.jTableDatosEstadoCuotaOrderBy);
			this.jTableDatosEstadoCuotaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoCuotaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoCuota= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoCuota= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoCuota = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoCuota= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoCuota.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoCuota.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoCuota.setTitle("Orden");
			this.jInternalFrameOrderByEstadoCuota.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoCuota.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoCuota.setResizable(true);
			this.jInternalFrameOrderByEstadoCuota.setClosable(true);
			this.jInternalFrameOrderByEstadoCuota.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoCuota.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCuota.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCuota.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuotas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoCuota.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoCuota.ipady =150;
				
			this.jPanelOrderByEstadoCuota.add(jScrollPanelDatosEstadoCuotaOrderBy, this.gridBagConstraintsEstadoCuota);//this.jTableDatosEstadoCuotaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoCuota = new JButtonMe();
			this.jButtonCerrarOrderByEstadoCuota.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoCuota,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoCuota.setToolTipText("Cancelar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoCuota.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoCuota.add(this.jButtonCerrarOrderByEstadoCuota, this.gridBagConstraintsEstadoCuota);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoCuota = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoCuota= new JScrollPane(jPanelOrderByEstadoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoCuota.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoCuota.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoCuota.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoCuota);
			
			this.jInternalFrameOrderByEstadoCuota.getContentPane().add(this.jScrollPanelOrderByEstadoCuota, this.gridBagConstraintsEstadoCuota);			
		
		} else {
			this.jButtonAbrirOrderByEstadoCuota = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadocuotaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoCuota.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoCuota.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoCuota.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoCuota.getRowHeight();//EstadoCuotaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCuota.isSelected()) {
					iHeightTable=EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCuota.isSelected()) {
					iHeightTable=EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoCuotaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoCuota.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCuota.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCuota.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoCuota.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCuota.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCuota.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoCuota!=null && this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy()!=null) {
			//if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoCuota.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoCuota.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoCuota.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoCuota.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCuota.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCuota.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadocuotaLogic.getEstadoCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocuotas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoCuota> TraerEstadoCuotaBeans(List<EstadoCuota> estadocuotas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoCuota estadocuota:estadocuotas) {
					
				if(!(EstadoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadocuota.setsDetalleGeneralEntityReporte(EstadoCuotaConstantesFunciones.getEstadoCuotaDescripcion(estadocuota));
										
						
					
					

					if(estadocuota.getCuotas()!=null && Funciones.existeClass(classes,Cuota.class)) {
						try{estadocuota.setcuotasDescripcionReporte(new JRBeanCollectionDataSource(CuotaJInternalFrame.TraerCuotaBeans(estadocuota.getCuotas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadocuota.setsDetalleGeneralEntityReporte(estadocuota.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadocuotabeans.add(estadocuotabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadocuotas;
    }
	//PARA REPORTES FIN
}
