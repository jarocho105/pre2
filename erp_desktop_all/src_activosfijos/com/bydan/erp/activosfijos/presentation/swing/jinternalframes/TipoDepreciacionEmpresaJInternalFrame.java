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
import com.bydan.erp.activosfijos.util.TipoDepreciacionEmpresaConstantesFunciones;

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
public class TipoDepreciacionEmpresaJInternalFrame extends TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDepreciacionEmpresa;
	
	protected JMenuBar jmenuBarTipoDepreciacionEmpresa;
	
	protected JMenu jmenuTipoDepreciacionEmpresa;
	protected JMenu jmenuDatosTipoDepreciacionEmpresa;
	protected JMenu jmenuArchivoTipoDepreciacionEmpresa;
	protected JMenu jmenuAccionesTipoDepreciacionEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDepreciacionEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoDepreciacionEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDepreciacionEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDepreciacionEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDepreciacionEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDepreciacionEmpresa> tipodepreciacionempresas;		
	public List<TipoDepreciacionEmpresa> tipodepreciacionempresasEliminados;	
	public List<TipoDepreciacionEmpresa> tipodepreciacionempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDepreciacionEmpresa;		
	protected JButton jButtonAbrirOrderByTipoDepreciacionEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoDepreciacionEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoDepreciacionEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoDepreciacionEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDepreciacionEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoDepreciacionEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoDepreciacionEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDepreciacionEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDepreciacionEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoDepreciacionEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoDepreciacionEmpresa;
	
    protected JPanel jPanelPaginacionTipoDepreciacionEmpresa;
    protected JPanel jPanelParametrosReportesTipoDepreciacionEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoDepreciacionEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDepreciacionEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoDepreciacionEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoDepreciacionEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoDepreciacionEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoDepreciacionEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDepreciacionEmpresa;
	//protected JPanel jPanelImportacionTipoDepreciacionEmpresa;
	
	
	public JTable jTableDatosTipoDepreciacionEmpresa;
	
	
	
	//public JTable jTableDatosTipoDepreciacionEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDepreciacionEmpresa;
	protected JButton jButtonDuplicarTipoDepreciacionEmpresa;
	protected JButton jButtonCopiarTipoDepreciacionEmpresa;
	protected JButton jButtonVerFormTipoDepreciacionEmpresa;
	protected JButton jButtonNuevoRelacionesTipoDepreciacionEmpresa;
	protected JButton jButtonModificarTipoDepreciacionEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoDepreciacionEmpresa;
	protected JButton jButtonCerrarTipoDepreciacionEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoDepreciacionEmpresa;
	protected JButton jButtonProcesarInformacionTipoDepreciacionEmpresa;
	
	
	protected JButton jButtonAnterioresTipoDepreciacionEmpresa;
	protected JButton jButtonSiguientesTipoDepreciacionEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDepreciacionEmpresa;
	//protected JButton jButtonGenerarImportacionTipoDepreciacionEmpresa;
	//protected JButton jButtonCerrarImportacionTipoDepreciacionEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoDepreciacionEmpresa;
	//protected File fileImportacionTipoDepreciacionEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonDuplicarToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonCopiarToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonVerFormToolBarTipoDepreciacionEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonCerrarToolBarTipoDepreciacionEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonAnterioresToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonSiguientesToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoDepreciacionEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDepreciacionEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemCopiarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemVerFormTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemCerrarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoDepreciacionEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDepreciacionEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoDepreciacionEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDepreciacionEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDepreciacionEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoDepreciacionEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDepreciacionEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoDepreciacionEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoDepreciacionEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDepreciacionEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDepreciacionEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDepreciacionEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDepreciacionEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoDepreciacionEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoDepreciacionEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDepreciacionEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDepreciacionEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDepreciacionEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDepreciacionEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDepreciacionEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDepreciacionEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDepreciacionEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDepreciacionEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDepreciacionEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDepreciacionEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDepreciacionEmpresa;
	
	
	
	
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
	public TipoDepreciacionEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDepreciacionEmpresa)	{
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa = jButtonRecargarInformacionTipoDepreciacionEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoDepreciacionEmpresa() {
		return this.jButtonProcesarInformacionTipoDepreciacionEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDepreciacionEmpresa)	{
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa = jButtonProcesarInformacionTipoDepreciacionEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDepreciacionEmpresa() {
		return this.jButtonRecargarInformacionTipoDepreciacionEmpresa;
	}
	
	
	public List<TipoDepreciacionEmpresa> gettipodepreciacionempresas() {
		return this.tipodepreciacionempresas;
	}

	public void settipodepreciacionempresas(List<TipoDepreciacionEmpresa> tipodepreciacionempresas) {
		this.tipodepreciacionempresas = tipodepreciacionempresas;
	}
	
	public List<TipoDepreciacionEmpresa> gettipodepreciacionempresasAux() {
		return this.tipodepreciacionempresasAux;
	}

	public void settipodepreciacionempresasAux(List<TipoDepreciacionEmpresa> tipodepreciacionempresasAux) {
		this.tipodepreciacionempresasAux = tipodepreciacionempresasAux;
	}
	
	public List<TipoDepreciacionEmpresa> gettipodepreciacionempresasEliminados() {
		return this.tipodepreciacionempresasEliminados;
	}

	public void setTipoDepreciacionEmpresasEliminados(List<TipoDepreciacionEmpresa> tipodepreciacionempresasEliminados) {
		this.tipodepreciacionempresasEliminados = tipodepreciacionempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDepreciacionEmpresa() {
		return jComboBoxTiposSeleccionarTipoDepreciacionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoDepreciacionEmpresa) {
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa = jComboBoxTiposSeleccionarTipoDepreciacionEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDepreciacionEmpresa() {
		return jTextFieldValorCampoGeneralTipoDepreciacionEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoDepreciacionEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoDepreciacionEmpresa) {
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa = jTextFieldValorCampoGeneralTipoDepreciacionEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDepreciacionEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoDepreciacionEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa = jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDepreciacionEmpresa() {
		return this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoDepreciacionEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoDepreciacionEmpresa) {
		this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa = jCheckBoxSeleccionadosTipoDepreciacionEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa = jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposReportesTipoDepreciacionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposReportesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa = jComboBoxTiposReportesTipoDepreciacionEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa = jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa = jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoDepreciacionEmpresa) {
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa = jComboBoxTiposPaginacionTipoDepreciacionEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposAccionesTipoDepreciacionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa = jComboBoxTiposRelacionesTipoDepreciacionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposAccionesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa = jComboBoxTiposAccionesTipoDepreciacionEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDepreciacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa = jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDepreciacionEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDepreciacionEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa .setBorder(borderResaltar);		
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
		this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
		
		this.tipodepreciacionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodepreciacionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDepreciacionEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Depreciacion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDepreciacionEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDepreciacionEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"copiar","copiar","Copiar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"recargar","recargar","Recargar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoDepreciacionEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDepreciacionEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoDepreciacionEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDepreciacionEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDepreciacionEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoDepreciacionEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDepreciacionEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoDepreciacionEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDepreciacionEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDepreciacionEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDepreciacionEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDepreciacionEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDepreciacionEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDepreciacionEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDepreciacionEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDepreciacionEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDepreciacionEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDepreciacionEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDepreciacionEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDepreciacionEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDepreciacionEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDepreciacionEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDepreciacionEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDepreciacionEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDepreciacionEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDepreciacionEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDepreciacionEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDepreciacionEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDepreciacionEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDepreciacionEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDepreciacionEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDepreciacionEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDepreciacionEmpresa.add(this.jMenuItemCerrarTipoDepreciacionEmpresa);
			
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemNuevoTipoDepreciacionEmpresa);
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa);
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa);
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa);		
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemDuplicarTipoDepreciacionEmpresa);		
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemCopiarTipoDepreciacionEmpresa);		
			this.jmenuAccionesTipoDepreciacionEmpresa.add(this.jMenuItemVerFormTipoDepreciacionEmpresa);		
			
			this.jmenuDatosTipoDepreciacionEmpresa.add(this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa);				
			this.jmenuDatosTipoDepreciacionEmpresa.add(this.jMenuItemAnterioresTipoDepreciacionEmpresa);				
			this.jmenuDatosTipoDepreciacionEmpresa.add(this.jMenuItemSiguientesTipoDepreciacionEmpresa);				
			this.jmenuDatosTipoDepreciacionEmpresa.add(this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa);				
			this.jmenuDatosTipoDepreciacionEmpresa.add(this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDepreciacionEmpresa.add(this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDepreciacionEmpresa.add(this.jmenuArchivoTipoDepreciacionEmpresa);		
			this.jmenuBarTipoDepreciacionEmpresa.add(this.jmenuAccionesTipoDepreciacionEmpresa);		
			this.jmenuBarTipoDepreciacionEmpresa.add(this.jmenuDatosTipoDepreciacionEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDepreciacionEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDepreciacionEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoDepreciacionEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDepreciacionEmpresa = new TipoDepreciacionEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Depreciacion Empresa DATOS");
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa = new TipoDepreciacionEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones(),this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa = null;//new TipoDepreciacionEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDepreciacionEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoDepreciacionEmpresa = new JTableMe();      
		
		String sToolTipTipoDepreciacionEmpresa="";
		sToolTipTipoDepreciacionEmpresa=TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDepreciacionEmpresa+="(ActivosFijos.TipoDepreciacionEmpresa)";
		}
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDepreciacionEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDepreciacionEmpresa.setToolTipText(sToolTipTipoDepreciacionEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDepreciacionEmpresa);
		this.jTableDatosTipoDepreciacionEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDepreciacionEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoDepreciacionEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonCopiarTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonVerFormTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonCerrarTipoDepreciacionEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoDepreciacionEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Depreciacion Empresa";
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Depreciacion Empresaes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDepreciacionEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDepreciacionEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoDepreciacionEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa=new ReporteDinamicoJInternalFrame(TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDepreciacionEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDepreciacionEmpresa=new ImportacionJInternalFrame(TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDepreciacionEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDepreciacionEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDepreciacionEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoDepreciacionEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDepreciacionEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDepreciacionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDepreciacionEmpresa,false,this);
			
			//this.cargarOrderByTipoDepreciacionEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDepreciacionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDepreciacionEmpresa,true,this);
			
			//this.cargarOrderByTipoDepreciacionEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDepreciacionEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoDepreciacionEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoDepreciacionEmpresa.setText("Copiar");
		this.jButtonVerFormTipoDepreciacionEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.setText("Guardar");
		this.jButtonCerrarTipoDepreciacionEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDepreciacionEmpresa,"nuevo_button","Nuevo",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDepreciacionEmpresa,"duplicar_button","Duplicar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDepreciacionEmpresa,"copiar_button","Copiar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDepreciacionEmpresa,"ver_form","Ver",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDepreciacionEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa,"guardarcambiostabla_button","Guardar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDepreciacionEmpresa,"cerrar_button","Salir",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDepreciacionEmpresa.setToolTipText("Nuevo"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDepreciacionEmpresa.setToolTipText("Duplicar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDepreciacionEmpresa.setToolTipText("Copiar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDepreciacionEmpresa.setToolTipText("Ver"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.setToolTipText("Nuevo Rel"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.setToolTipText("Guardar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDepreciacionEmpresa.setToolTipText("Salir"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDepreciacionEmpresa";
		inputMap = this.jButtonNuevoTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDepreciacionEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDepreciacionEmpresa";
		inputMap = this.jButtonDuplicarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDepreciacionEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoDepreciacionEmpresa";
		inputMap = this.jButtonCopiarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDepreciacionEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDepreciacionEmpresa";
		inputMap = this.jButtonVerFormTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDepreciacionEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDepreciacionEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDepreciacionEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDepreciacionEmpresa";
		inputMap = this.jButtonModificarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDepreciacionEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDepreciacionEmpresa";
		inputMap = this.jButtonCerrarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDepreciacionEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDepreciacionEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDepreciacionEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDepreciacionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDepreciacionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDepreciacionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDepreciacionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDepreciacionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDepreciacionEmpresa.setName("jPanelParametrosReportesTipoDepreciacionEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa.setName("jPanelParametrosReportesAccionesTipoDepreciacionEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.setToolTipText("Recargar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDepreciacionEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa.setToolTipText("Procesar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDepreciacionEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoDepreciacionEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDepreciacionEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoDepreciacionEmpresa.setText("<<");
        this.jButtonAnterioresTipoDepreciacionEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDepreciacionEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDepreciacionEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoDepreciacionEmpresa.setText(">>");
        this.jButtonSiguientesTipoDepreciacionEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDepreciacionEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa,"nuevoguardarcambios_button","Nue",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDepreciacionEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDepreciacionEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDepreciacionEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDepreciacionEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDepreciacionEmpresa";
		inputMap = this.jButtonSiguientesTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDepreciacionEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDepreciacionEmpresa";
		inputMap = this.jButtonAnterioresTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDepreciacionEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDepreciacionEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoDepreciacionEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDepreciacionEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoDepreciacionEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDepreciacionEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoDepreciacionEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDepreciacionEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDepreciacionEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoDepreciacionEmpresa.setLayout(gridaBagLayoutPaginacionTipoDepreciacionEmpresa);						
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonAnterioresTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
					
						
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
						
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonSiguientesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonNuevoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonNuevoRelacionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			}
			
			
			if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonDuplicarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonCopiarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonVerFormTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDepreciacionEmpresa.add(this.jButtonCerrarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDepreciacionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDepreciacionEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDepreciacionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDepreciacionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDepreciacionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDepreciacionEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.setLayout(gridaBagParametrosReportesTipoDepreciacionEmpresa);
			this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoDepreciacionEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoDepreciacionEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoDepreciacionEmpresa);
			this.jPanelParametrosAuxiliar2TipoDepreciacionEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoDepreciacionEmpresa);
			this.jPanelParametrosAuxiliar3TipoDepreciacionEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoDepreciacionEmpresa);
			this.jPanelParametrosAuxiliar4TipoDepreciacionEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoDepreciacionEmpresa);
			//this.jPanelParametrosAuxiliar5TipoDepreciacionEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoDepreciacionEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jButtonRecargarInformacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDepreciacionEmpresa.add(this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDepreciacionEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDepreciacionEmpresa.add(this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jPanelParametrosAuxiliar1TipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDepreciacionEmpresa.add(this.jComboBoxTiposReportesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jPanelParametrosAuxiliar4TipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jComboBoxTiposReportesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jCheckBoxGenerarReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jPanelParametrosAuxiliar2TipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jLabelAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jButtonAbrirOrderByTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDepreciacionEmpresa.add(this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);															
				
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDepreciacionEmpresa.add(this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jPanelParametrosAuxiliar3TipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
				
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.add(this.jComboBoxTiposAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDepreciacionEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoDepreciacionEmpresa.setLayout(gridaBagLayoutDatosTipoDepreciacionEmpresa);
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoDepreciacionEmpresa.add(this.jTableDatosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setViewportView(this.jTableDatosTipoDepreciacionEmpresa);
		this.jTableDatosTipoDepreciacionEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoDepreciacionEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDepreciacionEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoDepreciacionEmpresa.setLayout(gridaBagLayoutAccionesTipoDepreciacionEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoDepreciacionEmpresa.add(this.jButtonNuevoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDepreciacionEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoDepreciacionEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDepreciacionEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		*/		
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDepreciacionEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
				
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDepreciacionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDepreciacionEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDepreciacionEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoDepreciacionEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
			
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
			
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDepreciacionEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDepreciacionEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.setName("jPanelReporteDinamicoTipoDepreciacionEmpresa"); 
		
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoDepreciacionEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Depreciacion Empresaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDepreciacionEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDepreciacionEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jLabelColumnasSelectReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDepreciacionEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDepreciacionEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDepreciacionEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoDepreciacionEmpresa);
			
			this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jListColumnasSelectReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDepreciacionEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDepreciacionEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jLabelRelacionesSelectReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDepreciacionEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDepreciacionEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDepreciacionEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDepreciacionEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoDepreciacionEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoDepreciacionEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDepreciacionEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDepreciacionEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jListRelacionesSelectReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jScrollRelacionesSelectReporteTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDepreciacionEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDepreciacionEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDepreciacionEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.setToolTipText("Generar EXCEL"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa.setToolTipText("Generar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa.setToolTipText("Cancelar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDepreciacionEmpresa.add(this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDepreciacionEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa= new JScrollPane(jPanelReporteDinamicoTipoDepreciacionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Depreciacion Empresaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDepreciacionEmpresa);
		this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDepreciacionEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDepreciacionEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDepreciacionEmpresa.setName("jPanelImportacionTipoDepreciacionEmpresa"); 
		
		this.jPanelImportacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDepreciacionEmpresa.setLayout(gridaBagLayoutImportacionTipoDepreciacionEmpresa);
		
		
		this.jInternalFrameImportacionTipoDepreciacionEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDepreciacionEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDepreciacionEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoDepreciacionEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Depreciacion Empresaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDepreciacionEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoDepreciacionEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDepreciacionEmpresa.add(this.jLabelArchivoImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDepreciacionEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoDepreciacionEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoDepreciacionEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDepreciacionEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDepreciacionEmpresa.setToolTipText("Generar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDepreciacionEmpresa.add(this.jButtonAbrirImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDepreciacionEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDepreciacionEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDepreciacionEmpresa.add(this.jLabelPathArchivoImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDepreciacionEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDepreciacionEmpresa.add(this.jTextFieldPathArchivoImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoDepreciacionEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDepreciacionEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDepreciacionEmpresa.setToolTipText("Generar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDepreciacionEmpresa.add(this.jButtonGenerarImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoDepreciacionEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDepreciacionEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDepreciacionEmpresa.setToolTipText("Cancelar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDepreciacionEmpresa.add(this.jButtonCerrarImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDepreciacionEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDepreciacionEmpresa= new JScrollPane(jPanelImportacionTipoDepreciacionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDepreciacionEmpresa);
		this.jInternalFrameImportacionTipoDepreciacionEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDepreciacionEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDepreciacionEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDepreciacionEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDepreciacionEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDepreciacionEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDepreciacionEmpresa.setName("jPanelOrderByTipoDepreciacionEmpresa"); 
			
			this.jPanelOrderByTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDepreciacionEmpresa.setLayout(gridaBagLayoutOrderByTipoDepreciacionEmpresa);
			
			
			this.jTableDatosTipoDepreciacionEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoDepreciacionEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDepreciacionEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDepreciacionEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDepreciacionEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDepreciacionEmpresaOrderBy.setViewportView(this.jTableDatosTipoDepreciacionEmpresaOrderBy);
			this.jTableDatosTipoDepreciacionEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDepreciacionEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDepreciacionEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDepreciacionEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDepreciacionEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDepreciacionEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Depreciacion Empresaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDepreciacionEmpresa.ipady =150;
				
			this.jPanelOrderByTipoDepreciacionEmpresa.add(jScrollPanelDatosTipoDepreciacionEmpresaOrderBy, this.gridBagConstraintsTipoDepreciacionEmpresa);//this.jTableDatosTipoDepreciacionEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDepreciacionEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoDepreciacionEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDepreciacionEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDepreciacionEmpresa.setToolTipText("Cancelar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDepreciacionEmpresa.add(this.jButtonCerrarOrderByTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDepreciacionEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDepreciacionEmpresa= new JScrollPane(jPanelOrderByTipoDepreciacionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDepreciacionEmpresa);
			
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDepreciacionEmpresa.getRowHeight();//TipoDepreciacionEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.isSelected()) {
					iHeightTable=TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDepreciacionEmpresa.isSelected()) {
					iHeightTable=TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDepreciacionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDepreciacionEmpresa!=null && this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodepreciacionempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDepreciacionEmpresa> TraerTipoDepreciacionEmpresaBeans(List<TipoDepreciacionEmpresa> tipodepreciacionempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresas) {
					
				if(!(TipoDepreciacionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDepreciacionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodepreciacionempresa.setsDetalleGeneralEntityReporte(TipoDepreciacionEmpresaConstantesFunciones.getTipoDepreciacionEmpresaDescripcion(tipodepreciacionempresa));
										
					tipodepreciacionempresa.setes_linea_recta_descripcion(TipoDepreciacionEmpresaConstantesFunciones.getes_linea_rectaDescripcion(tipodepreciacionempresa));tipodepreciacionempresa.setes_mensual_descripcion(TipoDepreciacionEmpresaConstantesFunciones.getes_mensualDescripcion(tipodepreciacionempresa));	
					
					

					if(tipodepreciacionempresa.getDetalleActivoFijos()!=null && Funciones.existeClass(classes,DetalleActivoFijo.class)) {
						try{tipodepreciacionempresa.setdetalleactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DetalleActivoFijoJInternalFrame.TraerDetalleActivoFijoBeans(tipodepreciacionempresa.getDetalleActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipodepreciacionempresa.getDepreciacionActivoFijos()!=null && Funciones.existeClass(classes,DepreciacionActivoFijo.class)) {
						try{tipodepreciacionempresa.setdepreciacionactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DepreciacionActivoFijoJInternalFrame.TraerDepreciacionActivoFijoBeans(tipodepreciacionempresa.getDepreciacionActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodepreciacionempresa.setsDetalleGeneralEntityReporte(tipodepreciacionempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodepreciacionempresabeans.add(tipodepreciacionempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodepreciacionempresas;
    }
	//PARA REPORTES FIN
}
