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
import com.bydan.erp.activosfijos.util.GastoDepreciacionConstantesFunciones;

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
public class GastoDepreciacionJInternalFrame extends GastoDepreciacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGastoDepreciacion;
	
	protected JMenuBar jmenuBarGastoDepreciacion;
	
	protected JMenu jmenuGastoDepreciacion;
	protected JMenu jmenuDatosGastoDepreciacion;
	protected JMenu jmenuArchivoGastoDepreciacion;
	protected JMenu jmenuAccionesGastoDepreciacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGastoDepreciacion;	
	protected GridBagConstraints gridBagConstraintsGastoDepreciacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GastoDepreciacionDetalleFormJInternalFrame jInternalFrameDetalleFormGastoDepreciacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGastoDepreciacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGastoDepreciacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";
	
	public GastoDepreciacionSessionBean gastodepreciacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GastoDepreciacion> gastodepreciacions;		
	public List<GastoDepreciacion> gastodepreciacionsEliminados;	
	public List<GastoDepreciacion> gastodepreciacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGastoDepreciacion;		
	protected JButton jButtonAbrirOrderByGastoDepreciacion;
	
	
	//protected JPanel jPanelOrderByGastoDepreciacion;
	//public JScrollPane jScrollPanelOrderByGastoDepreciacion;	
	//protected JButton jButtonCerrarOrderByGastoDepreciacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GastoDepreciacionLogic gastodepreciacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGastoDepreciacion;
	public JScrollPane jScrollPanelDatosEdicionGastoDepreciacion;
	public JScrollPane jScrollPanelDatosGeneralGastoDepreciacion;
    
	
	
	//public JScrollPane jScrollPanelDatosGastoDepreciacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGastoDepreciacion;
	//public JScrollPane jScrollPanelImportacionGastoDepreciacion;
	
	
	
	protected JPanel jPanelAccionesGastoDepreciacion;
	
    protected JPanel jPanelPaginacionGastoDepreciacion;
    protected JPanel jPanelParametrosReportesGastoDepreciacion;
	protected JPanel jPanelParametrosReportesAccionesGastoDepreciacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GastoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar2GastoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar3GastoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar4GastoDepreciacion;
	//protected JPanel jPanelParametrosAuxiliar5GastoDepreciacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoGastoDepreciacion;
	//protected JPanel jPanelImportacionGastoDepreciacion;
	
	
	public JTable jTableDatosGastoDepreciacion;
	
	
	
	//public JTable jTableDatosGastoDepreciacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGastoDepreciacion;
	protected JButton jButtonDuplicarGastoDepreciacion;
	protected JButton jButtonCopiarGastoDepreciacion;
	protected JButton jButtonVerFormGastoDepreciacion;
	protected JButton jButtonNuevoRelacionesGastoDepreciacion;
	protected JButton jButtonModificarGastoDepreciacion;
	
    protected JButton jButtonGuardarCambiosTablaGastoDepreciacion;
	protected JButton jButtonCerrarGastoDepreciacion;
	
	
	protected JButton jButtonRecargarInformacionGastoDepreciacion;
	protected JButton jButtonProcesarInformacionGastoDepreciacion;
	
	
	protected JButton jButtonAnterioresGastoDepreciacion;
	protected JButton jButtonSiguientesGastoDepreciacion;
	protected JButton jButtonNuevoGuardarCambiosGastoDepreciacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGastoDepreciacion;
	//protected JButton jButtonCerrarReporteDinamicoGastoDepreciacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoGastoDepreciacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionGastoDepreciacion;
	//protected JButton jButtonGenerarImportacionGastoDepreciacion;
	//protected JButton jButtonCerrarImportacionGastoDepreciacion;
	//protected JFileChooser jFileChooserImportacionGastoDepreciacion;
	//protected File fileImportacionGastoDepreciacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGastoDepreciacion;
	protected JButton jButtonDuplicarToolBarGastoDepreciacion;
	protected JButton jButtonNuevoRelacionesToolBarGastoDepreciacion;
	
	
	public JButton jButtonGuardarCambiosToolBarGastoDepreciacion;
	protected JButton jButtonCopiarToolBarGastoDepreciacion;
	protected JButton jButtonVerFormToolBarGastoDepreciacion;
	public JButton jButtonGuardarCambiosTablaToolBarGastoDepreciacion;
	protected JButton jButtonMostrarOcultarTablaToolBarGastoDepreciacion;
	protected JButton jButtonCerrarToolBarGastoDepreciacion;
	
	protected JButton jButtonRecargarInformacionToolBarGastoDepreciacion;
	protected JButton jButtonProcesarInformacionToolBarGastoDepreciacion;
	protected JButton jButtonAnterioresToolBarGastoDepreciacion;
	protected JButton jButtonSiguientesToolBarGastoDepreciacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarGastoDepreciacion;
	protected JButton jButtonAbrirOrderByToolBarGastoDepreciacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGastoDepreciacion;
	protected JMenuItem jMenuItemDuplicarGastoDepreciacion;
	protected JMenuItem jMenuItemNuevoRelacionesGastoDepreciacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGastoDepreciacion;
	protected JMenuItem jMenuItemCopiarGastoDepreciacion;
	protected JMenuItem jMenuItemVerFormGastoDepreciacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaGastoDepreciacion;
	protected JMenuItem jMenuItemCerrarGastoDepreciacion;
	protected JMenuItem jMenuItemDetalleCerrarGastoDepreciacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGastoDepreciacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarGastoDepreciacion;
	
	protected JMenuItem jMenuItemRecargarInformacionGastoDepreciacion;
	protected JMenuItem jMenuItemProcesarInformacionGastoDepreciacion;
	protected JMenuItem jMenuItemAnterioresGastoDepreciacion;
	protected JMenuItem jMenuItemSiguientesGastoDepreciacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGastoDepreciacion;
	protected JMenuItem jMenuItemAbrirOrderByGastoDepreciacion;
	protected JMenuItem jMenuItemMostrarOcultarGastoDepreciacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGastoDepreciacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGastoDepreciacion;
	protected JCheckBox jCheckBoxSeleccionadosGastoDepreciacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGastoDepreciacion;
	protected JCheckBox jCheckBoxConGraficoReporteGastoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGastoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGastoDepreciacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGastoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGastoDepreciacion;
	protected JTextField jTextFieldValorCampoGeneralGastoDepreciacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGastoDepreciacion;
	//public JList<Reporte> jListColumnasSelectReporteGastoDepreciacion;
	//public JScrollPane jScrollColumnasSelectReporteGastoDepreciacion;
	
	//public JLabel jLabelRelacionesSelectReporteGastoDepreciacion;
	//public JList<Reporte> jListRelacionesSelectReporteGastoDepreciacion;
	//public JScrollPane jScrollRelacionesSelectReporteGastoDepreciacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGastoDepreciacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGastoDepreciacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGastoDepreciacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoGastoDepreciacion;
	
		
	//public JLabel jLabelArchivoImportacionGastoDepreciacion;	
	//public JLabel jLabelPathArchivoImportacionGastoDepreciacion;
	//protected JTextField jTextFieldPathArchivoImportacionGastoDepreciacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGastoDepreciacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGastoDepreciacion;
	
	//public JLabel jLabelColumnaCategoriaValorGastoDepreciacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGastoDepreciacion;
	
	//public JLabel jLabelColumnasValoresGraficoGastoDepreciacion;
	//public JList<Reporte> jListColumnasValoresGraficoGastoDepreciacion;
	//public JScrollPane jScrollColumnasValoresGraficoGastoDepreciacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGastoDepreciacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGastoDepreciacion;
	public JPanel jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion;
	public JButton jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion;
	
	public JPanel jPanelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion;
	public JLabel jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion;
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacionBusqueda= new JButtonMe();

	
	
	
	
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
	public GastoDepreciacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoDepreciacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGastoDepreciacion)	{
		this.jButtonRecargarInformacionGastoDepreciacion = jButtonRecargarInformacionGastoDepreciacion;
	}
	
	public JButton getjButtonProcesarInformacionGastoDepreciacion() {
		return this.jButtonProcesarInformacionGastoDepreciacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGastoDepreciacion)	{
		this.jButtonProcesarInformacionGastoDepreciacion = jButtonProcesarInformacionGastoDepreciacion;
	}
	
	
	public JButton getjButtonRecargarInformacionGastoDepreciacion() {
		return this.jButtonRecargarInformacionGastoDepreciacion;
	}
	
	
	public List<GastoDepreciacion> getgastodepreciacions() {
		return this.gastodepreciacions;
	}

	public void setgastodepreciacions(List<GastoDepreciacion> gastodepreciacions) {
		this.gastodepreciacions = gastodepreciacions;
	}
	
	public List<GastoDepreciacion> getgastodepreciacionsAux() {
		return this.gastodepreciacionsAux;
	}

	public void setgastodepreciacionsAux(List<GastoDepreciacion> gastodepreciacionsAux) {
		this.gastodepreciacionsAux = gastodepreciacionsAux;
	}
	
	public List<GastoDepreciacion> getgastodepreciacionsEliminados() {
		return this.gastodepreciacionsEliminados;
	}

	public void setGastoDepreciacionsEliminados(List<GastoDepreciacion> gastodepreciacionsEliminados) {
		this.gastodepreciacionsEliminados = gastodepreciacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGastoDepreciacion() {
		return jComboBoxTiposSeleccionarGastoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGastoDepreciacion(
			JComboBox jComboBoxTiposSeleccionarGastoDepreciacion) {
		this.jComboBoxTiposSeleccionarGastoDepreciacion = jComboBoxTiposSeleccionarGastoDepreciacion;
	}
	
	public void setBorderResaltarTiposSeleccionarGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGastoDepreciacion() {
		return jTextFieldValorCampoGeneralGastoDepreciacion;
	}

	public void setjTextFieldValorCampoGeneralGastoDepreciacion(
			JTextField jTextFieldValorCampoGeneralGastoDepreciacion) {
		this.jTextFieldValorCampoGeneralGastoDepreciacion = jTextFieldValorCampoGeneralGastoDepreciacion;
	}

	public void setBorderResaltarValorCampoGeneralGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGastoDepreciacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGastoDepreciacion() {
		return this.jCheckBoxSeleccionarTodosGastoDepreciacion;
	}

	public void setjCheckBoxSeleccionarTodosGastoDepreciacion(
			JCheckBox jCheckBoxSeleccionarTodosGastoDepreciacion) {
		this.jCheckBoxSeleccionarTodosGastoDepreciacion = jCheckBoxSeleccionarTodosGastoDepreciacion;
	}

	public void setBorderResaltarSeleccionarTodosGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGastoDepreciacion() {
		return this.jCheckBoxSeleccionadosGastoDepreciacion;
	}

	public void setjCheckBoxSeleccionadosGastoDepreciacion(
			JCheckBox jCheckBoxSeleccionadosGastoDepreciacion) {
		this.jCheckBoxSeleccionadosGastoDepreciacion = jCheckBoxSeleccionadosGastoDepreciacion;
	}
	
	public void setBorderResaltarSeleccionadosGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGastoDepreciacion() {
		return this.jComboBoxTiposArchivosReportesGastoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGastoDepreciacion(
			JComboBox jComboBoxTiposArchivosReportesGastoDepreciacion) {
		this.jComboBoxTiposArchivosReportesGastoDepreciacion = jComboBoxTiposArchivosReportesGastoDepreciacion;
	}

	public void setBorderResaltarTiposArchivosReportesGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGastoDepreciacion() {
		return this.jComboBoxTiposReportesGastoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGastoDepreciacion(
			JComboBox jComboBoxTiposReportesGastoDepreciacion) {
		this.jComboBoxTiposReportesGastoDepreciacion = jComboBoxTiposReportesGastoDepreciacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGastoDepreciacion() {
	//	return jComboBoxTiposReportesDinamicoGastoDepreciacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGastoDepreciacion(
	//		JComboBox jComboBoxTiposReportesDinamicoGastoDepreciacion) {
	//	this.jComboBoxTiposReportesDinamicoGastoDepreciacion = jComboBoxTiposReportesDinamicoGastoDepreciacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGastoDepreciacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGastoDepreciacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion = jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion;
	//}
	
	public void setBorderResaltarTiposReportesGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGastoDepreciacion() {
		return this.jComboBoxTiposGraficosReportesGastoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGastoDepreciacion(
			JComboBox jComboBoxTiposGraficosReportesGastoDepreciacion) {
		this.jComboBoxTiposGraficosReportesGastoDepreciacion = jComboBoxTiposGraficosReportesGastoDepreciacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGastoDepreciacion() {
		return this.jComboBoxTiposPaginacionGastoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGastoDepreciacion(
			JComboBox jComboBoxTiposPaginacionGastoDepreciacion) {
		this.jComboBoxTiposPaginacionGastoDepreciacion = jComboBoxTiposPaginacionGastoDepreciacion;
	}
	
	public void setBorderResaltarTiposPaginacionGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGastoDepreciacion() {
		return this.jComboBoxTiposRelacionesGastoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGastoDepreciacion() {
		return this.jComboBoxTiposAccionesGastoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGastoDepreciacion(
			JComboBox jComboBoxTiposRelacionesGastoDepreciacion) {
		this.jComboBoxTiposRelacionesGastoDepreciacion = jComboBoxTiposRelacionesGastoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGastoDepreciacion(
			JComboBox jComboBoxTiposAccionesGastoDepreciacion) {
		this.jComboBoxTiposAccionesGastoDepreciacion = jComboBoxTiposAccionesGastoDepreciacion;
	}
	
	public void setBorderResaltarTiposRelacionesGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGastoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGastoDepreciacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGastoDepreciacion() {
	//	return jCheckBoxConGraficoDinamicoGastoDepreciacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoGastoDepreciacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoGastoDepreciacion) {
	//	this.jCheckBoxConGraficoDinamicoGastoDepreciacion = jCheckBoxConGraficoDinamicoGastoDepreciacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGastoDepreciacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGastoDepreciacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGastoDepreciacion .setBorder(borderResaltar);		
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
		this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		
		this.gastodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.gastodepreciacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GastoDepreciacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Gasto Depreciacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
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
		
		GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GastoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGastoDepreciacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"nuevo","nuevo","Nuevo"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"duplicar","duplicar","Duplicar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"copiar","copiar","Copiar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"ver_form","ver_form","Ver"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"recargar","recargar","Recargar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGastoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGastoDepreciacion,this.jTtoolBarGastoDepreciacion,
							"cerrar","cerrar","Salir"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGastoDepreciacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGastoDepreciacion;
			
				this.jButtonProcesarInformacionToolBarGastoDepreciacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGastoDepreciacion;
				
		//protected JButton jButtonModificarToolBarGastoDepreciacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGastoDepreciacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGastoDepreciacion=new JMenuMe("General");
		this.jmenuArchivoGastoDepreciacion=new JMenuMe("Archivo");
		this.jmenuAccionesGastoDepreciacion=new JMenuMe("Acciones");
		this.jmenuDatosGastoDepreciacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGastoDepreciacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGastoDepreciacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGastoDepreciacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGastoDepreciacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGastoDepreciacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGastoDepreciacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGastoDepreciacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGastoDepreciacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGastoDepreciacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGastoDepreciacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGastoDepreciacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGastoDepreciacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGastoDepreciacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGastoDepreciacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGastoDepreciacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGastoDepreciacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGastoDepreciacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGastoDepreciacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGastoDepreciacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGastoDepreciacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGastoDepreciacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGastoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGastoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGastoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGastoDepreciacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGastoDepreciacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGastoDepreciacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGastoDepreciacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGastoDepreciacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGastoDepreciacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGastoDepreciacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGastoDepreciacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGastoDepreciacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGastoDepreciacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGastoDepreciacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGastoDepreciacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGastoDepreciacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGastoDepreciacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGastoDepreciacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGastoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGastoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGastoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGastoDepreciacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGastoDepreciacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGastoDepreciacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGastoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGastoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGastoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGastoDepreciacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGastoDepreciacion.add(this.jMenuItemCerrarGastoDepreciacion);
			
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemNuevoGastoDepreciacion);
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemNuevoGuardarCambiosGastoDepreciacion);
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemNuevoRelacionesGastoDepreciacion);
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemGuardarCambiosTablaGastoDepreciacion);		
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemDuplicarGastoDepreciacion);		
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemCopiarGastoDepreciacion);		
			this.jmenuAccionesGastoDepreciacion.add(this.jMenuItemVerFormGastoDepreciacion);		
			
			this.jmenuDatosGastoDepreciacion.add(this.jMenuItemRecargarInformacionGastoDepreciacion);				
			this.jmenuDatosGastoDepreciacion.add(this.jMenuItemAnterioresGastoDepreciacion);				
			this.jmenuDatosGastoDepreciacion.add(this.jMenuItemSiguientesGastoDepreciacion);				
			this.jmenuDatosGastoDepreciacion.add(this.jMenuItemAbrirOrderByGastoDepreciacion);				
			this.jmenuDatosGastoDepreciacion.add(this.jMenuItemMostrarOcultarGastoDepreciacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGastoDepreciacion.add(this.jMenuItemGuardarCambiosGastoDepreciacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGastoDepreciacion.add(this.jmenuArchivoGastoDepreciacion);		
			this.jmenuBarGastoDepreciacion.add(this.jmenuAccionesGastoDepreciacion);		
			this.jmenuBarGastoDepreciacion.add(this.jmenuDatosGastoDepreciacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGastoDepreciacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGastoDepreciacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setToolTipText("Buscar Por Detalle Grupo Activo Fijo ");
		this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion= new JButtonMe();
		this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setText("Buscar");
		this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setToolTipText("Buscar Por Detalle Grupo Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion,"buscar_button","Buscar Por Detalle Grupo Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion = new JLabelMe();
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setText("Detalle Grupo Activo Fijo :");
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setToolTipText("Detalle Grupo Activo Fijo");
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGastoDepreciacion=new JTabbedPane();


		this.jTabbedPaneBusquedasGastoDepreciacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasGastoDepreciacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasGastoDepreciacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGastoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGastoDepreciacion = new GastoDepreciacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Gasto Depreciacion DATOS");
			this.jInternalFrameDetalleFormGastoDepreciacion = new GastoDepreciacionDetalleFormJInternalFrame(jDesktopPane,this.gastodepreciacionSessionBean.getConGuardarRelaciones(),this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGastoDepreciacion = null;//new GastoDepreciacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGastoDepreciacion= new GridBagLayout();
		
		
		this.jTableDatosGastoDepreciacion = new JTableMe();      
		
		String sToolTipGastoDepreciacion="";
		sToolTipGastoDepreciacion=GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGastoDepreciacion+="(ActivosFijos.GastoDepreciacion)";
		}
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipGastoDepreciacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGastoDepreciacion.setToolTipText(sToolTipGastoDepreciacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGastoDepreciacion);
		this.jTableDatosGastoDepreciacion.setAutoCreateRowSorter(true);
		this.jTableDatosGastoDepreciacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGastoDepreciacion.setRowSelectionAllowed(true);
		this.jTableDatosGastoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGastoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGastoDepreciacion = new JButtonMe();
		this.jButtonDuplicarGastoDepreciacion = new JButtonMe();
		this.jButtonCopiarGastoDepreciacion = new JButtonMe();
		this.jButtonVerFormGastoDepreciacion = new JButtonMe();
		this.jButtonNuevoRelacionesGastoDepreciacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion = new JButtonMe();
		this.jButtonCerrarGastoDepreciacion = new JButtonMe();
		
		this.jScrollPanelDatosGastoDepreciacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralGastoDepreciacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Gasto Depreciacion";
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosGastoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGastoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesGastoDepreciacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGastoDepreciacion=new ReporteDinamicoJInternalFrame(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGastoDepreciacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGastoDepreciacion=new ImportacionJInternalFrame(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGastoDepreciacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGastoDepreciacion = new JButtonMe();
		
		this.jButtonAbrirOrderByGastoDepreciacion.setText("Orden");
		this.jButtonAbrirOrderByGastoDepreciacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGastoDepreciacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGastoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacion,false,this);
			
			//this.cargarOrderByGastoDepreciacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGastoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacion,true,this);
			
			//this.cargarOrderByGastoDepreciacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGastoDepreciacion.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosGastoDepreciacion.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosGastoDepreciacion.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosGastoDepreciacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGastoDepreciacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGastoDepreciacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGastoDepreciacion.setText("Nuevo");
		this.jButtonDuplicarGastoDepreciacion.setText("Duplicar");
		this.jButtonCopiarGastoDepreciacion.setText("Copiar");
		this.jButtonVerFormGastoDepreciacion.setText("Ver");
		this.jButtonNuevoRelacionesGastoDepreciacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.setText("Guardar");
		this.jButtonCerrarGastoDepreciacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGastoDepreciacion,"nuevo_button","Nuevo",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGastoDepreciacion,"duplicar_button","Duplicar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGastoDepreciacion,"copiar_button","Copiar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGastoDepreciacion,"ver_form","Ver",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGastoDepreciacion,"nuevorelaciones_button","Nuevo Rel",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGastoDepreciacion,"guardarcambiostabla_button","Guardar",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGastoDepreciacion,"cerrar_button","Salir",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGastoDepreciacion.setToolTipText("Nuevo"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGastoDepreciacion.setToolTipText("Duplicar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGastoDepreciacion.setToolTipText("Copiar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGastoDepreciacion.setToolTipText("Ver"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGastoDepreciacion.setToolTipText("Nuevo Rel"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.setToolTipText("Guardar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGastoDepreciacion.setToolTipText("Salir"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGastoDepreciacion";
		inputMap = this.jButtonNuevoGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGastoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGastoDepreciacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarGastoDepreciacion";
		inputMap = this.jButtonDuplicarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGastoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGastoDepreciacion"));
		
		//COPIAR
		sMapKey = "CopiarGastoDepreciacion";
		inputMap = this.jButtonCopiarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGastoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGastoDepreciacion"));
		
		//VEr FORM
		sMapKey = "VerFormGastoDepreciacion";
		inputMap = this.jButtonVerFormGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGastoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGastoDepreciacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGastoDepreciacion";
		inputMap = this.jButtonNuevoRelacionesGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGastoDepreciacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGastoDepreciacion";
		inputMap = this.jButtonModificarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGastoDepreciacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGastoDepreciacion";
		inputMap = this.jButtonCerrarGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGastoDepreciacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGastoDepreciacion";
		inputMap = this.jButtonGuardarCambiosTablaGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGastoDepreciacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GastoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GastoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GastoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GastoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GastoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGastoDepreciacion.setName("jPanelParametrosReportesGastoDepreciacion"); 
		
		this.jPanelParametrosReportesAccionesGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGastoDepreciacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGastoDepreciacion.setName("jPanelParametrosReportesAccionesGastoDepreciacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGastoDepreciacion = new JButtonMe();
		this.jButtonRecargarInformacionGastoDepreciacion.setText("Recargar");
		this.jButtonRecargarInformacionGastoDepreciacion.setToolTipText("Recargar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGastoDepreciacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGastoDepreciacion = new JButtonMe();
		this.jButtonProcesarInformacionGastoDepreciacion.setText("Procesar");
		this.jButtonProcesarInformacionGastoDepreciacion.setToolTipText("Procesar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGastoDepreciacion.setVisible(false);
			
		this.jButtonProcesarInformacionGastoDepreciacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGastoDepreciacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGastoDepreciacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGastoDepreciacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposReportesGastoDepreciacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGastoDepreciacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGastoDepreciacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionGastoDepreciacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGastoDepreciacion.setText("Accion");
		this.jComboBoxTiposRelacionesGastoDepreciacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGastoDepreciacion.setText("Accion");
		this.jComboBoxTiposAccionesGastoDepreciacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGastoDepreciacion.setText("Accion");
		this.jComboBoxTiposSeleccionarGastoDepreciacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGastoDepreciacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGastoDepreciacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGastoDepreciacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGastoDepreciacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGastoDepreciacion = new JLabelMe();
		
		this.jLabelAccionesGastoDepreciacion.setText("Acciones");		
		this.jLabelAccionesGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGastoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGastoDepreciacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGastoDepreciacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGastoDepreciacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGastoDepreciacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGastoDepreciacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGastoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGastoDepreciacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteGastoDepreciacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGastoDepreciacion = new JButtonMe();
		//this.jButtonAnterioresGastoDepreciacion.setText("<<");
        this.jButtonAnterioresGastoDepreciacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGastoDepreciacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGastoDepreciacion = new JButtonMe();
		//this.jButtonSiguientesGastoDepreciacion.setText(">>");
        this.jButtonSiguientesGastoDepreciacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGastoDepreciacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGastoDepreciacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosGastoDepreciacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGastoDepreciacion,"nuevoguardarcambios_button","Nue",this.gastodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGastoDepreciacion";
		inputMap = this.jButtonNuevoGuardarCambiosGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGastoDepreciacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGastoDepreciacion";
		inputMap = this.jButtonRecargarInformacionGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGastoDepreciacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGastoDepreciacion";
		inputMap = this.jButtonSiguientesGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGastoDepreciacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGastoDepreciacion";
		inputMap = this.jButtonAnterioresGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGastoDepreciacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGastoDepreciacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGastoDepreciacion.setMinimumSize(new Dimension(this.getWidth(),GastoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGastoDepreciacion.setMaximumSize(new Dimension(this.getWidth(),GastoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGastoDepreciacion.setPreferredSize(new Dimension(this.getWidth(),GastoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGastoDepreciacion = new GridBagLayout();

			this.jPanelPaginacionGastoDepreciacion.setLayout(gridaBagLayoutPaginacionGastoDepreciacion);						
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 0;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonAnterioresGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
					
						
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGastoDepreciacion.gridy = 0;
			
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonNuevoGuardarCambiosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
						
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGastoDepreciacion.gridy = 0;
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonSiguientesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 1;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonNuevoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGastoDepreciacion.gridy = 1;
				this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGastoDepreciacion.add(this.jButtonNuevoRelacionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			}
			
			
			if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGastoDepreciacion.gridy = 1;
				this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGastoDepreciacion.add(this.jButtonGuardarCambiosTablaGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			}
			
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 1;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonDuplicarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 1;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonCopiarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 1;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonVerFormGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 1;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGastoDepreciacion.add(this.jButtonCerrarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		
		this.jButtonRecargarInformacionGastoDepreciacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGastoDepreciacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGastoDepreciacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGastoDepreciacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGastoDepreciacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGastoDepreciacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGastoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGastoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGastoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGastoDepreciacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGastoDepreciacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGastoDepreciacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGastoDepreciacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGastoDepreciacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGastoDepreciacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGastoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGastoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGastoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGastoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGastoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGastoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGastoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGastoDepreciacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGastoDepreciacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGastoDepreciacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGastoDepreciacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGastoDepreciacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGastoDepreciacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGastoDepreciacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGastoDepreciacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGastoDepreciacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGastoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGastoDepreciacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GastoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GastoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GastoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GastoDepreciacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGastoDepreciacion.setLayout(gridaBagParametrosReportesGastoDepreciacion);
			this.jPanelParametrosReportesAccionesGastoDepreciacion.setLayout(gridaBagParametrosReportesAccionesGastoDepreciacion);
			
			
			this.jPanelParametrosAuxiliar1GastoDepreciacion.setLayout(gridaBagParametrosAuxiliar1GastoDepreciacion);
			this.jPanelParametrosAuxiliar2GastoDepreciacion.setLayout(gridaBagParametrosAuxiliar2GastoDepreciacion);
			this.jPanelParametrosAuxiliar3GastoDepreciacion.setLayout(gridaBagParametrosAuxiliar3GastoDepreciacion);
			this.jPanelParametrosAuxiliar4GastoDepreciacion.setLayout(gridaBagParametrosAuxiliar4GastoDepreciacion);
			//this.jPanelParametrosAuxiliar5GastoDepreciacion.setLayout(gridaBagParametrosAuxiliar2GastoDepreciacion);			
			
			
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jButtonRecargarInformacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoDepreciacion.add(this.jComboBoxTiposPaginacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoDepreciacion.add(this.jCheckBoxConAltoMaximoTablaGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoDepreciacion.add(this.jComboBoxTiposArchivosReportesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jPanelParametrosAuxiliar1GastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GastoDepreciacion.add(this.jComboBoxTiposReportesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);																		
			
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GastoDepreciacion.add(this.jComboBoxTiposGraficosReportesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jPanelParametrosAuxiliar4GastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jComboBoxTiposReportesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jCheckBoxGenerarReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jPanelParametrosAuxiliar2GastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jLabelAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGastoDepreciacion.add(this.jButtonAbrirOrderByGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jComboBoxTiposSeleccionarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
			
			
			/*
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jCheckBoxSeleccionarTodosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jCheckBoxConGraficoReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoDepreciacion.add(this.jCheckBoxSeleccionarTodosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);															
				
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoDepreciacion.add(this.jCheckBoxSeleccionadosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);															
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoDepreciacion.add(this.jCheckBoxConGraficoReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jPanelParametrosAuxiliar3GastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jComboBoxTiposRelacionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
				
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jComboBoxTiposAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
	
				
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoDepreciacion.add(this.jTextFieldValorCampoGeneralGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGastoDepreciacion = new GridBagLayout();

			this.jScrollPanelDatosGastoDepreciacion.setLayout(gridaBagLayoutDatosGastoDepreciacion);
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = 0;
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;
			
			this.jScrollPanelDatosGastoDepreciacion.add(this.jTableDatosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGastoDepreciacion.setViewportView(this.jTableDatosGastoDepreciacion);
		this.jTableDatosGastoDepreciacion.setFillsViewportHeight(true);
		this.jTableDatosGastoDepreciacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGastoDepreciacion= new GridBagLayout();
		this.jPanelAccionesGastoDepreciacion.setLayout(gridaBagLayoutAccionesGastoDepreciacion);
		
		
		/*	
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = 0;
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
			
		this.jPanelAccionesGastoDepreciacion.add(this.jButtonNuevoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDetalleGrupoActivoFijoGastoDepreciacion= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoGastoDepreciacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoGastoDepreciacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoGastoDepreciacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleGrupoActivoFijoGastoDepreciacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setLayout(gridaBagLayoutFK_IdDetalleGrupoActivoFijoGastoDepreciacion);

		gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacion.gridy = 0;
		gridBagConstraintsGastoDepreciacion.gridx = 0;
		jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion.add(jLabelid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion, gridBagConstraintsGastoDepreciacion);

		gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacion.gridy = 0;
		gridBagConstraintsGastoDepreciacion.gridx = 1;
		jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion.add(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion, gridBagConstraintsGastoDepreciacion);

		gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoDepreciacion.gridy = 1;
		gridBagConstraintsGastoDepreciacion.gridx =1;
		jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion.add(jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion, gridBagConstraintsGastoDepreciacion);

		jTabbedPaneBusquedasGastoDepreciacion.addTab("1.-Por Detalle Grupo Activo Fijo ", jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
		jTabbedPaneBusquedasGastoDepreciacion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGastoDepreciacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGastoDepreciacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();						
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;		
			//this.gridBagConstraintsGastoDepreciacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGastoDepreciacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;		
		//this.gridBagConstraintsGastoDepreciacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGastoDepreciacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGastoDepreciacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoDepreciacion.gridx = 0;		
			this.gridBagConstraintsGastoDepreciacion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGastoDepreciacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);								
		
		
		/*
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		*/		
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGastoDepreciacion.gridx =0;
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGastoDepreciacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
				
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGastoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGastoDepreciacion = new GridBagLayout();
			this.jPanelBusquedasParametrosGastoDepreciacion.setLayout(gridaBagLayoutBusquedasParametrosGastoDepreciacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGastoDepreciacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGastoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
			
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGastoDepreciacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGastoDepreciacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGastoDepreciacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGastoDepreciacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGastoDepreciacion.setName("jPanelReporteDinamicoGastoDepreciacion"); 
		
		this.jPanelReporteDinamicoGastoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGastoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGastoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGastoDepreciacion.setLayout(gridaBagLayoutReporteDinamicoGastoDepreciacion);
		
		
		this.jInternalFrameReporteDinamicoGastoDepreciacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGastoDepreciacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGastoDepreciacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGastoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGastoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGastoDepreciacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGastoDepreciacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGastoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGastoDepreciacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoGastoDepreciacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoGastoDepreciacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGastoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGastoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGastoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGastoDepreciacion = new JLabelMe();

		this.jLabelColumnasSelectReporteGastoDepreciacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelColumnasSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGastoDepreciacion = new JList<Reporte>();
		this.jListColumnasSelectReporteGastoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGastoDepreciacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGastoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGastoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGastoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGastoDepreciacion=new JScrollPane(this.jListColumnasSelectReporteGastoDepreciacion);
			
			this.jScrollColumnasSelectReporteGastoDepreciacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGastoDepreciacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGastoDepreciacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGastoDepreciacion.add(this.jListColumnasSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jScrollColumnasSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGastoDepreciacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteGastoDepreciacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelRelacionesSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGastoDepreciacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteGastoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGastoDepreciacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGastoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGastoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGastoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGastoDepreciacion=new JScrollPane(this.jListRelacionesSelectReporteGastoDepreciacion);
			
			this.jScrollRelacionesSelectReporteGastoDepreciacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGastoDepreciacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGastoDepreciacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGastoDepreciacion.add(this.jListRelacionesSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jScrollRelacionesSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGastoDepreciacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoGastoDepreciacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGastoDepreciacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGastoDepreciacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGastoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGastoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGastoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGastoDepreciacion = new JLabelMe();

		this.jLabelConGraficoDinamicoGastoDepreciacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelConGraficoDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGastoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGastoDepreciacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGastoDepreciacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGastoDepreciacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGastoDepreciacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGastoDepreciacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jCheckBoxConGraficoDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGastoDepreciacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGastoDepreciacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelColumnaCategoriaGraficoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGastoDepreciacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorGastoDepreciacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelColumnaCategoriaValorGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGastoDepreciacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGastoDepreciacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGastoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGastoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGastoDepreciacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jComboBoxColumnaCategoriaValorGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGastoDepreciacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoGastoDepreciacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelColumnasValoresGraficoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGastoDepreciacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoGastoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGastoDepreciacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGastoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGastoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGastoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGastoDepreciacion=new JScrollPane(this.jListColumnasValoresGraficoGastoDepreciacion);
			
			this.jScrollColumnasValoresGraficoGastoDepreciacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGastoDepreciacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGastoDepreciacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGastoDepreciacion.add(this.jListColumnasSelectReporteGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jScrollColumnasValoresGraficoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelTiposGraficosReportesDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGastoDepreciacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jComboBoxTiposGraficosReportesDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelGenerarExcelReporteDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion.setToolTipText("Generar EXCEL"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGastoDepreciacion.add(this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jComboBoxTiposReportesDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jLabelTiposArchivoReporteDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jComboBoxTiposArchivosReportesDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGastoDepreciacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGastoDepreciacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGastoDepreciacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGastoDepreciacion.setToolTipText("Generar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jButtonGenerarReporteDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGastoDepreciacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGastoDepreciacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGastoDepreciacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGastoDepreciacion.setToolTipText("Cancelar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoDepreciacion.add(this.jButtonCerrarReporteDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGastoDepreciacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGastoDepreciacion= new JScrollPane(jPanelReporteDinamicoGastoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGastoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGastoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGastoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGastoDepreciacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGastoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGastoDepreciacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGastoDepreciacion);
		this.jInternalFrameReporteDinamicoGastoDepreciacion.getContentPane().add(this.jScrollPanelReporteDinamicoGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGastoDepreciacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGastoDepreciacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGastoDepreciacion.setName("jPanelImportacionGastoDepreciacion"); 
		
		this.jPanelImportacionGastoDepreciacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGastoDepreciacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGastoDepreciacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGastoDepreciacion.setLayout(gridaBagLayoutImportacionGastoDepreciacion);
		
		
		this.jInternalFrameImportacionGastoDepreciacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGastoDepreciacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGastoDepreciacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGastoDepreciacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGastoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGastoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGastoDepreciacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGastoDepreciacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGastoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGastoDepreciacion.setResizable(true);
	    this.jInternalFrameImportacionGastoDepreciacion.setClosable(true);
	    this.jInternalFrameImportacionGastoDepreciacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGastoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGastoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGastoDepreciacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGastoDepreciacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGastoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGastoDepreciacion.setResizable(true);
	    this.jInternalFrameImportacionGastoDepreciacion.setClosable(true);
	    this.jInternalFrameImportacionGastoDepreciacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGastoDepreciacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGastoDepreciacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGastoDepreciacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGastoDepreciacion = new JLabelMe();

		this.jLabelArchivoImportacionGastoDepreciacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGastoDepreciacion.add(this.jLabelArchivoImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGastoDepreciacion = new JFileChooser();		
		this.jFileChooserImportacionGastoDepreciacion.setToolTipText("ESCOGER ARCHIVO"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGastoDepreciacion = new JButtonMe();
		this.jButtonAbrirImportacionGastoDepreciacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGastoDepreciacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGastoDepreciacion.setToolTipText("Generar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacion.add(this.jButtonAbrirImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGastoDepreciacion = new JLabelMe();

		this.jLabelPathArchivoImportacionGastoDepreciacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGastoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGastoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGastoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGastoDepreciacion.add(this.jLabelPathArchivoImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGastoDepreciacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGastoDepreciacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGastoDepreciacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGastoDepreciacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacion.add(this.jTextFieldPathArchivoImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGastoDepreciacion = new JButtonMe();
		this.jButtonGenerarImportacionGastoDepreciacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGastoDepreciacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGastoDepreciacion.setToolTipText("Generar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacion.add(this.jButtonGenerarImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGastoDepreciacion = new JButtonMe();
		this.jButtonCerrarImportacionGastoDepreciacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGastoDepreciacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGastoDepreciacion.setToolTipText("Cancelar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoDepreciacion.add(this.jButtonCerrarImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGastoDepreciacion = new GridBagLayout();
		
		this.jScrollPanelImportacionGastoDepreciacion= new JScrollPane(jPanelImportacionGastoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsGastoDepreciacion.gridy =iPosYImportacion;
		this.gridBagConstraintsGastoDepreciacion.gridx =iPosXImportacion;
		this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGastoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGastoDepreciacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGastoDepreciacion);
		this.jInternalFrameImportacionGastoDepreciacion.getContentPane().add(this.jScrollPanelImportacionGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGastoDepreciacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGastoDepreciacion = new JButtonMe();
			this.jButtonAbrirOrderByGastoDepreciacion.setText("Orden");
			this.jButtonAbrirOrderByGastoDepreciacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGastoDepreciacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGastoDepreciacion";
			inputMap = this.jButtonAbrirOrderByGastoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGastoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGastoDepreciacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByGastoDepreciacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGastoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGastoDepreciacion.setName("jPanelOrderByGastoDepreciacion"); 
			
			this.jPanelOrderByGastoDepreciacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGastoDepreciacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGastoDepreciacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGastoDepreciacion.setLayout(gridaBagLayoutOrderByGastoDepreciacion);
			
			
			this.jTableDatosGastoDepreciacionOrderBy = new JTableMe();        
			this.jTableDatosGastoDepreciacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGastoDepreciacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGastoDepreciacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGastoDepreciacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGastoDepreciacionOrderBy.setViewportView(this.jTableDatosGastoDepreciacionOrderBy);
			this.jTableDatosGastoDepreciacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGastoDepreciacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGastoDepreciacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGastoDepreciacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGastoDepreciacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGastoDepreciacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGastoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGastoDepreciacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGastoDepreciacion.setTitle("Orden");
			this.jInternalFrameOrderByGastoDepreciacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGastoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGastoDepreciacion.setResizable(true);
			this.jInternalFrameOrderByGastoDepreciacion.setClosable(true);
			this.jInternalFrameOrderByGastoDepreciacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGastoDepreciacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGastoDepreciacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGastoDepreciacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGastoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Depreciaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGastoDepreciacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGastoDepreciacion.ipady =150;
				
			this.jPanelOrderByGastoDepreciacion.add(jScrollPanelDatosGastoDepreciacionOrderBy, this.gridBagConstraintsGastoDepreciacion);//this.jTableDatosGastoDepreciacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGastoDepreciacion = new JButtonMe();
			this.jButtonCerrarOrderByGastoDepreciacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGastoDepreciacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGastoDepreciacion.setToolTipText("Cancelar"+" "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGastoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoDepreciacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGastoDepreciacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGastoDepreciacion.add(this.jButtonCerrarOrderByGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGastoDepreciacion = new GridBagLayout();
			
			this.jScrollPanelOrderByGastoDepreciacion= new JScrollPane(jPanelOrderByGastoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGastoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsGastoDepreciacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsGastoDepreciacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsGastoDepreciacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGastoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGastoDepreciacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGastoDepreciacion);
			
			this.jInternalFrameOrderByGastoDepreciacion.getContentPane().add(this.jScrollPanelOrderByGastoDepreciacion, this.gridBagConstraintsGastoDepreciacion);			
		
		} else {
			this.jButtonAbrirOrderByGastoDepreciacion = new JButtonMe();
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
			&& this.gastodepreciacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGastoDepreciacion.getRowHeight();//GastoDepreciacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.isSelected()) {
					iHeightTable=GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGastoDepreciacion.isSelected()) {
					iHeightTable=GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GastoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGastoDepreciacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGastoDepreciacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGastoDepreciacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGastoDepreciacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGastoDepreciacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGastoDepreciacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGastoDepreciacion!=null && this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy()!=null) {
			//if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGastoDepreciacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGastoDepreciacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGastoDepreciacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGastoDepreciacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGastoDepreciacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGastoDepreciacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=gastodepreciacionLogic.getGastoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastodepreciacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GastoDepreciacion> TraerGastoDepreciacionBeans(List<GastoDepreciacion> gastodepreciacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(GastoDepreciacion gastodepreciacion:gastodepreciacions) {
					
				if(!(GastoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GastoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					gastodepreciacion.setsDetalleGeneralEntityReporte(GastoDepreciacionConstantesFunciones.getGastoDepreciacionDescripcion(gastodepreciacion));
										
						
					
					

					if(gastodepreciacion.getCuentaContaGastoDepres()!=null && Funciones.existeClass(classes,CuentaContaGastoDepre.class)) {
						try{gastodepreciacion.setcuentacontagastodepresDescripcionReporte(new JRBeanCollectionDataSource(CuentaContaGastoDepreJInternalFrame.TraerCuentaContaGastoDepreBeans(gastodepreciacion.getCuentaContaGastoDepres(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//gastodepreciacion.setsDetalleGeneralEntityReporte(gastodepreciacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//gastodepreciacionbeans.add(gastodepreciacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return gastodepreciacions;
    }
	//PARA REPORTES FIN
}
