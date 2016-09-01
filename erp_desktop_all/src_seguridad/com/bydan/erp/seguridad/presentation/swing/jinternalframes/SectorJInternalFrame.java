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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.SectorConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class SectorJInternalFrame extends SectorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSector;
	
	protected JMenuBar jmenuBarSector;
	
	protected JMenu jmenuSector;
	protected JMenu jmenuDatosSector;
	protected JMenu jmenuArchivoSector;
	protected JMenu jmenuAccionesSector;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSector;	
	protected GridBagConstraints gridBagConstraintsSector;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SectorDetalleFormJInternalFrame jInternalFrameDetalleFormSector;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSector;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSector;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public SectorSessionBean sectorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Sector> sectors;		
	public List<Sector> sectorsEliminados;	
	public List<Sector> sectorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySector;		
	protected JButton jButtonAbrirOrderBySector;
	
	
	//protected JPanel jPanelOrderBySector;
	//public JScrollPane jScrollPanelOrderBySector;	
	//protected JButton jButtonCerrarOrderBySector;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SectorLogic sectorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSector;
	public JScrollPane jScrollPanelDatosEdicionSector;
	public JScrollPane jScrollPanelDatosGeneralSector;
    
	
	
	//public JScrollPane jScrollPanelDatosSectorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSector;
	//public JScrollPane jScrollPanelImportacionSector;
	
	
	
	protected JPanel jPanelAccionesSector;
	
    protected JPanel jPanelPaginacionSector;
    protected JPanel jPanelParametrosReportesSector;
	protected JPanel jPanelParametrosReportesAccionesSector;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Sector;
	protected JPanel jPanelParametrosAuxiliar2Sector;
	protected JPanel jPanelParametrosAuxiliar3Sector;
	protected JPanel jPanelParametrosAuxiliar4Sector;
	//protected JPanel jPanelParametrosAuxiliar5Sector;
	
	
	
	//protected JPanel jPanelReporteDinamicoSector;
	//protected JPanel jPanelImportacionSector;
	
	
	public JTable jTableDatosSector;
	
	
	
	//public JTable jTableDatosSectorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSector;
	protected JButton jButtonDuplicarSector;
	protected JButton jButtonCopiarSector;
	protected JButton jButtonVerFormSector;
	protected JButton jButtonNuevoRelacionesSector;
	protected JButton jButtonModificarSector;
	
    protected JButton jButtonGuardarCambiosTablaSector;
	protected JButton jButtonCerrarSector;
	
	
	protected JButton jButtonRecargarInformacionSector;
	protected JButton jButtonProcesarInformacionSector;
	
	
	protected JButton jButtonAnterioresSector;
	protected JButton jButtonSiguientesSector;
	protected JButton jButtonNuevoGuardarCambiosSector;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSector;
	//protected JButton jButtonCerrarReporteDinamicoSector;
	//protected JButton jButtonGenerarExcelReporteDinamicoSector;	
	
	
	
	//protected JButton jButtonAbrirImportacionSector;
	//protected JButton jButtonGenerarImportacionSector;
	//protected JButton jButtonCerrarImportacionSector;
	//protected JFileChooser jFileChooserImportacionSector;
	//protected File fileImportacionSector;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSector;
	protected JButton jButtonDuplicarToolBarSector;
	protected JButton jButtonNuevoRelacionesToolBarSector;
	
	
	public JButton jButtonGuardarCambiosToolBarSector;
	protected JButton jButtonCopiarToolBarSector;
	protected JButton jButtonVerFormToolBarSector;
	public JButton jButtonGuardarCambiosTablaToolBarSector;
	protected JButton jButtonMostrarOcultarTablaToolBarSector;
	protected JButton jButtonCerrarToolBarSector;
	
	protected JButton jButtonRecargarInformacionToolBarSector;
	protected JButton jButtonProcesarInformacionToolBarSector;
	protected JButton jButtonAnterioresToolBarSector;
	protected JButton jButtonSiguientesToolBarSector;
	protected JButton jButtonNuevoGuardarCambiosToolBarSector;
	protected JButton jButtonAbrirOrderByToolBarSector;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSector;
	protected JMenuItem jMenuItemDuplicarSector;
	protected JMenuItem jMenuItemNuevoRelacionesSector;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSector;
	protected JMenuItem jMenuItemCopiarSector;
	protected JMenuItem jMenuItemVerFormSector;
	protected JMenuItem jMenuItemGuardarCambiosTablaSector;
	protected JMenuItem jMenuItemCerrarSector;
	protected JMenuItem jMenuItemDetalleCerrarSector;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySector;
	protected JMenuItem jMenuItemDetalleMostarOcultarSector;
	
	protected JMenuItem jMenuItemRecargarInformacionSector;
	protected JMenuItem jMenuItemProcesarInformacionSector;
	protected JMenuItem jMenuItemAnterioresSector;
	protected JMenuItem jMenuItemSiguientesSector;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSector;
	protected JMenuItem jMenuItemAbrirOrderBySector;
	protected JMenuItem jMenuItemMostrarOcultarSector;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSector;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSector;
	protected JCheckBox jCheckBoxSeleccionadosSector;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSector;
	protected JCheckBox jCheckBoxConGraficoReporteSector;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSector;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSector;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSector;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSector;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSector;
	protected JTextField jTextFieldValorCampoGeneralSector;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSector;
	//public JList<Reporte> jListColumnasSelectReporteSector;
	//public JScrollPane jScrollColumnasSelectReporteSector;
	
	//public JLabel jLabelRelacionesSelectReporteSector;
	//public JList<Reporte> jListRelacionesSelectReporteSector;
	//public JScrollPane jScrollRelacionesSelectReporteSector;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSector;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSector;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSector;
	//public JLabel jLabelTiposArchivoReporteDinamicoSector;
	
		
	//public JLabel jLabelArchivoImportacionSector;	
	//public JLabel jLabelPathArchivoImportacionSector;
	//protected JTextField jTextFieldPathArchivoImportacionSector;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSector;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSector;
	
	//public JLabel jLabelColumnaCategoriaValorSector;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSector;
	
	//public JLabel jLabelColumnasValoresGraficoSector;
	//public JList<Reporte> jListColumnasValoresGraficoSector;
	//public JScrollPane jScrollColumnasValoresGraficoSector;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSector;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSector;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSector;
	public JPanel jPanelFK_IdCiudadSector;
	public JButton jButtonFK_IdCiudadSector;
	
	public JPanel jPanelid_ciudadFK_IdCiudadSector;
	public JLabel jLabelid_ciudadFK_IdCiudadSector;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadSector;
	public JButton jButtonid_ciudadFK_IdCiudadSector= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadSectorUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadSectorBusqueda= new JButtonMe();

	
	
	
	
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
	public SectorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SectorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSector)	{
		this.jButtonRecargarInformacionSector = jButtonRecargarInformacionSector;
	}
	
	public JButton getjButtonProcesarInformacionSector() {
		return this.jButtonProcesarInformacionSector;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSector)	{
		this.jButtonProcesarInformacionSector = jButtonProcesarInformacionSector;
	}
	
	
	public JButton getjButtonRecargarInformacionSector() {
		return this.jButtonRecargarInformacionSector;
	}
	
	
	public List<Sector> getsectors() {
		return this.sectors;
	}

	public void setsectors(List<Sector> sectors) {
		this.sectors = sectors;
	}
	
	public List<Sector> getsectorsAux() {
		return this.sectorsAux;
	}

	public void setsectorsAux(List<Sector> sectorsAux) {
		this.sectorsAux = sectorsAux;
	}
	
	public List<Sector> getsectorsEliminados() {
		return this.sectorsEliminados;
	}

	public void setSectorsEliminados(List<Sector> sectorsEliminados) {
		this.sectorsEliminados = sectorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSector() {
		return jComboBoxTiposSeleccionarSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSector(
			JComboBox jComboBoxTiposSeleccionarSector) {
		this.jComboBoxTiposSeleccionarSector = jComboBoxTiposSeleccionarSector;
	}
	
	public void setBorderResaltarTiposSeleccionarSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSector .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSector() {
		return jTextFieldValorCampoGeneralSector;
	}

	public void setjTextFieldValorCampoGeneralSector(
			JTextField jTextFieldValorCampoGeneralSector) {
		this.jTextFieldValorCampoGeneralSector = jTextFieldValorCampoGeneralSector;
	}

	public void setBorderResaltarValorCampoGeneralSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSector .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSector() {
		return this.jCheckBoxSeleccionarTodosSector;
	}

	public void setjCheckBoxSeleccionarTodosSector(
			JCheckBox jCheckBoxSeleccionarTodosSector) {
		this.jCheckBoxSeleccionarTodosSector = jCheckBoxSeleccionarTodosSector;
	}

	public void setBorderResaltarSeleccionarTodosSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSector .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSector() {
		return this.jCheckBoxSeleccionadosSector;
	}

	public void setjCheckBoxSeleccionadosSector(
			JCheckBox jCheckBoxSeleccionadosSector) {
		this.jCheckBoxSeleccionadosSector = jCheckBoxSeleccionadosSector;
	}
	
	public void setBorderResaltarSeleccionadosSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSector .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSector() {
		return this.jComboBoxTiposArchivosReportesSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSector(
			JComboBox jComboBoxTiposArchivosReportesSector) {
		this.jComboBoxTiposArchivosReportesSector = jComboBoxTiposArchivosReportesSector;
	}

	public void setBorderResaltarTiposArchivosReportesSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSector() {
		return this.jComboBoxTiposReportesSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSector(
			JComboBox jComboBoxTiposReportesSector) {
		this.jComboBoxTiposReportesSector = jComboBoxTiposReportesSector;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSector() {
	//	return jComboBoxTiposReportesDinamicoSector;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSector(
	//		JComboBox jComboBoxTiposReportesDinamicoSector) {
	//	this.jComboBoxTiposReportesDinamicoSector = jComboBoxTiposReportesDinamicoSector;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSector() {
	//	return jComboBoxTiposArchivosReportesDinamicoSector;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSector(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSector) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSector = jComboBoxTiposArchivosReportesDinamicoSector;
	//}
	
	public void setBorderResaltarTiposReportesSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSector() {
		return this.jComboBoxTiposGraficosReportesSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSector(
			JComboBox jComboBoxTiposGraficosReportesSector) {
		this.jComboBoxTiposGraficosReportesSector = jComboBoxTiposGraficosReportesSector;
	}
	
	public void setBorderResaltarTiposGraficosReportesSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSector() {
		return this.jComboBoxTiposPaginacionSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSector(
			JComboBox jComboBoxTiposPaginacionSector) {
		this.jComboBoxTiposPaginacionSector = jComboBoxTiposPaginacionSector;
	}
	
	public void setBorderResaltarTiposPaginacionSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSector() {
		return this.jComboBoxTiposRelacionesSector;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSector() {
		return this.jComboBoxTiposAccionesSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSector(
			JComboBox jComboBoxTiposRelacionesSector) {
		this.jComboBoxTiposRelacionesSector = jComboBoxTiposRelacionesSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSector(
			JComboBox jComboBoxTiposAccionesSector) {
		this.jComboBoxTiposAccionesSector = jComboBoxTiposAccionesSector;
	}
	
	public void setBorderResaltarTiposRelacionesSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSector .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSector .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSector() {
	//	return jCheckBoxConGraficoDinamicoSector;
	//}

	//public void setjCheckBoxConGraficoDinamicoSector(
	//		JCheckBox jCheckBoxConGraficoDinamicoSector) {
	//	this.jCheckBoxConGraficoDinamicoSector = jCheckBoxConGraficoDinamicoSector;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSector() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSector.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSector .setBorder(borderResaltar);		
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
		this.sectorSessionBean=new SectorSessionBean();
		
		this.sectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sectorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SectorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SectorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SectorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sector MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
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
		
		SectorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Sector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSector= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSector,this.jTtoolBarSector,
							"nuevo","nuevo","Nuevo"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSector,this.jTtoolBarSector,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSector,this.jTtoolBarSector,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSector,this.jTtoolBarSector,
							"duplicar","duplicar","Duplicar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSector,this.jTtoolBarSector,
							"copiar","copiar","Copiar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSector,this.jTtoolBarSector,
							"ver_form","ver_form","Ver"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSector,this.jTtoolBarSector,
							"recargar","recargar","Recargar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSector,this.jTtoolBarSector,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSector,this.jTtoolBarSector,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSector,this.jTtoolBarSector,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSector,this.jTtoolBarSector,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSector,this.jTtoolBarSector,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSector,this.jTtoolBarSector,
							"cerrar","cerrar","Salir"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSector=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSector;
			
				this.jButtonProcesarInformacionToolBarSector=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSector;
				
		//protected JButton jButtonModificarToolBarSector;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSector=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSector=new JMenuMe("General");
		this.jmenuArchivoSector=new JMenuMe("Archivo");
		this.jmenuAccionesSector=new JMenuMe("Acciones");
		this.jmenuDatosSector=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSector= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSector.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSector,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSector= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSector.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSector,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSector= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSector.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSector,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSector= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSector.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSector,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSector= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSector.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSector,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSector= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSector.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSector,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSector= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSector.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSector,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSector= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSector.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSector,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSector= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSector.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSector,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSector= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSector.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSector,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSector= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSector.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSector,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSector= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSector.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSector,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySector= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySector.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySector,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSector,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySector= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySector.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySector,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSector,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSector, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSector= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSector.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSector,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSector.add(this.jMenuItemCerrarSector);
			
			this.jmenuAccionesSector.add(this.jMenuItemNuevoSector);
			this.jmenuAccionesSector.add(this.jMenuItemNuevoGuardarCambiosSector);
			this.jmenuAccionesSector.add(this.jMenuItemNuevoRelacionesSector);
			this.jmenuAccionesSector.add(this.jMenuItemGuardarCambiosTablaSector);		
			this.jmenuAccionesSector.add(this.jMenuItemDuplicarSector);		
			this.jmenuAccionesSector.add(this.jMenuItemCopiarSector);		
			this.jmenuAccionesSector.add(this.jMenuItemVerFormSector);		
			
			this.jmenuDatosSector.add(this.jMenuItemRecargarInformacionSector);				
			this.jmenuDatosSector.add(this.jMenuItemAnterioresSector);				
			this.jmenuDatosSector.add(this.jMenuItemSiguientesSector);				
			this.jmenuDatosSector.add(this.jMenuItemAbrirOrderBySector);				
			this.jmenuDatosSector.add(this.jMenuItemMostrarOcultarSector);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSector.add(this.jMenuItemGuardarCambiosSector);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSector, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSector, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSector, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSector.add(this.jmenuArchivoSector);		
			this.jmenuBarSector.add(this.jmenuAccionesSector);		
			this.jmenuBarSector.add(this.jmenuDatosSector);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSector);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSector() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadSector=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadSector.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadSector= new JButtonMe();
		this.jButtonFK_IdCiudadSector.setText("Buscar");
		this.jButtonFK_IdCiudadSector.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadSector,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadSector, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadSector = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadSector.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadSector.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadSector,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadSector= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadSector,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSector=new JTabbedPane();


		this.jTabbedPaneBusquedasSector.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSector.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSector.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSector,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSector = new SectorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sector DATOS");
			this.jInternalFrameDetalleFormSector = new SectorDetalleFormJInternalFrame(jDesktopPane,this.sectorSessionBean.getConGuardarRelaciones(),this.sectorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSector = null;//new SectorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSector= new GridBagLayout();
		
		
		this.jTableDatosSector = new JTableMe();      
		
		String sToolTipSector="";
		sToolTipSector=SectorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSector+="(Seguridad.Sector)";
		}
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			sToolTipSector+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSector.setToolTipText(sToolTipSector);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSector);
		this.jTableDatosSector.setAutoCreateRowSorter(true);
		this.jTableDatosSector.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSector.setRowSelectionAllowed(true);
		this.jTableDatosSector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSector,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSector = new JButtonMe();
		this.jButtonDuplicarSector = new JButtonMe();
		this.jButtonCopiarSector = new JButtonMe();
		this.jButtonVerFormSector = new JButtonMe();
		this.jButtonNuevoRelacionesSector = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSector = new JButtonMe();
		this.jButtonCerrarSector = new JButtonMe();
		
		this.jScrollPanelDatosSector = new JScrollPane();   
        this.jScrollPanelDatosGeneralSector = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sector";
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores" + this.sPath));
		} else {
			this.jScrollPanelDatosSector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSector.setToolTipText("Acciones");
        this.jPanelAccionesSector.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSector, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSector=new ReporteDinamicoJInternalFrame(SectorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSector();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSector=new ImportacionJInternalFrame(SectorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSector();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySector = new JButtonMe();
		
		this.jButtonAbrirOrderBySector.setText("Orden");
		this.jButtonAbrirOrderBySector.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySector,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySector,false,this);
			
			//this.cargarOrderBySector(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySector,true,this);
			
			//this.cargarOrderBySector(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSector.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosSector.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosSector.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosSector.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSector.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSector.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSector.setText("Nuevo");
		this.jButtonDuplicarSector.setText("Duplicar");
		this.jButtonCopiarSector.setText("Copiar");
		this.jButtonVerFormSector.setText("Ver");
		this.jButtonNuevoRelacionesSector.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSector.setText("Guardar");
		this.jButtonCerrarSector.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSector,"nuevo_button","Nuevo",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSector,"duplicar_button","Duplicar",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSector,"copiar_button","Copiar",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSector,"ver_form","Ver",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSector,"nuevorelaciones_button","Nuevo Rel",this.sectorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSector,"guardarcambiostabla_button","Guardar",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSector,"cerrar_button","Salir",this.sectorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSector, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSector.setToolTipText("Nuevo"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSector.setToolTipText("Duplicar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSector.setToolTipText("Copiar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSector.setToolTipText("Ver"+" "+SectorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSector.setToolTipText("Nuevo Rel"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSector.setToolTipText("Guardar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSector.setToolTipText("Salir"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSector";
		inputMap = this.jButtonNuevoSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSector"));
		
		//DUPLICAR
		sMapKey = "DuplicarSector";
		inputMap = this.jButtonDuplicarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSector"));
		
		//COPIAR
		sMapKey = "CopiarSector";
		inputMap = this.jButtonCopiarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSector"));
		
		//VEr FORM
		sMapKey = "VerFormSector";
		inputMap = this.jButtonVerFormSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSector"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSector";
		inputMap = this.jButtonNuevoRelacionesSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSector"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSector";
		inputMap = this.jButtonModificarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSector"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSector";
		inputMap = this.jButtonCerrarSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSector"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSector";
		inputMap = this.jButtonGuardarCambiosTablaSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSector"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Sector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Sector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Sector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Sector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Sector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSector.setName("jPanelParametrosReportesSector"); 
		
		this.jPanelParametrosReportesAccionesSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSector.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSector.setName("jPanelParametrosReportesAccionesSector"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSector, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSector, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSector = new JButtonMe();
		this.jButtonRecargarInformacionSector.setText("Recargar");
		this.jButtonRecargarInformacionSector.setToolTipText("Recargar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSector,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSector = new JButtonMe();
		this.jButtonProcesarInformacionSector.setText("Procesar");
		this.jButtonProcesarInformacionSector.setToolTipText("Procesar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSector.setVisible(false);
			
		this.jButtonProcesarInformacionSector.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSector.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSector.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSector = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSector.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSector.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSector = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSector.setText("TIPO");       
		this.jComboBoxTiposReportesSector.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSector = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSector.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSector.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSector = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSector.setText("Paginacion");
		this.jComboBoxTiposPaginacionSector.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSector = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSector.setText("Accion");
		this.jComboBoxTiposRelacionesSector.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSector = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSector.setText("Accion");
		this.jComboBoxTiposAccionesSector.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSector = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSector.setText("Accion");
		this.jComboBoxTiposSeleccionarSector.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSector=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSector.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSector.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSector.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSector = new JLabelMe();
		
		this.jLabelAccionesSector.setText("Acciones");		
		this.jLabelAccionesSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSector = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSector.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSector.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSector = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSector.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSector.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSector = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSector.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSector.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSector = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSector.setText("Graf.");
		this.jCheckBoxConGraficoReporteSector.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSector = new JButtonMe();
		//this.jButtonAnterioresSector.setText("<<");
        this.jButtonAnterioresSector.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSector,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSector = new JButtonMe();
		//this.jButtonSiguientesSector.setText(">>");
        this.jButtonSiguientesSector.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSector,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSector = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSector.setText("Nue");
        this.jButtonNuevoGuardarCambiosSector.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSector,"nuevoguardarcambios_button","Nue",this.sectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSector";
		inputMap = this.jButtonNuevoGuardarCambiosSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSector"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSector";
		inputMap = this.jButtonRecargarInformacionSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSector"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSector";
		inputMap = this.jButtonSiguientesSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSector"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSector";
		inputMap = this.jButtonAnterioresSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSector"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSector();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSector.setMinimumSize(new Dimension(this.getWidth(),SectorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SectorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSector.setMaximumSize(new Dimension(this.getWidth(),SectorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SectorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSector.setPreferredSize(new Dimension(this.getWidth(),SectorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SectorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSector = new GridBagLayout();

			this.jPanelPaginacionSector.setLayout(gridaBagLayoutPaginacionSector);						
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 0;
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSector.add(this.jButtonAnterioresSector, this.gridBagConstraintsSector);
					
						
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSector.gridy = 0;
			
			this.jPanelPaginacionSector.add(this.jButtonNuevoGuardarCambiosSector, this.gridBagConstraintsSector);
						
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSector.gridy = 0;
			this.jPanelPaginacionSector.add(this.jButtonSiguientesSector, this.gridBagConstraintsSector);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 1;
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSector.add(this.jButtonNuevoSector, this.gridBagConstraintsSector);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSector = new GridBagConstraints();
				this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSector.gridy = 1;
				this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSector.add(this.jButtonNuevoRelacionesSector, this.gridBagConstraintsSector);
			}
			
			
			if(!this.sectorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSector = new GridBagConstraints();
				this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSector.gridy = 1;
				this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSector.add(this.jButtonGuardarCambiosTablaSector, this.gridBagConstraintsSector);
			}
			
			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 1;
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSector.add(this.jButtonDuplicarSector, this.gridBagConstraintsSector);
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 1;
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSector.add(this.jButtonCopiarSector, this.gridBagConstraintsSector);
		
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 1;
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSector.add(this.jButtonVerFormSector, this.gridBagConstraintsSector);
		
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 1;
			this.gridBagConstraintsSector.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSector.add(this.jButtonCerrarSector, this.gridBagConstraintsSector);
		
		
		
		this.jButtonRecargarInformacionSector.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSector.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSector.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSector, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSector.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSector.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSector.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSector.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSector.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSector.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSector.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSector.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSector.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSector.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSector.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSector.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSector.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSector.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSector.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSector.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSector.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSector.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSector, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSector.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSector.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSector.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSector.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSector.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSector.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSector = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSector = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Sector = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Sector = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Sector = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Sector = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSector.setLayout(gridaBagParametrosReportesSector);
			this.jPanelParametrosReportesAccionesSector.setLayout(gridaBagParametrosReportesAccionesSector);
			
			
			this.jPanelParametrosAuxiliar1Sector.setLayout(gridaBagParametrosAuxiliar1Sector);
			this.jPanelParametrosAuxiliar2Sector.setLayout(gridaBagParametrosAuxiliar2Sector);
			this.jPanelParametrosAuxiliar3Sector.setLayout(gridaBagParametrosAuxiliar3Sector);
			this.jPanelParametrosAuxiliar4Sector.setLayout(gridaBagParametrosAuxiliar4Sector);
			//this.jPanelParametrosAuxiliar5Sector.setLayout(gridaBagParametrosAuxiliar2Sector);			
			
			
			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSector.add(this.jButtonRecargarInformacionSector, this.gridBagConstraintsSector);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sector.add(this.jComboBoxTiposPaginacionSector, this.gridBagConstraintsSector);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sector.add(this.jCheckBoxConAltoMaximoTablaSector, this.gridBagConstraintsSector);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sector.add(this.jComboBoxTiposArchivosReportesSector, this.gridBagConstraintsSector);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSector.add(this.jPanelParametrosAuxiliar1Sector, this.gridBagConstraintsSector);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSector.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Sector.add(this.jComboBoxTiposReportesSector, this.gridBagConstraintsSector);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSector.add(this.jPanelParametrosAuxiliar4Sector, this.gridBagConstraintsSector);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSector.add(this.jComboBoxTiposReportesSector, this.gridBagConstraintsSector);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSector.add(this.jCheckBoxGenerarReporteSector, this.gridBagConstraintsSector);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSector.add(this.jPanelParametrosAuxiliar2Sector, this.gridBagConstraintsSector);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSector.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSector.add(this.jLabelAccionesSector, this.gridBagConstraintsSector);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSector = new GridBagConstraints();
				this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSector.add(this.jButtonAbrirOrderBySector, this.gridBagConstraintsSector);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSector.add(this.jComboBoxTiposSeleccionarSector, this.gridBagConstraintsSector);			
			
			
			/*
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSector.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSector.add(this.jCheckBoxSeleccionarTodosSector, this.gridBagConstraintsSector);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSector.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sector.add(this.jCheckBoxSeleccionarTodosSector, this.gridBagConstraintsSector);															
				
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSector.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sector.add(this.jCheckBoxSeleccionadosSector, this.gridBagConstraintsSector);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSector.add(this.jPanelParametrosAuxiliar3Sector, this.gridBagConstraintsSector);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSector.add(this.jComboBoxTiposRelacionesSector, this.gridBagConstraintsSector);
				
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSector.add(this.jComboBoxTiposAccionesSector, this.gridBagConstraintsSector);
	
				
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSector.add(this.jTextFieldValorCampoGeneralSector, this.gridBagConstraintsSector);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSector = new GridBagLayout();

			this.jScrollPanelDatosSector.setLayout(gridaBagLayoutDatosSector);
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = 0;
			this.gridBagConstraintsSector.gridx = 0;
			
			this.jScrollPanelDatosSector.add(this.jTableDatosSector, this.gridBagConstraintsSector);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSector.setViewportView(this.jTableDatosSector);
		this.jTableDatosSector.setFillsViewportHeight(true);
		this.jTableDatosSector.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSector= new GridBagLayout();
		this.jPanelAccionesSector.setLayout(gridaBagLayoutAccionesSector);
		
		
		/*	
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = 0;
		this.gridBagConstraintsSector.gridx = 0;
			
		this.jPanelAccionesSector.add(this.jButtonNuevoSector, this.gridBagConstraintsSector);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadSector= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadSector.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadSector.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadSector.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadSector.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadSector.setLayout(gridaBagLayoutFK_IdCiudadSector);

		gridBagConstraintsSector = new GridBagConstraints();
		gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSector.gridy = 0;
		gridBagConstraintsSector.gridx = 0;
		jPanelFK_IdCiudadSector.add(jLabelid_ciudadFK_IdCiudadSector, gridBagConstraintsSector);

		gridBagConstraintsSector = new GridBagConstraints();
		gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSector.gridy = 0;
		gridBagConstraintsSector.gridx = 1;
		jPanelFK_IdCiudadSector.add(jComboBoxid_ciudadFK_IdCiudadSector, gridBagConstraintsSector);

		gridBagConstraintsSector = new GridBagConstraints();
		gridBagConstraintsSector.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSector.gridy = 1;
		gridBagConstraintsSector.gridx =1;
		jPanelFK_IdCiudadSector.add(jButtonFK_IdCiudadSector, gridBagConstraintsSector);

		jTabbedPaneBusquedasSector.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadSector);
		jTabbedPaneBusquedasSector.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSector = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSector);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sectorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSector = new GridBagConstraints();						
			this.gridBagConstraintsSector.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSector.gridx = 0;		
			//this.gridBagConstraintsSector.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSector.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSector, this.gridBagConstraintsSector);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSector.gridx = 0;		
		//this.gridBagConstraintsSector.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSector.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSector);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSector.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSector.gridx = 0;		
			this.gridBagConstraintsSector.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSector.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSector, this.gridBagConstraintsSector);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSector, this.gridBagConstraintsSector);								
		
		
		/*
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSector, this.gridBagConstraintsSector);
		*/		
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSector.gridx =0;
		this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSector.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSector, this.gridBagConstraintsSector);
				
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSector, this.gridBagConstraintsSector);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SectorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSector = new GridBagLayout();
			this.jPanelBusquedasParametrosSector.setLayout(gridaBagLayoutBusquedasParametrosSector);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSector=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSector, this.gridBagConstraintsSector);
			
			
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSector, this.gridBagConstraintsSector);
		
			
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSector.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSector, this.gridBagConstraintsSector);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSector;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSector() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSector = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSector.setName("jPanelReporteDinamicoSector"); 
		
		this.jPanelReporteDinamicoSector.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSector.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSector.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSector.setLayout(gridaBagLayoutReporteDinamicoSector);
		
		
		this.jInternalFrameReporteDinamicoSector= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSector = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSector= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSector.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSector.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSector.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSector.setResizable(true);
	    this.jInternalFrameReporteDinamicoSector.setClosable(true);
	    this.jInternalFrameReporteDinamicoSector.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSector.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSector.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSector.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSector = new JLabelMe();

		this.jLabelColumnasSelectReporteSector.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSector.add(this.jLabelColumnasSelectReporteSector, this.gridBagConstraintsSector);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSector = new JList<Reporte>();
		this.jListColumnasSelectReporteSector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSector.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSector.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSector.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSector.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSector=new JScrollPane(this.jListColumnasSelectReporteSector);
			
			this.jScrollColumnasSelectReporteSector.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSector.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSector.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSector.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSector.add(this.jListColumnasSelectReporteSector, this.gridBagConstraintsSector);
		this.jPanelReporteDinamicoSector.add(this.jScrollColumnasSelectReporteSector, this.gridBagConstraintsSector);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSector = new JLabelMe();

		this.jLabelRelacionesSelectReporteSector.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSector.add(this.jLabelRelacionesSelectReporteSector, this.gridBagConstraintsSector);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSector = new JList<Reporte>();
		this.jListRelacionesSelectReporteSector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSector.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSector.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSector.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSector.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSector=new JScrollPane(this.jListRelacionesSelectReporteSector);
			
			this.jScrollRelacionesSelectReporteSector.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSector.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSector.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSector.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSector.add(this.jListRelacionesSelectReporteSector, this.gridBagConstraintsSector);
		this.jPanelReporteDinamicoSector.add(this.jScrollRelacionesSelectReporteSector, this.gridBagConstraintsSector);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSector = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSector = new JComboBoxMe();
		this.jListColumnasValoresGraficoSector = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSector = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSector.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSector.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSector.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSector.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSector = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSector.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSector.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSector.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSector.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSector = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSector.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSector.add(this.jLabelGenerarExcelReporteDinamicoSector, this.gridBagConstraintsSector);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSector = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSector.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSector,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSector.setToolTipText("Generar EXCEL"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSector = new GridBagConstraints();
		//this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSector.add(this.jButtonGenerarExcelReporteDinamicoSector, this.gridBagConstraintsSector);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSector.add(this.jComboBoxTiposReportesDinamicoSector, this.gridBagConstraintsSector);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSector = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSector.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSector.add(this.jLabelTiposArchivoReporteDinamicoSector, this.gridBagConstraintsSector);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSector.add(this.jComboBoxTiposArchivosReportesDinamicoSector, this.gridBagConstraintsSector);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSector = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSector.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSector,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSector.setToolTipText("Generar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSector.add(this.jButtonGenerarReporteDinamicoSector, this.gridBagConstraintsSector);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSector = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSector.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSector,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSector.setToolTipText("Cancelar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSector.add(this.jButtonCerrarReporteDinamicoSector, this.gridBagConstraintsSector);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSector = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSector= new JScrollPane(jPanelReporteDinamicoSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSector.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSector.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSector.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSector.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSector.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSector.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSector);
		this.jInternalFrameReporteDinamicoSector.getContentPane().add(this.jScrollPanelReporteDinamicoSector, this.gridBagConstraintsSector);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSector() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSector = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSector.setName("jPanelImportacionSector"); 
		
		this.jPanelImportacionSector.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSector.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSector.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSector.setLayout(gridaBagLayoutImportacionSector);
		
		
		this.jInternalFrameImportacionSector= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSector= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSector = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSector= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSector.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSector.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSector.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSector.setResizable(true);
	    this.jInternalFrameImportacionSector.setClosable(true);
	    this.jInternalFrameImportacionSector.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSector.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSector.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSector.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSector.setResizable(true);
	    this.jInternalFrameImportacionSector.setClosable(true);
	    this.jInternalFrameImportacionSector.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSector.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSector.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSector.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSector = new JLabelMe();

		this.jLabelArchivoImportacionSector.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYImportacion;		
		this.gridBagConstraintsSector.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSector.add(this.jLabelArchivoImportacionSector, this.gridBagConstraintsSector);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSector = new JFileChooser();		
		this.jFileChooserImportacionSector.setToolTipText("ESCOGER ARCHIVO"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSector = new JButtonMe();
		this.jButtonAbrirImportacionSector.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSector,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSector.setToolTipText("Generar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSector.add(this.jButtonAbrirImportacionSector, this.gridBagConstraintsSector);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSector = new JLabelMe();

		this.jLabelPathArchivoImportacionSector.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSector.gridy = iPosYImportacion;		
		this.gridBagConstraintsSector.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSector.add(this.jLabelPathArchivoImportacionSector, this.gridBagConstraintsSector);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSector=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSector.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSector.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSector.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSector.add(this.jTextFieldPathArchivoImportacionSector, this.gridBagConstraintsSector);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSector = new JButtonMe();
		this.jButtonGenerarImportacionSector.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSector,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSector.setToolTipText("Generar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSector.add(this.jButtonGenerarImportacionSector, this.gridBagConstraintsSector);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSector = new JButtonMe();
		this.jButtonCerrarImportacionSector.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSector,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSector.setToolTipText("Cancelar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSector.add(this.jButtonCerrarImportacionSector, this.gridBagConstraintsSector);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSector = new GridBagLayout();
		
		this.jScrollPanelImportacionSector= new JScrollPane(jPanelImportacionSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSector = new GridBagConstraints();
		this.gridBagConstraintsSector.gridy =iPosYImportacion;
		this.gridBagConstraintsSector.gridx =iPosXImportacion;
		this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSector.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSector.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSector);
		this.jInternalFrameImportacionSector.getContentPane().add(this.jScrollPanelImportacionSector, this.gridBagConstraintsSector);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySector(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySector = new JButtonMe();
			this.jButtonAbrirOrderBySector.setText("Orden");
			this.jButtonAbrirOrderBySector.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySector,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySector";
			inputMap = this.jButtonAbrirOrderBySector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySector"));
		
		
			GridBagLayout gridaBagLayoutOrderBySector = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySector.setName("jPanelOrderBySector"); 
			
			this.jPanelOrderBySector.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySector.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySector.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySector.setLayout(gridaBagLayoutOrderBySector);
			
			
			this.jTableDatosSectorOrderBy = new JTableMe();        
			this.jTableDatosSectorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSectorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSectorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSectorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSectorOrderBy.setViewportView(this.jTableDatosSectorOrderBy);
			this.jTableDatosSectorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSectorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySector= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySector= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySector = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSector= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySector.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySector.setTitle("Orden");
			this.jInternalFrameOrderBySector.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySector.setResizable(true);
			this.jInternalFrameOrderBySector.setClosable(true);
			this.jInternalFrameOrderBySector.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySector.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySector.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySector.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSector.gridx =iPosXOrderBy;
			this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSector.ipady =150;
				
			this.jPanelOrderBySector.add(jScrollPanelDatosSectorOrderBy, this.gridBagConstraintsSector);//this.jTableDatosSectorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySector = new JButtonMe();
			this.jButtonCerrarOrderBySector.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySector,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySector.setToolTipText("Cancelar"+" "+SectorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSector.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSector.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySector.add(this.jButtonCerrarOrderBySector, this.gridBagConstraintsSector);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSector = new GridBagLayout();
			
			this.jScrollPanelOrderBySector= new JScrollPane(jPanelOrderBySector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSector = new GridBagConstraints();
			this.gridBagConstraintsSector.gridy =iPosYOrderBy;
			this.gridBagConstraintsSector.gridx =iPosXOrderBy;
			this.gridBagConstraintsSector.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySector.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySector.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSector);
			
			this.jInternalFrameOrderBySector.getContentPane().add(this.jScrollPanelOrderBySector, this.gridBagConstraintsSector);			
		
		} else {
			this.jButtonAbrirOrderBySector = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.sectorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSector.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSector.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSector.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSector.getRowHeight();//SectorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSector.isSelected()) {
					iHeightTable=SectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSector.isSelected()) {
					iHeightTable=SectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSector.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSector.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSector.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSector.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSector.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSector.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySector!=null && this.jInternalFrameOrderBySector.getjTableDatosOrderBy()!=null) {
			//if(!this.sectorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySector.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySector.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySector.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySector.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySector.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySector.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySector.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSector.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSector.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSector.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=sectorLogic.getSectors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sectors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Sector> TraerSectorBeans(List<Sector> sectors,ArrayList<Classe> classes)throws Exception {
		try {
			for(Sector sector:sectors) {
					
				if(!(SectorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SectorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sector.setsDetalleGeneralEntityReporte(SectorConstantesFunciones.getSectorDescripcion(sector));
										
						
					
					

					if(sector.getRutaOrigens()!=null && Funciones.existeClass(classes,Ruta.class)) {
						try{sector.setrutaOrigensDescripcionReporte(new JRBeanCollectionDataSource(RutaJInternalFrame.TraerRutaBeans(sector.getRutaOrigens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(sector.getSubSectors()!=null && Funciones.existeClass(classes,SubSector.class)) {
						try{sector.setsubsectorsDescripcionReporte(new JRBeanCollectionDataSource(SubSectorJInternalFrame.TraerSubSectorBeans(sector.getSubSectors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//sector.setsDetalleGeneralEntityReporte(sector.getsDetalleGeneralEntityReporte());
										
				}
				
				//sectorbeans.add(sectorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sectors;
    }
	//PARA REPORTES FIN
}
