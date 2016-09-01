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
import com.bydan.erp.produccion.util.TipoManoProduEmpresaConstantesFunciones;

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
public class TipoManoProduEmpresaJInternalFrame extends TipoManoProduEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoManoProduEmpresa;
	
	protected JMenuBar jmenuBarTipoManoProduEmpresa;
	
	protected JMenu jmenuTipoManoProduEmpresa;
	protected JMenu jmenuDatosTipoManoProduEmpresa;
	protected JMenu jmenuArchivoTipoManoProduEmpresa;
	protected JMenu jmenuAccionesTipoManoProduEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoManoProduEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoManoProduEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoManoProduEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoManoProduEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoManoProduEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoManoProduEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoManoProduEmpresa> tipomanoproduempresas;		
	public List<TipoManoProduEmpresa> tipomanoproduempresasEliminados;	
	public List<TipoManoProduEmpresa> tipomanoproduempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoManoProduEmpresa;		
	protected JButton jButtonAbrirOrderByTipoManoProduEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoManoProduEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoManoProduEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoManoProduEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoManoProduEmpresaLogic tipomanoproduempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoManoProduEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoManoProduEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoManoProduEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoManoProduEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoManoProduEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoManoProduEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoManoProduEmpresa;
	
    protected JPanel jPanelPaginacionTipoManoProduEmpresa;
    protected JPanel jPanelParametrosReportesTipoManoProduEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoManoProduEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoManoProduEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoManoProduEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoManoProduEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoManoProduEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoManoProduEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoManoProduEmpresa;
	//protected JPanel jPanelImportacionTipoManoProduEmpresa;
	
	
	public JTable jTableDatosTipoManoProduEmpresa;
	
	
	
	//public JTable jTableDatosTipoManoProduEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoManoProduEmpresa;
	protected JButton jButtonDuplicarTipoManoProduEmpresa;
	protected JButton jButtonCopiarTipoManoProduEmpresa;
	protected JButton jButtonVerFormTipoManoProduEmpresa;
	protected JButton jButtonNuevoRelacionesTipoManoProduEmpresa;
	protected JButton jButtonModificarTipoManoProduEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoManoProduEmpresa;
	protected JButton jButtonCerrarTipoManoProduEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoManoProduEmpresa;
	protected JButton jButtonProcesarInformacionTipoManoProduEmpresa;
	
	
	protected JButton jButtonAnterioresTipoManoProduEmpresa;
	protected JButton jButtonSiguientesTipoManoProduEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoManoProduEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoManoProduEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoManoProduEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoManoProduEmpresa;
	//protected JButton jButtonGenerarImportacionTipoManoProduEmpresa;
	//protected JButton jButtonCerrarImportacionTipoManoProduEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoManoProduEmpresa;
	//protected File fileImportacionTipoManoProduEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoManoProduEmpresa;
	protected JButton jButtonDuplicarToolBarTipoManoProduEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoManoProduEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoManoProduEmpresa;
	protected JButton jButtonCopiarToolBarTipoManoProduEmpresa;
	protected JButton jButtonVerFormToolBarTipoManoProduEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoManoProduEmpresa;
	protected JButton jButtonCerrarToolBarTipoManoProduEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoManoProduEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoManoProduEmpresa;
	protected JButton jButtonAnterioresToolBarTipoManoProduEmpresa;
	protected JButton jButtonSiguientesToolBarTipoManoProduEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoManoProduEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoManoProduEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoManoProduEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoManoProduEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoManoProduEmpresa;
	protected JMenuItem jMenuItemCopiarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemVerFormTipoManoProduEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoManoProduEmpresa;
	protected JMenuItem jMenuItemCerrarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoManoProduEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoManoProduEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoManoProduEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoManoProduEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoManoProduEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoManoProduEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoManoProduEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoManoProduEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoManoProduEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoManoProduEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoManoProduEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoManoProduEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoManoProduEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoManoProduEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoManoProduEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoManoProduEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoManoProduEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoManoProduEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoManoProduEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoManoProduEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoManoProduEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoManoProduEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoManoProduEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoManoProduEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoManoProduEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoManoProduEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoManoProduEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoManoProduEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoManoProduEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoManoProduEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoManoProduEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoManoProduEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoManoProduEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoManoProduEmpresa;
	
	
	
	
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
	public TipoManoProduEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoManoProduEmpresa)	{
		this.jButtonRecargarInformacionTipoManoProduEmpresa = jButtonRecargarInformacionTipoManoProduEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoManoProduEmpresa() {
		return this.jButtonProcesarInformacionTipoManoProduEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoManoProduEmpresa)	{
		this.jButtonProcesarInformacionTipoManoProduEmpresa = jButtonProcesarInformacionTipoManoProduEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoManoProduEmpresa() {
		return this.jButtonRecargarInformacionTipoManoProduEmpresa;
	}
	
	
	public List<TipoManoProduEmpresa> gettipomanoproduempresas() {
		return this.tipomanoproduempresas;
	}

	public void settipomanoproduempresas(List<TipoManoProduEmpresa> tipomanoproduempresas) {
		this.tipomanoproduempresas = tipomanoproduempresas;
	}
	
	public List<TipoManoProduEmpresa> gettipomanoproduempresasAux() {
		return this.tipomanoproduempresasAux;
	}

	public void settipomanoproduempresasAux(List<TipoManoProduEmpresa> tipomanoproduempresasAux) {
		this.tipomanoproduempresasAux = tipomanoproduempresasAux;
	}
	
	public List<TipoManoProduEmpresa> gettipomanoproduempresasEliminados() {
		return this.tipomanoproduempresasEliminados;
	}

	public void setTipoManoProduEmpresasEliminados(List<TipoManoProduEmpresa> tipomanoproduempresasEliminados) {
		this.tipomanoproduempresasEliminados = tipomanoproduempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoManoProduEmpresa() {
		return jComboBoxTiposSeleccionarTipoManoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoManoProduEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoManoProduEmpresa) {
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa = jComboBoxTiposSeleccionarTipoManoProduEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoManoProduEmpresa() {
		return jTextFieldValorCampoGeneralTipoManoProduEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoManoProduEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoManoProduEmpresa) {
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa = jTextFieldValorCampoGeneralTipoManoProduEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoManoProduEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoManoProduEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoManoProduEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa = jCheckBoxSeleccionarTodosTipoManoProduEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoManoProduEmpresa() {
		return this.jCheckBoxSeleccionadosTipoManoProduEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoManoProduEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoManoProduEmpresa) {
		this.jCheckBoxSeleccionadosTipoManoProduEmpresa = jCheckBoxSeleccionadosTipoManoProduEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoManoProduEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoManoProduEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa = jComboBoxTiposArchivosReportesTipoManoProduEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoManoProduEmpresa() {
		return this.jComboBoxTiposReportesTipoManoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposReportesTipoManoProduEmpresa) {
		this.jComboBoxTiposReportesTipoManoProduEmpresa = jComboBoxTiposReportesTipoManoProduEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoManoProduEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoManoProduEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoManoProduEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoManoProduEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa = jComboBoxTiposReportesDinamicoTipoManoProduEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoManoProduEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoManoProduEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa = jComboBoxTiposGraficosReportesTipoManoProduEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoManoProduEmpresa() {
		return this.jComboBoxTiposPaginacionTipoManoProduEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoManoProduEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoManoProduEmpresa) {
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa = jComboBoxTiposPaginacionTipoManoProduEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoManoProduEmpresa() {
		return this.jComboBoxTiposRelacionesTipoManoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoManoProduEmpresa() {
		return this.jComboBoxTiposAccionesTipoManoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoManoProduEmpresa) {
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa = jComboBoxTiposRelacionesTipoManoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposAccionesTipoManoProduEmpresa) {
		this.jComboBoxTiposAccionesTipoManoProduEmpresa = jComboBoxTiposAccionesTipoManoProduEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoManoProduEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoManoProduEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoManoProduEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoManoProduEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoManoProduEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoManoProduEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoManoProduEmpresa = jCheckBoxConGraficoDinamicoTipoManoProduEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoManoProduEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoManoProduEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoManoProduEmpresa .setBorder(borderResaltar);		
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
		this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
		
		this.tipomanoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomanoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoManoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoManoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoManoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoManoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoManoProduEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Mano Obra Produccion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoManoProduEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoManoProduEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"copiar","copiar","Copiar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"recargar","recargar","Recargar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoManoProduEmpresa,this.jTtoolBarTipoManoProduEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoManoProduEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoManoProduEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoManoProduEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoManoProduEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoManoProduEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoManoProduEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoManoProduEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoManoProduEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoManoProduEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoManoProduEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoManoProduEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoManoProduEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoManoProduEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoManoProduEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoManoProduEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoManoProduEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoManoProduEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoManoProduEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoManoProduEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoManoProduEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoManoProduEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoManoProduEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoManoProduEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoManoProduEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoManoProduEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoManoProduEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoManoProduEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoManoProduEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoManoProduEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoManoProduEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoManoProduEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoManoProduEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoManoProduEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoManoProduEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoManoProduEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoManoProduEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoManoProduEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoManoProduEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoManoProduEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoManoProduEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoManoProduEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoManoProduEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoManoProduEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoManoProduEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoManoProduEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoManoProduEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoManoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoManoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoManoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoManoProduEmpresa.add(this.jMenuItemCerrarTipoManoProduEmpresa);
			
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemNuevoTipoManoProduEmpresa);
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa);
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemNuevoRelacionesTipoManoProduEmpresa);
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoManoProduEmpresa);		
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemDuplicarTipoManoProduEmpresa);		
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemCopiarTipoManoProduEmpresa);		
			this.jmenuAccionesTipoManoProduEmpresa.add(this.jMenuItemVerFormTipoManoProduEmpresa);		
			
			this.jmenuDatosTipoManoProduEmpresa.add(this.jMenuItemRecargarInformacionTipoManoProduEmpresa);				
			this.jmenuDatosTipoManoProduEmpresa.add(this.jMenuItemAnterioresTipoManoProduEmpresa);				
			this.jmenuDatosTipoManoProduEmpresa.add(this.jMenuItemSiguientesTipoManoProduEmpresa);				
			this.jmenuDatosTipoManoProduEmpresa.add(this.jMenuItemAbrirOrderByTipoManoProduEmpresa);				
			this.jmenuDatosTipoManoProduEmpresa.add(this.jMenuItemMostrarOcultarTipoManoProduEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoManoProduEmpresa.add(this.jMenuItemGuardarCambiosTipoManoProduEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoManoProduEmpresa.add(this.jmenuArchivoTipoManoProduEmpresa);		
			this.jmenuBarTipoManoProduEmpresa.add(this.jmenuAccionesTipoManoProduEmpresa);		
			this.jmenuBarTipoManoProduEmpresa.add(this.jmenuDatosTipoManoProduEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoManoProduEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoManoProduEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoManoProduEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoManoProduEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoManoProduEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoManoProduEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoManoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoManoProduEmpresa = new TipoManoProduEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Mano Obra Produccion Empresa DATOS");
			this.jInternalFrameDetalleFormTipoManoProduEmpresa = new TipoManoProduEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipomanoproduempresaSessionBean.getConGuardarRelaciones(),this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoManoProduEmpresa = null;//new TipoManoProduEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoManoProduEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoManoProduEmpresa = new JTableMe();      
		
		String sToolTipTipoManoProduEmpresa="";
		sToolTipTipoManoProduEmpresa=TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoManoProduEmpresa+="(Produccion.TipoManoProduEmpresa)";
		}
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoManoProduEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoManoProduEmpresa.setToolTipText(sToolTipTipoManoProduEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoManoProduEmpresa);
		this.jTableDatosTipoManoProduEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoManoProduEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoManoProduEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoManoProduEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoManoProduEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoManoProduEmpresa = new JButtonMe();
		this.jButtonCopiarTipoManoProduEmpresa = new JButtonMe();
		this.jButtonVerFormTipoManoProduEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoManoProduEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa = new JButtonMe();
		this.jButtonCerrarTipoManoProduEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoManoProduEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoManoProduEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Mano Obra Produccion Empresa";
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mano Obra Produccion Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoManoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoManoProduEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoManoProduEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoManoProduEmpresa=new ReporteDinamicoJInternalFrame(TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoManoProduEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoManoProduEmpresa=new ImportacionJInternalFrame(TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoManoProduEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoManoProduEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoManoProduEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoManoProduEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoManoProduEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoManoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoManoProduEmpresa,false,this);
			
			//this.cargarOrderByTipoManoProduEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoManoProduEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoManoProduEmpresa,true,this);
			
			//this.cargarOrderByTipoManoProduEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoManoProduEmpresa.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoManoProduEmpresa.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoManoProduEmpresa.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoManoProduEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoManoProduEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoManoProduEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoManoProduEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoManoProduEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoManoProduEmpresa.setText("Copiar");
		this.jButtonVerFormTipoManoProduEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.setText("Guardar");
		this.jButtonCerrarTipoManoProduEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoManoProduEmpresa,"nuevo_button","Nuevo",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoManoProduEmpresa,"duplicar_button","Duplicar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoManoProduEmpresa,"copiar_button","Copiar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoManoProduEmpresa,"ver_form","Ver",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoManoProduEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoManoProduEmpresa,"guardarcambiostabla_button","Guardar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoManoProduEmpresa,"cerrar_button","Salir",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoManoProduEmpresa.setToolTipText("Nuevo"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoManoProduEmpresa.setToolTipText("Duplicar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoManoProduEmpresa.setToolTipText("Copiar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoManoProduEmpresa.setToolTipText("Ver"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.setToolTipText("Nuevo Rel"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.setToolTipText("Guardar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoManoProduEmpresa.setToolTipText("Salir"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoManoProduEmpresa";
		inputMap = this.jButtonNuevoTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoManoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoManoProduEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoManoProduEmpresa";
		inputMap = this.jButtonDuplicarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoManoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoManoProduEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoManoProduEmpresa";
		inputMap = this.jButtonCopiarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoManoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoManoProduEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoManoProduEmpresa";
		inputMap = this.jButtonVerFormTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoManoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoManoProduEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoManoProduEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoManoProduEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoManoProduEmpresa";
		inputMap = this.jButtonModificarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoManoProduEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoManoProduEmpresa";
		inputMap = this.jButtonCerrarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoManoProduEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoManoProduEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoManoProduEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoManoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoManoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoManoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoManoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoManoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoManoProduEmpresa.setName("jPanelParametrosReportesTipoManoProduEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoManoProduEmpresa.setName("jPanelParametrosReportesAccionesTipoManoProduEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoManoProduEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoManoProduEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoManoProduEmpresa.setToolTipText("Recargar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoManoProduEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoManoProduEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoManoProduEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoManoProduEmpresa.setToolTipText("Procesar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoManoProduEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoManoProduEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoManoProduEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoManoProduEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoManoProduEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoManoProduEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoManoProduEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoManoProduEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoManoProduEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoManoProduEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoManoProduEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoManoProduEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoManoProduEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoManoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoManoProduEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoManoProduEmpresa.setText("<<");
        this.jButtonAnterioresTipoManoProduEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoManoProduEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoManoProduEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoManoProduEmpresa.setText(">>");
        this.jButtonSiguientesTipoManoProduEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoManoProduEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa,"nuevoguardarcambios_button","Nue",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoManoProduEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoManoProduEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoManoProduEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoManoProduEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoManoProduEmpresa";
		inputMap = this.jButtonSiguientesTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoManoProduEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoManoProduEmpresa";
		inputMap = this.jButtonAnterioresTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoManoProduEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoManoProduEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoManoProduEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoManoProduEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoManoProduEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoManoProduEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoManoProduEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoManoProduEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoManoProduEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoManoProduEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoManoProduEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoManoProduEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoManoProduEmpresa.setLayout(gridaBagLayoutPaginacionTipoManoProduEmpresa);						
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonAnterioresTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
					
						
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonNuevoGuardarCambiosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
						
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonSiguientesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonNuevoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
						
			
			
			if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoManoProduEmpresa.gridy = 1;
				this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonGuardarCambiosTablaTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonDuplicarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonCopiarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonVerFormTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 1;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoManoProduEmpresa.add(this.jButtonCerrarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoManoProduEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoManoProduEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoManoProduEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoManoProduEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoManoProduEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoManoProduEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoManoProduEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoManoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoManoProduEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoManoProduEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoManoProduEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoManoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoManoProduEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoManoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoManoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoManoProduEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoManoProduEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoManoProduEmpresa.setLayout(gridaBagParametrosReportesTipoManoProduEmpresa);
			this.jPanelParametrosReportesAccionesTipoManoProduEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoManoProduEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoManoProduEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoManoProduEmpresa);
			this.jPanelParametrosAuxiliar2TipoManoProduEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoManoProduEmpresa);
			this.jPanelParametrosAuxiliar3TipoManoProduEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoManoProduEmpresa);
			this.jPanelParametrosAuxiliar4TipoManoProduEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoManoProduEmpresa);
			//this.jPanelParametrosAuxiliar5TipoManoProduEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoManoProduEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jButtonRecargarInformacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoManoProduEmpresa.add(this.jComboBoxTiposPaginacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoManoProduEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoManoProduEmpresa.add(this.jComboBoxTiposArchivosReportesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jPanelParametrosAuxiliar1TipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoManoProduEmpresa.add(this.jComboBoxTiposReportesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jPanelParametrosAuxiliar4TipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jComboBoxTiposReportesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jCheckBoxGenerarReporteTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jPanelParametrosAuxiliar2TipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jLabelAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jButtonAbrirOrderByTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jComboBoxTiposSeleccionarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoManoProduEmpresa.add(this.jCheckBoxSeleccionarTodosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);															
				
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoManoProduEmpresa.add(this.jCheckBoxSeleccionadosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jPanelParametrosAuxiliar3TipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jComboBoxTiposRelacionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
				
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jComboBoxTiposAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
	
				
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoManoProduEmpresa.add(this.jTextFieldValorCampoGeneralTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoManoProduEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoManoProduEmpresa.setLayout(gridaBagLayoutDatosTipoManoProduEmpresa);
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoManoProduEmpresa.add(this.jTableDatosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoManoProduEmpresa.setViewportView(this.jTableDatosTipoManoProduEmpresa);
		this.jTableDatosTipoManoProduEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoManoProduEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoManoProduEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoManoProduEmpresa.setLayout(gridaBagLayoutAccionesTipoManoProduEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoManoProduEmpresa.add(this.jButtonNuevoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoManoProduEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoManoProduEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoManoProduEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoManoProduEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoManoProduEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		*/		
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =0;
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoManoProduEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
				
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoManoProduEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoManoProduEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoManoProduEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoManoProduEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
			
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
			
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoManoProduEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoManoProduEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoManoProduEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoManoProduEmpresa.setName("jPanelReporteDinamicoTipoManoProduEmpresa"); 
		
		this.jPanelReporteDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoManoProduEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoManoProduEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoManoProduEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoManoProduEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mano Obra Produccion Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoManoProduEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoManoProduEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jLabelColumnasSelectReporteTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoManoProduEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoManoProduEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoManoProduEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoManoProduEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoManoProduEmpresa);
			
			this.jScrollColumnasSelectReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jListColumnasSelectReporteTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jScrollColumnasSelectReporteTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoManoProduEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoManoProduEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoManoProduEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoManoProduEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoManoProduEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoManoProduEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoManoProduEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoManoProduEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoManoProduEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoManoProduEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoManoProduEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoManoProduEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoManoProduEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa.setToolTipText("Generar EXCEL"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa.setToolTipText("Generar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jButtonGenerarReporteDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa.setToolTipText("Cancelar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoManoProduEmpresa.add(this.jButtonCerrarReporteDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoManoProduEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoManoProduEmpresa= new JScrollPane(jPanelReporteDinamicoTipoManoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mano Obra Produccion Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoManoProduEmpresa);
		this.jInternalFrameReporteDinamicoTipoManoProduEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoManoProduEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoManoProduEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoManoProduEmpresa.setName("jPanelImportacionTipoManoProduEmpresa"); 
		
		this.jPanelImportacionTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoManoProduEmpresa.setLayout(gridaBagLayoutImportacionTipoManoProduEmpresa);
		
		
		this.jInternalFrameImportacionTipoManoProduEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoManoProduEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoManoProduEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoManoProduEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoManoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoManoProduEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoManoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoManoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoManoProduEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoManoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoManoProduEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mano Obra Produccion Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoManoProduEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoManoProduEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoManoProduEmpresa.add(this.jLabelArchivoImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoManoProduEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoManoProduEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoManoProduEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoManoProduEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoManoProduEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoManoProduEmpresa.setToolTipText("Generar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoManoProduEmpresa.add(this.jButtonAbrirImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoManoProduEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoManoProduEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoManoProduEmpresa.add(this.jLabelPathArchivoImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoManoProduEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoManoProduEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoManoProduEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoManoProduEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoManoProduEmpresa.add(this.jTextFieldPathArchivoImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoManoProduEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoManoProduEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoManoProduEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoManoProduEmpresa.setToolTipText("Generar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoManoProduEmpresa.add(this.jButtonGenerarImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoManoProduEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoManoProduEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoManoProduEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoManoProduEmpresa.setToolTipText("Cancelar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoManoProduEmpresa.add(this.jButtonCerrarImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoManoProduEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoManoProduEmpresa= new JScrollPane(jPanelImportacionTipoManoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoManoProduEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoManoProduEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoManoProduEmpresa);
		this.jInternalFrameImportacionTipoManoProduEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoManoProduEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoManoProduEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoManoProduEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoManoProduEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoManoProduEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoManoProduEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoManoProduEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoManoProduEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoManoProduEmpresa.setName("jPanelOrderByTipoManoProduEmpresa"); 
			
			this.jPanelOrderByTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoManoProduEmpresa.setLayout(gridaBagLayoutOrderByTipoManoProduEmpresa);
			
			
			this.jTableDatosTipoManoProduEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoManoProduEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoManoProduEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoManoProduEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoManoProduEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoManoProduEmpresaOrderBy.setViewportView(this.jTableDatosTipoManoProduEmpresaOrderBy);
			this.jTableDatosTipoManoProduEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoManoProduEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoManoProduEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoManoProduEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoManoProduEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoManoProduEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoManoProduEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoManoProduEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoManoProduEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoManoProduEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoManoProduEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoManoProduEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoManoProduEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoManoProduEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mano Obra Produccion Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoManoProduEmpresa.ipady =150;
				
			this.jPanelOrderByTipoManoProduEmpresa.add(jScrollPanelDatosTipoManoProduEmpresaOrderBy, this.gridBagConstraintsTipoManoProduEmpresa);//this.jTableDatosTipoManoProduEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoManoProduEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoManoProduEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoManoProduEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoManoProduEmpresa.setToolTipText("Cancelar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoManoProduEmpresa.add(this.jButtonCerrarOrderByTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoManoProduEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoManoProduEmpresa= new JScrollPane(jPanelOrderByTipoManoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoManoProduEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoManoProduEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoManoProduEmpresa);
			
			this.jInternalFrameOrderByTipoManoProduEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoManoProduEmpresa = new JButtonMe();
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
			&& this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoManoProduEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoManoProduEmpresa.getRowHeight();//TipoManoProduEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.isSelected()) {
					iHeightTable=TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoManoProduEmpresa.isSelected()) {
					iHeightTable=TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoManoProduEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoManoProduEmpresa!=null && this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoManoProduEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoManoProduEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoManoProduEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoManoProduEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomanoproduempresaLogic.getTipoManoProduEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomanoproduempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoManoProduEmpresa> TraerTipoManoProduEmpresaBeans(List<TipoManoProduEmpresa> tipomanoproduempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoManoProduEmpresa tipomanoproduempresa:tipomanoproduempresas) {
					
				if(!(TipoManoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoManoProduEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomanoproduempresa.setsDetalleGeneralEntityReporte(TipoManoProduEmpresaConstantesFunciones.getTipoManoProduEmpresaDescripcion(tipomanoproduempresa));
										
						
					
						
					
				} else  {
							
					//tipomanoproduempresa.setsDetalleGeneralEntityReporte(tipomanoproduempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomanoproduempresabeans.add(tipomanoproduempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomanoproduempresas;
    }
	//PARA REPORTES FIN
}
