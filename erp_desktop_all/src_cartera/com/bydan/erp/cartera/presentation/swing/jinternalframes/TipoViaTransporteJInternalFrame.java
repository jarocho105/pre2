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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoViaTransporteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoViaTransporteJInternalFrame extends TipoViaTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoViaTransporte;
	
	protected JMenuBar jmenuBarTipoViaTransporte;
	
	protected JMenu jmenuTipoViaTransporte;
	protected JMenu jmenuDatosTipoViaTransporte;
	protected JMenu jmenuArchivoTipoViaTransporte;
	protected JMenu jmenuAccionesTipoViaTransporte;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoViaTransporte;	
	protected GridBagConstraints gridBagConstraintsTipoViaTransporte;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoViaTransporteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoViaTransporte;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoViaTransporte;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoViaTransporte;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoViaTransporte> tipoviatransportes;		
	public List<TipoViaTransporte> tipoviatransportesEliminados;	
	public List<TipoViaTransporte> tipoviatransportesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoViaTransporte;		
	protected JButton jButtonAbrirOrderByTipoViaTransporte;
	
	
	//protected JPanel jPanelOrderByTipoViaTransporte;
	//public JScrollPane jScrollPanelOrderByTipoViaTransporte;	
	//protected JButton jButtonCerrarOrderByTipoViaTransporte;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoViaTransporteLogic tipoviatransporteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoViaTransporte;
	public JScrollPane jScrollPanelDatosEdicionTipoViaTransporte;
	public JScrollPane jScrollPanelDatosGeneralTipoViaTransporte;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoViaTransporteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoViaTransporte;
	//public JScrollPane jScrollPanelImportacionTipoViaTransporte;
	
	
	
	protected JPanel jPanelAccionesTipoViaTransporte;
	
    protected JPanel jPanelPaginacionTipoViaTransporte;
    protected JPanel jPanelParametrosReportesTipoViaTransporte;
	protected JPanel jPanelParametrosReportesAccionesTipoViaTransporte;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoViaTransporte;
	protected JPanel jPanelParametrosAuxiliar2TipoViaTransporte;
	protected JPanel jPanelParametrosAuxiliar3TipoViaTransporte;
	protected JPanel jPanelParametrosAuxiliar4TipoViaTransporte;
	//protected JPanel jPanelParametrosAuxiliar5TipoViaTransporte;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoViaTransporte;
	//protected JPanel jPanelImportacionTipoViaTransporte;
	
	
	public JTable jTableDatosTipoViaTransporte;
	
	
	
	//public JTable jTableDatosTipoViaTransporteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoViaTransporte;
	protected JButton jButtonDuplicarTipoViaTransporte;
	protected JButton jButtonCopiarTipoViaTransporte;
	protected JButton jButtonVerFormTipoViaTransporte;
	protected JButton jButtonNuevoRelacionesTipoViaTransporte;
	protected JButton jButtonModificarTipoViaTransporte;
	
    protected JButton jButtonGuardarCambiosTablaTipoViaTransporte;
	protected JButton jButtonCerrarTipoViaTransporte;
	
	
	protected JButton jButtonRecargarInformacionTipoViaTransporte;
	protected JButton jButtonProcesarInformacionTipoViaTransporte;
	
	
	protected JButton jButtonAnterioresTipoViaTransporte;
	protected JButton jButtonSiguientesTipoViaTransporte;
	protected JButton jButtonNuevoGuardarCambiosTipoViaTransporte;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoViaTransporte;
	//protected JButton jButtonCerrarReporteDinamicoTipoViaTransporte;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoViaTransporte;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoViaTransporte;
	//protected JButton jButtonGenerarImportacionTipoViaTransporte;
	//protected JButton jButtonCerrarImportacionTipoViaTransporte;
	//protected JFileChooser jFileChooserImportacionTipoViaTransporte;
	//protected File fileImportacionTipoViaTransporte;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoViaTransporte;
	protected JButton jButtonDuplicarToolBarTipoViaTransporte;
	protected JButton jButtonNuevoRelacionesToolBarTipoViaTransporte;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoViaTransporte;
	protected JButton jButtonCopiarToolBarTipoViaTransporte;
	protected JButton jButtonVerFormToolBarTipoViaTransporte;
	public JButton jButtonGuardarCambiosTablaToolBarTipoViaTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoViaTransporte;
	protected JButton jButtonCerrarToolBarTipoViaTransporte;
	
	protected JButton jButtonRecargarInformacionToolBarTipoViaTransporte;
	protected JButton jButtonProcesarInformacionToolBarTipoViaTransporte;
	protected JButton jButtonAnterioresToolBarTipoViaTransporte;
	protected JButton jButtonSiguientesToolBarTipoViaTransporte;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoViaTransporte;
	protected JButton jButtonAbrirOrderByToolBarTipoViaTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoViaTransporte;
	protected JMenuItem jMenuItemDuplicarTipoViaTransporte;
	protected JMenuItem jMenuItemNuevoRelacionesTipoViaTransporte;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoViaTransporte;
	protected JMenuItem jMenuItemCopiarTipoViaTransporte;
	protected JMenuItem jMenuItemVerFormTipoViaTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoViaTransporte;
	protected JMenuItem jMenuItemCerrarTipoViaTransporte;
	protected JMenuItem jMenuItemDetalleCerrarTipoViaTransporte;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoViaTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoViaTransporte;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoViaTransporte;
	protected JMenuItem jMenuItemProcesarInformacionTipoViaTransporte;
	protected JMenuItem jMenuItemAnterioresTipoViaTransporte;
	protected JMenuItem jMenuItemSiguientesTipoViaTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoViaTransporte;
	protected JMenuItem jMenuItemAbrirOrderByTipoViaTransporte;
	protected JMenuItem jMenuItemMostrarOcultarTipoViaTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoViaTransporte;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoViaTransporte;
	protected JCheckBox jCheckBoxSeleccionadosTipoViaTransporte;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoViaTransporte;
	protected JCheckBox jCheckBoxConGraficoReporteTipoViaTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoViaTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoViaTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoViaTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoViaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoViaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoViaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoViaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoViaTransporte;
	protected JTextField jTextFieldValorCampoGeneralTipoViaTransporte;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoViaTransporte;
	//public JList<Reporte> jListColumnasSelectReporteTipoViaTransporte;
	//public JScrollPane jScrollColumnasSelectReporteTipoViaTransporte;
	
	//public JLabel jLabelRelacionesSelectReporteTipoViaTransporte;
	//public JList<Reporte> jListRelacionesSelectReporteTipoViaTransporte;
	//public JScrollPane jScrollRelacionesSelectReporteTipoViaTransporte;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoViaTransporte;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoViaTransporte;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoViaTransporte;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoViaTransporte;
	
		
	//public JLabel jLabelArchivoImportacionTipoViaTransporte;	
	//public JLabel jLabelPathArchivoImportacionTipoViaTransporte;
	//protected JTextField jTextFieldPathArchivoImportacionTipoViaTransporte;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoViaTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoViaTransporte;
	
	//public JLabel jLabelColumnaCategoriaValorTipoViaTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoViaTransporte;
	
	//public JLabel jLabelColumnasValoresGraficoTipoViaTransporte;
	//public JList<Reporte> jListColumnasValoresGraficoTipoViaTransporte;
	//public JScrollPane jScrollColumnasValoresGraficoTipoViaTransporte;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoViaTransporte;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoViaTransporte;	
	
	
	
	
	
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
	public TipoViaTransporteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoViaTransporte)	{
		this.jButtonRecargarInformacionTipoViaTransporte = jButtonRecargarInformacionTipoViaTransporte;
	}
	
	public JButton getjButtonProcesarInformacionTipoViaTransporte() {
		return this.jButtonProcesarInformacionTipoViaTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoViaTransporte)	{
		this.jButtonProcesarInformacionTipoViaTransporte = jButtonProcesarInformacionTipoViaTransporte;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoViaTransporte() {
		return this.jButtonRecargarInformacionTipoViaTransporte;
	}
	
	
	public List<TipoViaTransporte> gettipoviatransportes() {
		return this.tipoviatransportes;
	}

	public void settipoviatransportes(List<TipoViaTransporte> tipoviatransportes) {
		this.tipoviatransportes = tipoviatransportes;
	}
	
	public List<TipoViaTransporte> gettipoviatransportesAux() {
		return this.tipoviatransportesAux;
	}

	public void settipoviatransportesAux(List<TipoViaTransporte> tipoviatransportesAux) {
		this.tipoviatransportesAux = tipoviatransportesAux;
	}
	
	public List<TipoViaTransporte> gettipoviatransportesEliminados() {
		return this.tipoviatransportesEliminados;
	}

	public void setTipoViaTransportesEliminados(List<TipoViaTransporte> tipoviatransportesEliminados) {
		this.tipoviatransportesEliminados = tipoviatransportesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoViaTransporte() {
		return jComboBoxTiposSeleccionarTipoViaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoViaTransporte(
			JComboBox jComboBoxTiposSeleccionarTipoViaTransporte) {
		this.jComboBoxTiposSeleccionarTipoViaTransporte = jComboBoxTiposSeleccionarTipoViaTransporte;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoViaTransporte() {
		return jTextFieldValorCampoGeneralTipoViaTransporte;
	}

	public void setjTextFieldValorCampoGeneralTipoViaTransporte(
			JTextField jTextFieldValorCampoGeneralTipoViaTransporte) {
		this.jTextFieldValorCampoGeneralTipoViaTransporte = jTextFieldValorCampoGeneralTipoViaTransporte;
	}

	public void setBorderResaltarValorCampoGeneralTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoViaTransporte .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoViaTransporte() {
		return this.jCheckBoxSeleccionarTodosTipoViaTransporte;
	}

	public void setjCheckBoxSeleccionarTodosTipoViaTransporte(
			JCheckBox jCheckBoxSeleccionarTodosTipoViaTransporte) {
		this.jCheckBoxSeleccionarTodosTipoViaTransporte = jCheckBoxSeleccionarTodosTipoViaTransporte;
	}

	public void setBorderResaltarSeleccionarTodosTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoViaTransporte() {
		return this.jCheckBoxSeleccionadosTipoViaTransporte;
	}

	public void setjCheckBoxSeleccionadosTipoViaTransporte(
			JCheckBox jCheckBoxSeleccionadosTipoViaTransporte) {
		this.jCheckBoxSeleccionadosTipoViaTransporte = jCheckBoxSeleccionadosTipoViaTransporte;
	}
	
	public void setBorderResaltarSeleccionadosTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoViaTransporte() {
		return this.jComboBoxTiposArchivosReportesTipoViaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoViaTransporte(
			JComboBox jComboBoxTiposArchivosReportesTipoViaTransporte) {
		this.jComboBoxTiposArchivosReportesTipoViaTransporte = jComboBoxTiposArchivosReportesTipoViaTransporte;
	}

	public void setBorderResaltarTiposArchivosReportesTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoViaTransporte() {
		return this.jComboBoxTiposReportesTipoViaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoViaTransporte(
			JComboBox jComboBoxTiposReportesTipoViaTransporte) {
		this.jComboBoxTiposReportesTipoViaTransporte = jComboBoxTiposReportesTipoViaTransporte;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoViaTransporte() {
	//	return jComboBoxTiposReportesDinamicoTipoViaTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoViaTransporte(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoViaTransporte) {
	//	this.jComboBoxTiposReportesDinamicoTipoViaTransporte = jComboBoxTiposReportesDinamicoTipoViaTransporte;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoViaTransporte() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoViaTransporte(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte = jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte;
	//}
	
	public void setBorderResaltarTiposReportesTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoViaTransporte() {
		return this.jComboBoxTiposGraficosReportesTipoViaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoViaTransporte(
			JComboBox jComboBoxTiposGraficosReportesTipoViaTransporte) {
		this.jComboBoxTiposGraficosReportesTipoViaTransporte = jComboBoxTiposGraficosReportesTipoViaTransporte;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoViaTransporte() {
		return this.jComboBoxTiposPaginacionTipoViaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoViaTransporte(
			JComboBox jComboBoxTiposPaginacionTipoViaTransporte) {
		this.jComboBoxTiposPaginacionTipoViaTransporte = jComboBoxTiposPaginacionTipoViaTransporte;
	}
	
	public void setBorderResaltarTiposPaginacionTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoViaTransporte() {
		return this.jComboBoxTiposRelacionesTipoViaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoViaTransporte() {
		return this.jComboBoxTiposAccionesTipoViaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoViaTransporte(
			JComboBox jComboBoxTiposRelacionesTipoViaTransporte) {
		this.jComboBoxTiposRelacionesTipoViaTransporte = jComboBoxTiposRelacionesTipoViaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoViaTransporte(
			JComboBox jComboBoxTiposAccionesTipoViaTransporte) {
		this.jComboBoxTiposAccionesTipoViaTransporte = jComboBoxTiposAccionesTipoViaTransporte;
	}
	
	public void setBorderResaltarTiposRelacionesTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoViaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoViaTransporte .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoViaTransporte() {
	//	return jCheckBoxConGraficoDinamicoTipoViaTransporte;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoViaTransporte(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoViaTransporte) {
	//	this.jCheckBoxConGraficoDinamicoTipoViaTransporte = jCheckBoxConGraficoDinamicoTipoViaTransporte;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoViaTransporte() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoViaTransporte.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoViaTransporte .setBorder(borderResaltar);		
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
		this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
		
		this.tipoviatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoviatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoviatransporteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoViaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoViaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoViaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoViaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoViaTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Via Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoViaTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoViaTransporte= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"nuevo","nuevo","Nuevo"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"duplicar","duplicar","Duplicar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"copiar","copiar","Copiar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"ver_form","ver_form","Ver"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"recargar","recargar","Recargar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoViaTransporte,this.jTtoolBarTipoViaTransporte,
							"cerrar","cerrar","Salir"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoViaTransporte=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoViaTransporte;
			
				this.jButtonProcesarInformacionToolBarTipoViaTransporte=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoViaTransporte;
				
		//protected JButton jButtonModificarToolBarTipoViaTransporte;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoViaTransporte=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoViaTransporte=new JMenuMe("General");
		this.jmenuArchivoTipoViaTransporte=new JMenuMe("Archivo");
		this.jmenuAccionesTipoViaTransporte=new JMenuMe("Acciones");
		this.jmenuDatosTipoViaTransporte=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoViaTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoViaTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoViaTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoViaTransporte= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoViaTransporte.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoViaTransporte,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoViaTransporte= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoViaTransporte.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoViaTransporte,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoViaTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoViaTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoViaTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoViaTransporte= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoViaTransporte.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoViaTransporte,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoViaTransporte= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoViaTransporte.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoViaTransporte,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoViaTransporte= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoViaTransporte.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoViaTransporte,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoViaTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoViaTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoViaTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoViaTransporte= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoViaTransporte.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoViaTransporte,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoViaTransporte= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoViaTransporte.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoViaTransporte,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoViaTransporte= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoViaTransporte.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoViaTransporte,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoViaTransporte= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoViaTransporte.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoViaTransporte,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoViaTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoViaTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoViaTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoViaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoViaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoViaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoViaTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoViaTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoViaTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoViaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoViaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoViaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoViaTransporte= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoViaTransporte.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoViaTransporte,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoViaTransporte.add(this.jMenuItemCerrarTipoViaTransporte);
			
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemNuevoTipoViaTransporte);
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemNuevoGuardarCambiosTipoViaTransporte);
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemNuevoRelacionesTipoViaTransporte);
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemGuardarCambiosTablaTipoViaTransporte);		
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemDuplicarTipoViaTransporte);		
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemCopiarTipoViaTransporte);		
			this.jmenuAccionesTipoViaTransporte.add(this.jMenuItemVerFormTipoViaTransporte);		
			
			this.jmenuDatosTipoViaTransporte.add(this.jMenuItemRecargarInformacionTipoViaTransporte);				
			this.jmenuDatosTipoViaTransporte.add(this.jMenuItemAnterioresTipoViaTransporte);				
			this.jmenuDatosTipoViaTransporte.add(this.jMenuItemSiguientesTipoViaTransporte);				
			this.jmenuDatosTipoViaTransporte.add(this.jMenuItemAbrirOrderByTipoViaTransporte);				
			this.jmenuDatosTipoViaTransporte.add(this.jMenuItemMostrarOcultarTipoViaTransporte);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoViaTransporte.add(this.jMenuItemGuardarCambiosTipoViaTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoViaTransporte.add(this.jmenuArchivoTipoViaTransporte);		
			this.jmenuBarTipoViaTransporte.add(this.jmenuAccionesTipoViaTransporte);		
			this.jmenuBarTipoViaTransporte.add(this.jmenuDatosTipoViaTransporte);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoViaTransporte);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoViaTransporte() {
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
			//this.jInternalFrameDetalleTipoViaTransporte = new TipoViaTransporteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Via Transporte DATOS");
			this.jInternalFrameDetalleFormTipoViaTransporte = new TipoViaTransporteDetalleFormJInternalFrame(jDesktopPane,this.tipoviatransporteSessionBean.getConGuardarRelaciones(),this.tipoviatransporteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoViaTransporte = null;//new TipoViaTransporteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoViaTransporte= new GridBagLayout();
		
		
		this.jTableDatosTipoViaTransporte = new JTableMe();      
		
		String sToolTipTipoViaTransporte="";
		sToolTipTipoViaTransporte=TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoViaTransporte+="(Cartera.TipoViaTransporte)";
		}
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoViaTransporte+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoViaTransporte.setToolTipText(sToolTipTipoViaTransporte);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoViaTransporte);
		this.jTableDatosTipoViaTransporte.setAutoCreateRowSorter(true);
		this.jTableDatosTipoViaTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoViaTransporte.setRowSelectionAllowed(true);
		this.jTableDatosTipoViaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoViaTransporte = new JButtonMe();
		this.jButtonDuplicarTipoViaTransporte = new JButtonMe();
		this.jButtonCopiarTipoViaTransporte = new JButtonMe();
		this.jButtonVerFormTipoViaTransporte = new JButtonMe();
		this.jButtonNuevoRelacionesTipoViaTransporte = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte = new JButtonMe();
		this.jButtonCerrarTipoViaTransporte = new JButtonMe();
		
		this.jScrollPanelDatosTipoViaTransporte = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoViaTransporte = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Via Transporte";
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Via Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoViaTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoViaTransporte.setToolTipText("Acciones");
        this.jPanelAccionesTipoViaTransporte.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoViaTransporte=new ReporteDinamicoJInternalFrame(TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoViaTransporte();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoViaTransporte=new ImportacionJInternalFrame(TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoViaTransporte();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoViaTransporte = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoViaTransporte.setText("Orden");
		this.jButtonAbrirOrderByTipoViaTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoViaTransporte,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoViaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoViaTransporte,false,this);
			
			//this.cargarOrderByTipoViaTransporte(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoViaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoViaTransporte,true,this);
			
			//this.cargarOrderByTipoViaTransporte(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoViaTransporte.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoViaTransporte.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoViaTransporte.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoViaTransporte.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoViaTransporte.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoViaTransporte.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoViaTransporte.setText("Nuevo");
		this.jButtonDuplicarTipoViaTransporte.setText("Duplicar");
		this.jButtonCopiarTipoViaTransporte.setText("Copiar");
		this.jButtonVerFormTipoViaTransporte.setText("Ver");
		this.jButtonNuevoRelacionesTipoViaTransporte.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.setText("Guardar");
		this.jButtonCerrarTipoViaTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoViaTransporte,"nuevo_button","Nuevo",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoViaTransporte,"duplicar_button","Duplicar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoViaTransporte,"copiar_button","Copiar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoViaTransporte,"ver_form","Ver",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoViaTransporte,"nuevorelaciones_button","Nuevo Rel",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoViaTransporte,"guardarcambiostabla_button","Guardar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoViaTransporte,"cerrar_button","Salir",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoViaTransporte.setToolTipText("Nuevo"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoViaTransporte.setToolTipText("Duplicar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoViaTransporte.setToolTipText("Copiar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoViaTransporte.setToolTipText("Ver"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoViaTransporte.setToolTipText("Nuevo Rel"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.setToolTipText("Guardar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoViaTransporte.setToolTipText("Salir"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoViaTransporte";
		inputMap = this.jButtonNuevoTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoViaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoViaTransporte"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoViaTransporte";
		inputMap = this.jButtonDuplicarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoViaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoViaTransporte"));
		
		//COPIAR
		sMapKey = "CopiarTipoViaTransporte";
		inputMap = this.jButtonCopiarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoViaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoViaTransporte"));
		
		//VEr FORM
		sMapKey = "VerFormTipoViaTransporte";
		inputMap = this.jButtonVerFormTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoViaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoViaTransporte"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoViaTransporte";
		inputMap = this.jButtonNuevoRelacionesTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoViaTransporte"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoViaTransporte";
		inputMap = this.jButtonModificarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoViaTransporte"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoViaTransporte";
		inputMap = this.jButtonCerrarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoViaTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoViaTransporte";
		inputMap = this.jButtonGuardarCambiosTablaTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoViaTransporte"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoViaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoViaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoViaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoViaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoViaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoViaTransporte.setName("jPanelParametrosReportesTipoViaTransporte"); 
		
		this.jPanelParametrosReportesAccionesTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoViaTransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoViaTransporte.setName("jPanelParametrosReportesAccionesTipoViaTransporte"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoViaTransporte = new JButtonMe();
		this.jButtonRecargarInformacionTipoViaTransporte.setText("Recargar");
		this.jButtonRecargarInformacionTipoViaTransporte.setToolTipText("Recargar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoViaTransporte,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoViaTransporte = new JButtonMe();
		this.jButtonProcesarInformacionTipoViaTransporte.setText("Procesar");
		this.jButtonProcesarInformacionTipoViaTransporte.setToolTipText("Procesar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoViaTransporte.setVisible(false);
			
		this.jButtonProcesarInformacionTipoViaTransporte.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoViaTransporte.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoViaTransporte.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoViaTransporte.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoViaTransporte.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoViaTransporte.setText("TIPO");       
		this.jComboBoxTiposReportesTipoViaTransporte.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoViaTransporte.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoViaTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoViaTransporte.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoViaTransporte.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoViaTransporte.setText("Accion");
		this.jComboBoxTiposRelacionesTipoViaTransporte.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoViaTransporte.setText("Accion");
		this.jComboBoxTiposAccionesTipoViaTransporte.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoViaTransporte.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoViaTransporte.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoViaTransporte=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoViaTransporte.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoViaTransporte.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoViaTransporte.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoViaTransporte = new JLabelMe();
		
		this.jLabelAccionesTipoViaTransporte.setText("Acciones");		
		this.jLabelAccionesTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoViaTransporte = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoViaTransporte.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoViaTransporte.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoViaTransporte = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoViaTransporte.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoViaTransporte.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoViaTransporte = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoViaTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoViaTransporte.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoViaTransporte.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoViaTransporte = new JButtonMe();
		//this.jButtonAnterioresTipoViaTransporte.setText("<<");
        this.jButtonAnterioresTipoViaTransporte.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoViaTransporte,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoViaTransporte = new JButtonMe();
		//this.jButtonSiguientesTipoViaTransporte.setText(">>");
        this.jButtonSiguientesTipoViaTransporte.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoViaTransporte,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoViaTransporte = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoViaTransporte.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoViaTransporte.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoViaTransporte,"nuevoguardarcambios_button","Nue",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoViaTransporte";
		inputMap = this.jButtonNuevoGuardarCambiosTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoViaTransporte"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoViaTransporte";
		inputMap = this.jButtonRecargarInformacionTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoViaTransporte"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoViaTransporte";
		inputMap = this.jButtonSiguientesTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoViaTransporte"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoViaTransporte";
		inputMap = this.jButtonAnterioresTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoViaTransporte"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoViaTransporte();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoViaTransporte.setMinimumSize(new Dimension(this.getWidth(),TipoViaTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoViaTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoViaTransporte.setMaximumSize(new Dimension(this.getWidth(),TipoViaTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoViaTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoViaTransporte.setPreferredSize(new Dimension(this.getWidth(),TipoViaTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoViaTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoViaTransporte = new GridBagLayout();

			this.jPanelPaginacionTipoViaTransporte.setLayout(gridaBagLayoutPaginacionTipoViaTransporte);						
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 0;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonAnterioresTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
					
						
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoViaTransporte.gridy = 0;
			
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonNuevoGuardarCambiosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
						
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoViaTransporte.gridy = 0;
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonSiguientesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 1;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonNuevoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
						
			
			
			if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
				this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoViaTransporte.gridy = 1;
				this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoViaTransporte.add(this.jButtonGuardarCambiosTablaTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			}
			
			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 1;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonDuplicarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 1;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonCopiarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 1;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonVerFormTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 1;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoViaTransporte.add(this.jButtonCerrarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
		
		
		this.jButtonRecargarInformacionTipoViaTransporte.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoViaTransporte.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoViaTransporte.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoViaTransporte.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoViaTransporte.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoViaTransporte.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoViaTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoViaTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoViaTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoViaTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoViaTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoViaTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoViaTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoViaTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoViaTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoViaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoViaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoViaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoViaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoViaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoViaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoViaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoViaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoViaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoViaTransporte.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoViaTransporte.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoViaTransporte.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoViaTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoViaTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoViaTransporte.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoViaTransporte.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoViaTransporte.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoViaTransporte.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoViaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoViaTransporte = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoViaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoViaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoViaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoViaTransporte = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoViaTransporte.setLayout(gridaBagParametrosReportesTipoViaTransporte);
			this.jPanelParametrosReportesAccionesTipoViaTransporte.setLayout(gridaBagParametrosReportesAccionesTipoViaTransporte);
			
			
			this.jPanelParametrosAuxiliar1TipoViaTransporte.setLayout(gridaBagParametrosAuxiliar1TipoViaTransporte);
			this.jPanelParametrosAuxiliar2TipoViaTransporte.setLayout(gridaBagParametrosAuxiliar2TipoViaTransporte);
			this.jPanelParametrosAuxiliar3TipoViaTransporte.setLayout(gridaBagParametrosAuxiliar3TipoViaTransporte);
			this.jPanelParametrosAuxiliar4TipoViaTransporte.setLayout(gridaBagParametrosAuxiliar4TipoViaTransporte);
			//this.jPanelParametrosAuxiliar5TipoViaTransporte.setLayout(gridaBagParametrosAuxiliar2TipoViaTransporte);			
			
			
			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jButtonRecargarInformacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoViaTransporte.add(this.jComboBoxTiposPaginacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoViaTransporte.add(this.jCheckBoxConAltoMaximoTablaTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoViaTransporte.add(this.jComboBoxTiposArchivosReportesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jPanelParametrosAuxiliar1TipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoViaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoViaTransporte.add(this.jComboBoxTiposReportesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jPanelParametrosAuxiliar4TipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jComboBoxTiposReportesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jCheckBoxGenerarReporteTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jPanelParametrosAuxiliar2TipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoViaTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jLabelAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
				this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoViaTransporte.add(this.jButtonAbrirOrderByTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jComboBoxTiposSeleccionarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
			
			
			/*
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoViaTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jCheckBoxSeleccionarTodosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoViaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoViaTransporte.add(this.jCheckBoxSeleccionarTodosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);															
				
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoViaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoViaTransporte.add(this.jCheckBoxSeleccionadosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jPanelParametrosAuxiliar3TipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jComboBoxTiposRelacionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
				
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoViaTransporte.add(this.jComboBoxTiposAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoViaTransporte = new GridBagLayout();

			this.jScrollPanelDatosTipoViaTransporte.setLayout(gridaBagLayoutDatosTipoViaTransporte);
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = 0;
			this.gridBagConstraintsTipoViaTransporte.gridx = 0;
			
			this.jScrollPanelDatosTipoViaTransporte.add(this.jTableDatosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoViaTransporte.setViewportView(this.jTableDatosTipoViaTransporte);
		this.jTableDatosTipoViaTransporte.setFillsViewportHeight(true);
		this.jTableDatosTipoViaTransporte.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoViaTransporte= new GridBagLayout();
		this.jPanelAccionesTipoViaTransporte.setLayout(gridaBagLayoutAccionesTipoViaTransporte);
		
		
		/*	
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
			
		this.jPanelAccionesTipoViaTransporte.add(this.jButtonNuevoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoViaTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoViaTransporte);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();						
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoViaTransporte.gridx = 0;		
			//this.gridBagConstraintsTipoViaTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoViaTransporte.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;		
		//this.gridBagConstraintsTipoViaTransporte.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoViaTransporte.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoViaTransporte);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);								
		
		
		/*
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		*/		
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoViaTransporte.gridx =0;
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoViaTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
				
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoViaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoViaTransporte = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoViaTransporte.setLayout(gridaBagLayoutBusquedasParametrosTipoViaTransporte);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoViaTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoViaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoViaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoViaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
			
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
			
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoViaTransporte;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoViaTransporte() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoViaTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoViaTransporte.setName("jPanelReporteDinamicoTipoViaTransporte"); 
		
		this.jPanelReporteDinamicoTipoViaTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoViaTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoViaTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoViaTransporte.setLayout(gridaBagLayoutReporteDinamicoTipoViaTransporte);
		
		
		this.jInternalFrameReporteDinamicoTipoViaTransporte= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoViaTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoViaTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoViaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoViaTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoViaTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoViaTransporte.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoViaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoViaTransporte.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoViaTransporte.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoViaTransporte.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoViaTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoViaTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoViaTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Via Transportes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoViaTransporte = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoViaTransporte.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jLabelColumnasSelectReporteTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoViaTransporte = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoViaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoViaTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoViaTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoViaTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoViaTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoViaTransporte=new JScrollPane(this.jListColumnasSelectReporteTipoViaTransporte);
			
			this.jScrollColumnasSelectReporteTipoViaTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoViaTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoViaTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoViaTransporte.add(this.jListColumnasSelectReporteTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jScrollColumnasSelectReporteTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoViaTransporte = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoViaTransporte.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoViaTransporte = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoViaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoViaTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoViaTransporte.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoViaTransporte.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoViaTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoViaTransporte=new JScrollPane(this.jListRelacionesSelectReporteTipoViaTransporte);
			
			this.jScrollRelacionesSelectReporteTipoViaTransporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoViaTransporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoViaTransporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoViaTransporte = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoViaTransporte = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoViaTransporte = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoViaTransporte = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoViaTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoViaTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoViaTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoViaTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoViaTransporte = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoViaTransporte.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jLabelGenerarExcelReporteDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte.setToolTipText("Generar EXCEL"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoViaTransporte.add(this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jComboBoxTiposReportesDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoViaTransporte = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoViaTransporte.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jLabelTiposArchivoReporteDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jComboBoxTiposArchivosReportesDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoViaTransporte = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoViaTransporte.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoViaTransporte,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoViaTransporte.setToolTipText("Generar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jButtonGenerarReporteDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoViaTransporte = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoViaTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoViaTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoViaTransporte.setToolTipText("Cancelar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoViaTransporte.add(this.jButtonCerrarReporteDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoViaTransporte = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoViaTransporte= new JScrollPane(jPanelReporteDinamicoTipoViaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoViaTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoViaTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoViaTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Via Transportes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoViaTransporte.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoViaTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoViaTransporte.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoViaTransporte);
		this.jInternalFrameReporteDinamicoTipoViaTransporte.getContentPane().add(this.jScrollPanelReporteDinamicoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoViaTransporte() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoViaTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoViaTransporte.setName("jPanelImportacionTipoViaTransporte"); 
		
		this.jPanelImportacionTipoViaTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoViaTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoViaTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoViaTransporte.setLayout(gridaBagLayoutImportacionTipoViaTransporte);
		
		
		this.jInternalFrameImportacionTipoViaTransporte= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoViaTransporte= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoViaTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoViaTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoViaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoViaTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoViaTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoViaTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoViaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoViaTransporte.setResizable(true);
	    this.jInternalFrameImportacionTipoViaTransporte.setClosable(true);
	    this.jInternalFrameImportacionTipoViaTransporte.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoViaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoViaTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoViaTransporte.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoViaTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoViaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoViaTransporte.setResizable(true);
	    this.jInternalFrameImportacionTipoViaTransporte.setClosable(true);
	    this.jInternalFrameImportacionTipoViaTransporte.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoViaTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoViaTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoViaTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Via Transportes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoViaTransporte = new JLabelMe();

		this.jLabelArchivoImportacionTipoViaTransporte.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoViaTransporte.add(this.jLabelArchivoImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoViaTransporte = new JFileChooser();		
		this.jFileChooserImportacionTipoViaTransporte.setToolTipText("ESCOGER ARCHIVO"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoViaTransporte = new JButtonMe();
		this.jButtonAbrirImportacionTipoViaTransporte.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoViaTransporte,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoViaTransporte.setToolTipText("Generar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoViaTransporte.add(this.jButtonAbrirImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoViaTransporte = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoViaTransporte.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoViaTransporte.add(this.jLabelPathArchivoImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoViaTransporte=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoViaTransporte.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoViaTransporte.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoViaTransporte.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoViaTransporte.add(this.jTextFieldPathArchivoImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoViaTransporte = new JButtonMe();
		this.jButtonGenerarImportacionTipoViaTransporte.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoViaTransporte,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoViaTransporte.setToolTipText("Generar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoViaTransporte.add(this.jButtonGenerarImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoViaTransporte = new JButtonMe();
		this.jButtonCerrarImportacionTipoViaTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoViaTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoViaTransporte.setToolTipText("Cancelar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoViaTransporte.add(this.jButtonCerrarImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoViaTransporte = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoViaTransporte= new JScrollPane(jPanelImportacionTipoViaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoViaTransporte.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoViaTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoViaTransporte.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoViaTransporte);
		this.jInternalFrameImportacionTipoViaTransporte.getContentPane().add(this.jScrollPanelImportacionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoViaTransporte(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoViaTransporte = new JButtonMe();
			this.jButtonAbrirOrderByTipoViaTransporte.setText("Orden");
			this.jButtonAbrirOrderByTipoViaTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoViaTransporte,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoViaTransporte";
			inputMap = this.jButtonAbrirOrderByTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoViaTransporte"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoViaTransporte = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoViaTransporte.setName("jPanelOrderByTipoViaTransporte"); 
			
			this.jPanelOrderByTipoViaTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoViaTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoViaTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoViaTransporte.setLayout(gridaBagLayoutOrderByTipoViaTransporte);
			
			
			this.jTableDatosTipoViaTransporteOrderBy = new JTableMe();        
			this.jTableDatosTipoViaTransporteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoViaTransporteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoViaTransporteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoViaTransporteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoViaTransporteOrderBy.setViewportView(this.jTableDatosTipoViaTransporteOrderBy);
			this.jTableDatosTipoViaTransporteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoViaTransporteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoViaTransporte= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoViaTransporte= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoViaTransporte = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoViaTransporte= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoViaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoViaTransporte.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoViaTransporte.setTitle("Orden");
			this.jInternalFrameOrderByTipoViaTransporte.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoViaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoViaTransporte.setResizable(true);
			this.jInternalFrameOrderByTipoViaTransporte.setClosable(true);
			this.jInternalFrameOrderByTipoViaTransporte.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoViaTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoViaTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoViaTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Via Transportes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoViaTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoViaTransporte.ipady =150;
				
			this.jPanelOrderByTipoViaTransporte.add(jScrollPanelDatosTipoViaTransporteOrderBy, this.gridBagConstraintsTipoViaTransporte);//this.jTableDatosTipoViaTransporteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoViaTransporte = new JButtonMe();
			this.jButtonCerrarOrderByTipoViaTransporte.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoViaTransporte,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoViaTransporte.setToolTipText("Cancelar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoViaTransporte.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoViaTransporte.add(this.jButtonCerrarOrderByTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoViaTransporte = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoViaTransporte= new JScrollPane(jPanelOrderByTipoViaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoViaTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoViaTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoViaTransporte.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoViaTransporte);
			
			this.jInternalFrameOrderByTipoViaTransporte.getContentPane().add(this.jScrollPanelOrderByTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
		
		} else {
			this.jButtonAbrirOrderByTipoViaTransporte = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoviatransporteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoViaTransporte.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoViaTransporte.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoViaTransporte.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoViaTransporte.getRowHeight();//TipoViaTransporteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.isSelected()) {
					iHeightTable=TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoViaTransporte.isSelected()) {
					iHeightTable=TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoViaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoViaTransporte.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoViaTransporte.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoViaTransporte.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoViaTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoViaTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoViaTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoViaTransporte!=null && this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoViaTransporte.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoViaTransporte.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoViaTransporte.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoViaTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoViaTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoViaTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoviatransporteLogic.getTipoViaTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoviatransportes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoViaTransporte> TraerTipoViaTransporteBeans(List<TipoViaTransporte> tipoviatransportes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoViaTransporte tipoviatransporte:tipoviatransportes) {
					
				if(!(TipoViaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoViaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoviatransporte.setsDetalleGeneralEntityReporte(TipoViaTransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporte));
										
						
					
						
					
				} else  {
							
					//tipoviatransporte.setsDetalleGeneralEntityReporte(tipoviatransporte.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoviatransportebeans.add(tipoviatransportebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoviatransportes;
    }
	//PARA REPORTES FIN
}
