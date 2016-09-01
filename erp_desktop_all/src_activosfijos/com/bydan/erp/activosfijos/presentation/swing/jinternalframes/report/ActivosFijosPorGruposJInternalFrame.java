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

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.activosfijos.util.report.ActivosFijosPorGruposConstantesFunciones;

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
public class ActivosFijosPorGruposJInternalFrame extends ActivosFijosPorGruposBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarActivosFijosPorGrupos;
	
	protected JMenuBar jmenuBarActivosFijosPorGrupos;
	
	protected JMenu jmenuActivosFijosPorGrupos;
	protected JMenu jmenuDatosActivosFijosPorGrupos;
	protected JMenu jmenuArchivoActivosFijosPorGrupos;
	protected JMenu jmenuAccionesActivosFijosPorGrupos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActivosFijosPorGrupos;	
	protected GridBagConstraints gridBagConstraintsActivosFijosPorGrupos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ActivosFijosPorGruposDetalleFormJInternalFrame jInternalFrameDetalleFormActivosFijosPorGrupos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoActivosFijosPorGrupos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionActivosFijosPorGrupos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ActivosFijosPorGruposSessionBean activosfijosporgruposSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ActivosFijosPorGrupos> activosfijosporgruposs;		
	public List<ActivosFijosPorGrupos> activosfijosporgrupossEliminados;	
	public List<ActivosFijosPorGrupos> activosfijosporgrupossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByActivosFijosPorGrupos;		
	protected JButton jButtonAbrirOrderByActivosFijosPorGrupos;
	
	
	//protected JPanel jPanelOrderByActivosFijosPorGrupos;
	//public JScrollPane jScrollPanelOrderByActivosFijosPorGrupos;	
	//protected JButton jButtonCerrarOrderByActivosFijosPorGrupos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ActivosFijosPorGruposLogic activosfijosporgruposLogic;
	
	
	
	public JScrollPane jScrollPanelDatosActivosFijosPorGrupos;
	public JScrollPane jScrollPanelDatosEdicionActivosFijosPorGrupos;
	public JScrollPane jScrollPanelDatosGeneralActivosFijosPorGrupos;
    
	
	
	//public JScrollPane jScrollPanelDatosActivosFijosPorGruposOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoActivosFijosPorGrupos;
	//public JScrollPane jScrollPanelImportacionActivosFijosPorGrupos;
	
	
	
	protected JPanel jPanelAccionesActivosFijosPorGrupos;
	
    protected JPanel jPanelPaginacionActivosFijosPorGrupos;
    protected JPanel jPanelParametrosReportesActivosFijosPorGrupos;
	protected JPanel jPanelParametrosReportesAccionesActivosFijosPorGrupos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ActivosFijosPorGrupos;
	protected JPanel jPanelParametrosAuxiliar2ActivosFijosPorGrupos;
	protected JPanel jPanelParametrosAuxiliar3ActivosFijosPorGrupos;
	protected JPanel jPanelParametrosAuxiliar4ActivosFijosPorGrupos;
	//protected JPanel jPanelParametrosAuxiliar5ActivosFijosPorGrupos;
	
	
	
	//protected JPanel jPanelReporteDinamicoActivosFijosPorGrupos;
	//protected JPanel jPanelImportacionActivosFijosPorGrupos;
	
	
	public JTable jTableDatosActivosFijosPorGrupos;
	
	
	
	//public JTable jTableDatosActivosFijosPorGruposOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoActivosFijosPorGrupos;
	protected JButton jButtonDuplicarActivosFijosPorGrupos;
	protected JButton jButtonCopiarActivosFijosPorGrupos;
	protected JButton jButtonVerFormActivosFijosPorGrupos;
	protected JButton jButtonNuevoRelacionesActivosFijosPorGrupos;
	protected JButton jButtonModificarActivosFijosPorGrupos;
	
    protected JButton jButtonGuardarCambiosTablaActivosFijosPorGrupos;
	protected JButton jButtonCerrarActivosFijosPorGrupos;
	
	
	protected JButton jButtonRecargarInformacionActivosFijosPorGrupos;
	protected JButton jButtonProcesarInformacionActivosFijosPorGrupos;
	
	
	protected JButton jButtonAnterioresActivosFijosPorGrupos;
	protected JButton jButtonSiguientesActivosFijosPorGrupos;
	protected JButton jButtonNuevoGuardarCambiosActivosFijosPorGrupos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoActivosFijosPorGrupos;
	//protected JButton jButtonCerrarReporteDinamicoActivosFijosPorGrupos;
	//protected JButton jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos;	
	
	
	
	//protected JButton jButtonAbrirImportacionActivosFijosPorGrupos;
	//protected JButton jButtonGenerarImportacionActivosFijosPorGrupos;
	//protected JButton jButtonCerrarImportacionActivosFijosPorGrupos;
	//protected JFileChooser jFileChooserImportacionActivosFijosPorGrupos;
	//protected File fileImportacionActivosFijosPorGrupos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActivosFijosPorGrupos;
	protected JButton jButtonDuplicarToolBarActivosFijosPorGrupos;
	protected JButton jButtonNuevoRelacionesToolBarActivosFijosPorGrupos;
	
	
	public JButton jButtonGuardarCambiosToolBarActivosFijosPorGrupos;
	protected JButton jButtonCopiarToolBarActivosFijosPorGrupos;
	protected JButton jButtonVerFormToolBarActivosFijosPorGrupos;
	public JButton jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos;
	protected JButton jButtonMostrarOcultarTablaToolBarActivosFijosPorGrupos;
	protected JButton jButtonCerrarToolBarActivosFijosPorGrupos;
	
	protected JButton jButtonRecargarInformacionToolBarActivosFijosPorGrupos;
	protected JButton jButtonProcesarInformacionToolBarActivosFijosPorGrupos;
	protected JButton jButtonAnterioresToolBarActivosFijosPorGrupos;
	protected JButton jButtonSiguientesToolBarActivosFijosPorGrupos;
	protected JButton jButtonNuevoGuardarCambiosToolBarActivosFijosPorGrupos;
	protected JButton jButtonAbrirOrderByToolBarActivosFijosPorGrupos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActivosFijosPorGrupos;
	protected JMenuItem jMenuItemDuplicarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemNuevoRelacionesActivosFijosPorGrupos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosActivosFijosPorGrupos;
	protected JMenuItem jMenuItemCopiarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemVerFormActivosFijosPorGrupos;
	protected JMenuItem jMenuItemGuardarCambiosTablaActivosFijosPorGrupos;
	protected JMenuItem jMenuItemCerrarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemDetalleCerrarActivosFijosPorGrupos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos;
	protected JMenuItem jMenuItemDetalleMostarOcultarActivosFijosPorGrupos;
	
	protected JMenuItem jMenuItemRecargarInformacionActivosFijosPorGrupos;
	protected JMenuItem jMenuItemProcesarInformacionActivosFijosPorGrupos;
	protected JMenuItem jMenuItemAnterioresActivosFijosPorGrupos;
	protected JMenuItem jMenuItemSiguientesActivosFijosPorGrupos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos;
	protected JMenuItem jMenuItemAbrirOrderByActivosFijosPorGrupos;
	protected JMenuItem jMenuItemMostrarOcultarActivosFijosPorGrupos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActivosFijosPorGrupos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosActivosFijosPorGrupos;
	protected JCheckBox jCheckBoxSeleccionadosActivosFijosPorGrupos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos;
	protected JCheckBox jCheckBoxConGraficoReporteActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesActivosFijosPorGrupos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActivosFijosPorGrupos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarActivosFijosPorGrupos;
	protected JTextField jTextFieldValorCampoGeneralActivosFijosPorGrupos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteActivosFijosPorGrupos;
	//public JList<Reporte> jListColumnasSelectReporteActivosFijosPorGrupos;
	//public JScrollPane jScrollColumnasSelectReporteActivosFijosPorGrupos;
	
	//public JLabel jLabelRelacionesSelectReporteActivosFijosPorGrupos;
	//public JList<Reporte> jListRelacionesSelectReporteActivosFijosPorGrupos;
	//public JScrollPane jScrollRelacionesSelectReporteActivosFijosPorGrupos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoActivosFijosPorGrupos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoActivosFijosPorGrupos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos;
	//public JLabel jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos;
	
		
	//public JLabel jLabelArchivoImportacionActivosFijosPorGrupos;	
	//public JLabel jLabelPathArchivoImportacionActivosFijosPorGrupos;
	//protected JTextField jTextFieldPathArchivoImportacionActivosFijosPorGrupos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoActivosFijosPorGrupos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos;
	
	//public JLabel jLabelColumnaCategoriaValorActivosFijosPorGrupos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorActivosFijosPorGrupos;
	
	//public JLabel jLabelColumnasValoresGraficoActivosFijosPorGrupos;
	//public JList<Reporte> jListColumnasValoresGraficoActivosFijosPorGrupos;
	//public JScrollPane jScrollColumnasValoresGraficoActivosFijosPorGrupos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasActivosFijosPorGrupos;
	public JPanel jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos;
	public JButton jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos;
	
	public JPanel jPanelIdIdBusquedaActivosFijosPorGruposActivosFijosPorGrupos;
	public JLabel jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos;
	public JTextFieldMe jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos;
	public JButton jButtonidBusquedaActivosFijosPorGruposActivosFijosPorGruposBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ActivosFijosPorGruposJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosPorGruposJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionActivosFijosPorGrupos)	{
		this.jButtonRecargarInformacionActivosFijosPorGrupos = jButtonRecargarInformacionActivosFijosPorGrupos;
	}
	
	public JButton getjButtonProcesarInformacionActivosFijosPorGrupos() {
		return this.jButtonProcesarInformacionActivosFijosPorGrupos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActivosFijosPorGrupos)	{
		this.jButtonProcesarInformacionActivosFijosPorGrupos = jButtonProcesarInformacionActivosFijosPorGrupos;
	}
	
	
	public JButton getjButtonRecargarInformacionActivosFijosPorGrupos() {
		return this.jButtonRecargarInformacionActivosFijosPorGrupos;
	}
	
	
	public List<ActivosFijosPorGrupos> getactivosfijosporgruposs() {
		return this.activosfijosporgruposs;
	}

	public void setactivosfijosporgruposs(List<ActivosFijosPorGrupos> activosfijosporgruposs) {
		this.activosfijosporgruposs = activosfijosporgruposs;
	}
	
	public List<ActivosFijosPorGrupos> getactivosfijosporgrupossAux() {
		return this.activosfijosporgrupossAux;
	}

	public void setactivosfijosporgrupossAux(List<ActivosFijosPorGrupos> activosfijosporgrupossAux) {
		this.activosfijosporgrupossAux = activosfijosporgrupossAux;
	}
	
	public List<ActivosFijosPorGrupos> getactivosfijosporgrupossEliminados() {
		return this.activosfijosporgrupossEliminados;
	}

	public void setActivosFijosPorGrupossEliminados(List<ActivosFijosPorGrupos> activosfijosporgrupossEliminados) {
		this.activosfijosporgrupossEliminados = activosfijosporgrupossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarActivosFijosPorGrupos() {
		return jComboBoxTiposSeleccionarActivosFijosPorGrupos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarActivosFijosPorGrupos(
			JComboBox jComboBoxTiposSeleccionarActivosFijosPorGrupos) {
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos = jComboBoxTiposSeleccionarActivosFijosPorGrupos;
	}
	
	public void setBorderResaltarTiposSeleccionarActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralActivosFijosPorGrupos() {
		return jTextFieldValorCampoGeneralActivosFijosPorGrupos;
	}

	public void setjTextFieldValorCampoGeneralActivosFijosPorGrupos(
			JTextField jTextFieldValorCampoGeneralActivosFijosPorGrupos) {
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos = jTextFieldValorCampoGeneralActivosFijosPorGrupos;
	}

	public void setBorderResaltarValorCampoGeneralActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosActivosFijosPorGrupos() {
		return this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos;
	}

	public void setjCheckBoxSeleccionarTodosActivosFijosPorGrupos(
			JCheckBox jCheckBoxSeleccionarTodosActivosFijosPorGrupos) {
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos = jCheckBoxSeleccionarTodosActivosFijosPorGrupos;
	}

	public void setBorderResaltarSeleccionarTodosActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosActivosFijosPorGrupos() {
		return this.jCheckBoxSeleccionadosActivosFijosPorGrupos;
	}

	public void setjCheckBoxSeleccionadosActivosFijosPorGrupos(
			JCheckBox jCheckBoxSeleccionadosActivosFijosPorGrupos) {
		this.jCheckBoxSeleccionadosActivosFijosPorGrupos = jCheckBoxSeleccionadosActivosFijosPorGrupos;
	}
	
	public void setBorderResaltarSeleccionadosActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesActivosFijosPorGrupos() {
		return this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposArchivosReportesActivosFijosPorGrupos) {
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos = jComboBoxTiposArchivosReportesActivosFijosPorGrupos;
	}

	public void setBorderResaltarTiposArchivosReportesActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesActivosFijosPorGrupos() {
		return this.jComboBoxTiposReportesActivosFijosPorGrupos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposReportesActivosFijosPorGrupos) {
		this.jComboBoxTiposReportesActivosFijosPorGrupos = jComboBoxTiposReportesActivosFijosPorGrupos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoActivosFijosPorGrupos() {
	//	return jComboBoxTiposReportesDinamicoActivosFijosPorGrupos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoActivosFijosPorGrupos(
	//		JComboBox jComboBoxTiposReportesDinamicoActivosFijosPorGrupos) {
	//	this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos = jComboBoxTiposReportesDinamicoActivosFijosPorGrupos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos() {
	//	return jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos = jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos;
	//}
	
	public void setBorderResaltarTiposReportesActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesActivosFijosPorGrupos() {
		return this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposGraficosReportesActivosFijosPorGrupos) {
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos = jComboBoxTiposGraficosReportesActivosFijosPorGrupos;
	}
	
	public void setBorderResaltarTiposGraficosReportesActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionActivosFijosPorGrupos() {
		return this.jComboBoxTiposPaginacionActivosFijosPorGrupos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionActivosFijosPorGrupos(
			JComboBox jComboBoxTiposPaginacionActivosFijosPorGrupos) {
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos = jComboBoxTiposPaginacionActivosFijosPorGrupos;
	}
	
	public void setBorderResaltarTiposPaginacionActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesActivosFijosPorGrupos() {
		return this.jComboBoxTiposRelacionesActivosFijosPorGrupos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActivosFijosPorGrupos() {
		return this.jComboBoxTiposAccionesActivosFijosPorGrupos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposRelacionesActivosFijosPorGrupos) {
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos = jComboBoxTiposRelacionesActivosFijosPorGrupos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActivosFijosPorGrupos(
			JComboBox jComboBoxTiposAccionesActivosFijosPorGrupos) {
		this.jComboBoxTiposAccionesActivosFijosPorGrupos = jComboBoxTiposAccionesActivosFijosPorGrupos;
	}
	
	public void setBorderResaltarTiposRelacionesActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesActivosFijosPorGrupos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesActivosFijosPorGrupos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoActivosFijosPorGrupos() {
	//	return jCheckBoxConGraficoDinamicoActivosFijosPorGrupos;
	//}

	//public void setjCheckBoxConGraficoDinamicoActivosFijosPorGrupos(
	//		JCheckBox jCheckBoxConGraficoDinamicoActivosFijosPorGrupos) {
	//	this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos = jCheckBoxConGraficoDinamicoActivosFijosPorGrupos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoActivosFijosPorGrupos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarActivosFijosPorGrupos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos .setBorder(borderResaltar);		
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
		this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
		
		this.activosfijosporgruposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosporgruposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.activosfijosporgruposSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ActivosFijosPorGruposJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ActivosFijosPorGruposJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActivosFijosPorGruposJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActivosFijosPorGruposJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActivosFijosPorGruposJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Activos Fijos Por Grupos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
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
		
		ActivosFijosPorGruposJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ActivosFijosPorGrupos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarActivosFijosPorGrupos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"nuevo","nuevo","Nuevo"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"duplicar","duplicar","Duplicar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"copiar","copiar","Copiar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"ver_form","ver_form","Ver"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"recargar","recargar","Buscar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarActivosFijosPorGrupos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,
							"cerrar","cerrar","Salir"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarActivosFijosPorGrupos;
			
				this.jButtonProcesarInformacionToolBarActivosFijosPorGrupos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarActivosFijosPorGrupos;
				
		//protected JButton jButtonModificarToolBarActivosFijosPorGrupos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarActivosFijosPorGrupos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuActivosFijosPorGrupos=new JMenuMe("General");
		this.jmenuArchivoActivosFijosPorGrupos=new JMenuMe("Archivo");
		this.jmenuAccionesActivosFijosPorGrupos=new JMenuMe("Acciones");
		this.jmenuDatosActivosFijosPorGrupos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActivosFijosPorGrupos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActivosFijosPorGrupos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActivosFijosPorGrupos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarActivosFijosPorGrupos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarActivosFijosPorGrupos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarActivosFijosPorGrupos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesActivosFijosPorGrupos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesActivosFijosPorGrupos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesActivosFijosPorGrupos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosActivosFijosPorGrupos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActivosFijosPorGrupos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActivosFijosPorGrupos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarActivosFijosPorGrupos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarActivosFijosPorGrupos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarActivosFijosPorGrupos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormActivosFijosPorGrupos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormActivosFijosPorGrupos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormActivosFijosPorGrupos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActivosFijosPorGrupos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActivosFijosPorGrupos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActivosFijosPorGrupos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionActivosFijosPorGrupos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionActivosFijosPorGrupos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionActivosFijosPorGrupos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionActivosFijosPorGrupos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionActivosFijosPorGrupos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionActivosFijosPorGrupos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresActivosFijosPorGrupos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresActivosFijosPorGrupos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresActivosFijosPorGrupos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesActivosFijosPorGrupos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesActivosFijosPorGrupos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesActivosFijosPorGrupos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByActivosFijosPorGrupos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByActivosFijosPorGrupos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByActivosFijosPorGrupos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActivosFijosPorGrupos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActivosFijosPorGrupos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActivosFijosPorGrupos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoActivosFijosPorGrupos.add(this.jMenuItemCerrarActivosFijosPorGrupos);
			
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemNuevoActivosFijosPorGrupos);
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos);
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemNuevoRelacionesActivosFijosPorGrupos);
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos);		
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemDuplicarActivosFijosPorGrupos);		
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemCopiarActivosFijosPorGrupos);		
			this.jmenuAccionesActivosFijosPorGrupos.add(this.jMenuItemVerFormActivosFijosPorGrupos);		
			
			this.jmenuDatosActivosFijosPorGrupos.add(this.jMenuItemRecargarInformacionActivosFijosPorGrupos);				
			this.jmenuDatosActivosFijosPorGrupos.add(this.jMenuItemAnterioresActivosFijosPorGrupos);				
			this.jmenuDatosActivosFijosPorGrupos.add(this.jMenuItemSiguientesActivosFijosPorGrupos);				
			this.jmenuDatosActivosFijosPorGrupos.add(this.jMenuItemAbrirOrderByActivosFijosPorGrupos);				
			this.jmenuDatosActivosFijosPorGrupos.add(this.jMenuItemMostrarOcultarActivosFijosPorGrupos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesActivosFijosPorGrupos.add(this.jMenuItemGuardarCambiosActivosFijosPorGrupos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarActivosFijosPorGrupos.add(this.jmenuArchivoActivosFijosPorGrupos);		
			this.jmenuBarActivosFijosPorGrupos.add(this.jmenuAccionesActivosFijosPorGrupos);		
			this.jmenuBarActivosFijosPorGrupos.add(this.jmenuDatosActivosFijosPorGrupos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarActivosFijosPorGrupos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasActivosFijosPorGrupos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos= new JButtonMe();
		this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setText("Buscar");
		this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos = new JLabelMe();
		jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setText("Id :");
		jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos= new JTextFieldMe();
		jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos.setVisible(false);




		this.jTabbedPaneBusquedasActivosFijosPorGrupos=new JTabbedPane();


		this.jTabbedPaneBusquedasActivosFijosPorGrupos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasActivosFijosPorGrupos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasActivosFijosPorGrupos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleActivosFijosPorGrupos = new ActivosFijosPorGruposDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Activos Fijos Por Grupos DATOS");
			this.jInternalFrameDetalleFormActivosFijosPorGrupos = new ActivosFijosPorGruposDetalleFormJInternalFrame(jDesktopPane,this.activosfijosporgruposSessionBean.getConGuardarRelaciones(),this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos = null;//new ActivosFijosPorGruposDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActivosFijosPorGrupos= new GridBagLayout();
		
		
		this.jTableDatosActivosFijosPorGrupos = new JTableMe();      
		
		String sToolTipActivosFijosPorGrupos="";
		sToolTipActivosFijosPorGrupos=ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActivosFijosPorGrupos+="(ActivosFijos.ActivosFijosPorGrupos)";
		}
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			sToolTipActivosFijosPorGrupos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosActivosFijosPorGrupos.setToolTipText(sToolTipActivosFijosPorGrupos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosActivosFijosPorGrupos);
		this.jTableDatosActivosFijosPorGrupos.setAutoCreateRowSorter(true);
		this.jTableDatosActivosFijosPorGrupos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosActivosFijosPorGrupos.setRowSelectionAllowed(true);
		this.jTableDatosActivosFijosPorGrupos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosActivosFijosPorGrupos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoActivosFijosPorGrupos = new JButtonMe();
		this.jButtonDuplicarActivosFijosPorGrupos = new JButtonMe();
		this.jButtonCopiarActivosFijosPorGrupos = new JButtonMe();
		this.jButtonVerFormActivosFijosPorGrupos = new JButtonMe();
		this.jButtonNuevoRelacionesActivosFijosPorGrupos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos = new JButtonMe();
		this.jButtonCerrarActivosFijosPorGrupos = new JButtonMe();
		
		this.jScrollPanelDatosActivosFijosPorGrupos = new JScrollPane();   
        this.jScrollPanelDatosGeneralActivosFijosPorGrupos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Activos Fijos Por Grupos";
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Gruposes" + this.sPath));
		} else {
			this.jScrollPanelDatosActivosFijosPorGrupos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActivosFijosPorGrupos.setToolTipText("Acciones");
        this.jPanelAccionesActivosFijosPorGrupos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoActivosFijosPorGrupos=new ReporteDinamicoJInternalFrame(ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoActivosFijosPorGrupos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionActivosFijosPorGrupos=new ImportacionJInternalFrame(ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionActivosFijosPorGrupos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByActivosFijosPorGrupos = new JButtonMe();
		
		this.jButtonAbrirOrderByActivosFijosPorGrupos.setText("Orden");
		this.jButtonAbrirOrderByActivosFijosPorGrupos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActivosFijosPorGrupos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActivosFijosPorGrupos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorGrupos,false,this);
			
			//this.cargarOrderByActivosFijosPorGrupos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActivosFijosPorGrupos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorGrupos,true,this);
			
			//this.cargarOrderByActivosFijosPorGrupos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosActivosFijosPorGrupos.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosActivosFijosPorGrupos.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosActivosFijosPorGrupos.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosActivosFijosPorGrupos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosActivosFijosPorGrupos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosActivosFijosPorGrupos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoActivosFijosPorGrupos.setText("Nuevo");
		this.jButtonDuplicarActivosFijosPorGrupos.setText("Duplicar");
		this.jButtonCopiarActivosFijosPorGrupos.setText("Copiar");
		this.jButtonVerFormActivosFijosPorGrupos.setText("Ver");
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.setText("Guardar");
		this.jButtonCerrarActivosFijosPorGrupos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActivosFijosPorGrupos,"nuevo_button","Nuevo",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarActivosFijosPorGrupos,"duplicar_button","Duplicar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarActivosFijosPorGrupos,"copiar_button","Copiar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormActivosFijosPorGrupos,"ver_form","Ver",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesActivosFijosPorGrupos,"nuevorelaciones_button","Nuevo Rel",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActivosFijosPorGrupos,"guardarcambiostabla_button","Guardar",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActivosFijosPorGrupos,"cerrar_button","Salir",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoActivosFijosPorGrupos.setToolTipText("Nuevo"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarActivosFijosPorGrupos.setToolTipText("Duplicar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarActivosFijosPorGrupos.setToolTipText("Copiar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormActivosFijosPorGrupos.setToolTipText("Ver"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.setToolTipText("Nuevo Rel"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.setToolTipText("Guardar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActivosFijosPorGrupos.setToolTipText("Salir"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActivosFijosPorGrupos";
		inputMap = this.jButtonNuevoActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActivosFijosPorGrupos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActivosFijosPorGrupos"));
		
		//DUPLICAR
		sMapKey = "DuplicarActivosFijosPorGrupos";
		inputMap = this.jButtonDuplicarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarActivosFijosPorGrupos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarActivosFijosPorGrupos"));
		
		//COPIAR
		sMapKey = "CopiarActivosFijosPorGrupos";
		inputMap = this.jButtonCopiarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarActivosFijosPorGrupos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarActivosFijosPorGrupos"));
		
		//VEr FORM
		sMapKey = "VerFormActivosFijosPorGrupos";
		inputMap = this.jButtonVerFormActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormActivosFijosPorGrupos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormActivosFijosPorGrupos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesActivosFijosPorGrupos";
		inputMap = this.jButtonNuevoRelacionesActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesActivosFijosPorGrupos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarActivosFijosPorGrupos";
		inputMap = this.jButtonModificarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarActivosFijosPorGrupos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarActivosFijosPorGrupos";
		inputMap = this.jButtonCerrarActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActivosFijosPorGrupos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActivosFijosPorGrupos";
		inputMap = this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActivosFijosPorGrupos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ActivosFijosPorGrupos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ActivosFijosPorGrupos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ActivosFijosPorGrupos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ActivosFijosPorGrupos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ActivosFijosPorGrupos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesActivosFijosPorGrupos.setName("jPanelParametrosReportesActivosFijosPorGrupos"); 
		
		this.jPanelParametrosReportesAccionesActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesActivosFijosPorGrupos.setName("jPanelParametrosReportesAccionesActivosFijosPorGrupos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionActivosFijosPorGrupos = new JButtonMe();
		this.jButtonRecargarInformacionActivosFijosPorGrupos.setText("Buscar");
		this.jButtonRecargarInformacionActivosFijosPorGrupos.setToolTipText("Buscar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionActivosFijosPorGrupos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionActivosFijosPorGrupos.setVisible(false);
		
		
		this.jButtonProcesarInformacionActivosFijosPorGrupos = new JButtonMe();
		this.jButtonProcesarInformacionActivosFijosPorGrupos.setText("Procesar");
		this.jButtonProcesarInformacionActivosFijosPorGrupos.setToolTipText("Procesar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionActivosFijosPorGrupos.setVisible(false);
			
		this.jButtonProcesarInformacionActivosFijosPorGrupos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActivosFijosPorGrupos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActivosFijosPorGrupos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setText("TIPO");       
		this.jComboBoxTiposReportesActivosFijosPorGrupos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setText("Paginacion");
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesActivosFijosPorGrupos.setText("Accion");
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActivosFijosPorGrupos.setText("Accion");
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.setText("Accion");
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesActivosFijosPorGrupos = new JLabelMe();
		
		this.jLabelAccionesActivosFijosPorGrupos.setText("Acciones");		
		this.jLabelAccionesActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosActivosFijosPorGrupos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosActivosFijosPorGrupos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosActivosFijosPorGrupos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteActivosFijosPorGrupos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.setText("Graf.");
		this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresActivosFijosPorGrupos = new JButtonMe();
		//this.jButtonAnterioresActivosFijosPorGrupos.setText("<<");
        this.jButtonAnterioresActivosFijosPorGrupos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresActivosFijosPorGrupos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesActivosFijosPorGrupos = new JButtonMe();
		//this.jButtonSiguientesActivosFijosPorGrupos.setText(">>");
        this.jButtonSiguientesActivosFijosPorGrupos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesActivosFijosPorGrupos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.setText("Nue");
        this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos,"nuevoguardarcambios_button","Nue",this.activosfijosporgruposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosActivosFijosPorGrupos";
		inputMap = this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosActivosFijosPorGrupos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionActivosFijosPorGrupos";
		inputMap = this.jButtonRecargarInformacionActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionActivosFijosPorGrupos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesActivosFijosPorGrupos";
		inputMap = this.jButtonSiguientesActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesActivosFijosPorGrupos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresActivosFijosPorGrupos";
		inputMap = this.jButtonAnterioresActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresActivosFijosPorGrupos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasActivosFijosPorGrupos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesActivosFijosPorGrupos.setMinimumSize(new Dimension(this.getWidth(),ActivosFijosPorGruposBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosPorGruposBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActivosFijosPorGrupos.setMaximumSize(new Dimension(this.getWidth(),ActivosFijosPorGruposBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosPorGruposBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActivosFijosPorGrupos.setPreferredSize(new Dimension(this.getWidth(),ActivosFijosPorGruposBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosPorGruposBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionActivosFijosPorGrupos = new GridBagLayout();

			this.jPanelPaginacionActivosFijosPorGrupos.setLayout(gridaBagLayoutPaginacionActivosFijosPorGrupos);						
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonAnterioresActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
					
						
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
			
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
						
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonSiguientesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonNuevoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
						
			
			
			if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
				this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonGuardarCambiosTablaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			}
			
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonDuplicarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonCopiarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonVerFormActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionActivosFijosPorGrupos.add(this.jButtonCerrarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		
		this.jButtonRecargarInformacionActivosFijosPorGrupos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActivosFijosPorGrupos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActivosFijosPorGrupos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesActivosFijosPorGrupos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActivosFijosPorGrupos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActivosFijosPorGrupos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosActivosFijosPorGrupos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActivosFijosPorGrupos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActivosFijosPorGrupos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesActivosFijosPorGrupos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesActivosFijosPorGrupos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ActivosFijosPorGrupos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ActivosFijosPorGrupos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ActivosFijosPorGrupos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ActivosFijosPorGrupos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesActivosFijosPorGrupos.setLayout(gridaBagParametrosReportesActivosFijosPorGrupos);
			this.jPanelParametrosReportesAccionesActivosFijosPorGrupos.setLayout(gridaBagParametrosReportesAccionesActivosFijosPorGrupos);
			
			
			this.jPanelParametrosAuxiliar1ActivosFijosPorGrupos.setLayout(gridaBagParametrosAuxiliar1ActivosFijosPorGrupos);
			this.jPanelParametrosAuxiliar2ActivosFijosPorGrupos.setLayout(gridaBagParametrosAuxiliar2ActivosFijosPorGrupos);
			this.jPanelParametrosAuxiliar3ActivosFijosPorGrupos.setLayout(gridaBagParametrosAuxiliar3ActivosFijosPorGrupos);
			this.jPanelParametrosAuxiliar4ActivosFijosPorGrupos.setLayout(gridaBagParametrosAuxiliar4ActivosFijosPorGrupos);
			//this.jPanelParametrosAuxiliar5ActivosFijosPorGrupos.setLayout(gridaBagParametrosAuxiliar2ActivosFijosPorGrupos);			
			
			
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jButtonRecargarInformacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijosPorGrupos.add(this.jComboBoxTiposPaginacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijosPorGrupos.add(this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijosPorGrupos.add(this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jPanelParametrosAuxiliar1ActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ActivosFijosPorGrupos.add(this.jComboBoxTiposReportesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);																		
			
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ActivosFijosPorGrupos.add(this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jPanelParametrosAuxiliar4ActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jComboBoxTiposReportesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jCheckBoxGenerarReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jPanelParametrosAuxiliar2ActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jLabelAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jButtonAbrirOrderByActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jComboBoxTiposSeleccionarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
			
			
			/*
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jCheckBoxConGraficoReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijosPorGrupos.add(this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);															
				
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijosPorGrupos.add(this.jCheckBoxSeleccionadosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);															
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijosPorGrupos.add(this.jCheckBoxConGraficoReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jPanelParametrosAuxiliar3ActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijosPorGrupos.add(this.jComboBoxTiposAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosActivosFijosPorGrupos = new GridBagLayout();

			this.jScrollPanelDatosActivosFijosPorGrupos.setLayout(gridaBagLayoutDatosActivosFijosPorGrupos);
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
			
			this.jScrollPanelDatosActivosFijosPorGrupos.add(this.jTableDatosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosActivosFijosPorGrupos.setViewportView(this.jTableDatosActivosFijosPorGrupos);
		this.jTableDatosActivosFijosPorGrupos.setFillsViewportHeight(true);
		this.jTableDatosActivosFijosPorGrupos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesActivosFijosPorGrupos= new GridBagLayout();
		this.jPanelAccionesActivosFijosPorGrupos.setLayout(gridaBagLayoutAccionesActivosFijosPorGrupos);
		
		
		/*	
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
			
		this.jPanelAccionesActivosFijosPorGrupos.add(this.jButtonNuevoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaActivosFijosPorGruposActivosFijosPorGrupos= new GridBagLayout();
		gridaBagLayoutBusquedaActivosFijosPorGruposActivosFijosPorGrupos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaActivosFijosPorGruposActivosFijosPorGrupos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaActivosFijosPorGruposActivosFijosPorGrupos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaActivosFijosPorGruposActivosFijosPorGrupos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos.setLayout(gridaBagLayoutBusquedaActivosFijosPorGruposActivosFijosPorGrupos);

		gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
		jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos.add(jLabelidBusquedaActivosFijosPorGruposActivosFijosPorGrupos, gridBagConstraintsActivosFijosPorGrupos);

		gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActivosFijosPorGrupos.gridy = 0;
		gridBagConstraintsActivosFijosPorGrupos.gridx = 1;
		jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos.add(jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos, gridBagConstraintsActivosFijosPorGrupos);

		gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActivosFijosPorGrupos.gridy = 1;
		gridBagConstraintsActivosFijosPorGrupos.gridx =1;
		jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos.add(jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos, gridBagConstraintsActivosFijosPorGrupos);

		jTabbedPaneBusquedasActivosFijosPorGrupos.addTab("1.-Por  ", jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
		jTabbedPaneBusquedasActivosFijosPorGrupos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActivosFijosPorGrupos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActivosFijosPorGrupos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();						
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;		
			//this.gridBagConstraintsActivosFijosPorGrupos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;		
		//this.gridBagConstraintsActivosFijosPorGrupos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsActivosFijosPorGrupos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;		
			this.gridBagConstraintsActivosFijosPorGrupos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsActivosFijosPorGrupos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);								
		
		
		/*
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		*/		
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =0;
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActivosFijosPorGrupos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
				
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosActivosFijosPorGrupos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActivosFijosPorGrupos = new GridBagLayout();
			this.jPanelBusquedasParametrosActivosFijosPorGrupos.setLayout(gridaBagLayoutBusquedasParametrosActivosFijosPorGrupos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
			
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralActivosFijosPorGrupos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoActivosFijosPorGrupos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoActivosFijosPorGrupos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoActivosFijosPorGrupos.setName("jPanelReporteDinamicoActivosFijosPorGrupos"); 
		
		this.jPanelReporteDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoActivosFijosPorGrupos.setLayout(gridaBagLayoutReporteDinamicoActivosFijosPorGrupos);
		
		
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoActivosFijosPorGrupos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActivosFijosPorGrupos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setResizable(true);
	    this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setClosable(true);
	    this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Gruposes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteActivosFijosPorGrupos = new JLabelMe();

		this.jLabelColumnasSelectReporteActivosFijosPorGrupos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelColumnasSelectReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteActivosFijosPorGrupos = new JList<Reporte>();
		this.jListColumnasSelectReporteActivosFijosPorGrupos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteActivosFijosPorGrupos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteActivosFijosPorGrupos=new JScrollPane(this.jListColumnasSelectReporteActivosFijosPorGrupos);
			
			this.jScrollColumnasSelectReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jListColumnasSelectReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jScrollColumnasSelectReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteActivosFijosPorGrupos = new JLabelMe();

		this.jLabelRelacionesSelectReporteActivosFijosPorGrupos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteActivosFijosPorGrupos = new JList<Reporte>();
		this.jListRelacionesSelectReporteActivosFijosPorGrupos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteActivosFijosPorGrupos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteActivosFijosPorGrupos=new JScrollPane(this.jListRelacionesSelectReporteActivosFijosPorGrupos);
			
			this.jScrollRelacionesSelectReporteActivosFijosPorGrupos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActivosFijosPorGrupos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActivosFijosPorGrupos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos = new JComboBoxMe();
		this.jListColumnasValoresGraficoActivosFijosPorGrupos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoActivosFijosPorGrupos = new JLabelMe();

		this.jLabelConGraficoDinamicoActivosFijosPorGrupos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelConGraficoDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jCheckBoxConGraficoDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoActivosFijosPorGrupos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoActivosFijosPorGrupos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelColumnaCategoriaGraficoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorActivosFijosPorGrupos = new JLabelMe();

		this.jLabelColumnaCategoriaValorActivosFijosPorGrupos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelColumnaCategoriaValorActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jComboBoxColumnaCategoriaValorActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoActivosFijosPorGrupos = new JLabelMe();

		this.jLabelColumnasValoresGraficoActivosFijosPorGrupos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelColumnasValoresGraficoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoActivosFijosPorGrupos = new JList<Reporte>();
		this.jListColumnasValoresGraficoActivosFijosPorGrupos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoActivosFijosPorGrupos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoActivosFijosPorGrupos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoActivosFijosPorGrupos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoActivosFijosPorGrupos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoActivosFijosPorGrupos=new JScrollPane(this.jListColumnasValoresGraficoActivosFijosPorGrupos);
			
			this.jScrollColumnasValoresGraficoActivosFijosPorGrupos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoActivosFijosPorGrupos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoActivosFijosPorGrupos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jListColumnasSelectReporteActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jScrollColumnasValoresGraficoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelTiposGraficosReportesDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoActivosFijosPorGrupos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jComboBoxTiposGraficosReportesDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelGenerarExcelReporteDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos.setToolTipText("Generar EXCEL"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jComboBoxTiposReportesDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jLabelTiposArchivoReporteDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jComboBoxTiposArchivosReportesDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos.setToolTipText("Generar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos.setToolTipText("Cancelar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijosPorGrupos.add(this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalActivosFijosPorGrupos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoActivosFijosPorGrupos= new JScrollPane(jPanelReporteDinamicoActivosFijosPorGrupos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Gruposes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalActivosFijosPorGrupos);
		this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getContentPane().add(this.jScrollPanelReporteDinamicoActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionActivosFijosPorGrupos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionActivosFijosPorGrupos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionActivosFijosPorGrupos.setName("jPanelImportacionActivosFijosPorGrupos"); 
		
		this.jPanelImportacionActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionActivosFijosPorGrupos.setLayout(gridaBagLayoutImportacionActivosFijosPorGrupos);
		
		
		this.jInternalFrameImportacionActivosFijosPorGrupos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionActivosFijosPorGrupos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionActivosFijosPorGrupos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActivosFijosPorGrupos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionActivosFijosPorGrupos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActivosFijosPorGrupos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActivosFijosPorGrupos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setResizable(true);
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setClosable(true);
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionActivosFijosPorGrupos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActivosFijosPorGrupos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActivosFijosPorGrupos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setResizable(true);
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setClosable(true);
	    this.jInternalFrameImportacionActivosFijosPorGrupos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Gruposes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionActivosFijosPorGrupos = new JLabelMe();

		this.jLabelArchivoImportacionActivosFijosPorGrupos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYImportacion;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActivosFijosPorGrupos.add(this.jLabelArchivoImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionActivosFijosPorGrupos = new JFileChooser();		
		this.jFileChooserImportacionActivosFijosPorGrupos.setToolTipText("ESCOGER ARCHIVO"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionActivosFijosPorGrupos = new JButtonMe();
		this.jButtonAbrirImportacionActivosFijosPorGrupos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionActivosFijosPorGrupos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionActivosFijosPorGrupos.setToolTipText("Generar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorGrupos.add(this.jButtonAbrirImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionActivosFijosPorGrupos = new JLabelMe();

		this.jLabelPathArchivoImportacionActivosFijosPorGrupos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionActivosFijosPorGrupos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActivosFijosPorGrupos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActivosFijosPorGrupos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYImportacion;		
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActivosFijosPorGrupos.add(this.jLabelPathArchivoImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionActivosFijosPorGrupos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionActivosFijosPorGrupos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActivosFijosPorGrupos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActivosFijosPorGrupos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorGrupos.add(this.jTextFieldPathArchivoImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionActivosFijosPorGrupos = new JButtonMe();
		this.jButtonGenerarImportacionActivosFijosPorGrupos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionActivosFijosPorGrupos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionActivosFijosPorGrupos.setToolTipText("Generar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorGrupos.add(this.jButtonGenerarImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionActivosFijosPorGrupos = new JButtonMe();
		this.jButtonCerrarImportacionActivosFijosPorGrupos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionActivosFijosPorGrupos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionActivosFijosPorGrupos.setToolTipText("Cancelar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijosPorGrupos.add(this.jButtonCerrarImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalActivosFijosPorGrupos = new GridBagLayout();
		
		this.jScrollPanelImportacionActivosFijosPorGrupos= new JScrollPane(jPanelImportacionActivosFijosPorGrupos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijosPorGrupos.gridy =iPosYImportacion;
		this.gridBagConstraintsActivosFijosPorGrupos.gridx =iPosXImportacion;
		this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionActivosFijosPorGrupos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionActivosFijosPorGrupos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalActivosFijosPorGrupos);
		this.jInternalFrameImportacionActivosFijosPorGrupos.getContentPane().add(this.jScrollPanelImportacionActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByActivosFijosPorGrupos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByActivosFijosPorGrupos = new JButtonMe();
			this.jButtonAbrirOrderByActivosFijosPorGrupos.setText("Orden");
			this.jButtonAbrirOrderByActivosFijosPorGrupos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActivosFijosPorGrupos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByActivosFijosPorGrupos";
			inputMap = this.jButtonAbrirOrderByActivosFijosPorGrupos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByActivosFijosPorGrupos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByActivosFijosPorGrupos"));
		
		
			GridBagLayout gridaBagLayoutOrderByActivosFijosPorGrupos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByActivosFijosPorGrupos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByActivosFijosPorGrupos.setName("jPanelOrderByActivosFijosPorGrupos"); 
			
			this.jPanelOrderByActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByActivosFijosPorGrupos.setLayout(gridaBagLayoutOrderByActivosFijosPorGrupos);
			
			
			this.jTableDatosActivosFijosPorGruposOrderBy = new JTableMe();        
			this.jTableDatosActivosFijosPorGruposOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosActivosFijosPorGruposOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosActivosFijosPorGruposOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosActivosFijosPorGruposOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosActivosFijosPorGruposOrderBy.setViewportView(this.jTableDatosActivosFijosPorGruposOrderBy);
			this.jTableDatosActivosFijosPorGruposOrderBy.setFillsViewportHeight(true);
			this.jTableDatosActivosFijosPorGruposOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByActivosFijosPorGrupos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByActivosFijosPorGrupos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByActivosFijosPorGrupos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteActivosFijosPorGrupos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByActivosFijosPorGrupos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByActivosFijosPorGrupos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByActivosFijosPorGrupos.setTitle("Orden");
			this.jInternalFrameOrderByActivosFijosPorGrupos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByActivosFijosPorGrupos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByActivosFijosPorGrupos.setResizable(true);
			this.jInternalFrameOrderByActivosFijosPorGrupos.setClosable(true);
			this.jInternalFrameOrderByActivosFijosPorGrupos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByActivosFijosPorGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijos Por Gruposes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iPosXOrderBy;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsActivosFijosPorGrupos.ipady =150;
				
			this.jPanelOrderByActivosFijosPorGrupos.add(jScrollPanelDatosActivosFijosPorGruposOrderBy, this.gridBagConstraintsActivosFijosPorGrupos);//this.jTableDatosActivosFijosPorGruposTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByActivosFijosPorGrupos = new JButtonMe();
			this.jButtonCerrarOrderByActivosFijosPorGrupos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByActivosFijosPorGrupos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByActivosFijosPorGrupos.setToolTipText("Cancelar"+" "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByActivosFijosPorGrupos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijosPorGrupos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByActivosFijosPorGrupos.add(this.jButtonCerrarOrderByActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalActivosFijosPorGrupos = new GridBagLayout();
			
			this.jScrollPanelOrderByActivosFijosPorGrupos= new JScrollPane(jPanelOrderByActivosFijosPorGrupos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsActivosFijosPorGrupos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijosPorGrupos.gridy =iPosYOrderBy;
			this.gridBagConstraintsActivosFijosPorGrupos.gridx =iPosXOrderBy;
			this.gridBagConstraintsActivosFijosPorGrupos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByActivosFijosPorGrupos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByActivosFijosPorGrupos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalActivosFijosPorGrupos);
			
			this.jInternalFrameOrderByActivosFijosPorGrupos.getContentPane().add(this.jScrollPanelOrderByActivosFijosPorGrupos, this.gridBagConstraintsActivosFijosPorGrupos);			
		
		} else {
			this.jButtonAbrirOrderByActivosFijosPorGrupos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.activosfijosporgruposSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosActivosFijosPorGrupos.getRowHeight();//ActivosFijosPorGruposConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.isSelected()) {
					iHeightTable=ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActivosFijosPorGrupos.isSelected()) {
					iHeightTable=ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActivosFijosPorGruposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByActivosFijosPorGrupos!=null && this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy()!=null) {
			//if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByActivosFijosPorGrupos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByActivosFijosPorGrupos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByActivosFijosPorGrupos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosActivosFijosPorGrupos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActivosFijosPorGrupos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActivosFijosPorGrupos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=activosfijosporgruposLogic.getActivosFijosPorGruposs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijosporgruposs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ActivosFijosPorGrupos> TraerActivosFijosPorGruposBeans(List<ActivosFijosPorGrupos> activosfijosporgruposs,ArrayList<Classe> classes)throws Exception {
		try {
			for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgruposs) {
					
				if(!(ActivosFijosPorGruposConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ActivosFijosPorGruposConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					activosfijosporgrupos.setsDetalleGeneralEntityReporte(ActivosFijosPorGruposConstantesFunciones.getActivosFijosPorGruposDescripcion(activosfijosporgrupos));
										
						
					
						
					
				} else  {
							
					//activosfijosporgrupos.setsDetalleGeneralEntityReporte(activosfijosporgrupos.getsDetalleGeneralEntityReporte());
										
				}
				
				//activosfijosporgruposbeans.add(activosfijosporgruposbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return activosfijosporgruposs;
    }
	//PARA REPORTES FIN
}
