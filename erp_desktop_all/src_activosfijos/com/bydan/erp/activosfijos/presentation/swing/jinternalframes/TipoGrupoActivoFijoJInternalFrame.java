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
import com.bydan.erp.activosfijos.util.TipoGrupoActivoFijoConstantesFunciones;

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
public class TipoGrupoActivoFijoJInternalFrame extends TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGrupoActivoFijo;
	
	protected JMenuBar jmenuBarTipoGrupoActivoFijo;
	
	protected JMenu jmenuTipoGrupoActivoFijo;
	protected JMenu jmenuDatosTipoGrupoActivoFijo;
	protected JMenu jmenuArchivoTipoGrupoActivoFijo;
	protected JMenu jmenuAccionesTipoGrupoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGrupoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGrupoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGrupoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGrupoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGrupoActivoFijoSessionBean tipogrupoactivofijoSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGrupoActivoFijo> tipogrupoactivofijos;		
	public List<TipoGrupoActivoFijo> tipogrupoactivofijosEliminados;	
	public List<TipoGrupoActivoFijo> tipogrupoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGrupoActivoFijo;		
	protected JButton jButtonAbrirOrderByTipoGrupoActivoFijo;
	
	
	//protected JPanel jPanelOrderByTipoGrupoActivoFijo;
	//public JScrollPane jScrollPanelOrderByTipoGrupoActivoFijo;	
	//protected JButton jButtonCerrarOrderByTipoGrupoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGrupoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGrupoActivoFijo;
	//public JScrollPane jScrollPanelImportacionTipoGrupoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesTipoGrupoActivoFijo;
	
    protected JPanel jPanelPaginacionTipoGrupoActivoFijo;
    protected JPanel jPanelParametrosReportesTipoGrupoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesTipoGrupoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2TipoGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3TipoGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4TipoGrupoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5TipoGrupoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGrupoActivoFijo;
	//protected JPanel jPanelImportacionTipoGrupoActivoFijo;
	
	
	public JTable jTableDatosTipoGrupoActivoFijo;
	
	
	
	//public JTable jTableDatosTipoGrupoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGrupoActivoFijo;
	protected JButton jButtonDuplicarTipoGrupoActivoFijo;
	protected JButton jButtonCopiarTipoGrupoActivoFijo;
	protected JButton jButtonVerFormTipoGrupoActivoFijo;
	protected JButton jButtonNuevoRelacionesTipoGrupoActivoFijo;
	protected JButton jButtonModificarTipoGrupoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaTipoGrupoActivoFijo;
	protected JButton jButtonCerrarTipoGrupoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionTipoGrupoActivoFijo;
	protected JButton jButtonProcesarInformacionTipoGrupoActivoFijo;
	
	
	protected JButton jButtonAnterioresTipoGrupoActivoFijo;
	protected JButton jButtonSiguientesTipoGrupoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosTipoGrupoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGrupoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoTipoGrupoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGrupoActivoFijo;
	//protected JButton jButtonGenerarImportacionTipoGrupoActivoFijo;
	//protected JButton jButtonCerrarImportacionTipoGrupoActivoFijo;
	//protected JFileChooser jFileChooserImportacionTipoGrupoActivoFijo;
	//protected File fileImportacionTipoGrupoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoActivoFijo;
	protected JButton jButtonDuplicarToolBarTipoGrupoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGrupoActivoFijo;
	protected JButton jButtonCopiarToolBarTipoGrupoActivoFijo;
	protected JButton jButtonVerFormToolBarTipoGrupoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoGrupoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGrupoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoActivoFijo;
	protected JButton jButtonAnterioresToolBarTipoGrupoActivoFijo;
	protected JButton jButtonSiguientesToolBarTipoGrupoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGrupoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarTipoGrupoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemDuplicarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGrupoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemCopiarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemVerFormTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemAnterioresTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemSiguientesTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGrupoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosTipoGrupoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGrupoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralTipoGrupoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGrupoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteTipoGrupoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteTipoGrupoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGrupoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGrupoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGrupoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGrupoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionTipoGrupoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionTipoGrupoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGrupoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGrupoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGrupoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGrupoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGrupoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGrupoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGrupoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGrupoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGrupoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGrupoActivoFijo;
	public JPanel jPanelFK_IdPaisTipoGrupoActivoFijo;
	public JButton jButtonFK_IdPaisTipoGrupoActivoFijo;
	
	public JPanel jPanelid_paisFK_IdPaisTipoGrupoActivoFijo;
	public JLabel jLabelid_paisFK_IdPaisTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo;
	public JButton jButtonid_paisFK_IdPaisTipoGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGrupoActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoGrupoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGrupoActivoFijo)	{
		this.jButtonRecargarInformacionTipoGrupoActivoFijo = jButtonRecargarInformacionTipoGrupoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionTipoGrupoActivoFijo() {
		return this.jButtonProcesarInformacionTipoGrupoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoActivoFijo)	{
		this.jButtonProcesarInformacionTipoGrupoActivoFijo = jButtonProcesarInformacionTipoGrupoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGrupoActivoFijo() {
		return this.jButtonRecargarInformacionTipoGrupoActivoFijo;
	}
	
	
	public List<TipoGrupoActivoFijo> gettipogrupoactivofijos() {
		return this.tipogrupoactivofijos;
	}

	public void settipogrupoactivofijos(List<TipoGrupoActivoFijo> tipogrupoactivofijos) {
		this.tipogrupoactivofijos = tipogrupoactivofijos;
	}
	
	public List<TipoGrupoActivoFijo> gettipogrupoactivofijosAux() {
		return this.tipogrupoactivofijosAux;
	}

	public void settipogrupoactivofijosAux(List<TipoGrupoActivoFijo> tipogrupoactivofijosAux) {
		this.tipogrupoactivofijosAux = tipogrupoactivofijosAux;
	}
	
	public List<TipoGrupoActivoFijo> gettipogrupoactivofijosEliminados() {
		return this.tipogrupoactivofijosEliminados;
	}

	public void setTipoGrupoActivoFijosEliminados(List<TipoGrupoActivoFijo> tipogrupoactivofijosEliminados) {
		this.tipogrupoactivofijosEliminados = tipogrupoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGrupoActivoFijo() {
		return jComboBoxTiposSeleccionarTipoGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarTipoGrupoActivoFijo) {
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo = jComboBoxTiposSeleccionarTipoGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGrupoActivoFijo() {
		return jTextFieldValorCampoGeneralTipoGrupoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralTipoGrupoActivoFijo(
			JTextField jTextFieldValorCampoGeneralTipoGrupoActivoFijo) {
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo = jTextFieldValorCampoGeneralTipoGrupoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGrupoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosTipoGrupoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosTipoGrupoActivoFijo) {
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo = jCheckBoxSeleccionarTodosTipoGrupoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGrupoActivoFijo() {
		return this.jCheckBoxSeleccionadosTipoGrupoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosTipoGrupoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosTipoGrupoActivoFijo) {
		this.jCheckBoxSeleccionadosTipoGrupoActivoFijo = jCheckBoxSeleccionadosTipoGrupoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGrupoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesTipoGrupoActivoFijo) {
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo = jComboBoxTiposArchivosReportesTipoGrupoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGrupoActivoFijo() {
		return this.jComboBoxTiposReportesTipoGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposReportesTipoGrupoActivoFijo) {
		this.jComboBoxTiposReportesTipoGrupoActivoFijo = jComboBoxTiposReportesTipoGrupoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGrupoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGrupoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo = jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo = jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGrupoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesTipoGrupoActivoFijo) {
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo = jComboBoxTiposGraficosReportesTipoGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGrupoActivoFijo() {
		return this.jComboBoxTiposPaginacionTipoGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposPaginacionTipoGrupoActivoFijo) {
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo = jComboBoxTiposPaginacionTipoGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGrupoActivoFijo() {
		return this.jComboBoxTiposRelacionesTipoGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoGrupoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo = jComboBoxTiposRelacionesTipoGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoGrupoActivoFijo) {
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo = jComboBoxTiposAccionesTipoGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGrupoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGrupoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo = jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGrupoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGrupoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo .setBorder(borderResaltar);		
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
		this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
		
		this.tipogrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGrupoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"copiar","copiar","Copiar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"ver_form","ver_form","Ver"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"recargar","recargar","Recargar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,
							"cerrar","cerrar","Salir"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarTipoGrupoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGrupoActivoFijo;
				
		//protected JButton jButtonModificarToolBarTipoGrupoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGrupoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGrupoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoTipoGrupoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGrupoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosTipoGrupoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGrupoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGrupoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGrupoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGrupoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGrupoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGrupoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGrupoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGrupoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGrupoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGrupoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGrupoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGrupoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGrupoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGrupoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGrupoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGrupoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGrupoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGrupoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGrupoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGrupoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGrupoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGrupoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGrupoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGrupoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGrupoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGrupoActivoFijo.add(this.jMenuItemCerrarTipoGrupoActivoFijo);
			
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemNuevoTipoGrupoActivoFijo);
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo);
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo);
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo);		
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemDuplicarTipoGrupoActivoFijo);		
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemCopiarTipoGrupoActivoFijo);		
			this.jmenuAccionesTipoGrupoActivoFijo.add(this.jMenuItemVerFormTipoGrupoActivoFijo);		
			
			this.jmenuDatosTipoGrupoActivoFijo.add(this.jMenuItemRecargarInformacionTipoGrupoActivoFijo);				
			this.jmenuDatosTipoGrupoActivoFijo.add(this.jMenuItemAnterioresTipoGrupoActivoFijo);				
			this.jmenuDatosTipoGrupoActivoFijo.add(this.jMenuItemSiguientesTipoGrupoActivoFijo);				
			this.jmenuDatosTipoGrupoActivoFijo.add(this.jMenuItemAbrirOrderByTipoGrupoActivoFijo);				
			this.jmenuDatosTipoGrupoActivoFijo.add(this.jMenuItemMostrarOcultarTipoGrupoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGrupoActivoFijo.add(this.jMenuItemGuardarCambiosTipoGrupoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGrupoActivoFijo.add(this.jmenuArchivoTipoGrupoActivoFijo);		
			this.jmenuBarTipoGrupoActivoFijo.add(this.jmenuAccionesTipoGrupoActivoFijo);		
			this.jmenuBarTipoGrupoActivoFijo.add(this.jmenuDatosTipoGrupoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGrupoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGrupoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoGrupoActivoFijo.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoGrupoActivoFijo= new JButtonMe();
		this.jButtonFK_IdPaisTipoGrupoActivoFijo.setText("Buscar");
		this.jButtonFK_IdPaisTipoGrupoActivoFijo.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoGrupoActivoFijo,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoGrupoActivoFijo = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoGrupoActivoFijo.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoGrupoActivoFijo.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGrupoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGrupoActivoFijo = new TipoGrupoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Grupo Activo Fijo DATOS");
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo = new TipoGrupoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones(),this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo = null;//new TipoGrupoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosTipoGrupoActivoFijo = new JTableMe();      
		
		String sToolTipTipoGrupoActivoFijo="";
		sToolTipTipoGrupoActivoFijo=TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoActivoFijo+="(ActivosFijos.TipoGrupoActivoFijo)";
		}
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGrupoActivoFijo.setToolTipText(sToolTipTipoGrupoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGrupoActivoFijo);
		this.jTableDatosTipoGrupoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGrupoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGrupoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosTipoGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonDuplicarTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonCopiarTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonVerFormTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoGrupoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGrupoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Activo Fijo";
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo=new ReporteDinamicoJInternalFrame(TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGrupoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGrupoActivoFijo=new ImportacionJInternalFrame(TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGrupoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGrupoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGrupoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByTipoGrupoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoActivoFijo,false,this);
			
			//this.cargarOrderByTipoGrupoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoActivoFijo,true,this);
			
			//this.cargarOrderByTipoGrupoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGrupoActivoFijo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGrupoActivoFijo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGrupoActivoFijo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGrupoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGrupoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarTipoGrupoActivoFijo.setText("Duplicar");
		this.jButtonCopiarTipoGrupoActivoFijo.setText("Copiar");
		this.jButtonVerFormTipoGrupoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoGrupoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoActivoFijo,"nuevo_button","Nuevo",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGrupoActivoFijo,"duplicar_button","Duplicar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGrupoActivoFijo,"copiar_button","Copiar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGrupoActivoFijo,"ver_form","Ver",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGrupoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo,"guardarcambiostabla_button","Guardar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoActivoFijo,"cerrar_button","Salir",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGrupoActivoFijo.setToolTipText("Nuevo"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGrupoActivoFijo.setToolTipText("Duplicar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGrupoActivoFijo.setToolTipText("Copiar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGrupoActivoFijo.setToolTipText("Ver"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.setToolTipText("Nuevo Rel"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.setToolTipText("Guardar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoActivoFijo.setToolTipText("Salir"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoActivoFijo";
		inputMap = this.jButtonNuevoTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGrupoActivoFijo";
		inputMap = this.jButtonDuplicarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGrupoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarTipoGrupoActivoFijo";
		inputMap = this.jButtonCopiarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGrupoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGrupoActivoFijo";
		inputMap = this.jButtonVerFormTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGrupoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGrupoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGrupoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGrupoActivoFijo";
		inputMap = this.jButtonModificarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGrupoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoActivoFijo";
		inputMap = this.jButtonCerrarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGrupoActivoFijo.setName("jPanelParametrosReportesTipoGrupoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo.setName("jPanelParametrosReportesAccionesTipoGrupoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.setToolTipText("Recargar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGrupoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionTipoGrupoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionTipoGrupoActivoFijo.setToolTipText("Procesar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGrupoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGrupoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGrupoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGrupoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGrupoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresTipoGrupoActivoFijo.setText("<<");
        this.jButtonAnterioresTipoGrupoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGrupoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGrupoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesTipoGrupoActivoFijo.setText(">>");
        this.jButtonSiguientesTipoGrupoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGrupoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo,"nuevoguardarcambios_button","Nue",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGrupoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGrupoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGrupoActivoFijo";
		inputMap = this.jButtonRecargarInformacionTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGrupoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGrupoActivoFijo";
		inputMap = this.jButtonSiguientesTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGrupoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGrupoActivoFijo";
		inputMap = this.jButtonAnterioresTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGrupoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGrupoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),TipoGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),TipoGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),TipoGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGrupoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionTipoGrupoActivoFijo.setLayout(gridaBagLayoutPaginacionTipoGrupoActivoFijo);						
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonAnterioresTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
					
						
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
						
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonSiguientesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonNuevoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
						
			
			
			if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
				this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonDuplicarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonCopiarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonVerFormTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGrupoActivoFijo.add(this.jButtonCerrarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGrupoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGrupoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGrupoActivoFijo.setLayout(gridaBagParametrosReportesTipoGrupoActivoFijo);
			this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo.setLayout(gridaBagParametrosReportesAccionesTipoGrupoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1TipoGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar1TipoGrupoActivoFijo);
			this.jPanelParametrosAuxiliar2TipoGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoGrupoActivoFijo);
			this.jPanelParametrosAuxiliar3TipoGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar3TipoGrupoActivoFijo);
			this.jPanelParametrosAuxiliar4TipoGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar4TipoGrupoActivoFijo);
			//this.jPanelParametrosAuxiliar5TipoGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoGrupoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jButtonRecargarInformacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoActivoFijo.add(this.jComboBoxTiposPaginacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoActivoFijo.add(this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jPanelParametrosAuxiliar1TipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGrupoActivoFijo.add(this.jComboBoxTiposReportesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jPanelParametrosAuxiliar4TipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jComboBoxTiposReportesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jCheckBoxGenerarReporteTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jPanelParametrosAuxiliar2TipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jLabelAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jButtonAbrirOrderByTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);															
				
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoActivoFijo.add(this.jCheckBoxSeleccionadosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jPanelParametrosAuxiliar3TipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoActivoFijo.add(this.jComboBoxTiposAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGrupoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosTipoGrupoActivoFijo.setLayout(gridaBagLayoutDatosTipoGrupoActivoFijo);
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosTipoGrupoActivoFijo.add(this.jTableDatosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGrupoActivoFijo.setViewportView(this.jTableDatosTipoGrupoActivoFijo);
		this.jTableDatosTipoGrupoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosTipoGrupoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoGrupoActivoFijo.setLayout(gridaBagLayoutAccionesTipoGrupoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
			
		this.jPanelAccionesTipoGrupoActivoFijo.add(this.jButtonNuevoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoGrupoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoGrupoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGrupoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGrupoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoGrupoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoGrupoActivoFijo.setLayout(gridaBagLayoutFK_IdPaisTipoGrupoActivoFijo);

		gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
		jPanelFK_IdPaisTipoGrupoActivoFijo.add(jLabelid_paisFK_IdPaisTipoGrupoActivoFijo, gridBagConstraintsTipoGrupoActivoFijo);

		gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		gridBagConstraintsTipoGrupoActivoFijo.gridx = 1;
		jPanelFK_IdPaisTipoGrupoActivoFijo.add(jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo, gridBagConstraintsTipoGrupoActivoFijo);

		gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoActivoFijo.gridy = 1;
		gridBagConstraintsTipoGrupoActivoFijo.gridx =1;
		jPanelFK_IdPaisTipoGrupoActivoFijo.add(jButtonFK_IdPaisTipoGrupoActivoFijo, gridBagConstraintsTipoGrupoActivoFijo);

		jTabbedPaneBusquedasTipoGrupoActivoFijo.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoGrupoActivoFijo);
		jTabbedPaneBusquedasTipoGrupoActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsTipoGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGrupoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;		
			this.gridBagConstraintsTipoGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		*/		
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
				
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGrupoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosTipoGrupoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
			
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
			
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGrupoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGrupoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGrupoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.setName("jPanelReporteDinamicoTipoGrupoActivoFijo"); 
		
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoTipoGrupoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGrupoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGrupoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jLabelColumnasSelectReporteTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGrupoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGrupoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteTipoGrupoActivoFijo);
			
			this.jScrollColumnasSelectReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jListColumnasSelectReporteTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jScrollColumnasSelectReporteTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGrupoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGrupoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGrupoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGrupoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteTipoGrupoActivoFijo);
			
			this.jScrollRelacionesSelectReporteTipoGrupoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGrupoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGrupoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGrupoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo.setToolTipText("Generar EXCEL"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jComboBoxTiposReportesDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo.setToolTipText("Generar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo.setToolTipText("Cancelar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoActivoFijo.add(this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGrupoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo= new JScrollPane(jPanelReporteDinamicoTipoGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGrupoActivoFijo);
		this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGrupoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGrupoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGrupoActivoFijo.setName("jPanelImportacionTipoGrupoActivoFijo"); 
		
		this.jPanelImportacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGrupoActivoFijo.setLayout(gridaBagLayoutImportacionTipoGrupoActivoFijo);
		
		
		this.jInternalFrameImportacionTipoGrupoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGrupoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGrupoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGrupoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionTipoGrupoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoActivoFijo.add(this.jLabelArchivoImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGrupoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionTipoGrupoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionTipoGrupoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGrupoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGrupoActivoFijo.setToolTipText("Generar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoActivoFijo.add(this.jButtonAbrirImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGrupoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGrupoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoActivoFijo.add(this.jLabelPathArchivoImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGrupoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGrupoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoActivoFijo.add(this.jTextFieldPathArchivoImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionTipoGrupoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGrupoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGrupoActivoFijo.setToolTipText("Generar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoActivoFijo.add(this.jButtonGenerarImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionTipoGrupoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGrupoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGrupoActivoFijo.setToolTipText("Cancelar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoActivoFijo.add(this.jButtonCerrarImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGrupoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGrupoActivoFijo= new JScrollPane(jPanelImportacionTipoGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGrupoActivoFijo);
		this.jInternalFrameImportacionTipoGrupoActivoFijo.getContentPane().add(this.jScrollPanelImportacionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGrupoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGrupoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByTipoGrupoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByTipoGrupoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGrupoActivoFijo";
			inputMap = this.jButtonAbrirOrderByTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGrupoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGrupoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGrupoActivoFijo.setName("jPanelOrderByTipoGrupoActivoFijo"); 
			
			this.jPanelOrderByTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGrupoActivoFijo.setLayout(gridaBagLayoutOrderByTipoGrupoActivoFijo);
			
			
			this.jTableDatosTipoGrupoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosTipoGrupoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGrupoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGrupoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGrupoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGrupoActivoFijoOrderBy.setViewportView(this.jTableDatosTipoGrupoActivoFijoOrderBy);
			this.jTableDatosTipoGrupoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGrupoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGrupoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGrupoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGrupoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGrupoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGrupoActivoFijo.ipady =150;
				
			this.jPanelOrderByTipoGrupoActivoFijo.add(jScrollPanelDatosTipoGrupoActivoFijoOrderBy, this.gridBagConstraintsTipoGrupoActivoFijo);//this.jTableDatosTipoGrupoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGrupoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByTipoGrupoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGrupoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGrupoActivoFijo.setToolTipText("Cancelar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGrupoActivoFijo.add(this.jButtonCerrarOrderByTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGrupoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGrupoActivoFijo= new JScrollPane(jPanelOrderByTipoGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGrupoActivoFijo);
			
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getContentPane().add(this.jScrollPanelOrderByTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByTipoGrupoActivoFijo = new JButtonMe();
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
			&& this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGrupoActivoFijo.getRowHeight();//TipoGrupoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.isSelected()) {
					iHeightTable=TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoActivoFijo.isSelected()) {
					iHeightTable=TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGrupoActivoFijo!=null && this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGrupoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGrupoActivoFijo> TraerTipoGrupoActivoFijoBeans(List<TipoGrupoActivoFijo> tipogrupoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGrupoActivoFijo tipogrupoactivofijo:tipogrupoactivofijos) {
					
				if(!(TipoGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogrupoactivofijo.setsDetalleGeneralEntityReporte(TipoGrupoActivoFijoConstantesFunciones.getTipoGrupoActivoFijoDescripcion(tipogrupoactivofijo));
										
						
					
						
					
				} else  {
							
					//tipogrupoactivofijo.setsDetalleGeneralEntityReporte(tipogrupoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogrupoactivofijobeans.add(tipogrupoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogrupoactivofijos;
    }
	//PARA REPORTES FIN
}
