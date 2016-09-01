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
import com.bydan.erp.activosfijos.util.report.AdicionalesActivosFijosConstantesFunciones;

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
public class AdicionalesActivosFijosJInternalFrame extends AdicionalesActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAdicionalesActivosFijos;
	
	protected JMenuBar jmenuBarAdicionalesActivosFijos;
	
	protected JMenu jmenuAdicionalesActivosFijos;
	protected JMenu jmenuDatosAdicionalesActivosFijos;
	protected JMenu jmenuArchivoAdicionalesActivosFijos;
	protected JMenu jmenuAccionesAdicionalesActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAdicionalesActivosFijos;	
	protected GridBagConstraints gridBagConstraintsAdicionalesActivosFijos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AdicionalesActivosFijosDetalleFormJInternalFrame jInternalFrameDetalleFormAdicionalesActivosFijos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAdicionalesActivosFijos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAdicionalesActivosFijos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public AdicionalesActivosFijosSessionBean adicionalesactivosfijosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AdicionalesActivosFijos> adicionalesactivosfijoss;		
	public List<AdicionalesActivosFijos> adicionalesactivosfijossEliminados;	
	public List<AdicionalesActivosFijos> adicionalesactivosfijossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAdicionalesActivosFijos;		
	protected JButton jButtonAbrirOrderByAdicionalesActivosFijos;
	
	
	//protected JPanel jPanelOrderByAdicionalesActivosFijos;
	//public JScrollPane jScrollPanelOrderByAdicionalesActivosFijos;	
	//protected JButton jButtonCerrarOrderByAdicionalesActivosFijos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AdicionalesActivosFijosLogic adicionalesactivosfijosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAdicionalesActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionAdicionalesActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralAdicionalesActivosFijos;
    
	
	
	//public JScrollPane jScrollPanelDatosAdicionalesActivosFijosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAdicionalesActivosFijos;
	//public JScrollPane jScrollPanelImportacionAdicionalesActivosFijos;
	
	
	
	protected JPanel jPanelAccionesAdicionalesActivosFijos;
	
    protected JPanel jPanelPaginacionAdicionalesActivosFijos;
    protected JPanel jPanelParametrosReportesAdicionalesActivosFijos;
	protected JPanel jPanelParametrosReportesAccionesAdicionalesActivosFijos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AdicionalesActivosFijos;
	protected JPanel jPanelParametrosAuxiliar2AdicionalesActivosFijos;
	protected JPanel jPanelParametrosAuxiliar3AdicionalesActivosFijos;
	protected JPanel jPanelParametrosAuxiliar4AdicionalesActivosFijos;
	//protected JPanel jPanelParametrosAuxiliar5AdicionalesActivosFijos;
	
	
	
	//protected JPanel jPanelReporteDinamicoAdicionalesActivosFijos;
	//protected JPanel jPanelImportacionAdicionalesActivosFijos;
	
	
	public JTable jTableDatosAdicionalesActivosFijos;
	
	
	
	//public JTable jTableDatosAdicionalesActivosFijosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAdicionalesActivosFijos;
	protected JButton jButtonDuplicarAdicionalesActivosFijos;
	protected JButton jButtonCopiarAdicionalesActivosFijos;
	protected JButton jButtonVerFormAdicionalesActivosFijos;
	protected JButton jButtonNuevoRelacionesAdicionalesActivosFijos;
	protected JButton jButtonModificarAdicionalesActivosFijos;
	
    protected JButton jButtonGuardarCambiosTablaAdicionalesActivosFijos;
	protected JButton jButtonCerrarAdicionalesActivosFijos;
	
	
	protected JButton jButtonRecargarInformacionAdicionalesActivosFijos;
	protected JButton jButtonProcesarInformacionAdicionalesActivosFijos;
	
	
	protected JButton jButtonAnterioresAdicionalesActivosFijos;
	protected JButton jButtonSiguientesAdicionalesActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosAdicionalesActivosFijos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAdicionalesActivosFijos;
	//protected JButton jButtonCerrarReporteDinamicoAdicionalesActivosFijos;
	//protected JButton jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos;	
	
	
	
	//protected JButton jButtonAbrirImportacionAdicionalesActivosFijos;
	//protected JButton jButtonGenerarImportacionAdicionalesActivosFijos;
	//protected JButton jButtonCerrarImportacionAdicionalesActivosFijos;
	//protected JFileChooser jFileChooserImportacionAdicionalesActivosFijos;
	//protected File fileImportacionAdicionalesActivosFijos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAdicionalesActivosFijos;
	protected JButton jButtonDuplicarToolBarAdicionalesActivosFijos;
	protected JButton jButtonNuevoRelacionesToolBarAdicionalesActivosFijos;
	
	
	public JButton jButtonGuardarCambiosToolBarAdicionalesActivosFijos;
	protected JButton jButtonCopiarToolBarAdicionalesActivosFijos;
	protected JButton jButtonVerFormToolBarAdicionalesActivosFijos;
	public JButton jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarAdicionalesActivosFijos;
	protected JButton jButtonCerrarToolBarAdicionalesActivosFijos;
	
	protected JButton jButtonRecargarInformacionToolBarAdicionalesActivosFijos;
	protected JButton jButtonProcesarInformacionToolBarAdicionalesActivosFijos;
	protected JButton jButtonAnterioresToolBarAdicionalesActivosFijos;
	protected JButton jButtonSiguientesToolBarAdicionalesActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosToolBarAdicionalesActivosFijos;
	protected JButton jButtonAbrirOrderByToolBarAdicionalesActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAdicionalesActivosFijos;
	protected JMenuItem jMenuItemDuplicarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemNuevoRelacionesAdicionalesActivosFijos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAdicionalesActivosFijos;
	protected JMenuItem jMenuItemCopiarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemVerFormAdicionalesActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaAdicionalesActivosFijos;
	protected JMenuItem jMenuItemCerrarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarAdicionalesActivosFijos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarAdicionalesActivosFijos;
	
	protected JMenuItem jMenuItemRecargarInformacionAdicionalesActivosFijos;
	protected JMenuItem jMenuItemProcesarInformacionAdicionalesActivosFijos;
	protected JMenuItem jMenuItemAnterioresAdicionalesActivosFijos;
	protected JMenuItem jMenuItemSiguientesAdicionalesActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos;
	protected JMenuItem jMenuItemAbrirOrderByAdicionalesActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarAdicionalesActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAdicionalesActivosFijos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAdicionalesActivosFijos;
	protected JCheckBox jCheckBoxSeleccionadosAdicionalesActivosFijos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos;
	protected JCheckBox jCheckBoxConGraficoReporteAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAdicionalesActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAdicionalesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAdicionalesActivosFijos;
	protected JTextField jTextFieldValorCampoGeneralAdicionalesActivosFijos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAdicionalesActivosFijos;
	//public JList<Reporte> jListColumnasSelectReporteAdicionalesActivosFijos;
	//public JScrollPane jScrollColumnasSelectReporteAdicionalesActivosFijos;
	
	//public JLabel jLabelRelacionesSelectReporteAdicionalesActivosFijos;
	//public JList<Reporte> jListRelacionesSelectReporteAdicionalesActivosFijos;
	//public JScrollPane jScrollRelacionesSelectReporteAdicionalesActivosFijos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAdicionalesActivosFijos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAdicionalesActivosFijos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos;
	//public JLabel jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos;
	
		
	//public JLabel jLabelArchivoImportacionAdicionalesActivosFijos;	
	//public JLabel jLabelPathArchivoImportacionAdicionalesActivosFijos;
	//protected JTextField jTextFieldPathArchivoImportacionAdicionalesActivosFijos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAdicionalesActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos;
	
	//public JLabel jLabelColumnaCategoriaValorAdicionalesActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAdicionalesActivosFijos;
	
	//public JLabel jLabelColumnasValoresGraficoAdicionalesActivosFijos;
	//public JList<Reporte> jListColumnasValoresGraficoAdicionalesActivosFijos;
	//public JScrollPane jScrollColumnasValoresGraficoAdicionalesActivosFijos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAdicionalesActivosFijos;
	public JPanel jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos;
	public JButton jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos;
	
	public JPanel jPanelIdIdBusquedaAdicionalesActivosFijosAdicionalesActivosFijos;
	public JLabel jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos;
	public JTextFieldMe jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos;
	public JButton jButtonidBusquedaAdicionalesActivosFijosAdicionalesActivosFijosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AdicionalesActivosFijosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AdicionalesActivosFijosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAdicionalesActivosFijos)	{
		this.jButtonRecargarInformacionAdicionalesActivosFijos = jButtonRecargarInformacionAdicionalesActivosFijos;
	}
	
	public JButton getjButtonProcesarInformacionAdicionalesActivosFijos() {
		return this.jButtonProcesarInformacionAdicionalesActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAdicionalesActivosFijos)	{
		this.jButtonProcesarInformacionAdicionalesActivosFijos = jButtonProcesarInformacionAdicionalesActivosFijos;
	}
	
	
	public JButton getjButtonRecargarInformacionAdicionalesActivosFijos() {
		return this.jButtonRecargarInformacionAdicionalesActivosFijos;
	}
	
	
	public List<AdicionalesActivosFijos> getadicionalesactivosfijoss() {
		return this.adicionalesactivosfijoss;
	}

	public void setadicionalesactivosfijoss(List<AdicionalesActivosFijos> adicionalesactivosfijoss) {
		this.adicionalesactivosfijoss = adicionalesactivosfijoss;
	}
	
	public List<AdicionalesActivosFijos> getadicionalesactivosfijossAux() {
		return this.adicionalesactivosfijossAux;
	}

	public void setadicionalesactivosfijossAux(List<AdicionalesActivosFijos> adicionalesactivosfijossAux) {
		this.adicionalesactivosfijossAux = adicionalesactivosfijossAux;
	}
	
	public List<AdicionalesActivosFijos> getadicionalesactivosfijossEliminados() {
		return this.adicionalesactivosfijossEliminados;
	}

	public void setAdicionalesActivosFijossEliminados(List<AdicionalesActivosFijos> adicionalesactivosfijossEliminados) {
		this.adicionalesactivosfijossEliminados = adicionalesactivosfijossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAdicionalesActivosFijos() {
		return jComboBoxTiposSeleccionarAdicionalesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAdicionalesActivosFijos(
			JComboBox jComboBoxTiposSeleccionarAdicionalesActivosFijos) {
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos = jComboBoxTiposSeleccionarAdicionalesActivosFijos;
	}
	
	public void setBorderResaltarTiposSeleccionarAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAdicionalesActivosFijos() {
		return jTextFieldValorCampoGeneralAdicionalesActivosFijos;
	}

	public void setjTextFieldValorCampoGeneralAdicionalesActivosFijos(
			JTextField jTextFieldValorCampoGeneralAdicionalesActivosFijos) {
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos = jTextFieldValorCampoGeneralAdicionalesActivosFijos;
	}

	public void setBorderResaltarValorCampoGeneralAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAdicionalesActivosFijos() {
		return this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos;
	}

	public void setjCheckBoxSeleccionarTodosAdicionalesActivosFijos(
			JCheckBox jCheckBoxSeleccionarTodosAdicionalesActivosFijos) {
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos = jCheckBoxSeleccionarTodosAdicionalesActivosFijos;
	}

	public void setBorderResaltarSeleccionarTodosAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAdicionalesActivosFijos() {
		return this.jCheckBoxSeleccionadosAdicionalesActivosFijos;
	}

	public void setjCheckBoxSeleccionadosAdicionalesActivosFijos(
			JCheckBox jCheckBoxSeleccionadosAdicionalesActivosFijos) {
		this.jCheckBoxSeleccionadosAdicionalesActivosFijos = jCheckBoxSeleccionadosAdicionalesActivosFijos;
	}
	
	public void setBorderResaltarSeleccionadosAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAdicionalesActivosFijos() {
		return this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposArchivosReportesAdicionalesActivosFijos) {
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos = jComboBoxTiposArchivosReportesAdicionalesActivosFijos;
	}

	public void setBorderResaltarTiposArchivosReportesAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAdicionalesActivosFijos() {
		return this.jComboBoxTiposReportesAdicionalesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposReportesAdicionalesActivosFijos) {
		this.jComboBoxTiposReportesAdicionalesActivosFijos = jComboBoxTiposReportesAdicionalesActivosFijos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAdicionalesActivosFijos() {
	//	return jComboBoxTiposReportesDinamicoAdicionalesActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAdicionalesActivosFijos(
	//		JComboBox jComboBoxTiposReportesDinamicoAdicionalesActivosFijos) {
	//	this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos = jComboBoxTiposReportesDinamicoAdicionalesActivosFijos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos() {
	//	return jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos = jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos;
	//}
	
	public void setBorderResaltarTiposReportesAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAdicionalesActivosFijos() {
		return this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposGraficosReportesAdicionalesActivosFijos) {
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos = jComboBoxTiposGraficosReportesAdicionalesActivosFijos;
	}
	
	public void setBorderResaltarTiposGraficosReportesAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAdicionalesActivosFijos() {
		return this.jComboBoxTiposPaginacionAdicionalesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAdicionalesActivosFijos(
			JComboBox jComboBoxTiposPaginacionAdicionalesActivosFijos) {
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos = jComboBoxTiposPaginacionAdicionalesActivosFijos;
	}
	
	public void setBorderResaltarTiposPaginacionAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAdicionalesActivosFijos() {
		return this.jComboBoxTiposRelacionesAdicionalesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAdicionalesActivosFijos() {
		return this.jComboBoxTiposAccionesAdicionalesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposRelacionesAdicionalesActivosFijos) {
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos = jComboBoxTiposRelacionesAdicionalesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAdicionalesActivosFijos(
			JComboBox jComboBoxTiposAccionesAdicionalesActivosFijos) {
		this.jComboBoxTiposAccionesAdicionalesActivosFijos = jComboBoxTiposAccionesAdicionalesActivosFijos;
	}
	
	public void setBorderResaltarTiposRelacionesAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAdicionalesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAdicionalesActivosFijos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAdicionalesActivosFijos() {
	//	return jCheckBoxConGraficoDinamicoAdicionalesActivosFijos;
	//}

	//public void setjCheckBoxConGraficoDinamicoAdicionalesActivosFijos(
	//		JCheckBox jCheckBoxConGraficoDinamicoAdicionalesActivosFijos) {
	//	this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos = jCheckBoxConGraficoDinamicoAdicionalesActivosFijos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAdicionalesActivosFijos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAdicionalesActivosFijos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos .setBorder(borderResaltar);		
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
		this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean();
		
		this.adicionalesactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.adicionalesactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AdicionalesActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AdicionalesActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AdicionalesActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AdicionalesActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AdicionalesActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Adicionales Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
		
		AdicionalesActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AdicionalesActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAdicionalesActivosFijos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"nuevo","nuevo","Nuevo"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"duplicar","duplicar","Duplicar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"copiar","copiar","Copiar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"ver_form","ver_form","Ver"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"recargar","recargar","Buscar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAdicionalesActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,
							"cerrar","cerrar","Salir"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAdicionalesActivosFijos;
			
				this.jButtonProcesarInformacionToolBarAdicionalesActivosFijos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAdicionalesActivosFijos;
				
		//protected JButton jButtonModificarToolBarAdicionalesActivosFijos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAdicionalesActivosFijos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAdicionalesActivosFijos=new JMenuMe("General");
		this.jmenuArchivoAdicionalesActivosFijos=new JMenuMe("Archivo");
		this.jmenuAccionesAdicionalesActivosFijos=new JMenuMe("Acciones");
		this.jmenuDatosAdicionalesActivosFijos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAdicionalesActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAdicionalesActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAdicionalesActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAdicionalesActivosFijos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAdicionalesActivosFijos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAdicionalesActivosFijos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAdicionalesActivosFijos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAdicionalesActivosFijos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAdicionalesActivosFijos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAdicionalesActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAdicionalesActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAdicionalesActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAdicionalesActivosFijos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAdicionalesActivosFijos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAdicionalesActivosFijos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAdicionalesActivosFijos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAdicionalesActivosFijos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAdicionalesActivosFijos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAdicionalesActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAdicionalesActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAdicionalesActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAdicionalesActivosFijos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAdicionalesActivosFijos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAdicionalesActivosFijos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAdicionalesActivosFijos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAdicionalesActivosFijos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAdicionalesActivosFijos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAdicionalesActivosFijos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAdicionalesActivosFijos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAdicionalesActivosFijos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAdicionalesActivosFijos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAdicionalesActivosFijos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAdicionalesActivosFijos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAdicionalesActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAdicionalesActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAdicionalesActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAdicionalesActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAdicionalesActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAdicionalesActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAdicionalesActivosFijos.add(this.jMenuItemCerrarAdicionalesActivosFijos);
			
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemNuevoAdicionalesActivosFijos);
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos);
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemNuevoRelacionesAdicionalesActivosFijos);
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos);		
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemDuplicarAdicionalesActivosFijos);		
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemCopiarAdicionalesActivosFijos);		
			this.jmenuAccionesAdicionalesActivosFijos.add(this.jMenuItemVerFormAdicionalesActivosFijos);		
			
			this.jmenuDatosAdicionalesActivosFijos.add(this.jMenuItemRecargarInformacionAdicionalesActivosFijos);				
			this.jmenuDatosAdicionalesActivosFijos.add(this.jMenuItemAnterioresAdicionalesActivosFijos);				
			this.jmenuDatosAdicionalesActivosFijos.add(this.jMenuItemSiguientesAdicionalesActivosFijos);				
			this.jmenuDatosAdicionalesActivosFijos.add(this.jMenuItemAbrirOrderByAdicionalesActivosFijos);				
			this.jmenuDatosAdicionalesActivosFijos.add(this.jMenuItemMostrarOcultarAdicionalesActivosFijos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAdicionalesActivosFijos.add(this.jMenuItemGuardarCambiosAdicionalesActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAdicionalesActivosFijos.add(this.jmenuArchivoAdicionalesActivosFijos);		
			this.jmenuBarAdicionalesActivosFijos.add(this.jmenuAccionesAdicionalesActivosFijos);		
			this.jmenuBarAdicionalesActivosFijos.add(this.jmenuDatosAdicionalesActivosFijos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAdicionalesActivosFijos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAdicionalesActivosFijos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos= new JButtonMe();
		this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setText("Buscar");
		this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos = new JLabelMe();
		jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setText("Id :");
		jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos= new JTextFieldMe();
		jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos.setVisible(false);




		this.jTabbedPaneBusquedasAdicionalesActivosFijos=new JTabbedPane();


		this.jTabbedPaneBusquedasAdicionalesActivosFijos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasAdicionalesActivosFijos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasAdicionalesActivosFijos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAdicionalesActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAdicionalesActivosFijos = new AdicionalesActivosFijosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Adicionales Activos Fijos DATOS");
			this.jInternalFrameDetalleFormAdicionalesActivosFijos = new AdicionalesActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones(),this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos = null;//new AdicionalesActivosFijosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAdicionalesActivosFijos= new GridBagLayout();
		
		
		this.jTableDatosAdicionalesActivosFijos = new JTableMe();      
		
		String sToolTipAdicionalesActivosFijos="";
		sToolTipAdicionalesActivosFijos=AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAdicionalesActivosFijos+="(ActivosFijos.AdicionalesActivosFijos)";
		}
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipAdicionalesActivosFijos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAdicionalesActivosFijos.setToolTipText(sToolTipAdicionalesActivosFijos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAdicionalesActivosFijos);
		this.jTableDatosAdicionalesActivosFijos.setAutoCreateRowSorter(true);
		this.jTableDatosAdicionalesActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAdicionalesActivosFijos.setRowSelectionAllowed(true);
		this.jTableDatosAdicionalesActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAdicionalesActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAdicionalesActivosFijos = new JButtonMe();
		this.jButtonDuplicarAdicionalesActivosFijos = new JButtonMe();
		this.jButtonCopiarAdicionalesActivosFijos = new JButtonMe();
		this.jButtonVerFormAdicionalesActivosFijos = new JButtonMe();
		this.jButtonNuevoRelacionesAdicionalesActivosFijos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos = new JButtonMe();
		this.jButtonCerrarAdicionalesActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosAdicionalesActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosGeneralAdicionalesActivosFijos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Adicionales Activos Fijos";
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosAdicionalesActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAdicionalesActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesAdicionalesActivosFijos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAdicionalesActivosFijos=new ReporteDinamicoJInternalFrame(AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAdicionalesActivosFijos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAdicionalesActivosFijos=new ImportacionJInternalFrame(AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAdicionalesActivosFijos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAdicionalesActivosFijos = new JButtonMe();
		
		this.jButtonAbrirOrderByAdicionalesActivosFijos.setText("Orden");
		this.jButtonAbrirOrderByAdicionalesActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAdicionalesActivosFijos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAdicionalesActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAdicionalesActivosFijos,false,this);
			
			//this.cargarOrderByAdicionalesActivosFijos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAdicionalesActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAdicionalesActivosFijos,true,this);
			
			//this.cargarOrderByAdicionalesActivosFijos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAdicionalesActivosFijos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosAdicionalesActivosFijos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosAdicionalesActivosFijos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosAdicionalesActivosFijos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAdicionalesActivosFijos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAdicionalesActivosFijos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAdicionalesActivosFijos.setText("Nuevo");
		this.jButtonDuplicarAdicionalesActivosFijos.setText("Duplicar");
		this.jButtonCopiarAdicionalesActivosFijos.setText("Copiar");
		this.jButtonVerFormAdicionalesActivosFijos.setText("Ver");
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.setText("Guardar");
		this.jButtonCerrarAdicionalesActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAdicionalesActivosFijos,"nuevo_button","Nuevo",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAdicionalesActivosFijos,"duplicar_button","Duplicar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAdicionalesActivosFijos,"copiar_button","Copiar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAdicionalesActivosFijos,"ver_form","Ver",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAdicionalesActivosFijos,"nuevorelaciones_button","Nuevo Rel",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAdicionalesActivosFijos,"guardarcambiostabla_button","Guardar",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAdicionalesActivosFijos,"cerrar_button","Salir",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAdicionalesActivosFijos.setToolTipText("Nuevo"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAdicionalesActivosFijos.setToolTipText("Duplicar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAdicionalesActivosFijos.setToolTipText("Copiar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAdicionalesActivosFijos.setToolTipText("Ver"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.setToolTipText("Nuevo Rel"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.setToolTipText("Guardar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAdicionalesActivosFijos.setToolTipText("Salir"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAdicionalesActivosFijos";
		inputMap = this.jButtonNuevoAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAdicionalesActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAdicionalesActivosFijos"));
		
		//DUPLICAR
		sMapKey = "DuplicarAdicionalesActivosFijos";
		inputMap = this.jButtonDuplicarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAdicionalesActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAdicionalesActivosFijos"));
		
		//COPIAR
		sMapKey = "CopiarAdicionalesActivosFijos";
		inputMap = this.jButtonCopiarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAdicionalesActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAdicionalesActivosFijos"));
		
		//VEr FORM
		sMapKey = "VerFormAdicionalesActivosFijos";
		inputMap = this.jButtonVerFormAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAdicionalesActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAdicionalesActivosFijos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAdicionalesActivosFijos";
		inputMap = this.jButtonNuevoRelacionesAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAdicionalesActivosFijos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAdicionalesActivosFijos";
		inputMap = this.jButtonModificarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAdicionalesActivosFijos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAdicionalesActivosFijos";
		inputMap = this.jButtonCerrarAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAdicionalesActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAdicionalesActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAdicionalesActivosFijos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AdicionalesActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AdicionalesActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AdicionalesActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AdicionalesActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AdicionalesActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAdicionalesActivosFijos.setName("jPanelParametrosReportesAdicionalesActivosFijos"); 
		
		this.jPanelParametrosReportesAccionesAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAdicionalesActivosFijos.setName("jPanelParametrosReportesAccionesAdicionalesActivosFijos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAdicionalesActivosFijos = new JButtonMe();
		this.jButtonRecargarInformacionAdicionalesActivosFijos.setText("Buscar");
		this.jButtonRecargarInformacionAdicionalesActivosFijos.setToolTipText("Buscar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAdicionalesActivosFijos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionAdicionalesActivosFijos.setVisible(false);
		
		
		this.jButtonProcesarInformacionAdicionalesActivosFijos = new JButtonMe();
		this.jButtonProcesarInformacionAdicionalesActivosFijos.setText("Procesar");
		this.jButtonProcesarInformacionAdicionalesActivosFijos.setToolTipText("Procesar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAdicionalesActivosFijos.setVisible(false);
			
		this.jButtonProcesarInformacionAdicionalesActivosFijos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAdicionalesActivosFijos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAdicionalesActivosFijos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setText("TIPO");       
		this.jComboBoxTiposReportesAdicionalesActivosFijos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setText("Paginacion");
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAdicionalesActivosFijos.setText("Accion");
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAdicionalesActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.setText("Accion");
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAdicionalesActivosFijos = new JLabelMe();
		
		this.jLabelAccionesAdicionalesActivosFijos.setText("Acciones");		
		this.jLabelAccionesAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAdicionalesActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAdicionalesActivosFijos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAdicionalesActivosFijos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAdicionalesActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAdicionalesActivosFijos = new JButtonMe();
		//this.jButtonAnterioresAdicionalesActivosFijos.setText("<<");
        this.jButtonAnterioresAdicionalesActivosFijos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAdicionalesActivosFijos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAdicionalesActivosFijos = new JButtonMe();
		//this.jButtonSiguientesAdicionalesActivosFijos.setText(">>");
        this.jButtonSiguientesAdicionalesActivosFijos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAdicionalesActivosFijos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.setText("Nue");
        this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos,"nuevoguardarcambios_button","Nue",this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAdicionalesActivosFijos";
		inputMap = this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAdicionalesActivosFijos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAdicionalesActivosFijos";
		inputMap = this.jButtonRecargarInformacionAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAdicionalesActivosFijos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAdicionalesActivosFijos";
		inputMap = this.jButtonSiguientesAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAdicionalesActivosFijos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAdicionalesActivosFijos";
		inputMap = this.jButtonAnterioresAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAdicionalesActivosFijos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAdicionalesActivosFijos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAdicionalesActivosFijos.setMinimumSize(new Dimension(this.getWidth(),AdicionalesActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AdicionalesActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAdicionalesActivosFijos.setMaximumSize(new Dimension(this.getWidth(),AdicionalesActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AdicionalesActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAdicionalesActivosFijos.setPreferredSize(new Dimension(this.getWidth(),AdicionalesActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AdicionalesActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAdicionalesActivosFijos = new GridBagLayout();

			this.jPanelPaginacionAdicionalesActivosFijos.setLayout(gridaBagLayoutPaginacionAdicionalesActivosFijos);						
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonAnterioresAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
					
						
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
			
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
						
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonSiguientesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonNuevoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
						
			
			
			if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
				this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonGuardarCambiosTablaAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			}
			
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonDuplicarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonCopiarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonVerFormAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAdicionalesActivosFijos.add(this.jButtonCerrarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		
		this.jButtonRecargarInformacionAdicionalesActivosFijos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAdicionalesActivosFijos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAdicionalesActivosFijos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAdicionalesActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAdicionalesActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAdicionalesActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAdicionalesActivosFijos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAdicionalesActivosFijos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAdicionalesActivosFijos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAdicionalesActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAdicionalesActivosFijos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AdicionalesActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AdicionalesActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AdicionalesActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AdicionalesActivosFijos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAdicionalesActivosFijos.setLayout(gridaBagParametrosReportesAdicionalesActivosFijos);
			this.jPanelParametrosReportesAccionesAdicionalesActivosFijos.setLayout(gridaBagParametrosReportesAccionesAdicionalesActivosFijos);
			
			
			this.jPanelParametrosAuxiliar1AdicionalesActivosFijos.setLayout(gridaBagParametrosAuxiliar1AdicionalesActivosFijos);
			this.jPanelParametrosAuxiliar2AdicionalesActivosFijos.setLayout(gridaBagParametrosAuxiliar2AdicionalesActivosFijos);
			this.jPanelParametrosAuxiliar3AdicionalesActivosFijos.setLayout(gridaBagParametrosAuxiliar3AdicionalesActivosFijos);
			this.jPanelParametrosAuxiliar4AdicionalesActivosFijos.setLayout(gridaBagParametrosAuxiliar4AdicionalesActivosFijos);
			//this.jPanelParametrosAuxiliar5AdicionalesActivosFijos.setLayout(gridaBagParametrosAuxiliar2AdicionalesActivosFijos);			
			
			
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jButtonRecargarInformacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AdicionalesActivosFijos.add(this.jComboBoxTiposPaginacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AdicionalesActivosFijos.add(this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AdicionalesActivosFijos.add(this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jPanelParametrosAuxiliar1AdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AdicionalesActivosFijos.add(this.jComboBoxTiposReportesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);																		
			
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AdicionalesActivosFijos.add(this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jPanelParametrosAuxiliar4AdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jComboBoxTiposReportesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jCheckBoxGenerarReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jPanelParametrosAuxiliar2AdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jLabelAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jButtonAbrirOrderByAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jComboBoxTiposSeleccionarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
			
			
			/*
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jCheckBoxConGraficoReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AdicionalesActivosFijos.add(this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);															
				
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AdicionalesActivosFijos.add(this.jCheckBoxSeleccionadosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);															
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AdicionalesActivosFijos.add(this.jCheckBoxConGraficoReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jPanelParametrosAuxiliar3AdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAdicionalesActivosFijos.add(this.jComboBoxTiposAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAdicionalesActivosFijos = new GridBagLayout();

			this.jScrollPanelDatosAdicionalesActivosFijos.setLayout(gridaBagLayoutDatosAdicionalesActivosFijos);
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
			
			this.jScrollPanelDatosAdicionalesActivosFijos.add(this.jTableDatosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAdicionalesActivosFijos.setViewportView(this.jTableDatosAdicionalesActivosFijos);
		this.jTableDatosAdicionalesActivosFijos.setFillsViewportHeight(true);
		this.jTableDatosAdicionalesActivosFijos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAdicionalesActivosFijos= new GridBagLayout();
		this.jPanelAccionesAdicionalesActivosFijos.setLayout(gridaBagLayoutAccionesAdicionalesActivosFijos);
		
		
		/*	
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
			
		this.jPanelAccionesAdicionalesActivosFijos.add(this.jButtonNuevoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaAdicionalesActivosFijosAdicionalesActivosFijos= new GridBagLayout();
		gridaBagLayoutBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.setLayout(gridaBagLayoutBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);

		gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
		jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.add(jLabelidBusquedaAdicionalesActivosFijosAdicionalesActivosFijos, gridBagConstraintsAdicionalesActivosFijos);

		gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAdicionalesActivosFijos.gridy = 0;
		gridBagConstraintsAdicionalesActivosFijos.gridx = 1;
		jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.add(jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos, gridBagConstraintsAdicionalesActivosFijos);

		gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAdicionalesActivosFijos.gridy = 1;
		gridBagConstraintsAdicionalesActivosFijos.gridx =1;
		jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.add(jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos, gridBagConstraintsAdicionalesActivosFijos);

		jTabbedPaneBusquedasAdicionalesActivosFijos.addTab("1.-Por  ", jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
		jTabbedPaneBusquedasAdicionalesActivosFijos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAdicionalesActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAdicionalesActivosFijos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;		
			//this.gridBagConstraintsAdicionalesActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;		
		//this.gridBagConstraintsAdicionalesActivosFijos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAdicionalesActivosFijos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;		
			this.gridBagConstraintsAdicionalesActivosFijos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAdicionalesActivosFijos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);								
		
		
		/*
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		*/		
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =0;
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAdicionalesActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
				
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAdicionalesActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAdicionalesActivosFijos = new GridBagLayout();
			this.jPanelBusquedasParametrosAdicionalesActivosFijos.setLayout(gridaBagLayoutBusquedasParametrosAdicionalesActivosFijos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
			
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAdicionalesActivosFijos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAdicionalesActivosFijos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAdicionalesActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAdicionalesActivosFijos.setName("jPanelReporteDinamicoAdicionalesActivosFijos"); 
		
		this.jPanelReporteDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAdicionalesActivosFijos.setLayout(gridaBagLayoutReporteDinamicoAdicionalesActivosFijos);
		
		
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAdicionalesActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAdicionalesActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setResizable(true);
	    this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setClosable(true);
	    this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales Activos Fijoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAdicionalesActivosFijos = new JLabelMe();

		this.jLabelColumnasSelectReporteAdicionalesActivosFijos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelColumnasSelectReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAdicionalesActivosFijos = new JList<Reporte>();
		this.jListColumnasSelectReporteAdicionalesActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAdicionalesActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAdicionalesActivosFijos=new JScrollPane(this.jListColumnasSelectReporteAdicionalesActivosFijos);
			
			this.jScrollColumnasSelectReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jListColumnasSelectReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jScrollColumnasSelectReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAdicionalesActivosFijos = new JLabelMe();

		this.jLabelRelacionesSelectReporteAdicionalesActivosFijos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAdicionalesActivosFijos = new JList<Reporte>();
		this.jListRelacionesSelectReporteAdicionalesActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAdicionalesActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAdicionalesActivosFijos=new JScrollPane(this.jListRelacionesSelectReporteAdicionalesActivosFijos);
			
			this.jScrollRelacionesSelectReporteAdicionalesActivosFijos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAdicionalesActivosFijos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAdicionalesActivosFijos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos = new JComboBoxMe();
		this.jListColumnasValoresGraficoAdicionalesActivosFijos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAdicionalesActivosFijos = new JLabelMe();

		this.jLabelConGraficoDinamicoAdicionalesActivosFijos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelConGraficoDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jCheckBoxConGraficoDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAdicionalesActivosFijos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAdicionalesActivosFijos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelColumnaCategoriaGraficoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAdicionalesActivosFijos = new JLabelMe();

		this.jLabelColumnaCategoriaValorAdicionalesActivosFijos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelColumnaCategoriaValorAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jComboBoxColumnaCategoriaValorAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAdicionalesActivosFijos = new JLabelMe();

		this.jLabelColumnasValoresGraficoAdicionalesActivosFijos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelColumnasValoresGraficoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAdicionalesActivosFijos = new JList<Reporte>();
		this.jListColumnasValoresGraficoAdicionalesActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAdicionalesActivosFijos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAdicionalesActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAdicionalesActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAdicionalesActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAdicionalesActivosFijos=new JScrollPane(this.jListColumnasValoresGraficoAdicionalesActivosFijos);
			
			this.jScrollColumnasValoresGraficoAdicionalesActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAdicionalesActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAdicionalesActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jListColumnasSelectReporteAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jScrollColumnasValoresGraficoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelTiposGraficosReportesDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAdicionalesActivosFijos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jComboBoxTiposGraficosReportesDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelGenerarExcelReporteDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos.setToolTipText("Generar EXCEL"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jComboBoxTiposReportesDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jLabelTiposArchivoReporteDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jComboBoxTiposArchivosReportesDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos.setToolTipText("Generar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos.setToolTipText("Cancelar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAdicionalesActivosFijos.add(this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAdicionalesActivosFijos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAdicionalesActivosFijos= new JScrollPane(jPanelReporteDinamicoAdicionalesActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales Activos Fijoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAdicionalesActivosFijos);
		this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getContentPane().add(this.jScrollPanelReporteDinamicoAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAdicionalesActivosFijos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAdicionalesActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAdicionalesActivosFijos.setName("jPanelImportacionAdicionalesActivosFijos"); 
		
		this.jPanelImportacionAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAdicionalesActivosFijos.setLayout(gridaBagLayoutImportacionAdicionalesActivosFijos);
		
		
		this.jInternalFrameImportacionAdicionalesActivosFijos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAdicionalesActivosFijos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAdicionalesActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAdicionalesActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAdicionalesActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAdicionalesActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAdicionalesActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAdicionalesActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAdicionalesActivosFijos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAdicionalesActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionAdicionalesActivosFijos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales Activos Fijoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAdicionalesActivosFijos = new JLabelMe();

		this.jLabelArchivoImportacionAdicionalesActivosFijos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAdicionalesActivosFijos.add(this.jLabelArchivoImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAdicionalesActivosFijos = new JFileChooser();		
		this.jFileChooserImportacionAdicionalesActivosFijos.setToolTipText("ESCOGER ARCHIVO"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAdicionalesActivosFijos = new JButtonMe();
		this.jButtonAbrirImportacionAdicionalesActivosFijos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAdicionalesActivosFijos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAdicionalesActivosFijos.setToolTipText("Generar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAdicionalesActivosFijos.add(this.jButtonAbrirImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAdicionalesActivosFijos = new JLabelMe();

		this.jLabelPathArchivoImportacionAdicionalesActivosFijos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAdicionalesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAdicionalesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAdicionalesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAdicionalesActivosFijos.add(this.jLabelPathArchivoImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAdicionalesActivosFijos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAdicionalesActivosFijos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAdicionalesActivosFijos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAdicionalesActivosFijos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAdicionalesActivosFijos.add(this.jTextFieldPathArchivoImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAdicionalesActivosFijos = new JButtonMe();
		this.jButtonGenerarImportacionAdicionalesActivosFijos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAdicionalesActivosFijos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAdicionalesActivosFijos.setToolTipText("Generar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAdicionalesActivosFijos.add(this.jButtonGenerarImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAdicionalesActivosFijos = new JButtonMe();
		this.jButtonCerrarImportacionAdicionalesActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAdicionalesActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAdicionalesActivosFijos.setToolTipText("Cancelar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAdicionalesActivosFijos.add(this.jButtonCerrarImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAdicionalesActivosFijos = new GridBagLayout();
		
		this.jScrollPanelImportacionAdicionalesActivosFijos= new JScrollPane(jPanelImportacionAdicionalesActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsAdicionalesActivosFijos.gridy =iPosYImportacion;
		this.gridBagConstraintsAdicionalesActivosFijos.gridx =iPosXImportacion;
		this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAdicionalesActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAdicionalesActivosFijos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAdicionalesActivosFijos);
		this.jInternalFrameImportacionAdicionalesActivosFijos.getContentPane().add(this.jScrollPanelImportacionAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAdicionalesActivosFijos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAdicionalesActivosFijos = new JButtonMe();
			this.jButtonAbrirOrderByAdicionalesActivosFijos.setText("Orden");
			this.jButtonAbrirOrderByAdicionalesActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAdicionalesActivosFijos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAdicionalesActivosFijos";
			inputMap = this.jButtonAbrirOrderByAdicionalesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAdicionalesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAdicionalesActivosFijos"));
		
		
			GridBagLayout gridaBagLayoutOrderByAdicionalesActivosFijos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAdicionalesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAdicionalesActivosFijos.setName("jPanelOrderByAdicionalesActivosFijos"); 
			
			this.jPanelOrderByAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAdicionalesActivosFijos.setLayout(gridaBagLayoutOrderByAdicionalesActivosFijos);
			
			
			this.jTableDatosAdicionalesActivosFijosOrderBy = new JTableMe();        
			this.jTableDatosAdicionalesActivosFijosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAdicionalesActivosFijosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAdicionalesActivosFijosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAdicionalesActivosFijosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAdicionalesActivosFijosOrderBy.setViewportView(this.jTableDatosAdicionalesActivosFijosOrderBy);
			this.jTableDatosAdicionalesActivosFijosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAdicionalesActivosFijosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAdicionalesActivosFijos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAdicionalesActivosFijos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAdicionalesActivosFijos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAdicionalesActivosFijos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAdicionalesActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAdicionalesActivosFijos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAdicionalesActivosFijos.setTitle("Orden");
			this.jInternalFrameOrderByAdicionalesActivosFijos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAdicionalesActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAdicionalesActivosFijos.setResizable(true);
			this.jInternalFrameOrderByAdicionalesActivosFijos.setClosable(true);
			this.jInternalFrameOrderByAdicionalesActivosFijos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAdicionalesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales Activos Fijoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAdicionalesActivosFijos.ipady =150;
				
			this.jPanelOrderByAdicionalesActivosFijos.add(jScrollPanelDatosAdicionalesActivosFijosOrderBy, this.gridBagConstraintsAdicionalesActivosFijos);//this.jTableDatosAdicionalesActivosFijosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAdicionalesActivosFijos = new JButtonMe();
			this.jButtonCerrarOrderByAdicionalesActivosFijos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAdicionalesActivosFijos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAdicionalesActivosFijos.setToolTipText("Cancelar"+" "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAdicionalesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAdicionalesActivosFijos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAdicionalesActivosFijos.add(this.jButtonCerrarOrderByAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAdicionalesActivosFijos = new GridBagLayout();
			
			this.jScrollPanelOrderByAdicionalesActivosFijos= new JScrollPane(jPanelOrderByAdicionalesActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAdicionalesActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsAdicionalesActivosFijos.gridy =iPosYOrderBy;
			this.gridBagConstraintsAdicionalesActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsAdicionalesActivosFijos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAdicionalesActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAdicionalesActivosFijos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAdicionalesActivosFijos);
			
			this.jInternalFrameOrderByAdicionalesActivosFijos.getContentPane().add(this.jScrollPanelOrderByAdicionalesActivosFijos, this.gridBagConstraintsAdicionalesActivosFijos);			
		
		} else {
			this.jButtonAbrirOrderByAdicionalesActivosFijos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosAdicionalesActivosFijos.getRowHeight();//AdicionalesActivosFijosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.isSelected()) {
					iHeightTable=AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAdicionalesActivosFijos.isSelected()) {
					iHeightTable=AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AdicionalesActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAdicionalesActivosFijos!=null && this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy()!=null) {
			//if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAdicionalesActivosFijos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAdicionalesActivosFijos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAdicionalesActivosFijos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAdicionalesActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAdicionalesActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAdicionalesActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=adicionalesactivosfijoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AdicionalesActivosFijos> TraerAdicionalesActivosFijosBeans(List<AdicionalesActivosFijos> adicionalesactivosfijoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijoss) {
					
				if(!(AdicionalesActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AdicionalesActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					adicionalesactivosfijos.setsDetalleGeneralEntityReporte(AdicionalesActivosFijosConstantesFunciones.getAdicionalesActivosFijosDescripcion(adicionalesactivosfijos));
										
						
					
						
					
				} else  {
							
					//adicionalesactivosfijos.setsDetalleGeneralEntityReporte(adicionalesactivosfijos.getsDetalleGeneralEntityReporte());
										
				}
				
				//adicionalesactivosfijosbeans.add(adicionalesactivosfijosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return adicionalesactivosfijoss;
    }
	//PARA REPORTES FIN
}
