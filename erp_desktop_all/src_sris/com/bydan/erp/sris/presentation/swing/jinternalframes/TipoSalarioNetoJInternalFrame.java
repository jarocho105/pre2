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
package com.bydan.erp.sris.presentation.swing.jinternalframes;



import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.TipoSalarioNetoConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class TipoSalarioNetoJInternalFrame extends TipoSalarioNetoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoSalarioNeto;
	
	protected JMenuBar jmenuBarTipoSalarioNeto;
	
	protected JMenu jmenuTipoSalarioNeto;
	protected JMenu jmenuDatosTipoSalarioNeto;
	protected JMenu jmenuArchivoTipoSalarioNeto;
	protected JMenu jmenuAccionesTipoSalarioNeto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSalarioNeto;	
	protected GridBagConstraints gridBagConstraintsTipoSalarioNeto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoSalarioNetoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoSalarioNeto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoSalarioNeto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoSalarioNeto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoSalarioNetoSessionBean tiposalarionetoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoSalarioNeto> tiposalarionetos;		
	public List<TipoSalarioNeto> tiposalarionetosEliminados;	
	public List<TipoSalarioNeto> tiposalarionetosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoSalarioNeto;		
	protected JButton jButtonAbrirOrderByTipoSalarioNeto;
	
	
	//protected JPanel jPanelOrderByTipoSalarioNeto;
	//public JScrollPane jScrollPanelOrderByTipoSalarioNeto;	
	//protected JButton jButtonCerrarOrderByTipoSalarioNeto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoSalarioNetoLogic tiposalarionetoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoSalarioNeto;
	public JScrollPane jScrollPanelDatosEdicionTipoSalarioNeto;
	public JScrollPane jScrollPanelDatosGeneralTipoSalarioNeto;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoSalarioNetoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoSalarioNeto;
	//public JScrollPane jScrollPanelImportacionTipoSalarioNeto;
	
	
	
	protected JPanel jPanelAccionesTipoSalarioNeto;
	
    protected JPanel jPanelPaginacionTipoSalarioNeto;
    protected JPanel jPanelParametrosReportesTipoSalarioNeto;
	protected JPanel jPanelParametrosReportesAccionesTipoSalarioNeto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoSalarioNeto;
	protected JPanel jPanelParametrosAuxiliar2TipoSalarioNeto;
	protected JPanel jPanelParametrosAuxiliar3TipoSalarioNeto;
	protected JPanel jPanelParametrosAuxiliar4TipoSalarioNeto;
	//protected JPanel jPanelParametrosAuxiliar5TipoSalarioNeto;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoSalarioNeto;
	//protected JPanel jPanelImportacionTipoSalarioNeto;
	
	
	public JTable jTableDatosTipoSalarioNeto;
	
	
	
	//public JTable jTableDatosTipoSalarioNetoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoSalarioNeto;
	protected JButton jButtonDuplicarTipoSalarioNeto;
	protected JButton jButtonCopiarTipoSalarioNeto;
	protected JButton jButtonVerFormTipoSalarioNeto;
	protected JButton jButtonNuevoRelacionesTipoSalarioNeto;
	protected JButton jButtonModificarTipoSalarioNeto;
	
    protected JButton jButtonGuardarCambiosTablaTipoSalarioNeto;
	protected JButton jButtonCerrarTipoSalarioNeto;
	
	
	protected JButton jButtonRecargarInformacionTipoSalarioNeto;
	protected JButton jButtonProcesarInformacionTipoSalarioNeto;
	
	
	protected JButton jButtonAnterioresTipoSalarioNeto;
	protected JButton jButtonSiguientesTipoSalarioNeto;
	protected JButton jButtonNuevoGuardarCambiosTipoSalarioNeto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoSalarioNeto;
	//protected JButton jButtonCerrarReporteDinamicoTipoSalarioNeto;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoSalarioNeto;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoSalarioNeto;
	//protected JButton jButtonGenerarImportacionTipoSalarioNeto;
	//protected JButton jButtonCerrarImportacionTipoSalarioNeto;
	//protected JFileChooser jFileChooserImportacionTipoSalarioNeto;
	//protected File fileImportacionTipoSalarioNeto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSalarioNeto;
	protected JButton jButtonDuplicarToolBarTipoSalarioNeto;
	protected JButton jButtonNuevoRelacionesToolBarTipoSalarioNeto;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoSalarioNeto;
	protected JButton jButtonCopiarToolBarTipoSalarioNeto;
	protected JButton jButtonVerFormToolBarTipoSalarioNeto;
	public JButton jButtonGuardarCambiosTablaToolBarTipoSalarioNeto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSalarioNeto;
	protected JButton jButtonCerrarToolBarTipoSalarioNeto;
	
	protected JButton jButtonRecargarInformacionToolBarTipoSalarioNeto;
	protected JButton jButtonProcesarInformacionToolBarTipoSalarioNeto;
	protected JButton jButtonAnterioresToolBarTipoSalarioNeto;
	protected JButton jButtonSiguientesToolBarTipoSalarioNeto;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoSalarioNeto;
	protected JButton jButtonAbrirOrderByToolBarTipoSalarioNeto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSalarioNeto;
	protected JMenuItem jMenuItemDuplicarTipoSalarioNeto;
	protected JMenuItem jMenuItemNuevoRelacionesTipoSalarioNeto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoSalarioNeto;
	protected JMenuItem jMenuItemCopiarTipoSalarioNeto;
	protected JMenuItem jMenuItemVerFormTipoSalarioNeto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSalarioNeto;
	protected JMenuItem jMenuItemCerrarTipoSalarioNeto;
	protected JMenuItem jMenuItemDetalleCerrarTipoSalarioNeto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoSalarioNeto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSalarioNeto;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoSalarioNeto;
	protected JMenuItem jMenuItemProcesarInformacionTipoSalarioNeto;
	protected JMenuItem jMenuItemAnterioresTipoSalarioNeto;
	protected JMenuItem jMenuItemSiguientesTipoSalarioNeto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSalarioNeto;
	protected JMenuItem jMenuItemAbrirOrderByTipoSalarioNeto;
	protected JMenuItem jMenuItemMostrarOcultarTipoSalarioNeto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSalarioNeto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoSalarioNeto;
	protected JCheckBox jCheckBoxSeleccionadosTipoSalarioNeto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoSalarioNeto;
	protected JCheckBox jCheckBoxConGraficoReporteTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoSalarioNeto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoSalarioNeto;
	protected JTextField jTextFieldValorCampoGeneralTipoSalarioNeto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoSalarioNeto;
	//public JList<Reporte> jListColumnasSelectReporteTipoSalarioNeto;
	//public JScrollPane jScrollColumnasSelectReporteTipoSalarioNeto;
	
	//public JLabel jLabelRelacionesSelectReporteTipoSalarioNeto;
	//public JList<Reporte> jListRelacionesSelectReporteTipoSalarioNeto;
	//public JScrollPane jScrollRelacionesSelectReporteTipoSalarioNeto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoSalarioNeto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoSalarioNeto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoSalarioNeto;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoSalarioNeto;
	
		
	//public JLabel jLabelArchivoImportacionTipoSalarioNeto;	
	//public JLabel jLabelPathArchivoImportacionTipoSalarioNeto;
	//protected JTextField jTextFieldPathArchivoImportacionTipoSalarioNeto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoSalarioNeto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoSalarioNeto;
	
	//public JLabel jLabelColumnaCategoriaValorTipoSalarioNeto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoSalarioNeto;
	
	//public JLabel jLabelColumnasValoresGraficoTipoSalarioNeto;
	//public JList<Reporte> jListColumnasValoresGraficoTipoSalarioNeto;
	//public JScrollPane jScrollColumnasValoresGraficoTipoSalarioNeto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoSalarioNeto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoSalarioNeto;	
	
	
	
	
	
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
	public TipoSalarioNetoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoSalarioNeto)	{
		this.jButtonRecargarInformacionTipoSalarioNeto = jButtonRecargarInformacionTipoSalarioNeto;
	}
	
	public JButton getjButtonProcesarInformacionTipoSalarioNeto() {
		return this.jButtonProcesarInformacionTipoSalarioNeto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSalarioNeto)	{
		this.jButtonProcesarInformacionTipoSalarioNeto = jButtonProcesarInformacionTipoSalarioNeto;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoSalarioNeto() {
		return this.jButtonRecargarInformacionTipoSalarioNeto;
	}
	
	
	public List<TipoSalarioNeto> gettiposalarionetos() {
		return this.tiposalarionetos;
	}

	public void settiposalarionetos(List<TipoSalarioNeto> tiposalarionetos) {
		this.tiposalarionetos = tiposalarionetos;
	}
	
	public List<TipoSalarioNeto> gettiposalarionetosAux() {
		return this.tiposalarionetosAux;
	}

	public void settiposalarionetosAux(List<TipoSalarioNeto> tiposalarionetosAux) {
		this.tiposalarionetosAux = tiposalarionetosAux;
	}
	
	public List<TipoSalarioNeto> gettiposalarionetosEliminados() {
		return this.tiposalarionetosEliminados;
	}

	public void setTipoSalarioNetosEliminados(List<TipoSalarioNeto> tiposalarionetosEliminados) {
		this.tiposalarionetosEliminados = tiposalarionetosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoSalarioNeto() {
		return jComboBoxTiposSeleccionarTipoSalarioNeto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoSalarioNeto(
			JComboBox jComboBoxTiposSeleccionarTipoSalarioNeto) {
		this.jComboBoxTiposSeleccionarTipoSalarioNeto = jComboBoxTiposSeleccionarTipoSalarioNeto;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoSalarioNeto() {
		return jTextFieldValorCampoGeneralTipoSalarioNeto;
	}

	public void setjTextFieldValorCampoGeneralTipoSalarioNeto(
			JTextField jTextFieldValorCampoGeneralTipoSalarioNeto) {
		this.jTextFieldValorCampoGeneralTipoSalarioNeto = jTextFieldValorCampoGeneralTipoSalarioNeto;
	}

	public void setBorderResaltarValorCampoGeneralTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoSalarioNeto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoSalarioNeto() {
		return this.jCheckBoxSeleccionarTodosTipoSalarioNeto;
	}

	public void setjCheckBoxSeleccionarTodosTipoSalarioNeto(
			JCheckBox jCheckBoxSeleccionarTodosTipoSalarioNeto) {
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto = jCheckBoxSeleccionarTodosTipoSalarioNeto;
	}

	public void setBorderResaltarSeleccionarTodosTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoSalarioNeto() {
		return this.jCheckBoxSeleccionadosTipoSalarioNeto;
	}

	public void setjCheckBoxSeleccionadosTipoSalarioNeto(
			JCheckBox jCheckBoxSeleccionadosTipoSalarioNeto) {
		this.jCheckBoxSeleccionadosTipoSalarioNeto = jCheckBoxSeleccionadosTipoSalarioNeto;
	}
	
	public void setBorderResaltarSeleccionadosTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoSalarioNeto() {
		return this.jComboBoxTiposArchivosReportesTipoSalarioNeto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoSalarioNeto(
			JComboBox jComboBoxTiposArchivosReportesTipoSalarioNeto) {
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto = jComboBoxTiposArchivosReportesTipoSalarioNeto;
	}

	public void setBorderResaltarTiposArchivosReportesTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoSalarioNeto() {
		return this.jComboBoxTiposReportesTipoSalarioNeto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoSalarioNeto(
			JComboBox jComboBoxTiposReportesTipoSalarioNeto) {
		this.jComboBoxTiposReportesTipoSalarioNeto = jComboBoxTiposReportesTipoSalarioNeto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoSalarioNeto() {
	//	return jComboBoxTiposReportesDinamicoTipoSalarioNeto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoSalarioNeto(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoSalarioNeto) {
	//	this.jComboBoxTiposReportesDinamicoTipoSalarioNeto = jComboBoxTiposReportesDinamicoTipoSalarioNeto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto = jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto;
	//}
	
	public void setBorderResaltarTiposReportesTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoSalarioNeto() {
		return this.jComboBoxTiposGraficosReportesTipoSalarioNeto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoSalarioNeto(
			JComboBox jComboBoxTiposGraficosReportesTipoSalarioNeto) {
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto = jComboBoxTiposGraficosReportesTipoSalarioNeto;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoSalarioNeto() {
		return this.jComboBoxTiposPaginacionTipoSalarioNeto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoSalarioNeto(
			JComboBox jComboBoxTiposPaginacionTipoSalarioNeto) {
		this.jComboBoxTiposPaginacionTipoSalarioNeto = jComboBoxTiposPaginacionTipoSalarioNeto;
	}
	
	public void setBorderResaltarTiposPaginacionTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoSalarioNeto() {
		return this.jComboBoxTiposRelacionesTipoSalarioNeto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSalarioNeto() {
		return this.jComboBoxTiposAccionesTipoSalarioNeto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSalarioNeto(
			JComboBox jComboBoxTiposRelacionesTipoSalarioNeto) {
		this.jComboBoxTiposRelacionesTipoSalarioNeto = jComboBoxTiposRelacionesTipoSalarioNeto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSalarioNeto(
			JComboBox jComboBoxTiposAccionesTipoSalarioNeto) {
		this.jComboBoxTiposAccionesTipoSalarioNeto = jComboBoxTiposAccionesTipoSalarioNeto;
	}
	
	public void setBorderResaltarTiposRelacionesTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoSalarioNeto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoSalarioNeto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoSalarioNeto() {
	//	return jCheckBoxConGraficoDinamicoTipoSalarioNeto;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoSalarioNeto(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoSalarioNeto) {
	//	this.jCheckBoxConGraficoDinamicoTipoSalarioNeto = jCheckBoxConGraficoDinamicoTipoSalarioNeto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoSalarioNeto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoSalarioNeto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoSalarioNeto .setBorder(borderResaltar);		
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
		this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
		
		this.tiposalarionetoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposalarionetoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposalarionetoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoSalarioNetoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoSalarioNetoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSalarioNetoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSalarioNetoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSalarioNetoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Salario Neto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoSalarioNetoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoSalarioNeto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"nuevo","nuevo","Nuevo"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"duplicar","duplicar","Duplicar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"copiar","copiar","Copiar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"ver_form","ver_form","Ver"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"recargar","recargar","Recargar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,
							"cerrar","cerrar","Salir"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoSalarioNeto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoSalarioNeto;
			
				this.jButtonProcesarInformacionToolBarTipoSalarioNeto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoSalarioNeto;
				
		//protected JButton jButtonModificarToolBarTipoSalarioNeto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoSalarioNeto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoSalarioNeto=new JMenuMe("General");
		this.jmenuArchivoTipoSalarioNeto=new JMenuMe("Archivo");
		this.jmenuAccionesTipoSalarioNeto=new JMenuMe("Acciones");
		this.jmenuDatosTipoSalarioNeto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSalarioNeto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSalarioNeto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSalarioNeto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoSalarioNeto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoSalarioNeto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoSalarioNeto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoSalarioNeto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoSalarioNeto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoSalarioNeto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoSalarioNeto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSalarioNeto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSalarioNeto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoSalarioNeto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoSalarioNeto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoSalarioNeto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoSalarioNeto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoSalarioNeto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoSalarioNeto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoSalarioNeto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoSalarioNeto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoSalarioNeto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSalarioNeto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSalarioNeto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSalarioNeto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoSalarioNeto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoSalarioNeto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoSalarioNeto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoSalarioNeto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoSalarioNeto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoSalarioNeto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoSalarioNeto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoSalarioNeto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoSalarioNeto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoSalarioNeto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoSalarioNeto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoSalarioNeto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoSalarioNeto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoSalarioNeto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoSalarioNeto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSalarioNeto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSalarioNeto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSalarioNeto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSalarioNeto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSalarioNeto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSalarioNeto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoSalarioNeto.add(this.jMenuItemCerrarTipoSalarioNeto);
			
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemNuevoTipoSalarioNeto);
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto);
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemNuevoRelacionesTipoSalarioNeto);
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemGuardarCambiosTablaTipoSalarioNeto);		
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemDuplicarTipoSalarioNeto);		
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemCopiarTipoSalarioNeto);		
			this.jmenuAccionesTipoSalarioNeto.add(this.jMenuItemVerFormTipoSalarioNeto);		
			
			this.jmenuDatosTipoSalarioNeto.add(this.jMenuItemRecargarInformacionTipoSalarioNeto);				
			this.jmenuDatosTipoSalarioNeto.add(this.jMenuItemAnterioresTipoSalarioNeto);				
			this.jmenuDatosTipoSalarioNeto.add(this.jMenuItemSiguientesTipoSalarioNeto);				
			this.jmenuDatosTipoSalarioNeto.add(this.jMenuItemAbrirOrderByTipoSalarioNeto);				
			this.jmenuDatosTipoSalarioNeto.add(this.jMenuItemMostrarOcultarTipoSalarioNeto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoSalarioNeto.add(this.jMenuItemGuardarCambiosTipoSalarioNeto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoSalarioNeto.add(this.jmenuArchivoTipoSalarioNeto);		
			this.jmenuBarTipoSalarioNeto.add(this.jmenuAccionesTipoSalarioNeto);		
			this.jmenuBarTipoSalarioNeto.add(this.jmenuDatosTipoSalarioNeto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoSalarioNeto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoSalarioNeto() {
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
			//this.jInternalFrameDetalleTipoSalarioNeto = new TipoSalarioNetoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Salario Neto DATOS");
			this.jInternalFrameDetalleFormTipoSalarioNeto = new TipoSalarioNetoDetalleFormJInternalFrame(jDesktopPane,this.tiposalarionetoSessionBean.getConGuardarRelaciones(),this.tiposalarionetoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoSalarioNeto = null;//new TipoSalarioNetoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSalarioNeto= new GridBagLayout();
		
		
		this.jTableDatosTipoSalarioNeto = new JTableMe();      
		
		String sToolTipTipoSalarioNeto="";
		sToolTipTipoSalarioNeto=TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSalarioNeto+="(Sris.TipoSalarioNeto)";
		}
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSalarioNeto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoSalarioNeto.setToolTipText(sToolTipTipoSalarioNeto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoSalarioNeto);
		this.jTableDatosTipoSalarioNeto.setAutoCreateRowSorter(true);
		this.jTableDatosTipoSalarioNeto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoSalarioNeto.setRowSelectionAllowed(true);
		this.jTableDatosTipoSalarioNeto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoSalarioNeto = new JButtonMe();
		this.jButtonDuplicarTipoSalarioNeto = new JButtonMe();
		this.jButtonCopiarTipoSalarioNeto = new JButtonMe();
		this.jButtonVerFormTipoSalarioNeto = new JButtonMe();
		this.jButtonNuevoRelacionesTipoSalarioNeto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto = new JButtonMe();
		this.jButtonCerrarTipoSalarioNeto = new JButtonMe();
		
		this.jScrollPanelDatosTipoSalarioNeto = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoSalarioNeto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Salario Neto";
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Salario Netos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSalarioNeto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSalarioNeto.setToolTipText("Acciones");
        this.jPanelAccionesTipoSalarioNeto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoSalarioNeto=new ReporteDinamicoJInternalFrame(TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoSalarioNeto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoSalarioNeto=new ImportacionJInternalFrame(TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoSalarioNeto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoSalarioNeto = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoSalarioNeto.setText("Orden");
		this.jButtonAbrirOrderByTipoSalarioNeto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSalarioNeto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSalarioNeto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSalarioNeto,false,this);
			
			//this.cargarOrderByTipoSalarioNeto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSalarioNeto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSalarioNeto,true,this);
			
			//this.cargarOrderByTipoSalarioNeto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoSalarioNeto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSalarioNeto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSalarioNeto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoSalarioNeto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSalarioNeto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSalarioNeto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoSalarioNeto.setText("Nuevo");
		this.jButtonDuplicarTipoSalarioNeto.setText("Duplicar");
		this.jButtonCopiarTipoSalarioNeto.setText("Copiar");
		this.jButtonVerFormTipoSalarioNeto.setText("Ver");
		this.jButtonNuevoRelacionesTipoSalarioNeto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.setText("Guardar");
		this.jButtonCerrarTipoSalarioNeto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSalarioNeto,"nuevo_button","Nuevo",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoSalarioNeto,"duplicar_button","Duplicar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoSalarioNeto,"copiar_button","Copiar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoSalarioNeto,"ver_form","Ver",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoSalarioNeto,"nuevorelaciones_button","Nuevo Rel",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSalarioNeto,"guardarcambiostabla_button","Guardar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSalarioNeto,"cerrar_button","Salir",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoSalarioNeto.setToolTipText("Nuevo"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoSalarioNeto.setToolTipText("Duplicar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoSalarioNeto.setToolTipText("Copiar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoSalarioNeto.setToolTipText("Ver"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoSalarioNeto.setToolTipText("Nuevo Rel"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.setToolTipText("Guardar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSalarioNeto.setToolTipText("Salir"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSalarioNeto";
		inputMap = this.jButtonNuevoTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSalarioNeto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSalarioNeto"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoSalarioNeto";
		inputMap = this.jButtonDuplicarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoSalarioNeto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoSalarioNeto"));
		
		//COPIAR
		sMapKey = "CopiarTipoSalarioNeto";
		inputMap = this.jButtonCopiarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoSalarioNeto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoSalarioNeto"));
		
		//VEr FORM
		sMapKey = "VerFormTipoSalarioNeto";
		inputMap = this.jButtonVerFormTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoSalarioNeto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoSalarioNeto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoSalarioNeto";
		inputMap = this.jButtonNuevoRelacionesTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoSalarioNeto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoSalarioNeto";
		inputMap = this.jButtonModificarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoSalarioNeto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoSalarioNeto";
		inputMap = this.jButtonCerrarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSalarioNeto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSalarioNeto";
		inputMap = this.jButtonGuardarCambiosTablaTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSalarioNeto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoSalarioNeto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoSalarioNeto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoSalarioNeto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoSalarioNeto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoSalarioNeto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoSalarioNeto.setName("jPanelParametrosReportesTipoSalarioNeto"); 
		
		this.jPanelParametrosReportesAccionesTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoSalarioNeto.setName("jPanelParametrosReportesAccionesTipoSalarioNeto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoSalarioNeto = new JButtonMe();
		this.jButtonRecargarInformacionTipoSalarioNeto.setText("Recargar");
		this.jButtonRecargarInformacionTipoSalarioNeto.setToolTipText("Recargar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoSalarioNeto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoSalarioNeto = new JButtonMe();
		this.jButtonProcesarInformacionTipoSalarioNeto.setText("Procesar");
		this.jButtonProcesarInformacionTipoSalarioNeto.setToolTipText("Procesar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoSalarioNeto.setVisible(false);
			
		this.jButtonProcesarInformacionTipoSalarioNeto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSalarioNeto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSalarioNeto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setText("TIPO");       
		this.jComboBoxTiposReportesTipoSalarioNeto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoSalarioNeto.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoSalarioNeto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoSalarioNeto.setText("Accion");
		this.jComboBoxTiposRelacionesTipoSalarioNeto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSalarioNeto.setText("Accion");
		this.jComboBoxTiposAccionesTipoSalarioNeto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoSalarioNeto.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoSalarioNeto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoSalarioNeto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoSalarioNeto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSalarioNeto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSalarioNeto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoSalarioNeto = new JLabelMe();
		
		this.jLabelAccionesTipoSalarioNeto.setText("Acciones");		
		this.jLabelAccionesTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoSalarioNeto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoSalarioNeto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoSalarioNeto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoSalarioNeto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoSalarioNeto.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoSalarioNeto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoSalarioNeto = new JButtonMe();
		//this.jButtonAnterioresTipoSalarioNeto.setText("<<");
        this.jButtonAnterioresTipoSalarioNeto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoSalarioNeto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoSalarioNeto = new JButtonMe();
		//this.jButtonSiguientesTipoSalarioNeto.setText(">>");
        this.jButtonSiguientesTipoSalarioNeto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoSalarioNeto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoSalarioNeto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoSalarioNeto.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoSalarioNeto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoSalarioNeto,"nuevoguardarcambios_button","Nue",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoSalarioNeto";
		inputMap = this.jButtonNuevoGuardarCambiosTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoSalarioNeto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoSalarioNeto";
		inputMap = this.jButtonRecargarInformacionTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoSalarioNeto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoSalarioNeto";
		inputMap = this.jButtonSiguientesTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoSalarioNeto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoSalarioNeto";
		inputMap = this.jButtonAnterioresTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoSalarioNeto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoSalarioNeto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoSalarioNeto.setMinimumSize(new Dimension(this.getWidth(),TipoSalarioNetoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSalarioNetoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSalarioNeto.setMaximumSize(new Dimension(this.getWidth(),TipoSalarioNetoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSalarioNetoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSalarioNeto.setPreferredSize(new Dimension(this.getWidth(),TipoSalarioNetoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSalarioNetoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoSalarioNeto = new GridBagLayout();

			this.jPanelPaginacionTipoSalarioNeto.setLayout(gridaBagLayoutPaginacionTipoSalarioNeto);						
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonAnterioresTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
					
						
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
			
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonNuevoGuardarCambiosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
						
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonSiguientesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 1;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonNuevoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
						
			
			
			if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
				this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSalarioNeto.gridy = 1;
				this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonGuardarCambiosTablaTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			}
			
			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 1;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonDuplicarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 1;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonCopiarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 1;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonVerFormTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 1;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoSalarioNeto.add(this.jButtonCerrarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
		
		
		this.jButtonRecargarInformacionTipoSalarioNeto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSalarioNeto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSalarioNeto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSalarioNeto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoSalarioNeto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSalarioNeto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSalarioNeto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSalarioNeto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoSalarioNeto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSalarioNeto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSalarioNeto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoSalarioNeto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSalarioNeto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSalarioNeto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoSalarioNeto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSalarioNeto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSalarioNeto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoSalarioNeto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSalarioNeto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSalarioNeto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoSalarioNeto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSalarioNeto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSalarioNeto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSalarioNeto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSalarioNeto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoSalarioNeto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSalarioNeto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSalarioNeto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoSalarioNeto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoSalarioNeto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoSalarioNeto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoSalarioNeto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoSalarioNeto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoSalarioNeto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoSalarioNeto.setLayout(gridaBagParametrosReportesTipoSalarioNeto);
			this.jPanelParametrosReportesAccionesTipoSalarioNeto.setLayout(gridaBagParametrosReportesAccionesTipoSalarioNeto);
			
			
			this.jPanelParametrosAuxiliar1TipoSalarioNeto.setLayout(gridaBagParametrosAuxiliar1TipoSalarioNeto);
			this.jPanelParametrosAuxiliar2TipoSalarioNeto.setLayout(gridaBagParametrosAuxiliar2TipoSalarioNeto);
			this.jPanelParametrosAuxiliar3TipoSalarioNeto.setLayout(gridaBagParametrosAuxiliar3TipoSalarioNeto);
			this.jPanelParametrosAuxiliar4TipoSalarioNeto.setLayout(gridaBagParametrosAuxiliar4TipoSalarioNeto);
			//this.jPanelParametrosAuxiliar5TipoSalarioNeto.setLayout(gridaBagParametrosAuxiliar2TipoSalarioNeto);			
			
			
			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jButtonRecargarInformacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSalarioNeto.add(this.jComboBoxTiposPaginacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSalarioNeto.add(this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSalarioNeto.add(this.jComboBoxTiposArchivosReportesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jPanelParametrosAuxiliar1TipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoSalarioNeto.add(this.jComboBoxTiposReportesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jPanelParametrosAuxiliar4TipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jComboBoxTiposReportesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jCheckBoxGenerarReporteTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jPanelParametrosAuxiliar2TipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jLabelAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
				this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoSalarioNeto.add(this.jButtonAbrirOrderByTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jComboBoxTiposSeleccionarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
			
			
			/*
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jCheckBoxSeleccionarTodosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSalarioNeto.add(this.jCheckBoxSeleccionarTodosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);															
				
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSalarioNeto.add(this.jCheckBoxSeleccionadosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jPanelParametrosAuxiliar3TipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSalarioNeto.add(this.jComboBoxTiposAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoSalarioNeto = new GridBagLayout();

			this.jScrollPanelDatosTipoSalarioNeto.setLayout(gridaBagLayoutDatosTipoSalarioNeto);
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
			this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
			
			this.jScrollPanelDatosTipoSalarioNeto.add(this.jTableDatosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoSalarioNeto.setViewportView(this.jTableDatosTipoSalarioNeto);
		this.jTableDatosTipoSalarioNeto.setFillsViewportHeight(true);
		this.jTableDatosTipoSalarioNeto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoSalarioNeto= new GridBagLayout();
		this.jPanelAccionesTipoSalarioNeto.setLayout(gridaBagLayoutAccionesTipoSalarioNeto);
		
		
		/*	
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
			
		this.jPanelAccionesTipoSalarioNeto.add(this.jButtonNuevoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSalarioNeto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSalarioNeto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();						
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSalarioNeto.gridx = 0;		
			//this.gridBagConstraintsTipoSalarioNeto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSalarioNeto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;		
		//this.gridBagConstraintsTipoSalarioNeto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoSalarioNeto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoSalarioNeto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);								
		
		
		/*
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		*/		
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSalarioNeto.gridx =0;
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSalarioNeto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
				
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoSalarioNeto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSalarioNeto = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoSalarioNeto.setLayout(gridaBagLayoutBusquedasParametrosTipoSalarioNeto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoSalarioNeto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSalarioNeto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSalarioNeto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSalarioNeto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
			
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
			
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoSalarioNeto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoSalarioNeto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoSalarioNeto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoSalarioNeto.setName("jPanelReporteDinamicoTipoSalarioNeto"); 
		
		this.jPanelReporteDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoSalarioNeto.setLayout(gridaBagLayoutReporteDinamicoTipoSalarioNeto);
		
		
		this.jInternalFrameReporteDinamicoTipoSalarioNeto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoSalarioNeto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSalarioNeto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoSalarioNeto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoSalarioNeto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoSalarioNeto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoSalarioNeto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoSalarioNeto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoSalarioNeto.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoSalarioNeto.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoSalarioNeto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Salario Netos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoSalarioNeto = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoSalarioNeto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jLabelColumnasSelectReporteTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoSalarioNeto = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoSalarioNeto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoSalarioNeto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoSalarioNeto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSalarioNeto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSalarioNeto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoSalarioNeto=new JScrollPane(this.jListColumnasSelectReporteTipoSalarioNeto);
			
			this.jScrollColumnasSelectReporteTipoSalarioNeto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSalarioNeto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSalarioNeto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jListColumnasSelectReporteTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jScrollColumnasSelectReporteTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoSalarioNeto = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoSalarioNeto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoSalarioNeto = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoSalarioNeto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoSalarioNeto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoSalarioNeto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSalarioNeto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSalarioNeto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoSalarioNeto=new JScrollPane(this.jListRelacionesSelectReporteTipoSalarioNeto);
			
			this.jScrollRelacionesSelectReporteTipoSalarioNeto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSalarioNeto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSalarioNeto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoSalarioNeto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoSalarioNeto = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoSalarioNeto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoSalarioNeto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoSalarioNeto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoSalarioNeto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoSalarioNeto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jLabelGenerarExcelReporteDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto.setToolTipText("Generar EXCEL"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		//this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jComboBoxTiposReportesDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoSalarioNeto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoSalarioNeto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jLabelTiposArchivoReporteDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jComboBoxTiposArchivosReportesDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoSalarioNeto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoSalarioNeto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoSalarioNeto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoSalarioNeto.setToolTipText("Generar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jButtonGenerarReporteDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoSalarioNeto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoSalarioNeto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoSalarioNeto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoSalarioNeto.setToolTipText("Cancelar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSalarioNeto.add(this.jButtonCerrarReporteDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoSalarioNeto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoSalarioNeto= new JScrollPane(jPanelReporteDinamicoTipoSalarioNeto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoSalarioNeto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSalarioNeto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSalarioNeto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Salario Netos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoSalarioNeto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoSalarioNeto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoSalarioNeto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoSalarioNeto);
		this.jInternalFrameReporteDinamicoTipoSalarioNeto.getContentPane().add(this.jScrollPanelReporteDinamicoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoSalarioNeto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoSalarioNeto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoSalarioNeto.setName("jPanelImportacionTipoSalarioNeto"); 
		
		this.jPanelImportacionTipoSalarioNeto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSalarioNeto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSalarioNeto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoSalarioNeto.setLayout(gridaBagLayoutImportacionTipoSalarioNeto);
		
		
		this.jInternalFrameImportacionTipoSalarioNeto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoSalarioNeto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoSalarioNeto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSalarioNeto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoSalarioNeto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSalarioNeto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSalarioNeto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoSalarioNeto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSalarioNeto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSalarioNeto.setResizable(true);
	    this.jInternalFrameImportacionTipoSalarioNeto.setClosable(true);
	    this.jInternalFrameImportacionTipoSalarioNeto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoSalarioNeto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSalarioNeto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSalarioNeto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoSalarioNeto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSalarioNeto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSalarioNeto.setResizable(true);
	    this.jInternalFrameImportacionTipoSalarioNeto.setClosable(true);
	    this.jInternalFrameImportacionTipoSalarioNeto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoSalarioNeto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSalarioNeto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSalarioNeto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Salario Netos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoSalarioNeto = new JLabelMe();

		this.jLabelArchivoImportacionTipoSalarioNeto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSalarioNeto.add(this.jLabelArchivoImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoSalarioNeto = new JFileChooser();		
		this.jFileChooserImportacionTipoSalarioNeto.setToolTipText("ESCOGER ARCHIVO"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoSalarioNeto = new JButtonMe();
		this.jButtonAbrirImportacionTipoSalarioNeto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoSalarioNeto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoSalarioNeto.setToolTipText("Generar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSalarioNeto.add(this.jButtonAbrirImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoSalarioNeto = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoSalarioNeto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSalarioNeto.add(this.jLabelPathArchivoImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoSalarioNeto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoSalarioNeto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSalarioNeto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSalarioNeto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSalarioNeto.add(this.jTextFieldPathArchivoImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoSalarioNeto = new JButtonMe();
		this.jButtonGenerarImportacionTipoSalarioNeto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoSalarioNeto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoSalarioNeto.setToolTipText("Generar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSalarioNeto.add(this.jButtonGenerarImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoSalarioNeto = new JButtonMe();
		this.jButtonCerrarImportacionTipoSalarioNeto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoSalarioNeto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoSalarioNeto.setToolTipText("Cancelar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSalarioNeto.add(this.jButtonCerrarImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoSalarioNeto = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoSalarioNeto= new JScrollPane(jPanelImportacionTipoSalarioNeto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoSalarioNeto.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoSalarioNeto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoSalarioNeto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoSalarioNeto);
		this.jInternalFrameImportacionTipoSalarioNeto.getContentPane().add(this.jScrollPanelImportacionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoSalarioNeto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoSalarioNeto = new JButtonMe();
			this.jButtonAbrirOrderByTipoSalarioNeto.setText("Orden");
			this.jButtonAbrirOrderByTipoSalarioNeto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSalarioNeto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoSalarioNeto";
			inputMap = this.jButtonAbrirOrderByTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoSalarioNeto"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoSalarioNeto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoSalarioNeto.setName("jPanelOrderByTipoSalarioNeto"); 
			
			this.jPanelOrderByTipoSalarioNeto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSalarioNeto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSalarioNeto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoSalarioNeto.setLayout(gridaBagLayoutOrderByTipoSalarioNeto);
			
			
			this.jTableDatosTipoSalarioNetoOrderBy = new JTableMe();        
			this.jTableDatosTipoSalarioNetoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoSalarioNetoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoSalarioNetoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoSalarioNetoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoSalarioNetoOrderBy.setViewportView(this.jTableDatosTipoSalarioNetoOrderBy);
			this.jTableDatosTipoSalarioNetoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoSalarioNetoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoSalarioNeto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoSalarioNeto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoSalarioNeto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoSalarioNeto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoSalarioNeto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoSalarioNeto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoSalarioNeto.setTitle("Orden");
			this.jInternalFrameOrderByTipoSalarioNeto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoSalarioNeto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoSalarioNeto.setResizable(true);
			this.jInternalFrameOrderByTipoSalarioNeto.setClosable(true);
			this.jInternalFrameOrderByTipoSalarioNeto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoSalarioNeto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSalarioNeto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSalarioNeto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Salario Netos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoSalarioNeto.ipady =150;
				
			this.jPanelOrderByTipoSalarioNeto.add(jScrollPanelDatosTipoSalarioNetoOrderBy, this.gridBagConstraintsTipoSalarioNeto);//this.jTableDatosTipoSalarioNetoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoSalarioNeto = new JButtonMe();
			this.jButtonCerrarOrderByTipoSalarioNeto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoSalarioNeto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoSalarioNeto.setToolTipText("Cancelar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoSalarioNeto.add(this.jButtonCerrarOrderByTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoSalarioNeto = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoSalarioNeto= new JScrollPane(jPanelOrderByTipoSalarioNeto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoSalarioNeto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoSalarioNeto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoSalarioNeto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoSalarioNeto);
			
			this.jInternalFrameOrderByTipoSalarioNeto.getContentPane().add(this.jScrollPanelOrderByTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
		
		} else {
			this.jButtonAbrirOrderByTipoSalarioNeto = new JButtonMe();
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
			&& this.tiposalarionetoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoSalarioNeto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoSalarioNeto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoSalarioNeto.getRowHeight();//TipoSalarioNetoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.isSelected()) {
					iHeightTable=TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSalarioNeto.isSelected()) {
					iHeightTable=TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSalarioNetoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoSalarioNeto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSalarioNeto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSalarioNeto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoSalarioNeto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSalarioNeto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSalarioNeto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoSalarioNeto!=null && this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy()!=null) {
			//if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoSalarioNeto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoSalarioNeto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoSalarioNeto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoSalarioNeto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSalarioNeto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSalarioNeto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiposalarionetoLogic.getTipoSalarioNetos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposalarionetos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoSalarioNeto> TraerTipoSalarioNetoBeans(List<TipoSalarioNeto> tiposalarionetos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoSalarioNeto tiposalarioneto:tiposalarionetos) {
					
				if(!(TipoSalarioNetoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoSalarioNetoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiposalarioneto.setsDetalleGeneralEntityReporte(TipoSalarioNetoConstantesFunciones.getTipoSalarioNetoDescripcion(tiposalarioneto));
										
						
					
						
					
				} else  {
							
					//tiposalarioneto.setsDetalleGeneralEntityReporte(tiposalarioneto.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiposalarionetobeans.add(tiposalarionetobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiposalarionetos;
    }
	//PARA REPORTES FIN
}
