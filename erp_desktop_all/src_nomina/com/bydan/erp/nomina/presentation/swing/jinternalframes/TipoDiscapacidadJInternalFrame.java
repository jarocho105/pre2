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
import com.bydan.erp.nomina.util.TipoDiscapacidadConstantesFunciones;

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
public class TipoDiscapacidadJInternalFrame extends TipoDiscapacidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDiscapacidad;
	
	protected JMenuBar jmenuBarTipoDiscapacidad;
	
	protected JMenu jmenuTipoDiscapacidad;
	protected JMenu jmenuDatosTipoDiscapacidad;
	protected JMenu jmenuArchivoTipoDiscapacidad;
	protected JMenu jmenuAccionesTipoDiscapacidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDiscapacidad;	
	protected GridBagConstraints gridBagConstraintsTipoDiscapacidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDiscapacidadDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDiscapacidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDiscapacidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDiscapacidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDiscapacidadSessionBean tipodiscapacidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDiscapacidad> tipodiscapacidads;		
	public List<TipoDiscapacidad> tipodiscapacidadsEliminados;	
	public List<TipoDiscapacidad> tipodiscapacidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDiscapacidad;		
	protected JButton jButtonAbrirOrderByTipoDiscapacidad;
	
	
	//protected JPanel jPanelOrderByTipoDiscapacidad;
	//public JScrollPane jScrollPanelOrderByTipoDiscapacidad;	
	//protected JButton jButtonCerrarOrderByTipoDiscapacidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDiscapacidadLogic tipodiscapacidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDiscapacidad;
	public JScrollPane jScrollPanelDatosEdicionTipoDiscapacidad;
	public JScrollPane jScrollPanelDatosGeneralTipoDiscapacidad;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDiscapacidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDiscapacidad;
	//public JScrollPane jScrollPanelImportacionTipoDiscapacidad;
	
	
	
	protected JPanel jPanelAccionesTipoDiscapacidad;
	
    protected JPanel jPanelPaginacionTipoDiscapacidad;
    protected JPanel jPanelParametrosReportesTipoDiscapacidad;
	protected JPanel jPanelParametrosReportesAccionesTipoDiscapacidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDiscapacidad;
	protected JPanel jPanelParametrosAuxiliar2TipoDiscapacidad;
	protected JPanel jPanelParametrosAuxiliar3TipoDiscapacidad;
	protected JPanel jPanelParametrosAuxiliar4TipoDiscapacidad;
	//protected JPanel jPanelParametrosAuxiliar5TipoDiscapacidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDiscapacidad;
	//protected JPanel jPanelImportacionTipoDiscapacidad;
	
	
	public JTable jTableDatosTipoDiscapacidad;
	
	
	
	//public JTable jTableDatosTipoDiscapacidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDiscapacidad;
	protected JButton jButtonDuplicarTipoDiscapacidad;
	protected JButton jButtonCopiarTipoDiscapacidad;
	protected JButton jButtonVerFormTipoDiscapacidad;
	protected JButton jButtonNuevoRelacionesTipoDiscapacidad;
	protected JButton jButtonModificarTipoDiscapacidad;
	
    protected JButton jButtonGuardarCambiosTablaTipoDiscapacidad;
	protected JButton jButtonCerrarTipoDiscapacidad;
	
	
	protected JButton jButtonRecargarInformacionTipoDiscapacidad;
	protected JButton jButtonProcesarInformacionTipoDiscapacidad;
	
	
	protected JButton jButtonAnterioresTipoDiscapacidad;
	protected JButton jButtonSiguientesTipoDiscapacidad;
	protected JButton jButtonNuevoGuardarCambiosTipoDiscapacidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDiscapacidad;
	//protected JButton jButtonCerrarReporteDinamicoTipoDiscapacidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDiscapacidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDiscapacidad;
	//protected JButton jButtonGenerarImportacionTipoDiscapacidad;
	//protected JButton jButtonCerrarImportacionTipoDiscapacidad;
	//protected JFileChooser jFileChooserImportacionTipoDiscapacidad;
	//protected File fileImportacionTipoDiscapacidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDiscapacidad;
	protected JButton jButtonDuplicarToolBarTipoDiscapacidad;
	protected JButton jButtonNuevoRelacionesToolBarTipoDiscapacidad;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDiscapacidad;
	protected JButton jButtonCopiarToolBarTipoDiscapacidad;
	protected JButton jButtonVerFormToolBarTipoDiscapacidad;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDiscapacidad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDiscapacidad;
	protected JButton jButtonCerrarToolBarTipoDiscapacidad;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDiscapacidad;
	protected JButton jButtonProcesarInformacionToolBarTipoDiscapacidad;
	protected JButton jButtonAnterioresToolBarTipoDiscapacidad;
	protected JButton jButtonSiguientesToolBarTipoDiscapacidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDiscapacidad;
	protected JButton jButtonAbrirOrderByToolBarTipoDiscapacidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDiscapacidad;
	protected JMenuItem jMenuItemDuplicarTipoDiscapacidad;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDiscapacidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDiscapacidad;
	protected JMenuItem jMenuItemCopiarTipoDiscapacidad;
	protected JMenuItem jMenuItemVerFormTipoDiscapacidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDiscapacidad;
	protected JMenuItem jMenuItemCerrarTipoDiscapacidad;
	protected JMenuItem jMenuItemDetalleCerrarTipoDiscapacidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDiscapacidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDiscapacidad;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDiscapacidad;
	protected JMenuItem jMenuItemProcesarInformacionTipoDiscapacidad;
	protected JMenuItem jMenuItemAnterioresTipoDiscapacidad;
	protected JMenuItem jMenuItemSiguientesTipoDiscapacidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDiscapacidad;
	protected JMenuItem jMenuItemAbrirOrderByTipoDiscapacidad;
	protected JMenuItem jMenuItemMostrarOcultarTipoDiscapacidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDiscapacidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDiscapacidad;
	protected JCheckBox jCheckBoxSeleccionadosTipoDiscapacidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDiscapacidad;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDiscapacidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDiscapacidad;
	protected JTextField jTextFieldValorCampoGeneralTipoDiscapacidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDiscapacidad;
	//public JList<Reporte> jListColumnasSelectReporteTipoDiscapacidad;
	//public JScrollPane jScrollColumnasSelectReporteTipoDiscapacidad;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDiscapacidad;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDiscapacidad;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDiscapacidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDiscapacidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDiscapacidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDiscapacidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDiscapacidad;
	
		
	//public JLabel jLabelArchivoImportacionTipoDiscapacidad;	
	//public JLabel jLabelPathArchivoImportacionTipoDiscapacidad;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDiscapacidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDiscapacidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDiscapacidad;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDiscapacidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDiscapacidad;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDiscapacidad;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDiscapacidad;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDiscapacidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDiscapacidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDiscapacidad;
	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoDiscapacidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDiscapacidad)	{
		this.jButtonRecargarInformacionTipoDiscapacidad = jButtonRecargarInformacionTipoDiscapacidad;
	}
	
	public JButton getjButtonProcesarInformacionTipoDiscapacidad() {
		return this.jButtonProcesarInformacionTipoDiscapacidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDiscapacidad)	{
		this.jButtonProcesarInformacionTipoDiscapacidad = jButtonProcesarInformacionTipoDiscapacidad;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDiscapacidad() {
		return this.jButtonRecargarInformacionTipoDiscapacidad;
	}
	
	
	public List<TipoDiscapacidad> gettipodiscapacidads() {
		return this.tipodiscapacidads;
	}

	public void settipodiscapacidads(List<TipoDiscapacidad> tipodiscapacidads) {
		this.tipodiscapacidads = tipodiscapacidads;
	}
	
	public List<TipoDiscapacidad> gettipodiscapacidadsAux() {
		return this.tipodiscapacidadsAux;
	}

	public void settipodiscapacidadsAux(List<TipoDiscapacidad> tipodiscapacidadsAux) {
		this.tipodiscapacidadsAux = tipodiscapacidadsAux;
	}
	
	public List<TipoDiscapacidad> gettipodiscapacidadsEliminados() {
		return this.tipodiscapacidadsEliminados;
	}

	public void setTipoDiscapacidadsEliminados(List<TipoDiscapacidad> tipodiscapacidadsEliminados) {
		this.tipodiscapacidadsEliminados = tipodiscapacidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDiscapacidad() {
		return jComboBoxTiposSeleccionarTipoDiscapacidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDiscapacidad(
			JComboBox jComboBoxTiposSeleccionarTipoDiscapacidad) {
		this.jComboBoxTiposSeleccionarTipoDiscapacidad = jComboBoxTiposSeleccionarTipoDiscapacidad;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDiscapacidad() {
		return jTextFieldValorCampoGeneralTipoDiscapacidad;
	}

	public void setjTextFieldValorCampoGeneralTipoDiscapacidad(
			JTextField jTextFieldValorCampoGeneralTipoDiscapacidad) {
		this.jTextFieldValorCampoGeneralTipoDiscapacidad = jTextFieldValorCampoGeneralTipoDiscapacidad;
	}

	public void setBorderResaltarValorCampoGeneralTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDiscapacidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDiscapacidad() {
		return this.jCheckBoxSeleccionarTodosTipoDiscapacidad;
	}

	public void setjCheckBoxSeleccionarTodosTipoDiscapacidad(
			JCheckBox jCheckBoxSeleccionarTodosTipoDiscapacidad) {
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad = jCheckBoxSeleccionarTodosTipoDiscapacidad;
	}

	public void setBorderResaltarSeleccionarTodosTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDiscapacidad() {
		return this.jCheckBoxSeleccionadosTipoDiscapacidad;
	}

	public void setjCheckBoxSeleccionadosTipoDiscapacidad(
			JCheckBox jCheckBoxSeleccionadosTipoDiscapacidad) {
		this.jCheckBoxSeleccionadosTipoDiscapacidad = jCheckBoxSeleccionadosTipoDiscapacidad;
	}
	
	public void setBorderResaltarSeleccionadosTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDiscapacidad() {
		return this.jComboBoxTiposArchivosReportesTipoDiscapacidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDiscapacidad(
			JComboBox jComboBoxTiposArchivosReportesTipoDiscapacidad) {
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad = jComboBoxTiposArchivosReportesTipoDiscapacidad;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDiscapacidad() {
		return this.jComboBoxTiposReportesTipoDiscapacidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDiscapacidad(
			JComboBox jComboBoxTiposReportesTipoDiscapacidad) {
		this.jComboBoxTiposReportesTipoDiscapacidad = jComboBoxTiposReportesTipoDiscapacidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDiscapacidad() {
	//	return jComboBoxTiposReportesDinamicoTipoDiscapacidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDiscapacidad(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDiscapacidad) {
	//	this.jComboBoxTiposReportesDinamicoTipoDiscapacidad = jComboBoxTiposReportesDinamicoTipoDiscapacidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad = jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad;
	//}
	
	public void setBorderResaltarTiposReportesTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDiscapacidad() {
		return this.jComboBoxTiposGraficosReportesTipoDiscapacidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDiscapacidad(
			JComboBox jComboBoxTiposGraficosReportesTipoDiscapacidad) {
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad = jComboBoxTiposGraficosReportesTipoDiscapacidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDiscapacidad() {
		return this.jComboBoxTiposPaginacionTipoDiscapacidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDiscapacidad(
			JComboBox jComboBoxTiposPaginacionTipoDiscapacidad) {
		this.jComboBoxTiposPaginacionTipoDiscapacidad = jComboBoxTiposPaginacionTipoDiscapacidad;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDiscapacidad() {
		return this.jComboBoxTiposRelacionesTipoDiscapacidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDiscapacidad() {
		return this.jComboBoxTiposAccionesTipoDiscapacidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDiscapacidad(
			JComboBox jComboBoxTiposRelacionesTipoDiscapacidad) {
		this.jComboBoxTiposRelacionesTipoDiscapacidad = jComboBoxTiposRelacionesTipoDiscapacidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDiscapacidad(
			JComboBox jComboBoxTiposAccionesTipoDiscapacidad) {
		this.jComboBoxTiposAccionesTipoDiscapacidad = jComboBoxTiposAccionesTipoDiscapacidad;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDiscapacidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDiscapacidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDiscapacidad() {
	//	return jCheckBoxConGraficoDinamicoTipoDiscapacidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDiscapacidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDiscapacidad) {
	//	this.jCheckBoxConGraficoDinamicoTipoDiscapacidad = jCheckBoxConGraficoDinamicoTipoDiscapacidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDiscapacidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDiscapacidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDiscapacidad .setBorder(borderResaltar);		
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
		this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
		
		this.tipodiscapacidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodiscapacidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodiscapacidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDiscapacidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Discapacidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDiscapacidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDiscapacidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"nuevo","nuevo","Nuevo"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"duplicar","duplicar","Duplicar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"copiar","copiar","Copiar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"ver_form","ver_form","Ver"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"recargar","recargar","Recargar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,
							"cerrar","cerrar","Salir"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDiscapacidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDiscapacidad;
			
				this.jButtonProcesarInformacionToolBarTipoDiscapacidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDiscapacidad;
				
		//protected JButton jButtonModificarToolBarTipoDiscapacidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDiscapacidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDiscapacidad=new JMenuMe("General");
		this.jmenuArchivoTipoDiscapacidad=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDiscapacidad=new JMenuMe("Acciones");
		this.jmenuDatosTipoDiscapacidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDiscapacidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDiscapacidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDiscapacidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDiscapacidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDiscapacidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDiscapacidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDiscapacidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDiscapacidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDiscapacidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDiscapacidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDiscapacidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDiscapacidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDiscapacidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDiscapacidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDiscapacidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDiscapacidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDiscapacidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDiscapacidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDiscapacidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDiscapacidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDiscapacidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDiscapacidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDiscapacidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDiscapacidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDiscapacidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDiscapacidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDiscapacidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDiscapacidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDiscapacidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDiscapacidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDiscapacidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDiscapacidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDiscapacidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDiscapacidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDiscapacidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDiscapacidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDiscapacidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDiscapacidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDiscapacidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDiscapacidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDiscapacidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDiscapacidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDiscapacidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDiscapacidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDiscapacidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDiscapacidad.add(this.jMenuItemCerrarTipoDiscapacidad);
			
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemNuevoTipoDiscapacidad);
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad);
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemNuevoRelacionesTipoDiscapacidad);
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemGuardarCambiosTablaTipoDiscapacidad);		
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemDuplicarTipoDiscapacidad);		
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemCopiarTipoDiscapacidad);		
			this.jmenuAccionesTipoDiscapacidad.add(this.jMenuItemVerFormTipoDiscapacidad);		
			
			this.jmenuDatosTipoDiscapacidad.add(this.jMenuItemRecargarInformacionTipoDiscapacidad);				
			this.jmenuDatosTipoDiscapacidad.add(this.jMenuItemAnterioresTipoDiscapacidad);				
			this.jmenuDatosTipoDiscapacidad.add(this.jMenuItemSiguientesTipoDiscapacidad);				
			this.jmenuDatosTipoDiscapacidad.add(this.jMenuItemAbrirOrderByTipoDiscapacidad);				
			this.jmenuDatosTipoDiscapacidad.add(this.jMenuItemMostrarOcultarTipoDiscapacidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDiscapacidad.add(this.jMenuItemGuardarCambiosTipoDiscapacidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDiscapacidad.add(this.jmenuArchivoTipoDiscapacidad);		
			this.jmenuBarTipoDiscapacidad.add(this.jmenuAccionesTipoDiscapacidad);		
			this.jmenuBarTipoDiscapacidad.add(this.jmenuDatosTipoDiscapacidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDiscapacidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDiscapacidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoDiscapacidad=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDiscapacidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDiscapacidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDiscapacidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDiscapacidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDiscapacidad = new TipoDiscapacidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Discapacidad DATOS");
			this.jInternalFrameDetalleFormTipoDiscapacidad = new TipoDiscapacidadDetalleFormJInternalFrame(jDesktopPane,this.tipodiscapacidadSessionBean.getConGuardarRelaciones(),this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDiscapacidad = null;//new TipoDiscapacidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDiscapacidad= new GridBagLayout();
		
		
		this.jTableDatosTipoDiscapacidad = new JTableMe();      
		
		String sToolTipTipoDiscapacidad="";
		sToolTipTipoDiscapacidad=TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDiscapacidad+="(Nomina.TipoDiscapacidad)";
		}
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDiscapacidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDiscapacidad.setToolTipText(sToolTipTipoDiscapacidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDiscapacidad);
		this.jTableDatosTipoDiscapacidad.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDiscapacidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDiscapacidad.setRowSelectionAllowed(true);
		this.jTableDatosTipoDiscapacidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDiscapacidad = new JButtonMe();
		this.jButtonDuplicarTipoDiscapacidad = new JButtonMe();
		this.jButtonCopiarTipoDiscapacidad = new JButtonMe();
		this.jButtonVerFormTipoDiscapacidad = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDiscapacidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad = new JButtonMe();
		this.jButtonCerrarTipoDiscapacidad = new JButtonMe();
		
		this.jScrollPanelDatosTipoDiscapacidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDiscapacidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Discapacidad";
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Discapacidades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDiscapacidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDiscapacidad.setToolTipText("Acciones");
        this.jPanelAccionesTipoDiscapacidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDiscapacidad=new ReporteDinamicoJInternalFrame(TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDiscapacidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDiscapacidad=new ImportacionJInternalFrame(TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDiscapacidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDiscapacidad = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDiscapacidad.setText("Orden");
		this.jButtonAbrirOrderByTipoDiscapacidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDiscapacidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDiscapacidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDiscapacidad,false,this);
			
			//this.cargarOrderByTipoDiscapacidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDiscapacidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDiscapacidad,true,this);
			
			//this.cargarOrderByTipoDiscapacidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDiscapacidad.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDiscapacidad.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDiscapacidad.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoDiscapacidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDiscapacidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDiscapacidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDiscapacidad.setText("Nuevo");
		this.jButtonDuplicarTipoDiscapacidad.setText("Duplicar");
		this.jButtonCopiarTipoDiscapacidad.setText("Copiar");
		this.jButtonVerFormTipoDiscapacidad.setText("Ver");
		this.jButtonNuevoRelacionesTipoDiscapacidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.setText("Guardar");
		this.jButtonCerrarTipoDiscapacidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDiscapacidad,"nuevo_button","Nuevo",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDiscapacidad,"duplicar_button","Duplicar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDiscapacidad,"copiar_button","Copiar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDiscapacidad,"ver_form","Ver",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDiscapacidad,"nuevorelaciones_button","Nuevo Rel",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDiscapacidad,"guardarcambiostabla_button","Guardar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDiscapacidad,"cerrar_button","Salir",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDiscapacidad.setToolTipText("Nuevo"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDiscapacidad.setToolTipText("Duplicar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDiscapacidad.setToolTipText("Copiar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDiscapacidad.setToolTipText("Ver"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDiscapacidad.setToolTipText("Nuevo Rel"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.setToolTipText("Guardar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDiscapacidad.setToolTipText("Salir"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDiscapacidad";
		inputMap = this.jButtonNuevoTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDiscapacidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDiscapacidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDiscapacidad";
		inputMap = this.jButtonDuplicarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDiscapacidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDiscapacidad"));
		
		//COPIAR
		sMapKey = "CopiarTipoDiscapacidad";
		inputMap = this.jButtonCopiarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDiscapacidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDiscapacidad"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDiscapacidad";
		inputMap = this.jButtonVerFormTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDiscapacidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDiscapacidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDiscapacidad";
		inputMap = this.jButtonNuevoRelacionesTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDiscapacidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDiscapacidad";
		inputMap = this.jButtonModificarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDiscapacidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDiscapacidad";
		inputMap = this.jButtonCerrarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDiscapacidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDiscapacidad";
		inputMap = this.jButtonGuardarCambiosTablaTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDiscapacidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDiscapacidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDiscapacidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDiscapacidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDiscapacidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDiscapacidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDiscapacidad.setName("jPanelParametrosReportesTipoDiscapacidad"); 
		
		this.jPanelParametrosReportesAccionesTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDiscapacidad.setName("jPanelParametrosReportesAccionesTipoDiscapacidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDiscapacidad = new JButtonMe();
		this.jButtonRecargarInformacionTipoDiscapacidad.setText("Recargar");
		this.jButtonRecargarInformacionTipoDiscapacidad.setToolTipText("Recargar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDiscapacidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDiscapacidad = new JButtonMe();
		this.jButtonProcesarInformacionTipoDiscapacidad.setText("Procesar");
		this.jButtonProcesarInformacionTipoDiscapacidad.setToolTipText("Procesar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDiscapacidad.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDiscapacidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDiscapacidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDiscapacidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDiscapacidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDiscapacidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDiscapacidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDiscapacidad.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDiscapacidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDiscapacidad.setText("Accion");
		this.jComboBoxTiposAccionesTipoDiscapacidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDiscapacidad.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDiscapacidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDiscapacidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDiscapacidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDiscapacidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDiscapacidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDiscapacidad = new JLabelMe();
		
		this.jLabelAccionesTipoDiscapacidad.setText("Acciones");		
		this.jLabelAccionesTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDiscapacidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDiscapacidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDiscapacidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDiscapacidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDiscapacidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDiscapacidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDiscapacidad = new JButtonMe();
		//this.jButtonAnterioresTipoDiscapacidad.setText("<<");
        this.jButtonAnterioresTipoDiscapacidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDiscapacidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDiscapacidad = new JButtonMe();
		//this.jButtonSiguientesTipoDiscapacidad.setText(">>");
        this.jButtonSiguientesTipoDiscapacidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDiscapacidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDiscapacidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDiscapacidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDiscapacidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDiscapacidad,"nuevoguardarcambios_button","Nue",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDiscapacidad";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDiscapacidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDiscapacidad";
		inputMap = this.jButtonRecargarInformacionTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDiscapacidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDiscapacidad";
		inputMap = this.jButtonSiguientesTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDiscapacidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDiscapacidad";
		inputMap = this.jButtonAnterioresTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDiscapacidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDiscapacidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDiscapacidad.setMinimumSize(new Dimension(this.getWidth(),TipoDiscapacidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDiscapacidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDiscapacidad.setMaximumSize(new Dimension(this.getWidth(),TipoDiscapacidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDiscapacidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDiscapacidad.setPreferredSize(new Dimension(this.getWidth(),TipoDiscapacidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDiscapacidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDiscapacidad = new GridBagLayout();

			this.jPanelPaginacionTipoDiscapacidad.setLayout(gridaBagLayoutPaginacionTipoDiscapacidad);						
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonAnterioresTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
					
						
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
			
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonNuevoGuardarCambiosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
						
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonSiguientesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonNuevoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
				this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
				this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonNuevoRelacionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			}
			
			
			if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
				this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
				this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonGuardarCambiosTablaTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			}
			
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonDuplicarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonCopiarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonVerFormTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 1;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDiscapacidad.add(this.jButtonCerrarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		
		this.jButtonRecargarInformacionTipoDiscapacidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDiscapacidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDiscapacidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDiscapacidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDiscapacidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDiscapacidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDiscapacidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDiscapacidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDiscapacidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDiscapacidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDiscapacidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDiscapacidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDiscapacidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDiscapacidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDiscapacidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDiscapacidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDiscapacidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDiscapacidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDiscapacidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDiscapacidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDiscapacidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDiscapacidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDiscapacidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDiscapacidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDiscapacidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDiscapacidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDiscapacidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDiscapacidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDiscapacidad.setLayout(gridaBagParametrosReportesTipoDiscapacidad);
			this.jPanelParametrosReportesAccionesTipoDiscapacidad.setLayout(gridaBagParametrosReportesAccionesTipoDiscapacidad);
			
			
			this.jPanelParametrosAuxiliar1TipoDiscapacidad.setLayout(gridaBagParametrosAuxiliar1TipoDiscapacidad);
			this.jPanelParametrosAuxiliar2TipoDiscapacidad.setLayout(gridaBagParametrosAuxiliar2TipoDiscapacidad);
			this.jPanelParametrosAuxiliar3TipoDiscapacidad.setLayout(gridaBagParametrosAuxiliar3TipoDiscapacidad);
			this.jPanelParametrosAuxiliar4TipoDiscapacidad.setLayout(gridaBagParametrosAuxiliar4TipoDiscapacidad);
			//this.jPanelParametrosAuxiliar5TipoDiscapacidad.setLayout(gridaBagParametrosAuxiliar2TipoDiscapacidad);			
			
			
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jButtonRecargarInformacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDiscapacidad.add(this.jComboBoxTiposPaginacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDiscapacidad.add(this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDiscapacidad.add(this.jComboBoxTiposArchivosReportesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jPanelParametrosAuxiliar1TipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDiscapacidad.add(this.jComboBoxTiposReportesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);																		
			
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoDiscapacidad.add(this.jComboBoxTiposGraficosReportesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jPanelParametrosAuxiliar4TipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jComboBoxTiposReportesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jCheckBoxGenerarReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jPanelParametrosAuxiliar2TipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jLabelAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
				this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDiscapacidad.add(this.jButtonAbrirOrderByTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jComboBoxTiposSeleccionarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
			
			
			/*
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jCheckBoxSeleccionarTodosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jCheckBoxConGraficoReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDiscapacidad.add(this.jCheckBoxSeleccionarTodosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);															
				
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDiscapacidad.add(this.jCheckBoxSeleccionadosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);															
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDiscapacidad.add(this.jCheckBoxConGraficoReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jPanelParametrosAuxiliar3TipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jComboBoxTiposRelacionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
				
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDiscapacidad.add(this.jComboBoxTiposAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDiscapacidad = new GridBagLayout();

			this.jScrollPanelDatosTipoDiscapacidad.setLayout(gridaBagLayoutDatosTipoDiscapacidad);
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
			this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
			
			this.jScrollPanelDatosTipoDiscapacidad.add(this.jTableDatosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDiscapacidad.setViewportView(this.jTableDatosTipoDiscapacidad);
		this.jTableDatosTipoDiscapacidad.setFillsViewportHeight(true);
		this.jTableDatosTipoDiscapacidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDiscapacidad= new GridBagLayout();
		this.jPanelAccionesTipoDiscapacidad.setLayout(gridaBagLayoutAccionesTipoDiscapacidad);
		
		
		/*	
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
			
		this.jPanelAccionesTipoDiscapacidad.add(this.jButtonNuevoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDiscapacidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDiscapacidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();						
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDiscapacidad.gridx = 0;		
			//this.gridBagConstraintsTipoDiscapacidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDiscapacidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;		
		//this.gridBagConstraintsTipoDiscapacidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDiscapacidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDiscapacidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);								
		
		
		/*
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		*/		
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDiscapacidad.gridx =0;
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDiscapacidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
				
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDiscapacidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDiscapacidad = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDiscapacidad.setLayout(gridaBagLayoutBusquedasParametrosTipoDiscapacidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDiscapacidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDiscapacidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDiscapacidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDiscapacidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDiscapacidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDiscapacidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDiscapacidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDiscapacidad.setName("jPanelReporteDinamicoTipoDiscapacidad"); 
		
		this.jPanelReporteDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDiscapacidad.setLayout(gridaBagLayoutReporteDinamicoTipoDiscapacidad);
		
		
		this.jInternalFrameReporteDinamicoTipoDiscapacidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDiscapacidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDiscapacidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDiscapacidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDiscapacidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDiscapacidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDiscapacidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDiscapacidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDiscapacidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDiscapacidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDiscapacidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Discapacidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDiscapacidad = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDiscapacidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelColumnasSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDiscapacidad = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDiscapacidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDiscapacidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDiscapacidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDiscapacidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDiscapacidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDiscapacidad=new JScrollPane(this.jListColumnasSelectReporteTipoDiscapacidad);
			
			this.jScrollColumnasSelectReporteTipoDiscapacidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDiscapacidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDiscapacidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jListColumnasSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jScrollColumnasSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDiscapacidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDiscapacidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelRelacionesSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDiscapacidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDiscapacidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDiscapacidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDiscapacidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDiscapacidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDiscapacidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDiscapacidad=new JScrollPane(this.jListRelacionesSelectReporteTipoDiscapacidad);
			
			this.jScrollRelacionesSelectReporteTipoDiscapacidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDiscapacidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDiscapacidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jListRelacionesSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jScrollRelacionesSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDiscapacidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDiscapacidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDiscapacidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDiscapacidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoDiscapacidad = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoDiscapacidad.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelConGraficoDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoDiscapacidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoDiscapacidad.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoDiscapacidad.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jCheckBoxConGraficoDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoDiscapacidad = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoDiscapacidad.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelColumnaCategoriaGraficoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoDiscapacidad = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoDiscapacidad.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelColumnaCategoriaValorTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoDiscapacidad.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoDiscapacidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoDiscapacidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jComboBoxColumnaCategoriaValorTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoDiscapacidad = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoDiscapacidad.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelColumnasValoresGraficoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoDiscapacidad = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoDiscapacidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoDiscapacidad.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoDiscapacidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoDiscapacidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoDiscapacidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoDiscapacidad=new JScrollPane(this.jListColumnasValoresGraficoTipoDiscapacidad);
			
			this.jScrollColumnasValoresGraficoTipoDiscapacidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoDiscapacidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoDiscapacidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jListColumnasSelectReporteTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jScrollColumnasValoresGraficoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoDiscapacidad = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoDiscapacidad.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelTiposGraficosReportesDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoDiscapacidad.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jComboBoxTiposGraficosReportesDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDiscapacidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDiscapacidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelGenerarExcelReporteDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad.setToolTipText("Generar EXCEL"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jComboBoxTiposReportesDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDiscapacidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDiscapacidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jLabelTiposArchivoReporteDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDiscapacidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDiscapacidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDiscapacidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDiscapacidad.setToolTipText("Generar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jButtonGenerarReporteDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDiscapacidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDiscapacidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDiscapacidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDiscapacidad.setToolTipText("Cancelar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDiscapacidad.add(this.jButtonCerrarReporteDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDiscapacidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDiscapacidad= new JScrollPane(jPanelReporteDinamicoTipoDiscapacidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDiscapacidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDiscapacidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDiscapacidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Discapacidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDiscapacidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDiscapacidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDiscapacidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDiscapacidad);
		this.jInternalFrameReporteDinamicoTipoDiscapacidad.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDiscapacidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDiscapacidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDiscapacidad.setName("jPanelImportacionTipoDiscapacidad"); 
		
		this.jPanelImportacionTipoDiscapacidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDiscapacidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDiscapacidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDiscapacidad.setLayout(gridaBagLayoutImportacionTipoDiscapacidad);
		
		
		this.jInternalFrameImportacionTipoDiscapacidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDiscapacidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDiscapacidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDiscapacidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDiscapacidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDiscapacidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDiscapacidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDiscapacidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDiscapacidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDiscapacidad.setResizable(true);
	    this.jInternalFrameImportacionTipoDiscapacidad.setClosable(true);
	    this.jInternalFrameImportacionTipoDiscapacidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDiscapacidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDiscapacidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDiscapacidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDiscapacidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDiscapacidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDiscapacidad.setResizable(true);
	    this.jInternalFrameImportacionTipoDiscapacidad.setClosable(true);
	    this.jInternalFrameImportacionTipoDiscapacidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDiscapacidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDiscapacidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDiscapacidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Discapacidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDiscapacidad = new JLabelMe();

		this.jLabelArchivoImportacionTipoDiscapacidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDiscapacidad.add(this.jLabelArchivoImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDiscapacidad = new JFileChooser();		
		this.jFileChooserImportacionTipoDiscapacidad.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDiscapacidad = new JButtonMe();
		this.jButtonAbrirImportacionTipoDiscapacidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDiscapacidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDiscapacidad.setToolTipText("Generar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDiscapacidad.add(this.jButtonAbrirImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDiscapacidad = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDiscapacidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDiscapacidad.add(this.jLabelPathArchivoImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDiscapacidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDiscapacidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDiscapacidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDiscapacidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDiscapacidad.add(this.jTextFieldPathArchivoImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDiscapacidad = new JButtonMe();
		this.jButtonGenerarImportacionTipoDiscapacidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDiscapacidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDiscapacidad.setToolTipText("Generar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDiscapacidad.add(this.jButtonGenerarImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDiscapacidad = new JButtonMe();
		this.jButtonCerrarImportacionTipoDiscapacidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDiscapacidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDiscapacidad.setToolTipText("Cancelar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDiscapacidad.add(this.jButtonCerrarImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDiscapacidad = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDiscapacidad= new JScrollPane(jPanelImportacionTipoDiscapacidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDiscapacidad.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDiscapacidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDiscapacidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDiscapacidad);
		this.jInternalFrameImportacionTipoDiscapacidad.getContentPane().add(this.jScrollPanelImportacionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDiscapacidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDiscapacidad = new JButtonMe();
			this.jButtonAbrirOrderByTipoDiscapacidad.setText("Orden");
			this.jButtonAbrirOrderByTipoDiscapacidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDiscapacidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDiscapacidad";
			inputMap = this.jButtonAbrirOrderByTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDiscapacidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDiscapacidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDiscapacidad.setName("jPanelOrderByTipoDiscapacidad"); 
			
			this.jPanelOrderByTipoDiscapacidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDiscapacidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDiscapacidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDiscapacidad.setLayout(gridaBagLayoutOrderByTipoDiscapacidad);
			
			
			this.jTableDatosTipoDiscapacidadOrderBy = new JTableMe();        
			this.jTableDatosTipoDiscapacidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDiscapacidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDiscapacidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDiscapacidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDiscapacidadOrderBy.setViewportView(this.jTableDatosTipoDiscapacidadOrderBy);
			this.jTableDatosTipoDiscapacidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDiscapacidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDiscapacidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDiscapacidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDiscapacidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDiscapacidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDiscapacidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDiscapacidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDiscapacidad.setTitle("Orden");
			this.jInternalFrameOrderByTipoDiscapacidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDiscapacidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDiscapacidad.setResizable(true);
			this.jInternalFrameOrderByTipoDiscapacidad.setClosable(true);
			this.jInternalFrameOrderByTipoDiscapacidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDiscapacidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDiscapacidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDiscapacidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Discapacidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDiscapacidad.ipady =150;
				
			this.jPanelOrderByTipoDiscapacidad.add(jScrollPanelDatosTipoDiscapacidadOrderBy, this.gridBagConstraintsTipoDiscapacidad);//this.jTableDatosTipoDiscapacidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDiscapacidad = new JButtonMe();
			this.jButtonCerrarOrderByTipoDiscapacidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDiscapacidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDiscapacidad.setToolTipText("Cancelar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDiscapacidad.add(this.jButtonCerrarOrderByTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDiscapacidad = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDiscapacidad= new JScrollPane(jPanelOrderByTipoDiscapacidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDiscapacidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDiscapacidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDiscapacidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDiscapacidad);
			
			this.jInternalFrameOrderByTipoDiscapacidad.getContentPane().add(this.jScrollPanelOrderByTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
		
		} else {
			this.jButtonAbrirOrderByTipoDiscapacidad = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodiscapacidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDiscapacidad.getRowHeight();//TipoDiscapacidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.isSelected()) {
					iHeightTable=TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDiscapacidad.isSelected()) {
					iHeightTable=TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDiscapacidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDiscapacidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDiscapacidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDiscapacidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDiscapacidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDiscapacidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDiscapacidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDiscapacidad!=null && this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDiscapacidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDiscapacidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDiscapacidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDiscapacidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDiscapacidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDiscapacidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodiscapacidadLogic.getTipoDiscapacidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodiscapacidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDiscapacidad> TraerTipoDiscapacidadBeans(List<TipoDiscapacidad> tipodiscapacidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidads) {
					
				if(!(TipoDiscapacidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDiscapacidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodiscapacidad.setsDetalleGeneralEntityReporte(TipoDiscapacidadConstantesFunciones.getTipoDiscapacidadDescripcion(tipodiscapacidad));
										
						
					
					

					if(tipodiscapacidad.getEmpleadoDiscas()!=null && Funciones.existeClass(classes,EmpleadoDisca.class)) {
						try{tipodiscapacidad.setempleadodiscasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoDiscaJInternalFrame.TraerEmpleadoDiscaBeans(tipodiscapacidad.getEmpleadoDiscas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodiscapacidad.setsDetalleGeneralEntityReporte(tipodiscapacidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodiscapacidadbeans.add(tipodiscapacidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodiscapacidads;
    }
	//PARA REPORTES FIN
}
