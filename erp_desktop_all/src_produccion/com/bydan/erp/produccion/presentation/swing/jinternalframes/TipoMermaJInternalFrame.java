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
import com.bydan.erp.produccion.util.TipoMermaConstantesFunciones;

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
public class TipoMermaJInternalFrame extends TipoMermaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMerma;
	
	protected JMenuBar jmenuBarTipoMerma;
	
	protected JMenu jmenuTipoMerma;
	protected JMenu jmenuDatosTipoMerma;
	protected JMenu jmenuArchivoTipoMerma;
	protected JMenu jmenuAccionesTipoMerma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMerma;	
	protected GridBagConstraints gridBagConstraintsTipoMerma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMermaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMerma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMerma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMerma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoMermaSessionBean tipomermaSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMerma> tipomermas;		
	public List<TipoMerma> tipomermasEliminados;	
	public List<TipoMerma> tipomermasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMerma;		
	protected JButton jButtonAbrirOrderByTipoMerma;
	
	
	//protected JPanel jPanelOrderByTipoMerma;
	//public JScrollPane jScrollPanelOrderByTipoMerma;	
	//protected JButton jButtonCerrarOrderByTipoMerma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMermaLogic tipomermaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMerma;
	public JScrollPane jScrollPanelDatosEdicionTipoMerma;
	public JScrollPane jScrollPanelDatosGeneralTipoMerma;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMermaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMerma;
	//public JScrollPane jScrollPanelImportacionTipoMerma;
	
	
	
	protected JPanel jPanelAccionesTipoMerma;
	
    protected JPanel jPanelPaginacionTipoMerma;
    protected JPanel jPanelParametrosReportesTipoMerma;
	protected JPanel jPanelParametrosReportesAccionesTipoMerma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMerma;
	protected JPanel jPanelParametrosAuxiliar2TipoMerma;
	protected JPanel jPanelParametrosAuxiliar3TipoMerma;
	protected JPanel jPanelParametrosAuxiliar4TipoMerma;
	//protected JPanel jPanelParametrosAuxiliar5TipoMerma;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMerma;
	//protected JPanel jPanelImportacionTipoMerma;
	
	
	public JTable jTableDatosTipoMerma;
	
	
	
	//public JTable jTableDatosTipoMermaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMerma;
	protected JButton jButtonDuplicarTipoMerma;
	protected JButton jButtonCopiarTipoMerma;
	protected JButton jButtonVerFormTipoMerma;
	protected JButton jButtonNuevoRelacionesTipoMerma;
	protected JButton jButtonModificarTipoMerma;
	
    protected JButton jButtonGuardarCambiosTablaTipoMerma;
	protected JButton jButtonCerrarTipoMerma;
	
	
	protected JButton jButtonRecargarInformacionTipoMerma;
	protected JButton jButtonProcesarInformacionTipoMerma;
	
	
	protected JButton jButtonAnterioresTipoMerma;
	protected JButton jButtonSiguientesTipoMerma;
	protected JButton jButtonNuevoGuardarCambiosTipoMerma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMerma;
	//protected JButton jButtonCerrarReporteDinamicoTipoMerma;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMerma;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMerma;
	//protected JButton jButtonGenerarImportacionTipoMerma;
	//protected JButton jButtonCerrarImportacionTipoMerma;
	//protected JFileChooser jFileChooserImportacionTipoMerma;
	//protected File fileImportacionTipoMerma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMerma;
	protected JButton jButtonDuplicarToolBarTipoMerma;
	protected JButton jButtonNuevoRelacionesToolBarTipoMerma;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMerma;
	protected JButton jButtonCopiarToolBarTipoMerma;
	protected JButton jButtonVerFormToolBarTipoMerma;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMerma;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMerma;
	protected JButton jButtonCerrarToolBarTipoMerma;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMerma;
	protected JButton jButtonProcesarInformacionToolBarTipoMerma;
	protected JButton jButtonAnterioresToolBarTipoMerma;
	protected JButton jButtonSiguientesToolBarTipoMerma;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMerma;
	protected JButton jButtonAbrirOrderByToolBarTipoMerma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMerma;
	protected JMenuItem jMenuItemDuplicarTipoMerma;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMerma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMerma;
	protected JMenuItem jMenuItemCopiarTipoMerma;
	protected JMenuItem jMenuItemVerFormTipoMerma;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMerma;
	protected JMenuItem jMenuItemCerrarTipoMerma;
	protected JMenuItem jMenuItemDetalleCerrarTipoMerma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMerma;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMerma;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMerma;
	protected JMenuItem jMenuItemProcesarInformacionTipoMerma;
	protected JMenuItem jMenuItemAnterioresTipoMerma;
	protected JMenuItem jMenuItemSiguientesTipoMerma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMerma;
	protected JMenuItem jMenuItemAbrirOrderByTipoMerma;
	protected JMenuItem jMenuItemMostrarOcultarTipoMerma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMerma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMerma;
	protected JCheckBox jCheckBoxSeleccionadosTipoMerma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMerma;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMerma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMerma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMerma;
	protected JTextField jTextFieldValorCampoGeneralTipoMerma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMerma;
	//public JList<Reporte> jListColumnasSelectReporteTipoMerma;
	//public JScrollPane jScrollColumnasSelectReporteTipoMerma;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMerma;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMerma;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMerma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMerma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMerma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMerma;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMerma;
	
		
	//public JLabel jLabelArchivoImportacionTipoMerma;	
	//public JLabel jLabelPathArchivoImportacionTipoMerma;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMerma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMerma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMerma;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMerma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMerma;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMerma;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMerma;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMerma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMerma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMerma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMerma;
	public JPanel jPanelFK_IdPaisTipoMerma;
	public JButton jButtonFK_IdPaisTipoMerma;
	
	public JPanel jPanelid_paisFK_IdPaisTipoMerma;
	public JLabel jLabelid_paisFK_IdPaisTipoMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoMerma;
	public JButton jButtonid_paisFK_IdPaisTipoMerma= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoMermaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoMermaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoMermaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMerma)	{
		this.jButtonRecargarInformacionTipoMerma = jButtonRecargarInformacionTipoMerma;
	}
	
	public JButton getjButtonProcesarInformacionTipoMerma() {
		return this.jButtonProcesarInformacionTipoMerma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMerma)	{
		this.jButtonProcesarInformacionTipoMerma = jButtonProcesarInformacionTipoMerma;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMerma() {
		return this.jButtonRecargarInformacionTipoMerma;
	}
	
	
	public List<TipoMerma> gettipomermas() {
		return this.tipomermas;
	}

	public void settipomermas(List<TipoMerma> tipomermas) {
		this.tipomermas = tipomermas;
	}
	
	public List<TipoMerma> gettipomermasAux() {
		return this.tipomermasAux;
	}

	public void settipomermasAux(List<TipoMerma> tipomermasAux) {
		this.tipomermasAux = tipomermasAux;
	}
	
	public List<TipoMerma> gettipomermasEliminados() {
		return this.tipomermasEliminados;
	}

	public void setTipoMermasEliminados(List<TipoMerma> tipomermasEliminados) {
		this.tipomermasEliminados = tipomermasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMerma() {
		return jComboBoxTiposSeleccionarTipoMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMerma(
			JComboBox jComboBoxTiposSeleccionarTipoMerma) {
		this.jComboBoxTiposSeleccionarTipoMerma = jComboBoxTiposSeleccionarTipoMerma;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMerma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMerma() {
		return jTextFieldValorCampoGeneralTipoMerma;
	}

	public void setjTextFieldValorCampoGeneralTipoMerma(
			JTextField jTextFieldValorCampoGeneralTipoMerma) {
		this.jTextFieldValorCampoGeneralTipoMerma = jTextFieldValorCampoGeneralTipoMerma;
	}

	public void setBorderResaltarValorCampoGeneralTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMerma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMerma() {
		return this.jCheckBoxSeleccionarTodosTipoMerma;
	}

	public void setjCheckBoxSeleccionarTodosTipoMerma(
			JCheckBox jCheckBoxSeleccionarTodosTipoMerma) {
		this.jCheckBoxSeleccionarTodosTipoMerma = jCheckBoxSeleccionarTodosTipoMerma;
	}

	public void setBorderResaltarSeleccionarTodosTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMerma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMerma() {
		return this.jCheckBoxSeleccionadosTipoMerma;
	}

	public void setjCheckBoxSeleccionadosTipoMerma(
			JCheckBox jCheckBoxSeleccionadosTipoMerma) {
		this.jCheckBoxSeleccionadosTipoMerma = jCheckBoxSeleccionadosTipoMerma;
	}
	
	public void setBorderResaltarSeleccionadosTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMerma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMerma() {
		return this.jComboBoxTiposArchivosReportesTipoMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMerma(
			JComboBox jComboBoxTiposArchivosReportesTipoMerma) {
		this.jComboBoxTiposArchivosReportesTipoMerma = jComboBoxTiposArchivosReportesTipoMerma;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMerma() {
		return this.jComboBoxTiposReportesTipoMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMerma(
			JComboBox jComboBoxTiposReportesTipoMerma) {
		this.jComboBoxTiposReportesTipoMerma = jComboBoxTiposReportesTipoMerma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMerma() {
	//	return jComboBoxTiposReportesDinamicoTipoMerma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMerma(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMerma) {
	//	this.jComboBoxTiposReportesDinamicoTipoMerma = jComboBoxTiposReportesDinamicoTipoMerma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMerma() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMerma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMerma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMerma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMerma = jComboBoxTiposArchivosReportesDinamicoTipoMerma;
	//}
	
	public void setBorderResaltarTiposReportesTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMerma() {
		return this.jComboBoxTiposGraficosReportesTipoMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMerma(
			JComboBox jComboBoxTiposGraficosReportesTipoMerma) {
		this.jComboBoxTiposGraficosReportesTipoMerma = jComboBoxTiposGraficosReportesTipoMerma;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMerma() {
		return this.jComboBoxTiposPaginacionTipoMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMerma(
			JComboBox jComboBoxTiposPaginacionTipoMerma) {
		this.jComboBoxTiposPaginacionTipoMerma = jComboBoxTiposPaginacionTipoMerma;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMerma() {
		return this.jComboBoxTiposRelacionesTipoMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMerma() {
		return this.jComboBoxTiposAccionesTipoMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMerma(
			JComboBox jComboBoxTiposRelacionesTipoMerma) {
		this.jComboBoxTiposRelacionesTipoMerma = jComboBoxTiposRelacionesTipoMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMerma(
			JComboBox jComboBoxTiposAccionesTipoMerma) {
		this.jComboBoxTiposAccionesTipoMerma = jComboBoxTiposAccionesTipoMerma;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMerma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMerma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMerma() {
	//	return jCheckBoxConGraficoDinamicoTipoMerma;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMerma(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMerma) {
	//	this.jCheckBoxConGraficoDinamicoTipoMerma = jCheckBoxConGraficoDinamicoTipoMerma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMerma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMerma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMerma .setBorder(borderResaltar);		
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
		this.tipomermaSessionBean=new TipoMermaSessionBean();
		
		this.tipomermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomermaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMermaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMermaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMermaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Merma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMerma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"nuevo","nuevo","Nuevo"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"duplicar","duplicar","Duplicar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"copiar","copiar","Copiar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"ver_form","ver_form","Ver"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"recargar","recargar","Recargar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMerma,this.jTtoolBarTipoMerma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMerma,this.jTtoolBarTipoMerma,
							"cerrar","cerrar","Salir"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMerma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMerma;
			
				this.jButtonProcesarInformacionToolBarTipoMerma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMerma;
				
		//protected JButton jButtonModificarToolBarTipoMerma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMerma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMerma=new JMenuMe("General");
		this.jmenuArchivoTipoMerma=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMerma=new JMenuMe("Acciones");
		this.jmenuDatosTipoMerma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMerma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMerma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMerma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMerma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMerma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMerma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMerma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMerma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMerma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMerma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMerma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMerma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMerma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMerma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMerma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMerma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMerma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMerma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMerma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMerma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMerma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMerma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMerma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMerma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMerma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMerma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMerma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMerma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMerma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMerma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMerma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMerma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMerma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMerma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMerma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMerma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMerma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMerma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMerma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMerma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMerma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMerma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMerma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMerma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMerma.add(this.jMenuItemCerrarTipoMerma);
			
			this.jmenuAccionesTipoMerma.add(this.jMenuItemNuevoTipoMerma);
			this.jmenuAccionesTipoMerma.add(this.jMenuItemNuevoGuardarCambiosTipoMerma);
			this.jmenuAccionesTipoMerma.add(this.jMenuItemNuevoRelacionesTipoMerma);
			this.jmenuAccionesTipoMerma.add(this.jMenuItemGuardarCambiosTablaTipoMerma);		
			this.jmenuAccionesTipoMerma.add(this.jMenuItemDuplicarTipoMerma);		
			this.jmenuAccionesTipoMerma.add(this.jMenuItemCopiarTipoMerma);		
			this.jmenuAccionesTipoMerma.add(this.jMenuItemVerFormTipoMerma);		
			
			this.jmenuDatosTipoMerma.add(this.jMenuItemRecargarInformacionTipoMerma);				
			this.jmenuDatosTipoMerma.add(this.jMenuItemAnterioresTipoMerma);				
			this.jmenuDatosTipoMerma.add(this.jMenuItemSiguientesTipoMerma);				
			this.jmenuDatosTipoMerma.add(this.jMenuItemAbrirOrderByTipoMerma);				
			this.jmenuDatosTipoMerma.add(this.jMenuItemMostrarOcultarTipoMerma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMerma.add(this.jMenuItemGuardarCambiosTipoMerma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMerma.add(this.jmenuArchivoTipoMerma);		
			this.jmenuBarTipoMerma.add(this.jmenuAccionesTipoMerma);		
			this.jmenuBarTipoMerma.add(this.jmenuDatosTipoMerma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMerma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMerma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoMerma.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoMerma= new JButtonMe();
		this.jButtonFK_IdPaisTipoMerma.setText("Buscar");
		this.jButtonFK_IdPaisTipoMerma.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoMerma,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoMerma = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoMerma.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoMerma.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoMerma= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoMerma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoMerma=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMerma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMerma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMerma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMerma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMerma = new TipoMermaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Merma DATOS");
			this.jInternalFrameDetalleFormTipoMerma = new TipoMermaDetalleFormJInternalFrame(jDesktopPane,this.tipomermaSessionBean.getConGuardarRelaciones(),this.tipomermaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMerma = null;//new TipoMermaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMerma= new GridBagLayout();
		
		
		this.jTableDatosTipoMerma = new JTableMe();      
		
		String sToolTipTipoMerma="";
		sToolTipTipoMerma=TipoMermaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMerma+="(Produccion.TipoMerma)";
		}
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMerma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMerma.setToolTipText(sToolTipTipoMerma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMerma);
		this.jTableDatosTipoMerma.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMerma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMerma.setRowSelectionAllowed(true);
		this.jTableDatosTipoMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMerma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMerma = new JButtonMe();
		this.jButtonDuplicarTipoMerma = new JButtonMe();
		this.jButtonCopiarTipoMerma = new JButtonMe();
		this.jButtonVerFormTipoMerma = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMerma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMerma = new JButtonMe();
		this.jButtonCerrarTipoMerma = new JButtonMe();
		
		this.jScrollPanelDatosTipoMerma = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMerma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Merma";
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mermas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMerma.setToolTipText("Acciones");
        this.jPanelAccionesTipoMerma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMerma=new ReporteDinamicoJInternalFrame(TipoMermaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMerma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMerma=new ImportacionJInternalFrame(TipoMermaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMerma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMerma = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMerma.setText("Orden");
		this.jButtonAbrirOrderByTipoMerma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMerma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMerma,false,this);
			
			//this.cargarOrderByTipoMerma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMerma,true,this);
			
			//this.cargarOrderByTipoMerma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMerma.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoMerma.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoMerma.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoMerma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMerma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMerma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMerma.setText("Nuevo");
		this.jButtonDuplicarTipoMerma.setText("Duplicar");
		this.jButtonCopiarTipoMerma.setText("Copiar");
		this.jButtonVerFormTipoMerma.setText("Ver");
		this.jButtonNuevoRelacionesTipoMerma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMerma.setText("Guardar");
		this.jButtonCerrarTipoMerma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMerma,"nuevo_button","Nuevo",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMerma,"duplicar_button","Duplicar",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMerma,"copiar_button","Copiar",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMerma,"ver_form","Ver",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMerma,"nuevorelaciones_button","Nuevo Rel",this.tipomermaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMerma,"guardarcambiostabla_button","Guardar",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMerma,"cerrar_button","Salir",this.tipomermaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMerma.setToolTipText("Nuevo"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMerma.setToolTipText("Duplicar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMerma.setToolTipText("Copiar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMerma.setToolTipText("Ver"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMerma.setToolTipText("Nuevo Rel"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMerma.setToolTipText("Guardar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMerma.setToolTipText("Salir"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMerma";
		inputMap = this.jButtonNuevoTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMerma"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMerma";
		inputMap = this.jButtonDuplicarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMerma"));
		
		//COPIAR
		sMapKey = "CopiarTipoMerma";
		inputMap = this.jButtonCopiarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMerma"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMerma";
		inputMap = this.jButtonVerFormTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMerma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMerma";
		inputMap = this.jButtonNuevoRelacionesTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMerma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMerma";
		inputMap = this.jButtonModificarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMerma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMerma";
		inputMap = this.jButtonCerrarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMerma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMerma";
		inputMap = this.jButtonGuardarCambiosTablaTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMerma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMerma.setName("jPanelParametrosReportesTipoMerma"); 
		
		this.jPanelParametrosReportesAccionesTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMerma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMerma.setName("jPanelParametrosReportesAccionesTipoMerma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMerma = new JButtonMe();
		this.jButtonRecargarInformacionTipoMerma.setText("Recargar");
		this.jButtonRecargarInformacionTipoMerma.setToolTipText("Recargar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMerma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMerma = new JButtonMe();
		this.jButtonProcesarInformacionTipoMerma.setText("Procesar");
		this.jButtonProcesarInformacionTipoMerma.setToolTipText("Procesar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMerma.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMerma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMerma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMerma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMerma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMerma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMerma.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMerma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMerma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMerma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMerma.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMerma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMerma.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMerma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMerma.setText("Accion");
		this.jComboBoxTiposAccionesTipoMerma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMerma.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMerma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMerma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMerma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMerma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMerma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMerma = new JLabelMe();
		
		this.jLabelAccionesTipoMerma.setText("Acciones");		
		this.jLabelAccionesTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMerma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMerma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMerma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMerma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMerma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMerma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMerma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMerma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMerma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMerma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMerma.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMerma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMerma = new JButtonMe();
		//this.jButtonAnterioresTipoMerma.setText("<<");
        this.jButtonAnterioresTipoMerma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMerma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMerma = new JButtonMe();
		//this.jButtonSiguientesTipoMerma.setText(">>");
        this.jButtonSiguientesTipoMerma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMerma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMerma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMerma.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMerma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMerma,"nuevoguardarcambios_button","Nue",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMerma";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMerma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMerma";
		inputMap = this.jButtonRecargarInformacionTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMerma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMerma";
		inputMap = this.jButtonSiguientesTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMerma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMerma";
		inputMap = this.jButtonAnterioresTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMerma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMerma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMerma.setMinimumSize(new Dimension(this.getWidth(),TipoMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMermaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMerma.setMaximumSize(new Dimension(this.getWidth(),TipoMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMermaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMerma.setPreferredSize(new Dimension(this.getWidth(),TipoMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMermaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMerma = new GridBagLayout();

			this.jPanelPaginacionTipoMerma.setLayout(gridaBagLayoutPaginacionTipoMerma);						
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 0;
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMerma.add(this.jButtonAnterioresTipoMerma, this.gridBagConstraintsTipoMerma);
					
						
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMerma.gridy = 0;
			
			this.jPanelPaginacionTipoMerma.add(this.jButtonNuevoGuardarCambiosTipoMerma, this.gridBagConstraintsTipoMerma);
						
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMerma.gridy = 0;
			this.jPanelPaginacionTipoMerma.add(this.jButtonSiguientesTipoMerma, this.gridBagConstraintsTipoMerma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 1;
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMerma.add(this.jButtonNuevoTipoMerma, this.gridBagConstraintsTipoMerma);
						
			
			
			if(!this.tipomermaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMerma = new GridBagConstraints();
				this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMerma.gridy = 1;
				this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMerma.add(this.jButtonGuardarCambiosTablaTipoMerma, this.gridBagConstraintsTipoMerma);
			}
			
			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 1;
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMerma.add(this.jButtonDuplicarTipoMerma, this.gridBagConstraintsTipoMerma);
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 1;
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMerma.add(this.jButtonCopiarTipoMerma, this.gridBagConstraintsTipoMerma);
		
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 1;
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMerma.add(this.jButtonVerFormTipoMerma, this.gridBagConstraintsTipoMerma);
		
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 1;
			this.gridBagConstraintsTipoMerma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMerma.add(this.jButtonCerrarTipoMerma, this.gridBagConstraintsTipoMerma);
		
		
		
		this.jButtonRecargarInformacionTipoMerma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMerma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMerma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMerma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMerma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMerma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMerma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMerma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMerma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMerma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMerma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMerma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMerma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMerma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMerma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMerma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMerma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMerma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMerma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMerma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMerma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMerma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMerma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMerma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMerma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMerma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMerma.setLayout(gridaBagParametrosReportesTipoMerma);
			this.jPanelParametrosReportesAccionesTipoMerma.setLayout(gridaBagParametrosReportesAccionesTipoMerma);
			
			
			this.jPanelParametrosAuxiliar1TipoMerma.setLayout(gridaBagParametrosAuxiliar1TipoMerma);
			this.jPanelParametrosAuxiliar2TipoMerma.setLayout(gridaBagParametrosAuxiliar2TipoMerma);
			this.jPanelParametrosAuxiliar3TipoMerma.setLayout(gridaBagParametrosAuxiliar3TipoMerma);
			this.jPanelParametrosAuxiliar4TipoMerma.setLayout(gridaBagParametrosAuxiliar4TipoMerma);
			//this.jPanelParametrosAuxiliar5TipoMerma.setLayout(gridaBagParametrosAuxiliar2TipoMerma);			
			
			
			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMerma.add(this.jButtonRecargarInformacionTipoMerma, this.gridBagConstraintsTipoMerma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMerma.add(this.jComboBoxTiposPaginacionTipoMerma, this.gridBagConstraintsTipoMerma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMerma.add(this.jCheckBoxConAltoMaximoTablaTipoMerma, this.gridBagConstraintsTipoMerma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMerma.add(this.jComboBoxTiposArchivosReportesTipoMerma, this.gridBagConstraintsTipoMerma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMerma.add(this.jPanelParametrosAuxiliar1TipoMerma, this.gridBagConstraintsTipoMerma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMerma.add(this.jComboBoxTiposReportesTipoMerma, this.gridBagConstraintsTipoMerma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMerma.add(this.jPanelParametrosAuxiliar4TipoMerma, this.gridBagConstraintsTipoMerma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMerma.add(this.jComboBoxTiposReportesTipoMerma, this.gridBagConstraintsTipoMerma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMerma.add(this.jCheckBoxGenerarReporteTipoMerma, this.gridBagConstraintsTipoMerma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMerma.add(this.jPanelParametrosAuxiliar2TipoMerma, this.gridBagConstraintsTipoMerma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMerma.add(this.jLabelAccionesTipoMerma, this.gridBagConstraintsTipoMerma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMerma = new GridBagConstraints();
				this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMerma.add(this.jButtonAbrirOrderByTipoMerma, this.gridBagConstraintsTipoMerma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMerma.add(this.jComboBoxTiposSeleccionarTipoMerma, this.gridBagConstraintsTipoMerma);			
			
			
			/*
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMerma.add(this.jCheckBoxSeleccionarTodosTipoMerma, this.gridBagConstraintsTipoMerma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMerma.add(this.jCheckBoxSeleccionarTodosTipoMerma, this.gridBagConstraintsTipoMerma);															
				
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMerma.add(this.jCheckBoxSeleccionadosTipoMerma, this.gridBagConstraintsTipoMerma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMerma.add(this.jPanelParametrosAuxiliar3TipoMerma, this.gridBagConstraintsTipoMerma);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMerma.add(this.jComboBoxTiposAccionesTipoMerma, this.gridBagConstraintsTipoMerma);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMerma = new GridBagLayout();

			this.jScrollPanelDatosTipoMerma.setLayout(gridaBagLayoutDatosTipoMerma);
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = 0;
			this.gridBagConstraintsTipoMerma.gridx = 0;
			
			this.jScrollPanelDatosTipoMerma.add(this.jTableDatosTipoMerma, this.gridBagConstraintsTipoMerma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMerma.setViewportView(this.jTableDatosTipoMerma);
		this.jTableDatosTipoMerma.setFillsViewportHeight(true);
		this.jTableDatosTipoMerma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMerma= new GridBagLayout();
		this.jPanelAccionesTipoMerma.setLayout(gridaBagLayoutAccionesTipoMerma);
		
		
		/*	
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx = 0;
			
		this.jPanelAccionesTipoMerma.add(this.jButtonNuevoTipoMerma, this.gridBagConstraintsTipoMerma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoMerma= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoMerma.setLayout(gridaBagLayoutFK_IdPaisTipoMerma);

		gridBagConstraintsTipoMerma = new GridBagConstraints();
		gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMerma.gridy = 0;
		gridBagConstraintsTipoMerma.gridx = 0;
		jPanelFK_IdPaisTipoMerma.add(jLabelid_paisFK_IdPaisTipoMerma, gridBagConstraintsTipoMerma);

		gridBagConstraintsTipoMerma = new GridBagConstraints();
		gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMerma.gridy = 0;
		gridBagConstraintsTipoMerma.gridx = 1;
		jPanelFK_IdPaisTipoMerma.add(jComboBoxid_paisFK_IdPaisTipoMerma, gridBagConstraintsTipoMerma);

		gridBagConstraintsTipoMerma = new GridBagConstraints();
		gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMerma.gridy = 1;
		gridBagConstraintsTipoMerma.gridx =1;
		jPanelFK_IdPaisTipoMerma.add(jButtonFK_IdPaisTipoMerma, gridBagConstraintsTipoMerma);

		jTabbedPaneBusquedasTipoMerma.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoMerma);
		jTabbedPaneBusquedasTipoMerma.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMerma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMerma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();						
			this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMerma.gridx = 0;		
			//this.gridBagConstraintsTipoMerma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMerma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMerma, this.gridBagConstraintsTipoMerma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMerma.gridx = 0;		
		//this.gridBagConstraintsTipoMerma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMerma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMerma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMerma.gridx = 0;		
			this.gridBagConstraintsTipoMerma.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoMerma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoMerma, this.gridBagConstraintsTipoMerma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMerma, this.gridBagConstraintsTipoMerma);								
		
		
		/*
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMerma, this.gridBagConstraintsTipoMerma);
		*/		
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMerma.gridx =0;
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMerma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMerma, this.gridBagConstraintsTipoMerma);
				
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMerma, this.gridBagConstraintsTipoMerma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMerma = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMerma.setLayout(gridaBagLayoutBusquedasParametrosTipoMerma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMerma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMerma, this.gridBagConstraintsTipoMerma);
			
			
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMerma, this.gridBagConstraintsTipoMerma);
		
			
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMerma, this.gridBagConstraintsTipoMerma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMerma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMerma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMerma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMerma.setName("jPanelReporteDinamicoTipoMerma"); 
		
		this.jPanelReporteDinamicoTipoMerma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMerma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMerma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMerma.setLayout(gridaBagLayoutReporteDinamicoTipoMerma);
		
		
		this.jInternalFrameReporteDinamicoTipoMerma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMerma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMerma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMerma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMerma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMerma.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMerma.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMerma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMerma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMerma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMerma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mermas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMerma = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMerma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMerma.add(this.jLabelColumnasSelectReporteTipoMerma, this.gridBagConstraintsTipoMerma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMerma = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMerma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMerma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMerma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMerma=new JScrollPane(this.jListColumnasSelectReporteTipoMerma);
			
			this.jScrollColumnasSelectReporteTipoMerma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMerma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMerma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMerma.add(this.jListColumnasSelectReporteTipoMerma, this.gridBagConstraintsTipoMerma);
		this.jPanelReporteDinamicoTipoMerma.add(this.jScrollColumnasSelectReporteTipoMerma, this.gridBagConstraintsTipoMerma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMerma = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMerma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMerma = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMerma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMerma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMerma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMerma=new JScrollPane(this.jListRelacionesSelectReporteTipoMerma);
			
			this.jScrollRelacionesSelectReporteTipoMerma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMerma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMerma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoMerma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMerma = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMerma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMerma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMerma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMerma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMerma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMerma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMerma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMerma.add(this.jLabelGenerarExcelReporteDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMerma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMerma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMerma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMerma.setToolTipText("Generar EXCEL"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		//this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMerma.add(this.jButtonGenerarExcelReporteDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMerma.add(this.jComboBoxTiposReportesDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMerma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMerma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMerma.add(this.jLabelTiposArchivoReporteDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMerma.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMerma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMerma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMerma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMerma.setToolTipText("Generar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMerma.add(this.jButtonGenerarReporteDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMerma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMerma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMerma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMerma.setToolTipText("Cancelar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMerma.add(this.jButtonCerrarReporteDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMerma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMerma= new JScrollPane(jPanelReporteDinamicoTipoMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMerma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMerma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMerma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mermas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMerma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMerma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMerma);
		this.jInternalFrameReporteDinamicoTipoMerma.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMerma, this.gridBagConstraintsTipoMerma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMerma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMerma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMerma.setName("jPanelImportacionTipoMerma"); 
		
		this.jPanelImportacionTipoMerma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMerma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMerma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMerma.setLayout(gridaBagLayoutImportacionTipoMerma);
		
		
		this.jInternalFrameImportacionTipoMerma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMerma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMerma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMerma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMerma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMerma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMerma.setResizable(true);
	    this.jInternalFrameImportacionTipoMerma.setClosable(true);
	    this.jInternalFrameImportacionTipoMerma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMerma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMerma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMerma.setResizable(true);
	    this.jInternalFrameImportacionTipoMerma.setClosable(true);
	    this.jInternalFrameImportacionTipoMerma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMerma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMerma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMerma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mermas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMerma = new JLabelMe();

		this.jLabelArchivoImportacionTipoMerma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMerma.add(this.jLabelArchivoImportacionTipoMerma, this.gridBagConstraintsTipoMerma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMerma = new JFileChooser();		
		this.jFileChooserImportacionTipoMerma.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMerma = new JButtonMe();
		this.jButtonAbrirImportacionTipoMerma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMerma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMerma.setToolTipText("Generar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMerma.add(this.jButtonAbrirImportacionTipoMerma, this.gridBagConstraintsTipoMerma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMerma = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMerma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMerma.add(this.jLabelPathArchivoImportacionTipoMerma, this.gridBagConstraintsTipoMerma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMerma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMerma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMerma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMerma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMerma.add(this.jTextFieldPathArchivoImportacionTipoMerma, this.gridBagConstraintsTipoMerma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMerma = new JButtonMe();
		this.jButtonGenerarImportacionTipoMerma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMerma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMerma.setToolTipText("Generar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMerma.add(this.jButtonGenerarImportacionTipoMerma, this.gridBagConstraintsTipoMerma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMerma = new JButtonMe();
		this.jButtonCerrarImportacionTipoMerma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMerma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMerma.setToolTipText("Cancelar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMerma.add(this.jButtonCerrarImportacionTipoMerma, this.gridBagConstraintsTipoMerma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMerma = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMerma= new JScrollPane(jPanelImportacionTipoMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMerma.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMerma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMerma);
		this.jInternalFrameImportacionTipoMerma.getContentPane().add(this.jScrollPanelImportacionTipoMerma, this.gridBagConstraintsTipoMerma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMerma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMerma = new JButtonMe();
			this.jButtonAbrirOrderByTipoMerma.setText("Orden");
			this.jButtonAbrirOrderByTipoMerma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMerma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMerma";
			inputMap = this.jButtonAbrirOrderByTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMerma"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMerma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMerma.setName("jPanelOrderByTipoMerma"); 
			
			this.jPanelOrderByTipoMerma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMerma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMerma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMerma.setLayout(gridaBagLayoutOrderByTipoMerma);
			
			
			this.jTableDatosTipoMermaOrderBy = new JTableMe();        
			this.jTableDatosTipoMermaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMermaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMermaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMermaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMermaOrderBy.setViewportView(this.jTableDatosTipoMermaOrderBy);
			this.jTableDatosTipoMermaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMermaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMerma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMerma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMerma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMerma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMerma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMerma.setTitle("Orden");
			this.jInternalFrameOrderByTipoMerma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMerma.setResizable(true);
			this.jInternalFrameOrderByTipoMerma.setClosable(true);
			this.jInternalFrameOrderByTipoMerma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMerma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMerma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMerma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mermas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMerma.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMerma.ipady =150;
				
			this.jPanelOrderByTipoMerma.add(jScrollPanelDatosTipoMermaOrderBy, this.gridBagConstraintsTipoMerma);//this.jTableDatosTipoMermaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMerma = new JButtonMe();
			this.jButtonCerrarOrderByTipoMerma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMerma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMerma.setToolTipText("Cancelar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMerma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMerma.add(this.jButtonCerrarOrderByTipoMerma, this.gridBagConstraintsTipoMerma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMerma = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMerma= new JScrollPane(jPanelOrderByTipoMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMerma.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMerma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMerma);
			
			this.jInternalFrameOrderByTipoMerma.getContentPane().add(this.jScrollPanelOrderByTipoMerma, this.gridBagConstraintsTipoMerma);			
		
		} else {
			this.jButtonAbrirOrderByTipoMerma = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipomermaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMerma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMerma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMerma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMerma.getRowHeight();//TipoMermaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMerma.isSelected()) {
					iHeightTable=TipoMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMerma.isSelected()) {
					iHeightTable=TipoMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMerma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMerma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMerma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMerma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMerma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMerma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMerma!=null && this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMerma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMerma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMerma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMerma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMerma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMerma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomermaLogic.getTipoMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomermas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMerma> TraerTipoMermaBeans(List<TipoMerma> tipomermas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMerma tipomerma:tipomermas) {
					
				if(!(TipoMermaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMermaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomerma.setsDetalleGeneralEntityReporte(TipoMermaConstantesFunciones.getTipoMermaDescripcion(tipomerma));
										
						
					
						
					
				} else  {
							
					//tipomerma.setsDetalleGeneralEntityReporte(tipomerma.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomermabeans.add(tipomermabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomermas;
    }
	//PARA REPORTES FIN
}
