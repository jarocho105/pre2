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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ActivosFijosPorRamosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ActivosFijosPorRamosJInternalFrame extends ActivosFijosPorRamosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarActivosFijosPorRamos;
	
	protected JMenuBar jmenuBarActivosFijosPorRamos;
	
	protected JMenu jmenuActivosFijosPorRamos;
	protected JMenu jmenuDatosActivosFijosPorRamos;
	protected JMenu jmenuArchivoActivosFijosPorRamos;
	protected JMenu jmenuAccionesActivosFijosPorRamos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActivosFijosPorRamos;	
	protected GridBagConstraints gridBagConstraintsActivosFijosPorRamos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ActivosFijosPorRamosDetalleFormJInternalFrame jInternalFrameDetalleFormActivosFijosPorRamos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoActivosFijosPorRamos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionActivosFijosPorRamos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRamoActivoFijoBeanSwingJInternalFrame tiporamoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporamoactivofijo="";
	
	public ActivosFijosPorRamosSessionBean activosfijosporramosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ActivosFijosPorRamos> activosfijosporramoss;		
	public List<ActivosFijosPorRamos> activosfijosporramossEliminados;	
	public List<ActivosFijosPorRamos> activosfijosporramossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByActivosFijosPorRamos;		
	protected JButton jButtonAbrirOrderByActivosFijosPorRamos;
	
	
	//protected JPanel jPanelOrderByActivosFijosPorRamos;
	//public JScrollPane jScrollPanelOrderByActivosFijosPorRamos;	
	//protected JButton jButtonCerrarOrderByActivosFijosPorRamos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ActivosFijosPorRamosLogic activosfijosporramosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosActivosFijosPorRamos;
	public JScrollPane jScrollPanelDatosEdicionActivosFijosPorRamos;
	public JScrollPane jScrollPanelDatosGeneralActivosFijosPorRamos;
    
	
	
	//public JScrollPane jScrollPanelDatosActivosFijosPorRamosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoActivosFijosPorRamos;
	//public JScrollPane jScrollPanelImportacionActivosFijosPorRamos;
	
	
	
	protected JPanel jPanelAccionesActivosFijosPorRamos;
	
    protected JPanel jPanelPaginacionActivosFijosPorRamos;
    protected JPanel jPanelParametrosReportesActivosFijosPorRamos;
	protected JPanel jPanelParametrosReportesAccionesActivosFijosPorRamos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ActivosFijosPorRamos;
	protected JPanel jPanelParametrosAuxiliar2ActivosFijosPorRamos;
	protected JPanel jPanelParametrosAuxiliar3ActivosFijosPorRamos;
	protected JPanel jPanelParametrosAuxiliar4ActivosFijosPorRamos;
	//protected JPanel jPanelParametrosAuxiliar5ActivosFijosPorRamos;
	
	
	
	//protected JPanel jPanelReporteDinamicoActivosFijosPorRamos;
	//protected JPanel jPanelImportacionActivosFijosPorRamos;
	
	
	public JTable jTableDatosActivosFijosPorRamos;
	
	
	
	//public JTable jTableDatosActivosFijosPorRamosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoActivosFijosPorRamos;
	protected JButton jButtonDuplicarActivosFijosPorRamos;
	protected JButton jButtonCopiarActivosFijosPorRamos;
	protected JButton jButtonVerFormActivosFijosPorRamos;
	protected JButton jButtonNuevoRelacionesActivosFijosPorRamos;
	protected JButton jButtonModificarActivosFijosPorRamos;
	
    protected JButton jButtonGuardarCambiosTablaActivosFijosPorRamos;
	protected JButton jButtonCerrarActivosFijosPorRamos;
	
	
	protected JButton jButtonRecargarInformacionActivosFijosPorRamos;
	protected JButton jButtonProcesarInformacionActivosFijosPorRamos;
	
	
	protected JButton jButtonAnterioresActivosFijosPorRamos;
	protected JButton jButtonSiguientesActivosFijosPorRamos;
	protected JButton jButtonNuevoGuardarCambiosActivosFijosPorRamos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoActivosFijosPorRamos;
	//protected JButton jButtonCerrarReporteDinamicoActivosFijosPorRamos;
	//protected JButton jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos;	
	
	
	
	//protected JButton jButtonAbrirImportacionActivosFijosPorRamos;
	//protected JButton jButtonGenerarImportacionActivosFijosPorRamos;
	//protected JButton jButtonCerrarImportacionActivosFijosPorRamos;
	//protected JFileChooser jFileChooserImportacionActivosFijosPorRamos;
	//protected File fileImportacionActivosFijosPorRamos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActivosFijosPorRamos;
	protected JButton jButtonDuplicarToolBarActivosFijosPorRamos;
	protected JButton jButtonNuevoRelacionesToolBarActivosFijosPorRamos;
	
	
	public JButton jButtonGuardarCambiosToolBarActivosFijosPorRamos;
	protected JButton jButtonCopiarToolBarActivosFijosPorRamos;
	protected JButton jButtonVerFormToolBarActivosFijosPorRamos;
	public JButton jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos;
	protected JButton jButtonMostrarOcultarTablaToolBarActivosFijosPorRamos;
	protected JButton jButtonCerrarToolBarActivosFijosPorRamos;
	
	protected JButton jButtonRecargarInformacionToolBarActivosFijosPorRamos;
	protected JButton jButtonProcesarInformacionToolBarActivosFijosPorRamos;
	protected JButton jButtonAnterioresToolBarActivosFijosPorRamos;
	protected JButton jButtonSiguientesToolBarActivosFijosPorRamos;
	protected JButton jButtonNuevoGuardarCambiosToolBarActivosFijosPorRamos;
	protected JButton jButtonAbrirOrderByToolBarActivosFijosPorRamos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActivosFijosPorRamos;
	protected JMenuItem jMenuItemDuplicarActivosFijosPorRamos;
	protected JMenuItem jMenuItemNuevoRelacionesActivosFijosPorRamos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosActivosFijosPorRamos;
	protected JMenuItem jMenuItemCopiarActivosFijosPorRamos;
	protected JMenuItem jMenuItemVerFormActivosFijosPorRamos;
	protected JMenuItem jMenuItemGuardarCambiosTablaActivosFijosPorRamos;
	protected JMenuItem jMenuItemCerrarActivosFijosPorRamos;
	protected JMenuItem jMenuItemDetalleCerrarActivosFijosPorRamos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByActivosFijosPorRamos;
	protected JMenuItem jMenuItemDetalleMostarOcultarActivosFijosPorRamos;
	
	protected JMenuItem jMenuItemRecargarInformacionActivosFijosPorRamos;
	protected JMenuItem jMenuItemProcesarInformacionActivosFijosPorRamos;
	protected JMenuItem jMenuItemAnterioresActivosFijosPorRamos;
	protected JMenuItem jMenuItemSiguientesActivosFijosPorRamos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActivosFijosPorRamos;
	protected JMenuItem jMenuItemAbrirOrderByActivosFijosPorRamos;
	protected JMenuItem jMenuItemMostrarOcultarActivosFijosPorRamos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActivosFijosPorRamos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosActivosFijosPorRamos;
	protected JCheckBox jCheckBoxSeleccionadosActivosFijosPorRamos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaActivosFijosPorRamos;
	protected JCheckBox jCheckBoxConGraficoReporteActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesActivosFijosPorRamos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarActivosFijosPorRamos;
	protected JTextField jTextFieldValorCampoGeneralActivosFijosPorRamos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteActivosFijosPorRamos;
	//public JList<Reporte> jListColumnasSelectReporteActivosFijosPorRamos;
	//public JScrollPane jScrollColumnasSelectReporteActivosFijosPorRamos;
	
	//public JLabel jLabelRelacionesSelectReporteActivosFijosPorRamos;
	//public JList<Reporte> jListRelacionesSelectReporteActivosFijosPorRamos;
	//public JScrollPane jScrollRelacionesSelectReporteActivosFijosPorRamos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoActivosFijosPorRamos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoActivosFijosPorRamos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos;
	//public JLabel jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos;
	
		
	//public JLabel jLabelArchivoImportacionActivosFijosPorRamos;	
	//public JLabel jLabelPathArchivoImportacionActivosFijosPorRamos;
	//protected JTextField jTextFieldPathArchivoImportacionActivosFijosPorRamos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoActivosFijosPorRamos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos;
	
	//public JLabel jLabelColumnaCategoriaValorActivosFijosPorRamos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorActivosFijosPorRamos;
	
	//public JLabel jLabelColumnasValoresGraficoActivosFijosPorRamos;
	//public JList<Reporte> jListColumnasValoresGraficoActivosFijosPorRamos;
	//public JScrollPane jScrollColumnasValoresGraficoActivosFijosPorRamos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasActivosFijosPorRamos;
	public JPanel jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos;
	public JButton jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos;
	
	public JPanel jPanelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos;
	public JLabel jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos;
	public JButton jButtonid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ActivosFijosPorRamosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorRamosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionActivosFijosPorRamos)	{
		this.jButtonRecargarInformacionActivosFijosPorRamos = jButtonRecargarInformacionActivosFijosPorRamos;
	}
	
	public JButton getjButtonProcesarInformacionActivosFijosPorRamos() {
		return this.jButtonProcesarInformacionActivosFijosPorRamos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActivosFijosPorRamos)	{
		this.jButtonProcesarInformacionActivosFijosPorRamos = jButtonProcesarInformacionActivosFijosPorRamos;
	}
	
	
	public JButton getjButtonRecargarInformacionActivosFijosPorRamos() {
		return this.jButtonRecargarInformacionActivosFijosPorRamos;
	}
	
	
	public List<ActivosFijosPorRamos> getactivosfijosporramoss() {
		return this.activosfijosporramoss;
	}

	public void setactivosfijosporramoss(List<ActivosFijosPorRamos> activosfijosporramoss) {
		this.activosfijosporramoss = activosfijosporramoss;
	}
	
	public List<ActivosFijosPorRamos> getactivosfijosporramossAux() {
		return this.activosfijosporramossAux;
	}

	public void setactivosfijosporramossAux(List<ActivosFijosPorRamos> activosfijosporramossAux) {
		this.activosfijosporramossAux = activosfijosporramossAux;
	}
	
	public List<ActivosFijosPorRamos> getactivosfijosporramossEliminados() {
		return this.activosfijosporramossEliminados;
	}

	public void setActivosFijosPorRamossEliminados(List<ActivosFijosPorRamos> activosfijosporramossEliminados) {
		this.activosfijosporramossEliminados = activosfijosporramossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarActivosFijosPorRamos() {
		return jComboBoxTiposSeleccionarActivosFijosPorRamos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarActivosFijosPorRamos(
			JComboBox jComboBoxTiposSeleccionarActivosFijosPorRamos) {
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos = jComboBoxTiposSeleccionarActivosFijosPorRamos;
	}
	
	public void setBorderResaltarTiposSeleccionarActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralActivosFijosPorRamos() {
		return jTextFieldValorCampoGeneralActivosFijosPorRamos;
	}

	public void setjTextFieldValorCampoGeneralActivosFijosPorRamos(
			JTextField jTextFieldValorCampoGeneralActivosFijosPorRamos) {
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos = jTextFieldValorCampoGeneralActivosFijosPorRamos;
	}

	public void setBorderResaltarValorCampoGeneralActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosActivosFijosPorRamos() {
		return this.jCheckBoxSeleccionarTodosActivosFijosPorRamos;
	}

	public void setjCheckBoxSeleccionarTodosActivosFijosPorRamos(
			JCheckBox jCheckBoxSeleccionarTodosActivosFijosPorRamos) {
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos = jCheckBoxSeleccionarTodosActivosFijosPorRamos;
	}

	public void setBorderResaltarSeleccionarTodosActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosActivosFijosPorRamos() {
		return this.jCheckBoxSeleccionadosActivosFijosPorRamos;
	}

	public void setjCheckBoxSeleccionadosActivosFijosPorRamos(
			JCheckBox jCheckBoxSeleccionadosActivosFijosPorRamos) {
		this.jCheckBoxSeleccionadosActivosFijosPorRamos = jCheckBoxSeleccionadosActivosFijosPorRamos;
	}
	
	public void setBorderResaltarSeleccionadosActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesActivosFijosPorRamos() {
		return this.jComboBoxTiposArchivosReportesActivosFijosPorRamos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesActivosFijosPorRamos(
			JComboBox jComboBoxTiposArchivosReportesActivosFijosPorRamos) {
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos = jComboBoxTiposArchivosReportesActivosFijosPorRamos;
	}

	public void setBorderResaltarTiposArchivosReportesActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesActivosFijosPorRamos() {
		return this.jComboBoxTiposReportesActivosFijosPorRamos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesActivosFijosPorRamos(
			JComboBox jComboBoxTiposReportesActivosFijosPorRamos) {
		this.jComboBoxTiposReportesActivosFijosPorRamos = jComboBoxTiposReportesActivosFijosPorRamos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoActivosFijosPorRamos() {
	//	return jComboBoxTiposReportesDinamicoActivosFijosPorRamos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoActivosFijosPorRamos(
	//		JComboBox jComboBoxTiposReportesDinamicoActivosFijosPorRamos) {
	//	this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos = jComboBoxTiposReportesDinamicoActivosFijosPorRamos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos() {
	//	return jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos = jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos;
	//}
	
	public void setBorderResaltarTiposReportesActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesActivosFijosPorRamos() {
		return this.jComboBoxTiposGraficosReportesActivosFijosPorRamos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesActivosFijosPorRamos(
			JComboBox jComboBoxTiposGraficosReportesActivosFijosPorRamos) {
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos = jComboBoxTiposGraficosReportesActivosFijosPorRamos;
	}
	
	public void setBorderResaltarTiposGraficosReportesActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionActivosFijosPorRamos() {
		return this.jComboBoxTiposPaginacionActivosFijosPorRamos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionActivosFijosPorRamos(
			JComboBox jComboBoxTiposPaginacionActivosFijosPorRamos) {
		this.jComboBoxTiposPaginacionActivosFijosPorRamos = jComboBoxTiposPaginacionActivosFijosPorRamos;
	}
	
	public void setBorderResaltarTiposPaginacionActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesActivosFijosPorRamos() {
		return this.jComboBoxTiposRelacionesActivosFijosPorRamos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActivosFijosPorRamos() {
		return this.jComboBoxTiposAccionesActivosFijosPorRamos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActivosFijosPorRamos(
			JComboBox jComboBoxTiposRelacionesActivosFijosPorRamos) {
		this.jComboBoxTiposRelacionesActivosFijosPorRamos = jComboBoxTiposRelacionesActivosFijosPorRamos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActivosFijosPorRamos(
			JComboBox jComboBoxTiposAccionesActivosFijosPorRamos) {
		this.jComboBoxTiposAccionesActivosFijosPorRamos = jComboBoxTiposAccionesActivosFijosPorRamos;
	}
	
	public void setBorderResaltarTiposRelacionesActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesActivosFijosPorRamos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesActivosFijosPorRamos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoActivosFijosPorRamos() {
	//	return jCheckBoxConGraficoDinamicoActivosFijosPorRamos;
	//}

	//public void setjCheckBoxConGraficoDinamicoActivosFijosPorRamos(
	//		JCheckBox jCheckBoxConGraficoDinamicoActivosFijosPorRamos) {
	//	this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos = jCheckBoxConGraficoDinamicoActivosFijosPorRamos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoActivosFijosPorRamos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarActivosFijosPorRamos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos .setBorder(borderResaltar);		
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
		this.activosfijosporramosSessionBean=new ActivosFijosPorRamosSessionBean();
		
		this.activosfijosporramosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosporramosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.activosfijosporramosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ActivosFijosPorRamosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ActivosFijosPorRamosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActivosFijosPorRamosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActivosFijosPorRamosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActivosFijosPorRamosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Activos Fijos Por Ramos MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
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
		
		ActivosFijosPorRamosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ActivosFijosPorRamos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarActivosFijosPorRamos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"nuevo","nuevo","Nuevo"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"duplicar","duplicar","Duplicar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"copiar","copiar","Copiar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"ver_form","ver_form","Ver"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"recargar","recargar","Buscar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarActivosFijosPorRamos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarActivosFijosPorRamos,this.jTtoolBarActivosFijosPorRamos,
							"cerrar","cerrar","Salir"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarActivosFijosPorRamos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarActivosFijosPorRamos;
			
				this.jButtonProcesarInformacionToolBarActivosFijosPorRamos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarActivosFijosPorRamos;
				
		//protected JButton jButtonModificarToolBarActivosFijosPorRamos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarActivosFijosPorRamos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuActivosFijosPorRamos=new JMenuMe("General");
		this.jmenuArchivoActivosFijosPorRamos=new JMenuMe("Archivo");
		this.jmenuAccionesActivosFijosPorRamos=new JMenuMe("Acciones");
		this.jmenuDatosActivosFijosPorRamos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActivosFijosPorRamos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActivosFijosPorRamos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActivosFijosPorRamos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarActivosFijosPorRamos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarActivosFijosPorRamos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarActivosFijosPorRamos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesActivosFijosPorRamos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesActivosFijosPorRamos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesActivosFijosPorRamos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosActivosFijosPorRamos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActivosFijosPorRamos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActivosFijosPorRamos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarActivosFijosPorRamos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarActivosFijosPorRamos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarActivosFijosPorRamos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormActivosFijosPorRamos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormActivosFijosPorRamos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormActivosFijosPorRamos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActivosFijosPorRamos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActivosFijosPorRamos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActivosFijosPorRamos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionActivosFijosPorRamos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionActivosFijosPorRamos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionActivosFijosPorRamos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionActivosFijosPorRamos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionActivosFijosPorRamos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionActivosFijosPorRamos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresActivosFijosPorRamos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresActivosFijosPorRamos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresActivosFijosPorRamos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesActivosFijosPorRamos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesActivosFijosPorRamos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesActivosFijosPorRamos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByActivosFijosPorRamos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByActivosFijosPorRamos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByActivosFijosPorRamos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActivosFijosPorRamos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActivosFijosPorRamos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActivosFijosPorRamos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoActivosFijosPorRamos.add(this.jMenuItemCerrarActivosFijosPorRamos);
			
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemNuevoActivosFijosPorRamos);
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemNuevoGuardarCambiosActivosFijosPorRamos);
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemNuevoRelacionesActivosFijosPorRamos);
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemGuardarCambiosTablaActivosFijosPorRamos);		
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemDuplicarActivosFijosPorRamos);		
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemCopiarActivosFijosPorRamos);		
			this.jmenuAccionesActivosFijosPorRamos.add(this.jMenuItemVerFormActivosFijosPorRamos);		
			
			this.jmenuDatosActivosFijosPorRamos.add(this.jMenuItemRecargarInformacionActivosFijosPorRamos);				
			this.jmenuDatosActivosFijosPorRamos.add(this.jMenuItemAnterioresActivosFijosPorRamos);				
			this.jmenuDatosActivosFijosPorRamos.add(this.jMenuItemSiguientesActivosFijosPorRamos);				
			this.jmenuDatosActivosFijosPorRamos.add(this.jMenuItemAbrirOrderByActivosFijosPorRamos);				
			this.jmenuDatosActivosFijosPorRamos.add(this.jMenuItemMostrarOcultarActivosFijosPorRamos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesActivosFijosPorRamos.add(this.jMenuItemGuardarCambiosActivosFijosPorRamos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarActivosFijosPorRamos.add(this.jmenuArchivoActivosFijosPorRamos);		
			this.jmenuBarActivosFijosPorRamos.add(this.jmenuAccionesActivosFijosPorRamos);		
			this.jmenuBarActivosFijosPorRamos.add(this.jmenuDatosActivosFijosPorRamos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarActivosFijosPorRamos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasActivosFijosPorRamos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos.setToolTipText("Buscar Por Tipo Ramo Activo Fijo ");
		this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos= new JButtonMe();
		this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos.setText("Buscar");
		this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos.setToolTipText("Buscar Por Tipo Ramo Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos,"buscar_button","Buscar Por Tipo Ramo Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos = new JLabelMe();
		jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setText("Tipo Ramo Activo Fijo :");
		jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setToolTipText("Tipo Ramo Activo Fijo");
		jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos= new JComboBoxMe();
		jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasActivosFijosPorRamos=new JTabbedPane();


		this.jTabbedPaneBusquedasActivosFijosPorRamos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasActivosFijosPorRamos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasActivosFijosPorRamos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleActivosFijosPorRamos = new ActivosFijosPorRamosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Activos Fijos Por Ramos DATOS");
			this.jInternalFrameDetalleFormActivosFijosPorRamos = new ActivosFijosPorRamosDetalleFormJInternalFrame(jDesktopPane,this.activosfijosporramosSessionBean.getConGuardarRelaciones(),this.activosfijosporramosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormActivosFijosPorRamos = null;//new ActivosFijosPorRamosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActivosFijosPorRamos= new GridBagLayout();
		
		
		this.jTableDatosActivosFijosPorRamos = new JTableMe();      
		
		String sToolTipActivosFijosPorRamos="";
		sToolTipActivosFijosPorRamos=ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActivosFijosPorRamos+="(ActivosFijos.ActivosFijosPorRamos)";
		}
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			sToolTipActivosFijosPorRamos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosActivosFijosPorRamos.setToolTipText(sToolTipActivosFijosPorRamos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosActivosFijosPorRamos);
		this.jTableDatosActivosFijosPorRamos.setAutoCreateRowSorter(true);
		this.jTableDatosActivosFijosPorRamos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosActivosFijosPorRamos.setRowSelectionAllowed(true);
		this.jTableDatosActivosFijosPorRamos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosActivosFijosPorRamos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoActivosFijosPorRamos = new JButtonMe();
		this.jButtonDuplicarActivosFijosPorRamos = new JButtonMe();
		this.jButtonCopiarActivosFijosPorRamos = new JButtonMe();
		this.jButtonVerFormActivosFijosPorRamos = new JButtonMe();
		this.jButtonNuevoRelacionesActivosFijosPorRamos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos = new JButtonMe();
		this.jButtonCerrarActivosFijosPorRamos = new JButtonMe();
		
		this.jScrollPanelDatosActivosFijosPorRamos = new JScrollPane();   
        this.jScrollPanelDatosGeneralActivosFijosPorRamos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Activos Fijos Por Ramos";
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Ramoses" + this.sPath));
		} else {
			this.jScrollPanelDatosActivosFijosPorRamos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActivosFijosPorRamos.setToolTipText("Acciones");
        this.jPanelAccionesActivosFijosPorRamos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoActivosFijosPorRamos=new ReporteDinamicoJInternalFrame(ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoActivosFijosPorRamos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionActivosFijosPorRamos=new ImportacionJInternalFrame(ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionActivosFijosPorRamos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByActivosFijosPorRamos = new JButtonMe();
		
		this.jButtonAbrirOrderByActivosFijosPorRamos.setText("Orden");
		this.jButtonAbrirOrderByActivosFijosPorRamos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActivosFijosPorRamos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActivosFijosPorRamos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorRamos,false,this);
			
			//this.cargarOrderByActivosFijosPorRamos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActivosFijosPorRamos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorRamos,true,this);
			
			//this.cargarOrderByActivosFijosPorRamos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosActivosFijosPorRamos.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosActivosFijosPorRamos.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosActivosFijosPorRamos.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosActivosFijosPorRamos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosActivosFijosPorRamos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosActivosFijosPorRamos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoActivosFijosPorRamos.setText("Nuevo");
		this.jButtonDuplicarActivosFijosPorRamos.setText("Duplicar");
		this.jButtonCopiarActivosFijosPorRamos.setText("Copiar");
		this.jButtonVerFormActivosFijosPorRamos.setText("Ver");
		this.jButtonNuevoRelacionesActivosFijosPorRamos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.setText("Guardar");
		this.jButtonCerrarActivosFijosPorRamos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActivosFijosPorRamos,"nuevo_button","Nuevo",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarActivosFijosPorRamos,"duplicar_button","Duplicar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarActivosFijosPorRamos,"copiar_button","Copiar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormActivosFijosPorRamos,"ver_form","Ver",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesActivosFijosPorRamos,"nuevorelaciones_button","Nuevo Rel",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActivosFijosPorRamos,"guardarcambiostabla_button","Guardar",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActivosFijosPorRamos,"cerrar_button","Salir",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoActivosFijosPorRamos.setToolTipText("Nuevo"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarActivosFijosPorRamos.setToolTipText("Duplicar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarActivosFijosPorRamos.setToolTipText("Copiar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormActivosFijosPorRamos.setToolTipText("Ver"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesActivosFijosPorRamos.setToolTipText("Nuevo Rel"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.setToolTipText("Guardar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActivosFijosPorRamos.setToolTipText("Salir"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActivosFijosPorRamos";
		inputMap = this.jButtonNuevoActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActivosFijosPorRamos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActivosFijosPorRamos"));
		
		//DUPLICAR
		sMapKey = "DuplicarActivosFijosPorRamos";
		inputMap = this.jButtonDuplicarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarActivosFijosPorRamos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarActivosFijosPorRamos"));
		
		//COPIAR
		sMapKey = "CopiarActivosFijosPorRamos";
		inputMap = this.jButtonCopiarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarActivosFijosPorRamos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarActivosFijosPorRamos"));
		
		//VEr FORM
		sMapKey = "VerFormActivosFijosPorRamos";
		inputMap = this.jButtonVerFormActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormActivosFijosPorRamos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormActivosFijosPorRamos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesActivosFijosPorRamos";
		inputMap = this.jButtonNuevoRelacionesActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesActivosFijosPorRamos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarActivosFijosPorRamos";
		inputMap = this.jButtonModificarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarActivosFijosPorRamos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarActivosFijosPorRamos";
		inputMap = this.jButtonCerrarActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActivosFijosPorRamos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActivosFijosPorRamos";
		inputMap = this.jButtonGuardarCambiosTablaActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActivosFijosPorRamos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ActivosFijosPorRamos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ActivosFijosPorRamos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ActivosFijosPorRamos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ActivosFijosPorRamos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ActivosFijosPorRamos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesActivosFijosPorRamos.setName("jPanelParametrosReportesActivosFijosPorRamos"); 
		
		this.jPanelParametrosReportesAccionesActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesActivosFijosPorRamos.setName("jPanelParametrosReportesAccionesActivosFijosPorRamos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionActivosFijosPorRamos = new JButtonMe();
		this.jButtonRecargarInformacionActivosFijosPorRamos.setText("Buscar");
		this.jButtonRecargarInformacionActivosFijosPorRamos.setToolTipText("Buscar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionActivosFijosPorRamos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionActivosFijosPorRamos.setVisible(false);
		
		
		this.jButtonProcesarInformacionActivosFijosPorRamos = new JButtonMe();
		this.jButtonProcesarInformacionActivosFijosPorRamos.setText("Procesar");
		this.jButtonProcesarInformacionActivosFijosPorRamos.setToolTipText("Procesar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionActivosFijosPorRamos.setVisible(false);
			
		this.jButtonProcesarInformacionActivosFijosPorRamos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActivosFijosPorRamos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActivosFijosPorRamos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setText("TIPO");       
		this.jComboBoxTiposReportesActivosFijosPorRamos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionActivosFijosPorRamos.setText("Paginacion");
		this.jComboBoxTiposPaginacionActivosFijosPorRamos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesActivosFijosPorRamos.setText("Accion");
		this.jComboBoxTiposRelacionesActivosFijosPorRamos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActivosFijosPorRamos.setText("Accion");
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarActivosFijosPorRamos.setText("Accion");
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActivosFijosPorRamos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesActivosFijosPorRamos = new JLabelMe();
		
		this.jLabelAccionesActivosFijosPorRamos.setText("Acciones");		
		this.jLabelAccionesActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosActivosFijosPorRamos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosActivosFijosPorRamos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosActivosFijosPorRamos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteActivosFijosPorRamos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteActivosFijosPorRamos.setText("Graf.");
		this.jCheckBoxConGraficoReporteActivosFijosPorRamos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresActivosFijosPorRamos = new JButtonMe();
		//this.jButtonAnterioresActivosFijosPorRamos.setText("<<");
        this.jButtonAnterioresActivosFijosPorRamos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresActivosFijosPorRamos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesActivosFijosPorRamos = new JButtonMe();
		//this.jButtonSiguientesActivosFijosPorRamos.setText(">>");
        this.jButtonSiguientesActivosFijosPorRamos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesActivosFijosPorRamos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorRamos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.setText("Nue");
        this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosActivosFijosPorRamos,"nuevoguardarcambios_button","Nue",this.activosfijosporramosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosActivosFijosPorRamos";
		inputMap = this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosActivosFijosPorRamos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionActivosFijosPorRamos";
		inputMap = this.jButtonRecargarInformacionActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionActivosFijosPorRamos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesActivosFijosPorRamos";
		inputMap = this.jButtonSiguientesActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesActivosFijosPorRamos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresActivosFijosPorRamos";
		inputMap = this.jButtonAnterioresActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresActivosFijosPorRamos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasActivosFijosPorRamos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesActivosFijosPorRamos.setMinimumSize(new Dimension(this.getWidth(),ActivosFijosPorRamosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosPorRamosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActivosFijosPorRamos.setMaximumSize(new Dimension(this.getWidth(),ActivosFijosPorRamosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosPorRamosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActivosFijosPorRamos.setPreferredSize(new Dimension(this.getWidth(),ActivosFijosPorRamosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosPorRamosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionActivosFijosPorRamos = new GridBagLayout();

			this.jPanelPaginacionActivosFijosPorRamos.setLayout(gridaBagLayoutPaginacionActivosFijosPorRamos);						
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonAnterioresActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
					
						
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
			
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonNuevoGuardarCambiosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
						
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonSiguientesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonNuevoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
						
			
			
			if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsActivosFijosPorRamos.gridy = 1;
				this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonGuardarCambiosTablaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			}
			
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonDuplicarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonCopiarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonVerFormActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionActivosFijosPorRamos.add(this.jButtonCerrarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		
		this.jButtonRecargarInformacionActivosFijosPorRamos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActivosFijosPorRamos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActivosFijosPorRamos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActivosFijosPorRamos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesActivosFijosPorRamos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActivosFijosPorRamos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActivosFijosPorRamos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActivosFijosPorRamos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionActivosFijosPorRamos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActivosFijosPorRamos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActivosFijosPorRamos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteActivosFijosPorRamos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActivosFijosPorRamos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActivosFijosPorRamos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActivosFijosPorRamos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosActivosFijosPorRamos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActivosFijosPorRamos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActivosFijosPorRamos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesActivosFijosPorRamos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesActivosFijosPorRamos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ActivosFijosPorRamos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ActivosFijosPorRamos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ActivosFijosPorRamos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ActivosFijosPorRamos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesActivosFijosPorRamos.setLayout(gridaBagParametrosReportesActivosFijosPorRamos);
			this.jPanelParametrosReportesAccionesActivosFijosPorRamos.setLayout(gridaBagParametrosReportesAccionesActivosFijosPorRamos);
			
			
			this.jPanelParametrosAuxiliar1ActivosFijosPorRamos.setLayout(gridaBagParametrosAuxiliar1ActivosFijosPorRamos);
			this.jPanelParametrosAuxiliar2ActivosFijosPorRamos.setLayout(gridaBagParametrosAuxiliar2ActivosFijosPorRamos);
			this.jPanelParametrosAuxiliar3ActivosFijosPorRamos.setLayout(gridaBagParametrosAuxiliar3ActivosFijosPorRamos);
			this.jPanelParametrosAuxiliar4ActivosFijosPorRamos.setLayout(gridaBagParametrosAuxiliar4ActivosFijosPorRamos);
			//this.jPanelParametrosAuxiliar5ActivosFijosPorRamos.setLayout(gridaBagParametrosAuxiliar2ActivosFijosPorRamos);			
			
			
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jButtonRecargarInformacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijosPorRamos.add(this.jComboBoxTiposPaginacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijosPorRamos.add(this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijosPorRamos.add(this.jComboBoxTiposArchivosReportesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jPanelParametrosAuxiliar1ActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ActivosFijosPorRamos.add(this.jComboBoxTiposReportesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);																		
			
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ActivosFijosPorRamos.add(this.jComboBoxTiposGraficosReportesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jPanelParametrosAuxiliar4ActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jComboBoxTiposReportesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jCheckBoxGenerarReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jPanelParametrosAuxiliar2ActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jLabelAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jButtonAbrirOrderByActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jComboBoxTiposSeleccionarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
			
			
			/*
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jCheckBoxSeleccionarTodosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jCheckBoxConGraficoReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijosPorRamos.add(this.jCheckBoxSeleccionarTodosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);															
				
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijosPorRamos.add(this.jCheckBoxSeleccionadosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);															
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijosPorRamos.add(this.jCheckBoxConGraficoReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jPanelParametrosAuxiliar3ActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijosPorRamos.add(this.jComboBoxTiposAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosActivosFijosPorRamos = new GridBagLayout();

			this.jScrollPanelDatosActivosFijosPorRamos.setLayout(gridaBagLayoutDatosActivosFijosPorRamos);
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
			
			this.jScrollPanelDatosActivosFijosPorRamos.add(this.jTableDatosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosActivosFijosPorRamos.setViewportView(this.jTableDatosActivosFijosPorRamos);
		this.jTableDatosActivosFijosPorRamos.setFillsViewportHeight(true);
		this.jTableDatosActivosFijosPorRamos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesActivosFijosPorRamos= new GridBagLayout();
		this.jPanelAccionesActivosFijosPorRamos.setLayout(gridaBagLayoutAccionesActivosFijosPorRamos);
		
		
		/*	
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
			
		this.jPanelAccionesActivosFijosPorRamos.add(this.jButtonNuevoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaActivosFijosPorRamosActivosFijosPorRamos= new GridBagLayout();
		gridaBagLayoutBusquedaActivosFijosPorRamosActivosFijosPorRamos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaActivosFijosPorRamosActivosFijosPorRamos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaActivosFijosPorRamosActivosFijosPorRamos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaActivosFijosPorRamosActivosFijosPorRamos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos.setLayout(gridaBagLayoutBusquedaActivosFijosPorRamosActivosFijosPorRamos);

		gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		gridBagConstraintsActivosFijosPorRamos.gridx = 0;
		jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos.add(jLabelid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos, gridBagConstraintsActivosFijosPorRamos);

		gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActivosFijosPorRamos.gridy = 0;
		gridBagConstraintsActivosFijosPorRamos.gridx = 1;
		jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos.add(jComboBoxid_tipo_ramo_activo_fijoBusquedaActivosFijosPorRamosActivosFijosPorRamos, gridBagConstraintsActivosFijosPorRamos);

		gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActivosFijosPorRamos.gridy = 1;
		gridBagConstraintsActivosFijosPorRamos.gridx =1;
		jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos.add(jButtonBusquedaActivosFijosPorRamosActivosFijosPorRamos, gridBagConstraintsActivosFijosPorRamos);

		jTabbedPaneBusquedasActivosFijosPorRamos.addTab("1.-Por Tipo Ramo Activo Fijo ", jPanelBusquedaActivosFijosPorRamosActivosFijosPorRamos);
		jTabbedPaneBusquedasActivosFijosPorRamos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActivosFijosPorRamos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActivosFijosPorRamos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();						
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;		
			//this.gridBagConstraintsActivosFijosPorRamos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActivosFijosPorRamos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;		
		//this.gridBagConstraintsActivosFijosPorRamos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsActivosFijosPorRamos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsActivosFijosPorRamos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;		
			this.gridBagConstraintsActivosFijosPorRamos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsActivosFijosPorRamos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);								
		
		
		/*
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		*/		
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActivosFijosPorRamos.gridx =0;
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActivosFijosPorRamos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
				
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ActivosFijosPorRamosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosActivosFijosPorRamos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActivosFijosPorRamos = new GridBagLayout();
			this.jPanelBusquedasParametrosActivosFijosPorRamos.setLayout(gridaBagLayoutBusquedasParametrosActivosFijosPorRamos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralActivosFijosPorRamos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
			
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralActivosFijosPorRamos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoActivosFijosPorRamos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoActivosFijosPorRamos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoActivosFijosPorRamos.setName("jPanelReporteDinamicoActivosFijosPorRamos"); 
		
		this.jPanelReporteDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoActivosFijosPorRamos.setLayout(gridaBagLayoutReporteDinamicoActivosFijosPorRamos);
		
		
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoActivosFijosPorRamos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActivosFijosPorRamos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setResizable(true);
	    this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setClosable(true);
	    this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Ramoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteActivosFijosPorRamos = new JLabelMe();

		this.jLabelColumnasSelectReporteActivosFijosPorRamos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelColumnasSelectReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteActivosFijosPorRamos = new JList<Reporte>();
		this.jListColumnasSelectReporteActivosFijosPorRamos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteActivosFijosPorRamos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteActivosFijosPorRamos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActivosFijosPorRamos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActivosFijosPorRamos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteActivosFijosPorRamos=new JScrollPane(this.jListColumnasSelectReporteActivosFijosPorRamos);
			
			this.jScrollColumnasSelectReporteActivosFijosPorRamos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActivosFijosPorRamos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActivosFijosPorRamos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jListColumnasSelectReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jScrollColumnasSelectReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteActivosFijosPorRamos = new JLabelMe();

		this.jLabelRelacionesSelectReporteActivosFijosPorRamos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteActivosFijosPorRamos = new JList<Reporte>();
		this.jListRelacionesSelectReporteActivosFijosPorRamos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteActivosFijosPorRamos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteActivosFijosPorRamos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActivosFijosPorRamos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActivosFijosPorRamos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteActivosFijosPorRamos=new JScrollPane(this.jListRelacionesSelectReporteActivosFijosPorRamos);
			
			this.jScrollRelacionesSelectReporteActivosFijosPorRamos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActivosFijosPorRamos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActivosFijosPorRamos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos = new JComboBoxMe();
		this.jListColumnasValoresGraficoActivosFijosPorRamos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoActivosFijosPorRamos = new JLabelMe();

		this.jLabelConGraficoDinamicoActivosFijosPorRamos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelConGraficoDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jCheckBoxConGraficoDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoActivosFijosPorRamos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoActivosFijosPorRamos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelColumnaCategoriaGraficoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorActivosFijosPorRamos = new JLabelMe();

		this.jLabelColumnaCategoriaValorActivosFijosPorRamos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelColumnaCategoriaValorActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jComboBoxColumnaCategoriaValorActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoActivosFijosPorRamos = new JLabelMe();

		this.jLabelColumnasValoresGraficoActivosFijosPorRamos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelColumnasValoresGraficoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoActivosFijosPorRamos = new JList<Reporte>();
		this.jListColumnasValoresGraficoActivosFijosPorRamos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoActivosFijosPorRamos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoActivosFijosPorRamos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoActivosFijosPorRamos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoActivosFijosPorRamos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoActivosFijosPorRamos=new JScrollPane(this.jListColumnasValoresGraficoActivosFijosPorRamos);
			
			this.jScrollColumnasValoresGraficoActivosFijosPorRamos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoActivosFijosPorRamos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoActivosFijosPorRamos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jListColumnasSelectReporteActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jScrollColumnasValoresGraficoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelTiposGraficosReportesDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoActivosFijosPorRamos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelGenerarExcelReporteDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos.setToolTipText("Generar EXCEL"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jButtonGenerarExcelReporteDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jComboBoxTiposReportesDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jLabelTiposArchivoReporteDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoActivosFijosPorRamos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoActivosFijosPorRamos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoActivosFijosPorRamos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoActivosFijosPorRamos.setToolTipText("Generar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jButtonGenerarReporteDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoActivosFijosPorRamos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoActivosFijosPorRamos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoActivosFijosPorRamos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoActivosFijosPorRamos.setToolTipText("Cancelar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorRamos.add(this.jButtonCerrarReporteDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalActivosFijosPorRamos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoActivosFijosPorRamos= new JScrollPane(jPanelReporteDinamicoActivosFijosPorRamos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Ramoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorRamos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalActivosFijosPorRamos);
		this.jInternalFrameReporteDinamicoActivosFijosPorRamos.getContentPane().add(this.jScrollPanelReporteDinamicoActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionActivosFijosPorRamos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionActivosFijosPorRamos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionActivosFijosPorRamos.setName("jPanelImportacionActivosFijosPorRamos"); 
		
		this.jPanelImportacionActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionActivosFijosPorRamos.setLayout(gridaBagLayoutImportacionActivosFijosPorRamos);
		
		
		this.jInternalFrameImportacionActivosFijosPorRamos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionActivosFijosPorRamos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionActivosFijosPorRamos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActivosFijosPorRamos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionActivosFijosPorRamos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActivosFijosPorRamos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActivosFijosPorRamos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionActivosFijosPorRamos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActivosFijosPorRamos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActivosFijosPorRamos.setResizable(true);
	    this.jInternalFrameImportacionActivosFijosPorRamos.setClosable(true);
	    this.jInternalFrameImportacionActivosFijosPorRamos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionActivosFijosPorRamos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActivosFijosPorRamos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActivosFijosPorRamos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionActivosFijosPorRamos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActivosFijosPorRamos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActivosFijosPorRamos.setResizable(true);
	    this.jInternalFrameImportacionActivosFijosPorRamos.setClosable(true);
	    this.jInternalFrameImportacionActivosFijosPorRamos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Ramoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionActivosFijosPorRamos = new JLabelMe();

		this.jLabelArchivoImportacionActivosFijosPorRamos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYImportacion;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActivosFijosPorRamos.add(this.jLabelArchivoImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionActivosFijosPorRamos = new JFileChooser();		
		this.jFileChooserImportacionActivosFijosPorRamos.setToolTipText("ESCOGER ARCHIVO"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionActivosFijosPorRamos = new JButtonMe();
		this.jButtonAbrirImportacionActivosFijosPorRamos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionActivosFijosPorRamos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionActivosFijosPorRamos.setToolTipText("Generar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorRamos.add(this.jButtonAbrirImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionActivosFijosPorRamos = new JLabelMe();

		this.jLabelPathArchivoImportacionActivosFijosPorRamos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionActivosFijosPorRamos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActivosFijosPorRamos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActivosFijosPorRamos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYImportacion;		
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActivosFijosPorRamos.add(this.jLabelPathArchivoImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionActivosFijosPorRamos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionActivosFijosPorRamos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActivosFijosPorRamos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActivosFijosPorRamos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorRamos.add(this.jTextFieldPathArchivoImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionActivosFijosPorRamos = new JButtonMe();
		this.jButtonGenerarImportacionActivosFijosPorRamos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionActivosFijosPorRamos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionActivosFijosPorRamos.setToolTipText("Generar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorRamos.add(this.jButtonGenerarImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionActivosFijosPorRamos = new JButtonMe();
		this.jButtonCerrarImportacionActivosFijosPorRamos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionActivosFijosPorRamos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionActivosFijosPorRamos.setToolTipText("Cancelar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorRamos.add(this.jButtonCerrarImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalActivosFijosPorRamos = new GridBagLayout();
		
		this.jScrollPanelImportacionActivosFijosPorRamos= new JScrollPane(jPanelImportacionActivosFijosPorRamos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorRamos.gridy =iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorRamos.gridx =iPosXImportacion;
		this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionActivosFijosPorRamos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionActivosFijosPorRamos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalActivosFijosPorRamos);
		this.jInternalFrameImportacionActivosFijosPorRamos.getContentPane().add(this.jScrollPanelImportacionActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByActivosFijosPorRamos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByActivosFijosPorRamos = new JButtonMe();
			this.jButtonAbrirOrderByActivosFijosPorRamos.setText("Orden");
			this.jButtonAbrirOrderByActivosFijosPorRamos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActivosFijosPorRamos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByActivosFijosPorRamos";
			inputMap = this.jButtonAbrirOrderByActivosFijosPorRamos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByActivosFijosPorRamos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByActivosFijosPorRamos"));
		
		
			GridBagLayout gridaBagLayoutOrderByActivosFijosPorRamos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByActivosFijosPorRamos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByActivosFijosPorRamos.setName("jPanelOrderByActivosFijosPorRamos"); 
			
			this.jPanelOrderByActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByActivosFijosPorRamos.setLayout(gridaBagLayoutOrderByActivosFijosPorRamos);
			
			
			this.jTableDatosActivosFijosPorRamosOrderBy = new JTableMe();        
			this.jTableDatosActivosFijosPorRamosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosActivosFijosPorRamosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosActivosFijosPorRamosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosActivosFijosPorRamosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosActivosFijosPorRamosOrderBy.setViewportView(this.jTableDatosActivosFijosPorRamosOrderBy);
			this.jTableDatosActivosFijosPorRamosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosActivosFijosPorRamosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByActivosFijosPorRamos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByActivosFijosPorRamos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByActivosFijosPorRamos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteActivosFijosPorRamos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByActivosFijosPorRamos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByActivosFijosPorRamos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByActivosFijosPorRamos.setTitle("Orden");
			this.jInternalFrameOrderByActivosFijosPorRamos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByActivosFijosPorRamos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByActivosFijosPorRamos.setResizable(true);
			this.jInternalFrameOrderByActivosFijosPorRamos.setClosable(true);
			this.jInternalFrameOrderByActivosFijosPorRamos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByActivosFijosPorRamos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Ramoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iPosXOrderBy;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsActivosFijosPorRamos.ipady =150;
				
			this.jPanelOrderByActivosFijosPorRamos.add(jScrollPanelDatosActivosFijosPorRamosOrderBy, this.gridBagConstraintsActivosFijosPorRamos);//this.jTableDatosActivosFijosPorRamosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByActivosFijosPorRamos = new JButtonMe();
			this.jButtonCerrarOrderByActivosFijosPorRamos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByActivosFijosPorRamos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByActivosFijosPorRamos.setToolTipText("Cancelar"+" "+ActivosFijosPorRamosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByActivosFijosPorRamos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorRamos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsActivosFijosPorRamos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByActivosFijosPorRamos.add(this.jButtonCerrarOrderByActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalActivosFijosPorRamos = new GridBagLayout();
			
			this.jScrollPanelOrderByActivosFijosPorRamos= new JScrollPane(jPanelOrderByActivosFijosPorRamos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsActivosFijosPorRamos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorRamos.gridy =iPosYOrderBy;
			this.gridBagConstraintsActivosFijosPorRamos.gridx =iPosXOrderBy;
			this.gridBagConstraintsActivosFijosPorRamos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByActivosFijosPorRamos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByActivosFijosPorRamos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalActivosFijosPorRamos);
			
			this.jInternalFrameOrderByActivosFijosPorRamos.getContentPane().add(this.jScrollPanelOrderByActivosFijosPorRamos, this.gridBagConstraintsActivosFijosPorRamos);			
		
		} else {
			this.jButtonAbrirOrderByActivosFijosPorRamos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.activosfijosporramosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosActivosFijosPorRamos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosActivosFijosPorRamos.getRowHeight();//ActivosFijosPorRamosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.isSelected()) {
					iHeightTable=ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActivosFijosPorRamos.isSelected()) {
					iHeightTable=ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActivosFijosPorRamosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByActivosFijosPorRamos!=null && this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy()!=null) {
			//if(!this.activosfijosporramosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByActivosFijosPorRamos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByActivosFijosPorRamos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByActivosFijosPorRamos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByActivosFijosPorRamos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosActivosFijosPorRamos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActivosFijosPorRamos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActivosFijosPorRamos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=activosfijosporramosLogic.getActivosFijosPorRamoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijosporramoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ActivosFijosPorRamos> TraerActivosFijosPorRamosBeans(List<ActivosFijosPorRamos> activosfijosporramoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ActivosFijosPorRamos activosfijosporramos:activosfijosporramoss) {
					
				if(!(ActivosFijosPorRamosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ActivosFijosPorRamosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					activosfijosporramos.setsDetalleGeneralEntityReporte(ActivosFijosPorRamosConstantesFunciones.getActivosFijosPorRamosDescripcion(activosfijosporramos));
										
						
					
						
					
				} else  {
							
					//activosfijosporramos.setsDetalleGeneralEntityReporte(activosfijosporramos.getsDetalleGeneralEntityReporte());
										
				}
				
				//activosfijosporramosbeans.add(activosfijosporramosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return activosfijosporramoss;
    }
	//PARA REPORTES FIN
}
