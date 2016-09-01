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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.activosfijos.util.TipoRamoActivoFijoConstantesFunciones;

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
public class TipoRamoActivoFijoJInternalFrame extends TipoRamoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRamoActivoFijo;
	
	protected JMenuBar jmenuBarTipoRamoActivoFijo;
	
	protected JMenu jmenuTipoRamoActivoFijo;
	protected JMenu jmenuDatosTipoRamoActivoFijo;
	protected JMenu jmenuArchivoTipoRamoActivoFijo;
	protected JMenu jmenuAccionesTipoRamoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRamoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoRamoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRamoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRamoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRamoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRamoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRamoActivoFijo> tiporamoactivofijos;		
	public List<TipoRamoActivoFijo> tiporamoactivofijosEliminados;	
	public List<TipoRamoActivoFijo> tiporamoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRamoActivoFijo;		
	protected JButton jButtonAbrirOrderByTipoRamoActivoFijo;
	
	
	//protected JPanel jPanelOrderByTipoRamoActivoFijo;
	//public JScrollPane jScrollPanelOrderByTipoRamoActivoFijo;	
	//protected JButton jButtonCerrarOrderByTipoRamoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRamoActivoFijoLogic tiporamoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRamoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoRamoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoRamoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRamoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRamoActivoFijo;
	//public JScrollPane jScrollPanelImportacionTipoRamoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesTipoRamoActivoFijo;
	
    protected JPanel jPanelPaginacionTipoRamoActivoFijo;
    protected JPanel jPanelParametrosReportesTipoRamoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesTipoRamoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRamoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2TipoRamoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3TipoRamoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4TipoRamoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5TipoRamoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRamoActivoFijo;
	//protected JPanel jPanelImportacionTipoRamoActivoFijo;
	
	
	public JTable jTableDatosTipoRamoActivoFijo;
	
	
	
	//public JTable jTableDatosTipoRamoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRamoActivoFijo;
	protected JButton jButtonDuplicarTipoRamoActivoFijo;
	protected JButton jButtonCopiarTipoRamoActivoFijo;
	protected JButton jButtonVerFormTipoRamoActivoFijo;
	protected JButton jButtonNuevoRelacionesTipoRamoActivoFijo;
	protected JButton jButtonModificarTipoRamoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaTipoRamoActivoFijo;
	protected JButton jButtonCerrarTipoRamoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionTipoRamoActivoFijo;
	protected JButton jButtonProcesarInformacionTipoRamoActivoFijo;
	
	
	protected JButton jButtonAnterioresTipoRamoActivoFijo;
	protected JButton jButtonSiguientesTipoRamoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosTipoRamoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRamoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoTipoRamoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRamoActivoFijo;
	//protected JButton jButtonGenerarImportacionTipoRamoActivoFijo;
	//protected JButton jButtonCerrarImportacionTipoRamoActivoFijo;
	//protected JFileChooser jFileChooserImportacionTipoRamoActivoFijo;
	//protected File fileImportacionTipoRamoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRamoActivoFijo;
	protected JButton jButtonDuplicarToolBarTipoRamoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarTipoRamoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRamoActivoFijo;
	protected JButton jButtonCopiarToolBarTipoRamoActivoFijo;
	protected JButton jButtonVerFormToolBarTipoRamoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRamoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoRamoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRamoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarTipoRamoActivoFijo;
	protected JButton jButtonAnterioresToolBarTipoRamoActivoFijo;
	protected JButton jButtonSiguientesToolBarTipoRamoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRamoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarTipoRamoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRamoActivoFijo;
	protected JMenuItem jMenuItemDuplicarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRamoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRamoActivoFijo;
	protected JMenuItem jMenuItemCopiarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemVerFormTipoRamoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRamoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRamoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRamoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionTipoRamoActivoFijo;
	protected JMenuItem jMenuItemAnterioresTipoRamoActivoFijo;
	protected JMenuItem jMenuItemSiguientesTipoRamoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByTipoRamoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoRamoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRamoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRamoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosTipoRamoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRamoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRamoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralTipoRamoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRamoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteTipoRamoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteTipoRamoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRamoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRamoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRamoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRamoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRamoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionTipoRamoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionTipoRamoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRamoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRamoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRamoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRamoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRamoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRamoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRamoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRamoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRamoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRamoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRamoActivoFijo;
	
	
	
	
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
	public TipoRamoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRamoActivoFijo)	{
		this.jButtonRecargarInformacionTipoRamoActivoFijo = jButtonRecargarInformacionTipoRamoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionTipoRamoActivoFijo() {
		return this.jButtonProcesarInformacionTipoRamoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRamoActivoFijo)	{
		this.jButtonProcesarInformacionTipoRamoActivoFijo = jButtonProcesarInformacionTipoRamoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRamoActivoFijo() {
		return this.jButtonRecargarInformacionTipoRamoActivoFijo;
	}
	
	
	public List<TipoRamoActivoFijo> gettiporamoactivofijos() {
		return this.tiporamoactivofijos;
	}

	public void settiporamoactivofijos(List<TipoRamoActivoFijo> tiporamoactivofijos) {
		this.tiporamoactivofijos = tiporamoactivofijos;
	}
	
	public List<TipoRamoActivoFijo> gettiporamoactivofijosAux() {
		return this.tiporamoactivofijosAux;
	}

	public void settiporamoactivofijosAux(List<TipoRamoActivoFijo> tiporamoactivofijosAux) {
		this.tiporamoactivofijosAux = tiporamoactivofijosAux;
	}
	
	public List<TipoRamoActivoFijo> gettiporamoactivofijosEliminados() {
		return this.tiporamoactivofijosEliminados;
	}

	public void setTipoRamoActivoFijosEliminados(List<TipoRamoActivoFijo> tiporamoactivofijosEliminados) {
		this.tiporamoactivofijosEliminados = tiporamoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRamoActivoFijo() {
		return jComboBoxTiposSeleccionarTipoRamoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRamoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarTipoRamoActivoFijo) {
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo = jComboBoxTiposSeleccionarTipoRamoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRamoActivoFijo() {
		return jTextFieldValorCampoGeneralTipoRamoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralTipoRamoActivoFijo(
			JTextField jTextFieldValorCampoGeneralTipoRamoActivoFijo) {
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo = jTextFieldValorCampoGeneralTipoRamoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRamoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosTipoRamoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosTipoRamoActivoFijo) {
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo = jCheckBoxSeleccionarTodosTipoRamoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRamoActivoFijo() {
		return this.jCheckBoxSeleccionadosTipoRamoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosTipoRamoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosTipoRamoActivoFijo) {
		this.jCheckBoxSeleccionadosTipoRamoActivoFijo = jCheckBoxSeleccionadosTipoRamoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRamoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesTipoRamoActivoFijo) {
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo = jComboBoxTiposArchivosReportesTipoRamoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRamoActivoFijo() {
		return this.jComboBoxTiposReportesTipoRamoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposReportesTipoRamoActivoFijo) {
		this.jComboBoxTiposReportesTipoRamoActivoFijo = jComboBoxTiposReportesTipoRamoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRamoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoTipoRamoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRamoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRamoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo = jComboBoxTiposReportesDinamicoTipoRamoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo = jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRamoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesTipoRamoActivoFijo) {
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo = jComboBoxTiposGraficosReportesTipoRamoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRamoActivoFijo() {
		return this.jComboBoxTiposPaginacionTipoRamoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRamoActivoFijo(
			JComboBox jComboBoxTiposPaginacionTipoRamoActivoFijo) {
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo = jComboBoxTiposPaginacionTipoRamoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRamoActivoFijo() {
		return this.jComboBoxTiposRelacionesTipoRamoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRamoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoRamoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoRamoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo = jComboBoxTiposRelacionesTipoRamoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoRamoActivoFijo) {
		this.jComboBoxTiposAccionesTipoRamoActivoFijo = jComboBoxTiposAccionesTipoRamoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRamoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRamoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRamoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoTipoRamoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRamoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRamoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoTipoRamoActivoFijo = jCheckBoxConGraficoDinamicoTipoRamoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRamoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRamoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRamoActivoFijo .setBorder(borderResaltar);		
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
		this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
		
		this.tiporamoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporamoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRamoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Ramo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRamoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRamoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"copiar","copiar","Copiar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"ver_form","ver_form","Ver"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"recargar","recargar","Recargar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,
							"cerrar","cerrar","Salir"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRamoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarTipoRamoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRamoActivoFijo;
				
		//protected JButton jButtonModificarToolBarTipoRamoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRamoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRamoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoTipoRamoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRamoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosTipoRamoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRamoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRamoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRamoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRamoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRamoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRamoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRamoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRamoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRamoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRamoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRamoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRamoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRamoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRamoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRamoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRamoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRamoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRamoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRamoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRamoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRamoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRamoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRamoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRamoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRamoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRamoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRamoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRamoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRamoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRamoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRamoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRamoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRamoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRamoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRamoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRamoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRamoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRamoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRamoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRamoActivoFijo.add(this.jMenuItemCerrarTipoRamoActivoFijo);
			
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemNuevoTipoRamoActivoFijo);
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo);
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemNuevoRelacionesTipoRamoActivoFijo);
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo);		
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemDuplicarTipoRamoActivoFijo);		
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemCopiarTipoRamoActivoFijo);		
			this.jmenuAccionesTipoRamoActivoFijo.add(this.jMenuItemVerFormTipoRamoActivoFijo);		
			
			this.jmenuDatosTipoRamoActivoFijo.add(this.jMenuItemRecargarInformacionTipoRamoActivoFijo);				
			this.jmenuDatosTipoRamoActivoFijo.add(this.jMenuItemAnterioresTipoRamoActivoFijo);				
			this.jmenuDatosTipoRamoActivoFijo.add(this.jMenuItemSiguientesTipoRamoActivoFijo);				
			this.jmenuDatosTipoRamoActivoFijo.add(this.jMenuItemAbrirOrderByTipoRamoActivoFijo);				
			this.jmenuDatosTipoRamoActivoFijo.add(this.jMenuItemMostrarOcultarTipoRamoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRamoActivoFijo.add(this.jMenuItemGuardarCambiosTipoRamoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRamoActivoFijo.add(this.jmenuArchivoTipoRamoActivoFijo);		
			this.jmenuBarTipoRamoActivoFijo.add(this.jmenuAccionesTipoRamoActivoFijo);		
			this.jmenuBarTipoRamoActivoFijo.add(this.jmenuDatosTipoRamoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRamoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRamoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoRamoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRamoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoRamoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoRamoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRamoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRamoActivoFijo = new TipoRamoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Ramo Activo Fijo DATOS");
			this.jInternalFrameDetalleFormTipoRamoActivoFijo = new TipoRamoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tiporamoactivofijoSessionBean.getConGuardarRelaciones(),this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo = null;//new TipoRamoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRamoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosTipoRamoActivoFijo = new JTableMe();      
		
		String sToolTipTipoRamoActivoFijo="";
		sToolTipTipoRamoActivoFijo=TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRamoActivoFijo+="(ActivosFijos.TipoRamoActivoFijo)";
		}
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRamoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRamoActivoFijo.setToolTipText(sToolTipTipoRamoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRamoActivoFijo);
		this.jTableDatosTipoRamoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRamoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRamoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosTipoRamoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRamoActivoFijo = new JButtonMe();
		this.jButtonDuplicarTipoRamoActivoFijo = new JButtonMe();
		this.jButtonCopiarTipoRamoActivoFijo = new JButtonMe();
		this.jButtonVerFormTipoRamoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRamoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoRamoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoRamoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRamoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Ramo Activo Fijo";
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ramo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRamoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRamoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoRamoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRamoActivoFijo=new ReporteDinamicoJInternalFrame(TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRamoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRamoActivoFijo=new ImportacionJInternalFrame(TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRamoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRamoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRamoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByTipoRamoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRamoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRamoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRamoActivoFijo,false,this);
			
			//this.cargarOrderByTipoRamoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRamoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRamoActivoFijo,true,this);
			
			//this.cargarOrderByTipoRamoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRamoActivoFijo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoRamoActivoFijo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoRamoActivoFijo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoRamoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRamoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRamoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRamoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarTipoRamoActivoFijo.setText("Duplicar");
		this.jButtonCopiarTipoRamoActivoFijo.setText("Copiar");
		this.jButtonVerFormTipoRamoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoRamoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRamoActivoFijo,"nuevo_button","Nuevo",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRamoActivoFijo,"duplicar_button","Duplicar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRamoActivoFijo,"copiar_button","Copiar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRamoActivoFijo,"ver_form","Ver",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRamoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRamoActivoFijo,"guardarcambiostabla_button","Guardar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRamoActivoFijo,"cerrar_button","Salir",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRamoActivoFijo.setToolTipText("Nuevo"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRamoActivoFijo.setToolTipText("Duplicar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRamoActivoFijo.setToolTipText("Copiar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRamoActivoFijo.setToolTipText("Ver"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.setToolTipText("Nuevo Rel"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.setToolTipText("Guardar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRamoActivoFijo.setToolTipText("Salir"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRamoActivoFijo";
		inputMap = this.jButtonNuevoTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRamoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRamoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRamoActivoFijo";
		inputMap = this.jButtonDuplicarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRamoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRamoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarTipoRamoActivoFijo";
		inputMap = this.jButtonCopiarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRamoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRamoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRamoActivoFijo";
		inputMap = this.jButtonVerFormTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRamoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRamoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRamoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRamoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRamoActivoFijo";
		inputMap = this.jButtonModificarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRamoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRamoActivoFijo";
		inputMap = this.jButtonCerrarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRamoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRamoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRamoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRamoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRamoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRamoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRamoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRamoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRamoActivoFijo.setName("jPanelParametrosReportesTipoRamoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRamoActivoFijo.setName("jPanelParametrosReportesAccionesTipoRamoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRamoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionTipoRamoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionTipoRamoActivoFijo.setToolTipText("Recargar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRamoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRamoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionTipoRamoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionTipoRamoActivoFijo.setToolTipText("Procesar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRamoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRamoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRamoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRamoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRamoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRamoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRamoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRamoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoRamoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRamoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRamoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRamoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRamoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRamoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresTipoRamoActivoFijo.setText("<<");
        this.jButtonAnterioresTipoRamoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRamoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRamoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesTipoRamoActivoFijo.setText(">>");
        this.jButtonSiguientesTipoRamoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRamoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo,"nuevoguardarcambios_button","Nue",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRamoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRamoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRamoActivoFijo";
		inputMap = this.jButtonRecargarInformacionTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRamoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRamoActivoFijo";
		inputMap = this.jButtonSiguientesTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRamoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRamoActivoFijo";
		inputMap = this.jButtonAnterioresTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRamoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRamoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRamoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),TipoRamoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRamoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRamoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),TipoRamoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRamoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRamoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),TipoRamoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRamoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRamoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionTipoRamoActivoFijo.setLayout(gridaBagLayoutPaginacionTipoRamoActivoFijo);						
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonAnterioresTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
					
						
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
						
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonSiguientesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonNuevoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
				this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonNuevoRelacionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			}
			
			
			if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
				this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonGuardarCambiosTablaTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonDuplicarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonCopiarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonVerFormTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 1;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRamoActivoFijo.add(this.jButtonCerrarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionTipoRamoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRamoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRamoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRamoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRamoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRamoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRamoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRamoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRamoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRamoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRamoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRamoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRamoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRamoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRamoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRamoActivoFijo.setLayout(gridaBagParametrosReportesTipoRamoActivoFijo);
			this.jPanelParametrosReportesAccionesTipoRamoActivoFijo.setLayout(gridaBagParametrosReportesAccionesTipoRamoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1TipoRamoActivoFijo.setLayout(gridaBagParametrosAuxiliar1TipoRamoActivoFijo);
			this.jPanelParametrosAuxiliar2TipoRamoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoRamoActivoFijo);
			this.jPanelParametrosAuxiliar3TipoRamoActivoFijo.setLayout(gridaBagParametrosAuxiliar3TipoRamoActivoFijo);
			this.jPanelParametrosAuxiliar4TipoRamoActivoFijo.setLayout(gridaBagParametrosAuxiliar4TipoRamoActivoFijo);
			//this.jPanelParametrosAuxiliar5TipoRamoActivoFijo.setLayout(gridaBagParametrosAuxiliar2TipoRamoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jButtonRecargarInformacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRamoActivoFijo.add(this.jComboBoxTiposPaginacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRamoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRamoActivoFijo.add(this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jPanelParametrosAuxiliar1TipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRamoActivoFijo.add(this.jComboBoxTiposReportesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jPanelParametrosAuxiliar4TipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jComboBoxTiposReportesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jCheckBoxGenerarReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jPanelParametrosAuxiliar2TipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jLabelAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jButtonAbrirOrderByTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jComboBoxTiposSeleccionarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRamoActivoFijo.add(this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);															
				
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRamoActivoFijo.add(this.jCheckBoxSeleccionadosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jPanelParametrosAuxiliar3TipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jComboBoxTiposRelacionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
				
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRamoActivoFijo.add(this.jComboBoxTiposAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRamoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosTipoRamoActivoFijo.setLayout(gridaBagLayoutDatosTipoRamoActivoFijo);
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosTipoRamoActivoFijo.add(this.jTableDatosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRamoActivoFijo.setViewportView(this.jTableDatosTipoRamoActivoFijo);
		this.jTableDatosTipoRamoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosTipoRamoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRamoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoRamoActivoFijo.setLayout(gridaBagLayoutAccionesTipoRamoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
			
		this.jPanelAccionesTipoRamoActivoFijo.add(this.jButtonNuevoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRamoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRamoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoRamoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsTipoRamoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRamoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		*/		
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRamoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
				
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRamoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRamoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRamoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosTipoRamoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
			
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
			
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRamoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRamoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRamoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRamoActivoFijo.setName("jPanelReporteDinamicoTipoRamoActivoFijo"); 
		
		this.jPanelReporteDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRamoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoTipoRamoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRamoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRamoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ramo Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRamoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRamoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jLabelColumnasSelectReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRamoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRamoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRamoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRamoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteTipoRamoActivoFijo);
			
			this.jScrollColumnasSelectReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jListColumnasSelectReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jScrollColumnasSelectReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRamoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRamoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jLabelRelacionesSelectReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRamoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRamoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRamoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRamoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteTipoRamoActivoFijo);
			
			this.jScrollRelacionesSelectReporteTipoRamoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRamoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRamoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jListRelacionesSelectReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jScrollRelacionesSelectReporteTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRamoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRamoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRamoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo.setToolTipText("Generar EXCEL"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jComboBoxTiposReportesDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo.setToolTipText("Generar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo.setToolTipText("Cancelar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRamoActivoFijo.add(this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRamoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRamoActivoFijo= new JScrollPane(jPanelReporteDinamicoTipoRamoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ramo Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRamoActivoFijo);
		this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRamoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRamoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRamoActivoFijo.setName("jPanelImportacionTipoRamoActivoFijo"); 
		
		this.jPanelImportacionTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRamoActivoFijo.setLayout(gridaBagLayoutImportacionTipoRamoActivoFijo);
		
		
		this.jInternalFrameImportacionTipoRamoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRamoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRamoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRamoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRamoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRamoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRamoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRamoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRamoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRamoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionTipoRamoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ramo Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRamoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionTipoRamoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRamoActivoFijo.add(this.jLabelArchivoImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRamoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionTipoRamoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRamoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionTipoRamoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRamoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRamoActivoFijo.setToolTipText("Generar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRamoActivoFijo.add(this.jButtonAbrirImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRamoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRamoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRamoActivoFijo.add(this.jLabelPathArchivoImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRamoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRamoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRamoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRamoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRamoActivoFijo.add(this.jTextFieldPathArchivoImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRamoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionTipoRamoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRamoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRamoActivoFijo.setToolTipText("Generar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRamoActivoFijo.add(this.jButtonGenerarImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRamoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionTipoRamoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRamoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRamoActivoFijo.setToolTipText("Cancelar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRamoActivoFijo.add(this.jButtonCerrarImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRamoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRamoActivoFijo= new JScrollPane(jPanelImportacionTipoRamoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRamoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRamoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRamoActivoFijo);
		this.jInternalFrameImportacionTipoRamoActivoFijo.getContentPane().add(this.jScrollPanelImportacionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRamoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRamoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByTipoRamoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByTipoRamoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRamoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRamoActivoFijo";
			inputMap = this.jButtonAbrirOrderByTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRamoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRamoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRamoActivoFijo.setName("jPanelOrderByTipoRamoActivoFijo"); 
			
			this.jPanelOrderByTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRamoActivoFijo.setLayout(gridaBagLayoutOrderByTipoRamoActivoFijo);
			
			
			this.jTableDatosTipoRamoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosTipoRamoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRamoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRamoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRamoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRamoActivoFijoOrderBy.setViewportView(this.jTableDatosTipoRamoActivoFijoOrderBy);
			this.jTableDatosTipoRamoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRamoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRamoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRamoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRamoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRamoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRamoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRamoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRamoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByTipoRamoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRamoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRamoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByTipoRamoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByTipoRamoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ramo Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRamoActivoFijo.ipady =150;
				
			this.jPanelOrderByTipoRamoActivoFijo.add(jScrollPanelDatosTipoRamoActivoFijoOrderBy, this.gridBagConstraintsTipoRamoActivoFijo);//this.jTableDatosTipoRamoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRamoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByTipoRamoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRamoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRamoActivoFijo.setToolTipText("Cancelar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRamoActivoFijo.add(this.jButtonCerrarOrderByTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRamoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRamoActivoFijo= new JScrollPane(jPanelOrderByTipoRamoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRamoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRamoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRamoActivoFijo);
			
			this.jInternalFrameOrderByTipoRamoActivoFijo.getContentPane().add(this.jScrollPanelOrderByTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByTipoRamoActivoFijo = new JButtonMe();
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
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRamoActivoFijo.getRowHeight();//TipoRamoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.isSelected()) {
					iHeightTable=TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRamoActivoFijo.isSelected()) {
					iHeightTable=TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRamoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRamoActivoFijo!=null && this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRamoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRamoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRamoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporamoactivofijoLogic.getTipoRamoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporamoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRamoActivoFijo> TraerTipoRamoActivoFijoBeans(List<TipoRamoActivoFijo> tiporamoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRamoActivoFijo tiporamoactivofijo:tiporamoactivofijos) {
					
				if(!(TipoRamoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRamoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporamoactivofijo.setsDetalleGeneralEntityReporte(TipoRamoActivoFijoConstantesFunciones.getTipoRamoActivoFijoDescripcion(tiporamoactivofijo));
										
						
					
					

					if(tiporamoactivofijo.getDetalleActivoFijos()!=null && Funciones.existeClass(classes,DetalleActivoFijo.class)) {
						try{tiporamoactivofijo.setdetalleactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DetalleActivoFijoJInternalFrame.TraerDetalleActivoFijoBeans(tiporamoactivofijo.getDetalleActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporamoactivofijo.setsDetalleGeneralEntityReporte(tiporamoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporamoactivofijobeans.add(tiporamoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporamoactivofijos;
    }
	//PARA REPORTES FIN
}
