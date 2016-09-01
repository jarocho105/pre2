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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.produccion.util.TipoProcesoProduConstantesFunciones;

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
public class TipoProcesoProduJInternalFrame extends TipoProcesoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProcesoProdu;
	
	protected JMenuBar jmenuBarTipoProcesoProdu;
	
	protected JMenu jmenuTipoProcesoProdu;
	protected JMenu jmenuDatosTipoProcesoProdu;
	protected JMenu jmenuArchivoTipoProcesoProdu;
	protected JMenu jmenuAccionesTipoProcesoProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProcesoProdu;	
	protected GridBagConstraints gridBagConstraintsTipoProcesoProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProcesoProduDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProcesoProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProcesoProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProcesoProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProcesoProduSessionBean tipoprocesoproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProcesoProdu> tipoprocesoprodus;		
	public List<TipoProcesoProdu> tipoprocesoprodusEliminados;	
	public List<TipoProcesoProdu> tipoprocesoprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProcesoProdu;		
	protected JButton jButtonAbrirOrderByTipoProcesoProdu;
	
	
	//protected JPanel jPanelOrderByTipoProcesoProdu;
	//public JScrollPane jScrollPanelOrderByTipoProcesoProdu;	
	//protected JButton jButtonCerrarOrderByTipoProcesoProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProcesoProduLogic tipoprocesoproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProcesoProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoProcesoProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoProcesoProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProcesoProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProcesoProdu;
	//public JScrollPane jScrollPanelImportacionTipoProcesoProdu;
	
	
	
	protected JPanel jPanelAccionesTipoProcesoProdu;
	
    protected JPanel jPanelPaginacionTipoProcesoProdu;
    protected JPanel jPanelParametrosReportesTipoProcesoProdu;
	protected JPanel jPanelParametrosReportesAccionesTipoProcesoProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProcesoProdu;
	protected JPanel jPanelParametrosAuxiliar2TipoProcesoProdu;
	protected JPanel jPanelParametrosAuxiliar3TipoProcesoProdu;
	protected JPanel jPanelParametrosAuxiliar4TipoProcesoProdu;
	//protected JPanel jPanelParametrosAuxiliar5TipoProcesoProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProcesoProdu;
	//protected JPanel jPanelImportacionTipoProcesoProdu;
	
	
	public JTable jTableDatosTipoProcesoProdu;
	
	
	
	//public JTable jTableDatosTipoProcesoProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProcesoProdu;
	protected JButton jButtonDuplicarTipoProcesoProdu;
	protected JButton jButtonCopiarTipoProcesoProdu;
	protected JButton jButtonVerFormTipoProcesoProdu;
	protected JButton jButtonNuevoRelacionesTipoProcesoProdu;
	protected JButton jButtonModificarTipoProcesoProdu;
	
    protected JButton jButtonGuardarCambiosTablaTipoProcesoProdu;
	protected JButton jButtonCerrarTipoProcesoProdu;
	
	
	protected JButton jButtonRecargarInformacionTipoProcesoProdu;
	protected JButton jButtonProcesarInformacionTipoProcesoProdu;
	
	
	protected JButton jButtonAnterioresTipoProcesoProdu;
	protected JButton jButtonSiguientesTipoProcesoProdu;
	protected JButton jButtonNuevoGuardarCambiosTipoProcesoProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProcesoProdu;
	//protected JButton jButtonCerrarReporteDinamicoTipoProcesoProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProcesoProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProcesoProdu;
	//protected JButton jButtonGenerarImportacionTipoProcesoProdu;
	//protected JButton jButtonCerrarImportacionTipoProcesoProdu;
	//protected JFileChooser jFileChooserImportacionTipoProcesoProdu;
	//protected File fileImportacionTipoProcesoProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProcesoProdu;
	protected JButton jButtonDuplicarToolBarTipoProcesoProdu;
	protected JButton jButtonNuevoRelacionesToolBarTipoProcesoProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProcesoProdu;
	protected JButton jButtonCopiarToolBarTipoProcesoProdu;
	protected JButton jButtonVerFormToolBarTipoProcesoProdu;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProcesoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProcesoProdu;
	protected JButton jButtonCerrarToolBarTipoProcesoProdu;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProcesoProdu;
	protected JButton jButtonProcesarInformacionToolBarTipoProcesoProdu;
	protected JButton jButtonAnterioresToolBarTipoProcesoProdu;
	protected JButton jButtonSiguientesToolBarTipoProcesoProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProcesoProdu;
	protected JButton jButtonAbrirOrderByToolBarTipoProcesoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProcesoProdu;
	protected JMenuItem jMenuItemDuplicarTipoProcesoProdu;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProcesoProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProcesoProdu;
	protected JMenuItem jMenuItemCopiarTipoProcesoProdu;
	protected JMenuItem jMenuItemVerFormTipoProcesoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProcesoProdu;
	protected JMenuItem jMenuItemCerrarTipoProcesoProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoProcesoProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProcesoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProcesoProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProcesoProdu;
	protected JMenuItem jMenuItemProcesarInformacionTipoProcesoProdu;
	protected JMenuItem jMenuItemAnterioresTipoProcesoProdu;
	protected JMenuItem jMenuItemSiguientesTipoProcesoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProcesoProdu;
	protected JMenuItem jMenuItemAbrirOrderByTipoProcesoProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoProcesoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProcesoProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProcesoProdu;
	protected JCheckBox jCheckBoxSeleccionadosTipoProcesoProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProcesoProdu;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProcesoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProcesoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProcesoProdu;
	protected JTextField jTextFieldValorCampoGeneralTipoProcesoProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProcesoProdu;
	//public JList<Reporte> jListColumnasSelectReporteTipoProcesoProdu;
	//public JScrollPane jScrollColumnasSelectReporteTipoProcesoProdu;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProcesoProdu;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProcesoProdu;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProcesoProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProcesoProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProcesoProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProcesoProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProcesoProdu;
	
		
	//public JLabel jLabelArchivoImportacionTipoProcesoProdu;	
	//public JLabel jLabelPathArchivoImportacionTipoProcesoProdu;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProcesoProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProcesoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProcesoProdu;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProcesoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProcesoProdu;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProcesoProdu;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProcesoProdu;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProcesoProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProcesoProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProcesoProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoProcesoProdu;
	
	
	
	
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
	public TipoProcesoProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProcesoProdu)	{
		this.jButtonRecargarInformacionTipoProcesoProdu = jButtonRecargarInformacionTipoProcesoProdu;
	}
	
	public JButton getjButtonProcesarInformacionTipoProcesoProdu() {
		return this.jButtonProcesarInformacionTipoProcesoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProcesoProdu)	{
		this.jButtonProcesarInformacionTipoProcesoProdu = jButtonProcesarInformacionTipoProcesoProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProcesoProdu() {
		return this.jButtonRecargarInformacionTipoProcesoProdu;
	}
	
	
	public List<TipoProcesoProdu> gettipoprocesoprodus() {
		return this.tipoprocesoprodus;
	}

	public void settipoprocesoprodus(List<TipoProcesoProdu> tipoprocesoprodus) {
		this.tipoprocesoprodus = tipoprocesoprodus;
	}
	
	public List<TipoProcesoProdu> gettipoprocesoprodusAux() {
		return this.tipoprocesoprodusAux;
	}

	public void settipoprocesoprodusAux(List<TipoProcesoProdu> tipoprocesoprodusAux) {
		this.tipoprocesoprodusAux = tipoprocesoprodusAux;
	}
	
	public List<TipoProcesoProdu> gettipoprocesoprodusEliminados() {
		return this.tipoprocesoprodusEliminados;
	}

	public void setTipoProcesoProdusEliminados(List<TipoProcesoProdu> tipoprocesoprodusEliminados) {
		this.tipoprocesoprodusEliminados = tipoprocesoprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProcesoProdu() {
		return jComboBoxTiposSeleccionarTipoProcesoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProcesoProdu(
			JComboBox jComboBoxTiposSeleccionarTipoProcesoProdu) {
		this.jComboBoxTiposSeleccionarTipoProcesoProdu = jComboBoxTiposSeleccionarTipoProcesoProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProcesoProdu() {
		return jTextFieldValorCampoGeneralTipoProcesoProdu;
	}

	public void setjTextFieldValorCampoGeneralTipoProcesoProdu(
			JTextField jTextFieldValorCampoGeneralTipoProcesoProdu) {
		this.jTextFieldValorCampoGeneralTipoProcesoProdu = jTextFieldValorCampoGeneralTipoProcesoProdu;
	}

	public void setBorderResaltarValorCampoGeneralTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProcesoProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProcesoProdu() {
		return this.jCheckBoxSeleccionarTodosTipoProcesoProdu;
	}

	public void setjCheckBoxSeleccionarTodosTipoProcesoProdu(
			JCheckBox jCheckBoxSeleccionarTodosTipoProcesoProdu) {
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu = jCheckBoxSeleccionarTodosTipoProcesoProdu;
	}

	public void setBorderResaltarSeleccionarTodosTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProcesoProdu() {
		return this.jCheckBoxSeleccionadosTipoProcesoProdu;
	}

	public void setjCheckBoxSeleccionadosTipoProcesoProdu(
			JCheckBox jCheckBoxSeleccionadosTipoProcesoProdu) {
		this.jCheckBoxSeleccionadosTipoProcesoProdu = jCheckBoxSeleccionadosTipoProcesoProdu;
	}
	
	public void setBorderResaltarSeleccionadosTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProcesoProdu() {
		return this.jComboBoxTiposArchivosReportesTipoProcesoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProcesoProdu(
			JComboBox jComboBoxTiposArchivosReportesTipoProcesoProdu) {
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu = jComboBoxTiposArchivosReportesTipoProcesoProdu;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProcesoProdu() {
		return this.jComboBoxTiposReportesTipoProcesoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProcesoProdu(
			JComboBox jComboBoxTiposReportesTipoProcesoProdu) {
		this.jComboBoxTiposReportesTipoProcesoProdu = jComboBoxTiposReportesTipoProcesoProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProcesoProdu() {
	//	return jComboBoxTiposReportesDinamicoTipoProcesoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProcesoProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProcesoProdu) {
	//	this.jComboBoxTiposReportesDinamicoTipoProcesoProdu = jComboBoxTiposReportesDinamicoTipoProcesoProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu = jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu;
	//}
	
	public void setBorderResaltarTiposReportesTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProcesoProdu() {
		return this.jComboBoxTiposGraficosReportesTipoProcesoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProcesoProdu(
			JComboBox jComboBoxTiposGraficosReportesTipoProcesoProdu) {
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu = jComboBoxTiposGraficosReportesTipoProcesoProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProcesoProdu() {
		return this.jComboBoxTiposPaginacionTipoProcesoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProcesoProdu(
			JComboBox jComboBoxTiposPaginacionTipoProcesoProdu) {
		this.jComboBoxTiposPaginacionTipoProcesoProdu = jComboBoxTiposPaginacionTipoProcesoProdu;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProcesoProdu() {
		return this.jComboBoxTiposRelacionesTipoProcesoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProcesoProdu() {
		return this.jComboBoxTiposAccionesTipoProcesoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProcesoProdu(
			JComboBox jComboBoxTiposRelacionesTipoProcesoProdu) {
		this.jComboBoxTiposRelacionesTipoProcesoProdu = jComboBoxTiposRelacionesTipoProcesoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProcesoProdu(
			JComboBox jComboBoxTiposAccionesTipoProcesoProdu) {
		this.jComboBoxTiposAccionesTipoProcesoProdu = jComboBoxTiposAccionesTipoProcesoProdu;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProcesoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProcesoProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProcesoProdu() {
	//	return jCheckBoxConGraficoDinamicoTipoProcesoProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProcesoProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProcesoProdu) {
	//	this.jCheckBoxConGraficoDinamicoTipoProcesoProdu = jCheckBoxConGraficoDinamicoTipoProcesoProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProcesoProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProcesoProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProcesoProdu .setBorder(borderResaltar);		
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
		this.tipoprocesoproduSessionBean=new TipoProcesoProduSessionBean();
		
		this.tipoprocesoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprocesoproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProcesoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProcesoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proceso Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProcesoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProcesoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProcesoProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"nuevo","nuevo","Nuevo"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"duplicar","duplicar","Duplicar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"copiar","copiar","Copiar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"ver_form","ver_form","Ver"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"recargar","recargar","Recargar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProcesoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProcesoProdu,this.jTtoolBarTipoProcesoProdu,
							"cerrar","cerrar","Salir"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProcesoProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProcesoProdu;
			
				this.jButtonProcesarInformacionToolBarTipoProcesoProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProcesoProdu;
				
		//protected JButton jButtonModificarToolBarTipoProcesoProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProcesoProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProcesoProdu=new JMenuMe("General");
		this.jmenuArchivoTipoProcesoProdu=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProcesoProdu=new JMenuMe("Acciones");
		this.jmenuDatosTipoProcesoProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProcesoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProcesoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProcesoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProcesoProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProcesoProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProcesoProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProcesoProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProcesoProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProcesoProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProcesoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProcesoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProcesoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProcesoProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProcesoProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProcesoProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProcesoProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProcesoProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProcesoProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProcesoProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProcesoProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProcesoProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProcesoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProcesoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProcesoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProcesoProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProcesoProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProcesoProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProcesoProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProcesoProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProcesoProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProcesoProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProcesoProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProcesoProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProcesoProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProcesoProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProcesoProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProcesoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProcesoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProcesoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProcesoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProcesoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProcesoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProcesoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProcesoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProcesoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProcesoProdu.add(this.jMenuItemCerrarTipoProcesoProdu);
			
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemNuevoTipoProcesoProdu);
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemNuevoGuardarCambiosTipoProcesoProdu);
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemNuevoRelacionesTipoProcesoProdu);
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemGuardarCambiosTablaTipoProcesoProdu);		
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemDuplicarTipoProcesoProdu);		
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemCopiarTipoProcesoProdu);		
			this.jmenuAccionesTipoProcesoProdu.add(this.jMenuItemVerFormTipoProcesoProdu);		
			
			this.jmenuDatosTipoProcesoProdu.add(this.jMenuItemRecargarInformacionTipoProcesoProdu);				
			this.jmenuDatosTipoProcesoProdu.add(this.jMenuItemAnterioresTipoProcesoProdu);				
			this.jmenuDatosTipoProcesoProdu.add(this.jMenuItemSiguientesTipoProcesoProdu);				
			this.jmenuDatosTipoProcesoProdu.add(this.jMenuItemAbrirOrderByTipoProcesoProdu);				
			this.jmenuDatosTipoProcesoProdu.add(this.jMenuItemMostrarOcultarTipoProcesoProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProcesoProdu.add(this.jMenuItemGuardarCambiosTipoProcesoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProcesoProdu.add(this.jmenuArchivoTipoProcesoProdu);		
			this.jmenuBarTipoProcesoProdu.add(this.jmenuAccionesTipoProcesoProdu);		
			this.jmenuBarTipoProcesoProdu.add(this.jmenuDatosTipoProcesoProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProcesoProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProcesoProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoProcesoProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoProcesoProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProcesoProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProcesoProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoProcesoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoProcesoProdu = new TipoProcesoProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Proceso Produccion DATOS");
			this.jInternalFrameDetalleFormTipoProcesoProdu = new TipoProcesoProduDetalleFormJInternalFrame(jDesktopPane,this.tipoprocesoproduSessionBean.getConGuardarRelaciones(),this.tipoprocesoproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProcesoProdu = null;//new TipoProcesoProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProcesoProdu= new GridBagLayout();
		
		
		this.jTableDatosTipoProcesoProdu = new JTableMe();      
		
		String sToolTipTipoProcesoProdu="";
		sToolTipTipoProcesoProdu=TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProcesoProdu+="(Produccion.TipoProcesoProdu)";
		}
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProcesoProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProcesoProdu.setToolTipText(sToolTipTipoProcesoProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProcesoProdu);
		this.jTableDatosTipoProcesoProdu.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProcesoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProcesoProdu.setRowSelectionAllowed(true);
		this.jTableDatosTipoProcesoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProcesoProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProcesoProdu = new JButtonMe();
		this.jButtonDuplicarTipoProcesoProdu = new JButtonMe();
		this.jButtonCopiarTipoProcesoProdu = new JButtonMe();
		this.jButtonVerFormTipoProcesoProdu = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProcesoProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu = new JButtonMe();
		this.jButtonCerrarTipoProcesoProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoProcesoProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProcesoProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proceso Produccion";
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Produccions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProcesoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProcesoProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoProcesoProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProcesoProdu=new ReporteDinamicoJInternalFrame(TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProcesoProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProcesoProdu=new ImportacionJInternalFrame(TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProcesoProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProcesoProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProcesoProdu.setText("Orden");
		this.jButtonAbrirOrderByTipoProcesoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProcesoProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProcesoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoProdu,false,this);
			
			//this.cargarOrderByTipoProcesoProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProcesoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoProdu,true,this);
			
			//this.cargarOrderByTipoProcesoProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProcesoProdu.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProcesoProdu.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProcesoProdu.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProcesoProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProcesoProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProcesoProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProcesoProdu.setText("Nuevo");
		this.jButtonDuplicarTipoProcesoProdu.setText("Duplicar");
		this.jButtonCopiarTipoProcesoProdu.setText("Copiar");
		this.jButtonVerFormTipoProcesoProdu.setText("Ver");
		this.jButtonNuevoRelacionesTipoProcesoProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.setText("Guardar");
		this.jButtonCerrarTipoProcesoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProcesoProdu,"nuevo_button","Nuevo",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProcesoProdu,"duplicar_button","Duplicar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProcesoProdu,"copiar_button","Copiar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProcesoProdu,"ver_form","Ver",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProcesoProdu,"nuevorelaciones_button","Nuevo Rel",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProcesoProdu,"guardarcambiostabla_button","Guardar",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProcesoProdu,"cerrar_button","Salir",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProcesoProdu.setToolTipText("Nuevo"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProcesoProdu.setToolTipText("Duplicar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProcesoProdu.setToolTipText("Copiar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProcesoProdu.setToolTipText("Ver"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProcesoProdu.setToolTipText("Nuevo Rel"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.setToolTipText("Guardar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProcesoProdu.setToolTipText("Salir"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProcesoProdu";
		inputMap = this.jButtonNuevoTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProcesoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProcesoProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProcesoProdu";
		inputMap = this.jButtonDuplicarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProcesoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProcesoProdu"));
		
		//COPIAR
		sMapKey = "CopiarTipoProcesoProdu";
		inputMap = this.jButtonCopiarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProcesoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProcesoProdu"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProcesoProdu";
		inputMap = this.jButtonVerFormTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProcesoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProcesoProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProcesoProdu";
		inputMap = this.jButtonNuevoRelacionesTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProcesoProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProcesoProdu";
		inputMap = this.jButtonModificarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProcesoProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProcesoProdu";
		inputMap = this.jButtonCerrarTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProcesoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProcesoProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProcesoProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProcesoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProcesoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProcesoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProcesoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProcesoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProcesoProdu.setName("jPanelParametrosReportesTipoProcesoProdu"); 
		
		this.jPanelParametrosReportesAccionesTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProcesoProdu.setName("jPanelParametrosReportesAccionesTipoProcesoProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProcesoProdu = new JButtonMe();
		this.jButtonRecargarInformacionTipoProcesoProdu.setText("Recargar");
		this.jButtonRecargarInformacionTipoProcesoProdu.setToolTipText("Recargar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProcesoProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProcesoProdu = new JButtonMe();
		this.jButtonProcesarInformacionTipoProcesoProdu.setText("Procesar");
		this.jButtonProcesarInformacionTipoProcesoProdu.setToolTipText("Procesar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProcesoProdu.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProcesoProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProcesoProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProcesoProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProcesoProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProcesoProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProcesoProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProcesoProdu.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProcesoProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProcesoProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoProcesoProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProcesoProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProcesoProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProcesoProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProcesoProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProcesoProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProcesoProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProcesoProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProcesoProdu = new JLabelMe();
		
		this.jLabelAccionesTipoProcesoProdu.setText("Acciones");		
		this.jLabelAccionesTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProcesoProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProcesoProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProcesoProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProcesoProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProcesoProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProcesoProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProcesoProdu = new JButtonMe();
		//this.jButtonAnterioresTipoProcesoProdu.setText("<<");
        this.jButtonAnterioresTipoProcesoProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProcesoProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProcesoProdu = new JButtonMe();
		//this.jButtonSiguientesTipoProcesoProdu.setText(">>");
        this.jButtonSiguientesTipoProcesoProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProcesoProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProcesoProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProcesoProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProcesoProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProcesoProdu,"nuevoguardarcambios_button","Nue",this.tipoprocesoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProcesoProdu";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProcesoProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProcesoProdu";
		inputMap = this.jButtonRecargarInformacionTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProcesoProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProcesoProdu";
		inputMap = this.jButtonSiguientesTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProcesoProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProcesoProdu";
		inputMap = this.jButtonAnterioresTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProcesoProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProcesoProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProcesoProdu.setMinimumSize(new Dimension(this.getWidth(),TipoProcesoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProcesoProdu.setMaximumSize(new Dimension(this.getWidth(),TipoProcesoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProcesoProdu.setPreferredSize(new Dimension(this.getWidth(),TipoProcesoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProcesoProdu = new GridBagLayout();

			this.jPanelPaginacionTipoProcesoProdu.setLayout(gridaBagLayoutPaginacionTipoProcesoProdu);						
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonAnterioresTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
					
						
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
			
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonNuevoGuardarCambiosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
						
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonSiguientesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonNuevoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
				this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonNuevoRelacionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			}
			
			
			if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
				this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonGuardarCambiosTablaTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			}
			
			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonDuplicarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonCopiarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonVerFormTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProcesoProdu.add(this.jButtonCerrarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
		
		
		this.jButtonRecargarInformacionTipoProcesoProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProcesoProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProcesoProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProcesoProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProcesoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProcesoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProcesoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProcesoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProcesoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProcesoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProcesoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProcesoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProcesoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProcesoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProcesoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProcesoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProcesoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProcesoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProcesoProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProcesoProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProcesoProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProcesoProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProcesoProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProcesoProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProcesoProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProcesoProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProcesoProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProcesoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProcesoProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProcesoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProcesoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProcesoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProcesoProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProcesoProdu.setLayout(gridaBagParametrosReportesTipoProcesoProdu);
			this.jPanelParametrosReportesAccionesTipoProcesoProdu.setLayout(gridaBagParametrosReportesAccionesTipoProcesoProdu);
			
			
			this.jPanelParametrosAuxiliar1TipoProcesoProdu.setLayout(gridaBagParametrosAuxiliar1TipoProcesoProdu);
			this.jPanelParametrosAuxiliar2TipoProcesoProdu.setLayout(gridaBagParametrosAuxiliar2TipoProcesoProdu);
			this.jPanelParametrosAuxiliar3TipoProcesoProdu.setLayout(gridaBagParametrosAuxiliar3TipoProcesoProdu);
			this.jPanelParametrosAuxiliar4TipoProcesoProdu.setLayout(gridaBagParametrosAuxiliar4TipoProcesoProdu);
			//this.jPanelParametrosAuxiliar5TipoProcesoProdu.setLayout(gridaBagParametrosAuxiliar2TipoProcesoProdu);			
			
			
			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jButtonRecargarInformacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoProdu.add(this.jComboBoxTiposPaginacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoProdu.add(this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoProdu.add(this.jComboBoxTiposArchivosReportesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jPanelParametrosAuxiliar1TipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProcesoProdu.add(this.jComboBoxTiposReportesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jPanelParametrosAuxiliar4TipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jComboBoxTiposReportesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jCheckBoxGenerarReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jPanelParametrosAuxiliar2TipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jLabelAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProcesoProdu.add(this.jButtonAbrirOrderByTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jComboBoxTiposSeleccionarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
			
			
			/*
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jCheckBoxSeleccionarTodosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProcesoProdu.add(this.jCheckBoxSeleccionarTodosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);															
				
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProcesoProdu.add(this.jCheckBoxSeleccionadosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jPanelParametrosAuxiliar3TipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jComboBoxTiposRelacionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
				
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoProdu.add(this.jComboBoxTiposAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProcesoProdu = new GridBagLayout();

			this.jScrollPanelDatosTipoProcesoProdu.setLayout(gridaBagLayoutDatosTipoProcesoProdu);
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
			this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
			
			this.jScrollPanelDatosTipoProcesoProdu.add(this.jTableDatosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProcesoProdu.setViewportView(this.jTableDatosTipoProcesoProdu);
		this.jTableDatosTipoProcesoProdu.setFillsViewportHeight(true);
		this.jTableDatosTipoProcesoProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProcesoProdu= new GridBagLayout();
		this.jPanelAccionesTipoProcesoProdu.setLayout(gridaBagLayoutAccionesTipoProcesoProdu);
		
		
		/*	
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
			
		this.jPanelAccionesTipoProcesoProdu.add(this.jButtonNuevoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProcesoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProcesoProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProcesoProdu.gridx = 0;		
			//this.gridBagConstraintsTipoProcesoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProcesoProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;		
		//this.gridBagConstraintsTipoProcesoProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProcesoProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProcesoProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);								
		
		
		/*
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		*/		
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoProdu.gridx =0;
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProcesoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
				
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProcesoProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProcesoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProcesoProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProcesoProdu.setLayout(gridaBagLayoutBusquedasParametrosTipoProcesoProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProcesoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProcesoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
			
			
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
			
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProcesoProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProcesoProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProcesoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProcesoProdu.setName("jPanelReporteDinamicoTipoProcesoProdu"); 
		
		this.jPanelReporteDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProcesoProdu.setLayout(gridaBagLayoutReporteDinamicoTipoProcesoProdu);
		
		
		this.jInternalFrameReporteDinamicoTipoProcesoProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProcesoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProcesoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProcesoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProcesoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProcesoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProcesoProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProcesoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProcesoProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProcesoProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProcesoProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Produccions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProcesoProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProcesoProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jLabelColumnasSelectReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProcesoProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProcesoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProcesoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProcesoProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProcesoProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProcesoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProcesoProdu=new JScrollPane(this.jListColumnasSelectReporteTipoProcesoProdu);
			
			this.jScrollColumnasSelectReporteTipoProcesoProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProcesoProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProcesoProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jListColumnasSelectReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jScrollColumnasSelectReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProcesoProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProcesoProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jLabelRelacionesSelectReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProcesoProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProcesoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProcesoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProcesoProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProcesoProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProcesoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProcesoProdu=new JScrollPane(this.jListRelacionesSelectReporteTipoProcesoProdu);
			
			this.jScrollRelacionesSelectReporteTipoProcesoProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProcesoProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProcesoProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jListRelacionesSelectReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jScrollRelacionesSelectReporteTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProcesoProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProcesoProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProcesoProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProcesoProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProcesoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProcesoProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jLabelGenerarExcelReporteDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu.setToolTipText("Generar EXCEL"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jButtonGenerarExcelReporteDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jComboBoxTiposReportesDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProcesoProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jLabelTiposArchivoReporteDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProcesoProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProcesoProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProcesoProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProcesoProdu.setToolTipText("Generar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jButtonGenerarReporteDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProcesoProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProcesoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProcesoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProcesoProdu.setToolTipText("Cancelar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoProdu.add(this.jButtonCerrarReporteDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProcesoProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProcesoProdu= new JScrollPane(jPanelReporteDinamicoTipoProcesoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProcesoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProcesoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProcesoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Produccions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProcesoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProcesoProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProcesoProdu);
		this.jInternalFrameReporteDinamicoTipoProcesoProdu.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProcesoProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProcesoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProcesoProdu.setName("jPanelImportacionTipoProcesoProdu"); 
		
		this.jPanelImportacionTipoProcesoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProcesoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProcesoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProcesoProdu.setLayout(gridaBagLayoutImportacionTipoProcesoProdu);
		
		
		this.jInternalFrameImportacionTipoProcesoProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProcesoProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProcesoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProcesoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProcesoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProcesoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProcesoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProcesoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProcesoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProcesoProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoProcesoProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoProcesoProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProcesoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProcesoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProcesoProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProcesoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProcesoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProcesoProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoProcesoProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoProcesoProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProcesoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProcesoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProcesoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Produccions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProcesoProdu = new JLabelMe();

		this.jLabelArchivoImportacionTipoProcesoProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProcesoProdu.add(this.jLabelArchivoImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProcesoProdu = new JFileChooser();		
		this.jFileChooserImportacionTipoProcesoProdu.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProcesoProdu = new JButtonMe();
		this.jButtonAbrirImportacionTipoProcesoProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProcesoProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProcesoProdu.setToolTipText("Generar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoProdu.add(this.jButtonAbrirImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProcesoProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProcesoProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProcesoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProcesoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProcesoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProcesoProdu.add(this.jLabelPathArchivoImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProcesoProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProcesoProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProcesoProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProcesoProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoProdu.add(this.jTextFieldPathArchivoImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProcesoProdu = new JButtonMe();
		this.jButtonGenerarImportacionTipoProcesoProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProcesoProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProcesoProdu.setToolTipText("Generar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoProdu.add(this.jButtonGenerarImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProcesoProdu = new JButtonMe();
		this.jButtonCerrarImportacionTipoProcesoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProcesoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProcesoProdu.setToolTipText("Cancelar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoProdu.add(this.jButtonCerrarImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProcesoProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProcesoProdu= new JScrollPane(jPanelImportacionTipoProcesoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProcesoProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProcesoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProcesoProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProcesoProdu);
		this.jInternalFrameImportacionTipoProcesoProdu.getContentPane().add(this.jScrollPanelImportacionTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProcesoProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProcesoProdu = new JButtonMe();
			this.jButtonAbrirOrderByTipoProcesoProdu.setText("Orden");
			this.jButtonAbrirOrderByTipoProcesoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProcesoProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProcesoProdu";
			inputMap = this.jButtonAbrirOrderByTipoProcesoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProcesoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProcesoProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProcesoProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProcesoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProcesoProdu.setName("jPanelOrderByTipoProcesoProdu"); 
			
			this.jPanelOrderByTipoProcesoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProcesoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProcesoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProcesoProdu.setLayout(gridaBagLayoutOrderByTipoProcesoProdu);
			
			
			this.jTableDatosTipoProcesoProduOrderBy = new JTableMe();        
			this.jTableDatosTipoProcesoProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProcesoProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProcesoProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProcesoProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProcesoProduOrderBy.setViewportView(this.jTableDatosTipoProcesoProduOrderBy);
			this.jTableDatosTipoProcesoProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProcesoProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProcesoProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProcesoProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProcesoProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProcesoProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProcesoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProcesoProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProcesoProdu.setTitle("Orden");
			this.jInternalFrameOrderByTipoProcesoProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProcesoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProcesoProdu.setResizable(true);
			this.jInternalFrameOrderByTipoProcesoProdu.setClosable(true);
			this.jInternalFrameOrderByTipoProcesoProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProcesoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProcesoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProcesoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProcesoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Produccions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProcesoProdu.ipady =150;
				
			this.jPanelOrderByTipoProcesoProdu.add(jScrollPanelDatosTipoProcesoProduOrderBy, this.gridBagConstraintsTipoProcesoProdu);//this.jTableDatosTipoProcesoProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProcesoProdu = new JButtonMe();
			this.jButtonCerrarOrderByTipoProcesoProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProcesoProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProcesoProdu.setToolTipText("Cancelar"+" "+TipoProcesoProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProcesoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProcesoProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProcesoProdu.add(this.jButtonCerrarOrderByTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProcesoProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProcesoProdu= new JScrollPane(jPanelOrderByTipoProcesoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProcesoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProcesoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProcesoProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProcesoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProcesoProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProcesoProdu);
			
			this.jInternalFrameOrderByTipoProcesoProdu.getContentPane().add(this.jScrollPanelOrderByTipoProcesoProdu, this.gridBagConstraintsTipoProcesoProdu);			
		
		} else {
			this.jButtonAbrirOrderByTipoProcesoProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprocesoproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProcesoProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProcesoProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProcesoProdu.getRowHeight();//TipoProcesoProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.isSelected()) {
					iHeightTable=TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProcesoProdu.isSelected()) {
					iHeightTable=TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProcesoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProcesoProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProcesoProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProcesoProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProcesoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProcesoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProcesoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProcesoProdu!=null && this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprocesoproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProcesoProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProcesoProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProcesoProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProcesoProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProcesoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProcesoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProcesoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprocesoproduLogic.getTipoProcesoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesoprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProcesoProdu> TraerTipoProcesoProduBeans(List<TipoProcesoProdu> tipoprocesoprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProcesoProdu tipoprocesoprodu:tipoprocesoprodus) {
					
				if(!(TipoProcesoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProcesoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprocesoprodu.setsDetalleGeneralEntityReporte(TipoProcesoProduConstantesFunciones.getTipoProcesoProduDescripcion(tipoprocesoprodu));
										
						
					
					

					if(tipoprocesoprodu.getPedidoDetaProdus()!=null && Funciones.existeClass(classes,PedidoDetaProdu.class)) {
						try{tipoprocesoprodu.setpedidodetaprodusDescripcionReporte(new JRBeanCollectionDataSource(PedidoDetaProduJInternalFrame.TraerPedidoDetaProduBeans(tipoprocesoprodu.getPedidoDetaProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprocesoprodu.setsDetalleGeneralEntityReporte(tipoprocesoprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprocesoprodubeans.add(tipoprocesoprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprocesoprodus;
    }
	//PARA REPORTES FIN
}
