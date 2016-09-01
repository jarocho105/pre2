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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoEstructuraConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoEstructuraJInternalFrame extends TipoEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEstructura;
	
	protected JMenuBar jmenuBarTipoEstructura;
	
	protected JMenu jmenuTipoEstructura;
	protected JMenu jmenuDatosTipoEstructura;
	protected JMenu jmenuArchivoTipoEstructura;
	protected JMenu jmenuAccionesTipoEstructura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEstructura;	
	protected GridBagConstraints gridBagConstraintsTipoEstructura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEstructuraDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEstructura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEstructura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEstructura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoEstructuraSessionBean tipoestructuraSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEstructura> tipoestructuras;		
	public List<TipoEstructura> tipoestructurasEliminados;	
	public List<TipoEstructura> tipoestructurasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEstructura;		
	protected JButton jButtonAbrirOrderByTipoEstructura;
	
	
	//protected JPanel jPanelOrderByTipoEstructura;
	//public JScrollPane jScrollPanelOrderByTipoEstructura;	
	//protected JButton jButtonCerrarOrderByTipoEstructura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEstructuraLogic tipoestructuraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEstructura;
	public JScrollPane jScrollPanelDatosEdicionTipoEstructura;
	public JScrollPane jScrollPanelDatosGeneralTipoEstructura;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEstructuraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEstructura;
	//public JScrollPane jScrollPanelImportacionTipoEstructura;
	
	
	
	protected JPanel jPanelAccionesTipoEstructura;
	
    protected JPanel jPanelPaginacionTipoEstructura;
    protected JPanel jPanelParametrosReportesTipoEstructura;
	protected JPanel jPanelParametrosReportesAccionesTipoEstructura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEstructura;
	protected JPanel jPanelParametrosAuxiliar2TipoEstructura;
	protected JPanel jPanelParametrosAuxiliar3TipoEstructura;
	protected JPanel jPanelParametrosAuxiliar4TipoEstructura;
	//protected JPanel jPanelParametrosAuxiliar5TipoEstructura;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEstructura;
	//protected JPanel jPanelImportacionTipoEstructura;
	
	
	public JTable jTableDatosTipoEstructura;
	
	
	
	//public JTable jTableDatosTipoEstructuraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEstructura;
	protected JButton jButtonDuplicarTipoEstructura;
	protected JButton jButtonCopiarTipoEstructura;
	protected JButton jButtonVerFormTipoEstructura;
	protected JButton jButtonNuevoRelacionesTipoEstructura;
	protected JButton jButtonModificarTipoEstructura;
	
    protected JButton jButtonGuardarCambiosTablaTipoEstructura;
	protected JButton jButtonCerrarTipoEstructura;
	
	
	protected JButton jButtonRecargarInformacionTipoEstructura;
	protected JButton jButtonProcesarInformacionTipoEstructura;
	
	
	protected JButton jButtonAnterioresTipoEstructura;
	protected JButton jButtonSiguientesTipoEstructura;
	protected JButton jButtonNuevoGuardarCambiosTipoEstructura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEstructura;
	//protected JButton jButtonCerrarReporteDinamicoTipoEstructura;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEstructura;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEstructura;
	//protected JButton jButtonGenerarImportacionTipoEstructura;
	//protected JButton jButtonCerrarImportacionTipoEstructura;
	//protected JFileChooser jFileChooserImportacionTipoEstructura;
	//protected File fileImportacionTipoEstructura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEstructura;
	protected JButton jButtonDuplicarToolBarTipoEstructura;
	protected JButton jButtonNuevoRelacionesToolBarTipoEstructura;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEstructura;
	protected JButton jButtonCopiarToolBarTipoEstructura;
	protected JButton jButtonVerFormToolBarTipoEstructura;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEstructura;
	protected JButton jButtonCerrarToolBarTipoEstructura;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEstructura;
	protected JButton jButtonProcesarInformacionToolBarTipoEstructura;
	protected JButton jButtonAnterioresToolBarTipoEstructura;
	protected JButton jButtonSiguientesToolBarTipoEstructura;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEstructura;
	protected JButton jButtonAbrirOrderByToolBarTipoEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEstructura;
	protected JMenuItem jMenuItemDuplicarTipoEstructura;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEstructura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEstructura;
	protected JMenuItem jMenuItemCopiarTipoEstructura;
	protected JMenuItem jMenuItemVerFormTipoEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEstructura;
	protected JMenuItem jMenuItemCerrarTipoEstructura;
	protected JMenuItem jMenuItemDetalleCerrarTipoEstructura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEstructura;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEstructura;
	protected JMenuItem jMenuItemProcesarInformacionTipoEstructura;
	protected JMenuItem jMenuItemAnterioresTipoEstructura;
	protected JMenuItem jMenuItemSiguientesTipoEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEstructura;
	protected JMenuItem jMenuItemAbrirOrderByTipoEstructura;
	protected JMenuItem jMenuItemMostrarOcultarTipoEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEstructura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEstructura;
	protected JCheckBox jCheckBoxSeleccionadosTipoEstructura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEstructura;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEstructura;
	protected JTextField jTextFieldValorCampoGeneralTipoEstructura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEstructura;
	//public JList<Reporte> jListColumnasSelectReporteTipoEstructura;
	//public JScrollPane jScrollColumnasSelectReporteTipoEstructura;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEstructura;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEstructura;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEstructura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEstructura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEstructura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEstructura;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEstructura;
	
		
	//public JLabel jLabelArchivoImportacionTipoEstructura;	
	//public JLabel jLabelPathArchivoImportacionTipoEstructura;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEstructura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEstructura;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEstructura;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEstructura;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEstructura;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEstructura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEstructura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEstructura;	
	
	
	
	
	
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
	public TipoEstructuraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEstructura)	{
		this.jButtonRecargarInformacionTipoEstructura = jButtonRecargarInformacionTipoEstructura;
	}
	
	public JButton getjButtonProcesarInformacionTipoEstructura() {
		return this.jButtonProcesarInformacionTipoEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEstructura)	{
		this.jButtonProcesarInformacionTipoEstructura = jButtonProcesarInformacionTipoEstructura;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEstructura() {
		return this.jButtonRecargarInformacionTipoEstructura;
	}
	
	
	public List<TipoEstructura> gettipoestructuras() {
		return this.tipoestructuras;
	}

	public void settipoestructuras(List<TipoEstructura> tipoestructuras) {
		this.tipoestructuras = tipoestructuras;
	}
	
	public List<TipoEstructura> gettipoestructurasAux() {
		return this.tipoestructurasAux;
	}

	public void settipoestructurasAux(List<TipoEstructura> tipoestructurasAux) {
		this.tipoestructurasAux = tipoestructurasAux;
	}
	
	public List<TipoEstructura> gettipoestructurasEliminados() {
		return this.tipoestructurasEliminados;
	}

	public void setTipoEstructurasEliminados(List<TipoEstructura> tipoestructurasEliminados) {
		this.tipoestructurasEliminados = tipoestructurasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEstructura() {
		return jComboBoxTiposSeleccionarTipoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEstructura(
			JComboBox jComboBoxTiposSeleccionarTipoEstructura) {
		this.jComboBoxTiposSeleccionarTipoEstructura = jComboBoxTiposSeleccionarTipoEstructura;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEstructura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEstructura() {
		return jTextFieldValorCampoGeneralTipoEstructura;
	}

	public void setjTextFieldValorCampoGeneralTipoEstructura(
			JTextField jTextFieldValorCampoGeneralTipoEstructura) {
		this.jTextFieldValorCampoGeneralTipoEstructura = jTextFieldValorCampoGeneralTipoEstructura;
	}

	public void setBorderResaltarValorCampoGeneralTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEstructura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEstructura() {
		return this.jCheckBoxSeleccionarTodosTipoEstructura;
	}

	public void setjCheckBoxSeleccionarTodosTipoEstructura(
			JCheckBox jCheckBoxSeleccionarTodosTipoEstructura) {
		this.jCheckBoxSeleccionarTodosTipoEstructura = jCheckBoxSeleccionarTodosTipoEstructura;
	}

	public void setBorderResaltarSeleccionarTodosTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEstructura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEstructura() {
		return this.jCheckBoxSeleccionadosTipoEstructura;
	}

	public void setjCheckBoxSeleccionadosTipoEstructura(
			JCheckBox jCheckBoxSeleccionadosTipoEstructura) {
		this.jCheckBoxSeleccionadosTipoEstructura = jCheckBoxSeleccionadosTipoEstructura;
	}
	
	public void setBorderResaltarSeleccionadosTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEstructura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEstructura() {
		return this.jComboBoxTiposArchivosReportesTipoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEstructura(
			JComboBox jComboBoxTiposArchivosReportesTipoEstructura) {
		this.jComboBoxTiposArchivosReportesTipoEstructura = jComboBoxTiposArchivosReportesTipoEstructura;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEstructura() {
		return this.jComboBoxTiposReportesTipoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEstructura(
			JComboBox jComboBoxTiposReportesTipoEstructura) {
		this.jComboBoxTiposReportesTipoEstructura = jComboBoxTiposReportesTipoEstructura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEstructura() {
	//	return jComboBoxTiposReportesDinamicoTipoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEstructura(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEstructura) {
	//	this.jComboBoxTiposReportesDinamicoTipoEstructura = jComboBoxTiposReportesDinamicoTipoEstructura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEstructura() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEstructura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEstructura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura = jComboBoxTiposArchivosReportesDinamicoTipoEstructura;
	//}
	
	public void setBorderResaltarTiposReportesTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEstructura() {
		return this.jComboBoxTiposGraficosReportesTipoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEstructura(
			JComboBox jComboBoxTiposGraficosReportesTipoEstructura) {
		this.jComboBoxTiposGraficosReportesTipoEstructura = jComboBoxTiposGraficosReportesTipoEstructura;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEstructura() {
		return this.jComboBoxTiposPaginacionTipoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEstructura(
			JComboBox jComboBoxTiposPaginacionTipoEstructura) {
		this.jComboBoxTiposPaginacionTipoEstructura = jComboBoxTiposPaginacionTipoEstructura;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEstructura() {
		return this.jComboBoxTiposRelacionesTipoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEstructura() {
		return this.jComboBoxTiposAccionesTipoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEstructura(
			JComboBox jComboBoxTiposRelacionesTipoEstructura) {
		this.jComboBoxTiposRelacionesTipoEstructura = jComboBoxTiposRelacionesTipoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEstructura(
			JComboBox jComboBoxTiposAccionesTipoEstructura) {
		this.jComboBoxTiposAccionesTipoEstructura = jComboBoxTiposAccionesTipoEstructura;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEstructura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEstructura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEstructura() {
	//	return jCheckBoxConGraficoDinamicoTipoEstructura;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEstructura(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEstructura) {
	//	this.jCheckBoxConGraficoDinamicoTipoEstructura = jCheckBoxConGraficoDinamicoTipoEstructura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEstructura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEstructura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEstructura .setBorder(borderResaltar);		
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
		this.tipoestructuraSessionBean=new TipoEstructuraSessionBean();
		
		this.tipoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoestructuraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEstructura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"nuevo","nuevo","Nuevo"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"duplicar","duplicar","Duplicar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"copiar","copiar","Copiar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"ver_form","ver_form","Ver"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"recargar","recargar","Recargar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEstructura,this.jTtoolBarTipoEstructura,
							"cerrar","cerrar","Salir"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEstructura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEstructura;
			
				this.jButtonProcesarInformacionToolBarTipoEstructura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEstructura;
				
		//protected JButton jButtonModificarToolBarTipoEstructura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEstructura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEstructura=new JMenuMe("General");
		this.jmenuArchivoTipoEstructura=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEstructura=new JMenuMe("Acciones");
		this.jmenuDatosTipoEstructura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEstructura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEstructura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEstructura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEstructura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEstructura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEstructura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEstructura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEstructura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEstructura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEstructura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEstructura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEstructura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEstructura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEstructura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEstructura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEstructura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEstructura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEstructura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEstructura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEstructura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEstructura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEstructura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEstructura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEstructura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEstructura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEstructura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEstructura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEstructura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEstructura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEstructura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEstructura.add(this.jMenuItemCerrarTipoEstructura);
			
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemNuevoTipoEstructura);
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemNuevoGuardarCambiosTipoEstructura);
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemNuevoRelacionesTipoEstructura);
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemGuardarCambiosTablaTipoEstructura);		
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemDuplicarTipoEstructura);		
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemCopiarTipoEstructura);		
			this.jmenuAccionesTipoEstructura.add(this.jMenuItemVerFormTipoEstructura);		
			
			this.jmenuDatosTipoEstructura.add(this.jMenuItemRecargarInformacionTipoEstructura);				
			this.jmenuDatosTipoEstructura.add(this.jMenuItemAnterioresTipoEstructura);				
			this.jmenuDatosTipoEstructura.add(this.jMenuItemSiguientesTipoEstructura);				
			this.jmenuDatosTipoEstructura.add(this.jMenuItemAbrirOrderByTipoEstructura);				
			this.jmenuDatosTipoEstructura.add(this.jMenuItemMostrarOcultarTipoEstructura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEstructura.add(this.jMenuItemGuardarCambiosTipoEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEstructura.add(this.jmenuArchivoTipoEstructura);		
			this.jmenuBarTipoEstructura.add(this.jmenuAccionesTipoEstructura);		
			this.jmenuBarTipoEstructura.add(this.jmenuDatosTipoEstructura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEstructura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEstructura() {
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
			//this.jInternalFrameDetalleTipoEstructura = new TipoEstructuraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Estructura DATOS");
			this.jInternalFrameDetalleFormTipoEstructura = new TipoEstructuraDetalleFormJInternalFrame(jDesktopPane,this.tipoestructuraSessionBean.getConGuardarRelaciones(),this.tipoestructuraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEstructura = null;//new TipoEstructuraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEstructura= new GridBagLayout();
		
		
		this.jTableDatosTipoEstructura = new JTableMe();      
		
		String sToolTipTipoEstructura="";
		sToolTipTipoEstructura=TipoEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEstructura+="(Nomina.TipoEstructura)";
		}
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEstructura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEstructura.setToolTipText(sToolTipTipoEstructura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEstructura);
		this.jTableDatosTipoEstructura.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEstructura.setRowSelectionAllowed(true);
		this.jTableDatosTipoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEstructura = new JButtonMe();
		this.jButtonDuplicarTipoEstructura = new JButtonMe();
		this.jButtonCopiarTipoEstructura = new JButtonMe();
		this.jButtonVerFormTipoEstructura = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEstructura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEstructura = new JButtonMe();
		this.jButtonCerrarTipoEstructura = new JButtonMe();
		
		this.jScrollPanelDatosTipoEstructura = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEstructura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Estructura";
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesTipoEstructura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEstructura=new ReporteDinamicoJInternalFrame(TipoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEstructura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEstructura=new ImportacionJInternalFrame(TipoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEstructura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEstructura = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEstructura.setText("Orden");
		this.jButtonAbrirOrderByTipoEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEstructura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstructura,false,this);
			
			//this.cargarOrderByTipoEstructura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstructura,true,this);
			
			//this.cargarOrderByTipoEstructura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEstructura.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEstructura.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEstructura.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEstructura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEstructura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEstructura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEstructura.setText("Nuevo");
		this.jButtonDuplicarTipoEstructura.setText("Duplicar");
		this.jButtonCopiarTipoEstructura.setText("Copiar");
		this.jButtonVerFormTipoEstructura.setText("Ver");
		this.jButtonNuevoRelacionesTipoEstructura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEstructura.setText("Guardar");
		this.jButtonCerrarTipoEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEstructura,"nuevo_button","Nuevo",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEstructura,"duplicar_button","Duplicar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEstructura,"copiar_button","Copiar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEstructura,"ver_form","Ver",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEstructura,"nuevorelaciones_button","Nuevo Rel",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEstructura,"guardarcambiostabla_button","Guardar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEstructura,"cerrar_button","Salir",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEstructura.setToolTipText("Nuevo"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEstructura.setToolTipText("Duplicar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEstructura.setToolTipText("Copiar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEstructura.setToolTipText("Ver"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEstructura.setToolTipText("Nuevo Rel"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEstructura.setToolTipText("Guardar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEstructura.setToolTipText("Salir"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEstructura";
		inputMap = this.jButtonNuevoTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEstructura"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEstructura";
		inputMap = this.jButtonDuplicarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEstructura"));
		
		//COPIAR
		sMapKey = "CopiarTipoEstructura";
		inputMap = this.jButtonCopiarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEstructura"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEstructura";
		inputMap = this.jButtonVerFormTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEstructura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEstructura";
		inputMap = this.jButtonNuevoRelacionesTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEstructura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEstructura";
		inputMap = this.jButtonModificarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEstructura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEstructura";
		inputMap = this.jButtonCerrarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEstructura";
		inputMap = this.jButtonGuardarCambiosTablaTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEstructura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEstructura.setName("jPanelParametrosReportesTipoEstructura"); 
		
		this.jPanelParametrosReportesAccionesTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEstructura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEstructura.setName("jPanelParametrosReportesAccionesTipoEstructura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEstructura = new JButtonMe();
		this.jButtonRecargarInformacionTipoEstructura.setText("Recargar");
		this.jButtonRecargarInformacionTipoEstructura.setToolTipText("Recargar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEstructura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEstructura = new JButtonMe();
		this.jButtonProcesarInformacionTipoEstructura.setText("Procesar");
		this.jButtonProcesarInformacionTipoEstructura.setToolTipText("Procesar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEstructura.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEstructura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEstructura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEstructura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstructura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEstructura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstructura.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEstructura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstructura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEstructura.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEstructura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEstructura.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEstructura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEstructura.setText("Accion");
		this.jComboBoxTiposAccionesTipoEstructura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEstructura.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEstructura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEstructura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEstructura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEstructura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEstructura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEstructura = new JLabelMe();
		
		this.jLabelAccionesTipoEstructura.setText("Acciones");		
		this.jLabelAccionesTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEstructura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEstructura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEstructura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEstructura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEstructura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEstructura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEstructura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEstructura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEstructura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEstructura.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEstructura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEstructura = new JButtonMe();
		//this.jButtonAnterioresTipoEstructura.setText("<<");
        this.jButtonAnterioresTipoEstructura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEstructura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEstructura = new JButtonMe();
		//this.jButtonSiguientesTipoEstructura.setText(">>");
        this.jButtonSiguientesTipoEstructura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEstructura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEstructura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEstructura.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEstructura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEstructura,"nuevoguardarcambios_button","Nue",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEstructura";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEstructura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEstructura";
		inputMap = this.jButtonRecargarInformacionTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEstructura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEstructura";
		inputMap = this.jButtonSiguientesTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEstructura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEstructura";
		inputMap = this.jButtonAnterioresTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEstructura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEstructura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEstructura.setMinimumSize(new Dimension(this.getWidth(),TipoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEstructura.setMaximumSize(new Dimension(this.getWidth(),TipoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEstructura.setPreferredSize(new Dimension(this.getWidth(),TipoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEstructura = new GridBagLayout();

			this.jPanelPaginacionTipoEstructura.setLayout(gridaBagLayoutPaginacionTipoEstructura);						
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 0;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEstructura.add(this.jButtonAnterioresTipoEstructura, this.gridBagConstraintsTipoEstructura);
					
						
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEstructura.gridy = 0;
			
			this.jPanelPaginacionTipoEstructura.add(this.jButtonNuevoGuardarCambiosTipoEstructura, this.gridBagConstraintsTipoEstructura);
						
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEstructura.gridy = 0;
			this.jPanelPaginacionTipoEstructura.add(this.jButtonSiguientesTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 1;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstructura.add(this.jButtonNuevoTipoEstructura, this.gridBagConstraintsTipoEstructura);
						
			
			
			if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
				this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEstructura.gridy = 1;
				this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEstructura.add(this.jButtonGuardarCambiosTablaTipoEstructura, this.gridBagConstraintsTipoEstructura);
			}
			
			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 1;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstructura.add(this.jButtonDuplicarTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 1;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstructura.add(this.jButtonCopiarTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 1;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstructura.add(this.jButtonVerFormTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 1;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEstructura.add(this.jButtonCerrarTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
		
		
		this.jButtonRecargarInformacionTipoEstructura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEstructura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEstructura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEstructura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEstructura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEstructura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEstructura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEstructura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEstructura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEstructura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEstructura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEstructura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEstructura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEstructura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEstructura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEstructura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEstructura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEstructura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEstructura.setLayout(gridaBagParametrosReportesTipoEstructura);
			this.jPanelParametrosReportesAccionesTipoEstructura.setLayout(gridaBagParametrosReportesAccionesTipoEstructura);
			
			
			this.jPanelParametrosAuxiliar1TipoEstructura.setLayout(gridaBagParametrosAuxiliar1TipoEstructura);
			this.jPanelParametrosAuxiliar2TipoEstructura.setLayout(gridaBagParametrosAuxiliar2TipoEstructura);
			this.jPanelParametrosAuxiliar3TipoEstructura.setLayout(gridaBagParametrosAuxiliar3TipoEstructura);
			this.jPanelParametrosAuxiliar4TipoEstructura.setLayout(gridaBagParametrosAuxiliar4TipoEstructura);
			//this.jPanelParametrosAuxiliar5TipoEstructura.setLayout(gridaBagParametrosAuxiliar2TipoEstructura);			
			
			
			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstructura.add(this.jButtonRecargarInformacionTipoEstructura, this.gridBagConstraintsTipoEstructura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstructura.add(this.jComboBoxTiposPaginacionTipoEstructura, this.gridBagConstraintsTipoEstructura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstructura.add(this.jCheckBoxConAltoMaximoTablaTipoEstructura, this.gridBagConstraintsTipoEstructura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstructura.add(this.jComboBoxTiposArchivosReportesTipoEstructura, this.gridBagConstraintsTipoEstructura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstructura.add(this.jPanelParametrosAuxiliar1TipoEstructura, this.gridBagConstraintsTipoEstructura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEstructura.add(this.jComboBoxTiposReportesTipoEstructura, this.gridBagConstraintsTipoEstructura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstructura.add(this.jPanelParametrosAuxiliar4TipoEstructura, this.gridBagConstraintsTipoEstructura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstructura.add(this.jComboBoxTiposReportesTipoEstructura, this.gridBagConstraintsTipoEstructura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstructura.add(this.jCheckBoxGenerarReporteTipoEstructura, this.gridBagConstraintsTipoEstructura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstructura.add(this.jPanelParametrosAuxiliar2TipoEstructura, this.gridBagConstraintsTipoEstructura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstructura.add(this.jLabelAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
				this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEstructura.add(this.jButtonAbrirOrderByTipoEstructura, this.gridBagConstraintsTipoEstructura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstructura.add(this.jComboBoxTiposSeleccionarTipoEstructura, this.gridBagConstraintsTipoEstructura);			
			
			
			/*
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstructura.add(this.jCheckBoxSeleccionarTodosTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEstructura.add(this.jCheckBoxSeleccionarTodosTipoEstructura, this.gridBagConstraintsTipoEstructura);															
				
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEstructura.add(this.jCheckBoxSeleccionadosTipoEstructura, this.gridBagConstraintsTipoEstructura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstructura.add(this.jPanelParametrosAuxiliar3TipoEstructura, this.gridBagConstraintsTipoEstructura);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstructura.add(this.jComboBoxTiposRelacionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
				
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstructura.add(this.jComboBoxTiposAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEstructura = new GridBagLayout();

			this.jScrollPanelDatosTipoEstructura.setLayout(gridaBagLayoutDatosTipoEstructura);
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = 0;
			this.gridBagConstraintsTipoEstructura.gridx = 0;
			
			this.jScrollPanelDatosTipoEstructura.add(this.jTableDatosTipoEstructura, this.gridBagConstraintsTipoEstructura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEstructura.setViewportView(this.jTableDatosTipoEstructura);
		this.jTableDatosTipoEstructura.setFillsViewportHeight(true);
		this.jTableDatosTipoEstructura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEstructura= new GridBagLayout();
		this.jPanelAccionesTipoEstructura.setLayout(gridaBagLayoutAccionesTipoEstructura);
		
		
		/*	
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = 0;
		this.gridBagConstraintsTipoEstructura.gridx = 0;
			
		this.jPanelAccionesTipoEstructura.add(this.jButtonNuevoTipoEstructura, this.gridBagConstraintsTipoEstructura);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEstructura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();						
			this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstructura.gridx = 0;		
			//this.gridBagConstraintsTipoEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEstructura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEstructura, this.gridBagConstraintsTipoEstructura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEstructura.gridx = 0;		
		//this.gridBagConstraintsTipoEstructura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEstructura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEstructura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEstructura, this.gridBagConstraintsTipoEstructura);								
		
		
		/*
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
		*/		
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEstructura.gridx =0;
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEstructura, this.gridBagConstraintsTipoEstructura);
				
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEstructura, this.gridBagConstraintsTipoEstructura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEstructura = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEstructura.setLayout(gridaBagLayoutBusquedasParametrosTipoEstructura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
			
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
			
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEstructura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEstructura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEstructura.setName("jPanelReporteDinamicoTipoEstructura"); 
		
		this.jPanelReporteDinamicoTipoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEstructura.setLayout(gridaBagLayoutReporteDinamicoTipoEstructura);
		
		
		this.jInternalFrameReporteDinamicoTipoEstructura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEstructura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEstructura.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEstructura.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEstructura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estructuras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEstructura = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEstructura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEstructura.add(this.jLabelColumnasSelectReporteTipoEstructura, this.gridBagConstraintsTipoEstructura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEstructura = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEstructura=new JScrollPane(this.jListColumnasSelectReporteTipoEstructura);
			
			this.jScrollColumnasSelectReporteTipoEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEstructura.add(this.jListColumnasSelectReporteTipoEstructura, this.gridBagConstraintsTipoEstructura);
		this.jPanelReporteDinamicoTipoEstructura.add(this.jScrollColumnasSelectReporteTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEstructura = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEstructura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEstructura = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEstructura=new JScrollPane(this.jListRelacionesSelectReporteTipoEstructura);
			
			this.jScrollRelacionesSelectReporteTipoEstructura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEstructura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEstructura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoEstructura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEstructura = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEstructura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEstructura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEstructura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEstructura.add(this.jLabelGenerarExcelReporteDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEstructura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEstructura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEstructura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEstructura.setToolTipText("Generar EXCEL"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEstructura.add(this.jButtonGenerarExcelReporteDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstructura.add(this.jComboBoxTiposReportesDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEstructura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEstructura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEstructura.add(this.jLabelTiposArchivoReporteDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstructura.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEstructura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEstructura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEstructura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEstructura.setToolTipText("Generar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstructura.add(this.jButtonGenerarReporteDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEstructura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEstructura.setToolTipText("Cancelar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstructura.add(this.jButtonCerrarReporteDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEstructura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEstructura= new JScrollPane(jPanelReporteDinamicoTipoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estructuras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstructura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEstructura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEstructura);
		this.jInternalFrameReporteDinamicoTipoEstructura.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEstructura, this.gridBagConstraintsTipoEstructura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEstructura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEstructura.setName("jPanelImportacionTipoEstructura"); 
		
		this.jPanelImportacionTipoEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEstructura.setLayout(gridaBagLayoutImportacionTipoEstructura);
		
		
		this.jInternalFrameImportacionTipoEstructura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEstructura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEstructura.setResizable(true);
	    this.jInternalFrameImportacionTipoEstructura.setClosable(true);
	    this.jInternalFrameImportacionTipoEstructura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEstructura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEstructura.setResizable(true);
	    this.jInternalFrameImportacionTipoEstructura.setClosable(true);
	    this.jInternalFrameImportacionTipoEstructura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estructuras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEstructura = new JLabelMe();

		this.jLabelArchivoImportacionTipoEstructura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEstructura.add(this.jLabelArchivoImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEstructura = new JFileChooser();		
		this.jFileChooserImportacionTipoEstructura.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEstructura = new JButtonMe();
		this.jButtonAbrirImportacionTipoEstructura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEstructura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEstructura.setToolTipText("Generar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstructura.add(this.jButtonAbrirImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEstructura = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEstructura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEstructura.add(this.jLabelPathArchivoImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEstructura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEstructura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEstructura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEstructura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstructura.add(this.jTextFieldPathArchivoImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEstructura = new JButtonMe();
		this.jButtonGenerarImportacionTipoEstructura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEstructura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEstructura.setToolTipText("Generar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstructura.add(this.jButtonGenerarImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEstructura = new JButtonMe();
		this.jButtonCerrarImportacionTipoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEstructura.setToolTipText("Cancelar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstructura.add(this.jButtonCerrarImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEstructura = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEstructura= new JScrollPane(jPanelImportacionTipoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEstructura.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEstructura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEstructura);
		this.jInternalFrameImportacionTipoEstructura.getContentPane().add(this.jScrollPanelImportacionTipoEstructura, this.gridBagConstraintsTipoEstructura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEstructura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEstructura = new JButtonMe();
			this.jButtonAbrirOrderByTipoEstructura.setText("Orden");
			this.jButtonAbrirOrderByTipoEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEstructura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEstructura";
			inputMap = this.jButtonAbrirOrderByTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEstructura"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEstructura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEstructura.setName("jPanelOrderByTipoEstructura"); 
			
			this.jPanelOrderByTipoEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEstructura.setLayout(gridaBagLayoutOrderByTipoEstructura);
			
			
			this.jTableDatosTipoEstructuraOrderBy = new JTableMe();        
			this.jTableDatosTipoEstructuraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEstructuraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEstructuraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEstructuraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEstructuraOrderBy.setViewportView(this.jTableDatosTipoEstructuraOrderBy);
			this.jTableDatosTipoEstructuraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEstructuraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEstructura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEstructura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEstructura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEstructura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEstructura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEstructura.setTitle("Orden");
			this.jInternalFrameOrderByTipoEstructura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEstructura.setResizable(true);
			this.jInternalFrameOrderByTipoEstructura.setClosable(true);
			this.jInternalFrameOrderByTipoEstructura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estructuras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEstructura.ipady =150;
				
			this.jPanelOrderByTipoEstructura.add(jScrollPanelDatosTipoEstructuraOrderBy, this.gridBagConstraintsTipoEstructura);//this.jTableDatosTipoEstructuraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEstructura = new JButtonMe();
			this.jButtonCerrarOrderByTipoEstructura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEstructura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEstructura.setToolTipText("Cancelar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEstructura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEstructura.add(this.jButtonCerrarOrderByTipoEstructura, this.gridBagConstraintsTipoEstructura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEstructura = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEstructura= new JScrollPane(jPanelOrderByTipoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEstructura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEstructura);
			
			this.jInternalFrameOrderByTipoEstructura.getContentPane().add(this.jScrollPanelOrderByTipoEstructura, this.gridBagConstraintsTipoEstructura);			
		
		} else {
			this.jButtonAbrirOrderByTipoEstructura = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoestructuraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEstructura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEstructura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEstructura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEstructura.getRowHeight();//TipoEstructuraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEstructura.isSelected()) {
					iHeightTable=TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEstructura.isSelected()) {
					iHeightTable=TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEstructura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEstructura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEstructura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEstructura!=null && this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEstructura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEstructura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEstructura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoestructuraLogic.getTipoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestructuras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEstructura> TraerTipoEstructuraBeans(List<TipoEstructura> tipoestructuras,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEstructura tipoestructura:tipoestructuras) {
					
				if(!(TipoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoestructura.setsDetalleGeneralEntityReporte(TipoEstructuraConstantesFunciones.getTipoEstructuraDescripcion(tipoestructura));
										
						
					
						
					
				} else  {
							
					//tipoestructura.setsDetalleGeneralEntityReporte(tipoestructura.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoestructurabeans.add(tipoestructurabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoestructuras;
    }
	//PARA REPORTES FIN
}
