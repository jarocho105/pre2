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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
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
import com.bydan.erp.produccion.util.EstadoOrdenProduConstantesFunciones;

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
public class EstadoOrdenProduJInternalFrame extends EstadoOrdenProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoOrdenProdu;
	
	protected JMenuBar jmenuBarEstadoOrdenProdu;
	
	protected JMenu jmenuEstadoOrdenProdu;
	protected JMenu jmenuDatosEstadoOrdenProdu;
	protected JMenu jmenuArchivoEstadoOrdenProdu;
	protected JMenu jmenuAccionesEstadoOrdenProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoOrdenProdu;	
	protected GridBagConstraints gridBagConstraintsEstadoOrdenProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoOrdenProduDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoOrdenProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoOrdenProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoOrdenProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoOrdenProduSessionBean estadoordenproduSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoOrdenProdu> estadoordenprodus;		
	public List<EstadoOrdenProdu> estadoordenprodusEliminados;	
	public List<EstadoOrdenProdu> estadoordenprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoOrdenProdu;		
	protected JButton jButtonAbrirOrderByEstadoOrdenProdu;
	
	
	//protected JPanel jPanelOrderByEstadoOrdenProdu;
	//public JScrollPane jScrollPanelOrderByEstadoOrdenProdu;	
	//protected JButton jButtonCerrarOrderByEstadoOrdenProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoOrdenProduLogic estadoordenproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoOrdenProdu;
	public JScrollPane jScrollPanelDatosEdicionEstadoOrdenProdu;
	public JScrollPane jScrollPanelDatosGeneralEstadoOrdenProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoOrdenProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoOrdenProdu;
	//public JScrollPane jScrollPanelImportacionEstadoOrdenProdu;
	
	
	
	protected JPanel jPanelAccionesEstadoOrdenProdu;
	
    protected JPanel jPanelPaginacionEstadoOrdenProdu;
    protected JPanel jPanelParametrosReportesEstadoOrdenProdu;
	protected JPanel jPanelParametrosReportesAccionesEstadoOrdenProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoOrdenProdu;
	protected JPanel jPanelParametrosAuxiliar2EstadoOrdenProdu;
	protected JPanel jPanelParametrosAuxiliar3EstadoOrdenProdu;
	protected JPanel jPanelParametrosAuxiliar4EstadoOrdenProdu;
	//protected JPanel jPanelParametrosAuxiliar5EstadoOrdenProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoOrdenProdu;
	//protected JPanel jPanelImportacionEstadoOrdenProdu;
	
	
	public JTable jTableDatosEstadoOrdenProdu;
	
	
	
	//public JTable jTableDatosEstadoOrdenProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoOrdenProdu;
	protected JButton jButtonDuplicarEstadoOrdenProdu;
	protected JButton jButtonCopiarEstadoOrdenProdu;
	protected JButton jButtonVerFormEstadoOrdenProdu;
	protected JButton jButtonNuevoRelacionesEstadoOrdenProdu;
	protected JButton jButtonModificarEstadoOrdenProdu;
	
    protected JButton jButtonGuardarCambiosTablaEstadoOrdenProdu;
	protected JButton jButtonCerrarEstadoOrdenProdu;
	
	
	protected JButton jButtonRecargarInformacionEstadoOrdenProdu;
	protected JButton jButtonProcesarInformacionEstadoOrdenProdu;
	
	
	protected JButton jButtonAnterioresEstadoOrdenProdu;
	protected JButton jButtonSiguientesEstadoOrdenProdu;
	protected JButton jButtonNuevoGuardarCambiosEstadoOrdenProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoOrdenProdu;
	//protected JButton jButtonCerrarReporteDinamicoEstadoOrdenProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoOrdenProdu;
	//protected JButton jButtonGenerarImportacionEstadoOrdenProdu;
	//protected JButton jButtonCerrarImportacionEstadoOrdenProdu;
	//protected JFileChooser jFileChooserImportacionEstadoOrdenProdu;
	//protected File fileImportacionEstadoOrdenProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoOrdenProdu;
	protected JButton jButtonDuplicarToolBarEstadoOrdenProdu;
	protected JButton jButtonNuevoRelacionesToolBarEstadoOrdenProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoOrdenProdu;
	protected JButton jButtonCopiarToolBarEstadoOrdenProdu;
	protected JButton jButtonVerFormToolBarEstadoOrdenProdu;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoOrdenProdu;
	protected JButton jButtonCerrarToolBarEstadoOrdenProdu;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoOrdenProdu;
	protected JButton jButtonProcesarInformacionToolBarEstadoOrdenProdu;
	protected JButton jButtonAnterioresToolBarEstadoOrdenProdu;
	protected JButton jButtonSiguientesToolBarEstadoOrdenProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoOrdenProdu;
	protected JButton jButtonAbrirOrderByToolBarEstadoOrdenProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoOrdenProdu;
	protected JMenuItem jMenuItemDuplicarEstadoOrdenProdu;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoOrdenProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoOrdenProdu;
	protected JMenuItem jMenuItemCopiarEstadoOrdenProdu;
	protected JMenuItem jMenuItemVerFormEstadoOrdenProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoOrdenProdu;
	protected JMenuItem jMenuItemCerrarEstadoOrdenProdu;
	protected JMenuItem jMenuItemDetalleCerrarEstadoOrdenProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoOrdenProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoOrdenProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoOrdenProdu;
	protected JMenuItem jMenuItemProcesarInformacionEstadoOrdenProdu;
	protected JMenuItem jMenuItemAnterioresEstadoOrdenProdu;
	protected JMenuItem jMenuItemSiguientesEstadoOrdenProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoOrdenProdu;
	protected JMenuItem jMenuItemAbrirOrderByEstadoOrdenProdu;
	protected JMenuItem jMenuItemMostrarOcultarEstadoOrdenProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoOrdenProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoOrdenProdu;
	protected JCheckBox jCheckBoxSeleccionadosEstadoOrdenProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoOrdenProdu;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoOrdenProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoOrdenProdu;
	protected JTextField jTextFieldValorCampoGeneralEstadoOrdenProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoOrdenProdu;
	//public JList<Reporte> jListColumnasSelectReporteEstadoOrdenProdu;
	//public JScrollPane jScrollColumnasSelectReporteEstadoOrdenProdu;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoOrdenProdu;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoOrdenProdu;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoOrdenProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoOrdenProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoOrdenProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu;
	
		
	//public JLabel jLabelArchivoImportacionEstadoOrdenProdu;	
	//public JLabel jLabelPathArchivoImportacionEstadoOrdenProdu;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoOrdenProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoOrdenProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoOrdenProdu;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoOrdenProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoOrdenProdu;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoOrdenProdu;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoOrdenProdu;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoOrdenProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoOrdenProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoOrdenProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public EstadoOrdenProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoOrdenProdu)	{
		this.jButtonRecargarInformacionEstadoOrdenProdu = jButtonRecargarInformacionEstadoOrdenProdu;
	}
	
	public JButton getjButtonProcesarInformacionEstadoOrdenProdu() {
		return this.jButtonProcesarInformacionEstadoOrdenProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoOrdenProdu)	{
		this.jButtonProcesarInformacionEstadoOrdenProdu = jButtonProcesarInformacionEstadoOrdenProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoOrdenProdu() {
		return this.jButtonRecargarInformacionEstadoOrdenProdu;
	}
	
	
	public List<EstadoOrdenProdu> getestadoordenprodus() {
		return this.estadoordenprodus;
	}

	public void setestadoordenprodus(List<EstadoOrdenProdu> estadoordenprodus) {
		this.estadoordenprodus = estadoordenprodus;
	}
	
	public List<EstadoOrdenProdu> getestadoordenprodusAux() {
		return this.estadoordenprodusAux;
	}

	public void setestadoordenprodusAux(List<EstadoOrdenProdu> estadoordenprodusAux) {
		this.estadoordenprodusAux = estadoordenprodusAux;
	}
	
	public List<EstadoOrdenProdu> getestadoordenprodusEliminados() {
		return this.estadoordenprodusEliminados;
	}

	public void setEstadoOrdenProdusEliminados(List<EstadoOrdenProdu> estadoordenprodusEliminados) {
		this.estadoordenprodusEliminados = estadoordenprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoOrdenProdu() {
		return jComboBoxTiposSeleccionarEstadoOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoOrdenProdu(
			JComboBox jComboBoxTiposSeleccionarEstadoOrdenProdu) {
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu = jComboBoxTiposSeleccionarEstadoOrdenProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoOrdenProdu() {
		return jTextFieldValorCampoGeneralEstadoOrdenProdu;
	}

	public void setjTextFieldValorCampoGeneralEstadoOrdenProdu(
			JTextField jTextFieldValorCampoGeneralEstadoOrdenProdu) {
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu = jTextFieldValorCampoGeneralEstadoOrdenProdu;
	}

	public void setBorderResaltarValorCampoGeneralEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoOrdenProdu() {
		return this.jCheckBoxSeleccionarTodosEstadoOrdenProdu;
	}

	public void setjCheckBoxSeleccionarTodosEstadoOrdenProdu(
			JCheckBox jCheckBoxSeleccionarTodosEstadoOrdenProdu) {
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu = jCheckBoxSeleccionarTodosEstadoOrdenProdu;
	}

	public void setBorderResaltarSeleccionarTodosEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoOrdenProdu() {
		return this.jCheckBoxSeleccionadosEstadoOrdenProdu;
	}

	public void setjCheckBoxSeleccionadosEstadoOrdenProdu(
			JCheckBox jCheckBoxSeleccionadosEstadoOrdenProdu) {
		this.jCheckBoxSeleccionadosEstadoOrdenProdu = jCheckBoxSeleccionadosEstadoOrdenProdu;
	}
	
	public void setBorderResaltarSeleccionadosEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoOrdenProdu() {
		return this.jComboBoxTiposArchivosReportesEstadoOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoOrdenProdu(
			JComboBox jComboBoxTiposArchivosReportesEstadoOrdenProdu) {
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu = jComboBoxTiposArchivosReportesEstadoOrdenProdu;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoOrdenProdu() {
		return this.jComboBoxTiposReportesEstadoOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoOrdenProdu(
			JComboBox jComboBoxTiposReportesEstadoOrdenProdu) {
		this.jComboBoxTiposReportesEstadoOrdenProdu = jComboBoxTiposReportesEstadoOrdenProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoOrdenProdu() {
	//	return jComboBoxTiposReportesDinamicoEstadoOrdenProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoOrdenProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoOrdenProdu) {
	//	this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu = jComboBoxTiposReportesDinamicoEstadoOrdenProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu = jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu;
	//}
	
	public void setBorderResaltarTiposReportesEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoOrdenProdu() {
		return this.jComboBoxTiposGraficosReportesEstadoOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoOrdenProdu(
			JComboBox jComboBoxTiposGraficosReportesEstadoOrdenProdu) {
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu = jComboBoxTiposGraficosReportesEstadoOrdenProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoOrdenProdu() {
		return this.jComboBoxTiposPaginacionEstadoOrdenProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoOrdenProdu(
			JComboBox jComboBoxTiposPaginacionEstadoOrdenProdu) {
		this.jComboBoxTiposPaginacionEstadoOrdenProdu = jComboBoxTiposPaginacionEstadoOrdenProdu;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoOrdenProdu() {
		return this.jComboBoxTiposRelacionesEstadoOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoOrdenProdu() {
		return this.jComboBoxTiposAccionesEstadoOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoOrdenProdu(
			JComboBox jComboBoxTiposRelacionesEstadoOrdenProdu) {
		this.jComboBoxTiposRelacionesEstadoOrdenProdu = jComboBoxTiposRelacionesEstadoOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoOrdenProdu(
			JComboBox jComboBoxTiposAccionesEstadoOrdenProdu) {
		this.jComboBoxTiposAccionesEstadoOrdenProdu = jComboBoxTiposAccionesEstadoOrdenProdu;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoOrdenProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoOrdenProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoOrdenProdu() {
	//	return jCheckBoxConGraficoDinamicoEstadoOrdenProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoOrdenProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoOrdenProdu) {
	//	this.jCheckBoxConGraficoDinamicoEstadoOrdenProdu = jCheckBoxConGraficoDinamicoEstadoOrdenProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoOrdenProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoOrdenProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoOrdenProdu .setBorder(borderResaltar);		
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
		this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
		
		this.estadoordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoordenproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoOrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoOrdenProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Orden Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoOrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoOrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoOrdenProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"nuevo","nuevo","Nuevo"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"duplicar","duplicar","Duplicar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"copiar","copiar","Copiar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"ver_form","ver_form","Ver"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"recargar","recargar","Recargar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,
							"cerrar","cerrar","Salir"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoOrdenProdu;
			
				this.jButtonProcesarInformacionToolBarEstadoOrdenProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoOrdenProdu;
				
		//protected JButton jButtonModificarToolBarEstadoOrdenProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoOrdenProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoOrdenProdu=new JMenuMe("General");
		this.jmenuArchivoEstadoOrdenProdu=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoOrdenProdu=new JMenuMe("Acciones");
		this.jmenuDatosEstadoOrdenProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoOrdenProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoOrdenProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoOrdenProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoOrdenProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoOrdenProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoOrdenProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoOrdenProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoOrdenProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoOrdenProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoOrdenProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoOrdenProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoOrdenProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoOrdenProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoOrdenProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoOrdenProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoOrdenProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoOrdenProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoOrdenProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoOrdenProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoOrdenProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoOrdenProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoOrdenProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoOrdenProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoOrdenProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoOrdenProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoOrdenProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoOrdenProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoOrdenProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoOrdenProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoOrdenProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoOrdenProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoOrdenProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoOrdenProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoOrdenProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoOrdenProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoOrdenProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoOrdenProdu.add(this.jMenuItemCerrarEstadoOrdenProdu);
			
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemNuevoEstadoOrdenProdu);
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu);
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemNuevoRelacionesEstadoOrdenProdu);
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu);		
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemDuplicarEstadoOrdenProdu);		
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemCopiarEstadoOrdenProdu);		
			this.jmenuAccionesEstadoOrdenProdu.add(this.jMenuItemVerFormEstadoOrdenProdu);		
			
			this.jmenuDatosEstadoOrdenProdu.add(this.jMenuItemRecargarInformacionEstadoOrdenProdu);				
			this.jmenuDatosEstadoOrdenProdu.add(this.jMenuItemAnterioresEstadoOrdenProdu);				
			this.jmenuDatosEstadoOrdenProdu.add(this.jMenuItemSiguientesEstadoOrdenProdu);				
			this.jmenuDatosEstadoOrdenProdu.add(this.jMenuItemAbrirOrderByEstadoOrdenProdu);				
			this.jmenuDatosEstadoOrdenProdu.add(this.jMenuItemMostrarOcultarEstadoOrdenProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoOrdenProdu.add(this.jMenuItemGuardarCambiosEstadoOrdenProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoOrdenProdu.add(this.jmenuArchivoEstadoOrdenProdu);		
			this.jmenuBarEstadoOrdenProdu.add(this.jmenuAccionesEstadoOrdenProdu);		
			this.jmenuBarEstadoOrdenProdu.add(this.jmenuDatosEstadoOrdenProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoOrdenProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoOrdenProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleEstadoOrdenProdu = new EstadoOrdenProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Orden Produccion DATOS");
			this.jInternalFrameDetalleFormEstadoOrdenProdu = new EstadoOrdenProduDetalleFormJInternalFrame(jDesktopPane,this.estadoordenproduSessionBean.getConGuardarRelaciones(),this.estadoordenproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoOrdenProdu = null;//new EstadoOrdenProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoOrdenProdu= new GridBagLayout();
		
		
		this.jTableDatosEstadoOrdenProdu = new JTableMe();      
		
		String sToolTipEstadoOrdenProdu="";
		sToolTipEstadoOrdenProdu=EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoOrdenProdu+="(Produccion.EstadoOrdenProdu)";
		}
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoOrdenProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoOrdenProdu.setToolTipText(sToolTipEstadoOrdenProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoOrdenProdu);
		this.jTableDatosEstadoOrdenProdu.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoOrdenProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoOrdenProdu.setRowSelectionAllowed(true);
		this.jTableDatosEstadoOrdenProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoOrdenProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoOrdenProdu = new JButtonMe();
		this.jButtonDuplicarEstadoOrdenProdu = new JButtonMe();
		this.jButtonCopiarEstadoOrdenProdu = new JButtonMe();
		this.jButtonVerFormEstadoOrdenProdu = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoOrdenProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu = new JButtonMe();
		this.jButtonCerrarEstadoOrdenProdu = new JButtonMe();
		
		this.jScrollPanelDatosEstadoOrdenProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoOrdenProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Orden Produccion";
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Produccions" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoOrdenProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoOrdenProdu.setToolTipText("Acciones");
        this.jPanelAccionesEstadoOrdenProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoOrdenProdu=new ReporteDinamicoJInternalFrame(EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoOrdenProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoOrdenProdu=new ImportacionJInternalFrame(EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoOrdenProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoOrdenProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoOrdenProdu.setText("Orden");
		this.jButtonAbrirOrderByEstadoOrdenProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoOrdenProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenProdu,false,this);
			
			//this.cargarOrderByEstadoOrdenProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenProdu,true,this);
			
			//this.cargarOrderByEstadoOrdenProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoOrdenProdu.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoOrdenProdu.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoOrdenProdu.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosEstadoOrdenProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoOrdenProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoOrdenProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoOrdenProdu.setText("Nuevo");
		this.jButtonDuplicarEstadoOrdenProdu.setText("Duplicar");
		this.jButtonCopiarEstadoOrdenProdu.setText("Copiar");
		this.jButtonVerFormEstadoOrdenProdu.setText("Ver");
		this.jButtonNuevoRelacionesEstadoOrdenProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.setText("Guardar");
		this.jButtonCerrarEstadoOrdenProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoOrdenProdu,"nuevo_button","Nuevo",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoOrdenProdu,"duplicar_button","Duplicar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoOrdenProdu,"copiar_button","Copiar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoOrdenProdu,"ver_form","Ver",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoOrdenProdu,"nuevorelaciones_button","Nuevo Rel",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoOrdenProdu,"guardarcambiostabla_button","Guardar",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoOrdenProdu,"cerrar_button","Salir",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoOrdenProdu.setToolTipText("Nuevo"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoOrdenProdu.setToolTipText("Duplicar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoOrdenProdu.setToolTipText("Copiar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoOrdenProdu.setToolTipText("Ver"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoOrdenProdu.setToolTipText("Nuevo Rel"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.setToolTipText("Guardar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoOrdenProdu.setToolTipText("Salir"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoOrdenProdu";
		inputMap = this.jButtonNuevoEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoOrdenProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoOrdenProdu";
		inputMap = this.jButtonDuplicarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoOrdenProdu"));
		
		//COPIAR
		sMapKey = "CopiarEstadoOrdenProdu";
		inputMap = this.jButtonCopiarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoOrdenProdu"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoOrdenProdu";
		inputMap = this.jButtonVerFormEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoOrdenProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoOrdenProdu";
		inputMap = this.jButtonNuevoRelacionesEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoOrdenProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoOrdenProdu";
		inputMap = this.jButtonModificarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoOrdenProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoOrdenProdu";
		inputMap = this.jButtonCerrarEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoOrdenProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoOrdenProdu";
		inputMap = this.jButtonGuardarCambiosTablaEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoOrdenProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoOrdenProdu.setName("jPanelParametrosReportesEstadoOrdenProdu"); 
		
		this.jPanelParametrosReportesAccionesEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoOrdenProdu.setName("jPanelParametrosReportesAccionesEstadoOrdenProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoOrdenProdu = new JButtonMe();
		this.jButtonRecargarInformacionEstadoOrdenProdu.setText("Recargar");
		this.jButtonRecargarInformacionEstadoOrdenProdu.setToolTipText("Recargar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoOrdenProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoOrdenProdu = new JButtonMe();
		this.jButtonProcesarInformacionEstadoOrdenProdu.setText("Procesar");
		this.jButtonProcesarInformacionEstadoOrdenProdu.setToolTipText("Procesar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoOrdenProdu.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoOrdenProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoOrdenProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoOrdenProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoOrdenProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoOrdenProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoOrdenProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoOrdenProdu.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoOrdenProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoOrdenProdu.setText("Accion");
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoOrdenProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoOrdenProdu = new JLabelMe();
		
		this.jLabelAccionesEstadoOrdenProdu.setText("Acciones");		
		this.jLabelAccionesEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoOrdenProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoOrdenProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoOrdenProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoOrdenProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoOrdenProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoOrdenProdu = new JButtonMe();
		//this.jButtonAnterioresEstadoOrdenProdu.setText("<<");
        this.jButtonAnterioresEstadoOrdenProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoOrdenProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoOrdenProdu = new JButtonMe();
		//this.jButtonSiguientesEstadoOrdenProdu.setText(">>");
        this.jButtonSiguientesEstadoOrdenProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoOrdenProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoOrdenProdu,"nuevoguardarcambios_button","Nue",this.estadoordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoOrdenProdu";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoOrdenProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoOrdenProdu";
		inputMap = this.jButtonRecargarInformacionEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoOrdenProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoOrdenProdu";
		inputMap = this.jButtonSiguientesEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoOrdenProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoOrdenProdu";
		inputMap = this.jButtonAnterioresEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoOrdenProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoOrdenProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoOrdenProdu.setMinimumSize(new Dimension(this.getWidth(),EstadoOrdenProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoOrdenProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoOrdenProdu.setMaximumSize(new Dimension(this.getWidth(),EstadoOrdenProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoOrdenProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoOrdenProdu.setPreferredSize(new Dimension(this.getWidth(),EstadoOrdenProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoOrdenProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoOrdenProdu = new GridBagLayout();

			this.jPanelPaginacionEstadoOrdenProdu.setLayout(gridaBagLayoutPaginacionEstadoOrdenProdu);						
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonAnterioresEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
					
						
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
			
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonNuevoGuardarCambiosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
						
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonSiguientesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonNuevoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
				this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonNuevoRelacionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			}
			
			
			if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
				this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonGuardarCambiosTablaEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			}
			
			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonDuplicarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonCopiarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonVerFormEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 1;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoOrdenProdu.add(this.jButtonCerrarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
		
		
		this.jButtonRecargarInformacionEstadoOrdenProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoOrdenProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoOrdenProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoOrdenProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoOrdenProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoOrdenProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoOrdenProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoOrdenProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoOrdenProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoOrdenProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoOrdenProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoOrdenProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoOrdenProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoOrdenProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoOrdenProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoOrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoOrdenProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoOrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoOrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoOrdenProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoOrdenProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoOrdenProdu.setLayout(gridaBagParametrosReportesEstadoOrdenProdu);
			this.jPanelParametrosReportesAccionesEstadoOrdenProdu.setLayout(gridaBagParametrosReportesAccionesEstadoOrdenProdu);
			
			
			this.jPanelParametrosAuxiliar1EstadoOrdenProdu.setLayout(gridaBagParametrosAuxiliar1EstadoOrdenProdu);
			this.jPanelParametrosAuxiliar2EstadoOrdenProdu.setLayout(gridaBagParametrosAuxiliar2EstadoOrdenProdu);
			this.jPanelParametrosAuxiliar3EstadoOrdenProdu.setLayout(gridaBagParametrosAuxiliar3EstadoOrdenProdu);
			this.jPanelParametrosAuxiliar4EstadoOrdenProdu.setLayout(gridaBagParametrosAuxiliar4EstadoOrdenProdu);
			//this.jPanelParametrosAuxiliar5EstadoOrdenProdu.setLayout(gridaBagParametrosAuxiliar2EstadoOrdenProdu);			
			
			
			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jButtonRecargarInformacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoOrdenProdu.add(this.jComboBoxTiposPaginacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoOrdenProdu.add(this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoOrdenProdu.add(this.jComboBoxTiposArchivosReportesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jPanelParametrosAuxiliar1EstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoOrdenProdu.add(this.jComboBoxTiposReportesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jPanelParametrosAuxiliar4EstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jComboBoxTiposReportesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jCheckBoxGenerarReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jPanelParametrosAuxiliar2EstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jLabelAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jButtonAbrirOrderByEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jComboBoxTiposSeleccionarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
			
			
			/*
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jCheckBoxSeleccionarTodosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoOrdenProdu.add(this.jCheckBoxSeleccionarTodosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);															
				
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoOrdenProdu.add(this.jCheckBoxSeleccionadosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jPanelParametrosAuxiliar3EstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jComboBoxTiposRelacionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
				
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenProdu.add(this.jComboBoxTiposAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoOrdenProdu = new GridBagLayout();

			this.jScrollPanelDatosEstadoOrdenProdu.setLayout(gridaBagLayoutDatosEstadoOrdenProdu);
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
			
			this.jScrollPanelDatosEstadoOrdenProdu.add(this.jTableDatosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoOrdenProdu.setViewportView(this.jTableDatosEstadoOrdenProdu);
		this.jTableDatosEstadoOrdenProdu.setFillsViewportHeight(true);
		this.jTableDatosEstadoOrdenProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoOrdenProdu= new GridBagLayout();
		this.jPanelAccionesEstadoOrdenProdu.setLayout(gridaBagLayoutAccionesEstadoOrdenProdu);
		
		
		/*	
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = 0;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
			
		this.jPanelAccionesEstadoOrdenProdu.add(this.jButtonNuevoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoOrdenProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoOrdenProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();						
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;		
			//this.gridBagConstraintsEstadoOrdenProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoOrdenProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;		
		//this.gridBagConstraintsEstadoOrdenProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoOrdenProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoOrdenProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);								
		
		
		/*
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		*/		
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoOrdenProdu.gridx =0;
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoOrdenProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
				
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoOrdenProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoOrdenProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoOrdenProdu.setLayout(gridaBagLayoutBusquedasParametrosEstadoOrdenProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoOrdenProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
			
			
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
			
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoOrdenProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoOrdenProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoOrdenProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoOrdenProdu.setName("jPanelReporteDinamicoEstadoOrdenProdu"); 
		
		this.jPanelReporteDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoOrdenProdu.setLayout(gridaBagLayoutReporteDinamicoEstadoOrdenProdu);
		
		
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoOrdenProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoOrdenProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Produccions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoOrdenProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoOrdenProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jLabelColumnasSelectReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoOrdenProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoOrdenProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoOrdenProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoOrdenProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoOrdenProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoOrdenProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoOrdenProdu=new JScrollPane(this.jListColumnasSelectReporteEstadoOrdenProdu);
			
			this.jScrollColumnasSelectReporteEstadoOrdenProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoOrdenProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoOrdenProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jListColumnasSelectReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jScrollColumnasSelectReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoOrdenProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoOrdenProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jLabelRelacionesSelectReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoOrdenProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoOrdenProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoOrdenProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoOrdenProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoOrdenProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoOrdenProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoOrdenProdu=new JScrollPane(this.jListRelacionesSelectReporteEstadoOrdenProdu);
			
			this.jScrollRelacionesSelectReporteEstadoOrdenProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoOrdenProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoOrdenProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jListRelacionesSelectReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jScrollRelacionesSelectReporteEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoOrdenProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoOrdenProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoOrdenProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jLabelGenerarExcelReporteDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu.setToolTipText("Generar EXCEL"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jComboBoxTiposReportesDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jLabelTiposArchivoReporteDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoOrdenProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoOrdenProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoOrdenProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoOrdenProdu.setToolTipText("Generar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jButtonGenerarReporteDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoOrdenProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoOrdenProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoOrdenProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoOrdenProdu.setToolTipText("Cancelar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenProdu.add(this.jButtonCerrarReporteDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoOrdenProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoOrdenProdu= new JScrollPane(jPanelReporteDinamicoEstadoOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Produccions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoOrdenProdu);
		this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoOrdenProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoOrdenProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoOrdenProdu.setName("jPanelImportacionEstadoOrdenProdu"); 
		
		this.jPanelImportacionEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoOrdenProdu.setLayout(gridaBagLayoutImportacionEstadoOrdenProdu);
		
		
		this.jInternalFrameImportacionEstadoOrdenProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoOrdenProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoOrdenProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoOrdenProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoOrdenProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoOrdenProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoOrdenProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoOrdenProdu.setResizable(true);
	    this.jInternalFrameImportacionEstadoOrdenProdu.setClosable(true);
	    this.jInternalFrameImportacionEstadoOrdenProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoOrdenProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoOrdenProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoOrdenProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoOrdenProdu.setResizable(true);
	    this.jInternalFrameImportacionEstadoOrdenProdu.setClosable(true);
	    this.jInternalFrameImportacionEstadoOrdenProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Produccions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoOrdenProdu = new JLabelMe();

		this.jLabelArchivoImportacionEstadoOrdenProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoOrdenProdu.add(this.jLabelArchivoImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoOrdenProdu = new JFileChooser();		
		this.jFileChooserImportacionEstadoOrdenProdu.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoOrdenProdu = new JButtonMe();
		this.jButtonAbrirImportacionEstadoOrdenProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoOrdenProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoOrdenProdu.setToolTipText("Generar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenProdu.add(this.jButtonAbrirImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoOrdenProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoOrdenProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoOrdenProdu.add(this.jLabelPathArchivoImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoOrdenProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoOrdenProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoOrdenProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoOrdenProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenProdu.add(this.jTextFieldPathArchivoImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoOrdenProdu = new JButtonMe();
		this.jButtonGenerarImportacionEstadoOrdenProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoOrdenProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoOrdenProdu.setToolTipText("Generar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenProdu.add(this.jButtonGenerarImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoOrdenProdu = new JButtonMe();
		this.jButtonCerrarImportacionEstadoOrdenProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoOrdenProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoOrdenProdu.setToolTipText("Cancelar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenProdu.add(this.jButtonCerrarImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoOrdenProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoOrdenProdu= new JScrollPane(jPanelImportacionEstadoOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoOrdenProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoOrdenProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoOrdenProdu);
		this.jInternalFrameImportacionEstadoOrdenProdu.getContentPane().add(this.jScrollPanelImportacionEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoOrdenProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoOrdenProdu = new JButtonMe();
			this.jButtonAbrirOrderByEstadoOrdenProdu.setText("Orden");
			this.jButtonAbrirOrderByEstadoOrdenProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoOrdenProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoOrdenProdu";
			inputMap = this.jButtonAbrirOrderByEstadoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoOrdenProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoOrdenProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoOrdenProdu.setName("jPanelOrderByEstadoOrdenProdu"); 
			
			this.jPanelOrderByEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoOrdenProdu.setLayout(gridaBagLayoutOrderByEstadoOrdenProdu);
			
			
			this.jTableDatosEstadoOrdenProduOrderBy = new JTableMe();        
			this.jTableDatosEstadoOrdenProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoOrdenProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoOrdenProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoOrdenProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoOrdenProduOrderBy.setViewportView(this.jTableDatosEstadoOrdenProduOrderBy);
			this.jTableDatosEstadoOrdenProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoOrdenProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoOrdenProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoOrdenProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoOrdenProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoOrdenProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoOrdenProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoOrdenProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoOrdenProdu.setTitle("Orden");
			this.jInternalFrameOrderByEstadoOrdenProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoOrdenProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoOrdenProdu.setResizable(true);
			this.jInternalFrameOrderByEstadoOrdenProdu.setClosable(true);
			this.jInternalFrameOrderByEstadoOrdenProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Produccions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoOrdenProdu.ipady =150;
				
			this.jPanelOrderByEstadoOrdenProdu.add(jScrollPanelDatosEstadoOrdenProduOrderBy, this.gridBagConstraintsEstadoOrdenProdu);//this.jTableDatosEstadoOrdenProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoOrdenProdu = new JButtonMe();
			this.jButtonCerrarOrderByEstadoOrdenProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoOrdenProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoOrdenProdu.setToolTipText("Cancelar"+" "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoOrdenProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoOrdenProdu.add(this.jButtonCerrarOrderByEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoOrdenProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoOrdenProdu= new JScrollPane(jPanelOrderByEstadoOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoOrdenProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoOrdenProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoOrdenProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoOrdenProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoOrdenProdu);
			
			this.jInternalFrameOrderByEstadoOrdenProdu.getContentPane().add(this.jScrollPanelOrderByEstadoOrdenProdu, this.gridBagConstraintsEstadoOrdenProdu);			
		
		} else {
			this.jButtonAbrirOrderByEstadoOrdenProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoordenproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoOrdenProdu.getRowHeight();//EstadoOrdenProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.isSelected()) {
					iHeightTable=EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoOrdenProdu.isSelected()) {
					iHeightTable=EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoOrdenProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoOrdenProdu!=null && this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoOrdenProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoOrdenProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoOrdenProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoOrdenProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoOrdenProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoOrdenProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoordenproduLogic.getEstadoOrdenProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoordenprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoOrdenProdu> TraerEstadoOrdenProduBeans(List<EstadoOrdenProdu> estadoordenprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoOrdenProdu estadoordenprodu:estadoordenprodus) {
					
				if(!(EstadoOrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoOrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoordenprodu.setsDetalleGeneralEntityReporte(EstadoOrdenProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenprodu));
										
						
					
					

					if(estadoordenprodu.getPedidoProdus()!=null && Funciones.existeClass(classes,PedidoProdu.class)) {
						try{estadoordenprodu.setpedidoprodusDescripcionReporte(new JRBeanCollectionDataSource(PedidoProduJInternalFrame.TraerPedidoProduBeans(estadoordenprodu.getPedidoProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoordenprodu.setsDetalleGeneralEntityReporte(estadoordenprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoordenprodubeans.add(estadoordenprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoordenprodus;
    }
	//PARA REPORTES FIN
}
