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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoPlantillaFacturaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoPlantillaFacturaJInternalFrame extends TipoPlantillaFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPlantillaFactura;
	
	protected JMenuBar jmenuBarTipoPlantillaFactura;
	
	protected JMenu jmenuTipoPlantillaFactura;
	protected JMenu jmenuDatosTipoPlantillaFactura;
	protected JMenu jmenuArchivoTipoPlantillaFactura;
	protected JMenu jmenuAccionesTipoPlantillaFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPlantillaFactura;	
	protected GridBagConstraints gridBagConstraintsTipoPlantillaFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPlantillaFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPlantillaFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPlantillaFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPlantillaFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPlantillaFacturaSessionBean tipoplantillafacturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPlantillaFactura> tipoplantillafacturas;		
	public List<TipoPlantillaFactura> tipoplantillafacturasEliminados;	
	public List<TipoPlantillaFactura> tipoplantillafacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPlantillaFactura;		
	protected JButton jButtonAbrirOrderByTipoPlantillaFactura;
	
	
	//protected JPanel jPanelOrderByTipoPlantillaFactura;
	//public JScrollPane jScrollPanelOrderByTipoPlantillaFactura;	
	//protected JButton jButtonCerrarOrderByTipoPlantillaFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPlantillaFacturaLogic tipoplantillafacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPlantillaFactura;
	public JScrollPane jScrollPanelDatosEdicionTipoPlantillaFactura;
	public JScrollPane jScrollPanelDatosGeneralTipoPlantillaFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPlantillaFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPlantillaFactura;
	//public JScrollPane jScrollPanelImportacionTipoPlantillaFactura;
	
	
	
	protected JPanel jPanelAccionesTipoPlantillaFactura;
	
    protected JPanel jPanelPaginacionTipoPlantillaFactura;
    protected JPanel jPanelParametrosReportesTipoPlantillaFactura;
	protected JPanel jPanelParametrosReportesAccionesTipoPlantillaFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPlantillaFactura;
	protected JPanel jPanelParametrosAuxiliar2TipoPlantillaFactura;
	protected JPanel jPanelParametrosAuxiliar3TipoPlantillaFactura;
	protected JPanel jPanelParametrosAuxiliar4TipoPlantillaFactura;
	//protected JPanel jPanelParametrosAuxiliar5TipoPlantillaFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPlantillaFactura;
	//protected JPanel jPanelImportacionTipoPlantillaFactura;
	
	
	public JTable jTableDatosTipoPlantillaFactura;
	
	
	
	//public JTable jTableDatosTipoPlantillaFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPlantillaFactura;
	protected JButton jButtonDuplicarTipoPlantillaFactura;
	protected JButton jButtonCopiarTipoPlantillaFactura;
	protected JButton jButtonVerFormTipoPlantillaFactura;
	protected JButton jButtonNuevoRelacionesTipoPlantillaFactura;
	protected JButton jButtonModificarTipoPlantillaFactura;
	
    protected JButton jButtonGuardarCambiosTablaTipoPlantillaFactura;
	protected JButton jButtonCerrarTipoPlantillaFactura;
	
	
	protected JButton jButtonRecargarInformacionTipoPlantillaFactura;
	protected JButton jButtonProcesarInformacionTipoPlantillaFactura;
	
	
	protected JButton jButtonAnterioresTipoPlantillaFactura;
	protected JButton jButtonSiguientesTipoPlantillaFactura;
	protected JButton jButtonNuevoGuardarCambiosTipoPlantillaFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPlantillaFactura;
	//protected JButton jButtonCerrarReporteDinamicoTipoPlantillaFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPlantillaFactura;
	//protected JButton jButtonGenerarImportacionTipoPlantillaFactura;
	//protected JButton jButtonCerrarImportacionTipoPlantillaFactura;
	//protected JFileChooser jFileChooserImportacionTipoPlantillaFactura;
	//protected File fileImportacionTipoPlantillaFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPlantillaFactura;
	protected JButton jButtonDuplicarToolBarTipoPlantillaFactura;
	protected JButton jButtonNuevoRelacionesToolBarTipoPlantillaFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPlantillaFactura;
	protected JButton jButtonCopiarToolBarTipoPlantillaFactura;
	protected JButton jButtonVerFormToolBarTipoPlantillaFactura;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPlantillaFactura;
	protected JButton jButtonCerrarToolBarTipoPlantillaFactura;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPlantillaFactura;
	protected JButton jButtonProcesarInformacionToolBarTipoPlantillaFactura;
	protected JButton jButtonAnterioresToolBarTipoPlantillaFactura;
	protected JButton jButtonSiguientesToolBarTipoPlantillaFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPlantillaFactura;
	protected JButton jButtonAbrirOrderByToolBarTipoPlantillaFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPlantillaFactura;
	protected JMenuItem jMenuItemDuplicarTipoPlantillaFactura;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPlantillaFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPlantillaFactura;
	protected JMenuItem jMenuItemCopiarTipoPlantillaFactura;
	protected JMenuItem jMenuItemVerFormTipoPlantillaFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPlantillaFactura;
	protected JMenuItem jMenuItemCerrarTipoPlantillaFactura;
	protected JMenuItem jMenuItemDetalleCerrarTipoPlantillaFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPlantillaFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPlantillaFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPlantillaFactura;
	protected JMenuItem jMenuItemProcesarInformacionTipoPlantillaFactura;
	protected JMenuItem jMenuItemAnterioresTipoPlantillaFactura;
	protected JMenuItem jMenuItemSiguientesTipoPlantillaFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPlantillaFactura;
	protected JMenuItem jMenuItemAbrirOrderByTipoPlantillaFactura;
	protected JMenuItem jMenuItemMostrarOcultarTipoPlantillaFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPlantillaFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPlantillaFactura;
	protected JCheckBox jCheckBoxSeleccionadosTipoPlantillaFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPlantillaFactura;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPlantillaFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPlantillaFactura;
	protected JTextField jTextFieldValorCampoGeneralTipoPlantillaFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPlantillaFactura;
	//public JList<Reporte> jListColumnasSelectReporteTipoPlantillaFactura;
	//public JScrollPane jScrollColumnasSelectReporteTipoPlantillaFactura;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPlantillaFactura;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPlantillaFactura;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPlantillaFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPlantillaFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPlantillaFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura;
	
		
	//public JLabel jLabelArchivoImportacionTipoPlantillaFactura;	
	//public JLabel jLabelPathArchivoImportacionTipoPlantillaFactura;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPlantillaFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPlantillaFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPlantillaFactura;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPlantillaFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPlantillaFactura;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPlantillaFactura;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPlantillaFactura;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPlantillaFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPlantillaFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPlantillaFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPlantillaFactura;
	
	
	
	
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
	public TipoPlantillaFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPlantillaFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPlantillaFactura)	{
		this.jButtonRecargarInformacionTipoPlantillaFactura = jButtonRecargarInformacionTipoPlantillaFactura;
	}
	
	public JButton getjButtonProcesarInformacionTipoPlantillaFactura() {
		return this.jButtonProcesarInformacionTipoPlantillaFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPlantillaFactura)	{
		this.jButtonProcesarInformacionTipoPlantillaFactura = jButtonProcesarInformacionTipoPlantillaFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPlantillaFactura() {
		return this.jButtonRecargarInformacionTipoPlantillaFactura;
	}
	
	
	public List<TipoPlantillaFactura> gettipoplantillafacturas() {
		return this.tipoplantillafacturas;
	}

	public void settipoplantillafacturas(List<TipoPlantillaFactura> tipoplantillafacturas) {
		this.tipoplantillafacturas = tipoplantillafacturas;
	}
	
	public List<TipoPlantillaFactura> gettipoplantillafacturasAux() {
		return this.tipoplantillafacturasAux;
	}

	public void settipoplantillafacturasAux(List<TipoPlantillaFactura> tipoplantillafacturasAux) {
		this.tipoplantillafacturasAux = tipoplantillafacturasAux;
	}
	
	public List<TipoPlantillaFactura> gettipoplantillafacturasEliminados() {
		return this.tipoplantillafacturasEliminados;
	}

	public void setTipoPlantillaFacturasEliminados(List<TipoPlantillaFactura> tipoplantillafacturasEliminados) {
		this.tipoplantillafacturasEliminados = tipoplantillafacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPlantillaFactura() {
		return jComboBoxTiposSeleccionarTipoPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPlantillaFactura(
			JComboBox jComboBoxTiposSeleccionarTipoPlantillaFactura) {
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura = jComboBoxTiposSeleccionarTipoPlantillaFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPlantillaFactura() {
		return jTextFieldValorCampoGeneralTipoPlantillaFactura;
	}

	public void setjTextFieldValorCampoGeneralTipoPlantillaFactura(
			JTextField jTextFieldValorCampoGeneralTipoPlantillaFactura) {
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura = jTextFieldValorCampoGeneralTipoPlantillaFactura;
	}

	public void setBorderResaltarValorCampoGeneralTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPlantillaFactura() {
		return this.jCheckBoxSeleccionarTodosTipoPlantillaFactura;
	}

	public void setjCheckBoxSeleccionarTodosTipoPlantillaFactura(
			JCheckBox jCheckBoxSeleccionarTodosTipoPlantillaFactura) {
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura = jCheckBoxSeleccionarTodosTipoPlantillaFactura;
	}

	public void setBorderResaltarSeleccionarTodosTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPlantillaFactura() {
		return this.jCheckBoxSeleccionadosTipoPlantillaFactura;
	}

	public void setjCheckBoxSeleccionadosTipoPlantillaFactura(
			JCheckBox jCheckBoxSeleccionadosTipoPlantillaFactura) {
		this.jCheckBoxSeleccionadosTipoPlantillaFactura = jCheckBoxSeleccionadosTipoPlantillaFactura;
	}
	
	public void setBorderResaltarSeleccionadosTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPlantillaFactura() {
		return this.jComboBoxTiposArchivosReportesTipoPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPlantillaFactura(
			JComboBox jComboBoxTiposArchivosReportesTipoPlantillaFactura) {
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura = jComboBoxTiposArchivosReportesTipoPlantillaFactura;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPlantillaFactura() {
		return this.jComboBoxTiposReportesTipoPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPlantillaFactura(
			JComboBox jComboBoxTiposReportesTipoPlantillaFactura) {
		this.jComboBoxTiposReportesTipoPlantillaFactura = jComboBoxTiposReportesTipoPlantillaFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPlantillaFactura() {
	//	return jComboBoxTiposReportesDinamicoTipoPlantillaFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPlantillaFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPlantillaFactura) {
	//	this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura = jComboBoxTiposReportesDinamicoTipoPlantillaFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura = jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura;
	//}
	
	public void setBorderResaltarTiposReportesTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPlantillaFactura() {
		return this.jComboBoxTiposGraficosReportesTipoPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPlantillaFactura(
			JComboBox jComboBoxTiposGraficosReportesTipoPlantillaFactura) {
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura = jComboBoxTiposGraficosReportesTipoPlantillaFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPlantillaFactura() {
		return this.jComboBoxTiposPaginacionTipoPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPlantillaFactura(
			JComboBox jComboBoxTiposPaginacionTipoPlantillaFactura) {
		this.jComboBoxTiposPaginacionTipoPlantillaFactura = jComboBoxTiposPaginacionTipoPlantillaFactura;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPlantillaFactura() {
		return this.jComboBoxTiposRelacionesTipoPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPlantillaFactura() {
		return this.jComboBoxTiposAccionesTipoPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPlantillaFactura(
			JComboBox jComboBoxTiposRelacionesTipoPlantillaFactura) {
		this.jComboBoxTiposRelacionesTipoPlantillaFactura = jComboBoxTiposRelacionesTipoPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPlantillaFactura(
			JComboBox jComboBoxTiposAccionesTipoPlantillaFactura) {
		this.jComboBoxTiposAccionesTipoPlantillaFactura = jComboBoxTiposAccionesTipoPlantillaFactura;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPlantillaFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPlantillaFactura() {
	//	return jCheckBoxConGraficoDinamicoTipoPlantillaFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPlantillaFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPlantillaFactura) {
	//	this.jCheckBoxConGraficoDinamicoTipoPlantillaFactura = jCheckBoxConGraficoDinamicoTipoPlantillaFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPlantillaFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPlantillaFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPlantillaFactura .setBorder(borderResaltar);		
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
		this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
		
		this.tipoplantillafacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoplantillafacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPlantillaFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Plantilla Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPlantillaFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPlantillaFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"nuevo","nuevo","Nuevo"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"duplicar","duplicar","Duplicar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"copiar","copiar","Copiar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"ver_form","ver_form","Ver"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"recargar","recargar","Recargar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,
							"cerrar","cerrar","Salir"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPlantillaFactura;
			
				this.jButtonProcesarInformacionToolBarTipoPlantillaFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPlantillaFactura;
				
		//protected JButton jButtonModificarToolBarTipoPlantillaFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPlantillaFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPlantillaFactura=new JMenuMe("General");
		this.jmenuArchivoTipoPlantillaFactura=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPlantillaFactura=new JMenuMe("Acciones");
		this.jmenuDatosTipoPlantillaFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPlantillaFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPlantillaFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPlantillaFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPlantillaFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPlantillaFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPlantillaFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPlantillaFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPlantillaFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPlantillaFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPlantillaFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPlantillaFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPlantillaFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPlantillaFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPlantillaFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPlantillaFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPlantillaFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPlantillaFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPlantillaFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPlantillaFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPlantillaFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPlantillaFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPlantillaFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPlantillaFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPlantillaFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPlantillaFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPlantillaFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPlantillaFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPlantillaFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPlantillaFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPlantillaFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPlantillaFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPlantillaFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPlantillaFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPlantillaFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPlantillaFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPlantillaFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPlantillaFactura.add(this.jMenuItemCerrarTipoPlantillaFactura);
			
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemNuevoTipoPlantillaFactura);
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura);
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemNuevoRelacionesTipoPlantillaFactura);
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura);		
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemDuplicarTipoPlantillaFactura);		
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemCopiarTipoPlantillaFactura);		
			this.jmenuAccionesTipoPlantillaFactura.add(this.jMenuItemVerFormTipoPlantillaFactura);		
			
			this.jmenuDatosTipoPlantillaFactura.add(this.jMenuItemRecargarInformacionTipoPlantillaFactura);				
			this.jmenuDatosTipoPlantillaFactura.add(this.jMenuItemAnterioresTipoPlantillaFactura);				
			this.jmenuDatosTipoPlantillaFactura.add(this.jMenuItemSiguientesTipoPlantillaFactura);				
			this.jmenuDatosTipoPlantillaFactura.add(this.jMenuItemAbrirOrderByTipoPlantillaFactura);				
			this.jmenuDatosTipoPlantillaFactura.add(this.jMenuItemMostrarOcultarTipoPlantillaFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPlantillaFactura.add(this.jMenuItemGuardarCambiosTipoPlantillaFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPlantillaFactura.add(this.jmenuArchivoTipoPlantillaFactura);		
			this.jmenuBarTipoPlantillaFactura.add(this.jmenuAccionesTipoPlantillaFactura);		
			this.jmenuBarTipoPlantillaFactura.add(this.jmenuDatosTipoPlantillaFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPlantillaFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPlantillaFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoPlantillaFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPlantillaFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPlantillaFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPlantillaFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPlantillaFactura = new TipoPlantillaFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Plantilla Factura DATOS");
			this.jInternalFrameDetalleFormTipoPlantillaFactura = new TipoPlantillaFacturaDetalleFormJInternalFrame(jDesktopPane,this.tipoplantillafacturaSessionBean.getConGuardarRelaciones(),this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPlantillaFactura = null;//new TipoPlantillaFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPlantillaFactura= new GridBagLayout();
		
		
		this.jTableDatosTipoPlantillaFactura = new JTableMe();      
		
		String sToolTipTipoPlantillaFactura="";
		sToolTipTipoPlantillaFactura=TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPlantillaFactura+="(Contabilidad.TipoPlantillaFactura)";
		}
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPlantillaFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPlantillaFactura.setToolTipText(sToolTipTipoPlantillaFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPlantillaFactura);
		this.jTableDatosTipoPlantillaFactura.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPlantillaFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPlantillaFactura.setRowSelectionAllowed(true);
		this.jTableDatosTipoPlantillaFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPlantillaFactura = new JButtonMe();
		this.jButtonDuplicarTipoPlantillaFactura = new JButtonMe();
		this.jButtonCopiarTipoPlantillaFactura = new JButtonMe();
		this.jButtonVerFormTipoPlantillaFactura = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPlantillaFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura = new JButtonMe();
		this.jButtonCerrarTipoPlantillaFactura = new JButtonMe();
		
		this.jScrollPanelDatosTipoPlantillaFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPlantillaFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Plantilla Factura";
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plantilla Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPlantillaFactura.setToolTipText("Acciones");
        this.jPanelAccionesTipoPlantillaFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPlantillaFactura=new ReporteDinamicoJInternalFrame(TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPlantillaFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPlantillaFactura=new ImportacionJInternalFrame(TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPlantillaFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPlantillaFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPlantillaFactura.setText("Orden");
		this.jButtonAbrirOrderByTipoPlantillaFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPlantillaFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPlantillaFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPlantillaFactura,false,this);
			
			//this.cargarOrderByTipoPlantillaFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPlantillaFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPlantillaFactura,true,this);
			
			//this.cargarOrderByTipoPlantillaFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPlantillaFactura.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPlantillaFactura.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPlantillaFactura.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPlantillaFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPlantillaFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPlantillaFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPlantillaFactura.setText("Nuevo");
		this.jButtonDuplicarTipoPlantillaFactura.setText("Duplicar");
		this.jButtonCopiarTipoPlantillaFactura.setText("Copiar");
		this.jButtonVerFormTipoPlantillaFactura.setText("Ver");
		this.jButtonNuevoRelacionesTipoPlantillaFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.setText("Guardar");
		this.jButtonCerrarTipoPlantillaFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPlantillaFactura,"nuevo_button","Nuevo",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPlantillaFactura,"duplicar_button","Duplicar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPlantillaFactura,"copiar_button","Copiar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPlantillaFactura,"ver_form","Ver",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPlantillaFactura,"nuevorelaciones_button","Nuevo Rel",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPlantillaFactura,"guardarcambiostabla_button","Guardar",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPlantillaFactura,"cerrar_button","Salir",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPlantillaFactura.setToolTipText("Nuevo"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPlantillaFactura.setToolTipText("Duplicar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPlantillaFactura.setToolTipText("Copiar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPlantillaFactura.setToolTipText("Ver"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPlantillaFactura.setToolTipText("Nuevo Rel"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.setToolTipText("Guardar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPlantillaFactura.setToolTipText("Salir"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPlantillaFactura";
		inputMap = this.jButtonNuevoTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPlantillaFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPlantillaFactura";
		inputMap = this.jButtonDuplicarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPlantillaFactura"));
		
		//COPIAR
		sMapKey = "CopiarTipoPlantillaFactura";
		inputMap = this.jButtonCopiarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPlantillaFactura"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPlantillaFactura";
		inputMap = this.jButtonVerFormTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPlantillaFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPlantillaFactura";
		inputMap = this.jButtonNuevoRelacionesTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPlantillaFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPlantillaFactura";
		inputMap = this.jButtonModificarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPlantillaFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPlantillaFactura";
		inputMap = this.jButtonCerrarTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPlantillaFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPlantillaFactura";
		inputMap = this.jButtonGuardarCambiosTablaTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPlantillaFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPlantillaFactura.setName("jPanelParametrosReportesTipoPlantillaFactura"); 
		
		this.jPanelParametrosReportesAccionesTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPlantillaFactura.setName("jPanelParametrosReportesAccionesTipoPlantillaFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPlantillaFactura = new JButtonMe();
		this.jButtonRecargarInformacionTipoPlantillaFactura.setText("Recargar");
		this.jButtonRecargarInformacionTipoPlantillaFactura.setToolTipText("Recargar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPlantillaFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPlantillaFactura = new JButtonMe();
		this.jButtonProcesarInformacionTipoPlantillaFactura.setText("Procesar");
		this.jButtonProcesarInformacionTipoPlantillaFactura.setToolTipText("Procesar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPlantillaFactura.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPlantillaFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPlantillaFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPlantillaFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPlantillaFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPlantillaFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPlantillaFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPlantillaFactura.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPlantillaFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPlantillaFactura.setText("Accion");
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPlantillaFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPlantillaFactura = new JLabelMe();
		
		this.jLabelAccionesTipoPlantillaFactura.setText("Acciones");		
		this.jLabelAccionesTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPlantillaFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPlantillaFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPlantillaFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPlantillaFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPlantillaFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPlantillaFactura = new JButtonMe();
		//this.jButtonAnterioresTipoPlantillaFactura.setText("<<");
        this.jButtonAnterioresTipoPlantillaFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPlantillaFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPlantillaFactura = new JButtonMe();
		//this.jButtonSiguientesTipoPlantillaFactura.setText(">>");
        this.jButtonSiguientesTipoPlantillaFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPlantillaFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPlantillaFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPlantillaFactura,"nuevoguardarcambios_button","Nue",this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPlantillaFactura";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPlantillaFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPlantillaFactura";
		inputMap = this.jButtonRecargarInformacionTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPlantillaFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPlantillaFactura";
		inputMap = this.jButtonSiguientesTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPlantillaFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPlantillaFactura";
		inputMap = this.jButtonAnterioresTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPlantillaFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPlantillaFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPlantillaFactura.setMinimumSize(new Dimension(this.getWidth(),TipoPlantillaFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPlantillaFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPlantillaFactura.setMaximumSize(new Dimension(this.getWidth(),TipoPlantillaFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPlantillaFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPlantillaFactura.setPreferredSize(new Dimension(this.getWidth(),TipoPlantillaFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPlantillaFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPlantillaFactura = new GridBagLayout();

			this.jPanelPaginacionTipoPlantillaFactura.setLayout(gridaBagLayoutPaginacionTipoPlantillaFactura);						
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonAnterioresTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
					
						
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
			
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonNuevoGuardarCambiosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
						
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonSiguientesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 1;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonNuevoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
						
			
			
			if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPlantillaFactura.gridy = 1;
				this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonGuardarCambiosTablaTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			}
			
			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 1;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonDuplicarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 1;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonCopiarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 1;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonVerFormTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 1;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPlantillaFactura.add(this.jButtonCerrarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
		
		
		this.jButtonRecargarInformacionTipoPlantillaFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPlantillaFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPlantillaFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPlantillaFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPlantillaFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPlantillaFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPlantillaFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPlantillaFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPlantillaFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPlantillaFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPlantillaFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPlantillaFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPlantillaFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPlantillaFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPlantillaFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPlantillaFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPlantillaFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPlantillaFactura.setLayout(gridaBagParametrosReportesTipoPlantillaFactura);
			this.jPanelParametrosReportesAccionesTipoPlantillaFactura.setLayout(gridaBagParametrosReportesAccionesTipoPlantillaFactura);
			
			
			this.jPanelParametrosAuxiliar1TipoPlantillaFactura.setLayout(gridaBagParametrosAuxiliar1TipoPlantillaFactura);
			this.jPanelParametrosAuxiliar2TipoPlantillaFactura.setLayout(gridaBagParametrosAuxiliar2TipoPlantillaFactura);
			this.jPanelParametrosAuxiliar3TipoPlantillaFactura.setLayout(gridaBagParametrosAuxiliar3TipoPlantillaFactura);
			this.jPanelParametrosAuxiliar4TipoPlantillaFactura.setLayout(gridaBagParametrosAuxiliar4TipoPlantillaFactura);
			//this.jPanelParametrosAuxiliar5TipoPlantillaFactura.setLayout(gridaBagParametrosAuxiliar2TipoPlantillaFactura);			
			
			
			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jButtonRecargarInformacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPlantillaFactura.add(this.jComboBoxTiposPaginacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPlantillaFactura.add(this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPlantillaFactura.add(this.jComboBoxTiposArchivosReportesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jPanelParametrosAuxiliar1TipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPlantillaFactura.add(this.jComboBoxTiposReportesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jPanelParametrosAuxiliar4TipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jComboBoxTiposReportesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jCheckBoxGenerarReporteTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jPanelParametrosAuxiliar2TipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jLabelAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jButtonAbrirOrderByTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jComboBoxTiposSeleccionarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
			
			
			/*
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jCheckBoxSeleccionarTodosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPlantillaFactura.add(this.jCheckBoxSeleccionarTodosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);															
				
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPlantillaFactura.add(this.jCheckBoxSeleccionadosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jPanelParametrosAuxiliar3TipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPlantillaFactura.add(this.jComboBoxTiposAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPlantillaFactura = new GridBagLayout();

			this.jScrollPanelDatosTipoPlantillaFactura.setLayout(gridaBagLayoutDatosTipoPlantillaFactura);
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
			
			this.jScrollPanelDatosTipoPlantillaFactura.add(this.jTableDatosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPlantillaFactura.setViewportView(this.jTableDatosTipoPlantillaFactura);
		this.jTableDatosTipoPlantillaFactura.setFillsViewportHeight(true);
		this.jTableDatosTipoPlantillaFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPlantillaFactura= new GridBagLayout();
		this.jPanelAccionesTipoPlantillaFactura.setLayout(gridaBagLayoutAccionesTipoPlantillaFactura);
		
		
		/*	
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = 0;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
			
		this.jPanelAccionesTipoPlantillaFactura.add(this.jButtonNuevoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPlantillaFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPlantillaFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();						
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;		
			//this.gridBagConstraintsTipoPlantillaFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPlantillaFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;		
		//this.gridBagConstraintsTipoPlantillaFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPlantillaFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPlantillaFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);								
		
		
		/*
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		*/		
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPlantillaFactura.gridx =0;
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPlantillaFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
				
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPlantillaFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPlantillaFactura.setLayout(gridaBagLayoutBusquedasParametrosTipoPlantillaFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPlantillaFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
			
			
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
			
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPlantillaFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPlantillaFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPlantillaFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPlantillaFactura.setName("jPanelReporteDinamicoTipoPlantillaFactura"); 
		
		this.jPanelReporteDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPlantillaFactura.setLayout(gridaBagLayoutReporteDinamicoTipoPlantillaFactura);
		
		
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPlantillaFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPlantillaFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plantilla Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPlantillaFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPlantillaFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jLabelColumnasSelectReporteTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPlantillaFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPlantillaFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPlantillaFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPlantillaFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPlantillaFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPlantillaFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPlantillaFactura=new JScrollPane(this.jListColumnasSelectReporteTipoPlantillaFactura);
			
			this.jScrollColumnasSelectReporteTipoPlantillaFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPlantillaFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPlantillaFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jListColumnasSelectReporteTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jScrollColumnasSelectReporteTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPlantillaFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPlantillaFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPlantillaFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPlantillaFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPlantillaFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPlantillaFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPlantillaFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPlantillaFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPlantillaFactura=new JScrollPane(this.jListRelacionesSelectReporteTipoPlantillaFactura);
			
			this.jScrollRelacionesSelectReporteTipoPlantillaFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPlantillaFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPlantillaFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoPlantillaFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPlantillaFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPlantillaFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jLabelGenerarExcelReporteDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura.setToolTipText("Generar EXCEL"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jComboBoxTiposReportesDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jLabelTiposArchivoReporteDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPlantillaFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPlantillaFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPlantillaFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPlantillaFactura.setToolTipText("Generar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jButtonGenerarReporteDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPlantillaFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPlantillaFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPlantillaFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPlantillaFactura.setToolTipText("Cancelar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPlantillaFactura.add(this.jButtonCerrarReporteDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPlantillaFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPlantillaFactura= new JScrollPane(jPanelReporteDinamicoTipoPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plantilla Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPlantillaFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPlantillaFactura);
		this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPlantillaFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPlantillaFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPlantillaFactura.setName("jPanelImportacionTipoPlantillaFactura"); 
		
		this.jPanelImportacionTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPlantillaFactura.setLayout(gridaBagLayoutImportacionTipoPlantillaFactura);
		
		
		this.jInternalFrameImportacionTipoPlantillaFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPlantillaFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPlantillaFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPlantillaFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPlantillaFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPlantillaFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPlantillaFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPlantillaFactura.setResizable(true);
	    this.jInternalFrameImportacionTipoPlantillaFactura.setClosable(true);
	    this.jInternalFrameImportacionTipoPlantillaFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPlantillaFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPlantillaFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPlantillaFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPlantillaFactura.setResizable(true);
	    this.jInternalFrameImportacionTipoPlantillaFactura.setClosable(true);
	    this.jInternalFrameImportacionTipoPlantillaFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plantilla Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPlantillaFactura = new JLabelMe();

		this.jLabelArchivoImportacionTipoPlantillaFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPlantillaFactura.add(this.jLabelArchivoImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPlantillaFactura = new JFileChooser();		
		this.jFileChooserImportacionTipoPlantillaFactura.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPlantillaFactura = new JButtonMe();
		this.jButtonAbrirImportacionTipoPlantillaFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPlantillaFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPlantillaFactura.setToolTipText("Generar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPlantillaFactura.add(this.jButtonAbrirImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPlantillaFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPlantillaFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPlantillaFactura.add(this.jLabelPathArchivoImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPlantillaFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPlantillaFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPlantillaFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPlantillaFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPlantillaFactura.add(this.jTextFieldPathArchivoImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPlantillaFactura = new JButtonMe();
		this.jButtonGenerarImportacionTipoPlantillaFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPlantillaFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPlantillaFactura.setToolTipText("Generar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPlantillaFactura.add(this.jButtonGenerarImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPlantillaFactura = new JButtonMe();
		this.jButtonCerrarImportacionTipoPlantillaFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPlantillaFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPlantillaFactura.setToolTipText("Cancelar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPlantillaFactura.add(this.jButtonCerrarImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPlantillaFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPlantillaFactura= new JScrollPane(jPanelImportacionTipoPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoPlantillaFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPlantillaFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPlantillaFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPlantillaFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPlantillaFactura);
		this.jInternalFrameImportacionTipoPlantillaFactura.getContentPane().add(this.jScrollPanelImportacionTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPlantillaFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPlantillaFactura = new JButtonMe();
			this.jButtonAbrirOrderByTipoPlantillaFactura.setText("Orden");
			this.jButtonAbrirOrderByTipoPlantillaFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPlantillaFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPlantillaFactura";
			inputMap = this.jButtonAbrirOrderByTipoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPlantillaFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPlantillaFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPlantillaFactura.setName("jPanelOrderByTipoPlantillaFactura"); 
			
			this.jPanelOrderByTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPlantillaFactura.setLayout(gridaBagLayoutOrderByTipoPlantillaFactura);
			
			
			this.jTableDatosTipoPlantillaFacturaOrderBy = new JTableMe();        
			this.jTableDatosTipoPlantillaFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPlantillaFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPlantillaFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPlantillaFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPlantillaFacturaOrderBy.setViewportView(this.jTableDatosTipoPlantillaFacturaOrderBy);
			this.jTableDatosTipoPlantillaFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPlantillaFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPlantillaFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPlantillaFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPlantillaFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPlantillaFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPlantillaFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPlantillaFactura.setTitle("Orden");
			this.jInternalFrameOrderByTipoPlantillaFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPlantillaFactura.setResizable(true);
			this.jInternalFrameOrderByTipoPlantillaFactura.setClosable(true);
			this.jInternalFrameOrderByTipoPlantillaFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plantilla Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPlantillaFactura.ipady =150;
				
			this.jPanelOrderByTipoPlantillaFactura.add(jScrollPanelDatosTipoPlantillaFacturaOrderBy, this.gridBagConstraintsTipoPlantillaFactura);//this.jTableDatosTipoPlantillaFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPlantillaFactura = new JButtonMe();
			this.jButtonCerrarOrderByTipoPlantillaFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPlantillaFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPlantillaFactura.setToolTipText("Cancelar"+" "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPlantillaFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPlantillaFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPlantillaFactura.add(this.jButtonCerrarOrderByTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPlantillaFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPlantillaFactura= new JScrollPane(jPanelOrderByTipoPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoPlantillaFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPlantillaFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPlantillaFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPlantillaFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPlantillaFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPlantillaFactura);
			
			this.jInternalFrameOrderByTipoPlantillaFactura.getContentPane().add(this.jScrollPanelOrderByTipoPlantillaFactura, this.gridBagConstraintsTipoPlantillaFactura);			
		
		} else {
			this.jButtonAbrirOrderByTipoPlantillaFactura = new JButtonMe();
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
			&& this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPlantillaFactura.getRowHeight();//TipoPlantillaFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.isSelected()) {
					iHeightTable=TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPlantillaFactura.isSelected()) {
					iHeightTable=TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPlantillaFactura!=null && this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPlantillaFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPlantillaFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPlantillaFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPlantillaFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPlantillaFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPlantillaFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoplantillafacturaLogic.getTipoPlantillaFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoplantillafacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPlantillaFactura> TraerTipoPlantillaFacturaBeans(List<TipoPlantillaFactura> tipoplantillafacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPlantillaFactura tipoplantillafactura:tipoplantillafacturas) {
					
				if(!(TipoPlantillaFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPlantillaFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoplantillafactura.setsDetalleGeneralEntityReporte(TipoPlantillaFacturaConstantesFunciones.getTipoPlantillaFacturaDescripcion(tipoplantillafactura));
										
						
					
						
					
				} else  {
							
					//tipoplantillafactura.setsDetalleGeneralEntityReporte(tipoplantillafactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoplantillafacturabeans.add(tipoplantillafacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoplantillafacturas;
    }
	//PARA REPORTES FIN
}
