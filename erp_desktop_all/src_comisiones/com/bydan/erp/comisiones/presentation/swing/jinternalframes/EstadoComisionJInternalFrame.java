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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;



import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.EstadoComisionConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class EstadoComisionJInternalFrame extends EstadoComisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoComision;
	
	protected JMenuBar jmenuBarEstadoComision;
	
	protected JMenu jmenuEstadoComision;
	protected JMenu jmenuDatosEstadoComision;
	protected JMenu jmenuArchivoEstadoComision;
	protected JMenu jmenuAccionesEstadoComision;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoComision;	
	protected GridBagConstraints gridBagConstraintsEstadoComision;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoComisionDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoComision;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoComision;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoComision;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoComisionSessionBean estadocomisionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoComision> estadocomisions;		
	public List<EstadoComision> estadocomisionsEliminados;	
	public List<EstadoComision> estadocomisionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoComision;		
	protected JButton jButtonAbrirOrderByEstadoComision;
	
	
	//protected JPanel jPanelOrderByEstadoComision;
	//public JScrollPane jScrollPanelOrderByEstadoComision;	
	//protected JButton jButtonCerrarOrderByEstadoComision;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoComisionLogic estadocomisionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoComision;
	public JScrollPane jScrollPanelDatosEdicionEstadoComision;
	public JScrollPane jScrollPanelDatosGeneralEstadoComision;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoComisionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoComision;
	//public JScrollPane jScrollPanelImportacionEstadoComision;
	
	
	
	protected JPanel jPanelAccionesEstadoComision;
	
    protected JPanel jPanelPaginacionEstadoComision;
    protected JPanel jPanelParametrosReportesEstadoComision;
	protected JPanel jPanelParametrosReportesAccionesEstadoComision;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoComision;
	protected JPanel jPanelParametrosAuxiliar2EstadoComision;
	protected JPanel jPanelParametrosAuxiliar3EstadoComision;
	protected JPanel jPanelParametrosAuxiliar4EstadoComision;
	//protected JPanel jPanelParametrosAuxiliar5EstadoComision;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoComision;
	//protected JPanel jPanelImportacionEstadoComision;
	
	
	public JTable jTableDatosEstadoComision;
	
	
	
	//public JTable jTableDatosEstadoComisionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoComision;
	protected JButton jButtonDuplicarEstadoComision;
	protected JButton jButtonCopiarEstadoComision;
	protected JButton jButtonVerFormEstadoComision;
	protected JButton jButtonNuevoRelacionesEstadoComision;
	protected JButton jButtonModificarEstadoComision;
	
    protected JButton jButtonGuardarCambiosTablaEstadoComision;
	protected JButton jButtonCerrarEstadoComision;
	
	
	protected JButton jButtonRecargarInformacionEstadoComision;
	protected JButton jButtonProcesarInformacionEstadoComision;
	
	
	protected JButton jButtonAnterioresEstadoComision;
	protected JButton jButtonSiguientesEstadoComision;
	protected JButton jButtonNuevoGuardarCambiosEstadoComision;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoComision;
	//protected JButton jButtonCerrarReporteDinamicoEstadoComision;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoComision;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoComision;
	//protected JButton jButtonGenerarImportacionEstadoComision;
	//protected JButton jButtonCerrarImportacionEstadoComision;
	//protected JFileChooser jFileChooserImportacionEstadoComision;
	//protected File fileImportacionEstadoComision;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoComision;
	protected JButton jButtonDuplicarToolBarEstadoComision;
	protected JButton jButtonNuevoRelacionesToolBarEstadoComision;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoComision;
	protected JButton jButtonCopiarToolBarEstadoComision;
	protected JButton jButtonVerFormToolBarEstadoComision;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoComision;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoComision;
	protected JButton jButtonCerrarToolBarEstadoComision;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoComision;
	protected JButton jButtonProcesarInformacionToolBarEstadoComision;
	protected JButton jButtonAnterioresToolBarEstadoComision;
	protected JButton jButtonSiguientesToolBarEstadoComision;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoComision;
	protected JButton jButtonAbrirOrderByToolBarEstadoComision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoComision;
	protected JMenuItem jMenuItemDuplicarEstadoComision;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoComision;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoComision;
	protected JMenuItem jMenuItemCopiarEstadoComision;
	protected JMenuItem jMenuItemVerFormEstadoComision;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoComision;
	protected JMenuItem jMenuItemCerrarEstadoComision;
	protected JMenuItem jMenuItemDetalleCerrarEstadoComision;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoComision;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoComision;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoComision;
	protected JMenuItem jMenuItemProcesarInformacionEstadoComision;
	protected JMenuItem jMenuItemAnterioresEstadoComision;
	protected JMenuItem jMenuItemSiguientesEstadoComision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoComision;
	protected JMenuItem jMenuItemAbrirOrderByEstadoComision;
	protected JMenuItem jMenuItemMostrarOcultarEstadoComision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoComision;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoComision;
	protected JCheckBox jCheckBoxSeleccionadosEstadoComision;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoComision;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoComision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoComision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoComision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoComision;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoComision;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoComision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoComision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoComision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoComision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoComision;
	protected JTextField jTextFieldValorCampoGeneralEstadoComision;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoComision;
	//public JList<Reporte> jListColumnasSelectReporteEstadoComision;
	//public JScrollPane jScrollColumnasSelectReporteEstadoComision;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoComision;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoComision;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoComision;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoComision;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoComision;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoComision;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoComision;
	
		
	//public JLabel jLabelArchivoImportacionEstadoComision;	
	//public JLabel jLabelPathArchivoImportacionEstadoComision;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoComision;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoComision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoComision;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoComision;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoComision;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoComision;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoComision;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoComision;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoComision;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoComision;	
	
	
	
	
	
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
	public EstadoComisionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoComision)	{
		this.jButtonRecargarInformacionEstadoComision = jButtonRecargarInformacionEstadoComision;
	}
	
	public JButton getjButtonProcesarInformacionEstadoComision() {
		return this.jButtonProcesarInformacionEstadoComision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoComision)	{
		this.jButtonProcesarInformacionEstadoComision = jButtonProcesarInformacionEstadoComision;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoComision() {
		return this.jButtonRecargarInformacionEstadoComision;
	}
	
	
	public List<EstadoComision> getestadocomisions() {
		return this.estadocomisions;
	}

	public void setestadocomisions(List<EstadoComision> estadocomisions) {
		this.estadocomisions = estadocomisions;
	}
	
	public List<EstadoComision> getestadocomisionsAux() {
		return this.estadocomisionsAux;
	}

	public void setestadocomisionsAux(List<EstadoComision> estadocomisionsAux) {
		this.estadocomisionsAux = estadocomisionsAux;
	}
	
	public List<EstadoComision> getestadocomisionsEliminados() {
		return this.estadocomisionsEliminados;
	}

	public void setEstadoComisionsEliminados(List<EstadoComision> estadocomisionsEliminados) {
		this.estadocomisionsEliminados = estadocomisionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoComision() {
		return jComboBoxTiposSeleccionarEstadoComision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoComision(
			JComboBox jComboBoxTiposSeleccionarEstadoComision) {
		this.jComboBoxTiposSeleccionarEstadoComision = jComboBoxTiposSeleccionarEstadoComision;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoComision .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoComision() {
		return jTextFieldValorCampoGeneralEstadoComision;
	}

	public void setjTextFieldValorCampoGeneralEstadoComision(
			JTextField jTextFieldValorCampoGeneralEstadoComision) {
		this.jTextFieldValorCampoGeneralEstadoComision = jTextFieldValorCampoGeneralEstadoComision;
	}

	public void setBorderResaltarValorCampoGeneralEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoComision .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoComision() {
		return this.jCheckBoxSeleccionarTodosEstadoComision;
	}

	public void setjCheckBoxSeleccionarTodosEstadoComision(
			JCheckBox jCheckBoxSeleccionarTodosEstadoComision) {
		this.jCheckBoxSeleccionarTodosEstadoComision = jCheckBoxSeleccionarTodosEstadoComision;
	}

	public void setBorderResaltarSeleccionarTodosEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoComision .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoComision() {
		return this.jCheckBoxSeleccionadosEstadoComision;
	}

	public void setjCheckBoxSeleccionadosEstadoComision(
			JCheckBox jCheckBoxSeleccionadosEstadoComision) {
		this.jCheckBoxSeleccionadosEstadoComision = jCheckBoxSeleccionadosEstadoComision;
	}
	
	public void setBorderResaltarSeleccionadosEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoComision .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoComision() {
		return this.jComboBoxTiposArchivosReportesEstadoComision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoComision(
			JComboBox jComboBoxTiposArchivosReportesEstadoComision) {
		this.jComboBoxTiposArchivosReportesEstadoComision = jComboBoxTiposArchivosReportesEstadoComision;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoComision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoComision() {
		return this.jComboBoxTiposReportesEstadoComision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoComision(
			JComboBox jComboBoxTiposReportesEstadoComision) {
		this.jComboBoxTiposReportesEstadoComision = jComboBoxTiposReportesEstadoComision;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoComision() {
	//	return jComboBoxTiposReportesDinamicoEstadoComision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoComision(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoComision) {
	//	this.jComboBoxTiposReportesDinamicoEstadoComision = jComboBoxTiposReportesDinamicoEstadoComision;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoComision() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoComision;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoComision(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoComision) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoComision = jComboBoxTiposArchivosReportesDinamicoEstadoComision;
	//}
	
	public void setBorderResaltarTiposReportesEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoComision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoComision() {
		return this.jComboBoxTiposGraficosReportesEstadoComision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoComision(
			JComboBox jComboBoxTiposGraficosReportesEstadoComision) {
		this.jComboBoxTiposGraficosReportesEstadoComision = jComboBoxTiposGraficosReportesEstadoComision;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoComision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoComision() {
		return this.jComboBoxTiposPaginacionEstadoComision;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoComision(
			JComboBox jComboBoxTiposPaginacionEstadoComision) {
		this.jComboBoxTiposPaginacionEstadoComision = jComboBoxTiposPaginacionEstadoComision;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoComision .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoComision() {
		return this.jComboBoxTiposRelacionesEstadoComision;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoComision() {
		return this.jComboBoxTiposAccionesEstadoComision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoComision(
			JComboBox jComboBoxTiposRelacionesEstadoComision) {
		this.jComboBoxTiposRelacionesEstadoComision = jComboBoxTiposRelacionesEstadoComision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoComision(
			JComboBox jComboBoxTiposAccionesEstadoComision) {
		this.jComboBoxTiposAccionesEstadoComision = jComboBoxTiposAccionesEstadoComision;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoComision .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoComision() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoComision.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoComision .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoComision() {
	//	return jCheckBoxConGraficoDinamicoEstadoComision;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoComision(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoComision) {
	//	this.jCheckBoxConGraficoDinamicoEstadoComision = jCheckBoxConGraficoDinamicoEstadoComision;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoComision() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoComision.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoComision .setBorder(borderResaltar);		
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
		this.estadocomisionSessionBean=new EstadoComisionSessionBean();
		
		this.estadocomisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocomisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocomisionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoComisionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoComisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoComisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoComisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoComisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Comision MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoComisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoComision= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"nuevo","nuevo","Nuevo"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"duplicar","duplicar","Duplicar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"copiar","copiar","Copiar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"ver_form","ver_form","Ver"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"recargar","recargar","Recargar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoComision,this.jTtoolBarEstadoComision,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoComision,this.jTtoolBarEstadoComision,
							"cerrar","cerrar","Salir"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoComision=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoComision;
			
				this.jButtonProcesarInformacionToolBarEstadoComision=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoComision;
				
		//protected JButton jButtonModificarToolBarEstadoComision;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoComision=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoComision=new JMenuMe("General");
		this.jmenuArchivoEstadoComision=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoComision=new JMenuMe("Acciones");
		this.jmenuDatosEstadoComision=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoComision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoComision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoComision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoComision= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoComision.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoComision,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoComision= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoComision.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoComision,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoComision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoComision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoComision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoComision= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoComision.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoComision,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoComision= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoComision.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoComision,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoComision= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoComision.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoComision,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoComision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoComision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoComision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoComision= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoComision.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoComision,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoComision= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoComision.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoComision,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoComision= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoComision.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoComision,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoComision= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoComision.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoComision,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoComision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoComision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoComision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoComision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoComision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoComision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoComision= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoComision.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoComision,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoComision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoComision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoComision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoComision= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoComision.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoComision,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoComision.add(this.jMenuItemCerrarEstadoComision);
			
			this.jmenuAccionesEstadoComision.add(this.jMenuItemNuevoEstadoComision);
			this.jmenuAccionesEstadoComision.add(this.jMenuItemNuevoGuardarCambiosEstadoComision);
			this.jmenuAccionesEstadoComision.add(this.jMenuItemNuevoRelacionesEstadoComision);
			this.jmenuAccionesEstadoComision.add(this.jMenuItemGuardarCambiosTablaEstadoComision);		
			this.jmenuAccionesEstadoComision.add(this.jMenuItemDuplicarEstadoComision);		
			this.jmenuAccionesEstadoComision.add(this.jMenuItemCopiarEstadoComision);		
			this.jmenuAccionesEstadoComision.add(this.jMenuItemVerFormEstadoComision);		
			
			this.jmenuDatosEstadoComision.add(this.jMenuItemRecargarInformacionEstadoComision);				
			this.jmenuDatosEstadoComision.add(this.jMenuItemAnterioresEstadoComision);				
			this.jmenuDatosEstadoComision.add(this.jMenuItemSiguientesEstadoComision);				
			this.jmenuDatosEstadoComision.add(this.jMenuItemAbrirOrderByEstadoComision);				
			this.jmenuDatosEstadoComision.add(this.jMenuItemMostrarOcultarEstadoComision);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoComision.add(this.jMenuItemGuardarCambiosEstadoComision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoComision.add(this.jmenuArchivoEstadoComision);		
			this.jmenuBarEstadoComision.add(this.jmenuAccionesEstadoComision);		
			this.jmenuBarEstadoComision.add(this.jmenuDatosEstadoComision);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoComision);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoComision() {
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
			//this.jInternalFrameDetalleEstadoComision = new EstadoComisionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Comision DATOS");
			this.jInternalFrameDetalleFormEstadoComision = new EstadoComisionDetalleFormJInternalFrame(jDesktopPane,this.estadocomisionSessionBean.getConGuardarRelaciones(),this.estadocomisionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoComision = null;//new EstadoComisionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoComision= new GridBagLayout();
		
		
		this.jTableDatosEstadoComision = new JTableMe();      
		
		String sToolTipEstadoComision="";
		sToolTipEstadoComision=EstadoComisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoComision+="(Comisiones.EstadoComision)";
		}
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoComision+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoComision.setToolTipText(sToolTipEstadoComision);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoComision);
		this.jTableDatosEstadoComision.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoComision.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoComision.setRowSelectionAllowed(true);
		this.jTableDatosEstadoComision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoComision,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoComision = new JButtonMe();
		this.jButtonDuplicarEstadoComision = new JButtonMe();
		this.jButtonCopiarEstadoComision = new JButtonMe();
		this.jButtonVerFormEstadoComision = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoComision = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoComision = new JButtonMe();
		this.jButtonCerrarEstadoComision = new JButtonMe();
		
		this.jScrollPanelDatosEstadoComision = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoComision = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Comision";
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Comisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoComision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoComision.setToolTipText("Acciones");
        this.jPanelAccionesEstadoComision.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoComision=new ReporteDinamicoJInternalFrame(EstadoComisionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoComision();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoComision=new ImportacionJInternalFrame(EstadoComisionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoComision();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoComision = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoComision.setText("Orden");
		this.jButtonAbrirOrderByEstadoComision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoComision,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoComision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoComision,false,this);
			
			//this.cargarOrderByEstadoComision(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoComision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoComision,true,this);
			
			//this.cargarOrderByEstadoComision(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoComision.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoComision.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoComision.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoComision.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoComision.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoComision.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoComision.setText("Nuevo");
		this.jButtonDuplicarEstadoComision.setText("Duplicar");
		this.jButtonCopiarEstadoComision.setText("Copiar");
		this.jButtonVerFormEstadoComision.setText("Ver");
		this.jButtonNuevoRelacionesEstadoComision.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoComision.setText("Guardar");
		this.jButtonCerrarEstadoComision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoComision,"nuevo_button","Nuevo",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoComision,"duplicar_button","Duplicar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoComision,"copiar_button","Copiar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoComision,"ver_form","Ver",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoComision,"nuevorelaciones_button","Nuevo Rel",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoComision,"guardarcambiostabla_button","Guardar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoComision,"cerrar_button","Salir",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoComision.setToolTipText("Nuevo"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoComision.setToolTipText("Duplicar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoComision.setToolTipText("Copiar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoComision.setToolTipText("Ver"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoComision.setToolTipText("Nuevo Rel"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoComision.setToolTipText("Guardar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoComision.setToolTipText("Salir"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoComision";
		inputMap = this.jButtonNuevoEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoComision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoComision"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoComision";
		inputMap = this.jButtonDuplicarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoComision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoComision"));
		
		//COPIAR
		sMapKey = "CopiarEstadoComision";
		inputMap = this.jButtonCopiarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoComision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoComision"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoComision";
		inputMap = this.jButtonVerFormEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoComision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoComision"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoComision";
		inputMap = this.jButtonNuevoRelacionesEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoComision"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoComision";
		inputMap = this.jButtonModificarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoComision"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoComision";
		inputMap = this.jButtonCerrarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoComision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoComision";
		inputMap = this.jButtonGuardarCambiosTablaEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoComision"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoComision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoComision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoComision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoComision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoComision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoComision.setName("jPanelParametrosReportesEstadoComision"); 
		
		this.jPanelParametrosReportesAccionesEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoComision.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoComision.setName("jPanelParametrosReportesAccionesEstadoComision"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoComision = new JButtonMe();
		this.jButtonRecargarInformacionEstadoComision.setText("Recargar");
		this.jButtonRecargarInformacionEstadoComision.setToolTipText("Recargar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoComision,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoComision = new JButtonMe();
		this.jButtonProcesarInformacionEstadoComision.setText("Procesar");
		this.jButtonProcesarInformacionEstadoComision.setToolTipText("Procesar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoComision.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoComision.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoComision.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoComision.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoComision.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoComision.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoComision.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoComision.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoComision.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoComision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoComision.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoComision.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoComision.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoComision.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoComision.setText("Accion");
		this.jComboBoxTiposAccionesEstadoComision.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoComision.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoComision.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoComision=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoComision.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoComision.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoComision.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoComision = new JLabelMe();
		
		this.jLabelAccionesEstadoComision.setText("Acciones");		
		this.jLabelAccionesEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoComision = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoComision.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoComision.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoComision = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoComision.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoComision.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoComision = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoComision.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoComision.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoComision = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoComision.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoComision.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoComision = new JButtonMe();
		//this.jButtonAnterioresEstadoComision.setText("<<");
        this.jButtonAnterioresEstadoComision.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoComision,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoComision = new JButtonMe();
		//this.jButtonSiguientesEstadoComision.setText(">>");
        this.jButtonSiguientesEstadoComision.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoComision,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoComision = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoComision.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoComision.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoComision,"nuevoguardarcambios_button","Nue",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoComision";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoComision"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoComision";
		inputMap = this.jButtonRecargarInformacionEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoComision"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoComision";
		inputMap = this.jButtonSiguientesEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoComision"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoComision";
		inputMap = this.jButtonAnterioresEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoComision"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoComision();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoComision.setMinimumSize(new Dimension(this.getWidth(),EstadoComisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoComisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoComision.setMaximumSize(new Dimension(this.getWidth(),EstadoComisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoComisionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoComision.setPreferredSize(new Dimension(this.getWidth(),EstadoComisionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoComisionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoComision = new GridBagLayout();

			this.jPanelPaginacionEstadoComision.setLayout(gridaBagLayoutPaginacionEstadoComision);						
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 0;
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoComision.add(this.jButtonAnterioresEstadoComision, this.gridBagConstraintsEstadoComision);
					
						
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoComision.gridy = 0;
			
			this.jPanelPaginacionEstadoComision.add(this.jButtonNuevoGuardarCambiosEstadoComision, this.gridBagConstraintsEstadoComision);
						
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoComision.gridy = 0;
			this.jPanelPaginacionEstadoComision.add(this.jButtonSiguientesEstadoComision, this.gridBagConstraintsEstadoComision);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 1;
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoComision.add(this.jButtonNuevoEstadoComision, this.gridBagConstraintsEstadoComision);
						
			
			
			if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoComision = new GridBagConstraints();
				this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoComision.gridy = 1;
				this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoComision.add(this.jButtonGuardarCambiosTablaEstadoComision, this.gridBagConstraintsEstadoComision);
			}
			
			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 1;
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoComision.add(this.jButtonDuplicarEstadoComision, this.gridBagConstraintsEstadoComision);
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 1;
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoComision.add(this.jButtonCopiarEstadoComision, this.gridBagConstraintsEstadoComision);
		
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 1;
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoComision.add(this.jButtonVerFormEstadoComision, this.gridBagConstraintsEstadoComision);
		
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 1;
			this.gridBagConstraintsEstadoComision.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoComision.add(this.jButtonCerrarEstadoComision, this.gridBagConstraintsEstadoComision);
		
		
		
		this.jButtonRecargarInformacionEstadoComision.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoComision.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoComision.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoComision.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoComision.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoComision.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoComision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoComision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoComision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoComision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoComision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoComision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoComision.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoComision.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoComision.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoComision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoComision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoComision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoComision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoComision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoComision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoComision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoComision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoComision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoComision.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoComision.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoComision.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoComision.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoComision.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoComision.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoComision.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoComision.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoComision.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoComision.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoComision.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoComision.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoComision = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoComision = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoComision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoComision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoComision = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoComision = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoComision.setLayout(gridaBagParametrosReportesEstadoComision);
			this.jPanelParametrosReportesAccionesEstadoComision.setLayout(gridaBagParametrosReportesAccionesEstadoComision);
			
			
			this.jPanelParametrosAuxiliar1EstadoComision.setLayout(gridaBagParametrosAuxiliar1EstadoComision);
			this.jPanelParametrosAuxiliar2EstadoComision.setLayout(gridaBagParametrosAuxiliar2EstadoComision);
			this.jPanelParametrosAuxiliar3EstadoComision.setLayout(gridaBagParametrosAuxiliar3EstadoComision);
			this.jPanelParametrosAuxiliar4EstadoComision.setLayout(gridaBagParametrosAuxiliar4EstadoComision);
			//this.jPanelParametrosAuxiliar5EstadoComision.setLayout(gridaBagParametrosAuxiliar2EstadoComision);			
			
			
			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoComision.add(this.jButtonRecargarInformacionEstadoComision, this.gridBagConstraintsEstadoComision);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoComision.add(this.jComboBoxTiposPaginacionEstadoComision, this.gridBagConstraintsEstadoComision);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoComision.add(this.jCheckBoxConAltoMaximoTablaEstadoComision, this.gridBagConstraintsEstadoComision);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoComision.add(this.jComboBoxTiposArchivosReportesEstadoComision, this.gridBagConstraintsEstadoComision);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoComision.add(this.jPanelParametrosAuxiliar1EstadoComision, this.gridBagConstraintsEstadoComision);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoComision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoComision.add(this.jComboBoxTiposReportesEstadoComision, this.gridBagConstraintsEstadoComision);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoComision.add(this.jPanelParametrosAuxiliar4EstadoComision, this.gridBagConstraintsEstadoComision);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoComision.add(this.jComboBoxTiposReportesEstadoComision, this.gridBagConstraintsEstadoComision);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoComision.add(this.jCheckBoxGenerarReporteEstadoComision, this.gridBagConstraintsEstadoComision);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoComision.add(this.jPanelParametrosAuxiliar2EstadoComision, this.gridBagConstraintsEstadoComision);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoComision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoComision.add(this.jLabelAccionesEstadoComision, this.gridBagConstraintsEstadoComision);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoComision = new GridBagConstraints();
				this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoComision.add(this.jButtonAbrirOrderByEstadoComision, this.gridBagConstraintsEstadoComision);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoComision.add(this.jComboBoxTiposSeleccionarEstadoComision, this.gridBagConstraintsEstadoComision);			
			
			
			/*
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoComision.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoComision.add(this.jCheckBoxSeleccionarTodosEstadoComision, this.gridBagConstraintsEstadoComision);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoComision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoComision.add(this.jCheckBoxSeleccionarTodosEstadoComision, this.gridBagConstraintsEstadoComision);															
				
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoComision.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoComision.add(this.jCheckBoxSeleccionadosEstadoComision, this.gridBagConstraintsEstadoComision);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoComision.add(this.jPanelParametrosAuxiliar3EstadoComision, this.gridBagConstraintsEstadoComision);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoComision.add(this.jComboBoxTiposRelacionesEstadoComision, this.gridBagConstraintsEstadoComision);
				
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoComision.add(this.jComboBoxTiposAccionesEstadoComision, this.gridBagConstraintsEstadoComision);
	
				
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoComision.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoComision.add(this.jTextFieldValorCampoGeneralEstadoComision, this.gridBagConstraintsEstadoComision);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoComision = new GridBagLayout();

			this.jScrollPanelDatosEstadoComision.setLayout(gridaBagLayoutDatosEstadoComision);
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = 0;
			this.gridBagConstraintsEstadoComision.gridx = 0;
			
			this.jScrollPanelDatosEstadoComision.add(this.jTableDatosEstadoComision, this.gridBagConstraintsEstadoComision);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoComision.setViewportView(this.jTableDatosEstadoComision);
		this.jTableDatosEstadoComision.setFillsViewportHeight(true);
		this.jTableDatosEstadoComision.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoComision= new GridBagLayout();
		this.jPanelAccionesEstadoComision.setLayout(gridaBagLayoutAccionesEstadoComision);
		
		
		/*	
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = 0;
		this.gridBagConstraintsEstadoComision.gridx = 0;
			
		this.jPanelAccionesEstadoComision.add(this.jButtonNuevoEstadoComision, this.gridBagConstraintsEstadoComision);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoComision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoComision);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();						
			this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoComision.gridx = 0;		
			//this.gridBagConstraintsEstadoComision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoComision.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoComision, this.gridBagConstraintsEstadoComision);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoComision.gridx = 0;		
		//this.gridBagConstraintsEstadoComision.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoComision.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoComision);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoComision, this.gridBagConstraintsEstadoComision);								
		
		
		/*
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoComision, this.gridBagConstraintsEstadoComision);
		*/		
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoComision.gridx =0;
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoComision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoComision, this.gridBagConstraintsEstadoComision);
				
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoComision, this.gridBagConstraintsEstadoComision);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoComision= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoComision = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoComision.setLayout(gridaBagLayoutBusquedasParametrosEstadoComision);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoComision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoComision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoComision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoComision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoComision, this.gridBagConstraintsEstadoComision);
			
			
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoComision, this.gridBagConstraintsEstadoComision);
		
			
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoComision, this.gridBagConstraintsEstadoComision);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoComision;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoComision() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoComision = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoComision.setName("jPanelReporteDinamicoEstadoComision"); 
		
		this.jPanelReporteDinamicoEstadoComision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoComision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoComision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoComision.setLayout(gridaBagLayoutReporteDinamicoEstadoComision);
		
		
		this.jInternalFrameReporteDinamicoEstadoComision= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoComision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoComision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoComision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoComision.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoComision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoComision.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoComision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoComision.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoComision.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoComision.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoComision.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoComision.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoComision.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Comisiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoComision = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoComision.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoComision.add(this.jLabelColumnasSelectReporteEstadoComision, this.gridBagConstraintsEstadoComision);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoComision = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoComision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoComision.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoComision.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoComision.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoComision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoComision=new JScrollPane(this.jListColumnasSelectReporteEstadoComision);
			
			this.jScrollColumnasSelectReporteEstadoComision.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoComision.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoComision.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoComision.add(this.jListColumnasSelectReporteEstadoComision, this.gridBagConstraintsEstadoComision);
		this.jPanelReporteDinamicoEstadoComision.add(this.jScrollColumnasSelectReporteEstadoComision, this.gridBagConstraintsEstadoComision);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoComision = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoComision.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoComision = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoComision.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoComision.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoComision.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoComision.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoComision.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoComision=new JScrollPane(this.jListRelacionesSelectReporteEstadoComision);
			
			this.jScrollRelacionesSelectReporteEstadoComision.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoComision.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoComision.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoComision = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoComision = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoComision = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoComision = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoComision.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoComision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoComision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoComision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoComision = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoComision.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoComision.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoComision.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoComision.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoComision = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoComision.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoComision.add(this.jLabelGenerarExcelReporteDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoComision = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoComision.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoComision,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoComision.setToolTipText("Generar EXCEL"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		//this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoComision.add(this.jButtonGenerarExcelReporteDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoComision.add(this.jComboBoxTiposReportesDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoComision = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoComision.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoComision.add(this.jLabelTiposArchivoReporteDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoComision.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoComision = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoComision.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoComision,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoComision.setToolTipText("Generar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoComision.add(this.jButtonGenerarReporteDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoComision = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoComision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoComision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoComision.setToolTipText("Cancelar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoComision.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoComision.add(this.jButtonCerrarReporteDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoComision = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoComision= new JScrollPane(jPanelReporteDinamicoEstadoComision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoComision.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoComision.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoComision.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Comisiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoComision.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoComision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoComision.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoComision);
		this.jInternalFrameReporteDinamicoEstadoComision.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoComision, this.gridBagConstraintsEstadoComision);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoComision() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoComision = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoComision.setName("jPanelImportacionEstadoComision"); 
		
		this.jPanelImportacionEstadoComision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoComision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoComision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoComision.setLayout(gridaBagLayoutImportacionEstadoComision);
		
		
		this.jInternalFrameImportacionEstadoComision= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoComision= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoComision = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoComision= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoComision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoComision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoComision.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoComision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoComision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoComision.setResizable(true);
	    this.jInternalFrameImportacionEstadoComision.setClosable(true);
	    this.jInternalFrameImportacionEstadoComision.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoComision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoComision.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoComision.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoComision.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoComision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoComision.setResizable(true);
	    this.jInternalFrameImportacionEstadoComision.setClosable(true);
	    this.jInternalFrameImportacionEstadoComision.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoComision.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoComision.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoComision.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Comisiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoComision = new JLabelMe();

		this.jLabelArchivoImportacionEstadoComision.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoComision.add(this.jLabelArchivoImportacionEstadoComision, this.gridBagConstraintsEstadoComision);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoComision = new JFileChooser();		
		this.jFileChooserImportacionEstadoComision.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoComision = new JButtonMe();
		this.jButtonAbrirImportacionEstadoComision.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoComision,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoComision.setToolTipText("Generar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoComision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoComision.add(this.jButtonAbrirImportacionEstadoComision, this.gridBagConstraintsEstadoComision);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoComision = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoComision.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoComision.add(this.jLabelPathArchivoImportacionEstadoComision, this.gridBagConstraintsEstadoComision);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoComision=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoComision.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoComision.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoComision.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoComision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoComision.add(this.jTextFieldPathArchivoImportacionEstadoComision, this.gridBagConstraintsEstadoComision);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoComision = new JButtonMe();
		this.jButtonGenerarImportacionEstadoComision.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoComision,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoComision.setToolTipText("Generar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoComision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoComision.add(this.jButtonGenerarImportacionEstadoComision, this.gridBagConstraintsEstadoComision);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoComision = new JButtonMe();
		this.jButtonCerrarImportacionEstadoComision.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoComision,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoComision.setToolTipText("Cancelar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoComision.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoComision.add(this.jButtonCerrarImportacionEstadoComision, this.gridBagConstraintsEstadoComision);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoComision = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoComision= new JScrollPane(jPanelImportacionEstadoComision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoComision.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoComision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoComision.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoComision);
		this.jInternalFrameImportacionEstadoComision.getContentPane().add(this.jScrollPanelImportacionEstadoComision, this.gridBagConstraintsEstadoComision);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoComision(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoComision = new JButtonMe();
			this.jButtonAbrirOrderByEstadoComision.setText("Orden");
			this.jButtonAbrirOrderByEstadoComision.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoComision,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoComision";
			inputMap = this.jButtonAbrirOrderByEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoComision"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoComision = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoComision.setName("jPanelOrderByEstadoComision"); 
			
			this.jPanelOrderByEstadoComision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoComision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoComision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoComision.setLayout(gridaBagLayoutOrderByEstadoComision);
			
			
			this.jTableDatosEstadoComisionOrderBy = new JTableMe();        
			this.jTableDatosEstadoComisionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoComisionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoComisionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoComisionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoComisionOrderBy.setViewportView(this.jTableDatosEstadoComisionOrderBy);
			this.jTableDatosEstadoComisionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoComisionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoComision= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoComision= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoComision = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoComision= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoComision.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoComision.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoComision.setTitle("Orden");
			this.jInternalFrameOrderByEstadoComision.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoComision.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoComision.setResizable(true);
			this.jInternalFrameOrderByEstadoComision.setClosable(true);
			this.jInternalFrameOrderByEstadoComision.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoComision.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoComision.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoComision.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Comisiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoComision.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoComision.ipady =150;
				
			this.jPanelOrderByEstadoComision.add(jScrollPanelDatosEstadoComisionOrderBy, this.gridBagConstraintsEstadoComision);//this.jTableDatosEstadoComisionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoComision = new JButtonMe();
			this.jButtonCerrarOrderByEstadoComision.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoComision,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoComision.setToolTipText("Cancelar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoComision.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoComision.add(this.jButtonCerrarOrderByEstadoComision, this.gridBagConstraintsEstadoComision);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoComision = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoComision= new JScrollPane(jPanelOrderByEstadoComision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoComision.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoComision.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoComision.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoComision);
			
			this.jInternalFrameOrderByEstadoComision.getContentPane().add(this.jScrollPanelOrderByEstadoComision, this.gridBagConstraintsEstadoComision);			
		
		} else {
			this.jButtonAbrirOrderByEstadoComision = new JButtonMe();
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
			&& this.estadocomisionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoComision.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoComision.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoComision.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoComision.getRowHeight();//EstadoComisionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoComisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoComision.isSelected()) {
					iHeightTable=EstadoComisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoComisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoComisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoComisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoComision.isSelected()) {
					iHeightTable=EstadoComisionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoComisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoComisionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoComision.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoComision.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoComision.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoComision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoComision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoComision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoComision!=null && this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy()!=null) {
			//if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoComision.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoComision.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoComision.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoComision.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoComision.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoComision.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadocomisionLogic.getEstadoComisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocomisions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoComision> TraerEstadoComisionBeans(List<EstadoComision> estadocomisions,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoComision estadocomision:estadocomisions) {
					
				if(!(EstadoComisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoComisionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadocomision.setsDetalleGeneralEntityReporte(EstadoComisionConstantesFunciones.getEstadoComisionDescripcion(estadocomision));
										
						
					
						
					
				} else  {
							
					//estadocomision.setsDetalleGeneralEntityReporte(estadocomision.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadocomisionbeans.add(estadocomisionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadocomisions;
    }
	//PARA REPORTES FIN
}
