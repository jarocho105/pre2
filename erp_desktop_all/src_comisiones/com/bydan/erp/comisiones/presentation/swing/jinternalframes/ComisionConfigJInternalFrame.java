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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionConfigConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionConfigJInternalFrame extends ComisionConfigBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionConfig;
	
	protected JMenuBar jmenuBarComisionConfig;
	
	protected JMenu jmenuComisionConfig;
	protected JMenu jmenuDatosComisionConfig;
	protected JMenu jmenuArchivoComisionConfig;
	protected JMenu jmenuAccionesComisionConfig;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionConfig;	
	protected GridBagConstraints gridBagConstraintsComisionConfig;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionConfigDetalleFormJInternalFrame jInternalFrameDetalleFormComisionConfig;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionConfig;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionConfig;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoComisionConfigBeanSwingJInternalFrame tipocomisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomisionconfig="";

	protected NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivellinea="";
	
	public ComisionConfigSessionBean comisionconfigSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoComisionConfigSessionBean tipocomisionconfigSessionBean;
	public NivelLineaSessionBean nivellineaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionConfig> comisionconfigs;		
	public List<ComisionConfig> comisionconfigsEliminados;	
	public List<ComisionConfig> comisionconfigsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionConfig;		
	protected JButton jButtonAbrirOrderByComisionConfig;
	
	
	//protected JPanel jPanelOrderByComisionConfig;
	//public JScrollPane jScrollPanelOrderByComisionConfig;	
	//protected JButton jButtonCerrarOrderByComisionConfig;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionConfigLogic comisionconfigLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionConfig;
	public JScrollPane jScrollPanelDatosEdicionComisionConfig;
	public JScrollPane jScrollPanelDatosGeneralComisionConfig;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionConfigOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionConfig;
	//public JScrollPane jScrollPanelImportacionComisionConfig;
	
	
	
	protected JPanel jPanelAccionesComisionConfig;
	
    protected JPanel jPanelPaginacionComisionConfig;
    protected JPanel jPanelParametrosReportesComisionConfig;
	protected JPanel jPanelParametrosReportesAccionesComisionConfig;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionConfig;
	protected JPanel jPanelParametrosAuxiliar2ComisionConfig;
	protected JPanel jPanelParametrosAuxiliar3ComisionConfig;
	protected JPanel jPanelParametrosAuxiliar4ComisionConfig;
	//protected JPanel jPanelParametrosAuxiliar5ComisionConfig;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionConfig;
	//protected JPanel jPanelImportacionComisionConfig;
	
	
	public JTable jTableDatosComisionConfig;
	
	
	
	//public JTable jTableDatosComisionConfigOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionConfig;
	protected JButton jButtonDuplicarComisionConfig;
	protected JButton jButtonCopiarComisionConfig;
	protected JButton jButtonVerFormComisionConfig;
	protected JButton jButtonNuevoRelacionesComisionConfig;
	protected JButton jButtonModificarComisionConfig;
	
    protected JButton jButtonGuardarCambiosTablaComisionConfig;
	protected JButton jButtonCerrarComisionConfig;
	
	
	protected JButton jButtonRecargarInformacionComisionConfig;
	protected JButton jButtonProcesarInformacionComisionConfig;
	
	
	protected JButton jButtonAnterioresComisionConfig;
	protected JButton jButtonSiguientesComisionConfig;
	protected JButton jButtonNuevoGuardarCambiosComisionConfig;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionConfig;
	//protected JButton jButtonCerrarReporteDinamicoComisionConfig;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionConfig;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionConfig;
	//protected JButton jButtonGenerarImportacionComisionConfig;
	//protected JButton jButtonCerrarImportacionComisionConfig;
	//protected JFileChooser jFileChooserImportacionComisionConfig;
	//protected File fileImportacionComisionConfig;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionConfig;
	protected JButton jButtonDuplicarToolBarComisionConfig;
	protected JButton jButtonNuevoRelacionesToolBarComisionConfig;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionConfig;
	protected JButton jButtonCopiarToolBarComisionConfig;
	protected JButton jButtonVerFormToolBarComisionConfig;
	public JButton jButtonGuardarCambiosTablaToolBarComisionConfig;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionConfig;
	protected JButton jButtonCerrarToolBarComisionConfig;
	
	protected JButton jButtonRecargarInformacionToolBarComisionConfig;
	protected JButton jButtonProcesarInformacionToolBarComisionConfig;
	protected JButton jButtonAnterioresToolBarComisionConfig;
	protected JButton jButtonSiguientesToolBarComisionConfig;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionConfig;
	protected JButton jButtonAbrirOrderByToolBarComisionConfig;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionConfig;
	protected JMenuItem jMenuItemDuplicarComisionConfig;
	protected JMenuItem jMenuItemNuevoRelacionesComisionConfig;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionConfig;
	protected JMenuItem jMenuItemCopiarComisionConfig;
	protected JMenuItem jMenuItemVerFormComisionConfig;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionConfig;
	protected JMenuItem jMenuItemCerrarComisionConfig;
	protected JMenuItem jMenuItemDetalleCerrarComisionConfig;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionConfig;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionConfig;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionConfig;
	protected JMenuItem jMenuItemProcesarInformacionComisionConfig;
	protected JMenuItem jMenuItemAnterioresComisionConfig;
	protected JMenuItem jMenuItemSiguientesComisionConfig;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionConfig;
	protected JMenuItem jMenuItemAbrirOrderByComisionConfig;
	protected JMenuItem jMenuItemMostrarOcultarComisionConfig;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionConfig;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionConfig;
	protected JCheckBox jCheckBoxSeleccionadosComisionConfig;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionConfig;
	protected JCheckBox jCheckBoxConGraficoReporteComisionConfig;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionConfig;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionConfig;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionConfig;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionConfig;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionConfig;
	protected JTextField jTextFieldValorCampoGeneralComisionConfig;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionConfig;
	//public JList<Reporte> jListColumnasSelectReporteComisionConfig;
	//public JScrollPane jScrollColumnasSelectReporteComisionConfig;
	
	//public JLabel jLabelRelacionesSelectReporteComisionConfig;
	//public JList<Reporte> jListRelacionesSelectReporteComisionConfig;
	//public JScrollPane jScrollRelacionesSelectReporteComisionConfig;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionConfig;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionConfig;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionConfig;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionConfig;
	
		
	//public JLabel jLabelArchivoImportacionComisionConfig;	
	//public JLabel jLabelPathArchivoImportacionComisionConfig;
	//protected JTextField jTextFieldPathArchivoImportacionComisionConfig;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionConfig;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionConfig;
	
	//public JLabel jLabelColumnaCategoriaValorComisionConfig;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionConfig;
	
	//public JLabel jLabelColumnasValoresGraficoComisionConfig;
	//public JList<Reporte> jListColumnasValoresGraficoComisionConfig;
	//public JScrollPane jScrollColumnasValoresGraficoComisionConfig;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionConfig;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionConfig;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionConfig;
	public JPanel jPanelFK_IdNivelLineaComisionConfig;
	public JButton jButtonFK_IdNivelLineaComisionConfig;
	public JPanel jPanelFK_IdTipoComisionConfigComisionConfig;
	public JButton jButtonFK_IdTipoComisionConfigComisionConfig;
	
	public JPanel jPanelid_nivel_lineaFK_IdNivelLineaComisionConfig;
	public JLabel jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig;
	public JButton jButtonid_nivel_lineaFK_IdNivelLineaComisionConfig= new JButtonMe();
	public JButton jButtonid_nivel_lineaFK_IdNivelLineaComisionConfigUpdate= new JButtonMe();
	public JButton jButtonid_nivel_lineaFK_IdNivelLineaComisionConfigBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig;
	public JLabel jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig;
	public JButton jButtonid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig= new JButtonMe();
	public JButton jButtonid_tipo_comision_configFK_IdTipoComisionConfigComisionConfigUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comision_configFK_IdTipoComisionConfigComisionConfigBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComisionConfigJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionConfig)	{
		this.jButtonRecargarInformacionComisionConfig = jButtonRecargarInformacionComisionConfig;
	}
	
	public JButton getjButtonProcesarInformacionComisionConfig() {
		return this.jButtonProcesarInformacionComisionConfig;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionConfig)	{
		this.jButtonProcesarInformacionComisionConfig = jButtonProcesarInformacionComisionConfig;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionConfig() {
		return this.jButtonRecargarInformacionComisionConfig;
	}
	
	
	public List<ComisionConfig> getcomisionconfigs() {
		return this.comisionconfigs;
	}

	public void setcomisionconfigs(List<ComisionConfig> comisionconfigs) {
		this.comisionconfigs = comisionconfigs;
	}
	
	public List<ComisionConfig> getcomisionconfigsAux() {
		return this.comisionconfigsAux;
	}

	public void setcomisionconfigsAux(List<ComisionConfig> comisionconfigsAux) {
		this.comisionconfigsAux = comisionconfigsAux;
	}
	
	public List<ComisionConfig> getcomisionconfigsEliminados() {
		return this.comisionconfigsEliminados;
	}

	public void setComisionConfigsEliminados(List<ComisionConfig> comisionconfigsEliminados) {
		this.comisionconfigsEliminados = comisionconfigsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionConfig() {
		return jComboBoxTiposSeleccionarComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionConfig(
			JComboBox jComboBoxTiposSeleccionarComisionConfig) {
		this.jComboBoxTiposSeleccionarComisionConfig = jComboBoxTiposSeleccionarComisionConfig;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionConfig .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionConfig() {
		return jTextFieldValorCampoGeneralComisionConfig;
	}

	public void setjTextFieldValorCampoGeneralComisionConfig(
			JTextField jTextFieldValorCampoGeneralComisionConfig) {
		this.jTextFieldValorCampoGeneralComisionConfig = jTextFieldValorCampoGeneralComisionConfig;
	}

	public void setBorderResaltarValorCampoGeneralComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionConfig .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionConfig() {
		return this.jCheckBoxSeleccionarTodosComisionConfig;
	}

	public void setjCheckBoxSeleccionarTodosComisionConfig(
			JCheckBox jCheckBoxSeleccionarTodosComisionConfig) {
		this.jCheckBoxSeleccionarTodosComisionConfig = jCheckBoxSeleccionarTodosComisionConfig;
	}

	public void setBorderResaltarSeleccionarTodosComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionConfig .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionConfig() {
		return this.jCheckBoxSeleccionadosComisionConfig;
	}

	public void setjCheckBoxSeleccionadosComisionConfig(
			JCheckBox jCheckBoxSeleccionadosComisionConfig) {
		this.jCheckBoxSeleccionadosComisionConfig = jCheckBoxSeleccionadosComisionConfig;
	}
	
	public void setBorderResaltarSeleccionadosComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionConfig .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionConfig() {
		return this.jComboBoxTiposArchivosReportesComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionConfig(
			JComboBox jComboBoxTiposArchivosReportesComisionConfig) {
		this.jComboBoxTiposArchivosReportesComisionConfig = jComboBoxTiposArchivosReportesComisionConfig;
	}

	public void setBorderResaltarTiposArchivosReportesComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionConfig() {
		return this.jComboBoxTiposReportesComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionConfig(
			JComboBox jComboBoxTiposReportesComisionConfig) {
		this.jComboBoxTiposReportesComisionConfig = jComboBoxTiposReportesComisionConfig;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionConfig() {
	//	return jComboBoxTiposReportesDinamicoComisionConfig;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionConfig(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionConfig) {
	//	this.jComboBoxTiposReportesDinamicoComisionConfig = jComboBoxTiposReportesDinamicoComisionConfig;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionConfig() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionConfig;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionConfig(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionConfig) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionConfig = jComboBoxTiposArchivosReportesDinamicoComisionConfig;
	//}
	
	public void setBorderResaltarTiposReportesComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionConfig() {
		return this.jComboBoxTiposGraficosReportesComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionConfig(
			JComboBox jComboBoxTiposGraficosReportesComisionConfig) {
		this.jComboBoxTiposGraficosReportesComisionConfig = jComboBoxTiposGraficosReportesComisionConfig;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionConfig() {
		return this.jComboBoxTiposPaginacionComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionConfig(
			JComboBox jComboBoxTiposPaginacionComisionConfig) {
		this.jComboBoxTiposPaginacionComisionConfig = jComboBoxTiposPaginacionComisionConfig;
	}
	
	public void setBorderResaltarTiposPaginacionComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionConfig() {
		return this.jComboBoxTiposRelacionesComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionConfig() {
		return this.jComboBoxTiposAccionesComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionConfig(
			JComboBox jComboBoxTiposRelacionesComisionConfig) {
		this.jComboBoxTiposRelacionesComisionConfig = jComboBoxTiposRelacionesComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionConfig(
			JComboBox jComboBoxTiposAccionesComisionConfig) {
		this.jComboBoxTiposAccionesComisionConfig = jComboBoxTiposAccionesComisionConfig;
	}
	
	public void setBorderResaltarTiposRelacionesComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionConfig .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionConfig .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionConfig() {
	//	return jCheckBoxConGraficoDinamicoComisionConfig;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionConfig(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionConfig) {
	//	this.jCheckBoxConGraficoDinamicoComisionConfig = jCheckBoxConGraficoDinamicoComisionConfig;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionConfig() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionConfig.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionConfig .setBorder(borderResaltar);		
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
		this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		
		this.comisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionconfigSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionConfigJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Config MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionConfig= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"nuevo","nuevo","Nuevo"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"duplicar","duplicar","Duplicar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"copiar","copiar","Copiar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"ver_form","ver_form","Ver"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"recargar","recargar","Recargar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionConfig,this.jTtoolBarComisionConfig,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionConfig,this.jTtoolBarComisionConfig,
							"cerrar","cerrar","Salir"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionConfig=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionConfig;
			
				this.jButtonProcesarInformacionToolBarComisionConfig=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionConfig;
				
		//protected JButton jButtonModificarToolBarComisionConfig;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionConfig=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionConfig=new JMenuMe("General");
		this.jmenuArchivoComisionConfig=new JMenuMe("Archivo");
		this.jmenuAccionesComisionConfig=new JMenuMe("Acciones");
		this.jmenuDatosComisionConfig=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionConfig= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionConfig.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionConfig,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionConfig= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionConfig.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionConfig,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionConfig= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionConfig.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionConfig,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionConfig= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionConfig.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionConfig,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionConfig= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionConfig.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionConfig,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionConfig= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionConfig.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionConfig,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionConfig= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionConfig.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionConfig,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionConfig= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionConfig.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionConfig,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionConfig= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionConfig.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionConfig,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionConfig= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionConfig.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionConfig,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionConfig= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionConfig.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionConfig,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionConfig= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionConfig.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionConfig,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionConfig= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionConfig.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionConfig,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionConfig= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionConfig.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionConfig,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionConfig= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionConfig.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionConfig,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionConfig.add(this.jMenuItemCerrarComisionConfig);
			
			this.jmenuAccionesComisionConfig.add(this.jMenuItemNuevoComisionConfig);
			this.jmenuAccionesComisionConfig.add(this.jMenuItemNuevoGuardarCambiosComisionConfig);
			this.jmenuAccionesComisionConfig.add(this.jMenuItemNuevoRelacionesComisionConfig);
			this.jmenuAccionesComisionConfig.add(this.jMenuItemGuardarCambiosTablaComisionConfig);		
			this.jmenuAccionesComisionConfig.add(this.jMenuItemDuplicarComisionConfig);		
			this.jmenuAccionesComisionConfig.add(this.jMenuItemCopiarComisionConfig);		
			this.jmenuAccionesComisionConfig.add(this.jMenuItemVerFormComisionConfig);		
			
			this.jmenuDatosComisionConfig.add(this.jMenuItemRecargarInformacionComisionConfig);				
			this.jmenuDatosComisionConfig.add(this.jMenuItemAnterioresComisionConfig);				
			this.jmenuDatosComisionConfig.add(this.jMenuItemSiguientesComisionConfig);				
			this.jmenuDatosComisionConfig.add(this.jMenuItemAbrirOrderByComisionConfig);				
			this.jmenuDatosComisionConfig.add(this.jMenuItemMostrarOcultarComisionConfig);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionConfig.add(this.jMenuItemGuardarCambiosComisionConfig);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionConfig.add(this.jmenuArchivoComisionConfig);		
			this.jmenuBarComisionConfig.add(this.jmenuAccionesComisionConfig);		
			this.jmenuBarComisionConfig.add(this.jmenuDatosComisionConfig);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionConfig);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionConfig() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdNivelLineaComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNivelLineaComisionConfig.setToolTipText("Buscar Por Nivel Linea ");
		this.jButtonFK_IdNivelLineaComisionConfig= new JButtonMe();
		this.jButtonFK_IdNivelLineaComisionConfig.setText("Buscar");
		this.jButtonFK_IdNivelLineaComisionConfig.setToolTipText("Buscar Por Nivel Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNivelLineaComisionConfig,"buscar_button","Buscar Por Nivel Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNivelLineaComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig = new JLabelMe();
		jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig.setText("Nivel Linea :");
		jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig.setToolTipText("Nivel Linea");
		jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig= new JComboBoxMe();
		jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoComisionConfigComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComisionConfigComisionConfig.setToolTipText("Buscar Por Tipo Configuracion ");
		this.jButtonFK_IdTipoComisionConfigComisionConfig= new JButtonMe();
		this.jButtonFK_IdTipoComisionConfigComisionConfig.setText("Buscar");
		this.jButtonFK_IdTipoComisionConfigComisionConfig.setToolTipText("Buscar Por Tipo Configuracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComisionConfigComisionConfig,"buscar_button","Buscar Por Tipo Configuracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComisionConfigComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig = new JLabelMe();
		jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setText("Tipo Configuracion :");
		jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setToolTipText("Tipo Configuracion");
		jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig= new JComboBoxMe();
		jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComisionConfig=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionConfig.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionConfig.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionConfig.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionConfig.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionConfig = new ComisionConfigDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comision Config DATOS");
			this.jInternalFrameDetalleFormComisionConfig = new ComisionConfigDetalleFormJInternalFrame(jDesktopPane,this.comisionconfigSessionBean.getConGuardarRelaciones(),this.comisionconfigSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionConfig = null;//new ComisionConfigDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionConfig= new GridBagLayout();
		
		
		this.jTableDatosComisionConfig = new JTableMe();      
		
		String sToolTipComisionConfig="";
		sToolTipComisionConfig=ComisionConfigConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionConfig+="(Comisiones.ComisionConfig)";
		}
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionConfig+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionConfig.setToolTipText(sToolTipComisionConfig);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionConfig);
		this.jTableDatosComisionConfig.setAutoCreateRowSorter(true);
		this.jTableDatosComisionConfig.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionConfig.setRowSelectionAllowed(true);
		this.jTableDatosComisionConfig.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionConfig = new JButtonMe();
		this.jButtonDuplicarComisionConfig = new JButtonMe();
		this.jButtonCopiarComisionConfig = new JButtonMe();
		this.jButtonVerFormComisionConfig = new JButtonMe();
		this.jButtonNuevoRelacionesComisionConfig = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionConfig = new JButtonMe();
		this.jButtonCerrarComisionConfig = new JButtonMe();
		
		this.jScrollPanelDatosComisionConfig = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionConfig = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Config";
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Configes" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionConfig.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionConfig.setToolTipText("Acciones");
        this.jPanelAccionesComisionConfig.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisionConfig=new ReporteDinamicoJInternalFrame(ComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionConfig();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionConfig=new ImportacionJInternalFrame(ComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionConfig();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionConfig = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionConfig.setText("Orden");
		this.jButtonAbrirOrderByComisionConfig.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionConfig,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionConfig,false,this);
			
			//this.cargarOrderByComisionConfig(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionConfig,true,this);
			
			//this.cargarOrderByComisionConfig(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionConfig.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosComisionConfig.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosComisionConfig.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosComisionConfig.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionConfig.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionConfig.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionConfig.setText("Nuevo");
		this.jButtonDuplicarComisionConfig.setText("Duplicar");
		this.jButtonCopiarComisionConfig.setText("Copiar");
		this.jButtonVerFormComisionConfig.setText("Ver");
		this.jButtonNuevoRelacionesComisionConfig.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionConfig.setText("Guardar");
		this.jButtonCerrarComisionConfig.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionConfig,"nuevo_button","Nuevo",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionConfig,"duplicar_button","Duplicar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionConfig,"copiar_button","Copiar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionConfig,"ver_form","Ver",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionConfig,"nuevorelaciones_button","Nuevo Rel",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionConfig,"guardarcambiostabla_button","Guardar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionConfig,"cerrar_button","Salir",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionConfig.setToolTipText("Nuevo"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionConfig.setToolTipText("Duplicar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionConfig.setToolTipText("Copiar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionConfig.setToolTipText("Ver"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionConfig.setToolTipText("Nuevo Rel"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionConfig.setToolTipText("Guardar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionConfig.setToolTipText("Salir"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionConfig";
		inputMap = this.jButtonNuevoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionConfig"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionConfig";
		inputMap = this.jButtonDuplicarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionConfig"));
		
		//COPIAR
		sMapKey = "CopiarComisionConfig";
		inputMap = this.jButtonCopiarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionConfig"));
		
		//VEr FORM
		sMapKey = "VerFormComisionConfig";
		inputMap = this.jButtonVerFormComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionConfig"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionConfig";
		inputMap = this.jButtonNuevoRelacionesComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionConfig"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionConfig";
		inputMap = this.jButtonModificarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionConfig"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionConfig";
		inputMap = this.jButtonCerrarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionConfig"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionConfig";
		inputMap = this.jButtonGuardarCambiosTablaComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionConfig"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionConfig.setName("jPanelParametrosReportesComisionConfig"); 
		
		this.jPanelParametrosReportesAccionesComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionConfig.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionConfig.setName("jPanelParametrosReportesAccionesComisionConfig"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionConfig = new JButtonMe();
		this.jButtonRecargarInformacionComisionConfig.setText("Recargar");
		this.jButtonRecargarInformacionComisionConfig.setToolTipText("Recargar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionConfig,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionConfig = new JButtonMe();
		this.jButtonProcesarInformacionComisionConfig.setText("Procesar");
		this.jButtonProcesarInformacionComisionConfig.setToolTipText("Procesar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionConfig.setVisible(false);
			
		this.jButtonProcesarInformacionComisionConfig.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionConfig.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionConfig.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionConfig.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionConfig.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionConfig.setText("TIPO");       
		this.jComboBoxTiposReportesComisionConfig.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionConfig.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionConfig.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionConfig.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionConfig.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionConfig.setText("Accion");
		this.jComboBoxTiposRelacionesComisionConfig.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionConfig.setText("Accion");
		this.jComboBoxTiposAccionesComisionConfig.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionConfig.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionConfig.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionConfig=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionConfig.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionConfig.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionConfig.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionConfig = new JLabelMe();
		
		this.jLabelAccionesComisionConfig.setText("Acciones");		
		this.jLabelAccionesComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionConfig = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionConfig.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionConfig.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionConfig = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionConfig.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionConfig.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionConfig = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionConfig.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionConfig.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionConfig = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionConfig.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionConfig.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionConfig = new JButtonMe();
		//this.jButtonAnterioresComisionConfig.setText("<<");
        this.jButtonAnterioresComisionConfig.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionConfig,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionConfig = new JButtonMe();
		//this.jButtonSiguientesComisionConfig.setText(">>");
        this.jButtonSiguientesComisionConfig.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionConfig,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionConfig = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionConfig.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionConfig.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionConfig,"nuevoguardarcambios_button","Nue",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionConfig";
		inputMap = this.jButtonNuevoGuardarCambiosComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionConfig"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionConfig";
		inputMap = this.jButtonRecargarInformacionComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionConfig"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionConfig";
		inputMap = this.jButtonSiguientesComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionConfig"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionConfig";
		inputMap = this.jButtonAnterioresComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionConfig"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionConfig();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionConfig.setMinimumSize(new Dimension(this.getWidth(),ComisionConfigBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionConfigBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionConfig.setMaximumSize(new Dimension(this.getWidth(),ComisionConfigBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionConfigBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionConfig.setPreferredSize(new Dimension(this.getWidth(),ComisionConfigBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionConfigBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionConfig = new GridBagLayout();

			this.jPanelPaginacionComisionConfig.setLayout(gridaBagLayoutPaginacionComisionConfig);						
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 0;
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionConfig.add(this.jButtonAnterioresComisionConfig, this.gridBagConstraintsComisionConfig);
					
						
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionConfig.gridy = 0;
			
			this.jPanelPaginacionComisionConfig.add(this.jButtonNuevoGuardarCambiosComisionConfig, this.gridBagConstraintsComisionConfig);
						
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionConfig.gridy = 0;
			this.jPanelPaginacionComisionConfig.add(this.jButtonSiguientesComisionConfig, this.gridBagConstraintsComisionConfig);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 1;
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionConfig.add(this.jButtonNuevoComisionConfig, this.gridBagConstraintsComisionConfig);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionConfig.gridy = 1;
				this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionComisionConfig.add(this.jButtonNuevoRelacionesComisionConfig, this.gridBagConstraintsComisionConfig);
			}
			
			
			if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionConfig.gridy = 1;
				this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionConfig.add(this.jButtonGuardarCambiosTablaComisionConfig, this.gridBagConstraintsComisionConfig);
			}
			
			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 1;
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionConfig.add(this.jButtonDuplicarComisionConfig, this.gridBagConstraintsComisionConfig);
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 1;
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionConfig.add(this.jButtonCopiarComisionConfig, this.gridBagConstraintsComisionConfig);
		
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 1;
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionConfig.add(this.jButtonVerFormComisionConfig, this.gridBagConstraintsComisionConfig);
		
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 1;
			this.gridBagConstraintsComisionConfig.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionConfig.add(this.jButtonCerrarComisionConfig, this.gridBagConstraintsComisionConfig);
		
		
		
		this.jButtonRecargarInformacionComisionConfig.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionConfig.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionConfig.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionConfig.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionConfig.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionConfig.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionConfig.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionConfig.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionConfig.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionConfig.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionConfig.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionConfig.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionConfig.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionConfig.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionConfig.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionConfig.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionConfig.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionConfig.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionConfig.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionConfig.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionConfig.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionConfig.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionConfig.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionConfig.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionConfig.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionConfig.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionConfig.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionConfig = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionConfig = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionConfig.setLayout(gridaBagParametrosReportesComisionConfig);
			this.jPanelParametrosReportesAccionesComisionConfig.setLayout(gridaBagParametrosReportesAccionesComisionConfig);
			
			
			this.jPanelParametrosAuxiliar1ComisionConfig.setLayout(gridaBagParametrosAuxiliar1ComisionConfig);
			this.jPanelParametrosAuxiliar2ComisionConfig.setLayout(gridaBagParametrosAuxiliar2ComisionConfig);
			this.jPanelParametrosAuxiliar3ComisionConfig.setLayout(gridaBagParametrosAuxiliar3ComisionConfig);
			this.jPanelParametrosAuxiliar4ComisionConfig.setLayout(gridaBagParametrosAuxiliar4ComisionConfig);
			//this.jPanelParametrosAuxiliar5ComisionConfig.setLayout(gridaBagParametrosAuxiliar2ComisionConfig);			
			
			
			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionConfig.add(this.jButtonRecargarInformacionComisionConfig, this.gridBagConstraintsComisionConfig);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionConfig.add(this.jComboBoxTiposPaginacionComisionConfig, this.gridBagConstraintsComisionConfig);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionConfig.add(this.jCheckBoxConAltoMaximoTablaComisionConfig, this.gridBagConstraintsComisionConfig);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionConfig.add(this.jComboBoxTiposArchivosReportesComisionConfig, this.gridBagConstraintsComisionConfig);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionConfig.add(this.jPanelParametrosAuxiliar1ComisionConfig, this.gridBagConstraintsComisionConfig);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionConfig.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionConfig.add(this.jComboBoxTiposReportesComisionConfig, this.gridBagConstraintsComisionConfig);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionConfig.add(this.jPanelParametrosAuxiliar4ComisionConfig, this.gridBagConstraintsComisionConfig);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionConfig.add(this.jComboBoxTiposReportesComisionConfig, this.gridBagConstraintsComisionConfig);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionConfig.add(this.jCheckBoxGenerarReporteComisionConfig, this.gridBagConstraintsComisionConfig);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionConfig.add(this.jPanelParametrosAuxiliar2ComisionConfig, this.gridBagConstraintsComisionConfig);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionConfig.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionConfig.add(this.jLabelAccionesComisionConfig, this.gridBagConstraintsComisionConfig);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionConfig.add(this.jButtonAbrirOrderByComisionConfig, this.gridBagConstraintsComisionConfig);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionConfig.add(this.jComboBoxTiposSeleccionarComisionConfig, this.gridBagConstraintsComisionConfig);			
			
			
			/*
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionConfig.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionConfig.add(this.jCheckBoxSeleccionarTodosComisionConfig, this.gridBagConstraintsComisionConfig);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionConfig.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionConfig.add(this.jCheckBoxSeleccionarTodosComisionConfig, this.gridBagConstraintsComisionConfig);															
				
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionConfig.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionConfig.add(this.jCheckBoxSeleccionadosComisionConfig, this.gridBagConstraintsComisionConfig);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionConfig.add(this.jPanelParametrosAuxiliar3ComisionConfig, this.gridBagConstraintsComisionConfig);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionConfig.add(this.jComboBoxTiposRelacionesComisionConfig, this.gridBagConstraintsComisionConfig);
				
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionConfig.add(this.jComboBoxTiposAccionesComisionConfig, this.gridBagConstraintsComisionConfig);
	
				
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionConfig.add(this.jTextFieldValorCampoGeneralComisionConfig, this.gridBagConstraintsComisionConfig);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionConfig = new GridBagLayout();

			this.jScrollPanelDatosComisionConfig.setLayout(gridaBagLayoutDatosComisionConfig);
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = 0;
			this.gridBagConstraintsComisionConfig.gridx = 0;
			
			this.jScrollPanelDatosComisionConfig.add(this.jTableDatosComisionConfig, this.gridBagConstraintsComisionConfig);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionConfig.setViewportView(this.jTableDatosComisionConfig);
		this.jTableDatosComisionConfig.setFillsViewportHeight(true);
		this.jTableDatosComisionConfig.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionConfig= new GridBagLayout();
		this.jPanelAccionesComisionConfig.setLayout(gridaBagLayoutAccionesComisionConfig);
		
		
		/*	
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 0;
			
		this.jPanelAccionesComisionConfig.add(this.jButtonNuevoComisionConfig, this.gridBagConstraintsComisionConfig);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdNivelLineaComisionConfig= new GridBagLayout();
		gridaBagLayoutFK_IdNivelLineaComisionConfig.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNivelLineaComisionConfig.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNivelLineaComisionConfig.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNivelLineaComisionConfig.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNivelLineaComisionConfig.setLayout(gridaBagLayoutFK_IdNivelLineaComisionConfig);

		gridBagConstraintsComisionConfig = new GridBagConstraints();
		gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionConfig.gridy = 0;
		gridBagConstraintsComisionConfig.gridx = 0;
		jPanelFK_IdNivelLineaComisionConfig.add(jLabelid_nivel_lineaFK_IdNivelLineaComisionConfig, gridBagConstraintsComisionConfig);

		gridBagConstraintsComisionConfig = new GridBagConstraints();
		gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionConfig.gridy = 0;
		gridBagConstraintsComisionConfig.gridx = 1;
		jPanelFK_IdNivelLineaComisionConfig.add(jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig, gridBagConstraintsComisionConfig);

		gridBagConstraintsComisionConfig = new GridBagConstraints();
		gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionConfig.gridy = 1;
		gridBagConstraintsComisionConfig.gridx =1;
		jPanelFK_IdNivelLineaComisionConfig.add(jButtonFK_IdNivelLineaComisionConfig, gridBagConstraintsComisionConfig);

		jTabbedPaneBusquedasComisionConfig.addTab("1.-Por Nivel Linea ", jPanelFK_IdNivelLineaComisionConfig);
		jTabbedPaneBusquedasComisionConfig.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoComisionConfigComisionConfig= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComisionConfigComisionConfig.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComisionConfigComisionConfig.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComisionConfigComisionConfig.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComisionConfigComisionConfig.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComisionConfigComisionConfig.setLayout(gridaBagLayoutFK_IdTipoComisionConfigComisionConfig);

		gridBagConstraintsComisionConfig = new GridBagConstraints();
		gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionConfig.gridy = 0;
		gridBagConstraintsComisionConfig.gridx = 0;
		jPanelFK_IdTipoComisionConfigComisionConfig.add(jLabelid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig, gridBagConstraintsComisionConfig);

		gridBagConstraintsComisionConfig = new GridBagConstraints();
		gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionConfig.gridy = 0;
		gridBagConstraintsComisionConfig.gridx = 1;
		jPanelFK_IdTipoComisionConfigComisionConfig.add(jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig, gridBagConstraintsComisionConfig);

		gridBagConstraintsComisionConfig = new GridBagConstraints();
		gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionConfig.gridy = 1;
		gridBagConstraintsComisionConfig.gridx =1;
		jPanelFK_IdTipoComisionConfigComisionConfig.add(jButtonFK_IdTipoComisionConfigComisionConfig, gridBagConstraintsComisionConfig);

		jTabbedPaneBusquedasComisionConfig.addTab("2.-Por Tipo Configuracion ", jPanelFK_IdTipoComisionConfigComisionConfig);
		jTabbedPaneBusquedasComisionConfig.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionConfig = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionConfig);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();						
			this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionConfig.gridx = 0;		
			//this.gridBagConstraintsComisionConfig.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionConfig.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionConfig, this.gridBagConstraintsComisionConfig);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionConfig.gridx = 0;		
		//this.gridBagConstraintsComisionConfig.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionConfig.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionConfig);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionConfig.gridx = 0;		
			this.gridBagConstraintsComisionConfig.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComisionConfig.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComisionConfig, this.gridBagConstraintsComisionConfig);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionConfig, this.gridBagConstraintsComisionConfig);								
		
		
		/*
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionConfig, this.gridBagConstraintsComisionConfig);
		*/		
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionConfig.gridx =0;
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionConfig.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionConfig, this.gridBagConstraintsComisionConfig);
				
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionConfig, this.gridBagConstraintsComisionConfig);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionConfig = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionConfig.setLayout(gridaBagLayoutBusquedasParametrosComisionConfig);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionConfig=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionConfig, this.gridBagConstraintsComisionConfig);
			
			
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionConfig, this.gridBagConstraintsComisionConfig);
		
			
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionConfig, this.gridBagConstraintsComisionConfig);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionConfig;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionConfig() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionConfig = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionConfig.setName("jPanelReporteDinamicoComisionConfig"); 
		
		this.jPanelReporteDinamicoComisionConfig.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionConfig.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionConfig.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionConfig.setLayout(gridaBagLayoutReporteDinamicoComisionConfig);
		
		
		this.jInternalFrameReporteDinamicoComisionConfig= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionConfig = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionConfig= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionConfig.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionConfig.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionConfig.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionConfig.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionConfig.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionConfig.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionConfig.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionConfig.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionConfig.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Configes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionConfig = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionConfig.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionConfig.add(this.jLabelColumnasSelectReporteComisionConfig, this.gridBagConstraintsComisionConfig);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionConfig = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionConfig.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionConfig.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionConfig.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionConfig.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionConfig.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionConfig=new JScrollPane(this.jListColumnasSelectReporteComisionConfig);
			
			this.jScrollColumnasSelectReporteComisionConfig.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionConfig.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionConfig.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionConfig.add(this.jListColumnasSelectReporteComisionConfig, this.gridBagConstraintsComisionConfig);
		this.jPanelReporteDinamicoComisionConfig.add(this.jScrollColumnasSelectReporteComisionConfig, this.gridBagConstraintsComisionConfig);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionConfig = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionConfig.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionConfig.add(this.jLabelRelacionesSelectReporteComisionConfig, this.gridBagConstraintsComisionConfig);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionConfig = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionConfig.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionConfig.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionConfig.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionConfig.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionConfig.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionConfig=new JScrollPane(this.jListRelacionesSelectReporteComisionConfig);
			
			this.jScrollRelacionesSelectReporteComisionConfig.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionConfig.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionConfig.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionConfig.add(this.jListRelacionesSelectReporteComisionConfig, this.gridBagConstraintsComisionConfig);
		this.jPanelReporteDinamicoComisionConfig.add(this.jScrollRelacionesSelectReporteComisionConfig, this.gridBagConstraintsComisionConfig);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoComisionConfig = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionConfig = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionConfig = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionConfig = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionConfig.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionConfig.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionConfig.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionConfig.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionConfig = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionConfig.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionConfig.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionConfig.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionConfig.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionConfig = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionConfig.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionConfig.add(this.jLabelGenerarExcelReporteDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionConfig = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionConfig.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionConfig,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionConfig.setToolTipText("Generar EXCEL"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionConfig.add(this.jButtonGenerarExcelReporteDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionConfig.add(this.jComboBoxTiposReportesDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionConfig = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionConfig.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionConfig.add(this.jLabelTiposArchivoReporteDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionConfig.add(this.jComboBoxTiposArchivosReportesDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionConfig = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionConfig.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionConfig,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionConfig.setToolTipText("Generar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionConfig.add(this.jButtonGenerarReporteDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionConfig = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionConfig.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionConfig,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionConfig.setToolTipText("Cancelar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionConfig.add(this.jButtonCerrarReporteDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionConfig = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionConfig= new JScrollPane(jPanelReporteDinamicoComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionConfig.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionConfig.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionConfig.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Configes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionConfig.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionConfig.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionConfig.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionConfig);
		this.jInternalFrameReporteDinamicoComisionConfig.getContentPane().add(this.jScrollPanelReporteDinamicoComisionConfig, this.gridBagConstraintsComisionConfig);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionConfig() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionConfig = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionConfig.setName("jPanelImportacionComisionConfig"); 
		
		this.jPanelImportacionComisionConfig.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionConfig.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionConfig.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionConfig.setLayout(gridaBagLayoutImportacionComisionConfig);
		
		
		this.jInternalFrameImportacionComisionConfig= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionConfig= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionConfig = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionConfig= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionConfig.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionConfig.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionConfig.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionConfig.setResizable(true);
	    this.jInternalFrameImportacionComisionConfig.setClosable(true);
	    this.jInternalFrameImportacionComisionConfig.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionConfig.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionConfig.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionConfig.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionConfig.setResizable(true);
	    this.jInternalFrameImportacionComisionConfig.setClosable(true);
	    this.jInternalFrameImportacionComisionConfig.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionConfig.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionConfig.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionConfig.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Configes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionConfig = new JLabelMe();

		this.jLabelArchivoImportacionComisionConfig.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionConfig.add(this.jLabelArchivoImportacionComisionConfig, this.gridBagConstraintsComisionConfig);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionConfig = new JFileChooser();		
		this.jFileChooserImportacionComisionConfig.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionConfig = new JButtonMe();
		this.jButtonAbrirImportacionComisionConfig.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionConfig,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionConfig.setToolTipText("Generar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionConfig.add(this.jButtonAbrirImportacionComisionConfig, this.gridBagConstraintsComisionConfig);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionConfig = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionConfig.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionConfig.add(this.jLabelPathArchivoImportacionComisionConfig, this.gridBagConstraintsComisionConfig);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionConfig=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionConfig.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionConfig.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionConfig.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionConfig.add(this.jTextFieldPathArchivoImportacionComisionConfig, this.gridBagConstraintsComisionConfig);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionConfig = new JButtonMe();
		this.jButtonGenerarImportacionComisionConfig.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionConfig,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionConfig.setToolTipText("Generar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionConfig.add(this.jButtonGenerarImportacionComisionConfig, this.gridBagConstraintsComisionConfig);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionConfig = new JButtonMe();
		this.jButtonCerrarImportacionComisionConfig.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionConfig,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionConfig.setToolTipText("Cancelar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionConfig.add(this.jButtonCerrarImportacionComisionConfig, this.gridBagConstraintsComisionConfig);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionConfig = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionConfig= new JScrollPane(jPanelImportacionComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionConfig.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionConfig.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionConfig.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionConfig);
		this.jInternalFrameImportacionComisionConfig.getContentPane().add(this.jScrollPanelImportacionComisionConfig, this.gridBagConstraintsComisionConfig);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionConfig(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionConfig = new JButtonMe();
			this.jButtonAbrirOrderByComisionConfig.setText("Orden");
			this.jButtonAbrirOrderByComisionConfig.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionConfig,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionConfig";
			inputMap = this.jButtonAbrirOrderByComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionConfig"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionConfig = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionConfig.setName("jPanelOrderByComisionConfig"); 
			
			this.jPanelOrderByComisionConfig.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionConfig.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionConfig.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionConfig.setLayout(gridaBagLayoutOrderByComisionConfig);
			
			
			this.jTableDatosComisionConfigOrderBy = new JTableMe();        
			this.jTableDatosComisionConfigOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionConfigOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionConfigOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionConfigOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionConfigOrderBy.setViewportView(this.jTableDatosComisionConfigOrderBy);
			this.jTableDatosComisionConfigOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionConfigOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionConfig= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionConfig= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionConfig = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionConfig= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionConfig.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionConfig.setTitle("Orden");
			this.jInternalFrameOrderByComisionConfig.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionConfig.setResizable(true);
			this.jInternalFrameOrderByComisionConfig.setClosable(true);
			this.jInternalFrameOrderByComisionConfig.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionConfig.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionConfig.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionConfig.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Configes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionConfig.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionConfig.ipady =150;
				
			this.jPanelOrderByComisionConfig.add(jScrollPanelDatosComisionConfigOrderBy, this.gridBagConstraintsComisionConfig);//this.jTableDatosComisionConfigTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionConfig = new JButtonMe();
			this.jButtonCerrarOrderByComisionConfig.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionConfig,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionConfig.setToolTipText("Cancelar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionConfig.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionConfig.add(this.jButtonCerrarOrderByComisionConfig, this.gridBagConstraintsComisionConfig);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionConfig = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionConfig= new JScrollPane(jPanelOrderByComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionConfig.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionConfig.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionConfig.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionConfig);
			
			this.jInternalFrameOrderByComisionConfig.getContentPane().add(this.jScrollPanelOrderByComisionConfig, this.gridBagConstraintsComisionConfig);			
		
		} else {
			this.jButtonAbrirOrderByComisionConfig = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisionconfigSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionConfig.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionConfig.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionConfig.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionConfig.getRowHeight();//ComisionConfigConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionConfig.isSelected()) {
					iHeightTable=ComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionConfig.isSelected()) {
					iHeightTable=ComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionConfig.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionConfig.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionConfig.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionConfig.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionConfig.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionConfig.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionConfig!=null && this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy()!=null) {
			//if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionConfig.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionConfig.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionConfig.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionConfig.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionConfig.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionConfig.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisionconfigLogic.getComisionConfigs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionconfigs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionConfig> TraerComisionConfigBeans(List<ComisionConfig> comisionconfigs,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionConfig comisionconfig:comisionconfigs) {
					
				if(!(ComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisionconfig.setsDetalleGeneralEntityReporte(ComisionConfigConstantesFunciones.getComisionConfigDescripcion(comisionconfig));
										
					comisionconfig.setcon_vendedor_descripcion(ComisionConfigConstantesFunciones.getcon_vendedorDescripcion(comisionconfig));comisionconfig.setcon_ventas_descripcion(ComisionConfigConstantesFunciones.getcon_ventasDescripcion(comisionconfig));comisionconfig.setcon_cobros_descripcion(ComisionConfigConstantesFunciones.getcon_cobrosDescripcion(comisionconfig));comisionconfig.setcon_remesa_transito_descripcion(ComisionConfigConstantesFunciones.getcon_remesa_transitoDescripcion(comisionconfig));comisionconfig.setcon_penalidad_descripcion(ComisionConfigConstantesFunciones.getcon_penalidadDescripcion(comisionconfig));comisionconfig.setcon_abono_descripcion(ComisionConfigConstantesFunciones.getcon_abonoDescripcion(comisionconfig));	
					
					

					if(comisionconfig.getComisionCates()!=null && Funciones.existeClass(classes,ComisionCate.class)) {
						try{comisionconfig.setcomisioncatesDescripcionReporte(new JRBeanCollectionDataSource(ComisionCateJInternalFrame.TraerComisionCateBeans(comisionconfig.getComisionCates(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(comisionconfig.getComisionMarcas()!=null && Funciones.existeClass(classes,ComisionMarca.class)) {
						try{comisionconfig.setcomisionmarcasDescripcionReporte(new JRBeanCollectionDataSource(ComisionMarcaJInternalFrame.TraerComisionMarcaBeans(comisionconfig.getComisionMarcas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(comisionconfig.getComisionLineas()!=null && Funciones.existeClass(classes,ComisionLinea.class)) {
						try{comisionconfig.setcomisionlineasDescripcionReporte(new JRBeanCollectionDataSource(ComisionLineaJInternalFrame.TraerComisionLineaBeans(comisionconfig.getComisionLineas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(comisionconfig.getComisionPenas()!=null && Funciones.existeClass(classes,ComisionPena.class)) {
						try{comisionconfig.setcomisionpenasDescripcionReporte(new JRBeanCollectionDataSource(ComisionPenaJInternalFrame.TraerComisionPenaBeans(comisionconfig.getComisionPenas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(comisionconfig.getComisionGrupos()!=null && Funciones.existeClass(classes,ComisionGrupo.class)) {
						try{comisionconfig.setcomisiongruposDescripcionReporte(new JRBeanCollectionDataSource(ComisionGrupoJInternalFrame.TraerComisionGrupoBeans(comisionconfig.getComisionGrupos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//comisionconfig.setsDetalleGeneralEntityReporte(comisionconfig.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisionconfigbeans.add(comisionconfigbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisionconfigs;
    }
	//PARA REPORTES FIN
}
