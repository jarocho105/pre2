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
import com.bydan.erp.inventario.util.TipoMensajeCorreoInvenConstantesFunciones;

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
public class TipoMensajeCorreoInvenJInternalFrame extends TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMensajeCorreoInven;
	
	protected JMenuBar jmenuBarTipoMensajeCorreoInven;
	
	protected JMenu jmenuTipoMensajeCorreoInven;
	protected JMenu jmenuDatosTipoMensajeCorreoInven;
	protected JMenu jmenuArchivoTipoMensajeCorreoInven;
	protected JMenu jmenuAccionesTipoMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsTipoMensajeCorreoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMensajeCorreoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMensajeCorreoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMensajeCorreoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean;
		
	
	
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMensajeCorreoInven> tipomensajecorreoinvens;		
	public List<TipoMensajeCorreoInven> tipomensajecorreoinvensEliminados;	
	public List<TipoMensajeCorreoInven> tipomensajecorreoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMensajeCorreoInven;		
	protected JButton jButtonAbrirOrderByTipoMensajeCorreoInven;
	
	
	//protected JPanel jPanelOrderByTipoMensajeCorreoInven;
	//public JScrollPane jScrollPanelOrderByTipoMensajeCorreoInven;	
	//protected JButton jButtonCerrarOrderByTipoMensajeCorreoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMensajeCorreoInvenLogic tipomensajecorreoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionTipoMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralTipoMensajeCorreoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMensajeCorreoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMensajeCorreoInven;
	//public JScrollPane jScrollPanelImportacionTipoMensajeCorreoInven;
	
	
	
	protected JPanel jPanelAccionesTipoMensajeCorreoInven;
	
    protected JPanel jPanelPaginacionTipoMensajeCorreoInven;
    protected JPanel jPanelParametrosReportesTipoMensajeCorreoInven;
	protected JPanel jPanelParametrosReportesAccionesTipoMensajeCorreoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar2TipoMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar3TipoMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar4TipoMensajeCorreoInven;
	//protected JPanel jPanelParametrosAuxiliar5TipoMensajeCorreoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMensajeCorreoInven;
	//protected JPanel jPanelImportacionTipoMensajeCorreoInven;
	
	
	public JTable jTableDatosTipoMensajeCorreoInven;
	
	
	
	//public JTable jTableDatosTipoMensajeCorreoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMensajeCorreoInven;
	protected JButton jButtonDuplicarTipoMensajeCorreoInven;
	protected JButton jButtonCopiarTipoMensajeCorreoInven;
	protected JButton jButtonVerFormTipoMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesTipoMensajeCorreoInven;
	protected JButton jButtonModificarTipoMensajeCorreoInven;
	
    protected JButton jButtonGuardarCambiosTablaTipoMensajeCorreoInven;
	protected JButton jButtonCerrarTipoMensajeCorreoInven;
	
	
	protected JButton jButtonRecargarInformacionTipoMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionTipoMensajeCorreoInven;
	
	
	protected JButton jButtonAnterioresTipoMensajeCorreoInven;
	protected JButton jButtonSiguientesTipoMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosTipoMensajeCorreoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMensajeCorreoInven;
	//protected JButton jButtonCerrarReporteDinamicoTipoMensajeCorreoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMensajeCorreoInven;
	//protected JButton jButtonGenerarImportacionTipoMensajeCorreoInven;
	//protected JButton jButtonCerrarImportacionTipoMensajeCorreoInven;
	//protected JFileChooser jFileChooserImportacionTipoMensajeCorreoInven;
	//protected File fileImportacionTipoMensajeCorreoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMensajeCorreoInven;
	protected JButton jButtonDuplicarToolBarTipoMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMensajeCorreoInven;
	protected JButton jButtonCopiarToolBarTipoMensajeCorreoInven;
	protected JButton jButtonVerFormToolBarTipoMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarTipoMensajeCorreoInven;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionToolBarTipoMensajeCorreoInven;
	protected JButton jButtonAnterioresToolBarTipoMensajeCorreoInven;
	protected JButton jButtonSiguientesToolBarTipoMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMensajeCorreoInven;
	protected JButton jButtonAbrirOrderByToolBarTipoMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemDuplicarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMensajeCorreoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemCopiarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemVerFormTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemProcesarInformacionTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemAnterioresTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemSiguientesTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemAbrirOrderByTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMensajeCorreoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMensajeCorreoInven;
	protected JCheckBox jCheckBoxSeleccionadosTipoMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMensajeCorreoInven;
	protected JTextField jTextFieldValorCampoGeneralTipoMensajeCorreoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMensajeCorreoInven;
	//public JList<Reporte> jListColumnasSelectReporteTipoMensajeCorreoInven;
	//public JScrollPane jScrollColumnasSelectReporteTipoMensajeCorreoInven;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMensajeCorreoInven;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMensajeCorreoInven;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMensajeCorreoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMensajeCorreoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven;
	
		
	//public JLabel jLabelArchivoImportacionTipoMensajeCorreoInven;	
	//public JLabel jLabelPathArchivoImportacionTipoMensajeCorreoInven;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMensajeCorreoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMensajeCorreoInven;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMensajeCorreoInven;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMensajeCorreoInven;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMensajeCorreoInven;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMensajeCorreoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMensajeCorreoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMensajeCorreoInven;
	
	
	
	
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
	public TipoMensajeCorreoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMensajeCorreoInven)	{
		this.jButtonRecargarInformacionTipoMensajeCorreoInven = jButtonRecargarInformacionTipoMensajeCorreoInven;
	}
	
	public JButton getjButtonProcesarInformacionTipoMensajeCorreoInven() {
		return this.jButtonProcesarInformacionTipoMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMensajeCorreoInven)	{
		this.jButtonProcesarInformacionTipoMensajeCorreoInven = jButtonProcesarInformacionTipoMensajeCorreoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMensajeCorreoInven() {
		return this.jButtonRecargarInformacionTipoMensajeCorreoInven;
	}
	
	
	public List<TipoMensajeCorreoInven> gettipomensajecorreoinvens() {
		return this.tipomensajecorreoinvens;
	}

	public void settipomensajecorreoinvens(List<TipoMensajeCorreoInven> tipomensajecorreoinvens) {
		this.tipomensajecorreoinvens = tipomensajecorreoinvens;
	}
	
	public List<TipoMensajeCorreoInven> gettipomensajecorreoinvensAux() {
		return this.tipomensajecorreoinvensAux;
	}

	public void settipomensajecorreoinvensAux(List<TipoMensajeCorreoInven> tipomensajecorreoinvensAux) {
		this.tipomensajecorreoinvensAux = tipomensajecorreoinvensAux;
	}
	
	public List<TipoMensajeCorreoInven> gettipomensajecorreoinvensEliminados() {
		return this.tipomensajecorreoinvensEliminados;
	}

	public void setTipoMensajeCorreoInvensEliminados(List<TipoMensajeCorreoInven> tipomensajecorreoinvensEliminados) {
		this.tipomensajecorreoinvensEliminados = tipomensajecorreoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMensajeCorreoInven() {
		return jComboBoxTiposSeleccionarTipoMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposSeleccionarTipoMensajeCorreoInven) {
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven = jComboBoxTiposSeleccionarTipoMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMensajeCorreoInven() {
		return jTextFieldValorCampoGeneralTipoMensajeCorreoInven;
	}

	public void setjTextFieldValorCampoGeneralTipoMensajeCorreoInven(
			JTextField jTextFieldValorCampoGeneralTipoMensajeCorreoInven) {
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven = jTextFieldValorCampoGeneralTipoMensajeCorreoInven;
	}

	public void setBorderResaltarValorCampoGeneralTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMensajeCorreoInven() {
		return this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionarTodosTipoMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionarTodosTipoMensajeCorreoInven) {
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven = jCheckBoxSeleccionarTodosTipoMensajeCorreoInven;
	}

	public void setBorderResaltarSeleccionarTodosTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMensajeCorreoInven() {
		return this.jCheckBoxSeleccionadosTipoMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionadosTipoMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionadosTipoMensajeCorreoInven) {
		this.jCheckBoxSeleccionadosTipoMensajeCorreoInven = jCheckBoxSeleccionadosTipoMensajeCorreoInven;
	}
	
	public void setBorderResaltarSeleccionadosTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMensajeCorreoInven() {
		return this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposArchivosReportesTipoMensajeCorreoInven) {
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven = jComboBoxTiposArchivosReportesTipoMensajeCorreoInven;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMensajeCorreoInven() {
		return this.jComboBoxTiposReportesTipoMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposReportesTipoMensajeCorreoInven) {
		this.jComboBoxTiposReportesTipoMensajeCorreoInven = jComboBoxTiposReportesTipoMensajeCorreoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMensajeCorreoInven() {
	//	return jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMensajeCorreoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven) {
	//	this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven = jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven = jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven;
	//}
	
	public void setBorderResaltarTiposReportesTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMensajeCorreoInven() {
		return this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposGraficosReportesTipoMensajeCorreoInven) {
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven = jComboBoxTiposGraficosReportesTipoMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMensajeCorreoInven() {
		return this.jComboBoxTiposPaginacionTipoMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposPaginacionTipoMensajeCorreoInven) {
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven = jComboBoxTiposPaginacionTipoMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMensajeCorreoInven() {
		return this.jComboBoxTiposRelacionesTipoMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesTipoMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesTipoMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven = jComboBoxTiposRelacionesTipoMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesTipoMensajeCorreoInven) {
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven = jComboBoxTiposAccionesTipoMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMensajeCorreoInven() {
	//	return jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMensajeCorreoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven) {
	//	this.jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven = jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMensajeCorreoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMensajeCorreoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven .setBorder(borderResaltar);		
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
		this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
		
		this.tipomensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Mensaje Correo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMensajeCorreoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"nuevo","nuevo","Nuevo"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"duplicar","duplicar","Duplicar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"copiar","copiar","Copiar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"ver_form","ver_form","Ver"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"recargar","recargar","Recargar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,
							"cerrar","cerrar","Salir"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven;
			
				this.jButtonProcesarInformacionToolBarTipoMensajeCorreoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMensajeCorreoInven;
				
		//protected JButton jButtonModificarToolBarTipoMensajeCorreoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMensajeCorreoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMensajeCorreoInven=new JMenuMe("General");
		this.jmenuArchivoTipoMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDatosTipoMensajeCorreoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMensajeCorreoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMensajeCorreoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMensajeCorreoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMensajeCorreoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMensajeCorreoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMensajeCorreoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMensajeCorreoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMensajeCorreoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMensajeCorreoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMensajeCorreoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMensajeCorreoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMensajeCorreoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMensajeCorreoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMensajeCorreoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMensajeCorreoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMensajeCorreoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMensajeCorreoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMensajeCorreoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMensajeCorreoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMensajeCorreoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMensajeCorreoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMensajeCorreoInven.add(this.jMenuItemCerrarTipoMensajeCorreoInven);
			
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemNuevoTipoMensajeCorreoInven);
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven);
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven);
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven);		
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemDuplicarTipoMensajeCorreoInven);		
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemCopiarTipoMensajeCorreoInven);		
			this.jmenuAccionesTipoMensajeCorreoInven.add(this.jMenuItemVerFormTipoMensajeCorreoInven);		
			
			this.jmenuDatosTipoMensajeCorreoInven.add(this.jMenuItemRecargarInformacionTipoMensajeCorreoInven);				
			this.jmenuDatosTipoMensajeCorreoInven.add(this.jMenuItemAnterioresTipoMensajeCorreoInven);				
			this.jmenuDatosTipoMensajeCorreoInven.add(this.jMenuItemSiguientesTipoMensajeCorreoInven);				
			this.jmenuDatosTipoMensajeCorreoInven.add(this.jMenuItemAbrirOrderByTipoMensajeCorreoInven);				
			this.jmenuDatosTipoMensajeCorreoInven.add(this.jMenuItemMostrarOcultarTipoMensajeCorreoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMensajeCorreoInven.add(this.jMenuItemGuardarCambiosTipoMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMensajeCorreoInven.add(this.jmenuArchivoTipoMensajeCorreoInven);		
			this.jmenuBarTipoMensajeCorreoInven.add(this.jmenuAccionesTipoMensajeCorreoInven);		
			this.jmenuBarTipoMensajeCorreoInven.add(this.jmenuDatosTipoMensajeCorreoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMensajeCorreoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMensajeCorreoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoMensajeCorreoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMensajeCorreoInven = new TipoMensajeCorreoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Mensaje Correo DATOS");
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven = new TipoMensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven = null;//new TipoMensajeCorreoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMensajeCorreoInven= new GridBagLayout();
		
		
		this.jTableDatosTipoMensajeCorreoInven = new JTableMe();      
		
		String sToolTipTipoMensajeCorreoInven="";
		sToolTipTipoMensajeCorreoInven=TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMensajeCorreoInven+="(Inventario.TipoMensajeCorreoInven)";
		}
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMensajeCorreoInven.setToolTipText(sToolTipTipoMensajeCorreoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMensajeCorreoInven);
		this.jTableDatosTipoMensajeCorreoInven.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMensajeCorreoInven.setRowSelectionAllowed(true);
		this.jTableDatosTipoMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonDuplicarTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonCopiarTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonVerFormTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarTipoMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMensajeCorreoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Mensaje Correo";
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mensaje Correos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoMensajeCorreoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven=new ReporteDinamicoJInternalFrame(TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMensajeCorreoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMensajeCorreoInven=new ImportacionJInternalFrame(TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMensajeCorreoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMensajeCorreoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMensajeCorreoInven.setText("Orden");
		this.jButtonAbrirOrderByTipoMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMensajeCorreoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMensajeCorreoInven,false,this);
			
			//this.cargarOrderByTipoMensajeCorreoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMensajeCorreoInven,true,this);
			
			//this.cargarOrderByTipoMensajeCorreoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMensajeCorreoInven.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMensajeCorreoInven.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMensajeCorreoInven.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoMensajeCorreoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMensajeCorreoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMensajeCorreoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMensajeCorreoInven.setText("Nuevo");
		this.jButtonDuplicarTipoMensajeCorreoInven.setText("Duplicar");
		this.jButtonCopiarTipoMensajeCorreoInven.setText("Copiar");
		this.jButtonVerFormTipoMensajeCorreoInven.setText("Ver");
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarTipoMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMensajeCorreoInven,"nuevo_button","Nuevo",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMensajeCorreoInven,"duplicar_button","Duplicar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMensajeCorreoInven,"copiar_button","Copiar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMensajeCorreoInven,"ver_form","Ver",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMensajeCorreoInven,"cerrar_button","Salir",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMensajeCorreoInven.setToolTipText("Nuevo"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMensajeCorreoInven.setToolTipText("Duplicar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMensajeCorreoInven.setToolTipText("Copiar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMensajeCorreoInven.setToolTipText("Ver"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.setToolTipText("Nuevo Rel"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.setToolTipText("Guardar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMensajeCorreoInven.setToolTipText("Salir"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMensajeCorreoInven";
		inputMap = this.jButtonNuevoTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMensajeCorreoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMensajeCorreoInven";
		inputMap = this.jButtonDuplicarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMensajeCorreoInven"));
		
		//COPIAR
		sMapKey = "CopiarTipoMensajeCorreoInven";
		inputMap = this.jButtonCopiarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMensajeCorreoInven"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMensajeCorreoInven";
		inputMap = this.jButtonVerFormTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMensajeCorreoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMensajeCorreoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMensajeCorreoInven";
		inputMap = this.jButtonModificarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMensajeCorreoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMensajeCorreoInven";
		inputMap = this.jButtonCerrarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMensajeCorreoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMensajeCorreoInven.setName("jPanelParametrosReportesTipoMensajeCorreoInven"); 
		
		this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven.setName("jPanelParametrosReportesAccionesTipoMensajeCorreoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.setText("Recargar");
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.setToolTipText("Recargar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMensajeCorreoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonProcesarInformacionTipoMensajeCorreoInven.setText("Procesar");
		this.jButtonProcesarInformacionTipoMensajeCorreoInven.setToolTipText("Procesar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMensajeCorreoInven.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMensajeCorreoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesTipoMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMensajeCorreoInven = new JButtonMe();
		//this.jButtonAnterioresTipoMensajeCorreoInven.setText("<<");
        this.jButtonAnterioresTipoMensajeCorreoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMensajeCorreoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMensajeCorreoInven = new JButtonMe();
		//this.jButtonSiguientesTipoMensajeCorreoInven.setText(">>");
        this.jButtonSiguientesTipoMensajeCorreoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMensajeCorreoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven,"nuevoguardarcambios_button","Nue",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMensajeCorreoInven";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMensajeCorreoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMensajeCorreoInven";
		inputMap = this.jButtonRecargarInformacionTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMensajeCorreoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMensajeCorreoInven";
		inputMap = this.jButtonSiguientesTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMensajeCorreoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMensajeCorreoInven";
		inputMap = this.jButtonAnterioresTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMensajeCorreoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMensajeCorreoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),TipoMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),TipoMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),TipoMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMensajeCorreoInven = new GridBagLayout();

			this.jPanelPaginacionTipoMensajeCorreoInven.setLayout(gridaBagLayoutPaginacionTipoMensajeCorreoInven);						
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonAnterioresTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
					
						
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
			
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
						
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonSiguientesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonNuevoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
						
			
			
			if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 1;
				this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			}
			
			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonDuplicarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonCopiarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonVerFormTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMensajeCorreoInven.add(this.jButtonCerrarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
		
		
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMensajeCorreoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMensajeCorreoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMensajeCorreoInven.setLayout(gridaBagParametrosReportesTipoMensajeCorreoInven);
			this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven.setLayout(gridaBagParametrosReportesAccionesTipoMensajeCorreoInven);
			
			
			this.jPanelParametrosAuxiliar1TipoMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar1TipoMensajeCorreoInven);
			this.jPanelParametrosAuxiliar2TipoMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2TipoMensajeCorreoInven);
			this.jPanelParametrosAuxiliar3TipoMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar3TipoMensajeCorreoInven);
			this.jPanelParametrosAuxiliar4TipoMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar4TipoMensajeCorreoInven);
			//this.jPanelParametrosAuxiliar5TipoMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2TipoMensajeCorreoInven);			
			
			
			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jButtonRecargarInformacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMensajeCorreoInven.add(this.jComboBoxTiposPaginacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMensajeCorreoInven.add(this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jPanelParametrosAuxiliar1TipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMensajeCorreoInven.add(this.jComboBoxTiposReportesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jPanelParametrosAuxiliar4TipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jComboBoxTiposReportesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jCheckBoxGenerarReporteTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jPanelParametrosAuxiliar2TipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jLabelAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jButtonAbrirOrderByTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
			
			
			/*
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);															
				
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMensajeCorreoInven.add(this.jCheckBoxSeleccionadosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jPanelParametrosAuxiliar3TipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jComboBoxTiposRelacionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
				
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMensajeCorreoInven.add(this.jComboBoxTiposAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMensajeCorreoInven = new GridBagLayout();

			this.jScrollPanelDatosTipoMensajeCorreoInven.setLayout(gridaBagLayoutDatosTipoMensajeCorreoInven);
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
			
			this.jScrollPanelDatosTipoMensajeCorreoInven.add(this.jTableDatosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMensajeCorreoInven.setViewportView(this.jTableDatosTipoMensajeCorreoInven);
		this.jTableDatosTipoMensajeCorreoInven.setFillsViewportHeight(true);
		this.jTableDatosTipoMensajeCorreoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesTipoMensajeCorreoInven.setLayout(gridaBagLayoutAccionesTipoMensajeCorreoInven);
		
		
		/*	
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
			
		this.jPanelAccionesTipoMensajeCorreoInven.add(this.jButtonNuevoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMensajeCorreoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsTipoMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;		
		//this.gridBagConstraintsTipoMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMensajeCorreoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);								
		
		
		/*
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		*/		
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
				
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMensajeCorreoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMensajeCorreoInven.setLayout(gridaBagLayoutBusquedasParametrosTipoMensajeCorreoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
			
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
			
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMensajeCorreoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMensajeCorreoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.setName("jPanelReporteDinamicoTipoMensajeCorreoInven"); 
		
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.setLayout(gridaBagLayoutReporteDinamicoTipoMensajeCorreoInven);
		
		
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mensaje Correos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMensajeCorreoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMensajeCorreoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jLabelColumnasSelectReporteTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMensajeCorreoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMensajeCorreoInven=new JScrollPane(this.jListColumnasSelectReporteTipoMensajeCorreoInven);
			
			this.jScrollColumnasSelectReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jListColumnasSelectReporteTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jScrollColumnasSelectReporteTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMensajeCorreoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMensajeCorreoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMensajeCorreoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMensajeCorreoInven=new JScrollPane(this.jListRelacionesSelectReporteTipoMensajeCorreoInven);
			
			this.jScrollRelacionesSelectReporteTipoMensajeCorreoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMensajeCorreoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMensajeCorreoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoMensajeCorreoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMensajeCorreoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMensajeCorreoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jLabelGenerarExcelReporteDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven.setToolTipText("Generar EXCEL"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jComboBoxTiposReportesDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jLabelTiposArchivoReporteDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven.setToolTipText("Generar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven.setToolTipText("Cancelar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMensajeCorreoInven.add(this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven= new JScrollPane(jPanelReporteDinamicoTipoMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mensaje Correos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMensajeCorreoInven);
		this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMensajeCorreoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMensajeCorreoInven.setName("jPanelImportacionTipoMensajeCorreoInven"); 
		
		this.jPanelImportacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMensajeCorreoInven.setLayout(gridaBagLayoutImportacionTipoMensajeCorreoInven);
		
		
		this.jInternalFrameImportacionTipoMensajeCorreoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMensajeCorreoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionTipoMensajeCorreoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mensaje Correos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMensajeCorreoInven = new JLabelMe();

		this.jLabelArchivoImportacionTipoMensajeCorreoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMensajeCorreoInven.add(this.jLabelArchivoImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMensajeCorreoInven = new JFileChooser();		
		this.jFileChooserImportacionTipoMensajeCorreoInven.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonAbrirImportacionTipoMensajeCorreoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMensajeCorreoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMensajeCorreoInven.setToolTipText("Generar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMensajeCorreoInven.add(this.jButtonAbrirImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMensajeCorreoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMensajeCorreoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMensajeCorreoInven.add(this.jLabelPathArchivoImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMensajeCorreoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMensajeCorreoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMensajeCorreoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMensajeCorreoInven.add(this.jTextFieldPathArchivoImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarImportacionTipoMensajeCorreoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMensajeCorreoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMensajeCorreoInven.setToolTipText("Generar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMensajeCorreoInven.add(this.jButtonGenerarImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarImportacionTipoMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMensajeCorreoInven.setToolTipText("Cancelar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMensajeCorreoInven.add(this.jButtonCerrarImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMensajeCorreoInven= new JScrollPane(jPanelImportacionTipoMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMensajeCorreoInven);
		this.jInternalFrameImportacionTipoMensajeCorreoInven.getContentPane().add(this.jScrollPanelImportacionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMensajeCorreoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMensajeCorreoInven = new JButtonMe();
			this.jButtonAbrirOrderByTipoMensajeCorreoInven.setText("Orden");
			this.jButtonAbrirOrderByTipoMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMensajeCorreoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMensajeCorreoInven";
			inputMap = this.jButtonAbrirOrderByTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMensajeCorreoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMensajeCorreoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMensajeCorreoInven.setName("jPanelOrderByTipoMensajeCorreoInven"); 
			
			this.jPanelOrderByTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMensajeCorreoInven.setLayout(gridaBagLayoutOrderByTipoMensajeCorreoInven);
			
			
			this.jTableDatosTipoMensajeCorreoInvenOrderBy = new JTableMe();        
			this.jTableDatosTipoMensajeCorreoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMensajeCorreoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMensajeCorreoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMensajeCorreoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMensajeCorreoInvenOrderBy.setViewportView(this.jTableDatosTipoMensajeCorreoInvenOrderBy);
			this.jTableDatosTipoMensajeCorreoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMensajeCorreoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMensajeCorreoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMensajeCorreoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMensajeCorreoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMensajeCorreoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setTitle("Orden");
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setResizable(true);
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setClosable(true);
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mensaje Correos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMensajeCorreoInven.ipady =150;
				
			this.jPanelOrderByTipoMensajeCorreoInven.add(jScrollPanelDatosTipoMensajeCorreoInvenOrderBy, this.gridBagConstraintsTipoMensajeCorreoInven);//this.jTableDatosTipoMensajeCorreoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMensajeCorreoInven = new JButtonMe();
			this.jButtonCerrarOrderByTipoMensajeCorreoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMensajeCorreoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMensajeCorreoInven.setToolTipText("Cancelar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMensajeCorreoInven.add(this.jButtonCerrarOrderByTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMensajeCorreoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMensajeCorreoInven= new JScrollPane(jPanelOrderByTipoMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMensajeCorreoInven);
			
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getContentPane().add(this.jScrollPanelOrderByTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
		
		} else {
			this.jButtonAbrirOrderByTipoMensajeCorreoInven = new JButtonMe();
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
			&& this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMensajeCorreoInven.getRowHeight();//TipoMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.isSelected()) {
					iHeightTable=TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMensajeCorreoInven.isSelected()) {
					iHeightTable=TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMensajeCorreoInven!=null && this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMensajeCorreoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomensajecorreoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMensajeCorreoInven> TraerTipoMensajeCorreoInvenBeans(List<TipoMensajeCorreoInven> tipomensajecorreoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMensajeCorreoInven tipomensajecorreoinven:tipomensajecorreoinvens) {
					
				if(!(TipoMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomensajecorreoinven.setsDetalleGeneralEntityReporte(TipoMensajeCorreoInvenConstantesFunciones.getTipoMensajeCorreoInvenDescripcion(tipomensajecorreoinven));
										
						
					
						
					
				} else  {
							
					//tipomensajecorreoinven.setsDetalleGeneralEntityReporte(tipomensajecorreoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomensajecorreoinvenbeans.add(tipomensajecorreoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomensajecorreoinvens;
    }
	//PARA REPORTES FIN
}
