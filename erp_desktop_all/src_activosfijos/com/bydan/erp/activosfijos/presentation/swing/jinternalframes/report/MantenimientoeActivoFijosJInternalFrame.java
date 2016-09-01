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
import com.bydan.erp.activosfijos.util.report.MantenimientoeActivoFijosConstantesFunciones;

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
public class MantenimientoeActivoFijosJInternalFrame extends MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMantenimientoeActivoFijos;
	
	protected JMenuBar jmenuBarMantenimientoeActivoFijos;
	
	protected JMenu jmenuMantenimientoeActivoFijos;
	protected JMenu jmenuDatosMantenimientoeActivoFijos;
	protected JMenu jmenuArchivoMantenimientoeActivoFijos;
	protected JMenu jmenuAccionesMantenimientoeActivoFijos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMantenimientoeActivoFijos;	
	protected GridBagConstraints gridBagConstraintsMantenimientoeActivoFijos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MantenimientoeActivoFijosDetalleFormJInternalFrame jInternalFrameDetalleFormMantenimientoeActivoFijos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMantenimientoeActivoFijos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMantenimientoeActivoFijos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public MantenimientoeActivoFijosSessionBean mantenimientoeactivofijosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MantenimientoeActivoFijos> mantenimientoeactivofijoss;		
	public List<MantenimientoeActivoFijos> mantenimientoeactivofijossEliminados;	
	public List<MantenimientoeActivoFijos> mantenimientoeactivofijossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMantenimientoeActivoFijos;		
	protected JButton jButtonAbrirOrderByMantenimientoeActivoFijos;
	
	
	//protected JPanel jPanelOrderByMantenimientoeActivoFijos;
	//public JScrollPane jScrollPanelOrderByMantenimientoeActivoFijos;	
	//protected JButton jButtonCerrarOrderByMantenimientoeActivoFijos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MantenimientoeActivoFijosLogic mantenimientoeactivofijosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMantenimientoeActivoFijos;
	public JScrollPane jScrollPanelDatosEdicionMantenimientoeActivoFijos;
	public JScrollPane jScrollPanelDatosGeneralMantenimientoeActivoFijos;
    
	
	
	//public JScrollPane jScrollPanelDatosMantenimientoeActivoFijosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMantenimientoeActivoFijos;
	//public JScrollPane jScrollPanelImportacionMantenimientoeActivoFijos;
	
	
	
	protected JPanel jPanelAccionesMantenimientoeActivoFijos;
	
    protected JPanel jPanelPaginacionMantenimientoeActivoFijos;
    protected JPanel jPanelParametrosReportesMantenimientoeActivoFijos;
	protected JPanel jPanelParametrosReportesAccionesMantenimientoeActivoFijos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MantenimientoeActivoFijos;
	protected JPanel jPanelParametrosAuxiliar2MantenimientoeActivoFijos;
	protected JPanel jPanelParametrosAuxiliar3MantenimientoeActivoFijos;
	protected JPanel jPanelParametrosAuxiliar4MantenimientoeActivoFijos;
	//protected JPanel jPanelParametrosAuxiliar5MantenimientoeActivoFijos;
	
	
	
	//protected JPanel jPanelReporteDinamicoMantenimientoeActivoFijos;
	//protected JPanel jPanelImportacionMantenimientoeActivoFijos;
	
	
	public JTable jTableDatosMantenimientoeActivoFijos;
	
	
	
	//public JTable jTableDatosMantenimientoeActivoFijosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMantenimientoeActivoFijos;
	protected JButton jButtonDuplicarMantenimientoeActivoFijos;
	protected JButton jButtonCopiarMantenimientoeActivoFijos;
	protected JButton jButtonVerFormMantenimientoeActivoFijos;
	protected JButton jButtonNuevoRelacionesMantenimientoeActivoFijos;
	protected JButton jButtonModificarMantenimientoeActivoFijos;
	
    protected JButton jButtonGuardarCambiosTablaMantenimientoeActivoFijos;
	protected JButton jButtonCerrarMantenimientoeActivoFijos;
	
	
	protected JButton jButtonRecargarInformacionMantenimientoeActivoFijos;
	protected JButton jButtonProcesarInformacionMantenimientoeActivoFijos;
	
	
	protected JButton jButtonAnterioresMantenimientoeActivoFijos;
	protected JButton jButtonSiguientesMantenimientoeActivoFijos;
	protected JButton jButtonNuevoGuardarCambiosMantenimientoeActivoFijos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMantenimientoeActivoFijos;
	//protected JButton jButtonCerrarReporteDinamicoMantenimientoeActivoFijos;
	//protected JButton jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos;	
	
	
	
	//protected JButton jButtonAbrirImportacionMantenimientoeActivoFijos;
	//protected JButton jButtonGenerarImportacionMantenimientoeActivoFijos;
	//protected JButton jButtonCerrarImportacionMantenimientoeActivoFijos;
	//protected JFileChooser jFileChooserImportacionMantenimientoeActivoFijos;
	//protected File fileImportacionMantenimientoeActivoFijos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMantenimientoeActivoFijos;
	protected JButton jButtonDuplicarToolBarMantenimientoeActivoFijos;
	protected JButton jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos;
	
	
	public JButton jButtonGuardarCambiosToolBarMantenimientoeActivoFijos;
	protected JButton jButtonCopiarToolBarMantenimientoeActivoFijos;
	protected JButton jButtonVerFormToolBarMantenimientoeActivoFijos;
	public JButton jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarMantenimientoeActivoFijos;
	protected JButton jButtonCerrarToolBarMantenimientoeActivoFijos;
	
	protected JButton jButtonRecargarInformacionToolBarMantenimientoeActivoFijos;
	protected JButton jButtonProcesarInformacionToolBarMantenimientoeActivoFijos;
	protected JButton jButtonAnterioresToolBarMantenimientoeActivoFijos;
	protected JButton jButtonSiguientesToolBarMantenimientoeActivoFijos;
	protected JButton jButtonNuevoGuardarCambiosToolBarMantenimientoeActivoFijos;
	protected JButton jButtonAbrirOrderByToolBarMantenimientoeActivoFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemDuplicarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemNuevoRelacionesMantenimientoeActivoFijos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemCopiarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemVerFormMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemCerrarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemDetalleCerrarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos;
	
	protected JMenuItem jMenuItemRecargarInformacionMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemProcesarInformacionMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemAnterioresMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemSiguientesMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemAbrirOrderByMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemMostrarOcultarMantenimientoeActivoFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMantenimientoeActivoFijos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMantenimientoeActivoFijos;
	protected JCheckBox jCheckBoxSeleccionadosMantenimientoeActivoFijos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos;
	protected JCheckBox jCheckBoxConGraficoReporteMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMantenimientoeActivoFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMantenimientoeActivoFijos;
	protected JTextField jTextFieldValorCampoGeneralMantenimientoeActivoFijos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMantenimientoeActivoFijos;
	//public JList<Reporte> jListColumnasSelectReporteMantenimientoeActivoFijos;
	//public JScrollPane jScrollColumnasSelectReporteMantenimientoeActivoFijos;
	
	//public JLabel jLabelRelacionesSelectReporteMantenimientoeActivoFijos;
	//public JList<Reporte> jListRelacionesSelectReporteMantenimientoeActivoFijos;
	//public JScrollPane jScrollRelacionesSelectReporteMantenimientoeActivoFijos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMantenimientoeActivoFijos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos;
	//public JLabel jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos;
	
		
	//public JLabel jLabelArchivoImportacionMantenimientoeActivoFijos;	
	//public JLabel jLabelPathArchivoImportacionMantenimientoeActivoFijos;
	//protected JTextField jTextFieldPathArchivoImportacionMantenimientoeActivoFijos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos;
	
	//public JLabel jLabelColumnaCategoriaValorMantenimientoeActivoFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos;
	
	//public JLabel jLabelColumnasValoresGraficoMantenimientoeActivoFijos;
	//public JList<Reporte> jListColumnasValoresGraficoMantenimientoeActivoFijos;
	//public JScrollPane jScrollColumnasValoresGraficoMantenimientoeActivoFijos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMantenimientoeActivoFijos;
	public JPanel jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos;
	public JButton jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos;
	
	public JPanel jPanelIdIdBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos;
	public JLabel jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos;
	public JTextFieldMe jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos;
	public JButton jButtonidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MantenimientoeActivoFijosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMantenimientoeActivoFijos)	{
		this.jButtonRecargarInformacionMantenimientoeActivoFijos = jButtonRecargarInformacionMantenimientoeActivoFijos;
	}
	
	public JButton getjButtonProcesarInformacionMantenimientoeActivoFijos() {
		return this.jButtonProcesarInformacionMantenimientoeActivoFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMantenimientoeActivoFijos)	{
		this.jButtonProcesarInformacionMantenimientoeActivoFijos = jButtonProcesarInformacionMantenimientoeActivoFijos;
	}
	
	
	public JButton getjButtonRecargarInformacionMantenimientoeActivoFijos() {
		return this.jButtonRecargarInformacionMantenimientoeActivoFijos;
	}
	
	
	public List<MantenimientoeActivoFijos> getmantenimientoeactivofijoss() {
		return this.mantenimientoeactivofijoss;
	}

	public void setmantenimientoeactivofijoss(List<MantenimientoeActivoFijos> mantenimientoeactivofijoss) {
		this.mantenimientoeactivofijoss = mantenimientoeactivofijoss;
	}
	
	public List<MantenimientoeActivoFijos> getmantenimientoeactivofijossAux() {
		return this.mantenimientoeactivofijossAux;
	}

	public void setmantenimientoeactivofijossAux(List<MantenimientoeActivoFijos> mantenimientoeactivofijossAux) {
		this.mantenimientoeactivofijossAux = mantenimientoeactivofijossAux;
	}
	
	public List<MantenimientoeActivoFijos> getmantenimientoeactivofijossEliminados() {
		return this.mantenimientoeactivofijossEliminados;
	}

	public void setMantenimientoeActivoFijossEliminados(List<MantenimientoeActivoFijos> mantenimientoeactivofijossEliminados) {
		this.mantenimientoeactivofijossEliminados = mantenimientoeactivofijossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMantenimientoeActivoFijos() {
		return jComboBoxTiposSeleccionarMantenimientoeActivoFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposSeleccionarMantenimientoeActivoFijos) {
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos = jComboBoxTiposSeleccionarMantenimientoeActivoFijos;
	}
	
	public void setBorderResaltarTiposSeleccionarMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMantenimientoeActivoFijos() {
		return jTextFieldValorCampoGeneralMantenimientoeActivoFijos;
	}

	public void setjTextFieldValorCampoGeneralMantenimientoeActivoFijos(
			JTextField jTextFieldValorCampoGeneralMantenimientoeActivoFijos) {
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos = jTextFieldValorCampoGeneralMantenimientoeActivoFijos;
	}

	public void setBorderResaltarValorCampoGeneralMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMantenimientoeActivoFijos() {
		return this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos;
	}

	public void setjCheckBoxSeleccionarTodosMantenimientoeActivoFijos(
			JCheckBox jCheckBoxSeleccionarTodosMantenimientoeActivoFijos) {
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos = jCheckBoxSeleccionarTodosMantenimientoeActivoFijos;
	}

	public void setBorderResaltarSeleccionarTodosMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMantenimientoeActivoFijos() {
		return this.jCheckBoxSeleccionadosMantenimientoeActivoFijos;
	}

	public void setjCheckBoxSeleccionadosMantenimientoeActivoFijos(
			JCheckBox jCheckBoxSeleccionadosMantenimientoeActivoFijos) {
		this.jCheckBoxSeleccionadosMantenimientoeActivoFijos = jCheckBoxSeleccionadosMantenimientoeActivoFijos;
	}
	
	public void setBorderResaltarSeleccionadosMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMantenimientoeActivoFijos() {
		return this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposArchivosReportesMantenimientoeActivoFijos) {
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos = jComboBoxTiposArchivosReportesMantenimientoeActivoFijos;
	}

	public void setBorderResaltarTiposArchivosReportesMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMantenimientoeActivoFijos() {
		return this.jComboBoxTiposReportesMantenimientoeActivoFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposReportesMantenimientoeActivoFijos) {
		this.jComboBoxTiposReportesMantenimientoeActivoFijos = jComboBoxTiposReportesMantenimientoeActivoFijos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMantenimientoeActivoFijos() {
	//	return jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMantenimientoeActivoFijos(
	//		JComboBox jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos) {
	//	this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos = jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos() {
	//	return jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos = jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos;
	//}
	
	public void setBorderResaltarTiposReportesMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMantenimientoeActivoFijos() {
		return this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposGraficosReportesMantenimientoeActivoFijos) {
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos = jComboBoxTiposGraficosReportesMantenimientoeActivoFijos;
	}
	
	public void setBorderResaltarTiposGraficosReportesMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMantenimientoeActivoFijos() {
		return this.jComboBoxTiposPaginacionMantenimientoeActivoFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposPaginacionMantenimientoeActivoFijos) {
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos = jComboBoxTiposPaginacionMantenimientoeActivoFijos;
	}
	
	public void setBorderResaltarTiposPaginacionMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMantenimientoeActivoFijos() {
		return this.jComboBoxTiposRelacionesMantenimientoeActivoFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMantenimientoeActivoFijos() {
		return this.jComboBoxTiposAccionesMantenimientoeActivoFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposRelacionesMantenimientoeActivoFijos) {
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos = jComboBoxTiposRelacionesMantenimientoeActivoFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposAccionesMantenimientoeActivoFijos) {
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos = jComboBoxTiposAccionesMantenimientoeActivoFijos;
	}
	
	public void setBorderResaltarTiposRelacionesMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMantenimientoeActivoFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMantenimientoeActivoFijos() {
	//	return jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos;
	//}

	//public void setjCheckBoxConGraficoDinamicoMantenimientoeActivoFijos(
	//		JCheckBox jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos) {
	//	this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos = jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMantenimientoeActivoFijos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMantenimientoeActivoFijos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos .setBorder(borderResaltar);		
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
		this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean();
		
		this.mantenimientoeactivofijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mantenimientoeactivofijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MantenimientoeActivoFijosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MantenimientoeActivoFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MantenimientoeActivoFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MantenimientoeActivoFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MantenimientoeActivoFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mantenimientoe Activo Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
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
		
		MantenimientoeActivoFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMantenimientoeActivoFijos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"nuevo","nuevo","Nuevo"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"duplicar","duplicar","Duplicar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"copiar","copiar","Copiar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"ver_form","ver_form","Ver"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"recargar","recargar","Buscar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,
							"cerrar","cerrar","Salir"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos;
			
				this.jButtonProcesarInformacionToolBarMantenimientoeActivoFijos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMantenimientoeActivoFijos;
				
		//protected JButton jButtonModificarToolBarMantenimientoeActivoFijos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMantenimientoeActivoFijos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMantenimientoeActivoFijos=new JMenuMe("General");
		this.jmenuArchivoMantenimientoeActivoFijos=new JMenuMe("Archivo");
		this.jmenuAccionesMantenimientoeActivoFijos=new JMenuMe("Acciones");
		this.jmenuDatosMantenimientoeActivoFijos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMantenimientoeActivoFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMantenimientoeActivoFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMantenimientoeActivoFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMantenimientoeActivoFijos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMantenimientoeActivoFijos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMantenimientoeActivoFijos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMantenimientoeActivoFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMantenimientoeActivoFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMantenimientoeActivoFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMantenimientoeActivoFijos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMantenimientoeActivoFijos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMantenimientoeActivoFijos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMantenimientoeActivoFijos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMantenimientoeActivoFijos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMantenimientoeActivoFijos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMantenimientoeActivoFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMantenimientoeActivoFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMantenimientoeActivoFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMantenimientoeActivoFijos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMantenimientoeActivoFijos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMantenimientoeActivoFijos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMantenimientoeActivoFijos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMantenimientoeActivoFijos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMantenimientoeActivoFijos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMantenimientoeActivoFijos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMantenimientoeActivoFijos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMantenimientoeActivoFijos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMantenimientoeActivoFijos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMantenimientoeActivoFijos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMantenimientoeActivoFijos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMantenimientoeActivoFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMantenimientoeActivoFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMantenimientoeActivoFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMantenimientoeActivoFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMantenimientoeActivoFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMantenimientoeActivoFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMantenimientoeActivoFijos.add(this.jMenuItemCerrarMantenimientoeActivoFijos);
			
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemNuevoMantenimientoeActivoFijos);
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos);
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos);
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos);		
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemDuplicarMantenimientoeActivoFijos);		
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemCopiarMantenimientoeActivoFijos);		
			this.jmenuAccionesMantenimientoeActivoFijos.add(this.jMenuItemVerFormMantenimientoeActivoFijos);		
			
			this.jmenuDatosMantenimientoeActivoFijos.add(this.jMenuItemRecargarInformacionMantenimientoeActivoFijos);				
			this.jmenuDatosMantenimientoeActivoFijos.add(this.jMenuItemAnterioresMantenimientoeActivoFijos);				
			this.jmenuDatosMantenimientoeActivoFijos.add(this.jMenuItemSiguientesMantenimientoeActivoFijos);				
			this.jmenuDatosMantenimientoeActivoFijos.add(this.jMenuItemAbrirOrderByMantenimientoeActivoFijos);				
			this.jmenuDatosMantenimientoeActivoFijos.add(this.jMenuItemMostrarOcultarMantenimientoeActivoFijos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMantenimientoeActivoFijos.add(this.jMenuItemGuardarCambiosMantenimientoeActivoFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMantenimientoeActivoFijos.add(this.jmenuArchivoMantenimientoeActivoFijos);		
			this.jmenuBarMantenimientoeActivoFijos.add(this.jmenuAccionesMantenimientoeActivoFijos);		
			this.jmenuBarMantenimientoeActivoFijos.add(this.jmenuDatosMantenimientoeActivoFijos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMantenimientoeActivoFijos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMantenimientoeActivoFijos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos= new JButtonMe();
		this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setText("Buscar");
		this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos = new JLabelMe();
		jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setText("Id :");
		jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos= new JTextFieldMe();
		jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos.setVisible(false);




		this.jTabbedPaneBusquedasMantenimientoeActivoFijos=new JTabbedPane();


		this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMantenimientoeActivoFijos = new MantenimientoeActivoFijosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mantenimientoe Activo Fijos DATOS");
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos = new MantenimientoeActivoFijosDetalleFormJInternalFrame(jDesktopPane,this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones(),this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos = null;//new MantenimientoeActivoFijosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMantenimientoeActivoFijos= new GridBagLayout();
		
		
		this.jTableDatosMantenimientoeActivoFijos = new JTableMe();      
		
		String sToolTipMantenimientoeActivoFijos="";
		sToolTipMantenimientoeActivoFijos=MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMantenimientoeActivoFijos+="(ActivosFijos.MantenimientoeActivoFijos)";
		}
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipMantenimientoeActivoFijos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMantenimientoeActivoFijos.setToolTipText(sToolTipMantenimientoeActivoFijos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMantenimientoeActivoFijos);
		this.jTableDatosMantenimientoeActivoFijos.setAutoCreateRowSorter(true);
		this.jTableDatosMantenimientoeActivoFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMantenimientoeActivoFijos.setRowSelectionAllowed(true);
		this.jTableDatosMantenimientoeActivoFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonDuplicarMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonCopiarMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonVerFormMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonCerrarMantenimientoeActivoFijos = new JButtonMe();
		
		this.jScrollPanelDatosMantenimientoeActivoFijos = new JScrollPane();   
        this.jScrollPanelDatosGeneralMantenimientoeActivoFijos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mantenimientoe Activo Fijos";
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimientoe Activo Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMantenimientoeActivoFijos.setToolTipText("Acciones");
        this.jPanelAccionesMantenimientoeActivoFijos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos=new ReporteDinamicoJInternalFrame(MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMantenimientoeActivoFijos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMantenimientoeActivoFijos=new ImportacionJInternalFrame(MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMantenimientoeActivoFijos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMantenimientoeActivoFijos = new JButtonMe();
		
		this.jButtonAbrirOrderByMantenimientoeActivoFijos.setText("Orden");
		this.jButtonAbrirOrderByMantenimientoeActivoFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMantenimientoeActivoFijos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMantenimientoeActivoFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoeActivoFijos,false,this);
			
			//this.cargarOrderByMantenimientoeActivoFijos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMantenimientoeActivoFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoeActivoFijos,true,this);
			
			//this.cargarOrderByMantenimientoeActivoFijos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMantenimientoeActivoFijos.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosMantenimientoeActivoFijos.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosMantenimientoeActivoFijos.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosMantenimientoeActivoFijos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMantenimientoeActivoFijos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMantenimientoeActivoFijos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMantenimientoeActivoFijos.setText("Nuevo");
		this.jButtonDuplicarMantenimientoeActivoFijos.setText("Duplicar");
		this.jButtonCopiarMantenimientoeActivoFijos.setText("Copiar");
		this.jButtonVerFormMantenimientoeActivoFijos.setText("Ver");
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.setText("Guardar");
		this.jButtonCerrarMantenimientoeActivoFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMantenimientoeActivoFijos,"nuevo_button","Nuevo",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMantenimientoeActivoFijos,"duplicar_button","Duplicar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMantenimientoeActivoFijos,"copiar_button","Copiar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMantenimientoeActivoFijos,"ver_form","Ver",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMantenimientoeActivoFijos,"nuevorelaciones_button","Nuevo Rel",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos,"guardarcambiostabla_button","Guardar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMantenimientoeActivoFijos,"cerrar_button","Salir",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMantenimientoeActivoFijos.setToolTipText("Nuevo"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMantenimientoeActivoFijos.setToolTipText("Duplicar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMantenimientoeActivoFijos.setToolTipText("Copiar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMantenimientoeActivoFijos.setToolTipText("Ver"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.setToolTipText("Nuevo Rel"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.setToolTipText("Guardar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMantenimientoeActivoFijos.setToolTipText("Salir"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMantenimientoeActivoFijos";
		inputMap = this.jButtonNuevoMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMantenimientoeActivoFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMantenimientoeActivoFijos"));
		
		//DUPLICAR
		sMapKey = "DuplicarMantenimientoeActivoFijos";
		inputMap = this.jButtonDuplicarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMantenimientoeActivoFijos"));
		
		//COPIAR
		sMapKey = "CopiarMantenimientoeActivoFijos";
		inputMap = this.jButtonCopiarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMantenimientoeActivoFijos"));
		
		//VEr FORM
		sMapKey = "VerFormMantenimientoeActivoFijos";
		inputMap = this.jButtonVerFormMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMantenimientoeActivoFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMantenimientoeActivoFijos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMantenimientoeActivoFijos";
		inputMap = this.jButtonNuevoRelacionesMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMantenimientoeActivoFijos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMantenimientoeActivoFijos";
		inputMap = this.jButtonModificarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMantenimientoeActivoFijos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMantenimientoeActivoFijos";
		inputMap = this.jButtonCerrarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMantenimientoeActivoFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMantenimientoeActivoFijos";
		inputMap = this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMantenimientoeActivoFijos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MantenimientoeActivoFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MantenimientoeActivoFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MantenimientoeActivoFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MantenimientoeActivoFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MantenimientoeActivoFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMantenimientoeActivoFijos.setName("jPanelParametrosReportesMantenimientoeActivoFijos"); 
		
		this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos.setName("jPanelParametrosReportesAccionesMantenimientoeActivoFijos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.setText("Buscar");
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.setToolTipText("Buscar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMantenimientoeActivoFijos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.setVisible(false);
		
		
		this.jButtonProcesarInformacionMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonProcesarInformacionMantenimientoeActivoFijos.setText("Procesar");
		this.jButtonProcesarInformacionMantenimientoeActivoFijos.setToolTipText("Procesar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMantenimientoeActivoFijos.setVisible(false);
			
		this.jButtonProcesarInformacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setText("TIPO");       
		this.jComboBoxTiposReportesMantenimientoeActivoFijos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setText("Paginacion");
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.setText("Accion");
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setText("Accion");
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.setText("Accion");
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMantenimientoeActivoFijos = new JLabelMe();
		
		this.jLabelAccionesMantenimientoeActivoFijos.setText("Acciones");		
		this.jLabelAccionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMantenimientoeActivoFijos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.setText("Graf.");
		this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMantenimientoeActivoFijos = new JButtonMe();
		//this.jButtonAnterioresMantenimientoeActivoFijos.setText("<<");
        this.jButtonAnterioresMantenimientoeActivoFijos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMantenimientoeActivoFijos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMantenimientoeActivoFijos = new JButtonMe();
		//this.jButtonSiguientesMantenimientoeActivoFijos.setText(">>");
        this.jButtonSiguientesMantenimientoeActivoFijos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMantenimientoeActivoFijos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.setText("Nue");
        this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos,"nuevoguardarcambios_button","Nue",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMantenimientoeActivoFijos";
		inputMap = this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMantenimientoeActivoFijos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMantenimientoeActivoFijos";
		inputMap = this.jButtonRecargarInformacionMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMantenimientoeActivoFijos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMantenimientoeActivoFijos";
		inputMap = this.jButtonSiguientesMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMantenimientoeActivoFijos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMantenimientoeActivoFijos";
		inputMap = this.jButtonAnterioresMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMantenimientoeActivoFijos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMantenimientoeActivoFijos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(this.getWidth(),MantenimientoeActivoFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MantenimientoeActivoFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(this.getWidth(),MantenimientoeActivoFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MantenimientoeActivoFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(this.getWidth(),MantenimientoeActivoFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MantenimientoeActivoFijosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMantenimientoeActivoFijos = new GridBagLayout();

			this.jPanelPaginacionMantenimientoeActivoFijos.setLayout(gridaBagLayoutPaginacionMantenimientoeActivoFijos);						
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonAnterioresMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
					
						
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
			
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
						
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonSiguientesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonNuevoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
						
			
			
			if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
				this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
				this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			}
			
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonDuplicarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonCopiarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonVerFormMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMantenimientoeActivoFijos.add(this.jButtonCerrarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMantenimientoeActivoFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMantenimientoeActivoFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMantenimientoeActivoFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMantenimientoeActivoFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMantenimientoeActivoFijos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MantenimientoeActivoFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MantenimientoeActivoFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MantenimientoeActivoFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MantenimientoeActivoFijos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMantenimientoeActivoFijos.setLayout(gridaBagParametrosReportesMantenimientoeActivoFijos);
			this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos.setLayout(gridaBagParametrosReportesAccionesMantenimientoeActivoFijos);
			
			
			this.jPanelParametrosAuxiliar1MantenimientoeActivoFijos.setLayout(gridaBagParametrosAuxiliar1MantenimientoeActivoFijos);
			this.jPanelParametrosAuxiliar2MantenimientoeActivoFijos.setLayout(gridaBagParametrosAuxiliar2MantenimientoeActivoFijos);
			this.jPanelParametrosAuxiliar3MantenimientoeActivoFijos.setLayout(gridaBagParametrosAuxiliar3MantenimientoeActivoFijos);
			this.jPanelParametrosAuxiliar4MantenimientoeActivoFijos.setLayout(gridaBagParametrosAuxiliar4MantenimientoeActivoFijos);
			//this.jPanelParametrosAuxiliar5MantenimientoeActivoFijos.setLayout(gridaBagParametrosAuxiliar2MantenimientoeActivoFijos);			
			
			
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jButtonRecargarInformacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MantenimientoeActivoFijos.add(this.jComboBoxTiposPaginacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MantenimientoeActivoFijos.add(this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MantenimientoeActivoFijos.add(this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jPanelParametrosAuxiliar1MantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MantenimientoeActivoFijos.add(this.jComboBoxTiposReportesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);																		
			
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MantenimientoeActivoFijos.add(this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jPanelParametrosAuxiliar4MantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jComboBoxTiposReportesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jCheckBoxGenerarReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jPanelParametrosAuxiliar2MantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jLabelAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
				this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jButtonAbrirOrderByMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
			
			
			/*
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MantenimientoeActivoFijos.add(this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);															
				
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MantenimientoeActivoFijos.add(this.jCheckBoxSeleccionadosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);															
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MantenimientoeActivoFijos.add(this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jPanelParametrosAuxiliar3MantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoeActivoFijos.add(this.jComboBoxTiposAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMantenimientoeActivoFijos = new GridBagLayout();

			this.jScrollPanelDatosMantenimientoeActivoFijos.setLayout(gridaBagLayoutDatosMantenimientoeActivoFijos);
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
			
			this.jScrollPanelDatosMantenimientoeActivoFijos.add(this.jTableDatosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMantenimientoeActivoFijos.setViewportView(this.jTableDatosMantenimientoeActivoFijos);
		this.jTableDatosMantenimientoeActivoFijos.setFillsViewportHeight(true);
		this.jTableDatosMantenimientoeActivoFijos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMantenimientoeActivoFijos= new GridBagLayout();
		this.jPanelAccionesMantenimientoeActivoFijos.setLayout(gridaBagLayoutAccionesMantenimientoeActivoFijos);
		
		
		/*	
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
			
		this.jPanelAccionesMantenimientoeActivoFijos.add(this.jButtonNuevoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos= new GridBagLayout();
		gridaBagLayoutBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.setLayout(gridaBagLayoutBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);

		gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
		jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.add(jLabelidBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos, gridBagConstraintsMantenimientoeActivoFijos);

		gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
		jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.add(jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos, gridBagConstraintsMantenimientoeActivoFijos);

		gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoeActivoFijos.gridy = 1;
		gridBagConstraintsMantenimientoeActivoFijos.gridx =1;
		jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.add(jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos, gridBagConstraintsMantenimientoeActivoFijos);

		jTabbedPaneBusquedasMantenimientoeActivoFijos.addTab("1.-Por  ", jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
		jTabbedPaneBusquedasMantenimientoeActivoFijos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMantenimientoeActivoFijos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();						
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;		
			//this.gridBagConstraintsMantenimientoeActivoFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;		
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMantenimientoeActivoFijos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;		
			this.gridBagConstraintsMantenimientoeActivoFijos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);								
		
		
		/*
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		*/		
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =0;
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMantenimientoeActivoFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
				
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMantenimientoeActivoFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMantenimientoeActivoFijos = new GridBagLayout();
			this.jPanelBusquedasParametrosMantenimientoeActivoFijos.setLayout(gridaBagLayoutBusquedasParametrosMantenimientoeActivoFijos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMantenimientoeActivoFijos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMantenimientoeActivoFijos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMantenimientoeActivoFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.setName("jPanelReporteDinamicoMantenimientoeActivoFijos"); 
		
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.setLayout(gridaBagLayoutReporteDinamicoMantenimientoeActivoFijos);
		
		
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMantenimientoeActivoFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setResizable(true);
	    this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setClosable(true);
	    this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimientoe Activo Fijoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelColumnasSelectReporteMantenimientoeActivoFijos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelColumnasSelectReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMantenimientoeActivoFijos = new JList<Reporte>();
		this.jListColumnasSelectReporteMantenimientoeActivoFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMantenimientoeActivoFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMantenimientoeActivoFijos=new JScrollPane(this.jListColumnasSelectReporteMantenimientoeActivoFijos);
			
			this.jScrollColumnasSelectReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jListColumnasSelectReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jScrollColumnasSelectReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelRelacionesSelectReporteMantenimientoeActivoFijos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMantenimientoeActivoFijos = new JList<Reporte>();
		this.jListRelacionesSelectReporteMantenimientoeActivoFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMantenimientoeActivoFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMantenimientoeActivoFijos=new JScrollPane(this.jListRelacionesSelectReporteMantenimientoeActivoFijos);
			
			this.jScrollRelacionesSelectReporteMantenimientoeActivoFijos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMantenimientoeActivoFijos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMantenimientoeActivoFijos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos = new JComboBoxMe();
		this.jListColumnasValoresGraficoMantenimientoeActivoFijos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelConGraficoDinamicoMantenimientoeActivoFijos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelConGraficoDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jCheckBoxConGraficoDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelColumnaCategoriaGraficoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelColumnaCategoriaValorMantenimientoeActivoFijos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelColumnaCategoriaValorMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jComboBoxColumnaCategoriaValorMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelColumnasValoresGraficoMantenimientoeActivoFijos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelColumnasValoresGraficoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMantenimientoeActivoFijos = new JList<Reporte>();
		this.jListColumnasValoresGraficoMantenimientoeActivoFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMantenimientoeActivoFijos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMantenimientoeActivoFijos=new JScrollPane(this.jListColumnasValoresGraficoMantenimientoeActivoFijos);
			
			this.jScrollColumnasValoresGraficoMantenimientoeActivoFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMantenimientoeActivoFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMantenimientoeActivoFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jListColumnasSelectReporteMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jScrollColumnasValoresGraficoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelTiposGraficosReportesDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMantenimientoeActivoFijos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jComboBoxTiposGraficosReportesDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelGenerarExcelReporteDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos.setToolTipText("Generar EXCEL"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jComboBoxTiposReportesDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jLabelTiposArchivoReporteDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jComboBoxTiposArchivosReportesDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos.setToolTipText("Generar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos.setToolTipText("Cancelar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoeActivoFijos.add(this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMantenimientoeActivoFijos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos= new JScrollPane(jPanelReporteDinamicoMantenimientoeActivoFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimientoe Activo Fijoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMantenimientoeActivoFijos);
		this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getContentPane().add(this.jScrollPanelReporteDinamicoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMantenimientoeActivoFijos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMantenimientoeActivoFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMantenimientoeActivoFijos.setName("jPanelImportacionMantenimientoeActivoFijos"); 
		
		this.jPanelImportacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMantenimientoeActivoFijos.setLayout(gridaBagLayoutImportacionMantenimientoeActivoFijos);
		
		
		this.jInternalFrameImportacionMantenimientoeActivoFijos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMantenimientoeActivoFijos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMantenimientoeActivoFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMantenimientoeActivoFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setResizable(true);
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setClosable(true);
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setResizable(true);
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setClosable(true);
	    this.jInternalFrameImportacionMantenimientoeActivoFijos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimientoe Activo Fijoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelArchivoImportacionMantenimientoeActivoFijos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMantenimientoeActivoFijos.add(this.jLabelArchivoImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMantenimientoeActivoFijos = new JFileChooser();		
		this.jFileChooserImportacionMantenimientoeActivoFijos.setToolTipText("ESCOGER ARCHIVO"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonAbrirImportacionMantenimientoeActivoFijos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMantenimientoeActivoFijos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMantenimientoeActivoFijos.setToolTipText("Generar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoeActivoFijos.add(this.jButtonAbrirImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMantenimientoeActivoFijos = new JLabelMe();

		this.jLabelPathArchivoImportacionMantenimientoeActivoFijos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMantenimientoeActivoFijos.add(this.jLabelPathArchivoImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMantenimientoeActivoFijos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoeActivoFijos.add(this.jTextFieldPathArchivoImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonGenerarImportacionMantenimientoeActivoFijos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMantenimientoeActivoFijos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMantenimientoeActivoFijos.setToolTipText("Generar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoeActivoFijos.add(this.jButtonGenerarImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonCerrarImportacionMantenimientoeActivoFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMantenimientoeActivoFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMantenimientoeActivoFijos.setToolTipText("Cancelar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoeActivoFijos.add(this.jButtonCerrarImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMantenimientoeActivoFijos = new GridBagLayout();
		
		this.jScrollPanelImportacionMantenimientoeActivoFijos= new JScrollPane(jPanelImportacionMantenimientoeActivoFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iPosYImportacion;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iPosXImportacion;
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMantenimientoeActivoFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMantenimientoeActivoFijos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMantenimientoeActivoFijos);
		this.jInternalFrameImportacionMantenimientoeActivoFijos.getContentPane().add(this.jScrollPanelImportacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMantenimientoeActivoFijos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMantenimientoeActivoFijos = new JButtonMe();
			this.jButtonAbrirOrderByMantenimientoeActivoFijos.setText("Orden");
			this.jButtonAbrirOrderByMantenimientoeActivoFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMantenimientoeActivoFijos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMantenimientoeActivoFijos";
			inputMap = this.jButtonAbrirOrderByMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMantenimientoeActivoFijos"));
		
		
			GridBagLayout gridaBagLayoutOrderByMantenimientoeActivoFijos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMantenimientoeActivoFijos.setName("jPanelOrderByMantenimientoeActivoFijos"); 
			
			this.jPanelOrderByMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMantenimientoeActivoFijos.setLayout(gridaBagLayoutOrderByMantenimientoeActivoFijos);
			
			
			this.jTableDatosMantenimientoeActivoFijosOrderBy = new JTableMe();        
			this.jTableDatosMantenimientoeActivoFijosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMantenimientoeActivoFijosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMantenimientoeActivoFijosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMantenimientoeActivoFijosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMantenimientoeActivoFijosOrderBy.setViewportView(this.jTableDatosMantenimientoeActivoFijosOrderBy);
			this.jTableDatosMantenimientoeActivoFijosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMantenimientoeActivoFijosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMantenimientoeActivoFijos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMantenimientoeActivoFijos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMantenimientoeActivoFijos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMantenimientoeActivoFijos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setTitle("Orden");
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setResizable(true);
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setClosable(true);
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimientoe Activo Fijoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMantenimientoeActivoFijos.ipady =150;
				
			this.jPanelOrderByMantenimientoeActivoFijos.add(jScrollPanelDatosMantenimientoeActivoFijosOrderBy, this.gridBagConstraintsMantenimientoeActivoFijos);//this.jTableDatosMantenimientoeActivoFijosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMantenimientoeActivoFijos = new JButtonMe();
			this.jButtonCerrarOrderByMantenimientoeActivoFijos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMantenimientoeActivoFijos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMantenimientoeActivoFijos.setToolTipText("Cancelar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMantenimientoeActivoFijos.add(this.jButtonCerrarOrderByMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMantenimientoeActivoFijos = new GridBagLayout();
			
			this.jScrollPanelOrderByMantenimientoeActivoFijos= new JScrollPane(jPanelOrderByMantenimientoeActivoFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iPosYOrderBy;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMantenimientoeActivoFijos);
			
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getContentPane().add(this.jScrollPanelOrderByMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
		
		} else {
			this.jButtonAbrirOrderByMantenimientoeActivoFijos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosMantenimientoeActivoFijos.getRowHeight();//MantenimientoeActivoFijosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.isSelected()) {
					iHeightTable=MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMantenimientoeActivoFijos.isSelected()) {
					iHeightTable=MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MantenimientoeActivoFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMantenimientoeActivoFijos!=null && this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy()!=null) {
			//if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMantenimientoeActivoFijos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mantenimientoeactivofijoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MantenimientoeActivoFijos> TraerMantenimientoeActivoFijosBeans(List<MantenimientoeActivoFijos> mantenimientoeactivofijoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijoss) {
					
				if(!(MantenimientoeActivoFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MantenimientoeActivoFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mantenimientoeactivofijos.setsDetalleGeneralEntityReporte(MantenimientoeActivoFijosConstantesFunciones.getMantenimientoeActivoFijosDescripcion(mantenimientoeactivofijos));
										
						
					
						
					
				} else  {
							
					//mantenimientoeactivofijos.setsDetalleGeneralEntityReporte(mantenimientoeactivofijos.getsDetalleGeneralEntityReporte());
										
				}
				
				//mantenimientoeactivofijosbeans.add(mantenimientoeactivofijosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mantenimientoeactivofijoss;
    }
	//PARA REPORTES FIN
}
