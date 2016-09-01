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
import com.bydan.erp.produccion.util.TipoGastoProduConstantesFunciones;

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
public class TipoGastoProduJInternalFrame extends TipoGastoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGastoProdu;
	
	protected JMenuBar jmenuBarTipoGastoProdu;
	
	protected JMenu jmenuTipoGastoProdu;
	protected JMenu jmenuDatosTipoGastoProdu;
	protected JMenu jmenuArchivoTipoGastoProdu;
	protected JMenu jmenuAccionesTipoGastoProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGastoProdu;	
	protected GridBagConstraints gridBagConstraintsTipoGastoProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGastoProduDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGastoProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGastoProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGastoProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGastoProduSessionBean tipogastoproduSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGastoProdu> tipogastoprodus;		
	public List<TipoGastoProdu> tipogastoprodusEliminados;	
	public List<TipoGastoProdu> tipogastoprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGastoProdu;		
	protected JButton jButtonAbrirOrderByTipoGastoProdu;
	
	
	//protected JPanel jPanelOrderByTipoGastoProdu;
	//public JScrollPane jScrollPanelOrderByTipoGastoProdu;	
	//protected JButton jButtonCerrarOrderByTipoGastoProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGastoProduLogic tipogastoproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGastoProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoGastoProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoGastoProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGastoProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGastoProdu;
	//public JScrollPane jScrollPanelImportacionTipoGastoProdu;
	
	
	
	protected JPanel jPanelAccionesTipoGastoProdu;
	
    protected JPanel jPanelPaginacionTipoGastoProdu;
    protected JPanel jPanelParametrosReportesTipoGastoProdu;
	protected JPanel jPanelParametrosReportesAccionesTipoGastoProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGastoProdu;
	protected JPanel jPanelParametrosAuxiliar2TipoGastoProdu;
	protected JPanel jPanelParametrosAuxiliar3TipoGastoProdu;
	protected JPanel jPanelParametrosAuxiliar4TipoGastoProdu;
	//protected JPanel jPanelParametrosAuxiliar5TipoGastoProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGastoProdu;
	//protected JPanel jPanelImportacionTipoGastoProdu;
	
	
	public JTable jTableDatosTipoGastoProdu;
	
	
	
	//public JTable jTableDatosTipoGastoProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGastoProdu;
	protected JButton jButtonDuplicarTipoGastoProdu;
	protected JButton jButtonCopiarTipoGastoProdu;
	protected JButton jButtonVerFormTipoGastoProdu;
	protected JButton jButtonNuevoRelacionesTipoGastoProdu;
	protected JButton jButtonModificarTipoGastoProdu;
	
    protected JButton jButtonGuardarCambiosTablaTipoGastoProdu;
	protected JButton jButtonCerrarTipoGastoProdu;
	
	
	protected JButton jButtonRecargarInformacionTipoGastoProdu;
	protected JButton jButtonProcesarInformacionTipoGastoProdu;
	
	
	protected JButton jButtonAnterioresTipoGastoProdu;
	protected JButton jButtonSiguientesTipoGastoProdu;
	protected JButton jButtonNuevoGuardarCambiosTipoGastoProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGastoProdu;
	//protected JButton jButtonCerrarReporteDinamicoTipoGastoProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGastoProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGastoProdu;
	//protected JButton jButtonGenerarImportacionTipoGastoProdu;
	//protected JButton jButtonCerrarImportacionTipoGastoProdu;
	//protected JFileChooser jFileChooserImportacionTipoGastoProdu;
	//protected File fileImportacionTipoGastoProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGastoProdu;
	protected JButton jButtonDuplicarToolBarTipoGastoProdu;
	protected JButton jButtonNuevoRelacionesToolBarTipoGastoProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGastoProdu;
	protected JButton jButtonCopiarToolBarTipoGastoProdu;
	protected JButton jButtonVerFormToolBarTipoGastoProdu;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGastoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGastoProdu;
	protected JButton jButtonCerrarToolBarTipoGastoProdu;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGastoProdu;
	protected JButton jButtonProcesarInformacionToolBarTipoGastoProdu;
	protected JButton jButtonAnterioresToolBarTipoGastoProdu;
	protected JButton jButtonSiguientesToolBarTipoGastoProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGastoProdu;
	protected JButton jButtonAbrirOrderByToolBarTipoGastoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGastoProdu;
	protected JMenuItem jMenuItemDuplicarTipoGastoProdu;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGastoProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGastoProdu;
	protected JMenuItem jMenuItemCopiarTipoGastoProdu;
	protected JMenuItem jMenuItemVerFormTipoGastoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGastoProdu;
	protected JMenuItem jMenuItemCerrarTipoGastoProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoGastoProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGastoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGastoProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGastoProdu;
	protected JMenuItem jMenuItemProcesarInformacionTipoGastoProdu;
	protected JMenuItem jMenuItemAnterioresTipoGastoProdu;
	protected JMenuItem jMenuItemSiguientesTipoGastoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGastoProdu;
	protected JMenuItem jMenuItemAbrirOrderByTipoGastoProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoGastoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGastoProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGastoProdu;
	protected JCheckBox jCheckBoxSeleccionadosTipoGastoProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGastoProdu;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGastoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGastoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGastoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGastoProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGastoProdu;
	protected JTextField jTextFieldValorCampoGeneralTipoGastoProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGastoProdu;
	//public JList<Reporte> jListColumnasSelectReporteTipoGastoProdu;
	//public JScrollPane jScrollColumnasSelectReporteTipoGastoProdu;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGastoProdu;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGastoProdu;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGastoProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGastoProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGastoProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGastoProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGastoProdu;
	
		
	//public JLabel jLabelArchivoImportacionTipoGastoProdu;	
	//public JLabel jLabelPathArchivoImportacionTipoGastoProdu;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGastoProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGastoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGastoProdu;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGastoProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGastoProdu;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGastoProdu;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGastoProdu;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGastoProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGastoProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGastoProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGastoProdu;
	public JPanel jPanelFK_IdPaisTipoGastoProdu;
	public JButton jButtonFK_IdPaisTipoGastoProdu;
	
	public JPanel jPanelid_paisFK_IdPaisTipoGastoProdu;
	public JLabel jLabelid_paisFK_IdPaisTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoGastoProdu;
	public JButton jButtonid_paisFK_IdPaisTipoGastoProdu= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGastoProduUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGastoProduBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoGastoProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGastoProdu)	{
		this.jButtonRecargarInformacionTipoGastoProdu = jButtonRecargarInformacionTipoGastoProdu;
	}
	
	public JButton getjButtonProcesarInformacionTipoGastoProdu() {
		return this.jButtonProcesarInformacionTipoGastoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGastoProdu)	{
		this.jButtonProcesarInformacionTipoGastoProdu = jButtonProcesarInformacionTipoGastoProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGastoProdu() {
		return this.jButtonRecargarInformacionTipoGastoProdu;
	}
	
	
	public List<TipoGastoProdu> gettipogastoprodus() {
		return this.tipogastoprodus;
	}

	public void settipogastoprodus(List<TipoGastoProdu> tipogastoprodus) {
		this.tipogastoprodus = tipogastoprodus;
	}
	
	public List<TipoGastoProdu> gettipogastoprodusAux() {
		return this.tipogastoprodusAux;
	}

	public void settipogastoprodusAux(List<TipoGastoProdu> tipogastoprodusAux) {
		this.tipogastoprodusAux = tipogastoprodusAux;
	}
	
	public List<TipoGastoProdu> gettipogastoprodusEliminados() {
		return this.tipogastoprodusEliminados;
	}

	public void setTipoGastoProdusEliminados(List<TipoGastoProdu> tipogastoprodusEliminados) {
		this.tipogastoprodusEliminados = tipogastoprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGastoProdu() {
		return jComboBoxTiposSeleccionarTipoGastoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGastoProdu(
			JComboBox jComboBoxTiposSeleccionarTipoGastoProdu) {
		this.jComboBoxTiposSeleccionarTipoGastoProdu = jComboBoxTiposSeleccionarTipoGastoProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGastoProdu() {
		return jTextFieldValorCampoGeneralTipoGastoProdu;
	}

	public void setjTextFieldValorCampoGeneralTipoGastoProdu(
			JTextField jTextFieldValorCampoGeneralTipoGastoProdu) {
		this.jTextFieldValorCampoGeneralTipoGastoProdu = jTextFieldValorCampoGeneralTipoGastoProdu;
	}

	public void setBorderResaltarValorCampoGeneralTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGastoProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGastoProdu() {
		return this.jCheckBoxSeleccionarTodosTipoGastoProdu;
	}

	public void setjCheckBoxSeleccionarTodosTipoGastoProdu(
			JCheckBox jCheckBoxSeleccionarTodosTipoGastoProdu) {
		this.jCheckBoxSeleccionarTodosTipoGastoProdu = jCheckBoxSeleccionarTodosTipoGastoProdu;
	}

	public void setBorderResaltarSeleccionarTodosTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGastoProdu() {
		return this.jCheckBoxSeleccionadosTipoGastoProdu;
	}

	public void setjCheckBoxSeleccionadosTipoGastoProdu(
			JCheckBox jCheckBoxSeleccionadosTipoGastoProdu) {
		this.jCheckBoxSeleccionadosTipoGastoProdu = jCheckBoxSeleccionadosTipoGastoProdu;
	}
	
	public void setBorderResaltarSeleccionadosTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGastoProdu() {
		return this.jComboBoxTiposArchivosReportesTipoGastoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGastoProdu(
			JComboBox jComboBoxTiposArchivosReportesTipoGastoProdu) {
		this.jComboBoxTiposArchivosReportesTipoGastoProdu = jComboBoxTiposArchivosReportesTipoGastoProdu;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGastoProdu() {
		return this.jComboBoxTiposReportesTipoGastoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGastoProdu(
			JComboBox jComboBoxTiposReportesTipoGastoProdu) {
		this.jComboBoxTiposReportesTipoGastoProdu = jComboBoxTiposReportesTipoGastoProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGastoProdu() {
	//	return jComboBoxTiposReportesDinamicoTipoGastoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGastoProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGastoProdu) {
	//	this.jComboBoxTiposReportesDinamicoTipoGastoProdu = jComboBoxTiposReportesDinamicoTipoGastoProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGastoProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGastoProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu = jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu;
	//}
	
	public void setBorderResaltarTiposReportesTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGastoProdu() {
		return this.jComboBoxTiposGraficosReportesTipoGastoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGastoProdu(
			JComboBox jComboBoxTiposGraficosReportesTipoGastoProdu) {
		this.jComboBoxTiposGraficosReportesTipoGastoProdu = jComboBoxTiposGraficosReportesTipoGastoProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGastoProdu() {
		return this.jComboBoxTiposPaginacionTipoGastoProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGastoProdu(
			JComboBox jComboBoxTiposPaginacionTipoGastoProdu) {
		this.jComboBoxTiposPaginacionTipoGastoProdu = jComboBoxTiposPaginacionTipoGastoProdu;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGastoProdu() {
		return this.jComboBoxTiposRelacionesTipoGastoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGastoProdu() {
		return this.jComboBoxTiposAccionesTipoGastoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGastoProdu(
			JComboBox jComboBoxTiposRelacionesTipoGastoProdu) {
		this.jComboBoxTiposRelacionesTipoGastoProdu = jComboBoxTiposRelacionesTipoGastoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGastoProdu(
			JComboBox jComboBoxTiposAccionesTipoGastoProdu) {
		this.jComboBoxTiposAccionesTipoGastoProdu = jComboBoxTiposAccionesTipoGastoProdu;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGastoProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGastoProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGastoProdu() {
	//	return jCheckBoxConGraficoDinamicoTipoGastoProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGastoProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGastoProdu) {
	//	this.jCheckBoxConGraficoDinamicoTipoGastoProdu = jCheckBoxConGraficoDinamicoTipoGastoProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGastoProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGastoProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGastoProdu .setBorder(borderResaltar);		
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
		this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
		
		this.tipogastoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGastoProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGastoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGastoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGastoProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"nuevo","nuevo","Nuevo"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"duplicar","duplicar","Duplicar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"copiar","copiar","Copiar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"ver_form","ver_form","Ver"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"recargar","recargar","Recargar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGastoProdu,this.jTtoolBarTipoGastoProdu,
							"cerrar","cerrar","Salir"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGastoProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGastoProdu;
			
				this.jButtonProcesarInformacionToolBarTipoGastoProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGastoProdu;
				
		//protected JButton jButtonModificarToolBarTipoGastoProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGastoProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGastoProdu=new JMenuMe("General");
		this.jmenuArchivoTipoGastoProdu=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGastoProdu=new JMenuMe("Acciones");
		this.jmenuDatosTipoGastoProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGastoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGastoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGastoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGastoProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGastoProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGastoProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGastoProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGastoProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGastoProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGastoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGastoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGastoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGastoProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGastoProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGastoProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGastoProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGastoProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGastoProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGastoProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGastoProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGastoProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGastoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGastoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGastoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGastoProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGastoProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGastoProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGastoProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGastoProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGastoProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGastoProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGastoProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGastoProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGastoProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGastoProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGastoProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGastoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGastoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGastoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGastoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGastoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGastoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGastoProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGastoProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGastoProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGastoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGastoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGastoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGastoProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGastoProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGastoProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGastoProdu.add(this.jMenuItemCerrarTipoGastoProdu);
			
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemNuevoTipoGastoProdu);
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemNuevoGuardarCambiosTipoGastoProdu);
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemNuevoRelacionesTipoGastoProdu);
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemGuardarCambiosTablaTipoGastoProdu);		
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemDuplicarTipoGastoProdu);		
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemCopiarTipoGastoProdu);		
			this.jmenuAccionesTipoGastoProdu.add(this.jMenuItemVerFormTipoGastoProdu);		
			
			this.jmenuDatosTipoGastoProdu.add(this.jMenuItemRecargarInformacionTipoGastoProdu);				
			this.jmenuDatosTipoGastoProdu.add(this.jMenuItemAnterioresTipoGastoProdu);				
			this.jmenuDatosTipoGastoProdu.add(this.jMenuItemSiguientesTipoGastoProdu);				
			this.jmenuDatosTipoGastoProdu.add(this.jMenuItemAbrirOrderByTipoGastoProdu);				
			this.jmenuDatosTipoGastoProdu.add(this.jMenuItemMostrarOcultarTipoGastoProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGastoProdu.add(this.jMenuItemGuardarCambiosTipoGastoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGastoProdu.add(this.jmenuArchivoTipoGastoProdu);		
			this.jmenuBarTipoGastoProdu.add(this.jmenuAccionesTipoGastoProdu);		
			this.jmenuBarTipoGastoProdu.add(this.jmenuDatosTipoGastoProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGastoProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGastoProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoGastoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoGastoProdu.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoGastoProdu= new JButtonMe();
		this.jButtonFK_IdPaisTipoGastoProdu.setText("Buscar");
		this.jButtonFK_IdPaisTipoGastoProdu.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoGastoProdu,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoGastoProdu = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoGastoProdu.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoGastoProdu.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoGastoProdu= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGastoProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGastoProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGastoProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGastoProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGastoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGastoProdu = new TipoGastoProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Gasto Produccion DATOS");
			this.jInternalFrameDetalleFormTipoGastoProdu = new TipoGastoProduDetalleFormJInternalFrame(jDesktopPane,this.tipogastoproduSessionBean.getConGuardarRelaciones(),this.tipogastoproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGastoProdu = null;//new TipoGastoProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGastoProdu= new GridBagLayout();
		
		
		this.jTableDatosTipoGastoProdu = new JTableMe();      
		
		String sToolTipTipoGastoProdu="";
		sToolTipTipoGastoProdu=TipoGastoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGastoProdu+="(Produccion.TipoGastoProdu)";
		}
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGastoProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGastoProdu.setToolTipText(sToolTipTipoGastoProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGastoProdu);
		this.jTableDatosTipoGastoProdu.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGastoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGastoProdu.setRowSelectionAllowed(true);
		this.jTableDatosTipoGastoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGastoProdu = new JButtonMe();
		this.jButtonDuplicarTipoGastoProdu = new JButtonMe();
		this.jButtonCopiarTipoGastoProdu = new JButtonMe();
		this.jButtonVerFormTipoGastoProdu = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGastoProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu = new JButtonMe();
		this.jButtonCerrarTipoGastoProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoGastoProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGastoProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto Produccion";
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGastoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGastoProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoGastoProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGastoProdu=new ReporteDinamicoJInternalFrame(TipoGastoProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGastoProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGastoProdu=new ImportacionJInternalFrame(TipoGastoProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGastoProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGastoProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGastoProdu.setText("Orden");
		this.jButtonAbrirOrderByTipoGastoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGastoProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGastoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProdu,false,this);
			
			//this.cargarOrderByTipoGastoProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGastoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGastoProdu,true,this);
			
			//this.cargarOrderByTipoGastoProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGastoProdu.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoGastoProdu.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoGastoProdu.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoGastoProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGastoProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGastoProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGastoProdu.setText("Nuevo");
		this.jButtonDuplicarTipoGastoProdu.setText("Duplicar");
		this.jButtonCopiarTipoGastoProdu.setText("Copiar");
		this.jButtonVerFormTipoGastoProdu.setText("Ver");
		this.jButtonNuevoRelacionesTipoGastoProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.setText("Guardar");
		this.jButtonCerrarTipoGastoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGastoProdu,"nuevo_button","Nuevo",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGastoProdu,"duplicar_button","Duplicar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGastoProdu,"copiar_button","Copiar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGastoProdu,"ver_form","Ver",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGastoProdu,"nuevorelaciones_button","Nuevo Rel",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGastoProdu,"guardarcambiostabla_button","Guardar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGastoProdu,"cerrar_button","Salir",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGastoProdu.setToolTipText("Nuevo"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGastoProdu.setToolTipText("Duplicar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGastoProdu.setToolTipText("Copiar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGastoProdu.setToolTipText("Ver"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGastoProdu.setToolTipText("Nuevo Rel"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.setToolTipText("Guardar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGastoProdu.setToolTipText("Salir"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGastoProdu";
		inputMap = this.jButtonNuevoTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGastoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGastoProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGastoProdu";
		inputMap = this.jButtonDuplicarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGastoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGastoProdu"));
		
		//COPIAR
		sMapKey = "CopiarTipoGastoProdu";
		inputMap = this.jButtonCopiarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGastoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGastoProdu"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGastoProdu";
		inputMap = this.jButtonVerFormTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGastoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGastoProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGastoProdu";
		inputMap = this.jButtonNuevoRelacionesTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGastoProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGastoProdu";
		inputMap = this.jButtonModificarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGastoProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGastoProdu";
		inputMap = this.jButtonCerrarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGastoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGastoProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGastoProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGastoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGastoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGastoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGastoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGastoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGastoProdu.setName("jPanelParametrosReportesTipoGastoProdu"); 
		
		this.jPanelParametrosReportesAccionesTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGastoProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGastoProdu.setName("jPanelParametrosReportesAccionesTipoGastoProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGastoProdu = new JButtonMe();
		this.jButtonRecargarInformacionTipoGastoProdu.setText("Recargar");
		this.jButtonRecargarInformacionTipoGastoProdu.setToolTipText("Recargar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGastoProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGastoProdu = new JButtonMe();
		this.jButtonProcesarInformacionTipoGastoProdu.setText("Procesar");
		this.jButtonProcesarInformacionTipoGastoProdu.setToolTipText("Procesar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGastoProdu.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGastoProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGastoProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGastoProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGastoProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoProdu.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGastoProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGastoProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGastoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGastoProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGastoProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGastoProdu.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGastoProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGastoProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoGastoProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGastoProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGastoProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGastoProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGastoProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGastoProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGastoProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGastoProdu = new JLabelMe();
		
		this.jLabelAccionesTipoGastoProdu.setText("Acciones");		
		this.jLabelAccionesTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGastoProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGastoProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGastoProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGastoProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGastoProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGastoProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGastoProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGastoProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGastoProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGastoProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGastoProdu = new JButtonMe();
		//this.jButtonAnterioresTipoGastoProdu.setText("<<");
        this.jButtonAnterioresTipoGastoProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGastoProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGastoProdu = new JButtonMe();
		//this.jButtonSiguientesTipoGastoProdu.setText(">>");
        this.jButtonSiguientesTipoGastoProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGastoProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGastoProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGastoProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGastoProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGastoProdu,"nuevoguardarcambios_button","Nue",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGastoProdu";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGastoProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGastoProdu";
		inputMap = this.jButtonRecargarInformacionTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGastoProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGastoProdu";
		inputMap = this.jButtonSiguientesTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGastoProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGastoProdu";
		inputMap = this.jButtonAnterioresTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGastoProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGastoProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGastoProdu.setMinimumSize(new Dimension(this.getWidth(),TipoGastoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGastoProdu.setMaximumSize(new Dimension(this.getWidth(),TipoGastoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGastoProdu.setPreferredSize(new Dimension(this.getWidth(),TipoGastoProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGastoProdu = new GridBagLayout();

			this.jPanelPaginacionTipoGastoProdu.setLayout(gridaBagLayoutPaginacionTipoGastoProdu);						
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 0;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonAnterioresTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
					
						
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGastoProdu.gridy = 0;
			
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonNuevoGuardarCambiosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
						
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGastoProdu.gridy = 0;
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonSiguientesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 1;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonNuevoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
						
			
			
			if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGastoProdu.gridy = 1;
				this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGastoProdu.add(this.jButtonGuardarCambiosTablaTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			}
			
			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 1;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonDuplicarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 1;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonCopiarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 1;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonVerFormTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 1;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGastoProdu.add(this.jButtonCerrarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
		
		
		this.jButtonRecargarInformacionTipoGastoProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGastoProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGastoProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGastoProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGastoProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGastoProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGastoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGastoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGastoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGastoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGastoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGastoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGastoProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGastoProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGastoProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGastoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGastoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGastoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGastoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGastoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGastoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGastoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGastoProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGastoProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGastoProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGastoProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGastoProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGastoProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGastoProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGastoProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGastoProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGastoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGastoProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGastoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGastoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGastoProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGastoProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGastoProdu.setLayout(gridaBagParametrosReportesTipoGastoProdu);
			this.jPanelParametrosReportesAccionesTipoGastoProdu.setLayout(gridaBagParametrosReportesAccionesTipoGastoProdu);
			
			
			this.jPanelParametrosAuxiliar1TipoGastoProdu.setLayout(gridaBagParametrosAuxiliar1TipoGastoProdu);
			this.jPanelParametrosAuxiliar2TipoGastoProdu.setLayout(gridaBagParametrosAuxiliar2TipoGastoProdu);
			this.jPanelParametrosAuxiliar3TipoGastoProdu.setLayout(gridaBagParametrosAuxiliar3TipoGastoProdu);
			this.jPanelParametrosAuxiliar4TipoGastoProdu.setLayout(gridaBagParametrosAuxiliar4TipoGastoProdu);
			//this.jPanelParametrosAuxiliar5TipoGastoProdu.setLayout(gridaBagParametrosAuxiliar2TipoGastoProdu);			
			
			
			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jButtonRecargarInformacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoProdu.add(this.jComboBoxTiposPaginacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoProdu.add(this.jCheckBoxConAltoMaximoTablaTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGastoProdu.add(this.jComboBoxTiposArchivosReportesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jPanelParametrosAuxiliar1TipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGastoProdu.add(this.jComboBoxTiposReportesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jPanelParametrosAuxiliar4TipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jComboBoxTiposReportesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jCheckBoxGenerarReporteTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jPanelParametrosAuxiliar2TipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jLabelAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGastoProdu.add(this.jButtonAbrirOrderByTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jComboBoxTiposSeleccionarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
			
			
			/*
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jCheckBoxSeleccionarTodosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGastoProdu.add(this.jCheckBoxSeleccionarTodosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);															
				
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGastoProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGastoProdu.add(this.jCheckBoxSeleccionadosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jPanelParametrosAuxiliar3TipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGastoProdu.add(this.jComboBoxTiposAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGastoProdu = new GridBagLayout();

			this.jScrollPanelDatosTipoGastoProdu.setLayout(gridaBagLayoutDatosTipoGastoProdu);
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = 0;
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;
			
			this.jScrollPanelDatosTipoGastoProdu.add(this.jTableDatosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGastoProdu.setViewportView(this.jTableDatosTipoGastoProdu);
		this.jTableDatosTipoGastoProdu.setFillsViewportHeight(true);
		this.jTableDatosTipoGastoProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGastoProdu= new GridBagLayout();
		this.jPanelAccionesTipoGastoProdu.setLayout(gridaBagLayoutAccionesTipoGastoProdu);
		
		
		/*	
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
			
		this.jPanelAccionesTipoGastoProdu.add(this.jButtonNuevoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoGastoProdu= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoGastoProdu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGastoProdu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGastoProdu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoGastoProdu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoGastoProdu.setLayout(gridaBagLayoutFK_IdPaisTipoGastoProdu);

		gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGastoProdu.gridy = 0;
		gridBagConstraintsTipoGastoProdu.gridx = 0;
		jPanelFK_IdPaisTipoGastoProdu.add(jLabelid_paisFK_IdPaisTipoGastoProdu, gridBagConstraintsTipoGastoProdu);

		gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGastoProdu.gridy = 0;
		gridBagConstraintsTipoGastoProdu.gridx = 1;
		jPanelFK_IdPaisTipoGastoProdu.add(jComboBoxid_paisFK_IdPaisTipoGastoProdu, gridBagConstraintsTipoGastoProdu);

		gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGastoProdu.gridy = 1;
		gridBagConstraintsTipoGastoProdu.gridx =1;
		jPanelFK_IdPaisTipoGastoProdu.add(jButtonFK_IdPaisTipoGastoProdu, gridBagConstraintsTipoGastoProdu);

		jTabbedPaneBusquedasTipoGastoProdu.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoGastoProdu);
		jTabbedPaneBusquedasTipoGastoProdu.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGastoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGastoProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;		
			//this.gridBagConstraintsTipoGastoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGastoProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;		
		//this.gridBagConstraintsTipoGastoProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGastoProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGastoProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;		
			this.gridBagConstraintsTipoGastoProdu.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGastoProdu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);								
		
		
		/*
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		*/		
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoProdu.gridx =0;
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGastoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
				
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGastoProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGastoProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGastoProdu.setLayout(gridaBagLayoutBusquedasParametrosTipoGastoProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGastoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGastoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
			
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
			
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGastoProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGastoProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGastoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGastoProdu.setName("jPanelReporteDinamicoTipoGastoProdu"); 
		
		this.jPanelReporteDinamicoTipoGastoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGastoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGastoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGastoProdu.setLayout(gridaBagLayoutReporteDinamicoTipoGastoProdu);
		
		
		this.jInternalFrameReporteDinamicoTipoGastoProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGastoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGastoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGastoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGastoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGastoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGastoProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGastoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGastoProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGastoProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGastoProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGastoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGastoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGastoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGastoProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGastoProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jLabelColumnasSelectReporteTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGastoProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGastoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGastoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGastoProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGastoProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGastoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGastoProdu=new JScrollPane(this.jListColumnasSelectReporteTipoGastoProdu);
			
			this.jScrollColumnasSelectReporteTipoGastoProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGastoProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGastoProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGastoProdu.add(this.jListColumnasSelectReporteTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jScrollColumnasSelectReporteTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGastoProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGastoProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGastoProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGastoProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGastoProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGastoProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGastoProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGastoProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGastoProdu=new JScrollPane(this.jListRelacionesSelectReporteTipoGastoProdu);
			
			this.jScrollRelacionesSelectReporteTipoGastoProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGastoProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGastoProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGastoProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGastoProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGastoProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGastoProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGastoProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGastoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGastoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGastoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGastoProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jLabelGenerarExcelReporteDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu.setToolTipText("Generar EXCEL"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGastoProdu.add(this.jButtonGenerarExcelReporteDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jComboBoxTiposReportesDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGastoProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jLabelTiposArchivoReporteDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGastoProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGastoProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGastoProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGastoProdu.setToolTipText("Generar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jButtonGenerarReporteDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGastoProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGastoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGastoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGastoProdu.setToolTipText("Cancelar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGastoProdu.add(this.jButtonCerrarReporteDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGastoProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGastoProdu= new JScrollPane(jPanelReporteDinamicoTipoGastoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGastoProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGastoProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGastoProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGastoProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGastoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGastoProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGastoProdu);
		this.jInternalFrameReporteDinamicoTipoGastoProdu.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGastoProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGastoProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGastoProdu.setName("jPanelImportacionTipoGastoProdu"); 
		
		this.jPanelImportacionTipoGastoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGastoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGastoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGastoProdu.setLayout(gridaBagLayoutImportacionTipoGastoProdu);
		
		
		this.jInternalFrameImportacionTipoGastoProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGastoProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGastoProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGastoProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGastoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGastoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGastoProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGastoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGastoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGastoProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoGastoProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoGastoProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGastoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGastoProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGastoProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGastoProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGastoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGastoProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoGastoProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoGastoProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGastoProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGastoProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGastoProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGastoProdu = new JLabelMe();

		this.jLabelArchivoImportacionTipoGastoProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGastoProdu.add(this.jLabelArchivoImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGastoProdu = new JFileChooser();		
		this.jFileChooserImportacionTipoGastoProdu.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGastoProdu = new JButtonMe();
		this.jButtonAbrirImportacionTipoGastoProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGastoProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGastoProdu.setToolTipText("Generar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProdu.add(this.jButtonAbrirImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGastoProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGastoProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGastoProdu.add(this.jLabelPathArchivoImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGastoProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGastoProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGastoProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGastoProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProdu.add(this.jTextFieldPathArchivoImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGastoProdu = new JButtonMe();
		this.jButtonGenerarImportacionTipoGastoProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGastoProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGastoProdu.setToolTipText("Generar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProdu.add(this.jButtonGenerarImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGastoProdu = new JButtonMe();
		this.jButtonCerrarImportacionTipoGastoProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGastoProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGastoProdu.setToolTipText("Cancelar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGastoProdu.add(this.jButtonCerrarImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGastoProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGastoProdu= new JScrollPane(jPanelImportacionTipoGastoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGastoProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGastoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGastoProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGastoProdu);
		this.jInternalFrameImportacionTipoGastoProdu.getContentPane().add(this.jScrollPanelImportacionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGastoProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGastoProdu = new JButtonMe();
			this.jButtonAbrirOrderByTipoGastoProdu.setText("Orden");
			this.jButtonAbrirOrderByTipoGastoProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGastoProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGastoProdu";
			inputMap = this.jButtonAbrirOrderByTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGastoProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGastoProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGastoProdu.setName("jPanelOrderByTipoGastoProdu"); 
			
			this.jPanelOrderByTipoGastoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGastoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGastoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGastoProdu.setLayout(gridaBagLayoutOrderByTipoGastoProdu);
			
			
			this.jTableDatosTipoGastoProduOrderBy = new JTableMe();        
			this.jTableDatosTipoGastoProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGastoProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGastoProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGastoProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGastoProduOrderBy.setViewportView(this.jTableDatosTipoGastoProduOrderBy);
			this.jTableDatosTipoGastoProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGastoProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGastoProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGastoProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGastoProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGastoProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGastoProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGastoProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGastoProdu.setTitle("Orden");
			this.jInternalFrameOrderByTipoGastoProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGastoProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGastoProdu.setResizable(true);
			this.jInternalFrameOrderByTipoGastoProdu.setClosable(true);
			this.jInternalFrameOrderByTipoGastoProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGastoProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGastoProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGastoProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGastoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGastoProdu.ipady =150;
				
			this.jPanelOrderByTipoGastoProdu.add(jScrollPanelDatosTipoGastoProduOrderBy, this.gridBagConstraintsTipoGastoProdu);//this.jTableDatosTipoGastoProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGastoProdu = new JButtonMe();
			this.jButtonCerrarOrderByTipoGastoProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGastoProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGastoProdu.setToolTipText("Cancelar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGastoProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGastoProdu.add(this.jButtonCerrarOrderByTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGastoProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGastoProdu= new JScrollPane(jPanelOrderByTipoGastoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGastoProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGastoProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGastoProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGastoProdu);
			
			this.jInternalFrameOrderByTipoGastoProdu.getContentPane().add(this.jScrollPanelOrderByTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
		
		} else {
			this.jButtonAbrirOrderByTipoGastoProdu = new JButtonMe();
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
			&& this.tipogastoproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGastoProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGastoProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGastoProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGastoProdu.getRowHeight();//TipoGastoProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.isSelected()) {
					iHeightTable=TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGastoProdu.isSelected()) {
					iHeightTable=TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGastoProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGastoProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGastoProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGastoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGastoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGastoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGastoProdu!=null && this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGastoProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGastoProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGastoProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGastoProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGastoProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGastoProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGastoProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogastoproduLogic.getTipoGastoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastoprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGastoProdu> TraerTipoGastoProduBeans(List<TipoGastoProdu> tipogastoprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGastoProdu tipogastoprodu:tipogastoprodus) {
					
				if(!(TipoGastoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGastoProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogastoprodu.setsDetalleGeneralEntityReporte(TipoGastoProduConstantesFunciones.getTipoGastoProduDescripcion(tipogastoprodu));
										
						
					
						
					
				} else  {
							
					//tipogastoprodu.setsDetalleGeneralEntityReporte(tipogastoprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogastoprodubeans.add(tipogastoprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogastoprodus;
    }
	//PARA REPORTES FIN
}
