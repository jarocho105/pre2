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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.LineaConstantesFunciones;

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
public class LineaJInternalFrame extends LineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLinea;
	
	protected JMenuBar jmenuBarLinea;
	
	protected JMenu jmenuLinea;
	protected JMenu jmenuDatosLinea;
	protected JMenu jmenuArchivoLinea;
	protected JMenu jmenuAccionesLinea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLinea;	
	protected GridBagConstraints gridBagConstraintsLinea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LineaDetalleFormJInternalFrame jInternalFrameDetalleFormLinea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLinea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLinea;	
	
	
	public LineaBeanSwingJInternalFrameTree jInternalFrameTreeLinea;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivellinea="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";
	
	public LineaSessionBean lineaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public NivelLineaSessionBean nivellineaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Linea> lineas;		
	public List<Linea> lineasEliminados;	
	public List<Linea> lineasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLinea;		
	protected JButton jButtonAbrirOrderByLinea;
	
	
	//protected JPanel jPanelOrderByLinea;
	//public JScrollPane jScrollPanelOrderByLinea;	
	//protected JButton jButtonCerrarOrderByLinea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LineaLogic lineaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLinea;
	public JScrollPane jScrollPanelDatosEdicionLinea;
	public JScrollPane jScrollPanelDatosGeneralLinea;
    
	
	
	//public JScrollPane jScrollPanelDatosLineaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLinea;
	//public JScrollPane jScrollPanelImportacionLinea;
	
	
	
	protected JPanel jPanelAccionesLinea;
	
    protected JPanel jPanelPaginacionLinea;
    protected JPanel jPanelParametrosReportesLinea;
	protected JPanel jPanelParametrosReportesAccionesLinea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Linea;
	protected JPanel jPanelParametrosAuxiliar2Linea;
	protected JPanel jPanelParametrosAuxiliar3Linea;
	protected JPanel jPanelParametrosAuxiliar4Linea;
	//protected JPanel jPanelParametrosAuxiliar5Linea;
	
	
	
	//protected JPanel jPanelReporteDinamicoLinea;
	//protected JPanel jPanelImportacionLinea;
	
	
	public JTable jTableDatosLinea;
	
	
	
	//public JTable jTableDatosLineaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLinea;
	protected JButton jButtonDuplicarLinea;
	protected JButton jButtonCopiarLinea;
	protected JButton jButtonVerFormLinea;
	protected JButton jButtonNuevoRelacionesLinea;
	protected JButton jButtonModificarLinea;
	
    protected JButton jButtonGuardarCambiosTablaLinea;
	protected JButton jButtonCerrarLinea;
	
	
	protected JButton jButtonRecargarInformacionLinea;
	protected JButton jButtonProcesarInformacionLinea;
	
	
	protected JButton jButtonAnterioresLinea;
	protected JButton jButtonSiguientesLinea;
	protected JButton jButtonNuevoGuardarCambiosLinea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLinea;
	//protected JButton jButtonCerrarReporteDinamicoLinea;
	//protected JButton jButtonGenerarExcelReporteDinamicoLinea;	
	
	
	
	//protected JButton jButtonAbrirImportacionLinea;
	//protected JButton jButtonGenerarImportacionLinea;
	//protected JButton jButtonCerrarImportacionLinea;
	//protected JFileChooser jFileChooserImportacionLinea;
	//protected File fileImportacionLinea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLinea;
	protected JButton jButtonDuplicarToolBarLinea;
	protected JButton jButtonNuevoRelacionesToolBarLinea;
	
	
	public JButton jButtonGuardarCambiosToolBarLinea;
	protected JButton jButtonCopiarToolBarLinea;
	protected JButton jButtonVerFormToolBarLinea;
	public JButton jButtonGuardarCambiosTablaToolBarLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarLinea;
	protected JButton jButtonCerrarToolBarLinea;
	
	protected JButton jButtonRecargarInformacionToolBarLinea;
	protected JButton jButtonProcesarInformacionToolBarLinea;
	protected JButton jButtonAnterioresToolBarLinea;
	protected JButton jButtonSiguientesToolBarLinea;
	protected JButton jButtonNuevoGuardarCambiosToolBarLinea;
	protected JButton jButtonAbrirOrderByToolBarLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLinea;
	protected JMenuItem jMenuItemDuplicarLinea;
	protected JMenuItem jMenuItemNuevoRelacionesLinea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLinea;
	protected JMenuItem jMenuItemCopiarLinea;
	protected JMenuItem jMenuItemVerFormLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaLinea;
	protected JMenuItem jMenuItemCerrarLinea;
	protected JMenuItem jMenuItemDetalleCerrarLinea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarLinea;
	
	protected JMenuItem jMenuItemRecargarInformacionLinea;
	protected JMenuItem jMenuItemProcesarInformacionLinea;
	protected JMenuItem jMenuItemAnterioresLinea;
	protected JMenuItem jMenuItemSiguientesLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLinea;
	protected JMenuItem jMenuItemAbrirOrderByLinea;
	protected JMenuItem jMenuItemMostrarOcultarLinea;
	
	
	//MENU
	
	protected JButton jButtonArbolLinea;	
	
	protected JLabel jLabelAccionesLinea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLinea;
	protected JCheckBox jCheckBoxSeleccionadosLinea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLinea;
	protected JCheckBox jCheckBoxConGraficoReporteLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLinea;
	protected JTextField jTextFieldValorCampoGeneralLinea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLinea;
	//public JList<Reporte> jListColumnasSelectReporteLinea;
	//public JScrollPane jScrollColumnasSelectReporteLinea;
	
	//public JLabel jLabelRelacionesSelectReporteLinea;
	//public JList<Reporte> jListRelacionesSelectReporteLinea;
	//public JScrollPane jScrollRelacionesSelectReporteLinea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLinea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLinea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLinea;
	//public JLabel jLabelTiposArchivoReporteDinamicoLinea;
	
		
	//public JLabel jLabelArchivoImportacionLinea;	
	//public JLabel jLabelPathArchivoImportacionLinea;
	//protected JTextField jTextFieldPathArchivoImportacionLinea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLinea;
	
	//public JLabel jLabelColumnaCategoriaValorLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLinea;
	
	//public JLabel jLabelColumnasValoresGraficoLinea;
	//public JList<Reporte> jListColumnasValoresGraficoLinea;
	//public JScrollPane jScrollColumnasValoresGraficoLinea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLinea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLinea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLinea;
	public JPanel jPanelBusquedaPorCodigoLinea;
	public JButton jButtonBusquedaPorCodigoLinea;
	public JPanel jPanelBusquedaPorNombreLinea;
	public JButton jButtonBusquedaPorNombreLinea;
	public JPanel jPanelFK_IdLineaLinea;
	public JButton jButtonFK_IdLineaLinea;
	public JPanel jPanelFK_IdNivelLineaLinea;
	public JButton jButtonFK_IdNivelLineaLinea;
	
	public JPanel jPanelcodigoBusquedaPorCodigoLinea;
	public JLabel jLabelcodigoBusquedaPorCodigoLinea;
	public JTextField jTextFieldcodigoBusquedaPorCodigoLinea;
	public JButton jButtoncodigoBusquedaPorCodigoLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreLinea;
	public JLabel jLabelnombreBusquedaPorNombreLinea;
	public JTextArea jTextAreanombreBusquedaPorNombreLinea;
	public JButton jButtonnombreBusquedaPorNombreLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaFK_IdLineaLinea;
	public JLabel jLabelid_lineaFK_IdLineaLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaLinea;
	public JButton jButtonid_lineaFK_IdLineaLinea= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaLineaUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaLineaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaLineaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdLineaid_lineaLinea;
	
	public JPanel jPanelid_nivel_lineaFK_IdNivelLineaLinea;
	public JLabel jLabelid_nivel_lineaFK_IdNivelLineaLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_lineaFK_IdNivelLineaLinea;
	public JButton jButtonid_nivel_lineaFK_IdNivelLineaLinea= new JButtonMe();
	public JButton jButtonid_nivel_lineaFK_IdNivelLineaLineaUpdate= new JButtonMe();
	public JButton jButtonid_nivel_lineaFK_IdNivelLineaLineaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public LineaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLinea)	{
		this.jButtonRecargarInformacionLinea = jButtonRecargarInformacionLinea;
	}
	
	public JButton getjButtonProcesarInformacionLinea() {
		return this.jButtonProcesarInformacionLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLinea)	{
		this.jButtonProcesarInformacionLinea = jButtonProcesarInformacionLinea;
	}
	
	
	public JButton getjButtonRecargarInformacionLinea() {
		return this.jButtonRecargarInformacionLinea;
	}
	
	public JButton getjButtonArbolLinea() {
		return this.jButtonArbolLinea;
	}
	
	public void setjButtonArbol(JButton jButtonArbolLinea)	{
		this.jButtonArbolLinea = jButtonArbolLinea;
	}
	
	public List<Linea> getlineas() {
		return this.lineas;
	}

	public void setlineas(List<Linea> lineas) {
		this.lineas = lineas;
	}
	
	public List<Linea> getlineasAux() {
		return this.lineasAux;
	}

	public void setlineasAux(List<Linea> lineasAux) {
		this.lineasAux = lineasAux;
	}
	
	public List<Linea> getlineasEliminados() {
		return this.lineasEliminados;
	}

	public void setLineasEliminados(List<Linea> lineasEliminados) {
		this.lineasEliminados = lineasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLinea() {
		return jComboBoxTiposSeleccionarLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLinea(
			JComboBox jComboBoxTiposSeleccionarLinea) {
		this.jComboBoxTiposSeleccionarLinea = jComboBoxTiposSeleccionarLinea;
	}
	
	public void setBorderResaltarTiposSeleccionarLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLinea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLinea() {
		return jTextFieldValorCampoGeneralLinea;
	}

	public void setjTextFieldValorCampoGeneralLinea(
			JTextField jTextFieldValorCampoGeneralLinea) {
		this.jTextFieldValorCampoGeneralLinea = jTextFieldValorCampoGeneralLinea;
	}

	public void setBorderResaltarValorCampoGeneralLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLinea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLinea() {
		return this.jCheckBoxSeleccionarTodosLinea;
	}

	public void setjCheckBoxSeleccionarTodosLinea(
			JCheckBox jCheckBoxSeleccionarTodosLinea) {
		this.jCheckBoxSeleccionarTodosLinea = jCheckBoxSeleccionarTodosLinea;
	}

	public void setBorderResaltarSeleccionarTodosLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLinea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLinea() {
		return this.jCheckBoxSeleccionadosLinea;
	}

	public void setjCheckBoxSeleccionadosLinea(
			JCheckBox jCheckBoxSeleccionadosLinea) {
		this.jCheckBoxSeleccionadosLinea = jCheckBoxSeleccionadosLinea;
	}
	
	public void setBorderResaltarSeleccionadosLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLinea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLinea() {
		return this.jComboBoxTiposArchivosReportesLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLinea(
			JComboBox jComboBoxTiposArchivosReportesLinea) {
		this.jComboBoxTiposArchivosReportesLinea = jComboBoxTiposArchivosReportesLinea;
	}

	public void setBorderResaltarTiposArchivosReportesLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLinea() {
		return this.jComboBoxTiposReportesLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLinea(
			JComboBox jComboBoxTiposReportesLinea) {
		this.jComboBoxTiposReportesLinea = jComboBoxTiposReportesLinea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLinea() {
	//	return jComboBoxTiposReportesDinamicoLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLinea(
	//		JComboBox jComboBoxTiposReportesDinamicoLinea) {
	//	this.jComboBoxTiposReportesDinamicoLinea = jComboBoxTiposReportesDinamicoLinea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLinea() {
	//	return jComboBoxTiposArchivosReportesDinamicoLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLinea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLinea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLinea = jComboBoxTiposArchivosReportesDinamicoLinea;
	//}
	
	public void setBorderResaltarTiposReportesLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLinea() {
		return this.jComboBoxTiposGraficosReportesLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLinea(
			JComboBox jComboBoxTiposGraficosReportesLinea) {
		this.jComboBoxTiposGraficosReportesLinea = jComboBoxTiposGraficosReportesLinea;
	}
	
	public void setBorderResaltarTiposGraficosReportesLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLinea() {
		return this.jComboBoxTiposPaginacionLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLinea(
			JComboBox jComboBoxTiposPaginacionLinea) {
		this.jComboBoxTiposPaginacionLinea = jComboBoxTiposPaginacionLinea;
	}
	
	public void setBorderResaltarTiposPaginacionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLinea() {
		return this.jComboBoxTiposRelacionesLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLinea() {
		return this.jComboBoxTiposAccionesLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLinea(
			JComboBox jComboBoxTiposRelacionesLinea) {
		this.jComboBoxTiposRelacionesLinea = jComboBoxTiposRelacionesLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLinea(
			JComboBox jComboBoxTiposAccionesLinea) {
		this.jComboBoxTiposAccionesLinea = jComboBoxTiposAccionesLinea;
	}
	
	public void setBorderResaltarTiposRelacionesLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLinea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLinea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLinea() {
	//	return jCheckBoxConGraficoDinamicoLinea;
	//}

	//public void setjCheckBoxConGraficoDinamicoLinea(
	//		JCheckBox jCheckBoxConGraficoDinamicoLinea) {
	//	this.jCheckBoxConGraficoDinamicoLinea = jCheckBoxConGraficoDinamicoLinea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLinea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLinea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLinea .setBorder(borderResaltar);		
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
		this.lineaSessionBean=new LineaSessionBean();
		
		this.lineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LineaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
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
		
		LineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Linea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLinea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLinea,this.jTtoolBarLinea,
							"nuevo","nuevo","Nuevo"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLinea,this.jTtoolBarLinea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLinea,this.jTtoolBarLinea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLinea,this.jTtoolBarLinea,
							"duplicar","duplicar","Duplicar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLinea,this.jTtoolBarLinea,
							"copiar","copiar","Copiar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLinea,this.jTtoolBarLinea,
							"ver_form","ver_form","Ver"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLinea,this.jTtoolBarLinea,
							"recargar","recargar","Recargar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLinea,this.jTtoolBarLinea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLinea,this.jTtoolBarLinea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLinea,this.jTtoolBarLinea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLinea,this.jTtoolBarLinea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLinea,this.jTtoolBarLinea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLinea,this.jTtoolBarLinea,
							"cerrar","cerrar","Salir"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLinea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLinea;
			
				this.jButtonProcesarInformacionToolBarLinea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLinea;
				
		//protected JButton jButtonModificarToolBarLinea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLinea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLinea=new JMenuMe("General");
		this.jmenuArchivoLinea=new JMenuMe("Archivo");
		this.jmenuAccionesLinea=new JMenuMe("Acciones");
		this.jmenuDatosLinea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLinea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLinea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLinea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLinea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLinea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLinea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLinea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLinea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLinea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLinea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLinea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLinea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLinea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLinea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLinea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLinea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLinea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLinea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLinea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLinea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLinea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLinea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLinea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLinea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLinea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLinea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLinea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLinea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLinea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLinea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLinea.add(this.jMenuItemCerrarLinea);
			
			this.jmenuAccionesLinea.add(this.jMenuItemNuevoLinea);
			this.jmenuAccionesLinea.add(this.jMenuItemNuevoGuardarCambiosLinea);
			this.jmenuAccionesLinea.add(this.jMenuItemNuevoRelacionesLinea);
			this.jmenuAccionesLinea.add(this.jMenuItemGuardarCambiosTablaLinea);		
			this.jmenuAccionesLinea.add(this.jMenuItemDuplicarLinea);		
			this.jmenuAccionesLinea.add(this.jMenuItemCopiarLinea);		
			this.jmenuAccionesLinea.add(this.jMenuItemVerFormLinea);		
			
			this.jmenuDatosLinea.add(this.jMenuItemRecargarInformacionLinea);				
			this.jmenuDatosLinea.add(this.jMenuItemAnterioresLinea);				
			this.jmenuDatosLinea.add(this.jMenuItemSiguientesLinea);				
			this.jmenuDatosLinea.add(this.jMenuItemAbrirOrderByLinea);				
			this.jmenuDatosLinea.add(this.jMenuItemMostrarOcultarLinea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLinea.add(this.jMenuItemGuardarCambiosLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLinea.add(this.jmenuArchivoLinea);		
			this.jmenuBarLinea.add(this.jmenuAccionesLinea);		
			this.jmenuBarLinea.add(this.jmenuDatosLinea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLinea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLinea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoLinea.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoLinea= new JButtonMe();
		this.jButtonBusquedaPorCodigoLinea.setText("Buscar");
		this.jButtonBusquedaPorCodigoLinea.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoLinea,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoLinea = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoLinea.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoLinea.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoLinea= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoLinea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreLinea.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreLinea= new JButtonMe();
		this.jButtonBusquedaPorNombreLinea.setText("Buscar");
		this.jButtonBusquedaPorNombreLinea.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreLinea,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreLinea = new JLabelMe();
		jLabelnombreBusquedaPorNombreLinea.setText("Nombre :");
		jLabelnombreBusquedaPorNombreLinea.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreLinea= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreLinea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaLinea.setToolTipText("Buscar Por Linea Padre ");
		this.jButtonFK_IdLineaLinea= new JButtonMe();
		this.jButtonFK_IdLineaLinea.setText("Buscar");
		this.jButtonFK_IdLineaLinea.setToolTipText("Buscar Por Linea Padre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaLinea,"buscar_button","Buscar Por Linea Padre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaLinea = new JLabelMe();
		jLabelid_lineaFK_IdLineaLinea.setText("Linea Padre :");
		jLabelid_lineaFK_IdLineaLinea.setToolTipText("Linea Padre");
		jLabelid_lineaFK_IdLineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaLinea= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaLinea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdLineaid_lineaLinea= new JButtonMe();
		this.jButtonBuscarFK_IdLineaid_lineaLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdLineaid_lineaLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdLineaid_lineaLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdLineaid_lineaLinea.setText("Buscar");
		this.jButtonBuscarFK_IdLineaid_lineaLinea.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdLineaid_lineaLinea.setFocusable(false);

		this.jPanelFK_IdNivelLineaLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNivelLineaLinea.setToolTipText("Buscar Por Nivel Linea ");
		this.jButtonFK_IdNivelLineaLinea= new JButtonMe();
		this.jButtonFK_IdNivelLineaLinea.setText("Buscar");
		this.jButtonFK_IdNivelLineaLinea.setToolTipText("Buscar Por Nivel Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNivelLineaLinea,"buscar_button","Buscar Por Nivel Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNivelLineaLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_nivel_lineaFK_IdNivelLineaLinea = new JLabelMe();
		jLabelid_nivel_lineaFK_IdNivelLineaLinea.setText("Nivel Linea :");
		jLabelid_nivel_lineaFK_IdNivelLineaLinea.setToolTipText("Nivel Linea");
		jLabelid_nivel_lineaFK_IdNivelLineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_lineaFK_IdNivelLineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_nivel_lineaFK_IdNivelLineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_lineaFK_IdNivelLineaLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_nivel_lineaFK_IdNivelLineaLinea= new JComboBoxMe();
		jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_lineaFK_IdNivelLineaLinea,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLinea=new JTabbedPane();


		this.jTabbedPaneBusquedasLinea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLinea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLinea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLinea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLinea = new LineaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Linea DATOS");
			this.jInternalFrameDetalleFormLinea = new LineaDetalleFormJInternalFrame(jDesktopPane,this.lineaSessionBean.getConGuardarRelaciones(),this.lineaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLinea = null;//new LineaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLinea= new GridBagLayout();
		
		
		this.jTableDatosLinea = new JTableMe();      
		
		String sToolTipLinea="";
		sToolTipLinea=LineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLinea+="(Inventario.Linea)";
		}
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipLinea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLinea.setToolTipText(sToolTipLinea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLinea);
		this.jTableDatosLinea.setAutoCreateRowSorter(true);
		this.jTableDatosLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLinea.setRowSelectionAllowed(true);
		this.jTableDatosLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLinea = new JButtonMe();
		this.jButtonDuplicarLinea = new JButtonMe();
		this.jButtonCopiarLinea = new JButtonMe();
		this.jButtonVerFormLinea = new JButtonMe();
		this.jButtonNuevoRelacionesLinea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLinea = new JButtonMe();
		this.jButtonCerrarLinea = new JButtonMe();
		
		this.jScrollPanelDatosLinea = new JScrollPane();   
        this.jScrollPanelDatosGeneralLinea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Linea";
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLinea.setToolTipText("Acciones");
        this.jPanelAccionesLinea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLinea=new ReporteDinamicoJInternalFrame(LineaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLinea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLinea=new ImportacionJInternalFrame(LineaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLinea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLinea = new JButtonMe();
		
		this.jButtonAbrirOrderByLinea.setText("Orden");
		this.jButtonAbrirOrderByLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLinea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLinea,false,this);
			
			//this.cargarOrderByLinea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLinea,true,this);
			
			//this.cargarOrderByLinea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLinea.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosLinea.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosLinea.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosLinea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLinea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLinea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLinea.setText("Nuevo");
		this.jButtonDuplicarLinea.setText("Duplicar");
		this.jButtonCopiarLinea.setText("Copiar");
		this.jButtonVerFormLinea.setText("Ver");
		this.jButtonNuevoRelacionesLinea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLinea.setText("Guardar");
		this.jButtonCerrarLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLinea,"nuevo_button","Nuevo",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLinea,"duplicar_button","Duplicar",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLinea,"copiar_button","Copiar",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLinea,"ver_form","Ver",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLinea,"nuevorelaciones_button","Nuevo Rel",this.lineaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLinea,"guardarcambiostabla_button","Guardar",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLinea,"cerrar_button","Salir",this.lineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLinea.setToolTipText("Nuevo"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLinea.setToolTipText("Duplicar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLinea.setToolTipText("Copiar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLinea.setToolTipText("Ver"+" "+LineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLinea.setToolTipText("Nuevo Rel"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLinea.setToolTipText("Guardar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLinea.setToolTipText("Salir"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLinea";
		inputMap = this.jButtonNuevoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLinea"));
		
		//DUPLICAR
		sMapKey = "DuplicarLinea";
		inputMap = this.jButtonDuplicarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLinea"));
		
		//COPIAR
		sMapKey = "CopiarLinea";
		inputMap = this.jButtonCopiarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLinea"));
		
		//VEr FORM
		sMapKey = "VerFormLinea";
		inputMap = this.jButtonVerFormLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLinea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLinea";
		inputMap = this.jButtonNuevoRelacionesLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLinea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLinea";
		inputMap = this.jButtonModificarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLinea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLinea";
		inputMap = this.jButtonCerrarLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLinea";
		inputMap = this.jButtonGuardarCambiosTablaLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLinea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Linea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Linea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Linea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Linea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Linea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLinea.setName("jPanelParametrosReportesLinea"); 
		
		this.jPanelParametrosReportesAccionesLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLinea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLinea.setName("jPanelParametrosReportesAccionesLinea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLinea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLinea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLinea = new JButtonMe();
		this.jButtonRecargarInformacionLinea.setText("Recargar");
		this.jButtonRecargarInformacionLinea.setToolTipText("Recargar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLinea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLinea = new JButtonMe();
		this.jButtonProcesarInformacionLinea.setText("Procesar");
		this.jButtonProcesarInformacionLinea.setToolTipText("Procesar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLinea.setVisible(false);
			
		this.jButtonProcesarInformacionLinea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLinea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLinea.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolLinea = new JButtonMe();
		this.jButtonArbolLinea.setText("Arbol");		
		this.jButtonArbolLinea.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLinea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLinea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLinea.setText("TIPO");       
		this.jComboBoxTiposReportesLinea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLinea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLinea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLinea.setText("Paginacion");
		this.jComboBoxTiposPaginacionLinea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLinea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLinea.setText("Accion");
		this.jComboBoxTiposRelacionesLinea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLinea.setText("Accion");
		this.jComboBoxTiposAccionesLinea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLinea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLinea.setText("Accion");
		this.jComboBoxTiposSeleccionarLinea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLinea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLinea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLinea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLinea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLinea = new JLabelMe();
		
		this.jLabelAccionesLinea.setText("Acciones");		
		this.jLabelAccionesLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLinea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLinea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLinea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLinea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLinea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLinea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLinea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLinea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLinea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLinea.setText("Graf.");
		this.jCheckBoxConGraficoReporteLinea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLinea = new JButtonMe();
		//this.jButtonAnterioresLinea.setText("<<");
        this.jButtonAnterioresLinea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLinea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLinea = new JButtonMe();
		//this.jButtonSiguientesLinea.setText(">>");
        this.jButtonSiguientesLinea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLinea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLinea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLinea.setText("Nue");
        this.jButtonNuevoGuardarCambiosLinea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLinea,"nuevoguardarcambios_button","Nue",this.lineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLinea";
		inputMap = this.jButtonNuevoGuardarCambiosLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLinea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLinea";
		inputMap = this.jButtonRecargarInformacionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLinea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLinea";
		inputMap = this.jButtonSiguientesLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLinea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLinea";
		inputMap = this.jButtonAnterioresLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLinea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLinea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLinea.setMinimumSize(new Dimension(this.getWidth(),LineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLinea.setMaximumSize(new Dimension(this.getWidth(),LineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLinea.setPreferredSize(new Dimension(this.getWidth(),LineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLinea = new GridBagLayout();

			this.jPanelPaginacionLinea.setLayout(gridaBagLayoutPaginacionLinea);						
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 0;
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLinea.add(this.jButtonAnterioresLinea, this.gridBagConstraintsLinea);
					
						
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLinea.gridy = 0;
			
			this.jPanelPaginacionLinea.add(this.jButtonNuevoGuardarCambiosLinea, this.gridBagConstraintsLinea);
						
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLinea.gridy = 0;
			this.jPanelPaginacionLinea.add(this.jButtonSiguientesLinea, this.gridBagConstraintsLinea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 1;
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLinea.add(this.jButtonNuevoLinea, this.gridBagConstraintsLinea);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsLinea = new GridBagConstraints();
				this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLinea.gridy = 1;
				this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionLinea.add(this.jButtonNuevoRelacionesLinea, this.gridBagConstraintsLinea);
			}
			
			
			if(!this.lineaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLinea = new GridBagConstraints();
				this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLinea.gridy = 1;
				this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLinea.add(this.jButtonGuardarCambiosTablaLinea, this.gridBagConstraintsLinea);
			}
			
			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 1;
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLinea.add(this.jButtonDuplicarLinea, this.gridBagConstraintsLinea);
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 1;
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLinea.add(this.jButtonCopiarLinea, this.gridBagConstraintsLinea);
		
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 1;
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLinea.add(this.jButtonVerFormLinea, this.gridBagConstraintsLinea);
		
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 1;
			this.gridBagConstraintsLinea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLinea.add(this.jButtonCerrarLinea, this.gridBagConstraintsLinea);
		
		
		
		this.jButtonRecargarInformacionLinea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLinea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLinea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolLinea.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolLinea.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolLinea.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesLinea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLinea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLinea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLinea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLinea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLinea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLinea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLinea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLinea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLinea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLinea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLinea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLinea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLinea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Linea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Linea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Linea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Linea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLinea.setLayout(gridaBagParametrosReportesLinea);
			this.jPanelParametrosReportesAccionesLinea.setLayout(gridaBagParametrosReportesAccionesLinea);
			
			
			this.jPanelParametrosAuxiliar1Linea.setLayout(gridaBagParametrosAuxiliar1Linea);
			this.jPanelParametrosAuxiliar2Linea.setLayout(gridaBagParametrosAuxiliar2Linea);
			this.jPanelParametrosAuxiliar3Linea.setLayout(gridaBagParametrosAuxiliar3Linea);
			this.jPanelParametrosAuxiliar4Linea.setLayout(gridaBagParametrosAuxiliar4Linea);
			//this.jPanelParametrosAuxiliar5Linea.setLayout(gridaBagParametrosAuxiliar2Linea);			
			
			
			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLinea.add(this.jButtonRecargarInformacionLinea, this.gridBagConstraintsLinea);			
			
			

			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLinea.add(this.jButtonArbolLinea, this.gridBagConstraintsLinea);
			
			
			
			//PAGINACION
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Linea.add(this.jComboBoxTiposPaginacionLinea, this.gridBagConstraintsLinea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Linea.add(this.jCheckBoxConAltoMaximoTablaLinea, this.gridBagConstraintsLinea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Linea.add(this.jComboBoxTiposArchivosReportesLinea, this.gridBagConstraintsLinea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLinea.add(this.jPanelParametrosAuxiliar1Linea, this.gridBagConstraintsLinea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Linea.add(this.jComboBoxTiposReportesLinea, this.gridBagConstraintsLinea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLinea.add(this.jPanelParametrosAuxiliar4Linea, this.gridBagConstraintsLinea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLinea.add(this.jComboBoxTiposReportesLinea, this.gridBagConstraintsLinea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLinea.add(this.jCheckBoxGenerarReporteLinea, this.gridBagConstraintsLinea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLinea.add(this.jPanelParametrosAuxiliar2Linea, this.gridBagConstraintsLinea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLinea.add(this.jLabelAccionesLinea, this.gridBagConstraintsLinea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLinea = new GridBagConstraints();
				this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLinea.add(this.jButtonAbrirOrderByLinea, this.gridBagConstraintsLinea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLinea.add(this.jComboBoxTiposSeleccionarLinea, this.gridBagConstraintsLinea);			
			
			
			/*
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLinea.add(this.jCheckBoxSeleccionarTodosLinea, this.gridBagConstraintsLinea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Linea.add(this.jCheckBoxSeleccionarTodosLinea, this.gridBagConstraintsLinea);															
				
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Linea.add(this.jCheckBoxSeleccionadosLinea, this.gridBagConstraintsLinea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLinea.add(this.jPanelParametrosAuxiliar3Linea, this.gridBagConstraintsLinea);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLinea.add(this.jComboBoxTiposRelacionesLinea, this.gridBagConstraintsLinea);
				
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLinea.add(this.jComboBoxTiposAccionesLinea, this.gridBagConstraintsLinea);
	
				
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLinea.add(this.jTextFieldValorCampoGeneralLinea, this.gridBagConstraintsLinea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLinea = new GridBagLayout();

			this.jScrollPanelDatosLinea.setLayout(gridaBagLayoutDatosLinea);
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = 0;
			this.gridBagConstraintsLinea.gridx = 0;
			
			this.jScrollPanelDatosLinea.add(this.jTableDatosLinea, this.gridBagConstraintsLinea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLinea.setViewportView(this.jTableDatosLinea);
		this.jTableDatosLinea.setFillsViewportHeight(true);
		this.jTableDatosLinea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLinea= new GridBagLayout();
		this.jPanelAccionesLinea.setLayout(gridaBagLayoutAccionesLinea);
		
		
		/*	
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = 0;
		this.gridBagConstraintsLinea.gridx = 0;
			
		this.jPanelAccionesLinea.add(this.jButtonNuevoLinea, this.gridBagConstraintsLinea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoLinea= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoLinea.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLinea.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoLinea.setLayout(gridaBagLayoutBusquedaPorCodigoLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 0;
		jPanelBusquedaPorCodigoLinea.add(jLabelcodigoBusquedaPorCodigoLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 1;
		jPanelBusquedaPorCodigoLinea.add(jTextFieldcodigoBusquedaPorCodigoLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 1;
		gridBagConstraintsLinea.gridx =1;
		jPanelBusquedaPorCodigoLinea.add(jButtonBusquedaPorCodigoLinea, gridBagConstraintsLinea);

		jTabbedPaneBusquedasLinea.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoLinea);
		jTabbedPaneBusquedasLinea.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreLinea= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreLinea.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLinea.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreLinea.setLayout(gridaBagLayoutBusquedaPorNombreLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 0;
		jPanelBusquedaPorNombreLinea.add(jLabelnombreBusquedaPorNombreLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 1;
		jPanelBusquedaPorNombreLinea.add(jTextAreanombreBusquedaPorNombreLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 1;
		gridBagConstraintsLinea.gridx =1;
		jPanelBusquedaPorNombreLinea.add(jButtonBusquedaPorNombreLinea, gridBagConstraintsLinea);

		jTabbedPaneBusquedasLinea.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreLinea);
		jTabbedPaneBusquedasLinea.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaLinea= new GridBagLayout();
		gridaBagLayoutFK_IdLineaLinea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaLinea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaLinea.setLayout(gridaBagLayoutFK_IdLineaLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 0;
		jPanelFK_IdLineaLinea.add(jLabelid_lineaFK_IdLineaLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 1;
		jPanelFK_IdLineaLinea.add(jComboBoxid_lineaFK_IdLineaLinea, gridBagConstraintsLinea);


		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLinea.fill = GridBagConstraints.NONE;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 0;
		jPanelFK_IdLineaLinea.add(this.jButtonBuscarFK_IdLineaid_lineaLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 1;
		gridBagConstraintsLinea.gridx =1;
		jPanelFK_IdLineaLinea.add(jButtonFK_IdLineaLinea, gridBagConstraintsLinea);

		jTabbedPaneBusquedasLinea.addTab("3.-Por Linea Padre ", jPanelFK_IdLineaLinea);
		jTabbedPaneBusquedasLinea.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNivelLineaLinea= new GridBagLayout();
		gridaBagLayoutFK_IdNivelLineaLinea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNivelLineaLinea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNivelLineaLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNivelLineaLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNivelLineaLinea.setLayout(gridaBagLayoutFK_IdNivelLineaLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 0;
		jPanelFK_IdNivelLineaLinea.add(jLabelid_nivel_lineaFK_IdNivelLineaLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 0;
		gridBagConstraintsLinea.gridx = 1;
		jPanelFK_IdNivelLineaLinea.add(jComboBoxid_nivel_lineaFK_IdNivelLineaLinea, gridBagConstraintsLinea);

		gridBagConstraintsLinea = new GridBagConstraints();
		gridBagConstraintsLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLinea.gridy = 1;
		gridBagConstraintsLinea.gridx =1;
		jPanelFK_IdNivelLineaLinea.add(jButtonFK_IdNivelLineaLinea, gridBagConstraintsLinea);

		jTabbedPaneBusquedasLinea.addTab("4.-Por Nivel Linea ", jPanelFK_IdNivelLineaLinea);
		jTabbedPaneBusquedasLinea.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLinea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLinea = new GridBagConstraints();						
			this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLinea.gridx = 0;		
			//this.gridBagConstraintsLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLinea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLinea, this.gridBagConstraintsLinea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLinea.gridx = 0;		
		//this.gridBagConstraintsLinea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLinea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLinea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLinea.gridx = 0;		
			this.gridBagConstraintsLinea.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLinea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLinea, this.gridBagConstraintsLinea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLinea, this.gridBagConstraintsLinea);								
		
		
		/*
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLinea, this.gridBagConstraintsLinea);
		*/		
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLinea.gridx =0;
		this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLinea, this.gridBagConstraintsLinea);
				
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLinea, this.gridBagConstraintsLinea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeLinea = new LineaBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeLinea.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeLinea.setTitle("Linea ARBOL");
		this.jInternalFrameTreeLinea.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeLinea.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeLinea.setResizable(true);
	    this.jInternalFrameTreeLinea.setClosable(true);
	    this.jInternalFrameTreeLinea.setMaximizable(true);
			
			
		if(LineaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLinea = new GridBagLayout();
			this.jPanelBusquedasParametrosLinea.setLayout(gridaBagLayoutBusquedasParametrosLinea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLinea, this.gridBagConstraintsLinea);
			
			
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLinea, this.gridBagConstraintsLinea);
		
			
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLinea, this.gridBagConstraintsLinea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLinea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLinea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLinea.setName("jPanelReporteDinamicoLinea"); 
		
		this.jPanelReporteDinamicoLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLinea.setLayout(gridaBagLayoutReporteDinamicoLinea);
		
		
		this.jInternalFrameReporteDinamicoLinea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLinea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLinea.setResizable(true);
	    this.jInternalFrameReporteDinamicoLinea.setClosable(true);
	    this.jInternalFrameReporteDinamicoLinea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Lineas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLinea = new JLabelMe();

		this.jLabelColumnasSelectReporteLinea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLinea.add(this.jLabelColumnasSelectReporteLinea, this.gridBagConstraintsLinea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLinea = new JList<Reporte>();
		this.jListColumnasSelectReporteLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLinea=new JScrollPane(this.jListColumnasSelectReporteLinea);
			
			this.jScrollColumnasSelectReporteLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLinea.add(this.jListColumnasSelectReporteLinea, this.gridBagConstraintsLinea);
		this.jPanelReporteDinamicoLinea.add(this.jScrollColumnasSelectReporteLinea, this.gridBagConstraintsLinea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLinea = new JLabelMe();

		this.jLabelRelacionesSelectReporteLinea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLinea.add(this.jLabelRelacionesSelectReporteLinea, this.gridBagConstraintsLinea);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLinea = new JList<Reporte>();
		this.jListRelacionesSelectReporteLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLinea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLinea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLinea=new JScrollPane(this.jListRelacionesSelectReporteLinea);
			
			this.jScrollRelacionesSelectReporteLinea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLinea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLinea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLinea.add(this.jListRelacionesSelectReporteLinea, this.gridBagConstraintsLinea);
		this.jPanelReporteDinamicoLinea.add(this.jScrollRelacionesSelectReporteLinea, this.gridBagConstraintsLinea);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoLinea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLinea = new JComboBoxMe();
		this.jListColumnasValoresGraficoLinea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLinea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLinea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLinea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLinea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLinea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLinea.add(this.jLabelGenerarExcelReporteDinamicoLinea, this.gridBagConstraintsLinea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLinea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLinea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLinea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLinea.setToolTipText("Generar EXCEL"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLinea = new GridBagConstraints();
		//this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLinea.add(this.jButtonGenerarExcelReporteDinamicoLinea, this.gridBagConstraintsLinea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLinea.add(this.jComboBoxTiposReportesDinamicoLinea, this.gridBagConstraintsLinea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLinea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLinea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLinea.add(this.jLabelTiposArchivoReporteDinamicoLinea, this.gridBagConstraintsLinea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLinea.add(this.jComboBoxTiposArchivosReportesDinamicoLinea, this.gridBagConstraintsLinea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLinea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLinea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLinea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLinea.setToolTipText("Generar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLinea.add(this.jButtonGenerarReporteDinamicoLinea, this.gridBagConstraintsLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLinea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLinea.setToolTipText("Cancelar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLinea.add(this.jButtonCerrarReporteDinamicoLinea, this.gridBagConstraintsLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLinea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLinea= new JScrollPane(jPanelReporteDinamicoLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLinea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLinea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLinea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Lineas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLinea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLinea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLinea);
		this.jInternalFrameReporteDinamicoLinea.getContentPane().add(this.jScrollPanelReporteDinamicoLinea, this.gridBagConstraintsLinea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLinea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLinea.setName("jPanelImportacionLinea"); 
		
		this.jPanelImportacionLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLinea.setLayout(gridaBagLayoutImportacionLinea);
		
		
		this.jInternalFrameImportacionLinea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLinea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLinea.setResizable(true);
	    this.jInternalFrameImportacionLinea.setClosable(true);
	    this.jInternalFrameImportacionLinea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLinea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLinea.setResizable(true);
	    this.jInternalFrameImportacionLinea.setClosable(true);
	    this.jInternalFrameImportacionLinea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Lineas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLinea = new JLabelMe();

		this.jLabelArchivoImportacionLinea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLinea.add(this.jLabelArchivoImportacionLinea, this.gridBagConstraintsLinea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLinea = new JFileChooser();		
		this.jFileChooserImportacionLinea.setToolTipText("ESCOGER ARCHIVO"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLinea = new JButtonMe();
		this.jButtonAbrirImportacionLinea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLinea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLinea.setToolTipText("Generar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLinea.add(this.jButtonAbrirImportacionLinea, this.gridBagConstraintsLinea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLinea = new JLabelMe();

		this.jLabelPathArchivoImportacionLinea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLinea.add(this.jLabelPathArchivoImportacionLinea, this.gridBagConstraintsLinea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLinea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLinea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLinea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLinea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLinea.add(this.jTextFieldPathArchivoImportacionLinea, this.gridBagConstraintsLinea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLinea = new JButtonMe();
		this.jButtonGenerarImportacionLinea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLinea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLinea.setToolTipText("Generar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLinea.add(this.jButtonGenerarImportacionLinea, this.gridBagConstraintsLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLinea = new JButtonMe();
		this.jButtonCerrarImportacionLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLinea.setToolTipText("Cancelar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLinea.add(this.jButtonCerrarImportacionLinea, this.gridBagConstraintsLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLinea = new GridBagLayout();
		
		this.jScrollPanelImportacionLinea= new JScrollPane(jPanelImportacionLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy =iPosYImportacion;
		this.gridBagConstraintsLinea.gridx =iPosXImportacion;
		this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLinea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLinea);
		this.jInternalFrameImportacionLinea.getContentPane().add(this.jScrollPanelImportacionLinea, this.gridBagConstraintsLinea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLinea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLinea = new JButtonMe();
			this.jButtonAbrirOrderByLinea.setText("Orden");
			this.jButtonAbrirOrderByLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLinea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLinea";
			inputMap = this.jButtonAbrirOrderByLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLinea"));
		
		
			GridBagLayout gridaBagLayoutOrderByLinea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLinea.setName("jPanelOrderByLinea"); 
			
			this.jPanelOrderByLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLinea.setLayout(gridaBagLayoutOrderByLinea);
			
			
			this.jTableDatosLineaOrderBy = new JTableMe();        
			this.jTableDatosLineaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLineaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLineaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLineaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLineaOrderBy.setViewportView(this.jTableDatosLineaOrderBy);
			this.jTableDatosLineaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLineaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLinea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLinea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLinea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLinea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLinea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLinea.setTitle("Orden");
			this.jInternalFrameOrderByLinea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLinea.setResizable(true);
			this.jInternalFrameOrderByLinea.setClosable(true);
			this.jInternalFrameOrderByLinea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Lineas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLinea.ipady =150;
				
			this.jPanelOrderByLinea.add(jScrollPanelDatosLineaOrderBy, this.gridBagConstraintsLinea);//this.jTableDatosLineaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLinea = new JButtonMe();
			this.jButtonCerrarOrderByLinea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLinea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLinea.setToolTipText("Cancelar"+" "+LineaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLinea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLinea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLinea.add(this.jButtonCerrarOrderByLinea, this.gridBagConstraintsLinea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLinea = new GridBagLayout();
			
			this.jScrollPanelOrderByLinea= new JScrollPane(jPanelOrderByLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLinea = new GridBagConstraints();
			this.gridBagConstraintsLinea.gridy =iPosYOrderBy;
			this.gridBagConstraintsLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsLinea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLinea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLinea);
			
			this.jInternalFrameOrderByLinea.getContentPane().add(this.jScrollPanelOrderByLinea, this.gridBagConstraintsLinea);			
		
		} else {
			this.jButtonAbrirOrderByLinea = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=1500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.lineaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLinea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLinea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLinea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLinea.getRowHeight();//LineaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLinea.isSelected()) {
					iHeightTable=LineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLinea.isSelected()) {
					iHeightTable=LineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLinea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLinea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLinea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLinea!=null && this.jInternalFrameOrderByLinea.getjTableDatosOrderBy()!=null) {
			//if(!this.lineaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLinea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLinea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLinea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=lineaLogic.getLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Linea> TraerLineaBeans(List<Linea> lineas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Linea linea:lineas) {
					
				if(!(LineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					linea.setsDetalleGeneralEntityReporte(LineaConstantesFunciones.getLineaDescripcion(linea));
										
						
					
					

					if(linea.getPresupuestoLineas()!=null && Funciones.existeClass(classes,PresupuestoLinea.class)) {
						try{linea.setpresupuestolineasDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoLineaJInternalFrame.TraerPresupuestoLineaBeans(linea.getPresupuestoLineas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getLineas()!=null && Funciones.existeClass(classes,Linea.class)) {
						try{linea.setlineasDescripcionReporte(new JRBeanCollectionDataSource(LineaJInternalFrame.TraerLineaBeans(linea.getLineas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getComisionGrupoGrupos()!=null && Funciones.existeClass(classes,ComisionGrupo.class)) {
						try{linea.setcomisiongrupoGruposDescripcionReporte(new JRBeanCollectionDataSource(ComisionGrupoJInternalFrame.TraerComisionGrupoBeans(linea.getComisionGrupoGrupos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getProductoPuntoVentas()!=null && Funciones.existeClass(classes,ProductoPuntoVenta.class)) {
						try{linea.setproductopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(ProductoPuntoVentaJInternalFrame.TraerProductoPuntoVentaBeans(linea.getProductoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getComisionLineas()!=null && Funciones.existeClass(classes,ComisionLinea.class)) {
						try{linea.setcomisionlineasDescripcionReporte(new JRBeanCollectionDataSource(ComisionLineaJInternalFrame.TraerComisionLineaBeans(linea.getComisionLineas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getComisionCates()!=null && Funciones.existeClass(classes,ComisionCate.class)) {
						try{linea.setcomisioncatesDescripcionReporte(new JRBeanCollectionDataSource(ComisionCateJInternalFrame.TraerComisionCateBeans(linea.getComisionCates(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getDetallePlaneacionCompras()!=null && Funciones.existeClass(classes,DetallePlaneacionCompra.class)) {
						try{linea.setdetalleplaneacioncomprasDescripcionReporte(new JRBeanCollectionDataSource(DetallePlaneacionCompraJInternalFrame.TraerDetallePlaneacionCompraBeans(linea.getDetallePlaneacionCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getCuentasContablesLineaProductoCategorias()!=null && Funciones.existeClass(classes,CuentasContablesLineaProducto.class)) {
						try{linea.setcuentascontableslineaproductoCategoriasDescripcionReporte(new JRBeanCollectionDataSource(CuentasContablesLineaProductoJInternalFrame.TraerCuentasContablesLineaProductoBeans(linea.getCuentasContablesLineaProductoCategorias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getPrecioGrupos()!=null && Funciones.existeClass(classes,Precio.class)) {
						try{linea.setprecioGruposDescripcionReporte(new JRBeanCollectionDataSource(PrecioJInternalFrame.TraerPrecioBeans(linea.getPrecioGrupos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getLineaPuntoVentaMarcas()!=null && Funciones.existeClass(classes,LineaPuntoVenta.class)) {
						try{linea.setlineapuntoventaMarcasDescripcionReporte(new JRBeanCollectionDataSource(LineaPuntoVentaJInternalFrame.TraerLineaPuntoVentaBeans(linea.getLineaPuntoVentaMarcas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getDetalleCodigoBarraProductoMarcas()!=null && Funciones.existeClass(classes,DetalleCodigoBarraProducto.class)) {
						try{linea.setdetallecodigobarraproductoMarcasDescripcionReporte(new JRBeanCollectionDataSource(DetalleCodigoBarraProductoJInternalFrame.TraerDetalleCodigoBarraProductoBeans(linea.getDetalleCodigoBarraProductoMarcas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getPresupuestoVentasLineasMarcas()!=null && Funciones.existeClass(classes,PresupuestoVentasLineas.class)) {
						try{linea.setpresupuestoventaslineasMarcasDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasLineasJInternalFrame.TraerPresupuestoVentasLineasBeans(linea.getPresupuestoVentasLineasMarcas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getCentroCostoGrupoProductos()!=null && Funciones.existeClass(classes,CentroCostoGrupoProducto.class)) {
						try{linea.setcentrocostogrupoproductosDescripcionReporte(new JRBeanCollectionDataSource(CentroCostoGrupoProductoJInternalFrame.TraerCentroCostoGrupoProductoBeans(linea.getCentroCostoGrupoProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{linea.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(linea.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(linea.getComisionMarcaGrupos()!=null && Funciones.existeClass(classes,ComisionMarca.class)) {
						try{linea.setcomisionmarcaGruposDescripcionReporte(new JRBeanCollectionDataSource(ComisionMarcaJInternalFrame.TraerComisionMarcaBeans(linea.getComisionMarcaGrupos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//linea.setsDetalleGeneralEntityReporte(linea.getsDetalleGeneralEntityReporte());
										
				}
				
				//lineabeans.add(lineabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return lineas;
    }
	//PARA REPORTES FIN
}
