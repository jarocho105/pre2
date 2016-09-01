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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.TipoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class TipoActivoFijoJInternalFrame extends TipoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoActivoFijo;
	
	protected JMenuBar jmenuBarTipoActivoFijo;
	
	protected JMenu jmenuTipoActivoFijo;
	protected JMenu jmenuDatosTipoActivoFijo;
	protected JMenu jmenuArchivoTipoActivoFijo;
	protected JMenu jmenuAccionesTipoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoActivoFijoSessionBean tipoactivofijoSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoActivoFijo> tipoactivofijos;		
	public List<TipoActivoFijo> tipoactivofijosEliminados;	
	public List<TipoActivoFijo> tipoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoActivoFijo;		
	protected JButton jButtonAbrirOrderByTipoActivoFijo;
	
	
	//protected JPanel jPanelOrderByTipoActivoFijo;
	//public JScrollPane jScrollPanelOrderByTipoActivoFijo;	
	//protected JButton jButtonCerrarOrderByTipoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoActivoFijoLogic tipoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoActivoFijo;
	//public JScrollPane jScrollPanelImportacionTipoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesTipoActivoFijo;
	
    protected JPanel jPanelPaginacionTipoActivoFijo;
    protected JPanel jPanelParametrosReportesTipoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesTipoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2TipoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3TipoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4TipoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5TipoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoActivoFijo;
	//protected JPanel jPanelImportacionTipoActivoFijo;
	
	
	public JTable jTableDatosTipoActivoFijo;
	
	
	
	//public JTable jTableDatosTipoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoActivoFijo;
	protected JButton jButtonDuplicarTipoActivoFijo;
	protected JButton jButtonCopiarTipoActivoFijo;
	protected JButton jButtonVerFormTipoActivoFijo;
	protected JButton jButtonNuevoRelacionesTipoActivoFijo;
	protected JButton jButtonModificarTipoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaTipoActivoFijo;
	protected JButton jButtonCerrarTipoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionTipoActivoFijo;
	protected JButton jButtonProcesarInformacionTipoActivoFijo;
	
	
	protected JButton jButtonAnterioresTipoActivoFijo;
	protected JButton jButtonSiguientesTipoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosTipoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoTipoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoActivoFijo;
	//protected JButton jButtonGenerarImportacionTipoActivoFijo;
	//protected JButton jButtonCerrarImportacionTipoActivoFijo;
	//protected JFileChooser jFileChooserImportacionTipoActivoFijo;
	//protected File fileImportacionTipoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoActivoFijo;
	protected JButton jButtonDuplicarToolBarTipoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarTipoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoActivoFijo;
	protected JButton jButtonCopiarToolBarTipoActivoFijo;
	protected JButton jButtonVerFormToolBarTipoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarTipoActivoFijo;
	protected JButton jButtonAnterioresToolBarTipoActivoFijo;
	protected JButton jButtonSiguientesToolBarTipoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarTipoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoActivoFijo;
	protected JMenuItem jMenuItemDuplicarTipoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoActivoFijo;
	protected JMenuItem jMenuItemCopiarTipoActivoFijo;
	protected JMenuItem jMenuItemVerFormTipoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionTipoActivoFijo;
	protected JMenuItem jMenuItemAnterioresTipoActivoFijo;
	protected JMenuItem jMenuItemSiguientesTipoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByTipoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosTipoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralTipoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteTipoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteTipoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionTipoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionTipoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoActivoFijo;
	public JPanel jPanelFK_IdPaisTipoActivoFijo;
	public JButton jButtonFK_IdPaisTipoActivoFijo;
	
	public JPanel jPanelid_paisFK_IdPaisTipoActivoFijo;
	public JLabel jLabelid_paisFK_IdPaisTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoActivoFijo;
	public JButton jButtonid_paisFK_IdPaisTipoActivoFijo= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoActivoFijo)	{
		this.jButtonRecargarInformacionTipoActivoFijo = jButtonRecargarInformacionTipoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionTipoActivoFijo() {
		return this.jButtonProcesarInformacionTipoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoActivoFijo)	{
		this.jButtonProcesarInformacionTipoActivoFijo = jButtonProcesarInformacionTipoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoActivoFijo() {
		return this.jButtonRecargarInformacionTipoActivoFijo;
	}
	
	
	public List<TipoActivoFijo> gettipoactivofijos() {
		return this.tipoactivofijos;
	}

	public void settipoactivofijos(List<TipoActivoFijo> tipoactivofijos) {
		this.tipoactivofijos = tipoactivofijos;
	}
	
	public List<TipoActivoFijo> gettipoactivofijosAux() {
		return this.tipoactivofijosAux;
	}

	public void settipoactivofijosAux(List<TipoActivoFijo> tipoactivofijosAux) {
		this.tipoactivofijosAux = tipoactivofijosAux;
	}
	
	public List<TipoActivoFijo> gettipoactivofijosEliminados() {
		return this.tipoactivofijosEliminados;
	}

	public void setTipoActivoFijosEliminados(List<TipoActivoFijo> tipoactivofijosEliminados) {
		this.tipoactivofijosEliminados = tipoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoActivoFijo() {
		return jComboBoxTiposSeleccionarTipoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarTipoActivoFijo) {
		this.jComboBoxTiposSeleccionarTipoActivoFijo = jComboBoxTiposSeleccionarTipoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoActivoFijo() {
		return jTextFieldValorCampoGeneralTipoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralTipoActivoFijo(
			JTextField jTextFieldValorCampoGeneralTipoActivoFijo) {
		this.jTextFieldValorCampoGeneralTipoActivoFijo = jTextFieldValorCampoGeneralTipoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosTipoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosTipoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosTipoActivoFijo) {
		this.jCheckBoxSeleccionarTodosTipoActivoFijo = jCheckBoxSeleccionarTodosTipoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoActivoFijo() {
		return this.jCheckBoxSeleccionadosTipoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosTipoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosTipoActivoFijo) {
		this.jCheckBoxSeleccionadosTipoActivoFijo = jCheckBoxSeleccionadosTipoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesTipoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesTipoActivoFijo) {
		this.jComboBoxTiposArchivosReportesTipoActivoFijo = jComboBoxTiposArchivosReportesTipoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoActivoFijo() {
		return this.jComboBoxTiposReportesTipoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoActivoFijo(
			JComboBox jComboBoxTiposReportesTipoActivoFijo) {
		this.jComboBoxTiposReportesTipoActivoFijo = jComboBoxTiposReportesTipoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoTipoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoTipoActivoFijo = jComboBoxTiposReportesDinamicoTipoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo = jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesTipoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesTipoActivoFijo) {
		this.jComboBoxTiposGraficosReportesTipoActivoFijo = jComboBoxTiposGraficosReportesTipoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoActivoFijo() {
		return this.jComboBoxTiposPaginacionTipoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoActivoFijo(
			JComboBox jComboBoxTiposPaginacionTipoActivoFijo) {
		this.jComboBoxTiposPaginacionTipoActivoFijo = jComboBoxTiposPaginacionTipoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoActivoFijo() {
		return this.jComboBoxTiposRelacionesTipoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoActivoFijo = jComboBoxTiposRelacionesTipoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoActivoFijo) {
		this.jComboBoxTiposAccionesTipoActivoFijo = jComboBoxTiposAccionesTipoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoTipoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoTipoActivoFijo = jCheckBoxConGraficoDinamicoTipoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoActivoFijo .setBorder(borderResaltar);		
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
		this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
		
		this.tipoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"copiar","copiar","Copiar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"ver_form","ver_form","Ver"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"recargar","recargar","Recargar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoActivoFijo,this.jTtoolBarTipoActivoFijo,
							"cerrar","cerrar","Salir"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarTipoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoActivoFijo;
				
		//protected JButton jButtonModificarToolBarTipoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoTipoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosTipoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoActivoFijo.add(this.jMenuItemCerrarTipoActivoFijo);
			
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemNuevoTipoActivoFijo);
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosTipoActivoFijo);
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemNuevoRelacionesTipoActivoFijo);
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemGuardarCambiosTablaTipoActivoFijo);		
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemDuplicarTipoActivoFijo);		
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemCopiarTipoActivoFijo);		
			this.jmenuAccionesTipoActivoFijo.add(this.jMenuItemVerFormTipoActivoFijo);		
			
			this.jmenuDatosTipoActivoFijo.add(this.jMenuItemRecargarInformacionTipoActivoFijo);				
			this.jmenuDatosTipoActivoFijo.add(this.jMenuItemAnterioresTipoActivoFijo);				
			this.jmenuDatosTipoActivoFijo.add(this.jMenuItemSiguientesTipoActivoFijo);				
			this.jmenuDatosTipoActivoFijo.add(this.jMenuItemAbrirOrderByTipoActivoFijo);				
			this.jmenuDatosTipoActivoFijo.add(this.jMenuItemMostrarOcultarTipoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoActivoFijo.add(this.jMenuItemGuardarCambiosTipoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoActivoFijo.add(this.jmenuArchivoTipoActivoFijo);		
			this.jmenuBarTipoActivoFijo.add(this.jmenuAccionesTipoActivoFijo);		
			this.jmenuBarTipoActivoFijo.add(this.jmenuDatosTipoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoActivoFijo.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoActivoFijo= new JButtonMe();
		this.jButtonFK_IdPaisTipoActivoFijo.setText("Buscar");
		this.jButtonFK_IdPaisTipoActivoFijo.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoActivoFijo,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoActivoFijo = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoActivoFijo.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoActivoFijo.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoActivoFijo= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoActivoFijo = new TipoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Activo Fijo DATOS");
			this.jInternalFrameDetalleFormTipoActivoFijo = new TipoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tipoactivofijoSessionBean.getConGuardarRelaciones(),this.tipoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoActivoFijo = null;//new TipoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosTipoActivoFijo = new JTableMe();      
		
		String sToolTipTipoActivoFijo="";
		sToolTipTipoActivoFijo=TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoActivoFijo+="(ActivosFijos.TipoActivoFijo)";
		}
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoActivoFijo.setToolTipText(sToolTipTipoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoActivoFijo);
		this.jTableDatosTipoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosTipoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoActivoFijo = new JButtonMe();
		this.jButtonDuplicarTipoActivoFijo = new JButtonMe();
		this.jButtonCopiarTipoActivoFijo = new JButtonMe();
		this.jButtonVerFormTipoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Activo Fijo";
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoActivoFijo=new ReporteDinamicoJInternalFrame(TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoActivoFijo=new ImportacionJInternalFrame(TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByTipoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijo,false,this);
			
			//this.cargarOrderByTipoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijo,true,this);
			
			//this.cargarOrderByTipoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoActivoFijo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoActivoFijo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoActivoFijo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarTipoActivoFijo.setText("Duplicar");
		this.jButtonCopiarTipoActivoFijo.setText("Copiar");
		this.jButtonVerFormTipoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesTipoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoActivoFijo,"nuevo_button","Nuevo",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoActivoFijo,"duplicar_button","Duplicar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoActivoFijo,"copiar_button","Copiar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoActivoFijo,"ver_form","Ver",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoActivoFijo,"guardarcambiostabla_button","Guardar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoActivoFijo,"cerrar_button","Salir",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoActivoFijo.setToolTipText("Nuevo"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoActivoFijo.setToolTipText("Duplicar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoActivoFijo.setToolTipText("Copiar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoActivoFijo.setToolTipText("Ver"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoActivoFijo.setToolTipText("Nuevo Rel"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.setToolTipText("Guardar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoActivoFijo.setToolTipText("Salir"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoActivoFijo";
		inputMap = this.jButtonNuevoTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoActivoFijo";
		inputMap = this.jButtonDuplicarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarTipoActivoFijo";
		inputMap = this.jButtonCopiarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoActivoFijo";
		inputMap = this.jButtonVerFormTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoActivoFijo";
		inputMap = this.jButtonModificarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoActivoFijo";
		inputMap = this.jButtonCerrarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoActivoFijo.setName("jPanelParametrosReportesTipoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoActivoFijo.setName("jPanelParametrosReportesAccionesTipoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionTipoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionTipoActivoFijo.setToolTipText("Recargar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionTipoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionTipoActivoFijo.setToolTipText("Procesar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresTipoActivoFijo.setText("<<");
        this.jButtonAnterioresTipoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesTipoActivoFijo.setText(">>");
        this.jButtonSiguientesTipoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoActivoFijo,"nuevoguardarcambios_button","Nue",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoActivoFijo";
		inputMap = this.jButtonRecargarInformacionTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoActivoFijo";
		inputMap = this.jButtonSiguientesTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoActivoFijo";
		inputMap = this.jButtonAnterioresTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),TipoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),TipoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),TipoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionTipoActivoFijo.setLayout(gridaBagLayoutPaginacionTipoActivoFijo);						
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonAnterioresTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
					
						
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonNuevoGuardarCambiosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
						
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoActivoFijo.gridy = 0;
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonSiguientesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonNuevoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
						
			
			
			if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoActivoFijo.gridy = 1;
				this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoActivoFijo.add(this.jButtonGuardarCambiosTablaTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonDuplicarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonCopiarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonVerFormTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoActivoFijo.add(this.jButtonCerrarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionTipoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoActivoFijo.setLayout(gridaBagParametrosReportesTipoActivoFijo);
			this.jPanelParametrosReportesAccionesTipoActivoFijo.setLayout(gridaBagParametrosReportesAccionesTipoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1TipoActivoFijo.setLayout(gridaBagParametrosAuxiliar1TipoActivoFijo);
			this.jPanelParametrosAuxiliar2TipoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoActivoFijo);
			this.jPanelParametrosAuxiliar3TipoActivoFijo.setLayout(gridaBagParametrosAuxiliar3TipoActivoFijo);
			this.jPanelParametrosAuxiliar4TipoActivoFijo.setLayout(gridaBagParametrosAuxiliar4TipoActivoFijo);
			//this.jPanelParametrosAuxiliar5TipoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jButtonRecargarInformacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoActivoFijo.add(this.jComboBoxTiposPaginacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoActivoFijo.add(this.jComboBoxTiposArchivosReportesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jPanelParametrosAuxiliar1TipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoActivoFijo.add(this.jComboBoxTiposReportesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jPanelParametrosAuxiliar4TipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jComboBoxTiposReportesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jCheckBoxGenerarReporteTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jPanelParametrosAuxiliar2TipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jLabelAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoActivoFijo.add(this.jButtonAbrirOrderByTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jComboBoxTiposSeleccionarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);															
				
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoActivoFijo.add(this.jCheckBoxSeleccionadosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jPanelParametrosAuxiliar3TipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoActivoFijo.add(this.jComboBoxTiposAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosTipoActivoFijo.setLayout(gridaBagLayoutDatosTipoActivoFijo);
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosTipoActivoFijo.add(this.jTableDatosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoActivoFijo.setViewportView(this.jTableDatosTipoActivoFijo);
		this.jTableDatosTipoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosTipoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoActivoFijo.setLayout(gridaBagLayoutAccionesTipoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
			
		this.jPanelAccionesTipoActivoFijo.add(this.jButtonNuevoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoActivoFijo.setLayout(gridaBagLayoutFK_IdPaisTipoActivoFijo);

		gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoActivoFijo.gridy = 0;
		gridBagConstraintsTipoActivoFijo.gridx = 0;
		jPanelFK_IdPaisTipoActivoFijo.add(jLabelid_paisFK_IdPaisTipoActivoFijo, gridBagConstraintsTipoActivoFijo);

		gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoActivoFijo.gridy = 0;
		gridBagConstraintsTipoActivoFijo.gridx = 1;
		jPanelFK_IdPaisTipoActivoFijo.add(jComboBoxid_paisFK_IdPaisTipoActivoFijo, gridBagConstraintsTipoActivoFijo);

		gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoActivoFijo.gridy = 1;
		gridBagConstraintsTipoActivoFijo.gridx =1;
		jPanelFK_IdPaisTipoActivoFijo.add(jButtonFK_IdPaisTipoActivoFijo, gridBagConstraintsTipoActivoFijo);

		jTabbedPaneBusquedasTipoActivoFijo.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoActivoFijo);
		jTabbedPaneBusquedasTipoActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsTipoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;		
			this.gridBagConstraintsTipoActivoFijo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		*/		
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
				
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosTipoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
			
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
			
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoActivoFijo.setName("jPanelReporteDinamicoTipoActivoFijo"); 
		
		this.jPanelReporteDinamicoTipoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoTipoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoTipoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jLabelColumnasSelectReporteTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteTipoActivoFijo);
			
			this.jScrollColumnasSelectReporteTipoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoActivoFijo.add(this.jListColumnasSelectReporteTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jScrollColumnasSelectReporteTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteTipoActivoFijo);
			
			this.jScrollRelacionesSelectReporteTipoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo.setToolTipText("Generar EXCEL"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jComboBoxTiposReportesDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoActivoFijo.setToolTipText("Generar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jButtonGenerarReporteDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoActivoFijo.setToolTipText("Cancelar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoActivoFijo.add(this.jButtonCerrarReporteDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoActivoFijo= new JScrollPane(jPanelReporteDinamicoTipoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoActivoFijo);
		this.jInternalFrameReporteDinamicoTipoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoActivoFijo.setName("jPanelImportacionTipoActivoFijo"); 
		
		this.jPanelImportacionTipoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoActivoFijo.setLayout(gridaBagLayoutImportacionTipoActivoFijo);
		
		
		this.jInternalFrameImportacionTipoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionTipoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoActivoFijo.add(this.jLabelArchivoImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionTipoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionTipoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoActivoFijo.setToolTipText("Generar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijo.add(this.jButtonAbrirImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoActivoFijo.add(this.jLabelPathArchivoImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijo.add(this.jTextFieldPathArchivoImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionTipoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoActivoFijo.setToolTipText("Generar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijo.add(this.jButtonGenerarImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionTipoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoActivoFijo.setToolTipText("Cancelar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoActivoFijo.add(this.jButtonCerrarImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoActivoFijo= new JScrollPane(jPanelImportacionTipoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoActivoFijo);
		this.jInternalFrameImportacionTipoActivoFijo.getContentPane().add(this.jScrollPanelImportacionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByTipoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByTipoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoActivoFijo";
			inputMap = this.jButtonAbrirOrderByTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoActivoFijo.setName("jPanelOrderByTipoActivoFijo"); 
			
			this.jPanelOrderByTipoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoActivoFijo.setLayout(gridaBagLayoutOrderByTipoActivoFijo);
			
			
			this.jTableDatosTipoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosTipoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoActivoFijoOrderBy.setViewportView(this.jTableDatosTipoActivoFijoOrderBy);
			this.jTableDatosTipoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByTipoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByTipoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByTipoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoActivoFijo.ipady =150;
				
			this.jPanelOrderByTipoActivoFijo.add(jScrollPanelDatosTipoActivoFijoOrderBy, this.gridBagConstraintsTipoActivoFijo);//this.jTableDatosTipoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByTipoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoActivoFijo.setToolTipText("Cancelar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoActivoFijo.add(this.jButtonCerrarOrderByTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoActivoFijo= new JScrollPane(jPanelOrderByTipoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoActivoFijo);
			
			this.jInternalFrameOrderByTipoActivoFijo.getContentPane().add(this.jScrollPanelOrderByTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByTipoActivoFijo = new JButtonMe();
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
			&& this.tipoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoActivoFijo.getRowHeight();//TipoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.isSelected()) {
					iHeightTable=TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoActivoFijo.isSelected()) {
					iHeightTable=TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoActivoFijo!=null && this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoactivofijoLogic.getTipoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoActivoFijo> TraerTipoActivoFijoBeans(List<TipoActivoFijo> tipoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoActivoFijo tipoactivofijo:tipoactivofijos) {
					
				if(!(TipoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoactivofijo.setsDetalleGeneralEntityReporte(TipoActivoFijoConstantesFunciones.getTipoActivoFijoDescripcion(tipoactivofijo));
										
						
					
						
					
				} else  {
							
					//tipoactivofijo.setsDetalleGeneralEntityReporte(tipoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoactivofijobeans.add(tipoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoactivofijos;
    }
	//PARA REPORTES FIN
}
