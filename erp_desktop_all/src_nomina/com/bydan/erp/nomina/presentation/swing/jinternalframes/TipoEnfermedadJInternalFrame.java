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
import com.bydan.erp.nomina.util.TipoEnfermedadConstantesFunciones;

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
public class TipoEnfermedadJInternalFrame extends TipoEnfermedadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEnfermedad;
	
	protected JMenuBar jmenuBarTipoEnfermedad;
	
	protected JMenu jmenuTipoEnfermedad;
	protected JMenu jmenuDatosTipoEnfermedad;
	protected JMenu jmenuArchivoTipoEnfermedad;
	protected JMenu jmenuAccionesTipoEnfermedad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEnfermedad;	
	protected GridBagConstraints gridBagConstraintsTipoEnfermedad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEnfermedadDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEnfermedad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEnfermedad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEnfermedad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoEnfermedadSessionBean tipoenfermedadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEnfermedad> tipoenfermedads;		
	public List<TipoEnfermedad> tipoenfermedadsEliminados;	
	public List<TipoEnfermedad> tipoenfermedadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEnfermedad;		
	protected JButton jButtonAbrirOrderByTipoEnfermedad;
	
	
	//protected JPanel jPanelOrderByTipoEnfermedad;
	//public JScrollPane jScrollPanelOrderByTipoEnfermedad;	
	//protected JButton jButtonCerrarOrderByTipoEnfermedad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEnfermedadLogic tipoenfermedadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEnfermedad;
	public JScrollPane jScrollPanelDatosEdicionTipoEnfermedad;
	public JScrollPane jScrollPanelDatosGeneralTipoEnfermedad;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEnfermedadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEnfermedad;
	//public JScrollPane jScrollPanelImportacionTipoEnfermedad;
	
	
	
	protected JPanel jPanelAccionesTipoEnfermedad;
	
    protected JPanel jPanelPaginacionTipoEnfermedad;
    protected JPanel jPanelParametrosReportesTipoEnfermedad;
	protected JPanel jPanelParametrosReportesAccionesTipoEnfermedad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEnfermedad;
	protected JPanel jPanelParametrosAuxiliar2TipoEnfermedad;
	protected JPanel jPanelParametrosAuxiliar3TipoEnfermedad;
	protected JPanel jPanelParametrosAuxiliar4TipoEnfermedad;
	//protected JPanel jPanelParametrosAuxiliar5TipoEnfermedad;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEnfermedad;
	//protected JPanel jPanelImportacionTipoEnfermedad;
	
	
	public JTable jTableDatosTipoEnfermedad;
	
	
	
	//public JTable jTableDatosTipoEnfermedadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEnfermedad;
	protected JButton jButtonDuplicarTipoEnfermedad;
	protected JButton jButtonCopiarTipoEnfermedad;
	protected JButton jButtonVerFormTipoEnfermedad;
	protected JButton jButtonNuevoRelacionesTipoEnfermedad;
	protected JButton jButtonModificarTipoEnfermedad;
	
    protected JButton jButtonGuardarCambiosTablaTipoEnfermedad;
	protected JButton jButtonCerrarTipoEnfermedad;
	
	
	protected JButton jButtonRecargarInformacionTipoEnfermedad;
	protected JButton jButtonProcesarInformacionTipoEnfermedad;
	
	
	protected JButton jButtonAnterioresTipoEnfermedad;
	protected JButton jButtonSiguientesTipoEnfermedad;
	protected JButton jButtonNuevoGuardarCambiosTipoEnfermedad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEnfermedad;
	//protected JButton jButtonCerrarReporteDinamicoTipoEnfermedad;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEnfermedad;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEnfermedad;
	//protected JButton jButtonGenerarImportacionTipoEnfermedad;
	//protected JButton jButtonCerrarImportacionTipoEnfermedad;
	//protected JFileChooser jFileChooserImportacionTipoEnfermedad;
	//protected File fileImportacionTipoEnfermedad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEnfermedad;
	protected JButton jButtonDuplicarToolBarTipoEnfermedad;
	protected JButton jButtonNuevoRelacionesToolBarTipoEnfermedad;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEnfermedad;
	protected JButton jButtonCopiarToolBarTipoEnfermedad;
	protected JButton jButtonVerFormToolBarTipoEnfermedad;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEnfermedad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEnfermedad;
	protected JButton jButtonCerrarToolBarTipoEnfermedad;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEnfermedad;
	protected JButton jButtonProcesarInformacionToolBarTipoEnfermedad;
	protected JButton jButtonAnterioresToolBarTipoEnfermedad;
	protected JButton jButtonSiguientesToolBarTipoEnfermedad;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEnfermedad;
	protected JButton jButtonAbrirOrderByToolBarTipoEnfermedad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEnfermedad;
	protected JMenuItem jMenuItemDuplicarTipoEnfermedad;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEnfermedad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEnfermedad;
	protected JMenuItem jMenuItemCopiarTipoEnfermedad;
	protected JMenuItem jMenuItemVerFormTipoEnfermedad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEnfermedad;
	protected JMenuItem jMenuItemCerrarTipoEnfermedad;
	protected JMenuItem jMenuItemDetalleCerrarTipoEnfermedad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEnfermedad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEnfermedad;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEnfermedad;
	protected JMenuItem jMenuItemProcesarInformacionTipoEnfermedad;
	protected JMenuItem jMenuItemAnterioresTipoEnfermedad;
	protected JMenuItem jMenuItemSiguientesTipoEnfermedad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEnfermedad;
	protected JMenuItem jMenuItemAbrirOrderByTipoEnfermedad;
	protected JMenuItem jMenuItemMostrarOcultarTipoEnfermedad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEnfermedad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEnfermedad;
	protected JCheckBox jCheckBoxSeleccionadosTipoEnfermedad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEnfermedad;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEnfermedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEnfermedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEnfermedad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEnfermedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEnfermedad;
	protected JTextField jTextFieldValorCampoGeneralTipoEnfermedad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEnfermedad;
	//public JList<Reporte> jListColumnasSelectReporteTipoEnfermedad;
	//public JScrollPane jScrollColumnasSelectReporteTipoEnfermedad;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEnfermedad;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEnfermedad;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEnfermedad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEnfermedad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEnfermedad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEnfermedad;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEnfermedad;
	
		
	//public JLabel jLabelArchivoImportacionTipoEnfermedad;	
	//public JLabel jLabelPathArchivoImportacionTipoEnfermedad;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEnfermedad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEnfermedad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEnfermedad;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEnfermedad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEnfermedad;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEnfermedad;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEnfermedad;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEnfermedad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEnfermedad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEnfermedad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoEnfermedad;
	
	
	
	
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
	public TipoEnfermedadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEnfermedad)	{
		this.jButtonRecargarInformacionTipoEnfermedad = jButtonRecargarInformacionTipoEnfermedad;
	}
	
	public JButton getjButtonProcesarInformacionTipoEnfermedad() {
		return this.jButtonProcesarInformacionTipoEnfermedad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEnfermedad)	{
		this.jButtonProcesarInformacionTipoEnfermedad = jButtonProcesarInformacionTipoEnfermedad;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEnfermedad() {
		return this.jButtonRecargarInformacionTipoEnfermedad;
	}
	
	
	public List<TipoEnfermedad> gettipoenfermedads() {
		return this.tipoenfermedads;
	}

	public void settipoenfermedads(List<TipoEnfermedad> tipoenfermedads) {
		this.tipoenfermedads = tipoenfermedads;
	}
	
	public List<TipoEnfermedad> gettipoenfermedadsAux() {
		return this.tipoenfermedadsAux;
	}

	public void settipoenfermedadsAux(List<TipoEnfermedad> tipoenfermedadsAux) {
		this.tipoenfermedadsAux = tipoenfermedadsAux;
	}
	
	public List<TipoEnfermedad> gettipoenfermedadsEliminados() {
		return this.tipoenfermedadsEliminados;
	}

	public void setTipoEnfermedadsEliminados(List<TipoEnfermedad> tipoenfermedadsEliminados) {
		this.tipoenfermedadsEliminados = tipoenfermedadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEnfermedad() {
		return jComboBoxTiposSeleccionarTipoEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEnfermedad(
			JComboBox jComboBoxTiposSeleccionarTipoEnfermedad) {
		this.jComboBoxTiposSeleccionarTipoEnfermedad = jComboBoxTiposSeleccionarTipoEnfermedad;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEnfermedad() {
		return jTextFieldValorCampoGeneralTipoEnfermedad;
	}

	public void setjTextFieldValorCampoGeneralTipoEnfermedad(
			JTextField jTextFieldValorCampoGeneralTipoEnfermedad) {
		this.jTextFieldValorCampoGeneralTipoEnfermedad = jTextFieldValorCampoGeneralTipoEnfermedad;
	}

	public void setBorderResaltarValorCampoGeneralTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEnfermedad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEnfermedad() {
		return this.jCheckBoxSeleccionarTodosTipoEnfermedad;
	}

	public void setjCheckBoxSeleccionarTodosTipoEnfermedad(
			JCheckBox jCheckBoxSeleccionarTodosTipoEnfermedad) {
		this.jCheckBoxSeleccionarTodosTipoEnfermedad = jCheckBoxSeleccionarTodosTipoEnfermedad;
	}

	public void setBorderResaltarSeleccionarTodosTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEnfermedad() {
		return this.jCheckBoxSeleccionadosTipoEnfermedad;
	}

	public void setjCheckBoxSeleccionadosTipoEnfermedad(
			JCheckBox jCheckBoxSeleccionadosTipoEnfermedad) {
		this.jCheckBoxSeleccionadosTipoEnfermedad = jCheckBoxSeleccionadosTipoEnfermedad;
	}
	
	public void setBorderResaltarSeleccionadosTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEnfermedad() {
		return this.jComboBoxTiposArchivosReportesTipoEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEnfermedad(
			JComboBox jComboBoxTiposArchivosReportesTipoEnfermedad) {
		this.jComboBoxTiposArchivosReportesTipoEnfermedad = jComboBoxTiposArchivosReportesTipoEnfermedad;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEnfermedad() {
		return this.jComboBoxTiposReportesTipoEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEnfermedad(
			JComboBox jComboBoxTiposReportesTipoEnfermedad) {
		this.jComboBoxTiposReportesTipoEnfermedad = jComboBoxTiposReportesTipoEnfermedad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEnfermedad() {
	//	return jComboBoxTiposReportesDinamicoTipoEnfermedad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEnfermedad(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEnfermedad) {
	//	this.jComboBoxTiposReportesDinamicoTipoEnfermedad = jComboBoxTiposReportesDinamicoTipoEnfermedad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEnfermedad() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEnfermedad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad = jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad;
	//}
	
	public void setBorderResaltarTiposReportesTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEnfermedad() {
		return this.jComboBoxTiposGraficosReportesTipoEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEnfermedad(
			JComboBox jComboBoxTiposGraficosReportesTipoEnfermedad) {
		this.jComboBoxTiposGraficosReportesTipoEnfermedad = jComboBoxTiposGraficosReportesTipoEnfermedad;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEnfermedad() {
		return this.jComboBoxTiposPaginacionTipoEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEnfermedad(
			JComboBox jComboBoxTiposPaginacionTipoEnfermedad) {
		this.jComboBoxTiposPaginacionTipoEnfermedad = jComboBoxTiposPaginacionTipoEnfermedad;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEnfermedad() {
		return this.jComboBoxTiposRelacionesTipoEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEnfermedad() {
		return this.jComboBoxTiposAccionesTipoEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEnfermedad(
			JComboBox jComboBoxTiposRelacionesTipoEnfermedad) {
		this.jComboBoxTiposRelacionesTipoEnfermedad = jComboBoxTiposRelacionesTipoEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEnfermedad(
			JComboBox jComboBoxTiposAccionesTipoEnfermedad) {
		this.jComboBoxTiposAccionesTipoEnfermedad = jComboBoxTiposAccionesTipoEnfermedad;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEnfermedad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEnfermedad() {
	//	return jCheckBoxConGraficoDinamicoTipoEnfermedad;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEnfermedad(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEnfermedad) {
	//	this.jCheckBoxConGraficoDinamicoTipoEnfermedad = jCheckBoxConGraficoDinamicoTipoEnfermedad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEnfermedad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEnfermedad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEnfermedad .setBorder(borderResaltar);		
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
		this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
		
		this.tipoenfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoenfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoenfermedadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEnfermedadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Enfermedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEnfermedad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"nuevo","nuevo","Nuevo"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"duplicar","duplicar","Duplicar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"copiar","copiar","Copiar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"ver_form","ver_form","Ver"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"recargar","recargar","Recargar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEnfermedad,this.jTtoolBarTipoEnfermedad,
							"cerrar","cerrar","Salir"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEnfermedad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEnfermedad;
			
				this.jButtonProcesarInformacionToolBarTipoEnfermedad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEnfermedad;
				
		//protected JButton jButtonModificarToolBarTipoEnfermedad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEnfermedad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEnfermedad=new JMenuMe("General");
		this.jmenuArchivoTipoEnfermedad=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEnfermedad=new JMenuMe("Acciones");
		this.jmenuDatosTipoEnfermedad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEnfermedad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEnfermedad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEnfermedad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEnfermedad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEnfermedad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEnfermedad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEnfermedad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEnfermedad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEnfermedad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEnfermedad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEnfermedad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEnfermedad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEnfermedad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEnfermedad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEnfermedad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEnfermedad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEnfermedad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEnfermedad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEnfermedad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEnfermedad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEnfermedad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEnfermedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEnfermedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEnfermedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEnfermedad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEnfermedad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEnfermedad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEnfermedad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEnfermedad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEnfermedad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEnfermedad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEnfermedad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEnfermedad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEnfermedad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEnfermedad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEnfermedad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEnfermedad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEnfermedad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEnfermedad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEnfermedad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEnfermedad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEnfermedad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEnfermedad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEnfermedad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEnfermedad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEnfermedad.add(this.jMenuItemCerrarTipoEnfermedad);
			
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemNuevoTipoEnfermedad);
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemNuevoGuardarCambiosTipoEnfermedad);
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemNuevoRelacionesTipoEnfermedad);
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemGuardarCambiosTablaTipoEnfermedad);		
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemDuplicarTipoEnfermedad);		
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemCopiarTipoEnfermedad);		
			this.jmenuAccionesTipoEnfermedad.add(this.jMenuItemVerFormTipoEnfermedad);		
			
			this.jmenuDatosTipoEnfermedad.add(this.jMenuItemRecargarInformacionTipoEnfermedad);				
			this.jmenuDatosTipoEnfermedad.add(this.jMenuItemAnterioresTipoEnfermedad);				
			this.jmenuDatosTipoEnfermedad.add(this.jMenuItemSiguientesTipoEnfermedad);				
			this.jmenuDatosTipoEnfermedad.add(this.jMenuItemAbrirOrderByTipoEnfermedad);				
			this.jmenuDatosTipoEnfermedad.add(this.jMenuItemMostrarOcultarTipoEnfermedad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEnfermedad.add(this.jMenuItemGuardarCambiosTipoEnfermedad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEnfermedad.add(this.jmenuArchivoTipoEnfermedad);		
			this.jmenuBarTipoEnfermedad.add(this.jmenuAccionesTipoEnfermedad);		
			this.jmenuBarTipoEnfermedad.add(this.jmenuDatosTipoEnfermedad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEnfermedad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEnfermedad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoEnfermedad=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoEnfermedad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEnfermedad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEnfermedad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoEnfermedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoEnfermedad = new TipoEnfermedadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Enfermedad DATOS");
			this.jInternalFrameDetalleFormTipoEnfermedad = new TipoEnfermedadDetalleFormJInternalFrame(jDesktopPane,this.tipoenfermedadSessionBean.getConGuardarRelaciones(),this.tipoenfermedadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEnfermedad = null;//new TipoEnfermedadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEnfermedad= new GridBagLayout();
		
		
		this.jTableDatosTipoEnfermedad = new JTableMe();      
		
		String sToolTipTipoEnfermedad="";
		sToolTipTipoEnfermedad=TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEnfermedad+="(Nomina.TipoEnfermedad)";
		}
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEnfermedad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEnfermedad.setToolTipText(sToolTipTipoEnfermedad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEnfermedad);
		this.jTableDatosTipoEnfermedad.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEnfermedad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEnfermedad.setRowSelectionAllowed(true);
		this.jTableDatosTipoEnfermedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEnfermedad = new JButtonMe();
		this.jButtonDuplicarTipoEnfermedad = new JButtonMe();
		this.jButtonCopiarTipoEnfermedad = new JButtonMe();
		this.jButtonVerFormTipoEnfermedad = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEnfermedad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad = new JButtonMe();
		this.jButtonCerrarTipoEnfermedad = new JButtonMe();
		
		this.jScrollPanelDatosTipoEnfermedad = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEnfermedad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Enfermedad";
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Enfermedades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEnfermedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEnfermedad.setToolTipText("Acciones");
        this.jPanelAccionesTipoEnfermedad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEnfermedad=new ReporteDinamicoJInternalFrame(TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEnfermedad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEnfermedad=new ImportacionJInternalFrame(TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEnfermedad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEnfermedad = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEnfermedad.setText("Orden");
		this.jButtonAbrirOrderByTipoEnfermedad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEnfermedad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEnfermedad,false,this);
			
			//this.cargarOrderByTipoEnfermedad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEnfermedad,true,this);
			
			//this.cargarOrderByTipoEnfermedad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEnfermedad.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEnfermedad.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEnfermedad.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEnfermedad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEnfermedad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEnfermedad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEnfermedad.setText("Nuevo");
		this.jButtonDuplicarTipoEnfermedad.setText("Duplicar");
		this.jButtonCopiarTipoEnfermedad.setText("Copiar");
		this.jButtonVerFormTipoEnfermedad.setText("Ver");
		this.jButtonNuevoRelacionesTipoEnfermedad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.setText("Guardar");
		this.jButtonCerrarTipoEnfermedad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEnfermedad,"nuevo_button","Nuevo",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEnfermedad,"duplicar_button","Duplicar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEnfermedad,"copiar_button","Copiar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEnfermedad,"ver_form","Ver",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEnfermedad,"nuevorelaciones_button","Nuevo Rel",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEnfermedad,"guardarcambiostabla_button","Guardar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEnfermedad,"cerrar_button","Salir",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEnfermedad.setToolTipText("Nuevo"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEnfermedad.setToolTipText("Duplicar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEnfermedad.setToolTipText("Copiar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEnfermedad.setToolTipText("Ver"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEnfermedad.setToolTipText("Nuevo Rel"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.setToolTipText("Guardar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEnfermedad.setToolTipText("Salir"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEnfermedad";
		inputMap = this.jButtonNuevoTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEnfermedad"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEnfermedad";
		inputMap = this.jButtonDuplicarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEnfermedad"));
		
		//COPIAR
		sMapKey = "CopiarTipoEnfermedad";
		inputMap = this.jButtonCopiarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEnfermedad"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEnfermedad";
		inputMap = this.jButtonVerFormTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEnfermedad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEnfermedad";
		inputMap = this.jButtonNuevoRelacionesTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEnfermedad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEnfermedad";
		inputMap = this.jButtonModificarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEnfermedad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEnfermedad";
		inputMap = this.jButtonCerrarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEnfermedad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEnfermedad";
		inputMap = this.jButtonGuardarCambiosTablaTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEnfermedad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEnfermedad.setName("jPanelParametrosReportesTipoEnfermedad"); 
		
		this.jPanelParametrosReportesAccionesTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEnfermedad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEnfermedad.setName("jPanelParametrosReportesAccionesTipoEnfermedad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEnfermedad = new JButtonMe();
		this.jButtonRecargarInformacionTipoEnfermedad.setText("Recargar");
		this.jButtonRecargarInformacionTipoEnfermedad.setToolTipText("Recargar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEnfermedad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEnfermedad = new JButtonMe();
		this.jButtonProcesarInformacionTipoEnfermedad.setText("Procesar");
		this.jButtonProcesarInformacionTipoEnfermedad.setToolTipText("Procesar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEnfermedad.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEnfermedad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEnfermedad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEnfermedad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEnfermedad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEnfermedad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEnfermedad.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEnfermedad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEnfermedad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEnfermedad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEnfermedad.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEnfermedad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEnfermedad.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEnfermedad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEnfermedad.setText("Accion");
		this.jComboBoxTiposAccionesTipoEnfermedad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEnfermedad.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEnfermedad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEnfermedad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEnfermedad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEnfermedad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEnfermedad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEnfermedad = new JLabelMe();
		
		this.jLabelAccionesTipoEnfermedad.setText("Acciones");		
		this.jLabelAccionesTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEnfermedad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEnfermedad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEnfermedad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEnfermedad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEnfermedad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEnfermedad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEnfermedad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEnfermedad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEnfermedad.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEnfermedad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEnfermedad = new JButtonMe();
		//this.jButtonAnterioresTipoEnfermedad.setText("<<");
        this.jButtonAnterioresTipoEnfermedad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEnfermedad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEnfermedad = new JButtonMe();
		//this.jButtonSiguientesTipoEnfermedad.setText(">>");
        this.jButtonSiguientesTipoEnfermedad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEnfermedad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEnfermedad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEnfermedad.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEnfermedad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEnfermedad,"nuevoguardarcambios_button","Nue",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEnfermedad";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEnfermedad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEnfermedad";
		inputMap = this.jButtonRecargarInformacionTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEnfermedad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEnfermedad";
		inputMap = this.jButtonSiguientesTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEnfermedad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEnfermedad";
		inputMap = this.jButtonAnterioresTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEnfermedad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEnfermedad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEnfermedad.setMinimumSize(new Dimension(this.getWidth(),TipoEnfermedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEnfermedadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEnfermedad.setMaximumSize(new Dimension(this.getWidth(),TipoEnfermedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEnfermedadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEnfermedad.setPreferredSize(new Dimension(this.getWidth(),TipoEnfermedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEnfermedadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEnfermedad = new GridBagLayout();

			this.jPanelPaginacionTipoEnfermedad.setLayout(gridaBagLayoutPaginacionTipoEnfermedad);						
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 0;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonAnterioresTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
					
						
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEnfermedad.gridy = 0;
			
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonNuevoGuardarCambiosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
						
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEnfermedad.gridy = 0;
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonSiguientesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 1;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonNuevoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEnfermedad.gridy = 1;
				this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoEnfermedad.add(this.jButtonNuevoRelacionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			}
			
			
			if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEnfermedad.gridy = 1;
				this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEnfermedad.add(this.jButtonGuardarCambiosTablaTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			}
			
			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 1;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonDuplicarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 1;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonCopiarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 1;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonVerFormTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 1;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEnfermedad.add(this.jButtonCerrarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
		
		
		this.jButtonRecargarInformacionTipoEnfermedad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEnfermedad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEnfermedad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEnfermedad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEnfermedad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEnfermedad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEnfermedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEnfermedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEnfermedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEnfermedad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEnfermedad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEnfermedad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEnfermedad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEnfermedad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEnfermedad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEnfermedad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEnfermedad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEnfermedad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEnfermedad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEnfermedad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEnfermedad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEnfermedad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEnfermedad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEnfermedad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEnfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEnfermedad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEnfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEnfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEnfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEnfermedad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEnfermedad.setLayout(gridaBagParametrosReportesTipoEnfermedad);
			this.jPanelParametrosReportesAccionesTipoEnfermedad.setLayout(gridaBagParametrosReportesAccionesTipoEnfermedad);
			
			
			this.jPanelParametrosAuxiliar1TipoEnfermedad.setLayout(gridaBagParametrosAuxiliar1TipoEnfermedad);
			this.jPanelParametrosAuxiliar2TipoEnfermedad.setLayout(gridaBagParametrosAuxiliar2TipoEnfermedad);
			this.jPanelParametrosAuxiliar3TipoEnfermedad.setLayout(gridaBagParametrosAuxiliar3TipoEnfermedad);
			this.jPanelParametrosAuxiliar4TipoEnfermedad.setLayout(gridaBagParametrosAuxiliar4TipoEnfermedad);
			//this.jPanelParametrosAuxiliar5TipoEnfermedad.setLayout(gridaBagParametrosAuxiliar2TipoEnfermedad);			
			
			
			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jButtonRecargarInformacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEnfermedad.add(this.jComboBoxTiposPaginacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEnfermedad.add(this.jCheckBoxConAltoMaximoTablaTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEnfermedad.add(this.jComboBoxTiposArchivosReportesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jPanelParametrosAuxiliar1TipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEnfermedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEnfermedad.add(this.jComboBoxTiposReportesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jPanelParametrosAuxiliar4TipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jComboBoxTiposReportesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jCheckBoxGenerarReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jPanelParametrosAuxiliar2TipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEnfermedad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jLabelAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEnfermedad.add(this.jButtonAbrirOrderByTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jComboBoxTiposSeleccionarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
			
			
			/*
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEnfermedad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jCheckBoxSeleccionarTodosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEnfermedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEnfermedad.add(this.jCheckBoxSeleccionarTodosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);															
				
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEnfermedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEnfermedad.add(this.jCheckBoxSeleccionadosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jPanelParametrosAuxiliar3TipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jComboBoxTiposRelacionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
				
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jComboBoxTiposAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
	
				
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEnfermedad.add(this.jTextFieldValorCampoGeneralTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEnfermedad = new GridBagLayout();

			this.jScrollPanelDatosTipoEnfermedad.setLayout(gridaBagLayoutDatosTipoEnfermedad);
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = 0;
			this.gridBagConstraintsTipoEnfermedad.gridx = 0;
			
			this.jScrollPanelDatosTipoEnfermedad.add(this.jTableDatosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEnfermedad.setViewportView(this.jTableDatosTipoEnfermedad);
		this.jTableDatosTipoEnfermedad.setFillsViewportHeight(true);
		this.jTableDatosTipoEnfermedad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEnfermedad= new GridBagLayout();
		this.jPanelAccionesTipoEnfermedad.setLayout(gridaBagLayoutAccionesTipoEnfermedad);
		
		
		/*	
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
			
		this.jPanelAccionesTipoEnfermedad.add(this.jButtonNuevoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEnfermedad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEnfermedad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();						
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEnfermedad.gridx = 0;		
			//this.gridBagConstraintsTipoEnfermedad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEnfermedad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;		
		//this.gridBagConstraintsTipoEnfermedad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEnfermedad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEnfermedad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);								
		
		
		/*
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		*/		
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEnfermedad.gridx =0;
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEnfermedad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
				
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEnfermedad = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEnfermedad.setLayout(gridaBagLayoutBusquedasParametrosTipoEnfermedad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEnfermedad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
			
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
			
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEnfermedad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEnfermedad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEnfermedad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEnfermedad.setName("jPanelReporteDinamicoTipoEnfermedad"); 
		
		this.jPanelReporteDinamicoTipoEnfermedad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEnfermedad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEnfermedad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEnfermedad.setLayout(gridaBagLayoutReporteDinamicoTipoEnfermedad);
		
		
		this.jInternalFrameReporteDinamicoTipoEnfermedad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEnfermedad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEnfermedad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEnfermedad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEnfermedad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEnfermedad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEnfermedad.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEnfermedad.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEnfermedad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEnfermedad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEnfermedad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEnfermedad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Enfermedades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEnfermedad = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEnfermedad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jLabelColumnasSelectReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEnfermedad = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEnfermedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEnfermedad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEnfermedad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEnfermedad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEnfermedad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEnfermedad=new JScrollPane(this.jListColumnasSelectReporteTipoEnfermedad);
			
			this.jScrollColumnasSelectReporteTipoEnfermedad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEnfermedad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEnfermedad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEnfermedad.add(this.jListColumnasSelectReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jScrollColumnasSelectReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEnfermedad = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEnfermedad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jLabelRelacionesSelectReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEnfermedad = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEnfermedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEnfermedad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEnfermedad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEnfermedad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEnfermedad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEnfermedad=new JScrollPane(this.jListRelacionesSelectReporteTipoEnfermedad);
			
			this.jScrollRelacionesSelectReporteTipoEnfermedad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEnfermedad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEnfermedad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEnfermedad.add(this.jListRelacionesSelectReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jScrollRelacionesSelectReporteTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoEnfermedad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEnfermedad = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEnfermedad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEnfermedad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEnfermedad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEnfermedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEnfermedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEnfermedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEnfermedad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEnfermedad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jLabelGenerarExcelReporteDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad.setToolTipText("Generar EXCEL"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEnfermedad.add(this.jButtonGenerarExcelReporteDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jComboBoxTiposReportesDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEnfermedad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEnfermedad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jLabelTiposArchivoReporteDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEnfermedad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEnfermedad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEnfermedad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEnfermedad.setToolTipText("Generar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jButtonGenerarReporteDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEnfermedad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEnfermedad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEnfermedad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEnfermedad.setToolTipText("Cancelar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEnfermedad.add(this.jButtonCerrarReporteDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEnfermedad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEnfermedad= new JScrollPane(jPanelReporteDinamicoTipoEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEnfermedad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEnfermedad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEnfermedad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Enfermedades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEnfermedad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEnfermedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEnfermedad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEnfermedad);
		this.jInternalFrameReporteDinamicoTipoEnfermedad.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEnfermedad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEnfermedad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEnfermedad.setName("jPanelImportacionTipoEnfermedad"); 
		
		this.jPanelImportacionTipoEnfermedad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEnfermedad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEnfermedad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEnfermedad.setLayout(gridaBagLayoutImportacionTipoEnfermedad);
		
		
		this.jInternalFrameImportacionTipoEnfermedad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEnfermedad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEnfermedad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEnfermedad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEnfermedad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEnfermedad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEnfermedad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEnfermedad.setResizable(true);
	    this.jInternalFrameImportacionTipoEnfermedad.setClosable(true);
	    this.jInternalFrameImportacionTipoEnfermedad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEnfermedad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEnfermedad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEnfermedad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEnfermedad.setResizable(true);
	    this.jInternalFrameImportacionTipoEnfermedad.setClosable(true);
	    this.jInternalFrameImportacionTipoEnfermedad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEnfermedad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEnfermedad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEnfermedad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Enfermedades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEnfermedad = new JLabelMe();

		this.jLabelArchivoImportacionTipoEnfermedad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEnfermedad.add(this.jLabelArchivoImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEnfermedad = new JFileChooser();		
		this.jFileChooserImportacionTipoEnfermedad.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEnfermedad = new JButtonMe();
		this.jButtonAbrirImportacionTipoEnfermedad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEnfermedad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEnfermedad.setToolTipText("Generar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEnfermedad.add(this.jButtonAbrirImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEnfermedad = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEnfermedad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEnfermedad.add(this.jLabelPathArchivoImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEnfermedad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEnfermedad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEnfermedad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEnfermedad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEnfermedad.add(this.jTextFieldPathArchivoImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEnfermedad = new JButtonMe();
		this.jButtonGenerarImportacionTipoEnfermedad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEnfermedad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEnfermedad.setToolTipText("Generar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEnfermedad.add(this.jButtonGenerarImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEnfermedad = new JButtonMe();
		this.jButtonCerrarImportacionTipoEnfermedad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEnfermedad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEnfermedad.setToolTipText("Cancelar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEnfermedad.add(this.jButtonCerrarImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEnfermedad = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEnfermedad= new JScrollPane(jPanelImportacionTipoEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEnfermedad.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEnfermedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEnfermedad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEnfermedad);
		this.jInternalFrameImportacionTipoEnfermedad.getContentPane().add(this.jScrollPanelImportacionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEnfermedad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEnfermedad = new JButtonMe();
			this.jButtonAbrirOrderByTipoEnfermedad.setText("Orden");
			this.jButtonAbrirOrderByTipoEnfermedad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEnfermedad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEnfermedad";
			inputMap = this.jButtonAbrirOrderByTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEnfermedad"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEnfermedad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEnfermedad.setName("jPanelOrderByTipoEnfermedad"); 
			
			this.jPanelOrderByTipoEnfermedad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEnfermedad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEnfermedad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEnfermedad.setLayout(gridaBagLayoutOrderByTipoEnfermedad);
			
			
			this.jTableDatosTipoEnfermedadOrderBy = new JTableMe();        
			this.jTableDatosTipoEnfermedadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEnfermedadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEnfermedadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEnfermedadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEnfermedadOrderBy.setViewportView(this.jTableDatosTipoEnfermedadOrderBy);
			this.jTableDatosTipoEnfermedadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEnfermedadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEnfermedad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEnfermedad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEnfermedad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEnfermedad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEnfermedad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEnfermedad.setTitle("Orden");
			this.jInternalFrameOrderByTipoEnfermedad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEnfermedad.setResizable(true);
			this.jInternalFrameOrderByTipoEnfermedad.setClosable(true);
			this.jInternalFrameOrderByTipoEnfermedad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEnfermedad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEnfermedad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEnfermedad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Enfermedades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEnfermedad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEnfermedad.ipady =150;
				
			this.jPanelOrderByTipoEnfermedad.add(jScrollPanelDatosTipoEnfermedadOrderBy, this.gridBagConstraintsTipoEnfermedad);//this.jTableDatosTipoEnfermedadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEnfermedad = new JButtonMe();
			this.jButtonCerrarOrderByTipoEnfermedad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEnfermedad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEnfermedad.setToolTipText("Cancelar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEnfermedad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEnfermedad.add(this.jButtonCerrarOrderByTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEnfermedad = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEnfermedad= new JScrollPane(jPanelOrderByTipoEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEnfermedad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEnfermedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEnfermedad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEnfermedad);
			
			this.jInternalFrameOrderByTipoEnfermedad.getContentPane().add(this.jScrollPanelOrderByTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
		
		} else {
			this.jButtonAbrirOrderByTipoEnfermedad = new JButtonMe();
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
			&& this.tipoenfermedadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEnfermedad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEnfermedad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEnfermedad.getRowHeight();//TipoEnfermedadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.isSelected()) {
					iHeightTable=TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEnfermedad.isSelected()) {
					iHeightTable=TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEnfermedad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEnfermedad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEnfermedad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEnfermedad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEnfermedad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEnfermedad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEnfermedad!=null && this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEnfermedad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEnfermedad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEnfermedad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEnfermedad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEnfermedad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEnfermedad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEnfermedad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoenfermedadLogic.getTipoEnfermedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoenfermedads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEnfermedad> TraerTipoEnfermedadBeans(List<TipoEnfermedad> tipoenfermedads,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEnfermedad tipoenfermedad:tipoenfermedads) {
					
				if(!(TipoEnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoenfermedad.setsDetalleGeneralEntityReporte(TipoEnfermedadConstantesFunciones.getTipoEnfermedadDescripcion(tipoenfermedad));
										
						
					
					

					if(tipoenfermedad.getEnfermedads()!=null && Funciones.existeClass(classes,Enfermedad.class)) {
						try{tipoenfermedad.setenfermedadsDescripcionReporte(new JRBeanCollectionDataSource(EnfermedadJInternalFrame.TraerEnfermedadBeans(tipoenfermedad.getEnfermedads(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoenfermedad.setsDetalleGeneralEntityReporte(tipoenfermedad.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoenfermedadbeans.add(tipoenfermedadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoenfermedads;
    }
	//PARA REPORTES FIN
}
