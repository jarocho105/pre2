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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionCateConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionCateJInternalFrame extends ComisionCateBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionCate;
	
	protected JMenuBar jmenuBarComisionCate;
	
	protected JMenu jmenuComisionCate;
	protected JMenu jmenuDatosComisionCate;
	protected JMenu jmenuArchivoComisionCate;
	protected JMenu jmenuAccionesComisionCate;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionCate;	
	protected GridBagConstraints gridBagConstraintsComisionCate;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionCateDetalleFormJInternalFrame jInternalFrameDetalleFormComisionCate;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionCate;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionCate;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionCateSessionBean comisioncateSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionCate> comisioncates;		
	public List<ComisionCate> comisioncatesEliminados;	
	public List<ComisionCate> comisioncatesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionCate;		
	protected JButton jButtonAbrirOrderByComisionCate;
	
	
	//protected JPanel jPanelOrderByComisionCate;
	//public JScrollPane jScrollPanelOrderByComisionCate;	
	//protected JButton jButtonCerrarOrderByComisionCate;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionCateLogic comisioncateLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionCate;
	public JScrollPane jScrollPanelDatosEdicionComisionCate;
	public JScrollPane jScrollPanelDatosGeneralComisionCate;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionCateOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionCate;
	//public JScrollPane jScrollPanelImportacionComisionCate;
	
	
	
	protected JPanel jPanelAccionesComisionCate;
	
    protected JPanel jPanelPaginacionComisionCate;
    protected JPanel jPanelParametrosReportesComisionCate;
	protected JPanel jPanelParametrosReportesAccionesComisionCate;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionCate;
	protected JPanel jPanelParametrosAuxiliar2ComisionCate;
	protected JPanel jPanelParametrosAuxiliar3ComisionCate;
	protected JPanel jPanelParametrosAuxiliar4ComisionCate;
	//protected JPanel jPanelParametrosAuxiliar5ComisionCate;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionCate;
	//protected JPanel jPanelImportacionComisionCate;
	
	
	public JTable jTableDatosComisionCate;
	
	
	
	//public JTable jTableDatosComisionCateOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionCate;
	protected JButton jButtonDuplicarComisionCate;
	protected JButton jButtonCopiarComisionCate;
	protected JButton jButtonVerFormComisionCate;
	protected JButton jButtonNuevoRelacionesComisionCate;
	protected JButton jButtonModificarComisionCate;
	
    protected JButton jButtonGuardarCambiosTablaComisionCate;
	protected JButton jButtonCerrarComisionCate;
	
	
	protected JButton jButtonRecargarInformacionComisionCate;
	protected JButton jButtonProcesarInformacionComisionCate;
	
	
	protected JButton jButtonAnterioresComisionCate;
	protected JButton jButtonSiguientesComisionCate;
	protected JButton jButtonNuevoGuardarCambiosComisionCate;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionCate;
	//protected JButton jButtonCerrarReporteDinamicoComisionCate;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionCate;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionCate;
	//protected JButton jButtonGenerarImportacionComisionCate;
	//protected JButton jButtonCerrarImportacionComisionCate;
	//protected JFileChooser jFileChooserImportacionComisionCate;
	//protected File fileImportacionComisionCate;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionCate;
	protected JButton jButtonDuplicarToolBarComisionCate;
	protected JButton jButtonNuevoRelacionesToolBarComisionCate;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionCate;
	protected JButton jButtonCopiarToolBarComisionCate;
	protected JButton jButtonVerFormToolBarComisionCate;
	public JButton jButtonGuardarCambiosTablaToolBarComisionCate;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionCate;
	protected JButton jButtonCerrarToolBarComisionCate;
	
	protected JButton jButtonRecargarInformacionToolBarComisionCate;
	protected JButton jButtonProcesarInformacionToolBarComisionCate;
	protected JButton jButtonAnterioresToolBarComisionCate;
	protected JButton jButtonSiguientesToolBarComisionCate;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionCate;
	protected JButton jButtonAbrirOrderByToolBarComisionCate;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionCate;
	protected JMenuItem jMenuItemDuplicarComisionCate;
	protected JMenuItem jMenuItemNuevoRelacionesComisionCate;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionCate;
	protected JMenuItem jMenuItemCopiarComisionCate;
	protected JMenuItem jMenuItemVerFormComisionCate;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionCate;
	protected JMenuItem jMenuItemCerrarComisionCate;
	protected JMenuItem jMenuItemDetalleCerrarComisionCate;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionCate;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionCate;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionCate;
	protected JMenuItem jMenuItemProcesarInformacionComisionCate;
	protected JMenuItem jMenuItemAnterioresComisionCate;
	protected JMenuItem jMenuItemSiguientesComisionCate;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionCate;
	protected JMenuItem jMenuItemAbrirOrderByComisionCate;
	protected JMenuItem jMenuItemMostrarOcultarComisionCate;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionCate;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionCate;
	protected JCheckBox jCheckBoxSeleccionadosComisionCate;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionCate;
	protected JCheckBox jCheckBoxConGraficoReporteComisionCate;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionCate;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionCate;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionCate;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionCate;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionCate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionCate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionCate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionCate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionCate;
	protected JTextField jTextFieldValorCampoGeneralComisionCate;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionCate;
	//public JList<Reporte> jListColumnasSelectReporteComisionCate;
	//public JScrollPane jScrollColumnasSelectReporteComisionCate;
	
	//public JLabel jLabelRelacionesSelectReporteComisionCate;
	//public JList<Reporte> jListRelacionesSelectReporteComisionCate;
	//public JScrollPane jScrollRelacionesSelectReporteComisionCate;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionCate;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionCate;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionCate;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionCate;
	
		
	//public JLabel jLabelArchivoImportacionComisionCate;	
	//public JLabel jLabelPathArchivoImportacionComisionCate;
	//protected JTextField jTextFieldPathArchivoImportacionComisionCate;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionCate;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionCate;
	
	//public JLabel jLabelColumnaCategoriaValorComisionCate;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionCate;
	
	//public JLabel jLabelColumnasValoresGraficoComisionCate;
	//public JList<Reporte> jListColumnasValoresGraficoComisionCate;
	//public JScrollPane jScrollColumnasValoresGraficoComisionCate;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionCate;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionCate;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionCate;
	public JPanel jPanelFK_IdComisionConfigComisionCate;
	public JButton jButtonFK_IdComisionConfigComisionCate;
	
	public JPanel jPanelid_comision_configFK_IdComisionConfigComisionCate;
	public JLabel jLabelid_comision_configFK_IdComisionConfigComisionCate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configFK_IdComisionConfigComisionCate;
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionCate= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionCateUpdate= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionCateBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComisionCateJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionCateJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionCate)	{
		this.jButtonRecargarInformacionComisionCate = jButtonRecargarInformacionComisionCate;
	}
	
	public JButton getjButtonProcesarInformacionComisionCate() {
		return this.jButtonProcesarInformacionComisionCate;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionCate)	{
		this.jButtonProcesarInformacionComisionCate = jButtonProcesarInformacionComisionCate;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionCate() {
		return this.jButtonRecargarInformacionComisionCate;
	}
	
	
	public List<ComisionCate> getcomisioncates() {
		return this.comisioncates;
	}

	public void setcomisioncates(List<ComisionCate> comisioncates) {
		this.comisioncates = comisioncates;
	}
	
	public List<ComisionCate> getcomisioncatesAux() {
		return this.comisioncatesAux;
	}

	public void setcomisioncatesAux(List<ComisionCate> comisioncatesAux) {
		this.comisioncatesAux = comisioncatesAux;
	}
	
	public List<ComisionCate> getcomisioncatesEliminados() {
		return this.comisioncatesEliminados;
	}

	public void setComisionCatesEliminados(List<ComisionCate> comisioncatesEliminados) {
		this.comisioncatesEliminados = comisioncatesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionCate() {
		return jComboBoxTiposSeleccionarComisionCate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionCate(
			JComboBox jComboBoxTiposSeleccionarComisionCate) {
		this.jComboBoxTiposSeleccionarComisionCate = jComboBoxTiposSeleccionarComisionCate;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionCate .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionCate() {
		return jTextFieldValorCampoGeneralComisionCate;
	}

	public void setjTextFieldValorCampoGeneralComisionCate(
			JTextField jTextFieldValorCampoGeneralComisionCate) {
		this.jTextFieldValorCampoGeneralComisionCate = jTextFieldValorCampoGeneralComisionCate;
	}

	public void setBorderResaltarValorCampoGeneralComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionCate .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionCate() {
		return this.jCheckBoxSeleccionarTodosComisionCate;
	}

	public void setjCheckBoxSeleccionarTodosComisionCate(
			JCheckBox jCheckBoxSeleccionarTodosComisionCate) {
		this.jCheckBoxSeleccionarTodosComisionCate = jCheckBoxSeleccionarTodosComisionCate;
	}

	public void setBorderResaltarSeleccionarTodosComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionCate .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionCate() {
		return this.jCheckBoxSeleccionadosComisionCate;
	}

	public void setjCheckBoxSeleccionadosComisionCate(
			JCheckBox jCheckBoxSeleccionadosComisionCate) {
		this.jCheckBoxSeleccionadosComisionCate = jCheckBoxSeleccionadosComisionCate;
	}
	
	public void setBorderResaltarSeleccionadosComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionCate .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionCate() {
		return this.jComboBoxTiposArchivosReportesComisionCate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionCate(
			JComboBox jComboBoxTiposArchivosReportesComisionCate) {
		this.jComboBoxTiposArchivosReportesComisionCate = jComboBoxTiposArchivosReportesComisionCate;
	}

	public void setBorderResaltarTiposArchivosReportesComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionCate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionCate() {
		return this.jComboBoxTiposReportesComisionCate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionCate(
			JComboBox jComboBoxTiposReportesComisionCate) {
		this.jComboBoxTiposReportesComisionCate = jComboBoxTiposReportesComisionCate;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionCate() {
	//	return jComboBoxTiposReportesDinamicoComisionCate;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionCate(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionCate) {
	//	this.jComboBoxTiposReportesDinamicoComisionCate = jComboBoxTiposReportesDinamicoComisionCate;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionCate() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionCate;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionCate(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionCate) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionCate = jComboBoxTiposArchivosReportesDinamicoComisionCate;
	//}
	
	public void setBorderResaltarTiposReportesComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionCate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionCate() {
		return this.jComboBoxTiposGraficosReportesComisionCate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionCate(
			JComboBox jComboBoxTiposGraficosReportesComisionCate) {
		this.jComboBoxTiposGraficosReportesComisionCate = jComboBoxTiposGraficosReportesComisionCate;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionCate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionCate() {
		return this.jComboBoxTiposPaginacionComisionCate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionCate(
			JComboBox jComboBoxTiposPaginacionComisionCate) {
		this.jComboBoxTiposPaginacionComisionCate = jComboBoxTiposPaginacionComisionCate;
	}
	
	public void setBorderResaltarTiposPaginacionComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionCate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionCate() {
		return this.jComboBoxTiposRelacionesComisionCate;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionCate() {
		return this.jComboBoxTiposAccionesComisionCate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionCate(
			JComboBox jComboBoxTiposRelacionesComisionCate) {
		this.jComboBoxTiposRelacionesComisionCate = jComboBoxTiposRelacionesComisionCate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionCate(
			JComboBox jComboBoxTiposAccionesComisionCate) {
		this.jComboBoxTiposAccionesComisionCate = jComboBoxTiposAccionesComisionCate;
	}
	
	public void setBorderResaltarTiposRelacionesComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionCate .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionCate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionCate.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionCate .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionCate() {
	//	return jCheckBoxConGraficoDinamicoComisionCate;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionCate(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionCate) {
	//	this.jCheckBoxConGraficoDinamicoComisionCate = jCheckBoxConGraficoDinamicoComisionCate;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionCate() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionCate.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionCate .setBorder(borderResaltar);		
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
		this.comisioncateSessionBean=new ComisionCateSessionBean();
		
		this.comisioncateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisioncateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisioncateSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionCateJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Cate MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionCate No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionCate= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionCate,this.jTtoolBarComisionCate,
							"nuevo","nuevo","Nuevo"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionCate,this.jTtoolBarComisionCate,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionCate,this.jTtoolBarComisionCate,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionCate,this.jTtoolBarComisionCate,
							"duplicar","duplicar","Duplicar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionCate,this.jTtoolBarComisionCate,
							"copiar","copiar","Copiar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionCate,this.jTtoolBarComisionCate,
							"ver_form","ver_form","Ver"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionCate,this.jTtoolBarComisionCate,
							"recargar","recargar","Recargar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionCate,this.jTtoolBarComisionCate,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionCate,this.jTtoolBarComisionCate,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionCate,this.jTtoolBarComisionCate,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionCate,this.jTtoolBarComisionCate,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionCate,this.jTtoolBarComisionCate,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionCate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionCate,this.jTtoolBarComisionCate,
							"cerrar","cerrar","Salir"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionCate=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionCate;
			
				this.jButtonProcesarInformacionToolBarComisionCate=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionCate;
				
		//protected JButton jButtonModificarToolBarComisionCate;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionCate=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionCate=new JMenuMe("General");
		this.jmenuArchivoComisionCate=new JMenuMe("Archivo");
		this.jmenuAccionesComisionCate=new JMenuMe("Acciones");
		this.jmenuDatosComisionCate=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionCate= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionCate.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionCate,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionCate= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionCate.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionCate,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionCate= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionCate.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionCate,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionCate= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionCate.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionCate,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionCate= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionCate.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionCate,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionCate= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionCate.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionCate,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionCate= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionCate.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionCate,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionCate= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionCate.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionCate,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionCate= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionCate.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionCate,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionCate= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionCate.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionCate,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionCate= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionCate.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionCate,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionCate= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionCate.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionCate,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionCate= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionCate.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionCate,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionCate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionCate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionCate,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionCate= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionCate.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionCate,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionCate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionCate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionCate,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionCate= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionCate.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionCate,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionCate.add(this.jMenuItemCerrarComisionCate);
			
			this.jmenuAccionesComisionCate.add(this.jMenuItemNuevoComisionCate);
			this.jmenuAccionesComisionCate.add(this.jMenuItemNuevoGuardarCambiosComisionCate);
			this.jmenuAccionesComisionCate.add(this.jMenuItemNuevoRelacionesComisionCate);
			this.jmenuAccionesComisionCate.add(this.jMenuItemGuardarCambiosTablaComisionCate);		
			this.jmenuAccionesComisionCate.add(this.jMenuItemDuplicarComisionCate);		
			this.jmenuAccionesComisionCate.add(this.jMenuItemCopiarComisionCate);		
			this.jmenuAccionesComisionCate.add(this.jMenuItemVerFormComisionCate);		
			
			this.jmenuDatosComisionCate.add(this.jMenuItemRecargarInformacionComisionCate);				
			this.jmenuDatosComisionCate.add(this.jMenuItemAnterioresComisionCate);				
			this.jmenuDatosComisionCate.add(this.jMenuItemSiguientesComisionCate);				
			this.jmenuDatosComisionCate.add(this.jMenuItemAbrirOrderByComisionCate);				
			this.jmenuDatosComisionCate.add(this.jMenuItemMostrarOcultarComisionCate);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionCate.add(this.jMenuItemGuardarCambiosComisionCate);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionCate.add(this.jmenuArchivoComisionCate);		
			this.jmenuBarComisionCate.add(this.jmenuAccionesComisionCate);		
			this.jmenuBarComisionCate.add(this.jmenuDatosComisionCate);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionCate);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionCate() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdComisionConfigComisionCate=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdComisionConfigComisionCate.setToolTipText("Buscar Por Configuracion ");
		this.jButtonFK_IdComisionConfigComisionCate= new JButtonMe();
		this.jButtonFK_IdComisionConfigComisionCate.setText("Buscar");
		this.jButtonFK_IdComisionConfigComisionCate.setToolTipText("Buscar Por Configuracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdComisionConfigComisionCate,"buscar_button","Buscar Por Configuracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdComisionConfigComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_comision_configFK_IdComisionConfigComisionCate = new JLabelMe();
		jLabelid_comision_configFK_IdComisionConfigComisionCate.setText("Configuracion :");
		jLabelid_comision_configFK_IdComisionConfigComisionCate.setToolTipText("Configuracion");
		jLabelid_comision_configFK_IdComisionConfigComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configFK_IdComisionConfigComisionCate,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_comision_configFK_IdComisionConfigComisionCate= new JComboBoxMe();
		jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configFK_IdComisionConfigComisionCate,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComisionCate=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionCate.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionCate.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionCate.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionCate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionCate,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionCate = new ComisionCateDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comision Cate DATOS");
			this.jInternalFrameDetalleFormComisionCate = new ComisionCateDetalleFormJInternalFrame(jDesktopPane,this.comisioncateSessionBean.getConGuardarRelaciones(),this.comisioncateSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionCate = null;//new ComisionCateDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionCate= new GridBagLayout();
		
		
		this.jTableDatosComisionCate = new JTableMe();      
		
		String sToolTipComisionCate="";
		sToolTipComisionCate=ComisionCateConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionCate+="(Comisiones.ComisionCate)";
		}
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionCate+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionCate.setToolTipText(sToolTipComisionCate);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionCate);
		this.jTableDatosComisionCate.setAutoCreateRowSorter(true);
		this.jTableDatosComisionCate.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionCate.setRowSelectionAllowed(true);
		this.jTableDatosComisionCate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionCate,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionCate = new JButtonMe();
		this.jButtonDuplicarComisionCate = new JButtonMe();
		this.jButtonCopiarComisionCate = new JButtonMe();
		this.jButtonVerFormComisionCate = new JButtonMe();
		this.jButtonNuevoRelacionesComisionCate = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionCate = new JButtonMe();
		this.jButtonCerrarComisionCate = new JButtonMe();
		
		this.jScrollPanelDatosComisionCate = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionCate = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Cate";
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Cates" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionCate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionCate.setToolTipText("Acciones");
        this.jPanelAccionesComisionCate.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisionCate=new ReporteDinamicoJInternalFrame(ComisionCateConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionCate();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionCate=new ImportacionJInternalFrame(ComisionCateConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionCate();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionCate = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionCate.setText("Orden");
		this.jButtonAbrirOrderByComisionCate.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionCate,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionCate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionCate,false,this);
			
			//this.cargarOrderByComisionCate(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionCate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionCate,true,this);
			
			//this.cargarOrderByComisionCate(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionCate.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosComisionCate.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosComisionCate.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosComisionCate.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionCate.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionCate.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionCate.setText("Nuevo");
		this.jButtonDuplicarComisionCate.setText("Duplicar");
		this.jButtonCopiarComisionCate.setText("Copiar");
		this.jButtonVerFormComisionCate.setText("Ver");
		this.jButtonNuevoRelacionesComisionCate.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionCate.setText("Guardar");
		this.jButtonCerrarComisionCate.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionCate,"nuevo_button","Nuevo",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionCate,"duplicar_button","Duplicar",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionCate,"copiar_button","Copiar",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionCate,"ver_form","Ver",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionCate,"nuevorelaciones_button","Nuevo Rel",this.comisioncateSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionCate,"guardarcambiostabla_button","Guardar",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionCate,"cerrar_button","Salir",this.comisioncateSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionCate.setToolTipText("Nuevo"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionCate.setToolTipText("Duplicar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionCate.setToolTipText("Copiar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionCate.setToolTipText("Ver"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionCate.setToolTipText("Nuevo Rel"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionCate.setToolTipText("Guardar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionCate.setToolTipText("Salir"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionCate";
		inputMap = this.jButtonNuevoComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionCate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionCate"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionCate";
		inputMap = this.jButtonDuplicarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionCate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionCate"));
		
		//COPIAR
		sMapKey = "CopiarComisionCate";
		inputMap = this.jButtonCopiarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionCate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionCate"));
		
		//VEr FORM
		sMapKey = "VerFormComisionCate";
		inputMap = this.jButtonVerFormComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionCate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionCate"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionCate";
		inputMap = this.jButtonNuevoRelacionesComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionCate"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionCate";
		inputMap = this.jButtonModificarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionCate"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionCate";
		inputMap = this.jButtonCerrarComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionCate"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionCate";
		inputMap = this.jButtonGuardarCambiosTablaComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionCate"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionCate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionCate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionCate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionCate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionCate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionCate.setName("jPanelParametrosReportesComisionCate"); 
		
		this.jPanelParametrosReportesAccionesComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionCate.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionCate.setName("jPanelParametrosReportesAccionesComisionCate"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionCate, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionCate = new JButtonMe();
		this.jButtonRecargarInformacionComisionCate.setText("Recargar");
		this.jButtonRecargarInformacionComisionCate.setToolTipText("Recargar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionCate,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionCate = new JButtonMe();
		this.jButtonProcesarInformacionComisionCate.setText("Procesar");
		this.jButtonProcesarInformacionComisionCate.setToolTipText("Procesar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionCate.setVisible(false);
			
		this.jButtonProcesarInformacionComisionCate.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionCate.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionCate.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionCate.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionCate.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionCate.setText("TIPO");       
		this.jComboBoxTiposReportesComisionCate.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionCate.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionCate.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionCate.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionCate.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionCate.setText("Accion");
		this.jComboBoxTiposRelacionesComisionCate.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionCate.setText("Accion");
		this.jComboBoxTiposAccionesComisionCate.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionCate = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionCate.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionCate.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionCate=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionCate.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionCate.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionCate.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionCate = new JLabelMe();
		
		this.jLabelAccionesComisionCate.setText("Acciones");		
		this.jLabelAccionesComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionCate = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionCate.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionCate.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionCate = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionCate.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionCate.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionCate = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionCate.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionCate.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionCate = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionCate.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionCate.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionCate = new JButtonMe();
		//this.jButtonAnterioresComisionCate.setText("<<");
        this.jButtonAnterioresComisionCate.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionCate,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionCate = new JButtonMe();
		//this.jButtonSiguientesComisionCate.setText(">>");
        this.jButtonSiguientesComisionCate.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionCate,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionCate = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionCate.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionCate.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionCate,"nuevoguardarcambios_button","Nue",this.comisioncateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionCate";
		inputMap = this.jButtonNuevoGuardarCambiosComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionCate"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionCate";
		inputMap = this.jButtonRecargarInformacionComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionCate"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionCate";
		inputMap = this.jButtonSiguientesComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionCate"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionCate";
		inputMap = this.jButtonAnterioresComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionCate"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionCate();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionCate.setMinimumSize(new Dimension(this.getWidth(),ComisionCateBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionCateBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionCate.setMaximumSize(new Dimension(this.getWidth(),ComisionCateBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionCateBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionCate.setPreferredSize(new Dimension(this.getWidth(),ComisionCateBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionCateBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionCate = new GridBagLayout();

			this.jPanelPaginacionComisionCate.setLayout(gridaBagLayoutPaginacionComisionCate);						
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 0;
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionCate.add(this.jButtonAnterioresComisionCate, this.gridBagConstraintsComisionCate);
					
						
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionCate.gridy = 0;
			
			this.jPanelPaginacionComisionCate.add(this.jButtonNuevoGuardarCambiosComisionCate, this.gridBagConstraintsComisionCate);
						
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionCate.gridy = 0;
			this.jPanelPaginacionComisionCate.add(this.jButtonSiguientesComisionCate, this.gridBagConstraintsComisionCate);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 1;
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionCate.add(this.jButtonNuevoComisionCate, this.gridBagConstraintsComisionCate);
						
			
			
			if(!this.comisioncateSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionCate = new GridBagConstraints();
				this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionCate.gridy = 1;
				this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionCate.add(this.jButtonGuardarCambiosTablaComisionCate, this.gridBagConstraintsComisionCate);
			}
			
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 1;
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionCate.add(this.jButtonDuplicarComisionCate, this.gridBagConstraintsComisionCate);
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 1;
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionCate.add(this.jButtonCopiarComisionCate, this.gridBagConstraintsComisionCate);
		
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 1;
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionCate.add(this.jButtonVerFormComisionCate, this.gridBagConstraintsComisionCate);
		
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 1;
			this.gridBagConstraintsComisionCate.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionCate.add(this.jButtonCerrarComisionCate, this.gridBagConstraintsComisionCate);
		
		
		
		this.jButtonRecargarInformacionComisionCate.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionCate.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionCate.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionCate.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionCate.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionCate.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionCate.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionCate.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionCate.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionCate.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionCate.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionCate.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionCate.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionCate.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionCate.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionCate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionCate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionCate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionCate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionCate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionCate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionCate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionCate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionCate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionCate.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionCate.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionCate.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionCate.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionCate.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionCate.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionCate.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionCate.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionCate.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionCate.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionCate.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionCate.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionCate = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionCate = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionCate = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionCate = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionCate = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionCate = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionCate.setLayout(gridaBagParametrosReportesComisionCate);
			this.jPanelParametrosReportesAccionesComisionCate.setLayout(gridaBagParametrosReportesAccionesComisionCate);
			
			
			this.jPanelParametrosAuxiliar1ComisionCate.setLayout(gridaBagParametrosAuxiliar1ComisionCate);
			this.jPanelParametrosAuxiliar2ComisionCate.setLayout(gridaBagParametrosAuxiliar2ComisionCate);
			this.jPanelParametrosAuxiliar3ComisionCate.setLayout(gridaBagParametrosAuxiliar3ComisionCate);
			this.jPanelParametrosAuxiliar4ComisionCate.setLayout(gridaBagParametrosAuxiliar4ComisionCate);
			//this.jPanelParametrosAuxiliar5ComisionCate.setLayout(gridaBagParametrosAuxiliar2ComisionCate);			
			
			
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionCate.add(this.jButtonRecargarInformacionComisionCate, this.gridBagConstraintsComisionCate);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionCate.add(this.jComboBoxTiposPaginacionComisionCate, this.gridBagConstraintsComisionCate);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionCate.add(this.jCheckBoxConAltoMaximoTablaComisionCate, this.gridBagConstraintsComisionCate);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionCate.add(this.jComboBoxTiposArchivosReportesComisionCate, this.gridBagConstraintsComisionCate);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionCate.add(this.jPanelParametrosAuxiliar1ComisionCate, this.gridBagConstraintsComisionCate);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionCate.add(this.jComboBoxTiposReportesComisionCate, this.gridBagConstraintsComisionCate);																		
			
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComisionCate.add(this.jComboBoxTiposGraficosReportesComisionCate, this.gridBagConstraintsComisionCate);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionCate.add(this.jPanelParametrosAuxiliar4ComisionCate, this.gridBagConstraintsComisionCate);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionCate.add(this.jComboBoxTiposReportesComisionCate, this.gridBagConstraintsComisionCate);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionCate.add(this.jCheckBoxGenerarReporteComisionCate, this.gridBagConstraintsComisionCate);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionCate.add(this.jPanelParametrosAuxiliar2ComisionCate, this.gridBagConstraintsComisionCate);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionCate.add(this.jLabelAccionesComisionCate, this.gridBagConstraintsComisionCate);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionCate = new GridBagConstraints();
				this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionCate.add(this.jButtonAbrirOrderByComisionCate, this.gridBagConstraintsComisionCate);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionCate.add(this.jComboBoxTiposSeleccionarComisionCate, this.gridBagConstraintsComisionCate);			
			
			
			/*
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionCate.add(this.jCheckBoxSeleccionarTodosComisionCate, this.gridBagConstraintsComisionCate);
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionCate.add(this.jCheckBoxConGraficoReporteComisionCate, this.gridBagConstraintsComisionCate);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionCate.add(this.jCheckBoxSeleccionarTodosComisionCate, this.gridBagConstraintsComisionCate);															
				
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionCate.add(this.jCheckBoxSeleccionadosComisionCate, this.gridBagConstraintsComisionCate);															
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionCate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionCate.add(this.jCheckBoxConGraficoReporteComisionCate, this.gridBagConstraintsComisionCate);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionCate.add(this.jPanelParametrosAuxiliar3ComisionCate, this.gridBagConstraintsComisionCate);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionCate.add(this.jComboBoxTiposAccionesComisionCate, this.gridBagConstraintsComisionCate);
	
				
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionCate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionCate.add(this.jTextFieldValorCampoGeneralComisionCate, this.gridBagConstraintsComisionCate);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionCate = new GridBagLayout();

			this.jScrollPanelDatosComisionCate.setLayout(gridaBagLayoutDatosComisionCate);
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = 0;
			this.gridBagConstraintsComisionCate.gridx = 0;
			
			this.jScrollPanelDatosComisionCate.add(this.jTableDatosComisionCate, this.gridBagConstraintsComisionCate);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionCate.setViewportView(this.jTableDatosComisionCate);
		this.jTableDatosComisionCate.setFillsViewportHeight(true);
		this.jTableDatosComisionCate.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionCate= new GridBagLayout();
		this.jPanelAccionesComisionCate.setLayout(gridaBagLayoutAccionesComisionCate);
		
		
		/*	
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = 0;
		this.gridBagConstraintsComisionCate.gridx = 0;
			
		this.jPanelAccionesComisionCate.add(this.jButtonNuevoComisionCate, this.gridBagConstraintsComisionCate);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdComisionConfigComisionCate= new GridBagLayout();
		gridaBagLayoutFK_IdComisionConfigComisionCate.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionCate.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionCate.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdComisionConfigComisionCate.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdComisionConfigComisionCate.setLayout(gridaBagLayoutFK_IdComisionConfigComisionCate);

		gridBagConstraintsComisionCate = new GridBagConstraints();
		gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionCate.gridy = 0;
		gridBagConstraintsComisionCate.gridx = 0;
		jPanelFK_IdComisionConfigComisionCate.add(jLabelid_comision_configFK_IdComisionConfigComisionCate, gridBagConstraintsComisionCate);

		gridBagConstraintsComisionCate = new GridBagConstraints();
		gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionCate.gridy = 0;
		gridBagConstraintsComisionCate.gridx = 1;
		jPanelFK_IdComisionConfigComisionCate.add(jComboBoxid_comision_configFK_IdComisionConfigComisionCate, gridBagConstraintsComisionCate);

		gridBagConstraintsComisionCate = new GridBagConstraints();
		gridBagConstraintsComisionCate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionCate.gridy = 1;
		gridBagConstraintsComisionCate.gridx =1;
		jPanelFK_IdComisionConfigComisionCate.add(jButtonFK_IdComisionConfigComisionCate, gridBagConstraintsComisionCate);

		jTabbedPaneBusquedasComisionCate.addTab("1.-Por Configuracion ", jPanelFK_IdComisionConfigComisionCate);
		jTabbedPaneBusquedasComisionCate.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionCate = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionCate);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionCate = new GridBagConstraints();						
			this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionCate.gridx = 0;		
			//this.gridBagConstraintsComisionCate.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionCate.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionCate, this.gridBagConstraintsComisionCate);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionCate.gridx = 0;		
		//this.gridBagConstraintsComisionCate.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionCate.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionCate);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionCate.gridx = 0;		
			this.gridBagConstraintsComisionCate.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComisionCate.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComisionCate, this.gridBagConstraintsComisionCate);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionCate, this.gridBagConstraintsComisionCate);								
		
		
		/*
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionCate, this.gridBagConstraintsComisionCate);
		*/		
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionCate.gridx =0;
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionCate.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionCate, this.gridBagConstraintsComisionCate);
				
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionCate, this.gridBagConstraintsComisionCate);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionCate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionCate = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionCate.setLayout(gridaBagLayoutBusquedasParametrosComisionCate);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionCate=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionCate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionCate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionCate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionCate, this.gridBagConstraintsComisionCate);
			
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionCate, this.gridBagConstraintsComisionCate);
		
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionCate.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionCate, this.gridBagConstraintsComisionCate);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionCate;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionCate() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionCate = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionCate.setName("jPanelReporteDinamicoComisionCate"); 
		
		this.jPanelReporteDinamicoComisionCate.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionCate.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionCate.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionCate.setLayout(gridaBagLayoutReporteDinamicoComisionCate);
		
		
		this.jInternalFrameReporteDinamicoComisionCate= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionCate = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionCate= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionCate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionCate.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionCate.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionCate.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionCate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionCate.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionCate.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionCate.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionCate.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionCate.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionCate.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Cates"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionCate = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionCate.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelColumnasSelectReporteComisionCate, this.gridBagConstraintsComisionCate);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionCate = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionCate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionCate.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionCate.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionCate.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionCate.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionCate=new JScrollPane(this.jListColumnasSelectReporteComisionCate);
			
			this.jScrollColumnasSelectReporteComisionCate.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionCate.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionCate.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionCate.add(this.jListColumnasSelectReporteComisionCate, this.gridBagConstraintsComisionCate);
		this.jPanelReporteDinamicoComisionCate.add(this.jScrollColumnasSelectReporteComisionCate, this.gridBagConstraintsComisionCate);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionCate = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionCate.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionCate = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionCate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionCate.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionCate.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionCate.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionCate.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionCate=new JScrollPane(this.jListRelacionesSelectReporteComisionCate);
			
			this.jScrollRelacionesSelectReporteComisionCate.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionCate.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionCate.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisionCate = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionCate = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionCate = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionCate = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionCate.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionCate.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionCate.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionCate.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionCate = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionCate.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionCate.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionCate.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionCate.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComisionCate = new JLabelMe();

		this.jLabelConGraficoDinamicoComisionCate.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelConGraficoDinamicoComisionCate, this.gridBagConstraintsComisionCate);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComisionCate = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComisionCate.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComisionCate.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComisionCate.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionCate.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionCate.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jCheckBoxConGraficoDinamicoComisionCate, this.gridBagConstraintsComisionCate);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComisionCate = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComisionCate.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelColumnaCategoriaGraficoComisionCate, this.gridBagConstraintsComisionCate);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComisionCate = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionCate.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComisionCate.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComisionCate.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionCate.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionCate.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComisionCate.add(this.jComboBoxColumnaCategoriaGraficoComisionCate, this.gridBagConstraintsComisionCate);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComisionCate = new JLabelMe();

		this.jLabelColumnaCategoriaValorComisionCate.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelColumnaCategoriaValorComisionCate, this.gridBagConstraintsComisionCate);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComisionCate = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComisionCate.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComisionCate.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComisionCate.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionCate.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionCate.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComisionCate.add(this.jComboBoxColumnaCategoriaValorComisionCate, this.gridBagConstraintsComisionCate);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComisionCate = new JLabelMe();

		this.jLabelColumnasValoresGraficoComisionCate.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelColumnasValoresGraficoComisionCate, this.gridBagConstraintsComisionCate);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComisionCate = new JList<Reporte>();
		this.jListColumnasValoresGraficoComisionCate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComisionCate.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComisionCate.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionCate.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionCate.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComisionCate=new JScrollPane(this.jListColumnasValoresGraficoComisionCate);
			
			this.jScrollColumnasValoresGraficoComisionCate.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionCate.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionCate.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComisionCate.add(this.jListColumnasSelectReporteComisionCate, this.gridBagConstraintsComisionCate);
		this.jPanelReporteDinamicoComisionCate.add(this.jScrollColumnasValoresGraficoComisionCate, this.gridBagConstraintsComisionCate);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComisionCate = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComisionCate.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelTiposGraficosReportesDinamicoComisionCate, this.gridBagConstraintsComisionCate);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComisionCate = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionCate.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComisionCate.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComisionCate.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionCate.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionCate.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jComboBoxTiposGraficosReportesDinamicoComisionCate, this.gridBagConstraintsComisionCate);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionCate = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionCate.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelGenerarExcelReporteDinamicoComisionCate, this.gridBagConstraintsComisionCate);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionCate = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionCate.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionCate,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionCate.setToolTipText("Generar EXCEL"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionCate = new GridBagConstraints();
		//this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionCate.add(this.jButtonGenerarExcelReporteDinamicoComisionCate, this.gridBagConstraintsComisionCate);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionCate.add(this.jComboBoxTiposReportesDinamicoComisionCate, this.gridBagConstraintsComisionCate);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionCate = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionCate.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionCate.add(this.jLabelTiposArchivoReporteDinamicoComisionCate, this.gridBagConstraintsComisionCate);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionCate.add(this.jComboBoxTiposArchivosReportesDinamicoComisionCate, this.gridBagConstraintsComisionCate);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionCate = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionCate.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionCate,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionCate.setToolTipText("Generar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionCate.add(this.jButtonGenerarReporteDinamicoComisionCate, this.gridBagConstraintsComisionCate);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionCate = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionCate.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionCate,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionCate.setToolTipText("Cancelar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionCate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionCate.add(this.jButtonCerrarReporteDinamicoComisionCate, this.gridBagConstraintsComisionCate);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionCate = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionCate= new JScrollPane(jPanelReporteDinamicoComisionCate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionCate.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionCate.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionCate.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Cates"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionCate.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionCate.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionCate.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionCate);
		this.jInternalFrameReporteDinamicoComisionCate.getContentPane().add(this.jScrollPanelReporteDinamicoComisionCate, this.gridBagConstraintsComisionCate);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionCate() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionCate = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionCate.setName("jPanelImportacionComisionCate"); 
		
		this.jPanelImportacionComisionCate.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionCate.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionCate.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionCate.setLayout(gridaBagLayoutImportacionComisionCate);
		
		
		this.jInternalFrameImportacionComisionCate= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionCate= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionCate = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionCate= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionCate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionCate.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionCate.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionCate.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionCate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionCate.setResizable(true);
	    this.jInternalFrameImportacionComisionCate.setClosable(true);
	    this.jInternalFrameImportacionComisionCate.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionCate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionCate.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionCate.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionCate.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionCate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionCate.setResizable(true);
	    this.jInternalFrameImportacionComisionCate.setClosable(true);
	    this.jInternalFrameImportacionComisionCate.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionCate.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionCate.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionCate.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Cates"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionCate = new JLabelMe();

		this.jLabelArchivoImportacionComisionCate.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionCate.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionCate.add(this.jLabelArchivoImportacionComisionCate, this.gridBagConstraintsComisionCate);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionCate = new JFileChooser();		
		this.jFileChooserImportacionComisionCate.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionCate = new JButtonMe();
		this.jButtonAbrirImportacionComisionCate.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionCate,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionCate.setToolTipText("Generar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionCate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionCate.add(this.jButtonAbrirImportacionComisionCate, this.gridBagConstraintsComisionCate);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionCate = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionCate.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionCate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionCate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionCate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionCate.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionCate.add(this.jLabelPathArchivoImportacionComisionCate, this.gridBagConstraintsComisionCate);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionCate=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionCate.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionCate.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionCate.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionCate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionCate.add(this.jTextFieldPathArchivoImportacionComisionCate, this.gridBagConstraintsComisionCate);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionCate = new JButtonMe();
		this.jButtonGenerarImportacionComisionCate.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionCate,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionCate.setToolTipText("Generar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionCate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionCate.add(this.jButtonGenerarImportacionComisionCate, this.gridBagConstraintsComisionCate);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionCate = new JButtonMe();
		this.jButtonCerrarImportacionComisionCate.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionCate,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionCate.setToolTipText("Cancelar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionCate.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionCate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionCate.add(this.jButtonCerrarImportacionComisionCate, this.gridBagConstraintsComisionCate);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionCate = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionCate= new JScrollPane(jPanelImportacionComisionCate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionCate = new GridBagConstraints();
		this.gridBagConstraintsComisionCate.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionCate.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionCate.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionCate.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionCate);
		this.jInternalFrameImportacionComisionCate.getContentPane().add(this.jScrollPanelImportacionComisionCate, this.gridBagConstraintsComisionCate);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionCate(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionCate = new JButtonMe();
			this.jButtonAbrirOrderByComisionCate.setText("Orden");
			this.jButtonAbrirOrderByComisionCate.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionCate,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionCate";
			inputMap = this.jButtonAbrirOrderByComisionCate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionCate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionCate"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionCate = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionCate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionCate.setName("jPanelOrderByComisionCate"); 
			
			this.jPanelOrderByComisionCate.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionCate.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionCate.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionCate.setLayout(gridaBagLayoutOrderByComisionCate);
			
			
			this.jTableDatosComisionCateOrderBy = new JTableMe();        
			this.jTableDatosComisionCateOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionCateOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionCateOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionCateOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionCateOrderBy.setViewportView(this.jTableDatosComisionCateOrderBy);
			this.jTableDatosComisionCateOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionCateOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionCate= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionCate= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionCate = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionCate= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionCate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionCate.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionCate.setTitle("Orden");
			this.jInternalFrameOrderByComisionCate.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionCate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionCate.setResizable(true);
			this.jInternalFrameOrderByComisionCate.setClosable(true);
			this.jInternalFrameOrderByComisionCate.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionCate.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionCate.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionCate.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionCate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Cates"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionCate.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionCate.ipady =150;
				
			this.jPanelOrderByComisionCate.add(jScrollPanelDatosComisionCateOrderBy, this.gridBagConstraintsComisionCate);//this.jTableDatosComisionCateTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionCate = new JButtonMe();
			this.jButtonCerrarOrderByComisionCate.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionCate,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionCate.setToolTipText("Cancelar"+" "+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionCate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionCate.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionCate.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionCate.add(this.jButtonCerrarOrderByComisionCate, this.gridBagConstraintsComisionCate);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionCate = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionCate= new JScrollPane(jPanelOrderByComisionCate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionCate = new GridBagConstraints();
			this.gridBagConstraintsComisionCate.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionCate.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionCate.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionCate.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionCate.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionCate);
			
			this.jInternalFrameOrderByComisionCate.getContentPane().add(this.jScrollPanelOrderByComisionCate, this.gridBagConstraintsComisionCate);			
		
		} else {
			this.jButtonAbrirOrderByComisionCate = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisioncateSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionCate.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionCate.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionCate.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionCate.getRowHeight();//ComisionCateConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionCateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionCate.isSelected()) {
					iHeightTable=ComisionCateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionCateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionCateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionCateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionCate.isSelected()) {
					iHeightTable=ComisionCateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionCateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionCateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionCate.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionCate.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionCate.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionCate.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionCate.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionCate.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionCate!=null && this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy()!=null) {
			//if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionCate.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionCate.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionCate.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionCate.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionCate.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionCate.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisioncateLogic.getComisionCates().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisioncates.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionCate> TraerComisionCateBeans(List<ComisionCate> comisioncates,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionCate comisioncate:comisioncates) {
					
				if(!(ComisionCateConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionCateConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisioncate.setsDetalleGeneralEntityReporte(ComisionCateConstantesFunciones.getComisionCateDescripcion(comisioncate));
										
						
					
						
					
				} else  {
							
					//comisioncate.setsDetalleGeneralEntityReporte(comisioncate.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisioncatebeans.add(comisioncatebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisioncates;
    }
	//PARA REPORTES FIN
}
