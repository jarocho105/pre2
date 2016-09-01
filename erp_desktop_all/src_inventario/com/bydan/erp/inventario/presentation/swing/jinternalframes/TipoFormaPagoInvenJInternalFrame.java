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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoFormaPagoInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoFormaPagoInvenJInternalFrame extends TipoFormaPagoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFormaPagoInven;
	
	protected JMenuBar jmenuBarTipoFormaPagoInven;
	
	protected JMenu jmenuTipoFormaPagoInven;
	protected JMenu jmenuDatosTipoFormaPagoInven;
	protected JMenu jmenuArchivoTipoFormaPagoInven;
	protected JMenu jmenuAccionesTipoFormaPagoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormaPagoInven;	
	protected GridBagConstraints gridBagConstraintsTipoFormaPagoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFormaPagoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFormaPagoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFormaPagoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFormaPagoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoFormaPagoInvenSessionBean tipoformapagoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFormaPagoInven> tipoformapagoinvens;		
	public List<TipoFormaPagoInven> tipoformapagoinvensEliminados;	
	public List<TipoFormaPagoInven> tipoformapagoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFormaPagoInven;		
	protected JButton jButtonAbrirOrderByTipoFormaPagoInven;
	
	
	//protected JPanel jPanelOrderByTipoFormaPagoInven;
	//public JScrollPane jScrollPanelOrderByTipoFormaPagoInven;	
	//protected JButton jButtonCerrarOrderByTipoFormaPagoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFormaPagoInvenLogic tipoformapagoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFormaPagoInven;
	public JScrollPane jScrollPanelDatosEdicionTipoFormaPagoInven;
	public JScrollPane jScrollPanelDatosGeneralTipoFormaPagoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFormaPagoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFormaPagoInven;
	//public JScrollPane jScrollPanelImportacionTipoFormaPagoInven;
	
	
	
	protected JPanel jPanelAccionesTipoFormaPagoInven;
	
    protected JPanel jPanelPaginacionTipoFormaPagoInven;
    protected JPanel jPanelParametrosReportesTipoFormaPagoInven;
	protected JPanel jPanelParametrosReportesAccionesTipoFormaPagoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFormaPagoInven;
	protected JPanel jPanelParametrosAuxiliar2TipoFormaPagoInven;
	protected JPanel jPanelParametrosAuxiliar3TipoFormaPagoInven;
	protected JPanel jPanelParametrosAuxiliar4TipoFormaPagoInven;
	//protected JPanel jPanelParametrosAuxiliar5TipoFormaPagoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFormaPagoInven;
	//protected JPanel jPanelImportacionTipoFormaPagoInven;
	
	
	public JTable jTableDatosTipoFormaPagoInven;
	
	
	
	//public JTable jTableDatosTipoFormaPagoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFormaPagoInven;
	protected JButton jButtonDuplicarTipoFormaPagoInven;
	protected JButton jButtonCopiarTipoFormaPagoInven;
	protected JButton jButtonVerFormTipoFormaPagoInven;
	protected JButton jButtonNuevoRelacionesTipoFormaPagoInven;
	protected JButton jButtonModificarTipoFormaPagoInven;
	
    protected JButton jButtonGuardarCambiosTablaTipoFormaPagoInven;
	protected JButton jButtonCerrarTipoFormaPagoInven;
	
	
	protected JButton jButtonRecargarInformacionTipoFormaPagoInven;
	protected JButton jButtonProcesarInformacionTipoFormaPagoInven;
	
	
	protected JButton jButtonAnterioresTipoFormaPagoInven;
	protected JButton jButtonSiguientesTipoFormaPagoInven;
	protected JButton jButtonNuevoGuardarCambiosTipoFormaPagoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFormaPagoInven;
	//protected JButton jButtonCerrarReporteDinamicoTipoFormaPagoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFormaPagoInven;
	//protected JButton jButtonGenerarImportacionTipoFormaPagoInven;
	//protected JButton jButtonCerrarImportacionTipoFormaPagoInven;
	//protected JFileChooser jFileChooserImportacionTipoFormaPagoInven;
	//protected File fileImportacionTipoFormaPagoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormaPagoInven;
	protected JButton jButtonDuplicarToolBarTipoFormaPagoInven;
	protected JButton jButtonNuevoRelacionesToolBarTipoFormaPagoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFormaPagoInven;
	protected JButton jButtonCopiarToolBarTipoFormaPagoInven;
	protected JButton jButtonVerFormToolBarTipoFormaPagoInven;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormaPagoInven;
	protected JButton jButtonCerrarToolBarTipoFormaPagoInven;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFormaPagoInven;
	protected JButton jButtonProcesarInformacionToolBarTipoFormaPagoInven;
	protected JButton jButtonAnterioresToolBarTipoFormaPagoInven;
	protected JButton jButtonSiguientesToolBarTipoFormaPagoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFormaPagoInven;
	protected JButton jButtonAbrirOrderByToolBarTipoFormaPagoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormaPagoInven;
	protected JMenuItem jMenuItemDuplicarTipoFormaPagoInven;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFormaPagoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFormaPagoInven;
	protected JMenuItem jMenuItemCopiarTipoFormaPagoInven;
	protected JMenuItem jMenuItemVerFormTipoFormaPagoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormaPagoInven;
	protected JMenuItem jMenuItemCerrarTipoFormaPagoInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormaPagoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFormaPagoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormaPagoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFormaPagoInven;
	protected JMenuItem jMenuItemProcesarInformacionTipoFormaPagoInven;
	protected JMenuItem jMenuItemAnterioresTipoFormaPagoInven;
	protected JMenuItem jMenuItemSiguientesTipoFormaPagoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormaPagoInven;
	protected JMenuItem jMenuItemAbrirOrderByTipoFormaPagoInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormaPagoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormaPagoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFormaPagoInven;
	protected JCheckBox jCheckBoxSeleccionadosTipoFormaPagoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFormaPagoInven;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFormaPagoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFormaPagoInven;
	protected JTextField jTextFieldValorCampoGeneralTipoFormaPagoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFormaPagoInven;
	//public JList<Reporte> jListColumnasSelectReporteTipoFormaPagoInven;
	//public JScrollPane jScrollColumnasSelectReporteTipoFormaPagoInven;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFormaPagoInven;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFormaPagoInven;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFormaPagoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFormaPagoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFormaPagoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven;
	
		
	//public JLabel jLabelArchivoImportacionTipoFormaPagoInven;	
	//public JLabel jLabelPathArchivoImportacionTipoFormaPagoInven;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFormaPagoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFormaPagoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFormaPagoInven;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFormaPagoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFormaPagoInven;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFormaPagoInven;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFormaPagoInven;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFormaPagoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFormaPagoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFormaPagoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoFormaPagoInven;
	
	
	
	
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
	public TipoFormaPagoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFormaPagoInven)	{
		this.jButtonRecargarInformacionTipoFormaPagoInven = jButtonRecargarInformacionTipoFormaPagoInven;
	}
	
	public JButton getjButtonProcesarInformacionTipoFormaPagoInven() {
		return this.jButtonProcesarInformacionTipoFormaPagoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormaPagoInven)	{
		this.jButtonProcesarInformacionTipoFormaPagoInven = jButtonProcesarInformacionTipoFormaPagoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFormaPagoInven() {
		return this.jButtonRecargarInformacionTipoFormaPagoInven;
	}
	
	
	public List<TipoFormaPagoInven> gettipoformapagoinvens() {
		return this.tipoformapagoinvens;
	}

	public void settipoformapagoinvens(List<TipoFormaPagoInven> tipoformapagoinvens) {
		this.tipoformapagoinvens = tipoformapagoinvens;
	}
	
	public List<TipoFormaPagoInven> gettipoformapagoinvensAux() {
		return this.tipoformapagoinvensAux;
	}

	public void settipoformapagoinvensAux(List<TipoFormaPagoInven> tipoformapagoinvensAux) {
		this.tipoformapagoinvensAux = tipoformapagoinvensAux;
	}
	
	public List<TipoFormaPagoInven> gettipoformapagoinvensEliminados() {
		return this.tipoformapagoinvensEliminados;
	}

	public void setTipoFormaPagoInvensEliminados(List<TipoFormaPagoInven> tipoformapagoinvensEliminados) {
		this.tipoformapagoinvensEliminados = tipoformapagoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFormaPagoInven() {
		return jComboBoxTiposSeleccionarTipoFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFormaPagoInven(
			JComboBox jComboBoxTiposSeleccionarTipoFormaPagoInven) {
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven = jComboBoxTiposSeleccionarTipoFormaPagoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFormaPagoInven() {
		return jTextFieldValorCampoGeneralTipoFormaPagoInven;
	}

	public void setjTextFieldValorCampoGeneralTipoFormaPagoInven(
			JTextField jTextFieldValorCampoGeneralTipoFormaPagoInven) {
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven = jTextFieldValorCampoGeneralTipoFormaPagoInven;
	}

	public void setBorderResaltarValorCampoGeneralTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFormaPagoInven() {
		return this.jCheckBoxSeleccionarTodosTipoFormaPagoInven;
	}

	public void setjCheckBoxSeleccionarTodosTipoFormaPagoInven(
			JCheckBox jCheckBoxSeleccionarTodosTipoFormaPagoInven) {
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven = jCheckBoxSeleccionarTodosTipoFormaPagoInven;
	}

	public void setBorderResaltarSeleccionarTodosTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFormaPagoInven() {
		return this.jCheckBoxSeleccionadosTipoFormaPagoInven;
	}

	public void setjCheckBoxSeleccionadosTipoFormaPagoInven(
			JCheckBox jCheckBoxSeleccionadosTipoFormaPagoInven) {
		this.jCheckBoxSeleccionadosTipoFormaPagoInven = jCheckBoxSeleccionadosTipoFormaPagoInven;
	}
	
	public void setBorderResaltarSeleccionadosTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFormaPagoInven() {
		return this.jComboBoxTiposArchivosReportesTipoFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFormaPagoInven(
			JComboBox jComboBoxTiposArchivosReportesTipoFormaPagoInven) {
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven = jComboBoxTiposArchivosReportesTipoFormaPagoInven;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFormaPagoInven() {
		return this.jComboBoxTiposReportesTipoFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFormaPagoInven(
			JComboBox jComboBoxTiposReportesTipoFormaPagoInven) {
		this.jComboBoxTiposReportesTipoFormaPagoInven = jComboBoxTiposReportesTipoFormaPagoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFormaPagoInven() {
	//	return jComboBoxTiposReportesDinamicoTipoFormaPagoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFormaPagoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFormaPagoInven) {
	//	this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven = jComboBoxTiposReportesDinamicoTipoFormaPagoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven = jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven;
	//}
	
	public void setBorderResaltarTiposReportesTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFormaPagoInven() {
		return this.jComboBoxTiposGraficosReportesTipoFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFormaPagoInven(
			JComboBox jComboBoxTiposGraficosReportesTipoFormaPagoInven) {
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven = jComboBoxTiposGraficosReportesTipoFormaPagoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFormaPagoInven() {
		return this.jComboBoxTiposPaginacionTipoFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFormaPagoInven(
			JComboBox jComboBoxTiposPaginacionTipoFormaPagoInven) {
		this.jComboBoxTiposPaginacionTipoFormaPagoInven = jComboBoxTiposPaginacionTipoFormaPagoInven;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFormaPagoInven() {
		return this.jComboBoxTiposRelacionesTipoFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormaPagoInven() {
		return this.jComboBoxTiposAccionesTipoFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormaPagoInven(
			JComboBox jComboBoxTiposRelacionesTipoFormaPagoInven) {
		this.jComboBoxTiposRelacionesTipoFormaPagoInven = jComboBoxTiposRelacionesTipoFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormaPagoInven(
			JComboBox jComboBoxTiposAccionesTipoFormaPagoInven) {
		this.jComboBoxTiposAccionesTipoFormaPagoInven = jComboBoxTiposAccionesTipoFormaPagoInven;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFormaPagoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFormaPagoInven() {
	//	return jCheckBoxConGraficoDinamicoTipoFormaPagoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFormaPagoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFormaPagoInven) {
	//	this.jCheckBoxConGraficoDinamicoTipoFormaPagoInven = jCheckBoxConGraficoDinamicoTipoFormaPagoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFormaPagoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFormaPagoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFormaPagoInven .setBorder(borderResaltar);		
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
		this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
		
		this.tipoformapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormaPagoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Forma Pago Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFormaPagoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFormaPagoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"nuevo","nuevo","Nuevo"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"duplicar","duplicar","Duplicar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"copiar","copiar","Copiar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"ver_form","ver_form","Ver"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"recargar","recargar","Recargar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,
							"cerrar","cerrar","Salir"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFormaPagoInven;
			
				this.jButtonProcesarInformacionToolBarTipoFormaPagoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFormaPagoInven;
				
		//protected JButton jButtonModificarToolBarTipoFormaPagoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFormaPagoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFormaPagoInven=new JMenuMe("General");
		this.jmenuArchivoTipoFormaPagoInven=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFormaPagoInven=new JMenuMe("Acciones");
		this.jmenuDatosTipoFormaPagoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormaPagoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormaPagoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormaPagoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFormaPagoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFormaPagoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFormaPagoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFormaPagoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFormaPagoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFormaPagoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFormaPagoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormaPagoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormaPagoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFormaPagoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFormaPagoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFormaPagoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFormaPagoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFormaPagoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFormaPagoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormaPagoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormaPagoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormaPagoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFormaPagoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFormaPagoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFormaPagoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFormaPagoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFormaPagoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFormaPagoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFormaPagoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFormaPagoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFormaPagoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFormaPagoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFormaPagoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFormaPagoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFormaPagoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFormaPagoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFormaPagoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFormaPagoInven.add(this.jMenuItemCerrarTipoFormaPagoInven);
			
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemNuevoTipoFormaPagoInven);
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven);
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemNuevoRelacionesTipoFormaPagoInven);
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven);		
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemDuplicarTipoFormaPagoInven);		
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemCopiarTipoFormaPagoInven);		
			this.jmenuAccionesTipoFormaPagoInven.add(this.jMenuItemVerFormTipoFormaPagoInven);		
			
			this.jmenuDatosTipoFormaPagoInven.add(this.jMenuItemRecargarInformacionTipoFormaPagoInven);				
			this.jmenuDatosTipoFormaPagoInven.add(this.jMenuItemAnterioresTipoFormaPagoInven);				
			this.jmenuDatosTipoFormaPagoInven.add(this.jMenuItemSiguientesTipoFormaPagoInven);				
			this.jmenuDatosTipoFormaPagoInven.add(this.jMenuItemAbrirOrderByTipoFormaPagoInven);				
			this.jmenuDatosTipoFormaPagoInven.add(this.jMenuItemMostrarOcultarTipoFormaPagoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFormaPagoInven.add(this.jMenuItemGuardarCambiosTipoFormaPagoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFormaPagoInven.add(this.jmenuArchivoTipoFormaPagoInven);		
			this.jmenuBarTipoFormaPagoInven.add(this.jmenuAccionesTipoFormaPagoInven);		
			this.jmenuBarTipoFormaPagoInven.add(this.jmenuDatosTipoFormaPagoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFormaPagoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFormaPagoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoFormaPagoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoFormaPagoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFormaPagoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFormaPagoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoFormaPagoInven = new TipoFormaPagoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Forma Pago Inven DATOS");
			this.jInternalFrameDetalleFormTipoFormaPagoInven = new TipoFormaPagoInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoformapagoinvenSessionBean.getConGuardarRelaciones(),this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFormaPagoInven = null;//new TipoFormaPagoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormaPagoInven= new GridBagLayout();
		
		
		this.jTableDatosTipoFormaPagoInven = new JTableMe();      
		
		String sToolTipTipoFormaPagoInven="";
		sToolTipTipoFormaPagoInven=TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormaPagoInven+="(Inventario.TipoFormaPagoInven)";
		}
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormaPagoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFormaPagoInven.setToolTipText(sToolTipTipoFormaPagoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFormaPagoInven);
		this.jTableDatosTipoFormaPagoInven.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFormaPagoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFormaPagoInven.setRowSelectionAllowed(true);
		this.jTableDatosTipoFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFormaPagoInven = new JButtonMe();
		this.jButtonDuplicarTipoFormaPagoInven = new JButtonMe();
		this.jButtonCopiarTipoFormaPagoInven = new JButtonMe();
		this.jButtonVerFormTipoFormaPagoInven = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFormaPagoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven = new JButtonMe();
		this.jButtonCerrarTipoFormaPagoInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormaPagoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFormaPagoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Forma Pago Inven";
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pago Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormaPagoInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormaPagoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFormaPagoInven=new ReporteDinamicoJInternalFrame(TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFormaPagoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFormaPagoInven=new ImportacionJInternalFrame(TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFormaPagoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFormaPagoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFormaPagoInven.setText("Orden");
		this.jButtonAbrirOrderByTipoFormaPagoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormaPagoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormaPagoInven,false,this);
			
			//this.cargarOrderByTipoFormaPagoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormaPagoInven,true,this);
			
			//this.cargarOrderByTipoFormaPagoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFormaPagoInven.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFormaPagoInven.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFormaPagoInven.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFormaPagoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormaPagoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormaPagoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFormaPagoInven.setText("Nuevo");
		this.jButtonDuplicarTipoFormaPagoInven.setText("Duplicar");
		this.jButtonCopiarTipoFormaPagoInven.setText("Copiar");
		this.jButtonVerFormTipoFormaPagoInven.setText("Ver");
		this.jButtonNuevoRelacionesTipoFormaPagoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.setText("Guardar");
		this.jButtonCerrarTipoFormaPagoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormaPagoInven,"nuevo_button","Nuevo",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFormaPagoInven,"duplicar_button","Duplicar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFormaPagoInven,"copiar_button","Copiar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFormaPagoInven,"ver_form","Ver",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFormaPagoInven,"nuevorelaciones_button","Nuevo Rel",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormaPagoInven,"guardarcambiostabla_button","Guardar",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormaPagoInven,"cerrar_button","Salir",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFormaPagoInven.setToolTipText("Nuevo"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFormaPagoInven.setToolTipText("Duplicar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFormaPagoInven.setToolTipText("Copiar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFormaPagoInven.setToolTipText("Ver"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFormaPagoInven.setToolTipText("Nuevo Rel"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.setToolTipText("Guardar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormaPagoInven.setToolTipText("Salir"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormaPagoInven";
		inputMap = this.jButtonNuevoTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormaPagoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFormaPagoInven";
		inputMap = this.jButtonDuplicarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFormaPagoInven"));
		
		//COPIAR
		sMapKey = "CopiarTipoFormaPagoInven";
		inputMap = this.jButtonCopiarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFormaPagoInven"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFormaPagoInven";
		inputMap = this.jButtonVerFormTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFormaPagoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFormaPagoInven";
		inputMap = this.jButtonNuevoRelacionesTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFormaPagoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFormaPagoInven";
		inputMap = this.jButtonModificarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFormaPagoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFormaPagoInven";
		inputMap = this.jButtonCerrarTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormaPagoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormaPagoInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormaPagoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFormaPagoInven.setName("jPanelParametrosReportesTipoFormaPagoInven"); 
		
		this.jPanelParametrosReportesAccionesTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFormaPagoInven.setName("jPanelParametrosReportesAccionesTipoFormaPagoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFormaPagoInven = new JButtonMe();
		this.jButtonRecargarInformacionTipoFormaPagoInven.setText("Recargar");
		this.jButtonRecargarInformacionTipoFormaPagoInven.setToolTipText("Recargar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFormaPagoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFormaPagoInven = new JButtonMe();
		this.jButtonProcesarInformacionTipoFormaPagoInven.setText("Procesar");
		this.jButtonProcesarInformacionTipoFormaPagoInven.setToolTipText("Procesar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFormaPagoInven.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFormaPagoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormaPagoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormaPagoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFormaPagoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFormaPagoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFormaPagoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFormaPagoInven.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFormaPagoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormaPagoInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFormaPagoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFormaPagoInven = new JLabelMe();
		
		this.jLabelAccionesTipoFormaPagoInven.setText("Acciones");		
		this.jLabelAccionesTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFormaPagoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFormaPagoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFormaPagoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFormaPagoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFormaPagoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFormaPagoInven = new JButtonMe();
		//this.jButtonAnterioresTipoFormaPagoInven.setText("<<");
        this.jButtonAnterioresTipoFormaPagoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFormaPagoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFormaPagoInven = new JButtonMe();
		//this.jButtonSiguientesTipoFormaPagoInven.setText(">>");
        this.jButtonSiguientesTipoFormaPagoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFormaPagoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFormaPagoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFormaPagoInven,"nuevoguardarcambios_button","Nue",this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFormaPagoInven";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFormaPagoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFormaPagoInven";
		inputMap = this.jButtonRecargarInformacionTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFormaPagoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFormaPagoInven";
		inputMap = this.jButtonSiguientesTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFormaPagoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFormaPagoInven";
		inputMap = this.jButtonAnterioresTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFormaPagoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFormaPagoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFormaPagoInven.setMinimumSize(new Dimension(this.getWidth(),TipoFormaPagoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormaPagoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormaPagoInven.setMaximumSize(new Dimension(this.getWidth(),TipoFormaPagoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormaPagoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormaPagoInven.setPreferredSize(new Dimension(this.getWidth(),TipoFormaPagoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormaPagoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFormaPagoInven = new GridBagLayout();

			this.jPanelPaginacionTipoFormaPagoInven.setLayout(gridaBagLayoutPaginacionTipoFormaPagoInven);						
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonAnterioresTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
					
						
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
			
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonNuevoGuardarCambiosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
						
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonSiguientesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 1;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonNuevoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
						
			
			
			if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormaPagoInven.gridy = 1;
				this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonGuardarCambiosTablaTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			}
			
			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 1;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonDuplicarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 1;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonCopiarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 1;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonVerFormTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 1;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFormaPagoInven.add(this.jButtonCerrarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
		
		
		this.jButtonRecargarInformacionTipoFormaPagoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormaPagoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormaPagoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFormaPagoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormaPagoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormaPagoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFormaPagoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormaPagoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormaPagoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFormaPagoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormaPagoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormaPagoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFormaPagoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormaPagoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormaPagoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFormaPagoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFormaPagoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFormaPagoInven.setLayout(gridaBagParametrosReportesTipoFormaPagoInven);
			this.jPanelParametrosReportesAccionesTipoFormaPagoInven.setLayout(gridaBagParametrosReportesAccionesTipoFormaPagoInven);
			
			
			this.jPanelParametrosAuxiliar1TipoFormaPagoInven.setLayout(gridaBagParametrosAuxiliar1TipoFormaPagoInven);
			this.jPanelParametrosAuxiliar2TipoFormaPagoInven.setLayout(gridaBagParametrosAuxiliar2TipoFormaPagoInven);
			this.jPanelParametrosAuxiliar3TipoFormaPagoInven.setLayout(gridaBagParametrosAuxiliar3TipoFormaPagoInven);
			this.jPanelParametrosAuxiliar4TipoFormaPagoInven.setLayout(gridaBagParametrosAuxiliar4TipoFormaPagoInven);
			//this.jPanelParametrosAuxiliar5TipoFormaPagoInven.setLayout(gridaBagParametrosAuxiliar2TipoFormaPagoInven);			
			
			
			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jButtonRecargarInformacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormaPagoInven.add(this.jComboBoxTiposPaginacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormaPagoInven.add(this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormaPagoInven.add(this.jComboBoxTiposArchivosReportesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jPanelParametrosAuxiliar1TipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFormaPagoInven.add(this.jComboBoxTiposReportesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jPanelParametrosAuxiliar4TipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jComboBoxTiposReportesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jCheckBoxGenerarReporteTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jPanelParametrosAuxiliar2TipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jLabelAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jButtonAbrirOrderByTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jComboBoxTiposSeleccionarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
			
			
			/*
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jCheckBoxSeleccionarTodosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormaPagoInven.add(this.jCheckBoxSeleccionarTodosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);															
				
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormaPagoInven.add(this.jCheckBoxSeleccionadosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jPanelParametrosAuxiliar3TipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jComboBoxTiposAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
	
				
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPagoInven.add(this.jTextFieldValorCampoGeneralTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFormaPagoInven = new GridBagLayout();

			this.jScrollPanelDatosTipoFormaPagoInven.setLayout(gridaBagLayoutDatosTipoFormaPagoInven);
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
			
			this.jScrollPanelDatosTipoFormaPagoInven.add(this.jTableDatosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFormaPagoInven.setViewportView(this.jTableDatosTipoFormaPagoInven);
		this.jTableDatosTipoFormaPagoInven.setFillsViewportHeight(true);
		this.jTableDatosTipoFormaPagoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFormaPagoInven= new GridBagLayout();
		this.jPanelAccionesTipoFormaPagoInven.setLayout(gridaBagLayoutAccionesTipoFormaPagoInven);
		
		
		/*	
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = 0;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
			
		this.jPanelAccionesTipoFormaPagoInven.add(this.jButtonNuevoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormaPagoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormaPagoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;		
			//this.gridBagConstraintsTipoFormaPagoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormaPagoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;		
		//this.gridBagConstraintsTipoFormaPagoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFormaPagoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFormaPagoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);								
		
		
		/*
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		*/		
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormaPagoInven.gridx =0;
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormaPagoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
				
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormaPagoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFormaPagoInven.setLayout(gridaBagLayoutBusquedasParametrosTipoFormaPagoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFormaPagoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
			
			
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
			
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFormaPagoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFormaPagoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFormaPagoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFormaPagoInven.setName("jPanelReporteDinamicoTipoFormaPagoInven"); 
		
		this.jPanelReporteDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFormaPagoInven.setLayout(gridaBagLayoutReporteDinamicoTipoFormaPagoInven);
		
		
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFormaPagoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormaPagoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pago Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFormaPagoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFormaPagoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jLabelColumnasSelectReporteTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFormaPagoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFormaPagoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFormaPagoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormaPagoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormaPagoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFormaPagoInven=new JScrollPane(this.jListColumnasSelectReporteTipoFormaPagoInven);
			
			this.jScrollColumnasSelectReporteTipoFormaPagoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormaPagoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormaPagoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jListColumnasSelectReporteTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jScrollColumnasSelectReporteTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFormaPagoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFormaPagoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFormaPagoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFormaPagoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFormaPagoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormaPagoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormaPagoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFormaPagoInven=new JScrollPane(this.jListRelacionesSelectReporteTipoFormaPagoInven);
			
			this.jScrollRelacionesSelectReporteTipoFormaPagoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormaPagoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormaPagoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoFormaPagoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFormaPagoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFormaPagoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jLabelGenerarExcelReporteDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven.setToolTipText("Generar EXCEL"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jComboBoxTiposReportesDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jLabelTiposArchivoReporteDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFormaPagoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFormaPagoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFormaPagoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFormaPagoInven.setToolTipText("Generar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jButtonGenerarReporteDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFormaPagoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFormaPagoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFormaPagoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFormaPagoInven.setToolTipText("Cancelar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPagoInven.add(this.jButtonCerrarReporteDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFormaPagoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFormaPagoInven= new JScrollPane(jPanelReporteDinamicoTipoFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pago Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPagoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFormaPagoInven);
		this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFormaPagoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFormaPagoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFormaPagoInven.setName("jPanelImportacionTipoFormaPagoInven"); 
		
		this.jPanelImportacionTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFormaPagoInven.setLayout(gridaBagLayoutImportacionTipoFormaPagoInven);
		
		
		this.jInternalFrameImportacionTipoFormaPagoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFormaPagoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFormaPagoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormaPagoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormaPagoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormaPagoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFormaPagoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormaPagoInven.setResizable(true);
	    this.jInternalFrameImportacionTipoFormaPagoInven.setClosable(true);
	    this.jInternalFrameImportacionTipoFormaPagoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormaPagoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormaPagoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFormaPagoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormaPagoInven.setResizable(true);
	    this.jInternalFrameImportacionTipoFormaPagoInven.setClosable(true);
	    this.jInternalFrameImportacionTipoFormaPagoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pago Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFormaPagoInven = new JLabelMe();

		this.jLabelArchivoImportacionTipoFormaPagoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormaPagoInven.add(this.jLabelArchivoImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFormaPagoInven = new JFileChooser();		
		this.jFileChooserImportacionTipoFormaPagoInven.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFormaPagoInven = new JButtonMe();
		this.jButtonAbrirImportacionTipoFormaPagoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFormaPagoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFormaPagoInven.setToolTipText("Generar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPagoInven.add(this.jButtonAbrirImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFormaPagoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFormaPagoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormaPagoInven.add(this.jLabelPathArchivoImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFormaPagoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFormaPagoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormaPagoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormaPagoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPagoInven.add(this.jTextFieldPathArchivoImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFormaPagoInven = new JButtonMe();
		this.jButtonGenerarImportacionTipoFormaPagoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFormaPagoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFormaPagoInven.setToolTipText("Generar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPagoInven.add(this.jButtonGenerarImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFormaPagoInven = new JButtonMe();
		this.jButtonCerrarImportacionTipoFormaPagoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFormaPagoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFormaPagoInven.setToolTipText("Cancelar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPagoInven.add(this.jButtonCerrarImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFormaPagoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFormaPagoInven= new JScrollPane(jPanelImportacionTipoFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPagoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFormaPagoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFormaPagoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFormaPagoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFormaPagoInven);
		this.jInternalFrameImportacionTipoFormaPagoInven.getContentPane().add(this.jScrollPanelImportacionTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFormaPagoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFormaPagoInven = new JButtonMe();
			this.jButtonAbrirOrderByTipoFormaPagoInven.setText("Orden");
			this.jButtonAbrirOrderByTipoFormaPagoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormaPagoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFormaPagoInven";
			inputMap = this.jButtonAbrirOrderByTipoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFormaPagoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFormaPagoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFormaPagoInven.setName("jPanelOrderByTipoFormaPagoInven"); 
			
			this.jPanelOrderByTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFormaPagoInven.setLayout(gridaBagLayoutOrderByTipoFormaPagoInven);
			
			
			this.jTableDatosTipoFormaPagoInvenOrderBy = new JTableMe();        
			this.jTableDatosTipoFormaPagoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFormaPagoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFormaPagoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFormaPagoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFormaPagoInvenOrderBy.setViewportView(this.jTableDatosTipoFormaPagoInvenOrderBy);
			this.jTableDatosTipoFormaPagoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFormaPagoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFormaPagoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFormaPagoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFormaPagoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFormaPagoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFormaPagoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFormaPagoInven.setTitle("Orden");
			this.jInternalFrameOrderByTipoFormaPagoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFormaPagoInven.setResizable(true);
			this.jInternalFrameOrderByTipoFormaPagoInven.setClosable(true);
			this.jInternalFrameOrderByTipoFormaPagoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pago Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFormaPagoInven.ipady =150;
				
			this.jPanelOrderByTipoFormaPagoInven.add(jScrollPanelDatosTipoFormaPagoInvenOrderBy, this.gridBagConstraintsTipoFormaPagoInven);//this.jTableDatosTipoFormaPagoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFormaPagoInven = new JButtonMe();
			this.jButtonCerrarOrderByTipoFormaPagoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFormaPagoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFormaPagoInven.setToolTipText("Cancelar"+" "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPagoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFormaPagoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFormaPagoInven.add(this.jButtonCerrarOrderByTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFormaPagoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFormaPagoInven= new JScrollPane(jPanelOrderByTipoFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPagoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFormaPagoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormaPagoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFormaPagoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFormaPagoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFormaPagoInven);
			
			this.jInternalFrameOrderByTipoFormaPagoInven.getContentPane().add(this.jScrollPanelOrderByTipoFormaPagoInven, this.gridBagConstraintsTipoFormaPagoInven);			
		
		} else {
			this.jButtonAbrirOrderByTipoFormaPagoInven = new JButtonMe();
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
			&& this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFormaPagoInven.getRowHeight();//TipoFormaPagoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.isSelected()) {
					iHeightTable=TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormaPagoInven.isSelected()) {
					iHeightTable=TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFormaPagoInven!=null && this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFormaPagoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFormaPagoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFormaPagoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFormaPagoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormaPagoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormaPagoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoformapagoinvenLogic.getTipoFormaPagoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformapagoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFormaPagoInven> TraerTipoFormaPagoInvenBeans(List<TipoFormaPagoInven> tipoformapagoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFormaPagoInven tipoformapagoinven:tipoformapagoinvens) {
					
				if(!(TipoFormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoformapagoinven.setsDetalleGeneralEntityReporte(TipoFormaPagoInvenConstantesFunciones.getTipoFormaPagoInvenDescripcion(tipoformapagoinven));
										
						
					
						
					
				} else  {
							
					//tipoformapagoinven.setsDetalleGeneralEntityReporte(tipoformapagoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoformapagoinvenbeans.add(tipoformapagoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoformapagoinvens;
    }
	//PARA REPORTES FIN
}
