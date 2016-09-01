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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoGastoProduEmpresaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoGastoProduEmpresaJInternalFrame extends TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGastoProduEmpresa;
	
	protected JMenuBar jmenuBarTipoGastoProduEmpresa;
	
	protected JMenu jmenuTipoGastoProduEmpresa;
	protected JMenu jmenuDatosTipoGastoProduEmpresa;
	protected JMenu jmenuArchivoTipoGastoProduEmpresa;
	protected JMenu jmenuAccionesTipoGastoProduEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGastoProduEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoGastoProduEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGastoProduEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGastoProduEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGastoProduEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGastoProduEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGastoProduEmpresa> tipogastoproduempresas;		
	public List<TipoGastoProduEmpresa> tipogastoproduempresasEliminados;	
	public List<TipoGastoProduEmpresa> tipogastoproduempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGastoProduEmpresa;		
	protected JButton jButtonAbrirOrderByTipoGastoProduEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoGastoProduEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoGastoProduEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoGastoProduEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGastoProduEmpresaLogic tipogastoproduempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGastoProduEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoGastoProduEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoGastoProduEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGastoProduEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGastoProduEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoGastoProduEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoGastoProduEmpresa;
	
    protected JPanel jPanelPaginacionTipoGastoProduEmpresa;
    protected JPanel jPanelParametrosReportesTipoGastoProduEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoGastoProduEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGastoProduEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoGastoProduEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoGastoProduEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoGastoProduEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoGastoProduEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGastoProduEmpresa;
	//protected JPanel jPanelImportacionTipoGastoProduEmpresa;
	
	
	public JTable jTableDatosTipoGastoProduEmpresa;
	
	
	
	//public JTable jTableDatosTipoGastoProduEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGastoProduEmpresa;
	protected JButton jButtonDuplicarTipoGastoProduEmpresa;
	protected JButton jButtonCopiarTipoGastoProduEmpresa;
	protected JButton jButtonVerFormTipoGastoProduEmpresa;
	protected JButton jButtonNuevoRelacionesTipoGastoProduEmpresa;
	protected JButton jButtonModificarTipoGastoProduEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoGastoProduEmpresa;
	protected JButton jButtonCerrarTipoGastoProduEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoGastoProduEmpresa;
	protected JButton jButtonProcesarInformacionTipoGastoProduEmpresa;
	
	
	protected JButton jButtonAnterioresTipoGastoProduEmpresa;
	protected JButton jButtonSiguientesTipoGastoProduEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoGastoProduEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGastoProduEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoGastoProduEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGastoProduEmpresa;
	//protected JButton jButtonGenerarImportacionTipoGastoProduEmpresa;
	//protected JButton jButtonCerrarImportacionTipoGastoProduEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoGastoProduEmpresa;
	//protected File fileImportacionTipoGastoProduEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGastoProduEmpresa;
	protected JButton jButtonDuplicarToolBarTipoGastoProduEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGastoProduEmpresa;
	protected JButton jButtonCopiarToolBarTipoGastoProduEmpresa;
	protected JButton jButtonVerFormToolBarTipoGastoProduEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGastoProduEmpresa;
	protected JButton jButtonCerrarToolBarTipoGastoProduEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGastoProduEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoGastoProduEmpresa;
	protected JButton jButtonAnterioresToolBarTipoGastoProduEmpresa;
	protected JButton jButtonSiguientesToolBarTipoGastoProduEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGastoProduEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoGastoProduEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGastoProduEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemCopiarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemVerFormTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemCerrarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoGastoProduEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGastoProduEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGastoProduEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoGastoProduEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGastoProduEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGastoProduEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoGastoProduEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGastoProduEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoGastoProduEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoGastoProduEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGastoProduEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGastoProduEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGastoProduEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGastoProduEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoGastoProduEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoGastoProduEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGastoProduEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGastoProduEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGastoProduEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGastoProduEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGastoProduEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGastoProduEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGastoProduEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGastoProduEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGastoProduEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGastoProduEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGastoProduEmpresa;
	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoGastoProduEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGastoProduEmpresa)	{
		this.jButtonRecargarInformacionTipoGastoProduEmpresa = jButtonRecargarInformacionTipoGastoProduEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoGastoProduEmpresa() {
		return this.jButtonProcesarInformacionTipoGastoProduEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGastoProduEmpresa)	{
		this.jButtonProcesarInformacionTipoGastoProduEmpresa = jButtonProcesarInformacionTipoGastoProduEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGastoProduEmpresa() {
		return this.jButtonRecargarInformacionTipoGastoProduEmpresa;
	}
	
	
	public List<TipoGastoProduEmpresa> gettipogastoproduempresas() {
		return this.tipogastoproduempresas;
	}

	public void settipogastoproduempresas(List<TipoGastoProduEmpresa> tipogastoproduempresas) {
		this.tipogastoproduempresas = tipogastoproduempresas;
	}
	
	public List<TipoGastoProduEmpresa> gettipogastoproduempresasAux() {
		return this.tipogastoproduempresasAux;
	}

	public void settipogastoproduempresasAux(List<TipoGastoProduEmpresa> tipogastoproduempresasAux) {
		this.tipogastoproduempresasAux = tipogastoproduempresasAux;
	}
	
	public List<TipoGastoProduEmpresa> gettipogastoproduempresasEliminados() {
		return this.tipogastoproduempresasEliminados;
	}

	public void setTipoGastoProduEmpresasEliminados(List<TipoGastoProduEmpresa> tipogastoproduempresasEliminados) {
		this.tipogastoproduempresasEliminados = tipogastoproduempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGastoProduEmpresa() {
		return jComboBoxTiposSeleccionarTipoGastoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoGastoProduEmpresa) {
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa = jComboBoxTiposSeleccionarTipoGastoProduEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGastoProduEmpresa() {
		return jTextFieldValorCampoGeneralTipoGastoProduEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoGastoProduEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoGastoProduEmpresa) {
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa = jTextFieldValorCampoGeneralTipoGastoProduEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGastoProduEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoGastoProduEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoGastoProduEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa = jCheckBoxSeleccionarTodosTipoGastoProduEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGastoProduEmpresa() {
		return this.jCheckBoxSeleccionadosTipoGastoProduEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoGastoProduEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoGastoProduEmpresa) {
		this.jCheckBoxSeleccionadosTipoGastoProduEmpresa = jCheckBoxSeleccionadosTipoGastoProduEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGastoProduEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoGastoProduEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa = jComboBoxTiposArchivosReportesTipoGastoProduEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGastoProduEmpresa() {
		return this.jComboBoxTiposReportesTipoGastoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposReportesTipoGastoProduEmpresa) {
		this.jComboBoxTiposReportesTipoGastoProduEmpresa = jComboBoxTiposReportesTipoGastoProduEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGastoProduEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGastoProduEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa = jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGastoProduEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoGastoProduEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa = jComboBoxTiposGraficosReportesTipoGastoProduEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGastoProduEmpresa() {
		return this.jComboBoxTiposPaginacionTipoGastoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoGastoProduEmpresa) {
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa = jComboBoxTiposPaginacionTipoGastoProduEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGastoProduEmpresa() {
		return this.jComboBoxTiposRelacionesTipoGastoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGastoProduEmpresa() {
		return this.jComboBoxTiposAccionesTipoGastoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoGastoProduEmpresa) {
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa = jComboBoxTiposRelacionesTipoGastoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposAccionesTipoGastoProduEmpresa) {
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa = jComboBoxTiposAccionesTipoGastoProduEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGastoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGastoProduEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGastoProduEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa = jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGastoProduEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGastoProduEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa .setBorder(borderResaltar);		
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
		this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
		
		this.tipogastoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGastoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGastoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoProduEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto Produccion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGastoProduEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGastoProduEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"copiar","copiar","Copiar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"recargar","recargar","Recargar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGastoProduEmpresa,this.jTtoolBarTipoGastoProduEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGastoProduEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoGastoProduEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGastoProduEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoGastoProduEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGastoProduEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGastoProduEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoGastoProduEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGastoProduEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoGastoProduEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGastoProduEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGastoProduEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGastoProduEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGastoProduEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGastoProduEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGastoProduEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGastoProduEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGastoProduEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGastoProduEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGastoProduEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGastoProduEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGastoProduEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGastoProduEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGastoProduEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGastoProduEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGastoProduEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGastoProduEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGastoProduEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGastoProduEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGastoProduEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGastoProduEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGastoProduEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGastoProduEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGastoProduEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGastoProduEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGastoProduEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGastoProduEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGastoProduEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGastoProduEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGastoProduEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGastoProduEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGastoProduEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGastoProduEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGastoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGastoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGastoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGastoProduEmpresa.add(this.jMenuItemCerrarTipoGastoProduEmpresa);
			
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemNuevoTipoGastoProduEmpresa);
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa);
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemNuevoRelacionesTipoGastoProduEmpresa);
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa);		
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemDuplicarTipoGastoProduEmpresa);		
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemCopiarTipoGastoProduEmpresa);		
			this.jmenuAccionesTipoGastoProduEmpresa.add(this.jMenuItemVerFormTipoGastoProduEmpresa);		
			
			this.jmenuDatosTipoGastoProduEmpresa.add(this.jMenuItemRecargarInformacionTipoGastoProduEmpresa);				
			this.jmenuDatosTipoGastoProduEmpresa.add(this.jMenuItemAnterioresTipoGastoProduEmpresa);				
			this.jmenuDatosTipoGastoProduEmpresa.add(this.jMenuItemSiguientesTipoGastoProduEmpresa);				
			this.jmenuDatosTipoGastoProduEmpresa.add(this.jMenuItemAbrirOrderByTipoGastoProduEmpresa);				
			this.jmenuDatosTipoGastoProduEmpresa.add(this.jMenuItemMostrarOcultarTipoGastoProduEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGastoProduEmpresa.add(this.jMenuItemGuardarCambiosTipoGastoProduEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGastoProduEmpresa.add(this.jmenuArchivoTipoGastoProduEmpresa);		
			this.jmenuBarTipoGastoProduEmpresa.add(this.jmenuAccionesTipoGastoProduEmpresa);		
			this.jmenuBarTipoGastoProduEmpresa.add(this.jmenuDatosTipoGastoProduEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGastoProduEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGastoProduEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoGastoProduEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGastoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGastoProduEmpresa = new TipoGastoProduEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Gasto Produccion Empresa DATOS");
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa = new TipoGastoProduEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipogastoproduempresaSessionBean.getConGuardarRelaciones(),this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGastoProduEmpresa = null;//new TipoGastoProduEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGastoProduEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoGastoProduEmpresa = new JTableMe();      
		
		String sToolTipTipoGastoProduEmpresa="";
		sToolTipTipoGastoProduEmpresa=TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGastoProduEmpresa+="(Produccion.TipoGastoProduEmpresa)";
		}
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGastoProduEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGastoProduEmpresa.setToolTipText(sToolTipTipoGastoProduEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGastoProduEmpresa);
		this.jTableDatosTipoGastoProduEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGastoProduEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGastoProduEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoGastoProduEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonCopiarTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonVerFormTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonCerrarTipoGastoProduEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoGastoProduEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGastoProduEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto Produccion Empresa";
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccion Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGastoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGastoProduEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoGastoProduEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa=new ReporteDinamicoJInternalFrame(TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGastoProduEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGastoProduEmpresa=new ImportacionJInternalFrame(TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGastoProduEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGastoProduEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGastoProduEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoGastoProduEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGastoProduEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGastoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProduEmpresa,false,this);
			
			//this.cargarOrderByTipoGastoProduEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGastoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProduEmpresa,true,this);
			
			//this.cargarOrderByTipoGastoProduEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGastoProduEmpresa.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGastoProduEmpresa.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGastoProduEmpresa.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGastoProduEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGastoProduEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGastoProduEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGastoProduEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoGastoProduEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoGastoProduEmpresa.setText("Copiar");
		this.jButtonVerFormTipoGastoProduEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.setText("Guardar");
		this.jButtonCerrarTipoGastoProduEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGastoProduEmpresa,"nuevo_button","Nuevo",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGastoProduEmpresa,"duplicar_button","Duplicar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGastoProduEmpresa,"copiar_button","Copiar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGastoProduEmpresa,"ver_form","Ver",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGastoProduEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa,"guardarcambiostabla_button","Guardar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGastoProduEmpresa,"cerrar_button","Salir",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGastoProduEmpresa.setToolTipText("Nuevo"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGastoProduEmpresa.setToolTipText("Duplicar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGastoProduEmpresa.setToolTipText("Copiar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGastoProduEmpresa.setToolTipText("Ver"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.setToolTipText("Nuevo Rel"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.setToolTipText("Guardar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGastoProduEmpresa.setToolTipText("Salir"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGastoProduEmpresa";
		inputMap = this.jButtonNuevoTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGastoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGastoProduEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGastoProduEmpresa";
		inputMap = this.jButtonDuplicarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGastoProduEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoGastoProduEmpresa";
		inputMap = this.jButtonCopiarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGastoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGastoProduEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGastoProduEmpresa";
		inputMap = this.jButtonVerFormTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGastoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGastoProduEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGastoProduEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGastoProduEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGastoProduEmpresa";
		inputMap = this.jButtonModificarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGastoProduEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGastoProduEmpresa";
		inputMap = this.jButtonCerrarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGastoProduEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGastoProduEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGastoProduEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGastoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGastoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGastoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGastoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGastoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGastoProduEmpresa.setName("jPanelParametrosReportesTipoGastoProduEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa.setName("jPanelParametrosReportesAccionesTipoGastoProduEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.setToolTipText("Recargar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGastoProduEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoGastoProduEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoGastoProduEmpresa.setToolTipText("Procesar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGastoProduEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGastoProduEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGastoProduEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoGastoProduEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGastoProduEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGastoProduEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoGastoProduEmpresa.setText("<<");
        this.jButtonAnterioresTipoGastoProduEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGastoProduEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGastoProduEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoGastoProduEmpresa.setText(">>");
        this.jButtonSiguientesTipoGastoProduEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGastoProduEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa,"nuevoguardarcambios_button","Nue",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGastoProduEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGastoProduEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGastoProduEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGastoProduEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGastoProduEmpresa";
		inputMap = this.jButtonSiguientesTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGastoProduEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGastoProduEmpresa";
		inputMap = this.jButtonAnterioresTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGastoProduEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGastoProduEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoGastoProduEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoProduEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoGastoProduEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoProduEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoGastoProduEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoProduEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGastoProduEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoGastoProduEmpresa.setLayout(gridaBagLayoutPaginacionTipoGastoProduEmpresa);						
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonAnterioresTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
					
						
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonNuevoGuardarCambiosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
						
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonSiguientesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonNuevoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
						
			
			
			if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 1;
				this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonDuplicarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonCopiarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonVerFormTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGastoProduEmpresa.add(this.jButtonCerrarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGastoProduEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGastoProduEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGastoProduEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGastoProduEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGastoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGastoProduEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGastoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGastoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGastoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGastoProduEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGastoProduEmpresa.setLayout(gridaBagParametrosReportesTipoGastoProduEmpresa);
			this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoGastoProduEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoGastoProduEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoGastoProduEmpresa);
			this.jPanelParametrosAuxiliar2TipoGastoProduEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoGastoProduEmpresa);
			this.jPanelParametrosAuxiliar3TipoGastoProduEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoGastoProduEmpresa);
			this.jPanelParametrosAuxiliar4TipoGastoProduEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoGastoProduEmpresa);
			//this.jPanelParametrosAuxiliar5TipoGastoProduEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoGastoProduEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jButtonRecargarInformacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoProduEmpresa.add(this.jComboBoxTiposPaginacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoProduEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoProduEmpresa.add(this.jComboBoxTiposArchivosReportesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jPanelParametrosAuxiliar1TipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGastoProduEmpresa.add(this.jComboBoxTiposReportesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jPanelParametrosAuxiliar4TipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jComboBoxTiposReportesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jCheckBoxGenerarReporteTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jPanelParametrosAuxiliar2TipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jLabelAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jButtonAbrirOrderByTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jComboBoxTiposSeleccionarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGastoProduEmpresa.add(this.jCheckBoxSeleccionarTodosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);															
				
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGastoProduEmpresa.add(this.jCheckBoxSeleccionadosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jPanelParametrosAuxiliar3TipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jComboBoxTiposRelacionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
				
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jComboBoxTiposAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
	
				
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProduEmpresa.add(this.jTextFieldValorCampoGeneralTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGastoProduEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoGastoProduEmpresa.setLayout(gridaBagLayoutDatosTipoGastoProduEmpresa);
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoGastoProduEmpresa.add(this.jTableDatosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGastoProduEmpresa.setViewportView(this.jTableDatosTipoGastoProduEmpresa);
		this.jTableDatosTipoGastoProduEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoGastoProduEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGastoProduEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoGastoProduEmpresa.setLayout(gridaBagLayoutAccionesTipoGastoProduEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoGastoProduEmpresa.add(this.jButtonNuevoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGastoProduEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGastoProduEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoGastoProduEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoGastoProduEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGastoProduEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		*/		
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =0;
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGastoProduEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
				
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGastoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGastoProduEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGastoProduEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoGastoProduEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
			
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
			
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGastoProduEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGastoProduEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGastoProduEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.setName("jPanelReporteDinamicoTipoGastoProduEmpresa"); 
		
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoGastoProduEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGastoProduEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccion Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGastoProduEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGastoProduEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jLabelColumnasSelectReporteTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGastoProduEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGastoProduEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGastoProduEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGastoProduEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoGastoProduEmpresa);
			
			this.jScrollColumnasSelectReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jListColumnasSelectReporteTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jScrollColumnasSelectReporteTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGastoProduEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGastoProduEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGastoProduEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGastoProduEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGastoProduEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGastoProduEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoGastoProduEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoGastoProduEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGastoProduEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGastoProduEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGastoProduEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGastoProduEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGastoProduEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa.setToolTipText("Generar EXCEL"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa.setToolTipText("Generar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jButtonGenerarReporteDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa.setToolTipText("Cancelar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProduEmpresa.add(this.jButtonCerrarReporteDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGastoProduEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa= new JScrollPane(jPanelReporteDinamicoTipoGastoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccion Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGastoProduEmpresa);
		this.jInternalFrameReporteDinamicoTipoGastoProduEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGastoProduEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGastoProduEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGastoProduEmpresa.setName("jPanelImportacionTipoGastoProduEmpresa"); 
		
		this.jPanelImportacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGastoProduEmpresa.setLayout(gridaBagLayoutImportacionTipoGastoProduEmpresa);
		
		
		this.jInternalFrameImportacionTipoGastoProduEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGastoProduEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGastoProduEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGastoProduEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoGastoProduEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccion Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGastoProduEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoGastoProduEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGastoProduEmpresa.add(this.jLabelArchivoImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGastoProduEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoGastoProduEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoGastoProduEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGastoProduEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGastoProduEmpresa.setToolTipText("Generar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProduEmpresa.add(this.jButtonAbrirImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGastoProduEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGastoProduEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGastoProduEmpresa.add(this.jLabelPathArchivoImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGastoProduEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGastoProduEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGastoProduEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGastoProduEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProduEmpresa.add(this.jTextFieldPathArchivoImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoGastoProduEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGastoProduEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGastoProduEmpresa.setToolTipText("Generar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProduEmpresa.add(this.jButtonGenerarImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoGastoProduEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGastoProduEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGastoProduEmpresa.setToolTipText("Cancelar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProduEmpresa.add(this.jButtonCerrarImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGastoProduEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGastoProduEmpresa= new JScrollPane(jPanelImportacionTipoGastoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGastoProduEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGastoProduEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGastoProduEmpresa);
		this.jInternalFrameImportacionTipoGastoProduEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGastoProduEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGastoProduEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoGastoProduEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoGastoProduEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGastoProduEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGastoProduEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGastoProduEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGastoProduEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGastoProduEmpresa.setName("jPanelOrderByTipoGastoProduEmpresa"); 
			
			this.jPanelOrderByTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGastoProduEmpresa.setLayout(gridaBagLayoutOrderByTipoGastoProduEmpresa);
			
			
			this.jTableDatosTipoGastoProduEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoGastoProduEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGastoProduEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGastoProduEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGastoProduEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGastoProduEmpresaOrderBy.setViewportView(this.jTableDatosTipoGastoProduEmpresaOrderBy);
			this.jTableDatosTipoGastoProduEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGastoProduEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGastoProduEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGastoProduEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGastoProduEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGastoProduEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccion Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGastoProduEmpresa.ipady =150;
				
			this.jPanelOrderByTipoGastoProduEmpresa.add(jScrollPanelDatosTipoGastoProduEmpresaOrderBy, this.gridBagConstraintsTipoGastoProduEmpresa);//this.jTableDatosTipoGastoProduEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGastoProduEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoGastoProduEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGastoProduEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGastoProduEmpresa.setToolTipText("Cancelar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGastoProduEmpresa.add(this.jButtonCerrarOrderByTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGastoProduEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGastoProduEmpresa= new JScrollPane(jPanelOrderByTipoGastoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGastoProduEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGastoProduEmpresa);
			
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoGastoProduEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGastoProduEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGastoProduEmpresa.getRowHeight();//TipoGastoProduEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.isSelected()) {
					iHeightTable=TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGastoProduEmpresa.isSelected()) {
					iHeightTable=TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGastoProduEmpresa!=null && this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGastoProduEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogastoproduempresaLogic.getTipoGastoProduEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoproduempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGastoProduEmpresa> TraerTipoGastoProduEmpresaBeans(List<TipoGastoProduEmpresa> tipogastoproduempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGastoProduEmpresa tipogastoproduempresa:tipogastoproduempresas) {
					
				if(!(TipoGastoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGastoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogastoproduempresa.setsDetalleGeneralEntityReporte(TipoGastoProduEmpresaConstantesFunciones.getTipoGastoProduEmpresaDescripcion(tipogastoproduempresa));
										
						
					
						
					
				} else  {
							
					//tipogastoproduempresa.setsDetalleGeneralEntityReporte(tipogastoproduempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogastoproduempresabeans.add(tipogastoproduempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogastoproduempresas;
    }
	//PARA REPORTES FIN
}
